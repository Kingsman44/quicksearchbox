package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8286b;

import com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90455b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.b.c */
/* compiled from: PG */
public final /* synthetic */ class C107165c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107166d f298295a;

    public /* synthetic */ C107165c(C107166d dVar) {
        this.f298295a = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C90523o oVar;
        C90523o oVar2;
        C107166d dVar = this.f298295a;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) C107166d.f298296a.mo56226d()).mo56372aa(23515)).mo56386p("Graph done failed");
        ((C59052c) ((C59052c) ((C59052c) C107166d.f298296a.mo56226d()).mo56382g(exc)).mo56372aa(23513)).mo56386p("#handleError");
        if (exc instanceof C90523o) {
            oVar = (C90523o) exc;
        } else {
            if (exc instanceof C90455b) {
                oVar2 = new C90523o((Throwable) exc, ((C90455b) exc).mo79843a());
            } else {
                oVar2 = new C90523o((Throwable) exc, (int) C89885b.INTERNAL_ERROR_SEE_STACK_TRACE_VALUE);
            }
            oVar = oVar2;
        }
        dVar.f298298c.mo78941g(dVar.f298297b, new VoiceSearchError(dVar.f298297b, oVar, (String) null));
        dVar.f298298c.mo78940f(dVar.f298297b);
    }
}
