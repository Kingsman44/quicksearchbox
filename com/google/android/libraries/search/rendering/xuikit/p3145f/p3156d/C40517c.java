package com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.frameworks.client.data.android.C61531o;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.d.c */
/* compiled from: PG */
public final class C40517c implements C61531o {

    /* renamed from: a */
    private final C61531o f106324a;

    /* renamed from: b */
    private final C40358k f106325b;

    /* renamed from: c */
    private final C60950i f106326c;

    /* renamed from: d */
    private final C71422aw f106327d;

    /* renamed from: e */
    private final C57695ab f106328e;

    /* renamed from: f */
    private final C40358k f106329f;

    public C40517c(C61531o oVar, C40358k kVar, C60950i iVar, C71422aw awVar, C57695ab abVar) {
        this.f106324a = oVar;
        this.f106325b = kVar;
        this.f106326c = iVar;
        this.f106327d = awVar;
        this.f106328e = abVar;
        this.f106329f = kVar.mo42414a(abVar);
    }

    /* renamed from: c */
    private final void m70233c(String str, Instant instant, C61365ag agVar) {
        C40529o.m70249a(this.f106329f, agVar).mo42418e(str, Duration.between(instant, this.f106326c.mo57444a()).toMillis());
    }

    /* renamed from: a */
    public final C60870cx mo42484a(C61365ag agVar) {
        C69664n.m101061g(agVar, "request");
        return C71663i.m104692e(this.f106327d, (C71424ay) null, new C40515a(this, agVar, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.google.frameworks.client.data.android.ag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: com.google.frameworks.client.data.android.ag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.google.frameworks.client.data.android.ag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: com.google.frameworks.client.data.android.ag} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[Catch:{ all -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a A[Catch:{ all -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42485b(com.google.frameworks.client.data.android.C61365ag r12, p5462h.p5466c.C69577g r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40516b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.libraries.search.rendering.xuikit.f.d.b r0 = (com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40516b) r0
            int r1 = r0.f106323f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f106323f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.rendering.xuikit.f.d.b r0 = new com.google.android.libraries.search.rendering.xuikit.f.d.b
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f106321d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f106323f
            r3 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r12 = r0.f106320c
            java.lang.Object r1 = r0.f106319b
            java.lang.Object r0 = r0.f106318a
            p5462h.C69714l.m101134b(r13)     // Catch:{ all -> 0x0032 }
            r10 = r13
            r13 = r12
            r12 = r1
            r1 = r0
            r0 = r10
            goto L_0x006a
        L_0x0032:
            r13 = move-exception
            r10 = r13
            r13 = r12
            r12 = r1
            r1 = r0
            r0 = r10
            goto L_0x00bd
        L_0x003a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0042:
            p5462h.C69714l.m101134b(r13)
            com.google.common.v.i r13 = r11.f106326c
            j$.time.Instant r13 = r13.mo57444a()
            java.lang.String r2 = "timeSource.now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            com.google.frameworks.client.data.android.o r2 = r11.f106324a     // Catch:{ all -> 0x00bb }
            com.google.common.util.concurrent.cx r2 = r2.mo42484a(r12)     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = "httpClient.makeRequest(request)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)     // Catch:{ all -> 0x00bb }
            r0.f106318a = r11     // Catch:{ all -> 0x00bb }
            r0.f106319b = r12     // Catch:{ all -> 0x00bb }
            r0.f106320c = r13     // Catch:{ all -> 0x00bb }
            r0.f106323f = r3     // Catch:{ all -> 0x00bb }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)     // Catch:{ all -> 0x00bb }
            if (r0 == r1) goto L_0x00ba
            r1 = r11
        L_0x006a:
            com.google.frameworks.client.data.android.ah r0 = (com.google.frameworks.client.data.android.C61366ah) r0     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = "response"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)     // Catch:{ all -> 0x00b8 }
            int r2 = r0.f165947c     // Catch:{ all -> 0x00b8 }
            com.google.net.a.a.b r2 = com.google.frameworks.client.data.android.C61367ai.m93875a(r2)     // Catch:{ all -> 0x00b8 }
            com.google.net.a.a.b r4 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ all -> 0x00b8 }
            if (r2 != r4) goto L_0x008a
            r2 = r1
            com.google.android.libraries.search.rendering.xuikit.f.d.c r2 = (com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40517c) r2     // Catch:{ all -> 0x00b8 }
            r3 = r12
            com.google.frameworks.client.data.android.ag r3 = (com.google.frameworks.client.data.android.C61365ag) r3     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = "XBlend.Network.Success.DurationInMs"
            r5 = r13
            j$.time.Instant r5 = (p3186j$.time.Instant) r5     // Catch:{ all -> 0x00b8 }
            r2.m70233c(r4, r5, r3)     // Catch:{ all -> 0x00b8 }
            return r0
        L_0x008a:
            com.google.frameworks.client.data.android.ac r2 = new com.google.frameworks.client.data.android.ac     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = "xBlend network request failed"
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x00b8 }
            java.lang.String r6 = "Http response returned failed HTTP status code=%d"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b8 }
            int r8 = r0.f165947c     // Catch:{ all -> 0x00b8 }
            java.lang.Integer r9 = new java.lang.Integer     // Catch:{ all -> 0x00b8 }
            r9.<init>(r8)     // Catch:{ all -> 0x00b8 }
            r8 = 0
            r7[r8] = r9     // Catch:{ all -> 0x00b8 }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r7, r3)     // Catch:{ all -> 0x00b8 }
            java.lang.String r3 = java.lang.String.format(r6, r3)     // Catch:{ all -> 0x00b8 }
            java.lang.String r6 = "format(format, *args)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r6)     // Catch:{ all -> 0x00b8 }
            r5.<init>(r3)     // Catch:{ all -> 0x00b8 }
            int r0 = r0.f165947c     // Catch:{ all -> 0x00b8 }
            com.google.net.a.a.b r0 = com.google.frameworks.client.data.android.C61367ai.m93875a(r0)     // Catch:{ all -> 0x00b8 }
            r2.<init>(r4, r5, r0)     // Catch:{ all -> 0x00b8 }
            throw r2     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            goto L_0x00bd
        L_0x00ba:
            return r1
        L_0x00bb:
            r0 = move-exception
            r1 = r11
        L_0x00bd:
            com.google.android.libraries.search.rendering.xuikit.f.d.c r1 = (com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40517c) r1
            com.google.frameworks.client.data.android.ag r12 = (com.google.frameworks.client.data.android.C61365ag) r12
            java.lang.String r2 = "XBlend.Network.Failure.DurationInMs"
            j$.time.Instant r13 = (p3186j$.time.Instant) r13
            r1.m70233c(r2, r13, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40517c.mo42485b(com.google.frameworks.client.data.android.ag, h.c.g):java.lang.Object");
    }
}
