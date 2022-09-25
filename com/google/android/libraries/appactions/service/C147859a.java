package com.google.android.libraries.appactions.service;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.libraries.appactions.service.a */
/* compiled from: PG */
public abstract class C147859a extends C8849b implements C147860b {
    public C147859a() {
        super("com.google.android.libraries.appactions.service.IAppShortcutsService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r5 = 1
            if (r3 != r5) goto L_0x002e
            android.os.Parcelable$Creator r3 = com.google.android.libraries.appactions.service.ShortcutLookupRequest.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            com.google.android.libraries.appactions.service.ShortcutLookupRequest r3 = (com.google.android.libraries.appactions.service.ShortcutLookupRequest) r3
            android.os.IBinder r6 = r4.readStrongBinder()
            if (r6 != 0) goto L_0x0013
            r6 = 0
            goto L_0x0027
        L_0x0013:
            java.lang.String r0 = "com.google.android.libraries.appactions.service.ILookupShortcutCallback"
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.libraries.appactions.service.C147861c
            if (r1 == 0) goto L_0x0021
            r6 = r0
            com.google.android.libraries.appactions.service.c r6 = (com.google.android.libraries.appactions.service.C147861c) r6
            goto L_0x0027
        L_0x0021:
            com.google.android.libraries.appactions.service.c r0 = new com.google.android.libraries.appactions.service.c
            r0.<init>(r6)
            r6 = r0
        L_0x0027:
            r2.enforceNoDataAvail(r4)
            r2.mo106400a(r3, r6)
            return r5
        L_0x002e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.appactions.service.C147859a.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
