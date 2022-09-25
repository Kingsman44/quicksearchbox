package com.google.android.apps.search.googleapp.homescreen.p10311a;

import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.a.b */
/* compiled from: PG */
final class C136143b implements C47506l {

    /* renamed from: a */
    final /* synthetic */ C47507m f370778a;

    /* renamed from: b */
    final /* synthetic */ C136144c f370779b;

    public C136143b(C136144c cVar, C47507m mVar) {
        this.f370779b = cVar;
        this.f370778a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo20002a() {
        return 0;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo20003b() {
        return 0;
    }

    /* renamed from: c */
    public final C58833ax mo20004c() {
        return this.f370779b.f370784e.mo37970a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e2, code lost:
        if (r1.endsWith("/search/about") == false) goto L_0x00e4;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20005d(com.google.apps.tiktok.nav.gateway.C47505k r12) {
        /*
            r11 = this;
            com.google.android.apps.search.googleapp.homescreen.a.c r0 = r11.f370779b
            boolean r1 = r0.f370783d
            if (r1 != 0) goto L_0x0017
            com.google.common.f.e r12 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.f370780a
            com.google.common.f.x r12 = r12.mo56224b()
            java.lang.String r0 = "Gateway is disabled by flag, ignoring deeplink visit."
            r1 = 40700(0x9efc, float:5.7033E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            com.google.common.util.concurrent.cx r12 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.f370781b
            return r12
        L_0x0017:
            android.content.Context r0 = r0.f370785f
            java.lang.Class<com.google.android.apps.search.googleapp.homescreen.a.c$a> r1 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.C136145a.class
            com.google.apps.tiktok.account.AccountId r12 = r12.f123336a
            java.lang.Object r12 = com.google.apps.tiktok.inject.C47245e.m84045a(r0, r1, r12)
            com.google.android.apps.search.googleapp.homescreen.a.c$a r12 = (com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.C136145a) r12
            com.google.android.apps.search.googleapp.homescreen.a.c r0 = r11.f370779b
            com.google.android.libraries.search.b.b r1 = r12.mo112799eT()
            r0.f370786g = r1
            com.google.android.apps.search.googleapp.homescreen.a.c r0 = r11.f370779b
            com.google.android.libraries.search.b.b r0 = r0.f370786g
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98126gn
            r0.mo19974a(r1)
            com.google.apps.tiktok.nav.gateway.m r0 = r11.f370778a
            android.content.Intent r0 = r0.f123337a
            java.lang.String r0 = r0.getDataString()
            boolean r1 = com.google.common.base.C58837ba.m90859h(r0)
            if (r1 == 0) goto L_0x0062
            com.google.common.f.e r12 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.f370780a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r0 = "Unable to extract deeplink URI from intent."
            r1 = 40699(0x9efb, float:5.7031E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            com.google.android.apps.search.googleapp.homescreen.a.c r12 = r11.f370779b
            com.google.android.libraries.search.b.b r12 = r12.f370786g
            com.google.android.libraries.search.b.i.f r0 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98127go
            com.google.net.a.a.b r1 = com.google.net.p4726a.p4727a.C62722b.CANCELLED
            com.google.android.libraries.search.b.i.a r0 = r0.mo40805c(r1)
            r12.mo19974a(r0)
            com.google.common.util.concurrent.cx r12 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.f370782c
            return r12
        L_0x0062:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getScheme()
            java.lang.String r1 = com.google.common.base.C58837ba.m90858g(r1)
            java.lang.String r2 = "https"
            boolean r1 = com.google.common.base.C58890d.m90990e(r1, r2)
            java.lang.String r3 = "google.com"
            r4 = 1
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = r0.getHost()
            java.lang.String r1 = com.google.common.base.C58837ba.m90858g(r1)
            java.lang.String r1 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.m221240b(r1)
            boolean r1 = com.google.common.base.C58890d.m90990e(r1, r3)
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = r0.getPath()
            java.lang.String r1 = com.google.common.base.C58837ba.m90858g(r1)
            java.lang.String r5 = "/gahomescreen"
            boolean r1 = com.google.common.base.C58890d.m90990e(r1, r5)
            if (r1 == 0) goto L_0x009d
            goto L_0x0118
        L_0x009d:
            java.lang.String r1 = r0.getScheme()
            java.lang.String r1 = com.google.common.base.C58837ba.m90858g(r1)
            boolean r1 = com.google.common.base.C58890d.m90990e(r1, r2)
            if (r1 == 0) goto L_0x00e4
            java.lang.String r1 = r0.getHost()
            java.lang.String r1 = com.google.common.base.C58837ba.m90858g(r1)
            java.lang.String r1 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.m221240b(r1)
            boolean r1 = com.google.common.base.C58890d.m90990e(r1, r3)
            if (r1 == 0) goto L_0x00e4
            java.lang.String r1 = r0.getPath()
            java.lang.String r1 = com.google.common.base.C58837ba.m90858g(r1)
            java.lang.String r1 = com.google.common.base.C58890d.m90988c(r1)
            java.lang.String r3 = "/"
            boolean r3 = r1.endsWith(r3)
            if (r3 == 0) goto L_0x00dc
            int r3 = r1.length()
            int r3 = r3 + -1
            r5 = 0
            java.lang.String r1 = r1.substring(r5, r3)
        L_0x00dc:
            java.lang.String r3 = "/search/about"
            boolean r1 = r1.endsWith(r3)
            if (r1 != 0) goto L_0x0118
        L_0x00e4:
            java.lang.String r1 = r0.getScheme()
            java.lang.String r1 = com.google.common.base.C58837ba.m90858g(r1)
            boolean r1 = com.google.common.base.C58890d.m90990e(r1, r2)
            if (r1 == 0) goto L_0x022a
            java.lang.String r1 = r0.getHost()
            java.lang.String r1 = com.google.common.base.C58837ba.m90858g(r1)
            java.lang.String r1 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.m221240b(r1)
            java.lang.String r2 = "lens.google"
            boolean r1 = com.google.common.base.C58890d.m90990e(r1, r2)
            if (r1 == 0) goto L_0x022a
            java.lang.String r1 = r0.getPath()
            java.lang.String r1 = com.google.common.base.C58837ba.m90858g(r1)
            java.lang.String r2 = "/aboutlens"
            boolean r1 = com.google.common.base.C58890d.m90990e(r1, r2)
            if (r1 != 0) goto L_0x0118
            goto L_0x022a
        L_0x0118:
            com.google.android.apps.search.googleapp.homescreen.a.c r1 = r11.f370779b
            com.google.protos.aq.aj r2 = r12.mo112800hw()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.MAIN"
            r3.<init>(r5)
            java.lang.String r5 = "source"
            java.lang.String r6 = r0.getQueryParameter(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x0134
            java.lang.String r6 = "and.gsa.deeplink"
            goto L_0x0138
        L_0x0134:
            java.lang.String r6 = com.google.android.libraries.search.logging.p3043f.C39193b.m68625b(r6)
        L_0x0138:
            r3.putExtra(r5, r6)
            com.google.android.apps.search.googleapp.h.r r5 = com.google.android.apps.search.googleapp.p10310h.C136137r.f370767d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.search.googleapp.h.q r5 = (com.google.android.apps.search.googleapp.p10310h.C136136q) r5
            java.lang.String r7 = "sop"
            java.lang.String r8 = r0.getQueryParameter(r7)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x0169
            boolean r9 = java.lang.Boolean.parseBoolean(r8)
            r3.putExtra(r7, r9)
            boolean r7 = java.lang.Boolean.parseBoolean(r8)
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.apps.search.googleapp.h.r r8 = (com.google.android.apps.search.googleapp.p10310h.C136137r) r8
            int r9 = r8.f370769a
            r9 = r9 | 2
            r8.f370769a = r9
            r8.f370771c = r7
        L_0x0169:
            java.lang.String r7 = "stick"
            java.lang.String r7 = r0.getQueryParameter(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x0178
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            goto L_0x0196
        L_0x0178:
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0185 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0185 }
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)     // Catch:{ NumberFormatException -> 0x0185 }
            goto L_0x0196
        L_0x0185:
            r7 = move-exception
            com.google.common.f.e r8 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.f370780a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r9 = "Promo ID is not a number."
            r10 = 40701(0x9efd, float:5.7034E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r7)).mo56372aa(r10)).mo56386p(r9)
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
        L_0x0196:
            boolean r8 = r7.mo56113h()
            if (r8 == 0) goto L_0x01dc
            java.lang.Object r8 = r7.mo56107c()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            boolean r2 = r2.mo59234a(r8)
            if (r2 == 0) goto L_0x01c2
            java.lang.String r2 = "promo_id"
            r3.putExtra(r2, r8)
            if (r8 == 0) goto L_0x01dc
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.android.apps.search.googleapp.h.r r2 = (com.google.android.apps.search.googleapp.p10310h.C136137r) r2
            int r9 = r2.f370769a
            r9 = r9 | r4
            r2.f370769a = r9
            r2.f370770b = r8
            goto L_0x01dc
        L_0x01c2:
            com.google.common.f.e r12 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.f370780a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r2 = "Promo %d is not supported in this version"
            r3 = 40702(0x9efe, float:5.7036E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r3)).mo56387q(r2, r8)
            com.google.android.libraries.search.b.i.f r12 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98129gq
            com.google.android.libraries.search.b.i.h r12 = r12.mo40806d()
            r1.mo112797c(r12, r0, r6, r7)
            com.google.common.util.concurrent.cx r12 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.f370781b
            goto L_0x0229
        L_0x01dc:
            boolean r2 = r12.mo112801nG()
            if (r2 == 0) goto L_0x020f
            com.google.android.apps.search.googleapp.homescreen.b.a r12 = r12.mo112798cl()
            boolean r12 = r12.mo112802a()
            if (r12 == 0) goto L_0x020f
            java.lang.String r12 = "SKIP_EXIT_ANIMATION"
            r3.putExtra(r12, r4)
            com.google.android.apps.search.googleapp.h.i r12 = com.google.android.apps.search.googleapp.p10310h.C136129j.m221208l()
            com.google.android.apps.search.googleapp.u.t r2 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN
            r12.mo112776k(r2)
            com.google.protobuf.bv r2 = r5.build()
            com.google.android.apps.search.googleapp.h.r r2 = (com.google.android.apps.search.googleapp.p10310h.C136137r) r2
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            r12.mo112774i(r2)
            com.google.android.apps.search.googleapp.h.j r12 = r12.mo112766a()
            com.google.android.apps.search.googleapp.p10310h.C136127h.m221196a(r3, r12)
            goto L_0x0218
        L_0x020f:
            java.lang.String r12 = "com.google.android.googlequicksearchbox"
            java.lang.String r2 = com.google.android.apps.gsa.h.g.e.b()
            r3.setClassName(r12, r2)
        L_0x0218:
            com.google.android.libraries.search.b.i.f r12 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98130gr
            com.google.android.libraries.search.b.i.h r12 = r12.mo40806d()
            r1.mo112797c(r12, r0, r6, r7)
            com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination r12 = com.google.apps.tiktok.nav.gateway.GatewayHandler.GatewayDestination.m84514b(r3)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
        L_0x0229:
            return r12
        L_0x022a:
            com.google.common.f.e r12 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.f370780a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r1 = "Invalid deeplink URI from intent."
            r2 = 40698(0x9efa, float:5.703E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.search.googleapp.homescreen.a.c r12 = r11.f370779b
            com.google.android.libraries.search.b.b r12 = r12.f370786g
            com.google.android.libraries.search.b.i.f r1 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98128gp
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.CANCELLED
            com.google.android.libraries.search.b.i.a r1 = r1.mo40805c(r2)
            com.google.protobuf.bt r2 = p5535j.p5536a.p5545c.p5546a.C70969b.f189243f
            j.a.c.a.b r3 = p5535j.p5536a.p5545c.p5546a.C70969b.f189242e
            com.google.protobuf.bn r3 = r3.createBuilder()
            j.a.c.a.a r3 = (p5535j.p5536a.p5545c.p5546a.C70968a) r3
            java.lang.String r0 = r0.toString()
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            j.a.c.a.b r5 = (p5535j.p5536a.p5545c.p5546a.C70969b) r5
            r0.getClass()
            int r6 = r5.f189245a
            r4 = r4 | r6
            r5.f189245a = r4
            r5.f189246b = r0
            com.google.protobuf.bv r0 = r3.build()
            j.a.c.a.b r0 = (p5535j.p5536a.p5545c.p5546a.C70969b) r0
            r3 = r1
            com.google.android.libraries.search.b.i.b r3 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r3
            r3.mo40792p(r2, r0)
            r12.mo19974a(r1)
            com.google.common.util.concurrent.cx r12 = com.google.android.apps.search.googleapp.homescreen.p10311a.C136144c.f370781b
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.homescreen.p10311a.C136143b.mo20005d(com.google.apps.tiktok.nav.gateway.k):com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }
}
