package com.google.android.gms.auth;

/* renamed from: com.google.android.gms.auth.h */
/* compiled from: PG */
public final /* synthetic */ class C142908h implements C142913m {

    /* renamed from: a */
    public final /* synthetic */ String f387809a = "com.google";

    /* renamed from: b */
    public final /* synthetic */ String[] f387810b;

    public /* synthetic */ C142908h(String[] strArr) {
        this.f387810b = strArr;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo117809a(android.os.IBinder r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.f387809a
            java.lang.String[] r1 = r4.f387810b
            java.lang.String[] r2 = com.google.android.gms.auth.C142914n.f387818b
            if (r5 != 0) goto L_0x000a
            r5 = 0
            goto L_0x001e
        L_0x000a:
            java.lang.String r2 = "com.google.android.auth.IAuthManagerService"
            android.os.IInterface r2 = r5.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.p10709b.C142291a
            if (r3 == 0) goto L_0x0018
            r5 = r2
            com.google.android.b.a r5 = (com.google.android.p10709b.C142291a) r5
            goto L_0x001e
        L_0x0018:
            com.google.android.b.a r2 = new com.google.android.b.a
            r2.<init>(r5)
            r5 = r2
        L_0x001e:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "accountType"
            r2.putString(r3, r0)
            java.lang.String r0 = "account_features"
            r2.putStringArray(r0, r1)
            android.os.Parcel r0 = r5.mo17260gA()
            com.google.android.p445a.C8850c.m23497f(r0, r2)
            r1 = 6
            android.os.Parcel r5 = r5.mo17261gT(r1, r0)
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.p445a.C8850c.m23492a(r5, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r5.recycle()
            if (r0 == 0) goto L_0x005f
            java.lang.String r5 = "accounts"
            android.os.Parcelable[] r5 = r0.getParcelableArray(r5)
            if (r5 == 0) goto L_0x005f
            int r0 = r5.length
            android.accounts.Account[] r0 = new android.accounts.Account[r0]
            r1 = 0
        L_0x0052:
            int r2 = r5.length
            if (r1 >= r2) goto L_0x005e
            r2 = r5[r1]
            android.accounts.Account r2 = (android.accounts.Account) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L_0x0052
        L_0x005e:
            return r0
        L_0x005f:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Receive null result from service call."
            r5.<init>(r0)
            goto L_0x0068
        L_0x0067:
            throw r5
        L_0x0068:
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.C142908h.mo117809a(android.os.IBinder):java.lang.Object");
    }
}
