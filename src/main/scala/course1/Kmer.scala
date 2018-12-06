package course1

import scala.io.Source

/** Find overlapping k-mer counts from input, where input is a 2-line text file
  * where the first line is the genome string to search, and the second line is the
  * pattern to search for
  */
object Kmer {
  def main(args: Array[String]): Unit = {
    val lines = Source.fromFile("inputs/course1/kmer/input.txt").getLines().toArray
    val regex = ("(?=" + lines(1) + ")").r

    println(regex.findAllMatchIn(lines(0)).length)
  }
}