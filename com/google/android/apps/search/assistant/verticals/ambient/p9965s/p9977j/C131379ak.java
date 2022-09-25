package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.ak */
/* compiled from: PG */
public final class C131379ak {

    /* renamed from: a */
    private final C42876ab f359132a;

    /* renamed from: b */
    private final C60950i f359133b;

    /* renamed from: c */
    private final C39141kp f359134c;

    /* renamed from: d */
    private final C69464a f359135d;

    /* renamed from: e */
    private final C69464a f359136e;

    /* renamed from: f */
    private final C69464a f359137f;

    /* renamed from: g */
    private final C69464a f359138g;

    /* renamed from: h */
    private final C69464a f359139h;

    /* renamed from: i */
    private final C58974d f359140i;

    public C131379ak(C42876ab abVar, C130603a aVar, C60950i iVar, C39141kp kpVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7) {
        C69664n.m101061g(abVar, "mediaPushQuotaProtoStore");
        C69664n.m101061g(aVar, "aaFileFluentLoggerFactory");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(kpVar, "clientStreamz");
        C69664n.m101061g(aVar2, "enableNegativeTargeting");
        C69664n.m101061g(aVar3, "enableStreamzLogging");
        C69664n.m101061g(aVar4, "enableResetOnResumableClick");
        C69664n.m101061g(aVar5, "initialPushQuota");
        C69664n.m101061g(aVar6, "initialTimeWindowDays");
        C69664n.m101061g(aVar7, "pushQuotaDelta");
        this.f359132a = abVar;
        this.f359133b = iVar;
        this.f359134c = kpVar;
        this.f359135d = aVar2;
        this.f359136e = aVar3;
        this.f359137f = aVar5;
        this.f359138g = aVar6;
        this.f359139h = aVar7;
        this.f359140i = aVar.mo109740b(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110152a(p5462h.p5466c.C69577g r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131378aj
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.assistant.verticals.ambient.s.j.aj r0 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131378aj) r0
            int r1 = r0.f359131d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f359131d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.verticals.ambient.s.j.aj r0 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.aj
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f359129b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f359131d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f359128a
            p5462h.C69714l.m101134b(r13)
            goto L_0x004a
        L_0x0029:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0031:
            p5462h.C69714l.m101134b(r13)
            com.google.android.libraries.storage.protostore.ab r13 = r12.f359132a
            com.google.common.util.concurrent.cx r13 = r13.mo46042d()
            java.lang.String r2 = "mediaPushQuotaProtoStore.data"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            r0.f359128a = r12
            r0.f359131d = r3
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x0131
            r0 = r12
        L_0x004a:
            com.google.assistant.c.ag r13 = (com.google.assistant.p3886c.C50695ag) r13
            java.lang.String r1 = "mediaPushQuota"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r1)
            long r1 = r13.f131900b
            j$.time.Instant r1 = p3186j$.time.Instant.ofEpochMilli(r1)
            java.lang.String r2 = "ofEpochMilli(this.startTimeMillis)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            int r13 = r13.f131901c
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ak r0 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131379ak) r0
            g.a.a r2 = r0.f359137f
            java.lang.Object r2 = r2.mo17428b()
            java.lang.String r4 = "initialPushQuota.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            g.a.a r2 = r0.f359138g
            java.lang.Object r2 = r2.mo17428b()
            java.lang.String r6 = "initialTimeWindowDays.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)
            java.lang.Number r2 = (java.lang.Number) r2
            long r6 = r2.longValue()
            j$.time.Duration r2 = p3186j$.time.Duration.ofDays(r6)
            g.a.a r6 = r0.f359139h
            java.lang.Object r6 = r6.mo17428b()
            java.lang.String r7 = "pushQuotaDelta.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            boolean r8 = r2.isZero()
            if (r8 != 0) goto L_0x0129
            com.google.common.v.i r8 = r0.f359133b
            j$.time.Instant r8 = r8.mo57444a()
            j$.time.Duration r8 = p3186j$.time.Duration.between(r1, r8)
            long r8 = r8.dividedBy((p3186j$.time.Duration) r2)
            r10 = 1
            long r8 = r8 + r10
            double r8 = (double) r8
            double r8 = java.lang.Math.log1p(r8)
            long r8 = (long) r8
            long r6 = r6 * r8
            long r4 = r4 + r6
            long r6 = (long) r13
            long r6 = r4 - r6
            com.google.common.f.a.d r13 = r0.f359140i
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.a.a r13 = (com.google.common.p4526f.p4527a.C58970a) r13
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "Current push quota %s out of %s since %s"
            r13.mo56359L(r5, r2, r4, r1)
            g.a.a r13 = r0.f359136e
            java.lang.Object r13 = r13.mo17428b()
            java.lang.String r2 = "enableStreamzLogging.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r4 = 0
            if (r13 == 0) goto L_0x00fd
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x00fd
            com.google.android.libraries.search.logging.d.kp r13 = r0.f359134c
            com.google.common.v.i r2 = r0.f359133b
            j$.time.Instant r2 = r2.mo57444a()
            j$.time.Duration r1 = p3186j$.time.Duration.between(r1, r2)
            long r1 = r1.toHours()
            double r1 = (double) r1
            r13.mo41682P(r1)
            r6 = r4
        L_0x00fd:
            g.a.a r13 = r0.f359135d
            java.lang.Object r13 = r13.mo17428b()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r1 = 0
            if (r13 != 0) goto L_0x011e
            com.google.common.f.a.d r13 = r0.f359140i
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.a.a r13 = (com.google.common.p4526f.p4527a.C58970a) r13
            java.lang.String r0 = "Media negative targeting is disabled. Skipping..."
            r13.mo56386p(r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
            return r13
        L_0x011e:
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r3 = 0
        L_0x0124:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            return r13
        L_0x0129:
            java.lang.ArithmeticException r13 = new java.lang.ArithmeticException
            java.lang.String r0 = "initialTimeWindow cannot be zero as a divisor."
            r13.<init>(r0)
            throw r13
        L_0x0131:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131379ak.mo110152a(h.c.g):java.lang.Object");
    }
}
