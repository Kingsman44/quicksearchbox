package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.ViewGroup;
import androidx.core.p098j.C2104s;
import com.google.android.libraries.componentview.components.base.p1687a.C19942bp;
import com.google.android.libraries.componentview.components.base.p1687a.C19943bq;
import com.google.android.libraries.componentview.components.base.p1687a.C19945bs;
import com.google.android.libraries.componentview.components.base.p1687a.C20003z;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1697d.C20483n;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;

/* renamed from: com.google.android.libraries.componentview.components.base.ao */
/* compiled from: PG */
public class C20018ao extends C20483n {

    /* renamed from: b */
    protected final Context f56114b;

    /* renamed from: c */
    protected final C20537f f56115c;

    /* renamed from: d */
    protected C56425d f56116d;

    /* renamed from: e */
    public C19943bq f56117e;

    public C20018ao(Context context, C56425d dVar, C20537f fVar) {
        super(dVar);
        this.f56114b = context;
        this.f56115c = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C19942bp bpVar = (C19942bp) this.f56117e.toBuilder();
            bpVar.copyOnWrite();
            C19943bq bqVar = (C19943bq) bpVar.instance;
            bqVar.f55816b = dVar;
            bqVar.f55815a |= 1;
            this.f56117e = (C19943bq) bpVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19943bq.f55813g, this.f56117e);
        return (C56425d) cVar.build();
    }

    /* renamed from: kx */
    public final void mo25108kx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo25185m(ViewGroup.LayoutParams layoutParams) {
        float f;
        int i;
        int i2;
        int i3;
        float f2;
        C19943bq bqVar = this.f56117e;
        if (bqVar != null) {
            if ((bqVar.f55815a & 4) != 0) {
                Context context = this.f56114b;
                C20003z zVar = bqVar.f55818d;
                if (zVar == null) {
                    zVar = C20003z.f56045c;
                }
                layoutParams.width = C20482m.m38435c(context, zVar);
            }
            C19943bq bqVar2 = this.f56117e;
            if ((bqVar2.f55815a & 2) != 0) {
                Context context2 = this.f56114b;
                C20003z zVar2 = bqVar2.f55817c;
                if (zVar2 == null) {
                    zVar2 = C20003z.f56045c;
                }
                layoutParams.height = C20482m.m38435c(context2, zVar2);
            }
            C19943bq bqVar3 = this.f56117e;
            if ((bqVar3.f55815a & 8) != 0) {
                C19945bs bsVar = bqVar3.f55819e;
                if (bsVar == null) {
                    bsVar = C19945bs.f55821j;
                }
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i4 = bsVar.f55823a;
                    if ((i4 & 16) == 0 && (i4 & 32) == 0 && (i4 & 64) == 0 && (i4 & 128) == 0) {
                        i3 = (int) (C20482m.m38433a(this.f56114b) * ((float) bsVar.f55824b));
                        i2 = (int) (C20482m.m38433a(this.f56114b) * ((float) bsVar.f55825c));
                        i = (int) (C20482m.m38433a(this.f56114b) * ((float) bsVar.f55826d));
                        Context context3 = this.f56114b;
                        int i5 = bsVar.f55827e;
                        f = C20482m.m38433a(context3);
                        f2 = (float) i5;
                    } else {
                        Context context4 = this.f56114b;
                        i3 = (int) (C20482m.m38433a(context4) * bsVar.f55828f);
                        Context context5 = this.f56114b;
                        i2 = (int) (C20482m.m38433a(context5) * bsVar.f55829g);
                        Context context6 = this.f56114b;
                        i = (int) (C20482m.m38433a(context6) * bsVar.f55830h);
                        Context context7 = this.f56114b;
                        f2 = bsVar.f55831i;
                        f = C20482m.m38433a(context7);
                    }
                    marginLayoutParams.setMargins(i3, i2, i, (int) (f * f2));
                    C2104s.m5794g(marginLayoutParams, i3);
                    C2104s.m5793f(marginLayoutParams, i);
                    return;
                }
                C20520h.m38497b(6, "LayoutParamsComponent", (Throwable) null, "Trying to set margin for a ViewGroup which does not support margin.", new Object[0]);
            }
        }
    }

    /* renamed from: o */
    public final void mo25194o(ViewGroup.LayoutParams layoutParams) {
        C20470a aVar = this.f57601m;
        if (aVar != null) {
            int i = C20075cf.f56301t;
            while ((aVar instanceof C20483n) && !(aVar instanceof C20018ao)) {
                aVar = ((C20483n) aVar).f57601m;
            }
            if (aVar instanceof C20018ao) {
                ((C20018ao) aVar).mo25194o(layoutParams);
            }
        }
        mo25185m(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo25195p(C19943bq bqVar) {
        this.f56117e = bqVar;
        if ((bqVar.f55815a & 1) != 0) {
            C56425d dVar = bqVar.f55816b;
            if (dVar == null) {
                dVar = C56425d.f150537g;
            }
            this.f56116d = dVar;
            this.f57601m = this.f56115c.mo25450a(this, dVar);
        }
    }
}
