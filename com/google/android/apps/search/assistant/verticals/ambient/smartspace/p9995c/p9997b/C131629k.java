package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.C130477a;
import com.google.android.apps.search.assistant.verticals.ambient.settings.C131567i;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71574dx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.k */
/* compiled from: PG */
public final class C131629k implements C130477a {

    /* renamed from: a */
    public final C71571du f359663a;

    /* renamed from: b */
    private final C71422aw f359664b;

    /* renamed from: c */
    private final C131567i f359665c;

    /* renamed from: d */
    private final C71548cy f359666d;

    public C131629k(C71422aw awVar, C131567i iVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f359664b = awVar;
        this.f359665c = iVar;
        C71548cy b = C71574dx.m104480b(new C131626h(false));
        this.f359666d = b;
        this.f359663a = b;
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C131625g(this, (C69577g) null), 3);
    }

    /* renamed from: a */
    public final C60870cx mo109707a(C106596h hVar, C53715bm bmVar) {
        C69664n.m101061g(hVar, "unused");
        C69664n.m101061g(bmVar, "triggeringEvent");
        return C71663i.m104692e(this.f359664b, (C71424ay) null, new C131627i(bmVar, this, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110228b(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131628j
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.j r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131628j) r0
            int r1 = r0.f359662d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f359662d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.j r0 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.j
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f359660b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f359662d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f359659a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0059
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.verticals.ambient.settings.i r7 = r6.f359665c
            com.google.assistant.c.cr r2 = com.google.assistant.p3886c.C50794cr.CROSS_DEVICE_TIMER
            com.google.android.apps.gsa.w.b.a r4 = r7.f359467d
            com.google.common.util.concurrent.cx r4 = r4.mo103943a()
            com.google.android.apps.search.assistant.verticals.ambient.settings.b r5 = new com.google.android.apps.search.assistant.verticals.ambient.settings.b
            r5.<init>(r7, r2)
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r5)
            com.google.common.util.concurrent.da r7 = r7.f359465b
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r4, r2, r7)
            r0.f359659a = r6
            r0.f359662d = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r0 = r6
        L_0x0059:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.k r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131629k) r0
            kotlinx.coroutines.b.cy r0 = r0.f359666d
            java.lang.String r1 = "isCrossDeviceTimersEnabled"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r1)
            boolean r7 = r7.booleanValue()
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.h r1 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.h
            r1.<init>(r7)
            r0.mo62807f(r1)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131629k.mo110228b(h.c.g):java.lang.Object");
    }
}
