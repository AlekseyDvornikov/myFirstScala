object calc {

  def main(args: Array[String]): Unit = {
     onPerSecond(()=> println("bum"))
  }

    def plus(x: Int, y: Int): Int = x+y

    def minus(x: Int, y: Int): Int = x-y

    def someOper():Unit = println("bum")

    def onPerSecond(callback:()=>Unit){
      while (true) {callback(); Thread.sleep(1000) }
  }

}
