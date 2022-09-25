package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.debug.ApaTriggeringDebugDataProvider$initialize$1$3", mo61344c = "ApaTriggeringDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.aa */
/* compiled from: PG */
final class C34376aa extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C34382ag f91387a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34376aa(C34382ag agVar, C69577g gVar) {
        super(3, gVar);
        this.f91387a = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C34376aa(this.f91387a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            p5462h.C69714l.m101134b(r7)
            com.google.android.libraries.search.assistant.invocation.o.h.b.aj r7 = new com.google.android.libraries.search.assistant.invocation.o.h.b.aj
            com.google.android.libraries.search.assistant.invocation.o.h.b.ag r0 = r6.f91387a
            com.google.android.libraries.f.a r0 = r0.f91398a
            j$.time.Instant r0 = com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b.C34382ag.m63064d(r0)
            java.lang.String r1 = "clock.instant()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            h.a.an r1 = p5462h.p5463a.C69497an.f185919a
            r7.<init>(r0, r1)
            com.google.android.libraries.search.assistant.invocation.o.h.b.ag r0 = r6.f91387a
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r0.f91403f
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            int r3 = r1.getWriteHoldCount()
            r4 = 0
            if (r3 != 0) goto L_0x002d
            int r3 = r1.getReadHoldCount()
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 >= r3) goto L_0x0037
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x002f
        L_0x0037:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            com.google.common.b.eo r0 = r0.f91402e     // Catch:{ all -> 0x0051 }
            r0.add(r7)     // Catch:{ all -> 0x0051 }
        L_0x0043:
            if (r4 >= r3) goto L_0x004b
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0043
        L_0x004b:
            r1.unlock()
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x0051:
            r7 = move-exception
        L_0x0052:
            if (r4 >= r3) goto L_0x005a
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0052
        L_0x005a:
            r1.unlock()
            goto L_0x005f
        L_0x005e:
            throw r7
        L_0x005f:
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b.C34376aa.mo5193b(java.lang.Object):java.lang.Object");
    }
}
