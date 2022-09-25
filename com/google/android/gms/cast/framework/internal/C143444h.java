package com.google.android.gms.cast.framework.internal;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.cast.framework.internal.h */
/* compiled from: PG */
public abstract class C143444h extends C8849b implements C143445i {
    public C143444h() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            switch(r3) {
                case 1: goto L_0x00b8;
                case 2: goto L_0x00a2;
                case 3: goto L_0x0090;
                case 4: goto L_0x0076;
                case 5: goto L_0x0067;
                case 6: goto L_0x005f;
                case 7: goto L_0x0053;
                case 8: goto L_0x0040;
                case 9: goto L_0x0034;
                case 10: goto L_0x0028;
                case 11: goto L_0x0020;
                case 12: goto L_0x0014;
                case 13: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r3 = 0
            return r3
        L_0x0005:
            int r3 = r4.readInt()
            r2.enforceNoDataAvail(r4)
            r2.mo118680j(r3)
            r5.writeNoException()
            goto L_0x00e5
        L_0x0014:
            boolean r3 = r2.mo118681k()
            r5.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r5, r3)
            goto L_0x00e5
        L_0x0020:
            r2.mo118676f()
            r5.writeNoException()
            goto L_0x00e5
        L_0x0028:
            r5.writeNoException()
            int r3 = r2.mo118671a()
            r5.writeInt(r3)
            goto L_0x00e5
        L_0x0034:
            java.lang.String r3 = r2.mo118673c()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x00e5
        L_0x0040:
            java.lang.String r3 = r4.readString()
            r2.enforceNoDataAvail(r4)
            android.os.Bundle r3 = r2.mo118672b(r3)
            r5.writeNoException()
            com.google.android.p445a.C8850c.m23498g(r5, r3)
            goto L_0x00e5
        L_0x0053:
            boolean r3 = r2.mo118682l()
            r5.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r5, r3)
            goto L_0x00e5
        L_0x005f:
            r2.mo118678h()
            r5.writeNoException()
            goto L_0x00e5
        L_0x0067:
            java.lang.String r3 = r4.readString()
            r2.enforceNoDataAvail(r4)
            r2.mo118679i(r3)
            r5.writeNoException()
            goto L_0x00e5
        L_0x0076:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            int r6 = r4.readInt()
            r2.enforceNoDataAvail(r4)
            boolean r3 = r2.mo118683m(r3, r6)
            r5.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r5, r3)
            goto L_0x00e5
        L_0x0090:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r2.enforceNoDataAvail(r4)
            r2.mo118677g(r3)
            r5.writeNoException()
            goto L_0x00e5
        L_0x00a2:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            int r6 = r4.readInt()
            r2.enforceNoDataAvail(r4)
            r2.mo118674d(r3, r6)
            r5.writeNoException()
            goto L_0x00e5
        L_0x00b8:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            android.os.IBinder r6 = r4.readStrongBinder()
            if (r6 != 0) goto L_0x00c8
            r6 = 0
            goto L_0x00dc
        L_0x00c8:
            java.lang.String r0 = "com.google.android.gms.cast.framework.internal.IMediaRouterCallback"
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.cast.framework.internal.C143447k
            if (r1 == 0) goto L_0x00d6
            r6 = r0
            com.google.android.gms.cast.framework.internal.k r6 = (com.google.android.gms.cast.framework.internal.C143447k) r6
            goto L_0x00dc
        L_0x00d6:
            com.google.android.gms.cast.framework.internal.j r0 = new com.google.android.gms.cast.framework.internal.j
            r0.<init>(r6)
            r6 = r0
        L_0x00dc:
            r2.enforceNoDataAvail(r4)
            r2.mo118675e(r3, r6)
            r5.writeNoException()
        L_0x00e5:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.internal.C143444h.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
