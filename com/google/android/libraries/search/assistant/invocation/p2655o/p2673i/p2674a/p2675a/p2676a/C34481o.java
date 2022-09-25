package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import android.content.IntentFilter;
import android.os.Handler;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.bisto.InEnrollmentStatusProvider$inEnrollmentStatus$1", mo61344c = "InEnrollmentStatusProvider.kt", mo61345d = "invokeSuspend", mo61346e = {59, 61})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.o */
/* compiled from: PG */
final class C34481o extends C69572j implements C69630p {

    /* renamed from: a */
    Object f91630a;

    /* renamed from: b */
    int f91631b;

    /* renamed from: c */
    final /* synthetic */ C34484r f91632c;

    /* renamed from: d */
    private /* synthetic */ Object f91633d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34481o(C34484r rVar, C69577g gVar) {
        super(2, gVar);
        this.f91632c = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34481o) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71361ao aoVar;
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f91631b;
        if (i == 0) {
            C69714l.m101134b(obj);
            C71361ao aoVar2 = (C71361ao) this.f91633d;
            C34480n nVar = new C34480n(this.f91632c, aoVar2);
            this.f91632c.f91636b.registerReceiver(nVar, new IntentFilter("com.google.android.googlequicksearchbox.action.HOTWORD_ENROLLMENT"), "android.permission.MANAGE_VOICE_KEYPHRASES", (Handler) null);
            this.f91633d = aoVar2;
            this.f91630a = nVar;
            this.f91631b = 1;
            if (aoVar2.mo62729v(false, this) == aVar) {
                return aVar;
            }
            aoVar = aoVar2;
            obj2 = nVar;
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            Object obj3 = this.f91630a;
            aoVar = (C71361ao) this.f91633d;
            C69714l.m101134b(obj);
            obj2 = obj3;
        }
        C34479m mVar = new C34479m(this.f91632c, (C34480n) obj2);
        this.f91633d = null;
        this.f91630a = null;
        this.f91631b = 2;
        if (C71360an.m104022a(aoVar, mVar, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34481o oVar = new C34481o(this.f91632c, gVar);
        oVar.f91633d = obj;
        return oVar;
    }
}
