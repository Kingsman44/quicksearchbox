package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: f.a.a.a.au */
/* compiled from: PG */
public enum C69399au implements C62957cd {
    UNKNOWN_FEED_TIP(0),
    SNOWMAN(1),
    REACTION(2),
    INTEREST_HEADER(3),
    PLAY_VIDEO(4);
    

    /* renamed from: f */
    private final int f185692f;

    private C69399au(int i) {
        this.f185692f = i;
    }

    /* renamed from: a */
    public static C69399au m100748a(int i) {
        if (i == 0) {
            return UNKNOWN_FEED_TIP;
        }
        if (i == 1) {
            return SNOWMAN;
        }
        if (i == 2) {
            return REACTION;
        }
        if (i == 3) {
            return INTEREST_HEADER;
        }
        if (i != 4) {
            return null;
        }
        return PLAY_VIDEO;
    }

    /* renamed from: b */
    public static C62959cf m100749b() {
        return C69398at.f185685a;
    }

    public final int getNumber() {
        return this.f185692f;
    }

    public final String toString() {
        return Integer.toString(this.f185692f);
    }
}
