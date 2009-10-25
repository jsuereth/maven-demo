package suereth


import org.specs._
import org.specs.runner._

/** This is usedt o pipe specs into junit 4 */
class TestMathUtils extends JUnit4(MathUtilSpec)

/**
 * Created by IntelliJ IDEA.
 * User: josh
 * Date: Oct 25, 2009
 * Time: 2:58:53 PM
 * To change this template use File | Settings | File Templates.
 */

object MathUtilSpec extends Specification {
  "MathUtils" should {
    "computeAverage" in {
      MathUtils.average(Seq(1.0, 1.0, 1.0)) must_== 1.0
    }
  }
}