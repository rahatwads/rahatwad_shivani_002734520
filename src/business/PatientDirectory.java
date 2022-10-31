/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author shivanirahatwad
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getEmployeeDirectory() {
        return patientDirectory;
    }

    public void setEmployeeDirectory(ArrayList<Patient> employeeDirectory) {
        this.patientDirectory = employeeDirectory;
    }
    
    public Patient addPatient(){
        Patient newPatient = new Patient();
        patientDirectory.add(newPatient);
        return newPatient;
    }
    
    public void deletePatient(Patient Patient){
        patientDirectory.remove(Patient);
    }
}
//    
//    public Patient searchPatient(String name){
////        for(PatientDirectory pt : this.patientDirectory){
////            if(pt.getName().equalsIgnoreCase(name)){
////                return pt;
////            }
////        }
////        return null;
////    }
//    
//}
