package com.facebook.litho;

import java.util.concurrent.Callable;

/* renamed from: com.facebook.litho.ah */
/* compiled from: PG */
final class C6097ah implements Callable {

    /* renamed from: a */
    final /* synthetic */ C6098ai f18013a;

    public C6097ah(C6098ai aiVar) {
        this.f18013a = aiVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r4 = new com.facebook.litho.C6280fw(r0.f18025l.f17873D);
        r11 = r0.f18025l.f17872C;
        r5 = new com.facebook.litho.C6411u(r0.f18014a, r4, r0.f18019f, (com.facebook.litho.C6188dh) null);
        r0.f18025l.f17902e.mo13149a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r0 = com.facebook.litho.C6187dg.m16347s(r5, r0.f18015b, r0.f18025l.f17875F, r0.f18016c, r0.f18017d, r0.f18018e, r11, r0.f18022i, r0.f18023j);
        r3 = r14.f18013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r14.f18013a.f18024k == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        r0 = r14.f18013a;
        r1 = r0.f18025l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        monitor-enter(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r14 = this;
            com.facebook.litho.ai r0 = r14.f18013a
            monitor-enter(r0)
            com.facebook.litho.ai r1 = r14.f18013a     // Catch:{ all -> 0x0058 }
            boolean r1 = r1.f18024k     // Catch:{ all -> 0x0058 }
            r2 = 0
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            goto L_0x0051
        L_0x000c:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            com.facebook.litho.ai r0 = r14.f18013a
            com.facebook.litho.ComponentTree r1 = r0.f18025l
            monitor-enter(r1)
            com.facebook.litho.ComponentTree r3 = r0.f18025l     // Catch:{ all -> 0x0055 }
            com.facebook.litho.fw r3 = r3.f17873D     // Catch:{ all -> 0x0055 }
            com.facebook.litho.fw r4 = new com.facebook.litho.fw     // Catch:{ all -> 0x0055 }
            r4.<init>(r3)     // Catch:{ all -> 0x0055 }
            com.facebook.litho.ComponentTree r3 = r0.f18025l     // Catch:{ all -> 0x0055 }
            com.facebook.litho.dg r11 = r3.f17872C     // Catch:{ all -> 0x0055 }
            com.facebook.litho.u r5 = new com.facebook.litho.u     // Catch:{ all -> 0x0055 }
            com.facebook.litho.u r3 = r0.f18014a     // Catch:{ all -> 0x0055 }
            com.facebook.litho.hf r6 = r0.f18019f     // Catch:{ all -> 0x0055 }
            r5.<init>((com.facebook.litho.C6411u) r3, (com.facebook.litho.C6280fw) r4, (com.facebook.litho.C6381hf) r6, (com.facebook.litho.C6188dh) r2)     // Catch:{ all -> 0x0055 }
            com.facebook.litho.ComponentTree r3 = r0.f18025l     // Catch:{ all -> 0x0055 }
            com.facebook.litho.cw r3 = r3.f17902e     // Catch:{ all -> 0x0055 }
            r3.mo13149a(r4)     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            com.facebook.litho.q r6 = r0.f18015b
            com.facebook.litho.ComponentTree r1 = r0.f18025l
            int r7 = r1.f17875F
            int r8 = r0.f18016c
            int r9 = r0.f18017d
            boolean r10 = r0.f18018e
            int r12 = r0.f18022i
            java.lang.String r13 = r0.f18023j
            com.facebook.litho.dg r0 = com.facebook.litho.C6187dg.m16347s(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.facebook.litho.ai r3 = r14.f18013a
            monitor-enter(r3)
            com.facebook.litho.ai r1 = r14.f18013a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.f18024k     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x004f
            monitor-exit(r3)     // Catch:{ all -> 0x0052 }
            goto L_0x0051
        L_0x004f:
            monitor-exit(r3)     // Catch:{ all -> 0x0052 }
            r2 = r0
        L_0x0051:
            return r2
        L_0x0052:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0052 }
            throw r0
        L_0x0055:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            throw r0
        L_0x0058:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6097ah.call():java.lang.Object");
    }
}
