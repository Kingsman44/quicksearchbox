package androidx.media3.p132b;

import android.net.Uri;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.common.p4522b.C58729pv;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.media3.b.v */
/* compiled from: PG */
public final class C2518v extends C2499c implements C2488ag {

    /* renamed from: a */
    private final boolean f6924a;

    /* renamed from: b */
    private final int f6925b;

    /* renamed from: c */
    private final int f6926c;

    /* renamed from: d */
    private final String f6927d;

    /* renamed from: e */
    private final C2487af f6928e;

    /* renamed from: f */
    private final C2487af f6929f;

    /* renamed from: g */
    private C2510n f6930g;

    /* renamed from: h */
    private HttpURLConnection f6931h;

    /* renamed from: i */
    private InputStream f6932i;

    /* renamed from: j */
    private boolean f6933j;

    /* renamed from: k */
    private int f6934k;

    /* renamed from: l */
    private long f6935l;

    /* renamed from: m */
    private long f6936m;

    @Deprecated
    public C2518v() {
        this((String) null, 8000, 8000, false, (C2487af) null);
    }

    /* renamed from: k */
    private final URL m6637k(URL url, String str, C2510n nVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new C2484ac("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), nVar, 2001, 1);
                } else if (this.f6924a || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    throw new C2484ac("Disallowed cross-protocol redirect (" + protocol2 + " to " + protocol + ")", nVar, 2001, 1);
                }
            } catch (MalformedURLException e) {
                throw new C2484ac((IOException) e, nVar, 2001, 1);
            }
        } else {
            throw new C2484ac("Null location redirect", nVar, 2001, 1);
        }
    }

    /* renamed from: l */
    private final void m6638l() {
        HttpURLConnection httpURLConnection = this.f6931h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C2633u.m7048c("DefaultHttpDataSource", C2633u.m7046a("Unexpected error while disconnecting", e));
            }
            this.f6931h = null;
        }
    }

    /* renamed from: m */
    private final HttpURLConnection m6639m(URL url, long j, long j2, boolean z, boolean z2, Map map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f6925b);
        httpURLConnection.setReadTimeout(this.f6926c);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f6928e.mo5922a());
        hashMap.putAll(this.f6929f.mo5922a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String c = C2489ah.m6554c(j, j2);
        if (c != null) {
            httpURLConnection.setRequestProperty("Range", c);
        }
        String str = this.f6927d;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(C2510n.m6616d());
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f6935l;
            if (j != -1) {
                long j2 = j - this.f6936m;
                if (j2 != 0) {
                    i2 = (int) Math.min((long) i2, j2);
                }
                return -1;
            }
            InputStream inputStream = this.f6932i;
            int i3 = C2612ak.f7249a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.f6936m += (long) read;
            mo5927g(read);
            return read;
        } catch (IOException e) {
            C2510n nVar = this.f6930g;
            int i4 = C2612ak.f7249a;
            throw C2484ac.m6549a(e, nVar, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if (r6 != 0) goto L_0x00ae;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo5880b(androidx.media3.p132b.C2510n r25) {
        /*
            r24 = this;
            r10 = r24
            r11 = r25
            r10.f6930g = r11
            r12 = 0
            r10.f6936m = r12
            r10.f6935l = r12
            r24.mo5929i(r25)
            r14 = 1
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x01d4 }
            android.net.Uri r0 = r11.f6891a     // Catch:{ IOException -> 0x01d4 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x01d4 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01d4 }
            int r0 = r11.f6893c     // Catch:{ IOException -> 0x01d4 }
            byte[] r0 = r11.f6894d     // Catch:{ IOException -> 0x01d4 }
            long r8 = r11.f6896f     // Catch:{ IOException -> 0x01d4 }
            long r5 = r11.f6897g     // Catch:{ IOException -> 0x01d4 }
            boolean r0 = r11.mo5938c(r14)     // Catch:{ IOException -> 0x01d4 }
            boolean r1 = r10.f6924a     // Catch:{ IOException -> 0x01d4 }
            r15 = 0
            if (r1 != 0) goto L_0x003c
            r16 = 1
            java.util.Map r7 = r11.f6895e     // Catch:{ IOException -> 0x01d4 }
            r1 = r24
            r3 = r8
            r9 = r7
            r7 = r0
            r8 = r16
            java.net.HttpURLConnection r0 = r1.m6639m(r2, r3, r5, r7, r8, r9)     // Catch:{ IOException -> 0x01d4 }
            goto L_0x0084
        L_0x003c:
            r7 = r2
            r1 = 0
        L_0x003e:
            int r3 = r1 + 1
            r2 = 20
            if (r1 > r2) goto L_0x01b2
            r16 = 0
            java.util.Map r4 = r11.f6895e     // Catch:{ IOException -> 0x01d4 }
            r1 = r24
            r2 = r7
            r17 = r3
            r18 = r4
            r3 = r8
            r19 = r5
            r21 = r7
            r7 = r0
            r22 = r8
            r8 = r16
            r9 = r18
            java.net.HttpURLConnection r1 = r1.m6639m(r2, r3, r5, r7, r8, r9)     // Catch:{ IOException -> 0x01d4 }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x01d4 }
            java.lang.String r3 = "Location"
            java.lang.String r3 = r1.getHeaderField(r3)     // Catch:{ IOException -> 0x01d4 }
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 == r4) goto L_0x01a1
            r4 = 301(0x12d, float:4.22E-43)
            if (r2 == r4) goto L_0x01a1
            r4 = 302(0x12e, float:4.23E-43)
            if (r2 == r4) goto L_0x01a1
            r4 = 303(0x12f, float:4.25E-43)
            if (r2 == r4) goto L_0x01a1
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x01a1
            r4 = 308(0x134, float:4.32E-43)
            if (r2 != r4) goto L_0x0083
            goto L_0x01a1
        L_0x0083:
            r0 = r1
        L_0x0084:
            r10.f6931h = r0     // Catch:{ IOException -> 0x01d4 }
            int r1 = r0.getResponseCode()     // Catch:{ IOException -> 0x01d4 }
            r10.f6934k = r1     // Catch:{ IOException -> 0x01d4 }
            r0.getResponseMessage()     // Catch:{ IOException -> 0x01d4 }
            int r1 = r10.f6934k
            java.lang.String r2 = "Content-Range"
            r3 = 200(0xc8, float:2.8E-43)
            r4 = -1
            if (r1 < r3) goto L_0x0156
            r6 = 299(0x12b, float:4.19E-43)
            if (r1 <= r6) goto L_0x009f
            goto L_0x0156
        L_0x009f:
            r0.getContentType()
            int r1 = r10.f6934k
            if (r1 != r3) goto L_0x00ad
            long r6 = r11.f6896f
            int r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r6 = r12
        L_0x00ae:
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r1 = r0.getHeaderField(r1)
            java.lang.String r3 = "gzip"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x00dc
            long r8 = r11.f6897g
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00c5
            r10.f6935l = r8
            goto L_0x00e0
        L_0x00c5:
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            java.lang.String r2 = r0.getHeaderField(r2)
            long r2 = androidx.media3.p132b.C2489ah.m6552a(r3, r2)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00d9
            long r4 = r2 - r6
        L_0x00d9:
            r10.f6935l = r4
            goto L_0x00e0
        L_0x00dc:
            long r2 = r11.f6897g
            r10.f6935l = r2
        L_0x00e0:
            r2 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x014c }
            r10.f6932i = r0     // Catch:{ IOException -> 0x014c }
            if (r1 == 0) goto L_0x00f3
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x014c }
            java.io.InputStream r1 = r10.f6932i     // Catch:{ IOException -> 0x014c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x014c }
            r10.f6932i = r0     // Catch:{ IOException -> 0x014c }
        L_0x00f3:
            r10.f6933j = r14
            r24.mo5930j(r25)
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00fd
            goto L_0x0138
        L_0x00fd:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x013b }
        L_0x0101:
            int r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0138
            r3 = 4096(0x1000, double:2.0237E-320)
            long r3 = java.lang.Math.min(r6, r3)     // Catch:{ IOException -> 0x013b }
            int r1 = (int) r3     // Catch:{ IOException -> 0x013b }
            java.io.InputStream r3 = r10.f6932i     // Catch:{ IOException -> 0x013b }
            int r4 = androidx.media3.common.p136b.C2612ak.f7249a     // Catch:{ IOException -> 0x013b }
            int r1 = r3.read(r0, r15, r1)     // Catch:{ IOException -> 0x013b }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x013b }
            boolean r3 = r3.isInterrupted()     // Catch:{ IOException -> 0x013b }
            if (r3 != 0) goto L_0x012d
            r3 = -1
            if (r1 == r3) goto L_0x0127
            long r3 = (long) r1     // Catch:{ IOException -> 0x013b }
            long r6 = r6 - r3
            r10.mo5927g(r1)     // Catch:{ IOException -> 0x013b }
            goto L_0x0101
        L_0x0127:
            androidx.media3.b.ac r0 = new androidx.media3.b.ac     // Catch:{ IOException -> 0x013b }
            r0.<init>(r11)     // Catch:{ IOException -> 0x013b }
            throw r0     // Catch:{ IOException -> 0x013b }
        L_0x012d:
            androidx.media3.b.ac r0 = new androidx.media3.b.ac     // Catch:{ IOException -> 0x013b }
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException     // Catch:{ IOException -> 0x013b }
            r1.<init>()     // Catch:{ IOException -> 0x013b }
            r0.<init>((java.io.IOException) r1, (androidx.media3.p132b.C2510n) r11, (int) r2, (int) r14)     // Catch:{ IOException -> 0x013b }
            throw r0     // Catch:{ IOException -> 0x013b }
        L_0x0138:
            long r0 = r10.f6935l
            return r0
        L_0x013b:
            r0 = move-exception
            r24.m6638l()
            boolean r1 = r0 instanceof androidx.media3.p132b.C2484ac
            if (r1 == 0) goto L_0x0146
            androidx.media3.b.ac r0 = (androidx.media3.p132b.C2484ac) r0
            throw r0
        L_0x0146:
            androidx.media3.b.ac r1 = new androidx.media3.b.ac
            r1.<init>((java.io.IOException) r0, (androidx.media3.p132b.C2510n) r11, (int) r2, (int) r14)
            throw r1
        L_0x014c:
            r0 = move-exception
            r24.m6638l()
            androidx.media3.b.ac r1 = new androidx.media3.b.ac
            r1.<init>((java.io.IOException) r0, (androidx.media3.p132b.C2510n) r11, (int) r2, (int) r14)
            throw r1
        L_0x0156:
            r0.getHeaderFields()
            int r1 = r10.f6934k
            r3 = 416(0x1a0, float:5.83E-43)
            if (r1 != r3) goto L_0x017a
            java.lang.String r1 = r0.getHeaderField(r2)
            long r1 = androidx.media3.p132b.C2489ah.m6553b(r1)
            long r6 = r11.f6896f
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x017a
            r10.f6933j = r14
            r24.mo5930j(r25)
            long r0 = r11.f6897g
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0179
            return r0
        L_0x0179:
            return r12
        L_0x017a:
            java.io.InputStream r0 = r0.getErrorStream()
            if (r0 == 0) goto L_0x0184
            androidx.media3.common.p136b.C2612ak.m6949aE(r0)     // Catch:{ IOException -> 0x0187 }
            goto L_0x0189
        L_0x0184:
            int r0 = androidx.media3.common.p136b.C2612ak.f7249a     // Catch:{ IOException -> 0x0187 }
            goto L_0x0189
        L_0x0187:
            int r0 = androidx.media3.common.p136b.C2612ak.f7249a
        L_0x0189:
            r24.m6638l()
            int r0 = r10.f6934k
            if (r0 != r3) goto L_0x0198
            androidx.media3.b.j r0 = new androidx.media3.b.j
            r1 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r1)
            goto L_0x0199
        L_0x0198:
            r0 = 0
        L_0x0199:
            androidx.media3.b.ae r1 = new androidx.media3.b.ae
            int r2 = r10.f6934k
            r1.<init>(r2, r0, r11)
            throw r1
        L_0x01a1:
            r1.disconnect()     // Catch:{ IOException -> 0x01d4 }
            r2 = r21
            java.net.URL r7 = r10.m6637k(r2, r3, r11)     // Catch:{ IOException -> 0x01d4 }
            r1 = r17
            r5 = r19
            r8 = r22
            goto L_0x003e
        L_0x01b2:
            r17 = r3
            androidx.media3.b.ac r0 = new androidx.media3.b.ac     // Catch:{ IOException -> 0x01d4 }
            java.net.NoRouteToHostException r1 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x01d4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d4 }
            r2.<init>()     // Catch:{ IOException -> 0x01d4 }
            java.lang.String r3 = "Too many redirects: "
            r2.append(r3)     // Catch:{ IOException -> 0x01d4 }
            r3 = r17
            r2.append(r3)     // Catch:{ IOException -> 0x01d4 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01d4 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01d4 }
            r2 = 2001(0x7d1, float:2.804E-42)
            r0.<init>((java.io.IOException) r1, (androidx.media3.p132b.C2510n) r11, (int) r2, (int) r14)     // Catch:{ IOException -> 0x01d4 }
            throw r0     // Catch:{ IOException -> 0x01d4 }
        L_0x01d4:
            r0 = move-exception
            r24.m6638l()
            androidx.media3.b.ac r0 = androidx.media3.p132b.C2484ac.m6549a(r0, r11, r14)
            goto L_0x01de
        L_0x01dd:
            throw r0
        L_0x01de:
            goto L_0x01dd
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p132b.C2518v.mo5880b(androidx.media3.b.n):long");
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        HttpURLConnection httpURLConnection = this.f6931h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: d */
    public final void mo5882d() {
        try {
            InputStream inputStream = this.f6932i;
            if (inputStream != null) {
                if (this.f6931h != null) {
                    int i = C2612ak.f7249a;
                }
                inputStream.close();
            }
            this.f6932i = null;
            m6638l();
            if (this.f6933j) {
                this.f6933j = false;
                mo5928h();
            }
        } catch (IOException e) {
            C2510n nVar = this.f6930g;
            int i2 = C2612ak.f7249a;
            throw new C2484ac(e, nVar, (int) SimpleSnackbar.LENGTH_SHORT, 3);
        } catch (Throwable th) {
            this.f6932i = null;
            m6638l();
            if (this.f6933j) {
                this.f6933j = false;
                mo5928h();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final Map mo5883e() {
        HttpURLConnection httpURLConnection = this.f6931h;
        return httpURLConnection == null ? C58729pv.f156485a : new C2517u(httpURLConnection.getHeaderFields());
    }

    public C2518v(String str, int i, int i2, boolean z, C2487af afVar) {
        super(true);
        this.f6927d = str;
        this.f6925b = i;
        this.f6926c = i2;
        this.f6924a = z;
        this.f6928e = afVar;
        this.f6929f = new C2487af();
    }
}
