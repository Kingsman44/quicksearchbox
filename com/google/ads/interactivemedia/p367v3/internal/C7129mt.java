package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.mt */
/* compiled from: PG */
final class C7129mt {

    /* renamed from: a */
    static final String[] f22999a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b */
    public static final /* synthetic */ int f23000b = 0;

    /* renamed from: a */
    public static C7242qy m21178a(aee aee) {
        String str;
        String str2;
        int g = aee.mo14553g() + aee.mo14568v();
        int v = aee.mo14568v();
        int i = (v >> 24) & PrivateKeyType.INVALID;
        C7242qy qyVar = null;
        if (i == 169 || i == 253) {
            int i2 = 16777215 & v;
            if (i2 == 6516084) {
                int v2 = aee.mo14568v();
                if (aee.mo14568v() == 1684108385) {
                    aee.mo14557k(8);
                    String G = aee.mo14543G(v2 - 16);
                    qyVar = new C7265ru("und", G, G);
                } else {
                    String g2 = C7114me.m21132g(v);
                    Log.w("MetadataUtil", g2.length() != 0 ? "Failed to parse comment attribute: ".concat(g2) : new String("Failed to parse comment attribute: "));
                }
                aee.mo14554h(g);
                return qyVar;
            } else if (i2 == 7233901 || i2 == 7631467) {
                C7281sj b = m21179b(v, "TIT2", aee);
                aee.mo14554h(g);
                return b;
            } else if (i2 == 6516589 || i2 == 7828084) {
                C7281sj b2 = m21179b(v, "TCOM", aee);
                aee.mo14554h(g);
                return b2;
            } else if (i2 == 6578553) {
                C7281sj b3 = m21179b(v, "TDRC", aee);
                aee.mo14554h(g);
                return b3;
            } else if (i2 == 4280916) {
                C7281sj b4 = m21179b(v, "TPE1", aee);
                aee.mo14554h(g);
                return b4;
            } else if (i2 == 7630703) {
                C7281sj b5 = m21179b(v, "TSSE", aee);
                aee.mo14554h(g);
                return b5;
            } else if (i2 == 6384738) {
                C7281sj b6 = m21179b(v, "TALB", aee);
                aee.mo14554h(g);
                return b6;
            } else if (i2 == 7108978) {
                C7281sj b7 = m21179b(v, "USLT", aee);
                aee.mo14554h(g);
                return b7;
            } else if (i2 == 6776174) {
                C7281sj b8 = m21179b(v, "TCON", aee);
                aee.mo14554h(g);
                return b8;
            } else if (i2 == 6779504) {
                C7281sj b9 = m21179b(v, "TIT1", aee);
                aee.mo14554h(g);
                return b9;
            }
        } else if (v == 1735291493) {
            try {
                int e = m21182e(aee);
                String str3 = (e <= 0 || e > 192) ? null : f22999a[e - 1];
                if (str3 != null) {
                    qyVar = new C7281sj("TCON", (String) null, str3);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return qyVar;
            } finally {
                aee.mo14554h(g);
            }
        } else if (v == 1684632427) {
            C7281sj d = m21181d(1684632427, "TPOS", aee);
            aee.mo14554h(g);
            return d;
        } else if (v == 1953655662) {
            C7281sj d2 = m21181d(1953655662, "TRCK", aee);
            aee.mo14554h(g);
            return d2;
        } else if (v == 1953329263) {
            C7273sb c = m21180c(1953329263, "TBPM", aee, true, false);
            aee.mo14554h(g);
            return c;
        } else if (v == 1668311404) {
            C7273sb c2 = m21180c(1668311404, "TCMP", aee, true, true);
            aee.mo14554h(g);
            return c2;
        } else if (v == 1668249202) {
            int v3 = aee.mo14568v();
            if (aee.mo14568v() == 1684108385) {
                int f = C7114me.m21131f(aee.mo14568v());
                if (f == 13) {
                    str2 = "image/jpeg";
                } else if (f == 14) {
                    str2 = "image/png";
                    f = 14;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Unrecognized cover art flags: ");
                    sb.append(f);
                    Log.w("MetadataUtil", sb.toString());
                } else {
                    aee.mo14557k(4);
                    int i3 = v3 - 16;
                    byte[] bArr = new byte[i3];
                    aee.mo14559m(bArr, 0, i3);
                    qyVar = new C7257rm(str2, (String) null, 3, bArr);
                }
            } else {
                Log.w("MetadataUtil", "Failed to parse cover art attribute");
            }
            aee.mo14554h(g);
            return qyVar;
        } else if (v == 1631670868) {
            C7281sj b10 = m21179b(1631670868, "TPE2", aee);
            aee.mo14554h(g);
            return b10;
        } else if (v == 1936682605) {
            C7281sj b11 = m21179b(1936682605, "TSOT", aee);
            aee.mo14554h(g);
            return b11;
        } else if (v == 1936679276) {
            C7281sj b12 = m21179b(1936679276, "TSO2", aee);
            aee.mo14554h(g);
            return b12;
        } else if (v == 1936679282) {
            C7281sj b13 = m21179b(1936679282, "TSOA", aee);
            aee.mo14554h(g);
            return b13;
        } else if (v == 1936679265) {
            C7281sj b14 = m21179b(1936679265, "TSOP", aee);
            aee.mo14554h(g);
            return b14;
        } else if (v == 1936679791) {
            C7281sj b15 = m21179b(1936679791, "TSOC", aee);
            aee.mo14554h(g);
            return b15;
        } else if (v == 1920233063) {
            C7273sb c3 = m21180c(1920233063, "ITUNESADVISORY", aee, false, false);
            aee.mo14554h(g);
            return c3;
        } else if (v == 1885823344) {
            C7273sb c4 = m21180c(1885823344, "ITUNESGAPLESS", aee, false, true);
            aee.mo14554h(g);
            return c4;
        } else if (v == 1936683886) {
            C7281sj b16 = m21179b(1936683886, "TVSHOWSORT", aee);
            aee.mo14554h(g);
            return b16;
        } else if (v == 1953919848) {
            C7281sj b17 = m21179b(1953919848, "TVSHOW", aee);
            aee.mo14554h(g);
            return b17;
        } else if (v == 757935405) {
            String str4 = null;
            String str5 = null;
            int i4 = -1;
            int i5 = -1;
            while (aee.mo14553g() < g) {
                int g3 = aee.mo14553g();
                int v4 = aee.mo14568v();
                int v5 = aee.mo14568v();
                aee.mo14557k(4);
                if (v5 == 1835360622) {
                    str4 = aee.mo14543G(v4 - 12);
                } else if (v5 == 1851878757) {
                    str5 = aee.mo14543G(v4 - 12);
                } else {
                    if (v5 == 1684108385) {
                        i5 = v4;
                    }
                    if (v5 == 1684108385) {
                        i4 = g3;
                    }
                    aee.mo14557k(v4 - 12);
                }
            }
            if (!(str4 == null || str5 == null)) {
                if (i4 != -1) {
                    aee.mo14554h(i4);
                    aee.mo14557k(16);
                    qyVar = new C7275sd(str4, str5, aee.mo14543G(i5 - 16));
                }
            }
            aee.mo14554h(g);
            return qyVar;
        }
        String g4 = C7114me.m21132g(v);
        if (g4.length() != 0) {
            str = "Skipped unknown metadata entry: ".concat(g4);
        } else {
            str = new String("Skipped unknown metadata entry: ");
        }
        Log.d("MetadataUtil", str);
        aee.mo14554h(g);
        return null;
    }

    /* renamed from: b */
    private static C7281sj m21179b(int i, String str, aee aee) {
        int v = aee.mo14568v();
        if (aee.mo14568v() == 1684108385) {
            aee.mo14557k(8);
            return new C7281sj(str, (String) null, aee.mo14543G(v - 16));
        }
        String g = C7114me.m21132g(i);
        Log.w("MetadataUtil", g.length() != 0 ? "Failed to parse text attribute: ".concat(g) : new String("Failed to parse text attribute: "));
        return null;
    }

    /* renamed from: c */
    private static C7273sb m21180c(int i, String str, aee aee, boolean z, boolean z2) {
        int e = m21182e(aee);
        if (z2) {
            e = Math.min(1, e);
        }
        if (e < 0) {
            String g = C7114me.m21132g(i);
            Log.w("MetadataUtil", g.length() != 0 ? "Failed to parse uint8 attribute: ".concat(g) : new String("Failed to parse uint8 attribute: "));
            return null;
        } else if (z) {
            return new C7281sj(str, (String) null, Integer.toString(e));
        } else {
            return new C7265ru("und", str, Integer.toString(e));
        }
    }

    /* renamed from: d */
    private static C7281sj m21181d(int i, String str, aee aee) {
        int v = aee.mo14568v();
        if (aee.mo14568v() == 1684108385 && v >= 22) {
            aee.mo14557k(10);
            int o = aee.mo14561o();
            if (o > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(o);
                String sb2 = sb.toString();
                int o2 = aee.mo14561o();
                if (o2 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 12);
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(o2);
                    sb2 = sb3.toString();
                }
                return new C7281sj(str, (String) null, sb2);
            }
        }
        String g = C7114me.m21132g(i);
        Log.w("MetadataUtil", g.length() != 0 ? "Failed to parse index/count attribute: ".concat(g) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    /* renamed from: e */
    private static int m21182e(aee aee) {
        aee.mo14557k(4);
        if (aee.mo14568v() == 1684108385) {
            aee.mo14557k(8);
            return aee.mo14560n();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
