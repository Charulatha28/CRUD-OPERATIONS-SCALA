
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object updateEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Modify Employee Detail")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
"""),format.raw/*4.1*/("""<h2>Update Employee</h2>

<form method="post" action="empUpdate">
  Empid : <input type="number" name="empid" min="1" max="3000"></input>
  Parameter : <input type="text" name="parameter"></input>
  Value: <input type="text" name="value"></input>
  <input type="submit">
</form>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/updateEmployee.scala.html
                  HASH: 3c75a69435d6480ee6b421f26e5f25ba1d420805
                  MATRIX: 731->1|827->3|857->8|895->38|934->40|962->42
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4
                  -- GENERATED --
              */
          