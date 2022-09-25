package org.p5623b.p5624a;

/* renamed from: org.b.a.bg */
/* compiled from: PG */
public final class C72054bg extends C72110w {

    /* renamed from: b */
    private int f191852b = -1;

    public C72054bg() {
    }

    /* renamed from: l */
    private final int m105442l() {
        int i = this.f191852b;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (C72092e g : this.f191939a) {
            i2 += g.mo63233g().mo63228f().mo63217a();
        }
        this.f191852b = i2;
        return i2;
    }

    /* renamed from: a */
    public final int mo63217a() {
        int l = m105442l();
        return C72090ch.m105544a(l) + 1 + l;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        if (z) {
            sVar.f191935a.write(48);
        }
        C72052be c = sVar.mo63253c();
        int length = this.f191939a.length;
        int i = 0;
        if (this.f191852b >= 0 || length > 16) {
            sVar.mo63304h(m105442l());
            while (i < length) {
                this.f191939a[i].mo63233g().mo63228f().mo63218b(c, true);
                i++;
            }
            return;
        }
        C72108u[] uVarArr = new C72108u[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C72108u f = this.f191939a[i3].mo63233g().mo63228f();
            uVarArr[i3] = f;
            i2 += f.mo63217a();
        }
        this.f191852b = i2;
        sVar.mo63304h(i2);
        while (i < length) {
            uVarArr[i].mo63218b(c, true);
            i++;
        }
    }

    /* renamed from: f */
    public final C72108u mo63228f() {
        return this;
    }

    /* renamed from: h */
    public final C72108u mo63229h() {
        return this;
    }

    public C72054bg(C72093f fVar) {
        super(fVar);
    }

    public C72054bg(C72092e[] eVarArr) {
        super(eVarArr);
    }

    public C72054bg(C72092e[] eVarArr, byte[] bArr) {
        super(eVarArr, (byte[]) null);
    }
}
