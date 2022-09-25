package p001a.p007b.p011b.p012a;

/* renamed from: a.b.b.a.a */
/* compiled from: PG */
public final class C0025a {
    /* renamed from: a */
    public static /* synthetic */ String m6a(int i) {
        switch (i) {
            case 2:
                return "NONE";
            case 3:
                return "DIALER";
            case 4:
                return "CALL";
            case 5:
                return "MEDIA_PLAYER";
            case 6:
                return "MEDIA_BROWSE";
            case 7:
                return "EXPERIENCE_LAUNCHER";
            case 8:
                return "CALL_CENTER";
            case 9:
                return "MESSAGE_CENTER";
            case 10:
                return "SETTINGS";
            case 11:
                return "MEDIA_BROWSE_TREE";
            case 12:
                return "MEDIA_PIVOT";
            default:
                return "UNRECOGNIZED";
        }
    }

    /* renamed from: b */
    public static int m7b(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: c */
    public static int m8c(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            default:
                return 0;
        }
    }
}
