package com.google.firebase.iid;

import androidx.p060c.C0977g;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.q */
/* compiled from: PG */
final class C61225q {

    /* renamed from: a */
    public final Map f165611a = new C0977g();

    /* renamed from: b */
    private final Executor f165612b;

    public C61225q(Executor executor) {
        this.f165612b = executor;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        return r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.tasks.C146006ab mo57793a(java.lang.String r8, java.lang.String r9, com.google.firebase.iid.C61212d r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x018f }
            r0.<init>(r8, r9)     // Catch:{ all -> 0x018f }
            java.util.Map r8 = r7.f165611a     // Catch:{ all -> 0x018f }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x018f }
            com.google.android.gms.tasks.ab r8 = (com.google.android.gms.tasks.C146006ab) r8     // Catch:{ all -> 0x018f }
            r9 = 3
            if (r8 == 0) goto L_0x002a
            java.lang.String r10 = "FirebaseInstanceId"
            boolean r9 = android.util.Log.isLoggable(r10, r9)     // Catch:{ all -> 0x018f }
            if (r9 == 0) goto L_0x0028
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r10 = "Joining ongoing request for: "
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x018f }
            java.lang.String r10 = r10.concat(r0)     // Catch:{ all -> 0x018f }
            android.util.Log.d(r9, r10)     // Catch:{ all -> 0x018f }
        L_0x0028:
            monitor-exit(r7)
            return r8
        L_0x002a:
            java.lang.String r8 = "FirebaseInstanceId"
            boolean r8 = android.util.Log.isLoggable(r8, r9)     // Catch:{ all -> 0x018f }
            if (r8 == 0) goto L_0x0041
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r9 = "Making new request for: "
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x018f }
            java.lang.String r9 = r9.concat(r1)     // Catch:{ all -> 0x018f }
            android.util.Log.d(r8, r9)     // Catch:{ all -> 0x018f }
        L_0x0041:
            com.google.firebase.iid.FirebaseInstanceId r8 = r10.f165583a     // Catch:{ all -> 0x018f }
            java.lang.String r9 = r10.f165584b     // Catch:{ all -> 0x018f }
            java.lang.String r1 = r10.f165585c     // Catch:{ all -> 0x018f }
            java.lang.String r2 = r10.f165586d     // Catch:{ all -> 0x018f }
            com.google.firebase.iid.s r10 = r10.f165587e     // Catch:{ all -> 0x018f }
            com.google.firebase.iid.j r3 = r8.f165573f     // Catch:{ all -> 0x018f }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x018f }
            r4.<init>()     // Catch:{ all -> 0x018f }
            java.lang.String r5 = "scope"
            r4.putString(r5, r2)     // Catch:{ all -> 0x018f }
            java.lang.String r5 = "sender"
            r4.putString(r5, r1)     // Catch:{ all -> 0x018f }
            java.lang.String r5 = "subtype"
            r4.putString(r5, r1)     // Catch:{ all -> 0x018f }
            java.lang.String r5 = "appid"
            r4.putString(r5, r9)     // Catch:{ all -> 0x018f }
            com.google.firebase.g r9 = r3.f165595a     // Catch:{ all -> 0x018f }
            r9.mo57770f()     // Catch:{ all -> 0x018f }
            java.lang.String r5 = "gmp_app_id"
            com.google.firebase.n r9 = r9.f165557e     // Catch:{ all -> 0x018f }
            java.lang.String r9 = r9.f165714b     // Catch:{ all -> 0x018f }
            r4.putString(r5, r9)     // Catch:{ all -> 0x018f }
            java.lang.String r9 = "gmsv"
            com.google.firebase.iid.l r5 = r3.f165596b     // Catch:{ all -> 0x018f }
            int r5 = r5.mo57789a()     // Catch:{ all -> 0x018f }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x018f }
            r4.putString(r9, r5)     // Catch:{ all -> 0x018f }
            java.lang.String r9 = "osv"
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x018f }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x018f }
            r4.putString(r9, r5)     // Catch:{ all -> 0x018f }
            java.lang.String r9 = "app_ver"
            com.google.firebase.iid.l r5 = r3.f165596b     // Catch:{ all -> 0x018f }
            java.lang.String r5 = r5.mo57791c()     // Catch:{ all -> 0x018f }
            r4.putString(r9, r5)     // Catch:{ all -> 0x018f }
            java.lang.String r9 = "app_ver_name"
            com.google.firebase.iid.l r5 = r3.f165596b     // Catch:{ all -> 0x018f }
            java.lang.String r5 = r5.mo57792d()     // Catch:{ all -> 0x018f }
            r4.putString(r9, r5)     // Catch:{ all -> 0x018f }
            java.lang.String r9 = "firebase-app-name-hash"
            java.lang.String r5 = r3.mo57788a()     // Catch:{ all -> 0x018f }
            r4.putString(r9, r5)     // Catch:{ all -> 0x018f }
            com.google.firebase.installations.h r9 = r3.f165600f     // Catch:{ ExecutionException -> 0x00d3, InterruptedException -> 0x00d1 }
            com.google.android.gms.tasks.ab r9 = r9.mo57872k()     // Catch:{ ExecutionException -> 0x00d3, InterruptedException -> 0x00d1 }
            java.lang.Object r9 = com.google.android.gms.tasks.C146021aq.m237852f(r9)     // Catch:{ ExecutionException -> 0x00d3, InterruptedException -> 0x00d1 }
            com.google.firebase.installations.m r9 = (com.google.firebase.installations.C61261m) r9     // Catch:{ ExecutionException -> 0x00d3, InterruptedException -> 0x00d1 }
            java.lang.String r9 = r9.mo57806c()     // Catch:{ ExecutionException -> 0x00d3, InterruptedException -> 0x00d1 }
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch:{ ExecutionException -> 0x00d3, InterruptedException -> 0x00d1 }
            if (r5 != 0) goto L_0x00c9
            java.lang.String r5 = "Goog-Firebase-Installations-Auth"
            r4.putString(r5, r9)     // Catch:{ ExecutionException -> 0x00d3, InterruptedException -> 0x00d1 }
            goto L_0x00db
        L_0x00c9:
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r5 = "FIS auth token is empty"
            android.util.Log.w(r9, r5)     // Catch:{ ExecutionException -> 0x00d3, InterruptedException -> 0x00d1 }
            goto L_0x00db
        L_0x00d1:
            r9 = move-exception
            goto L_0x00d4
        L_0x00d3:
            r9 = move-exception
        L_0x00d4:
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r6 = "Failed to get FIS auth token"
            android.util.Log.e(r5, r6, r9)     // Catch:{ all -> 0x018f }
        L_0x00db:
            java.lang.String r9 = "cliv"
            java.lang.String r5 = "fiid-21.1.1"
            r4.putString(r9, r5)     // Catch:{ all -> 0x018f }
            com.google.firebase.d.a r9 = r3.f165599e     // Catch:{ all -> 0x018f }
            java.lang.Object r9 = r9.mo57687a()     // Catch:{ all -> 0x018f }
            com.google.firebase.c.k r9 = (com.google.firebase.p4610c.C61137k) r9     // Catch:{ all -> 0x018f }
            com.google.firebase.d.a r5 = r3.f165598d     // Catch:{ all -> 0x018f }
            java.lang.Object r5 = r5.mo57687a()     // Catch:{ all -> 0x018f }
            com.google.firebase.f.i r5 = (com.google.firebase.p4613f.C61203i) r5     // Catch:{ all -> 0x018f }
            if (r9 == 0) goto L_0x0111
            if (r5 == 0) goto L_0x0111
            int r9 = r9.mo57699b()     // Catch:{ all -> 0x018f }
            r6 = 1
            if (r9 == r6) goto L_0x0111
            java.lang.String r6 = "Firebase-Client-Log-Type"
            int r9 = r9 + -1
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x018f }
            r4.putString(r6, r9)     // Catch:{ all -> 0x018f }
            java.lang.String r9 = "Firebase-Client"
            java.lang.String r5 = r5.mo57764a()     // Catch:{ all -> 0x018f }
            r4.putString(r9, r5)     // Catch:{ all -> 0x018f }
        L_0x0111:
            com.google.android.gms.cloudmessaging.w r9 = r3.f165597c     // Catch:{ all -> 0x018f }
            com.google.android.gms.cloudmessaging.o r3 = r9.f389567e     // Catch:{ all -> 0x018f }
            int r3 = r3.mo119060a()     // Catch:{ all -> 0x018f }
            r5 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r3 < r5) goto L_0x013a
            android.content.Context r9 = r9.f389566d     // Catch:{ all -> 0x018f }
            com.google.android.gms.cloudmessaging.n r9 = com.google.android.gms.cloudmessaging.C143687n.m233422b(r9)     // Catch:{ all -> 0x018f }
            com.google.android.gms.cloudmessaging.m r3 = new com.google.android.gms.cloudmessaging.m     // Catch:{ all -> 0x018f }
            int r5 = r9.mo119058a()     // Catch:{ all -> 0x018f }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x018f }
            com.google.android.gms.tasks.ab r9 = r9.mo119059c(r3)     // Catch:{ all -> 0x018f }
            java.util.concurrent.Executor r3 = com.google.android.gms.cloudmessaging.C143696w.f389561a     // Catch:{ all -> 0x018f }
            com.google.android.gms.cloudmessaging.p r4 = com.google.android.gms.cloudmessaging.C143689p.f389551a     // Catch:{ all -> 0x018f }
            com.google.android.gms.tasks.ab r9 = r9.mo122482a(r3, r4)     // Catch:{ all -> 0x018f }
            goto L_0x015d
        L_0x013a:
            com.google.android.gms.cloudmessaging.o r3 = r9.f389567e     // Catch:{ all -> 0x018f }
            int r3 = r3.mo119061b()     // Catch:{ all -> 0x018f }
            if (r3 == 0) goto L_0x0152
            com.google.android.gms.tasks.ab r3 = r9.mo119065a(r4)     // Catch:{ all -> 0x018f }
            java.util.concurrent.Executor r5 = com.google.android.gms.cloudmessaging.C143696w.f389561a     // Catch:{ all -> 0x018f }
            com.google.android.gms.cloudmessaging.t r6 = new com.google.android.gms.cloudmessaging.t     // Catch:{ all -> 0x018f }
            r6.<init>(r9, r4)     // Catch:{ all -> 0x018f }
            com.google.android.gms.tasks.ab r9 = r3.mo122484c(r5, r6)     // Catch:{ all -> 0x018f }
            goto L_0x015d
        L_0x0152:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x018f }
            java.lang.String r3 = "MISSING_INSTANCEID_SERVICE"
            r9.<init>(r3)     // Catch:{ all -> 0x018f }
            com.google.android.gms.tasks.ab r9 = com.google.android.gms.tasks.C146021aq.m237849c(r9)     // Catch:{ all -> 0x018f }
        L_0x015d:
            java.util.concurrent.Executor r3 = com.google.firebase.iid.C61210b.f165579a     // Catch:{ all -> 0x018f }
            com.google.firebase.iid.i r4 = new com.google.firebase.iid.i     // Catch:{ all -> 0x018f }
            r4.<init>()     // Catch:{ all -> 0x018f }
            com.google.android.gms.tasks.ab r9 = r9.mo122482a(r3, r4)     // Catch:{ all -> 0x018f }
            java.util.concurrent.Executor r3 = r8.f165570c     // Catch:{ all -> 0x018f }
            com.google.firebase.iid.e r4 = new com.google.firebase.iid.e     // Catch:{ all -> 0x018f }
            r4.<init>(r8, r1, r2)     // Catch:{ all -> 0x018f }
            com.google.android.gms.tasks.ab r9 = r9.mo122486e(r3, r4)     // Catch:{ all -> 0x018f }
            com.google.firebase.iid.f r1 = com.google.firebase.iid.C61214f.f165591a     // Catch:{ all -> 0x018f }
            com.google.firebase.iid.g r2 = new com.google.firebase.iid.g     // Catch:{ all -> 0x018f }
            r2.<init>(r8, r10)     // Catch:{ all -> 0x018f }
            r9.mo122495n(r1, r2)     // Catch:{ all -> 0x018f }
            java.util.concurrent.Executor r8 = r7.f165612b     // Catch:{ all -> 0x018f }
            com.google.firebase.iid.p r10 = new com.google.firebase.iid.p     // Catch:{ all -> 0x018f }
            r10.<init>(r7, r0)     // Catch:{ all -> 0x018f }
            com.google.android.gms.tasks.ab r8 = r9.mo122484c(r8, r10)     // Catch:{ all -> 0x018f }
            java.util.Map r9 = r7.f165611a     // Catch:{ all -> 0x018f }
            r9.put(r0, r8)     // Catch:{ all -> 0x018f }
            monitor-exit(r7)
            return r8
        L_0x018f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C61225q.mo57793a(java.lang.String, java.lang.String, com.google.firebase.iid.d):com.google.android.gms.tasks.ab");
    }
}
