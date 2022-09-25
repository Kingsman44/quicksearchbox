package p001a.p014d.p015a.p016a;

import com.google.protobuf.C62957cd;

/* renamed from: a.d.a.a.y */
/* compiled from: PG */
public enum C0080y implements C62957cd {
    UNDEFINED_PLACEMENT(0),
    ANYWHERE(1),
    PREFIX(2),
    SUFFIX(3),
    PREFIX_OR_SUFFIX(4),
    EXACT_MATCH(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f221h;

    private C0080y(int i) {
        this.f221h = i;
    }

    /* renamed from: a */
    public static C0080y m34a(int i) {
        if (i == 0) {
            return UNDEFINED_PLACEMENT;
        }
        if (i == 1) {
            return ANYWHERE;
        }
        if (i == 2) {
            return PREFIX;
        }
        if (i == 3) {
            return SUFFIX;
        }
        if (i == 4) {
            return PREFIX_OR_SUFFIX;
        }
        if (i != 5) {
            return null;
        }
        return EXACT_MATCH;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f221h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
