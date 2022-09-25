package org.p5623b.p5624a;

/* renamed from: org.b.a.bx */
/* compiled from: PG */
public final class C72071bx extends C72113z {

    /* renamed from: c */
    private int f191865c = -1;

    public C72071bx() {
    }

    /* renamed from: i */
    private final int m105502i() {
        int i = this.f191865c;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (C72092e g : this.f191942a) {
            i2 += g.mo63233g().mo63229h().mo63217a();
        }
        this.f191865c = i2;
        return i2;
    }

    /* renamed from: a */
    public final int mo63217a() {
        int i = m105502i();
        return C72090ch.m105544a(i) + 1 + i;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        if (z) {
            sVar.f191935a.write(49);
        }
        C72106s b = sVar.mo63252b();
        int length = this.f191942a.length;
        int i = 0;
        if (this.f191865c >= 0 || length > 16) {
            sVar.mo63304h(m105502i());
            while (i < length) {
                b.mo63254j(this.f191942a[i].mo63233g(), true);
                i++;
            }
            return;
        }
        C72108u[] uVarArr = new C72108u[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C72108u h = this.f191942a[i3].mo63233g().mo63229h();
            uVarArr[i3] = h;
            i2 += h.mo63217a();
        }
        this.f191865c = i2;
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

    public C72071bx(C72093f fVar) {
        super(fVar);
    }

    public C72071bx(boolean z, C72092e[] eVarArr) {
        super(z, eVarArr);
    }
}
