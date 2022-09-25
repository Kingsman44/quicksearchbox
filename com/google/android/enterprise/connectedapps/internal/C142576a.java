package com.google.android.enterprise.connectedapps.internal;

import android.os.Bundle;
import android.os.TransactionTooLargeException;
import android.util.Log;

/* renamed from: com.google.android.enterprise.connectedapps.internal.a */
/* compiled from: PG */
abstract class C142576a {
    /* renamed from: f */
    private final byte[] m231195f(long j, int i, byte[] bArr) {
        int i2 = 10;
        while (true) {
            try {
                return mo117204b(j, i, bArr);
            } catch (TransactionTooLargeException e) {
                int i3 = i2 - 1;
                if (i2 > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e2) {
                        Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                    }
                    i2 = i3;
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: g */
    private final byte[] m231196g(long j, int i) {
        int i2 = 10;
        while (true) {
            try {
                return mo117205c(j, i);
            } catch (TransactionTooLargeException e) {
                int i3 = i2 - 1;
                if (i2 > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e2) {
                        Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                    }
                    i2 = i3;
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: h */
    private final Bundle m231197h(long j) {
        int i = 10;
        while (true) {
            try {
                Bundle d = mo117206d(j);
                d.setClassLoader(Bundler.class.getClassLoader());
                return d;
            } catch (TransactionTooLargeException e) {
                int i2 = i - 1;
                if (i > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e2) {
                        Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                    }
                    i = i2;
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: i */
    private final void m231198i(long j, Bundle bundle) {
        int i = 10;
        while (true) {
            try {
                mo117207e(j, bundle);
                return;
            } catch (TransactionTooLargeException e) {
                int i2 = i - 1;
                if (i > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e2) {
                        Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                    }
                    i = i2;
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: j */
    private final void m231199j(long j, int i, int i2, byte[] bArr) {
        int i3 = 10;
        while (true) {
            try {
                mo117203a(j, i, i2, bArr);
                return;
            } catch (TransactionTooLargeException e) {
                int i4 = i3 - 1;
                if (i3 > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e2) {
                        Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                    }
                    i3 = i4;
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    public abstract void mo117203a(long j, int i, int i2, byte[] bArr);

    /* renamed from: b */
    public abstract byte[] mo117204b(long j, int i, byte[] bArr);

    /* renamed from: c */
    public abstract byte[] mo117205c(long j, int i);

    /* renamed from: d */
    public abstract Bundle mo117206d(long j);

    /* renamed from: e */
    public abstract void mo117207e(long j, Bundle bundle);

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0109, code lost:
        throw new com.google.android.enterprise.connectedapps.p10715b.C142562c("Error passing bundle for call", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010a, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        m231198i(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r0 = new byte[]{2};
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle makeBundleCall(android.os.Bundle r20) {
        /*
            r19 = this;
            r7 = r19
            r0 = r20
            java.lang.String r8 = "Could not access other profile"
            java.util.UUID r1 = java.util.UUID.randomUUID()
            long r9 = r1.getMostSignificantBits()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r11 = 0
            r0.writeToParcel(r1, r11)
            r1.setDataPosition(r11)
            r12 = 1
            byte[] r0 = r1.marshall()     // Catch:{ AssertionError | RuntimeException -> 0x0025 }
        L_0x001e:
            r1.recycle()
            goto L_0x002e
        L_0x0022:
            r0 = move-exception
            goto L_0x010a
        L_0x0025:
            r7.m231198i(r9, r0)     // Catch:{ RemoteException -> 0x0100 }
            byte[] r0 = new byte[r12]     // Catch:{ all -> 0x0022 }
            r2 = 2
            r0[r11] = r2     // Catch:{ all -> 0x0022 }
            goto L_0x001e
        L_0x002e:
            int r1 = r0.length     // Catch:{ RemoteException -> 0x00f9 }
            double r1 = (double) r1
            r13 = 4687829947429945344(0x410e848000000000, double:250000.0)
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r13
            double r1 = java.lang.Math.ceil(r1)     // Catch:{ RemoteException -> 0x00f9 }
            int r15 = (int) r1     // Catch:{ RemoteException -> 0x00f9 }
            r6 = 250000(0x3d090, float:3.50325E-40)
            if (r15 <= r12) goto L_0x007f
            byte[] r5 = new byte[r6]     // Catch:{ RemoteException -> 0x00f9 }
            r4 = 0
        L_0x0046:
            int r1 = r15 + -1
            if (r4 >= r1) goto L_0x0070
            int r1 = r4 * r6
            java.lang.System.arraycopy(r0, r1, r5, r11, r6)     // Catch:{ RemoteException -> 0x00f9 }
            int r2 = r0.length     // Catch:{ RemoteException -> 0x00f9 }
            r1 = r19
            r16 = r2
            r2 = r9
            r17 = r4
            r18 = r5
            r5 = r16
            r13 = 250000(0x3d090, float:3.50325E-40)
            r6 = r18
            r1.m231199j(r2, r4, r5, r6)     // Catch:{ RemoteException -> 0x00f9 }
            int r4 = r17 + 1
            r5 = r18
            r6 = 250000(0x3d090, float:3.50325E-40)
            r13 = 4687829947429945344(0x410e848000000000, double:250000.0)
            goto L_0x0046
        L_0x0070:
            r17 = r4
            r13 = 250000(0x3d090, float:3.50325E-40)
            int r4 = r17 * r13
            int r1 = r0.length     // Catch:{ RemoteException -> 0x00f9 }
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r4, r1)     // Catch:{ RemoteException -> 0x00f9 }
            r4 = r17
            goto L_0x0083
        L_0x007f:
            r13 = 250000(0x3d090, float:3.50325E-40)
            r4 = 0
        L_0x0083:
            byte[] r0 = r7.m231195f(r9, r4, r0)     // Catch:{ RemoteException -> 0x00f9 }
            int r1 = r0.length
            if (r1 != 0) goto L_0x008c
            r0 = 0
            return r0
        L_0x008c:
            boolean r1 = com.google.android.enterprise.connectedapps.internal.BundleCallReceiver.m231179b(r0)
            if (r1 == 0) goto L_0x00a1
            android.os.Bundle r0 = r7.m231197h(r9)     // Catch:{ RemoteException -> 0x0097 }
            return r0
        L_0x0097:
            r0 = move-exception
            r1 = r0
            com.google.android.enterprise.connectedapps.b.c r0 = new com.google.android.enterprise.connectedapps.b.c
            java.lang.String r2 = "Error fetching bundle for response"
            r0.<init>(r2, r1)
            throw r0
        L_0x00a1:
            byte r1 = r0[r11]
            if (r1 != r12) goto L_0x00db
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
            int r1 = r1.getInt(r12)
            byte[] r2 = new byte[r1]     // Catch:{ RemoteException -> 0x00d4 }
            r3 = 5
            java.lang.System.arraycopy(r0, r3, r2, r11, r13)     // Catch:{ RemoteException -> 0x00d4 }
            double r0 = (double) r1
            java.lang.Double.isNaN(r0)
            r3 = 4687829947429945344(0x410e848000000000, double:250000.0)
            double r0 = r0 / r3
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ RemoteException -> 0x00d4 }
            int r0 = (int) r0     // Catch:{ RemoteException -> 0x00d4 }
        L_0x00c2:
            if (r12 >= r0) goto L_0x00d1
            byte[] r1 = r7.m231196g(r9, r12)     // Catch:{ RemoteException -> 0x00d4 }
            int r6 = r12 * r13
            int r3 = r1.length     // Catch:{ RemoteException -> 0x00d4 }
            java.lang.System.arraycopy(r1, r11, r2, r6, r3)     // Catch:{ RemoteException -> 0x00d4 }
            int r12 = r12 + 1
            goto L_0x00c2
        L_0x00d1:
            r0 = r2
            r12 = 0
            goto L_0x00db
        L_0x00d4:
            r0 = move-exception
            com.google.android.enterprise.connectedapps.b.c r1 = new com.google.android.enterprise.connectedapps.b.c
            r1.<init>(r8, r0)
            throw r1
        L_0x00db:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r0.length
            int r2 = r2 - r12
            r1.unmarshall(r0, r12, r2)
            r1.setDataPosition(r11)
            android.os.Bundle r0 = new android.os.Bundle
            java.lang.Class<com.google.android.enterprise.connectedapps.internal.Bundler> r2 = com.google.android.enterprise.connectedapps.internal.Bundler.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r0.<init>(r2)
            r0.readFromParcel(r1)
            r1.recycle()
            return r0
        L_0x00f9:
            r0 = move-exception
            com.google.android.enterprise.connectedapps.b.c r1 = new com.google.android.enterprise.connectedapps.b.c
            r1.<init>(r8, r0)
            throw r1
        L_0x0100:
            r0 = move-exception
            r2 = r0
            com.google.android.enterprise.connectedapps.b.c r0 = new com.google.android.enterprise.connectedapps.b.c     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = "Error passing bundle for call"
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0022 }
            throw r0     // Catch:{ all -> 0x0022 }
        L_0x010a:
            r1.recycle()
            goto L_0x010f
        L_0x010e:
            throw r0
        L_0x010f:
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.enterprise.connectedapps.internal.C142576a.makeBundleCall(android.os.Bundle):android.os.Bundle");
    }
}
