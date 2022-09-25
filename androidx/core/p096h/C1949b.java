package androidx.core.p096h;

/* renamed from: androidx.core.h.b */
/* compiled from: PG */
final class C1949b {

    /* renamed from: e */
    private static final byte[] f5857e = new byte[1792];

    /* renamed from: a */
    public final CharSequence f5858a;

    /* renamed from: b */
    public final int f5859b;

    /* renamed from: c */
    public int f5860c;

    /* renamed from: d */
    public char f5861d;

    static {
        for (int i = 0; i < 1792; i++) {
            f5857e[i] = Character.getDirectionality(i);
        }
    }

    public C1949b(CharSequence charSequence) {
        this.f5858a = charSequence;
        this.f5859b = charSequence.length();
    }

    /* renamed from: b */
    public static byte m5270b(char c) {
        return c < 1792 ? f5857e[c] : Character.getDirectionality(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte mo5099a() {
        char charAt = this.f5858a.charAt(this.f5860c - 1);
        this.f5861d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(this.f5858a, this.f5860c);
            this.f5860c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f5860c--;
        return m5270b(this.f5861d);
    }
}
