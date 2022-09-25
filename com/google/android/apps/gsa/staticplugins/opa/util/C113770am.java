package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.assistant.p3897e.p3929l.p3930a.C52690aw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.am */
/* compiled from: PG */
public final class C113770am implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C52690aw f315076a;

    /* renamed from: b */
    final /* synthetic */ C113775ar f315077b;

    public C113770am(C113775ar arVar, C52690aw awVar) {
        this.f315077b = arVar;
        this.f315076a = awVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C113775ar.f315097a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MorrisOnboardingCtlr");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(28422)).mo56386p("Failed to read morris data.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0090, code lost:
        if (com.google.protobuf.p4750c.C62950b.m95474e(r4).plus(p3186j$.time.Duration.ofSeconds(r2)).isBefore(r0.f315098b.mo57444a()) != false) goto L_0x00bf;
     */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo17911gm(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.libraries.assistant.auto.tng.morris.b.e r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14077e) r10
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.e.l.a.aw r0 = r9.f315076a
            r0.name()
            com.google.android.libraries.assistant.auto.tng.morris.b.af r0 = r10.f42739g
            if (r0 != 0) goto L_0x000f
            com.google.android.libraries.assistant.auto.tng.morris.b.af r0 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14071af.f42714f
        L_0x000f:
            com.google.android.libraries.assistant.auto.tng.morris.b.ac r0 = r10.f42740h
            if (r0 != 0) goto L_0x0015
            com.google.android.libraries.assistant.auto.tng.morris.b.ac r0 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14068ac.f42705h
        L_0x0015:
            com.google.android.libraries.assistant.auto.tng.morris.b.ac r0 = r10.f42740h
            if (r0 != 0) goto L_0x001b
            com.google.android.libraries.assistant.auto.tng.morris.b.ac r0 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14068ac.f42705h
        L_0x001b:
            int r0 = r0.f42708b
            int r0 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14067ab.m30357b(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0025
            r0 = 1
        L_0x0025:
            r2 = 3
            if (r0 == r2) goto L_0x00d0
            r3 = 4
            if (r0 != r3) goto L_0x002d
            goto L_0x00d0
        L_0x002d:
            com.google.android.libraries.assistant.auto.tng.morris.b.af r0 = r10.f42739g
            if (r0 != 0) goto L_0x0033
            com.google.android.libraries.assistant.auto.tng.morris.b.af r0 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14071af.f42714f
        L_0x0033:
            int r0 = r0.f42717b
            int r0 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14070ae.m30359b(r0)
            if (r0 != 0) goto L_0x003c
            r0 = 1
        L_0x003c:
            if (r0 == r2) goto L_0x00d0
            if (r0 == r3) goto L_0x00d0
            com.google.assistant.e.l.a.aw r0 = r9.f315076a
            com.google.assistant.e.l.a.aw r2 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.ENABLED
            if (r0 == r2) goto L_0x004a
            com.google.assistant.e.l.a.aw r2 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.OPTED_OUT_FROM_PREVIEW
            if (r0 != r2) goto L_0x00d0
        L_0x004a:
            com.google.assistant.e.l.a.aw r2 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.OPTED_OUT_FROM_PREVIEW
            if (r0 != r2) goto L_0x00bf
            com.google.android.apps.gsa.staticplugins.opa.util.ar r0 = r9.f315077b
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f315101e
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248926w
            long r2 = r2.mo79743a(r3)
            com.google.android.libraries.assistant.auto.tng.morris.b.af r4 = r10.f42739g
            if (r4 != 0) goto L_0x005e
            com.google.android.libraries.assistant.auto.tng.morris.b.af r4 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14071af.f42714f
        L_0x005e:
            int r4 = r4.f42720e
            int r4 = r4 + r1
            long r4 = (long) r4
            com.google.android.apps.gsa.search.core.i.t r6 = r0.f315101e
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248920q
            long r6 = r6.mo79743a(r7)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0093
            com.google.android.libraries.assistant.auto.tng.morris.b.ah r4 = r10.f42738f
            if (r4 != 0) goto L_0x0074
            com.google.android.libraries.assistant.auto.tng.morris.b.ah r4 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14073ah.f42721c
        L_0x0074:
            com.google.protobuf.fg r4 = r4.f42724b
            if (r4 != 0) goto L_0x007a
            com.google.protobuf.fg r4 = com.google.protobuf.C63042fg.f170152c
        L_0x007a:
            j$.time.Instant r4 = com.google.protobuf.p4750c.C62950b.m95474e(r4)
            j$.time.Duration r2 = p3186j$.time.Duration.ofSeconds(r2)
            j$.time.Instant r2 = r4.plus(r2)
            com.google.common.v.i r0 = r0.f315098b
            j$.time.Instant r0 = r0.mo57444a()
            boolean r0 = r2.isBefore(r0)
            if (r0 == 0) goto L_0x0093
            goto L_0x00bf
        L_0x0093:
            com.google.android.apps.gsa.staticplugins.opa.util.ar r0 = r9.f315077b
            com.google.android.libraries.assistant.auto.tng.morris.b.af r10 = r10.f42739g
            if (r10 != 0) goto L_0x009b
            com.google.android.libraries.assistant.auto.tng.morris.b.af r10 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14071af.f42714f
        L_0x009b:
            com.google.android.libraries.assistant.auto.tng.morris.b.x r0 = r0.f315104h
            com.google.protobuf.bn r2 = r10.toBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.b.ad r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14069ad) r2
            int r10 = r10.f42720e
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.assistant.auto.tng.morris.b.af r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14071af) r3
            int r4 = r3.f42716a
            r4 = r4 | 8
            r3.f42716a = r4
            int r10 = r10 + r1
            r3.f42720e = r10
            com.google.protobuf.bv r10 = r2.build()
            com.google.android.libraries.assistant.auto.tng.morris.b.af r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14071af) r10
            r0.mo21404h(r10)
            return
        L_0x00bf:
            com.google.android.apps.gsa.staticplugins.opa.util.ar r0 = r9.f315077b
            com.google.assistant.e.l.a.aw r1 = r9.f315076a
            com.google.assistant.e.l.a.aw r2 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.ENABLED
            if (r1 != r2) goto L_0x00ca
            com.google.android.apps.gsa.staticplugins.opa.util.aq r1 = com.google.android.apps.gsa.staticplugins.opa.util.C113774aq.PREVIEW_OPT_IN
            goto L_0x00cc
        L_0x00ca:
            com.google.android.apps.gsa.staticplugins.opa.util.aq r1 = com.google.android.apps.gsa.staticplugins.opa.util.C113774aq.PREVIEW_NOT_NOW
        L_0x00cc:
            r2 = 0
            r0.mo100621b(r1, r10, r2)
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.util.C113770am.mo17911gm(java.lang.Object):void");
    }
}
