package com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.speechbiasingcontext.logging.statedump.SbcpDebugDataProvider$getDebugData$1", mo61344c = "SbcpDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.aa.b.a.b */
/* compiled from: PG */
final class C32257b extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C32258c f86484a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32257b(C32258c cVar, C69577g gVar) {
        super(2, gVar);
        this.f86484a = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32257b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C32258c cVar = this.f86484a;
        StringBuilder sb = new StringBuilder();
        Set<C32796ar> set = cVar.f86486a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
        for (C32796ar b : set) {
            arrayList.add(C32602g.m60429b(b));
        }
        Duration b2 = cVar.mo38015b();
        sb.append("SBCP state at " + b2 + ":");
        sb.append(10);
        new StringBuilder("With enabled ContextKeys= ").append(arrayList);
        sb.append("With enabled ContextKeys= ".concat(arrayList.toString()));
        sb.append(10);
        ReentrantReadWriteLock.ReadLock readLock = cVar.f86488c.readLock();
        readLock.lock();
        try {
            for (Object next : cVar.f86487b) {
                C69664n.m101060f(next, "historyQueue");
                C32259d dVar = (C32259d) next;
                Map map = dVar.f86496f;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C69505av.m100860b(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put((String) entry.getKey(), entry.getValue());
                }
                SortedMap f = C69505av.m100864f(linkedHashMap);
                Map map2 = dVar.f86497g;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C69505av.m100860b(map2.size()));
                for (Map.Entry entry2 : map2.entrySet()) {
                    linkedHashMap2.put((String) entry2.getKey(), entry2.getValue());
                }
                SortedMap f2 = C69505av.m100864f(linkedHashMap2);
                Duration duration = dVar.f86494d;
                Duration duration2 = dVar.f86495e;
                String a = C32941s.m60950a(dVar.f86491a);
                String b3 = C32941s.m60951b(dVar.f86492b);
                Integer num = dVar.f86493c;
                sb.append(C69764m.m101224d("\n              |  SessionState:\n              |    creationTime= " + duration + "\n              |    closingTime= " + duration2 + "\n              |    accessSessionToken= " + a + "\n              |    sessionToken= " + b3 + "\n              |    SBCP local requestId= " + num + "\n              |    Fetched contexts and their value counts= " + f + "\n              |    Invalidated contexts and their value counts= " + f2 + "\n              ", "|"));
                sb.append(10);
            }
            readLock.unlock();
            String sb2 = sb.toString();
            C46663a aVar2 = new C46663a();
            aVar2.mo50684b(false);
            aVar2.mo50686d(C46667e.TEXT);
            aVar2.f121916a = C63088z.m96143E(sb2);
            C46669g a2 = aVar2.mo50683a();
            C69664n.m101060f(a2, "builder()\n        .setCo…ecords))\n        .build()");
            return a2;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32257b(this.f86484a, gVar);
    }
}
