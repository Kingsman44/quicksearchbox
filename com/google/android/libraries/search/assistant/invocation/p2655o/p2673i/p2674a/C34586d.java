package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58425eo;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.d */
/* compiled from: PG */
public final class C34586d {

    /* renamed from: a */
    public final ReentrantReadWriteLock f91883a = new ReentrantReadWriteLock();

    /* renamed from: b */
    public final C58425eo f91884b = new C58425eo(20);

    /* renamed from: c */
    public boolean f91885c;

    /* renamed from: d */
    private final C21370a f91886d;

    public C34586d(C21370a aVar) {
        C69664n.m101061g(aVar, "clock");
        this.f91886d = aVar;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public final void mo39440a(com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34564c r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r8.f91883a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            com.google.common.b.eo r4 = r8.f91884b     // Catch:{ all -> 0x0057 }
            int r4 = r4.size()     // Catch:{ all -> 0x0057 }
            r5 = 20
            if (r4 != r5) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            r8.f91885c = r4     // Catch:{ all -> 0x0057 }
            com.google.common.b.eo r4 = r8.f91884b     // Catch:{ all -> 0x0057 }
            com.google.android.libraries.search.assistant.invocation.o.i.a.b r5 = new com.google.android.libraries.search.assistant.invocation.o.i.a.b     // Catch:{ all -> 0x0057 }
            com.google.android.libraries.f.a r6 = r8.f91886d     // Catch:{ all -> 0x0057 }
            long r6 = r6.mo26870b()     // Catch:{ all -> 0x0057 }
            j$.time.Instant r6 = p3186j$.time.Instant.ofEpochMilli(r6)     // Catch:{ all -> 0x0057 }
            java.lang.String r7 = "clock.instant()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ all -> 0x0057 }
            r5.<init>(r6, r9)     // Catch:{ all -> 0x0057 }
            r4.add(r5)     // Catch:{ all -> 0x0057 }
        L_0x004b:
            if (r3 >= r2) goto L_0x0053
            r1.lock()
            int r3 = r3 + 1
            goto L_0x004b
        L_0x0053:
            r0.unlock()
            return
        L_0x0057:
            r9 = move-exception
        L_0x0058:
            if (r3 >= r2) goto L_0x0060
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0058
        L_0x0060:
            r0.unlock()
            goto L_0x0065
        L_0x0064:
            throw r9
        L_0x0065:
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34586d.mo39440a(com.google.android.libraries.search.assistant.invocation.o.i.a.c):void");
    }
}
