package androidx.lifecycle;

/* renamed from: androidx.lifecycle.m */
/* compiled from: PG */
public enum C2382m {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    /* renamed from: a */
    public static C2382m m6393a(C2383n nVar) {
        C2383n nVar2 = C2383n.DESTROYED;
        int ordinal = nVar.ordinal();
        if (ordinal == 2) {
            return ON_DESTROY;
        }
        if (ordinal == 3) {
            return ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return ON_PAUSE;
    }

    /* renamed from: b */
    public static C2382m m6394b(C2383n nVar) {
        C2383n nVar2 = C2383n.DESTROYED;
        int ordinal = nVar.ordinal();
        if (ordinal == 1) {
            return ON_CREATE;
        }
        if (ordinal == 2) {
            return ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return ON_RESUME;
    }

    /* renamed from: c */
    public static C2382m m6395c(C2383n nVar) {
        C2383n nVar2 = C2383n.DESTROYED;
        int ordinal = nVar.ordinal();
        if (ordinal == 2) {
            return ON_CREATE;
        }
        if (ordinal == 3) {
            return ON_START;
        }
        if (ordinal != 4) {
            return null;
        }
        return ON_RESUME;
    }

    /* renamed from: d */
    public final C2383n mo5787d() {
        C2383n nVar = C2383n.DESTROYED;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return C2383n.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return C2383n.DESTROYED;
                        }
                        new StringBuilder().append(this);
                        throw new IllegalArgumentException(toString().concat(" has no target state"));
                    }
                }
            }
            return C2383n.STARTED;
        }
        return C2383n.CREATED;
    }
}
