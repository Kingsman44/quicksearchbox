package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aci */
/* compiled from: PG */
public final class aci extends abr implements acq {

    /* renamed from: a */
    private static final Pattern f20295a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b */
    private static final AtomicReference f20296b = new AtomicReference();

    /* renamed from: c */
    private final int f20297c;

    /* renamed from: d */
    private final int f20298d;

    /* renamed from: e */
    private final String f20299e;

    /* renamed from: f */
    private final acp f20300f;

    /* renamed from: g */
    private final acp f20301g;

    /* renamed from: h */
    private acb f20302h;

    /* renamed from: i */
    private HttpURLConnection f20303i;

    /* renamed from: j */
    private InputStream f20304j;

    /* renamed from: k */
    private boolean f20305k;

    /* renamed from: l */
    private int f20306l;

    /* renamed from: m */
    private long f20307m;

    /* renamed from: n */
    private long f20308n;

    /* renamed from: o */
    private long f20309o;

    /* renamed from: p */
    private long f20310p;

    public aci() {
        String str = C6861cv.f21762a;
        throw null;
    }

    /* renamed from: k */
    private final void m18236k() {
        HttpURLConnection httpURLConnection = this.f20303i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                adu.m18341b("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f20303i = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010b, code lost:
        if (r2 != 0) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x022c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo14389c(com.google.ads.interactivemedia.p367v3.internal.acb r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "Unable to connect"
            r1.f20302h = r0
            r3 = 0
            r1.f20310p = r3
            r1.f20309o = r3
            r22.mo14404g(r23)
            java.net.URL r5 = new java.net.URL     // Catch:{ IOException -> 0x026b }
            android.net.Uri r6 = r0.f20241a     // Catch:{ IOException -> 0x026b }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x026b }
            r5.<init>(r6)     // Catch:{ IOException -> 0x026b }
            int r6 = r0.f20242b     // Catch:{ IOException -> 0x026b }
            byte[] r7 = r0.f20243c     // Catch:{ IOException -> 0x026b }
            long r7 = r0.f20245e     // Catch:{ IOException -> 0x026b }
            long r9 = r0.f20246f     // Catch:{ IOException -> 0x026b }
            r11 = 1
            boolean r12 = r0.mo14432b(r11)     // Catch:{ IOException -> 0x026b }
            java.util.Map r13 = r0.f20244d     // Catch:{ IOException -> 0x026b }
            java.net.URLConnection r5 = r5.openConnection()     // Catch:{ IOException -> 0x026b }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x026b }
            int r14 = r1.f20297c     // Catch:{ IOException -> 0x026b }
            r5.setConnectTimeout(r14)     // Catch:{ IOException -> 0x026b }
            int r14 = r1.f20298d     // Catch:{ IOException -> 0x026b }
            r5.setReadTimeout(r14)     // Catch:{ IOException -> 0x026b }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ IOException -> 0x026b }
            r14.<init>()     // Catch:{ IOException -> 0x026b }
            com.google.ads.interactivemedia.v3.internal.acp r15 = r1.f20300f     // Catch:{ IOException -> 0x026b }
            if (r15 == 0) goto L_0x004b
            java.util.Map r15 = r15.mo14454a()     // Catch:{ IOException -> 0x026b }
            r14.putAll(r15)     // Catch:{ IOException -> 0x026b }
        L_0x004b:
            com.google.ads.interactivemedia.v3.internal.acp r15 = r1.f20301g     // Catch:{ IOException -> 0x026b }
            java.util.Map r15 = r15.mo14454a()     // Catch:{ IOException -> 0x026b }
            r14.putAll(r15)     // Catch:{ IOException -> 0x026b }
            r14.putAll(r13)     // Catch:{ IOException -> 0x026b }
            java.util.Set r13 = r14.entrySet()     // Catch:{ IOException -> 0x026b }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ IOException -> 0x026b }
        L_0x005f:
            boolean r14 = r13.hasNext()     // Catch:{ IOException -> 0x026b }
            if (r14 == 0) goto L_0x007b
            java.lang.Object r14 = r13.next()     // Catch:{ IOException -> 0x026b }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ IOException -> 0x026b }
            java.lang.Object r15 = r14.getKey()     // Catch:{ IOException -> 0x026b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x026b }
            java.lang.Object r14 = r14.getValue()     // Catch:{ IOException -> 0x026b }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ IOException -> 0x026b }
            r5.setRequestProperty(r15, r14)     // Catch:{ IOException -> 0x026b }
            goto L_0x005f
        L_0x007b:
            r13 = 27
            r14 = -1
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 != 0) goto L_0x0088
            int r7 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x00be
            r7 = r3
        L_0x0088:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x026b }
            r3.<init>(r13)     // Catch:{ IOException -> 0x026b }
            java.lang.String r4 = "bytes="
            r3.append(r4)     // Catch:{ IOException -> 0x026b }
            r3.append(r7)     // Catch:{ IOException -> 0x026b }
            java.lang.String r4 = "-"
            r3.append(r4)     // Catch:{ IOException -> 0x026b }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x026b }
            int r4 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x00b9
            long r7 = r7 + r9
            long r7 = r7 + r14
            int r4 = r3.length()     // Catch:{ IOException -> 0x026b }
            int r4 = r4 + 20
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x026b }
            r9.<init>(r4)     // Catch:{ IOException -> 0x026b }
            r9.append(r3)     // Catch:{ IOException -> 0x026b }
            r9.append(r7)     // Catch:{ IOException -> 0x026b }
            java.lang.String r3 = r9.toString()     // Catch:{ IOException -> 0x026b }
        L_0x00b9:
            java.lang.String r4 = "Range"
            r5.setRequestProperty(r4, r3)     // Catch:{ IOException -> 0x026b }
        L_0x00be:
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = r1.f20299e     // Catch:{ IOException -> 0x026b }
            r5.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x026b }
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "identity"
            java.lang.String r7 = "gzip"
            if (r11 == r12) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r4 = r7
        L_0x00cf:
            r5.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x026b }
            r5.setInstanceFollowRedirects(r11)     // Catch:{ IOException -> 0x026b }
            r3 = 0
            r5.setDoOutput(r3)     // Catch:{ IOException -> 0x026b }
            java.lang.String r3 = com.google.ads.interactivemedia.p367v3.internal.acb.m18196a(r6)     // Catch:{ IOException -> 0x026b }
            r5.setRequestMethod(r3)     // Catch:{ IOException -> 0x026b }
            r5.connect()     // Catch:{ IOException -> 0x026b }
            r1.f20303i = r5     // Catch:{ IOException -> 0x026b }
            int r3 = r5.getResponseCode()     // Catch:{ IOException -> 0x0261 }
            r1.f20306l = r3     // Catch:{ IOException -> 0x0261 }
            java.net.HttpURLConnection r3 = r1.f20303i     // Catch:{ IOException -> 0x0261 }
            r3.getResponseMessage()     // Catch:{ IOException -> 0x0261 }
            int r2 = r1.f20306l
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 < r3) goto L_0x022c
            r4 = 299(0x12b, float:4.19E-43)
            if (r2 <= r4) goto L_0x00fc
            goto L_0x022c
        L_0x00fc:
            java.net.HttpURLConnection r2 = r1.f20303i
            r2.getContentType()
            int r2 = r1.f20306l
            if (r2 != r3) goto L_0x010e
            long r2 = r0.f20245e
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r2 = 0
        L_0x0110:
            r1.f20307m = r2
            java.net.HttpURLConnection r2 = r1.f20303i
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r2 = r2.getHeaderField(r3)
            boolean r2 = r7.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0202
            long r3 = r0.f20246f
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x012a
            r1.f20308n = r3
            goto L_0x0206
        L_0x012a:
            java.net.HttpURLConnection r3 = r1.f20303i
            java.lang.String r4 = "Content-Length"
            java.lang.String r4 = r3.getHeaderField(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r6 = "DefaultHttpDataSource"
            java.lang.String r7 = "]"
            if (r5 != 0) goto L_0x0162
            long r8 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0141 }
            goto L_0x0163
        L_0x0141:
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r5 = r5 + 28
            r8.<init>(r5)
            java.lang.String r5 = "Unexpected Content-Length ["
            r8.append(r5)
            r8.append(r4)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            android.util.Log.e(r6, r5)
        L_0x0162:
            r8 = r14
        L_0x0163:
            java.lang.String r5 = "Content-Range"
            java.lang.String r3 = r3.getHeaderField(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x01f7
            java.util.regex.Pattern r5 = f20295a
            java.util.regex.Matcher r5 = r5.matcher(r3)
            boolean r10 = r5.find()
            if (r10 == 0) goto L_0x01f7
            r10 = 2
            java.lang.String r10 = r5.group(r10)     // Catch:{ NumberFormatException -> 0x01d7 }
            long r18 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x01d7 }
            java.lang.String r5 = r5.group(r11)     // Catch:{ NumberFormatException -> 0x01d7 }
            long r20 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x01d7 }
            long r18 = r18 - r20
            r20 = 1
            long r11 = r18 + r20
            r16 = 0
            int r10 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r10 >= 0) goto L_0x019a
            r8 = r11
            goto L_0x01f7
        L_0x019a:
            int r10 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x01f7
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch:{ NumberFormatException -> 0x01d7 }
            int r10 = r10.length()     // Catch:{ NumberFormatException -> 0x01d7 }
            int r10 = r10 + 26
            java.lang.String r16 = java.lang.String.valueOf(r3)     // Catch:{ NumberFormatException -> 0x01d7 }
            int r16 = r16.length()     // Catch:{ NumberFormatException -> 0x01d7 }
            int r10 = r10 + r16
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01d7 }
            r5.<init>(r10)     // Catch:{ NumberFormatException -> 0x01d7 }
            java.lang.String r10 = "Inconsistent headers ["
            r5.append(r10)     // Catch:{ NumberFormatException -> 0x01d7 }
            r5.append(r4)     // Catch:{ NumberFormatException -> 0x01d7 }
            java.lang.String r4 = "] ["
            r5.append(r4)     // Catch:{ NumberFormatException -> 0x01d7 }
            r5.append(r3)     // Catch:{ NumberFormatException -> 0x01d7 }
            r5.append(r7)     // Catch:{ NumberFormatException -> 0x01d7 }
            java.lang.String r4 = r5.toString()     // Catch:{ NumberFormatException -> 0x01d7 }
            android.util.Log.w(r6, r4)     // Catch:{ NumberFormatException -> 0x01d7 }
            long r3 = java.lang.Math.max(r8, r11)     // Catch:{ NumberFormatException -> 0x01d7 }
            r8 = r3
            goto L_0x01f7
        L_0x01d7:
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + r13
            r5.<init>(r4)
            java.lang.String r4 = "Unexpected Content-Range ["
            r5.append(r4)
            r5.append(r3)
            r5.append(r7)
            java.lang.String r3 = r5.toString()
            android.util.Log.e(r6, r3)
        L_0x01f7:
            int r3 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x01ff
            long r3 = r1.f20307m
            long r14 = r8 - r3
        L_0x01ff:
            r1.f20308n = r14
            goto L_0x0206
        L_0x0202:
            long r3 = r0.f20246f
            r1.f20308n = r3
        L_0x0206:
            java.net.HttpURLConnection r3 = r1.f20303i     // Catch:{ IOException -> 0x0222 }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0222 }
            r1.f20304j = r3     // Catch:{ IOException -> 0x0222 }
            if (r2 == 0) goto L_0x0219
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0222 }
            java.io.InputStream r3 = r1.f20304j     // Catch:{ IOException -> 0x0222 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0222 }
            r1.f20304j = r2     // Catch:{ IOException -> 0x0222 }
        L_0x0219:
            r2 = 1
            r1.f20305k = r2
            r22.mo14405h(r23)
            long r2 = r1.f20308n
            return r2
        L_0x0222:
            r0 = move-exception
            r22.m18236k()
            com.google.ads.interactivemedia.v3.internal.acn r2 = new com.google.ads.interactivemedia.v3.internal.acn
            r2.<init>((java.io.IOException) r0)
            throw r2
        L_0x022c:
            java.net.HttpURLConnection r2 = r1.f20303i
            r2.getHeaderFields()
            java.net.HttpURLConnection r2 = r1.f20303i
            java.io.InputStream r2 = r2.getErrorStream()
            if (r2 == 0) goto L_0x023d
            com.google.ads.interactivemedia.p367v3.internal.aeu.m18509a(r2)     // Catch:{ IOException -> 0x0258 }
            goto L_0x023f
        L_0x023d:
            int r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ IOException -> 0x0258 }
        L_0x023f:
            r22.m18236k()
            com.google.ads.interactivemedia.v3.internal.aco r2 = new com.google.ads.interactivemedia.v3.internal.aco
            int r3 = r1.f20306l
            r2.<init>(r3, r0)
            int r0 = r1.f20306l
            r3 = 416(0x1a0, float:5.83E-43)
            if (r0 != r3) goto L_0x0257
            com.google.ads.interactivemedia.v3.internal.aby r0 = new com.google.ads.interactivemedia.v3.internal.aby
            r0.<init>()
            r2.initCause(r0)
        L_0x0257:
            throw r2
        L_0x0258:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.acn r2 = new com.google.ads.interactivemedia.v3.internal.acn
            java.lang.String r3 = "Error reading non-2xx response body"
            r2.<init>(r3, r0)
            throw r2
        L_0x0261:
            r0 = move-exception
            r22.m18236k()
            com.google.ads.interactivemedia.v3.internal.acn r3 = new com.google.ads.interactivemedia.v3.internal.acn
            r3.<init>(r2, r0)
            throw r3
        L_0x026b:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.acn r3 = new com.google.ads.interactivemedia.v3.internal.acn
            r3.<init>(r2, r0)
            goto L_0x0273
        L_0x0272:
            throw r3
        L_0x0273:
            goto L_0x0272
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aci.mo14389c(com.google.ads.interactivemedia.v3.internal.acb):long");
    }

    /* renamed from: d */
    public final Uri mo14390d() {
        HttpURLConnection httpURLConnection = this.f20303i;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: e */
    public final Map mo14403e() {
        HttpURLConnection httpURLConnection = this.f20303i;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(2:19|(1:21))|22|(1:26))|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14391f() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f20304j     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x0076
            java.net.HttpURLConnection r2 = r9.f20303i     // Catch:{ all -> 0x0085 }
            long r3 = r9.f20308n     // Catch:{ all -> 0x0085 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.f20310p     // Catch:{ all -> 0x0085 }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ all -> 0x0085 }
            r8 = 19
            if (r7 == r8) goto L_0x0021
            int r7 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ all -> 0x0085 }
            r8 = 20
            if (r7 == r8) goto L_0x0021
            goto L_0x0069
        L_0x0021:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x0069 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0031
            int r3 = r2.read()     // Catch:{ Exception -> 0x0069 }
            r4 = -1
            if (r3 == r4) goto L_0x0069
            goto L_0x0038
        L_0x0031:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0038
            goto L_0x0069
        L_0x0038:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x0069 }
            if (r4 != 0) goto L_0x0050
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch:{ Exception -> 0x0069 }
            if (r3 == 0) goto L_0x0069
        L_0x0050:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0069 }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0069 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0069 }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x0069 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0069 }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            java.io.InputStream r2 = r9.f20304j     // Catch:{ IOException -> 0x006f }
            r2.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x0076
        L_0x006f:
            r2 = move-exception
            com.google.ads.interactivemedia.v3.internal.acn r3 = new com.google.ads.interactivemedia.v3.internal.acn     // Catch:{ all -> 0x0085 }
            r3.<init>((java.io.IOException) r2)     // Catch:{ all -> 0x0085 }
            throw r3     // Catch:{ all -> 0x0085 }
        L_0x0076:
            r9.f20304j = r0
            r9.m18236k()
            boolean r0 = r9.f20305k
            if (r0 == 0) goto L_0x0084
            r9.f20305k = r1
            r9.mo14407j()
        L_0x0084:
            return
        L_0x0085:
            r2 = move-exception
            r9.f20304j = r0
            r9.m18236k()
            boolean r0 = r9.f20305k
            if (r0 == 0) goto L_0x0094
            r9.f20305k = r1
            r9.mo14407j()
        L_0x0094:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aci.mo14391f():void");
    }

    public aci(String str, int i, int i2, acp acp) {
        super(true);
        ary.m19469v(str);
        this.f20299e = str;
        this.f20301g = new acp();
        this.f20297c = i;
        this.f20298d = i2;
        this.f20300f = acp;
    }

    /* renamed from: a */
    public final int mo14388a(byte[] bArr, int i, int i2) {
        try {
            if (this.f20309o != this.f20307m) {
                byte[] bArr2 = (byte[]) f20296b.getAndSet((Object) null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.f20309o;
                    long j2 = this.f20307m;
                    if (j == j2) {
                        f20296b.set(bArr2);
                        break;
                    }
                    int read = this.f20304j.read(bArr2, 0, (int) Math.min(j2 - j, (long) bArr2.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f20309o += (long) read;
                        mo14406i(read);
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f20308n;
            if (j3 != -1) {
                long j4 = j3 - this.f20310p;
                if (j4 != 0) {
                    i2 = (int) Math.min((long) i2, j4);
                }
                return -1;
            }
            int read2 = this.f20304j.read(bArr, i, i2);
            if (read2 != -1) {
                this.f20310p += (long) read2;
                mo14406i(read2);
                return read2;
            } else if (this.f20308n == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new acn(e);
        }
    }
}
