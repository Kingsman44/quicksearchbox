package com.google.android.gms.googlehelp.internal.common;

import android.content.Context;
import com.google.android.gms.feedback.C144189a;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: com.google.android.gms.googlehelp.internal.common.b */
/* compiled from: PG */
public final class C144307b implements Runnable {

    /* renamed from: a */
    private final Context f390833a;

    /* renamed from: b */
    private final GoogleHelp f390834b;

    /* renamed from: c */
    private final C144189a f390835c;

    /* renamed from: d */
    private final long f390836d;

    public C144307b(Context context, GoogleHelp googleHelp, C144189a aVar, long j) {
        this.f390833a = context;
        this.f390834b = googleHelp;
        this.f390835c = aVar;
        this.f390836d = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(1:4)|5|6|7|8|9|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            java.lang.String r0 = "gms:feedback:async_feedback_psd_collection_time_ms"
            com.google.android.gms.feedback.a.a.b r1 = new com.google.android.gms.feedback.a.a.b     // Catch:{ Exception -> 0x0042 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ Exception -> 0x0042 }
            long r2 = r1.mo119734b()     // Catch:{ Exception -> 0x0042 }
            r1.f390596b = r2     // Catch:{ Exception -> 0x0042 }
            com.google.android.gms.feedback.a r2 = r9.f390835c     // Catch:{ Exception -> 0x0042 }
            java.util.List r2 = r2.mo27017b()     // Catch:{ Exception -> 0x0042 }
            if (r2 != 0) goto L_0x001c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0042 }
            r3 = 1
            r2.<init>(r3)     // Catch:{ Exception -> 0x0042 }
        L_0x001c:
            long r3 = r1.mo119733a()     // Catch:{ UnsupportedOperationException -> 0x002c }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ UnsupportedOperationException -> 0x002c }
            android.util.Pair r3 = android.util.Pair.create(r0, r3)     // Catch:{ UnsupportedOperationException -> 0x002c }
            r2.add(r3)     // Catch:{ UnsupportedOperationException -> 0x002c }
            goto L_0x0056
        L_0x002c:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0042 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0042 }
            long r1 = r1.mo119733a()     // Catch:{ Exception -> 0x0042 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0042 }
            android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ Exception -> 0x0042 }
            r3.add(r0)     // Catch:{ Exception -> 0x0042 }
            r2 = r3
            goto L_0x0056
        L_0x0042:
            r0 = move-exception
            java.lang.String r1 = "gH_GetAsyncFeedbackPsd"
            java.lang.String r2 = "Failed to get async Feedback psd."
            android.util.Log.w(r1, r2, r0)
            java.lang.String r0 = "gms:feedback:async_feedback_psd_failure"
            java.lang.String r1 = "exception"
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            java.util.List r2 = java.util.Collections.singletonList(r0)
        L_0x0056:
            android.content.Context r0 = r9.f390833a
            com.google.android.gms.googlehelp.internal.common.ac r0 = com.google.android.gms.googlehelp.C144293i.m234538b(r0)
            com.google.android.gms.googlehelp.GoogleHelp r8 = r9.f390834b
            android.os.Bundle r5 = com.google.android.gms.feedback.p10795a.p10796a.C144191a.m234429a(r2)
            long r6 = r9.f390836d
            com.google.android.gms.common.api.w r0 = r0.f389929D
            com.google.android.gms.googlehelp.internal.common.j r1 = new com.google.android.gms.googlehelp.internal.common.j
            r3 = r1
            r4 = r0
            r3.<init>(r4, r5, r6, r8)
            r0.mo119159d(r1)
            com.google.android.gms.common.internal.C143918bg.m233956b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.internal.common.C144307b.run():void");
    }
}
