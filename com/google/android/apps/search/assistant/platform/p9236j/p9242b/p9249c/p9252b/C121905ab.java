package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.protobuf.C63088z;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.assistlayer.AssistLayerTracker$getDebugData$1", mo61344c = "AssistLayerTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.ab */
/* compiled from: PG */
final class C121905ab extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C46677o f338284a;

    /* renamed from: b */
    final /* synthetic */ C121906ac f338285b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121905ab(C46677o oVar, C121906ac acVar, C69577g gVar) {
        super(2, gVar);
        this.f338284a = oVar;
        this.f338285b = acVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121905ab) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        if (this.f338284a.mo50698b().contains(C46667e.TEXT)) {
            C46663a aVar2 = new C46663a();
            aVar2.mo50684b(false);
            aVar2.mo50686d(C46667e.TEXT);
            C121906ac acVar = this.f338285b;
            StringBuilder sb = new StringBuilder("APA AssistLayer:\n");
            Instant a = acVar.f338287a.mo57444a();
            new StringBuilder("  Current timestamp: ").append(a);
            sb.append("  Current timestamp: ".concat(String.valueOf(a)));
            sb.append(10);
            ReentrantLock reentrantLock = acVar.f338288b;
            reentrantLock.lock();
            try {
                StringBuilder sb2 = new StringBuilder("  Active AssistLayer session\n");
                Object obj2 = acVar.f338289c;
                if (obj2 == null) {
                    obj2 = "N/A";
                }
                sb2.append("    " + obj2);
                sb2.append(10);
                String sb3 = sb2.toString();
                reentrantLock.unlock();
                sb.append(sb3);
                sb.append(10);
                ReentrantLock reentrantLock2 = acVar.f338288b;
                reentrantLock2.lock();
                try {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("  Recent AssistLayer sessions");
                    sb4.append(10);
                    if (acVar.f338290d.isEmpty()) {
                        sb4.append("    N/A");
                        sb4.append(10);
                    }
                    Iterator it = acVar.f338290d.iterator();
                    while (it.hasNext()) {
                        sb4.append("    " + ((C121904aa) it.next()));
                        sb4.append(10);
                    }
                    String sb5 = sb4.toString();
                    reentrantLock2.unlock();
                    sb.append(sb5);
                    sb.append(10);
                    aVar2.f121916a = C63088z.m96143E(sb.toString());
                    C46669g a2 = aVar2.mo50683a();
                    C69664n.m101060f(a2, "builder()\n        .setCo…ring()))\n        .build()");
                    return a2;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } else {
            C46669g gVar = C46675m.f121943k;
            C69664n.m101060f(gVar, "NO_DATA");
            return gVar;
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121905ab(this.f338284a, this.f338285b, gVar);
    }
}
