package com.google.android.gms.learning.dynamite.proxy;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.h */
/* compiled from: PG */
public abstract class C144638h extends C8849b implements C144639i {
    public C144638h() {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIterator");
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.learning.dynamite.proxy.l] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.common.api.internal.bu] */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            r3 = 2
            r4 = 0
            if (r1 == r3) goto L_0x002a
            r3 = 3
            if (r1 == r3) goto L_0x0009
            r1 = 0
            return r1
        L_0x0009:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0010
            goto L_0x0023
        L_0x0010:
            java.lang.String r3 = "com.google.android.gms.common.api.internal.IStatusCallback"
            android.os.IInterface r3 = r1.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r4 == 0) goto L_0x001e
            r4 = r3
            com.google.android.gms.common.api.internal.bu r4 = (com.google.android.gms.common.api.internal.C143773bu) r4
            goto L_0x0023
        L_0x001e:
            com.google.android.gms.common.api.internal.bs r4 = new com.google.android.gms.common.api.internal.bs
            r4.<init>(r1)
        L_0x0023:
            r0.enforceNoDataAvail(r2)
            r0.mo120088a(r4)
            goto L_0x004e
        L_0x002a:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0031
            goto L_0x0044
        L_0x0031:
            java.lang.String r3 = "com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIteratorCallback"
            android.os.IInterface r3 = r1.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.learning.dynamite.proxy.C144642l
            if (r4 == 0) goto L_0x003f
            r4 = r3
            com.google.android.gms.learning.dynamite.proxy.l r4 = (com.google.android.gms.learning.dynamite.proxy.C144642l) r4
            goto L_0x0044
        L_0x003f:
            com.google.android.gms.learning.dynamite.proxy.j r4 = new com.google.android.gms.learning.dynamite.proxy.j
            r4.<init>(r1)
        L_0x0044:
            int r1 = r2.readInt()
            r0.enforceNoDataAvail(r2)
            r0.mo120090c(r4, r1)
        L_0x004e:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.proxy.C144638h.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
