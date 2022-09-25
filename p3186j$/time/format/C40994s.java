package p3186j$.time.format;

/* renamed from: j$.time.format.s */
enum C40994s implements C40982g {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    /* renamed from: b */
    public final boolean mo43294b(C41001z zVar, StringBuilder sb) {
        return true;
    }

    /* renamed from: d */
    public final int mo43295d(C40999x xVar, CharSequence charSequence, int i) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            xVar.mo43329m(true);
        } else if (ordinal == 1) {
            xVar.mo43329m(false);
        } else if (ordinal == 2) {
            xVar.mo43333q(true);
        } else if (ordinal == 3) {
            xVar.mo43333q(false);
        }
        return i;
    }

    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
