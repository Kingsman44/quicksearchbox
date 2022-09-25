package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.c.c.a.ak */
/* compiled from: PG */
public enum C70984ak implements C62957cd {
    UNKNOWN(0),
    UNKNOWN_NOT_PROVIDED(1),
    UNKNOWN_PROVIDED(2),
    NGA(3),
    HUB_MODE(4),
    VS(5);
    

    /* renamed from: g */
    public final int f189286g;

    private C70984ak(int i) {
        this.f189286g = i;
    }

    /* renamed from: a */
    public static C70984ak m103855a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return UNKNOWN_NOT_PROVIDED;
        }
        if (i == 2) {
            return UNKNOWN_PROVIDED;
        }
        if (i == 3) {
            return NGA;
        }
        if (i == 4) {
            return HUB_MODE;
        }
        if (i != 5) {
            return null;
        }
        return VS;
    }

    /* renamed from: b */
    public static C62959cf m103856b() {
        return C70983aj.f189278a;
    }

    public final int getNumber() {
        return this.f189286g;
    }

    public final String toString() {
        return Integer.toString(this.f189286g);
    }
}
