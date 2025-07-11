public class ArrayChallenge {
    public static void main (String[] args){
        String [] Studentid = {"B123", "C234", "A345", "C15", "B177", "C235", "B179"};
        for (String item: Studentid){
            if(item.startsWith("B")){
                System.out.println(item);
            }
        }
    }
}
