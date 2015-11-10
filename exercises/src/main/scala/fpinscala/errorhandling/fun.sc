import fpinscala.errorhandling.{Option => OptionS, Some => SomeS, None => NoneS}
def inc(a:Int): Int = a + 1
SomeS(1).map(a => a +1)
SomeS(1).map(inc)

val none :OptionS[String] = NoneS
val some = SomeS(1)

none.getOrElse("bbbb default")

// common type between Int and String is Any
some.getOrElse("bbbb default")

none.getOrElse(println("aa"))
some.getOrElse(println("aa"))
SomeS("aa").flatMap(s => Some(s + "bb"))
none.flatMap(s => Some(s + "bb"))
some.orElse(SomeS(20))
none.orElse(SomeS("something"))
none.orElse(none)

some.filter(int => int == 1)
some.filter(int => int == 10)

val noneInt:OptionS[Int] = NoneS

noneInt.filter(int => int == 10)