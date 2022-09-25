package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.c.c.a.fh */
/* compiled from: PG */
public enum C71116fh implements C62957cd {
    UNDEFINED(0),
    VOICE(1),
    TEXT(2);
    

    /* renamed from: d */
    public final int f189703d;

    private C71116fh(int i) {
        this.f189703d = i;
    }

    /* renamed from: a */
    public static C71116fh m103894a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return VOICE;
        }
        if (i != 2) {
            return null;
        }
        return TEXT;
    }

    /* renamed from: b */
    public static C62959cf m103895b() {
        return C71115fg.f189698a;
    }

    public final int getNumber() {
        return this.f189703d;
    }

    public final String toString() {
        return Integer.toString(this.f189703d);
    }
}
