/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming2;

/**
 *
 * @author USER
 */
public class main {
 
    
    public static void main(String[] args) {
	Biodata a = new Biodata();
        cgpa b = new cgpa();
	cgpa c = new cgpa();
	workskills d = new workskills();
        workexperiences e  = new  workexperiences();
        cgpav2 f = new cgpav2();
        cgpav3 g = new cgpav3();
        
	a.printBiodatas();
        b.printGPA();
        c.printCGPA();
        d.printworkskills();
        e.printExperience();
        f.printCGPA();
        f.printGPA();
        f.calculateCGPA();
        g.printCgpa(args);
    }
    
}

