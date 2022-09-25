package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62957cd;

/* renamed from: f.a.a.a.l */
/* compiled from: PG */
public enum C69447l implements C62957cd {
    UNKNOWN(0),
    ELIGIBLE(1),
    FIRST_TIME_OPEN_APP(2),
    FIRST_TIME_SEARCH(3),
    FIRST_TIME_PA(4),
    FIRST_TIME_NOW(5),
    TUTORIAL_VIDEO_WATCHED(6),
    APP_OPEN(7),
    SEARCH(8),
    DISCOVER(9),
    SEARCH_PA(10),
    VOICE_SEARCH(11),
    VOICE_SEARCH_USAGE(12),
    LENS_USAGE(13);
    

    /* renamed from: o */
    public final int f185841o;

    private C69447l(int i) {
        this.f185841o = i;
    }

    /* renamed from: a */
    public static C69447l m100760a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ELIGIBLE;
            case 2:
                return FIRST_TIME_OPEN_APP;
            case 3:
                return FIRST_TIME_SEARCH;
            case 4:
                return FIRST_TIME_PA;
            case 5:
                return FIRST_TIME_NOW;
            case 6:
                return TUTORIAL_VIDEO_WATCHED;
            case 7:
                return APP_OPEN;
            case 8:
                return SEARCH;
            case 9:
                return DISCOVER;
            case 10:
                return SEARCH_PA;
            case 11:
                return VOICE_SEARCH;
            case 12:
                return VOICE_SEARCH_USAGE;
            case 13:
                return LENS_USAGE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f185841o;
    }

    public final String toString() {
        return Integer.toString(this.f185841o);
    }
}
