package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107488n;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107490p;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107491q;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107494t;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107944s;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d.C107775ak;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.f */
/* compiled from: PG */
public final class C107831f implements C107839n {

    /* renamed from: a */
    private static final C59071e f300059a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.a.f");

    /* renamed from: b */
    private final C107775ak f300060b;

    public C107831f(C107775ak akVar) {
        this.f300060b = akVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final void mo96297b(C107504e eVar, C58833ax axVar, C107944s sVar) {
        Object obj;
        C107491q qVar;
        C107502c a = C107502c.m178394a(eVar.f299118b);
        if (a == null) {
            a = C107502c.UNDEFINED;
        }
        if (a == C107502c.OPA_CLIENT_OP_RESULT) {
            C62940bt r8 = C62942bv.checkIsLite(C107488n.f299083a);
            eVar.mo58887l(r8);
            if (!eVar.f169962ag.mo58857o(r8.f169971d)) {
                C59104x d = f300059a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "COpResultSubController");
                ((C59052c) ((C59052c) d).mo56372aa(26296)).mo56386p("clientEventData does not have extension opaClientOpResultEventData");
                int i = C90755l.f253831a;
                return;
            }
            C62940bt r82 = C62942bv.checkIsLite(C107488n.f299083a);
            eVar.mo58887l(r82);
            Object l = eVar.f169962ag.mo58854l(r82.f169971d);
            if (l == null) {
                obj = r82.f169969b;
            } else {
                obj = r82.mo58889c(l);
            }
            C107494t tVar = (C107494t) obj;
            C107775ak akVar = this.f300060b;
            if ((tVar.f299092a & 1) == 0) {
                ((C59052c) ((C59052c) C107775ak.f299889a.mo56225c()).mo56372aa(26205)).mo56386p("ClientOp ID missing in OpaClientOpResultEvent");
            } else if (akVar.f299893e.get(tVar.f299095d) == null) {
                ((C59052c) ((C59052c) C107775ak.f299889a.mo56225c()).mo56372aa(26204)).mo56389s("Unknown or expired ClientOp ID: %s", tVar.f299095d);
            } else {
                SettableFuture settableFuture = (SettableFuture) akVar.f299893e.remove(tVar.f299095d);
                settableFuture.getClass();
                C51809dy dyVar = (C51809dy) akVar.f299892d.remove(tVar.f299095d);
                dyVar.getClass();
                int i2 = tVar.f299093b;
                if (i2 != 3 && i2 == 2) {
                    try {
                        settableFuture.mo57356n((C52070ec) C62942bv.parseFrom((C62942bv) C52070ec.f136651d, (C63088z) tVar.f299094c));
                    } catch (C62974ct e) {
                        ((C59052c) ((C59052c) ((C59052c) C107775ak.f299889a.mo56225c()).mo56382g(e)).mo56372aa(26202)).mo56386p("Failed to parse ClientOpResult.");
                        C107490p pVar = (C107490p) C107491q.f299084d.createBuilder();
                        String message = e.getMessage();
                        message.getClass();
                        pVar.copyOnWrite();
                        C107491q qVar2 = (C107491q) pVar.instance;
                        qVar2.f299086a = 2 | qVar2.f299086a;
                        qVar2.f299088c = message;
                        pVar.copyOnWrite();
                        C107491q qVar3 = (C107491q) pVar.instance;
                        qVar3.f299087b = 3;
                        qVar3.f299086a |= 1;
                        akVar.mo96280a(dyVar, settableFuture, (C107491q) pVar.build());
                    }
                } else {
                    if (i2 == 3) {
                        qVar = (C107491q) tVar.f299094c;
                    } else {
                        qVar = C107491q.f299084d;
                    }
                    akVar.mo96280a(dyVar, settableFuture, qVar);
                }
            }
        }
    }
}
