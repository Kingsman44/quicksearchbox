package com.bumptech.glide.load.p293a;

import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.data.C5930e;
import com.bumptech.glide.load.p297b.C5763ao;

/* renamed from: com.bumptech.glide.load.a.bb */
/* compiled from: PG */
final class C5704bb implements C5719l, C5718k {

    /* renamed from: a */
    public final C5720m f17181a;

    /* renamed from: b */
    public final C5718k f17182b;

    /* renamed from: c */
    public volatile Object f17183c;

    /* renamed from: d */
    public volatile C5716i f17184d;

    /* renamed from: e */
    private volatile int f17185e;

    /* renamed from: f */
    private volatile C5715h f17186f;

    /* renamed from: g */
    private volatile C5763ao f17187g;

    public C5704bb(C5720m mVar, C5718k kVar) {
        this.f17181a = mVar;
        this.f17182b = kVar;
    }

    /* renamed from: a */
    public final void mo12181a() {
        C5763ao aoVar = this.f17187g;
        if (aoVar != null) {
            aoVar.f17348c.mo11923c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x011d A[SYNTHETIC, Splitter:B:33:0x011d] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12182b() {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "SourceGenerator"
            java.lang.String r0 = "Attempt to write: "
            java.lang.String r3 = "Finished encoding source to cache, key: "
            java.lang.Object r4 = r1.f17183c
            r6 = 0
            if (r4 == 0) goto L_0x0131
            java.lang.Object r4 = r1.f17183c
            r1.f17183c = r6
            r8 = 3
            long r9 = com.bumptech.glide.p291h.C5625l.m14593b()     // Catch:{ IOException -> 0x0125 }
            com.bumptech.glide.load.a.m r11 = r1.f17181a     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.l r11 = r11.f17224c     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.v r11 = r11.mo12092a()     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.data.j r11 = r11.f17684e     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.data.g r11 = r11.mo12387a(r4)     // Catch:{ all -> 0x0119 }
            java.lang.Object r12 = r11.mo12338a()     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.a.m r13 = r1.f17181a     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.l r13 = r13.f17224c     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.v r13 = r13.mo12092a()     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.e.b r13 = r13.f17681b     // Catch:{ all -> 0x0119 }
            java.lang.Class r14 = r12.getClass()     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.c r13 = r13.mo11936a(r14)     // Catch:{ all -> 0x0119 }
            if (r13 == 0) goto L_0x010f
            com.bumptech.glide.load.a.j r14 = new com.bumptech.glide.load.a.j     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.a.m r15 = r1.f17181a     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.s r15 = r15.f17229h     // Catch:{ all -> 0x0119 }
            r14.<init>(r13, r12, r15)     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.a.i r12 = new com.bumptech.glide.load.a.i     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.b.ao r15 = r1.f17187g     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.n r15 = r15.f17346a     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.a.m r5 = r1.f17181a     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.n r6 = r5.f17234m     // Catch:{ all -> 0x0119 }
            r12.<init>(r15, r6)     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.a.ac r5 = r5.f17239r     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.a.b.b r5 = r5.mo12137a()     // Catch:{ all -> 0x0119 }
            r5.mo12193d(r12, r14)     // Catch:{ all -> 0x0119 }
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r2, r6)     // Catch:{ all -> 0x0119 }
            java.lang.String r14 = ", data: "
            if (r6 == 0) goto L_0x0099
            java.lang.String r6 = r12.toString()     // Catch:{ all -> 0x0119 }
            java.lang.String r15 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0119 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0119 }
            double r9 = com.bumptech.glide.p291h.C5625l.m14592a(r9)     // Catch:{ all -> 0x0119 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r7.<init>(r3)     // Catch:{ all -> 0x0119 }
            r7.append(r6)     // Catch:{ all -> 0x0119 }
            r7.append(r14)     // Catch:{ all -> 0x0119 }
            r7.append(r15)     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = ", encoder: "
            r7.append(r3)     // Catch:{ all -> 0x0119 }
            r7.append(r13)     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = ", duration: "
            r7.append(r3)     // Catch:{ all -> 0x0119 }
            r7.append(r9)     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0119 }
            android.util.Log.v(r2, r3)     // Catch:{ all -> 0x0119 }
        L_0x0099:
            java.io.File r3 = r5.mo12190a(r12)     // Catch:{ all -> 0x0119 }
            if (r3 == 0) goto L_0x00bb
            r1.f17184d = r12     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.a.h r0 = new com.bumptech.glide.load.a.h     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.b.ao r3 = r1.f17187g     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.n r3 = r3.f17346a     // Catch:{ all -> 0x0119 }
            java.util.List r3 = java.util.Collections.singletonList(r3)     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.a.m r4 = r1.f17181a     // Catch:{ all -> 0x0119 }
            r0.<init>(r3, r4, r1)     // Catch:{ all -> 0x0119 }
            r1.f17186f = r0     // Catch:{ all -> 0x0119 }
            com.bumptech.glide.load.b.ao r0 = r1.f17187g     // Catch:{ IOException -> 0x0125 }
            com.bumptech.glide.load.data.e r0 = r0.f17348c     // Catch:{ IOException -> 0x0125 }
            r0.mo11924d()     // Catch:{ IOException -> 0x0125 }
            goto L_0x0131
        L_0x00bb:
            boolean r3 = android.util.Log.isLoggable(r2, r8)     // Catch:{ all -> 0x0119 }
            if (r3 == 0) goto L_0x00e5
            com.bumptech.glide.load.a.i r3 = r1.f17184d     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0119 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r5.<init>(r0)     // Catch:{ all -> 0x0119 }
            r5.append(r3)     // Catch:{ all -> 0x0119 }
            r5.append(r14)     // Catch:{ all -> 0x0119 }
            r5.append(r4)     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r5.append(r0)     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0119 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0119 }
        L_0x00e5:
            com.bumptech.glide.load.a.k r0 = r1.f17182b     // Catch:{ all -> 0x010c }
            com.bumptech.glide.load.b.ao r3 = r1.f17187g     // Catch:{ all -> 0x010c }
            com.bumptech.glide.load.n r3 = r3.f17346a     // Catch:{ all -> 0x010c }
            java.lang.Object r18 = r11.mo12338a()     // Catch:{ all -> 0x010c }
            com.bumptech.glide.load.b.ao r4 = r1.f17187g     // Catch:{ all -> 0x010c }
            com.bumptech.glide.load.data.e r4 = r4.f17348c     // Catch:{ all -> 0x010c }
            com.bumptech.glide.load.b.ao r5 = r1.f17187g     // Catch:{ all -> 0x010c }
            com.bumptech.glide.load.data.e r5 = r5.f17348c     // Catch:{ all -> 0x010c }
            com.bumptech.glide.load.a r20 = r5.mo11921a()     // Catch:{ all -> 0x010c }
            com.bumptech.glide.load.b.ao r5 = r1.f17187g     // Catch:{ all -> 0x010c }
            com.bumptech.glide.load.n r5 = r5.f17346a     // Catch:{ all -> 0x010c }
            r16 = r0
            r17 = r3
            r19 = r4
            r21 = r5
            r16.mo12200d(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x010c }
            r2 = 1
            return r2
        L_0x010c:
            r0 = move-exception
            r3 = 1
            goto L_0x011b
        L_0x010f:
            com.bumptech.glide.u r0 = new com.bumptech.glide.u     // Catch:{ all -> 0x0119 }
            java.lang.Class r3 = r12.getClass()     // Catch:{ all -> 0x0119 }
            r0.<init>(r3)     // Catch:{ all -> 0x0119 }
            throw r0     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r0 = move-exception
            r3 = 0
        L_0x011b:
            if (r3 != 0) goto L_0x0124
            com.bumptech.glide.load.b.ao r3 = r1.f17187g     // Catch:{ IOException -> 0x0125 }
            com.bumptech.glide.load.data.e r3 = r3.f17348c     // Catch:{ IOException -> 0x0125 }
            r3.mo11924d()     // Catch:{ IOException -> 0x0125 }
        L_0x0124:
            throw r0     // Catch:{ IOException -> 0x0125 }
        L_0x0125:
            r0 = move-exception
            boolean r3 = android.util.Log.isLoggable(r2, r8)
            if (r3 == 0) goto L_0x0131
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r2, r3, r0)
        L_0x0131:
            com.bumptech.glide.load.a.h r0 = r1.f17186f
            if (r0 == 0) goto L_0x0140
            com.bumptech.glide.load.a.h r0 = r1.f17186f
            boolean r0 = r0.mo12182b()
            if (r0 != 0) goto L_0x013e
            goto L_0x0140
        L_0x013e:
            r2 = 1
            return r2
        L_0x0140:
            r2 = 1
            r3 = 0
            r1.f17186f = r3
            r1.f17187g = r3
            r5 = 0
        L_0x0147:
            if (r5 != 0) goto L_0x01a5
            int r0 = r1.f17185e
            com.bumptech.glide.load.a.m r3 = r1.f17181a
            java.util.List r3 = r3.mo12229d()
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x01a5
            com.bumptech.glide.load.a.m r0 = r1.f17181a
            java.util.List r0 = r0.mo12229d()
            int r3 = r1.f17185e
            int r4 = r3 + 1
            r1.f17185e = r4
            java.lang.Object r0 = r0.get(r3)
            com.bumptech.glide.load.b.ao r0 = (com.bumptech.glide.load.p297b.C5763ao) r0
            r1.f17187g = r0
            com.bumptech.glide.load.b.ao r0 = r1.f17187g
            if (r0 == 0) goto L_0x0147
            com.bumptech.glide.load.a.m r0 = r1.f17181a
            com.bumptech.glide.load.a.x r0 = r0.f17236o
            com.bumptech.glide.load.b.ao r3 = r1.f17187g
            com.bumptech.glide.load.data.e r3 = r3.f17348c
            com.bumptech.glide.load.a r3 = r3.mo11921a()
            boolean r0 = r0.mo12246c(r3)
            if (r0 != 0) goto L_0x0191
            com.bumptech.glide.load.a.m r0 = r1.f17181a
            com.bumptech.glide.load.b.ao r3 = r1.f17187g
            com.bumptech.glide.load.data.e r3 = r3.f17348c
            java.lang.Class r3 = r3.mo11922b()
            boolean r0 = r0.mo12231f(r3)
            if (r0 == 0) goto L_0x0147
        L_0x0191:
            com.bumptech.glide.load.b.ao r0 = r1.f17187g
            com.bumptech.glide.load.b.ao r3 = r1.f17187g
            com.bumptech.glide.load.data.e r3 = r3.f17348c
            com.bumptech.glide.load.a.m r4 = r1.f17181a
            com.bumptech.glide.p r4 = r4.f17235n
            com.bumptech.glide.load.a.ba r5 = new com.bumptech.glide.load.a.ba
            r5.<init>(r1, r0)
            r3.mo11925e(r4, r5)
            r5 = 1
            goto L_0x0147
        L_0x01a5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p293a.C5704bb.mo12182b():boolean");
    }

    /* renamed from: c */
    public final void mo12199c(C5955n nVar, Exception exc, C5930e eVar, C5637a aVar) {
        this.f17182b.mo12199c(nVar, exc, eVar, this.f17187g.f17348c.mo11921a());
    }

    /* renamed from: d */
    public final void mo12200d(C5955n nVar, Object obj, C5930e eVar, C5637a aVar, C5955n nVar2) {
        this.f17182b.mo12200d(nVar, obj, eVar, this.f17187g.f17348c.mo11921a(), nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo12201e(C5763ao aoVar) {
        C5763ao aoVar2 = this.f17187g;
        return aoVar2 != null && aoVar2 == aoVar;
    }
}
