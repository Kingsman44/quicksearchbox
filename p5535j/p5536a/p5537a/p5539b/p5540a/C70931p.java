package p5535j.p5536a.p5537a.p5539b.p5540a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.a.b.a.p */
/* compiled from: PG */
public enum C70931p implements C62957cd {
    UNKNOWN_INVOCATION_TYPE(0),
    ASSIST_DATA(1),
    SCREENSHOT(2);
    

    /* renamed from: d */
    public final int f189143d;

    private C70931p(int i) {
        this.f189143d = i;
    }

    /* renamed from: a */
    public static C70931p m103845a(int i) {
        if (i == 0) {
            return UNKNOWN_INVOCATION_TYPE;
        }
        if (i == 1) {
            return ASSIST_DATA;
        }
        if (i != 2) {
            return null;
        }
        return SCREENSHOT;
    }

    /* renamed from: b */
    public static C62959cf m103846b() {
        return C70930o.f189138a;
    }

    public final int getNumber() {
        return this.f189143d;
    }

    public final String toString() {
        return Integer.toString(this.f189143d);
    }
}
