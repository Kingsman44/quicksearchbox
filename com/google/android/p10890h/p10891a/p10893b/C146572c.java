package com.google.android.p10890h.p10891a.p10893b;

/* renamed from: com.google.android.h.a.b.c */
/* compiled from: PG */
final class C146572c implements C146575f {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo95061a(android.net.Uri r3, java.util.Map r4) {
        /*
            r2 = this;
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x0058 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0058 }
            r0.<init>(r3)     // Catch:{ all -> 0x0058 }
            java.net.URLConnection r3 = r0.openConnection()     // Catch:{ all -> 0x0058 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ all -> 0x0058 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x0056 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0056 }
        L_0x0017:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0056 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0056 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0056 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0056 }
            r3.setRequestProperty(r1, r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0017
        L_0x0033:
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ all -> 0x0056 }
            r3.setReadTimeout(r4)     // Catch:{ all -> 0x0056 }
            r4 = 1
            r3.setInstanceFollowRedirects(r4)     // Catch:{ all -> 0x0056 }
            r4 = 0
            r3.setUseCaches(r4)     // Catch:{ all -> 0x0056 }
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)     // Catch:{ all -> 0x0056 }
            r3.connect()     // Catch:{ all -> 0x0056 }
            int r4 = r3.getResponseCode()     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x0055
            r3.disconnect()
        L_0x0055:
            return r4
        L_0x0056:
            r4 = move-exception
            goto L_0x005b
        L_0x0058:
            r3 = move-exception
            r4 = r3
            r3 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x0060
            r3.disconnect()
        L_0x0060:
            goto L_0x0062
        L_0x0061:
            throw r4
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.p10890h.p10891a.p10893b.C146572c.mo95061a(android.net.Uri, java.util.Map):int");
    }
}
