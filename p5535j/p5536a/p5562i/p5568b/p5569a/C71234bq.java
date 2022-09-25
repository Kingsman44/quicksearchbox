package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.i.b.a.bq */
/* compiled from: PG */
public enum C71234bq implements C62957cd {
    UNKNOWN(0),
    CRONET(1);
    

    /* renamed from: c */
    public final int f190167c;

    private C71234bq(int i) {
        this.f190167c = i;
    }

    /* renamed from: a */
    public static C71234bq m103942a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return CRONET;
    }

    /* renamed from: b */
    public static C62959cf m103943b() {
        return C71233bp.f190163a;
    }

    public final int getNumber() {
        return this.f190167c;
    }

    public final String toString() {
        return Integer.toString(this.f190167c);
    }
}
