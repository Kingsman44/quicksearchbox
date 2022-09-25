package com.google.android.libraries.abuse.reporting;

import android.os.AsyncTask;

/* renamed from: com.google.android.libraries.abuse.reporting.u */
/* compiled from: PG */
final class C146752u extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ ReportAbuseActivity f396278a;

    public C146752u(ReportAbuseActivity reportAbuseActivity) {
        this.f396278a = reportAbuseActivity;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0116, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0116 A[ExcHandler: e | JSONException (e java.lang.Throwable), Splitter:B:1:0x000a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r15) {
        /*
            r14 = this;
            com.google.a.a.b[] r15 = (com.google.p335a.p336a.C6580b[]) r15
            com.google.android.libraries.abuse.reporting.ReportAbuseActivity r0 = r14.f396278a
            r1 = 0
            r15 = r15[r1]
            r0.f396170v = r15
            r15 = 0
            java.lang.String r1 = r0.f396167s     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r2 = r0.f396174z     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            com.google.a.a.b r3 = r0.f396170v     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            int r3 = r3.f19570b     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r0 = r0.f396149A     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.util.Date r4 = new java.util.Date     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r4.<init>()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            long r4 = r4.getTime()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            java.lang.String r6 = "OBFUSCATED_GAIA"
            com.google.android.libraries.abuse.reporting.ReportAbuseActivity r7 = r14.f396278a     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r8 = r7.f396153E     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            com.google.a.a.q r9 = r7.f396173y     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            boolean r10 = r7.f396154F     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            if (r10 != 0) goto L_0x0030
            java.lang.String r10 = r7.f396172x     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            goto L_0x0031
        L_0x0030:
            r10 = r15
        L_0x0031:
            boolean r11 = r7.f396171w     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            if (r11 != 0) goto L_0x003c
            org.chromium.net.UrlRequest$Callback r0 = r7.f396163o     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r0.onSucceeded(r15, r15)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            goto L_0x0122
        L_0x003c:
            com.google.android.libraries.abuse.reporting.a r11 = r7.f396165q     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r7 = r7.f396151C     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r12.<init>()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r13 = "idInt"
            org.json.JSONObject r3 = r12.put(r13, r3)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r12.<init>()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r13 = "type"
            org.json.JSONObject r6 = r12.put(r13, r6)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r12 = "id"
            org.json.JSONObject r6 = r6.put(r12, r10)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r10.<init>()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r12 = "platform"
            r13 = 2
            org.json.JSONObject r10 = r10.put(r12, r13)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r12 = "version"
            java.lang.String r13 = "v1"
            org.json.JSONObject r10 = r10.put(r12, r13)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r12 = "desc"
            org.json.JSONObject r8 = r10.put(r12, r8)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r10.<init>()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r12 = "identifier"
            org.json.JSONObject r8 = r10.put(r12, r8)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r10.<init>()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r12 = "configName"
            org.json.JSONObject r1 = r10.put(r12, r1)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r10 = "timestampMicros"
            org.json.JSONObject r1 = r1.put(r10, r4)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r4 = "reportedContent"
            org.json.JSONObject r0 = r1.put(r4, r0)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r1 = "reportedItemId"
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r1 = "reporter"
            org.json.JSONObject r0 = r0.put(r1, r6)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r1 = "abuseType"
            org.json.JSONObject r0 = r0.put(r1, r3)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r1 = "header"
            org.json.JSONObject r0 = r0.put(r1, r8)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r1 = "reporterRole"
            int r2 = r9.f19615d     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            com.google.android.libraries.abuse.reporting.ReportAbuseActivity r1 = r14.f396278a     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            org.chromium.net.UrlRequest$Callback r1 = r1.f396163o     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            android.net.Uri r2 = r11.f396200d     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r3 = "v1:report_abuse"
            android.net.Uri$Builder r2 = r2.appendEncodedPath(r3)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            com.google.android.libraries.abuse.reporting.i r3 = r11.f396199c     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.Object r3 = r3.mo123575b()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            org.chromium.net.CronetEngine r3 = (org.chromium.net.CronetEngine) r3     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            android.net.Uri r2 = r2.build()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.util.concurrent.Executor r4 = r11.f396198b     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            org.chromium.net.UrlRequest$Builder r1 = r3.newUrlRequestBuilder(r2, r1, r4)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r2 = "Failed to serialize report request as JSON."
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x010f, JSONException -> 0x011a, e -> 0x0116 }
            java.lang.String r3 = "UTF-8"
            byte[] r0 = r0.getBytes(r3)     // Catch:{ IOException -> 0x010f, JSONException -> 0x011a, e -> 0x0116 }
            if (r0 == 0) goto L_0x0109
            com.google.android.libraries.abuse.reporting.c r2 = new com.google.android.libraries.abuse.reporting.c     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.util.concurrent.Executor r0 = r11.f396198b     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            org.chromium.net.UrlRequest$Builder r0 = r1.setUploadDataProvider(r2, r0)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json; charset=UTF-8"
            r0.addHeader(r2, r3)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r11.mo123541a(r1, r7)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            org.chromium.net.UrlRequest r0 = r1.build()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r0.start()     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            goto L_0x0122
        L_0x0109:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            throw r0     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
        L_0x010f:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            r1.<init>(r2, r0)     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
            throw r1     // Catch:{ JSONException -> 0x011a, IOException -> 0x0118, e -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            goto L_0x011b
        L_0x0118:
            r0 = move-exception
            goto L_0x011b
        L_0x011a:
            r0 = move-exception
        L_0x011b:
            com.google.android.libraries.abuse.reporting.ReportAbuseActivity r1 = r14.f396278a
            r2 = 1002(0x3ea, float:1.404E-42)
            r1.mo123512k(r0, r2)
        L_0x0122:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.reporting.C146752u.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
