package com.google.android.gms.auth;

/* renamed from: com.google.android.gms.auth.l */
/* compiled from: PG */
public final class C142912l implements C142913m {

    /* renamed from: a */
    final /* synthetic */ String f387817a;

    public C142912l(String str) {
        this.f387817a = str;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo117809a(android.os.IBinder r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0004
            r5 = 0
            goto L_0x0018
        L_0x0004:
            java.lang.String r0 = "com.google.android.auth.IAuthManagerService"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.p10709b.C142291a
            if (r1 == 0) goto L_0x0012
            r5 = r0
            com.google.android.b.a r5 = (com.google.android.p10709b.C142291a) r5
            goto L_0x0018
        L_0x0012:
            com.google.android.b.a r0 = new com.google.android.b.a
            r0.<init>(r5)
            r5 = r0
        L_0x0018:
            java.lang.String r0 = r4.f387817a
            android.os.Parcel r1 = r5.mo17260gA()
            r1.writeString(r0)
            r0 = 8
            android.os.Parcel r5 = r5.mo17261gT(r0, r1)
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.p445a.C8850c.m23492a(r5, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r5.recycle()
            com.google.android.gms.auth.C142914n.m231870r(r0)
            java.lang.String r5 = "Error"
            java.lang.String r5 = r0.getString(r5)
            java.lang.String r1 = "userRecoveryIntent"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            com.google.android.gms.auth.firstparty.a.a r1 = com.google.android.gms.auth.firstparty.p10745a.C142905a.m231844a(r5)
            com.google.android.gms.auth.firstparty.a.a r2 = com.google.android.gms.auth.firstparty.p10745a.C142905a.SUCCESS
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0055
            r5 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L_0x0055:
            boolean r2 = com.google.android.gms.auth.firstparty.p10745a.C142905a.m231845b(r1)
            if (r2 == 0) goto L_0x0077
            com.google.android.gms.common.c.a r2 = com.google.android.gms.auth.C142914n.f387821e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "isUserRecoverableError status: "
            java.lang.String r1 = r3.concat(r1)
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.mo119307d(r1, r3)
            com.google.android.gms.auth.UserRecoverableAuthException r1 = new com.google.android.gms.auth.UserRecoverableAuthException
            r1.<init>(r5, r0)
            throw r1
        L_0x0077:
            com.google.android.gms.auth.e r0 = new com.google.android.gms.auth.e
            r0.<init>((java.lang.String) r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.C142912l.mo117809a(android.os.IBinder):java.lang.Object");
    }
}
