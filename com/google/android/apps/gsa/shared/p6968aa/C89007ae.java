package com.google.android.apps.gsa.shared.p6968aa;

import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.shared.aa.ae */
/* compiled from: PG */
public final class C89007ae extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public final C89006ad f241201a;

    /* renamed from: b */
    private final byte[] f241202b = new byte[1];

    public C89007ae(C89068x xVar) {
        this.f241201a = new C89006ad(xVar);
    }

    public final int available() {
        return this.f241201a.mo82976a();
    }

    public final void close() {
        this.f241201a.mo82977b();
    }

    public final int read() {
        if (read(this.f241202b, 0, 1) == 1) {
            return this.f241202b[0] & 255;
        }
        return -1;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            com.google.android.apps.gsa.shared.aa.ad r0 = r4.f241201a
            boolean r1 = r0.f241200c
            if (r1 != 0) goto L_0x0052
            com.google.android.apps.gsa.shared.aa.g r1 = r0.f241199b
            if (r1 == 0) goto L_0x0022
            int r2 = r1.f241330b
            r3 = 1
            if (r2 != r3) goto L_0x001f
            int r1 = r1.mo83020a()
            if (r1 <= 0) goto L_0x0016
            goto L_0x001f
        L_0x0016:
            com.google.android.apps.gsa.shared.aa.g r1 = r0.f241199b
            r1.mo83024e()
            r1 = 0
            r0.f241199b = r1
            goto L_0x0022
        L_0x001f:
            com.google.android.apps.gsa.shared.aa.g r0 = r0.f241199b
            goto L_0x0032
        L_0x0022:
            com.google.android.apps.gsa.shared.aa.x r1 = r0.f241198a     // Catch:{ InterruptedException -> 0x0048, ExecutionException -> 0x0037 }
            com.google.common.util.concurrent.cx r1 = r1.mo27472b()     // Catch:{ InterruptedException -> 0x0048, ExecutionException -> 0x0037 }
            java.lang.Object r1 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r1)     // Catch:{ InterruptedException -> 0x0048, ExecutionException -> 0x0037 }
            com.google.android.apps.gsa.shared.aa.g r1 = (com.google.android.apps.gsa.shared.p6968aa.C89051g) r1     // Catch:{ InterruptedException -> 0x0048, ExecutionException -> 0x0037 }
            r0.f241199b = r1     // Catch:{ InterruptedException -> 0x0048, ExecutionException -> 0x0037 }
            com.google.android.apps.gsa.shared.aa.g r0 = r0.f241199b
        L_0x0032:
            int r5 = r0.mo83021b(r5, r6, r7)
            return r5
        L_0x0037:
            r5 = move-exception
            java.lang.Throwable r6 = r5.getCause()
            if (r6 == 0) goto L_0x003f
            r5 = r6
        L_0x003f:
            com.google.common.base.C58887cx.m90980g(r5)
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L_0x0048:
            r5 = move-exception
            com.google.android.apps.gsa.shared.q.d r6 = new com.google.android.apps.gsa.shared.q.d
            r7 = 262192(0x40030, float:3.67409E-40)
            r6.<init>((java.lang.Throwable) r5, (int) r7)
            throw r6
        L_0x0052:
            com.google.android.apps.gsa.shared.q.d r5 = new com.google.android.apps.gsa.shared.q.d
            r6 = 262191(0x4002f, float:3.67408E-40)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p6968aa.C89007ae.read(byte[], int, int):int");
    }
}
