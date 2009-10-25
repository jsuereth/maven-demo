package suereth

/**
 * Created by IntelliJ IDEA.
 * User: josh
 * Date: Oct 25, 2009
 * Time: 2:35:31 PM
 * To change this template use File | Settings | File Templates.
 */

object MathUtils {

  /**
   * Computes the average of a sequence of values
   * @param args
   *            The values to compute the average of
   * @return
   *          The average
   */
  def average(args : Seq[Double]) : Double = {
    args.foldLeft(0.0)(_+_) / args.size.toDouble
  }
  def stddev(args : Seq[Double]) : Double = {
    val avg = average(args)
    val sumOfDiffs = args.foldLeft(0.0) { (last, current) =>
         val diff = current-avg;
         last + diff*diff
    }
    Math.sqrt(sumOfDiffs / args.size)
  }
}