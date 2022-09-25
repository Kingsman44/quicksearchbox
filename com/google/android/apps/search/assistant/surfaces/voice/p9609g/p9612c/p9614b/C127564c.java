package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9614b;

import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5574b.C71594u;
import kotlinx.coroutines.p5574b.C71598y;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.lifecyclemanager.impl.SearchProcessMonitoring$searchMonitor$1", mo61344c = "SearchProcessMonitoring.kt", mo61345d = "invokeSuspend", mo61346e = {27})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.b.c */
/* compiled from: PG */
final class C127564c extends C69572j implements C69630p {

    /* renamed from: a */
    int f351216a;

    /* renamed from: b */
    final /* synthetic */ C127565d f351217b;

    /* renamed from: c */
    private /* synthetic */ Object f351218c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127564c(C127565d dVar, C69577g gVar) {
        super(2, gVar);
        this.f351217b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127564c) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f351216a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n b = C71477ah.m104295b(C71598y.m104522b(new C71552db(new C127562a((C69577g) null))), new C127563b((C69577g) null));
            this.f351216a = 1;
            if (C71594u.m104516c((C71588o) this.f351218c, b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C127564c cVar = new C127564c(this.f351217b, gVar);
        cVar.f351218c = obj;
        return cVar;
    }
}
