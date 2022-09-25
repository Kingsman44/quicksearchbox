package com.google.android.libraries.assistant.soda.p1606e;

import com.google.android.libraries.assistant.soda.p1606e.p1608b.C19302b;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.soda.e.l */
/* compiled from: PG */
public final /* synthetic */ class C19315l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C19317n f54046a;

    public /* synthetic */ C19315l(C19317n nVar) {
        this.f54046a = nVar;
    }

    public final C60870cx apply(Object obj) {
        C19317n nVar = this.f54046a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            ((C59052c) ((C59052c) C19317n.f54049a.mo56224b()).mo56372aa(47715)).mo56386p("Preloaded model available for given model.");
            return C60856cj.m92900i(axVar);
        }
        ((C59052c) ((C59052c) C19317n.f54049a.mo56224b()).mo56372aa(47714)).mo56386p("Preloaded model not available. Attempting download.");
        ((C59052c) ((C59052c) C19317n.f54049a.mo56224b()).mo56372aa(47706)).mo56386p("Trying to get latest MDD Model bytes.");
        C58833ax a = nVar.f54052d.mo24446a();
        if (!a.mo56113h()) {
            ((C59052c) ((C59052c) C19317n.f54049a.mo56224b()).mo56372aa(47708)).mo56386p("Locale is null.");
            return C60856cj.m92900i(C58836b.f156633a);
        } else if (!nVar.f54052d.mo24447b().containsKey(a.mo56107c())) {
            ((C59052c) ((C59052c) C19317n.f54049a.mo56226d()).mo56372aa(47707)).mo56386p("Locale is not registered with HotwordConfigManager. Ignoring download.");
            return C60856cj.m92900i(C58836b.f156633a);
        } else {
            C29409fd fdVar = nVar.f54050b;
            C28804cs f = C28805ct.m53747f();
            f.mo34449c(C19302b.m36800a((String) a.mo56107c()));
            C60870cx d = nVar.mo24455d(fdVar.mo34717f(f.mo34447a()));
            C19310g gVar = new C19310g(nVar, a);
            C60870cx h = C60922j.m93045h(d, C47810es.m84966f(gVar), nVar.f54053e);
            C19313j jVar = new C19313j(nVar);
            C60870cx g = C60922j.m93044g(h, C47810es.m84963c(jVar), nVar.f54054f);
            C19311h hVar = new C19311h(nVar, a);
            C60870cx h2 = C60922j.m93045h(g, C47810es.m84966f(hVar), nVar.f54053e);
            C19312i iVar = new C19312i(g);
            return C60922j.m93045h(h2, C47810es.m84966f(iVar), nVar.f54053e);
        }
    }
}
