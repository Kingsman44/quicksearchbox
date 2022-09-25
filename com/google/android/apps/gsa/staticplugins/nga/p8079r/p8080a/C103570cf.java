package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8911a.C118952a;
import com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7127q.C90455b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.cf */
/* compiled from: PG */
public final /* synthetic */ class C103570cf implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C103578cn f288535a;

    public /* synthetic */ C103570cf(C103578cn cnVar) {
        this.f288535a = cnVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C90523o oVar;
        C90523o oVar2;
        C103578cn cnVar = this.f288535a;
        Exception exc = (Exception) obj;
        C59104x d = C103578cn.f288543a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NgaVoiceController");
        ((C59052c) ((C59052c) d).mo56372aa(21575)).mo56386p("Graph done failed");
        C59104x d2 = C103578cn.f288543a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "NgaVoiceController");
        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(exc)).mo56372aa(21577)).mo56386p("logError");
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
        cnVar.f288550h.mo78941g(cnVar.f288544b, new VoiceSearchError(cnVar.f288544b, oVar, C118952a.m197464b(cnVar.f288548f, oVar, (C89037bh) cnVar.f288553k.mo27525b(), cnVar.f288552j, (C89994f) cnVar.f288554l.mo27525b(), cnVar.f288555m, cnVar.f288544b, cnVar.f288556n, cnVar.f288557o)));
        cnVar.f288550h.mo78940f(cnVar.f288544b);
    }
}
