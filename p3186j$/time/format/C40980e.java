package p3186j$.time.format;

/* renamed from: j$.time.format.e */
final class C40980e implements C40982g {

    /* renamed from: a */
    private final char f107337a;

    C40980e(char c) {
        this.f107337a = c;
    }

    /* renamed from: b */
    public final boolean mo43294b(C41001z zVar, StringBuilder sb) {
        sb.append(this.f107337a);
        return true;
    }

    /* renamed from: d */
    public final int mo43295d(C40999x xVar, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return i ^ -1;
        }
        char charAt = charSequence.charAt(i);
        char c = this.f107337a;
        return (charAt == c || (!xVar.mo43327k() && (Character.toUpperCase(charAt) == Character.toUpperCase(c) || Character.toLowerCase(charAt) == Character.toLowerCase(c)))) ? i + 1 : i ^ -1;
    }

    public final String toString() {
        char c = this.f107337a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
