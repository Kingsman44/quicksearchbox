package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7148ui.C90656ba;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.eu */
/* compiled from: PG */
final class C109008eu implements C90656ba {

    /* renamed from: a */
    final /* synthetic */ C86124t f303119a;

    /* renamed from: b */
    final /* synthetic */ C58833ax f303120b;

    /* renamed from: c */
    final /* synthetic */ C109040fj f303121c;

    public C109008eu(C109040fj fjVar, C86124t tVar, C58833ax axVar) {
        this.f303121c = fjVar;
        this.f303119a = tVar;
        this.f303120b = axVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        if (((com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4406b.C57749b) r0).f154284a == false) goto L_0x00f1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo73061a(android.view.MotionEvent r8) {
        /*
            r7 = this;
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f303119a
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247771nT
            boolean r0 = r0.mo79746e(r1)
            r1 = 0
            if (r0 == 0) goto L_0x010e
            int r0 = r8.getAction()
            r2 = 1
            if (r0 != r2) goto L_0x010e
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r7.f303121c
            com.google.android.apps.gsa.staticplugins.opa.oe r0 = r0.f303459x
            r0.mo98098e()
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r7.f303121c
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r0.f303450o
            com.google.android.apps.gsa.staticplugins.opa.chatui.id r0 = r0.mo95424m()
            android.support.v7.widget.RecyclerView r0 = r0.f301565l
            if (r0 == 0) goto L_0x002d
            boolean r0 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148877i(r0, r8)
            if (r0 == 0) goto L_0x002d
            goto L_0x010e
        L_0x002d:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r7.f303121c
            r2 = 0
        L_0x0030:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r3 = r0.f303450o
            int r3 = r3.mo95417f()
            if (r2 >= r3) goto L_0x00f1
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r3 = r0.f303450o
            com.google.android.apps.gsa.staticplugins.opa.chatui.bf r3 = r3.mo95421j()
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r3 = r3.mo95352b(r2)
            if (r3 != 0) goto L_0x0046
            goto L_0x00ed
        L_0x0046:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bl r4 = r3.mo96603m()
            if (r4 == 0) goto L_0x00ed
            android.view.View r4 = r4.itemView
            boolean r4 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148877i(r4, r8)
            if (r4 == 0) goto L_0x00ed
            boolean r4 = r3 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108474ka
            if (r4 != 0) goto L_0x005a
            goto L_0x00f1
        L_0x005a:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ka r3 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108474ka) r3
            com.google.at.h.b.a.r r3 = r3.f301718b
            com.google.protobuf.bt r4 = com.google.p4017at.p4060h.p4068b.p4069a.C54192i.f142222b
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r5 = r3.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            if (r4 == 0) goto L_0x00f1
            com.google.protobuf.bt r4 = com.google.p4017at.p4060h.p4068b.p4069a.C54192i.f142222b
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r5 = r4.f169971d
            java.lang.Object r3 = r3.mo58854l(r5)
            if (r3 != 0) goto L_0x0087
            java.lang.Object r3 = r4.f169969b
            goto L_0x008b
        L_0x0087:
            java.lang.Object r3 = r4.mo58889c(r3)
        L_0x008b:
            com.google.bv.j.b.a.p r3 = (com.google.p4283bv.p4380j.p4385b.p4386a.C57784p) r3
            com.google.protobuf.bt r4 = com.google.p4283bv.p4380j.p4385b.p4386a.C57786r.f154391b
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r5 = r4.f169971d
            java.lang.Object r3 = r3.mo58854l(r5)
            if (r3 != 0) goto L_0x00a3
            java.lang.Object r3 = r4.f169969b
            goto L_0x00a7
        L_0x00a3:
            java.lang.Object r3 = r4.mo58889c(r3)
        L_0x00a7:
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x00ad:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00ed
            java.lang.Object r4 = r3.next()
            com.google.bv.j.b.a.r r4 = (com.google.p4283bv.p4380j.p4385b.p4386a.C57786r) r4
            com.google.protobuf.bt r5 = com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4406b.C57749b.f154282c
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r4.mo58887l(r5)
            com.google.protobuf.bf r6 = r4.f169962ag
            com.google.protobuf.bs r5 = r5.f169971d
            boolean r5 = r6.mo58857o(r5)
            if (r5 == 0) goto L_0x00ad
            com.google.protobuf.bt r0 = com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4406b.C57749b.f154282c
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r4.mo58887l(r0)
            com.google.protobuf.bf r2 = r4.f169962ag
            com.google.protobuf.bs r3 = r0.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x00e2
            java.lang.Object r0 = r0.f169969b
            goto L_0x00e6
        L_0x00e2:
            java.lang.Object r0 = r0.mo58889c(r2)
        L_0x00e6:
            com.google.bv.j.b.a.b.c.a.b.b r0 = (com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4406b.C57749b) r0
            boolean r0 = r0.f154284a
            if (r0 != 0) goto L_0x010e
            goto L_0x00f1
        L_0x00ed:
            int r2 = r2 + 1
            goto L_0x0030
        L_0x00f1:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r7.f303121c
            r0.mo97461aW()
            com.google.common.base.ax r0 = r7.f303120b
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x010e
            com.google.common.base.ax r0 = r7.f303120b
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r0 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r0
            com.google.android.libraries.f.a r2 = r0.f300693g
            long r2 = r2.mo26871c()
            r0.f300694h = r2
        L_0x010e:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r7.f303121c
            boolean r2 = r0.mo97523bp()
            if (r2 == 0) goto L_0x0117
            goto L_0x015f
        L_0x0117:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f303455t
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247204cj
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x015f
            int r2 = r8.getAction()
            if (r2 != 0) goto L_0x015f
            android.view.View r2 = r0.f303256aP
            if (r2 == 0) goto L_0x0131
            boolean r2 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148877i(r2, r8)
            if (r2 != 0) goto L_0x015f
        L_0x0131:
            android.view.View r2 = r0.f303257aQ
            if (r2 == 0) goto L_0x013b
            boolean r8 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148877i(r2, r8)
            if (r8 != 0) goto L_0x015f
        L_0x013b:
            int r8 = r0.f303306bM
            boolean r8 = com.google.android.apps.gsa.staticplugins.opa.C109040fj.m181377bs(r8)
            if (r8 == 0) goto L_0x0144
            goto L_0x015a
        L_0x0144:
            int r8 = r0.mo97532c()
            if (r8 != 0) goto L_0x015a
            boolean r8 = r0.mo97520bl()
            if (r8 == 0) goto L_0x015f
            com.google.android.apps.gsa.nga.api.a.be r8 = r0.f303307bN
            com.google.android.apps.gsa.nga.api.a.be r0 = com.google.android.apps.gsa.nga.api.a.be.a
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x015f
        L_0x015a:
            com.google.android.apps.gsa.staticplugins.opa.fj r8 = r7.f303121c
            r8.mo97459aU()
        L_0x015f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109008eu.mo73061a(android.view.MotionEvent):boolean");
    }
}
