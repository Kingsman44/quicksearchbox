package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.android.libraries.search.p2904c.p2913d.p2914a.C37488j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.e */
/* compiled from: PG */
public final /* synthetic */ class C125401e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C125411o f345848a;

    /* renamed from: b */
    public final /* synthetic */ C125416t f345849b;

    public /* synthetic */ C125401e(C125411o oVar, C125416t tVar) {
        this.f345848a = oVar;
        this.f345849b = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C125411o oVar = this.f345848a;
        C125416t tVar = this.f345849b;
        ((C59052c) ((C59052c) C125411o.f345861a.mo56224b()).mo56372aa(36495)).mo56389s("Starting: %s [SD]", oVar.f345877q);
        if (oVar.f345874n.get()) {
            return C60856cj.m92899h(new Exception("start() after stop()"));
        }
        oVar.f345879s = oVar.f345880t.mo40984a(C125411o.f345866f);
        C37404bi a = oVar.f345867g.mo40942a(C125411o.f345863c);
        a.mo40939e().mo4106b(new C125402f(oVar), oVar.f345870j);
        oVar.f345878r = a.mo40936b(C125411o.f345865e, new C125409m(oVar, tVar));
        C60870cx cxVar = ((C37488j) oVar.f345879s).f99524d;
        C125403g gVar = new C125403g(oVar);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(gVar), C60826bg.f164896a);
        C125404h hVar = C125404h.f345852a;
        return C60922j.m93044g(h, C47810es.m84963c(hVar), C60826bg.f164896a);
    }
}
