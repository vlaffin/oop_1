package oop_1.hw2;

public class Cat extends Participants {
      public static final String who = "* Cat ";
    public static final String successfulRunMassage = " finished ";
    public static final String failureRunMassage = " get of the way ";
    public static final String successfulJumpMassage = " got over the wall ";
    public static final String failureJumpMassage = " didn't get over the wall ";


    public Cat(String name, int maxDistance, double maxHeight) {
        super(name, maxDistance, maxHeight);
        super.info = who + " named " + name;
        super.runSuccess =  successfulRunMassage;
        super.runFailure = failureRunMassage;
        super.jumpSuccess = successfulJumpMassage;
        super.jumpFailure = failureJumpMassage;
    }
}
