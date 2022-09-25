package com.android.p275j;

import android.os.Process;
import com.android.p275j.p276a.C5172b;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.j.l */
/* compiled from: PG */
public final class C5200l extends Thread {

    /* renamed from: a */
    public volatile boolean f16500a = false;

    /* renamed from: b */
    private final BlockingQueue f16501b;

    /* renamed from: c */
    private final C5191c f16502c;

    /* renamed from: d */
    private final C5198j f16503d;

    /* renamed from: e */
    private final C5172b f16504e;

    public C5200l(BlockingQueue blockingQueue, C5172b bVar, C5191c cVar, C5198j jVar) {
        this.f16501b = blockingQueue;
        this.f16504e = bVar;
        this.f16502c = cVar;
        this.f16503d = jVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: com.android.j.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.android.j.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: com.android.j.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: com.android.j.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: com.android.j.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: com.android.j.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: com.android.j.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: com.android.j.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: com.android.j.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: byte[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0425, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0426, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        com.android.p275j.C5188ab.m14149d(r3, "Unhandled exception %s", r3.toString());
        r4 = new com.android.p275j.C5213y((java.lang.Throwable) r3);
        android.os.SystemClock.elapsedRealtime();
        r1.f16503d.mo10285a(r2, r4);
        r2.mo10297g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0445, code lost:
        r2.mo10300j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0448, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x033a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0362 A[Catch:{ y -> 0x03f2, Exception -> 0x0425, all -> 0x0336, all -> 0x032b, all -> 0x02ae, y -> 0x0449, Exception -> 0x0425, all -> 0x0422 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x036a A[Catch:{ y -> 0x03f2, Exception -> 0x0425, all -> 0x0336, all -> 0x032b, all -> 0x02ae, y -> 0x0449, Exception -> 0x0425, all -> 0x0422 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03f1 A[EDGE_INSN: B:246:0x03f1->B:247:? ?: BREAK  , SYNTHETIC, Splitter:B:246:0x03f1] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0425 A[ExcHandler: Exception (r0v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x027a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14162a() {
        /*
            r23 = this;
            r1 = r23
            java.util.concurrent.BlockingQueue r2 = r1.f16501b
            java.lang.Object r2 = r2.take()
            com.android.j.r r2 = (com.android.p275j.C5206r) r2
            android.os.SystemClock.elapsedRealtime()
            r2.mo10300j()
            r3 = 1
            r4 = 0
            java.lang.String r5 = "network-queue-take"
            r2.mo10293c(r5)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            boolean r5 = r2.mo10298h()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            if (r5 == 0) goto L_0x0029
            java.lang.String r5 = "network-discard-cancelled"
            r2.mo10295e(r5)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r2.mo10297g()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r2.mo10300j()
            return
        L_0x0029:
            int r5 = r2.f16515c     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            android.net.TrafficStats.setThreadStatsTag(r5)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            com.android.j.a.b r5 = r1.f16504e     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x0034:
            java.util.Collections.emptyList()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r9 = 0
            com.android.j.b r10 = r2.f16522j     // Catch:{ IOException -> 0x035b }
            if (r10 != 0) goto L_0x0041
            java.util.Map r10 = java.util.Collections.emptyMap()     // Catch:{ IOException -> 0x035b }
            goto L_0x006c
        L_0x0041:
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ IOException -> 0x035b }
            r11.<init>()     // Catch:{ IOException -> 0x035b }
            java.lang.String r12 = r10.f16475b     // Catch:{ IOException -> 0x035b }
            if (r12 == 0) goto L_0x004f
            java.lang.String r13 = "If-None-Match"
            r11.put(r13, r12)     // Catch:{ IOException -> 0x035b }
        L_0x004f:
            long r12 = r10.f16477d     // Catch:{ IOException -> 0x035b }
            r14 = 0
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x006b
            java.lang.String r10 = "If-Modified-Since"
            java.lang.String r14 = "EEE, dd MMM yyyy HH:mm:ss 'GMT'"
            java.text.SimpleDateFormat r14 = com.android.p275j.p276a.C5178h.m14137b(r14)     // Catch:{ IOException -> 0x035b }
            java.util.Date r15 = new java.util.Date     // Catch:{ IOException -> 0x035b }
            r15.<init>(r12)     // Catch:{ IOException -> 0x035b }
            java.lang.String r12 = r14.format(r15)     // Catch:{ IOException -> 0x035b }
            r11.put(r10, r12)     // Catch:{ IOException -> 0x035b }
        L_0x006b:
            r10 = r11
        L_0x006c:
            com.android.j.a.a r11 = r5.f16435a     // Catch:{ IOException -> 0x035b }
            java.lang.String r11 = r2.f16514b     // Catch:{ IOException -> 0x035b }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ IOException -> 0x035b }
            r12.<init>()     // Catch:{ IOException -> 0x035b }
            r12.putAll(r10)     // Catch:{ IOException -> 0x035b }
            java.util.Map r10 = r2.mo10292b()     // Catch:{ IOException -> 0x035b }
            r12.putAll(r10)     // Catch:{ IOException -> 0x035b }
            java.net.URL r10 = new java.net.URL     // Catch:{ IOException -> 0x035b }
            r10.<init>(r11)     // Catch:{ IOException -> 0x035b }
            java.net.URLConnection r11 = r10.openConnection()     // Catch:{ IOException -> 0x035b }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ IOException -> 0x035b }
            boolean r13 = java.net.HttpURLConnection.getFollowRedirects()     // Catch:{ IOException -> 0x035b }
            r11.setInstanceFollowRedirects(r13)     // Catch:{ IOException -> 0x035b }
            com.android.j.g r13 = r2.f16524l     // Catch:{ IOException -> 0x035b }
            int r13 = r13.f16491a     // Catch:{ IOException -> 0x035b }
            r11.setConnectTimeout(r13)     // Catch:{ IOException -> 0x035b }
            r11.setReadTimeout(r13)     // Catch:{ IOException -> 0x035b }
            r11.setUseCaches(r4)     // Catch:{ IOException -> 0x035b }
            r11.setDoInput(r3)     // Catch:{ IOException -> 0x035b }
            java.lang.String r13 = "https"
            java.lang.String r10 = r10.getProtocol()     // Catch:{ IOException -> 0x035b }
            r13.equals(r10)     // Catch:{ IOException -> 0x035b }
            java.util.Set r10 = r12.keySet()     // Catch:{ all -> 0x0352 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0352 }
        L_0x00b2:
            boolean r13 = r10.hasNext()     // Catch:{ all -> 0x0352 }
            if (r13 == 0) goto L_0x00c8
            java.lang.Object r13 = r10.next()     // Catch:{ all -> 0x0352 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0352 }
            java.lang.Object r14 = r12.get(r13)     // Catch:{ all -> 0x0352 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0352 }
            r11.setRequestProperty(r13, r14)     // Catch:{ all -> 0x0352 }
            goto L_0x00b2
        L_0x00c8:
            java.lang.String r10 = "GET"
            r11.setRequestMethod(r10)     // Catch:{ all -> 0x0352 }
            int r10 = r11.getResponseCode()     // Catch:{ all -> 0x0352 }
            r12 = -1
            if (r10 == r12) goto L_0x034a
            r13 = 100
            r14 = 304(0x130, float:4.26E-43)
            r15 = 200(0xc8, float:2.8E-43)
            if (r10 < r13) goto L_0x00de
            if (r10 < r15) goto L_0x0100
        L_0x00de:
            r13 = 204(0xcc, float:2.86E-43)
            if (r10 == r13) goto L_0x0100
            if (r10 == r14) goto L_0x0100
            com.android.j.a.i r13 = new com.android.j.a.i     // Catch:{ all -> 0x00fb }
            java.util.Map r16 = r11.getHeaderFields()     // Catch:{ all -> 0x00fb }
            java.util.List r15 = com.android.p275j.p276a.C5181k.m14138a(r16)     // Catch:{ all -> 0x00fb }
            int r8 = r11.getContentLength()     // Catch:{ all -> 0x00fb }
            com.android.j.a.j r3 = new com.android.j.a.j     // Catch:{ all -> 0x00fb }
            r3.<init>(r11)     // Catch:{ all -> 0x00fb }
            r13.<init>(r10, r15, r8, r3)     // Catch:{ all -> 0x00fb }
            goto L_0x0110
        L_0x00fb:
            r0 = move-exception
            r3 = r0
            r8 = 1
            goto L_0x0355
        L_0x0100:
            com.android.j.a.i r13 = new com.android.j.a.i     // Catch:{ all -> 0x0352 }
            java.util.Map r3 = r11.getHeaderFields()     // Catch:{ all -> 0x0352 }
            java.util.List r3 = com.android.p275j.p276a.C5181k.m14138a(r3)     // Catch:{ all -> 0x0352 }
            r13.<init>(r10, r3, r12, r9)     // Catch:{ all -> 0x0352 }
            r11.disconnect()     // Catch:{ IOException -> 0x035b }
        L_0x0110:
            int r3 = r13.f16454a     // Catch:{ IOException -> 0x0345 }
            java.util.List r8 = r13.f16455b     // Catch:{ IOException -> 0x0345 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ IOException -> 0x0345 }
            if (r3 != r14) goto L_0x01db
            android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0345 }
            com.android.j.b r3 = r2.f16522j     // Catch:{ IOException -> 0x0345 }
            if (r3 != 0) goto L_0x0136
            com.android.j.n r3 = new com.android.j.n     // Catch:{ IOException -> 0x0345 }
            r18 = 304(0x130, float:4.26E-43)
            r19 = 0
            java.util.Map r20 = com.android.p275j.C5202n.m14163a(r8)     // Catch:{ IOException -> 0x0345 }
            r22 = 1
            r17 = r3
            r21 = r8
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ IOException -> 0x0345 }
            goto L_0x0291
        L_0x0136:
            java.util.TreeSet r10 = new java.util.TreeSet     // Catch:{ IOException -> 0x0345 }
            java.util.Comparator r11 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ IOException -> 0x0345 }
            r10.<init>(r11)     // Catch:{ IOException -> 0x0345 }
            boolean r11 = r8.isEmpty()     // Catch:{ IOException -> 0x0345 }
            if (r11 != 0) goto L_0x0159
            java.util.Iterator r11 = r8.iterator()     // Catch:{ IOException -> 0x0345 }
        L_0x0147:
            boolean r12 = r11.hasNext()     // Catch:{ IOException -> 0x0345 }
            if (r12 == 0) goto L_0x0159
            java.lang.Object r12 = r11.next()     // Catch:{ IOException -> 0x0345 }
            com.android.j.k r12 = (com.android.p275j.C5199k) r12     // Catch:{ IOException -> 0x0345 }
            java.lang.String r12 = r12.f16498a     // Catch:{ IOException -> 0x0345 }
            r10.add(r12)     // Catch:{ IOException -> 0x0345 }
            goto L_0x0147
        L_0x0159:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ IOException -> 0x0345 }
            r11.<init>(r8)     // Catch:{ IOException -> 0x0345 }
            java.util.List r8 = r3.f16481h     // Catch:{ IOException -> 0x0345 }
            if (r8 == 0) goto L_0x0186
            boolean r8 = r8.isEmpty()     // Catch:{ IOException -> 0x0345 }
            if (r8 != 0) goto L_0x01c3
            java.util.List r8 = r3.f16481h     // Catch:{ IOException -> 0x0345 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x0345 }
        L_0x016e:
            boolean r12 = r8.hasNext()     // Catch:{ IOException -> 0x0345 }
            if (r12 == 0) goto L_0x01c3
            java.lang.Object r12 = r8.next()     // Catch:{ IOException -> 0x0345 }
            com.android.j.k r12 = (com.android.p275j.C5199k) r12     // Catch:{ IOException -> 0x0345 }
            java.lang.String r14 = r12.f16498a     // Catch:{ IOException -> 0x0345 }
            boolean r14 = r10.contains(r14)     // Catch:{ IOException -> 0x0345 }
            if (r14 != 0) goto L_0x016e
            r11.add(r12)     // Catch:{ IOException -> 0x0345 }
            goto L_0x016e
        L_0x0186:
            java.util.Map r8 = r3.f16480g     // Catch:{ IOException -> 0x0345 }
            boolean r8 = r8.isEmpty()     // Catch:{ IOException -> 0x0345 }
            if (r8 != 0) goto L_0x01c3
            java.util.Map r8 = r3.f16480g     // Catch:{ IOException -> 0x0345 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ IOException -> 0x0345 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x0345 }
        L_0x0198:
            boolean r12 = r8.hasNext()     // Catch:{ IOException -> 0x0345 }
            if (r12 == 0) goto L_0x01c3
            java.lang.Object r12 = r8.next()     // Catch:{ IOException -> 0x0345 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ IOException -> 0x0345 }
            java.lang.Object r14 = r12.getKey()     // Catch:{ IOException -> 0x0345 }
            boolean r14 = r10.contains(r14)     // Catch:{ IOException -> 0x0345 }
            if (r14 != 0) goto L_0x0198
            com.android.j.k r14 = new com.android.j.k     // Catch:{ IOException -> 0x0345 }
            java.lang.Object r15 = r12.getKey()     // Catch:{ IOException -> 0x0345 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x0345 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ IOException -> 0x0345 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x0345 }
            r14.<init>(r15, r12)     // Catch:{ IOException -> 0x0345 }
            r11.add(r14)     // Catch:{ IOException -> 0x0345 }
            goto L_0x0198
        L_0x01c3:
            com.android.j.n r8 = new com.android.j.n     // Catch:{ IOException -> 0x0345 }
            r18 = 304(0x130, float:4.26E-43)
            byte[] r3 = r3.f16474a     // Catch:{ IOException -> 0x0345 }
            java.util.Map r20 = com.android.p275j.C5202n.m14163a(r11)     // Catch:{ IOException -> 0x0345 }
            r22 = 1
            r17 = r8
            r19 = r3
            r21 = r11
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ IOException -> 0x0345 }
            r3 = r8
            goto L_0x0291
        L_0x01db:
            java.io.InputStream r10 = r13.f16457d     // Catch:{ IOException -> 0x0345 }
            if (r10 != 0) goto L_0x01e0
            r10 = r9
        L_0x01e0:
            if (r10 == 0) goto L_0x022e
            int r11 = r13.f16456c     // Catch:{ IOException -> 0x0345 }
            com.android.j.a.d r14 = r5.f16436b     // Catch:{ IOException -> 0x0345 }
            com.android.j.a.n r15 = new com.android.j.a.n     // Catch:{ IOException -> 0x0345 }
            r15.<init>(r14, r11)     // Catch:{ IOException -> 0x0345 }
            r11 = 1024(0x400, float:1.435E-42)
            byte[] r11 = r14.mo10257b(r11)     // Catch:{ all -> 0x0214 }
        L_0x01f1:
            int r9 = r10.read(r11)     // Catch:{ all -> 0x0211 }
            if (r9 == r12) goto L_0x01fb
            r15.write(r11, r4, r9)     // Catch:{ all -> 0x0211 }
            goto L_0x01f1
        L_0x01fb:
            byte[] r9 = r15.toByteArray()     // Catch:{ all -> 0x0211 }
            r10.close()     // Catch:{ IOException -> 0x0203 }
            goto L_0x020a
        L_0x0203:
            java.lang.String r10 = "Error occurred when closing InputStream"
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0229 }
            com.android.p275j.C5188ab.m14150e(r10, r12)     // Catch:{ IOException -> 0x0229 }
        L_0x020a:
            r14.mo10256a(r11)     // Catch:{ IOException -> 0x0229 }
            r15.close()     // Catch:{ IOException -> 0x0229 }
            goto L_0x0230
        L_0x0211:
            r0 = move-exception
            r3 = r0
            goto L_0x0217
        L_0x0214:
            r0 = move-exception
            r3 = r0
            r11 = 0
        L_0x0217:
            r10.close()     // Catch:{ IOException -> 0x021b }
            goto L_0x0222
        L_0x021b:
            java.lang.String r8 = "Error occurred when closing InputStream"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0229 }
            com.android.p275j.C5188ab.m14150e(r8, r9)     // Catch:{ IOException -> 0x0229 }
        L_0x0222:
            r14.mo10256a(r11)     // Catch:{ IOException -> 0x0229 }
            r15.close()     // Catch:{ IOException -> 0x0229 }
            throw r3     // Catch:{ IOException -> 0x0229 }
        L_0x0229:
            r0 = move-exception
            r3 = r0
            r9 = 0
            goto L_0x0347
        L_0x022e:
            byte[] r9 = new byte[r4]     // Catch:{ IOException -> 0x0342 }
        L_0x0230:
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0340 }
            long r10 = r10 - r6
            boolean r12 = com.android.p275j.C5188ab.f16468b     // Catch:{ IOException -> 0x0340 }
            if (r12 != 0) goto L_0x0243
            r14 = 3000(0xbb8, double:1.482E-320)
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x0240
            goto L_0x0243
        L_0x0240:
            r10 = 200(0xc8, float:2.8E-43)
            goto L_0x0274
        L_0x0243:
            java.lang.String r12 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            r14 = 5
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ IOException -> 0x0340 }
            r14[r4] = r2     // Catch:{ IOException -> 0x0340 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0340 }
            r11 = 1
            r14[r11] = r10     // Catch:{ IOException -> 0x0340 }
            if (r9 == 0) goto L_0x0259
            int r10 = r9.length     // Catch:{ IOException -> 0x0340 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x0340 }
            goto L_0x025b
        L_0x0259:
            java.lang.String r10 = "null"
        L_0x025b:
            r11 = 2
            r14[r11] = r10     // Catch:{ IOException -> 0x0340 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0340 }
            r11 = 3
            r14[r11] = r10     // Catch:{ IOException -> 0x0340 }
            com.android.j.g r10 = r2.f16524l     // Catch:{ IOException -> 0x0340 }
            int r10 = r10.f16492b     // Catch:{ IOException -> 0x0340 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x0340 }
            r11 = 4
            r14[r11] = r10     // Catch:{ IOException -> 0x0340 }
            com.android.p275j.C5188ab.m14147b(r12, r14)     // Catch:{ IOException -> 0x0340 }
            goto L_0x0240
        L_0x0274:
            if (r3 < r10) goto L_0x033a
            r10 = 299(0x12b, float:4.19E-43)
            if (r3 > r10) goto L_0x033a
            com.android.j.n r10 = new com.android.j.n     // Catch:{ IOException -> 0x0340 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0340 }
            java.util.Map r20 = com.android.p275j.C5202n.m14163a(r8)     // Catch:{ IOException -> 0x0340 }
            r22 = 0
            r17 = r10
            r18 = r3
            r19 = r9
            r21 = r8
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ IOException -> 0x0340 }
            r3 = r10
        L_0x0291:
            java.lang.String r5 = "network-http-complete"
            r2.mo10293c(r5)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            boolean r5 = r3.f16509e     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            if (r5 == 0) goto L_0x02b2
            java.lang.Object r5 = r2.f16516d     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            monitor-enter(r5)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            boolean r6 = r2.f16521i     // Catch:{ all -> 0x02ae }
            monitor-exit(r5)     // Catch:{ all -> 0x02ae }
            if (r6 == 0) goto L_0x02b2
            java.lang.String r3 = "not-modified"
            r2.mo10295e(r3)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r2.mo10297g()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r2.mo10300j()
            return
        L_0x02ae:
            r0 = move-exception
            r3 = r0
            monitor-exit(r5)     // Catch:{ all -> 0x02ae }
            throw r3     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x02b2:
            com.android.j.v r3 = r2.mo10267a(r3)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.String r5 = "network-parse-complete"
            r2.mo10293c(r5)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            boolean r5 = r2.f16519g     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            com.android.j.b r5 = r3.f16538b     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            if (r5 == 0) goto L_0x02cd
            com.android.j.c r6 = r1.f16502c     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.String r7 = r2.f16514b     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r6.mo10262c(r7, r5)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.String r5 = "network-cache-written"
            r2.mo10293c(r5)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x02cd:
            r2.mo10296f()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            com.android.j.j r5 = r1.f16503d     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r6 = 0
            r5.mo10286b(r2, r3, r6)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.Object r5 = r2.f16516d     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            monitor-enter(r5)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            com.android.j.ac r6 = r2.f16525m     // Catch:{ all -> 0x0336 }
            monitor-exit(r5)     // Catch:{ all -> 0x0336 }
            if (r6 == 0) goto L_0x0332
            com.android.j.b r5 = r3.f16538b     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            if (r5 == 0) goto L_0x032f
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            boolean r5 = r5.mo10279a(r7)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            if (r5 == 0) goto L_0x02ed
            goto L_0x032f
        L_0x02ed:
            java.lang.String r5 = r2.f16514b     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            monitor-enter(r6)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.util.Map r7 = r6.f16470a     // Catch:{ all -> 0x032b }
            java.lang.Object r7 = r7.remove(r5)     // Catch:{ all -> 0x032b }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x032b }
            monitor-exit(r6)     // Catch:{ all -> 0x032b }
            if (r7 == 0) goto L_0x0332
            boolean r8 = com.android.p275j.C5188ab.f16468b     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            if (r8 == 0) goto L_0x0314
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            int r9 = r7.size()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r8[r4] = r9     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r9 = 1
            r8[r9] = r5     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.String r5 = "Releasing %d waiting requests for cacheKey=%s."
            com.android.p275j.C5188ab.m14150e(r5, r8)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x0314:
            java.util.Iterator r5 = r7.iterator()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x0318:
            boolean r7 = r5.hasNext()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            if (r7 == 0) goto L_0x0332
            java.lang.Object r7 = r5.next()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            com.android.j.r r7 = (com.android.p275j.C5206r) r7     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            com.android.j.j r8 = r6.f16471b     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r9 = 0
            r8.mo10286b(r7, r3, r9)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            goto L_0x0318
        L_0x032b:
            r0 = move-exception
            r3 = r0
            monitor-exit(r6)     // Catch:{ all -> 0x032b }
            throw r3     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x032f:
            r6.mo10277a(r2)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x0332:
            r2.mo10300j()
            return
        L_0x0336:
            r0 = move-exception
            r3 = r0
            monitor-exit(r5)     // Catch:{ all -> 0x0336 }
            throw r3     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x033a:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0340 }
            r3.<init>()     // Catch:{ IOException -> 0x0340 }
            throw r3     // Catch:{ IOException -> 0x0340 }
        L_0x0340:
            r0 = move-exception
            goto L_0x0346
        L_0x0342:
            r0 = move-exception
            r9 = 0
            goto L_0x0346
        L_0x0345:
            r0 = move-exception
        L_0x0346:
            r3 = r0
        L_0x0347:
            r12 = r9
            r9 = r13
            goto L_0x035e
        L_0x034a:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0352 }
            java.lang.String r8 = "Could not retrieve response code from HttpUrlConnection."
            r3.<init>(r8)     // Catch:{ all -> 0x0352 }
            throw r3     // Catch:{ all -> 0x0352 }
        L_0x0352:
            r0 = move-exception
            r3 = r0
            r8 = 0
        L_0x0355:
            if (r8 != 0) goto L_0x035a
            r11.disconnect()     // Catch:{ IOException -> 0x035b }
        L_0x035a:
            throw r3     // Catch:{ IOException -> 0x035b }
        L_0x035b:
            r0 = move-exception
            r3 = r0
            r12 = r9
        L_0x035e:
            boolean r8 = r3 instanceof java.net.SocketTimeoutException     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            if (r8 == 0) goto L_0x036a
            java.lang.String r3 = "socket"
            com.android.j.x r8 = new com.android.j.x     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r8.<init>()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            goto L_0x03c9
        L_0x036a:
            boolean r8 = r3 instanceof java.net.MalformedURLException     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            if (r8 != 0) goto L_0x0410
            if (r9 == 0) goto L_0x040a
            int r3 = r9.f16454a     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r8 = 2
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r10[r4] = r8     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.String r8 = r2.f16514b     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r11 = 1
            r10[r11] = r8     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.String r8 = "Unexpected response code %d for %s"
            com.android.p275j.C5188ab.m14148c(r8, r10)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            if (r12 == 0) goto L_0x03c2
            java.util.List r8 = r9.f16455b     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.util.List r14 = java.util.Collections.unmodifiableList(r8)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            com.android.j.n r8 = new com.android.j.n     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.util.Map r13 = com.android.p275j.C5202n.m14163a(r14)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r15 = 0
            r10 = r8
            r11 = r3
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r9 = 401(0x191, float:5.62E-43)
            if (r3 == r9) goto L_0x03b9
            r9 = 403(0x193, float:5.65E-43)
            if (r3 != r9) goto L_0x03a5
            goto L_0x03b9
        L_0x03a5:
            r5 = 400(0x190, float:5.6E-43)
            if (r3 < r5) goto L_0x03b3
            r5 = 499(0x1f3, float:6.99E-43)
            if (r3 > r5) goto L_0x03b3
            com.android.j.f r3 = new com.android.j.f     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r3.<init>(r8)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            throw r3     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x03b3:
            com.android.j.w r3 = new com.android.j.w     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r3.<init>(r8)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            throw r3     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x03b9:
            java.lang.String r3 = "auth"
            com.android.j.a r9 = new com.android.j.a     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r9.<init>(r8)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r8 = r9
            goto L_0x03c9
        L_0x03c2:
            java.lang.String r3 = "network"
            com.android.j.m r8 = new com.android.j.m     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r8.<init>()     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x03c9:
            com.android.j.g r9 = r2.f16524l     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            int r10 = r9.f16491a     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            int r11 = r9.f16492b     // Catch:{ y -> 0x03f2, Exception -> 0x0425 }
            r12 = 1
            int r11 = r11 + r12
            r9.f16492b = r11     // Catch:{ y -> 0x03f2, Exception -> 0x0425 }
            float r13 = (float) r10     // Catch:{ y -> 0x03f2, Exception -> 0x0425 }
            int r13 = (int) r13     // Catch:{ y -> 0x03f2, Exception -> 0x0425 }
            int r13 = r13 + r10
            r9.f16491a = r13     // Catch:{ y -> 0x03f2, Exception -> 0x0425 }
            if (r11 > r12) goto L_0x03f1
            java.lang.String r8 = "%s-retry [timeout=%s]"
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r9[r4] = r3     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r9[r12] = r3     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.String r3 = java.lang.String.format(r8, r9)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r2.mo10293c(r3)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r3 = 1
            goto L_0x0034
        L_0x03f1:
            throw r8     // Catch:{ y -> 0x03f2, Exception -> 0x0425 }
        L_0x03f2:
            r0 = move-exception
            r5 = r0
            java.lang.String r6 = "%s-timeout-giveup [timeout=%s]"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r7[r4] = r3     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r8 = 1
            r7[r8] = r3     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.String r3 = java.lang.String.format(r6, r7)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r2.mo10293c(r3)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            throw r5     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x040a:
            com.android.j.o r5 = new com.android.j.o     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r5.<init>(r3)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            throw r5     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x0410:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.String r6 = "Bad URL "
            java.lang.String r7 = r2.f16514b     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            java.lang.String r6 = r6.concat(r7)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            r5.<init>(r6, r3)     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
            throw r5     // Catch:{ y -> 0x0449, Exception -> 0x0425 }
        L_0x0422:
            r0 = move-exception
            r3 = r0
            goto L_0x045a
        L_0x0425:
            r0 = move-exception
            r3 = r0
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0422 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x0422 }
            r5[r4] = r6     // Catch:{ all -> 0x0422 }
            java.lang.String r4 = "Unhandled exception %s"
            com.android.p275j.C5188ab.m14149d(r3, r4, r5)     // Catch:{ all -> 0x0422 }
            com.android.j.y r4 = new com.android.j.y     // Catch:{ all -> 0x0422 }
            r4.<init>((java.lang.Throwable) r3)     // Catch:{ all -> 0x0422 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0422 }
            com.android.j.j r3 = r1.f16503d     // Catch:{ all -> 0x0422 }
            r3.mo10285a(r2, r4)     // Catch:{ all -> 0x0422 }
            r2.mo10297g()     // Catch:{ all -> 0x0422 }
            r2.mo10300j()
            return
        L_0x0449:
            r0 = move-exception
            r3 = r0
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0422 }
            com.android.j.j r4 = r1.f16503d     // Catch:{ all -> 0x0422 }
            r4.mo10285a(r2, r3)     // Catch:{ all -> 0x0422 }
            r2.mo10297g()     // Catch:{ all -> 0x0422 }
            r2.mo10300j()
            return
        L_0x045a:
            r2.mo10300j()
            goto L_0x045f
        L_0x045e:
            throw r3
        L_0x045f:
            goto L_0x045e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p275j.C5200l.m14162a():void");
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m14162a();
            } catch (InterruptedException unused) {
                if (this.f16500a) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C5188ab.m14148c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
