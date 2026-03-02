package pokedexBindu.FireType;

public class Arcanine {

String name = "Arcanine";
String type = "FireType";
int speed =90;
int HP =260;

public boolean isFast() {
    return speed > 80;
}


public String getdesc () {

return name + " is a Loyal, brave, acts like a noble guardian " + type + " Pokémon2, at Hitpoints " + HP + ".";
}

public int getrunspeed (){

return speed* HP ;

}
}





