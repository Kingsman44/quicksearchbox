package com.google.android.apps.gsa.speech.microdetection;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.util.C90717aa;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.d */
/* compiled from: PG */
public final class C92532d extends C90717aa {

    /* renamed from: e */
    private final C86338r f258231e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92532d(com.google.android.libraries.p1730f.C21370a r11, com.google.android.apps.gsa.search.core.preferences.C86338r r12) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            r2 = 1200000000000(0x1176592e000, double:5.928787750095E-312)
            long r8 = java.lang.Math.max(r0, r2)
            java.lang.String r0 = "hotword_usage_stats"
            java.lang.String r1 = ""
            java.lang.String r0 = r12.getString(r0, r1)
            if (r0 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            r6 = 6000000000000(0x574fbde6000, double:2.9643938750475E-311)
            r4 = r10
            r5 = r11
            r4.<init>(r5, r6, r8)
            boolean r11 = android.text.TextUtils.isEmpty(r1)
            if (r11 != 0) goto L_0x005c
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ JSONException -> 0x004b }
            r11.<init>(r1)     // Catch:{ JSONException -> 0x004b }
            r0 = 0
            long r2 = r11.optLong(r0)     // Catch:{ JSONException -> 0x004b }
            r10.f253773b = r2     // Catch:{ JSONException -> 0x004b }
        L_0x0033:
            int[] r2 = r10.f253774c     // Catch:{ JSONException -> 0x004b }
            int r3 = r2.length     // Catch:{ JSONException -> 0x004b }
            if (r0 >= r3) goto L_0x0059
            int r3 = r0 + 1
            int r4 = r11.optInt(r3)     // Catch:{ JSONException -> 0x004b }
            r2[r0] = r4     // Catch:{ JSONException -> 0x004b }
            int r2 = r10.f253775d     // Catch:{ JSONException -> 0x004b }
            int[] r4 = r10.f253774c     // Catch:{ JSONException -> 0x004b }
            r0 = r4[r0]     // Catch:{ JSONException -> 0x004b }
            int r2 = r2 + r0
            r10.f253775d = r2     // Catch:{ JSONException -> 0x004b }
            r0 = r3
            goto L_0x0033
        L_0x004b:
            r11 = move-exception
            com.google.common.f.e r0 = com.google.android.apps.gsa.shared.util.C90717aa.f253772a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Error reading expiring sum from %s"
            r3 = 11317(0x2c35, float:1.5858E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r11)).mo56372aa(r3)).mo56389s(r2, r1)
        L_0x0059:
            super.mo85079c()
        L_0x005c:
            r10.f258231e = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.microdetection.C92532d.<init>(com.google.android.libraries.f.a, com.google.android.apps.gsa.search.core.preferences.r):void");
    }

    /* renamed from: d */
    public final synchronized void mo85080d() {
        super.mo85080d();
        C86337q b = this.f258231e.mo80076b();
        b.mo80073h("hotword_usage_stats", mo85078b());
        b.apply();
    }
}
