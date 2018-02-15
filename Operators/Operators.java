class Operators {
    public static void main(String args[]) {
    
     Boolean isDesert = true;
    Boolean haveAC = true;
    Boolean haveSwampCooler = false;

    if(isDesert) {
        if(haveAC) {
            System.out.println("Your electric bill is high.");
        }
        else if(haveSwampCooler) {
            System.out.println("Your electric bill isn't too bad.");
            System.out.println("Your house gets humid.");
        }
        else {
            //Default case
            System.out.println("How do you survive here?");
        }
    }
    else {
        //Default case
        System.out.println("Your electric bill might be good or bad, but I'm not sure.");
    
}