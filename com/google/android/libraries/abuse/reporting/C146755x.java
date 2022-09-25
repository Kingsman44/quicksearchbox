package com.google.android.libraries.abuse.reporting;

import android.os.AsyncTask;

/* renamed from: com.google.android.libraries.abuse.reporting.x */
/* compiled from: PG */
final class C146755x extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ ReportAbuseActivity f396281a;

    public C146755x(ReportAbuseActivity reportAbuseActivity) {
        this.f396281a = reportAbuseActivity;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007e A[ExcHandler: e | JSONException (e java.lang.Throwable), Splitter:B:1:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r8) {
        /*
            r7 = this;
            java.lang.Void[] r8 = (java.lang.Void[]) r8
            r8 = 0
            com.google.android.libraries.abuse.reporting.ReportAbuseActivity r0 = r7.f396281a     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            java.lang.String r0 = r0.f396150B     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            r1.<init>()     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            java.lang.String r2 = "reportId"
            org.json.JSONObject r0 = r1.put(r2, r0)     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            com.google.android.libraries.abuse.reporting.ReportAbuseActivity r1 = r7.f396281a     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            boolean r2 = r1.f396171w     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            if (r2 != 0) goto L_0x001e
            org.chromium.net.UrlRequest$Callback r0 = r1.f396164p     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            r0.onSucceeded(r8, r8)     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            goto L_0x008a
        L_0x001e:
            com.google.android.libraries.abuse.reporting.a r2 = r1.f396165q     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            java.lang.String r3 = r1.f396151C     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            org.chromium.net.UrlRequest$Callback r1 = r1.f396164p     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            android.net.Uri r4 = r2.f396200d     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            java.lang.String r5 = "v1:undo_report_abuse"
            android.net.Uri$Builder r4 = r4.appendEncodedPath(r5)     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            com.google.android.libraries.abuse.reporting.i r5 = r2.f396199c     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            java.lang.Object r5 = r5.mo123575b()     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            org.chromium.net.CronetEngine r5 = (org.chromium.net.CronetEngine) r5     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            android.net.Uri r4 = r4.build()     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            java.util.concurrent.Executor r6 = r2.f396198b     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            org.chromium.net.UrlRequest$Builder r1 = r5.newUrlRequestBuilder(r4, r1, r6)     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            java.lang.String r4 = "Failed to serialize undo request as JSON."
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0077, JSONException -> 0x0082, e -> 0x007e }
            java.lang.String r5 = "UTF-8"
            byte[] r0 = r0.getBytes(r5)     // Catch:{ IOException -> 0x0077, JSONException -> 0x0082, e -> 0x007e }
            if (r0 == 0) goto L_0x0071
            com.google.android.libraries.abuse.reporting.c r4 = new com.google.android.libraries.abuse.reporting.c     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            java.util.concurrent.Executor r0 = r2.f396198b     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            org.chromium.net.UrlRequest$Builder r0 = r1.setUploadDataProvider(r4, r0)     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json; charset=UTF-8"
            r0.addHeader(r4, r5)     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            r2.mo123541a(r1, r3)     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            org.chromium.net.UrlRequest r0 = r1.build()     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            r0.start()     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            goto L_0x008a
        L_0x0071:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            r0.<init>(r4)     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            throw r0     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
        L_0x0077:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            r1.<init>(r4, r0)     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
            throw r1     // Catch:{ JSONException -> 0x0082, IOException -> 0x0080, e -> 0x007e }
        L_0x007e:
            r0 = move-exception
            goto L_0x0083
        L_0x0080:
            r0 = move-exception
            goto L_0x0083
        L_0x0082:
            r0 = move-exception
        L_0x0083:
            com.google.android.libraries.abuse.reporting.ReportAbuseActivity r1 = r7.f396281a
            r2 = 1003(0x3eb, float:1.406E-42)
            r1.mo123512k(r0, r2)
        L_0x008a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.reporting.C146755x.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
