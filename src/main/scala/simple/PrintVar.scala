package simple


import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

object PrintVar {

  def printVarName[T](variable: T): String = macro printVarNameImpl[T]

  def printVarNameImpl[T] (c: Context) (variable: c.Expr[T]) = {
    import c.universe._
    val varName = variable.tree.symbol.name.decodedName.toString
    q"""
      $varName
    """
  }

  def printVar[T](variable: T): String = macro printVarImpl[T]

  def printVarImpl[T] (c: Context) (variable: c.Expr[T]) = {
    import c.universe._
    val varName = variable.tree.symbol.name.decodedName.toString
    val value = variable.tree
    q"""
        $varName + "=\"" + $value.toString + "\""
    """
  }

}
