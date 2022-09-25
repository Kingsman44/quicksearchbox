package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a;

import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107463ab;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107466ae;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107467af;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107944s;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.r */
/* compiled from: PG */
public final class C107843r implements C107839n {

    /* renamed from: a */
    private static final C59071e f300087a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.a.r");

    /* renamed from: b */
    private final C68214a f300088b;

    public C107843r(C68214a aVar) {
        this.f300088b = aVar;
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
        if (a == C107502c.OPA_UI_RENDERING_STATUS) {
            C62940bt r4 = C62942bv.checkIsLite(C107463ab.f299041a);
            eVar.mo58887l(r4);
            if (eVar.f169962ag.mo58857o(r4.f169971d)) {
                C58976aa aaVar = C58975e.f156826a;
                C62940bt r42 = C62942bv.checkIsLite(C107463ab.f299041a);
                eVar.mo58887l(r42);
                Object l = eVar.f169962ag.mo58854l(r42.f169971d);
                if (l == null) {
                    obj = r42.f169969b;
                } else {
                    obj = r42.mo58889c(l);
                }
                int a2 = C107466ae.m178389a(((C107467af) obj).f299046b);
                if (a2 == 0) {
                    a2 = 1;
                }
                C59104x b = f300087a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "OpaUiStatusSubCtrl");
                ((C59052c) ((C59052c) b).mo56372aa(26305)).mo56387q("Update UI rendering status to %d", a2 - 1);
                if (a2 == 2) {
                    ((C108100a) this.f300088b.mo27525b()).f300688b = 1;
                } else if (a2 == 3) {
                    ((C108100a) this.f300088b.mo27525b()).f300688b = 2;
                } else {
                    ((C108100a) this.f300088b.mo27525b()).f300688b = 0;
                }
            }
        }
    }
}
