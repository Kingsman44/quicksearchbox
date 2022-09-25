package p001a.p007b.p011b.p012a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: a.b.b.a.c */
/* compiled from: PG */
public enum C0027c implements C62957cd {
    OFF(0),
    MINI(1),
    MAX(2),
    FULLSCREEN(3),
    DRIVING_SCREEN(4),
    MICRO(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f86h;

    private C0027c(int i) {
        this.f86h = i;
    }

    /* renamed from: a */
    public static C0027c m9a(int i) {
        if (i == 0) {
            return OFF;
        }
        if (i == 1) {
            return MINI;
        }
        if (i == 2) {
            return MAX;
        }
        if (i == 3) {
            return FULLSCREEN;
        }
        if (i == 4) {
            return DRIVING_SCREEN;
        }
        if (i != 5) {
            return null;
        }
        return MICRO;
    }

    /* renamed from: b */
    public static C62959cf m10b() {
        return C0026b.f77a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f86h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
