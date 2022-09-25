package com.google.android.libraries.gsa.p1934s3.lib;

import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.libraries.gsa.s3.lib.f */
/* compiled from: PG */
final class C23330f extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private Tee f63867a;

    /* renamed from: b */
    private final int f63868b;

    public C23330f(Tee tee, int i) {
        this.f63867a = tee;
        this.f63868b = i;
    }

    public final synchronized void close() {
        Tee tee = this.f63867a;
        if (tee != null) {
            tee.mo28825c(this.f63868b);
            this.f63867a = null;
        }
    }

    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        r4 = r4 - r6;
        r5 = r11 - r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        if (r4 < r5) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0.mo28824b(r6, r9, r10 + r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x003f, code lost:
        r11 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r9, int r10, int r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.libraries.gsa.s3.lib.Tee r0 = r8.f63867a     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0071
            int r1 = r8.f63868b     // Catch:{ all -> 0x007c }
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x000a:
            monitor-enter(r0)     // Catch:{ all -> 0x007c }
            int[] r5 = r0.f63861l     // Catch:{ all -> 0x006e }
            r5 = r5[r1]     // Catch:{ all -> 0x006e }
        L_0x000f:
            com.google.android.apps.gsa.shared.q.d r5 = r0.f63860k     // Catch:{ all -> 0x006e }
            if (r5 != 0) goto L_0x006d
            int[] r5 = r0.f63861l     // Catch:{ all -> 0x006e }
            r6 = r5[r1]     // Catch:{ all -> 0x006e }
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 != r7) goto L_0x001f
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            r11 = 0
            goto L_0x0040
        L_0x001f:
            if (r4 == 0) goto L_0x0024
            int r6 = r6 + r4
            r5[r1] = r6     // Catch:{ all -> 0x006e }
        L_0x0024:
            if (r3 != r11) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            goto L_0x0040
        L_0x0028:
            int r4 = r0.f63858i     // Catch:{ all -> 0x006e }
            if (r4 == r6) goto L_0x003a
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            int r4 = r4 - r6
            int r5 = r11 - r3
            if (r4 < r5) goto L_0x0033
            r4 = r5
        L_0x0033:
            int r5 = r10 + r3
            r0.mo28824b(r6, r9, r5, r4)     // Catch:{ all -> 0x007c }
            int r3 = r3 + r4
            goto L_0x000a
        L_0x003a:
            boolean r4 = r0.f63859j     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x0046
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            r11 = r3
        L_0x0040:
            monitor-exit(r8)
            if (r11 != 0) goto L_0x0045
            r9 = -1
            return r9
        L_0x0045:
            return r11
        L_0x0046:
            r0.wait()     // Catch:{ InterruptedException -> 0x004b }
            r4 = 0
            goto L_0x000f
        L_0x004b:
            r9 = move-exception
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x006e }
            r10.interrupt()     // Catch:{ all -> 0x006e }
            com.google.android.apps.gsa.shared.q.d r10 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x006e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r11.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r2 = "Interrupted waiting for buffers: "
            r11.append(r2)     // Catch:{ all -> 0x006e }
            r11.append(r1)     // Catch:{ all -> 0x006e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x006e }
            r1 = 393236(0x60014, float:5.51041E-40)
            r10.<init>(r11, r9, r1)     // Catch:{ all -> 0x006e }
            throw r10     // Catch:{ all -> 0x006e }
        L_0x006d:
            throw r5     // Catch:{ all -> 0x006e }
        L_0x006e:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            throw r9     // Catch:{ all -> 0x007c }
        L_0x0071:
            com.google.android.apps.gsa.shared.q.d r9 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x007c }
            java.lang.String r10 = "Secondary Tee stream closed."
            r11 = 393239(0x60017, float:5.51045E-40)
            r9.<init>((java.lang.String) r10, (int) r11)     // Catch:{ all -> 0x007c }
            throw r9     // Catch:{ all -> 0x007c }
        L_0x007c:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x0080
        L_0x007f:
            throw r9
        L_0x0080:
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1934s3.lib.C23330f.read(byte[], int, int):int");
    }
}
