package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69514bd;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.debug.ApaTriggeringDebugDataProvider$initialize$1$5", mo61344c = "ApaTriggeringDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.ac */
/* compiled from: PG */
final class C34378ac extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C34382ag f91391a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34378ac(C34382ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f91391a = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34378ac) mo5194c((C69685i) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C34382ag agVar = this.f91391a;
        ConcurrentMap concurrentMap = agVar.f91401d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentMap.entrySet()) {
            if (((C34384ai) entry.getValue()).f91411d != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        if (keySet.size() > 16) {
            for (String remove : C69514bd.m100889c(keySet, C69540x.m100846ab(C69540x.m100839U(C69540x.m100836R(keySet), 16)))) {
                agVar.f91401d.remove(remove);
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34378ac(this.f91391a, gVar);
    }
}
