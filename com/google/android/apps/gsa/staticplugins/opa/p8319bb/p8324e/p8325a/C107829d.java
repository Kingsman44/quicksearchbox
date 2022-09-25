package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a;

import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107476b;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107478d;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107944s;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.d */
/* compiled from: PG */
public final class C107829d implements C107839n {

    /* renamed from: a */
    public boolean f300055a;

    /* renamed from: b */
    public final C68214a f300056b;

    /* renamed from: c */
    public final C68214a f300057c;

    /* renamed from: d */
    public final C68214a f300058d;

    public C107829d(C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f300056b = aVar;
        this.f300057c = aVar2;
        this.f300058d = aVar3;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final void mo96297b(C107504e eVar, C58833ax axVar, C107944s sVar) {
        Object obj;
        C107502c a = C107502c.m178394a(eVar.f299118b);
        if (a == null) {
            a = C107502c.UNDEFINED;
        }
        if (a == C107502c.OPA_CHARGING_AMBIENT_STATE) {
            C62940bt r2 = C62942bv.checkIsLite(C107476b.f299061a);
            eVar.mo58887l(r2);
            if (eVar.f169962ag.mo58857o(r2.f169971d)) {
                C62940bt r22 = C62942bv.checkIsLite(C107476b.f299061a);
                eVar.mo58887l(r22);
                Object l = eVar.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                this.f300055a = ((C107478d) obj).f299065b;
                C58976aa aaVar = C58975e.f156826a;
            }
        }
    }
}
