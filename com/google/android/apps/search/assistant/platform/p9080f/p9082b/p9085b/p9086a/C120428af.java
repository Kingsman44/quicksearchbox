package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.PolicyActor$runPolicy$2$1$1$3", mo61344c = "PolicyActor.kt", mo61345d = "invokeSuspend", mo61346e = {65})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.af */
/* compiled from: PG */
final class C120428af extends C69572j implements C69626l {

    /* renamed from: a */
    int f334963a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f334964b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120428af(C69648ae aeVar, C69577g gVar) {
        super(1, gVar);
        this.f334964b = aeVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C120428af(this.f334964b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334963a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69648ae aeVar = this.f334964b;
            C120478z zVar = (C120478z) aeVar.f186027a;
            if (zVar != null) {
                C58976aa aaVar = C58975e.f156826a;
                zVar.f335067b.close();
                aeVar.f186027a = null;
                this.f334963a = 1;
                if (zVar.mo104767a(this) == aVar) {
                    return aVar;
                }
            }
        }
        return null;
    }
}
