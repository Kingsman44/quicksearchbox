package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: f.a.a.a.p */
/* compiled from: PG */
public enum C69451p implements C62957cd {
    UNKNOWN_ACTIVITY(0),
    NO_ACTIVITY(1),
    LOW_ACTIVITY(2),
    MEDIUM_ACTIVITY(3),
    HIGH_ACTIVITY(4),
    PENDING_ACTIVITY(5);
    

    /* renamed from: g */
    public final int f185860g;

    private C69451p(int i) {
        this.f185860g = i;
    }

    /* renamed from: a */
    public static C69451p m100761a(int i) {
        if (i == 0) {
            return UNKNOWN_ACTIVITY;
        }
        if (i == 1) {
            return NO_ACTIVITY;
        }
        if (i == 2) {
            return LOW_ACTIVITY;
        }
        if (i == 3) {
            return MEDIUM_ACTIVITY;
        }
        if (i == 4) {
            return HIGH_ACTIVITY;
        }
        if (i != 5) {
            return null;
        }
        return PENDING_ACTIVITY;
    }

    /* renamed from: b */
    public static C62959cf m100762b() {
        return C69450o.f185852a;
    }

    public final int getNumber() {
        return this.f185860g;
    }

    public final String toString() {
        return Integer.toString(this.f185860g);
    }
}
