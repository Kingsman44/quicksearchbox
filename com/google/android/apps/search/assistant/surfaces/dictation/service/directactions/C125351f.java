package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.DirectActionsContextImpl$activityId$1", mo61344c = "DirectActionsContextImpl.kt", mo61345d = "invokeSuspend", mo61346e = {42})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.f */
/* compiled from: PG */
final class C125351f extends C69572j implements C69626l {

    /* renamed from: a */
    int f345725a;

    /* renamed from: b */
    final /* synthetic */ C125364s f345726b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125351f(C125364s sVar, C69577g gVar) {
        super(1, gVar);
        this.f345726b = sVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C125351f(this.f345726b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f345725a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f345726b.f345764b.mo39113a();
            C69664n.m101060f(a, "directActionsAccessor.foregroundActivityId");
            this.f345725a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = (String) obj;
        return obj;
    }
}
