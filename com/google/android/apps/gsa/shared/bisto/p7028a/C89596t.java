package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.t */
/* compiled from: PG */
final class C89596t extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ C124636bb f242661a;

    /* renamed from: b */
    final /* synthetic */ C124633az f242662b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89596t(C89474bm bmVar, String str, C58528ij ijVar, C124636bb bbVar, C124633az azVar) {
        super(bmVar, str, ijVar);
        this.f242661a = bbVar;
        this.f242662b = azVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r1.contains(r5) != false) goto L_0x0070;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g mo83351a(com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g r5) {
        /*
            r4 = this;
            com.google.android.apps.search.assistant.surfaces.bisto.d.f r0 = com.google.android.apps.gsa.shared.bisto.p7028a.C89474bm.m145533c(r5)
            if (r5 == 0) goto L_0x0031
            int r1 = r5.f344051a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0031
            com.google.android.apps.search.assistant.surfaces.bisto.d.aj r1 = r5.f344055e
            if (r1 != 0) goto L_0x0012
            com.google.android.apps.search.assistant.surfaces.bisto.d.aj r1 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124617aj.f343747l
        L_0x0012:
            int r1 = r1.f343749a
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0031
            com.google.common.b.ij r1 = com.google.android.apps.gsa.shared.bisto.C89648c.f242752a
            com.google.android.apps.search.assistant.surfaces.bisto.d.aj r5 = r5.f344055e
            if (r5 != 0) goto L_0x0020
            com.google.android.apps.search.assistant.surfaces.bisto.d.aj r5 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124617aj.f343747l
        L_0x0020:
            int r5 = r5.f343751c
            com.google.android.apps.search.assistant.surfaces.bisto.d.s r5 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s.m204382a(r5)
            if (r5 != 0) goto L_0x002a
            com.google.android.apps.search.assistant.surfaces.bisto.d.s r5 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s.UNKNOWN_DEVICE_TYPE
        L_0x002a:
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x0031
            goto L_0x0070
        L_0x0031:
            com.google.android.apps.search.assistant.surfaces.bisto.d.bb r5 = r4.f242661a
            if (r5 == 0) goto L_0x0070
            com.google.android.apps.search.assistant.surfaces.bisto.d.bb r1 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb.UNKNOWN_ENABLED_STATE
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0070
            com.google.android.apps.search.assistant.surfaces.bisto.d.bi r5 = com.google.android.apps.gsa.shared.bisto.p7028a.C89474bm.m145538h(r0)
            com.google.android.apps.search.assistant.surfaces.bisto.d.bb r1 = r4.f242661a
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r2 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj) r2
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r3 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj.f343868n
            int r1 = r1.f343849e
            r2.f343875f = r1
            int r1 = r2.f343870a
            r1 = r1 | 16
            r2.f343870a = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r1 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g) r1
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r5 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj) r5
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r2 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g.f344049g
            r5.getClass()
            r1.f344053c = r5
            int r5 = r1.f344051a
            r5 = r5 | 2
            r1.f344051a = r5
        L_0x0070:
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r5 = r4.f242662b
            if (r5 == 0) goto L_0x00af
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r1 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az.OOBE_STATE_UNKNOWN
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x00af
            com.google.android.apps.search.assistant.surfaces.bisto.d.an r5 = com.google.android.apps.gsa.shared.bisto.p7028a.C89474bm.m145536f(r0)
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r1 = r4.f242662b
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.ap r2 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap) r2
            com.google.android.apps.search.assistant.surfaces.bisto.d.ap r3 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap.f343769w
            int r1 = r1.f343841h
            r2.f343772b = r1
            int r1 = r2.f343771a
            r1 = r1 | 1
            r2.f343771a = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r1 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g) r1
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.apps.search.assistant.surfaces.bisto.d.ap r5 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap) r5
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r2 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g.f344049g
            r5.getClass()
            r1.f344052b = r5
            int r5 = r1.f344051a
            r5 = r5 | 1
            r1.f344051a = r5
        L_0x00af:
            com.google.protobuf.bv r5 = r0.build()
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r5 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.bisto.p7028a.C89596t.mo83351a(com.google.android.apps.search.assistant.surfaces.bisto.d.g):com.google.android.apps.search.assistant.surfaces.bisto.d.g");
    }
}
