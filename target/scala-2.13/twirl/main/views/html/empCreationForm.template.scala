
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

object empCreationForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Employee Creation Form")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
"""),format.raw/*4.1*/("""<h2>Create Employee</h2>

<form method="post" action="employeeCreation">
  Empid : <input type="number" name="empid" min="1" max="3000"></input>
  Name : <input type="text" name="empname"></input>
  Designation: <input type="text" name="empdes"></input>
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
                  SOURCE: app/views/empCreationForm.scala.html
                  HASH: 47fc9ab7d09073f78abb24601e795aa8cc8e90ba
                  MATRIX: 732->1|828->3|858->8|896->38|935->40|963->42
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4
                  -- GENERATED --
              */
          