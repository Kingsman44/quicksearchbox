package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a;

import com.google.android.apps.gsa.p5836c.C74453e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107461a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107480f;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107944s;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107733l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.b */
/* compiled from: PG */
public final class C107827b implements C107839n {

    /* renamed from: a */
    public final C107733l f300052a;

    /* renamed from: b */
    public final C74453e f300053b;

    /* renamed from: c */
    private final C22871g f300054c;

    public C107827b(C107733l lVar, C74453e eVar, C22871g gVar) {
        this.f300052a = lVar;
        this.f300053b = eVar;
        this.f300054c = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final void mo96297b(C107504e eVar, C58833ax axVar, C107944s sVar) {
        Object obj;
        C58976aa aaVar = C58975e.f156826a;
        C107502c a = C107502c.m178394a(eVar.f299118b);
        if (a == null) {
            a = C107502c.UNDEFINED;
        }
        if (a == C107502c.OPA_AUDIO_SESSION_EVENT) {
            C62940bt r4 = C62942bv.checkIsLite(C107461a.f299030a);
            eVar.mo58887l(r4);
            if (eVar.f169962ag.mo58857o(r4.f169971d)) {
                C62940bt r42 = C62942bv.checkIsLite(C107461a.f299030a);
                eVar.mo58887l(r42);
                Object l = eVar.f169962ag.mo58854l(r42.f169971d);
                if (l == null) {
                    obj = r42.f169969b;
                } else {
                    obj = r42.mo58889c(l);
                }
                this.f300054c.mo28213m("Close the mic opened early on long press home", 5000, new C107803a(this, (C107480f) obj));
            }
        }
    }
}
