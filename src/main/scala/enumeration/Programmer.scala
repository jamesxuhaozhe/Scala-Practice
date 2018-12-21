package enumeration

object Programmer extends Enumeration {
  type Programmer = Value
  val entryLevelProgrammer: Value = Value(0, "entryLevelProgrammer")
  val mediumLevelProgrammer: Value = Value(1, "mediumLevelProgrammer")
  val seniorLevelProgrammer: Value = Value(2, "seniorLevelProgrammer")
  val godLikeProgrammer: Value = Value(3, "godLikeProgrammer")
  val stupidProgrammer: Value = Value(4, "stupidProgrammer")
}
