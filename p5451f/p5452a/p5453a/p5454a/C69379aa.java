package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: f.a.a.a.aa */
/* compiled from: PG */
public enum C69379aa implements C62957cd {
    UNSPECIFIED(0),
    PERSISTENT(1),
    NORMAL(2),
    PREEMPTIVE(3);
    

    /* renamed from: e */
    private final int f185553e;

    private C69379aa(int i) {
        this.f185553e = i;
    }

    /* renamed from: a */
    public static C69379aa m100735a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return PERSISTENT;
        }
        if (i == 2) {
            return NORMAL;
        }
        if (i != 3) {
            return null;
        }
        return PREEMPTIVE;
    }

    /* renamed from: b */
    public static C62959cf m100736b() {
        return C69461z.f185874a;
    }

    public final int getNumber() {
        return this.f185553e;
    }

    public final String toString() {
        return Integer.toString(this.f185553e);
    }
}
