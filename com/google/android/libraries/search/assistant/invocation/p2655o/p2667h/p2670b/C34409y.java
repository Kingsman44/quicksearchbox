package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Instant;
import p3186j$.time.ZoneId;
import p3186j$.time.ZonedDateTime;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.debug.ApaTriggeringDebugDataProvider$getDebugData$1", mo61344c = "ApaTriggeringDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.y */
/* compiled from: PG */
final class C34409y extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C46677o f91458a;

    /* renamed from: b */
    final /* synthetic */ C34382ag f91459b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34409y(C46677o oVar, C34382ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f91458a = oVar;
        this.f91459b = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34409y) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        String str;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        if (!this.f91458a.mo50698b().contains(C46667e.TEXT)) {
            C46669g gVar = C46675m.f121943k;
            C69664n.m101060f(gVar, "NO_DATA");
            return gVar;
        }
        ZoneId systemDefault = ZoneId.systemDefault();
        C34382ag agVar = this.f91459b;
        ReentrantReadWriteLock.ReadLock readLock = agVar.f91403f.readLock();
        readLock.lock();
        try {
            C58485gu<C34385aj> b = C58479go.m89810b(agVar.f91402e);
            readLock.unlock();
            List<C34385aj> list = C69496am.f185918a;
            for (C34385aj ajVar : b) {
                C34385aj ajVar2 = (C34385aj) C69540x.m100824F(list);
                if (ajVar2 == null) {
                    C69664n.m101060f(ajVar, "record");
                    list = C69540x.m100832N(list, ajVar);
                } else if (!ajVar.f91414b.isEmpty() || !ajVar2.f91414b.isEmpty()) {
                    C69664n.m101060f(ajVar, "record");
                    list = C69540x.m100832N(list, ajVar);
                }
            }
            List S = C69540x.m100837S(C58479go.m89814f(this.f91459b.f91401d.values()), new C34408x());
            C34382ag agVar2 = this.f91459b;
            StringBuilder sb = new StringBuilder("\n:: APA Triggering: Connections ::\n");
            ZonedDateTime atZone = C34382ag.m63064d(agVar2.f91398a).atZone(systemDefault);
            new StringBuilder("Current timestamp: ").append(atZone);
            sb.append("Current timestamp: ".concat(String.valueOf(atZone)));
            sb.append("\nConnectivity and subscriptions:\n");
            if (list.isEmpty()) {
                sb.append("    N/A\n");
            }
            for (C34385aj ajVar3 : list) {
                ZonedDateTime atZone2 = ajVar3.f91413a.atZone(systemDefault);
                new StringBuilder("  @ ").append(atZone2);
                sb.append("  @ ".concat(String.valueOf(atZone2)));
                sb.append(10);
                if (ajVar3.f91414b.isEmpty()) {
                    sb.append("    N/A\n");
                }
                for (Map.Entry entry : C69505av.m100864f(ajVar3.f91414b).entrySet()) {
                    String str2 = (String) entry.getKey();
                    Boolean bool = (Boolean) entry.getValue();
                    C69664n.m101060f(bool, "subscription");
                    String str3 = true != bool.booleanValue() ? "+" : "*";
                    sb.append("    [" + str3 + "] " + str2);
                    sb.append(10);
                }
            }
            sb.append("Details:\n");
            if (S.isEmpty()) {
                sb.append("    N/A\n");
            }
            for (Object next : S) {
                C69664n.m101060f(next, "connectionRecords");
                C34384ai aiVar = (C34384ai) next;
                if (aiVar.f91411d != null) {
                    str = " ";
                } else {
                    C34383ah ahVar = (C34383ah) C69540x.m100824F(aiVar.f91412e);
                    str = (ahVar == null || !ahVar.f91406b) ? "+" : "*";
                }
                String str4 = aiVar.f91408a;
                sb.append("  [" + str + "] " + str4);
                sb.append(10);
                C34119a aVar2 = aiVar.f91409b;
                new StringBuilder("    Client: ").append(aVar2);
                sb.append("    Client: ".concat(String.valueOf(aVar2)));
                sb.append(10);
                ZonedDateTime atZone3 = aiVar.f91410c.atZone(systemDefault);
                new StringBuilder("    Connected: ").append(atZone3);
                sb.append("    Connected: ".concat(String.valueOf(atZone3)));
                sb.append(10);
                Instant instant = aiVar.f91411d;
                ZonedDateTime atZone4 = instant != null ? instant.atZone(systemDefault) : null;
                if (atZone4 == null) {
                    atZone4 = "N/A";
                }
                new StringBuilder("    Disconnected: ").append(atZone4);
                sb.append("    Disconnected: ".concat(atZone4.toString()));
                sb.append("\n    Configuration change events:\n");
                for (C34383ah ahVar2 : aiVar.f91412e) {
                    ZonedDateTime atZone5 = ahVar2.f91407c.atZone(systemDefault);
                    new StringBuilder("      @ ").append(atZone5);
                    sb.append("      @ ".concat(String.valueOf(atZone5)));
                    sb.append(10);
                    String str5 = ahVar2.f91405a;
                    if (str5 == null) {
                        str5 = "N/A";
                    }
                    sb.append("        snapshot id: '" + str5 + "'");
                    sb.append(10);
                    boolean z = ahVar2.f91406b;
                    sb.append("        subscription: " + z);
                    sb.append(10);
                }
            }
            String sb2 = sb.toString();
            C46663a aVar3 = new C46663a();
            aVar3.mo50684b(false);
            aVar3.mo50686d(C46667e.TEXT);
            aVar3.f121916a = C63088z.m96143E(sb2);
            C46669g a = aVar3.mo50683a();
            C69664n.m101060f(a, "builder()\n        .setCo…ugData))\n        .build()");
            return a;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34409y(this.f91458a, this.f91459b, gVar);
    }
}
