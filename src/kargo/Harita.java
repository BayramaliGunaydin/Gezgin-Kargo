package kargo;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author bayram
 */
public class Harita extends javax.swing.JFrame {
    
    public Harita() {    
       initComponents();

    }
    
    
   int sehirsayisi1;
   ArrayList<Integer> sehirler1 = new ArrayList<>();
    public void verilerial(int sehirsayisi,ArrayList<Integer> sehirler){
        sehirler1=sehirler;
        sehirsayisi1=sehirsayisi;
        
    }
   static int gidilenyol;
    public ArrayList<Integer> yolbul(int c,int b){
           Harita a=new Harita();
           
           panel panel =new panel();
     int [][] sehirler=new int[81][81];
     int [][] enkısasehirler=new int[81][81];
             sehirler=a.dosyaokuma("komsuuzaktlık.txt adresini giriniz");
      ArrayList<Integer> sehirdeneme = new ArrayList<>();
        ArrayList<Integer> gidilensehirler = new ArrayList<>();
 int i=0,j=0;
 enkısasehirler=a.floydWarshall(sehirler);       
        int enkısa=99999;
        int k,y;
int sayi;
int yol=0;
int enkisakomsu=-1;
int gidilenyol=0;
        for ( i = 1; i < 83; i++) {
            if(i<82){
            if((i-1)==c){
                continue;
            }
            if(sehirler[c][i-1]<9999){
                enkısa=sehirler[c][i-1];               
                sehirdeneme.add(i-1);
            
            }}
                if(i==82){      
                    enkisakomsu=sehirdeneme.get(0);
                 
                for(k=1;k<sehirdeneme.size();k++){   
                   
                    if((sehirler[sehirdeneme.get(k)][c]+enkısasehirler[sehirdeneme.get(k)][b])<(sehirler[enkisakomsu][c]+enkısasehirler[enkisakomsu][b])){
                        enkisakomsu=sehirdeneme.get(k);
                        
                        }
                   if(sehirdeneme.size()==1){
                        enkisakomsu=sehirdeneme.get(0);
                      
                    }
                  
                }
                       gidilenyol=gidilenyol+enkısasehirler[c][enkisakomsu];                 
                       gidilensehirler.add(enkisakomsu);
                       c=enkisakomsu;                      
                       sehirdeneme.clear(); 
                       i=0;         
                                 
                } if(c==b){
                    
                       break;
                }
                
               
            
            
        }
        
     gidilensehirler.add(gidilenyol);
      return gidilensehirler;
     
    }     
 
   public void paint(Graphics g) {
       super.paint(g);
       panel panel =new panel();
       int w;      
       
       ArrayList<Integer> yol=new ArrayList<>();
       ArrayList<Integer> yol2=new ArrayList<>();
//       bilgiler al=new bilgiler();
       Graphics2D g2 = (Graphics2D) g;
       g2.setStroke(new BasicStroke(3));      
       Harita harita=new Harita();
       
       int tmp;int enkisa;
       int[][] sehirler=harita.dosyaokuma("");
       sehirler=harita.floydWarshall(sehirler);
       for(int i=0;i<sehirler1.size()-1;i++){
           enkisa=sehirler[sehirler1.get(i)][sehirler1.get(i+1)];
           for (int j = i+1; j < sehirler1.size()-1; j++) {  
               if(enkisa>sehirler[sehirler1.get(i)][sehirler1.get(j)]){
                   tmp=sehirler1.get(i+1);
                   sehirler1.set(i+1, sehirler1.get(j));
                   sehirler1.set(j, tmp);                
               }               
           }
       }
       ArrayList<Integer> cizx = new ArrayList<>();
       ArrayList<Integer> cizy = new ArrayList<>();
       
       
        int p;int l;
        
           int sayi=0;
          
           sehirler1.add(40);
            int gidilenyol1=0;
         //  System.out.println(sehirler1);
           yol.add(40);
           for(int i=0;i<sehirsayisi1;i++){
       
           yol2= harita.yolbul(sehirler1.get(i),sehirler1.get(i+1));
           gidilenyol1=gidilenyol1+yol2.get(yol2.size()-1);
           for ( p = 0; p < yol2.size()-1; p++) {
                    
              yol.add(yol2.get(p));
           }
       }
       
       for(int i=0;i<yol.size();i++){
      //     System.out.println("Gidilen Sehir:"+(yol.get(i)+1));
       }       
       
   //     bilgiler.setGidilenyol(gidilenyol1);
    //    System.out.println("gidilenyol="+String.valueOf(bilgiler.getGidilenyol()));
     //  System.out.println("gidilenyol="+gidilenyols);
        g.setColor(Color.black);
        int i;
        
        for(i=0;i<yol.size();i++){
            if(yol.get(i)==0){
                g.fillRect(795,593, 10, 10);
                int adanax=800;
                int adanay=598;
                cizx.add(adanax);
                cizy.add(adanay);
            }
            if(yol.get(i)==1){
                g.fillRect(1041,509, 10, 10);
                int adıyamanx=1046;
                int adıyamany=509;
                cizx.add(adıyamanx);
                cizy.add(adıyamany);
            }
            if(yol.get(i)==2){
                g.fillRect(399,401, 10, 10);
                int afyonkarahisarx=404;
                int afyonkarahisary=406;
                cizx.add(afyonkarahisarx);
                cizy.add(afyonkarahisary);
            }
            if(yol.get(i)==3){
                g.fillRect(1418,270, 10, 10);
                int agrix=1423;
                int agriy=275;
                cizx.add(agrix);
                cizy.add(agriy);
            }
            if(yol.get(i)==4){
                g.fillRect(830,208, 10, 10);
                int amasyax=835;
                int amasyay=213;
                cizx.add(amasyax);
                cizy.add(amasyay);
            }
            if(yol.get(i)==5){
                g.fillRect(582,276, 10, 10);
                int ankarax=587;
                int ankaray=281;
                cizx.add(ankarax);
                cizy.add(ankaray);
            }
            if(yol.get(i)==6){
                g.fillRect(402,598, 10, 10);
                int antalyax=407;
                int antalyay=603;
                cizx.add(antalyax);
                cizy.add(antalyay);
            }
            if(yol.get(i)==7){
                g.fillRect(1302,127, 10, 10);
                int artvinx=1307;
                int artviny=132;
                cizx.add(artvinx);
                cizy.add(artviny);
            }
            if(yol.get(i)==8){
                g.fillRect(170,486, 10, 10);
                int aydinx=175;
                int aydiny=491;
                cizx.add(aydinx);
                cizy.add(aydiny);
            }
            if(yol.get(i)==9){
                g.fillRect(187,297, 10, 10);
                int balikesirx=192;
                int balikesiry=302;
                cizx.add(balikesirx);
                cizy.add(balikesiry);
            }
            if(yol.get(i)==10){
                g.fillRect(359,255, 10, 10);
                int bilecikx=364;
                int bileciky=260;
                cizx.add(bilecikx);
                cizy.add(bileciky);
            }
            if(yol.get(i)==11){
                g.fillRect(1216,377, 10, 10);
                int bingölx=1221;
                int bingöly=382;
                cizx.add(bingölx);
                cizy.add(bingöly);
            }
            if(yol.get(i)==12){
                g.fillRect(1354,416, 10, 10);
                int bitlisx=1359;
                int bitlisy=421;
                cizx.add(bitlisx);
                cizy.add(bitlisy);
            }
            if(yol.get(i)==13){
                g.fillRect(492,197, 10, 10);
                int bolux=497;
                int boluy=202;
                cizx.add(bolux);
                cizy.add(boluy);
            }
            if(yol.get(i)==14){
                g.fillRect(373,510, 10, 10);
                int burdurx=378;
                int burdury=515;
                cizx.add(burdurx);
                cizy.add(burdury);
            }
            if(yol.get(i)==15){
                g.fillRect(286,246, 10, 10);
                int bursax=291;
                int bursay=251;
                cizx.add(bursax);
                cizy.add(bursay);
            }
            if(yol.get(i)==16){
                g.fillRect(73,237, 10, 10);
                int canakkalex=78;
                int canakkaley=242;
                cizx.add(canakkalex);
                cizy.add(canakkaley);
            }
            if(yol.get(i)==17){
                g.fillRect(652,215, 10, 10);
                int cankirix=657;
                int cankiriy=220;
                cizx.add(cankirix);
                cizy.add(cankiriy);
            }
            if(yol.get(i)==18){
                g.fillRect(759,220, 10, 10);
                int corumx=764;
                int corumy=225;
                cizx.add(corumx);
                cizy.add(corumy);
            } 
            if(yol.get(i)==19){
                g.fillRect(273,504, 10, 10);
                int denizlix=278;
                int denizliy=509;
                cizx.add(denizlix);
                cizy.add(denizliy);
            }
            if(yol.get(i)==20){
                g.fillRect(1200,479, 10, 10);
                int diyarbakirx=1205;
                int diyarbakiry=484;
                cizx.add(diyarbakirx);
                cizy.add(diyarbakiry);
            }
            if(yol.get(i)==21){
                g.fillRect(98,77, 10, 10);
                int edirnex=103;
                int edirney=82;
                cizx.add(edirnex);
                cizy.add(edirney);
            }
            if(yol.get(i)==22){
                g.fillRect(1110,405, 10, 10);
                int elazigx=1115;
                int elazigy=410;
                cizx.add(elazigx);
                cizy.add(elazigy);
            }
            if(yol.get(i)==23){
                g.fillRect(1127,295, 10, 10);
                int erzincanx=1132;
                int erzincany=300;
                cizx.add(erzincanx);
                cizy.add(erzincany);
            }
            if(yol.get(i)==24){
                g.fillRect(1270,263, 10, 10);
                int erzurumx=1275;
                int erzurumy=268;
                cizx.add(erzurumx);
                cizy.add(erzurumy);
            }
            if(yol.get(i)==25){
                g.fillRect(401,295, 10, 10);
                int eskisehirx=406;
                int eskisehiry=300;
                cizx.add(eskisehirx);
                cizy.add(eskisehiry);
            }
            if(yol.get(i)==26){
                g.fillRect(968,580, 10, 10);
                int gaziantepx=973;
                int gaziantepy=585;
                cizx.add(gaziantepx);
                cizy.add(gaziantepy);
            }
            if(yol.get(i)==27){
                g.fillRect(1037,176, 10, 10);
                int giresunx=1042;
                int giresuny=181;
                cizx.add(giresunx);
                cizy.add(giresuny);
            }
            if(yol.get(i)==28){
                g.fillRect(1120,217, 10, 10);
                int gümüshanex=1125;
                int gümüshaney=222;
                cizx.add(gümüshanex);
                cizy.add(gümüshaney);
            } 
            if(yol.get(i)==29){
                g.fillRect(1501,489, 10, 10);
                int hakkarix=1506;
                int hakkariy=494;
                cizx.add(hakkarix);
                cizy.add(hakkariy);
            }
            if(yol.get(i)==30){
                g.fillRect(868,675, 10, 10);
                int hatayx=873;
                int hatayy=680;
                cizx.add(hatayx);
                cizy.add(hatayy);
            }
            if(yol.get(i)==31){
                g.fillRect(396,504, 10, 10);
                int ispartax=401;
                int ispartay=509;
                cizx.add(ispartax);
                cizy.add(ispartay);
            }
            if(yol.get(i)==32){
                g.fillRect(739,612, 10, 10);
                int mersinx=744;
                int mersiny=617;
                cizx.add(mersinx);
                cizy.add(mersiny);
            }
            if(yol.get(i)==33){
                g.fillRect(287,158, 10, 10);
                int istanbulx=292;
                int istanbuly=163;
                cizx.add(istanbulx);
                cizy.add(istanbuly);
            }
            if(yol.get(i)==34){
                g.fillRect(115,418, 10, 10);
                int izmirx=120;
                int izmiry=423;
                cizx.add(izmirx);
                cizy.add(izmiry);
            }
            if(yol.get(i)==35){
                g.fillRect(1412,176, 10, 10);
               int karsx=1417;
                int karsy=181;
                cizx.add(karsx);
                cizy.add(karsy);
            }
            if(yol.get(i)==36){
                g.fillRect(664,133, 10, 10);
               int kastamonux=669;
                int kastamonuy=138;
                cizx.add(kastamonux);
                cizy.add(kastamonuy);
            }
            if(yol.get(i)==37){
                g.fillRect(804,410, 10, 10);
                int kayserix=809;
                int kayseriy=415;
                cizx.add(kayserix);
                cizy.add(kayseriy);
            }
            if(yol.get(i)==38){
                g.fillRect(150,75, 10, 10);
                int kirklarelix=155;
                int kirklareliy=80;
                cizx.add(kirklarelix);
                cizy.add(kirklareliy);
            } 
            if(yol.get(i)==39){
                g.fillRect(697,367, 10, 10);
                int kirsehirx=702;
                int kirsehiry=372;
                cizx.add(kirsehirx);
                cizy.add(kirsehiry);
            }
            if(yol.get(i)==40){
             
                g.fillRect(359,186, 10, 10);
                
                int kocaelix=364;
                int kocaeliy=191;
                cizx.add(kocaelix);
                cizy.add(kocaeliy);
            }
            if(yol.get(i)==41){
                g.fillRect(559,502, 10, 10);
                int konyax=564;
                int konyay=507;
                cizx.add(konyax);
                cizy.add(konyay);
            }
            if(yol.get(i)==42){
                g.fillRect(356,330, 10, 10);
                int kütahyax=361;
                int kütahyay=335;
                cizx.add(kütahyax);
                cizy.add(kütahyay);
            }
            if(yol.get(i)==43){
                g.fillRect(1041,444, 10, 10);
                int malatyax=1046;
                int malatyay=449;
                cizx.add(malatyax);
                cizy.add(malatyay);
            }
            if(yol.get(i)==44){
                g.fillRect(141,407, 10, 10);
                int manisax=146;
                int manisay=412;
                cizx.add(manisax);
                cizy.add(manisay);
            }
            if(yol.get(i)==45){
                g.fillRect(930,525, 10, 10);
                int kahramanmarasx=935;
                int kahramanmarasy=530;
                cizx.add(kahramanmarasx);
                cizy.add(kahramanmarasy);
            }
            if(yol.get(i)==46){
                g.fillRect(1252,540, 10, 10);
                int mardinx=1257;
                int mardiny=545;
                cizx.add(mardinx);
                cizy.add(mardiny);
            }
            if(yol.get(i)==47){
                g.fillRect(209,555, 10, 10);
                int muglax=214;
                int muglay=560;
                cizx.add(muglax);
                cizy.add(muglay);
            }
            if(yol.get(i)==48){
                g.fillRect(1300,387, 10, 10);
                int musx=1305;
                int musy=392;
                cizx.add(musx);
                cizy.add(musy);
            } 
            if(yol.get(i)==49){
                g.fillRect(740,423, 10, 10);
                int nevsehirx=745;
                int nevsehiry=428;
                cizx.add(nevsehirx);
                cizy.add(nevsehiry);
            }
            if(yol.get(i)==50){
                g.fillRect(740,491, 10, 10);
                int nigdex=745;
                int nigdey=496;
                cizx.add(nigdex);
                cizy.add(nigdey);
            }
            if(yol.get(i)==51){
                g.fillRect(994,171, 10, 10);
                int ordux=999;
                int orduy=176;
                cizx.add(ordux);
                cizy.add(orduy);
            }
            if(yol.get(i)==52){
                g.fillRect(1200,154, 10, 10);
                int rizex=1205;
                int rizey=159;
                cizx.add(rizex);
                cizy.add(rizey);
            }
            if(yol.get(i)==53){
                g.fillRect(395,188, 10, 10);
                int sakaryax=401;
                int sakaryay=197;
                cizx.add(sakaryax);
                cizy.add(sakaryay);
            }
            if(yol.get(i)==54){
                g.fillRect(867,141, 10, 10);
                int samsunx=872;
                int samsuny=146;
                cizx.add(samsunx);
                cizy.add(samsuny);
            }
            if(yol.get(i)==55){
                g.fillRect(1346,467, 10, 10);
                int siirtx=1351;
                int siirty=472;
                cizx.add(siirtx);
                cizy.add(siirty);
            }
            if(yol.get(i)==56){
                g.fillRect(774,65, 10, 10);
                int sinopx=779;
                int sinopy=70;
                cizx.add(sinopx);
                cizy.add(sinopy);
            }
            if(yol.get(i)==57){
                g.fillRect(927,299, 10, 10);
                int sivasx=932;
                int sivasy=304;
                cizx.add(sivasx);
                cizy.add(sivasy);
            }
            if(yol.get(i)==58){
                g.fillRect(165,155, 10, 10);
                int tekirdagx=170;
                int tekirdagy=160;
                cizx.add(tekirdagx);
                cizy.add(tekirdagy);
            } 
            if(yol.get(i)==59){
                g.fillRect(889,241, 10, 10);
                int tokatx=894;
                int tokaty=246;
                cizx.add(tokatx);
                cizy.add(tokaty);
            }
            if(yol.get(i)==60){
                g.fillRect(1135,161, 10, 10);
                int trabzonx=1140;
                int trabzony=166;
                cizx.add(trabzonx);
                cizy.add(trabzony);
            }
            if(yol.get(i)==61){
                g.fillRect(1138,363, 10, 10);
                int tuncelix=1143;
                int tunceliy=368;
                cizx.add(tuncelix);
                cizy.add(tunceliy);
            }
            if(yol.get(i)==62){
                g.fillRect(1088,571, 10, 10);
                int sanliurfax=1093;
                int sanliurfay=576;
                cizx.add(sanliurfax);
                cizy.add(sanliurfay);
            }
            if(yol.get(i)==63){
                g.fillRect(304,406, 10, 10);
                int usakx=309;
                int usaky=411;
                cizx.add(usakx);
                cizy.add(usaky);
            }
            if(yol.get(i)==64){
                g.fillRect(1459,395, 10, 10);
                int vanx=1464;
                int vany=400;
                cizx.add(vanx);
                cizy.add(vany);
            }
            if(yol.get(i)==65){
                g.fillRect(747,298, 10, 10);
                int yozgatx=752;
                int yozgaty=303;
                cizx.add(yozgatx);
                cizy.add(yozgaty);
            }
            if(yol.get(i)==66){
                g.fillRect(512,125, 10, 10);
                int zonguldakx=517;
                int zonguldaky=130;
                cizx.add(zonguldakx);
                cizy.add(zonguldaky);
            }
            if(yol.get(i)==67){
                g.fillRect(685,449, 10, 10);
                int aksarayx=690;
                int aksarayy=454;
                cizx.add(aksarayx);
                cizy.add(aksarayy);
            }
            if(yol.get(i)==68){
                g.fillRect(1184,234, 10, 10);
                int bayburtx=1189;
                int bayburty=239;
                cizx.add(bayburtx);
                cizy.add(bayburty);
            } 
            if(yol.get(i)==69){
                g.fillRect(621,576, 10, 10);
                int karamanx=626;
                int karamany=581;
                cizx.add(karamanx);
                cizy.add(karamany);
            }
            if(yol.get(i)==70){
                g.fillRect(646,296, 10, 10);
                int kirikkalex=651;
                int kirikkaley=301;
                cizx.add(kirikkalex);
                cizy.add(kirikkaley);
            }
            if(yol.get(i)==71){
                g.fillRect(1279,483, 10, 10);
                int batmanx=1284;
                int batmany=483;
                cizx.add(batmanx);
                cizy.add(batmany);
            }
            if(yol.get(i)==72){
                g.fillRect(1394,511, 10, 10);
                int sirnakx=1399;
                int sirnaky=511;
                cizx.add(sirnakx);
                cizy.add(sirnaky);
            }
            if(yol.get(i)==73){
                g.fillRect(553,104, 10, 10);
                int bartinx=558;
                int bartiny=109;
                cizx.add(bartinx);
                cizy.add(bartiny);
            }
            if(yol.get(i)==74){
                g.fillRect(1375,129, 10, 10);
                int ardahanx=1380;
                int ardahany=134;
                cizx.add(ardahanx);
                cizy.add(ardahany);
            }
            if(yol.get(i)==75){
                g.fillRect(1496,242, 10, 10);
                int igdirx=1501;
                int igdiry=247;
                cizx.add(igdirx);
                cizy.add(igdiry);
            }
            if(yol.get(i)==76){
                g.fillRect(303,201, 10, 10);
                int yalovax=308;
                int yalovay=206;
                cizx.add(yalovax);
                cizy.add(yalovay);
            }
            if(yol.get(i)==77){
                g.fillRect(578,154, 10, 10);
                int karabükx=583;
                int karabüky=159;
                cizx.add(karabükx);
                cizy.add(karabüky);
            }
            if(yol.get(i)==78){
                g.fillRect(949,619, 10, 10);
                int kilisx=954;
                int kilisy=624;
                cizx.add(kilisx);
                cizy.add(kilisy);
            } 
            if(yol.get(i)==79){
                g.fillRect(876,586, 10, 10);
                int osmaniyex=881;
                int osmaniyey=591;
                cizx.add(osmaniyex);
                cizy.add(osmaniyey);
            }
            if(yol.get(i)==80){
                g.fillRect(456,188, 10, 10);
                int düzcex=461;
                int düzcey=193;
                cizx.add(düzcex);
                cizy.add(düzcey);
            }
        }
        for(i=0;i<cizx.size()-1;i++){
            g.drawLine(cizx.get(i),cizy.get(i),cizx.get(i+1),cizy.get(i+1));
        }
        g.setColor(Color.red);
        for(i=0;i<sehirler1.size();i++){
        if(sehirler1.get(i)==0){
                g.fillRect(795,593, 10, 10);
                int adanax=800;
                int adanay=598;
                cizx.add(adanax);
                cizy.add(adanay);
            }
            if(sehirler1.get(i)==1){
                g.fillRect(1041,509, 10, 10);
                int adıyamanx=1046;
                int adıyamany=509;
                cizx.add(adıyamanx);
                cizy.add(adıyamany);
            }
            if(sehirler1.get(i)==2){
                g.fillRect(399,401, 10, 10);
                int afyonkarahisarx=404;
                int afyonkarahisary=406;
                cizx.add(afyonkarahisarx);
                cizy.add(afyonkarahisary);
            }
            if(sehirler1.get(i)==3){
                g.fillRect(1418,270, 10, 10);
                int agrix=1423;
                int agriy=275;
                cizx.add(agrix);
                cizy.add(agriy);
            }
            if(sehirler1.get(i)==4){
                g.fillRect(830,208, 10, 10);
                int amasyax=835;
                int amasyay=213;
                cizx.add(amasyax);
                cizy.add(amasyay);
            }
            if(sehirler1.get(i)==5){
                g.fillRect(582,276, 10, 10);
                int ankarax=587;
                int ankaray=281;
                cizx.add(ankarax);
                cizy.add(ankaray);
            }
            if(sehirler1.get(i)==6){
                g.fillRect(402,598, 10, 10);
                int antalyax=407;
                int antalyay=603;
                cizx.add(antalyax);
                cizy.add(antalyay);
            }
            if(sehirler1.get(i)==7){
                g.fillRect(1302,127, 10, 10);
                int artvinx=1307;
                int artviny=132;
                cizx.add(artvinx);
                cizy.add(artviny);
            }
            if(sehirler1.get(i)==8){
                g.fillRect(170,486, 10, 10);
                int aydinx=175;
                int aydiny=491;
                cizx.add(aydinx);
                cizy.add(aydiny);
            }
            if(sehirler1.get(i)==9){
                g.fillRect(187,297, 10, 10);
                int balikesirx=192;
                int balikesiry=302;
                cizx.add(balikesirx);
                cizy.add(balikesiry);
            }
            if(sehirler1.get(i)==10){
                g.fillRect(359,255, 10, 10);
                int bilecikx=364;
                int bileciky=260;
                cizx.add(bilecikx);
                cizy.add(bileciky);
            }
            if(sehirler1.get(i)==11){
                g.fillRect(1216,377, 10, 10);
                int bingölx=1221;
                int bingöly=382;
                cizx.add(bingölx);
                cizy.add(bingöly);
            }
            if(sehirler1.get(i)==12){
                g.fillRect(1354,416, 10, 10);
                int bitlisx=1359;
                int bitlisy=421;
                cizx.add(bitlisx);
                cizy.add(bitlisy);
            }
            if(sehirler1.get(i)==13){
                g.fillRect(492,197, 10, 10);
                int bolux=497;
                int boluy=202;
                cizx.add(bolux);
                cizy.add(boluy);
            }
            if(sehirler1.get(i)==14){
                g.fillRect(373,510, 10, 10);
                int burdurx=378;
                int burdury=515;
                cizx.add(burdurx);
                cizy.add(burdury);
            }
            if(sehirler1.get(i)==15){
                g.fillRect(286,246, 10, 10);
                int bursax=291;
                int bursay=251;
                cizx.add(bursax);
                cizy.add(bursay);
            }
            if(sehirler1.get(i)==16){
                g.fillRect(73,237, 10, 10);
                int canakkalex=78;
                int canakkaley=242;
                cizx.add(canakkalex);
                cizy.add(canakkaley);
            }
            if(sehirler1.get(i)==17){
                g.fillRect(652,215, 10, 10);
                int cankirix=657;
                int cankiriy=220;
                cizx.add(cankirix);
                cizy.add(cankiriy);
            }
            if(sehirler1.get(i)==18){
                g.fillRect(759,220, 10, 10);
                int corumx=764;
                int corumy=225;
                cizx.add(corumx);
                cizy.add(corumy);
            } 
            if(sehirler1.get(i)==19){
                g.fillRect(273,504, 10, 10);
                int denizlix=278;
                int denizliy=509;
                cizx.add(denizlix);
                cizy.add(denizliy);
            }
            if(sehirler1.get(i)==20){
                g.fillRect(1200,479, 10, 10);
                int diyarbakirx=1205;
                int diyarbakiry=484;
                cizx.add(diyarbakirx);
                cizy.add(diyarbakiry);
            }
            if(sehirler1.get(i)==21){
                g.fillRect(98,77, 10, 10);
                int edirnex=103;
                int edirney=82;
                cizx.add(edirnex);
                cizy.add(edirney);
            }
            if(sehirler1.get(i)==22){
                g.fillRect(1110,405, 10, 10);
                int elazigx=1115;
                int elazigy=410;
                cizx.add(elazigx);
                cizy.add(elazigy);
            }
            if(sehirler1.get(i)==23){
                g.fillRect(1127,295, 10, 10);
                int erzincanx=1132;
                int erzincany=300;
                cizx.add(erzincanx);
                cizy.add(erzincany);
            }
            if(sehirler1.get(i)==24){
                g.fillRect(1270,263, 10, 10);
                int erzurumx=1275;
                int erzurumy=268;
                cizx.add(erzurumx);
                cizy.add(erzurumy);
            }
            if(sehirler1.get(i)==25){
                g.fillRect(401,295, 10, 10);
                int eskisehirx=406;
                int eskisehiry=300;
                cizx.add(eskisehirx);
                cizy.add(eskisehiry);
            }
            if(sehirler1.get(i)==26){
                g.fillRect(968,580, 10, 10);
                int gaziantepx=973;
                int gaziantepy=585;
                cizx.add(gaziantepx);
                cizy.add(gaziantepy);
            }
            if(sehirler1.get(i)==27){
                g.fillRect(1037,176, 10, 10);
                int giresunx=1042;
                int giresuny=181;
                cizx.add(giresunx);
                cizy.add(giresuny);
            }
            if(sehirler1.get(i)==28){
                g.fillRect(1120,217, 10, 10);
                int gümüshanex=1125;
                int gümüshaney=222;
                cizx.add(gümüshanex);
                cizy.add(gümüshaney);
            } 
            if(sehirler1.get(i)==29){
                g.fillRect(1501,489, 10, 10);
                int hakkarix=1506;
                int hakkariy=494;
                cizx.add(hakkarix);
                cizy.add(hakkariy);
            }
            if(sehirler1.get(i)==30){
                g.fillRect(868,675, 10, 10);
                int hatayx=873;
                int hatayy=680;
                cizx.add(hatayx);
                cizy.add(hatayy);
            }
            if(sehirler1.get(i)==31){
                g.fillRect(396,504, 10, 10);
                int ispartax=401;
                int ispartay=509;
                cizx.add(ispartax);
                cizy.add(ispartay);
            }
            if(sehirler1.get(i)==32){
                g.fillRect(739,612, 10, 10);
                int mersinx=744;
                int mersiny=617;
                cizx.add(mersinx);
                cizy.add(mersiny);
            }
            if(sehirler1.get(i)==33){
                g.fillRect(287,158, 10, 10);
                int istanbulx=292;
                int istanbuly=163;
                cizx.add(istanbulx);
                cizy.add(istanbuly);
            }
            if(sehirler1.get(i)==34){
                g.fillRect(115,418, 10, 10);
                int izmirx=120;
                int izmiry=423;
                cizx.add(izmirx);
                cizy.add(izmiry);
            }
            if(sehirler1.get(i)==35){
                g.fillRect(1412,176, 10, 10);
               int karsx=1417;
                int karsy=181;
                cizx.add(karsx);
                cizy.add(karsy);
            }
            if(sehirler1.get(i)==36){
                g.fillRect(664,133, 10, 10);
               int kastamonux=669;
                int kastamonuy=138;
                cizx.add(kastamonux);
                cizy.add(kastamonuy);
            }
            if(sehirler1.get(i)==37){
                g.fillRect(804,410, 10, 10);
                int kayserix=809;
                int kayseriy=415;
                cizx.add(kayserix);
                cizy.add(kayseriy);
            }
            if(sehirler1.get(i)==38){
                g.fillRect(150,75, 10, 10);
                int kirklarelix=155;
                int kirklareliy=80;
                cizx.add(kirklarelix);
                cizy.add(kirklareliy);
            } 
            if(sehirler1.get(i)==39){
                g.fillRect(697,367, 10, 10);
                int kirsehirx=702;
                int kirsehiry=372;
                cizx.add(kirsehirx);
                cizy.add(kirsehiry);
            }
            if(sehirler1.get(i)==40){
                g.setColor(Color.green);
                g.fillRect(359,186, 10, 10);
                g.setColor(Color.red);
                int kocaelix=364;
                int kocaeliy=191;
                cizx.add(kocaelix);
                cizy.add(kocaeliy);
            }
            if(sehirler1.get(i)==41){
                g.fillRect(559,502, 10, 10);
                int konyax=564;
                int konyay=507;
                cizx.add(konyax);
                cizy.add(konyay);
            }
            if(sehirler1.get(i)==42){
                g.fillRect(356,330, 10, 10);
                int kütahyax=361;
                int kütahyay=335;
                cizx.add(kütahyax);
                cizy.add(kütahyay);
            }
            if(sehirler1.get(i)==43){
                g.fillRect(1041,444, 10, 10);
                int malatyax=1046;
                int malatyay=449;
                cizx.add(malatyax);
                cizy.add(malatyay);
            }
            if(sehirler1.get(i)==44){
                g.fillRect(141,407, 10, 10);
                int manisax=146;
                int manisay=412;
                cizx.add(manisax);
                cizy.add(manisay);
            }
            if(sehirler1.get(i)==45){
                g.fillRect(930,525, 10, 10);
                int kahramanmarasx=935;
                int kahramanmarasy=530;
                cizx.add(kahramanmarasx);
                cizy.add(kahramanmarasy);
            }
            if(sehirler1.get(i)==46){
                g.fillRect(1252,540, 10, 10);
                int mardinx=1257;
                int mardiny=545;
                cizx.add(mardinx);
                cizy.add(mardiny);
            }
            if(sehirler1.get(i)==47){
                g.fillRect(209,555, 10, 10);
                int muglax=214;
                int muglay=560;
                cizx.add(muglax);
                cizy.add(muglay);
            }
            if(sehirler1.get(i)==48){
                g.fillRect(1300,387, 10, 10);
                int musx=1305;
                int musy=392;
                cizx.add(musx);
                cizy.add(musy);
            } 
            if(sehirler1.get(i)==49){
                g.fillRect(740,423, 10, 10);
                int nevsehirx=745;
                int nevsehiry=428;
                cizx.add(nevsehirx);
                cizy.add(nevsehiry);
            }
            if(sehirler1.get(i)==50){
                g.fillRect(740,491, 10, 10);
                int nigdex=745;
                int nigdey=496;
                cizx.add(nigdex);
                cizy.add(nigdey);
            }
            if(sehirler1.get(i)==51){
                g.fillRect(994,171, 10, 10);
                int ordux=999;
                int orduy=176;
                cizx.add(ordux);
                cizy.add(orduy);
            }
            if(sehirler1.get(i)==52){
                g.fillRect(1200,154, 10, 10);
                int rizex=1205;
                int rizey=159;
                cizx.add(rizex);
                cizy.add(rizey);
            }
            if(sehirler1.get(i)==53){
                g.fillRect(395,188, 10, 10);
                int sakaryax=401;
                int sakaryay=197;
                cizx.add(sakaryax);
                cizy.add(sakaryay);
            }
            if(sehirler1.get(i)==54){
                g.fillRect(867,141, 10, 10);
                int samsunx=872;
                int samsuny=146;
                cizx.add(samsunx);
                cizy.add(samsuny);
            }
            if(sehirler1.get(i)==55){
                g.fillRect(1346,467, 10, 10);
                int siirtx=1351;
                int siirty=472;
                cizx.add(siirtx);
                cizy.add(siirty);
            }
            if(sehirler1.get(i)==56){
                g.fillRect(774,65, 10, 10);
                int sinopx=779;
                int sinopy=70;
                cizx.add(sinopx);
                cizy.add(sinopy);
            }
            if(sehirler1.get(i)==57){
                g.fillRect(927,299, 10, 10);
                int sivasx=932;
                int sivasy=304;
                cizx.add(sivasx);
                cizy.add(sivasy);
            }
            if(sehirler1.get(i)==58){
                g.fillRect(165,155, 10, 10);
                int tekirdagx=170;
                int tekirdagy=160;
                cizx.add(tekirdagx);
                cizy.add(tekirdagy);
            } 
            if(sehirler1.get(i)==59){
                g.fillRect(889,241, 10, 10);
                int tokatx=894;
                int tokaty=246;
                cizx.add(tokatx);
                cizy.add(tokaty);
            }
            if(sehirler1.get(i)==60){
                g.fillRect(1135,161, 10, 10);
                int trabzonx=1140;
                int trabzony=166;
                cizx.add(trabzonx);
                cizy.add(trabzony);
            }
            if(sehirler1.get(i)==61){
                g.fillRect(1138,363, 10, 10);
                int tuncelix=1143;
                int tunceliy=368;
                cizx.add(tuncelix);
                cizy.add(tunceliy);
            }
            if(sehirler1.get(i)==62){
                g.fillRect(1088,571, 10, 10);
                int sanliurfax=1093;
                int sanliurfay=576;
                cizx.add(sanliurfax);
                cizy.add(sanliurfay);
            }
            if(sehirler1.get(i)==63){
                g.fillRect(304,406, 10, 10);
                int usakx=309;
                int usaky=411;
                cizx.add(usakx);
                cizy.add(usaky);
            }
            if(sehirler1.get(i)==64){
                g.fillRect(1459,395, 10, 10);
                int vanx=1464;
                int vany=400;
                cizx.add(vanx);
                cizy.add(vany);
            }
            if(sehirler1.get(i)==65){
                g.fillRect(747,298, 10, 10);
                int yozgatx=752;
                int yozgaty=303;
                cizx.add(yozgatx);
                cizy.add(yozgaty);
            }
            if(sehirler1.get(i)==66){
                g.fillRect(512,125, 10, 10);
                int zonguldakx=517;
                int zonguldaky=130;
                cizx.add(zonguldakx);
                cizy.add(zonguldaky);
            }
            if(sehirler1.get(i)==67){
                g.fillRect(685,449, 10, 10);
                int aksarayx=690;
                int aksarayy=454;
                cizx.add(aksarayx);
                cizy.add(aksarayy);
            }
            if(sehirler1.get(i)==68){
                g.fillRect(1184,234, 10, 10);
                int bayburtx=1189;
                int bayburty=239;
                cizx.add(bayburtx);
                cizy.add(bayburty);
            } 
            if(sehirler1.get(i)==69){
                g.fillRect(621,576, 10, 10);
                int karamanx=626;
                int karamany=581;
                cizx.add(karamanx);
                cizy.add(karamany);
            }
            if(sehirler1.get(i)==70){
                g.fillRect(646,296, 10, 10);
                int kirikkalex=651;
                int kirikkaley=301;
                cizx.add(kirikkalex);
                cizy.add(kirikkaley);
            }
            if(sehirler1.get(i)==71){
                g.fillRect(1279,483, 10, 10);
                int batmanx=1284;
                int batmany=483;
                cizx.add(batmanx);
                cizy.add(batmany);
            }
            if(sehirler1.get(i)==72){
                g.fillRect(1394,511, 10, 10);
                int sirnakx=1399;
                int sirnaky=511;
                cizx.add(sirnakx);
                cizy.add(sirnaky);
            }
            if(sehirler1.get(i)==73){
                g.fillRect(553,104, 10, 10);
                int bartinx=558;
                int bartiny=109;
                cizx.add(bartinx);
                cizy.add(bartiny);
            }
            if(sehirler1.get(i)==74){
                g.fillRect(1375,129, 10, 10);
                int ardahanx=1380;
                int ardahany=134;
                cizx.add(ardahanx);
                cizy.add(ardahany);
            }
            if(sehirler1.get(i)==75){
                g.fillRect(1496,242, 10, 10);
                int igdirx=1501;
                int igdiry=247;
                cizx.add(igdirx);
                cizy.add(igdiry);
            }
            if(sehirler1.get(i)==76){
                g.fillRect(303,201, 10, 10);
                int yalovax=308;
                int yalovay=206;
                cizx.add(yalovax);
                cizy.add(yalovay);
            }
            if(sehirler1.get(i)==77){
                g.fillRect(578,154, 10, 10);
                int karabükx=583;
                int karabüky=159;
                cizx.add(karabükx);
                cizy.add(karabüky);
            }
            if(sehirler1.get(i)==78){
                g.fillRect(949,619, 10, 10);
                int kilisx=954;
                int kilisy=624;
                cizx.add(kilisx);
                cizy.add(kilisy);
            } 
            if(sehirler1.get(i)==79){
                g.fillRect(876,586, 10, 10);
                int osmaniyex=881;
                int osmaniyey=591;
                cizx.add(osmaniyex);
                cizy.add(osmaniyey);
            }
            if(sehirler1.get(i)==80){
                g.fillRect(456,188, 10, 10);
                int düzcex=461;
                int düzcey=193;
                cizx.add(düzcex);
                cizy.add(düzcey);
            }
        }
        
        
        
        jLabel1.setText("Gidilenyol="+String.valueOf(gidilenyol1+"km")
        ); 
   }
   
    public int[][] dosyaokuma(String a){
    
    File file = new File(a);
        
       int [][] sehirler=new int[81][81];
       int [][] enkısasehirler=new int[81][81];
       int [][] kapat=new int[1][1];
       kapat[0][0]=-1;
int i=0,j=0;

try {
 
            Scanner scanner = new Scanner(file);//) //{
        while(scanner.hasNextInt()){        
            sehirler[i][j]=scanner.nextInt();
            j++;
            if(j==81){
                j=0;
                i++;
            }
        }  
        } catch (FileNotFoundException e) {
// TODO Auto-generated catch block
                        System.out.println("Dosya Bulunamadı..");
                        JOptionPane.showMessageDialog(null,"Komsuuzaklık.txt adresini doğru giriniz");
                 
        return kapat;
        
        }
    
    return sehirler;
}
    
    ArrayList gidilensehirler=new ArrayList();
    public int[][] floydWarshall(int graf[][]){        
       
        int[][] komsuluk = new int[81][81]; 
        int i, j, k;
        for (i = 0; i < 81; i++) 
            for (j = 0; j < 81; j++) 
                komsuluk[i][j] = graf[i][j];       
        for (k = 0; k < 81; k++) 
        {          
            for (i = 0; i < 81; i++) 
            {                 
                for (j = 0; j < 81; j++) 
                {                  
                    if (komsuluk[i][k] + komsuluk[k][j] < komsuluk[i][j]){ 
                        komsuluk[i][j] = komsuluk[i][k] + komsuluk[k][j];                                                                  
                    }
                } 
            } 
        }   
        return komsuluk;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gezgin Kargo");
        setMaximumSize(new java.awt.Dimension(1602, 800));
        setMinimumSize(new java.awt.Dimension(1602, 880));
        setPreferredSize(new java.awt.Dimension(1602, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1190, 690, 410, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\lem_l\\OneDrive\\Masaüstü\\panel.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1220, 540, 380, 210);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kargo/4lturkiye-mulki-idare-sistemleri-haritasi1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1602, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    public static void main(String args[]) /*throws FileNotFoundException, IOException*/ {                              
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Harita().setVisible(false);
                
            }
        });
       
       
     
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
