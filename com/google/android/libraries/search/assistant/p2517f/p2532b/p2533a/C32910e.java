package com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.logging.statedump.ContextDebugDataProvider$register$1", mo61344c = "ContextDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.f.b.a.e */
/* compiled from: PG */
final class C32910e extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C32914i f88213a;

    /* renamed from: b */
    final /* synthetic */ C32916k f88214b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32910e(C32914i iVar, C32916k kVar, C69577g gVar) {
        super(2, gVar);
        this.f88213a = iVar;
        this.f88214b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32910e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        return Boolean.valueOf(this.f88213a.f88224c.add(this.f88214b));
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32910e(this.f88213a, this.f88214b, gVar);
    }
}
