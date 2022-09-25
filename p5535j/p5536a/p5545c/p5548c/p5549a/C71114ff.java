package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.c.c.a.ff */
/* compiled from: PG */
public enum C71114ff implements C62957cd {
    UNSPECIFIED(0),
    FLUIDACTIONS(1),
    SERVER(2),
    PORTMON(3),
    NGA(4);
    

    /* renamed from: f */
    public final int f189697f;

    private C71114ff(int i) {
        this.f189697f = i;
    }

    /* renamed from: a */
    public static C71114ff m103892a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return FLUIDACTIONS;
        }
        if (i == 2) {
            return SERVER;
        }
        if (i == 3) {
            return PORTMON;
        }
        if (i != 4) {
            return null;
        }
        return NGA;
    }

    /* renamed from: b */
    public static C62959cf m103893b() {
        return C71113fe.f189690a;
    }

    public final int getNumber() {
        return this.f189697f;
    }

    public final String toString() {
        return Integer.toString(this.f189697f);
    }
}
