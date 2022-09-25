package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.speech.p5218j.C66944fg;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.quickphrasesmanager.impl.QuickPhrasesManagerImpl$getQPEventFlow$1$1", mo61344c = "QuickPhrasesManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {225})
/* renamed from: com.google.android.libraries.search.assistant.x.a.p */
/* compiled from: PG */
final class C36810p extends C69572j implements C69631q {

    /* renamed from: a */
    int f95931a;

    /* renamed from: b */
    /* synthetic */ Object f95932b;

    /* renamed from: c */
    final /* synthetic */ C36808o f95933c;

    /* renamed from: d */
    private /* synthetic */ Object f95934d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36810p(C36808o oVar, C69577g gVar) {
        super(3, gVar);
        this.f95933c = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C36810p pVar = new C36810p(this.f95933c, (C69577g) obj3);
        pVar.f95934d = (C71588o) obj;
        pVar.f95932b = (C66944fg) obj2;
        return pVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f95931a != 0) {
            obj2 = (C66944fg) this.f95934d;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71588o oVar = (C71588o) this.f95934d;
            Object obj3 = this.f95932b;
            if (obj3 == null) {
                return false;
            }
            this.f95934d = obj3;
            this.f95931a = 1;
            if (oVar.mo20883a(obj3, this) == aVar) {
                return aVar;
            }
            obj2 = obj3;
        }
        return Boolean.valueOf(!this.f95933c.mo40415i((C66944fg) obj2));
    }
}
