package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.componentview.components.base.p1687a.C19942bp;
import com.google.android.libraries.componentview.components.base.p1687a.C19943bq;
import com.google.android.libraries.componentview.components.base.p1687a.C19946bt;
import com.google.android.libraries.componentview.components.base.p1687a.C19947bu;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20478i;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.base.C58837ba;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.base.au */
/* compiled from: PG */
public class C20024au extends C20018ao {

    /* renamed from: a */
    C19947bu f56133a;

    /* renamed from: f */
    private String f56134f;

    public C20024au(Context context, C56425d dVar, C20537f fVar) {
        super(context, dVar, fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C19947bu buVar = this.f56133a;
            if ((buVar.f55835a & 1) != 0) {
                C19946bt btVar = (C19946bt) buVar.toBuilder();
                C19943bq bqVar = this.f56133a.f55836b;
                if (bqVar == null) {
                    bqVar = C19943bq.f55812f;
                }
                C19942bp bpVar = (C19942bp) bqVar.toBuilder();
                bpVar.copyOnWrite();
                C19943bq bqVar2 = (C19943bq) bpVar.instance;
                bqVar2.f55816b = dVar;
                bqVar2.f55815a |= 1;
                btVar.copyOnWrite();
                C19947bu buVar2 = (C19947bu) btVar.instance;
                C19943bq bqVar3 = (C19943bq) bpVar.build();
                bqVar3.getClass();
                buVar2.f55836b = bqVar3;
                buVar2.f55835a |= 1;
                this.f56133a = (C19947bu) btVar.build();
            }
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19947bu.f55833f, this.f56133a);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo25185m(ViewGroup.LayoutParams layoutParams) {
        super.mo25185m(layoutParams);
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            C19947bu buVar = this.f56133a;
            if (buVar != null) {
                float f = buVar.f55837c;
                if (f != 0.0f) {
                    layoutParams2.weight = f;
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo25197n() {
        Object obj;
        View kH;
        C56425d dVar = this.f57588z;
        C62940bt r1 = C62942bv.checkIsLite(C19947bu.f55833f);
        dVar.mo58887l(r1);
        Object l = dVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C19947bu buVar = (C19947bu) obj;
        this.f56133a = buVar;
        if ((buVar.f55835a & 1) != 0) {
            C19943bq bqVar = buVar.f55836b;
            if (bqVar == null) {
                bqVar = C19943bq.f55812f;
            }
            super.mo25195p(bqVar);
        }
        this.f56134f = this.f56133a.f55838d;
        C20470a aVar = this.f57601m;
        if (aVar != null && (kH = aVar.mo25098kH()) != null && !C58837ba.m90859h(this.f56134f)) {
            kH.setId(C20478i.m38430a(this.f56134f));
        }
    }
}
