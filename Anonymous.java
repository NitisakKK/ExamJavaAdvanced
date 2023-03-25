
package anonymous;

public class Anonymous {  // ใข้เพื่อสร้างเพียง object เดียว

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal MyAnimal = new Animal();
        MyAnimal.makeNoise();
        
        Animal bigFoot = new Animal() { // สร้างวัตถุเดียวของคลาสโดยที่ไม่ระบุชื่อนั้น
            public void makeNoise () {
                System.out.println("Grawlneenlnenlenghehe");
            }
        };
        bigFoot.makeNoise();
        Animal Raptor = new Animal() {
            public void makeNoise () {
                System.out.println("YAHHHHH");
            }
        };
        Raptor.makeNoise();
        
        Runnable myAnomymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm an anonymous runnable");
            }
        };
        myAnomymousRunnable.run();
    }
    
}
