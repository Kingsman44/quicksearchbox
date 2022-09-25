package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.util.Size;
import com.google.android.apps.gsa.assist.C9330aa;
import com.google.android.apps.gsa.assist.C9421k;
import com.google.android.apps.gsa.assist.C9422l;
import com.google.android.apps.gsa.assist.C9434x;
import com.google.android.apps.gsa.assist.C9436z;
import com.google.android.libraries.lens.ondevice.p2018b.p2022d.C24289a;
import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24227s;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.p2014e.C24232x;
import com.google.android.libraries.lens.p2014e.C24233y;
import com.google.android.libraries.lens.p2014e.p2015a.C24194m;
import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.android.libraries.lens.p2014e.p2015a.C24196o;
import com.google.android.libraries.lens.p2014e.p2015a.C24197p;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2054ae.C25023v;
import com.google.android.libraries.lens.view.p2054ae.C25024w;
import com.google.android.libraries.lens.view.p2056af.C25043ao;
import com.google.android.libraries.lens.view.p2070an.C25387ay;
import com.google.android.libraries.lens.view.p2070an.C25437i;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.utils.C28131t;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58584kl;
import com.google.common.p4522b.C58585km;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4575r.C60763t;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.lens.p4707j.C62396a;
import com.google.lens.p4707j.C62440bq;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62450c;
import com.google.lens.p4707j.C62454cd;
import com.google.p4017at.p4056g.p4057a.p4058a.C53984as;
import com.google.p4017at.p4056g.p4057a.p4058a.C53987av;
import com.google.p4017at.p4056g.p4057a.p4058a.C53988aw;
import com.google.p4017at.p4056g.p4057a.p4058a.C53989ax;
import com.google.p4017at.p4056g.p4057a.p4058a.C53990ay;
import com.google.p4017at.p4056g.p4057a.p4058a.C53991az;
import com.google.p4017at.p4056g.p4057a.p4058a.C53993ba;
import com.google.p4017at.p4056g.p4057a.p4058a.C53995bc;
import com.google.p4017at.p4056g.p4057a.p4058a.C53998bf;
import com.google.p4017at.p4056g.p4057a.p4058a.C53999bg;
import com.google.p4017at.p4056g.p4057a.p4058a.C54000bh;
import com.google.p4017at.p4056g.p4057a.p4058a.C54001bi;
import com.google.p4017at.p4056g.p4057a.p4058a.C54002bj;
import com.google.p4017at.p4056g.p4057a.p4058a.C54008bp;
import com.google.p4017at.p4056g.p4057a.p4058a.C54022cc;
import com.google.p4017at.p4056g.p4057a.p4058a.C54035cp;
import com.google.p4017at.p4056g.p4057a.p4058a.C54036cq;
import com.google.p4017at.p4056g.p4057a.p4058a.C54064p;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56243ax;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56251be;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4963bf.p4964a.p4965a.C64591bm;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.an.b.af */
/* compiled from: PG */
public final class C25396af implements C27654a, C24289a {

    /* renamed from: a */
    public static final C58974d f69177a = C58974d.m91135i("ServerQueryEngine");

    /* renamed from: A */
    private long f69178A = 1;

    /* renamed from: B */
    private C60870cx f69179B;

    /* renamed from: b */
    final C25394ad f69180b;

    /* renamed from: c */
    public final C58833ax f69181c;

    /* renamed from: d */
    public final Executor f69182d;

    /* renamed from: e */
    public final Executor f69183e;

    /* renamed from: f */
    public final C25024w f69184f;

    /* renamed from: g */
    public final C27232l f69185g;

    /* renamed from: h */
    public final C25402al f69186h;

    /* renamed from: i */
    public final C25043ao f69187i;

    /* renamed from: j */
    public final C25437i f69188j;

    /* renamed from: k */
    public final C58833ax f69189k;

    /* renamed from: l */
    public final boolean f69190l;

    /* renamed from: m */
    public final long f69191m;

    /* renamed from: n */
    public final C58585km f69192n = new C58584kl(4);

    /* renamed from: o */
    public boolean f69193o;

    /* renamed from: p */
    public boolean f69194p;

    /* renamed from: q */
    public C25428z f69195q;

    /* renamed from: r */
    public C25428z f69196r;

    /* renamed from: s */
    public C25395ae f69197s;

    /* renamed from: t */
    private final C58833ax f69198t;

    /* renamed from: u */
    private final C60888db f69199u;

    /* renamed from: v */
    private final C26244b f69200v;

    /* renamed from: w */
    private final C58833ax f69201w;

    /* renamed from: x */
    private final C58833ax f69202x;

    /* renamed from: y */
    private final C47632e f69203y = new C47632e();

    /* renamed from: z */
    private long f69204z = 2;

    public C25396af(C25024w wVar, C25394ad adVar, C58833ax axVar, C58833ax axVar2, C60888db dbVar, Executor executor, Executor executor2, C26244b bVar, C27232l lVar, C25402al alVar, C58833ax axVar3, C25043ao aoVar, C25437i iVar, C58833ax axVar4, C58833ax axVar5, boolean z) {
        this.f69200v = bVar;
        this.f69191m = C28131t.f76545a.mo33577a();
        this.f69180b = adVar;
        this.f69198t = axVar;
        this.f69201w = axVar3;
        this.f69181c = axVar2;
        this.f69199u = dbVar;
        this.f69182d = executor;
        this.f69183e = executor2;
        this.f69184f = wVar;
        this.f69185g = lVar;
        this.f69186h = alVar;
        this.f69187i = aoVar;
        this.f69188j = iVar;
        this.f69202x = axVar4;
        this.f69189k = axVar5;
        this.f69190l = z;
    }

    /* renamed from: a */
    public final void mo29855a() {
        C25387ay.m46760a();
        if (this.f69193o) {
            C58970a aVar = (C58970a) f69177a.mo56226d();
            aVar.mo56380ai(C58979ad.FULL);
            ((C58970a) aVar.mo56372aa(49892)).mo56386p("already started");
            return;
        }
        this.f69193o = true;
        mo30441i();
    }

    /* renamed from: b */
    public final void mo29856b() {
        C25387ay.m46760a();
        if (!this.f69193o) {
            C58970a aVar = (C58970a) f69177a.mo56226d();
            aVar.mo56380ai(C58979ad.FULL);
            ((C58970a) aVar.mo56372aa(49894)).mo56386p("already stopped");
            return;
        }
        this.f69193o = false;
        this.f69195q = null;
        mo30443k((Throwable) null);
        C25394ad adVar = this.f69180b;
        C25387ay.m46760a();
        adVar.f69175b = null;
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("ServerQueryEngine");
        eVar.mo33149f("sessionId", C60763t.m92767d(this.f69191m, 10));
        eVar.mo33147d("Session id", C63088z.m96143E(C60763t.m92767d(this.f69191m, 10)), false);
        C25428z zVar = this.f69195q;
        if (zVar != null) {
            C56244ay ayVar = zVar.f69296b.f141679a;
            if (ayVar == null) {
                ayVar = C56244ay.f149802e;
            }
            eVar.mo33149f("lastPrefetchRequestId", C25023v.m46305c(ayVar));
            eVar.mo33147d("Prefetch request", zVar.f69296b.toByteString(), true);
            C54008bp bpVar = zVar.f69301g;
            if (bpVar != null) {
                eVar.mo33147d("Prefetch response", bpVar.toByteString(), true);
            }
            C56244ay ayVar2 = zVar.f69296b.f141679a;
            if (ayVar2 == null) {
                ayVar2 = C56244ay.f149802e;
            }
            eVar.mo33147d("Payload id", C63088z.m96143E(C60763t.m92767d(ayVar2.f149807d, 10)), true);
            C54002bj bjVar = zVar.f69297c;
            if (bjVar != null) {
                C56244ay ayVar3 = bjVar.f141679a;
                if (ayVar3 == null) {
                    ayVar3 = C56244ay.f149802e;
                }
                eVar.mo33149f("lastInteractionRequestId", C25023v.m46305c(ayVar3));
                C56244ay ayVar4 = zVar.f69297c.f141679a;
                if (ayVar4 == null) {
                    ayVar4 = C56244ay.f149802e;
                }
                eVar.mo33147d("Interaction id", C63088z.m96143E(C60763t.m92767d(ayVar4.f149806c, 10)), false);
                eVar.mo33147d("Interaction request", zVar.f69297c.toByteString(), true);
                C54008bp bpVar2 = zVar.f69300f;
                if (bpVar2 != null) {
                    eVar.mo33147d("Interaction response", bpVar2.toByteString(), true);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x01ad  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo30436d(com.google.android.libraries.lens.p2014e.C24201ad r12, com.google.android.libraries.lens.p2014e.C24209al r13) {
        /*
            r11 = this;
            com.google.android.libraries.lens.view.p2070an.C25387ay.m46760a()
            java.util.concurrent.Executor r0 = r11.f69183e
            com.google.android.libraries.lens.e.af r1 = r12.mo29680c()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ServerQueryEngine["
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "]"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.libraries.lens.view.d.k r13 = com.google.android.libraries.lens.view.p2070an.C25372aj.m46734a(r13, r0, r1)
            com.google.android.libraries.lens.view.an.b.ad r0 = r11.f69180b
            com.google.android.libraries.lens.view.p2070an.C25387ay.m46760a()
            com.google.android.libraries.lens.view.an.b.aa r1 = r0.f69175b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0044
            r4 = r1
            com.google.android.libraries.lens.view.an.b.d r4 = (com.google.android.libraries.lens.view.p2070an.p2072b.C25406d) r4
            com.google.android.libraries.lens.e.ad r4 = r4.f69243a
            com.google.android.libraries.lens.e.s r4 = r4.mo29678a()
            com.google.android.libraries.lens.e.s r5 = r12.mo29678a()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0044
            r4 = 1
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            if (r4 == 0) goto L_0x0070
            com.google.common.f.a.d r5 = f69177a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5
            r6 = 49885(0xc2dd, float:6.9904E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5
            com.google.android.libraries.lens.e.af r6 = r12.mo29680c()
            r7 = r1
            com.google.android.libraries.lens.view.an.b.d r7 = (com.google.android.libraries.lens.view.p2070an.p2072b.C25406d) r7
            com.google.android.libraries.lens.e.ad r8 = r7.f69243a
            com.google.android.libraries.lens.e.af r8 = r8.mo29680c()
            java.lang.String r9 = "Query[%s] reusing prefetch images from Query[%s]"
            r5.mo56354G(r9, r6, r8)
            com.google.common.util.concurrent.cx r5 = r7.f69244b
            com.google.common.base.ax r6 = r7.f69245c
            goto L_0x00f2
        L_0x0070:
            com.google.android.libraries.lens.view.an.b.o r5 = r0.f69174a
            com.google.android.libraries.lens.e.s r6 = r12.mo29678a()
            com.google.common.base.ax r7 = r6.mo29712g()
            boolean r7 = r7.mo56113h()
            if (r7 == 0) goto L_0x00d5
            com.google.common.base.ax r7 = r6.mo29712g()
            boolean r7 = r7.mo56113h()
            com.google.common.base.C58838bb.m90868c(r7)
            com.google.android.libraries.lens.view.an.b.g r7 = com.google.android.libraries.lens.view.p2070an.p2072b.C25411i.m46824h()
            android.graphics.Bitmap r8 = r6.mo29707c()
            r7.mo30430c(r8)
            android.graphics.Rect r8 = new android.graphics.Rect
            android.util.Size r9 = r6.mo29792n()
            int r9 = r9.getWidth()
            android.util.Size r10 = r6.mo29792n()
            int r10 = r10.getHeight()
            r8.<init>(r3, r3, r9, r10)
            r9 = r7
            com.google.android.libraries.lens.view.an.b.a r9 = (com.google.android.libraries.lens.view.p2070an.p2072b.C25390a) r9
            r9.f69164a = r8
            com.google.common.base.ax r6 = r6.mo29712g()
            java.lang.Object r6 = r6.mo56107c()
            java.lang.String r6 = (java.lang.String) r6
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90833j(r6)
            r9.f69165b = r6
            com.google.android.libraries.lens.view.flags.b r5 = r5.f69265a
            com.google.android.libraries.lens.view.flags.a r6 = com.google.android.libraries.lens.view.flags.C26239a.PREFETCH_COMPRESSION_QUALITY
            long r5 = r5.mo31456b(r6)
            int r6 = (int) r5
            r7.mo30431d(r6)
            com.google.android.libraries.lens.view.an.b.i r5 = r7.mo30466e()
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            goto L_0x00e1
        L_0x00d5:
            android.graphics.Bitmap r7 = r6.mo29707c()
            android.graphics.RectF r6 = r6.mo29708d()
            com.google.common.util.concurrent.cx r5 = r5.mo30471a(r7, r6)
        L_0x00e1:
            com.google.android.libraries.lens.e.s r6 = r12.mo29678a()
            com.google.common.base.ax r6 = r6.mo29713h()
            com.google.android.libraries.lens.view.an.b.ab r7 = new com.google.android.libraries.lens.view.an.b.ab
            r7.<init>(r0, r12)
            com.google.common.base.ax r6 = r6.mo56106b(r7)
        L_0x00f2:
            com.google.common.base.ax r7 = r12.mo29682e()
            com.google.android.libraries.lens.view.an.b.ac r8 = com.google.android.libraries.lens.view.p2070an.p2072b.C25393ac.f69173a
            com.google.common.base.ax r7 = r7.mo56106b(r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r7 = r7.mo56109e(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0178
            if (r4 == 0) goto L_0x0143
            com.google.android.libraries.lens.view.an.b.d r1 = (com.google.android.libraries.lens.view.p2070an.p2072b.C25406d) r1
            com.google.android.libraries.lens.e.ad r4 = r1.f69243a
            com.google.common.base.ax r4 = r4.mo29682e()
            com.google.common.base.ax r7 = r12.mo29682e()
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0143
            com.google.common.f.a.d r2 = f69177a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            r3 = 49884(0xc2dc, float:6.9902E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            com.google.android.libraries.lens.e.af r3 = r12.mo29680c()
            com.google.android.libraries.lens.e.ad r4 = r1.f69243a
            com.google.android.libraries.lens.e.af r4 = r4.mo29680c()
            java.lang.String r7 = "Query[%s] reusing interaction image from Query[%s]"
            r2.mo56354G(r7, r3, r4)
            com.google.common.base.ax r1 = r1.f69246d
            goto L_0x017a
        L_0x0143:
            com.google.android.libraries.lens.view.an.b.o r1 = r0.f69174a
            com.google.android.libraries.lens.e.s r4 = r12.mo29678a()
            com.google.common.base.ax r7 = r12.mo29682e()
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.libraries.lens.e.y r7 = (com.google.android.libraries.lens.p2014e.C24233y) r7
            int r8 = r7.mo29769l()
            r9 = 4
            if (r8 != r9) goto L_0x015b
            goto L_0x015c
        L_0x015b:
            r2 = 0
        L_0x015c:
            java.lang.String r3 = "Only REGION_SEARCH interactions have images"
            com.google.common.base.C58838bb.m90869d(r2, r3)
            android.graphics.Bitmap r2 = r4.mo29707c()
            com.google.common.base.ax r3 = r7.mo29762f()
            java.lang.Object r3 = r3.mo56107c()
            android.graphics.RectF r3 = (android.graphics.RectF) r3
            com.google.common.util.concurrent.cx r1 = r1.mo30471a(r2, r3)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x017a
        L_0x0178:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x017a:
            com.google.android.libraries.lens.view.an.b.d r2 = new com.google.android.libraries.lens.view.an.b.d
            r2.<init>(r12, r5, r6, r1)
            r0.f69175b = r2
            com.google.android.libraries.lens.view.an.b.aa r4 = r0.f69175b
            com.google.android.libraries.lens.view.flags.b r0 = r11.f69200v
            com.google.android.libraries.lens.view.flags.a r1 = com.google.android.libraries.lens.view.flags.C26239a.PASS_ZWIEBACK_COOKIE
            boolean r0 = r0.mo31462g(r1)
            if (r0 == 0) goto L_0x01a0
            com.google.common.base.ax r0 = r11.f69202x
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x01a0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.search.a.e.c r0 = (com.google.android.libraries.search.p2476a.p2483e.C32221c) r0
            com.google.common.util.concurrent.cx r0 = r0.mo38005e()
            goto L_0x01a8
        L_0x01a0:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x01a8:
            r5 = r0
            boolean r0 = r11.f69190l
            if (r0 == 0) goto L_0x01c0
            com.google.common.base.ax r0 = r11.f69189k
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x01c0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.lens.view.session.al r0 = (com.google.android.libraries.lens.view.session.C27749al) r0
            com.google.common.util.concurrent.cx r0 = r0.mo33224b()
            goto L_0x01c6
        L_0x01c0:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x01c6:
            r6 = r0
            com.google.apps.tiktok.tracing.contrib.b.e r0 = r11.f69203y
            com.google.android.libraries.lens.view.an.b.r r1 = new com.google.android.libraries.lens.view.an.b.r
            r2 = r1
            r3 = r11
            r7 = r13
            r8 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Executor r12 = r11.f69183e
            r0.mo51512b(r1, r12)
            com.google.common.util.concurrent.cx r12 = r13.f70026b
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2070an.p2072b.C25396af.mo30436d(com.google.android.libraries.lens.e.ad, com.google.android.libraries.lens.e.al):com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final C60870cx mo30437e(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f69199u.mo29164d(C47810es.m84977q(new C25419q(this, runnable)), j, timeUnit);
    }

    /* renamed from: f */
    public final C54002bj mo30438f(C24201ad adVar, C25411i iVar, C25411i iVar2, String str, Location location) {
        C58485gu guVar;
        int i;
        C58485gu guVar2;
        C58801sm smVar;
        Size size;
        C25411i iVar3 = iVar2;
        C58838bb.m90869d(adVar.mo29682e().mo56113h(), "expected an interaction");
        C56244ay g = mo30439g(true);
        C25402al alVar = this.f69186h;
        C25437i iVar4 = this.f69188j;
        C27232l lVar = this.f69185g;
        C24233y yVar = (C24233y) adVar.mo29682e().mo56107c();
        C58838bb.m90869d((yVar.mo29769l() == 4 && iVar3 == null) ? false : true, "Region search requests must have a server image");
        C53984as asVar = (C53984as) C54002bj.f141677q.createBuilder();
        asVar.copyOnWrite();
        g.getClass();
        ((C54002bj) asVar.instance).f141679a = g;
        C63088z b = adVar.mo29681d().mo29692b();
        asVar.copyOnWrite();
        b.getClass();
        ((C54002bj) asVar.instance).f141680b = b;
        C53984as asVar2 = asVar;
        C54064p b2 = alVar.mo30445b((C60214n) yVar.mo29759d().mo56111f(), str, location, (C26733ab) null, adVar.mo29679b().mo29686c(), lVar, adVar.mo29678a().mo29709e(), iVar4, alVar.mo30447f());
        asVar2.copyOnWrite();
        C53984as asVar3 = asVar2;
        b2.getClass();
        ((C54002bj) asVar3.instance).f141682d = b2;
        C53991az azVar = (C53991az) C53999bg.f141668b.createBuilder();
        C53993ba baVar = (C53993ba) C53998bf.f141664c.createBuilder();
        C53995bc bcVar = C53995bc.f141660a;
        baVar.copyOnWrite();
        C53998bf bfVar = (C53998bf) baVar.instance;
        bcVar.getClass();
        bfVar.f141667b = bcVar;
        bfVar.f141666a = 2;
        C53998bf bfVar2 = (C53998bf) baVar.build();
        azVar.copyOnWrite();
        bfVar2.getClass();
        ((C53999bg) azVar.instance).f141670a = bfVar2;
        C53999bg bgVar = (C53999bg) azVar.build();
        asVar3.copyOnWrite();
        bgVar.getClass();
        ((C54002bj) asVar3.instance).f141690l = bgVar;
        C53989ax axVar = (C53989ax) C53990ay.f141649c.createBuilder();
        axVar.copyOnWrite();
        ((C53990ay) axVar.instance).f141651a = true;
        axVar.copyOnWrite();
        ((C53990ay) axVar.instance).f141652b = true;
        C53990ay ayVar = (C53990ay) axVar.build();
        asVar3.copyOnWrite();
        ayVar.getClass();
        ((C54002bj) asVar3.instance).f141691m = ayVar;
        Size g2 = iVar.mo30467g();
        RectF d = adVar.mo29678a().mo29708d();
        int l = yVar.mo29769l();
        int i2 = l - 1;
        if (l != 0) {
            if (i2 == 0) {
                PointF pointF = (PointF) yVar.mo29763g().mo56107c();
                if (!d.equals(C24227s.f66272a)) {
                    PointF pointF2 = new PointF();
                    pointF2.x = (pointF.x - d.left) / d.width();
                    pointF2.y = (pointF.y - d.top) / d.height();
                    pointF = pointF2;
                }
                C9434x xVar = (C9434x) C9330aa.f32370e.createBuilder();
                int i3 = yVar.mo29756a() == C24231w.TEXT ? 6 : 2;
                xVar.copyOnWrite();
                C9330aa aaVar = (C9330aa) xVar.instance;
                aaVar.f32373b = i3 - 1;
                aaVar.f32372a |= 1;
                C9421k kVar = (C9421k) C9422l.f32728g.createBuilder();
                float f = pointF.x;
                int width = g2.getWidth();
                kVar.copyOnWrite();
                C9422l lVar2 = (C9422l) kVar.instance;
                lVar2.f32730a |= 2;
                lVar2.f32732c = (int) (f * ((float) width));
                float f2 = pointF.y;
                int height = g2.getHeight();
                kVar.copyOnWrite();
                C9422l lVar3 = (C9422l) kVar.instance;
                lVar3.f32730a |= 1;
                lVar3.f32731b = (int) (f2 * ((float) height));
                kVar.copyOnWrite();
                C9422l lVar4 = (C9422l) kVar.instance;
                lVar4.f32730a |= 4;
                lVar4.f32733d = 1;
                kVar.copyOnWrite();
                C9422l lVar5 = (C9422l) kVar.instance;
                lVar5.f32730a |= 8;
                lVar5.f32734e = 1;
                xVar.copyOnWrite();
                C9330aa aaVar2 = (C9330aa) xVar.instance;
                C9422l lVar6 = (C9422l) kVar.build();
                lVar6.getClass();
                aaVar2.f32374c = lVar6;
                aaVar2.f32372a |= 2;
                guVar = C58485gu.m89846n((C9330aa) xVar.build());
            } else if (i2 == 1) {
                C58480gp e = C58485gu.m89837e();
                C58485gu guVar3 = (C58485gu) yVar.mo29764h().mo56107c();
                if (!d.equals(C24227s.f66272a)) {
                    C58480gp e2 = C58485gu.m89837e();
                    int size2 = guVar3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        C24197p pVar = (C24197p) guVar3.get(i4);
                        C24195n nVar = pVar.f66137b;
                        if (nVar == null) {
                            nVar = C24195n.f66127f;
                        }
                        C24194m mVar = (C24194m) nVar.toBuilder();
                        float f3 = nVar.f66129a;
                        C58485gu guVar4 = guVar3;
                        float f4 = d.left;
                        float width2 = d.width();
                        mVar.copyOnWrite();
                        int i5 = size2;
                        ((C24195n) mVar.instance).f66129a = (f3 - f4) / width2;
                        float f5 = nVar.f66131c;
                        float f6 = d.left;
                        float width3 = d.width();
                        mVar.copyOnWrite();
                        ((C24195n) mVar.instance).f66131c = (f5 - f6) / width3;
                        float f7 = nVar.f66130b;
                        float f8 = d.top;
                        float height2 = d.height();
                        mVar.copyOnWrite();
                        ((C24195n) mVar.instance).f66130b = (f7 - f8) / height2;
                        float f9 = nVar.f66132d;
                        float f10 = d.top;
                        float height3 = d.height();
                        mVar.copyOnWrite();
                        ((C24195n) mVar.instance).f66132d = (f9 - f10) / height3;
                        C24195n nVar2 = (C24195n) mVar.build();
                        C24196o oVar = (C24196o) pVar.toBuilder();
                        oVar.copyOnWrite();
                        nVar2.getClass();
                        ((C24197p) oVar.instance).f66137b = nVar2;
                        e2.mo55395g((C24197p) oVar.build());
                        i4++;
                        guVar3 = guVar4;
                        size2 = i5;
                    }
                    guVar3 = e2.mo55394f();
                } else {
                    C58485gu guVar5 = guVar3;
                }
                int size3 = guVar3.size();
                int i6 = 0;
                while (i6 < size3) {
                    C24197p pVar2 = (C24197p) guVar3.get(i6);
                    C24195n nVar3 = pVar2.f66137b;
                    if (nVar3 == null) {
                        nVar3 = C24195n.f66127f;
                    }
                    C9434x xVar2 = (C9434x) C9330aa.f32370e.createBuilder();
                    xVar2.copyOnWrite();
                    C9330aa aaVar3 = (C9330aa) xVar2.instance;
                    aaVar3.f32373b = 3;
                    aaVar3.f32372a |= 1;
                    C9421k kVar2 = (C9421k) C9422l.f32728g.createBuilder();
                    float f11 = nVar3.f66133e;
                    kVar2.copyOnWrite();
                    C9422l lVar7 = (C9422l) kVar2.instance;
                    lVar7.f32730a |= 16;
                    lVar7.f32735f = f11;
                    float f12 = nVar3.f66129a;
                    int width4 = g2.getWidth();
                    kVar2.copyOnWrite();
                    C9422l lVar8 = (C9422l) kVar2.instance;
                    int i7 = size3;
                    lVar8.f32730a |= 2;
                    lVar8.f32732c = (int) (f12 * ((float) width4));
                    float f13 = nVar3.f66130b;
                    int height4 = g2.getHeight();
                    kVar2.copyOnWrite();
                    C9422l lVar9 = (C9422l) kVar2.instance;
                    lVar9.f32730a |= 1;
                    lVar9.f32731b = (int) (f13 * ((float) height4));
                    float f14 = nVar3.f66131c;
                    float f15 = nVar3.f66129a;
                    int width5 = g2.getWidth();
                    kVar2.copyOnWrite();
                    C9422l lVar10 = (C9422l) kVar2.instance;
                    C58485gu guVar6 = guVar3;
                    lVar10.f32730a |= 4;
                    lVar10.f32733d = (int) ((f14 - f15) * ((float) width5));
                    float f16 = nVar3.f66132d;
                    float f17 = nVar3.f66130b;
                    int height5 = g2.getHeight();
                    kVar2.copyOnWrite();
                    C9422l lVar11 = (C9422l) kVar2.instance;
                    lVar11.f32730a |= 8;
                    lVar11.f32734e = (int) ((f16 - f17) * ((float) height5));
                    xVar2.copyOnWrite();
                    C9330aa aaVar4 = (C9330aa) xVar2.instance;
                    C9422l lVar12 = (C9422l) kVar2.build();
                    lVar12.getClass();
                    aaVar4.f32374c = lVar12;
                    aaVar4.f32372a |= 2;
                    String str2 = pVar2.f66138c;
                    xVar2.copyOnWrite();
                    C9330aa aaVar5 = (C9330aa) xVar2.instance;
                    str2.getClass();
                    aaVar5.f32372a |= 4;
                    aaVar5.f32375d = str2;
                    e.mo55395g((C9330aa) xVar2.build());
                    i6++;
                    size3 = i7;
                    guVar3 = guVar6;
                }
                guVar = e.mo55394f();
            } else if (i2 == 2) {
                RectF rectF = (RectF) yVar.mo29762f().mo56107c();
                if (!d.equals(C24227s.f66272a)) {
                    rectF = C25402al.m46789a(rectF, d);
                }
                RectF rectF2 = new RectF(rectF.left * ((float) g2.getWidth()), rectF.top * ((float) g2.getHeight()), rectF.right * ((float) g2.getWidth()), rectF.bottom * ((float) g2.getHeight()));
                Rect rect = new Rect();
                rectF2.roundOut(rect);
                C9434x xVar3 = (C9434x) C9330aa.f32370e.createBuilder();
                xVar3.copyOnWrite();
                C9330aa aaVar6 = (C9330aa) xVar3.instance;
                aaVar6.f32373b = 4;
                aaVar6.f32372a |= 1;
                C9421k kVar3 = (C9421k) C9422l.f32728g.createBuilder();
                int i8 = rect.left;
                kVar3.copyOnWrite();
                C9422l lVar13 = (C9422l) kVar3.instance;
                lVar13.f32730a |= 2;
                lVar13.f32732c = i8;
                int i9 = rect.top;
                kVar3.copyOnWrite();
                C9422l lVar14 = (C9422l) kVar3.instance;
                lVar14.f32730a |= 1;
                lVar14.f32731b = i9;
                int width6 = rect.width();
                kVar3.copyOnWrite();
                C9422l lVar15 = (C9422l) kVar3.instance;
                lVar15.f32730a |= 4;
                lVar15.f32733d = width6;
                int height6 = rect.height();
                kVar3.copyOnWrite();
                C9422l lVar16 = (C9422l) kVar3.instance;
                lVar16.f32730a |= 8;
                lVar16.f32734e = height6;
                float floatValue = ((Float) yVar.mo29760e().mo56107c()).floatValue();
                kVar3.copyOnWrite();
                C9422l lVar17 = (C9422l) kVar3.instance;
                lVar17.f32730a |= 16;
                lVar17.f32735f = floatValue;
                xVar3.copyOnWrite();
                C9330aa aaVar7 = (C9330aa) xVar3.instance;
                C9422l lVar18 = (C9422l) kVar3.build();
                lVar18.getClass();
                aaVar7.f32374c = lVar18;
                aaVar7.f32372a |= 2;
                guVar = C58485gu.m89846n((C9330aa) xVar3.build());
            } else if (i2 == 3) {
                RectF rectF3 = (RectF) yVar.mo29762f().mo56107c();
                if (!d.equals(C24227s.f66272a)) {
                    rectF3 = C25402al.m46789a(rectF3, d);
                }
                int width7 = (int) (rectF3.left * ((float) g2.getWidth()));
                int height7 = (int) (rectF3.top * ((float) g2.getHeight()));
                float f18 = rectF3.right;
                int width8 = g2.getWidth();
                float f19 = rectF3.bottom;
                int height8 = g2.getHeight();
                C9434x xVar4 = (C9434x) C9330aa.f32370e.createBuilder();
                xVar4.copyOnWrite();
                C9330aa aaVar8 = (C9330aa) xVar4.instance;
                aaVar8.f32373b = 4;
                aaVar8.f32372a |= 1;
                C9421k kVar4 = (C9421k) C9422l.f32728g.createBuilder();
                kVar4.copyOnWrite();
                C9422l lVar19 = (C9422l) kVar4.instance;
                lVar19.f32730a |= 2;
                lVar19.f32732c = width7;
                kVar4.copyOnWrite();
                C9422l lVar20 = (C9422l) kVar4.instance;
                lVar20.f32730a |= 1;
                lVar20.f32731b = height7;
                kVar4.copyOnWrite();
                C9422l lVar21 = (C9422l) kVar4.instance;
                lVar21.f32730a |= 4;
                lVar21.f32733d = ((int) (f18 * ((float) width8))) - width7;
                kVar4.copyOnWrite();
                C9422l lVar22 = (C9422l) kVar4.instance;
                lVar22.f32730a |= 8;
                lVar22.f32734e = ((int) (f19 * ((float) height8))) - height7;
                xVar4.copyOnWrite();
                C9330aa aaVar9 = (C9330aa) xVar4.instance;
                C9422l lVar23 = (C9422l) kVar4.build();
                lVar23.getClass();
                aaVar9.f32374c = lVar23;
                aaVar9.f32372a |= 2;
                guVar = C58485gu.m89846n((C9330aa) xVar4.build());
            } else {
                throw new IllegalArgumentException("Unhandled selectionType: ".concat(C24232x.m45226a(yVar.mo29769l())));
            }
            C54000bh bhVar = (C54000bh) C54001bi.f141671d.createBuilder();
            C58485gu guVar7 = (C58485gu) Collection.EL.stream(yVar.mo29766i()).filter(C25399ai.f69220a).collect(C58370cn.f155946a);
            bhVar.copyOnWrite();
            C54001bi biVar = (C54001bi) bhVar.instance;
            C62971cq cqVar = biVar.f141675c;
            if (!cqVar.mo58948c()) {
                biVar.f141675c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) guVar7, (List) biVar.f141675c);
            ArrayList arrayList = new ArrayList();
            Size g3 = iVar.mo30467g();
            C58801sm G = guVar.listIterator(0);
            while (true) {
                int i10 = 5;
                if (!G.hasNext()) {
                    break;
                }
                C9330aa aaVar10 = (C9330aa) G.next();
                C54035cp cpVar = (C54035cp) C54036cq.f141772i.createBuilder();
                int a = C9436z.m23952a(aaVar10.f32373b);
                if (a == 0) {
                    a = 1;
                }
                int i11 = a - 1;
                if (i11 == 1) {
                    i10 = 3;
                } else if (i11 != 3) {
                    i10 = i11 != 4 ? i11 != 5 ? 2 : 6 : 4;
                }
                cpVar.copyOnWrite();
                ((C54036cq) cpVar.instance).f141774a = i10 - 2;
                if ((aaVar10.f32372a & 2) != 0) {
                    C9422l lVar24 = aaVar10.f32374c;
                    if (lVar24 == null) {
                        lVar24 = C9422l.f32728g;
                    }
                    int i12 = lVar24.f32731b;
                    cpVar.copyOnWrite();
                    ((C54036cq) cpVar.instance).f141775b = i12;
                    C9422l lVar25 = aaVar10.f32374c;
                    if (lVar25 == null) {
                        lVar25 = C9422l.f32728g;
                    }
                    int i13 = lVar25.f32732c;
                    cpVar.copyOnWrite();
                    ((C54036cq) cpVar.instance).f141776c = i13;
                    C9422l lVar26 = aaVar10.f32374c;
                    if (lVar26 == null) {
                        lVar26 = C9422l.f32728g;
                    }
                    int i14 = lVar26.f32733d;
                    cpVar.copyOnWrite();
                    ((C54036cq) cpVar.instance).f141777d = i14;
                    C9422l lVar27 = aaVar10.f32374c;
                    if (lVar27 == null) {
                        lVar27 = C9422l.f32728g;
                    }
                    int i15 = lVar27.f32734e;
                    cpVar.copyOnWrite();
                    ((C54036cq) cpVar.instance).f141778e = i15;
                    C9422l lVar28 = aaVar10.f32374c;
                    if (((lVar28 == null ? C9422l.f32728g : lVar28).f32730a & 16) != 0) {
                        if (lVar28 == null) {
                            lVar28 = C9422l.f32728g;
                        }
                        float f20 = lVar28.f32735f;
                        cpVar.copyOnWrite();
                        ((C54036cq) cpVar.instance).f141779f = f20;
                    }
                    C9422l lVar29 = aaVar10.f32374c;
                    if (lVar29 == null) {
                        lVar29 = C9422l.f32728g;
                    }
                    float width9 = (float) g3.getWidth();
                    float height9 = (float) g3.getHeight();
                    C62440bq bqVar = (C62440bq) C62441br.f168608h.createBuilder();
                    int i16 = lVar29.f32732c;
                    size = g3;
                    int i17 = lVar29.f32733d;
                    bqVar.copyOnWrite();
                    smVar = G;
                    C62441br brVar = (C62441br) bqVar.instance;
                    guVar2 = guVar;
                    brVar.f168610a |= 1;
                    brVar.f168611b = (((float) i16) + (((float) i17) / 2.0f)) / width9;
                    int i18 = lVar29.f32731b;
                    int i19 = lVar29.f32734e;
                    bqVar.copyOnWrite();
                    C62441br brVar2 = (C62441br) bqVar.instance;
                    brVar2.f168610a |= 2;
                    brVar2.f168612c = (((float) i18) + (((float) i19) / 2.0f)) / height9;
                    int i20 = lVar29.f32733d;
                    bqVar.copyOnWrite();
                    C62441br brVar3 = (C62441br) bqVar.instance;
                    brVar3.f168610a |= 4;
                    brVar3.f168613d = ((float) i20) / width9;
                    int i21 = lVar29.f32734e;
                    bqVar.copyOnWrite();
                    C62441br brVar4 = (C62441br) bqVar.instance;
                    brVar4.f168610a |= 8;
                    brVar4.f168614e = ((float) i21) / height9;
                    double radians = Math.toRadians((double) lVar29.f32735f);
                    bqVar.copyOnWrite();
                    C62441br brVar5 = (C62441br) bqVar.instance;
                    brVar5.f168610a |= 16;
                    brVar5.f168615f = (float) radians;
                    bqVar.copyOnWrite();
                    C62441br brVar6 = (C62441br) bqVar.instance;
                    brVar6.f168616g = 1;
                    brVar6.f168610a |= 32;
                    C62441br brVar7 = (C62441br) bqVar.build();
                    cpVar.copyOnWrite();
                    brVar7.getClass();
                    ((C54036cq) cpVar.instance).f141781h = brVar7;
                } else {
                    guVar2 = guVar;
                    size = g3;
                    smVar = G;
                }
                if ((aaVar10.f32372a & 4) != 0) {
                    String str3 = aaVar10.f32375d;
                    cpVar.copyOnWrite();
                    str3.getClass();
                    ((C54036cq) cpVar.instance).f141780g = str3;
                }
                arrayList.add((C54036cq) cpVar.build());
                g3 = size;
                G = smVar;
                guVar = guVar2;
            }
            C58485gu guVar8 = guVar;
            bhVar.copyOnWrite();
            C54001bi biVar2 = (C54001bi) bhVar.instance;
            C62971cq cqVar2 = biVar2.f141674b;
            if (!cqVar2.mo58948c()) {
                biVar2.f141674b = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) arrayList, (List) biVar2.f141674b);
            C54001bi biVar3 = (C54001bi) bhVar.build();
            asVar3.copyOnWrite();
            biVar3.getClass();
            ((C54002bj) asVar3.instance).f141683e = biVar3;
            C24227s a2 = adVar.mo29678a();
            if (yVar.mo29769l() == 4) {
                iVar2.getClass();
                C62454cd d2 = C25402al.m46790d(C25402al.m46789a((RectF) yVar.mo29762f().mo56107c(), a2.mo29708d()), iVar3, iVar);
                C62441br brVar8 = d2.f168647b;
                if (brVar8 == null) {
                    brVar8 = C62441br.f168608h;
                }
                int i22 = (int) brVar8.f168613d;
                C62441br brVar9 = d2.f168647b;
                if (brVar9 == null) {
                    brVar9 = C62441br.f168608h;
                }
                int i23 = (int) brVar9.f168614e;
                if (alVar.f69225a.mo31462g(C26239a.ENABLE_MOBILE_STARBURST_V5_WITHOUT_BYTES_IN_LENS_REQUEST)) {
                    i22 = iVar2.mo30449b().getWidth();
                    i23 = iVar2.mo30449b().getHeight();
                }
                C54022cc c = alVar.mo30446c(a2, iVar, i22, i23, lVar, location);
                asVar3.copyOnWrite();
                c.getClass();
                ((C54002bj) asVar3.instance).f141681c = c;
                C53987av avVar = (C53987av) C53988aw.f141646b.createBuilder();
                avVar.copyOnWrite();
                d2.getClass();
                ((C53988aw) avVar.instance).f141648a = d2;
                asVar3.copyOnWrite();
                C53988aw awVar = (C53988aw) avVar.build();
                awVar.getClass();
                ((C54002bj) asVar3.instance).f141685g = awVar;
                asVar3.copyOnWrite();
                ((C54002bj) asVar3.instance).f141686h = 5;
            } else {
                if (!guVar8.isEmpty()) {
                    int a3 = C9436z.m23952a(((C9330aa) guVar8.get(0)).f32373b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i24 = a3 - 1;
                    if (i24 == 1) {
                        i = 3;
                    } else if (i24 != 3) {
                        i = 4;
                        if (i24 != 4) {
                            if (i24 == 5) {
                                i = 6;
                            }
                        }
                    } else {
                        i = 5;
                    }
                    asVar3.copyOnWrite();
                    ((C54002bj) asVar3.instance).f141686h = i - 2;
                }
                i = 2;
                asVar3.copyOnWrite();
                ((C54002bj) asVar3.instance).f141686h = i - 2;
            }
            if (yVar.mo29772o() != 1) {
                C62396a aVar = (C62396a) C62450c.f168634c.createBuilder();
                int o = yVar.mo29772o();
                aVar.copyOnWrite();
                C62450c cVar = (C62450c) aVar.instance;
                int i25 = o - 1;
                if (o != 0) {
                    cVar.f168637b = i25;
                    cVar.f168636a |= 1;
                    asVar3.copyOnWrite();
                    C62450c cVar2 = (C62450c) aVar.build();
                    cVar2.getClass();
                    ((C54002bj) asVar3.instance).f141692n = cVar2;
                } else {
                    throw null;
                }
            }
            if (yVar.mo29758c().mo56113h()) {
                C56251be beVar = (C56251be) yVar.mo29758c().mo56107c();
                asVar3.copyOnWrite();
                beVar.getClass();
                ((C54002bj) asVar3.instance).f141684f = beVar;
            }
            if (iVar3 != null) {
                if (alVar.f69225a.mo31462g(C26239a.ENABLE_MOBILE_STARBURST_V5_WITHOUT_BYTES_IN_LENS_REQUEST) && iVar2.mo30452e().mo56113h()) {
                    C64591bm e3 = C25402al.m46791e(iVar2);
                    asVar3.copyOnWrite();
                    e3.getClass();
                    ((C54002bj) asVar3.instance).f141694p = e3;
                } else if (!iVar2.mo30454f().mo56113h()) {
                    C25402al.m46792g(asVar3, iVar3, false);
                }
            }
            C54002bj bjVar = (C54002bj) asVar3.build();
            this.f69184f.mo30212d(bjVar);
            if (this.f69181c.mo56113h()) {
                this.f69182d.execute(C47810es.m84977q(new C25418p(this)));
            }
            return bjVar;
        }
        throw null;
    }

    /* renamed from: g */
    public final C56244ay mo30439g(boolean z) {
        long j = this.f69204z;
        this.f69204z = j + 1;
        long j2 = this.f69178A;
        if (z) {
            this.f69178A = 1 + j2;
        }
        C56243ax axVar = (C56243ax) C56244ay.f149802e.createBuilder();
        long j3 = this.f69191m;
        axVar.copyOnWrite();
        C56244ay ayVar = (C56244ay) axVar.instance;
        ayVar.f149804a |= 1;
        ayVar.f149805b = j3;
        axVar.copyOnWrite();
        C56244ay ayVar2 = (C56244ay) axVar.instance;
        ayVar2.f149804a |= 2;
        ayVar2.f149806c = j2;
        axVar.copyOnWrite();
        C56244ay ayVar3 = (C56244ay) axVar.instance;
        ayVar3.f149804a |= 4;
        ayVar3.f149807d = j;
        return (C56244ay) axVar.build();
    }

    /* renamed from: h */
    public final void mo30440h(C37254c cVar) {
        C58833ax axVar = this.f69201w;
        if (axVar.mo56113h()) {
            ((C37215b) axVar.mo56107c()).mo19974a(cVar);
        }
    }

    /* renamed from: i */
    public final void mo30441i() {
        C58838bb.m90884s(this.f69193o, "startStreaming called while not started");
        if (!this.f69194p) {
            this.f69197s = new C25395ae(this);
            C25395ae aeVar = this.f69197s;
            aeVar.getClass();
            this.f69184f.mo30213e((String) this.f69198t.mo56111f(), aeVar, this.f69183e);
            this.f69194p = true;
            mo30442j();
        }
    }

    /* renamed from: j */
    public final void mo30442j() {
        this.f69179B = mo30437e(new C25425w(this), 30, TimeUnit.SECONDS);
    }

    /* renamed from: k */
    public final void mo30443k(Throwable th) {
        if (th != null) {
            for (C25428z zVar : ((C58584kl) this.f69192n).mo55586e()) {
                zVar.f69298d.mo30914d(th);
            }
            this.f69192n.mo54917u();
        } else {
            for (C25428z zVar2 : ((C58584kl) this.f69192n).mo55586e()) {
                zVar2.f69298d.f70026b.cancel(false);
            }
            this.f69192n.mo54917u();
        }
        if (this.f69194p) {
            this.f69184f.mo30211c();
            this.f69197s = null;
            this.f69196r = null;
            this.f69194p = false;
        }
        C60870cx cxVar = this.f69179B;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f69179B = null;
        }
    }
}
