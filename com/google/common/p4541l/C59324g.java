package com.google.common.p4541l;

import com.google.common.p4573p.C60716f;
import java.math.RoundingMode;

/* renamed from: com.google.common.l.g */
/* compiled from: PG */
public final class C59324g extends C59326i {

    /* renamed from: a */
    private final C59326i f157510a;

    /* renamed from: b */
    private final String f157511b = ":";

    public C59324g(C59326i iVar) {
        this.f157510a = iVar;
    }

    /* renamed from: a */
    public final int mo56821a(byte[] bArr, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (this.f157511b.indexOf(charAt) < 0) {
                sb.append(charAt);
            }
        }
        return this.f157510a.mo56821a(bArr, sb);
    }

    /* renamed from: c */
    public final void mo56823c(Appendable appendable, byte[] bArr, int i) {
        this.f157510a.mo56823c(new C59319b(appendable), bArr, i);
    }

    /* renamed from: d */
    public final int mo56824d(int i) {
        int d = this.f157510a.mo56824d(i);
        return d + (this.f157511b.length() * C60716f.m92646c(Math.max(0, d - 1), 2, RoundingMode.FLOOR));
    }

    /* renamed from: e */
    public final C59326i mo56825e() {
        throw null;
    }

    /* renamed from: f */
    public final C59326i mo56826f() {
        throw null;
    }

    /* renamed from: g */
    public final C59326i mo56827g() {
        throw null;
    }

    /* renamed from: h */
    public final CharSequence mo56828h(CharSequence charSequence) {
        return this.f157510a.mo56828h(charSequence);
    }

    /* renamed from: i */
    public final boolean mo56829i(CharSequence charSequence) {
        throw null;
    }

    /* renamed from: m */
    public final int mo56830m(int i) {
        return this.f157510a.mo56830m(i);
    }

    public final String toString() {
        return this.f157510a + ".withSeparator(\"" + this.f157511b + "\", 2)";
    }
}
