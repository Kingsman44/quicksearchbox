package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.he */
/* compiled from: PG */
final class C145414he implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f393135a;

    /* renamed from: b */
    final /* synthetic */ Uri f393136b;

    /* renamed from: c */
    final /* synthetic */ String f393137c;

    /* renamed from: d */
    final /* synthetic */ String f393138d;

    /* renamed from: e */
    final /* synthetic */ C145415hf f393139e;

    public C145414he(C145415hf hfVar, boolean z, Uri uri, String str, String str2) {
        this.f393139e = hfVar;
        this.f393135a = z;
        this.f393136b = uri;
        this.f393137c = str;
        this.f393138d = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085 A[SYNTHETIC, Splitter:B:27:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd A[Catch:{ RuntimeException -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf A[Catch:{ RuntimeException -> 0x0152 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            com.google.android.gms.measurement.internal.hf r0 = r15.f393139e
            boolean r1 = r15.f393135a
            android.net.Uri r2 = r15.f393136b
            java.lang.String r3 = r15.f393137c
            java.lang.String r4 = r15.f393138d
            com.google.android.gms.measurement.internal.hg r5 = r0.f393140a
            r5.mo120904g()
            com.google.android.gms.measurement.internal.hg r5 = r0.f393140a     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.ke r5 = r5.mo120977o()     // Catch:{ RuntimeException -> 0x0152 }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r7 = "Activity created with data 'referrer' without required params"
            java.lang.String r8 = "utm_medium"
            java.lang.String r9 = "_cis"
            java.lang.String r10 = "utm_source"
            java.lang.String r11 = "utm_campaign"
            r12 = 0
            java.lang.String r13 = "gclid"
            if (r6 == 0) goto L_0x002c
        L_0x002a:
            r5 = r12
            goto L_0x0081
        L_0x002c:
            boolean r6 = r4.contains(r13)     // Catch:{ RuntimeException -> 0x0152 }
            if (r6 != 0) goto L_0x0068
            boolean r6 = r4.contains(r11)     // Catch:{ RuntimeException -> 0x0152 }
            if (r6 != 0) goto L_0x0068
            boolean r6 = r4.contains(r10)     // Catch:{ RuntimeException -> 0x0152 }
            if (r6 != 0) goto L_0x0068
            boolean r6 = r4.contains(r8)     // Catch:{ RuntimeException -> 0x0152 }
            if (r6 != 0) goto L_0x0068
            java.lang.String r6 = "utm_id"
            boolean r6 = r4.contains(r6)     // Catch:{ RuntimeException -> 0x0152 }
            if (r6 != 0) goto L_0x0068
            java.lang.String r6 = "dclid"
            boolean r6 = r4.contains(r6)     // Catch:{ RuntimeException -> 0x0152 }
            if (r6 != 0) goto L_0x0068
            java.lang.String r6 = "srsltid"
            boolean r6 = r4.contains(r6)     // Catch:{ RuntimeException -> 0x0152 }
            if (r6 != 0) goto L_0x0068
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.dx r5 = r5.mo120965ar()     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392802j     // Catch:{ RuntimeException -> 0x0152 }
            r5.mo120894a(r7)     // Catch:{ RuntimeException -> 0x0152 }
            goto L_0x002a
        L_0x0068:
            java.lang.String r6 = "https://google.com/search?"
            java.lang.String r14 = java.lang.String.valueOf(r4)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r6 = r6.concat(r14)     // Catch:{ RuntimeException -> 0x0152 }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ RuntimeException -> 0x0152 }
            android.os.Bundle r5 = r5.mo121287t(r6)     // Catch:{ RuntimeException -> 0x0152 }
            if (r5 == 0) goto L_0x0081
            java.lang.String r6 = "referrer"
            r5.putString(r9, r6)     // Catch:{ RuntimeException -> 0x0152 }
        L_0x0081:
            java.lang.String r6 = "_cmp"
            if (r1 == 0) goto L_0x00c7
            com.google.android.gms.measurement.internal.hg r1 = r0.f393140a     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.ff r1 = r1.f393011w     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.ke r1 = r1.mo120977o()     // Catch:{ RuntimeException -> 0x0152 }
            android.os.Bundle r1 = r1.mo121287t(r2)     // Catch:{ RuntimeException -> 0x0152 }
            if (r1 == 0) goto L_0x00c7
            java.lang.String r2 = "intent"
            r1.putString(r9, r2)     // Catch:{ RuntimeException -> 0x0152 }
            boolean r2 = r1.containsKey(r13)     // Catch:{ RuntimeException -> 0x0152 }
            if (r2 != 0) goto L_0x00bb
            if (r5 == 0) goto L_0x00bb
            boolean r2 = r5.containsKey(r13)     // Catch:{ RuntimeException -> 0x0152 }
            if (r2 == 0) goto L_0x00bb
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r9 = r5.getString(r13)     // Catch:{ RuntimeException -> 0x0152 }
            r14 = 0
            r2[r14] = r9     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r9 = "_cer"
            java.lang.String r14 = "gclid=%s"
            java.lang.String r2 = java.lang.String.format(r14, r2)     // Catch:{ RuntimeException -> 0x0152 }
            r1.putString(r9, r2)     // Catch:{ RuntimeException -> 0x0152 }
        L_0x00bb:
            com.google.android.gms.measurement.internal.hg r2 = r0.f393140a     // Catch:{ RuntimeException -> 0x0152 }
            r2.mo121101o(r3, r6, r1)     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.hg r2 = r0.f393140a     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.q r2 = r2.f393144e     // Catch:{ RuntimeException -> 0x0152 }
            r2.mo121298a(r3, r1)     // Catch:{ RuntimeException -> 0x0152 }
        L_0x00c7:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ RuntimeException -> 0x0152 }
            if (r1 == 0) goto L_0x00cf
            goto L_0x0143
        L_0x00cf:
            com.google.android.gms.measurement.internal.hg r1 = r0.f393140a     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.ff r1 = r1.f393011w     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.dv r1 = r1.f392802j     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r2 = "Activity created with referrer"
            r1.mo120895b(r2, r4)     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.hg r1 = r0.f393140a     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.ff r1 = r1.f393011w     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.ab r1 = r1.f392937g     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.dk r2 = com.google.android.gms.measurement.internal.C145313dl.f392718Y     // Catch:{ RuntimeException -> 0x0152 }
            boolean r1 = r1.mo120776m(r12, r2)     // Catch:{ RuntimeException -> 0x0152 }
            if (r1 == 0) goto L_0x0110
            if (r5 == 0) goto L_0x00fb
            com.google.android.gms.measurement.internal.hg r1 = r0.f393140a     // Catch:{ RuntimeException -> 0x0152 }
            r1.mo121101o(r3, r6, r5)     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.hg r1 = r0.f393140a     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.q r1 = r1.f393144e     // Catch:{ RuntimeException -> 0x0152 }
            r1.mo121298a(r3, r5)     // Catch:{ RuntimeException -> 0x0152 }
            goto L_0x010a
        L_0x00fb:
            com.google.android.gms.measurement.internal.hg r1 = r0.f393140a     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.ff r1 = r1.f393011w     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.dv r1 = r1.f392802j     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r2 = "Referrer does not contain valid parameters"
            r1.mo120895b(r2, r4)     // Catch:{ RuntimeException -> 0x0152 }
        L_0x010a:
            com.google.android.gms.measurement.internal.hg r1 = r0.f393140a     // Catch:{ RuntimeException -> 0x0152 }
            r1.mo121092J(r12)     // Catch:{ RuntimeException -> 0x0152 }
            return
        L_0x0110:
            boolean r1 = r4.contains(r13)     // Catch:{ RuntimeException -> 0x0152 }
            if (r1 == 0) goto L_0x0144
            boolean r1 = r4.contains(r11)     // Catch:{ RuntimeException -> 0x0152 }
            if (r1 != 0) goto L_0x0138
            boolean r1 = r4.contains(r10)     // Catch:{ RuntimeException -> 0x0152 }
            if (r1 != 0) goto L_0x0138
            boolean r1 = r4.contains(r8)     // Catch:{ RuntimeException -> 0x0152 }
            if (r1 != 0) goto L_0x0138
            java.lang.String r1 = "utm_term"
            boolean r1 = r4.contains(r1)     // Catch:{ RuntimeException -> 0x0152 }
            if (r1 != 0) goto L_0x0138
            java.lang.String r1 = "utm_content"
            boolean r1 = r4.contains(r1)     // Catch:{ RuntimeException -> 0x0152 }
            if (r1 == 0) goto L_0x0144
        L_0x0138:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ RuntimeException -> 0x0152 }
            if (r1 != 0) goto L_0x0143
            com.google.android.gms.measurement.internal.hg r1 = r0.f393140a     // Catch:{ RuntimeException -> 0x0152 }
            r1.mo121092J(r4)     // Catch:{ RuntimeException -> 0x0152 }
        L_0x0143:
            return
        L_0x0144:
            com.google.android.gms.measurement.internal.hg r1 = r0.f393140a     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.ff r1 = r1.f393011w     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()     // Catch:{ RuntimeException -> 0x0152 }
            com.google.android.gms.measurement.internal.dv r1 = r1.f392802j     // Catch:{ RuntimeException -> 0x0152 }
            r1.mo120894a(r7)     // Catch:{ RuntimeException -> 0x0152 }
            return
        L_0x0152:
            r1 = move-exception
            com.google.android.gms.measurement.internal.hg r0 = r0.f393140a
            com.google.android.gms.measurement.internal.ff r0 = r0.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r0.mo120895b(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145414he.run():void");
    }
}
