package com.p232a.p233a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.a.a.bq */
/* compiled from: PG */
final class C4735bq implements C4699ah {

    /* renamed from: a */
    public final List f14862a;

    /* renamed from: b */
    private float f14863b;

    /* renamed from: c */
    private float f14864c;

    /* renamed from: d */
    private C4736br f14865d = null;

    /* renamed from: e */
    private boolean f14866e = false;

    /* renamed from: f */
    private boolean f14867f = true;

    /* renamed from: g */
    private int f14868g = -1;

    /* renamed from: h */
    private boolean f14869h;

    public C4735bq(C4698ag agVar) {
        ArrayList arrayList = new ArrayList();
        this.f14862a = arrayList;
        if (agVar != null) {
            agVar.mo9597e(this);
            if (this.f14869h) {
                this.f14865d.mo9625a((C4736br) arrayList.get(this.f14868g));
                arrayList.set(this.f14868g, this.f14865d);
                this.f14869h = false;
            }
            C4736br brVar = this.f14865d;
            if (brVar != null) {
                arrayList.add(brVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo9594b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.f14866e = true;
        this.f14867f = false;
        C4736br brVar = this.f14865d;
        C4746ca.m13179c(brVar.f14870a, brVar.f14871b, f, f2, f3, z, z2, f4, f5, this);
        this.f14867f = true;
        this.f14869h = false;
    }

    /* renamed from: c */
    public final void mo9595c() {
        this.f14862a.add(this.f14865d);
        mo9598f(this.f14863b, this.f14864c);
        this.f14869h = true;
    }

    /* renamed from: d */
    public final void mo9596d(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f14867f || this.f14866e) {
            this.f14865d.mo9626b(f, f2);
            this.f14862a.add(this.f14865d);
            this.f14866e = false;
        }
        this.f14865d = new C4736br(f5, f6, f5 - f3, f6 - f4);
        this.f14869h = false;
    }

    /* renamed from: f */
    public final void mo9598f(float f, float f2) {
        this.f14865d.mo9626b(f, f2);
        this.f14862a.add(this.f14865d);
        C4736br brVar = this.f14865d;
        this.f14865d = new C4736br(f, f2, f - brVar.f14870a, f2 - brVar.f14871b);
        this.f14869h = false;
    }

    /* renamed from: g */
    public final void mo9599g(float f, float f2) {
        if (this.f14869h) {
            this.f14865d.mo9625a((C4736br) this.f14862a.get(this.f14868g));
            this.f14862a.set(this.f14868g, this.f14865d);
            this.f14869h = false;
        }
        C4736br brVar = this.f14865d;
        if (brVar != null) {
            this.f14862a.add(brVar);
        }
        this.f14863b = f;
        this.f14864c = f2;
        this.f14865d = new C4736br(f, f2, 0.0f, 0.0f);
        this.f14868g = this.f14862a.size();
    }

    /* renamed from: h */
    public final void mo9600h(float f, float f2, float f3, float f4) {
        this.f14865d.mo9626b(f, f2);
        this.f14862a.add(this.f14865d);
        this.f14865d = new C4736br(f3, f4, f3 - f, f4 - f2);
        this.f14869h = false;
    }
}
