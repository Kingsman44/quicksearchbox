package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125926o;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125934w;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.invocation.CanStartDictationMonitor$buildResponse$2$configurationEligibilityDeferred$1", mo61344c = "CanStartDictationMonitor.kt", mo61345d = "invokeSuspend", mo61346e = {97})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.f */
/* compiled from: PG */
final class C125865f extends C69572j implements C69630p {

    /* renamed from: a */
    int f346894a;

    /* renamed from: b */
    final /* synthetic */ C125876q f346895b;

    /* renamed from: c */
    final /* synthetic */ C125934w f346896c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125865f(C125876q qVar, C125934w wVar, C69577g gVar) {
        super(2, gVar);
        this.f346895b = qVar;
        this.f346896c = wVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125865f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346894a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125926o oVar = this.f346895b.f346937d;
            af afVar = this.f346896c.f347148c;
            this.f346894a = 1;
            obj = oVar.mo107175j(afVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125865f(this.f346895b, this.f346896c, gVar);
    }
}
