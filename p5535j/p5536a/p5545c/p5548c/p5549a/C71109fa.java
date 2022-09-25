package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.c.c.a.fa */
/* compiled from: PG */
public enum C71109fa implements C62957cd {
    ENTRYPOINT_UNKNOWN(0),
    ENTRYPOINT_SELF_INVOCATION(1),
    ENTRYPOINT_LEGACY_HOTWORD(2),
    ENTRYPOINT_HDM_HOTWORD(3),
    ENTRYPOINT_SESSION(4),
    ENTRYPOINT_LEGACY_PROGRAMMATIC(5),
    ENTRYPOINT_QUICK_PHRASE(6),
    ENTRYPOINT_TEST(100);
    

    /* renamed from: i */
    public final int f189662i;

    private C71109fa(int i) {
        this.f189662i = i;
    }

    /* renamed from: a */
    public static C71109fa m103888a(int i) {
        if (i == 100) {
            return ENTRYPOINT_TEST;
        }
        switch (i) {
            case 0:
                return ENTRYPOINT_UNKNOWN;
            case 1:
                return ENTRYPOINT_SELF_INVOCATION;
            case 2:
                return ENTRYPOINT_LEGACY_HOTWORD;
            case 3:
                return ENTRYPOINT_HDM_HOTWORD;
            case 4:
                return ENTRYPOINT_SESSION;
            case 5:
                return ENTRYPOINT_LEGACY_PROGRAMMATIC;
            case 6:
                return ENTRYPOINT_QUICK_PHRASE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m103889b() {
        return C71107ez.f189652a;
    }

    public final int getNumber() {
        return this.f189662i;
    }

    public final String toString() {
        return Integer.toString(this.f189662i);
    }
}
