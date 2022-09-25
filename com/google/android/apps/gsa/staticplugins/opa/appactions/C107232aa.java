package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.aa */
/* compiled from: PG */
public final /* synthetic */ class C107232aa implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107238ag f298435a;

    public /* synthetic */ C107232aa(C107238ag agVar) {
        this.f298435a = agVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107238ag agVar = this.f298435a;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) ((C59052c) C107238ag.f298441a.mo56225c()).mo56382g(exc)).mo56372aa(23554)).mo56386p("Failed to get shortcut page response");
        agVar.f298448h.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_CONTENT_PAGE_RESPONSE_CLIENT_ERROR);
        agVar.f298463w.mo95890a(exc, C89885b.f246273x9ec550dc, 166608251);
        agVar.mo95843b();
    }
}
