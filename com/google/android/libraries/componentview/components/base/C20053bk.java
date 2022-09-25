package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.libraries.componentview.components.base.p1687a.C19942bp;
import com.google.android.libraries.componentview.components.base.p1687a.C19943bq;
import com.google.android.libraries.componentview.components.base.p1687a.C19959cf;
import com.google.android.libraries.componentview.components.base.p1687a.C19960cg;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20478i;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.base.bk */
/* compiled from: PG */
public class C20053bk extends C20018ao {

    /* renamed from: a */
    private String f56226a;

    /* renamed from: f */
    private C19960cg f56227f;

    public C20053bk(Context context, C56425d dVar, C20537f fVar) {
        super(context, dVar, fVar);
    }

    /* renamed from: q */
    private static final void m37890q(Boolean bool, RelativeLayout.LayoutParams layoutParams, int i) {
        if (bool.booleanValue()) {
            layoutParams.addRule(i, -1);
        }
    }

    /* renamed from: r */
    private static final void m37891r(String str, RelativeLayout.LayoutParams layoutParams, int i) {
        if (!C20482m.m38447o(str)) {
            layoutParams.addRule(i, C20478i.m38430a(str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C19960cg cgVar = this.f56227f;
            if ((cgVar.f55887a & 1) != 0) {
                C19959cf cfVar = (C19959cf) cgVar.toBuilder();
                C19943bq bqVar = this.f56227f.f55888b;
                if (bqVar == null) {
                    bqVar = C19943bq.f55812f;
                }
                C19942bp bpVar = (C19942bp) bqVar.toBuilder();
                bpVar.copyOnWrite();
                C19943bq bqVar2 = (C19943bq) bpVar.instance;
                bqVar2.f55816b = dVar;
                bqVar2.f55815a |= 1;
                cfVar.copyOnWrite();
                C19960cg cgVar2 = (C19960cg) cfVar.instance;
                C19943bq bqVar3 = (C19943bq) bpVar.build();
                bqVar3.getClass();
                cgVar2.f55888b = bqVar3;
                cgVar2.f55887a |= 1;
                this.f56227f = (C19960cg) cfVar.build();
            }
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19960cg.f55885n, this.f56227f);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo25185m(ViewGroup.LayoutParams layoutParams) {
        super.mo25185m(layoutParams);
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            C19960cg cgVar = this.f56227f;
            if (cgVar != null) {
                m37891r(cgVar.f55890d, layoutParams2, 0);
                m37891r(this.f56227f.f55891e, layoutParams2, 1);
                m37891r(this.f56227f.f55892f, layoutParams2, 2);
                m37891r(this.f56227f.f55893g, layoutParams2, 3);
                m37890q(Boolean.valueOf(this.f56227f.f55894h), layoutParams2, 9);
                m37890q(Boolean.valueOf(this.f56227f.f55895i), layoutParams2, 11);
                m37890q(Boolean.valueOf(this.f56227f.f55896j), layoutParams2, 10);
                m37890q(Boolean.valueOf(this.f56227f.f55897k), layoutParams2, 12);
                m37890q(Boolean.valueOf(this.f56227f.f55898l), layoutParams2, 13);
            }
        }
    }

    /* renamed from: n */
    public final void mo25232n() {
        Object obj;
        View kH;
        C56425d dVar = this.f57588z;
        C62940bt r1 = C62942bv.checkIsLite(C19960cg.f55885n);
        dVar.mo58887l(r1);
        Object l = dVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C19960cg cgVar = (C19960cg) obj;
        this.f56227f = cgVar;
        if ((cgVar.f55887a & 1) != 0) {
            C19943bq bqVar = cgVar.f55888b;
            if (bqVar == null) {
                bqVar = C19943bq.f55812f;
            }
            if ((bqVar.f55815a & 1) != 0) {
                C19943bq bqVar2 = this.f56227f.f55888b;
                if (bqVar2 == null) {
                    bqVar2 = C19943bq.f55812f;
                }
                super.mo25195p(bqVar2);
            }
        }
        C19960cg cgVar2 = this.f56227f;
        if ((cgVar2.f55887a & 2) != 0) {
            this.f56226a = cgVar2.f55889c;
            C20470a aVar = this.f57601m;
            if (aVar != null && (kH = aVar.mo25098kH()) != null) {
                kH.setId(C20478i.m38430a(this.f56226a));
            }
        }
    }
}
