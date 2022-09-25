package com.google.android.gms.flags;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.flags.b */
/* compiled from: PG */
public abstract class C144213b extends C8849b implements C144214c {
    public C144213b() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static C144214c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof C144214c ? (C144214c) queryLocalInterface : new C144212a(iBinder);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            r7 = 1
            if (r4 == r7) goto L_0x007a
            r0 = 2
            if (r4 == r0) goto L_0x0060
            r0 = 3
            if (r4 == r0) goto L_0x0046
            r0 = 4
            if (r4 == r0) goto L_0x002c
            r0 = 5
            if (r4 == r0) goto L_0x0011
            r4 = 0
            return r4
        L_0x0011:
            java.lang.String r4 = r5.readString()
            java.lang.String r0 = r5.readString()
            int r1 = r5.readInt()
            r3.enforceNoDataAvail(r5)
            java.lang.String r4 = r3.getStringFlagValue(r4, r0, r1)
            r6.writeNoException()
            r6.writeString(r4)
            goto L_0x009f
        L_0x002c:
            java.lang.String r4 = r5.readString()
            long r0 = r5.readLong()
            int r2 = r5.readInt()
            r3.enforceNoDataAvail(r5)
            long r4 = r3.getLongFlagValue(r4, r0, r2)
            r6.writeNoException()
            r6.writeLong(r4)
            goto L_0x009f
        L_0x0046:
            java.lang.String r4 = r5.readString()
            int r0 = r5.readInt()
            int r1 = r5.readInt()
            r3.enforceNoDataAvail(r5)
            int r4 = r3.getIntFlagValue(r4, r0, r1)
            r6.writeNoException()
            r6.writeInt(r4)
            goto L_0x009f
        L_0x0060:
            java.lang.String r4 = r5.readString()
            boolean r0 = com.google.android.p445a.C8850c.m23500i(r5)
            int r1 = r5.readInt()
            r3.enforceNoDataAvail(r5)
            boolean r4 = r3.getBooleanFlagValue(r4, r0, r1)
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r6, r4)
            goto L_0x009f
        L_0x007a:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x0082
            r4 = 0
            goto L_0x0096
        L_0x0082:
            java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.p10793f.C144165j
            if (r1 == 0) goto L_0x0090
            r4 = r0
            com.google.android.gms.f.j r4 = (com.google.android.gms.p10793f.C144165j) r4
            goto L_0x0096
        L_0x0090:
            com.google.android.gms.f.h r0 = new com.google.android.gms.f.h
            r0.<init>(r4)
            r4 = r0
        L_0x0096:
            r3.enforceNoDataAvail(r5)
            r3.init(r4)
            r6.writeNoException()
        L_0x009f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.flags.C144213b.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
