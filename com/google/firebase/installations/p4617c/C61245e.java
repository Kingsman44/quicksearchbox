package com.google.firebase.installations.p4617c;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C143919bh;
import com.google.firebase.installations.C61257i;
import com.google.firebase.p4611d.C61174a;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.c.e */
/* compiled from: PG */
public final class C61245e {

    /* renamed from: a */
    private static final Pattern f165671a = Pattern.compile("[0-9]+s");

    /* renamed from: b */
    private static final Charset f165672b = Charset.forName("UTF-8");

    /* renamed from: c */
    private final Context f165673c;

    /* renamed from: d */
    private final C61174a f165674d;

    /* renamed from: e */
    private final C61248h f165675e = new C61248h();

    public C61245e(Context context, C61174a aVar) {
        this.f165673c = context;
        this.f165674d = aVar;
    }

    /* renamed from: a */
    static long m93692a(String str) {
        C143919bh.m233960c(f165671a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d A[Catch:{ NameNotFoundException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b3 A[Catch:{ NameNotFoundException -> 0x00dd }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.net.HttpURLConnection m93693d(java.net.URL r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get heartbeats header"
            java.lang.String r1 = "Could not get fingerprint hash for package: "
            java.net.URLConnection r9 = r9.openConnection()     // Catch:{ IOException -> 0x00fc }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ IOException -> 0x00fc }
            r2 = 10000(0x2710, float:1.4013E-41)
            r9.setConnectTimeout(r2)
            r3 = 0
            r9.setUseCaches(r3)
            r9.setReadTimeout(r2)
            java.lang.String r2 = "Content-Type"
            java.lang.String r4 = "application/json"
            r9.addRequestProperty(r2, r4)
            java.lang.String r2 = "Accept"
            r9.addRequestProperty(r2, r4)
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r4 = "gzip"
            r9.addRequestProperty(r2, r4)
            java.lang.String r2 = "Cache-Control"
            java.lang.String r4 = "no-cache"
            r9.addRequestProperty(r2, r4)
            android.content.Context r2 = r8.f165673c
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r4 = "X-Android-Package"
            r9.addRequestProperty(r4, r2)
            com.google.firebase.d.a r2 = r8.f165674d
            java.lang.Object r2 = r2.mo57687a()
            com.google.firebase.c.j r2 = (com.google.firebase.p4610c.C61136j) r2
            java.lang.String r4 = "ContentValues"
            if (r2 == 0) goto L_0x0067
            java.lang.String r5 = "x-firebase-client"
            com.google.android.gms.tasks.ab r2 = r2.mo57698a()     // Catch:{ ExecutionException -> 0x0063, InterruptedException -> 0x0057 }
            java.lang.Object r2 = com.google.android.gms.tasks.C146021aq.m237852f(r2)     // Catch:{ ExecutionException -> 0x0063, InterruptedException -> 0x0057 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ ExecutionException -> 0x0063, InterruptedException -> 0x0057 }
            r9.addRequestProperty(r5, r2)     // Catch:{ ExecutionException -> 0x0063, InterruptedException -> 0x0057 }
            goto L_0x0067
        L_0x0057:
            r2 = move-exception
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            android.util.Log.w(r4, r0, r2)
            goto L_0x0067
        L_0x0063:
            r2 = move-exception
            android.util.Log.w(r4, r0, r2)
        L_0x0067:
            r0 = 0
            android.content.Context r2 = r8.f165673c     // Catch:{ NameNotFoundException -> 0x00dd }
            java.lang.String r5 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x00dd }
            com.google.android.gms.common.e.c r6 = com.google.android.gms.common.p10782e.C143873c.f389983a     // Catch:{ NameNotFoundException -> 0x00dd }
            com.google.android.gms.common.e.b r2 = r6.mo119351a(r2)     // Catch:{ NameNotFoundException -> 0x00dd }
            r6 = 64
            android.content.pm.PackageInfo r2 = r2.mo119348b(r5, r6)     // Catch:{ NameNotFoundException -> 0x00dd }
            android.content.pm.Signature[] r5 = r2.signatures     // Catch:{ NameNotFoundException -> 0x00dd }
            if (r5 == 0) goto L_0x009a
            android.content.pm.Signature[] r5 = r2.signatures     // Catch:{ NameNotFoundException -> 0x00dd }
            int r5 = r5.length     // Catch:{ NameNotFoundException -> 0x00dd }
            r6 = 1
            if (r5 != r6) goto L_0x009a
            java.lang.String r5 = "SHA1"
            java.security.MessageDigest r5 = com.google.android.gms.common.util.C143997a.m234179a(r5)     // Catch:{ NameNotFoundException -> 0x00dd }
            if (r5 != 0) goto L_0x008d
            goto L_0x009a
        L_0x008d:
            android.content.pm.Signature[] r2 = r2.signatures     // Catch:{ NameNotFoundException -> 0x00dd }
            r2 = r2[r3]     // Catch:{ NameNotFoundException -> 0x00dd }
            byte[] r2 = r2.toByteArray()     // Catch:{ NameNotFoundException -> 0x00dd }
            byte[] r2 = r5.digest(r2)     // Catch:{ NameNotFoundException -> 0x00dd }
            goto L_0x009b
        L_0x009a:
            r2 = r0
        L_0x009b:
            if (r2 != 0) goto L_0x00b3
            android.content.Context r2 = r8.f165673c     // Catch:{ NameNotFoundException -> 0x00dd }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x00dd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00dd }
            r3.<init>(r1)     // Catch:{ NameNotFoundException -> 0x00dd }
            r3.append(r2)     // Catch:{ NameNotFoundException -> 0x00dd }
            java.lang.String r1 = r3.toString()     // Catch:{ NameNotFoundException -> 0x00dd }
            android.util.Log.e(r4, r1)     // Catch:{ NameNotFoundException -> 0x00dd }
            goto L_0x00f1
        L_0x00b3:
            int r1 = r2.length     // Catch:{ NameNotFoundException -> 0x00dd }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00dd }
            int r6 = r1 + r1
            r5.<init>(r6)     // Catch:{ NameNotFoundException -> 0x00dd }
        L_0x00bb:
            if (r3 >= r1) goto L_0x00d8
            char[] r6 = com.google.android.gms.common.util.C144009i.f390249a     // Catch:{ NameNotFoundException -> 0x00dd }
            byte r7 = r2[r3]     // Catch:{ NameNotFoundException -> 0x00dd }
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >>> 4
            char r6 = r6[r7]     // Catch:{ NameNotFoundException -> 0x00dd }
            r5.append(r6)     // Catch:{ NameNotFoundException -> 0x00dd }
            char[] r6 = com.google.android.gms.common.util.C144009i.f390249a     // Catch:{ NameNotFoundException -> 0x00dd }
            byte r7 = r2[r3]     // Catch:{ NameNotFoundException -> 0x00dd }
            r7 = r7 & 15
            char r6 = r6[r7]     // Catch:{ NameNotFoundException -> 0x00dd }
            r5.append(r6)     // Catch:{ NameNotFoundException -> 0x00dd }
            int r3 = r3 + 1
            goto L_0x00bb
        L_0x00d8:
            java.lang.String r0 = r5.toString()     // Catch:{ NameNotFoundException -> 0x00dd }
            goto L_0x00f1
        L_0x00dd:
            r1 = move-exception
            android.content.Context r2 = r8.f165673c
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "No such package: "
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.e(r4, r2, r1)
        L_0x00f1:
            java.lang.String r1 = "X-Android-Cert"
            r9.addRequestProperty(r1, r0)
            java.lang.String r0 = "x-goog-api-key"
            r9.addRequestProperty(r0, r10)
            return r9
        L_0x00fc:
            com.google.firebase.installations.i r9 = new com.google.firebase.installations.i
            java.lang.String r10 = "Firebase Installations Service is unavailable. Please try again later."
            r9.<init>(r10)
            goto L_0x0105
        L_0x0104:
            throw r9
        L_0x0105:
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p4617c.C61245e.m93693d(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }

    /* renamed from: e */
    private static void m93694e() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0046 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m93695f(java.net.HttpURLConnection r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            java.io.InputStream r0 = r9.getErrorStream()
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 3
            r5 = 0
            if (r0 != 0) goto L_0x000c
            goto L_0x0051
        L_0x000c:
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.nio.charset.Charset r8 = f165672b
            r7.<init>(r0, r8)
            r6.<init>(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0046, all -> 0x004c }
            r0.<init>()     // Catch:{ IOException -> 0x0046, all -> 0x004c }
        L_0x001d:
            java.lang.String r7 = r6.readLine()     // Catch:{ IOException -> 0x0046, all -> 0x004c }
            if (r7 == 0) goto L_0x002c
            r0.append(r7)     // Catch:{ IOException -> 0x0046, all -> 0x004c }
            r7 = 10
            r0.append(r7)     // Catch:{ IOException -> 0x0046, all -> 0x004c }
            goto L_0x001d
        L_0x002c:
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0046, all -> 0x004c }
            int r8 = r9.getResponseCode()     // Catch:{ IOException -> 0x0046, all -> 0x004c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x0046, all -> 0x004c }
            r7[r3] = r8     // Catch:{ IOException -> 0x0046, all -> 0x004c }
            java.lang.String r9 = r9.getResponseMessage()     // Catch:{ IOException -> 0x0046, all -> 0x004c }
            r7[r2] = r9     // Catch:{ IOException -> 0x0046, all -> 0x004c }
            r7[r1] = r0     // Catch:{ IOException -> 0x0046, all -> 0x004c }
            java.lang.String r9 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            java.lang.String r5 = java.lang.String.format(r9, r7)     // Catch:{ IOException -> 0x0046, all -> 0x004c }
        L_0x0046:
            r6.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x0051
        L_0x004a:
            goto L_0x0051
        L_0x004c:
            r9 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r9
        L_0x0051:
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 != 0) goto L_0x0080
            java.lang.String r9 = "Firebase-Installations"
            android.util.Log.w(r9, r5)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r11
            r0[r2] = r12
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto L_0x006b
            java.lang.String r10 = ""
            goto L_0x0075
        L_0x006b:
            java.lang.String r11 = ", "
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r11.concat(r10)
        L_0x0075:
            r0[r1] = r10
            java.lang.String r10 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
            java.lang.String r10 = java.lang.String.format(r10, r0)
            android.util.Log.w(r9, r10)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p4617c.C61245e.m93695f(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: g */
    private static void m93696g(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* renamed from: h */
    private static boolean m93697h(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: i */
    private static byte[] m93698i(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: j */
    private static final URL m93699j(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new C61257i(e.getMessage());
        }
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0165, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0166, code lost:
        r12 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0170, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0171, code lost:
        r11.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0177, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0178, code lost:
        r12 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017a, code lost:
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0170 A[ExcHandler: all (r0v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[ExcHandler: IOException | AssertionError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:5:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[ExcHandler: IOException | AssertionError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:14:0x005e] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.installations.p4617c.C61247g mo57856b(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            java.lang.String r6 = "fid"
            com.google.firebase.installations.c.h r0 = r1.f165675e
            boolean r0 = r0.mo57859b()
            java.lang.String r7 = "Firebase Installations Service is unavailable. Please try again later."
            if (r0 == 0) goto L_0x0192
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r3
            java.lang.String r10 = "projects/%s/installations"
            java.lang.String r0 = java.lang.String.format(r10, r0)
            java.net.URL r10 = m93699j(r0)
        L_0x0026:
            if (r9 > r8) goto L_0x018c
            r0 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.net.HttpURLConnection r11 = r1.m93693d(r10, r2)
            java.lang.String r0 = "POST"
            r11.setRequestMethod(r0)     // Catch:{ IOException | AssertionError -> 0x0178, all -> 0x0170 }
            r11.setDoOutput(r8)     // Catch:{ IOException | AssertionError -> 0x0178, all -> 0x0170 }
            if (r5 == 0) goto L_0x0041
            java.lang.String r0 = "x-goog-fis-android-iid-migration-auth"
            r11.addRequestProperty(r0, r5)     // Catch:{ IOException | AssertionError -> 0x0178, all -> 0x0170 }
        L_0x0041:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0165, IOException | AssertionError -> 0x0178 }
            r0.<init>()     // Catch:{ JSONException -> 0x0165, IOException | AssertionError -> 0x0178 }
            r12 = r19
            r0.put(r6, r12)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r13 = "appId"
            r0.put(r13, r4)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r13 = "authVersion"
            java.lang.String r14 = "FIS_v2"
            r0.put(r13, r14)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r13 = "sdkVersion"
            java.lang.String r14 = "a:17.0.2_1p"
            r0.put(r13, r14)     // Catch:{ JSONException -> 0x0163 }
            byte[] r0 = m93698i(r0)     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            m93696g(r11, r0)     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            int r0 = r11.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            com.google.firebase.installations.c.h r13 = r1.f165675e     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            r13.mo57858a(r0)     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            boolean r13 = m93697h(r0)     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            if (r13 == 0) goto L_0x0139
            java.io.InputStream r0 = r11.getInputStream()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            android.util.JsonReader r13 = new android.util.JsonReader     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            java.io.InputStreamReader r14 = new java.io.InputStreamReader     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            java.nio.charset.Charset r15 = f165672b     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            r14.<init>(r0, r15)     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            r13.<init>(r14)     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            com.google.firebase.installations.c.i r14 = com.google.firebase.installations.p4617c.C61250j.m93714d()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            com.google.firebase.installations.c.a r15 = new com.google.firebase.installations.c.a     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            r15.<init>()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            r13.beginObject()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
        L_0x0090:
            boolean r16 = r13.hasNext()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            if (r16 == 0) goto L_0x0121
            java.lang.String r8 = r13.nextName()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            java.lang.String r1 = "name"
            boolean r1 = r8.equals(r1)     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            if (r1 == 0) goto L_0x00ac
            java.lang.String r1 = r13.nextString()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            r15.f165654a = r1     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
        L_0x00a8:
            r1 = r17
        L_0x00aa:
            r8 = 1
            goto L_0x0090
        L_0x00ac:
            boolean r1 = r8.equals(r6)     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            if (r1 == 0) goto L_0x00b9
            java.lang.String r1 = r13.nextString()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            r15.f165655b = r1     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            goto L_0x00a8
        L_0x00b9:
            java.lang.String r1 = "refreshToken"
            boolean r1 = r8.equals(r1)     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = r13.nextString()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            r15.f165656c = r1     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            goto L_0x00a8
        L_0x00c8:
            java.lang.String r1 = "authToken"
            boolean r1 = r8.equals(r1)     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            if (r1 == 0) goto L_0x0117
            r13.beginObject()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
        L_0x00d3:
            boolean r1 = r13.hasNext()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            if (r1 == 0) goto L_0x010c
            java.lang.String r1 = r13.nextName()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            java.lang.String r8 = "token"
            boolean r8 = r1.equals(r8)     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            if (r8 == 0) goto L_0x00ef
            java.lang.String r1 = r13.nextString()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            r8 = r14
            com.google.firebase.installations.c.c r8 = (com.google.firebase.installations.p4617c.C61243c) r8     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            r8.f165664a = r1     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            goto L_0x00d3
        L_0x00ef:
            java.lang.String r8 = "expiresIn"
            boolean r1 = r1.equals(r8)     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            if (r1 == 0) goto L_0x0104
            java.lang.String r1 = r13.nextString()     // Catch:{ IOException | AssertionError -> 0x017a, IOException | AssertionError -> 0x017a, all -> 0x0170 }
            r8 = r6
            long r5 = m93692a(r1)     // Catch:{ IOException | AssertionError -> 0x017b, all -> 0x0170 }
            r14.mo57849b(r5)     // Catch:{ IOException | AssertionError -> 0x017b, all -> 0x0170 }
            goto L_0x0108
        L_0x0104:
            r8 = r6
            r13.skipValue()     // Catch:{ IOException | AssertionError -> 0x017b, all -> 0x0170 }
        L_0x0108:
            r5 = r22
            r6 = r8
            goto L_0x00d3
        L_0x010c:
            r8 = r6
            com.google.firebase.installations.c.j r1 = r14.mo57848a()     // Catch:{ IOException | AssertionError -> 0x017b, all -> 0x0170 }
            r15.f165657d = r1     // Catch:{ IOException | AssertionError -> 0x017b, all -> 0x0170 }
            r13.endObject()     // Catch:{ IOException | AssertionError -> 0x017b, all -> 0x0170 }
            goto L_0x011b
        L_0x0117:
            r8 = r6
            r13.skipValue()     // Catch:{ IOException | AssertionError -> 0x017b, all -> 0x0170 }
        L_0x011b:
            r1 = r17
            r5 = r22
            r6 = r8
            goto L_0x00aa
        L_0x0121:
            r8 = r6
            r13.endObject()     // Catch:{ IOException | AssertionError -> 0x017b, all -> 0x0170 }
            r13.close()     // Catch:{ IOException | AssertionError -> 0x017b, all -> 0x0170 }
            r0.close()     // Catch:{ IOException | AssertionError -> 0x017b, all -> 0x0170 }
            r1 = 1
            r15.f165658e = r1     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
            com.google.firebase.installations.c.g r0 = r15.mo57839a()     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
        L_0x0132:
            r11.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x0139:
            r8 = r6
            r1 = 1
            m93695f(r11, r4, r2, r3)     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
            r5 = 429(0x1ad, float:6.01E-43)
            if (r0 == r5) goto L_0x015b
            r5 = 500(0x1f4, float:7.0E-43)
            if (r0 < r5) goto L_0x014b
            r5 = 600(0x258, float:8.41E-43)
            if (r0 >= r5) goto L_0x014b
            goto L_0x017c
        L_0x014b:
            m93694e()     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
            com.google.firebase.installations.c.a r0 = new com.google.firebase.installations.c.a     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
            r0.<init>()     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
            r5 = 2
            r0.f165658e = r5     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
            com.google.firebase.installations.c.g r0 = r0.mo57839a()     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
            goto L_0x0132
        L_0x015b:
            com.google.firebase.installations.i r0 = new com.google.firebase.installations.i     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
            java.lang.String r5 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r0.<init>(r5)     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
            throw r0     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
        L_0x0163:
            r0 = move-exception
            goto L_0x0168
        L_0x0165:
            r0 = move-exception
            r12 = r19
        L_0x0168:
            r8 = r6
            r1 = 1
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
            r5.<init>(r0)     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
            throw r5     // Catch:{ IOException | AssertionError -> 0x017c, all -> 0x0170 }
        L_0x0170:
            r0 = move-exception
            r11.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0178:
            r12 = r19
        L_0x017a:
            r8 = r6
        L_0x017b:
            r1 = 1
        L_0x017c:
            r11.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r9 = r9 + 1
            r1 = r17
            r5 = r22
            r6 = r8
            r8 = 1
            goto L_0x0026
        L_0x018c:
            com.google.firebase.installations.i r0 = new com.google.firebase.installations.i
            r0.<init>(r7)
            throw r0
        L_0x0192:
            com.google.firebase.installations.i r0 = new com.google.firebase.installations.i
            r0.<init>(r7)
            goto L_0x0199
        L_0x0198:
            throw r0
        L_0x0199:
            goto L_0x0198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p4617c.C61245e.mo57856b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.google.firebase.installations.c.g");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:? A[ExcHandler: IOException | AssertionError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:5:0x002b] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.installations.p4617c.C61250j mo57857c(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            com.google.firebase.installations.c.h r0 = r10.f165675e
            boolean r0 = r0.mo57859b()
            java.lang.String r1 = "Firebase Installations Service is unavailable. Please try again later."
            if (r0 == 0) goto L_0x0138
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            r2[r3] = r13
            r4 = 1
            r2[r4] = r12
            java.lang.String r12 = "projects/%s/installations/%s/authTokens:generate"
            java.lang.String r12 = java.lang.String.format(r12, r2)
            java.net.URL r12 = m93699j(r12)
        L_0x001d:
            if (r3 > r4) goto L_0x0132
            r2 = 32771(0x8003, float:4.5922E-41)
            android.net.TrafficStats.setThreadStatsTag(r2)
            java.net.HttpURLConnection r2 = r10.m93693d(r12, r11)
            java.lang.String r5 = "POST"
            r2.setRequestMethod(r5)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r5.<init>()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            java.lang.String r6 = "FIS_v2 "
            r5.append(r6)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r5.append(r14)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            java.lang.String r6 = "Authorization"
            java.lang.String r5 = r5.toString()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r2.addRequestProperty(r6, r5)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r2.setDoOutput(r4)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0119, IOException | AssertionError -> 0x0128 }
            r5.<init>()     // Catch:{ JSONException -> 0x0119, IOException | AssertionError -> 0x0128 }
            java.lang.String r6 = "sdkVersion"
            java.lang.String r7 = "a:17.0.2_1p"
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x0119, IOException | AssertionError -> 0x0128 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0119, IOException | AssertionError -> 0x0128 }
            r6.<init>()     // Catch:{ JSONException -> 0x0119, IOException | AssertionError -> 0x0128 }
            java.lang.String r7 = "installation"
            r6.put(r7, r5)     // Catch:{ JSONException -> 0x0119, IOException | AssertionError -> 0x0128 }
            byte[] r5 = m93698i(r6)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            m93696g(r2, r5)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            int r5 = r2.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            com.google.firebase.installations.c.h r6 = r10.f165675e     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r6.mo57858a(r5)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            boolean r6 = m93697h(r5)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            if (r6 == 0) goto L_0x00d7
            java.io.InputStream r5 = r2.getInputStream()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            android.util.JsonReader r6 = new android.util.JsonReader     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            java.nio.charset.Charset r8 = f165672b     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r7.<init>(r5, r8)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r6.<init>(r7)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            com.google.firebase.installations.c.i r7 = com.google.firebase.installations.p4617c.C61250j.m93714d()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r6.beginObject()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
        L_0x008a:
            boolean r8 = r6.hasNext()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            if (r8 == 0) goto L_0x00be
            java.lang.String r8 = r6.nextName()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            java.lang.String r9 = "token"
            boolean r9 = r8.equals(r9)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            if (r9 == 0) goto L_0x00a6
            java.lang.String r8 = r6.nextString()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r9 = r7
            com.google.firebase.installations.c.c r9 = (com.google.firebase.installations.p4617c.C61243c) r9     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r9.f165664a = r8     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            goto L_0x008a
        L_0x00a6:
            java.lang.String r9 = "expiresIn"
            boolean r8 = r8.equals(r9)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            if (r8 == 0) goto L_0x00ba
            java.lang.String r8 = r6.nextString()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            long r8 = m93692a(r8)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r7.mo57849b(r8)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            goto L_0x008a
        L_0x00ba:
            r6.skipValue()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            goto L_0x008a
        L_0x00be:
            r6.endObject()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r6.close()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r5.close()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r5 = r7
            com.google.firebase.installations.c.c r5 = (com.google.firebase.installations.p4617c.C61243c) r5     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r5.f165665b = r4     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            com.google.firebase.installations.c.j r11 = r7.mo57848a()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
        L_0x00d0:
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r11
        L_0x00d7:
            r6 = 0
            m93695f(r2, r6, r11, r13)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r6 = 401(0x191, float:5.62E-43)
            if (r5 == r6) goto L_0x010a
            r6 = 404(0x194, float:5.66E-43)
            if (r5 != r6) goto L_0x00e4
            goto L_0x010a
        L_0x00e4:
            r6 = 429(0x1ad, float:6.01E-43)
            if (r5 == r6) goto L_0x0102
            r6 = 500(0x1f4, float:7.0E-43)
            if (r5 < r6) goto L_0x00f1
            r6 = 600(0x258, float:8.41E-43)
            if (r5 >= r6) goto L_0x00f1
            goto L_0x0128
        L_0x00f1:
            m93694e()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            com.google.firebase.installations.c.i r5 = com.google.firebase.installations.p4617c.C61250j.m93714d()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r6 = r5
            com.google.firebase.installations.c.c r6 = (com.google.firebase.installations.p4617c.C61243c) r6     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r6.f165665b = r0     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            com.google.firebase.installations.c.j r11 = r5.mo57848a()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            goto L_0x00d0
        L_0x0102:
            com.google.firebase.installations.i r5 = new com.google.firebase.installations.i     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            java.lang.String r6 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r5.<init>(r6)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            throw r5     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
        L_0x010a:
            com.google.firebase.installations.c.i r5 = com.google.firebase.installations.p4617c.C61250j.m93714d()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r6 = r5
            com.google.firebase.installations.c.c r6 = (com.google.firebase.installations.p4617c.C61243c) r6     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r7 = 3
            r6.f165665b = r7     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            com.google.firebase.installations.c.j r11 = r5.mo57848a()     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            goto L_0x00d0
        L_0x0119:
            r5 = move-exception
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            r6.<init>(r5)     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
            throw r6     // Catch:{ IOException | AssertionError -> 0x0128, all -> 0x0120 }
        L_0x0120:
            r11 = move-exception
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r11
        L_0x0128:
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0132:
            com.google.firebase.installations.i r11 = new com.google.firebase.installations.i
            r11.<init>(r1)
            throw r11
        L_0x0138:
            com.google.firebase.installations.i r11 = new com.google.firebase.installations.i
            r11.<init>(r1)
            goto L_0x013f
        L_0x013e:
            throw r11
        L_0x013f:
            goto L_0x013e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p4617c.C61245e.mo57857c(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.google.firebase.installations.c.j");
    }
}
