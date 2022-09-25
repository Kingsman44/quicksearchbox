package com.google.ads.interactivemedia.p367v3.internal;

import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.mr */
/* compiled from: PG */
final class C7127mr {

    /* renamed from: a */
    public final C7073kr f22951a;

    /* renamed from: b */
    public final C7140nd f22952b = new C7140nd();

    /* renamed from: c */
    public final aee f22953c = new aee();

    /* renamed from: d */
    public C7141ne f22954d;

    /* renamed from: e */
    public C7122mm f22955e;

    /* renamed from: f */
    public int f22956f;

    /* renamed from: g */
    public int f22957g;

    /* renamed from: h */
    public int f22958h;

    /* renamed from: i */
    public int f22959i;

    /* renamed from: j */
    private final aee f22960j = new aee(1);

    /* renamed from: k */
    private final aee f22961k = new aee();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f22962l;

    public C7127mr(C7073kr krVar, C7141ne neVar, C7122mm mmVar) {
        this.f22951a = krVar;
        this.f22954d = neVar;
        this.f22955e = mmVar;
        mo16176a(neVar, mmVar);
    }

    /* renamed from: a */
    public final void mo16176a(C7141ne neVar, C7122mm mmVar) {
        this.f22954d = neVar;
        this.f22955e = mmVar;
        this.f22951a.mo16102a(neVar.f23068a.f23038f);
        mo16177b();
    }

    /* renamed from: b */
    public final void mo16177b() {
        C7140nd ndVar = this.f22952b;
        ndVar.f23053e = 0;
        ndVar.f23066r = 0;
        ndVar.f23067s = false;
        ndVar.f23061m = false;
        ndVar.f23065q = false;
        ndVar.f23063o = null;
        this.f22956f = 0;
        this.f22958h = 0;
        this.f22957g = 0;
        this.f22959i = 0;
        this.f22962l = false;
    }

    /* renamed from: c */
    public final long mo16178c() {
        if (!this.f22962l) {
            return this.f22954d.f23073f[this.f22956f];
        }
        return this.f22952b.mo16189b(this.f22956f);
    }

    /* renamed from: d */
    public final long mo16179d() {
        if (!this.f22962l) {
            return this.f22954d.f23070c[this.f22956f];
        }
        return this.f22952b.f23055g[this.f22958h];
    }

    /* renamed from: e */
    public final int mo16180e() {
        if (!this.f22962l) {
            return this.f22954d.f23071d[this.f22956f];
        }
        return this.f22952b.f23057i[this.f22956f];
    }

    /* renamed from: f */
    public final int mo16181f() {
        int i;
        if (!this.f22962l) {
            i = this.f22954d.f23074g[this.f22956f];
        } else {
            i = this.f22952b.f23060l[this.f22956f] ? 1 : 0;
        }
        return mo16184i() != null ? i | 1073741824 : i;
    }

    /* renamed from: g */
    public final boolean mo16182g() {
        this.f22956f++;
        if (!this.f22962l) {
            return false;
        }
        int i = this.f22957g + 1;
        this.f22957g = i;
        int[] iArr = this.f22952b.f23056h;
        int i2 = this.f22958h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f22958h = i2 + 1;
        this.f22957g = 0;
        return false;
    }

    /* renamed from: h */
    public final int mo16183h(int i, int i2) {
        aee aee;
        boolean z;
        C7139nc i3 = mo16184i();
        if (i3 == null) {
            return 0;
        }
        int i4 = i3.f23047d;
        if (i4 != 0) {
            aee = this.f22952b.f23064p;
        } else {
            byte[] bArr = (byte[]) aeu.m18536f(i3.f23048e);
            aee aee2 = this.f22961k;
            int length = bArr.length;
            aee2.mo14549c(bArr, length);
            aee = this.f22961k;
            i4 = length;
        }
        boolean c = this.f22952b.mo16190c(this.f22956f);
        if (c || i2 != 0) {
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        this.f22960j.mo14555i()[0] = (byte) ((true != z ? 0 : 128) | i4);
        this.f22960j.mo14554h(0);
        this.f22951a.mo16107f(this.f22960j, 1);
        this.f22951a.mo16107f(aee, i4);
        if (!z) {
            return i4 + 1;
        }
        if (!c) {
            this.f22953c.mo14547a(8);
            byte[] i5 = this.f22953c.mo14555i();
            i5[0] = 0;
            i5[1] = 1;
            i5[2] = 0;
            i5[3] = (byte) i2;
            i5[4] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
            i5[5] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
            i5[6] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
            i5[7] = (byte) (i & PrivateKeyType.INVALID);
            this.f22951a.mo16107f(this.f22953c, 8);
            return i4 + 9;
        }
        aee aee3 = this.f22952b.f23064p;
        int o = aee3.mo14561o();
        aee3.mo14557k(-2);
        int i6 = (o * 6) + 2;
        if (i2 != 0) {
            this.f22953c.mo14547a(i6);
            byte[] i7 = this.f22953c.mo14555i();
            aee3.mo14559m(i7, 0, i6);
            int i8 = (((i7[2] & 255) << 8) | (i7[3] & 255)) + i2;
            i7[2] = (byte) ((i8 >> 8) & PrivateKeyType.INVALID);
            i7[3] = (byte) (i8 & PrivateKeyType.INVALID);
            aee3 = this.f22953c;
        }
        this.f22951a.mo16107f(aee3, i6);
        return i4 + 1 + i6;
    }

    /* renamed from: i */
    public final C7139nc mo16184i() {
        if (!this.f22962l) {
            return null;
        }
        C7140nd ndVar = this.f22952b;
        C7122mm mmVar = ndVar.f23049a;
        int i = aeu.f20466a;
        int i2 = mmVar.f22937a;
        C7139nc ncVar = ndVar.f23063o;
        if (ncVar == null) {
            ncVar = this.f22954d.f23068a.mo16187a(i2);
        }
        if (ncVar == null || !ncVar.f23044a) {
            return null;
        }
        return ncVar;
    }
}
