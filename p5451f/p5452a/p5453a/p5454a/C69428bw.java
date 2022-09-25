package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: f.a.a.a.bw */
/* compiled from: PG */
public enum C69428bw implements C62957cd {
    UNKNOWN_TOOLTIP_TYPE(0),
    DISCOVER_LENS(1);
    

    /* renamed from: c */
    private final int f185772c;

    private C69428bw(int i) {
        this.f185772c = i;
    }

    /* renamed from: a */
    public static C69428bw m100754a(int i) {
        if (i == 0) {
            return UNKNOWN_TOOLTIP_TYPE;
        }
        if (i != 1) {
            return null;
        }
        return DISCOVER_LENS;
    }

    /* renamed from: b */
    public static C62959cf m100755b() {
        return C69427bv.f185768a;
    }

    public final int getNumber() {
        return this.f185772c;
    }

    public final String toString() {
        return Integer.toString(this.f185772c);
    }
}
