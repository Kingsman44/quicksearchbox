package com.google.android.libraries.componentview.services.application;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.componentview.services.application.w */
/* compiled from: PG */
final class C20632w implements Callable {

    /* renamed from: a */
    final /* synthetic */ Uri f57868a;

    /* renamed from: b */
    final /* synthetic */ Map f57869b;

    /* renamed from: c */
    final /* synthetic */ boolean f57870c;

    /* renamed from: d */
    final /* synthetic */ C20634y f57871d;

    public C20632w(C20634y yVar, Uri uri, Map map, boolean z) {
        this.f57871d = yVar;
        this.f57868a = uri;
        this.f57869b = map;
        this.f57870c = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r12 = this;
            java.lang.String r0 = "file:///"
            com.google.android.libraries.componentview.services.application.y r1 = r12.f57871d
            android.net.Uri r2 = r12.f57868a
            java.util.Map r3 = r12.f57869b
            boolean r4 = r12.f57870c
            java.net.URI r5 = new java.net.URI
            java.lang.String r2 = r2.toString()
            r5.<init>(r2)
            r2 = 0
            com.google.android.libraries.componentview.services.application.be r6 = new com.google.android.libraries.componentview.services.application.be     // Catch:{ all -> 0x0154 }
            r6.<init>()     // Catch:{ all -> 0x0154 }
            java.lang.String r7 = r5.toString()     // Catch:{ all -> 0x0154 }
            java.lang.String r8 = "file:/"
            boolean r8 = r7.startsWith(r8)     // Catch:{ all -> 0x0154 }
            if (r8 == 0) goto L_0x0040
            java.lang.String r8 = "file://"
            boolean r8 = r7.startsWith(r8)     // Catch:{ all -> 0x0154 }
            if (r8 != 0) goto L_0x0040
            boolean r8 = r7.startsWith(r0)     // Catch:{ all -> 0x0154 }
            if (r8 != 0) goto L_0x0040
            r8 = 6
            java.lang.String r7 = r7.substring(r8)     // Catch:{ all -> 0x0154 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0154 }
            java.lang.String r7 = r0.concat(r7)     // Catch:{ all -> 0x0154 }
        L_0x0040:
            java.lang.String r0 = "file:///android_asset/"
            boolean r0 = r7.startsWith(r0)     // Catch:{ all -> 0x0154 }
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L_0x005e
            r0 = 22
            java.lang.String r0 = r7.substring(r0)     // Catch:{ all -> 0x0154 }
            android.content.Context r1 = r1.f57874c     // Catch:{ all -> 0x0154 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ all -> 0x0154 }
            java.io.InputStream r0 = r1.open(r0)     // Catch:{ all -> 0x0154 }
            r5 = r2
            r2 = r0
            goto L_0x0140
        L_0x005e:
            java.net.URL r0 = r5.toURL()     // Catch:{ all -> 0x0154 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x0154 }
            r1 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r1)     // Catch:{ all -> 0x0154 }
            r0.setReadTimeout(r1)     // Catch:{ all -> 0x0154 }
            java.lang.String r1 = "User-Agent"
            java.lang.String r5 = "Mozilla/5.0 (Linux; Android 5.0; Nexus 5 Build/LRX21N) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/37.0.0.0 Mobile Safari/537.36 GSA/4.1.3.1531624.arm,gzip(gfe)"
            r0.setRequestProperty(r1, r5)     // Catch:{ all -> 0x0154 }
            if (r3 == 0) goto L_0x009f
            java.util.Set r1 = r3.entrySet()     // Catch:{ all -> 0x0154 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0154 }
        L_0x007f:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0154 }
            if (r3 == 0) goto L_0x009f
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0154 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0154 }
            java.lang.Object r5 = r3.getKey()     // Catch:{ all -> 0x0154 }
            com.google.android.libraries.componentview.services.application.bd r5 = (com.google.android.libraries.componentview.services.application.C20577bd) r5     // Catch:{ all -> 0x0154 }
            java.lang.String r5 = r5.mo25515a()     // Catch:{ all -> 0x0154 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0154 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0154 }
            r0.setRequestProperty(r5, r3)     // Catch:{ all -> 0x0154 }
            goto L_0x007f
        L_0x009f:
            boolean r1 = r0 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x0154 }
            if (r1 == 0) goto L_0x00ab
            r1 = r0
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x0154 }
            r1.setInstanceFollowRedirects(r4)     // Catch:{ all -> 0x0154 }
            r3 = 1
            goto L_0x00ad
        L_0x00ab:
            r1 = r2
            r3 = 0
        L_0x00ad:
            java.io.InputStream r4 = r0.getInputStream()     // Catch:{ all -> 0x0154 }
            java.nio.charset.Charset r5 = com.google.android.libraries.componentview.services.application.C20634y.f57872a     // Catch:{ all -> 0x0156 }
            java.lang.String r7 = r0.getContentType()     // Catch:{ all -> 0x0156 }
            if (r7 == 0) goto L_0x00d0
            java.lang.String r10 = "charset="
            int r10 = r7.indexOf(r10)     // Catch:{ all -> 0x0156 }
            r11 = -1
            if (r10 == r11) goto L_0x00d0
            int r10 = r10 + 8
            java.lang.String r5 = r7.substring(r10)     // Catch:{ all -> 0x0156 }
            java.lang.String r5 = r5.trim()     // Catch:{ all -> 0x0156 }
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch:{ all -> 0x0156 }
        L_0x00d0:
            if (r3 == 0) goto L_0x013f
            if (r1 == 0) goto L_0x013f
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ all -> 0x0156 }
            int r0 = r0.getResponseCode()     // Catch:{ all -> 0x0156 }
            r6.f57760d = r0     // Catch:{ all -> 0x0156 }
            java.util.Map r0 = r1.getHeaderFields()     // Catch:{ all -> 0x0156 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0156 }
            r1.<init>()     // Catch:{ all -> 0x0156 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0156 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0156 }
        L_0x00ed:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0156 }
            if (r3 == 0) goto L_0x011d
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0156 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0156 }
            java.lang.Object r7 = r3.getKey()     // Catch:{ all -> 0x0156 }
            if (r7 != 0) goto L_0x0109
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0156 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0156 }
            r1.put(r2, r3)     // Catch:{ all -> 0x0156 }
            goto L_0x00ed
        L_0x0109:
            java.lang.Object r7 = r3.getKey()     // Catch:{ all -> 0x0156 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0156 }
            com.google.android.libraries.componentview.services.application.bd r7 = com.google.android.libraries.componentview.services.application.C20577bd.m38612b(r7)     // Catch:{ all -> 0x0156 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0156 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0156 }
            r1.put(r7, r3)     // Catch:{ all -> 0x0156 }
            goto L_0x00ed
        L_0x011d:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)     // Catch:{ all -> 0x0156 }
            r6.f57761e = r0     // Catch:{ all -> 0x0156 }
            java.util.Map r0 = r6.f57761e     // Catch:{ all -> 0x0156 }
            com.google.android.libraries.componentview.services.application.bd r1 = com.google.android.libraries.componentview.services.application.C20634y.f57873b     // Catch:{ all -> 0x0156 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0156 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x013d
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0156 }
            if (r1 == 0) goto L_0x0136
            goto L_0x013d
        L_0x0136:
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0156 }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0156 }
        L_0x013d:
            r6.f57762f = r2     // Catch:{ all -> 0x0156 }
        L_0x013f:
            r2 = r4
        L_0x0140:
            byte[] r0 = com.google.common.p4541l.C59332o.m92213d(r2)     // Catch:{ all -> 0x0154 }
            r6.f57758b = r0     // Catch:{ all -> 0x0154 }
            r6.f57757a = r5     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r8 = 0
        L_0x014c:
            r6.f57759c = r8     // Catch:{ all -> 0x0154 }
            if (r2 == 0) goto L_0x0153
            r2.close()
        L_0x0153:
            return r6
        L_0x0154:
            r0 = move-exception
            goto L_0x0158
        L_0x0156:
            r0 = move-exception
            r2 = r4
        L_0x0158:
            if (r2 == 0) goto L_0x015d
            r2.close()
        L_0x015d:
            goto L_0x015f
        L_0x015e:
            throw r0
        L_0x015f:
            goto L_0x015e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.services.application.C20632w.call():java.lang.Object");
    }
}
