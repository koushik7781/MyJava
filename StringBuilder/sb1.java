

public class sb1 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Lasya");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        sb.setCharAt(1, 'k');
        System.out.println(sb);

        sb.insert(1, 'a');
        System.out.println(sb);

        sb.setCharAt(2,'a');
        System.out.println(sb);

        sb.delete(1, 2);
        System.out.println(sb);

        sb.append('a');
        System.out.println(sb);

        System.out.println(sb.length());


    }
}