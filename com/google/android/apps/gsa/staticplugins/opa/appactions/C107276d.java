package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8289b.C107261c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.d */
/* compiled from: PG */
public final /* synthetic */ class C107276d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107297e f298587a;

    public /* synthetic */ C107276d(C107297e eVar) {
        this.f298587a = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107297e eVar = this.f298587a;
        ((C59052c) ((C59052c) ((C59052c) C107297e.f298610a.mo56226d()).mo56382g((Exception) obj)).mo56372aa(23544)).mo56386p("[INTENT_SHORTCUT] Failed to send intent shortcut cration request.");
        eVar.f298613d.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_CLIENT_ERROR);
        C107308i iVar = eVar.f298618i;
        iVar.getClass();
        C47393f.m84236g(new C107261c(iVar), eVar.f298611b);
    }
}
