package org.p5623b.p5624a;

/* renamed from: org.b.a.bv */
/* compiled from: PG */
public final class C72069bv extends C72110w {

    /* renamed from: b */
    private int f191864b = -1;

    public C72069bv() {
    }

    /* renamed from: l */
    private final int m105498l() {
        int i = this.f191864b;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (C72092e g : this.f191939a) {
            i2 += g.mo63233g().mo63229h().mo63217a();
        }
        this.f191864b = i2;
        return i2;
    }

    /* renamed from: a */
    public final int mo63217a() {
        int l = m105498l();
        return C72090ch.m105544a(l) + 1 + l;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        if (z) {
            sVar.f191935a.write(48);
        }
        C72106s b = sVar.mo63252b();
        int length = this.f191939a.length;
        int i = 0;
        if (this.f191864b >= 0 || length > 16) {
            sVar.mo63304h(m105498l());
            while (i < length) {
                b.mo63254j(this.f191939a[i].mo63233g(), true);
                i++;
            }
            return;
        }
        C72108u[] uVarArr = new C72108u[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C72108u h = this.f191939a[i3].mo63233g().mo63229h();
            uVarArr[i3] = h;
            i2 += h.mo63217a();
        }
        this.f191864b = i2;
        sVar.mo63304h(i2);
        while (i < length) {
            b.mo63254j(uVarArr[i], true);
            i++;
        }
    }

    /* renamed from: h */
    public final C72108u mo63229h() {
        return this;
    }

    public C72069bv(C72093f fVar) {
        super(fVar);
    }

    public C72069bv(C72092e[] eVarArr) {
        super(eVarArr, (byte[]) null);
    }
}
