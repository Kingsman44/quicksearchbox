package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import android.content.Intent;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.activitystarter.ApaInternalActivityStarterBackendImpl$startVoiceActivity$2", mo61344c = "ApaInternalActivityStarterBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {36})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.g */
/* compiled from: PG */
final class C121855g extends C69572j implements C69630p {

    /* renamed from: a */
    int f338121a;

    /* renamed from: b */
    final /* synthetic */ C121857i f338122b;

    /* renamed from: c */
    final /* synthetic */ C34053bp f338123c;

    /* renamed from: d */
    final /* synthetic */ Intent f338124d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121855g(C121857i iVar, C34053bp bpVar, Intent intent, C69577g gVar) {
        super(2, gVar);
        this.f338122b = iVar;
        this.f338123c = bpVar;
        this.f338124d = intent;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121855g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338121a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C121857i iVar = this.f338122b;
            C34053bp bpVar = this.f338123c;
            C121826ai aiVar = new C121826ai();
            C121854f fVar = new C121854f(iVar, this.f338124d, (C69577g) null);
            this.f338121a = 1;
            obj = iVar.mo105401a("startVoiceActivity", bpVar, aiVar, fVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121855g(this.f338122b, this.f338123c, this.f338124d, gVar);
    }
}
