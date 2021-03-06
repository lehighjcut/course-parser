package builder

import model._
import parser.CourseDetailParser

private[builder] class CourseBuilder() {

  def build(courseDetailParser: CourseDetailParser): Course = {
    val courseRegistrationNumber = courseDetailParser.getCourseRegistrationNumber
    val courseNumber = courseDetailParser.getCourseNumber
    val courseTitle = courseDetailParser.getCourseTitle
    val credits = courseDetailParser.getCourseCredits
    val instructor = courseDetailParser.getCourseInstructor
    val courseTime = courseDetailParser.getCourseTimes
    val subject = courseDetailParser.getCourseSubject
    val section = courseDetailParser.getCourseSection

    new Course(courseRegistrationNumber, courseNumber, courseTitle, credits, instructor, subject, section, courseTime)
  }
}

object CourseBuilder {
  private val courseBuilder = new CourseBuilder()

  def getInstance(): CourseBuilder = {
    courseBuilder
  }
}