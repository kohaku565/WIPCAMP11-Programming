/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import static java.lang.ProcessBuilder.Redirect.to;
import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class Project {

    public static void main(String[] args) {
        int item = 0;
        int limit = 10;
        System.out.println("โกดังสินค้า");
        System.out.println("เลือกเมนู 1,2,3");
        System.out.println("1 เพิ่มสินค้า");
        System.out.println("2 ลดสินค้า");
        System.out.println("3 เช็กสินค้า");
        System.out.println("ใส่เลข :");
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();

        if (menu == 1) {
            if (item < limit);
            {
                System.out.println("เพิ่มจำนวน");
                int amount = input.nextInt();
                if (item + amount > limit) {
                    System.out.println("เกินลิมิต");
                } else {
                    item = item + amount;
                    System.out.println(item);
                }
            }
        }
    

        if (menu == 2) {
            if (item > 0); 
            {
                System.out.println("ลดจำนวน");
                int amount = input.nextInt();
                if (item + amount > 0) {
                    System.out.println("ไม่มีของในโกดัง");
                } else{
                    item = item - amount;
                    System.out.println(item);
                }
            }
            }
        
         if (menu == 3) {
             System.out.println(item);
             System.out.println("out of");
             System.out.println(limit);
             
         if (menu>3 ){
             System.out.println("menu ไม่ถูกต้อง");
         }
}
}
    