case class Student(age: Int,level: Int,height: Int = 5) extends Ordered[Student]{
  override def compare(that: Student): Int ={
    if((this.level - that.level) == 0)
      (this.age - that.age)
    else
      (this.level - that.level)
  }
}


val s1 = new Student(level = 5,age = 10)
val s2 = new Student(level = 1,age = 10)
val s3 = new Student(level = 1,age = 11)

s1 > s2
s2 > s3


