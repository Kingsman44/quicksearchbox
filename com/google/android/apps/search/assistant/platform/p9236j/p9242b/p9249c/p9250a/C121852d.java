package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import android.content.Intent;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.activitystarter.ApaInternalActivityStarterBackendImpl$startAssistantActivity$2$1", mo61344c = "ApaInternalActivityStarterBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {48})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.d */
/* compiled from: PG */
final class C121852d extends C69572j implements C69630p {

    /* renamed from: a */
    int f338109a;

    /* renamed from: b */
    final /* synthetic */ C121857i f338110b;

    /* renamed from: c */
    final /* synthetic */ Intent f338111c;

    /* renamed from: d */
    private /* synthetic */ Object f338112d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121852d(C121857i iVar, Intent intent, C69577g gVar) {
        super(2, gVar);
        this.f338110b = iVar;
        this.f338111c = intent;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121852d) mo5194c((C33504b) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338109a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Intent intent = this.f338111c;
            this.f338109a = 1;
            ((C33504b) this.f338112d).startAssistantActivity(intent);
            if (C69788q.f186170a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121852d dVar = new C121852d(this.f338110b, this.f338111c, gVar);
        dVar.f338112d = obj;
        return dVar;
    }
}
