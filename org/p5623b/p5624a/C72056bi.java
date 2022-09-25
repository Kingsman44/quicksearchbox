package org.p5623b.p5624a;

/* renamed from: org.b.a.bi */
/* compiled from: PG */
public final class C72056bi extends C72113z {

    /* renamed from: c */
    private int f191854c = -1;

    public C72056bi() {
    }

    /* renamed from: i */
    private final int m105449i() {
        int i = this.f191854c;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (C72092e g : this.f191942a) {
            i2 += g.mo63233g().mo63228f().mo63217a();
        }
        this.f191854c = i2;
        return i2;
    }

    /* renamed from: a */
    public final int mo63217a() {
        int i = m105449i();
        return C72090ch.m105544a(i) + 1 + i;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        if (z) {
            sVar.f191935a.write(49);
        }
        C72052be c = sVar.mo63253c();
        int length = this.f191942a.length;
        int i = 0;
        if (this.f191854c >= 0 || length > 16) {
            sVar.mo63304h(m105449i());
            while (i < length) {
                this.f191942a[i].mo63233g().mo63228f().mo63218b(c, true);
                i++;
            }
            return;
        }
        C72108u[] uVarArr = new C72108u[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C72108u f = this.f191942a[i3].mo63233g().mo63228f();
            uVarArr[i3] = f;
            i2 += f.mo63217a();
        }
        this.f191854c = i2;
        sVar.mo63304h(i2);
        while (i < length) {
            uVarArr[i].mo63218b(c, true);
            i++;
        }
    }

    /* renamed from: f */
    public final C72108u mo63228f() {
        return this.f191943b ? this : super.mo63228f();
    }

    /* renamed from: h */
    public final C72108u mo63229h() {
        return this;
    }

    public C72056bi(C72092e[] eVarArr) {
        super(true, eVarArr);
    }
}
