package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.learning.internal.training.q */
/* compiled from: PG */
public abstract class C144813q extends C8849b implements C144814r {
    public C144813q() {
        super("com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
    }

    public static C144814r asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
        return queryLocalInterface instanceof C144814r ? (C144814r) queryLocalInterface : new C144812p(iBinder);
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r9v3, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
        /*
            r5 = this;
            java.lang.String r9 = "com.google.android.gms.common.api.internal.IStatusCallback"
            r0 = 1
            r1 = 0
            if (r6 == r0) goto L_0x0031
            r2 = 2
            if (r6 == r2) goto L_0x000b
            r6 = 0
            return r6
        L_0x000b:
            int r6 = r7.readInt()
            android.os.IBinder r2 = r7.readStrongBinder()
            if (r2 != 0) goto L_0x0016
            goto L_0x0027
        L_0x0016:
            android.os.IInterface r9 = r2.queryLocalInterface(r9)
            boolean r1 = r9 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r1 == 0) goto L_0x0022
            r1 = r9
            com.google.android.gms.common.api.internal.bu r1 = (com.google.android.gms.common.api.internal.C143773bu) r1
            goto L_0x0027
        L_0x0022:
            com.google.android.gms.common.api.internal.bs r1 = new com.google.android.gms.common.api.internal.bs
            r1.<init>(r2)
        L_0x0027:
            r5.enforceNoDataAvail(r7)
            r5.cancelJobsByType(r6, r1)
            r8.writeNoException()
            goto L_0x0088
        L_0x0031:
            android.os.IBinder r6 = r7.readStrongBinder()
            java.lang.String r2 = "com.google.android.gms.dynamic.IObjectWrapper"
            if (r6 != 0) goto L_0x003b
            r3 = r1
            goto L_0x004b
        L_0x003b:
            android.os.IInterface r3 = r6.queryLocalInterface(r2)
            boolean r4 = r3 instanceof com.google.android.gms.p10793f.C144165j
            if (r4 == 0) goto L_0x0046
            com.google.android.gms.f.j r3 = (com.google.android.gms.p10793f.C144165j) r3
            goto L_0x004b
        L_0x0046:
            com.google.android.gms.f.h r3 = new com.google.android.gms.f.h
            r3.<init>(r6)
        L_0x004b:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 != 0) goto L_0x0053
            r2 = r1
            goto L_0x0063
        L_0x0053:
            android.os.IInterface r2 = r6.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.p10793f.C144165j
            if (r4 == 0) goto L_0x005e
            com.google.android.gms.f.j r2 = (com.google.android.gms.p10793f.C144165j) r2
            goto L_0x0063
        L_0x005e:
            com.google.android.gms.f.h r2 = new com.google.android.gms.f.h
            r2.<init>(r6)
        L_0x0063:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 != 0) goto L_0x006a
            goto L_0x007b
        L_0x006a:
            android.os.IInterface r9 = r6.queryLocalInterface(r9)
            boolean r1 = r9 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r1 == 0) goto L_0x0076
            r1 = r9
            com.google.android.gms.common.api.internal.bu r1 = (com.google.android.gms.common.api.internal.C143773bu) r1
            goto L_0x007b
        L_0x0076:
            com.google.android.gms.common.api.internal.bs r1 = new com.google.android.gms.common.api.internal.bs
            r1.<init>(r6)
        L_0x007b:
            r5.enforceNoDataAvail(r7)
            boolean r6 = r5.init(r3, r2, r1)
            r8.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r8, r6)
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.internal.training.C144813q.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
