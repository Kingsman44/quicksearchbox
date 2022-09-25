package androidx.media3.extractor.p161h;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;

/* renamed from: androidx.media3.extractor.h.p */
/* compiled from: PG */
final class C3429p {

    /* renamed from: a */
    static final String[] f10544a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b */
    public static final /* synthetic */ int f10545b = 0;

    /* renamed from: a */
    public static int m9938a(C2604ac acVar) {
        acVar.mo6131A(acVar.f7235b + 4);
        if (acVar.mo6134b() == 1684108385) {
            acVar.mo6131A(acVar.f7235b + 8);
            return acVar.mo6139g();
        }
        C2633u.m7050e("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: b */
    public static Id3Frame m9939b(int i, String str, C2604ac acVar, boolean z, boolean z2) {
        int a = m9938a(acVar);
        if (z2) {
            a = Math.min(1, a);
        }
        if (a < 0) {
            C2633u.m7050e("MetadataUtil", "Failed to parse uint8 attribute: ".concat(C3416c.m9894f(i)));
            return null;
        } else if (z) {
            return new TextInformationFrame(str, (String) null, Integer.toString(a));
        } else {
            return new CommentFrame("und", str, Integer.toString(a));
        }
    }

    /* renamed from: c */
    public static TextInformationFrame m9940c(int i, String str, C2604ac acVar) {
        int b = acVar.mo6134b();
        if (acVar.mo6134b() == 1684108385 && b >= 22) {
            acVar.mo6131A(acVar.f7235b + 10);
            int j = acVar.mo6142j();
            if (j > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                String sb2 = sb.toString();
                int j2 = acVar.mo6142j();
                if (j2 > 0) {
                    sb2 = sb2 + "/" + j2;
                }
                return new TextInformationFrame(str, (String) null, sb2);
            }
        }
        C2633u.m7050e("MetadataUtil", "Failed to parse index/count attribute: ".concat(C3416c.m9894f(i)));
        return null;
    }

    /* renamed from: d */
    public static TextInformationFrame m9941d(int i, String str, C2604ac acVar) {
        int b = acVar.mo6134b();
        if (acVar.mo6134b() == 1684108385) {
            acVar.mo6131A(acVar.f7235b + 8);
            return new TextInformationFrame(str, (String) null, acVar.mo6150r(b - 16));
        }
        C2633u.m7050e("MetadataUtil", "Failed to parse text attribute: ".concat(C3416c.m9894f(i)));
        return null;
    }
}
