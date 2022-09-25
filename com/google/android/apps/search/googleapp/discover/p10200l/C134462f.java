package com.google.android.apps.search.googleapp.discover.p10200l;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4580v.C60950i;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.l.f */
/* compiled from: PG */
public final class C134462f {

    /* renamed from: a */
    public final C60950i f366204a;

    /* renamed from: b */
    public final C42876ab f366205b;

    /* renamed from: c */
    public final Executor f366206c;

    /* renamed from: d */
    private final Duration f366207d;

    public C134462f(C60950i iVar, C42876ab abVar, Executor executor, long j) {
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(abVar, "errorThrottlingProtoDataStore");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f366204a = iVar;
        this.f366205b = abVar;
        this.f366206c = executor;
        this.f366207d = Duration.ofMinutes(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111789a(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.discover.p10200l.C134460d
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.discover.l.d r0 = (com.google.android.apps.search.googleapp.discover.p10200l.C134460d) r0
            int r1 = r0.f366202d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f366202d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.l.d r0 = new com.google.android.apps.search.googleapp.discover.l.d
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f366200b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f366202d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f366199a
            p5462h.C69714l.m101134b(r5)
            goto L_0x004a
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.storage.protostore.ab r5 = r4.f366205b
            com.google.common.util.concurrent.cx r5 = r5.mo46042d()
            java.lang.String r2 = "errorThrottlingProtoDataStore.data"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f366199a = r4
            r0.f366202d = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 == r1) goto L_0x0090
            r0 = r4
        L_0x004a:
            com.google.android.apps.search.googleapp.discover.l.b r5 = (com.google.android.apps.search.googleapp.discover.p10200l.C134458b) r5
            java.lang.String r1 = "errorThrottling"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r1)
            int r1 = r5.f366197a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x008b
            com.google.android.apps.search.googleapp.discover.l.f r0 = (com.google.android.apps.search.googleapp.discover.p10200l.C134462f) r0
            j$.time.Duration r1 = r0.f366207d
            java.lang.String r2 = "signedOutDisplayDuration"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.protobuf.fg r5 = r5.f366198b
            if (r5 != 0) goto L_0x0065
            com.google.protobuf.fg r5 = com.google.protobuf.C63042fg.f170152c
        L_0x0065:
            java.lang.String r2 = "errorThrottling.signedOutLastShown"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            j$.time.Instant r5 = com.google.protobuf.p4750c.p4751a.C62949a.m95469d(r5)
            com.google.common.v.i r0 = r0.f366204a
            j$.time.Instant r0 = r0.mo57444a()
            java.lang.String r2 = "timeSource.now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            j$.time.Duration r5 = p3186j$.time.Duration.between(r5, r0)
            boolean r0 = r5.isNegative()
            if (r0 != 0) goto L_0x008b
            int r5 = r5.compareTo((p3186j$.time.Duration) r1)
            if (r5 <= 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r3 = 0
        L_0x008b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L_0x0090:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10200l.C134462f.mo111789a(h.c.g):java.lang.Object");
    }
}
