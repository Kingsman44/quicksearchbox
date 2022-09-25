package com.google.android.libraries.gsa.p1934s3.lib;

import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4534f.C59081b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.libraries.gsa.s3.lib.e */
/* compiled from: PG */
final class C23329e extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    final /* synthetic */ Tee f63866a;

    public C23329e(Tee tee) {
        this.f63866a = tee;
    }

    public final void close() {
        C59081b.m91349a(C58979ad.FULL, "stack size");
        this.f63866a.mo28825c(0);
        Tee tee = this.f63866a;
        try {
            tee.f63851b.close();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) Tee.f63850a.mo56225c()).mo56382g(e)).mo56372aa(48644)).mo56386p("IOException closing audio track");
        }
        synchronized (tee) {
            tee.f63859j = true;
            tee.notifyAll();
        }
    }

    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c9, code lost:
        if (r6 != r10) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cb, code lost:
        r7 = r2.f63856g.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ce, code lost:
        if (r6 >= r7) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d0, code lost:
        r11 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d2, code lost:
        r11 = r6 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00d7, code lost:
        if ((r7 - r11) < r2.f63852c) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00da, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00db, code lost:
        com.google.common.base.C58838bb.m90868c(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r7 = com.google.common.p4541l.C59332o.m92210a(r2.f63851b, r2.f63856g, r11, r2.f63852c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00e8, code lost:
        r6 = r6 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00eb, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r2.f63860k = new com.google.android.apps.gsa.shared.p7127q.C90457d((java.lang.Throwable) r0, (int) com.google.android.apps.gsa.shared.logger.p7054d.C89885b.AUDIO_TEE_READ_FROM_DELEGATE_VALUE);
        r2.notifyAll();
        r0 = r2.f63860k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00fb, code lost:
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0102, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0103, code lost:
        r6 = r6 - r10;
        r9 = r0 - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0106, code lost:
        if (r6 < r9) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0108, code lost:
        r6 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r16, int r17, int r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r18
            com.google.android.libraries.gsa.s3.lib.Tee r2 = r1.f63866a
            byte[] r3 = r2.f63856g
            int r3 = r3.length
            r4 = 0
            r5 = -1
            r6 = 0
            r7 = -1
            r8 = 0
        L_0x000d:
            monitor-enter(r2)
            com.google.android.apps.gsa.shared.q.d r9 = r2.f63860k     // Catch:{ all -> 0x0114 }
            if (r9 != 0) goto L_0x0113
            int[] r9 = r2.f63861l     // Catch:{ all -> 0x0114 }
            r10 = r9[r4]     // Catch:{ all -> 0x0114 }
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r10 != r11) goto L_0x0023
            if (r7 == r5) goto L_0x0021
            int r0 = r8 - r6
            monitor-exit(r2)     // Catch:{ all -> 0x0114 }
            goto L_0x0047
        L_0x0021:
            monitor-exit(r2)     // Catch:{ all -> 0x0114 }
            goto L_0x0046
        L_0x0023:
            if (r6 == 0) goto L_0x0028
            int r10 = r10 + r6
            r9[r4] = r10     // Catch:{ all -> 0x0114 }
        L_0x0028:
            int r6 = r2.f63858i     // Catch:{ all -> 0x0114 }
            r9 = 1
            if (r7 == r5) goto L_0x003b
            int r6 = r6 + r7
            r2.f63858i = r6     // Catch:{ all -> 0x0114 }
            r2.notifyAll()     // Catch:{ all -> 0x0114 }
            int r12 = r2.f63852c     // Catch:{ all -> 0x0114 }
            if (r7 >= r12) goto L_0x003b
            r2.f63859j = r9     // Catch:{ all -> 0x0114 }
            monitor-exit(r2)     // Catch:{ all -> 0x0114 }
            goto L_0x0046
        L_0x003b:
            if (r8 != r0) goto L_0x003f
            monitor-exit(r2)     // Catch:{ all -> 0x0114 }
            goto L_0x0047
        L_0x003f:
            if (r6 != r10) goto L_0x00c8
            boolean r7 = r2.f63859j     // Catch:{ all -> 0x0114 }
            if (r7 == 0) goto L_0x004b
            monitor-exit(r2)     // Catch:{ all -> 0x0114 }
        L_0x0046:
            r0 = r8
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            return r5
        L_0x004a:
            return r0
        L_0x004b:
            int r7 = r2.f63852c     // Catch:{ all -> 0x0114 }
            int r7 = r7 + r6
            int r12 = r2.f63857h     // Catch:{ all -> 0x0114 }
            int r7 = r7 - r12
            if (r7 <= r3) goto L_0x00c8
            int[] r6 = r2.f63861l     // Catch:{ all -> 0x0114 }
            r6 = r6[r4]     // Catch:{ all -> 0x0114 }
            int r7 = r2.f63853d     // Catch:{ all -> 0x0114 }
            if (r6 < r7) goto L_0x005d
            r6 = 1
            goto L_0x005e
        L_0x005d:
            r6 = 0
        L_0x005e:
            com.google.common.base.C58838bb.m90868c(r6)     // Catch:{ all -> 0x0114 }
            int[] r6 = r2.f63861l     // Catch:{ all -> 0x0114 }
            r7 = r6[r4]     // Catch:{ all -> 0x0114 }
            int r10 = r2.f63853d     // Catch:{ all -> 0x0114 }
            int r7 = r7 - r10
            int r10 = r6.length     // Catch:{ all -> 0x0114 }
            r12 = 0
            r13 = 2147483647(0x7fffffff, float:NaN)
        L_0x006d:
            if (r12 >= r10) goto L_0x0077
            r14 = r6[r12]     // Catch:{ all -> 0x0114 }
            if (r14 >= r13) goto L_0x0074
            r13 = r14
        L_0x0074:
            int r12 = r12 + 1
            goto L_0x006d
        L_0x0077:
            int r6 = r2.f63858i     // Catch:{ all -> 0x0114 }
            if (r13 > r6) goto L_0x007d
            r6 = 1
            goto L_0x007e
        L_0x007d:
            r6 = 0
        L_0x007e:
            com.google.common.base.C58838bb.m90883r(r6)     // Catch:{ all -> 0x0114 }
            int r6 = java.lang.Math.min(r13, r7)     // Catch:{ all -> 0x0114 }
            byte[] r7 = r2.f63856g     // Catch:{ all -> 0x0114 }
            int r7 = r7.length     // Catch:{ all -> 0x0114 }
            int r10 = r2.f63858i     // Catch:{ all -> 0x0114 }
            int r12 = r2.f63852c     // Catch:{ all -> 0x0114 }
            int r10 = r10 + r12
            int r10 = r10 - r6
            if (r10 > r7) goto L_0x00b9
            r2.f63862m = r9     // Catch:{ all -> 0x0114 }
            if (r6 < r7) goto L_0x00b1
            r10 = 0
        L_0x0095:
            int[] r12 = r2.f63861l     // Catch:{ all -> 0x0114 }
            int r13 = r12.length     // Catch:{ all -> 0x0114 }
            if (r10 == r13) goto L_0x00a4
            r13 = r12[r10]     // Catch:{ all -> 0x0114 }
            if (r13 == r11) goto L_0x00a1
            int r13 = r13 - r7
            r12[r10] = r13     // Catch:{ all -> 0x0114 }
        L_0x00a1:
            int r10 = r10 + 1
            goto L_0x0095
        L_0x00a4:
            int r6 = r6 - r7
            int r10 = r2.f63858i     // Catch:{ all -> 0x0114 }
            int r10 = r10 - r7
            r2.f63858i = r10     // Catch:{ all -> 0x0114 }
            int r10 = r2.f63855f     // Catch:{ all -> 0x0114 }
            if (r10 < r7) goto L_0x00b1
            int r10 = r10 - r7
            r2.f63855f = r10     // Catch:{ all -> 0x0114 }
        L_0x00b1:
            r2.f63857h = r6     // Catch:{ all -> 0x0114 }
            int[] r6 = r2.f63861l     // Catch:{ all -> 0x0114 }
            r10 = r6[r4]     // Catch:{ all -> 0x0114 }
            r6 = r10
            goto L_0x00c8
        L_0x00b9:
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x0114 }
            java.lang.String r3 = "Buffer overflow, no available space."
            r4 = 393238(0x60016, float:5.51044E-40)
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0114 }
            r2.f63860k = r0     // Catch:{ all -> 0x0114 }
            com.google.android.apps.gsa.shared.q.d r0 = r2.f63860k     // Catch:{ all -> 0x0114 }
            throw r0     // Catch:{ all -> 0x0114 }
        L_0x00c8:
            monitor-exit(r2)     // Catch:{ all -> 0x0114 }
            if (r6 != r10) goto L_0x0102
            byte[] r7 = r2.f63856g
            int r7 = r7.length
            if (r6 >= r7) goto L_0x00d2
            r11 = r6
            goto L_0x00d4
        L_0x00d2:
            int r11 = r6 - r7
        L_0x00d4:
            int r7 = r7 - r11
            int r12 = r2.f63852c
            if (r7 < r12) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r9 = 0
        L_0x00db:
            com.google.common.base.C58838bb.m90868c(r9)
            java.io.InputStream r7 = r2.f63851b     // Catch:{ IOException -> 0x00ea }
            byte[] r9 = r2.f63856g     // Catch:{ IOException -> 0x00ea }
            int r12 = r2.f63852c     // Catch:{ IOException -> 0x00ea }
            int r7 = com.google.common.p4541l.C59332o.m92210a(r7, r9, r11, r12)     // Catch:{ IOException -> 0x00ea }
            int r6 = r6 + r7
            goto L_0x0103
        L_0x00ea:
            r0 = move-exception
            monitor-enter(r2)
            com.google.android.apps.gsa.shared.q.d r3 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x00ff }
            r4 = 393237(0x60015, float:5.51042E-40)
            r3.<init>((java.lang.Throwable) r0, (int) r4)     // Catch:{ all -> 0x00ff }
            r2.f63860k = r3     // Catch:{ all -> 0x00ff }
            r2.notifyAll()     // Catch:{ all -> 0x00ff }
            com.google.android.apps.gsa.shared.q.d r0 = r2.f63860k     // Catch:{ all -> 0x00ff }
            r0.getClass()
            throw r0     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ff }
            throw r0
        L_0x0102:
            r7 = -1
        L_0x0103:
            int r6 = r6 - r10
            int r9 = r0 - r8
            if (r6 < r9) goto L_0x0109
            r6 = r9
        L_0x0109:
            int r9 = r17 + r8
            r11 = r16
            r2.mo28824b(r10, r11, r9, r6)
            int r8 = r8 + r6
            goto L_0x000d
        L_0x0113:
            throw r9     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0114 }
            goto L_0x0118
        L_0x0117:
            throw r0
        L_0x0118:
            goto L_0x0117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1934s3.lib.C23329e.read(byte[], int, int):int");
    }
}
