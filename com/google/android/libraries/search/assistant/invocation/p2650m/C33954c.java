package com.google.android.libraries.search.assistant.invocation.p2650m;

import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.protobuf.C63088z;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.ZoneId;
import p3186j$.time.ZonedDateTime;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5463a.p5464a.C69469c;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.pinning.ApaPinningDebugDataProvider$getDebugData$1", mo61344c = "ApaPinningDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.m.c */
/* compiled from: PG */
final class C33954c extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C46677o f90532a;

    /* renamed from: b */
    final /* synthetic */ C33955d f90533b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33954c(C46677o oVar, C33955d dVar, C69577g gVar) {
        super(2, gVar);
        this.f90532a = oVar;
        this.f90533b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33954c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        if (!this.f90532a.mo50698b().contains(C46667e.TEXT)) {
            C46669g gVar = C46675m.f121943k;
            C69664n.m101060f(gVar, "NO_DATA");
            return gVar;
        }
        ZoneId systemDefault = ZoneId.systemDefault();
        C33955d dVar = this.f90533b;
        ReentrantReadWriteLock.ReadLock readLock = dVar.f90536c.readLock();
        readLock.lock();
        try {
            C69469c cVar = new C69469c(10);
            cVar.addAll(dVar.f90535b);
            List<C33969r> a = C69540x.m100943a(cVar);
            readLock.unlock();
            C33955d dVar2 = this.f90533b;
            StringBuilder sb = new StringBuilder("\n:: Apa Pinning ::\n");
            ZonedDateTime atZone = C33955d.m62605c(dVar2.f90534a).atZone(systemDefault);
            new StringBuilder("Current timestamp: ").append(atZone);
            sb.append("Current timestamp: ".concat(String.valueOf(atZone)));
            sb.append("\nLifecycle events:\n");
            for (C33969r rVar : a) {
                String a2 = rVar.f90583a.mo39161a();
                ZonedDateTime atZone2 = rVar.f90584b.atZone(systemDefault);
                sb.append("  " + a2 + " @ " + atZone2);
                sb.append(10);
                C33968q qVar = rVar.f90583a;
                if (qVar instanceof C33970s) {
                    for (String valueOf : ((C33970s) qVar).mo39165b()) {
                        sb.append("    ".concat(String.valueOf(valueOf)));
                        sb.append(10);
                    }
                }
            }
            String sb2 = sb.toString();
            C46663a aVar2 = new C46663a();
            aVar2.mo50684b(false);
            aVar2.mo50686d(C46667e.TEXT);
            aVar2.f121916a = C63088z.m96143E(sb2);
            C46669g a3 = aVar2.mo50683a();
            C69664n.m101060f(a3, "builder()\n        .setCo…ugData))\n        .build()");
            return a3;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33954c(this.f90532a, this.f90533b, gVar);
    }
}
