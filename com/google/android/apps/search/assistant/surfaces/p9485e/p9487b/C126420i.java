package com.google.android.apps.search.assistant.surfaces.p9485e.p9487b;

import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.endpointer.EndpointerMerger$merge$1$2", mo61344c = "EndpointerMerger.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.b.i */
/* compiled from: PG */
final class C126420i extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C69648ae f348179a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126420i(C69648ae aeVar, C69577g gVar) {
        super(2, gVar);
        this.f348179a = aeVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126420i) mo5194c((C126414c) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        return Boolean.valueOf(this.f348179a.f186027a != C126419h.FINISHED);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126420i(this.f348179a, gVar);
    }
}
