package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import com.google.android.apps.gsa.p6486s.C84273m;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109457c;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.z */
/* compiled from: PG */
final class C107922z implements C84273m {

    /* renamed from: a */
    final /* synthetic */ C107849aa f300275a;

    public C107922z(C107849aa aaVar) {
        this.f300275a = aaVar;
    }

    /* renamed from: a */
    public final void mo77783a(C52176ia iaVar) {
    }

    /* renamed from: b */
    public final void mo77784b(C84275o oVar) {
        new C90873ag(this.f300275a.f300102b.mo78523a(), this.f300275a.f300103c, "onPlaybackStateChanged", C107918v.f300269a).mo85223a(C107919w.f300270a);
        new C90873ag(((C84274n) this.f300275a.f300106f.mo27525b()).mo77786b(), this.f300275a.f300103c, "playback-state-changed", new C107920x(this, oVar)).mo85223a(new C107921y(this, oVar));
        this.f300275a.f300111k.mo83075c(oVar.mo77796b());
        C107849aa aaVar = this.f300275a;
        int i = aaVar.f300113m;
        boolean z = true;
        if (i == 1) {
            if (oVar.mo77797c() == 3 || oVar.mo77797c() == 6) {
                aaVar.f300113m = 3;
            } else if (oVar.mo77797c() == 2) {
                aaVar.f300113m = 2;
            }
        } else if (i == 2) {
            if (oVar.mo77797c() == 3) {
                aaVar.f300113m = 3;
            } else if (oVar.mo77797c() == 1) {
                aaVar.f300113m = 1;
            } else if (oVar.mo77797c() == 10) {
                aaVar.mo96311e();
            } else if (oVar.mo77797c() == 9) {
                aaVar.mo96312f();
            }
        } else if (i == 3) {
            if (oVar.mo77797c() == 2) {
                aaVar.f300113m = 2;
                C52176ia iaVar = aaVar.f300109i;
                iaVar.getClass();
                ((C107852ad) aaVar.f300104d.mo27525b()).mo96320e(C109457c.m182152a(iaVar.f136917e, 4));
            } else if (oVar.mo77797c() == 1) {
                aaVar.f300113m = 1;
            } else if (oVar.mo77797c() == 10) {
                aaVar.mo96311e();
            } else if (oVar.mo77797c() == 9) {
                aaVar.mo96312f();
            }
        }
        if (!oVar.mo77803i().mo56113h() || ((Integer) oVar.mo77803i().mo56107c()).intValue() != 11) {
            z = false;
        }
        if (oVar.mo77810p() && !z) {
            C58976aa aaVar2 = C58975e.f156826a;
            C52176ia iaVar2 = this.f300275a.f300109i;
            iaVar2.getClass();
            ((C107852ad) this.f300275a.f300104d.mo27525b()).mo96320e(C109457c.m182152a(iaVar2.f136917e, 6));
        }
    }
}
