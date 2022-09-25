package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.p4751a.C62949a;
import dagger.C68214a;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Duration;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.an */
/* compiled from: PG */
public final class C121685an {

    /* renamed from: a */
    public static final C59071e f337594a = C59071e.m91331h();

    /* renamed from: b */
    public final C68214a f337595b;

    /* renamed from: c */
    public final ConcurrentHashMap f337596c = new ConcurrentHashMap();

    /* renamed from: d */
    private final C71422aw f337597d;

    /* renamed from: e */
    private final C62910ar f337598e;

    public C121685an(C71422aw awVar, C68214a aVar, C62910ar arVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "invocationManager");
        this.f337597d = awVar;
        this.f337595b = aVar;
        this.f337598e = arVar;
    }

    /* renamed from: c */
    private final Object m201088c(C121706m mVar) {
        Duration duration = mVar.f337672b.f90086g;
        if (duration == null) {
            duration = C62949a.m95468c(this.f337598e);
        }
        C58976aa aaVar = C58975e.f156826a;
        C34711b.m63445a(mVar.f337671a);
        C71643cp cpVar = (C71643cp) this.f337596c.put(mVar.f337671a, C71803m.m105043d(this.f337597d, (C69585o) null, (C71424ay) null, new C121684am(duration, mVar, this, (C69577g) null), 3));
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
        return C69788q.f186170a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105292a(com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121682ak
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.platform.j.b.a.a.ak r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121682ak) r0
            int r1 = r0.f337587e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337587e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.a.a.ak r0 = new com.google.android.apps.search.assistant.platform.j.b.a.a.ak
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f337585c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337587e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f337584b
            java.lang.Object r0 = r0.f337583a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0043
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            r0.f337583a = r4
            r0.f337584b = r5
            r0.f337587e = r3
            java.lang.Object r6 = r4.m201088c(r5)
            if (r6 == r1) goto L_0x0054
            r0 = r4
        L_0x0043:
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m) r5
            kotlinx.coroutines.be r6 = r5.f337677g
            com.google.android.apps.search.assistant.platform.j.b.a.a.al r1 = new com.google.android.apps.search.assistant.platform.j.b.a.a.al
            com.google.android.apps.search.assistant.platform.j.b.a.a.an r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121685an) r0
            r1.<init>(r0, r5)
            r6.mo62873s(r1)
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121685an.mo105292a(com.google.android.apps.search.assistant.platform.j.b.a.a.m, h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo105293b(C121706m mVar) {
        Object c = m201088c(mVar);
        return c == C69554a.COROUTINE_SUSPENDED ? c : C69788q.f186170a;
    }
}
