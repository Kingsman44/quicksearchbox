package org.chromium.p5643b.p5644a;

import com.google.android.p445a.C8849b;

/* renamed from: org.chromium.b.a.ba */
/* compiled from: PG */
public abstract class C72332ba extends C8849b implements C72333bb {
    public C72332ba() {
        super("org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient");
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
            if (r4 == r7) goto L_0x0040
            r0 = 2
            if (r4 == r0) goto L_0x0035
            r0 = 3
            if (r4 == r0) goto L_0x000b
            r4 = 0
            return r4
        L_0x000b:
            int r4 = r5.readInt()
            android.os.IBinder r0 = r5.readStrongBinder()
            if (r0 != 0) goto L_0x0017
            r0 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r1 = "org.chromium.weblayer_private.interfaces.IObjectWrapper"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof org.chromium.p5643b.p5644a.C72317am
            if (r2 == 0) goto L_0x0025
            r0 = r1
            org.chromium.b.a.am r0 = (org.chromium.p5643b.p5644a.C72317am) r0
            goto L_0x002b
        L_0x0025:
            org.chromium.b.a.ak r1 = new org.chromium.b.a.ak
            r1.<init>(r0)
            r0 = r1
        L_0x002b:
            r3.enforceNoDataAvail(r5)
            r3.mo63771c(r4, r0)
            r6.writeNoException()
            goto L_0x004a
        L_0x0035:
            java.lang.String r4 = r3.mo63770b()
            r6.writeNoException()
            r6.writeString(r4)
            goto L_0x004a
        L_0x0040:
            java.lang.String r4 = r3.mo63769a()
            r6.writeNoException()
            r6.writeString(r4)
        L_0x004a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72332ba.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
