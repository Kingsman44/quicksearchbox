package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6742bh;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anp */
/* compiled from: PG */
final class anp {

    /* renamed from: a */
    private final ano f21047a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ani f21048b;

    /* renamed from: c */
    private final ats f21049c;

    public anp(ani ani) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ann ann = new ann((byte[]) null);
        this.f21049c = atv.m19609a(newCachedThreadPool);
        this.f21047a = ann;
        this.f21048b = ani;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ com.google.ads.interactivemedia.p367v3.impl.data.C6743bi m19072c(com.google.ads.interactivemedia.p367v3.impl.data.C6742bh r8) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x007e, all -> 0x007c }
            java.lang.String r2 = r8.url()     // Catch:{ Exception -> 0x007e, all -> 0x007c }
            r1.<init>(r2)     // Catch:{ Exception -> 0x007e, all -> 0x007c }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x007e, all -> 0x007c }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x007e, all -> 0x007c }
            java.lang.String r0 = "User-Agent"
            java.lang.String r2 = r8.userAgent()     // Catch:{ Exception -> 0x007a }
            r1.setRequestProperty(r0, r2)     // Catch:{ Exception -> 0x007a }
            int r0 = r8.connectionTimeoutMs()     // Catch:{ Exception -> 0x007a }
            r1.setConnectTimeout(r0)     // Catch:{ Exception -> 0x007a }
            int r0 = r8.readTimeoutMs()     // Catch:{ Exception -> 0x007a }
            r1.setReadTimeout(r0)     // Catch:{ Exception -> 0x007a }
            com.google.ads.interactivemedia.v3.impl.data.bg r0 = r8.requestType()     // Catch:{ Exception -> 0x007a }
            com.google.ads.interactivemedia.v3.impl.data.bg r2 = com.google.ads.interactivemedia.p367v3.impl.data.C6741bg.POST     // Catch:{ Exception -> 0x007a }
            if (r0 != r2) goto L_0x0037
            r0 = 1
            r1.setDoOutput(r0)     // Catch:{ Exception -> 0x007a }
            r0 = 0
            r1.setChunkedStreamingMode(r0)     // Catch:{ Exception -> 0x007a }
        L_0x0037:
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ Exception -> 0x007a }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x006e }
            r2.<init>(r0)     // Catch:{ all -> 0x006e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r3.<init>()     // Catch:{ all -> 0x006e }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x006e }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x006e }
            java.nio.charset.Charset r6 = p3186j$.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x006e }
            r5.<init>(r2, r6)     // Catch:{ all -> 0x006e }
            r4.<init>(r5)     // Catch:{ all -> 0x006e }
        L_0x0051:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x005b
            r3.append(r2)     // Catch:{ all -> 0x006e }
            goto L_0x0051
        L_0x005b:
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0064
            r0.close()     // Catch:{ Exception -> 0x007a }
        L_0x0064:
            java.lang.String r0 = r1.getContentType()     // Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x008f
            r1.disconnect()
            goto L_0x008f
        L_0x006e:
            r2 = move-exception
            if (r0 == 0) goto L_0x0079
            r0.close()     // Catch:{ all -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r0 = move-exception
            com.google.ads.interactivemedia.p367v3.internal.auf.m19649a(r2, r0)     // Catch:{ Exception -> 0x007a }
        L_0x0079:
            throw r2     // Catch:{ Exception -> 0x007a }
        L_0x007a:
            r0 = move-exception
            goto L_0x0082
        L_0x007c:
            r8 = move-exception
            goto L_0x009a
        L_0x007e:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x0082:
            java.lang.String r2 = "Failed to make native network request"
            com.google.ads.interactivemedia.p367v3.internal.C7458yy.m22582e(r2, r0)     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x008c
            r1.disconnect()
        L_0x008c:
            java.lang.String r2 = ""
            r0 = r2
        L_0x008f:
            java.lang.String r8 = r8.mo14021id()
            com.google.ads.interactivemedia.v3.impl.data.bi r8 = com.google.ads.interactivemedia.p367v3.impl.data.C6743bi.create(r8, r2, r0)
            return r8
        L_0x0098:
            r8 = move-exception
            r0 = r1
        L_0x009a:
            if (r0 == 0) goto L_0x009f
            r0.disconnect()
        L_0x009f:
            goto L_0x00a1
        L_0x00a0:
            throw r8
        L_0x00a1:
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.anp.m19072c(com.google.ads.interactivemedia.v3.impl.data.bh):com.google.ads.interactivemedia.v3.impl.data.bi");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15034a(amw amw, String str, C6742bh bhVar) {
        amw amw2 = amw.activate;
        if (amw.ordinal() != 34) {
            String valueOf = String.valueOf(amw);
            String.valueOf(valueOf).length();
            C7458yy.m22580c("Unexpected network request of type".concat(String.valueOf(valueOf)));
            return;
        }
        atv.m19610b(this.f21049c.mo15403a(new anl(this, bhVar)), new anm(this, str), this.f21049c);
    }
}
