def increaseBy(more: Int) = (x: Int) => x + more

val f1 = increaseBy(10)
val f2 = increaseBy(20)

f1(100)
f2(100)

def speed(distance: Float, time:Float):Float = {
  distance / time
}

speed(10,5)
speed(time = 5, distance = 10)