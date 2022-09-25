package p5535j.p5536a.p5537a.p5539b.p5540a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.a.b.a.e */
/* compiled from: PG */
public enum C70920e implements C62957cd {
    UNKNOWN(0),
    STATIC_CACHE(1),
    SYNCHRONIZED_CACHE(2),
    CONTEXT_PROVIDER(3);
    

    /* renamed from: e */
    public final int f189119e;

    private C70920e(int i) {
        this.f189119e = i;
    }

    /* renamed from: a */
    public static C70920e m103843a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STATIC_CACHE;
        }
        if (i == 2) {
            return SYNCHRONIZED_CACHE;
        }
        if (i != 3) {
            return null;
        }
        return CONTEXT_PROVIDER;
    }

    /* renamed from: b */
    public static C62959cf m103844b() {
        return C70919d.f189113a;
    }

    public final int getNumber() {
        return this.f189119e;
    }

    public final String toString() {
        return Integer.toString(this.f189119e);
    }
}
