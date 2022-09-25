package com.google.android.apps.search.assistant.verticals.p10040d.p10049b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.memory.wipeout.StashWipeoutTask$doCleanup$1", mo61344c = "StashWipeoutTask.kt", mo61345d = "invokeSuspend", mo61346e = {38})
/* renamed from: com.google.android.apps.search.assistant.verticals.d.b.d */
/* compiled from: PG */
final class C132084d extends C69572j implements C69630p {

    /* renamed from: a */
    int f360460a;

    /* renamed from: b */
    final /* synthetic */ C132086f f360461b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C132084d(C132086f fVar, C69577g gVar) {
        super(2, gVar);
        this.f360461b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C132084d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f360460a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C132086f fVar = this.f360461b;
            this.f360460a = 1;
            if (fVar.mo110403b(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C132084d(this.f360461b, gVar);
    }
}
