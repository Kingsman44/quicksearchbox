package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.PolicyRunner$actorTask$1", mo61344c = "PolicyRunner.kt", mo61345d = "invokeSuspend", mo61346e = {51})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.au */
/* compiled from: PG */
final class C120444au extends C69572j implements C69630p {

    /* renamed from: a */
    int f334992a;

    /* renamed from: b */
    final /* synthetic */ C120441as f334993b;

    /* renamed from: c */
    private /* synthetic */ Object f334994c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120444au(C120441as asVar, C69577g gVar) {
        super(2, gVar);
        this.f334993b = asVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120444au) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334992a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            this.f334993b.f334990d.mo38840a(new C120443at((C71422aw) this.f334994c));
            C120441as asVar = this.f334993b;
            this.f334992a = 1;
            Object a = C71423ax.m104196a(new C120452bb(asVar, (C69577g) null), this);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120444au auVar = new C120444au(this.f334993b, gVar);
        auVar.f334994c = obj;
        return auVar;
    }
}
