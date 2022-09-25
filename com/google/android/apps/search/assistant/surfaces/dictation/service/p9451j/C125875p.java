package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125783g;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125934w;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.invocation.CanStartDictationMonitor$runOneShot$1", mo61344c = "CanStartDictationMonitor.kt", mo61345d = "invokeSuspend", mo61346e = {48, 49})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.p */
/* compiled from: PG */
final class C125875p extends C69572j implements C69630p {

    /* renamed from: a */
    int f346931a;

    /* renamed from: b */
    final /* synthetic */ C125876q f346932b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125875p(C125876q qVar, C69577g gVar) {
        super(2, gVar);
        this.f346932b = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125875p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f346931a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C125783g a = this.f346932b.f346935b.mo107117a();
            if (a == null) {
                C125876q qVar = this.f346932b;
                this.f346931a = 1;
                obj = qVar.mo107144b(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                C125876q qVar2 = this.f346932b;
                C125934w a2 = a.f346664e.mo107164a();
                this.f346931a = 2;
                obj = qVar2.mo107143a(a2, this);
                if (obj == aVar) {
                    return aVar;
                }
                return (C119282d) obj;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return (C119282d) obj;
        } else {
            C69714l.m101134b(obj);
        }
        return (C119282d) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125875p(this.f346932b, gVar);
    }
}
