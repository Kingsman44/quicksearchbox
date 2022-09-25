package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import java.util.Map;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.debug.ApaTriggeringDebugDataProvider$initialize$1$2", mo61344c = "ApaTriggeringDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.z */
/* compiled from: PG */
final class C34410z extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f91460a;

    /* renamed from: b */
    final /* synthetic */ C34382ag f91461b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34410z(C34382ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f91461b = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34410z) mo5194c((Map) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
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
            java.lang.Object r7 = r6.f91460a
            java.util.Map r7 = (java.util.Map) r7
            com.google.android.libraries.search.assistant.invocation.o.h.b.aj r0 = new com.google.android.libraries.search.assistant.invocation.o.h.b.aj
            com.google.android.libraries.search.assistant.invocation.o.h.b.ag r1 = r6.f91461b
            com.google.android.libraries.f.a r1 = r1.f91398a
            j$.time.Instant r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b.C34382ag.m63064d(r1)
            java.lang.String r2 = "clock.instant()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r0.<init>(r1, r7)
            com.google.android.libraries.search.assistant.invocation.o.h.b.ag r7 = r6.f91461b
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r7.f91403f
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            int r3 = r1.getWriteHoldCount()
            r4 = 0
            if (r3 != 0) goto L_0x002f
            int r3 = r1.getReadHoldCount()
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            r5 = 0
        L_0x0031:
            if (r5 >= r3) goto L_0x0039
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x0031
        L_0x0039:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            com.google.common.b.eo r7 = r7.f91402e     // Catch:{ all -> 0x0053 }
            r7.add(r0)     // Catch:{ all -> 0x0053 }
        L_0x0045:
            if (r4 >= r3) goto L_0x004d
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0045
        L_0x004d:
            r1.unlock()
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x0053:
            r7 = move-exception
        L_0x0054:
            if (r4 >= r3) goto L_0x005c
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0054
        L_0x005c:
            r1.unlock()
            goto L_0x0061
        L_0x0060:
            throw r7
        L_0x0061:
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b.C34410z.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34410z zVar = new C34410z(this.f91461b, gVar);
        zVar.f91460a = obj;
        return zVar;
    }
}
