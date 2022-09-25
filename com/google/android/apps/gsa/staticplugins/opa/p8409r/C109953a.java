package com.google.android.apps.gsa.staticplugins.opa.p8409r;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.r.a */
/* compiled from: PG */
public abstract class C109953a extends C8849b implements C109954b {
    public C109953a() {
        super("com.google.android.apps.gsa.staticplugins.opa.dockmode.IDockModeService");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            r7 = 1
            if (r4 == r7) goto L_0x003b
            r0 = 2
            if (r4 == r0) goto L_0x0021
            r0 = 3
            if (r4 == r0) goto L_0x000b
            r4 = 0
            return r4
        L_0x000b:
            java.lang.String r4 = r5.readString()
            java.lang.String r0 = r5.readString()
            r3.enforceNoDataAvail(r5)
            boolean r4 = r3.mo98272b(r4, r0)
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r6, r4)
            goto L_0x006c
        L_0x0021:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.p445a.C8850c.m23492a(r5, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r3.enforceNoDataAvail(r5)
            android.os.Bundle r4 = r3.mo98271a(r4, r0)
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23498g(r6, r4)
            goto L_0x006c
        L_0x003b:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.p445a.C8850c.m23492a(r5, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.IBinder r0 = r5.readStrongBinder()
            if (r0 != 0) goto L_0x004f
            r0 = 0
            goto L_0x0063
        L_0x004f:
            java.lang.String r1 = "com.google.android.apps.gsa.staticplugins.opa.dockmode.IDockModeServiceCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.apps.gsa.staticplugins.opa.p8409r.C109955c
            if (r2 == 0) goto L_0x005d
            r0 = r1
            com.google.android.apps.gsa.staticplugins.opa.r.c r0 = (com.google.android.apps.gsa.staticplugins.opa.p8409r.C109955c) r0
            goto L_0x0063
        L_0x005d:
            com.google.android.apps.gsa.staticplugins.opa.r.c r1 = new com.google.android.apps.gsa.staticplugins.opa.r.c
            r1.<init>(r0)
            r0 = r1
        L_0x0063:
            r3.enforceNoDataAvail(r5)
            r3.mo98273c(r4, r0)
            r6.writeNoException()
        L_0x006c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8409r.C109953a.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
