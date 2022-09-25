package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a;

import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33639a;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33659b;
import com.google.android.libraries.search.p2904c.C37401bf;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37677hx;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.input.api.impl.AudioInputSessionImpl$finishedFuture$1", mo61344c = "AudioInputSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {137})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.a.a.f */
/* compiled from: PG */
final class C33645f extends C69572j implements C69630p {

    /* renamed from: a */
    int f89903a;

    /* renamed from: b */
    final /* synthetic */ C33651l f89904b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33645f(C33651l lVar, C69577g gVar) {
        super(2, gVar);
        this.f89904b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33645f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f89903a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C37677hx hxVar = this.f89904b.f89925d;
            if (hxVar == null) {
                C69664n.m101065k("readOnlyListeningSession");
                hxVar = null;
            }
            C60870cx a = ((C37401bf) hxVar.mo20358e()).mo20353a();
            C69664n.m101060f(a, "readOnlyListeningSession…esult.stopListeningStatus");
            this.f89903a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C37418bw bwVar = (C37418bw) obj;
        C33639a aVar2 = (C33639a) C33659b.f89952c.createBuilder();
        C69664n.m101060f(aVar2, "newBuilder()");
        C69664n.m101061g(aVar2, "builder");
        C69664n.m101060f(bwVar, "stopListeningStatus");
        C69664n.m101061g(bwVar, "value");
        aVar2.copyOnWrite();
        C33659b bVar = (C33659b) aVar2.instance;
        bwVar.getClass();
        bVar.f89955b = bwVar;
        bVar.f89954a = 2;
        C62942bv build = aVar2.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C33659b) build;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33645f(this.f89904b, gVar);
    }
}
