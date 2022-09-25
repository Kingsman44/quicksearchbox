package com.google.android.libraries.p11016ak;

import com.google.android.libraries.p11016ak.p11018b.C147634c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.ak.g */
/* compiled from: PG */
public final class C147725g {

    /* renamed from: a */
    public C58833ax f398633a = C58836b.f156633a;

    /* renamed from: b */
    private final C147634c f398634b;

    /* renamed from: c */
    private final C147620aa f398635c;

    public C147725g(C147634c cVar, C147620aa aaVar) {
        this.f398634b = cVar;
        this.f398635c = aaVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo124425a() {
        mo124426b();
        C58838bb.m90884s(this.f398633a.mo56113h(), "Future uninitialized.");
        return (C60870cx) this.f398633a.mo56107c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo124426b() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.common.base.ax r0 = r5.f398633a     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x0072 }
            r1 = 2
            r2 = 3
            if (r0 != 0) goto L_0x000d
            r0 = 1
            goto L_0x0023
        L_0x000d:
            com.google.common.base.ax r0 = r5.f398633a     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x0072 }
            com.google.common.util.concurrent.cx r0 = (com.google.common.util.concurrent.C60870cx) r0     // Catch:{ all -> 0x0072 }
            boolean r3 = r0.isDone()     // Catch:{ all -> 0x0072 }
            if (r3 != 0) goto L_0x001d
            r0 = 2
            goto L_0x0023
        L_0x001d:
            r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0022 }
            r0 = 3
            goto L_0x0023
        L_0x0022:
            r0 = 4
        L_0x0023:
            if (r0 == r2) goto L_0x0070
            if (r0 != r1) goto L_0x0028
            goto L_0x0070
        L_0x0028:
            com.google.android.libraries.ak.b.c r0 = r5.f398634b     // Catch:{ all -> 0x0072 }
            d.b.a.a.t r1 = p5285d.p5290b.p5291a.p5292a.C68207t.f184558b     // Catch:{ all -> 0x0072 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x0072 }
            d.b.a.a.s r1 = (p5285d.p5290b.p5291a.p5292a.C68206s) r1     // Catch:{ all -> 0x0072 }
            com.google.android.libraries.ak.aa r2 = r5.f398635c     // Catch:{ all -> 0x0072 }
            d.b.a.a.ab r2 = com.google.android.libraries.p11016ak.p11017a.C147618g.m240688b(r2)     // Catch:{ all -> 0x0072 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0072 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0072 }
            d.b.a.a.t r3 = (p5285d.p5290b.p5291a.p5292a.C68207t) r3     // Catch:{ all -> 0x0072 }
            r2.getClass()     // Catch:{ all -> 0x0072 }
            r3.f184560a = r2     // Catch:{ all -> 0x0072 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x0072 }
            d.b.a.a.t r1 = (p5285d.p5290b.p5291a.p5292a.C68207t) r1     // Catch:{ all -> 0x0072 }
            d.b.a.a.aq r2 = r0.f398472a     // Catch:{ all -> 0x0072 }
            com.google.android.libraries.ak.ak r0 = r0.f398473b     // Catch:{ all -> 0x0072 }
            com.google.protobuf.ar r0 = r0.f398464d     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0054
            com.google.protobuf.ar r0 = com.google.protobuf.C62910ar.f169858c     // Catch:{ all -> 0x0072 }
        L_0x0054:
            long r3 = com.google.protobuf.p4750c.C62948a.m95453d(r0)     // Catch:{ all -> 0x0072 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0072 }
            io.grpc.i.e r0 = r2.mo62575n(r3, r0)     // Catch:{ all -> 0x0072 }
            d.b.a.a.aq r0 = (p5285d.p5290b.p5291a.p5292a.C68154aq) r0     // Catch:{ all -> 0x0072 }
            com.google.common.util.concurrent.cx r0 = r0.mo60279b(r1)     // Catch:{ all -> 0x0072 }
            com.google.common.util.concurrent.cx r0 = com.google.android.libraries.p11016ak.p11018b.C147634c.m240700a(r0, r1)     // Catch:{ all -> 0x0072 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ all -> 0x0072 }
            r5.f398633a = r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r5)
            return
        L_0x0070:
            monitor-exit(r5)
            return
        L_0x0072:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p11016ak.C147725g.mo124426b():void");
    }
}
