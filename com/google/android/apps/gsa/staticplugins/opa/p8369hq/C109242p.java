package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import android.widget.ImageView;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.p */
/* compiled from: PG */
final class C109242p implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C58833ax f304187a;

    /* renamed from: b */
    final /* synthetic */ List f304188b;

    /* renamed from: c */
    final /* synthetic */ ImageView f304189c;

    /* renamed from: d */
    final /* synthetic */ C109243q f304190d;

    public C109242p(C109243q qVar, C58833ax axVar, List list, ImageView imageView) {
        this.f304190d = qVar;
        this.f304187a = axVar;
        this.f304188b = list;
        this.f304189c = imageView;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C109243q.f304191a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HqController");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(24599)).mo56386p("#updatesCenter Failed to read Updates Center visual data with error");
    }

    /* JADX WARNING: type inference failed for: r9v14, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo17702gm(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.common.base.ax r9 = (com.google.common.base.C58833ax) r9
            com.google.common.o.aln r0 = com.google.common.p4552o.aln.f159082f
            java.lang.Object r9 = r9.mo56109e(r0)
            com.google.common.o.aln r9 = (com.google.common.p4552o.aln) r9
            com.google.common.base.ax r0 = r8.f304187a
            boolean r1 = r0.mo56113h()
            r2 = 1
            if (r1 == 0) goto L_0x008a
            java.lang.Object r0 = r0.mo56107c()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r9.f159088d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0064
            com.google.common.o.aln r0 = com.google.common.p4552o.aln.f159082f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.alm r0 = (com.google.common.p4552o.alm) r0
            com.google.common.base.ax r1 = r8.f304187a
            java.lang.Object r1 = r1.mo56107c()
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.aln r3 = (com.google.common.p4552o.aln) r3
            r1.getClass()
            int r4 = r3.f159085a
            r4 = r4 | 4
            r3.f159085a = r4
            r3.f159088d = r1
            int r9 = r9.f159086b
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.aln r1 = (com.google.common.p4552o.aln) r1
            int r3 = r1.f159085a
            r3 = r3 | r2
            r1.f159085a = r3
            int r9 = r9 + r2
            r1.f159086b = r9
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.common.o.aln r9 = (com.google.common.p4552o.aln) r9
            int r1 = r9.f159085a
            r1 = r1 | 2
            r9.f159085a = r1
            r9.f159087c = r2
            goto L_0x0093
        L_0x0064:
            com.google.protobuf.bn r0 = r9.toBuilder()
            com.google.common.o.alm r0 = (com.google.common.p4552o.alm) r0
            int r9 = r9.f159087c
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.aln r1 = (com.google.common.p4552o.aln) r1
            int r3 = r1.f159085a
            r3 = r3 | 2
            r1.f159085a = r3
            int r9 = r9 + r2
            r1.f159087c = r9
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.common.o.aln r9 = (com.google.common.p4552o.aln) r9
            com.google.protobuf.cq r1 = com.google.protobuf.C62942bv.emptyProtobufList()
            r9.f159089e = r1
            goto L_0x0093
        L_0x008a:
            com.google.common.o.aln r9 = com.google.common.p4552o.aln.f159082f
            com.google.protobuf.bn r9 = r9.createBuilder()
            r0 = r9
            com.google.common.o.alm r0 = (com.google.common.p4552o.alm) r0
        L_0x0093:
            com.google.common.base.ax r9 = r8.f304187a
            boolean r1 = r9.mo56113h()
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r9 = r9.mo56107c()
            java.lang.String r9 = (java.lang.String) r9
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.aln r1 = (com.google.common.p4552o.aln) r1
            r9.getClass()
            r1.mo57022a()
            com.google.protobuf.cq r1 = r1.f159089e
            r1.add(r9)
        L_0x00b3:
            java.util.List r9 = r8.f304188b
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.aln r1 = (com.google.common.p4552o.aln) r1
            r1.mo57022a()
            com.google.protobuf.cq r1 = r1.f159089e
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r9, (java.util.List) r1)
            com.google.protobuf.bv r9 = r0.build()
            com.google.common.o.aln r9 = (com.google.common.p4552o.aln) r9
            com.google.common.base.ax r0 = r8.f304187a
            android.widget.ImageView r1 = r8.f304189c
            com.google.android.apps.gsa.shared.logger.j.i r3 = new com.google.android.apps.gsa.shared.logger.j.i
            com.google.android.apps.gsa.shared.logger.j.f r4 = new com.google.android.apps.gsa.shared.logger.j.f
            r4.<init>()
            r4.f246425d = r9
            r5 = 89386(0x15d2a, float:1.25256E-40)
            com.google.android.apps.gsa.shared.logger.j.k r4 = r4.mo83781a()
            r3.<init>(r5, r4)
            r4 = 5
            r3.mo33795i(r4)
            boolean r0 = r0.mo56113h()
            if (r2 == r0) goto L_0x00ec
            r2 = 3
        L_0x00ec:
            r3.mo33794h(r2)
            com.google.android.libraries.logging.C28295m.m52919e(r1, r3)
            android.widget.ImageView r0 = r8.f304189c
            com.google.android.libraries.logging.k r0 = com.google.android.libraries.logging.C28295m.m52916b(r0)
            com.google.android.apps.gsa.staticplugins.opa.hq.q r1 = r8.f304190d
            dagger.a r1 = r1.f304199i
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.c.b r1 = (com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.c.b) r1
            com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.c.b.f(r0)
            android.widget.ImageView r0 = r8.f304189c
            com.google.android.apps.gsa.staticplugins.opa.hq.o r1 = new com.google.android.apps.gsa.staticplugins.opa.hq.o
            r1.<init>(r8)
            r0.setOnClickListener(r1)
            com.google.android.apps.gsa.staticplugins.opa.hq.q r0 = r8.f304190d
            dagger.a r0 = r0.f304198h
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.be.bm r0 = (com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm) r0
            com.google.android.apps.gsa.staticplugins.opa.be.q r1 = r0.f300493i
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            byte[] r5 = r9.toByteArray()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f300487c
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247356fc
            long r2 = r2.mo79743a(r3)
            long r6 = r9.toMinutes(r2)
            r2 = 15
            r3 = 26
            com.google.common.util.concurrent.cx r9 = r1.mo96378g(r2, r3, r4, r5, r6)
            com.google.android.libraries.gsa.k.g r0 = r0.f300486b
            com.google.android.apps.gsa.staticplugins.opa.be.al r1 = com.google.android.apps.gsa.staticplugins.opa.p8335be.C107985al.f300454a
            java.lang.String r2 = "updateUpdatesCenterVisualData"
            com.google.android.apps.gsa.shared.util.c.ag r9 = com.google.android.apps.gsa.shared.util.p7159c.C90875ai.m148465b(r1, r9, r0, r2)
            com.google.android.apps.gsa.staticplugins.opa.be.am r0 = com.google.android.apps.gsa.staticplugins.opa.p8335be.C107986am.f300455a
            r9.mo85223a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109242p.mo17702gm(java.lang.Object):void");
    }
}
