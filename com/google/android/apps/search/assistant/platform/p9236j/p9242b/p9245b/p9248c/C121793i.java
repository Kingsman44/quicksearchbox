package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71547cx;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.resources.audioinput.AudioInputResource$1", mo61344c = "AudioInputResource.kt", mo61345d = "invokeSuspend", mo61346e = {119})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.i */
/* compiled from: PG */
final class C121793i extends C69572j implements C69630p {

    /* renamed from: a */
    int f337993a;

    /* renamed from: b */
    final /* synthetic */ C121758ag f337994b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121793i(C121758ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f337994b = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121793i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f337993a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71547cx cxVar = this.f337994b.f337891c;
            C121766ao aoVar = C121766ao.f337925a;
            this.f337993a = 1;
            if (cxVar.mo20883a(aoVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121793i(this.f337994b, gVar);
    }
}
