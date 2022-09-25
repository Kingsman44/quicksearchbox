package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.wholehome.TimersWholeHomeChannel$timersContext$1", mo61344c = "TimersWholeHomeChannel.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ai */
/* compiled from: PG */
final class C131612ai extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f359602a;

    /* renamed from: b */
    /* synthetic */ boolean f359603b;

    public C131612ai(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        boolean z = ((C131626h) obj2).f359655a;
        C131612ai aiVar = new C131612ai((C69577g) obj3);
        aiVar.f359602a = (C131638s) obj;
        aiVar.f359603b = z;
        return aiVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.s, java.lang.Object] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        return new C131643x(this.f359602a, this.f359603b);
    }
}
