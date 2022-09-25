package com.google.android.apps.gsa.nga.shared.p6364s3.p6366b;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81499q;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.b.b */
/* compiled from: PG */
public final class C81505b extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private static final C58974d f222926a = C58974d.m91136j();

    /* renamed from: b */
    private final Object f222927b = new Object();

    /* renamed from: c */
    private final C81499q f222928c;

    /* renamed from: d */
    private ByteBuffer f222929d = ByteBuffer.allocate(0);

    public C81505b(C81499q qVar) {
        this.f222928c = qVar;
    }

    public final void close() {
        super.close();
        try {
            this.f222928c.mo72800a();
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222926a.mo56226d()).mo56382g(e)).mo56372aa(6118)).mo56386p("close failed, ignoring (best effort)");
        }
    }

    public final int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        return read < 0 ? read : bArr[0] & 255;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f222927b
            monitor-enter(r0)
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r10 <= 0) goto L_0x0082
            java.nio.ByteBuffer r3 = r7.f222929d     // Catch:{ all -> 0x0080 }
            int r3 = r3.remaining()     // Catch:{ all -> 0x0080 }
            if (r3 != 0) goto L_0x006b
            com.google.common.util.concurrent.SettableFuture r3 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x0042, TimeoutException -> 0x0040 }
            r3.<init>()     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x0042, TimeoutException -> 0x0040 }
            com.google.android.apps.gsa.nga.shared.s3.aidl.q r4 = r7.f222928c     // Catch:{ RemoteException -> 0x001f }
            com.google.android.apps.gsa.nga.shared.s3.b.a r5 = new com.google.android.apps.gsa.nga.shared.s3.b.a     // Catch:{ RemoteException -> 0x001f }
            r5.<init>(r3)     // Catch:{ RemoteException -> 0x001f }
            r4.mo72801b(r5)     // Catch:{ RemoteException -> 0x001f }
            goto L_0x0033
        L_0x001f:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x0042, TimeoutException -> 0x0040 }
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x0042, TimeoutException -> 0x0040 }
            r6[r1] = r4     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x0042, TimeoutException -> 0x0040 }
            java.lang.String r4 = "Remote crashed: %s"
            java.lang.String r4 = java.lang.String.format(r4, r6)     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x0042, TimeoutException -> 0x0040 }
            r5.<init>(r4)     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x0042, TimeoutException -> 0x0040 }
            r3.mo57357o(r5)     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x0042, TimeoutException -> 0x0040 }
        L_0x0033:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x0042, TimeoutException -> 0x0040 }
            r5 = 5
            java.lang.Object r3 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148473g(r3, r5, r4)     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x0042, TimeoutException -> 0x0040 }
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x0042, TimeoutException -> 0x0040 }
            r7.f222929d = r3     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x0042, TimeoutException -> 0x0040 }
            goto L_0x006b
        L_0x0040:
            r8 = move-exception
            goto L_0x0043
        L_0x0042:
            r8 = move-exception
        L_0x0043:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0080 }
            java.lang.String r10 = "Read interrupted"
            r9.<init>(r10, r8)     // Catch:{ all -> 0x0080 }
            throw r9     // Catch:{ all -> 0x0080 }
        L_0x004b:
            r8 = move-exception
            java.lang.Throwable r9 = r8.getCause()     // Catch:{ all -> 0x0080 }
            boolean r9 = r9 instanceof java.io.EOFException     // Catch:{ all -> 0x0080 }
            if (r9 != 0) goto L_0x0082
            java.lang.Throwable r9 = r8.getCause()     // Catch:{ all -> 0x0080 }
            boolean r9 = r9 instanceof java.io.IOException     // Catch:{ all -> 0x0080 }
            if (r9 == 0) goto L_0x0063
            java.lang.Throwable r8 = r8.getCause()     // Catch:{ all -> 0x0080 }
            java.io.IOException r8 = (java.io.IOException) r8     // Catch:{ all -> 0x0080 }
            throw r8     // Catch:{ all -> 0x0080 }
        L_0x0063:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0080 }
            java.lang.String r10 = "Read failed"
            r9.<init>(r10, r8)     // Catch:{ all -> 0x0080 }
            throw r9     // Catch:{ all -> 0x0080 }
        L_0x006b:
            java.nio.ByteBuffer r3 = r7.f222929d     // Catch:{ all -> 0x0080 }
            int r3 = r3.remaining()     // Catch:{ all -> 0x0080 }
            int r3 = java.lang.Math.min(r3, r10)     // Catch:{ all -> 0x0080 }
            if (r3 <= 0) goto L_0x0005
            java.nio.ByteBuffer r4 = r7.f222929d     // Catch:{ all -> 0x0080 }
            r4.get(r8, r9, r3)     // Catch:{ all -> 0x0080 }
            int r9 = r9 + r3
            int r2 = r2 + r3
            int r10 = r10 - r3
            goto L_0x0005
        L_0x0080:
            r8 = move-exception
            goto L_0x008b
        L_0x0082:
            if (r10 <= 0) goto L_0x0089
            if (r2 != 0) goto L_0x0089
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            r8 = -1
            return r8
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            return r2
        L_0x008b:
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            goto L_0x008e
        L_0x008d:
            throw r8
        L_0x008e:
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6364s3.p6366b.C81505b.read(byte[], int, int):int");
    }
}
