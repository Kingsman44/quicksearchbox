package com.google.research.p5181a.p5186d;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* renamed from: com.google.research.a.d.r */
/* compiled from: PG */
public final class C66346r extends C66340l {

    /* renamed from: v */
    public int f180418v = 0;

    public C66346r() {
    }

    public C66346r(int i, int i2) {
        super(2, i, i2, 0.0f);
    }

    /* renamed from: b */
    public final String mo59533b() {
        return "OutputLayer";
    }

    /* renamed from: j */
    public final void mo59542j(DataInputStream dataInputStream) {
        super.mo59542j(dataInputStream);
        this.f180418v = dataInputStream.readInt();
        mo59540h(dataInputStream);
    }

    /* renamed from: m */
    public final void mo59545m(DataOutputStream dataOutputStream) {
        super.mo59545m(dataOutputStream);
        dataOutputStream.writeInt(this.f180418v);
        dataOutputStream.writeUTF("OutputLayer");
    }

    /* renamed from: p */
    public final void mo59548p(int i, C66343o oVar, C66343o oVar2, C66343o oVar3) {
        C66348t.m97072b();
        C66348t.m97071a(oVar.f180409c.length, new C66345q(this, i, oVar, oVar2, oVar3));
    }

    /* renamed from: r */
    public final C66346r mo59546n() {
        C66346r rVar = new C66346r();
        super.mo59549q(rVar);
        rVar.f180418v = this.f180418v;
        return rVar;
    }
}
