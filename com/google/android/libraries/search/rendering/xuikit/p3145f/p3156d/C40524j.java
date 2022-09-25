package com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d;

import android.content.Context;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.frameworks.client.data.android.C61531o;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.d.j */
/* compiled from: PG */
public final class C40524j implements C61531o {

    /* renamed from: a */
    public final ScheduledExecutorService f106349a;

    /* renamed from: b */
    public final C40517c f106350b;

    /* renamed from: c */
    private final Context f106351c;

    /* renamed from: d */
    private final C71422aw f106352d;

    /* renamed from: e */
    private final C40358k f106353e;

    /* renamed from: f */
    private final C57695ab f106354f;

    /* renamed from: g */
    private final C40358k f106355g;

    public C40524j(Context context, C71422aw awVar, ScheduledExecutorService scheduledExecutorService, C40358k kVar, C57695ab abVar, C40517c cVar) {
        this.f106351c = context;
        this.f106352d = awVar;
        this.f106349a = scheduledExecutorService;
        this.f106353e = kVar;
        this.f106354f = abVar;
        this.f106350b = cVar;
        this.f106355g = kVar.mo42414a(abVar);
    }

    /* renamed from: a */
    public final C60870cx mo42484a(C61365ag agVar) {
        C69664n.m101061g(agVar, "request");
        return C71663i.m104692e(this.f106352d, (C71424ay) null, new C40519e(this, agVar, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: com.google.common.base.cr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.frameworks.client.data.android.ag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: com.google.common.base.cr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.google.frameworks.client.data.android.ag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: com.google.common.base.cr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: com.google.common.base.cr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: com.google.frameworks.client.data.android.ag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: com.google.common.base.cr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: com.google.frameworks.client.data.android.ag} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42487b(com.google.frameworks.client.data.android.C61365ag r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40520f
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.libraries.search.rendering.xuikit.f.d.f r0 = (com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40520f) r0
            int r1 = r0.f106342f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f106342f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.rendering.xuikit.f.d.f r0 = new com.google.android.libraries.search.rendering.xuikit.f.d.f
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f106340d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f106342f
            r3 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r10 = r0.f106339c
            java.lang.Object r1 = r0.f106338b
            java.lang.Object r0 = r0.f106337a
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x0032 }
            r8 = r11
            r11 = r10
            r10 = r1
            r1 = r0
            r0 = r8
            goto L_0x009c
        L_0x0032:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r1
            r1 = r0
            r0 = r8
            goto L_0x00c2
        L_0x003a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0042:
            p5462h.C69714l.m101134b(r11)
            android.content.Context r11 = r9.f106351c
            e.a.a.al.a.a.a r2 = p5304e.p5305a.p5306a.p5346al.p5347a.p5348a.C68442a.f184759a
            e.a.a.al.a.a.b r2 = r2.mo6453a()
            long r4 = r2.mo60389b(r11)
            j$.time.Duration r11 = p3186j$.time.Duration.ofSeconds(r4)
            android.content.Context r2 = r9.f106351c
            e.a.a.al.a.a.a r4 = p5304e.p5305a.p5306a.p5346al.p5347a.p5348a.C68442a.f184759a
            e.a.a.al.a.a.b r4 = r4.mo6453a()
            long r4 = r4.mo60388a(r2)
            long r6 = com.google.common.p4543n.p4546c.C59407o.m92308d(r11)
            int r11 = (int) r4
            com.google.common.n.c.o r11 = com.google.common.p4543n.p4546c.C59407o.m92309e(r6, r11)
            com.google.common.n.c.m r2 = new com.google.common.n.c.m
            r4 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r2.<init>(r11, r4)
            com.google.android.libraries.search.rendering.xuikit.f.d.i r11 = new com.google.android.libraries.search.rendering.xuikit.f.d.i
            r11.<init>(r2, r9, r10)
            com.google.common.base.cr r11 = com.google.common.base.C58886cw.m90973a(r11)
            java.lang.String r2 = "private suspend fun make…)\n      throw t\n    }\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)
            java.lang.Object r2 = r11.mo6453a()     // Catch:{ all -> 0x00c0 }
            java.lang.String r4 = "retryFutureSupplier.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)     // Catch:{ all -> 0x00c0 }
            com.google.common.util.concurrent.cx r2 = (com.google.common.util.concurrent.C60870cx) r2     // Catch:{ all -> 0x00c0 }
            r0.f106337a = r9     // Catch:{ all -> 0x00c0 }
            r0.f106338b = r10     // Catch:{ all -> 0x00c0 }
            r0.f106339c = r11     // Catch:{ all -> 0x00c0 }
            r0.f106342f = r3     // Catch:{ all -> 0x00c0 }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)     // Catch:{ all -> 0x00c0 }
            if (r0 == r1) goto L_0x00bf
            r1 = r9
        L_0x009c:
            java.lang.String r2 = "retryFutureSupplier.get().await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)     // Catch:{ all -> 0x00bd }
            com.google.frameworks.client.data.android.ah r0 = (com.google.frameworks.client.data.android.C61366ah) r0     // Catch:{ all -> 0x00bd }
            r2 = r1
            com.google.android.libraries.search.rendering.xuikit.f.d.j r2 = (com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40524j) r2     // Catch:{ all -> 0x00bd }
            com.google.android.libraries.search.rendering.xuikit.d.f.k r2 = r2.f106355g     // Catch:{ all -> 0x00bd }
            r3 = r10
            com.google.frameworks.client.data.android.ag r3 = (com.google.frameworks.client.data.android.C61365ag) r3     // Catch:{ all -> 0x00bd }
            com.google.android.libraries.search.rendering.xuikit.d.f.k r2 = com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40529o.m70249a(r2, r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "XBlend.Network.Success.TotalAttemptCount"
            java.lang.Object r4 = r11.mo6453a()     // Catch:{ all -> 0x00bd }
            com.google.common.n.c.y r4 = (com.google.common.p4543n.p4546c.C59417y) r4     // Catch:{ all -> 0x00bd }
            int r4 = r4.f157639h     // Catch:{ all -> 0x00bd }
            r2.mo42417d(r3, r4)     // Catch:{ all -> 0x00bd }
            return r0
        L_0x00bd:
            r0 = move-exception
            goto L_0x00c2
        L_0x00bf:
            return r1
        L_0x00c0:
            r0 = move-exception
            r1 = r9
        L_0x00c2:
            com.google.android.libraries.search.rendering.xuikit.f.d.j r1 = (com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40524j) r1
            com.google.android.libraries.search.rendering.xuikit.d.f.k r1 = r1.f106355g
            com.google.frameworks.client.data.android.ag r10 = (com.google.frameworks.client.data.android.C61365ag) r10
            com.google.android.libraries.search.rendering.xuikit.d.f.k r10 = com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40529o.m70249a(r1, r10)
            java.lang.Object r11 = r11.mo6453a()
            com.google.common.n.c.y r11 = (com.google.common.p4543n.p4546c.C59417y) r11
            int r11 = r11.f157639h
            java.lang.String r1 = "XBlend.Network.Failure.TotalAttemptCount"
            r10.mo42417d(r1, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40524j.mo42487b(com.google.frameworks.client.data.android.ag, h.c.g):java.lang.Object");
    }
}
