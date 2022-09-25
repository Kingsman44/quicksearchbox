package com.google.common.p4541l;

import com.google.common.base.C58838bb;
import com.google.common.base.C58890d;
import com.google.common.p4573p.C60716f;
import java.math.RoundingMode;
import p3186j$.util.Objects;

/* renamed from: com.google.common.l.h */
/* compiled from: PG */
public class C59325h extends C59326i {

    /* renamed from: a */
    private volatile C59326i f157512a;

    /* renamed from: b */
    public final C59320c f157513b;

    /* renamed from: c */
    public final Character f157514c;

    /* renamed from: h */
    private volatile C59326i f157515h;

    public C59325h(C59320c cVar, Character ch) {
        this.f157513b = cVar;
        boolean z = true;
        if (ch != null && cVar.mo56818f(ch.charValue())) {
            z = false;
        }
        C58838bb.m90873h(z, "Padding character %s was already in alphabet", ch);
        this.f157514c = ch;
    }

    /* renamed from: b */
    public C59326i mo56822b(C59320c cVar, Character ch) {
        return new C59325h(cVar, ch);
    }

    /* renamed from: c */
    public void mo56823c(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        C58838bb.m90882q(0, i, bArr.length);
        while (i2 < i) {
            mo56834j(appendable, bArr, i2, Math.min(this.f157513b.f157505f, i - i2));
            i2 += this.f157513b.f157505f;
        }
    }

    /* renamed from: d */
    public final int mo56824d(int i) {
        C59320c cVar = this.f157513b;
        return cVar.f157504e * C60716f.m92646c(i, cVar.f157505f, RoundingMode.CEILING);
    }

    /* renamed from: e */
    public final C59326i mo56825e() {
        C59326i iVar = this.f157515h;
        if (iVar == null) {
            C59320c cVar = this.f157513b;
            if (cVar.mo56815d()) {
                C58838bb.m90884s(!cVar.mo56814c(), "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr = new char[cVar.f157501b.length];
                int i = 0;
                while (true) {
                    char[] cArr2 = cVar.f157501b;
                    if (i >= cArr2.length) {
                        break;
                    }
                    cArr[i] = C58890d.m90986a(cArr2[i]);
                    i++;
                }
                C59320c cVar2 = new C59320c(cVar.f157500a.concat(".lowerCase()"), cArr);
                cVar = cVar.f157507h ? cVar2.mo56813b() : cVar2;
            }
            if (cVar == this.f157513b) {
                iVar = this;
            } else {
                iVar = mo56822b(cVar, this.f157514c);
            }
            this.f157515h = iVar;
        }
        return iVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59325h) {
            C59325h hVar = (C59325h) obj;
            if (!this.f157513b.equals(hVar.f157513b) || !Objects.equals(this.f157514c, hVar.f157514c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C59326i mo56826f() {
        return this.f157514c == null ? this : mo56822b(this.f157513b, (Character) null);
    }

    /* renamed from: g */
    public final C59326i mo56827g() {
        C59326i iVar = this.f157512a;
        if (iVar == null) {
            C59320c cVar = this.f157513b;
            if (cVar.mo56814c()) {
                C58838bb.m90884s(!cVar.mo56815d(), "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr = new char[cVar.f157501b.length];
                int i = 0;
                while (true) {
                    char[] cArr2 = cVar.f157501b;
                    if (i >= cArr2.length) {
                        break;
                    }
                    char c = cArr2[i];
                    if (C58890d.m90991f(c)) {
                        c ^= ' ';
                    }
                    cArr[i] = (char) c;
                    i++;
                }
                C59320c cVar2 = new C59320c(cVar.f157500a.concat(".upperCase()"), cArr);
                cVar = cVar.f157507h ? cVar2.mo56813b() : cVar2;
            }
            if (cVar == this.f157513b) {
                iVar = this;
            } else {
                iVar = mo56822b(cVar, this.f157514c);
            }
            this.f157512a = iVar;
        }
        return iVar;
    }

    public final int hashCode() {
        return this.f157513b.hashCode() ^ Objects.hashCode(this.f157514c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo56834j(Appendable appendable, byte[] bArr, int i, int i2) {
        C58838bb.m90882q(i, i + i2, bArr.length);
        int i3 = 0;
        C58838bb.m90868c(i2 <= this.f157513b.f157505f);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.f157513b.f157503d;
        while (i3 < i2 * 8) {
            C59320c cVar = this.f157513b;
            appendable.append(cVar.f157501b[cVar.f157502c & ((int) (j >>> (i5 - i3)))]);
            i3 += this.f157513b.f157503d;
        }
        if (this.f157514c != null) {
            while (i3 < this.f157513b.f157505f * 8) {
                appendable.append(this.f157514c.charValue());
                i3 += this.f157513b.f157503d;
            }
        }
    }

    /* renamed from: m */
    public final int mo56830m(int i) {
        return (int) (((((long) this.f157513b.f157503d) * ((long) i)) + 7) / 8);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.f157513b);
        if (8 % this.f157513b.f157503d != 0) {
            if (this.f157514c == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.f157514c);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public C59325h(String str, String str2, Character ch) {
        this(new C59320c(str, str2.toCharArray()), ch);
    }

    /* renamed from: h */
    public final CharSequence mo56828h(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.f157514c;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0 || charSequence.charAt(length) != charValue) {
            }
            length--;
            break;
        } while (charSequence.charAt(length) != charValue);
        return charSequence.subSequence(0, length + 1);
    }

    /* renamed from: i */
    public final boolean mo56829i(CharSequence charSequence) {
        charSequence.getClass();
        CharSequence h = mo56828h(charSequence);
        if (!this.f157513b.mo56816e(h.length())) {
            return false;
        }
        for (int i = 0; i < h.length(); i++) {
            C59320c cVar = this.f157513b;
            char charAt = h.charAt(i);
            if (charAt > 127 || cVar.f157506g[charAt] == -1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public int mo56821a(byte[] bArr, CharSequence charSequence) {
        C59320c cVar;
        bArr.getClass();
        CharSequence h = mo56828h(charSequence);
        if (this.f157513b.mo56816e(h.length())) {
            int i = 0;
            int i2 = 0;
            while (i < h.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    cVar = this.f157513b;
                    if (i3 >= cVar.f157504e) {
                        break;
                    }
                    j <<= cVar.f157503d;
                    if (i + i3 < h.length()) {
                        j |= (long) this.f157513b.mo56812a(h.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = cVar.f157505f;
                int i6 = (i5 * 8) - (i4 * cVar.f157503d);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    bArr[i2] = (byte) ((int) ((j >>> i7) & 255));
                    i7 -= 8;
                    i2++;
                }
                i += this.f157513b.f157504e;
            }
            return i2;
        }
        throw new C59323f("Invalid input length " + h.length());
    }
}
