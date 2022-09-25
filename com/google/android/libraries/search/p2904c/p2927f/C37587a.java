package com.google.android.libraries.search.p2904c.p2927f;

import com.google.android.libraries.search.p2904c.C37321a;
import com.google.android.libraries.search.p2904c.p2951n.C37899a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.libraries.search.c.f.a */
/* compiled from: PG */
public final class C37587a extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final C60870cx f99870a;

    /* renamed from: b */
    private C37321a f99871b;

    /* renamed from: c */
    private final AtomicBoolean f99872c = new AtomicBoolean(false);

    /* renamed from: d */
    private int f99873d;

    public C37587a(C60870cx cxVar) {
        this.f99870a = cxVar;
    }

    /* renamed from: a */
    private final void m66581a() {
        if (this.f99871b == null) {
            try {
                C58833ax axVar = (C58833ax) this.f99870a.get(30, TimeUnit.SECONDS);
                if (axVar.mo56113h()) {
                    this.f99871b = (C37321a) axVar.mo56107c();
                    return;
                }
                throw new C37899a("No AudioAccessor provided", new NoSuchElementException());
            } catch (TimeoutException e) {
                throw new C37899a("Initialization timed out", e);
            } catch (ExecutionException e2) {
                if (e2.getCause() == null) {
                    throw new C37899a("Initialization failed", e2);
                }
                throw new C37899a("Initialization failed", e2.getCause());
            } catch (CancellationException e3) {
                throw new C37899a("Initialization failed", e3);
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new C37899a("Initialization interrupted", e4);
            }
        }
    }

    public final void close() {
        this.f99872c.set(true);
    }

    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    public final long skip(long j) {
        this.f99873d += (int) j;
        return j;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f99872c     // Catch:{ all -> 0x006d }
            boolean r0 = r0.get()     // Catch:{ all -> 0x006d }
            r1 = -1
            if (r0 == 0) goto L_0x001a
            com.google.common.f.e r7 = com.google.android.libraries.search.p2904c.p2927f.C37588b.f99874a     // Catch:{ all -> 0x006d }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x006d }
            java.lang.String r8 = "#audio# read failed: stream closed."
            r9 = 52749(0xce0d, float:7.3917E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)     // Catch:{ all -> 0x006d }
            monitor-exit(r6)
            return r1
        L_0x001a:
            r6.m66581a()     // Catch:{ all -> 0x006d }
            int r0 = r7.length     // Catch:{ all -> 0x006d }
            int r9 = java.lang.Math.min(r9, r0)     // Catch:{ all -> 0x006d }
            r0 = 0
        L_0x0023:
            if (r0 >= r9) goto L_0x003a
            com.google.android.libraries.search.c.a r2 = r6.f99871b     // Catch:{ all -> 0x006d }
            int r3 = r6.f99873d     // Catch:{ all -> 0x006d }
            int r3 = r3 + r0
            int r4 = r8 + r0
            int r5 = r9 - r0
            int r2 = r2.mo40879a(r7, r3, r4, r5)     // Catch:{ all -> 0x006d }
            if (r2 >= 0) goto L_0x0038
            if (r0 != 0) goto L_0x003a
            r0 = -1
            goto L_0x003a
        L_0x0038:
            int r0 = r0 + r2
            goto L_0x0023
        L_0x003a:
            if (r0 >= 0) goto L_0x0066
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f99872c     // Catch:{ all -> 0x006d }
            boolean r7 = r7.get()     // Catch:{ all -> 0x006d }
            if (r7 != 0) goto L_0x0056
            com.google.common.f.e r7 = com.google.android.libraries.search.p2904c.p2927f.C37588b.f99874a     // Catch:{ all -> 0x006d }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x006d }
            java.lang.String r8 = "#audio# read failed: read EOF from AudioAccessor."
            r9 = 52748(0xce0c, float:7.3916E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)     // Catch:{ all -> 0x006d }
            r6.close()     // Catch:{ all -> 0x006d }
            goto L_0x0064
        L_0x0056:
            com.google.common.f.e r7 = com.google.android.libraries.search.p2904c.p2927f.C37588b.f99874a     // Catch:{ all -> 0x006d }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ all -> 0x006d }
            java.lang.String r8 = "#audio# AudioAccessor reached EOF."
            r9 = 52747(0xce0b, float:7.3914E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)     // Catch:{ all -> 0x006d }
        L_0x0064:
            monitor-exit(r6)
            return r1
        L_0x0066:
            int r7 = r6.f99873d     // Catch:{ all -> 0x006d }
            int r7 = r7 + r0
            r6.f99873d = r7     // Catch:{ all -> 0x006d }
            monitor-exit(r6)
            return r0
        L_0x006d:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0071
        L_0x0070:
            throw r7
        L_0x0071:
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2927f.C37587a.read(byte[], int, int):int");
    }
}
