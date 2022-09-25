package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9078e;

import kotlinx.coroutines.C71422aw;
import p3186j$.util.function.Consumer;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.network.onlineprocessing.impl.updaterequests.AssistDataRequestProducer$streamTo$1", mo61344c = "AssistDataRequestProducer.kt", mo61345d = "invokeSuspend", mo61346e = {60})
/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.e.f */
/* compiled from: PG */
final class C120305f extends C69572j implements C69630p {

    /* renamed from: a */
    int f334723a;

    /* renamed from: b */
    final /* synthetic */ C120306g f334724b;

    /* renamed from: c */
    final /* synthetic */ Consumer f334725c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120305f(C120306g gVar, Consumer consumer, C69577g gVar2) {
        super(2, gVar2);
        this.f334724b = gVar;
        this.f334725c = consumer;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120305f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334723a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120306g gVar = this.f334724b;
            Consumer consumer = this.f334725c;
            this.f334723a = 1;
            if (gVar.mo104721b(consumer, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120305f(this.f334724b, this.f334725c, gVar);
    }
}
