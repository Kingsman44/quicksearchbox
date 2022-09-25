package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.ViewGroup;
import androidx.p180o.p181a.C3907a;
import androidx.p180o.p181a.C3909c;
import com.google.android.libraries.componentview.components.base.p1687a.C19920au;
import com.google.android.libraries.componentview.components.base.p1687a.C19942bp;
import com.google.android.libraries.componentview.components.base.p1687a.C19943bq;
import com.google.android.libraries.componentview.components.base.p1687a.C19955cb;
import com.google.android.libraries.componentview.components.base.p1687a.C19956cc;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.base.be */
/* compiled from: PG */
public class C20047be extends C20018ao {

    /* renamed from: a */
    private C19956cc f56210a;

    public C20047be(Context context, C56425d dVar, C20537f fVar) {
        super(context, dVar, fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C19956cc ccVar = this.f56210a;
            if ((ccVar.f55863a & 1) != 0) {
                C19955cb cbVar = (C19955cb) ccVar.toBuilder();
                C19943bq bqVar = this.f56210a.f55864b;
                if (bqVar == null) {
                    bqVar = C19943bq.f55812f;
                }
                C19942bp bpVar = (C19942bp) bqVar.toBuilder();
                bpVar.copyOnWrite();
                C19943bq bqVar2 = (C19943bq) bpVar.instance;
                bqVar2.f55816b = dVar;
                bqVar2.f55815a |= 1;
                cbVar.copyOnWrite();
                C19956cc ccVar2 = (C19956cc) cbVar.instance;
                C19943bq bqVar3 = (C19943bq) bpVar.build();
                bqVar3.getClass();
                ccVar2.f55864b = bqVar3;
                ccVar2.f55863a |= 1;
                this.f56210a = (C19956cc) cbVar.build();
            }
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19956cc.f55861n, this.f56210a);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo25185m(ViewGroup.LayoutParams layoutParams) {
        super.mo25185m(layoutParams);
        if (layoutParams instanceof C3907a) {
            C3907a aVar = (C3907a) layoutParams;
            C19956cc ccVar = this.f56210a;
            if (ccVar != null) {
                if ((ccVar.f55863a & 2) != 0) {
                    C19920au auVar = ccVar.f55865c;
                    if (auVar == null) {
                        auVar = C19920au.f55724b;
                    }
                    aVar.gravity = C20482m.m38436d(auVar);
                }
                C3909c a = aVar.mo8140a();
                C19956cc ccVar2 = this.f56210a;
                int i = ccVar2.f55863a;
                if ((i & 4) != 0) {
                    a.f12520i = ccVar2.f55866d;
                }
                if ((i & 8) != 0) {
                    a.f12517f = ccVar2.f55867e;
                }
                if ((i & 16) != 0) {
                    a.f12519h = ccVar2.f55868f;
                }
                if ((i & 32) != 0) {
                    a.f12513b = ccVar2.f55869g;
                }
                if ((i & 64) != 0) {
                    a.f12514c = ccVar2.f55870h;
                }
                if ((i & 128) != 0) {
                    a.f12516e = ccVar2.f55871i;
                }
                if ((i & 256) != 0) {
                    a.f12518g = ccVar2.f55872j;
                }
                if ((i & 512) != 0) {
                    a.f12515d = ccVar2.f55873k;
                }
                if ((i & 1024) != 0) {
                    a.f12512a = ccVar2.f55874l;
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo25231n() {
        Object obj;
        C56425d dVar = this.f57588z;
        C62940bt r1 = C62942bv.checkIsLite(C19956cc.f55861n);
        dVar.mo58887l(r1);
        Object l = dVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C19956cc ccVar = (C19956cc) obj;
        this.f56210a = ccVar;
        if ((ccVar.f55863a & 1) != 0) {
            C19943bq bqVar = ccVar.f55864b;
            if (bqVar == null) {
                bqVar = C19943bq.f55812f;
            }
            if ((bqVar.f55815a & 1) != 0) {
                C19943bq bqVar2 = this.f56210a.f55864b;
                if (bqVar2 == null) {
                    bqVar2 = C19943bq.f55812f;
                }
                super.mo25195p(bqVar2);
            }
        }
    }
}
