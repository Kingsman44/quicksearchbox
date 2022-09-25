package com.google.android.apps.gsa.staticplugins.opa.p8174ab.p8177c;

import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64322bn;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64328d;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ab.c.d */
/* compiled from: PG */
final class C105991d implements C84295m {

    /* renamed from: a */
    final /* synthetic */ C105992e f295899a;

    public C105991d(C105992e eVar) {
        this.f295899a = eVar;
    }

    /* renamed from: a */
    public final void mo77831a(C90523o oVar) {
        C59104x c = C105992e.f295900a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HomeAutomationExeImpl");
        C59052c cVar = (C59052c) c;
        cVar.mo56380ai(C58979ad.FULL);
        ((C59052c) cVar.mo56372aa(24589)).mo56389s("#onFatalError: %s", oVar);
        this.f295899a.mo95207b();
    }

    /* renamed from: c */
    public final void mo77832c(C90523o oVar) {
        C59104x c = C105992e.f295900a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HomeAutomationExeImpl");
        C59052c cVar = (C59052c) c;
        cVar.mo56380ai(C58979ad.FULL);
        ((C59052c) cVar.mo56372aa(24590)).mo56389s("#onNonFatalError: %s", oVar);
    }

    /* renamed from: d */
    public final void mo77833d(C66611ci ciVar) {
        Object obj;
        if (ciVar == null) {
            C59104x c = C105992e.f295900a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HomeAutomationExeImpl");
            ((C59052c) ((C59052c) c).mo56372aa(24593)).mo56386p("s3Response is null");
            return;
        }
        C62940bt r0 = C62942bv.checkIsLite(C64322bn.f173907b);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C64322bn.f173907b);
            ciVar.mo58887l(r02);
            Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C58976aa aaVar = C58975e.f156826a;
            this.f295899a.f295902c.mo76967a((C64328d) obj);
        }
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a == C66610ch.DONE_SUCCESS) {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f295899a.mo95207b();
        }
    }
}
