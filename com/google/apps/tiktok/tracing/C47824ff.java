package com.google.apps.tiktok.tracing;

import kotlinx.coroutines.C71685du;
import kotlinx.coroutines.C71686dv;
import p5462h.p5466c.C69582l;
import p5462h.p5466c.C69583m;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.tracing.ff */
/* compiled from: PG */
public final class C47824ff implements C71686dv {

    /* renamed from: a */
    public static final C47823fe f123844a = new C47823fe();

    /* renamed from: b */
    private final C47835fp f123845b = new C47835fp();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51648a(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        C47835fp fpVar = this.f123845b;
        C47833fn fnVar = (C47833fn) C47831fm.f123852b.get();
        C47834fo foVar = new C47834fo(C47831fm.m85014i(fnVar, fpVar.f123867a), fnVar.f123863d);
        fnVar.f123863d = fpVar;
        return foVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo51649b(C69585o oVar, Object obj) {
        C47834fo foVar = (C47834fo) obj;
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(foVar, "oldState");
        C47833fn fnVar = (C47833fn) C47831fm.f123852b.get();
        fnVar.f123863d = null;
        C47831fm.m85014i(fnVar, foVar.f123865a);
        fnVar.f123863d = foVar.f123866b;
    }

    public final Object fold(Object obj, C69630p pVar) {
        C69664n.m101061g(pVar, "operation");
        return C71685du.m104779a(this, obj, pVar);
    }

    public final C69582l get(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        return C71685du.m104780b(this, mVar);
    }

    public final C69583m getKey() {
        return f123844a;
    }

    public final C69585o minusKey(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        return C71685du.m104781c(this, mVar);
    }

    public final C69585o plus(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        return C71685du.m104782d(this, oVar);
    }
}
