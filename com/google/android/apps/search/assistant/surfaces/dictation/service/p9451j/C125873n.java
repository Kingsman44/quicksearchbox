package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125783g;
import kotlinx.coroutines.p5574b.C71589p;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.invocation.CanStartDictationMonitor$monitor$respondingJob$1$1", mo61344c = "CanStartDictationMonitor.kt", mo61345d = "invokeSuspend", mo61346e = {64})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.n */
/* compiled from: PG */
final class C125873n extends C69572j implements C69630p {

    /* renamed from: a */
    int f346925a;

    /* renamed from: b */
    /* synthetic */ Object f346926b;

    /* renamed from: c */
    final /* synthetic */ C125876q f346927c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125873n(C125876q qVar, C69577g gVar) {
        super(2, gVar);
        this.f346927c = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125873n) mo5194c((C125783g) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346925a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125783g gVar = (C125783g) this.f346926b;
            if (gVar != null) {
                return new C125872m(gVar.f346664e.f347007d, this.f346927c);
            }
            C125876q qVar = this.f346927c;
            this.f346925a = 1;
            obj = qVar.mo107144b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new C71589p(obj);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C125873n nVar = new C125873n(this.f346927c, gVar);
        nVar.f346926b = obj;
        return nVar;
    }
}
