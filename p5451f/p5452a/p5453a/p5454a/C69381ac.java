package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: f.a.a.a.ac */
/* compiled from: PG */
public enum C69381ac implements C62957cd {
    UNRESOLVED(0),
    SRP(1),
    LOBBY(2),
    RECENTS(3),
    COLLECTIONS(4);
    

    /* renamed from: f */
    public final int f185561f;

    private C69381ac(int i) {
        this.f185561f = i;
    }

    /* renamed from: a */
    public static C69381ac m100737a(int i) {
        if (i == 0) {
            return UNRESOLVED;
        }
        if (i == 1) {
            return SRP;
        }
        if (i == 2) {
            return LOBBY;
        }
        if (i == 3) {
            return RECENTS;
        }
        if (i != 4) {
            return null;
        }
        return COLLECTIONS;
    }

    /* renamed from: b */
    public static C62959cf m100738b() {
        return C69380ab.f185554a;
    }

    public final int getNumber() {
        return this.f185561f;
    }

    public final String toString() {
        return Integer.toString(this.f185561f);
    }
}
