package com.google.research.p5181a.p5186d;

import com.google.common.p4535g.C59203do;
import com.google.research.p5181a.p5182a.C66278a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.research.a.d.l */
/* compiled from: PG */
public class C66340l extends C66333e {

    /* renamed from: m */
    int f180389m;

    /* renamed from: n */
    public boolean f180390n;

    /* renamed from: o */
    public C66343o f180391o;

    /* renamed from: p */
    public C66343o f180392p;

    /* renamed from: q */
    public C66343o f180393q;

    /* renamed from: r */
    public C66343o f180394r;

    /* renamed from: s */
    public C66343o f180395s;

    /* renamed from: t */
    public C66343o f180396t;

    /* renamed from: u */
    public int f180397u;

    /* renamed from: v */
    private int f180398v;

    /* renamed from: w */
    private float f180399w;

    public C66340l() {
    }

    public C66340l(int i, int i2, int i3, float f) {
        super(i2, i3);
        this.f180397u = -1;
        this.f180399w = f;
        this.f180395s = new C66343o(1, i3);
        this.f180389m = i;
        this.f180393q = new C66343o(i2, i3);
        this.f180394r = new C66343o(i3, i3);
        this.f180396t = new C66343o(1, i3);
        this.f180390n = false;
        C66343o oVar = new C66343o(i2, i3);
        this.f180391o = oVar;
        C66349u.m97073a(oVar);
        Arrays.fill(this.f180395s.f180409c, C59203do.f157270a);
        this.f180398v = -1;
        C66343o oVar2 = new C66343o(i3, i3);
        this.f180392p = oVar2;
        C66349u.m97073a(oVar2);
    }

    /* renamed from: r */
    private final void m97028r(DataInputStream dataInputStream) {
        this.f180389m = dataInputStream.readInt();
        this.f180390n = dataInputStream.readBoolean();
        C66343o oVar = new C66343o();
        this.f180392p = oVar;
        oVar.mo59556f(dataInputStream, -1);
        C66343o oVar2 = new C66343o();
        this.f180395s = oVar2;
        oVar2.mo59556f(dataInputStream, -1);
        int readInt = dataInputStream.readInt();
        this.f180397u = readInt;
        if (readInt < 0) {
            C66343o oVar3 = new C66343o();
            this.f180391o = oVar3;
            oVar3.mo59556f(dataInputStream, this.f180368i);
        }
        this.f180393q = new C66343o(this.f180368i, this.f180369j);
        int i = this.f180369j;
        this.f180394r = new C66343o(i, i);
        this.f180396t = new C66343o(1, this.f180369j);
        this.f180398v = dataInputStream.readInt();
        mo59540h(dataInputStream);
    }

    /* renamed from: b */
    public String mo59533b() {
        return "LinearLayer";
    }

    /* renamed from: c */
    public final void mo59534c(C66344p pVar, int i, C66343o oVar, C66343o oVar2, C66343o oVar3) {
        C66343o.m97044i(oVar, oVar2, this.f180364e);
        mo59548p(this.f180389m, this.f180364e, (C66343o) this.f180361b.mo59448a(i), oVar3);
        C66343o.m97045j(this.f180364e, mo59547o(pVar), !this.f180390n, this.f180365f);
        if (this.f180371l) {
            C66343o.m97045j(this.f180364e, this.f180392p, true, this.f180366g);
        }
        ArrayList[] arrayListArr = (ArrayList[]) this.f180363d.mo59448a(i);
        C66348t.m97072b();
        C66348t.m97071a(this.f180370k * this.f180369j, new C66334f(this, (C66343o) this.f180362c.mo59448a(i), (C66343o) this.f180361b.mo59448a(i - 1)));
    }

    /* renamed from: e */
    public final void mo59537e() {
        super.mo59537e();
        Arrays.fill(this.f180393q.f180409c, C59203do.f157270a);
        Arrays.fill(this.f180394r.f180409c, C59203do.f157270a);
        Arrays.fill(this.f180396t.f180409c, C59203do.f157270a);
    }

    /* renamed from: f */
    public final void mo59538f() {
        C66348t.m97072b();
        C66348t.m97071a(this.f180369j, new C66336h(this));
    }

    /* renamed from: g */
    public final C66343o mo59539g(boolean z, C66344p pVar, C66343o oVar) {
        C66343o oVar2 = oVar;
        int i = 0;
        this.f180367h = false;
        this.f180362c.mo59452e(oVar2);
        int i2 = oVar2.f180408b;
        int i3 = this.f180368i;
        if (i2 == i3 && oVar2.f180407a == this.f180370k) {
            C66278a aVar = this.f180361b;
            C66343o oVar3 = aVar.f180249c.length > 1 ? (C66343o) aVar.mo59449b() : null;
            C66343o oVar4 = new C66343o(this.f180370k, this.f180369j);
            C66348t.m97072b();
            C66348t.m97071a(this.f180370k * this.f180369j, new C66337i(this, pVar, oVar, oVar3, oVar4));
            C66278a aVar2 = this.f180361b;
            C66343o oVar5 = new C66343o(this.f180370k, this.f180369j);
            aVar2.mo59452e(oVar5);
            int i4 = this.f180389m;
            if (i4 == 1 || i4 == 0) {
                C66348t.m97072b();
                C66348t.m97071a(oVar4.f180409c.length, new C66338j(i4, oVar5, oVar4));
            } else if (i4 == 2) {
                C66348t.m97072b();
                C66348t.m97071a(oVar4.f180407a, new C66339k(oVar4, oVar5));
            } else {
                throw new RuntimeException("Unsupported activation function: " + i4);
            }
            if (this.f180399w > 0.0f) {
                if (!z) {
                    while (true) {
                        double[] dArr = oVar5.f180409c;
                        if (i >= dArr.length) {
                            break;
                        }
                        double d = dArr[i];
                        double d2 = (double) (1.0f - this.f180399w);
                        Double.isNaN(d2);
                        dArr[i] = d * d2;
                        i++;
                    }
                } else {
                    while (i < oVar5.f180409c.length) {
                        if (Math.random() < ((double) this.f180399w)) {
                            oVar5.f180409c[i] = 0.0d;
                        }
                        i++;
                    }
                }
            }
            return oVar5;
        }
        throw new RuntimeException(String.format("Inconsistent input, input size: %d, expected input size: %d, row size: %d, expected row size: %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(oVar2.f180407a), Integer.valueOf(this.f180370k)}));
    }

    /* renamed from: j */
    public void mo59542j(DataInputStream dataInputStream) {
        super.mo59544l(dataInputStream, -1);
        m97028r(dataInputStream);
    }

    /* renamed from: k */
    public final void mo59543k(DataInputStream dataInputStream, int i) {
        super.mo59544l(dataInputStream, i);
        m97028r(dataInputStream);
    }

    /* renamed from: m */
    public void mo59545m(DataOutputStream dataOutputStream) {
        super.mo59545m(dataOutputStream);
        dataOutputStream.writeInt(this.f180389m);
        dataOutputStream.writeBoolean(this.f180390n);
        this.f180392p.mo59558h(dataOutputStream);
        this.f180395s.mo59558h(dataOutputStream);
        dataOutputStream.writeInt(this.f180397u);
        if (this.f180397u < 0) {
            this.f180391o.mo59558h(dataOutputStream);
        }
        dataOutputStream.writeInt(this.f180398v);
        dataOutputStream.writeUTF(mo59533b());
    }

    /* renamed from: n */
    public C66340l clone() {
        C66340l lVar = new C66340l();
        super.mo59541i(lVar);
        lVar.f180390n = this.f180390n;
        lVar.f180389m = this.f180389m;
        lVar.f180391o = this.f180391o.clone();
        lVar.f180393q = this.f180393q.clone();
        lVar.f180392p = this.f180392p.clone();
        lVar.f180394r = this.f180394r.clone();
        lVar.f180395s = this.f180395s.clone();
        lVar.f180396t = this.f180396t.clone();
        lVar.f180397u = this.f180397u;
        lVar.f180398v = this.f180398v;
        return lVar;
    }

    /* renamed from: o */
    public final C66343o mo59547o(C66344p pVar) {
        int i = this.f180397u;
        return i >= 0 ? ((C66340l) pVar.f180412c.get(i)).f180391o : this.f180391o;
    }

    /* renamed from: p */
    public void mo59548p(int i, C66343o oVar, C66343o oVar2, C66343o oVar3) {
        C66348t.m97072b();
        C66348t.m97071a(oVar.f180409c.length, new C66335g(i, oVar2, oVar));
    }

    /* renamed from: q */
    public final void mo59549q(C66340l lVar) {
        super.mo59541i(lVar);
        lVar.f180390n = this.f180390n;
        lVar.f180389m = this.f180389m;
        lVar.f180391o = this.f180391o.clone();
        lVar.f180393q = this.f180393q.clone();
        lVar.f180392p = this.f180392p.clone();
        lVar.f180394r = this.f180394r.clone();
        lVar.f180395s = this.f180395s.clone();
        lVar.f180396t = this.f180396t.clone();
        lVar.f180397u = this.f180397u;
        lVar.f180398v = this.f180398v;
    }
}
