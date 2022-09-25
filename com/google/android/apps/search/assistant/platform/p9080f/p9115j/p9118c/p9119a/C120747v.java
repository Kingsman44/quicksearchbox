package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a;

import com.google.android.libraries.search.p3055n.C39658cl;
import com.google.android.libraries.search.p3055n.C39659cm;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C67087ko;
import kotlinx.coroutines.p5573a.C71389v;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.ondevice.streaming.impl.SodaSession$startSession$1", mo61344c = "SodaSession.kt", mo61345d = "invokeSuspend", mo61346e = {80})
/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a.v */
/* compiled from: PG */
final class C120747v extends C69572j implements C69630p {

    /* renamed from: a */
    int f335847a;

    /* renamed from: b */
    /* synthetic */ Object f335848b;

    /* renamed from: c */
    final /* synthetic */ C120749x f335849c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120747v(C120749x xVar, C69577g gVar) {
        super(2, gVar);
        this.f335849c = xVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120747v) mo5194c((C67087ko) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335847a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C67087ko koVar = (C67087ko) this.f335848b;
            int i = koVar.f182368a;
            C62940bt r1 = C62942bv.checkIsLite(C39659cm.f104398f);
            koVar.mo58887l(r1);
            if (koVar.f169962ag.mo58857o(r1.f169971d)) {
                C71389v vVar = this.f335849c.f335856g;
                C62940bt r2 = C62942bv.checkIsLite(C39659cm.f104398f);
                koVar.mo58887l(r2);
                Object l = koVar.f169962ag.mo58854l(r2.f169971d);
                if (l == null) {
                    obj2 = r2.f169969b;
                } else {
                    obj2 = r2.mo58889c(l);
                }
                C39658cl a = C39658cl.m69121a(((C39659cm) obj2).f104401b);
                if (a == null) {
                    a = C39658cl.DEFAULT_UNKNOWN;
                }
                C69664n.m101060f(a, "event.getExtension(SodaA…e.responseId).getStatus()");
                this.f335847a = 1;
                if (vVar.mo62729v(a, this) == aVar) {
                    return aVar;
                }
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120747v vVar = new C120747v(this.f335849c, gVar);
        vVar.f335848b = obj;
        return vVar;
    }
}
