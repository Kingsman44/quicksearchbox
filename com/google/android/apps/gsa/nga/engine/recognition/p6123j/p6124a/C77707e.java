package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a.C77740h;
import com.google.android.libraries.gsa.p1876k.C22870f;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.e */
/* compiled from: PG */
public final /* synthetic */ class C77707e implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C77710h f214044a;

    /* renamed from: b */
    public final /* synthetic */ InputStream f214045b;

    /* renamed from: c */
    public final /* synthetic */ C77740h f214046c;

    public /* synthetic */ C77707e(C77710h hVar, InputStream inputStream, C77740h hVar2) {
        this.f214044a = hVar;
        this.f214045b = inputStream;
        this.f214046c = hVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: com.google.android.apps.gsa.shared.m.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: com.google.common.util.concurrent.cx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: com.google.common.util.concurrent.cx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: com.google.common.util.concurrent.cx} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008d, code lost:
        r20 = r5;
        r21 = r6;
        r18 = r12;
        r13 = r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bb A[Catch:{ all -> 0x01d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            com.google.android.apps.gsa.nga.engine.recognition.j.a.h r2 = r1.f214044a
            java.io.InputStream r0 = r1.f214045b
            com.google.android.apps.gsa.nga.engine.recognition.k.a.h r3 = r1.f214046c
            com.google.android.apps.gsa.nga.engine.recognition.j.a.k r4 = r2.f214063o
            com.google.android.apps.gsa.nga.engine.recognition.as r5 = r2.f214055g
            com.google.android.apps.gsa.nga.engine.x.d r6 = r2.f214054f
            com.google.android.apps.gsa.nga.engine.b.g.ac r6 = r6.f218924a
            r6.getClass()
            g.a.a r7 = r4.f214076a
            java.lang.Object r7 = r7.mo17428b()
            com.google.android.apps.gsa.nga.engine.recognition.h.a.a r7 = (com.google.android.apps.gsa.nga.engine.recognition.p6119h.p6120a.C77652a) r7
            r7.getClass()
            g.a.a r4 = r4.f214077b
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.apps.gsa.shared.util.v.g r4 = (com.google.android.apps.gsa.shared.util.p7188v.C91142g) r4
            r4.getClass()
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream
            r8.<init>()
            r9 = 0
            r10 = 0
            com.google.android.apps.gsa.shared.util.v.g r11 = r2.f214053e     // Catch:{ IOException -> 0x0199, all -> 0x0195 }
            com.google.android.apps.gsa.shared.m.f r12 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251609lz     // Catch:{ IOException -> 0x0199, all -> 0x0195 }
            long r11 = r11.mo85399d(r12)     // Catch:{ IOException -> 0x0199, all -> 0x0195 }
            j$.time.Duration r11 = p3186j$.time.Duration.ofSeconds(r11)     // Catch:{ IOException -> 0x0199, all -> 0x0195 }
            com.google.android.libraries.gsa.k.g r12 = r2.f214052d     // Catch:{ IOException -> 0x0199, all -> 0x0195 }
            long r13 = r11.toMillis()     // Catch:{ IOException -> 0x0199, all -> 0x0195 }
            com.google.android.apps.gsa.nga.engine.recognition.j.a.a r15 = new com.google.android.apps.gsa.nga.engine.recognition.j.a.a     // Catch:{ IOException -> 0x0199, all -> 0x0195 }
            r15.<init>(r2, r0, r11)     // Catch:{ IOException -> 0x0199, all -> 0x0195 }
            java.lang.String r11 = "[NGA] S3AudioInput.s3MicSafeGuard"
            com.google.common.util.concurrent.cx r9 = r12.mo28208h(r11, r13, r15)     // Catch:{ IOException -> 0x0199, all -> 0x0195 }
            byte[] r11 = r2.f214050b     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            int r12 = r11.length     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            int r11 = r0.read(r11, r10, r12)     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            com.google.android.apps.gsa.nga.engine.recognition.j.a.r r12 = r2.f214051c     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            java.util.concurrent.atomic.AtomicReference r13 = r12.f214090h     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            com.google.android.libraries.f.a r12 = r12.f214091i     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            long r14 = r12.mo26872d()     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            j$.time.Duration r12 = p3186j$.time.Duration.ofNanos(r14)     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            r13.set(r12)     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            com.google.android.apps.gsa.nga.engine.recognition.k.a.b r12 = r2.f214060l     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            r12.mo72798c()     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            com.google.android.apps.gsa.shared.util.v.g r12 = r2.f214053e     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            com.google.android.apps.gsa.shared.m.f r13 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251582lY     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            long r12 = r12.mo85399d(r13)     // Catch:{ IOException -> 0x018f, all -> 0x0189 }
            r14 = 0
        L_0x0073:
            r15 = -1
            if (r11 == r15) goto L_0x016a
            r16 = r11
            long r10 = (long) r14
            int r17 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r17 >= 0) goto L_0x014b
            if (r16 == 0) goto L_0x012e
            byte[] r10 = r2.f214050b     // Catch:{ IOException -> 0x0128, all -> 0x0122 }
            com.google.android.apps.gsa.nga.engine.recognition.k.a.i r11 = r3.f214157a     // Catch:{ IOException -> 0x0128, all -> 0x0122 }
            java.lang.Object r11 = r11.f214159b     // Catch:{ IOException -> 0x0128, all -> 0x0122 }
            monitor-enter(r11)     // Catch:{ IOException -> 0x0128, all -> 0x0122 }
            com.google.android.apps.gsa.nga.engine.recognition.k.a.i r14 = r3.f214157a     // Catch:{ all -> 0x0118 }
            boolean r15 = r14.f214161d     // Catch:{ all -> 0x0118 }
            if (r15 == 0) goto L_0x0095
            monitor-exit(r11)     // Catch:{ all -> 0x0118 }
            r20 = r5
            r21 = r6
            r18 = r12
            r13 = r9
            goto L_0x00db
        L_0x0095:
            com.google.android.apps.gsa.nga.engine.recognition.k.a.j r14 = r14.f214160c     // Catch:{ all -> 0x0118 }
            r1 = r16
            r15 = 0
        L_0x009a:
            if (r1 <= 0) goto L_0x00ce
            r18 = r12
            long r12 = r14.f214165b     // Catch:{ all -> 0x0118 }
            int r12 = r14.mo72807c(r12)     // Catch:{ all -> 0x0118 }
            int r12 = java.lang.Math.min(r12, r1)     // Catch:{ all -> 0x0118 }
            byte[] r13 = r14.f214164a     // Catch:{ all -> 0x0118 }
            r20 = r5
            r21 = r6
            long r5 = r14.f214165b     // Catch:{ all -> 0x00cc }
            int r5 = r14.mo72805a(r5)     // Catch:{ all -> 0x00cc }
            java.lang.System.arraycopy(r10, r15, r13, r5, r12)     // Catch:{ all -> 0x00cc }
            long r5 = r14.f214165b     // Catch:{ all -> 0x00cc }
            r13 = r9
            r22 = r10
            long r9 = (long) r12
            long r5 = r5 + r9
            r14.f214165b = r5     // Catch:{ all -> 0x0120 }
            int r15 = r15 + r12
            int r1 = r1 - r12
            r9 = r13
            r12 = r18
            r5 = r20
            r6 = r21
            r10 = r22
            goto L_0x009a
        L_0x00cc:
            r0 = move-exception
            goto L_0x011d
        L_0x00ce:
            r20 = r5
            r21 = r6
            r18 = r12
            r13 = r9
            com.google.android.apps.gsa.nga.engine.recognition.k.a.i r1 = r3.f214157a     // Catch:{ all -> 0x0120 }
            r1.mo72804a()     // Catch:{ all -> 0x0120 }
            monitor-exit(r11)     // Catch:{ all -> 0x0120 }
        L_0x00db:
            byte[] r1 = r2.f214050b     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251044bQ     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            boolean r5 = r4.mo85405j(r5)     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            if (r5 == 0) goto L_0x00ec
            r11 = r16
            r5 = 0
            r8.write(r1, r5, r11)     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            goto L_0x00ee
        L_0x00ec:
            r11 = r16
        L_0x00ee:
            byte[] r1 = r2.f214050b     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            com.google.android.apps.gsa.nga.engine.recognition.k.a.b r5 = r2.f214060l     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            r5.mo72799d(r1, r11)     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            com.google.android.apps.gsa.nga.engine.recognition.k.a.b r1 = r2.f214060l     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            float r5 = r1.mo72796a()     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            r6 = 981668463(0x3a83126f, float:0.001)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x010a
            com.google.android.apps.gsa.nga.engine.recognition.k.a.a r1 = r2.f214056h     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            r5 = 0
            r1.mo72778b(r5, r5)     // Catch:{ IOException -> 0x0164, all -> 0x015e }
        L_0x0108:
            r14 = 0
            goto L_0x0137
        L_0x010a:
            com.google.android.apps.gsa.nga.engine.recognition.k.a.a r5 = r2.f214056h     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            float r6 = r1.mo72796a()     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            float r1 = r1.mo72797b()     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            r5.mo72778b(r6, r1)     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            goto L_0x0108
        L_0x0118:
            r0 = move-exception
            r20 = r5
            r21 = r6
        L_0x011d:
            r13 = r9
        L_0x011e:
            monitor-exit(r11)     // Catch:{ all -> 0x0120 }
            throw r0     // Catch:{ IOException -> 0x0164, all -> 0x015e }
        L_0x0120:
            r0 = move-exception
            goto L_0x011e
        L_0x0122:
            r0 = move-exception
            r13 = r9
            r1 = r5
            r5 = r6
            goto L_0x018d
        L_0x0128:
            r0 = move-exception
            r13 = r9
            r1 = r5
            r5 = r6
            goto L_0x0193
        L_0x012e:
            r20 = r5
            r21 = r6
            r18 = r12
            r13 = r9
            int r14 = r14 + 1
        L_0x0137:
            byte[] r1 = r2.f214050b     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            int r5 = r1.length     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            r6 = 0
            int r11 = r0.read(r1, r6, r5)     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            r1 = r23
            r9 = r13
            r12 = r18
            r5 = r20
            r6 = r21
            r10 = 0
            goto L_0x0073
        L_0x014b:
            r20 = r5
            r21 = r6
            r13 = r9
            com.google.common.f.a.d r0 = com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a.C77710h.f214049a     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            java.lang.String r1 = "NGA has received %d times 0 bytes from AudioRecord.read"
            r5 = 4379(0x111b, float:6.136E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r5)).mo56387q(r1, r14)     // Catch:{ IOException -> 0x0164, all -> 0x015e }
            goto L_0x016f
        L_0x015e:
            r0 = move-exception
            r1 = r20
            r5 = r21
            goto L_0x018d
        L_0x0164:
            r0 = move-exception
            r1 = r20
            r5 = r21
            goto L_0x0193
        L_0x016a:
            r20 = r5
            r21 = r6
            r13 = r9
        L_0x016f:
            if (r13 == 0) goto L_0x0175
            r1 = 0
            r13.cancel(r1)
        L_0x0175:
            r3.mo72803a()
            r1 = r20
            r5 = r21
        L_0x017c:
            com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a.C77712j.m124684a(r1, r5, r4, r8, r7)
            com.google.android.apps.gsa.nga.shared.s.h r0 = r2.f214064p
            com.google.android.apps.gsa.nga.engine.x.d r1 = r2.f214054f
            com.google.android.apps.gsa.nga.engine.b.g.ac r1 = r1.f218924a
            r0.mo75090a(r1)
            return
        L_0x0189:
            r0 = move-exception
            r1 = r5
            r5 = r6
            r13 = r9
        L_0x018d:
            r9 = r13
            goto L_0x01d3
        L_0x018f:
            r0 = move-exception
            r1 = r5
            r5 = r6
            r13 = r9
        L_0x0193:
            r9 = r13
            goto L_0x019c
        L_0x0195:
            r0 = move-exception
            r1 = r5
            r5 = r6
            goto L_0x01d3
        L_0x0199:
            r0 = move-exception
            r1 = r5
            r5 = r6
        L_0x019c:
            com.google.common.f.a.d r6 = com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a.C77710h.f214049a     // Catch:{ all -> 0x01d2 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x01d2 }
            com.google.common.f.a.a r6 = (com.google.common.p4526f.p4527a.C58970a) r6     // Catch:{ all -> 0x01d2 }
            com.google.common.f.x r6 = r6.mo56382g(r0)     // Catch:{ all -> 0x01d2 }
            com.google.common.f.a.a r6 = (com.google.common.p4526f.p4527a.C58970a) r6     // Catch:{ all -> 0x01d2 }
            r10 = 4376(0x1118, float:6.132E-42)
            com.google.common.f.x r6 = r6.mo56372aa(r10)     // Catch:{ all -> 0x01d2 }
            com.google.common.f.a.a r6 = (com.google.common.p4526f.p4527a.C58970a) r6     // Catch:{ all -> 0x01d2 }
            java.lang.String r10 = "S3 failed reading audio."
            r6.mo56386p(r10)     // Catch:{ all -> 0x01d2 }
            boolean r0 = r0 instanceof com.google.android.libraries.search.p2904c.p2951n.C37901c     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x01c8
            com.google.android.apps.gsa.nga.engine.recognition.k.a r0 = r2.f214059k     // Catch:{ all -> 0x01d2 }
            com.google.android.apps.gsa.nga.engine.recognition.u r6 = com.google.android.apps.gsa.nga.engine.recognition.C77889u.S3     // Catch:{ all -> 0x01d2 }
            com.google.android.apps.gsa.nga.engine.recognition.as r10 = r2.f214055g     // Catch:{ all -> 0x01d2 }
            int r10 = r10.mo72690m()     // Catch:{ all -> 0x01d2 }
            r0.mo72793h(r6, r10)     // Catch:{ all -> 0x01d2 }
        L_0x01c8:
            if (r9 == 0) goto L_0x01ce
            r6 = 0
            r9.cancel(r6)
        L_0x01ce:
            r3.mo72803a()
            goto L_0x017c
        L_0x01d2:
            r0 = move-exception
        L_0x01d3:
            if (r9 == 0) goto L_0x01d9
            r6 = 0
            r9.cancel(r6)
        L_0x01d9:
            r3.mo72803a()
            com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a.C77712j.m124684a(r1, r5, r4, r8, r7)
            com.google.android.apps.gsa.nga.shared.s.h r1 = r2.f214064p
            com.google.android.apps.gsa.nga.engine.x.d r2 = r2.f214054f
            com.google.android.apps.gsa.nga.engine.b.g.ac r2 = r2.f218924a
            r1.mo75090a(r2)
            goto L_0x01ea
        L_0x01e9:
            throw r0
        L_0x01ea:
            goto L_0x01e9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a.C77707e.run():void");
    }
}
