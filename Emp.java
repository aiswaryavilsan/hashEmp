package com.learn;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Emp {
    int id;
    String name;
    String email_id;
    Long phone_number;

    Emp(int id, String name, String email_id, Long phone_number) {
        this.id = id;
        this.name = name;
        this.email_id = email_id;
        this.phone_number = phone_number;
    }
}
class T
{
    public static void main(String arg[])
    {
        HashMap<Integer,Emp> employee=new HashMap<Integer,Emp>();
        Emp e1 = new Emp(111,"Aiswarya","asiwarya@gmail.com",12345678L);
        Emp e2 = new Emp(222,"Vismaya","vismaya@gmail.com",2345678901L);
        Emp e3 = new Emp(222,"Abhaya","abhayagmail.com",3456789012L);

        employee.put(1,e1);
        employee.put(2,e2);
        employee.put(3,e3);

        employee.remove(1);
        employee.replace(2,e1);

        Iterator i=employee.entrySet().iterator();
        while(i.hasNext())
        {
            Map.Entry r=(Map.Entry)i.next();
            Emp x=(Emp)r.getValue();
            System.out.println(r.getKey()+" "+"id:"+x.id+"\n  "+"name:"+x.name+"\n  "+"email id:"+x.email_id+"\n  "+"phone number:"+x.phone_number);




        }
    }


}
