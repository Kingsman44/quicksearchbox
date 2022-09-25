package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143936k;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.signin.C145993e;

/* renamed from: com.google.android.gms.signin.internal.g */
/* compiled from: PG */
public final class C146001g extends C143887ac implements C145993e {

    /* renamed from: a */
    public final Integer f394690a;

    /* renamed from: b */
    private final boolean f394691b = true;

    /* renamed from: c */
    private final C143944s f394692c;

    /* renamed from: d */
    private final Bundle f394693d;

    public C146001g(Context context, Looper looper, C143944s sVar, Bundle bundle, C143849u uVar, C143850v vVar) {
        super(context, looper, 44, sVar, uVar, vVar);
        this.f394692c = sVar;
        this.f394693d = bundle;
        this.f394690a = sVar.f390176h;
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C145999e ? (C145999e) queryLocalInterface : new C145999e(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: e */
    public final void mo122463e() {
        mo119466v(new C143936k(this));
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122464g(com.google.android.gms.signin.internal.C145998d r28) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            java.lang.String r0 = "serverAuthCode"
            java.lang.String r3 = "familyName"
            java.lang.String r4 = "givenName"
            java.lang.String r5 = "displayName"
            java.lang.String r6 = "email"
            java.lang.String r7 = "tokenId"
            java.lang.String r8 = "googleSignInAccount:"
            com.google.android.gms.common.internal.s r11 = r1.f394692c     // Catch:{ RemoteException -> 0x017c }
            android.accounts.Account r11 = r11.f390169a     // Catch:{ RemoteException -> 0x017c }
            java.lang.String r12 = "<<default account>>"
            if (r11 != 0) goto L_0x0021
            android.accounts.Account r11 = new android.accounts.Account     // Catch:{ RemoteException -> 0x017c }
            java.lang.String r13 = "com.google"
            r11.<init>(r12, r13)     // Catch:{ RemoteException -> 0x017c }
        L_0x0021:
            java.lang.String r13 = r11.name     // Catch:{ RemoteException -> 0x017c }
            boolean r12 = r12.equals(r13)     // Catch:{ RemoteException -> 0x017c }
            if (r12 == 0) goto L_0x014c
            android.content.Context r12 = r1.f390156t     // Catch:{ RemoteException -> 0x0148 }
            java.util.concurrent.locks.Lock r13 = com.google.android.gms.auth.api.signin.p10742a.C142885a.f387699a     // Catch:{ RemoteException -> 0x0148 }
            r13.lock()     // Catch:{ RemoteException -> 0x0148 }
            com.google.android.gms.auth.api.signin.a.a r13 = com.google.android.gms.auth.api.signin.p10742a.C142885a.f387700b     // Catch:{ all -> 0x0141 }
            if (r13 != 0) goto L_0x003f
            com.google.android.gms.auth.api.signin.a.a r13 = new com.google.android.gms.auth.api.signin.a.a     // Catch:{ all -> 0x0141 }
            android.content.Context r12 = r12.getApplicationContext()     // Catch:{ all -> 0x0141 }
            r13.<init>(r12)     // Catch:{ all -> 0x0141 }
            com.google.android.gms.auth.api.signin.p10742a.C142885a.f387700b = r13     // Catch:{ all -> 0x0141 }
        L_0x003f:
            com.google.android.gms.auth.api.signin.a.a r12 = com.google.android.gms.auth.api.signin.p10742a.C142885a.f387700b     // Catch:{ all -> 0x0141 }
            java.util.concurrent.locks.Lock r13 = com.google.android.gms.auth.api.signin.p10742a.C142885a.f387699a     // Catch:{ RemoteException -> 0x0148 }
            r13.unlock()     // Catch:{ RemoteException -> 0x0148 }
            java.lang.String r13 = "defaultGoogleSignInAccount"
            java.lang.String r13 = r12.mo117803a(r13)     // Catch:{ RemoteException -> 0x0148 }
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ RemoteException -> 0x0148 }
            if (r14 == 0) goto L_0x0054
            goto L_0x014c
        L_0x0054:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0148 }
            r14.<init>(r8)     // Catch:{ RemoteException -> 0x0148 }
            r14.append(r13)     // Catch:{ RemoteException -> 0x0148 }
            java.lang.String r8 = r14.toString()     // Catch:{ RemoteException -> 0x0148 }
            java.lang.String r8 = r12.mo117803a(r8)     // Catch:{ RemoteException -> 0x0148 }
            if (r8 == 0) goto L_0x014c
            boolean r12 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x014c }
            if (r12 == 0) goto L_0x006e
            goto L_0x014c
        L_0x006e:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x014c }
            r12.<init>(r8)     // Catch:{ JSONException -> 0x014c }
            java.lang.String r8 = "photoUrl"
            java.lang.String r8 = r12.optString(r8)     // Catch:{ JSONException -> 0x014c }
            boolean r13 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x014c }
            if (r13 != 0) goto L_0x0086
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{  }
            r19 = r8
            goto L_0x0088
        L_0x0086:
            r19 = 0
        L_0x0088:
            java.lang.String r8 = "expirationTime"
            java.lang.String r8 = r12.getString(r8)     // Catch:{ JSONException -> 0x014c }
            long r13 = java.lang.Long.parseLong(r8)     // Catch:{ JSONException -> 0x014c }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ JSONException -> 0x014c }
            r8.<init>()     // Catch:{ JSONException -> 0x014c }
            java.lang.String r15 = "grantedScopes"
            org.json.JSONArray r15 = r12.getJSONArray(r15)     // Catch:{ JSONException -> 0x014c }
            int r10 = r15.length()     // Catch:{ JSONException -> 0x014c }
            r16 = 0
            r9 = 0
        L_0x00a4:
            if (r9 >= r10) goto L_0x00c0
            r16 = r10
            com.google.android.gms.common.api.Scope r10 = new com.google.android.gms.common.api.Scope     // Catch:{ JSONException -> 0x014c }
            java.lang.String r2 = r15.getString(r9)     // Catch:{ JSONException -> 0x014c }
            r17 = r15
            r15 = 1
            r10.<init>(r15, r2)     // Catch:{ JSONException -> 0x014c }
            r8.add(r10)     // Catch:{ JSONException -> 0x014c }
            int r9 = r9 + 1
            r2 = r28
            r10 = r16
            r15 = r17
            goto L_0x00a4
        L_0x00c0:
            java.lang.String r2 = "id"
            java.lang.String r15 = r12.optString(r2)     // Catch:{ JSONException -> 0x014c }
            boolean r2 = r12.has(r7)     // Catch:{ JSONException -> 0x014c }
            if (r2 == 0) goto L_0x00d3
            java.lang.String r2 = r12.optString(r7)     // Catch:{ JSONException -> 0x014c }
            r16 = r2
            goto L_0x00d5
        L_0x00d3:
            r16 = 0
        L_0x00d5:
            boolean r2 = r12.has(r6)     // Catch:{ JSONException -> 0x014c }
            if (r2 == 0) goto L_0x00e2
            java.lang.String r2 = r12.optString(r6)     // Catch:{ JSONException -> 0x014c }
            r17 = r2
            goto L_0x00e4
        L_0x00e2:
            r17 = 0
        L_0x00e4:
            boolean r2 = r12.has(r5)     // Catch:{ JSONException -> 0x014c }
            if (r2 == 0) goto L_0x00f1
            java.lang.String r2 = r12.optString(r5)     // Catch:{ JSONException -> 0x014c }
            r18 = r2
            goto L_0x00f3
        L_0x00f1:
            r18 = 0
        L_0x00f3:
            boolean r2 = r12.has(r4)     // Catch:{ JSONException -> 0x014c }
            if (r2 == 0) goto L_0x0100
            java.lang.String r2 = r12.optString(r4)     // Catch:{ JSONException -> 0x014c }
            r25 = r2
            goto L_0x0102
        L_0x0100:
            r25 = 0
        L_0x0102:
            boolean r2 = r12.has(r3)     // Catch:{ JSONException -> 0x014c }
            if (r2 == 0) goto L_0x010f
            java.lang.String r2 = r12.optString(r3)     // Catch:{ JSONException -> 0x014c }
            r26 = r2
            goto L_0x0111
        L_0x010f:
            r26 = 0
        L_0x0111:
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ JSONException -> 0x014c }
            java.lang.String r3 = "obfuscatedIdentifier"
            java.lang.String r23 = r12.getString(r3)     // Catch:{ JSONException -> 0x014c }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount     // Catch:{ JSONException -> 0x014c }
            long r21 = r2.longValue()     // Catch:{ JSONException -> 0x014c }
            com.google.android.gms.common.internal.C143919bh.m233969l(r23)     // Catch:{ JSONException -> 0x014c }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x014c }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x014c }
            r14 = 3
            r20 = 0
            r13 = r3
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26)     // Catch:{ JSONException -> 0x014c }
            boolean r2 = r12.has(r0)     // Catch:{ JSONException -> 0x014c }
            if (r2 == 0) goto L_0x013d
            java.lang.String r0 = r12.optString(r0)     // Catch:{ JSONException -> 0x014c }
            goto L_0x013e
        L_0x013d:
            r0 = 0
        L_0x013e:
            r3.f387692g = r0     // Catch:{ JSONException -> 0x014c }
            goto L_0x014d
        L_0x0141:
            r0 = move-exception
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.auth.api.signin.p10742a.C142885a.f387699a     // Catch:{ RemoteException -> 0x0148 }
            r2.unlock()     // Catch:{ RemoteException -> 0x0148 }
            throw r0     // Catch:{ RemoteException -> 0x0148 }
        L_0x0148:
            r0 = move-exception
            r3 = r28
            goto L_0x017e
        L_0x014c:
            r3 = 0
        L_0x014d:
            com.google.android.gms.common.internal.ResolveAccountRequest r0 = new com.google.android.gms.common.internal.ResolveAccountRequest     // Catch:{ RemoteException -> 0x0148 }
            java.lang.Integer r2 = r1.f394690a     // Catch:{ RemoteException -> 0x0148 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r2)     // Catch:{ RemoteException -> 0x0148 }
            int r2 = r2.intValue()     // Catch:{ RemoteException -> 0x0148 }
            r4 = 2
            r0.<init>(r4, r11, r2, r3)     // Catch:{ RemoteException -> 0x0148 }
            android.os.IInterface r2 = r27.mo119451G()     // Catch:{ RemoteException -> 0x0148 }
            com.google.android.gms.signin.internal.e r2 = (com.google.android.gms.signin.internal.C145999e) r2     // Catch:{ RemoteException -> 0x0148 }
            com.google.android.gms.signin.internal.SignInRequest r3 = new com.google.android.gms.signin.internal.SignInRequest     // Catch:{ RemoteException -> 0x0148 }
            r4 = 1
            r3.<init>(r4, r0)     // Catch:{ RemoteException -> 0x0148 }
            android.os.Parcel r0 = r2.mo17260gA()     // Catch:{ RemoteException -> 0x0148 }
            com.google.android.p445a.C8850c.m23497f(r0, r3)     // Catch:{ RemoteException -> 0x0148 }
            r3 = r28
            com.google.android.p445a.C8850c.m23499h(r0, r3)     // Catch:{ RemoteException -> 0x017a }
            r4 = 12
            r2.mo17262he(r4, r0)     // Catch:{ RemoteException -> 0x017a }
            return
        L_0x017a:
            r0 = move-exception
            goto L_0x017e
        L_0x017c:
            r0 = move-exception
            r3 = r2
        L_0x017e:
            java.lang.String r2 = "Remote service probably died when signIn is called"
            java.lang.String r4 = "SignInClientImpl"
            android.util.Log.w(r4, r2)
            com.google.android.gms.signin.internal.SignInResponse r2 = new com.google.android.gms.signin.internal.SignInResponse     // Catch:{ RemoteException -> 0x0197 }
            com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult     // Catch:{ RemoteException -> 0x0197 }
            r6 = 8
            r7 = 1
            r8 = 0
            r5.<init>(r7, r6, r8, r8)     // Catch:{ RemoteException -> 0x0197 }
            r2.<init>(r7, r5, r8)     // Catch:{ RemoteException -> 0x0197 }
            r3.mo119147a(r2)     // Catch:{ RemoteException -> 0x0197 }
            return
        L_0x0197:
            java.lang.String r2 = "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException."
            android.util.Log.wtf(r4, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.C146001g.mo122464g(com.google.android.gms.signin.internal.d):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Bundle mo117789i() {
        if (!this.f390156t.getPackageName().equals(this.f394692c.f390173e)) {
            this.f394693d.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f394692c.f390173e);
        }
        return this.f394693d;
    }

    /* renamed from: j */
    public final boolean mo117790j() {
        return this.f394691b;
    }
}
