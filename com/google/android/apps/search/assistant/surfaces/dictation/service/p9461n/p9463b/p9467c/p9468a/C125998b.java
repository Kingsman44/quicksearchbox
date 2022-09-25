package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9468a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126027d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126029e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126035k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9472d.C126028a;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C125998b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C125999c f347252a;

    /* renamed from: b */
    public final /* synthetic */ C126035k f347253b;

    public /* synthetic */ C125998b(C125999c cVar, C126035k kVar) {
        this.f347252a = cVar;
        this.f347253b = kVar;
    }

    public final Object apply(Object obj) {
        C125999c cVar = this.f347252a;
        C126035k kVar = this.f347253b;
        C58485gu guVar = (C58485gu) obj;
        if (!guVar.isEmpty()) {
            return guVar;
        }
        C58480gp e = C58485gu.m89837e();
        if (cVar.f347256c.mo107252a(kVar)) {
            return C58485gu.m89846n(cVar.f347255b.mo107353l(((C126029e) kVar).f347344e));
        }
        if (C126028a.m206050b(kVar)) {
            e.mo55395g(cVar.f347255b.mo107350i(((C126029e) kVar).f347344e));
        } else if (C126028a.m206051c(kVar)) {
            e.mo55395g(cVar.f347255b.mo107351j(((C126029e) kVar).f347344e));
        }
        C126029e eVar = (C126029e) kVar;
        if (((C126027d) eVar.f347341b).f347332a) {
            e.mo55395g(cVar.f347255b.mo107343b(eVar.f347344e));
        }
        return e.mo55394f();
    }
}
