package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62957cd;

/* renamed from: d.b.a.a.bf */
/* compiled from: PG */
public enum C68170bf implements C62957cd {
    TEXT_MODE_UNSPECIFIED(0),
    TEXT_MODE_ORIGINAL(1),
    TEXT_MODE_MODIFIED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f184472e;

    private C68170bf(int i) {
        this.f184472e = i;
    }

    /* renamed from: a */
    public static C68170bf m98500a(int i) {
        if (i == 0) {
            return TEXT_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return TEXT_MODE_ORIGINAL;
        }
        if (i != 2) {
            return null;
        }
        return TEXT_MODE_MODIFIED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f184472e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
