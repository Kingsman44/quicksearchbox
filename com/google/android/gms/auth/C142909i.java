package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;

/* renamed from: com.google.android.gms.auth.i */
/* compiled from: PG */
public final /* synthetic */ class C142909i implements C142913m {

    /* renamed from: a */
    public final /* synthetic */ Account f387811a;

    /* renamed from: b */
    public final /* synthetic */ String f387812b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f387813c;

    public /* synthetic */ C142909i(Account account, String str, Bundle bundle) {
        this.f387811a = account;
        this.f387812b = str;
        this.f387813c = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo117809a(android.os.IBinder r6) {
        /*
            r5 = this;
            android.accounts.Account r0 = r5.f387811a
            java.lang.String r1 = r5.f387812b
            android.os.Bundle r2 = r5.f387813c
            java.lang.String[] r3 = com.google.android.gms.auth.C142914n.f387818b
            if (r6 != 0) goto L_0x000c
            r6 = 0
            goto L_0x0020
        L_0x000c:
            java.lang.String r3 = "com.google.android.auth.IAuthManagerService"
            android.os.IInterface r3 = r6.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.p10709b.C142291a
            if (r4 == 0) goto L_0x001a
            r6 = r3
            com.google.android.b.a r6 = (com.google.android.p10709b.C142291a) r6
            goto L_0x0020
        L_0x001a:
            com.google.android.b.a r3 = new com.google.android.b.a
            r3.<init>(r6)
            r6 = r3
        L_0x0020:
            android.os.Parcel r3 = r6.mo17260gA()
            com.google.android.p445a.C8850c.m23497f(r3, r0)
            r3.writeString(r1)
            com.google.android.p445a.C8850c.m23497f(r3, r2)
            r0 = 5
            android.os.Parcel r6 = r6.mo17261gT(r0, r3)
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.p445a.C8850c.m23492a(r6, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r6.recycle()
            if (r0 == 0) goto L_0x0044
            com.google.android.gms.auth.TokenData r6 = com.google.android.gms.auth.C142914n.m231856d(r0)
            return r6
        L_0x0044:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Service call returned null"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.C142909i.mo117809a(android.os.IBinder):java.lang.Object");
    }
}
