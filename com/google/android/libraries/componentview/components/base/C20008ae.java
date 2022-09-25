package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.componentview.components.base.p1687a.C19920au;
import com.google.android.libraries.componentview.components.base.p1687a.C19928bb;
import com.google.android.libraries.componentview.components.base.p1687a.C19929bc;
import com.google.android.libraries.componentview.components.base.p1687a.C19942bp;
import com.google.android.libraries.componentview.components.base.p1687a.C19943bq;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.base.ae */
/* compiled from: PG */
public class C20008ae extends C20018ao {

    /* renamed from: a */
    C19929bc f56062a;

    public C20008ae(Context context, C56425d dVar, C20537f fVar) {
        super(context, dVar, fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C19929bc bcVar = this.f56062a;
            if ((bcVar.f55768a & 1) != 0) {
                C19928bb bbVar = (C19928bb) bcVar.toBuilder();
                C19943bq bqVar = this.f56062a.f55769b;
                if (bqVar == null) {
                    bqVar = C19943bq.f55812f;
                }
                C19942bp bpVar = (C19942bp) bqVar.toBuilder();
                bpVar.copyOnWrite();
                C19943bq bqVar2 = (C19943bq) bpVar.instance;
                bqVar2.f55816b = dVar;
                bqVar2.f55815a |= 1;
                bbVar.copyOnWrite();
                C19929bc bcVar2 = (C19929bc) bbVar.instance;
                C19943bq bqVar3 = (C19943bq) bpVar.build();
                bqVar3.getClass();
                bcVar2.f55769b = bqVar3;
                bcVar2.f55768a |= 1;
                this.f56062a = (C19929bc) bbVar.build();
            }
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19929bc.f55766e, this.f56062a);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo25185m(ViewGroup.LayoutParams layoutParams) {
        super.mo25185m(layoutParams);
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            C19929bc bcVar = this.f56062a;
            if (bcVar != null && (bcVar.f55768a & 2) != 0) {
                C19920au auVar = bcVar.f55770c;
                if (auVar == null) {
                    auVar = C19920au.f55724b;
                }
                layoutParams2.gravity = C20482m.m38436d(auVar);
            }
        }
    }

    /* renamed from: n */
    public final void mo25186n() {
        Object obj;
        C56425d dVar = this.f57588z;
        C62940bt r1 = C62942bv.checkIsLite(C19929bc.f55766e);
        dVar.mo58887l(r1);
        Object l = dVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C19929bc bcVar = (C19929bc) obj;
        this.f56062a = bcVar;
        if ((bcVar.f55768a & 1) != 0) {
            C19943bq bqVar = bcVar.f55769b;
            if (bqVar == null) {
                bqVar = C19943bq.f55812f;
            }
            super.mo25195p(bqVar);
        }
    }
}
