package com.google.android.gms.learning.internal;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.learning.internal.o */
/* compiled from: PG */
public abstract class C144783o extends C8849b implements C144784p {
    public C144783o() {
        super("com.google.android.gms.learning.internal.IExampleStoreV2");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.google.android.gms.learning.internal.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.gms.learning.internal.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.learning.internal.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.google.android.gms.learning.internal.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: com.google.android.gms.learning.internal.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.learning.internal.k} */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r2v7, types: [com.google.android.gms.f.h] */
    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.f.j] */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.f.j] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            r10 = 2
            java.lang.String r0 = "com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2"
            java.lang.String r1 = "com.google.android.gms.dynamic.IObjectWrapper"
            r2 = 0
            if (r7 == r10) goto L_0x0091
            r10 = 3
            if (r7 == r10) goto L_0x0086
            r10 = 4
            if (r7 == r10) goto L_0x0010
            r7 = 0
            return r7
        L_0x0010:
            java.lang.String r7 = r8.readString()
            android.os.IBinder r10 = r8.readStrongBinder()
            if (r10 != 0) goto L_0x001c
            r3 = r2
            goto L_0x002c
        L_0x001c:
            android.os.IInterface r3 = r10.queryLocalInterface(r1)
            boolean r4 = r3 instanceof com.google.android.gms.p10793f.C144165j
            if (r4 == 0) goto L_0x0027
            com.google.android.gms.f.j r3 = (com.google.android.gms.p10793f.C144165j) r3
            goto L_0x002c
        L_0x0027:
            com.google.android.gms.f.h r3 = new com.google.android.gms.f.h
            r3.<init>(r10)
        L_0x002c:
            android.os.IBinder r10 = r8.readStrongBinder()
            if (r10 != 0) goto L_0x0034
            r4 = r2
            goto L_0x0044
        L_0x0034:
            android.os.IInterface r4 = r10.queryLocalInterface(r1)
            boolean r5 = r4 instanceof com.google.android.gms.p10793f.C144165j
            if (r5 == 0) goto L_0x003f
            com.google.android.gms.f.j r4 = (com.google.android.gms.p10793f.C144165j) r4
            goto L_0x0044
        L_0x003f:
            com.google.android.gms.f.h r4 = new com.google.android.gms.f.h
            r4.<init>(r10)
        L_0x0044:
            android.os.IBinder r10 = r8.readStrongBinder()
            if (r10 != 0) goto L_0x004c
            r10 = r2
            goto L_0x005d
        L_0x004c:
            android.os.IInterface r0 = r10.queryLocalInterface(r0)
            boolean r5 = r0 instanceof com.google.android.gms.learning.internal.C144781m
            if (r5 == 0) goto L_0x0057
            com.google.android.gms.learning.internal.m r0 = (com.google.android.gms.learning.internal.C144781m) r0
            goto L_0x005c
        L_0x0057:
            com.google.android.gms.learning.internal.k r0 = new com.google.android.gms.learning.internal.k
            r0.<init>(r10)
        L_0x005c:
            r10 = r0
        L_0x005d:
            android.os.IBinder r0 = r8.readStrongBinder()
            if (r0 != 0) goto L_0x0065
        L_0x0063:
            r5 = r2
            goto L_0x0077
        L_0x0065:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.p10793f.C144165j
            if (r2 == 0) goto L_0x0071
            r2 = r1
            com.google.android.gms.f.j r2 = (com.google.android.gms.p10793f.C144165j) r2
            goto L_0x0063
        L_0x0071:
            com.google.android.gms.f.h r2 = new com.google.android.gms.f.h
            r2.<init>(r0)
            goto L_0x0063
        L_0x0077:
            r6.enforceNoDataAvail(r8)
            r0 = r6
            r1 = r7
            r2 = r3
            r3 = r4
            r4 = r10
            r0.mo120187b(r1, r2, r3, r4, r5)
            r9.writeNoException()
            goto L_0x00e6
        L_0x0086:
            r9.writeNoException()
            boolean r7 = r6.mo120188c()
            com.google.android.p445a.C8850c.m23495d(r9, r7)
            goto L_0x00e6
        L_0x0091:
            java.lang.String r7 = r8.readString()
            android.os.IBinder r10 = r8.readStrongBinder()
            if (r10 != 0) goto L_0x009d
            r3 = r2
            goto L_0x00ad
        L_0x009d:
            android.os.IInterface r3 = r10.queryLocalInterface(r1)
            boolean r4 = r3 instanceof com.google.android.gms.p10793f.C144165j
            if (r4 == 0) goto L_0x00a8
            com.google.android.gms.f.j r3 = (com.google.android.gms.p10793f.C144165j) r3
            goto L_0x00ad
        L_0x00a8:
            com.google.android.gms.f.h r3 = new com.google.android.gms.f.h
            r3.<init>(r10)
        L_0x00ad:
            android.os.IBinder r10 = r8.readStrongBinder()
            if (r10 != 0) goto L_0x00b5
            r1 = r2
            goto L_0x00c5
        L_0x00b5:
            android.os.IInterface r1 = r10.queryLocalInterface(r1)
            boolean r4 = r1 instanceof com.google.android.gms.p10793f.C144165j
            if (r4 == 0) goto L_0x00c0
            com.google.android.gms.f.j r1 = (com.google.android.gms.p10793f.C144165j) r1
            goto L_0x00c5
        L_0x00c0:
            com.google.android.gms.f.h r1 = new com.google.android.gms.f.h
            r1.<init>(r10)
        L_0x00c5:
            android.os.IBinder r10 = r8.readStrongBinder()
            if (r10 != 0) goto L_0x00cc
            goto L_0x00dd
        L_0x00cc:
            android.os.IInterface r0 = r10.queryLocalInterface(r0)
            boolean r2 = r0 instanceof com.google.android.gms.learning.internal.C144781m
            if (r2 == 0) goto L_0x00d8
            r2 = r0
            com.google.android.gms.learning.internal.m r2 = (com.google.android.gms.learning.internal.C144781m) r2
            goto L_0x00dd
        L_0x00d8:
            com.google.android.gms.learning.internal.k r2 = new com.google.android.gms.learning.internal.k
            r2.<init>(r10)
        L_0x00dd:
            r6.enforceNoDataAvail(r8)
            r6.mo120186a(r7, r3, r1, r2)
            r9.writeNoException()
        L_0x00e6:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.internal.C144783o.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
