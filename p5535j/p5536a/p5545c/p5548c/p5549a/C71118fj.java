package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.c.c.a.fj */
/* compiled from: PG */
public enum C71118fj implements C62957cd {
    NOTDEFINED(0),
    OPA_AGSA(1);
    

    /* renamed from: c */
    public final int f189708c;

    private C71118fj(int i) {
        this.f189708c = i;
    }

    /* renamed from: a */
    public static C71118fj m103896a(int i) {
        if (i == 0) {
            return NOTDEFINED;
        }
        if (i != 1) {
            return null;
        }
        return OPA_AGSA;
    }

    /* renamed from: b */
    public static C62959cf m103897b() {
        return C71117fi.f189704a;
    }

    public final int getNumber() {
        return this.f189708c;
    }

    public final String toString() {
        return Integer.toString(this.f189708c);
    }
}
