int size=450;
void setup(){
size(500,500);
 for(int i=0; i<9; i++){
   if(i%2==0){
   fill(21,9,72);
   
   }
   else{
   fill(100,255,50);
   
   }
 ellipse(250,250,size,size);
 size-=50;
 }
}
