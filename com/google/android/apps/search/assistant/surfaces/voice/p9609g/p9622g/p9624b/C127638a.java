package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.triggering.impl.InvocationSubscriptionConfig$getSubscriptionClientMessage$1$assistantEnabledFuture$1", mo61344c = "InvocationSubscriptionConfig.kt", mo61345d = "invokeSuspend", mo61346e = {45})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.b.a */
/* compiled from: PG */
final class C127638a extends C69572j implements C69630p {

    /* renamed from: a */
    int f351369a;

    /* renamed from: b */
    final /* synthetic */ C127649e f351370b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127638a(C127649e eVar, C69577g gVar) {
        super(2, gVar);
        this.f351370b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127638a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f351369a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx b = this.f351370b.f351417c.mo104232b();
            C69664n.m101060f(b, "assistantEligibilityChecker.isAssistantEnabled");
            this.f351369a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127638a(this.f351370b, gVar);
    }
}
