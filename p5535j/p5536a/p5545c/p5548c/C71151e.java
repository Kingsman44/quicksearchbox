package p5535j.p5536a.p5545c.p5548c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.c.c.e */
/* compiled from: PG */
public enum C71151e implements C62957cd {
    UNKNOWN(0),
    UNKNOWN_NOT_PROVIDED(1),
    UNKNOWN_PROVIDED(2),
    NGA(3),
    HUB_MODE(4),
    VS(5);
    

    /* renamed from: g */
    public final int f189812g;

    private C71151e(int i) {
        this.f189812g = i;
    }

    /* renamed from: a */
    public static C71151e m103899a(int i) {
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
    public static C62959cf m103900b() {
        return C71146d.f189791a;
    }

    public final int getNumber() {
        return this.f189812g;
    }

    public final String toString() {
        return Integer.toString(this.f189812g);
    }
}
