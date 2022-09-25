package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1880l.C22875c;
import com.google.android.libraries.gsa.p1880l.C22876d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.aj */
/* compiled from: PG */
final class C116379aj implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C116381al f322711a;

    public C116379aj(C116381al alVar) {
        this.f322711a = alVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58833ax axVar;
        ((C59052c) ((C59052c) ((C59052c) C116381al.f322713a.mo56225c()).mo56382g(th)).mo56372aa(31787)).mo56386p("Save request unsuccessful");
        C116381al alVar = this.f322711a;
        C22876d dVar = alVar.f322720h;
        if ((dVar.f62946a & 16) != 0) {
            C22875c a = C22875c.m42745a(dVar.f62951f);
            if (a == null) {
                a = C22875c.IMAGE;
            }
            axVar = C58833ax.m90834k(a);
        } else {
            axVar = C58836b.f156633a;
        }
        int i = 720931;
        if (axVar.mo56113h()) {
            C22875c cVar = C22875c.IMAGE;
            int ordinal = ((C22875c) axVar.mo56107c()).ordinal();
            if (ordinal == 0) {
                i = C89885b.PUMPKIN_TAG_FAILED_VALUE;
            } else if (ordinal == 1) {
                i = 720904;
            } else if (ordinal == 2) {
                i = 720927;
            } else if (ordinal == 3) {
                i = 720929;
            }
        }
        alVar.mo102675q(th, i);
        C116381al alVar2 = this.f322711a;
        alVar2.f322717e.mo78737f(alVar2.f322720h, th);
        C116381al alVar3 = this.f322711a;
        alVar3.mo102679u(alVar3.f322716d.getString(R.string.save_save_network_error), true);
        this.f322711a.f322718f.f322685a.mo102654c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo17702gm(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.apps.gsa.staticplugins.save.b.a.g r10 = (com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116428g) r10
            com.google.android.apps.gsa.staticplugins.save.a.al r0 = r9.f322711a
            com.google.android.apps.gsa.staticplugins.save.b.a.c r1 = r10.f322836b
            if (r1 != 0) goto L_0x000a
            com.google.android.apps.gsa.staticplugins.save.b.a.c r1 = com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c.f322815o
        L_0x000a:
            com.google.android.apps.gsa.staticplugins.save.b.a.c r2 = r10.f322835a
            if (r2 == 0) goto L_0x0013
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x0015
        L_0x0013:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x0015:
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x0074
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.staticplugins.save.b.a.c r2 = (com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c) r2
            com.google.android.apps.gsa.staticplugins.save.b.e r3 = r0.f322715c
            com.google.android.libraries.gsa.monet.tools.model.shared.b r3 = r3.mo102660e()
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r3 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a) r3
            java.lang.Object r3 = r3.f63720e
            com.google.common.base.ax r3 = (com.google.common.base.C58833ax) r3
            com.google.android.libraries.gsa.l.d r4 = r0.f322720h
            int r4 = r4.f62951f
            com.google.android.libraries.gsa.l.c r4 = com.google.android.libraries.gsa.p1880l.C22875c.m42745a(r4)
            if (r4 != 0) goto L_0x0039
            com.google.android.libraries.gsa.l.c r4 = com.google.android.libraries.gsa.p1880l.C22875c.IMAGE
        L_0x0039:
            java.util.List r4 = r0.mo102666h(r4)
            boolean r5 = r3.mo56113h()
            if (r5 == 0) goto L_0x005d
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.save.b.a.e r3 = (com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116426e) r3
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.android.apps.gsa.staticplugins.save.b.a.d r3 = (com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116425d) r3
            int r4 = r4.size()
            r3.mo102694b(r4, r2)
            com.google.protobuf.bv r2 = r3.build()
            com.google.android.apps.gsa.staticplugins.save.b.a.e r2 = (com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116426e) r2
            goto L_0x0071
        L_0x005d:
            com.google.android.apps.gsa.staticplugins.save.b.a.e r3 = com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116426e.f322830b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.staticplugins.save.b.a.d r3 = (com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116425d) r3
            r3.mo102693a(r4)
            r3.mo102695c(r2)
            com.google.protobuf.bv r2 = r3.build()
            com.google.android.apps.gsa.staticplugins.save.b.a.e r2 = (com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116426e) r2
        L_0x0071:
            r0.mo102677s(r2)
        L_0x0074:
            r0.f322721i = r1
            r0.mo102676r(r1)
            r0.f322722j = r1
            com.google.android.apps.gsa.staticplugins.save.b.e r0 = r0.f322715c
            com.google.android.libraries.gsa.monet.tools.model.shared.b r0 = r0.mo102658c()
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r0 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a) r0
            java.lang.String r1 = r1.f322820d
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r2 = 0
            r0.mo28730f(r1, r2)
            com.google.android.apps.gsa.staticplugins.save.a.al r0 = r9.f322711a
            com.google.android.libraries.gsa.l.d r1 = r0.f322720h
            int r2 = r1.f62946a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x00a6
            int r1 = r1.f62951f
            com.google.android.libraries.gsa.l.c r1 = com.google.android.libraries.gsa.p1880l.C22875c.m42745a(r1)
            if (r1 != 0) goto L_0x00a1
            com.google.android.libraries.gsa.l.c r1 = com.google.android.libraries.gsa.p1880l.C22875c.IMAGE
        L_0x00a1:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x00a8
        L_0x00a6:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x00a8:
            com.google.android.apps.gsa.staticplugins.save.b.a.c r2 = r10.f322836b
            if (r2 != 0) goto L_0x00ae
            com.google.android.apps.gsa.staticplugins.save.b.a.c r2 = com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c.f322815o
        L_0x00ae:
            com.google.android.libraries.gsa.l.l r3 = com.google.android.libraries.gsa.p1880l.C22884l.f62985g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.gsa.l.i r3 = (com.google.android.libraries.gsa.p1880l.C22881i) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.gsa.l.l r4 = (com.google.android.libraries.gsa.p1880l.C22884l) r4
            r5 = 1
            r4.f62990d = r5
            int r6 = r4.f62987a
            r6 = r6 | r5
            r4.f62987a = r6
            com.google.android.libraries.gsa.l.d r4 = r0.f322720h
            long r6 = r4.f62968w
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.gsa.l.l r4 = (com.google.android.libraries.gsa.p1880l.C22884l) r4
            int r8 = r4.f62987a
            r8 = r8 | 16
            r4.f62987a = r8
            r4.f62992f = r6
            com.google.bv.f.a.a.aj r4 = com.google.android.apps.gsa.staticplugins.save.p8694a.C116371ab.m193011b(r2)
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.libraries.gsa.l.l r6 = (com.google.android.libraries.gsa.p1880l.C22884l) r6
            r4.getClass()
            com.google.protobuf.cq r7 = r6.f62991e
            boolean r8 = r7.mo58948c()
            if (r8 != 0) goto L_0x00f4
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r6.f62991e = r7
        L_0x00f4:
            com.google.protobuf.cq r6 = r6.f62991e
            r6.add(r4)
            com.google.android.libraries.gsa.l.d r4 = r0.f322720h
            int r4 = r4.f62946a
            r6 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0104
            goto L_0x01f3
        L_0x0104:
            boolean r4 = r1.mo56113h()
            if (r4 == 0) goto L_0x01f3
            com.google.android.libraries.gsa.l.c r4 = com.google.android.libraries.gsa.p1880l.C22875c.IMAGE
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.gsa.l.c r1 = (com.google.android.libraries.gsa.p1880l.C22875c) r1
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x01ad
            if (r1 == r5) goto L_0x0134
            r10 = 3
            if (r1 == r10) goto L_0x011f
            goto L_0x01f3
        L_0x011f:
            com.google.android.libraries.gsa.l.d r10 = r0.f322720h
            java.lang.String r10 = r10.f62961p
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.android.libraries.gsa.l.l r1 = (com.google.android.libraries.gsa.p1880l.C22884l) r1
            r10.getClass()
            r2 = 7
            r1.f62988b = r2
            r1.f62989c = r10
            goto L_0x01f3
        L_0x0134:
            com.google.protobuf.cq r10 = r10.f322837c
            java.util.Iterator r10 = r10.iterator()
        L_0x013a:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0196
            java.lang.Object r1 = r10.next()
            com.google.bv.f.a.a.am r1 = (com.google.p4283bv.p4369f.p4370a.p4371a.C57569am) r1
            int r2 = r1.f153799a
            r4 = 9
            if (r2 != r4) goto L_0x013a
            java.lang.Object r1 = r1.f153800b
            com.google.bv.f.a.a.df r1 = (com.google.p4283bv.p4369f.p4370a.p4371a.C57643df) r1
            com.google.android.apps.gsa.staticplugins.save.a.b.f r2 = r0.f322724l
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r4 = r2.f322768b
            com.google.common.util.concurrent.cx r4 = r4.mo79697b()
            com.google.apps.tiktok.tracing.contrib.b.f r4 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r4)
            com.google.android.apps.gsa.staticplugins.save.a.b.c r6 = new com.google.android.apps.gsa.staticplugins.save.a.b.c
            r6.<init>(r2, r1)
            java.util.concurrent.Executor r2 = r2.f322769c
            com.google.apps.tiktok.tracing.contrib.b.f r2 = r4.mo51516i(r6, r2)
            com.google.android.apps.gsa.staticplugins.save.a.b.d r4 = com.google.android.apps.gsa.staticplugins.save.p8694a.p8696b.C116394d.f322766a
            com.google.common.util.concurrent.bg r6 = com.google.common.util.concurrent.C60826bg.f164896a
            r2.mo51515h(r4, r6)
            java.lang.String r2 = r1.f153947a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x017b
            java.lang.String r2 = r1.f153947a
            r0.mo102667i(r2)
        L_0x017b:
            java.lang.String r2 = r1.f153949c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0188
            java.lang.String r2 = r1.f153949c
            r0.mo102667i(r2)
        L_0x0188:
            java.lang.String r2 = r1.f153950d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x013a
            java.lang.String r1 = r1.f153950d
            r0.mo102667i(r1)
            goto L_0x013a
        L_0x0196:
            r0.mo102669k(r5)
            com.google.android.libraries.gsa.l.d r10 = r0.f322720h
            java.lang.String r10 = r10.f62948c
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.android.libraries.gsa.l.l r1 = (com.google.android.libraries.gsa.p1880l.C22884l) r1
            r10.getClass()
            r2 = 4
            r1.f62988b = r2
            r1.f62989c = r10
            goto L_0x01f3
        L_0x01ad:
            int r10 = r2.f322817a
            java.lang.String r1 = ""
            if (r10 != r5) goto L_0x01b8
            java.lang.Object r10 = r2.f322818b
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x01b9
        L_0x01b8:
            r10 = r1
        L_0x01b9:
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x01c2
            java.lang.String r1 = "users/me/tags/dt_fav_images"
            goto L_0x01cb
        L_0x01c2:
            int r10 = r2.f322817a
            if (r10 != r5) goto L_0x01cb
            java.lang.Object r10 = r2.f322818b
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1
        L_0x01cb:
            com.google.android.apps.gsa.search.core.al.ax.a.b r10 = r0.f322723k
            com.google.android.libraries.gsa.l.d r2 = r0.f322720h
            com.google.protos.w.a.a.h r2 = r2.f62950e
            if (r2 != 0) goto L_0x01d5
            com.google.protos.w.a.a.h r2 = com.google.protos.p5146w.p5147a.p5148a.C65930h.f179300i
        L_0x01d5:
            java.lang.String r2 = r2.f179303b
            r10.mo78464a(r2, r1, r5)
            com.google.android.libraries.gsa.l.d r10 = r0.f322720h
            com.google.protos.w.a.a.h r10 = r10.f62950e
            if (r10 != 0) goto L_0x01e2
            com.google.protos.w.a.a.h r10 = com.google.protos.p5146w.p5147a.p5148a.C65930h.f179300i
        L_0x01e2:
            java.lang.String r10 = r10.f179303b
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.android.libraries.gsa.l.l r1 = (com.google.android.libraries.gsa.p1880l.C22884l) r1
            r10.getClass()
            r2 = 5
            r1.f62988b = r2
            r1.f62989c = r10
        L_0x01f3:
            com.google.protobuf.bv r10 = r3.build()
            com.google.android.libraries.gsa.l.l r10 = (com.google.android.libraries.gsa.p1880l.C22884l) r10
            r0.mo102672n(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.save.p8694a.C116379aj.mo17702gm(java.lang.Object):void");
    }
}
