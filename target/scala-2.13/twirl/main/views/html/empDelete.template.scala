
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

object empDelete extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Delete Form")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<h2>Delete Employee</h2>

<form method="post" action="delete">
  Empid : <input type="number" name="empid" min="1" max="3000"></input>
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
                  SOURCE: app/views/empDelete.scala.html
                  HASH: 8da628043579e19bbde137734ed8a899900e266f
                  MATRIX: 726->1|822->3|852->8|879->27|918->29|946->31
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4
                  -- GENERATED --
              */
          