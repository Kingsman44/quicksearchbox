package com.google.android.libraries.componentview.p1697d;

import com.google.android.libraries.componentview.p1675a.p1676a.C19740a;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.d.a */
/* compiled from: PG */
public abstract class C20470a implements C19740a {

    /* renamed from: y */
    public C20470a f57587y;

    /* renamed from: z */
    public final C56425d f57588z;

    public C20470a(C56425d dVar) {
        this.f57588z = dVar;
    }

    /* renamed from: e */
    private final void m38412e(Class cls, C58480gp gpVar) {
        if (this instanceof C20475f) {
            for (C20470a aVar : ((C20475f) this).mo25239kA()) {
                if (cls.isInstance(aVar)) {
                    gpVar.mo55395g((C20470a) cls.cast(aVar));
                }
                aVar.m38412e(cls, gpVar);
            }
        }
    }

    /* renamed from: G */
    public final C20598by mo25418G() {
        C20614e eVar = new C20614e();
        eVar.f57824d = this.f57588z.f150540b;
        C56429h H = mo25419H();
        if (!(H == null || (H.f150549a & 64) == 0)) {
            eVar.f57823c = H.f150556h;
        }
        return eVar;
    }

    /* renamed from: H */
    public final C56429h mo25419H() {
        C56425d dVar = this.f57588z;
        if ((dVar.f150539a & 4) == 0) {
            return null;
        }
        C56429h hVar = dVar.f150542d;
        return hVar == null ? C56429h.f150547k : hVar;
    }

    /* renamed from: I */
    public final String mo25420I() {
        C56425d dVar = this.f57588z;
        if ((dVar.f150539a & 8) != 0) {
            return dVar.f150544f;
        }
        return null;
    }

    /* renamed from: J */
    public final void mo25421J(int i, C20477h hVar) {
        C20470a aVar = this.f57587y;
        if (aVar != null && !aVar.mo25115kC(i, hVar)) {
            this.f57587y.mo25421J(i, hVar);
        }
    }

    /* renamed from: K */
    public final C58485gu mo25422K(Class cls) {
        C58480gp gpVar = new C58480gp(4);
        m38412e(cls, gpVar);
        return gpVar.mo55394f();
    }

    /* renamed from: c */
    public final String mo25097c() {
        C56425d dVar = this.f57588z;
        if ((dVar.f150539a & 8) != 0) {
            return dVar.f150544f;
        }
        C56429h hVar = dVar.f150542d;
        if (hVar == null) {
            hVar = C56429h.f150547k;
        }
        if ((hVar.f150549a & 128) == 0) {
            return null;
        }
        C56429h hVar2 = this.f57588z.f150542d;
        if (hVar2 == null) {
            hVar2 = C56429h.f150547k;
        }
        return hVar2.f150557i;
    }

    /* renamed from: d */
    public final C56425d mo25096d() {
        ArrayList arrayList;
        if (this instanceof C20475f) {
            C20475f fVar = (C20475f) this;
            arrayList = new ArrayList(fVar.mo25239kA().size());
            for (C20470a d : fVar.mo25239kA()) {
                arrayList.add(d.mo25096d());
            }
        } else {
            arrayList = null;
        }
        return mo25132kz(arrayList);
    }

    /* renamed from: kC */
    public boolean mo25115kC(int i, C20477h hVar) {
        return false;
    }

    /* renamed from: kD */
    public abstract void mo25181kD(float f, float f2, float f3, float f4);

    /* renamed from: ky */
    public abstract C20476g mo25200ky();

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public C56425d mo25132kz(List list) {
        return this.f57588z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo25248u(C56425d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo25252z(C56425d dVar) {
    }
}
