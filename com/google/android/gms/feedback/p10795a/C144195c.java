package com.google.android.gms.feedback.p10795a;

import android.content.Context;
import com.google.android.gms.feedback.C144189a;

/* renamed from: com.google.android.gms.feedback.a.c */
/* compiled from: PG */
public final class C144195c implements Runnable {

    /* renamed from: a */
    private final Context f390604a;

    /* renamed from: b */
    private final C144189a f390605b;

    /* renamed from: c */
    private final long f390606c;

    public C144195c(Context context, C144189a aVar, long j) {
        this.f390604a = context;
        this.f390605b = aVar;
        this.f390606c = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(1:4)|5|6|7|8|9|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            java.lang.String r0 = "gms:feedback:async_feedback_psd_collection_time_ms"
            com.google.android.gms.feedback.a.a.b r1 = new com.google.android.gms.feedback.a.a.b     // Catch:{ Exception -> 0x0042 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ Exception -> 0x0042 }
            long r2 = r1.mo119734b()     // Catch:{ Exception -> 0x0042 }
            r1.f390596b = r2     // Catch:{ Exception -> 0x0042 }
            com.google.android.gms.feedback.a r2 = r5.f390605b     // Catch:{ Exception -> 0x0042 }
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
            java.lang.String r1 = "gF_GetAsyncFeedbackPsd"
            java.lang.String r2 = "Failed to get async Feedback psd."
            android.util.Log.w(r1, r2, r0)
            java.lang.String r0 = "gms:feedback:async_feedback_psd_failure"
            java.lang.String r1 = "exception"
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            java.util.List r2 = java.util.Collections.singletonList(r0)
        L_0x0056:
            android.content.Context r0 = r5.f390604a
            com.google.android.gms.feedback.k r0 = com.google.android.gms.feedback.C144205j.m234448e(r0)
            android.os.Bundle r1 = com.google.android.gms.feedback.p10795a.p10796a.C144191a.m234429a(r2)
            long r2 = r5.f390606c
            com.google.android.gms.common.api.w r0 = r0.f389929D
            com.google.android.gms.common.api.z r0 = com.google.android.gms.feedback.C144205j.m234445b(r0, r1, r2)
            com.google.android.gms.common.internal.C143918bg.m233956b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.feedback.p10795a.C144195c.run():void");
    }
}
