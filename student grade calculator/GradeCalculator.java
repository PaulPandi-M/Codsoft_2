import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args) {
        int numOfSub;
        int[] mark;
        float total,avg,avgPercentage;
        String grade;

        Scanner inScan=new Scanner(System.in);
        System.out.print("Enter the number of subjects:");
        numOfSub=inScan.nextInt();
        mark=new int[numOfSub];
        total=0.0f;
        avg=0.0f;
        avgPercentage=0.0f;

        System.out.println("Enter "+numOfSub+" subjects marks (out of 100)");
        for(int i=0;i<numOfSub;i++)
        {
            System.out.print("Enter subject "+(i+1)+" mark:");
            int tempMark=inScan.nextInt();
            if(tempMark<0 || tempMark>100)
            {
                System.out.println("invalid mark");
                System.exit(1);
            }
            mark[i]=tempMark;
            total+=mark[i];
        }

        avg=total/numOfSub;
        avgPercentage=(avg/100)*100;

        System.out.println("\nTotal mark="+total);
        System.out.println("Average mark:"+avg);
        System.out.println("Average percentage="+avgPercentage+"%");

        if(avgPercentage>=90)
        {
            grade="A+";
        }    
        else if(avgPercentage<90 && avgPercentage>=80)
        {
            grade="A";
        } 
        else if(avgPercentage<80 && avgPercentage>=70)
        {
            grade="B+";
        } 
        else if(avgPercentage<70 && avgPercentage>=60)
        {
            grade="B";
        }    
        else if(avgPercentage<60 && avgPercentage>=40)
        {
            grade="C";
        }    
        else
        {
            grade="D";
        }
        
        System.out.println("Grade="+grade);

        inScan.close();
    }
}