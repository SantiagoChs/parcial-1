public class parcial {
    public static void main(String[] args) {
        int number = 5;
        int power = 3;
        int resultado = calculater(number, power);
        System.out.println(number+""+ power+"=+result");
    }
    static int calculater(int num, int power){
        int answer = 1;
        
        if (num > 0 && power==0){
            return answer;
        }
        else if(num == 0 && power>=1){
            return 0;
        }
        else{
            for(int i = 1; i<= power; i++){
                answer = answer*num;
            }
            return answer;
        }
    }
}