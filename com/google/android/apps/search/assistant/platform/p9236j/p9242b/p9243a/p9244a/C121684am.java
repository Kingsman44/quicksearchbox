package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121721c;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121723e;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.p4582b.C60942a;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.manager.impl.InvocationTimeoutTracker$scheduleTimeout$previousTimeout$1", mo61344c = "InvocationTimeoutTracker.kt", mo61345d = "invokeSuspend", mo61346e = {61, 66})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.am */
/* compiled from: PG */
final class C121684am extends C69572j implements C69630p {

    /* renamed from: a */
    int f337590a;

    /* renamed from: b */
    final /* synthetic */ Duration f337591b;

    /* renamed from: c */
    final /* synthetic */ C121706m f337592c;

    /* renamed from: d */
    final /* synthetic */ C121685an f337593d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121684am(Duration duration, C121706m mVar, C121685an anVar, C69577g gVar) {
        super(2, gVar);
        this.f337591b = duration;
        this.f337592c = mVar;
        this.f337593d = anVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121684am) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f337590a;
        if (i == 0) {
            C69714l.m101134b(obj);
            Duration duration = this.f337591b;
            this.f337590a = 1;
            if (C60942a.m93084b(duration, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C59052c cVar = (C59052c) C121685an.f337594a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.TimeoutTracker");
        Duration duration2 = this.f337591b;
        C61301b a = C34711b.m63445a(this.f337592c.f337671a);
        cVar.mo56379ah(new C59094n(35922));
        cVar.mo56354G("Timeout(%s) reached for token(%s).", duration2, a);
        C34053bp bpVar = this.f337592c.f337671a;
        C121723e eVar = C121723e.TIMED_OUT;
        this.f337590a = 2;
        if (((C121721c) this.f337593d.f337595b.mo27525b()).mo105317b(bpVar, eVar, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121684am(this.f337591b, this.f337592c, this.f337593d, gVar);
    }
}
