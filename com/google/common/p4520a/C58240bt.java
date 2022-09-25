package com.google.common.p4520a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.google.common.a.bt */
/* compiled from: PG */
final class C58240bt extends C58246bz implements Serializable, C58235bo {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.busy = 0;
        this.f155777d = null;
        this.base = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(mo54805c());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00bf, code lost:
        if (r1.f155777d != r9) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c1, code lost:
        r8 = new com.google.common.p4520a.C58245by[(r10 + r10)];
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c6, code lost:
        if (r11 >= r10) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c8, code lost:
        r8[r11] = r9[r11];
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00cf, code lost:
        r1.f155777d = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0055 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0120 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54803a(long r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            com.google.common.a.by[] r0 = r1.f155777d
            if (r0 != 0) goto L_0x0012
            long r4 = r1.base
            long r6 = r4 + r2
            boolean r4 = r1.mo54814e(r4, r6)
            if (r4 != 0) goto L_0x0120
        L_0x0012:
            java.lang.ThreadLocal r4 = f155771a
            java.lang.Object r4 = r4.get()
            int[] r4 = (int[]) r4
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0037
            if (r0 == 0) goto L_0x0037
            int r7 = r0.length
            if (r7 <= 0) goto L_0x0037
            int r7 = r7 + -1
            r8 = r4[r6]
            r7 = r7 & r8
            r0 = r0[r7]
            if (r0 == 0) goto L_0x0037
            long r7 = r0.value
            long r9 = r7 + r2
            boolean r0 = r0.mo54813a(r7, r9)
            if (r0 != 0) goto L_0x0120
            goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            if (r4 != 0) goto L_0x004d
            java.lang.ThreadLocal r4 = com.google.common.p4520a.C58246bz.f155771a
            int[] r7 = new int[r5]
            r4.set(r7)
            java.util.Random r4 = com.google.common.p4520a.C58246bz.f155772b
            int r4 = r4.nextInt()
            if (r4 != 0) goto L_0x004a
            r4 = 1
        L_0x004a:
            r7[r6] = r4
            goto L_0x0054
        L_0x004d:
            r7 = r4[r6]
            r16 = r7
            r7 = r4
            r4 = r16
        L_0x0054:
            r8 = 0
        L_0x0055:
            com.google.common.a.by[] r9 = r1.f155777d
            if (r9 == 0) goto L_0x00e7
            int r10 = r9.length
            if (r10 <= 0) goto L_0x00e7
            int r11 = r10 + -1
            r11 = r11 & r4
            r11 = r9[r11]
            if (r11 != 0) goto L_0x0095
            int r9 = r1.busy
            if (r9 != 0) goto L_0x0093
            com.google.common.a.by r9 = new com.google.common.a.by
            r9.<init>(r2)
            int r10 = r1.busy
            if (r10 != 0) goto L_0x0093
            boolean r10 = r17.mo54815f()
            if (r10 == 0) goto L_0x0093
            com.google.common.a.by[] r10 = r1.f155777d     // Catch:{ all -> 0x008f }
            if (r10 == 0) goto L_0x0088
            int r11 = r10.length     // Catch:{ all -> 0x008f }
            if (r11 <= 0) goto L_0x0088
            int r11 = r11 + -1
            r11 = r11 & r4
            r12 = r10[r11]     // Catch:{ all -> 0x008f }
            if (r12 != 0) goto L_0x0088
            r10[r11] = r9     // Catch:{ all -> 0x008f }
            r9 = 1
            goto L_0x0089
        L_0x0088:
            r9 = 0
        L_0x0089:
            r1.busy = r6
            if (r9 == 0) goto L_0x0055
            goto L_0x0120
        L_0x008f:
            r0 = move-exception
            r1.busy = r6
            throw r0
        L_0x0093:
            r8 = 0
            goto L_0x00da
        L_0x0095:
            if (r0 != 0) goto L_0x0099
            r0 = 1
            goto L_0x00da
        L_0x0099:
            long r12 = r11.value
            long r14 = r12 + r2
            boolean r11 = r11.mo54813a(r12, r14)
            if (r11 == 0) goto L_0x00a5
            goto L_0x0120
        L_0x00a5:
            int r11 = com.google.common.p4520a.C58246bz.f155773c
            if (r10 >= r11) goto L_0x00d8
            com.google.common.a.by[] r11 = r1.f155777d
            if (r11 == r9) goto L_0x00ae
            goto L_0x00d8
        L_0x00ae:
            if (r8 != 0) goto L_0x00b3
        L_0x00b0:
            r0 = 1
            r8 = 1
            goto L_0x00da
        L_0x00b3:
            int r8 = r1.busy
            if (r8 != 0) goto L_0x00b0
            boolean r8 = r17.mo54815f()
            if (r8 == 0) goto L_0x00b0
            com.google.common.a.by[] r8 = r1.f155777d     // Catch:{ all -> 0x00d4 }
            if (r8 != r9) goto L_0x00d1
            int r8 = r10 + r10
            com.google.common.a.by[] r8 = new com.google.common.p4520a.C58245by[r8]     // Catch:{ all -> 0x00d4 }
            r11 = 0
        L_0x00c6:
            if (r11 >= r10) goto L_0x00cf
            r12 = r9[r11]     // Catch:{ all -> 0x00d4 }
            r8[r11] = r12     // Catch:{ all -> 0x00d4 }
            int r11 = r11 + 1
            goto L_0x00c6
        L_0x00cf:
            r1.f155777d = r8     // Catch:{ all -> 0x00d4 }
        L_0x00d1:
            r1.busy = r6
            goto L_0x0054
        L_0x00d4:
            r0 = move-exception
            r1.busy = r6
            throw r0
        L_0x00d8:
            r0 = 1
            goto L_0x0093
        L_0x00da:
            int r9 = r4 << 13
            r4 = r4 ^ r9
            int r9 = r4 >>> 17
            r4 = r4 ^ r9
            int r9 = r4 << 5
            r4 = r4 ^ r9
            r7[r6] = r4
            goto L_0x0055
        L_0x00e7:
            int r10 = r1.busy
            if (r10 != 0) goto L_0x0114
            com.google.common.a.by[] r10 = r1.f155777d
            if (r10 != r9) goto L_0x0114
            boolean r10 = r17.mo54815f()
            if (r10 == 0) goto L_0x0114
            com.google.common.a.by[] r10 = r1.f155777d     // Catch:{ all -> 0x0110 }
            if (r10 != r9) goto L_0x0109
            r9 = 2
            com.google.common.a.by[] r9 = new com.google.common.p4520a.C58245by[r9]     // Catch:{ all -> 0x0110 }
            r10 = r4 & 1
            com.google.common.a.by r11 = new com.google.common.a.by     // Catch:{ all -> 0x0110 }
            r11.<init>(r2)     // Catch:{ all -> 0x0110 }
            r9[r10] = r11     // Catch:{ all -> 0x0110 }
            r1.f155777d = r9     // Catch:{ all -> 0x0110 }
            r9 = 1
            goto L_0x010a
        L_0x0109:
            r9 = 0
        L_0x010a:
            r1.busy = r6
            if (r9 != 0) goto L_0x0120
            goto L_0x0055
        L_0x0110:
            r0 = move-exception
            r1.busy = r6
            throw r0
        L_0x0114:
            long r9 = r1.base
            long r11 = r9 + r2
            boolean r9 = r1.mo54814e(r9, r11)
            if (r9 != 0) goto L_0x0120
            goto L_0x0055
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4520a.C58240bt.mo54803a(long):void");
    }

    /* renamed from: b */
    public final void mo54804b() {
        mo54803a(1);
    }

    /* renamed from: c */
    public final long mo54805c() {
        long j = this.base;
        C58245by[] byVarArr = this.f155777d;
        if (byVarArr != null) {
            for (C58245by byVar : byVarArr) {
                if (byVar != null) {
                    j += byVar.value;
                }
            }
        }
        return j;
    }

    public final double doubleValue() {
        return (double) mo54805c();
    }

    public final float floatValue() {
        return (float) mo54805c();
    }

    public final int intValue() {
        return (int) mo54805c();
    }

    public final long longValue() {
        return mo54805c();
    }

    public final String toString() {
        return Long.toString(mo54805c());
    }
}
