package com.bumptech.glide.p282c.p284b;

import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.p297b.C5750ab;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.bumptech.glide.c.b.g */
/* compiled from: PG */
final class C5535g extends UrlRequest.Callback {

    /* renamed from: a */
    public final List f16762a = new ArrayList(2);

    /* renamed from: b */
    public C5750ab f16763b;

    /* renamed from: c */
    public C5997p f16764c;

    /* renamed from: d */
    public long f16765d;

    /* renamed from: e */
    public UrlRequest f16766e;

    /* renamed from: f */
    public volatile boolean f16767f;

    /* renamed from: g */
    public C5529a f16768g;

    /* renamed from: h */
    final /* synthetic */ C5538j f16769h;

    public C5535g(C5538j jVar) {
        this.f16769h = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r8.getHttpStatusCode() == 200) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r9 = new com.bumptech.glide.load.C5919d("Http request failed", r8.getHttpStatusCode(), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r9 == null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11912a(org.chromium.net.UrlResponseInfo r8, org.chromium.net.CronetException r9, boolean r10, java.nio.ByteBuffer r11) {
        /*
            r7 = this;
            com.bumptech.glide.c.b.j r0 = r7.f16769h
            monitor-enter(r0)
            com.bumptech.glide.c.b.j r1 = r7.f16769h     // Catch:{ all -> 0x00f6 }
            java.util.Map r1 = r1.f16776d     // Catch:{ all -> 0x00f6 }
            com.bumptech.glide.load.b.ab r2 = r7.f16763b     // Catch:{ all -> 0x00f6 }
            r1.remove(r2)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f6 }
            r0 = 0
            if (r10 == 0) goto L_0x0012
        L_0x0010:
            r9 = r0
            goto L_0x0028
        L_0x0012:
            if (r9 == 0) goto L_0x0015
            goto L_0x0028
        L_0x0015:
            int r9 = r8.getHttpStatusCode()
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 == r1) goto L_0x0010
            com.bumptech.glide.load.d r9 = new com.bumptech.glide.load.d
            java.lang.String r1 = "Http request failed"
            int r8 = r8.getHttpStatusCode()
            r9.<init>(r1, r8, r0)
        L_0x0028:
            r8 = 0
            if (r9 != 0) goto L_0x002f
            if (r10 != 0) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            java.lang.System.currentTimeMillis()
            if (r1 == 0) goto L_0x00a2
            java.lang.String r9 = "ChromiumSerializer"
            r10 = 2
            boolean r9 = android.util.Log.isLoggable(r9, r10)
            if (r9 == 0) goto L_0x0079
            com.bumptech.glide.load.b.ab r9 = r7.f16763b
            java.lang.String r9 = java.lang.String.valueOf(r9)
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r7.f16765d
            int r10 = r11.limit()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Successfully completed request, url: "
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r9 = ", duration: "
            r5.append(r9)
            long r1 = r1 - r3
            r5.append(r1)
            java.lang.String r9 = ", file size: "
            r5.append(r9)
            int r10 = r10 / 1024
            r5.append(r10)
            java.lang.String r9 = "kb"
            r5.append(r9)
            java.lang.String r9 = "ChromiumSerializer"
            java.lang.String r10 = r5.toString()
            android.util.Log.v(r9, r10)
        L_0x0079:
            java.util.List r9 = r7.f16762a
            int r9 = r9.size()
            r10 = 0
        L_0x0080:
            if (r10 >= r9) goto L_0x00cd
            java.util.List r1 = r7.f16762a
            java.lang.Object r1 = r1.get(r10)
            com.bumptech.glide.c.b.k r1 = (com.bumptech.glide.p282c.p284b.C5539k) r1
            com.bumptech.glide.load.data.d r2 = r1.f16779b
            com.bumptech.glide.c.b.b r1 = r1.f16778a
            java.lang.Object r1 = r1.mo11908b(r11)
            r2.mo12183f(r1)
            java.nio.ByteBuffer r11 = r11.asReadOnlyBuffer()
            java.nio.Buffer r11 = r11.position(r8)
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11
            int r10 = r10 + 1
            goto L_0x0080
        L_0x00a2:
            java.lang.String r11 = "ChromiumSerializer"
            r1 = 6
            boolean r11 = android.util.Log.isLoggable(r11, r1)
            if (r11 == 0) goto L_0x00b4
            if (r10 != 0) goto L_0x00b4
            java.lang.String r10 = "ChromiumSerializer"
            java.lang.String r11 = "Request failed"
            android.util.Log.e(r10, r11, r9)
        L_0x00b4:
            java.util.List r10 = r7.f16762a
            int r10 = r10.size()
            r11 = 0
        L_0x00bb:
            if (r11 >= r10) goto L_0x00cd
            java.util.List r1 = r7.f16762a
            java.lang.Object r1 = r1.get(r11)
            com.bumptech.glide.c.b.k r1 = (com.bumptech.glide.p282c.p284b.C5539k) r1
            com.bumptech.glide.load.data.d r1 = r1.f16779b
            r1.mo12184g(r9)
            int r11 = r11 + 1
            goto L_0x00bb
        L_0x00cd:
            r7.f16768g = r0
            com.bumptech.glide.c.b.j r9 = r7.f16769h
            com.bumptech.glide.c.b.h r10 = r9.f16775c
            monitor-enter(r9)
            java.util.List r11 = r7.f16762a     // Catch:{ all -> 0x00f3 }
            r11.clear()     // Catch:{ all -> 0x00f3 }
            r7.f16766e = r0     // Catch:{ all -> 0x00f3 }
            r7.f16767f = r8     // Catch:{ all -> 0x00f3 }
            monitor-exit(r9)     // Catch:{ all -> 0x00f3 }
            monitor-enter(r10)
            java.util.ArrayDeque r8 = r10.f16770a     // Catch:{ all -> 0x00f0 }
            int r8 = r8.size()     // Catch:{ all -> 0x00f0 }
            r9 = 50
            if (r8 >= r9) goto L_0x00ee
            java.util.ArrayDeque r8 = r10.f16770a     // Catch:{ all -> 0x00f0 }
            r8.offer(r7)     // Catch:{ all -> 0x00f0 }
        L_0x00ee:
            monitor-exit(r10)     // Catch:{ all -> 0x00f0 }
            return
        L_0x00f0:
            r8 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00f0 }
            throw r8
        L_0x00f3:
            r8 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00f3 }
            throw r8
        L_0x00f6:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f6 }
            goto L_0x00fa
        L_0x00f9:
            throw r8
        L_0x00fa:
            goto L_0x00f9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p282c.p284b.C5535g.mo11912a(org.chromium.net.UrlResponseInfo, org.chromium.net.CronetException, boolean, java.nio.ByteBuffer):void");
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ((Executor) C5538j.f16774b.mo6453a()).execute(new C5534f(this, this.f16764c, urlResponseInfo));
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        ((Executor) C5538j.f16774b.mo6453a()).execute(new C5533e(this, this.f16764c, urlResponseInfo, cronetException));
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        UrlRequest urlRequest2 = this.f16766e;
        C5529a aVar = this.f16768g;
        ArrayDeque arrayDeque = aVar.f16753a;
        if (arrayDeque != null) {
            if (byteBuffer != arrayDeque.peekLast()) {
                aVar.f16753a.addLast(byteBuffer);
            }
            if (!byteBuffer.hasRemaining()) {
                byteBuffer = ByteBuffer.allocateDirect(8096);
            }
            urlRequest2.read(byteBuffer);
            return;
        }
        throw new RuntimeException(aVar.f16754b);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        long j;
        System.currentTimeMillis();
        this.f16768g = new C5529a();
        Map allHeaders = urlResponseInfo.getAllHeaders();
        if (allHeaders.containsKey("content-length")) {
            long parseLong = Long.parseLong((String) ((List) allHeaders.get("content-length")).get(0));
            j = (!allHeaders.containsKey("content-encoding") || (((List) allHeaders.get("content-encoding")).size() == 1 && "identity".equals(((List) allHeaders.get("content-encoding")).get(0)))) ? parseLong + parseLong : parseLong + 1;
        } else {
            j = 8192;
        }
        urlRequest.read(ByteBuffer.allocateDirect((int) Math.min(j, 524288)));
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ((Executor) C5538j.f16774b.mo6453a()).execute(new C5532d(this, this.f16764c, urlResponseInfo));
    }
}
