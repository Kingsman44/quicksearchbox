package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.l */
/* compiled from: PG */
final class C26869l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C26878u f73192a;

    public C26869l(C26878u uVar) {
        this.f73192a = uVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        throw new IllegalStateException("Failed to release surfaces", th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r6.awaitTermination(250, java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L_0x001b;
     */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo17911gm(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Void r6 = (java.lang.Void) r6
            com.google.android.libraries.lens.view.h.h.a.u r6 = r5.f73192a
            java.util.concurrent.ExecutorService r6 = r6.f73252n
            r6.shutdownNow()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0014 }
            r1 = 250(0xfa, double:1.235E-321)
            boolean r6 = r6.awaitTermination(r1, r0)     // Catch:{ InterruptedException -> 0x0014 }
            if (r6 != 0) goto L_0x0029
            goto L_0x001b
        L_0x0014:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L_0x001b:
            com.google.common.f.a.d r6 = com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26878u.f73209a
            com.google.common.f.x r6 = r6.mo56226d()
            java.lang.String r0 = "Failed to shutdown glExecutor within time limit"
            r1 = 49229(0xc04d, float:6.8985E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r1)).mo56386p(r0)
        L_0x0029:
            com.google.android.libraries.lens.view.h.h.a.u r6 = r5.f73192a
            com.google.common.base.ax r6 = r6.f73260v
            boolean r6 = r6.mo56113h()
            if (r6 == 0) goto L_0x0040
            com.google.android.libraries.lens.view.h.h.a.u r6 = r5.f73192a
            com.google.common.base.ax r6 = r6.f73260v
            java.lang.Object r6 = r6.mo56107c()
            com.google.android.libraries.lens.view.av.c r6 = (com.google.android.libraries.lens.view.p2082av.C25579c) r6
            r6.mo30664d()
        L_0x0040:
            com.google.android.libraries.lens.view.h.h.a.u r6 = r5.f73192a
            com.google.android.libraries.lens.view.h.h.a.b.b r6 = r6.f73253o
            com.google.android.libraries.lens.view.h.h.a.b.a r6 = (com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b.C26854a) r6
            com.google.common.b.gu r0 = r6.f73168c
            r1 = r0
            com.google.common.b.pq r1 = (com.google.common.p4522b.C58724pq) r1
            int r1 = r1.f156474d
            r2 = 0
        L_0x004e:
            if (r2 >= r1) goto L_0x0060
            java.lang.Object r3 = r0.get(r2)
            com.google.android.libraries.lens.view.h.h.a.a.c r3 = (com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2128a.C26842c) r3
            android.opengl.EGLDisplay r4 = r6.f73167b
            android.opengl.EGLSurface r3 = r3.f73146b
            android.opengl.EGL14.eglDestroySurface(r4, r3)
            int r2 = r2 + 1
            goto L_0x004e
        L_0x0060:
            com.google.android.libraries.lens.view.h.h.a.u r6 = r5.f73192a
            com.google.android.libraries.lens.view.h.h.a.b.b r6 = r6.f73253o
            com.google.android.libraries.lens.view.h.h.a.b.a r6 = (com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b.C26854a) r6
            android.opengl.EGLDisplay r0 = r6.f73167b
            android.opengl.EGLContext r6 = r6.f73166a
            com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26847ac.m49717h(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26869l.mo17911gm(java.lang.Object):void");
    }
}
