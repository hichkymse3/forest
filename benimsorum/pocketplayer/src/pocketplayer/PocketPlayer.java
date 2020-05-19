/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketplayer;

import java.util.Scanner;

    public class PocketPlayer {
    
    public static void main(String[] args) {
    
    Scanner input=new Scanner(System.in);
    Scanner out=new Scanner(System.in);
    
    int mic=Integer.parseInt((out.next()));
    
    Set set=new Set(mic);
    set.start();
    
    if(set.inSoundLevel>=set.highSound)set.inSoundLevel=set.mediumSound;
    switch(Integer.parseInt((input.next()))){
        case 1:set.changeVolume(set.volumeChange);
        break;
        case 2:set.changeVolume("-",set.volumeChange);
        break;
    }
    if(set.inSoundLevel>=set.highSound)System.out.println(set.warning(set.uyarı));
     }
    }

    class Get{
    Scanner name=new Scanner(System.in);    
    private String kullanici;    
    String id;
    int volumeChange=1;    
    int inSoundLevel,outSoundLevel;
    int mediumSound=10,highSound=20;
    
    void setName(String kullanici){
    this.kullanici=kullanici;
     }
    
    private void message(){
    System.out.println("Hi, enter your name..");
     }
    
    void start(){
    message();
    id=name.nextLine();
    setName(id);
     }
    
    void changeVolume(int x){
    inSoundLevel+=x;    
     }
    
    void changeVolume(String a,int x){
    inSoundLevel-=x;
     }
    
    String warning(String x){
    return x;
     }
    }
    
    class Set extends Get{
        
    String uyarı="Bu ses düzeyi duyma yetinize zarar verebilir.";
    
            
    Set(int x){
    outSoundLevel=x;
    inSoundLevel=outSoundLevel;
     }
    }
