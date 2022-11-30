/**
 * @name        Simple Java Calculator
 * @package     ph.calculator
 * @file        Main.java
 * @author      Eng.Bahaa Salha
 * @email       bah.sal.2018.com
 * @link        https://github.com/bahaasalha/Java-Calculator
 * @copyright   Copyright Bahaa Salha PALESTINE, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 * @create      2022-11-30
 *
 * @modifiedby  Achintha Gunasekara
 * @modweb      http://www.achinthagunasekara.com
 * @modemail    contact@achinthagunasekara.com
 */

package simplejavacalculator;

public class SimpleJavaCalculator {
   
   public static void main(String[] args) {
      try {
         UI uiCal = new UI();
         uiCal.init();
      }
      catch (Exception e) {
         System.out.println(e.getMessage());   
      }
      
   }
}
