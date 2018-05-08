package com.whil;

public class Main {
    public static void main(String[] args) {

        System.out.println("نتيجة الموظف محمداحمد");
        Employee n1 = new Employee();
        n1.setName("محمد أحمد");
        n1.setSalary(5400);
        System.out.println("بدل السكن:" + n1.skn());
        System.out.println("بدل النقل:" + n1.nql());
        System.out.println("التأمينات:" + n1.tamen());
        System.out.println("صافي الراتب:" + n1.safe());

        System.out.println("نتيجة الموظف صلاح حسن");
        Employee n2 = new Employee();
        n2.setName("صلاح حسن");
        n2.setSalary(4000);
        System.out.println("بدل السكن:" + n2.skn());
        System.out.println("بدل النقل:" + n2.nql());
        System.out.println("التأمينات:" + n2.tamen());
        System.out.println("صافي الراتب:" + n2.safe());

        System.out.println("نتيجة الموظف مصطفى محمود");
        Employee n3 = new Employee();
        n3.setName("مصطفى محمود");
        n3.setSalary(3900);
        System.out.println("بدل السكن:" + n3.skn());
        System.out.println("بدل النقل:" + n3.nql());
        System.out.println("التأمينات:" + n3.tamen());
        System.out.println("صافي الراتب:" + n3.safe());

        System.out.println("نتيجة الموظف محمدامين");
        Employee n4 = new Employee();
        n4.setName("محمد أمين");
        n4.setSalary(3220);
        System.out.println("بدل السكن:" + n4.skn());
        System.out.println("بدل النقل:" + n4.nql());
        System.out.println("التأمينات:" + n4.tamen());
        System.out.println("صافي الراتب:" + n4.safe());

        System.out.println("نتيجة الموظف أنس محمود");
        Employee n5 = new Employee();
        n5.setName("أنس محمود");
        n5.setSalary(2800);
        System.out.println("بدل السكن:" + n5.skn());
        System.out.println("بدل النقل:" + n5.nql());
        System.out.println("التأمينات:" + n5.tamen());
        System.out.println("صافي الراتب:" + n5.safe());

        System.out.println("نتيجة الموظف أمين مبارك");
        Employee n6 = new Employee();
        n6.setName("أمين مبارك");
        n6.setSalary(2900);
        System.out.println("بدل السكن:" + n6.skn());
        System.out.println("بدل النقل:" + n6.nql());
        System.out.println("التأمينات:" + n6.tamen());
        System.out.println("صافي الراتب:" + n6.safe());

        System.out.println("نتيجة الموظف عماد حمد");
        Employee n7 = new Employee();
        n7.setName("عماد حمد");
        n7.setSalary(2560);
        System.out.println("بدل السكن:" + n7.skn());
        System.out.println("بدل النقل:" + n7.nql());
        System.out.println("التأمينات:" + n7.tamen());
        System.out.println("صافي الراتب:" + n7.safe());

        System.out.println("نتيجة الموظف خالد عبدالله");
        Employee n8 = new Employee();
        n8.setName("خالد عبدالله");
        n8.setSalary(2500);
        System.out.println("بدل السكن:" + n8.skn());
        System.out.println("بدل النقل:" + n8.nql());
        System.out.println("التأمينات:" + n8.tamen());
        System.out.println("صافي الراتب:" + n8.safe());

        System.out.println("نتيجة الموظف سالم علي");
        Employee n9 = new Employee();
        n9.setName("سالم علي");
        n9.setSalary(2330);
        System.out.println("بدل السكن:" + n9.skn());
        System.out.println("بدل النقل:" + n9.nql());
        System.out.println("التأمينات:" + n9.tamen());
        System.out.println("صافي الراتب:" + n9.safe());

        System.out.println("نتيجة الموظف صالح الخالدي");
        Employee n10 = new Employee();
        n10.setName("صالح الخالدي");
        n10.setSalary(2500);
        System.out.println("بدل السكن:" + n10.skn());
        System.out.println("بدل النقل:" + n10.nql());
        System.out.println("التأمينات:" + n10.tamen());
        System.out.println("صافي الراتب:" + n10.safe());
//السطر في الأسفل هو تعريف لمصفوفة
        Employee[] fahad11;
fahad11 = new Employee[] {n1,n2,n3,n4,n5,n6,n7,n8,n9,n10};
//هنا نبين أن المطلوب هو الجمع ونوع متغيره
double sum = 0;
int i = 0;
       //اللنث هو مكونات المصفوفة
        while (i<fahad11.length) {
//متغير يحدد المكان الي طالب جمعه وهو هنا قيت سالاري
            sum=sum+fahad11[i].getSalary();
//هنا كل مرة تزود عن المرة السابقة , وال تزوده هي قيمة المطلوب
            i++;
        }
        //هنا طباعة مجموع الرواتب
        // سطر الطباعة خارج الوايل
        System.out.println("مجموع رواتب الموظفين while : "+sum);

        //الفور تكتب بالمين ولاتكتب داخل الوايل وكذلك الأمر للوايل لايكتب داخل الفور
        double sum2 = 0;
        for (int k = 0; k < 10; k++) {
            sum2=sum2+fahad11[k].getSalary();

            //طباعة الفهرس
            //   System.out.println(k);
//طباعة المكونات داخل المصفوفة (fahadint)
        }
        //ٍطر الطباعة خارج الفور
        System.out.println("مجموع رواتب الموظفين for : "+sum2);

    }


}

