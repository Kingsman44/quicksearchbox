package com.google.android.libraries.search.assistant.invocation.p2650m;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.common.p4522b.C58425eo;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.m.d */
/* compiled from: PG */
public final class C33955d implements C46675m {

    /* renamed from: a */
    public final C21370a f90534a;

    /* renamed from: b */
    public final C58425eo f90535b = new C58425eo(128);

    /* renamed from: c */
    public final ReentrantReadWriteLock f90536c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private final C71422aw f90537d;

    public C33955d(C21370a aVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f90534a = aVar;
        this.f90537d = awVar;
    }

    /* renamed from: c */
    public static final Instant m62605c(C21370a aVar) {
        return Instant.ofEpochMilli(aVar.mo26870b());
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        C69664n.m101061g(oVar, "request");
        return C71663i.m104692e(this.f90537d, (C71424ay) null, new C33954c(oVar, this, (C69577g) null), 3);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public final void mo39153b(com.google.android.libraries.search.assistant.invocation.p2650m.C33968q r6) {
        /*
            r5 = this;
            com.google.android.libraries.search.assistant.invocation.m.r r0 = new com.google.android.libraries.search.assistant.invocation.m.r
            com.google.android.libraries.f.a r1 = r5.f90534a
            j$.time.Instant r1 = m62605c(r1)
            java.lang.String r2 = "clock.instant()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r0.<init>(r6, r1)
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = r5.f90536c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r6.readLock()
            int r2 = r6.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0022
            int r2 = r6.getReadHoldCount()
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            r4 = 0
        L_0x0024:
            if (r4 >= r2) goto L_0x002c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0024
        L_0x002c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r6.writeLock()
            r6.lock()
            com.google.common.b.eo r4 = r5.f90535b     // Catch:{ all -> 0x0044 }
            r4.add(r0)     // Catch:{ all -> 0x0044 }
        L_0x0038:
            if (r3 >= r2) goto L_0x0040
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0040:
            r6.unlock()
            return
        L_0x0044:
            r0 = move-exception
        L_0x0045:
            if (r3 >= r2) goto L_0x004d
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0045
        L_0x004d:
            r6.unlock()
            goto L_0x0052
        L_0x0051:
            throw r0
        L_0x0052:
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2650m.C33955d.mo39153b(com.google.android.libraries.search.assistant.invocation.m.q):void");
    }
}
