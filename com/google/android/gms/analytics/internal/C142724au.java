package com.google.android.gms.analytics.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.analytics.C142764q;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;
import p3186j$.net.URLEncoder;

/* renamed from: com.google.android.gms.analytics.internal.au */
/* compiled from: PG */
final class C142724au extends C142737g {

    /* renamed from: a */
    public static final byte[] f387304a = "\n".getBytes();

    /* renamed from: b */
    private final String f387305b = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", C142738h.f387330a, Build.VERSION.RELEASE, C142731ba.m231603c(Locale.getDefault()), Build.MODEL, Build.ID});

    /* renamed from: c */
    private final C142729az f387306c = new C142729az();

    public C142724au(C142740j jVar) {
        super(jVar);
    }

    /* renamed from: f */
    private final URL m231578f() {
        C142708ae aeVar = this.f387328e.f387336d;
        String f = C142708ae.m231548f();
        C142708ae aeVar2 = this.f387328e.f387336d;
        try {
            return new URL(String.valueOf(f).concat((String) C142715al.f387266m.mo117506a()));
        } catch (MalformedURLException e) {
            super.mo117536i(6, "Error trying to parse the hardcoded host url", e, (Object) null, (Object) null);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[SYNTHETIC, Splitter:B:17:0x0025] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m231581o(java.net.HttpURLConnection r9) {
        /*
            r8 = this;
            java.io.InputStream r9 = r9.getInputStream()     // Catch:{ all -> 0x0021 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x001f }
        L_0x0008:
            int r1 = r9.read(r0)     // Catch:{ all -> 0x001f }
            if (r1 > 0) goto L_0x0008
            if (r9 == 0) goto L_0x001e
            r9.close()     // Catch:{ IOException -> 0x0014 }
            return
        L_0x0014:
            r5 = move-exception
            r3 = 6
            java.lang.String r4 = "Error closing http connection input stream"
            r6 = 0
            r7 = 0
            r2 = r8
            super.mo117536i(r3, r4, r5, r6, r7)
        L_0x001e:
            return
        L_0x001f:
            r0 = move-exception
            goto L_0x0023
        L_0x0021:
            r0 = move-exception
            r9 = 0
        L_0x0023:
            if (r9 == 0) goto L_0x0033
            r9.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x0033
        L_0x0029:
            r4 = move-exception
            r2 = 6
            java.lang.String r3 = "Error closing http connection input stream"
            r5 = 0
            r6 = 0
            r1 = r8
            super.mo117536i(r2, r3, r4, r5, r6)
        L_0x0033:
            goto L_0x0035
        L_0x0034:
            throw r0
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142724au.m231581o(java.net.HttpURLConnection):void");
    }

    /* renamed from: p */
    private static final void m231582p(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094 A[SYNTHETIC, Splitter:B:37:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00af A[SYNTHETIC, Splitter:B:46:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m231583q(java.net.URL r11, byte[] r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.C143919bh.m233958a(r12)
            int r7 = r12.length
            r2 = 3
            java.lang.String r3 = "POST bytes, url"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r6 = 0
            r1 = r10
            r5 = r11
            super.mo117536i(r2, r3, r4, r5, r6)
            boolean r1 = m231619j()
            if (r1 == 0) goto L_0x0025
            java.lang.String r4 = new java.lang.String
            r4.<init>(r12)
            r2 = 2
            java.lang.String r3 = "Post payload\n"
            r5 = 0
            r6 = 0
            r1 = r10
            super.mo117536i(r2, r3, r4, r5, r6)
        L_0x0025:
            r1 = 0
            java.net.HttpURLConnection r8 = r10.mo117516c(r11)     // Catch:{ IOException -> 0x0085, all -> 0x0081 }
            r2 = 1
            r8.setDoOutput(r2)     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            r8.setFixedLengthStreamingMode(r7)     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            r8.connect()     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            java.io.OutputStream r7 = r8.getOutputStream()     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            r7.write(r12)     // Catch:{ IOException -> 0x0077 }
            r10.m231581o(r8)     // Catch:{ IOException -> 0x0077 }
            int r0 = r8.getResponseCode()     // Catch:{ IOException -> 0x0077 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x0052
            com.google.android.gms.analytics.internal.j r0 = r10.f387328e     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.analytics.internal.e r0 = r0.mo117544d()     // Catch:{ IOException -> 0x0077 }
            r0.mo117533e()     // Catch:{ IOException -> 0x0077 }
            r9 = 200(0xc8, float:2.8E-43)
            goto L_0x0053
        L_0x0052:
            r9 = r0
        L_0x0053:
            java.lang.String r3 = "POST status"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x0077 }
            r2 = 3
            r5 = 0
            r6 = 0
            r1 = r10
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x0077 }
            if (r7 == 0) goto L_0x0071
            r7.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x0071
        L_0x0066:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Error closing http post connection output stream"
            r5 = 0
            r6 = 0
            r1 = r10
            super.mo117536i(r2, r3, r4, r5, r6)
        L_0x0071:
            if (r8 == 0) goto L_0x0076
            r8.disconnect()
        L_0x0076:
            return r9
        L_0x0077:
            r0 = move-exception
            r4 = r0
            goto L_0x0089
        L_0x007a:
            r0 = move-exception
        L_0x007b:
            r7 = r0
            goto L_0x00ad
        L_0x007d:
            r0 = move-exception
            r4 = r0
            r7 = r1
            goto L_0x0089
        L_0x0081:
            r0 = move-exception
            r7 = r0
            r8 = r1
            goto L_0x00ad
        L_0x0085:
            r0 = move-exception
            r4 = r0
            r7 = r1
            r8 = r7
        L_0x0089:
            java.lang.String r3 = "Network POST connection error"
            r2 = 5
            r5 = 0
            r6 = 0
            r1 = r10
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00aa }
            if (r7 == 0) goto L_0x00a3
            r7.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x00a3
        L_0x0098:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Error closing http post connection output stream"
            r5 = 0
            r6 = 0
            r1 = r10
            super.mo117536i(r2, r3, r4, r5, r6)
        L_0x00a3:
            if (r8 == 0) goto L_0x00a8
            r8.disconnect()
        L_0x00a8:
            r0 = 0
            return r0
        L_0x00aa:
            r0 = move-exception
            r1 = r7
            goto L_0x007b
        L_0x00ad:
            if (r1 == 0) goto L_0x00be
            r1.close()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x00be
        L_0x00b3:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Error closing http post connection output stream"
            r5 = 0
            r6 = 0
            r1 = r10
            super.mo117536i(r2, r3, r4, r5, r6)
        L_0x00be:
            if (r8 == 0) goto L_0x00c3
            r8.disconnect()
        L_0x00c3:
            goto L_0x00c5
        L_0x00c4:
            throw r7
        L_0x00c5:
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142724au.m231583q(java.net.URL, byte[]):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
        super.mo117536i(2, "Network initialized. User agent", this.f387305b, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo117515b(C142718ao aoVar, boolean z) {
        String str;
        C143919bh.m233958a(aoVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : aoVar.f387287a.entrySet()) {
                String str2 = (String) entry.getKey();
                if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2) && !"z".equals(str2) && !"_gmsv".equals(str2)) {
                    m231582p(sb, str2, (String) entry.getValue());
                }
            }
            m231582p(sb, "ht", String.valueOf(aoVar.f387290d));
            C144006f fVar = this.f387328e.f387340h;
            m231582p(sb, "qt", String.valueOf(System.currentTimeMillis() - aoVar.f387290d));
            C142708ae aeVar = this.f387328e.f387336d;
            if (z) {
                long a = C142731ba.m231601a(aoVar.mo117507a("_s", "0"));
                if (a != 0) {
                    str = String.valueOf(a);
                } else {
                    str = String.valueOf(aoVar.f387289c);
                }
                m231582p(sb, "z", str);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            super.mo117536i(6, "Failed to encode name or value", e, (Object) null, (Object) null);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final HttpURLConnection mo117516c(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            C142708ae aeVar = this.f387328e.f387336d;
            httpURLConnection.setConnectTimeout(((Integer) C142715al.f387275v.mo117506a()).intValue());
            C142708ae aeVar2 = this.f387328e.f387336d;
            httpURLConnection.setReadTimeout(((Integer) C142715al.f387276w.mo117506a()).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.f387305b);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x027a A[SYNTHETIC, Splitter:B:105:0x027a] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0401 A[EDGE_INSN: B:183:0x0401->B:171:0x0401 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x025c A[SYNTHETIC, Splitter:B:95:0x025c] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo117517d(java.util.List r20) {
        /*
            r19 = this;
            r7 = r19
            com.google.android.gms.analytics.C142764q.m231686b()
            r19.mo117537k()
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r0 = r0.f387336d
            java.util.Set r0 = r0.mo117496a()
            boolean r0 = r0.isEmpty()
            r8 = 1
            r9 = 0
            if (r0 != 0) goto L_0x0088
            com.google.android.gms.analytics.internal.az r0 = r7.f387306c
            com.google.android.gms.analytics.internal.j r1 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r1 = r1.f387336d
            com.google.android.gms.analytics.internal.ak r1 = com.google.android.gms.analytics.internal.C142715al.f387274u
            java.lang.Object r1 = r1.mo117506a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            boolean r0 = r0.mo117526a(r1)
            if (r0 != 0) goto L_0x0036
            goto L_0x0088
        L_0x0036:
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r0 = r0.f387336d
            com.google.android.gms.analytics.internal.ak r0 = com.google.android.gms.analytics.internal.C142715al.f387268o
            java.lang.Object r0 = r0.mo117506a()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "BATCH_BY_SESSION"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x004c
        L_0x004a:
            r0 = 1
            goto L_0x0071
        L_0x004c:
            java.lang.String r1 = "BATCH_BY_TIME"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0055
            goto L_0x004a
        L_0x0055:
            java.lang.String r1 = "BATCH_BY_BRUTE_FORCE"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x005e
            goto L_0x004a
        L_0x005e:
            java.lang.String r1 = "BATCH_BY_COUNT"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0067
            goto L_0x004a
        L_0x0067:
            java.lang.String r1 = "BATCH_BY_SIZE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0070
            goto L_0x004a
        L_0x0070:
            r0 = 0
        L_0x0071:
            com.google.android.gms.analytics.internal.j r1 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r1 = r1.f387336d
            com.google.android.gms.analytics.internal.ak r1 = com.google.android.gms.analytics.internal.C142715al.f387269p
            java.lang.Object r1 = r1.mo117506a()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "GZIP"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r8 == r1) goto L_0x0086
            goto L_0x0089
        L_0x0086:
            r10 = 1
            goto L_0x008a
        L_0x0088:
            r0 = 0
        L_0x0089:
            r10 = 0
        L_0x008a:
            r11 = 200(0xc8, float:2.8E-43)
            if (r0 == 0) goto L_0x02de
            boolean r0 = r20.isEmpty()
            r0 = r0 ^ r8
            com.google.android.gms.common.internal.C143919bh.m233959b(r0)
            r2 = 2
            java.lang.String r3 = "Uploading batched hits. compression, count"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)
            int r0 = r20.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r20.iterator()
            r16 = 0
            r17 = 0
        L_0x00bd:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r15.next()
            r6 = r0
            com.google.android.gms.analytics.internal.ao r6 = (com.google.android.gms.analytics.internal.C142718ao) r6
            com.google.android.gms.common.internal.C143919bh.m233958a(r6)
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r0 = r0.f387336d
            int r0 = r16 + 1
            int r1 = com.google.android.gms.analytics.internal.C142708ae.m231546d()
            if (r0 <= r1) goto L_0x00db
            goto L_0x0160
        L_0x00db:
            java.lang.String r1 = r7.mo117515b(r6, r9)
            if (r1 != 0) goto L_0x00ed
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e
            com.google.android.gms.analytics.internal.as r0 = r0.mo117548h()
            java.lang.String r1 = "Error formatting hit"
            r0.mo117509b(r6, r1)
            goto L_0x013f
        L_0x00ed:
            byte[] r1 = r1.getBytes()
            int r2 = r1.length
            com.google.android.gms.analytics.internal.j r3 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r3 = r3.f387336d
            com.google.android.gms.analytics.internal.ak r3 = com.google.android.gms.analytics.internal.C142715al.f387270q
            java.lang.Object r3 = r3.mo117506a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r2 <= r3) goto L_0x0110
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e
            com.google.android.gms.analytics.internal.as r0 = r0.mo117548h()
            java.lang.String r1 = "Hit size exceeds the maximum size limit"
            r0.mo117509b(r6, r1)
            goto L_0x013f
        L_0x0110:
            int r3 = r13.size()
            if (r3 <= 0) goto L_0x0118
            int r2 = r2 + 1
        L_0x0118:
            int r3 = r13.size()
            com.google.android.gms.analytics.internal.j r4 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r4 = r4.f387336d
            int r3 = r3 + r2
            com.google.android.gms.analytics.internal.ak r2 = com.google.android.gms.analytics.internal.C142715al.f387272s
            java.lang.Object r2 = r2.mo117506a()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r3 > r2) goto L_0x0160
            int r2 = r13.size()     // Catch:{ IOException -> 0x0141 }
            if (r2 <= 0) goto L_0x013a
            byte[] r2 = f387304a     // Catch:{ IOException -> 0x0141 }
            r13.write(r2)     // Catch:{ IOException -> 0x0141 }
        L_0x013a:
            r13.write(r1)     // Catch:{ IOException -> 0x0141 }
            r16 = r0
        L_0x013f:
            r12 = r6
            goto L_0x014f
        L_0x0141:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Failed to write payload when batching hits"
            r5 = 0
            r0 = 0
            r1 = r19
            r12 = r6
            r6 = r0
            r1.mo117536i(r2, r3, r4, r5, r6)
        L_0x014f:
            long r0 = r12.f387289c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r14.add(r0)
            if (r17 > 0) goto L_0x00bd
            int r0 = r12.f387291e
            r17 = r0
            goto L_0x00bd
        L_0x0160:
            if (r16 != 0) goto L_0x0164
            goto L_0x02dd
        L_0x0164:
            java.net.URL r0 = r19.m231578f()
            if (r0 != 0) goto L_0x017b
            r2 = 6
            java.lang.String r3 = "Failed to build batching endpoint url"
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)
            java.util.List r14 = java.util.Collections.emptyList()
            goto L_0x02dd
        L_0x017b:
            if (r10 == 0) goto L_0x0290
            byte[] r10 = r13.toByteArray()
            com.google.android.gms.common.internal.C143919bh.m233958a(r10)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r1.<init>()     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r2.write(r10)     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r2.close()     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r1.close()     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            byte[] r12 = r1.toByteArray()     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            int r13 = r12.length     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            long r1 = (long) r13     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r3 = 100
            long r1 = r1 * r3
            int r6 = r10.length     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            long r3 = (long) r6     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            long r1 = r1 / r3
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r2 = 3
            java.lang.String r3 = "POST compressed size, ratio %, url"
            r1 = r19
            r4 = r15
            r9 = r6
            r6 = r0
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            if (r13 <= r9) goto L_0x01c7
            java.lang.String r3 = "Compressed payload is larger then uncompressed. compressed, uncompressed"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r2 = 5
            r6 = 0
            r1 = r19
            r4 = r15
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
        L_0x01c7:
            boolean r1 = m231619j()     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            if (r1 == 0) goto L_0x01ed
            java.lang.String r3 = "Post payload"
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r1.<init>(r10)     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r2.<init>()     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            java.lang.String r4 = "\n"
            r2.append(r4)     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r2.append(r1)     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r2 = 2
            r5 = 0
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
        L_0x01ed:
            java.net.HttpURLConnection r9 = r7.mo117516c(r0)     // Catch:{ IOException -> 0x024b, all -> 0x0246 }
            r9.setDoOutput(r8)     // Catch:{ IOException -> 0x0242, all -> 0x023f }
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r1 = "gzip"
            r9.addRequestProperty(r0, r1)     // Catch:{ IOException -> 0x0242, all -> 0x023f }
            r9.setFixedLengthStreamingMode(r13)     // Catch:{ IOException -> 0x0242, all -> 0x023f }
            r9.connect()     // Catch:{ IOException -> 0x0242, all -> 0x023f }
            java.io.OutputStream r1 = r9.getOutputStream()     // Catch:{ IOException -> 0x0242, all -> 0x023f }
            r1.write(r12)     // Catch:{ IOException -> 0x0239, all -> 0x0235 }
            r1.close()     // Catch:{ IOException -> 0x0239, all -> 0x0235 }
            r7.m231581o(r9)     // Catch:{ IOException -> 0x0242, all -> 0x023f }
            int r0 = r9.getResponseCode()     // Catch:{ IOException -> 0x0242, all -> 0x023f }
            if (r0 != r11) goto L_0x021f
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e     // Catch:{ IOException -> 0x0242, all -> 0x023f }
            com.google.android.gms.analytics.internal.e r0 = r0.mo117544d()     // Catch:{ IOException -> 0x0242, all -> 0x023f }
            r0.mo117533e()     // Catch:{ IOException -> 0x0242, all -> 0x023f }
            r0 = 200(0xc8, float:2.8E-43)
        L_0x021f:
            java.lang.String r3 = "POST status"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0242, all -> 0x023f }
            r2 = 3
            r5 = 0
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x0242, all -> 0x023f }
            if (r9 == 0) goto L_0x0232
            r9.disconnect()
        L_0x0232:
            r9 = r0
            goto L_0x0298
        L_0x0235:
            r0 = move-exception
            r8 = r0
            r12 = r1
            goto L_0x0278
        L_0x0239:
            r0 = move-exception
            r4 = r0
            r18 = r1
            r12 = r9
            goto L_0x0250
        L_0x023f:
            r0 = move-exception
            r8 = r0
            goto L_0x0249
        L_0x0242:
            r0 = move-exception
            r4 = r0
            r12 = r9
            goto L_0x024e
        L_0x0246:
            r0 = move-exception
            r8 = r0
            r9 = 0
        L_0x0249:
            r12 = 0
            goto L_0x0278
        L_0x024b:
            r0 = move-exception
            r4 = r0
            r12 = 0
        L_0x024e:
            r18 = 0
        L_0x0250:
            java.lang.String r3 = "Network compressed POST connection error"
            r2 = 5
            r5 = 0
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0273 }
            if (r18 == 0) goto L_0x026c
            r18.close()     // Catch:{ IOException -> 0x0260 }
            goto L_0x026c
        L_0x0260:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Error closing http compressed post connection output stream"
            r5 = 0
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)
        L_0x026c:
            if (r12 == 0) goto L_0x0271
            r12.disconnect()
        L_0x0271:
            r9 = 0
            goto L_0x0298
        L_0x0273:
            r0 = move-exception
            r8 = r0
            r9 = r12
            r12 = r18
        L_0x0278:
            if (r12 == 0) goto L_0x028a
            r12.close()     // Catch:{ IOException -> 0x027e }
            goto L_0x028a
        L_0x027e:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Error closing http compressed post connection output stream"
            r5 = 0
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)
        L_0x028a:
            if (r9 == 0) goto L_0x028f
            r9.disconnect()
        L_0x028f:
            throw r8
        L_0x0290:
            byte[] r1 = r13.toByteArray()
            int r9 = r7.m231583q(r0, r1)
        L_0x0298:
            if (r9 != r11) goto L_0x02a9
            r2 = 2
            java.lang.String r3 = "Batched upload completed. Hits batched"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r5 = 0
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)
            goto L_0x02dd
        L_0x02a9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r2 = 2
            java.lang.String r3 = "Network error uploading hits. status code"
            r5 = 0
            r6 = 0
            r1 = r19
            r4 = r0
            super.mo117536i(r2, r3, r4, r5, r6)
            com.google.android.gms.analytics.internal.j r1 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r1 = r1.f387336d
            java.util.Set r1 = r1.mo117496a()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x02d9
            r2 = 5
            java.lang.String r3 = "Server instructed the client to stop batching"
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)
            com.google.android.gms.analytics.internal.az r0 = r7.f387306c
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.f387316a = r1
        L_0x02d9:
            java.util.List r14 = java.util.Collections.emptyList()
        L_0x02dd:
            return r14
        L_0x02de:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r0 = r20.size()
            r9.<init>(r0)
            java.util.Iterator r0 = r20.iterator()
        L_0x02eb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0401
            java.lang.Object r1 = r0.next()
            r10 = r1
            com.google.android.gms.analytics.internal.ao r10 = (com.google.android.gms.analytics.internal.C142718ao) r10
            com.google.android.gms.common.internal.C143919bh.m233958a(r10)
            boolean r1 = r10.f387292f
            r1 = r1 ^ r8
            java.lang.String r1 = r7.mo117515b(r10, r1)
            if (r1 != 0) goto L_0x0312
            com.google.android.gms.analytics.internal.j r1 = r7.f387328e
            com.google.android.gms.analytics.internal.as r1 = r1.mo117548h()
            java.lang.String r2 = "Error formatting hit for upload"
            r1.mo117509b(r10, r2)
        L_0x030f:
            r1 = 0
            goto L_0x03ea
        L_0x0312:
            com.google.android.gms.analytics.internal.j r2 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r2 = r2.f387336d
            int r2 = r1.length()
            com.google.android.gms.analytics.internal.ak r3 = com.google.android.gms.analytics.internal.C142715al.f387267n
            java.lang.Object r3 = r3.mo117506a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r2 > r3) goto L_0x039a
            java.net.URL r12 = r7.m231580n(r10, r1)
            if (r12 != 0) goto L_0x033b
            r2 = 6
            java.lang.String r3 = "Failed to build collect GET endpoint url"
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)
            goto L_0x0401
        L_0x033b:
            r2 = 3
            java.lang.String r3 = "GET request"
            r5 = 0
            r6 = 0
            r1 = r19
            r4 = r12
            super.mo117536i(r2, r3, r4, r5, r6)
            java.net.HttpURLConnection r12 = r7.mo117516c(r12)     // Catch:{ IOException -> 0x0381, all -> 0x037e }
            r12.connect()     // Catch:{ IOException -> 0x037b }
            r7.m231581o(r12)     // Catch:{ IOException -> 0x037b }
            int r1 = r12.getResponseCode()     // Catch:{ IOException -> 0x037b }
            if (r1 != r11) goto L_0x0362
            com.google.android.gms.analytics.internal.j r1 = r7.f387328e     // Catch:{ IOException -> 0x037b }
            com.google.android.gms.analytics.internal.e r1 = r1.mo117544d()     // Catch:{ IOException -> 0x037b }
            r1.mo117533e()     // Catch:{ IOException -> 0x037b }
            r13 = 200(0xc8, float:2.8E-43)
            goto L_0x0363
        L_0x0362:
            r13 = r1
        L_0x0363:
            java.lang.String r3 = "GET status"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x037b }
            r2 = 3
            r5 = 0
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x037b }
            if (r12 == 0) goto L_0x0376
            r12.disconnect()
        L_0x0376:
            if (r13 != r11) goto L_0x0401
            goto L_0x030f
        L_0x0379:
            r0 = move-exception
            goto L_0x0394
        L_0x037b:
            r0 = move-exception
            r4 = r0
            goto L_0x0384
        L_0x037e:
            r0 = move-exception
            r12 = 0
            goto L_0x0394
        L_0x0381:
            r0 = move-exception
            r4 = r0
            r12 = 0
        L_0x0384:
            java.lang.String r3 = "Network GET connection error"
            r2 = 5
            r5 = 0
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0379 }
            if (r12 == 0) goto L_0x0401
            r12.disconnect()
            goto L_0x0401
        L_0x0394:
            if (r12 == 0) goto L_0x0399
            r12.disconnect()
        L_0x0399:
            throw r0
        L_0x039a:
            r1 = 0
            java.lang.String r2 = r7.mo117515b(r10, r1)
            if (r2 != 0) goto L_0x03ad
            com.google.android.gms.analytics.internal.j r2 = r7.f387328e
            com.google.android.gms.analytics.internal.as r2 = r2.mo117548h()
            java.lang.String r3 = "Error formatting hit for POST upload"
            r2.mo117509b(r10, r3)
            goto L_0x03ea
        L_0x03ad:
            byte[] r2 = r2.getBytes()
            int r3 = r2.length
            com.google.android.gms.analytics.internal.j r4 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r4 = r4.f387336d
            com.google.android.gms.analytics.internal.ak r4 = com.google.android.gms.analytics.internal.C142715al.f387271r
            java.lang.Object r4 = r4.mo117506a()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 <= r4) goto L_0x03d0
            com.google.android.gms.analytics.internal.j r2 = r7.f387328e
            com.google.android.gms.analytics.internal.as r2 = r2.mo117548h()
            java.lang.String r3 = "Hit payload exceeds size limit"
            r2.mo117509b(r10, r3)
            goto L_0x03ea
        L_0x03d0:
            java.net.URL r3 = r7.m231579g(r10)
            if (r3 != 0) goto L_0x03e2
            r2 = 6
            java.lang.String r3 = "Failed to build collect POST endpoint url"
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r19
            super.mo117536i(r2, r3, r4, r5, r6)
            goto L_0x0401
        L_0x03e2:
            int r4 = r10.f387291e
            int r2 = r7.m231583q(r3, r2)
            if (r2 != r11) goto L_0x0401
        L_0x03ea:
            long r2 = r10.f387289c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r9.add(r2)
            int r2 = r9.size()
            com.google.android.gms.analytics.internal.j r3 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r3 = r3.f387336d
            int r3 = com.google.android.gms.analytics.internal.C142708ae.m231547e()
            if (r2 < r3) goto L_0x02eb
        L_0x0401:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142724au.mo117517d(java.util.List):java.util.List");
    }

    /* renamed from: e */
    public final boolean mo117518e() {
        NetworkInfo networkInfo;
        C142764q.m231686b();
        mo117537k();
        try {
            networkInfo = ((ConnectivityManager) this.f387328e.f387334b.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        super.mo117536i(2, "No network connectivity", (Object) null, (Object) null, (Object) null);
        return false;
    }

    /* renamed from: g */
    private final URL m231579g(C142718ao aoVar) {
        String str;
        if (aoVar.f387292f) {
            C142708ae aeVar = this.f387328e.f387336d;
            String f = C142708ae.m231548f();
            C142708ae aeVar2 = this.f387328e.f387336d;
            str = String.valueOf(f).concat(String.valueOf(C142708ae.m231549g()));
        } else {
            C142708ae aeVar3 = this.f387328e.f387336d;
            String h = C142708ae.m231550h();
            C142708ae aeVar4 = this.f387328e.f387336d;
            str = String.valueOf(h).concat(String.valueOf(C142708ae.m231549g()));
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            super.mo117536i(6, "Error trying to parse the hardcoded host url", e, (Object) null, (Object) null);
            return null;
        }
    }

    /* renamed from: n */
    private final URL m231580n(C142718ao aoVar, String str) {
        String str2;
        if (aoVar.f387292f) {
            C142708ae aeVar = this.f387328e.f387336d;
            String f = C142708ae.m231548f();
            C142708ae aeVar2 = this.f387328e.f387336d;
            str2 = f + C142708ae.m231549g() + "?" + str;
        } else {
            C142708ae aeVar3 = this.f387328e.f387336d;
            String h = C142708ae.m231550h();
            C142708ae aeVar4 = this.f387328e.f387336d;
            str2 = h + C142708ae.m231549g() + "?" + str;
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            super.mo117536i(6, "Error trying to parse the hardcoded host url", e, (Object) null, (Object) null);
            return null;
        }
    }
}
