package com.google.android.libraries.assistant.p1484g.p1502d;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.libraries.assistant.g.d.af */
/* compiled from: PG */
public abstract class C18154af extends C8849b implements C18155ag {
    public C18154af() {
        super("com.google.android.libraries.assistant.directactions.sender.ISystemDirectActionsProxy");
    }

    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.google.android.libraries.assistant.g.d.aa] */
    /* JADX WARNING: type inference failed for: r6v7, types: [com.google.android.libraries.assistant.g.d.ad] */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            r6 = 0
            r7 = 1
            if (r4 == r7) goto L_0x002d
            r0 = 2
            if (r4 == r0) goto L_0x0009
            r4 = 0
            return r4
        L_0x0009:
            int r4 = r5.readInt()
            android.os.IBinder r0 = r5.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            goto L_0x0026
        L_0x0014:
            java.lang.String r6 = "com.google.android.libraries.assistant.directactions.sender.IRequestDirectActionsCallback"
            android.os.IInterface r6 = r0.queryLocalInterface(r6)
            boolean r1 = r6 instanceof com.google.android.libraries.assistant.p1484g.p1502d.C18152ad
            if (r1 == 0) goto L_0x0021
            com.google.android.libraries.assistant.g.d.ad r6 = (com.google.android.libraries.assistant.p1484g.p1502d.C18152ad) r6
            goto L_0x0026
        L_0x0021:
            com.google.android.libraries.assistant.g.d.ab r6 = new com.google.android.libraries.assistant.g.d.ab
            r6.<init>(r0)
        L_0x0026:
            r3.enforceNoDataAvail(r5)
            r3.mo23640f(r4, r6)
            goto L_0x005c
        L_0x002d:
            android.os.Parcelable$Creator r4 = android.app.DirectAction.CREATOR
            android.os.Parcelable r4 = com.google.android.p445a.C8850c.m23492a(r5, r4)
            android.app.DirectAction r4 = (android.app.DirectAction) r4
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.p445a.C8850c.m23492a(r5, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.IBinder r1 = r5.readStrongBinder()
            if (r1 != 0) goto L_0x0044
            goto L_0x0056
        L_0x0044:
            java.lang.String r6 = "com.google.android.libraries.assistant.directactions.sender.IPerformDirectActionCallback"
            android.os.IInterface r6 = r1.queryLocalInterface(r6)
            boolean r2 = r6 instanceof com.google.android.libraries.assistant.p1484g.p1502d.C18149aa
            if (r2 == 0) goto L_0x0051
            com.google.android.libraries.assistant.g.d.aa r6 = (com.google.android.libraries.assistant.p1484g.p1502d.C18149aa) r6
            goto L_0x0056
        L_0x0051:
            com.google.android.libraries.assistant.g.d.y r6 = new com.google.android.libraries.assistant.g.d.y
            r6.<init>(r1)
        L_0x0056:
            r3.enforceNoDataAvail(r5)
            r3.mo23639e(r4, r0, r6)
        L_0x005c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1484g.p1502d.C18154af.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
