package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.c.c.a.eu */
/* compiled from: PG */
public enum C71102eu implements C62957cd {
    INVOCATION_STATE_UNSPECIFIED(0),
    IMPLICIT(1),
    EXPLICIT(2),
    CANCELED(3),
    EXECUTED(4);
    

    /* renamed from: f */
    public final int f189633f;

    private C71102eu(int i) {
        this.f189633f = i;
    }

    /* renamed from: a */
    public static C71102eu m103885a(int i) {
        if (i == 0) {
            return INVOCATION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return IMPLICIT;
        }
        if (i == 2) {
            return EXPLICIT;
        }
        if (i == 3) {
            return CANCELED;
        }
        if (i != 4) {
            return null;
        }
        return EXECUTED;
    }

    /* renamed from: b */
    public static C62959cf m103886b() {
        return C71101et.f189626a;
    }

    public final int getNumber() {
        return this.f189633f;
    }

    public final String toString() {
        return Integer.toString(this.f189633f);
    }
}
