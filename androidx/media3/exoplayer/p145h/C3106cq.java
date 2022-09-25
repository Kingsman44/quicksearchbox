package androidx.media3.exoplayer.p145h;

import android.util.SparseArray;

/* renamed from: androidx.media3.exoplayer.h.cq */
/* compiled from: PG */
final class C3106cq {

    /* renamed from: a */
    public int f9106a;

    /* renamed from: b */
    public final SparseArray f9107b;

    public C3106cq() {
        C3105cp cpVar = C3105cp.f9105a;
        throw null;
    }

    /* renamed from: b */
    public final Object mo7094b() {
        SparseArray sparseArray = this.f9107b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* renamed from: c */
    public final boolean mo7095c() {
        return this.f9107b.size() == 0;
    }

    public C3106cq(byte[] bArr) {
        this.f9107b = new SparseArray();
        this.f9106a = -1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    public final java.lang.Object mo7093a(int r4) {
        /*
            r3 = this;
            int r0 = r3.f9106a
            r1 = -1
            if (r0 == r1) goto L_0x0006
            goto L_0x0009
        L_0x0006:
            r0 = 0
        L_0x0007:
            r3.f9106a = r0
        L_0x0009:
            int r0 = r3.f9106a
            if (r0 > 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            android.util.SparseArray r2 = r3.f9107b
            int r0 = r2.keyAt(r0)
            if (r4 >= r0) goto L_0x001a
            int r0 = r3.f9106a
            int r0 = r0 + r1
            goto L_0x0007
        L_0x001a:
            int r0 = r3.f9106a
            android.util.SparseArray r2 = r3.f9107b
            int r2 = r2.size()
            int r2 = r2 + r1
            if (r0 >= r2) goto L_0x0038
            android.util.SparseArray r0 = r3.f9107b
            int r2 = r3.f9106a
            int r2 = r2 + 1
            int r0 = r0.keyAt(r2)
            if (r4 < r0) goto L_0x0038
            int r0 = r3.f9106a
            int r0 = r0 + 1
            r3.f9106a = r0
            goto L_0x001a
        L_0x0038:
            android.util.SparseArray r4 = r3.f9107b
            int r0 = r3.f9106a
            java.lang.Object r4 = r4.valueAt(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3106cq.mo7093a(int):java.lang.Object");
    }
}
