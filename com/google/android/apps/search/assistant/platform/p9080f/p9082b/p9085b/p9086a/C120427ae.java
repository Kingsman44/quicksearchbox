package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.PolicyActor$runPolicy$2$1$1$1", mo61344c = "PolicyActor.kt", mo61345d = "invokeSuspend", mo61346e = {45})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.ae */
/* compiled from: PG */
final class C120427ae extends C69572j implements C69626l {

    /* renamed from: a */
    int f334959a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f334960b;

    /* renamed from: c */
    final /* synthetic */ C120432aj f334961c;

    /* renamed from: d */
    final /* synthetic */ C71422aw f334962d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120427ae(C69648ae aeVar, C120432aj ajVar, C71422aw awVar, C69577g gVar) {
        super(1, gVar);
        this.f334960b = aeVar;
        this.f334961c = ajVar;
        this.f334962d = awVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C120427ae(this.f334960b, this.f334961c, this.f334962d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334959a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120478z zVar = (C120478z) this.f334960b.f186027a;
            if (zVar != null) {
                C58976aa aaVar = C58975e.f156826a;
                return zVar;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            C120432aj ajVar = this.f334961c;
            C71422aw awVar = this.f334962d;
            this.f334959a = 1;
            obj = ajVar.mo104750a(awVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C120478z zVar2 = (C120478z) obj;
        this.f334960b.f186027a = zVar2;
        return zVar2;
    }
}
