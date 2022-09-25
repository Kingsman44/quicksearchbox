package com.google.firebase.iid;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.firebase.C61204g;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.iid.v */
/* compiled from: PG */
final class C61230v implements Runnable {

    /* renamed from: a */
    public final FirebaseInstanceId f165624a;

    /* renamed from: b */
    final ExecutorService f165625b = C61210b.m93602a();

    /* renamed from: c */
    private final long f165626c;

    /* renamed from: d */
    private final PowerManager.WakeLock f165627d;

    public C61230v(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f165624a = firebaseInstanceId;
        this.f165626c = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo57801a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f165627d = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo57801a() {
        C61204g gVar = this.f165624a.f165571d;
        gVar.mo57770f();
        return gVar.f165555c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo57802b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo57801a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "Token retrieval failed: "
            java.lang.String r2 = "Topic sync or token retrieval failed on hard failure exceptions: "
            com.google.firebase.iid.r r3 = com.google.firebase.iid.C61226r.m93620a()
            android.content.Context r4 = r8.mo57801a()
            boolean r3 = r3.mo57794b(r4)
            if (r3 == 0) goto L_0x0019
            android.os.PowerManager$WakeLock r3 = r8.f165627d
            r3.acquire()
        L_0x0019:
            r3 = 0
            com.google.firebase.iid.FirebaseInstanceId r4 = r8.f165624a     // Catch:{ IOException -> 0x014a }
            r5 = 1
            r4.mo57781h(r5)     // Catch:{ IOException -> 0x014a }
            com.google.firebase.iid.FirebaseInstanceId r4 = r8.f165624a     // Catch:{ IOException -> 0x014a }
            com.google.firebase.iid.l r4 = r4.f165572e     // Catch:{ IOException -> 0x014a }
            int r4 = r4.mo57790b()     // Catch:{ IOException -> 0x014a }
            if (r4 == 0) goto L_0x0132
            com.google.firebase.iid.r r4 = com.google.firebase.iid.C61226r.m93620a()     // Catch:{ IOException -> 0x014a }
            android.content.Context r6 = r8.mo57801a()     // Catch:{ IOException -> 0x014a }
            java.lang.Boolean r7 = r4.f165615b     // Catch:{ IOException -> 0x014a }
            if (r7 != 0) goto L_0x0046
            java.lang.String r7 = "android.permission.ACCESS_NETWORK_STATE"
            int r6 = r6.checkCallingOrSelfPermission(r7)     // Catch:{ IOException -> 0x014a }
            if (r6 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ IOException -> 0x014a }
            r4.f165615b = r5     // Catch:{ IOException -> 0x014a }
        L_0x0046:
            java.lang.Boolean r5 = r4.f165614a     // Catch:{ IOException -> 0x014a }
            boolean r5 = r5.booleanValue()     // Catch:{ IOException -> 0x014a }
            r6 = 3
            if (r5 != 0) goto L_0x005a
            boolean r5 = android.util.Log.isLoggable(r0, r6)     // Catch:{ IOException -> 0x014a }
            if (r5 == 0) goto L_0x005a
            java.lang.String r5 = "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest"
            android.util.Log.d(r0, r5)     // Catch:{ IOException -> 0x014a }
        L_0x005a:
            java.lang.Boolean r4 = r4.f165615b     // Catch:{ IOException -> 0x014a }
            boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x014a }
            if (r4 == 0) goto L_0x009c
            boolean r4 = r8.mo57802b()     // Catch:{ IOException -> 0x014a }
            if (r4 != 0) goto L_0x009c
            com.google.firebase.iid.u r1 = new com.google.firebase.iid.u     // Catch:{ IOException -> 0x014a }
            r1.<init>(r8)     // Catch:{ IOException -> 0x014a }
            boolean r4 = com.google.firebase.iid.FirebaseInstanceId.m93588k()     // Catch:{ IOException -> 0x014a }
            if (r4 == 0) goto L_0x0078
            java.lang.String r4 = "Connectivity change received registered"
            android.util.Log.d(r0, r4)     // Catch:{ IOException -> 0x014a }
        L_0x0078:
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch:{ IOException -> 0x014a }
            java.lang.String r5 = "android.net.conn.CONNECTIVITY_CHANGE"
            r4.<init>(r5)     // Catch:{ IOException -> 0x014a }
            com.google.firebase.iid.v r5 = r1.f165623a     // Catch:{ IOException -> 0x014a }
            android.content.Context r5 = r5.mo57801a()     // Catch:{ IOException -> 0x014a }
            r5.registerReceiver(r1, r4)     // Catch:{ IOException -> 0x014a }
            com.google.firebase.iid.r r0 = com.google.firebase.iid.C61226r.m93620a()
            android.content.Context r1 = r8.mo57801a()
            boolean r0 = r0.mo57794b(r1)
            if (r0 == 0) goto L_0x009b
        L_0x0096:
            android.os.PowerManager$WakeLock r0 = r8.f165627d
            r0.release()
        L_0x009b:
            return
        L_0x009c:
            com.google.firebase.iid.FirebaseInstanceId r4 = r8.f165624a     // Catch:{ IOException -> 0x014a }
            com.google.firebase.iid.s r4 = r4.mo57775a()     // Catch:{ IOException -> 0x014a }
            com.google.firebase.iid.FirebaseInstanceId r5 = r8.f165624a     // Catch:{ IOException -> 0x014a }
            boolean r4 = r5.mo57784l(r4)     // Catch:{ IOException -> 0x014a }
            if (r4 != 0) goto L_0x00ab
            goto L_0x00cc
        L_0x00ab:
            com.google.firebase.iid.FirebaseInstanceId r4 = r8.f165624a     // Catch:{ IOException -> 0x00d8, SecurityException -> 0x00d2 }
            com.google.firebase.g r5 = r4.f165571d     // Catch:{ IOException -> 0x00d8, SecurityException -> 0x00d2 }
            java.lang.String r5 = com.google.firebase.iid.C61220l.m93609e(r5)     // Catch:{ IOException -> 0x00d8, SecurityException -> 0x00d2 }
            java.lang.String r7 = "*"
            java.lang.String r4 = r4.mo57779e(r5, r7)     // Catch:{ IOException -> 0x00d8, SecurityException -> 0x00d2 }
            if (r4 != 0) goto L_0x00c1
            java.lang.String r4 = "Token retrieval failed: null"
            android.util.Log.e(r0, r4)     // Catch:{ IOException -> 0x00d8, SecurityException -> 0x00d2 }
            goto L_0x011b
        L_0x00c1:
            boolean r4 = android.util.Log.isLoggable(r0, r6)     // Catch:{ IOException -> 0x00d8, SecurityException -> 0x00d2 }
            if (r4 == 0) goto L_0x00cc
            java.lang.String r4 = "Token successfully retrieved"
            android.util.Log.d(r0, r4)     // Catch:{ IOException -> 0x00d8, SecurityException -> 0x00d2 }
        L_0x00cc:
            com.google.firebase.iid.FirebaseInstanceId r1 = r8.f165624a     // Catch:{ IOException -> 0x014a }
            r1.mo57781h(r3)     // Catch:{ IOException -> 0x014a }
            goto L_0x0122
        L_0x00d2:
            java.lang.String r1 = "Token retrieval failed with SecurityException. Will retry token retrieval"
            android.util.Log.w(r0, r1)     // Catch:{ IOException -> 0x014a }
            goto L_0x011b
        L_0x00d8:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()     // Catch:{ IOException -> 0x014a }
            java.lang.String r6 = "SERVICE_NOT_AVAILABLE"
            boolean r6 = r6.equals(r5)     // Catch:{ IOException -> 0x014a }
            if (r6 != 0) goto L_0x0103
            java.lang.String r6 = "INTERNAL_SERVER_ERROR"
            boolean r6 = r6.equals(r5)     // Catch:{ IOException -> 0x014a }
            if (r6 != 0) goto L_0x0103
            java.lang.String r6 = "InternalServerError"
            boolean r5 = r6.equals(r5)     // Catch:{ IOException -> 0x014a }
            if (r5 == 0) goto L_0x00f6
            goto L_0x0103
        L_0x00f6:
            java.lang.String r1 = r4.getMessage()     // Catch:{ IOException -> 0x014a }
            if (r1 != 0) goto L_0x0102
            java.lang.String r1 = "Token retrieval failed without exception message. Will retry token retrieval"
            android.util.Log.w(r0, r1)     // Catch:{ IOException -> 0x014a }
            goto L_0x011b
        L_0x0102:
            throw r4     // Catch:{ IOException -> 0x014a }
        L_0x0103:
            java.lang.String r4 = r4.getMessage()     // Catch:{ IOException -> 0x014a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x014a }
            r5.<init>(r1)     // Catch:{ IOException -> 0x014a }
            r5.append(r4)     // Catch:{ IOException -> 0x014a }
            java.lang.String r1 = ". Will retry token retrieval"
            r5.append(r1)     // Catch:{ IOException -> 0x014a }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException -> 0x014a }
            android.util.Log.w(r0, r1)     // Catch:{ IOException -> 0x014a }
        L_0x011b:
            com.google.firebase.iid.FirebaseInstanceId r1 = r8.f165624a     // Catch:{ IOException -> 0x014a }
            long r4 = r8.f165626c     // Catch:{ IOException -> 0x014a }
            r1.mo57783j(r4)     // Catch:{ IOException -> 0x014a }
        L_0x0122:
            com.google.firebase.iid.r r0 = com.google.firebase.iid.C61226r.m93620a()
            android.content.Context r1 = r8.mo57801a()
            boolean r0 = r0.mo57794b(r1)
            if (r0 == 0) goto L_0x0178
            goto L_0x0096
        L_0x0132:
            com.google.firebase.iid.FirebaseInstanceId r1 = r8.f165624a     // Catch:{ IOException -> 0x014a }
            r1.mo57781h(r3)     // Catch:{ IOException -> 0x014a }
            com.google.firebase.iid.r r0 = com.google.firebase.iid.C61226r.m93620a()
            android.content.Context r1 = r8.mo57801a()
            boolean r0 = r0.mo57794b(r1)
            if (r0 == 0) goto L_0x0147
            goto L_0x0096
        L_0x0147:
            return
        L_0x0148:
            r0 = move-exception
            goto L_0x0179
        L_0x014a:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0148 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0148 }
            r4.<init>(r2)     // Catch:{ all -> 0x0148 }
            r4.append(r1)     // Catch:{ all -> 0x0148 }
            java.lang.String r1 = ". Won't retry the operation."
            r4.append(r1)     // Catch:{ all -> 0x0148 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0148 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0148 }
            com.google.firebase.iid.FirebaseInstanceId r0 = r8.f165624a     // Catch:{ all -> 0x0148 }
            r0.mo57781h(r3)     // Catch:{ all -> 0x0148 }
            com.google.firebase.iid.r r0 = com.google.firebase.iid.C61226r.m93620a()
            android.content.Context r1 = r8.mo57801a()
            boolean r0 = r0.mo57794b(r1)
            if (r0 == 0) goto L_0x0178
            goto L_0x0096
        L_0x0178:
            return
        L_0x0179:
            com.google.firebase.iid.r r1 = com.google.firebase.iid.C61226r.m93620a()
            android.content.Context r2 = r8.mo57801a()
            boolean r1 = r1.mo57794b(r2)
            if (r1 == 0) goto L_0x018c
            android.os.PowerManager$WakeLock r1 = r8.f165627d
            r1.release()
        L_0x018c:
            goto L_0x018e
        L_0x018d:
            throw r0
        L_0x018e:
            goto L_0x018d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C61230v.run():void");
    }
}
