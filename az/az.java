
package tempmonth1;
import javax.swing.JOptionPane;
public class Tempmonth1 {

    public static void main(String[] args) {
        //عزام سليمان المعيي
       
        Login();
     int N =Integer.parseInt(JOptionPane.showInputDialog("Enter Emplyess Number ?"));
     int Salary[]=new int[N];

     for(int i=0;i<Salary.length;i++){
      Salary[i]Integer.parseInt(JOptionPane.showInputDialog("ادخل راتب كل موظف: "));
     }

    }
       
  public static void Login() 
  {
     String Loginpass;
         Loginpass=JOptionPane.showInputDialog("ادخل الرمز: ");
                 if(Loginpass.equals("A1010"))
                  JOptionPane.showInputDialog(null,"مرحبا بك");
                 }
                 else{
                  JOptionPane.showInputDialog(null,"خطأ");
                  system.exit(0);
                 }

  }
 //---------------------   
  public static void Upsalary(int Salary[])//2
  {
   //???????
   double sumTotal = calculateSum(salaries);
    double increasePercentage = 0.05; 
    double increaseAmount = sumTotal * increasePercentage; 
    double newSumTotal = sumTotal + increaseAmount;

    System.out.println("\nCurrent total salary: " + sumTotal);
    System.out.println("5% increase amount: " + increaseAmount);
    System.out.println("New total salary after increase: " + newSumTotal);
}

  
  //--------------------
  public static float Avarge(int Salary[])
  {
     int Avarge=Salary[0];
     for(int i=0;i<Salary.length;i++){  
      sum+=Salary[i];
     }
     int average = (int) sum / Salary.length;
     system.out.println("متوسط الرواتب="+average);

  }
  //----------------
  public static void TheBigest(int Salary[] , float AVsalary)
  {
   int TheBigest=Salary[0];
   for(int i=0;i<Salary.length;i++){
      if (Salary[i]>TheBigest){
         TheBigest=Salary[i];
      }
   } 
    system.out.println("اكبر راتب= "+TheBigest);
}















  {
   int TheBigest=Salary[0];//هنا اظفنا متغير ذا بق است من نوع انتيقر يساوي0
   for(int i=0;i<Salary.length;i++){//وهنا وضعنا فور وهي عملية تكرار  لايجاد اكبر راتب من مجموع الرواتب
      if (Salary[i]>TheBigest){// اضفنا شرط اذا كان اكبر راتب من الرواتب المدخلة اطبع اكبر راتب مع قيمته
         TheBigest=Salary[i];
      }
   } 
    system.out.println("اكبر راتب= "+TheBigest);
    
}