package com.google.android.apps.gsa.staticplugins.bisto.p7491i;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.i.e */
/* compiled from: PG */
public final /* synthetic */ class C95463e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C95465g f267132a;

    /* renamed from: b */
    public final /* synthetic */ C124548d f267133b;

    public /* synthetic */ C95463e(C95465g gVar, C124548d dVar) {
        this.f267132a = gVar;
        this.f267133b = dVar;
    }

    /* JADX WARNING: type inference failed for: r14v18, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r14) {
        /*
            r13 = this;
            com.google.android.apps.gsa.staticplugins.bisto.i.g r0 = r13.f267132a
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r1 = r13.f267133b
            r8 = r14
            com.google.common.base.ax r8 = (com.google.common.base.C58833ax) r8
            boolean r14 = r1.mo106497ak()
            r9 = 0
            r10 = 0
            if (r14 != 0) goto L_0x001d
            com.google.common.f.e r14 = com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95465g.f267135a
            com.google.common.f.x r14 = r14.mo56224b()
            java.lang.String r2 = "Device does not support Hotword"
            r3 = 15060(0x3ad4, float:2.1104E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0085
        L_0x001d:
            boolean r14 = r8.mo56113h()
            r11 = 1
            if (r14 == 0) goto L_0x0032
            java.lang.Object r14 = r8.mo56107c()
            java.lang.String r14 = (java.lang.String) r14
            boolean r14 = r1.mo106496aj(r14)
            if (r14 == 0) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            com.google.android.apps.gsa.staticplugins.bisto.i r2 = r0.f267138d
            java.lang.String r12 = r2.mo83457c()
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95465g.f267135a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 15059(0x3ad3, float:2.1102E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r3 = "[%s] hotword locale information %s %b %b %s"
            java.lang.String r4 = r1.mo106475P()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r14)
            r5 = r12
            r2.mo56361N(r3, r4, r5, r6, r7, r8)
            if (r12 == 0) goto L_0x0085
            if (r14 == 0) goto L_0x0085
            com.google.assistant.a.a.bb r14 = com.google.assistant.p3739a.p3740a.C48068bb.f124406d
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.a.a.ba r14 = (com.google.assistant.p3739a.p3740a.C48067ba) r14
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.assistant.a.a.bb r2 = (com.google.assistant.p3739a.p3740a.C48068bb) r2
            r2.f124409b = r12
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.assistant.a.a.bb r2 = (com.google.assistant.p3739a.p3740a.C48068bb) r2
            int r3 = r2.f124408a
            r3 = r3 | r11
            r2.f124408a = r3
            r2.f124410c = r11
            com.google.protobuf.bv r14 = r14.build()
            r10 = r14
            com.google.assistant.a.a.bb r10 = (com.google.assistant.p3739a.p3740a.C48068bb) r10
        L_0x0085:
            if (r10 != 0) goto L_0x009d
            com.google.common.f.e r14 = com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95465g.f267135a
            com.google.common.f.x r14 = r14.mo56226d()
            java.lang.String r0 = "Current state does-not require to send HotwordConfig request"
            r1 = 15061(0x3ad5, float:2.1105E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r1)).mo56386p(r0)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)
            goto L_0x00d2
        L_0x009d:
            com.google.android.apps.gsa.staticplugins.bisto.i.k r14 = r0.mo89377a()
            java.lang.String r1 = r1.mo106477R()
            java.lang.String r2 = "/assistant/vm_consent"
            byte[] r3 = r10.toByteArray()
            com.google.common.util.concurrent.cx r14 = r14.mo89378a(r1, r2, r3)
            com.google.common.util.concurrent.bs r14 = com.google.common.util.concurrent.C60838bs.m92859i(r14)
            com.google.android.apps.gsa.staticplugins.bisto.i.c r1 = com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95461c.f267130a
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60922j.m93044g(r14, r1, r2)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.db r0 = r0.f267136b
            r2 = 35000(0x88b8, double:1.72923E-319)
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92908q(r14, r2, r1, r0)
            com.google.common.util.concurrent.bs r14 = (com.google.common.util.concurrent.C60838bs) r14
            java.lang.Class<java.lang.Exception> r0 = java.lang.Exception.class
            com.google.android.apps.gsa.staticplugins.bisto.i.d r1 = com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95462d.f267131a
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60846c.m92878g(r14, r0, r1, r2)
        L_0x00d2:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95463e.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
