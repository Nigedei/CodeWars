package Mid;

public class Dubstep {
    public static String SongDecoder (String song)
    {
        // Your code is here...
        String songName = song;
        if(song.contains("WUB")){
            song=song.replace("WUB"," ");
            while(song.contains("  ")){
                song=song.replace("  "," ");
            }
            song=song.trim();
        }
        return song;
        //return song.replaceAll("(WUB)+", " ").trim();
    }
}
