package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.protobuf.C63088z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.ZoneId;
import p3186j$.time.ZonedDateTime;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5463a.p5464a.C69469c;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.oracle.InvocationRoutingDebugDataProvider$getDebugData$1", mo61344c = "InvocationRoutingDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.p */
/* compiled from: PG */
final class C34205p extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C46677o f91027a;

    /* renamed from: b */
    final /* synthetic */ C34212w f91028b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34205p(C46677o oVar, C34212w wVar, C69577g gVar) {
        super(2, gVar);
        this.f91027a = oVar;
        this.f91028b = wVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34205p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        if (!this.f91027a.mo50698b().contains(C46667e.TEXT)) {
            C46669g gVar = C46675m.f121943k;
            C69664n.m101060f(gVar, "NO_DATA");
            return gVar;
        }
        ZoneId systemDefault = ZoneId.systemDefault();
        C34212w wVar = this.f91028b;
        ReentrantReadWriteLock.ReadLock readLock = wVar.f91042e.readLock();
        readLock.lock();
        try {
            C69469c cVar = new C69469c(10);
            cVar.addAll(wVar.f91041d);
            List<C34203n> a = C69540x.m100943a(cVar);
            readLock.unlock();
            C34212w wVar2 = this.f91028b;
            StringBuilder sb = new StringBuilder("\n:: APA Triggering: Invocation Routing ::\n");
            ZonedDateTime atZone = C34212w.m62839d(wVar2.f91039b).atZone(systemDefault);
            new StringBuilder("Current timestamp: ").append(atZone);
            sb.append("Current timestamp: ".concat(String.valueOf(atZone)));
            sb.append(10);
            List<C34203n> list = C69496am.f185918a;
            for (C34203n nVar : a) {
                C34203n nVar2 = (C34203n) C69540x.m100824F(list);
                if (nVar2 == null) {
                    list = C69540x.m100832N(list, nVar);
                } else if (!nVar.f91026b.isEmpty() || !nVar2.f91026b.isEmpty()) {
                    list = C69540x.m100832N(list, nVar);
                }
            }
            for (C34203n nVar3 : list) {
                ZonedDateTime atZone2 = nVar3.f91025a.atZone(systemDefault);
                new StringBuilder("@ ").append(atZone2);
                sb.append("@ ".concat(String.valueOf(atZone2)));
                sb.append(10);
                if (nVar3.f91026b.isEmpty()) {
                    sb.append("  N/A\n");
                }
                for (C34202m mVar : C69540x.m100837S(C69540x.m100846ab(nVar3.f91026b.values()), new C34204o())) {
                    String str = mVar.f91023a;
                    C34119a aVar2 = mVar.f91024b;
                    sb.append("  " + str + " " + aVar2);
                    sb.append(10);
                    Map map = nVar3.f91026b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (C69664n.m101066l((C34202m) entry.getValue(), mVar)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (C34043bf name : C69540x.m100836R(linkedHashMap.keySet())) {
                        sb.append("    ".concat(String.valueOf(name.name())));
                        sb.append(10);
                    }
                }
            }
            String sb2 = sb.toString();
            C46663a aVar3 = new C46663a();
            aVar3.mo50684b(false);
            aVar3.mo50686d(C46667e.TEXT);
            aVar3.f121916a = C63088z.m96143E(sb2);
            C46669g a2 = aVar3.mo50683a();
            C69664n.m101060f(a2, "builder()\n        .setCo…ugData))\n        .build()");
            return a2;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34205p(this.f91027a, this.f91028b, gVar);
    }
}
