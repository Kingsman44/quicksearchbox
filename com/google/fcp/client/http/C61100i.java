package com.google.fcp.client.http;

/* renamed from: com.google.fcp.client.http.i */
/* compiled from: PG */
public final /* synthetic */ class C61100i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C61104m f165396a;

    public /* synthetic */ C61100i(C61104m mVar) {
        this.f165396a = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:237:0x036a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x036a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0067 A[EDGE_INSN: B:256:0x0067->B:37:0x0067 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006c A[SYNTHETIC, Splitter:B:39:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0070 A[SYNTHETIC, Splitter:B:41:0x0070] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            com.google.fcp.client.http.m r2 = r1.f165396a
            boolean r0 = r2.mo57667k()
            if (r0 == 0) goto L_0x000c
            goto L_0x037b
        L_0x000c:
            com.google.fcp.client.http.k r0 = r2.f165398b     // Catch:{ IOException -> 0x037f }
            com.google.fcp.client.http.r r3 = r2.f165397a     // Catch:{ IOException -> 0x037f }
            java.lang.String r3 = r3.f165424a     // Catch:{ IOException -> 0x037f }
            java.net.HttpURLConnection r3 = r0.mo57656a(r3)     // Catch:{ IOException -> 0x037f }
            monitor-enter(r2)
            p3186j$.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x037c }
            com.google.fcp.client.http.h r0 = new com.google.fcp.client.http.h     // Catch:{ all -> 0x037c }
            r0.<init>(r3)     // Catch:{ all -> 0x037c }
            r2.f165405i = r0     // Catch:{ all -> 0x037c }
            monitor-exit(r2)     // Catch:{ all -> 0x037c }
            r4 = 1
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r0 = r2.mo57657a(r0)     // Catch:{ j -> 0x0373, all -> 0x036a }
            java.lang.String r5 = "Content-Length"
            java.lang.String r5 = r2.mo57657a(r5)     // Catch:{ l -> 0x035d }
            r8 = 0
            if (r5 != 0) goto L_0x0035
            r9 = -1
            goto L_0x0039
        L_0x0035:
            long r9 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0347 }
        L_0x0039:
            r2.mo57659c(r3, r9, r0)     // Catch:{ j -> 0x0344, all -> 0x036a }
            com.google.fcp.client.http.r r5 = r2.f165397a     // Catch:{  }
            boolean r5 = r5.f165427d     // Catch:{  }
            r11 = -1
            r12 = 0
            if (r5 == 0) goto L_0x009f
            r2.mo57658b()     // Catch:{ IOException -> 0x0095 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x0095 }
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0059
            int r14 = r2.f165399c     // Catch:{ all -> 0x0087 }
            long r14 = (long) r14     // Catch:{ all -> 0x0087 }
            int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x0059
            int r10 = (int) r9     // Catch:{ all -> 0x0087 }
            goto L_0x005b
        L_0x0059:
            int r10 = r2.f165399c     // Catch:{ all -> 0x0087 }
        L_0x005b:
            byte[] r9 = new byte[r10]     // Catch:{ all -> 0x0087 }
            int[] r14 = new int[r4]     // Catch:{ all -> 0x0087 }
        L_0x005f:
            long r6 = (long) r10     // Catch:{ all -> 0x0087 }
            r2.mo57664h(r9, r6, r14)     // Catch:{ all -> 0x0087 }
            r6 = r14[r8]     // Catch:{ all -> 0x0087 }
            if (r6 != r11) goto L_0x0070
            r5.flush()     // Catch:{ all -> 0x0087 }
            if (r5 == 0) goto L_0x009f
            r5.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x009f
        L_0x0070:
            boolean r6 = r2.f165404h     // Catch:{ all -> 0x0087 }
            if (r6 == 0) goto L_0x007c
            long r6 = r2.f165407k     // Catch:{ all -> 0x0087 }
            r12 = r14[r8]     // Catch:{ all -> 0x0087 }
            long r12 = (long) r12     // Catch:{ all -> 0x0087 }
            long r6 = r6 + r12
            r2.f165407k = r6     // Catch:{ all -> 0x0087 }
        L_0x007c:
            r6 = r14[r8]     // Catch:{ all -> 0x0087 }
            r5.write(r9, r8, r6)     // Catch:{ all -> 0x0087 }
            r2.mo57658b()     // Catch:{ all -> 0x0087 }
            r12 = 0
            goto L_0x005f
        L_0x0087:
            r0 = move-exception
            r6 = r0
            if (r5 == 0) goto L_0x0094
            r5.close()     // Catch:{ all -> 0x008f }
            goto L_0x0094
        L_0x008f:
            r0 = move-exception
            r5 = r0
            com.google.fcp.client.http.C61096e.m93438a(r6, r5)     // Catch:{ IOException -> 0x0095 }
        L_0x0094:
            throw r6     // Catch:{ IOException -> 0x0095 }
        L_0x0095:
            r0 = move-exception
            java.lang.String r5 = "failure during request body send"
            r2.mo57660d(r5, r0)     // Catch:{  }
            r3.disconnect()
            return
        L_0x009f:
            r2.mo57658b()     // Catch:{  }
            r3.connect()     // Catch:{ IOException -> 0x0339 }
            int r5 = r3.getResponseCode()     // Catch:{ IOException -> 0x032f }
            boolean r6 = r2.f165403g     // Catch:{ IOException -> 0x032f }
            if (r6 == 0) goto L_0x00f9
            if (r0 != 0) goto L_0x00f9
            java.util.Map r0 = r3.getHeaderFields()     // Catch:{ IOException -> 0x032f }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x032f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x032f }
        L_0x00bb:
            boolean r6 = r0.hasNext()     // Catch:{ IOException -> 0x032f }
            if (r6 == 0) goto L_0x00f9
            java.lang.Object r6 = r0.next()     // Catch:{ IOException -> 0x032f }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x032f }
            java.lang.Object r7 = r6.getValue()     // Catch:{ IOException -> 0x032f }
            java.util.List r7 = (java.util.List) r7     // Catch:{ IOException -> 0x032f }
            java.lang.String r9 = "Content-Encoding"
            java.lang.Object r6 = r6.getKey()     // Catch:{ IOException -> 0x032f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x032f }
            java.lang.String r6 = com.google.common.base.C58837ba.m90858g(r6)     // Catch:{ IOException -> 0x032f }
            boolean r6 = com.google.common.base.C58890d.m90990e(r9, r6)     // Catch:{ IOException -> 0x032f }
            if (r6 == 0) goto L_0x00bb
            boolean r6 = r7.isEmpty()     // Catch:{ IOException -> 0x032f }
            if (r6 != 0) goto L_0x00bb
            java.lang.String r6 = "gzip"
            java.lang.Object r7 = r7.get(r8)     // Catch:{ IOException -> 0x032f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x032f }
            java.lang.String r7 = com.google.common.base.C58837ba.m90858g(r7)     // Catch:{ IOException -> 0x032f }
            boolean r6 = com.google.common.base.C58890d.m90990e(r6, r7)     // Catch:{ IOException -> 0x032f }
            if (r6 == 0) goto L_0x00bb
            r0 = 1
            goto L_0x00fa
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            com.google.fcp.client.http.t r6 = com.google.fcp.client.http.C61111t.f165428c     // Catch:{ IOException -> 0x032f }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ IOException -> 0x032f }
            com.google.fcp.client.http.s r6 = (com.google.fcp.client.http.C61110s) r6     // Catch:{ IOException -> 0x032f }
            r6.copyOnWrite()     // Catch:{ IOException -> 0x032f }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ IOException -> 0x032f }
            com.google.fcp.client.http.t r7 = (com.google.fcp.client.http.C61111t) r7     // Catch:{ IOException -> 0x032f }
            r7.f165430a = r5     // Catch:{ IOException -> 0x032f }
            boolean r5 = r2.f165404h     // Catch:{ IOException -> 0x032f }
            r9 = 2
            if (r5 == 0) goto L_0x0132
            java.lang.String r5 = r3.getResponseMessage()     // Catch:{ IOException -> 0x032f }
            java.lang.String r5 = com.google.common.base.C58837ba.m90858g(r5)     // Catch:{ IOException -> 0x032f }
            long r12 = r2.f165408l     // Catch:{ IOException -> 0x032f }
            int r7 = r5.length()     // Catch:{ IOException -> 0x032f }
            int r7 = r7 + 15
            r17 = r5
            long r4 = (long) r7     // Catch:{ IOException -> 0x032f }
            long r12 = r12 + r4
            r2.f165408l = r12     // Catch:{ IOException -> 0x032f }
            long r4 = r2.f165408l     // Catch:{ IOException -> 0x032f }
            long r4 = r4 + r9
            r2.f165408l = r4     // Catch:{ IOException -> 0x032f }
            boolean r4 = r17.isEmpty()     // Catch:{ IOException -> 0x032f }
            r2.f165410n = r4     // Catch:{ IOException -> 0x032f }
        L_0x0132:
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ IOException -> 0x032f }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x032f }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x032f }
            r12 = -1
        L_0x0140:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x032f }
            if (r5 == 0) goto L_0x0288
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x032f }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x032f }
            java.lang.Object r7 = r5.getKey()     // Catch:{ IOException -> 0x032f }
            if (r7 == 0) goto L_0x027e
            boolean r7 = r2.f165404h     // Catch:{ IOException -> 0x032f }
            if (r7 == 0) goto L_0x01a5
            java.lang.Object r7 = r5.getValue()     // Catch:{ IOException -> 0x032f }
            java.util.List r7 = (java.util.List) r7     // Catch:{ IOException -> 0x032f }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IOException -> 0x032f }
        L_0x0160:
            boolean r15 = r7.hasNext()     // Catch:{ IOException -> 0x032f }
            if (r15 == 0) goto L_0x01a5
            java.lang.Object r15 = r7.next()     // Catch:{ IOException -> 0x032f }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x032f }
            r17 = r12
            long r11 = r2.f165408l     // Catch:{ IOException -> 0x032f }
            java.lang.Object r13 = r5.getKey()     // Catch:{ IOException -> 0x032f }
            if (r13 != 0) goto L_0x0179
            r8 = 0
            goto L_0x0186
        L_0x0179:
            java.lang.Object r13 = r5.getKey()     // Catch:{ IOException -> 0x032f }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ IOException -> 0x032f }
            int r13 = r13.length()     // Catch:{ IOException -> 0x032f }
            int r13 = r13 + 2
            long r8 = (long) r13     // Catch:{ IOException -> 0x032f }
        L_0x0186:
            long r11 = r11 + r8
            r2.f165408l = r11     // Catch:{ IOException -> 0x032f }
            long r8 = r2.f165408l     // Catch:{ IOException -> 0x032f }
            if (r15 != 0) goto L_0x0190
            r10 = 0
            goto L_0x0195
        L_0x0190:
            int r10 = r15.length()     // Catch:{ IOException -> 0x032f }
            long r10 = (long) r10     // Catch:{ IOException -> 0x032f }
        L_0x0195:
            long r8 = r8 + r10
            r2.f165408l = r8     // Catch:{ IOException -> 0x032f }
            long r8 = r2.f165408l     // Catch:{ IOException -> 0x032f }
            r10 = 2
            long r8 = r8 + r10
            r2.f165408l = r8     // Catch:{ IOException -> 0x032f }
            r9 = r10
            r12 = r17
            r8 = 0
            r11 = -1
            goto L_0x0160
        L_0x01a5:
            r10 = r9
            r17 = r12
            java.lang.String r7 = "Transfer-Encoding"
            java.lang.Object r8 = r5.getKey()     // Catch:{ IOException -> 0x032f }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ IOException -> 0x032f }
            boolean r7 = com.google.common.base.C58890d.m90990e(r7, r8)     // Catch:{ IOException -> 0x032f }
            if (r7 == 0) goto L_0x01dc
            java.lang.Object r7 = r5.getValue()     // Catch:{ IOException -> 0x032f }
            java.util.List r7 = (java.util.List) r7     // Catch:{ IOException -> 0x032f }
            int r7 = r7.size()     // Catch:{ IOException -> 0x032f }
            r8 = 1
            if (r7 != r8) goto L_0x01dc
            java.lang.String r7 = "chunked"
            java.lang.Object r8 = r5.getValue()     // Catch:{ IOException -> 0x032f }
            java.util.List r8 = (java.util.List) r8     // Catch:{ IOException -> 0x032f }
            r9 = 0
            java.lang.Object r8 = r8.get(r9)     // Catch:{ IOException -> 0x032f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x032f }
            java.lang.String r8 = com.google.common.base.C58837ba.m90858g(r8)     // Catch:{ IOException -> 0x032f }
            boolean r7 = com.google.common.base.C58890d.m90990e(r7, r8)     // Catch:{ IOException -> 0x032f }
            if (r7 != 0) goto L_0x0281
        L_0x01dc:
            if (r0 == 0) goto L_0x01ec
            java.lang.String r7 = "Content-Encoding"
            java.lang.Object r8 = r5.getKey()     // Catch:{ IOException -> 0x032f }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ IOException -> 0x032f }
            boolean r7 = com.google.common.base.C58890d.m90990e(r7, r8)     // Catch:{ IOException -> 0x032f }
            if (r7 != 0) goto L_0x0281
        L_0x01ec:
            java.lang.String r7 = "Content-Length"
            java.lang.Object r8 = r5.getKey()     // Catch:{ IOException -> 0x032f }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ IOException -> 0x032f }
            boolean r7 = com.google.common.base.C58890d.m90990e(r7, r8)     // Catch:{ IOException -> 0x032f }
            if (r7 == 0) goto L_0x021e
            boolean r7 = r2.f165404h     // Catch:{ IOException -> 0x032f }
            if (r7 == 0) goto L_0x0281
            java.lang.Object r7 = r5.getValue()     // Catch:{ IOException -> 0x032f }
            java.util.List r7 = (java.util.List) r7     // Catch:{ IOException -> 0x032f }
            int r7 = r7.size()     // Catch:{ IOException -> 0x032f }
            r8 = 1
            if (r7 != r8) goto L_0x0281
            java.lang.Object r5 = r5.getValue()     // Catch:{ NumberFormatException -> 0x0281 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ NumberFormatException -> 0x0281 }
            r7 = 0
            java.lang.Object r5 = r5.get(r7)     // Catch:{ NumberFormatException -> 0x0281 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NumberFormatException -> 0x0281 }
            long r12 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0281 }
            r9 = r10
            goto L_0x0284
        L_0x021e:
            java.lang.Object r7 = r5.getValue()     // Catch:{ IOException -> 0x032f }
            java.util.List r7 = (java.util.List) r7     // Catch:{ IOException -> 0x032f }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IOException -> 0x032f }
        L_0x0228:
            boolean r8 = r7.hasNext()     // Catch:{ IOException -> 0x032f }
            if (r8 == 0) goto L_0x0281
            java.lang.Object r8 = r7.next()     // Catch:{ IOException -> 0x032f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x032f }
            com.google.fcp.client.http.o r9 = com.google.fcp.client.http.C61106o.f165418c     // Catch:{ IOException -> 0x032f }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ IOException -> 0x032f }
            com.google.fcp.client.http.n r9 = (com.google.fcp.client.http.C61105n) r9     // Catch:{ IOException -> 0x032f }
            java.lang.Object r12 = r5.getKey()     // Catch:{ IOException -> 0x032f }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x032f }
            r9.copyOnWrite()     // Catch:{ IOException -> 0x032f }
            com.google.protobuf.bv r13 = r9.instance     // Catch:{ IOException -> 0x032f }
            com.google.fcp.client.http.o r13 = (com.google.fcp.client.http.C61106o) r13     // Catch:{ IOException -> 0x032f }
            r12.getClass()     // Catch:{ IOException -> 0x032f }
            r13.f165420a = r12     // Catch:{ IOException -> 0x032f }
            r9.copyOnWrite()     // Catch:{ IOException -> 0x032f }
            com.google.protobuf.bv r12 = r9.instance     // Catch:{ IOException -> 0x032f }
            com.google.fcp.client.http.o r12 = (com.google.fcp.client.http.C61106o) r12     // Catch:{ IOException -> 0x032f }
            r8.getClass()     // Catch:{ IOException -> 0x032f }
            r12.f165421b = r8     // Catch:{ IOException -> 0x032f }
            r6.copyOnWrite()     // Catch:{ IOException -> 0x032f }
            com.google.protobuf.bv r8 = r6.instance     // Catch:{ IOException -> 0x032f }
            com.google.fcp.client.http.t r8 = (com.google.fcp.client.http.C61111t) r8     // Catch:{ IOException -> 0x032f }
            com.google.protobuf.bv r9 = r9.build()     // Catch:{ IOException -> 0x032f }
            com.google.fcp.client.http.o r9 = (com.google.fcp.client.http.C61106o) r9     // Catch:{ IOException -> 0x032f }
            r9.getClass()     // Catch:{ IOException -> 0x032f }
            com.google.protobuf.cq r12 = r8.f165431b     // Catch:{ IOException -> 0x032f }
            boolean r13 = r12.mo58948c()     // Catch:{ IOException -> 0x032f }
            if (r13 != 0) goto L_0x0278
            com.google.protobuf.cq r12 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r12)     // Catch:{ IOException -> 0x032f }
            r8.f165431b = r12     // Catch:{ IOException -> 0x032f }
        L_0x0278:
            com.google.protobuf.cq r8 = r8.f165431b     // Catch:{ IOException -> 0x032f }
            r8.add(r9)     // Catch:{ IOException -> 0x032f }
            goto L_0x0228
        L_0x027e:
            r10 = r9
            r17 = r12
        L_0x0281:
            r9 = r10
            r12 = r17
        L_0x0284:
            r8 = 0
            r11 = -1
            goto L_0x0140
        L_0x0288:
            r17 = r12
            if (r0 == 0) goto L_0x0296
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x032f }
            r4 = 304(0x130, float:4.26E-43)
            if (r0 == r4) goto L_0x0296
            r8 = 1
            goto L_0x0297
        L_0x0296:
            r8 = 0
        L_0x0297:
            com.google.protobuf.bv r0 = r6.build()     // Catch:{ IOException -> 0x032f }
            com.google.fcp.client.http.t r0 = (com.google.fcp.client.http.C61111t) r0     // Catch:{ IOException -> 0x032f }
            byte[] r0 = r0.toByteArray()     // Catch:{  }
            r2.mo57663g(r0)     // Catch:{  }
            r2.mo57658b()     // Catch:{ IOException -> 0x0325 }
            java.io.InputStream r0 = r3.getErrorStream()     // Catch:{ IOException -> 0x0325 }
            if (r0 != 0) goto L_0x02b8
            com.google.common.l.y r0 = new com.google.common.l.y     // Catch:{ IOException -> 0x0325 }
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ IOException -> 0x0325 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0325 }
            r4 = r0
            goto L_0x02bd
        L_0x02b8:
            com.google.common.l.y r4 = new com.google.common.l.y     // Catch:{ IOException -> 0x0325 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0325 }
        L_0x02bd:
            if (r8 == 0) goto L_0x02cb
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x02c8 }
            int r5 = r2.f165401e     // Catch:{ all -> 0x02c8 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x02c8 }
            r5 = r0
            goto L_0x02cc
        L_0x02c8:
            r0 = move-exception
            r5 = r0
            goto L_0x031b
        L_0x02cb:
            r5 = r4
        L_0x02cc:
            int r0 = r2.f165400d     // Catch:{ all -> 0x030f }
            byte[] r6 = new byte[r0]     // Catch:{ all -> 0x030f }
            r7 = -1
            r12 = 0
        L_0x02d3:
            r9 = 0
        L_0x02d4:
            if (r9 >= r0) goto L_0x02f0
            int r7 = r0 - r9
            int r7 = r5.read(r6, r9, r7)     // Catch:{ all -> 0x030f }
            boolean r8 = r2.f165404h     // Catch:{ all -> 0x030f }
            if (r8 == 0) goto L_0x02ea
            long r10 = r4.f157530a     // Catch:{ all -> 0x030f }
            long r14 = r2.f165409m     // Catch:{ all -> 0x030f }
            long r12 = r10 - r12
            long r14 = r14 + r12
            r2.f165409m = r14     // Catch:{ all -> 0x030f }
            r12 = r10
        L_0x02ea:
            r10 = -1
            if (r7 != r10) goto L_0x02ee
            goto L_0x02f0
        L_0x02ee:
            int r9 = r9 + r7
            goto L_0x02d4
        L_0x02f0:
            if (r9 != 0) goto L_0x02f3
            goto L_0x02fd
        L_0x02f3:
            r2.mo57661e(r6, r9)     // Catch:{ all -> 0x030f }
            r2.mo57658b()     // Catch:{ all -> 0x030f }
            r9 = -1
            if (r7 == r9) goto L_0x02fd
            goto L_0x02d3
        L_0x02fd:
            r5.close()     // Catch:{ all -> 0x02c8 }
            r4.close()     // Catch:{ IOException -> 0x0325 }
            r12 = r17
            r2.mo57662f(r12)     // Catch:{ j -> 0x030c, all -> 0x0309 }
            return
        L_0x0309:
            r0 = move-exception
            r4 = 0
            goto L_0x036d
        L_0x030c:
            r4 = 0
            goto L_0x0376
        L_0x030f:
            r0 = move-exception
            r6 = r0
            r5.close()     // Catch:{ all -> 0x0315 }
            goto L_0x031a
        L_0x0315:
            r0 = move-exception
            r5 = r0
            com.google.fcp.client.http.C61096e.m93438a(r6, r5)     // Catch:{ all -> 0x02c8 }
        L_0x031a:
            throw r6     // Catch:{ all -> 0x02c8 }
        L_0x031b:
            r4.close()     // Catch:{ all -> 0x031f }
            goto L_0x0324
        L_0x031f:
            r0 = move-exception
            r4 = r0
            com.google.fcp.client.http.C61096e.m93438a(r5, r4)     // Catch:{ IOException -> 0x0325 }
        L_0x0324:
            throw r5     // Catch:{ IOException -> 0x0325 }
        L_0x0325:
            r0 = move-exception
            java.lang.String r4 = "failure during response body receive"
            r2.mo57660d(r4, r0)     // Catch:{  }
            r3.disconnect()
            return
        L_0x032f:
            r0 = move-exception
            java.lang.String r4 = "failure during response header receive"
            r2.mo57660d(r4, r0)     // Catch:{  }
            r3.disconnect()
            return
        L_0x0339:
            r0 = move-exception
            r4 = r0
            java.lang.String r0 = "failure during connect"
            r2.mo57660d(r0, r4)     // Catch:{  }
            r3.disconnect()
            return
        L_0x0344:
            r6 = 1
            goto L_0x0375
        L_0x0347:
            r0 = move-exception
            r4 = r0
            com.google.fcp.client.http.l r0 = new com.google.fcp.client.http.l     // Catch:{ l -> 0x035d }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ l -> 0x035b }
            r8 = 0
            r7[r8] = r5     // Catch:{ l -> 0x035b }
            java.lang.String r5 = "invalid Content-Length request header value: %s"
            java.lang.String r5 = java.lang.String.format(r5, r7)     // Catch:{ l -> 0x035b }
            r0.<init>(r5, r4)     // Catch:{ l -> 0x035b }
            throw r0     // Catch:{ l -> 0x035b }
        L_0x035b:
            r0 = move-exception
            goto L_0x035f
        L_0x035d:
            r0 = move-exception
            r6 = 1
        L_0x035f:
            java.lang.String r4 = "invalid request"
            r2.mo57660d(r4, r0)     // Catch:{ j -> 0x0374, all -> 0x0368 }
            r3.disconnect()
            return
        L_0x0368:
            r0 = move-exception
            goto L_0x036c
        L_0x036a:
            r0 = move-exception
            r6 = 1
        L_0x036c:
            r4 = 1
        L_0x036d:
            if (r4 == 0) goto L_0x0372
            r3.disconnect()
        L_0x0372:
            throw r0
        L_0x0373:
            r6 = 1
        L_0x0374:
        L_0x0375:
            r4 = 1
        L_0x0376:
            if (r4 == 0) goto L_0x037b
            r3.disconnect()
        L_0x037b:
            return
        L_0x037c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x037c }
            throw r0
        L_0x037f:
            r0 = move-exception
            java.lang.String r3 = "failure during connection creation"
            r2.mo57660d(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fcp.client.http.C61100i.run():void");
    }
}
