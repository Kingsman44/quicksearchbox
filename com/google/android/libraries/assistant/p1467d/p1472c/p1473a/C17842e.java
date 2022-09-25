package com.google.android.libraries.assistant.p1467d.p1472c.p1473a;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.libraries.assistant.d.c.a.e */
/* compiled from: PG */
public abstract class C17842e extends C8849b implements C17843f {
    public C17842e() {
        super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService");
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
            if (r4 != r7) goto L_0x0031
            java.lang.String r4 = r5.readString()
            android.os.IBinder r0 = r5.readStrongBinder()
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0023
        L_0x000f:
            java.lang.String r1 = "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17849l
            if (r2 == 0) goto L_0x001d
            r0 = r1
            com.google.android.libraries.assistant.d.c.a.l r0 = (com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17849l) r0
            goto L_0x0023
        L_0x001d:
            com.google.android.libraries.assistant.d.c.a.j r1 = new com.google.android.libraries.assistant.d.c.a.j
            r1.<init>(r0)
            r0 = r1
        L_0x0023:
            r3.enforceNoDataAvail(r5)
            com.google.android.libraries.assistant.d.c.a.i r4 = r3.mo23479a(r4, r0)
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23499h(r6, r4)
            return r7
        L_0x0031:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17842e.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
