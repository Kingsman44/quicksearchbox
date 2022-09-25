package com.google.android.libraries.notifications.platform.entrypoints.job.p2316a.p2317a;

import androidx.work.C4632m;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.notifications.platform.entrypoints.job.handler.impl.GnpWorkerHandlerImpl$doWork$2", mo61344c = "GnpWorkerHandlerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.libraries.notifications.platform.entrypoints.job.a.a.b */
/* compiled from: PG */
final class C30100b extends C69572j implements C69630p {

    /* renamed from: a */
    Object f81427a;

    /* renamed from: b */
    Object f81428b;

    /* renamed from: c */
    Object f81429c;

    /* renamed from: d */
    int f81430d;

    /* renamed from: e */
    final /* synthetic */ C30101c f81431e;

    /* renamed from: f */
    final /* synthetic */ C4632m f81432f;

    /* renamed from: g */
    final /* synthetic */ int f81433g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30100b(C30101c cVar, C4632m mVar, int i, C69577g gVar) {
        super(2, gVar);
        this.f81431e = cVar;
        this.f81432f = mVar;
        this.f81433g = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C30100b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.google.apps.tiktok.tracing.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.google.apps.tiktok.tracing.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.google.apps.tiktok.tracing.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.google.apps.tiktok.tracing.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.google.apps.tiktok.tracing.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.google.apps.tiktok.tracing.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.google.apps.tiktok.tracing.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: com.google.apps.tiktok.tracing.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: com.google.apps.tiktok.tracing.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.google.apps.tiktok.tracing.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: com.google.apps.tiktok.tracing.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: com.google.apps.tiktok.tracing.ax} */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012d, code lost:
        p5462h.p5472e.C69598b.m101013a(r6, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0130, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086 A[SYNTHETIC, Splitter:B:27:0x0086] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r12.f81430d
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0018
            java.lang.Object r0 = r12.f81429c
            java.lang.Object r1 = r12.f81428b
            java.lang.Object r6 = r12.f81427a
            p5462h.C69714l.m101134b(r13)     // Catch:{ all -> 0x0015 }
            goto L_0x00bb
        L_0x0015:
            r13 = move-exception
            goto L_0x012b
        L_0x0018:
            p5462h.C69714l.m101134b(r13)
            com.google.android.libraries.notifications.platform.entrypoints.job.a.a.c r13 = r12.f81431e
            com.google.android.libraries.notifications.platform.i.c.a r13 = r13.f81435b
            com.google.apps.tiktok.tracing.dh r13 = r13.f81524a
            java.lang.String r1 = "GnpWorker"
            com.google.apps.tiktok.tracing.ax r6 = r13.mo51613c(r1)
            androidx.work.m r13 = r12.f81432f
            com.google.android.libraries.notifications.platform.entrypoints.job.a.a.c r1 = r12.f81431e
            int r7 = r12.f81433g
            java.lang.String r8 = "com.google.android.libraries.notifications.platform.JOB_ID"
            java.lang.String r8 = r13.mo9567b(r8)     // Catch:{ all -> 0x0015 }
            if (r8 != 0) goto L_0x0037
            java.lang.String r8 = ""
        L_0x0037:
            java.lang.String r9 = "com.google.android.libraries.notifications.platform.JOB_KEY"
            java.lang.String r9 = r13.mo9567b(r9)     // Catch:{ all -> 0x0015 }
            java.lang.String r10 = "com.google.android.libraries.notifications.platform.WORKER_PARAMS"
            java.lang.String r11 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r11)     // Catch:{ all -> 0x0015 }
            byte[] r13 = r13.mo9569d(r10)     // Catch:{ all -> 0x0015 }
            if (r13 == 0) goto L_0x0069
            int r10 = r13.length     // Catch:{ all -> 0x0015 }
            if (r10 != 0) goto L_0x004e
            goto L_0x0069
        L_0x004e:
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ all -> 0x0015 }
            r11.unmarshall(r13, r4, r10)     // Catch:{ all -> 0x0015 }
            r11.setDataPosition(r4)     // Catch:{ all -> 0x0015 }
            java.lang.String r13 = "obtain().apply {\n       …etDataPosition(0)\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r13)     // Catch:{ all -> 0x0015 }
            android.os.Bundle r13 = new android.os.Bundle     // Catch:{ all -> 0x0015 }
            r13.<init>()     // Catch:{ all -> 0x0015 }
            r13.readFromParcel(r11)     // Catch:{ all -> 0x0015 }
            r11.recycle()     // Catch:{ all -> 0x0015 }
            goto L_0x006e
        L_0x0069:
            android.os.Bundle r13 = new android.os.Bundle     // Catch:{ all -> 0x0015 }
            r13.<init>()     // Catch:{ all -> 0x0015 }
        L_0x006e:
            java.lang.String r10 = "GnpWorkerHandlerImpl"
            if (r9 != 0) goto L_0x0086
            java.lang.String r13 = "Job key is null. Job ID: %s."
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0015 }
            r0[r4] = r8     // Catch:{ all -> 0x0015 }
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r10, r13, r0)     // Catch:{ all -> 0x0015 }
            androidx.work.x r13 = new androidx.work.x     // Catch:{ all -> 0x0015 }
            androidx.work.m r0 = androidx.work.C4632m.f14549a     // Catch:{ all -> 0x0015 }
            r13.<init>(r0)     // Catch:{ all -> 0x0015 }
            p5462h.p5472e.C69598b.m101013a(r6, r2)
            return r13
        L_0x0086:
            java.util.Map r1 = r1.f81434a     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0015 }
            com.google.android.libraries.notifications.k.a.c r1 = (com.google.android.libraries.notifications.p2298k.p2299a.C30040c) r1     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x00a6
            java.lang.String r13 = "Failed to find job, is it injected?. Job ID: %s, Job key: %s."
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x0015 }
            r0[r4] = r8     // Catch:{ all -> 0x0015 }
            r0[r5] = r9     // Catch:{ all -> 0x0015 }
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r10, r13, r0)     // Catch:{ all -> 0x0015 }
            androidx.work.x r13 = new androidx.work.x     // Catch:{ all -> 0x0015 }
            androidx.work.m r0 = androidx.work.C4632m.f14549a     // Catch:{ all -> 0x0015 }
            r13.<init>(r0)     // Catch:{ all -> 0x0015 }
            p5462h.p5472e.C69598b.m101013a(r6, r2)
            return r13
        L_0x00a6:
            java.lang.String r10 = "com.google.android.libraries.notifications.platform.JOB_RETRY_COUNT"
            r13.putInt(r10, r7)     // Catch:{ all -> 0x0015 }
            r12.f81427a = r6     // Catch:{ all -> 0x0015 }
            r12.f81428b = r9     // Catch:{ all -> 0x0015 }
            r12.f81429c = r8     // Catch:{ all -> 0x0015 }
            r12.f81430d = r5     // Catch:{ all -> 0x0015 }
            java.lang.Object r13 = r1.mo35376d(r13, r12)     // Catch:{ all -> 0x0015 }
            if (r13 == r0) goto L_0x012a
            r0 = r8
            r1 = r9
        L_0x00bb:
            com.google.android.libraries.notifications.platform.f.b.a r13 = (com.google.android.libraries.notifications.platform.p2318f.p2322b.C30116a) r13     // Catch:{ all -> 0x0015 }
            java.lang.String r7 = "jobId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r7)     // Catch:{ all -> 0x0015 }
            java.lang.String r7 = "jobKey"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r7)     // Catch:{ all -> 0x0015 }
            com.google.android.libraries.notifications.platform.f.b.e r7 = r13.f81466b     // Catch:{ all -> 0x0015 }
            com.google.android.libraries.notifications.platform.f.b.e r8 = com.google.android.libraries.notifications.platform.p2318f.p2322b.C30126e.SUCCESS     // Catch:{ all -> 0x0015 }
            int r7 = r7.ordinal()     // Catch:{ all -> 0x0015 }
            java.lang.String r8 = "GnpJobResult"
            if (r7 == 0) goto L_0x00f4
            if (r7 == r5) goto L_0x00e6
            if (r7 == r3) goto L_0x00d8
            goto L_0x00ff
        L_0x00d8:
            java.lang.Throwable r7 = r13.f81467c     // Catch:{ all -> 0x0015 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x0015 }
            r9[r4] = r0     // Catch:{ all -> 0x0015 }
            r9[r5] = r1     // Catch:{ all -> 0x0015 }
            java.lang.String r0 = "Job finished with permanent failure. Job ID: '%s', key: '%s'"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r8, r7, r0, r9)     // Catch:{ all -> 0x0015 }
            goto L_0x00ff
        L_0x00e6:
            java.lang.Throwable r7 = r13.f81467c     // Catch:{ all -> 0x0015 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x0015 }
            r9[r4] = r0     // Catch:{ all -> 0x0015 }
            r9[r5] = r1     // Catch:{ all -> 0x0015 }
            java.lang.String r0 = "Job finished with transient failure. Job ID: '%s', key: '%s'"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55797i(r8, r7, r0, r9)     // Catch:{ all -> 0x0015 }
            goto L_0x00ff
        L_0x00f4:
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0015 }
            r7[r4] = r0     // Catch:{ all -> 0x0015 }
            r7[r5] = r1     // Catch:{ all -> 0x0015 }
            java.lang.String r0 = "Job finished successfully. Job ID: '%s', key: '%s'"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55789a(r8, r0, r7)     // Catch:{ all -> 0x0015 }
        L_0x00ff:
            com.google.android.libraries.notifications.platform.f.b.e r13 = r13.f81466b     // Catch:{ all -> 0x0015 }
            int r13 = r13.ordinal()     // Catch:{ all -> 0x0015 }
            if (r13 == 0) goto L_0x011f
            if (r13 == r5) goto L_0x0119
            if (r13 != r3) goto L_0x0113
            androidx.work.x r13 = new androidx.work.x     // Catch:{ all -> 0x0015 }
            androidx.work.m r0 = androidx.work.C4632m.f14549a     // Catch:{ all -> 0x0015 }
            r13.<init>(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0126
        L_0x0113:
            h.g r13 = new h.g     // Catch:{ all -> 0x0015 }
            r13.<init>()     // Catch:{ all -> 0x0015 }
            throw r13     // Catch:{ all -> 0x0015 }
        L_0x0119:
            androidx.work.y r13 = new androidx.work.y     // Catch:{ all -> 0x0015 }
            r13.<init>()     // Catch:{ all -> 0x0015 }
            goto L_0x0126
        L_0x011f:
            androidx.work.z r13 = new androidx.work.z     // Catch:{ all -> 0x0015 }
            androidx.work.m r0 = androidx.work.C4632m.f14549a     // Catch:{ all -> 0x0015 }
            r13.<init>(r0)     // Catch:{ all -> 0x0015 }
        L_0x0126:
            p5462h.p5472e.C69598b.m101013a(r6, r2)
            return r13
        L_0x012a:
            return r0
        L_0x012b:
            throw r13     // Catch:{ all -> 0x012c }
        L_0x012c:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r6, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.platform.entrypoints.job.p2316a.p2317a.C30100b.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C30100b(this.f81431e, this.f81432f, this.f81433g, gVar);
    }
}
