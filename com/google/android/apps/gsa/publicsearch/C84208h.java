package com.google.android.apps.gsa.publicsearch;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.apps.gsa.publicsearch.h */
/* compiled from: PG */
public abstract class C84208h extends C8849b implements C84209i {
    public C84208h() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
    }

    /* JADX WARNING: type inference failed for: r5v7, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            r4 = 1
            if (r2 == r4) goto L_0x0041
            r5 = 2
            if (r2 == r5) goto L_0x002e
            r5 = 3
            if (r2 == r5) goto L_0x000b
            r2 = 0
            return r2
        L_0x000b:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0013
            r2 = 0
            goto L_0x0027
        L_0x0013:
            java.lang.String r5 = "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceMicrophoneLevelCallback"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.apps.gsa.publicsearch.C84206f
            if (r0 == 0) goto L_0x0021
            r2 = r5
            com.google.android.apps.gsa.publicsearch.f r2 = (com.google.android.apps.gsa.publicsearch.C84206f) r2
            goto L_0x0027
        L_0x0021:
            com.google.android.apps.gsa.publicsearch.f r5 = new com.google.android.apps.gsa.publicsearch.f
            r5.<init>(r2)
            r2 = r5
        L_0x0027:
            r1.enforceNoDataAvail(r3)
            r1.mo77673g(r2)
            goto L_0x004b
        L_0x002e:
            byte[] r2 = r3.createByteArray()
            android.os.Parcelable$Creator r5 = com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper.CREATOR
            android.os.Parcelable r5 = com.google.android.p445a.C8850c.m23492a(r3, r5)
            com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper r5 = (com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper) r5
            r1.enforceNoDataAvail(r3)
            r1.mo77672f(r2, r5)
            goto L_0x004b
        L_0x0041:
            byte[] r2 = r3.createByteArray()
            r1.enforceNoDataAvail(r3)
            r1.mo77671e(r2)
        L_0x004b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.publicsearch.C84208h.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
