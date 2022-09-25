package com.google.android.gms.googlehelp.internal.common;

import android.content.Context;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: com.google.android.gms.googlehelp.internal.common.c */
/* compiled from: PG */
public final class C144308c implements Runnable {

    /* renamed from: a */
    private final Context f390837a;

    /* renamed from: b */
    private final GoogleHelp f390838b;

    /* renamed from: c */
    private final long f390839c;

    public C144308c(Context context, GoogleHelp googleHelp, long j) {
        this.f390837a = context;
        this.f390838b = googleHelp;
        this.f390839c = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            java.lang.String r0 = "gms:googlehelp:async_help_psd_collection_time_ms"
            com.google.android.gms.feedback.a.a.b r1 = new com.google.android.gms.feedback.a.a.b     // Catch:{ Exception -> 0x003a }
            r2 = 0
            r1.<init>(r2)     // Catch:{ Exception -> 0x003a }
            long r2 = r1.mo119734b()     // Catch:{ Exception -> 0x003a }
            r1.f390596b = r2     // Catch:{ Exception -> 0x003a }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x003a }
            r3 = 1
            r2.<init>(r3)     // Catch:{ Exception -> 0x003a }
            long r3 = r1.mo119733a()     // Catch:{ UnsupportedOperationException -> 0x0024 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ UnsupportedOperationException -> 0x0024 }
            android.util.Pair r3 = android.util.Pair.create(r0, r3)     // Catch:{ UnsupportedOperationException -> 0x0024 }
            r2.add(r3)     // Catch:{ UnsupportedOperationException -> 0x0024 }
            goto L_0x004e
        L_0x0024:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x003a }
            r3.<init>(r2)     // Catch:{ Exception -> 0x003a }
            long r1 = r1.mo119733a()     // Catch:{ Exception -> 0x003a }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x003a }
            android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ Exception -> 0x003a }
            r3.add(r0)     // Catch:{ Exception -> 0x003a }
            r2 = r3
            goto L_0x004e
        L_0x003a:
            r0 = move-exception
            java.lang.String r1 = "gH_GetAsyncHelpPsd"
            java.lang.String r2 = "Failed to get async help psd."
            android.util.Log.w(r1, r2, r0)
            java.lang.String r0 = "gms:googlehelp:async_help_psd_failure"
            java.lang.String r1 = "exception"
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            java.util.List r2 = java.util.Collections.singletonList(r0)
        L_0x004e:
            android.content.Context r0 = r9.f390837a
            com.google.android.gms.googlehelp.internal.common.ac r0 = com.google.android.gms.googlehelp.C144293i.m234538b(r0)
            com.google.android.gms.googlehelp.GoogleHelp r8 = r9.f390838b
            android.os.Bundle r5 = com.google.android.gms.feedback.p10795a.p10796a.C144191a.m234429a(r2)
            long r6 = r9.f390839c
            com.google.android.gms.common.api.w r0 = r0.f389929D
            com.google.android.gms.googlehelp.internal.common.y r1 = new com.google.android.gms.googlehelp.internal.common.y
            r3 = r1
            r4 = r0
            r3.<init>(r4, r5, r6, r8)
            r0.mo119159d(r1)
            com.google.android.gms.common.internal.C143918bg.m233956b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.internal.common.C144308c.run():void");
    }
}
