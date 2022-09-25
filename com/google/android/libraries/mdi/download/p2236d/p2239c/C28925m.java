package com.google.android.libraries.mdi.download.p2236d.p2239c;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.C29292lr;
import com.google.android.libraries.mdi.download.p2236d.C29293ls;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.d.c.m */
/* compiled from: PG */
public final class C28925m implements C28932t {

    /* renamed from: a */
    private final C29293ls f78569a;

    /* renamed from: b */
    private final C42813k f78570b;

    /* renamed from: c */
    private final C29328dl f78571c;

    /* renamed from: d */
    private final String f78572d;

    /* renamed from: e */
    private final C29037d f78573e;

    /* renamed from: f */
    private final C29392ep f78574f;

    /* renamed from: g */
    private final int f78575g;

    /* renamed from: h */
    private final long f78576h;

    /* renamed from: i */
    private final String f78577i;

    /* renamed from: j */
    private final C28787cb f78578j;

    /* renamed from: k */
    private final Executor f78579k;

    /* renamed from: l */
    private final int f78580l;

    public C28925m(C29293ls lsVar, C42813k kVar, C29328dl dlVar, int i, C29037d dVar, C29392ep epVar, int i2, long j, String str, C28787cb cbVar, Executor executor) {
        this.f78569a = lsVar;
        this.f78570b = kVar;
        this.f78571c = dlVar;
        this.f78580l = i;
        this.f78572d = C29099m.m54009e(dlVar);
        this.f78573e = dVar;
        this.f78574f = epVar;
        this.f78575g = i2;
        this.f78576h = j;
        this.f78577i = str;
        this.f78578j = cbVar;
        this.f78579k = executor;
    }

    /* renamed from: c */
    static C60870cx m53839c(C29293ls lsVar, C29328dl dlVar, int i, C42813k kVar, Uri uri, String str, C29037d dVar, C28787cb cbVar, Executor executor) {
        return C29670b.m54719g(m53841e(lsVar, C29292lr.m54176a(dlVar, i), executor)).mo34822i(new C28919g(cbVar, str, dVar, kVar, uri), executor);
    }

    /* renamed from: d */
    static C60870cx m53840d(C29390en enVar, C29328dl dlVar, int i, C29293ls lsVar, Executor executor) {
        C29398ev a = C29292lr.m54176a(dlVar, i);
        return C29670b.m54719g(m53841e(lsVar, a, executor)).mo34822i(new C28923k(enVar, lsVar, a), executor).mo34822i(new C28924l(a), executor);
    }

    /* renamed from: e */
    private static C60870cx m53841e(C29293ls lsVar, C29398ev evVar, Executor executor) {
        return C60922j.m93045h(lsVar.mo34620e(evVar), C47810es.m84966f(new C28920h(evVar)), executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016e, code lost:
        r14 = r0.mo45887a(r2);
        r17 = r0.mo45887a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0178, code lost:
        if (r14 <= r17) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017a, code lost:
        r7 = (com.google.common.p4552o.p4566l.C60125aq) com.google.common.p4552o.p4566l.C60126ar.f162612j.createBuilder();
        r6 = r5.f79682b;
        r7.copyOnWrite();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0189, code lost:
        r19 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r2 = (com.google.common.p4552o.p4566l.C60126ar) r7.instance;
        r6.getClass();
        r2.f162614a |= 1;
        r2.f162615b = r6;
        r7.copyOnWrite();
        r1 = (com.google.common.p4552o.p4566l.C60126ar) r7.instance;
        r1.f162614a |= 2;
        r1.f162616c = r9;
        r7.copyOnWrite();
        r1 = (com.google.common.p4552o.p4566l.C60126ar) r7.instance;
        r1.f162614a |= 64;
        r1.f162621h = r10;
        r7.copyOnWrite();
        r1 = (com.google.common.p4552o.p4566l.C60126ar) r7.instance;
        r12.getClass();
        r1.f162614a |= 128;
        r1.f162622i = r12;
        r1 = r5.f79683c;
        r7.copyOnWrite();
        r2 = (com.google.common.p4552o.p4566l.C60126ar) r7.instance;
        r1.getClass();
        r2.f162614a |= 4;
        r2.f162617d = r1;
        r8.mo34547l((com.google.common.p4552o.p4566l.C60126ar) r7.build(), 3, r14, r17, r13.f79473b, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0202, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0222, code lost:
        if (r0 != 2) goto L_0x0224;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0220 A[Catch:{ bp -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0221 A[Catch:{ bp -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0234 A[Catch:{ bp -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0236 A[Catch:{ bp -> 0x02b7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo34506a(android.net.Uri r21) {
        /*
            r20 = this;
            r1 = r20
            r6 = r21
            java.lang.String r0 = r1.f78572d
            java.lang.String r2 = "%s: Successfully downloaded file %s"
            java.lang.String r3 = "DownloaderCallbackImpl"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53931c(r2, r3, r0)
            com.google.android.libraries.mdi.download.dl r0 = r1.f78571c
            int r2 = r0.f79472a
            r2 = r2 & 32
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = r0.f79479h
            goto L_0x001a
        L_0x0018:
            java.lang.String r2 = r0.f79477f
        L_0x001a:
            com.google.android.libraries.storage.a.k r4 = r1.f78570b     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.p2236d.p2239c.C28927o.m53848c(r4, r0, r6, r2)     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.dl r0 = r1.f78571c     // Catch:{ bp -> 0x02b7 }
            int r0 = r0.f79472a     // Catch:{ bp -> 0x02b7 }
            r0 = r0 & 32
            if (r0 == 0) goto L_0x02a8
            if (r0 == 0) goto L_0x02a8
            android.net.Uri r2 = com.google.android.libraries.mdi.download.p2236d.p2239c.C28926n.m53844a(r21)     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.dl r0 = r1.f78571c     // Catch:{ bp -> 0x02b7 }
            boolean r0 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m.m54011g(r0)     // Catch:{ bp -> 0x02b7 }
            r7 = 1
            if (r0 == 0) goto L_0x0101
            com.google.android.libraries.mdi.download.d.e.d r8 = r1.f78573e     // Catch:{ bp -> 0x0286 }
            com.google.android.libraries.storage.a.k r0 = r1.f78570b     // Catch:{ bp -> 0x0286 }
            com.google.android.libraries.mdi.download.ep r9 = r1.f78574f     // Catch:{ bp -> 0x0286 }
            int r10 = r1.f78575g     // Catch:{ bp -> 0x0286 }
            long r11 = r1.f78576h     // Catch:{ bp -> 0x0286 }
            java.lang.String r13 = r1.f78577i     // Catch:{ bp -> 0x0286 }
            com.google.android.libraries.mdi.download.dl r14 = r1.f78571c     // Catch:{ bp -> 0x0286 }
            java.lang.String r15 = r14.f79473b     // Catch:{ bp -> 0x0286 }
            com.google.android.libraries.mdi.download.d.c.w r14 = new com.google.android.libraries.mdi.download.d.c.w     // Catch:{ IOException -> 0x00e3 }
            r14.<init>(r2)     // Catch:{ IOException -> 0x00e3 }
            r0.mo45889c(r6, r14)     // Catch:{ IOException -> 0x00e3 }
            com.google.common.o.l.ar r14 = com.google.common.p4552o.p4566l.C60126ar.f162612j     // Catch:{ IOException -> 0x00d1 }
            com.google.protobuf.bn r14 = r14.createBuilder()     // Catch:{ IOException -> 0x00d1 }
            com.google.common.o.l.aq r14 = (com.google.common.p4552o.p4566l.C60125aq) r14     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r4 = r9.f79682b     // Catch:{ IOException -> 0x00d1 }
            r14.copyOnWrite()     // Catch:{ IOException -> 0x00d1 }
            com.google.protobuf.bv r5 = r14.instance     // Catch:{ IOException -> 0x00d1 }
            com.google.common.o.l.ar r5 = (com.google.common.p4552o.p4566l.C60126ar) r5     // Catch:{ IOException -> 0x00d1 }
            r4.getClass()     // Catch:{ IOException -> 0x00d1 }
            int r1 = r5.f162614a     // Catch:{ IOException -> 0x00d1 }
            r1 = r1 | r7
            r5.f162614a = r1     // Catch:{ IOException -> 0x00d1 }
            r5.f162615b = r4     // Catch:{ IOException -> 0x00d1 }
            r14.copyOnWrite()     // Catch:{ IOException -> 0x00d1 }
            com.google.protobuf.bv r1 = r14.instance     // Catch:{ IOException -> 0x00d1 }
            com.google.common.o.l.ar r1 = (com.google.common.p4552o.p4566l.C60126ar) r1     // Catch:{ IOException -> 0x00d1 }
            int r4 = r1.f162614a     // Catch:{ IOException -> 0x00d1 }
            r5 = 2
            r4 = r4 | r5
            r1.f162614a = r4     // Catch:{ IOException -> 0x00d1 }
            r1.f162616c = r10     // Catch:{ IOException -> 0x00d1 }
            r14.copyOnWrite()     // Catch:{ IOException -> 0x00d1 }
            com.google.protobuf.bv r1 = r14.instance     // Catch:{ IOException -> 0x00d1 }
            com.google.common.o.l.ar r1 = (com.google.common.p4552o.p4566l.C60126ar) r1     // Catch:{ IOException -> 0x00d1 }
            int r4 = r1.f162614a     // Catch:{ IOException -> 0x00d1 }
            r4 = r4 | 64
            r1.f162614a = r4     // Catch:{ IOException -> 0x00d1 }
            r1.f162621h = r11     // Catch:{ IOException -> 0x00d1 }
            r14.copyOnWrite()     // Catch:{ IOException -> 0x00d1 }
            com.google.protobuf.bv r1 = r14.instance     // Catch:{ IOException -> 0x00d1 }
            com.google.common.o.l.ar r1 = (com.google.common.p4552o.p4566l.C60126ar) r1     // Catch:{ IOException -> 0x00d1 }
            r13.getClass()     // Catch:{ IOException -> 0x00d1 }
            int r4 = r1.f162614a     // Catch:{ IOException -> 0x00d1 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r1.f162614a = r4     // Catch:{ IOException -> 0x00d1 }
            r1.f162622i = r13     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r1 = r9.f79683c     // Catch:{ IOException -> 0x00d1 }
            r14.copyOnWrite()     // Catch:{ IOException -> 0x00d1 }
            com.google.protobuf.bv r4 = r14.instance     // Catch:{ IOException -> 0x00d1 }
            com.google.common.o.l.ar r4 = (com.google.common.p4552o.p4566l.C60126ar) r4     // Catch:{ IOException -> 0x00d1 }
            r1.getClass()     // Catch:{ IOException -> 0x00d1 }
            int r5 = r4.f162614a     // Catch:{ IOException -> 0x00d1 }
            r5 = r5 | 4
            r4.f162614a = r5     // Catch:{ IOException -> 0x00d1 }
            r4.f162617d = r1     // Catch:{ IOException -> 0x00d1 }
            com.google.protobuf.bv r1 = r14.build()     // Catch:{ IOException -> 0x00d1 }
            r9 = r1
            com.google.common.o.l.ar r9 = (com.google.common.p4552o.p4566l.C60126ar) r9     // Catch:{ IOException -> 0x00d1 }
            com.google.android.libraries.storage.a.f.q r1 = new com.google.android.libraries.storage.a.f.q     // Catch:{ IOException -> 0x00d1 }
            r1.<init>()     // Catch:{ IOException -> 0x00d1 }
            java.lang.Object r1 = r0.mo45889c(r2, r1)     // Catch:{ IOException -> 0x00d1 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IOException -> 0x00d1 }
            long r11 = r1.longValue()     // Catch:{ IOException -> 0x00d1 }
            r10 = 5
            long r13 = r0.mo45887a(r6)     // Catch:{ IOException -> 0x00d1 }
            r16 = 0
            r8.mo34547l(r9, r10, r11, r13, r15, r16)     // Catch:{ IOException -> 0x00d1 }
            r0.mo45892f(r6)     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00df
        L_0x00d1:
            r0 = move-exception
            java.lang.String r1 = "%s: Failed to get file size or delete zip file %s."
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ bp -> 0x0286 }
            r4 = 0
            r2[r4] = r3     // Catch:{ bp -> 0x0286 }
            r2[r7] = r6     // Catch:{ bp -> 0x0286 }
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53933e(r0, r1, r2)     // Catch:{ bp -> 0x0286 }
        L_0x00df:
            r1 = r20
            goto L_0x02a8
        L_0x00e3:
            r0 = move-exception
            java.lang.String r1 = "%s: Failed to apply zip download transform for file %s."
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ bp -> 0x0286 }
            r4 = 0
            r2[r4] = r3     // Catch:{ bp -> 0x0286 }
            r2[r7] = r6     // Catch:{ bp -> 0x0286 }
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53938j(r0, r1, r2)     // Catch:{ bp -> 0x0286 }
            com.google.android.libraries.mdi.download.bn r1 = new com.google.android.libraries.mdi.download.bn     // Catch:{ bp -> 0x0286 }
            r1.<init>()     // Catch:{ bp -> 0x0286 }
            com.google.android.libraries.mdi.download.bo r2 = com.google.android.libraries.mdi.download.C28737bo.DOWNLOAD_TRANSFORM_IO_ERROR     // Catch:{ bp -> 0x0286 }
            r1.f78062a = r2     // Catch:{ bp -> 0x0286 }
            r1.f78064c = r0     // Catch:{ bp -> 0x0286 }
            com.google.android.libraries.mdi.download.bp r0 = r1.mo34334a()     // Catch:{ bp -> 0x0286 }
            throw r0     // Catch:{ bp -> 0x0286 }
        L_0x0101:
            android.net.Uri$Builder r0 = r21.buildUpon()     // Catch:{ IllegalArgumentException -> 0x028a }
            r1 = r20
            com.google.android.libraries.mdi.download.dl r4 = r1.f78571c     // Catch:{ IllegalArgumentException -> 0x0284 }
            com.google.bz.b.n r4 = r4.f79478g     // Catch:{ IllegalArgumentException -> 0x0284 }
            if (r4 != 0) goto L_0x010f
            com.google.bz.b.n r4 = com.google.p4433bz.p4437b.C57909n.f154891b     // Catch:{ IllegalArgumentException -> 0x0284 }
        L_0x010f:
            java.lang.String r4 = com.google.android.libraries.storage.p3304a.p3314h.C42810d.m75633a(r4)     // Catch:{ IllegalArgumentException -> 0x0284 }
            android.net.Uri$Builder r0 = r0.encodedFragment(r4)     // Catch:{ IllegalArgumentException -> 0x0284 }
            android.net.Uri r4 = r0.build()     // Catch:{ IllegalArgumentException -> 0x0284 }
            com.google.android.libraries.mdi.download.d.e.d r8 = r1.f78573e     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.storage.a.k r0 = r1.f78570b     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.ep r5 = r1.f78574f     // Catch:{ bp -> 0x02b7 }
            int r9 = r1.f78575g     // Catch:{ bp -> 0x02b7 }
            long r10 = r1.f78576h     // Catch:{ bp -> 0x02b7 }
            java.lang.String r12 = r1.f78577i     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.dl r13 = r1.f78571c     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.storage.a.f.n r14 = new com.google.android.libraries.storage.a.f.n     // Catch:{ IOException -> 0x0265 }
            r14.<init>()     // Catch:{ IOException -> 0x0265 }
            java.lang.Object r14 = r0.mo45889c(r4, r14)     // Catch:{ IOException -> 0x0265 }
            java.io.InputStream r14 = (java.io.InputStream) r14     // Catch:{ IOException -> 0x0265 }
            com.google.android.libraries.storage.a.f.t r15 = new com.google.android.libraries.storage.a.f.t     // Catch:{ all -> 0x0257 }
            r15.<init>()     // Catch:{ all -> 0x0257 }
            java.lang.Object r15 = r0.mo45889c(r2, r15)     // Catch:{ all -> 0x0257 }
            java.io.OutputStream r15 = (java.io.OutputStream) r15     // Catch:{ all -> 0x0257 }
            com.google.common.p4541l.C59332o.m92211b(r14, r15)     // Catch:{ all -> 0x0249 }
            if (r15 == 0) goto L_0x0147
            r15.close()     // Catch:{ all -> 0x0257 }
        L_0x0147:
            if (r14 == 0) goto L_0x014c
            r14.close()     // Catch:{ IOException -> 0x0265 }
        L_0x014c:
            int r14 = r13.f79472a     // Catch:{ IOException -> 0x0204 }
            r14 = r14 & 32
            if (r14 == 0) goto L_0x01fa
            com.google.bz.b.n r14 = r13.f79478g     // Catch:{ IOException -> 0x0204 }
            if (r14 != 0) goto L_0x0158
            com.google.bz.b.n r14 = com.google.p4433bz.p4437b.C57909n.f154891b     // Catch:{  }
        L_0x0158:
            com.google.protobuf.cq r14 = r14.f154893a     // Catch:{ IOException -> 0x0204 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ IOException -> 0x0204 }
        L_0x015e:
            boolean r15 = r14.hasNext()     // Catch:{ IOException -> 0x0204 }
            if (r15 == 0) goto L_0x01fa
            java.lang.Object r15 = r14.next()     // Catch:{ IOException -> 0x0204 }
            com.google.bz.b.l r15 = (com.google.p4433bz.p4437b.C57907l) r15     // Catch:{ IOException -> 0x0204 }
            int r15 = r15.f154889a     // Catch:{ IOException -> 0x0204 }
            if (r15 != r7) goto L_0x01f4
            long r14 = r0.mo45887a(r2)     // Catch:{ IOException -> 0x0204 }
            long r17 = r0.mo45887a(r4)     // Catch:{ IOException -> 0x0204 }
            int r16 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r16 <= 0) goto L_0x01fa
            com.google.common.o.l.ar r16 = com.google.common.p4552o.p4566l.C60126ar.f162612j     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bn r16 = r16.createBuilder()     // Catch:{ IOException -> 0x0204 }
            r7 = r16
            com.google.common.o.l.aq r7 = (com.google.common.p4552o.p4566l.C60125aq) r7     // Catch:{ IOException -> 0x0204 }
            java.lang.String r6 = r5.f79682b     // Catch:{ IOException -> 0x0204 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0204 }
            r19 = r2
            com.google.protobuf.bv r2 = r7.instance     // Catch:{ IOException -> 0x0202 }
            com.google.common.o.l.ar r2 = (com.google.common.p4552o.p4566l.C60126ar) r2     // Catch:{ IOException -> 0x0202 }
            r6.getClass()     // Catch:{ IOException -> 0x0202 }
            int r1 = r2.f162614a     // Catch:{ IOException -> 0x0202 }
            r16 = 1
            r1 = r1 | 1
            r2.f162614a = r1     // Catch:{ IOException -> 0x0202 }
            r2.f162615b = r6     // Catch:{ IOException -> 0x0202 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0202 }
            com.google.protobuf.bv r1 = r7.instance     // Catch:{ IOException -> 0x0202 }
            com.google.common.o.l.ar r1 = (com.google.common.p4552o.p4566l.C60126ar) r1     // Catch:{ IOException -> 0x0202 }
            int r2 = r1.f162614a     // Catch:{ IOException -> 0x0202 }
            r6 = 2
            r2 = r2 | r6
            r1.f162614a = r2     // Catch:{ IOException -> 0x0202 }
            r1.f162616c = r9     // Catch:{ IOException -> 0x0202 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0202 }
            com.google.protobuf.bv r1 = r7.instance     // Catch:{ IOException -> 0x0202 }
            com.google.common.o.l.ar r1 = (com.google.common.p4552o.p4566l.C60126ar) r1     // Catch:{ IOException -> 0x0202 }
            int r2 = r1.f162614a     // Catch:{ IOException -> 0x0202 }
            r2 = r2 | 64
            r1.f162614a = r2     // Catch:{ IOException -> 0x0202 }
            r1.f162621h = r10     // Catch:{ IOException -> 0x0202 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0202 }
            com.google.protobuf.bv r1 = r7.instance     // Catch:{ IOException -> 0x0202 }
            com.google.common.o.l.ar r1 = (com.google.common.p4552o.p4566l.C60126ar) r1     // Catch:{ IOException -> 0x0202 }
            r12.getClass()     // Catch:{ IOException -> 0x0202 }
            int r2 = r1.f162614a     // Catch:{ IOException -> 0x0202 }
            r2 = r2 | 128(0x80, float:1.794E-43)
            r1.f162614a = r2     // Catch:{ IOException -> 0x0202 }
            r1.f162622i = r12     // Catch:{ IOException -> 0x0202 }
            java.lang.String r1 = r5.f79683c     // Catch:{ IOException -> 0x0202 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0202 }
            com.google.protobuf.bv r2 = r7.instance     // Catch:{ IOException -> 0x0202 }
            com.google.common.o.l.ar r2 = (com.google.common.p4552o.p4566l.C60126ar) r2     // Catch:{ IOException -> 0x0202 }
            r1.getClass()     // Catch:{ IOException -> 0x0202 }
            int r5 = r2.f162614a     // Catch:{ IOException -> 0x0202 }
            r5 = r5 | 4
            r2.f162614a = r5     // Catch:{ IOException -> 0x0202 }
            r2.f162617d = r1     // Catch:{ IOException -> 0x0202 }
            com.google.protobuf.bv r1 = r7.build()     // Catch:{ IOException -> 0x0202 }
            r9 = r1
            com.google.common.o.l.ar r9 = (com.google.common.p4552o.p4566l.C60126ar) r9     // Catch:{ IOException -> 0x0202 }
            java.lang.String r1 = r13.f79473b     // Catch:{ IOException -> 0x0202 }
            r10 = 3
            r16 = 0
            r11 = r14
            r13 = r17
            r15 = r1
            r8.mo34547l(r9, r10, r11, r13, r15, r16)     // Catch:{ IOException -> 0x0202 }
            goto L_0x01fc
        L_0x01f4:
            r1 = r20
            r6 = r21
            goto L_0x015e
        L_0x01fa:
            r19 = r2
        L_0x01fc:
            r0.mo45892f(r4)     // Catch:{ IOException -> 0x0202 }
        L_0x01ff:
            r1 = r20
            goto L_0x0216
        L_0x0202:
            r0 = move-exception
            goto L_0x0207
        L_0x0204:
            r0 = move-exception
            r19 = r2
        L_0x0207:
            java.lang.String r1 = "%s: Failed to get file size or delete compress file %s."
            r2 = 2
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ bp -> 0x0286 }
            r2 = 0
            r5[r2] = r3     // Catch:{ bp -> 0x0286 }
            r2 = 1
            r5[r2] = r4     // Catch:{ bp -> 0x0286 }
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53933e(r0, r1, r5)     // Catch:{ bp -> 0x0286 }
            goto L_0x01ff
        L_0x0216:
            com.google.android.libraries.mdi.download.dl r0 = r1.f78571c     // Catch:{ bp -> 0x02b7 }
            int r0 = r0.f79476e     // Catch:{ bp -> 0x02b7 }
            int r0 = com.google.android.libraries.mdi.download.C29327dk.m54216a(r0)     // Catch:{ bp -> 0x02b7 }
            if (r0 != 0) goto L_0x0221
            goto L_0x0224
        L_0x0221:
            r2 = 2
            if (r0 == r2) goto L_0x02a8
        L_0x0224:
            com.google.android.libraries.storage.a.k r0 = r1.f78570b     // Catch:{ bp -> 0x02b7 }
            java.lang.String r2 = r1.f78572d     // Catch:{ bp -> 0x02b7 }
            r4 = r19
            java.lang.String r0 = com.google.android.libraries.mdi.download.p2236d.p2239c.C28927o.m53847b(r0, r4)     // Catch:{ bp -> 0x02b7 }
            boolean r0 = r0.equals(r2)     // Catch:{ bp -> 0x02b7 }
            if (r0 == 0) goto L_0x0236
            goto L_0x02a8
        L_0x0236:
            java.lang.String r0 = "%s: Final file checksum verification failed. %s."
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53936h(r0, r3, r4)     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.bn r0 = new com.google.android.libraries.mdi.download.bn     // Catch:{ bp -> 0x02b7 }
            r0.<init>()     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.bo r2 = com.google.android.libraries.mdi.download.C28737bo.FINAL_FILE_CHECKSUM_MISMATCH_ERROR     // Catch:{ bp -> 0x02b7 }
            r0.f78062a = r2     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.bp r0 = r0.mo34334a()     // Catch:{ bp -> 0x02b7 }
            throw r0     // Catch:{ bp -> 0x02b7 }
        L_0x0249:
            r0 = move-exception
            r2 = r0
            if (r15 == 0) goto L_0x0256
            r15.close()     // Catch:{ all -> 0x0251 }
            goto L_0x0256
        L_0x0251:
            r0 = move-exception
            r5 = r0
            com.google.android.libraries.mdi.download.p2236d.p2239c.C28918f.m53838a(r2, r5)     // Catch:{ all -> 0x0257 }
        L_0x0256:
            throw r2     // Catch:{ all -> 0x0257 }
        L_0x0257:
            r0 = move-exception
            r2 = r0
            if (r14 == 0) goto L_0x0264
            r14.close()     // Catch:{ all -> 0x025f }
            goto L_0x0264
        L_0x025f:
            r0 = move-exception
            r5 = r0
            com.google.android.libraries.mdi.download.p2236d.p2239c.C28918f.m53838a(r2, r5)     // Catch:{ IOException -> 0x0265 }
        L_0x0264:
            throw r2     // Catch:{ IOException -> 0x0265 }
        L_0x0265:
            r0 = move-exception
            java.lang.String r2 = "%s: Failed to apply download transform for file %s."
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ bp -> 0x02b7 }
            r6 = 0
            r5[r6] = r3     // Catch:{ bp -> 0x02b7 }
            r3 = 1
            r5[r3] = r4     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53938j(r0, r2, r5)     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.bn r2 = new com.google.android.libraries.mdi.download.bn     // Catch:{ bp -> 0x02b7 }
            r2.<init>()     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.bo r3 = com.google.android.libraries.mdi.download.C28737bo.DOWNLOAD_TRANSFORM_IO_ERROR     // Catch:{ bp -> 0x02b7 }
            r2.f78062a = r3     // Catch:{ bp -> 0x02b7 }
            r2.f78064c = r0     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.bp r0 = r2.mo34334a()     // Catch:{ bp -> 0x02b7 }
            throw r0     // Catch:{ bp -> 0x02b7 }
        L_0x0284:
            r0 = move-exception
            goto L_0x028d
        L_0x0286:
            r0 = move-exception
            r1 = r20
            goto L_0x02b8
        L_0x028a:
            r0 = move-exception
            r1 = r20
        L_0x028d:
            java.lang.String r2 = "%s: Exception while trying to serialize download transform"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ bp -> 0x02b7 }
            r5 = 0
            r4[r5] = r3     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53938j(r0, r2, r4)     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.bn r2 = new com.google.android.libraries.mdi.download.bn     // Catch:{ bp -> 0x02b7 }
            r2.<init>()     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.bo r3 = com.google.android.libraries.mdi.download.C28737bo.UNABLE_TO_SERIALIZE_DOWNLOAD_TRANSFORM_ERROR     // Catch:{ bp -> 0x02b7 }
            r2.f78062a = r3     // Catch:{ bp -> 0x02b7 }
            r2.f78064c = r0     // Catch:{ bp -> 0x02b7 }
            com.google.android.libraries.mdi.download.bp r0 = r2.mo34334a()     // Catch:{ bp -> 0x02b7 }
            throw r0     // Catch:{ bp -> 0x02b7 }
        L_0x02a8:
            com.google.android.libraries.mdi.download.en r0 = com.google.android.libraries.mdi.download.C29390en.DOWNLOAD_COMPLETE
            com.google.android.libraries.mdi.download.dl r2 = r1.f78571c
            int r3 = r1.f78580l
            com.google.android.libraries.mdi.download.d.ls r4 = r1.f78569a
            java.util.concurrent.Executor r5 = r1.f78579k
            com.google.common.util.concurrent.cx r0 = m53840d(r0, r2, r3, r4, r5)
            return r0
        L_0x02b7:
            r0 = move-exception
        L_0x02b8:
            com.google.android.libraries.mdi.download.bo r2 = r0.f78134a
            com.google.android.libraries.mdi.download.bo r3 = com.google.android.libraries.mdi.download.C28737bo.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02f5
            com.google.android.libraries.mdi.download.d.ls r2 = r1.f78569a
            com.google.android.libraries.mdi.download.dl r3 = r1.f78571c
            int r4 = r1.f78580l
            com.google.android.libraries.storage.a.k r5 = r1.f78570b
            java.lang.String r7 = r1.f78572d
            com.google.android.libraries.mdi.download.d.e.d r8 = r1.f78573e
            com.google.android.libraries.mdi.download.cb r9 = r1.f78578j
            java.util.concurrent.Executor r10 = r1.f78579k
            r6 = r21
            com.google.common.util.concurrent.cx r2 = m53839c(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.google.android.libraries.mdi.download.l.b r2 = com.google.android.libraries.mdi.download.p2257l.C29670b.m54719g(r2)
            com.google.android.libraries.mdi.download.d.c.i r3 = new com.google.android.libraries.mdi.download.d.c.i
            r3.<init>(r0)
            java.util.concurrent.Executor r4 = r1.f78579k
            java.lang.Class<java.io.IOException> r5 = java.io.IOException.class
            com.google.android.libraries.mdi.download.l.b r2 = r2.mo34820f(r5, r3, r4)
            com.google.android.libraries.mdi.download.d.c.j r3 = new com.google.android.libraries.mdi.download.d.c.j
            r3.<init>(r0)
            java.util.concurrent.Executor r0 = r1.f78579k
            com.google.android.libraries.mdi.download.l.b r0 = r2.mo34822i(r3, r0)
            return r0
        L_0x02f5:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.download.p2236d.p2239c.C28925m.mo34506a(android.net.Uri):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo34507b(C28738bp bpVar) {
        C29045l.m53931c("%s: Failed to download file %s", "DownloaderCallbackImpl", this.f78572d);
        if (bpVar.f78134a.equals(C28737bo.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
            return m53840d(C29390en.CORRUPTED, this.f78571c, this.f78580l, this.f78569a, this.f78579k);
        }
        return m53840d(C29390en.DOWNLOAD_FAILED, this.f78571c, this.f78580l, this.f78569a, this.f78579k);
    }
}
