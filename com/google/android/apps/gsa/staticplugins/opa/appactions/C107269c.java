package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8289b.C107259a;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8289b.C107261c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.assistant.p3825an.p3830c.p3831a.C49263ai;
import com.google.assistant.p3861at.C49814aa;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.c */
/* compiled from: PG */
public final /* synthetic */ class C107269c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107297e f298566a;

    public /* synthetic */ C107269c(C107297e eVar) {
        this.f298566a = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107297e eVar = this.f298566a;
        C49814aa aaVar = (C49814aa) obj;
        if (aaVar.f128671a) {
            eVar.f298613d.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_SUCCESS);
            C107308i iVar = eVar.f298618i;
            iVar.getClass();
            C47393f.m84236g(new C107259a(iVar), eVar.f298611b);
            return;
        }
        C59052c cVar = (C59052c) ((C59052c) C107297e.f298610a.mo56225c()).mo56372aa(23542);
        int b = C49263ai.m85396b(aaVar.f128672b);
        if (b == 0) {
            b = 2;
        }
        cVar.mo56387q("[INTENT_SHORTCUT] Failed to add shortcut, error code: %s", C49263ai.m85395a(b));
        eVar.f298613d.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_SERVER_ERROR);
        C107308i iVar2 = eVar.f298618i;
        iVar2.getClass();
        C47393f.m84236g(new C107261c(iVar2), eVar.f298611b);
    }
}
