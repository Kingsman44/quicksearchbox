package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.c.c.a.dj */
/* compiled from: PG */
public enum C71064dj implements C62957cd {
    UNKNOWN(0),
    SYS_UI(1),
    INVOCATION(2);
    

    /* renamed from: d */
    public final int f189523d;

    private C71064dj(int i) {
        this.f189523d = i;
    }

    /* renamed from: a */
    public static C71064dj m103867a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SYS_UI;
        }
        if (i != 2) {
            return null;
        }
        return INVOCATION;
    }

    /* renamed from: b */
    public static C62959cf m103868b() {
        return C71063di.f189518a;
    }

    public final int getNumber() {
        return this.f189523d;
    }

    public final String toString() {
        return Integer.toString(this.f189523d);
    }
}
