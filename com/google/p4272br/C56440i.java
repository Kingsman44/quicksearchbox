package com.google.p4272br;

/* renamed from: com.google.br.i */
/* compiled from: PG */
final class C56440i extends C56441j {

    /* renamed from: a */
    final CharSequence f150753a;

    /* renamed from: b */
    final int f150754b;

    public C56440i(CharSequence charSequence, int i) {
        this.f150753a = charSequence;
        this.f150754b = i;
    }

    /* renamed from: a */
    public final int mo54378a(int i) {
        int i2 = -1;
        int codePointBefore = (i <= 0 || i > this.f150753a.length()) ? -1 : Character.codePointBefore(this.f150753a, i);
        if (i < this.f150753a.length()) {
            i2 = Character.codePointAt(this.f150753a, i);
        }
        return C56432ab.m88117a(codePointBefore, i2);
    }

    /* renamed from: b */
    public final int mo54379b(int i) {
        if (i >= this.f150754b) {
            return -8;
        }
        int codePointAt = Character.codePointAt(this.f150753a, i);
        return Character.charCount(codePointAt) | (codePointAt << 3);
    }
}
