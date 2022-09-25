package com.google.android.libraries.lens.view.p2054ae;

import com.google.android.libraries.lens.view.p2070an.p2072b.C25395ae;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.client.data.android.p4641h.C61488i;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4017at.p4056g.p4057a.p4058a.C54002bj;
import com.google.p4017at.p4056g.p4057a.p4058a.C54008bp;
import com.google.p4017at.p4056g.p4057a.p4058a.C54010br;
import com.google.p4017at.p4056g.p4057a.p4058a.C54011bs;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70899n;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.libraries.lens.view.ae.ae */
/* compiled from: PG */
public final class C24992ae implements C25024w {

    /* renamed from: a */
    public static final C58974d f68156a = C58974d.m91135i("LensFeStream");

    /* renamed from: b */
    public final C58833ax f68157b;

    /* renamed from: c */
    final Map f68158c = new ConcurrentHashMap();

    /* renamed from: d */
    public C56244ay f68159d;

    /* renamed from: e */
    public boolean f68160e;

    /* renamed from: f */
    public C70868g f68161f;

    /* renamed from: g */
    public C24991ad f68162g;

    /* renamed from: h */
    private final C24994ag f68163h;

    /* renamed from: i */
    private final C58833ax f68164i;

    /* renamed from: j */
    private final Queue f68165j = new ArrayDeque();

    /* renamed from: k */
    private boolean f68166k;

    /* renamed from: l */
    private C54010br f68167l;

    /* renamed from: m */
    private volatile Executor f68168m;

    /* renamed from: n */
    private volatile C25395ae f68169n;

    public C24992ae(C58833ax axVar, C24994ag agVar, C58833ax axVar2) {
        this.f68157b = axVar;
        this.f68163h = agVar;
        this.f68164i = axVar2;
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m46261i(com.google.p4017at.p4056g.p4057a.p4058a.C54002bj r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r0.f68166k
            java.lang.String r3 = "attempting to send request to closed stream"
            com.google.common.base.C58838bb.m90884s(r2, r3)
            boolean r2 = r16.m46262j()
            if (r2 == 0) goto L_0x01bd
            boolean r2 = com.google.android.libraries.lens.view.p2054ae.C25023v.m46306d(r17)
            if (r2 == 0) goto L_0x001f
            com.google.bp.f.b.a.ay r2 = r1.f141679a
            if (r2 != 0) goto L_0x001d
            com.google.bp.f.b.a.ay r2 = com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay.f149802e
        L_0x001d:
            r0.f68159d = r2
        L_0x001f:
            java.util.Map r2 = r0.f68158c
            com.google.bp.f.b.a.ay r3 = r1.f141679a
            if (r3 != 0) goto L_0x0027
            com.google.bp.f.b.a.ay r3 = com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay.f149802e
        L_0x0027:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r18)
            r2.put(r3, r4)
            com.google.bp.f.b.a.ay r2 = r1.f141679a
            if (r2 != 0) goto L_0x0034
            com.google.bp.f.b.a.ay r2 = com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay.f149802e
        L_0x0034:
            long r2 = r2.f149807d
            io.grpc.i.g r2 = r0.f68161f
            r2.getClass()
            r2.mo20123c(r1)
            com.google.common.base.ax r2 = r0.f68157b
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x01b9
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.lens.view.ae.i r2 = (com.google.android.libraries.lens.view.p2054ae.C25010i) r2
            int r3 = r1.f141686h
            int r3 = com.google.p4017at.p4056g.p4057a.p4058a.C54043cx.m87139a(r3)
            r4 = 1
            if (r3 != 0) goto L_0x0056
            r3 = 1
        L_0x0056:
            boolean r5 = com.google.android.libraries.lens.view.p2054ae.C25023v.m46306d(r17)
            r6 = 0
            if (r5 == 0) goto L_0x0063
            com.google.at.g.a.a.cc r5 = r1.f141681c
            if (r5 == 0) goto L_0x0063
            r5 = 1
            goto L_0x0064
        L_0x0063:
            r5 = 0
        L_0x0064:
            if (r5 == 0) goto L_0x0195
            com.google.android.libraries.lens.view.ae.e r8 = r2.f68200a
            com.google.android.libraries.search.b.i.g r9 = com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a.f98634m
            com.google.android.libraries.f.a r10 = r2.f68202c
            long r10 = r10.mo26872d()
            com.google.android.libraries.search.b.i.a r9 = r9.mo40811d(r10)
            com.google.bp.f.b.a.ay r10 = r1.f141679a
            if (r10 != 0) goto L_0x007a
            com.google.bp.f.b.a.ay r10 = com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay.f149802e
        L_0x007a:
            long r10 = r10.f149807d
            r12 = r9
            com.google.android.libraries.search.b.i.b r12 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r12
            r12.mo40793q(r10)
            com.google.protobuf.bt r10 = com.google.common.p4552o.p4563i.C59898bg.f161867w
            com.google.common.o.i.bg r11 = com.google.common.p4552o.p4563i.C59898bg.f161866v
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.common.o.i.af r11 = (com.google.common.p4552o.p4563i.C59870af) r11
            android.content.Context r13 = r2.f68203d
            com.google.common.o.aac r13 = com.google.android.libraries.lens.view.utils.C28137z.m52436b(r13, r6)
            com.google.at.g.a.a.cc r14 = r1.f141681c
            if (r14 != 0) goto L_0x0098
            com.google.at.g.a.a.cc r14 = com.google.p4017at.p4056g.p4057a.p4058a.C54022cc.f141741c
        L_0x0098:
            int r14 = r14.f141743a
            r15 = 5
            if (r14 != r15) goto L_0x00de
            com.google.common.o.i.cd r14 = com.google.common.p4552o.p4563i.C59922cd.f161955h
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.common.o.i.cc r14 = (com.google.common.p4552o.p4563i.C59921cc) r14
            r14.copyOnWrite()
            com.google.protobuf.bv r15 = r14.instance
            com.google.common.o.i.cd r15 = (com.google.common.p4552o.p4563i.C59922cd) r15
            int r7 = r15.f161957a
            r4 = r4 | r7
            r15.f161957a = r4
            r15.f161958b = r6
            r14.copyOnWrite()
            com.google.protobuf.bv r4 = r14.instance
            com.google.common.o.i.cd r4 = (com.google.common.p4552o.p4563i.C59922cd) r4
            r13.getClass()
            r4.f161963g = r13
            int r6 = r4.f161957a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r4.f161957a = r6
            int r4 = r13.f158082b
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            com.google.common.o.i.cd r6 = (com.google.common.p4552o.p4563i.C59922cd) r6
            int r7 = r6.f161957a
            r7 = r7 | 8
            r6.f161957a = r7
            r6.f161961e = r4
            com.google.protobuf.bv r4 = r14.build()
            com.google.common.o.i.cd r4 = (com.google.common.p4552o.p4563i.C59922cd) r4
            goto L_0x0176
        L_0x00de:
            com.google.at.g.a.a.cc r6 = r1.f141681c
            if (r6 != 0) goto L_0x00e4
            com.google.at.g.a.a.cc r6 = com.google.p4017at.p4056g.p4057a.p4058a.C54022cc.f141741c
        L_0x00e4:
            int r7 = r6.f141743a
            if (r7 != r4) goto L_0x00ed
            java.lang.Object r6 = r6.f141744b
            com.google.at.g.a.a.r r6 = (com.google.p4017at.p4056g.p4057a.p4058a.C54066r) r6
            goto L_0x00ef
        L_0x00ed:
            com.google.at.g.a.a.r r6 = com.google.p4017at.p4056g.p4057a.p4058a.C54066r.f141866d
        L_0x00ef:
            com.google.common.o.i.cd r7 = com.google.common.p4552o.p4563i.C59922cd.f161955h
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.common.o.i.cc r7 = (com.google.common.p4552o.p4563i.C59921cc) r7
            com.google.protobuf.z r14 = r6.f141868a
            int r14 = r14.mo59031d()
            r7.copyOnWrite()
            com.google.protobuf.bv r15 = r7.instance
            com.google.common.o.i.cd r15 = (com.google.common.p4552o.p4563i.C59922cd) r15
            int r0 = r15.f161957a
            r0 = r0 | r4
            r15.f161957a = r0
            r15.f161958b = r14
            com.google.at.g.a.a.ak r0 = r6.f141869b
            if (r0 != 0) goto L_0x0111
            com.google.at.g.a.a.ak r0 = com.google.p4017at.p4056g.p4057a.p4058a.C53976ak.f141619m
        L_0x0111:
            int r0 = r0.f141624d
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.common.o.i.cd r4 = (com.google.common.p4552o.p4563i.C59922cd) r4
            int r14 = r4.f161957a
            r14 = r14 | 2
            r4.f161957a = r14
            r4.f161959c = r0
            com.google.at.g.a.a.ak r0 = r6.f141869b
            if (r0 != 0) goto L_0x0128
            com.google.at.g.a.a.ak r0 = com.google.p4017at.p4056g.p4057a.p4058a.C53976ak.f141619m
        L_0x0128:
            int r0 = r0.f141623c
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.common.o.i.cd r4 = (com.google.common.p4552o.p4563i.C59922cd) r4
            int r6 = r4.f161957a
            r14 = 4
            r6 = r6 | r14
            r4.f161957a = r6
            r4.f161960d = r0
            int r0 = r17.getSerializedSize()
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.common.o.i.cd r4 = (com.google.common.p4552o.p4563i.C59922cd) r4
            int r6 = r4.f161957a
            r6 = r6 | 128(0x80, float:1.794E-43)
            r4.f161957a = r6
            r4.f161962f = r0
            r7.copyOnWrite()
            com.google.protobuf.bv r0 = r7.instance
            com.google.common.o.i.cd r0 = (com.google.common.p4552o.p4563i.C59922cd) r0
            r13.getClass()
            r0.f161963g = r13
            int r4 = r0.f161957a
            r4 = r4 | 256(0x100, float:3.59E-43)
            r0.f161957a = r4
            int r0 = r13.f158082b
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.common.o.i.cd r4 = (com.google.common.p4552o.p4563i.C59922cd) r4
            int r6 = r4.f161957a
            r6 = r6 | 8
            r4.f161957a = r6
            r4.f161961e = r0
            com.google.protobuf.bv r0 = r7.build()
            r4 = r0
            com.google.common.o.i.cd r4 = (com.google.common.p4552o.p4563i.C59922cd) r4
        L_0x0176:
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.common.o.i.bg r0 = (com.google.common.p4552o.p4563i.C59898bg) r0
            r4.getClass()
            r0.f161872d = r4
            int r4 = r0.f161869a
            r6 = 4
            r4 = r4 | r6
            r0.f161869a = r4
            com.google.protobuf.bv r0 = r11.build()
            com.google.common.o.i.bg r0 = (com.google.common.p4552o.p4563i.C59898bg) r0
            r12.mo40792p(r10, r0)
            r8.mo30222a(r9)
            goto L_0x0196
        L_0x0195:
            r6 = 4
        L_0x0196:
            if (r3 == r6) goto L_0x019a
            if (r5 != 0) goto L_0x01b9
        L_0x019a:
            com.google.android.libraries.lens.view.ae.e r0 = r2.f68200a
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a.f98637p
            com.google.android.libraries.f.a r2 = r2.f68202c
            long r4 = r2.mo26872d()
            com.google.android.libraries.search.b.i.a r2 = r3.mo40811d(r4)
            com.google.bp.f.b.a.ay r1 = r1.f141679a
            if (r1 != 0) goto L_0x01ae
            com.google.bp.f.b.a.ay r1 = com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay.f149802e
        L_0x01ae:
            long r3 = r1.f149806c
            r1 = r2
            com.google.android.libraries.search.b.i.b r1 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r1
            r1.mo40793q(r3)
            r0.mo30222a(r2)
        L_0x01b9:
            r16.mo30214f()
            return
        L_0x01bd:
            java.util.Queue r2 = r0.f68165j
            com.google.android.libraries.lens.view.ae.a r3 = new com.google.android.libraries.lens.view.ae.a
            r4 = r18
            r3.<init>(r1, r4)
            r2.add(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2054ae.C24992ae.m46261i(com.google.at.g.a.a.bj, boolean):void");
    }

    /* renamed from: j */
    private final boolean m46262j() {
        return this.f68161f != null && !this.f68160e;
    }

    /* renamed from: a */
    public final void mo30209a(C54002bj bjVar) {
        if (!this.f68166k) {
            ((C58970a) ((C58970a) f68156a.mo56226d()).mo56372aa(49637)).mo56386p("Attempting to send heartbeat on stopped stream");
            return;
        }
        C70868g gVar = this.f68161f;
        if (gVar != null) {
            gVar.mo20123c(bjVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        if (r0 != r1) goto L_0x0044;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30210b(com.google.p4017at.p4056g.p4057a.p4058a.C54002bj r8) {
        /*
            r7 = this;
            com.google.at.g.a.a.cc r0 = r8.f141681c
            if (r0 != 0) goto L_0x0006
            com.google.at.g.a.a.cc r0 = com.google.p4017at.p4056g.p4057a.p4058a.C54022cc.f141741c
        L_0x0006:
            int r1 = r0.f141743a
            r2 = 1
            if (r1 != r2) goto L_0x0010
            java.lang.Object r0 = r0.f141744b
            com.google.at.g.a.a.r r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54066r) r0
            goto L_0x0012
        L_0x0010:
            com.google.at.g.a.a.r r0 = com.google.p4017at.p4056g.p4057a.p4058a.C54066r.f141866d
        L_0x0012:
            com.google.protobuf.z r0 = r0.f141868a
            boolean r0 = r0.mo59173M()
            r0 = r0 ^ r2
            com.google.protos.bf.a.a.bm r1 = r8.f141694p
            r3 = 0
            if (r1 == 0) goto L_0x0020
            r1 = 1
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            com.google.at.g.a.a.cc r4 = r8.f141681c
            if (r4 != 0) goto L_0x0028
            com.google.at.g.a.a.cc r5 = com.google.p4017at.p4056g.p4057a.p4058a.C54022cc.f141741c
            goto L_0x0029
        L_0x0028:
            r5 = r4
        L_0x0029:
            int r5 = r5.f141743a
            r6 = 5
            if (r5 != r6) goto L_0x0030
            r5 = 1
            goto L_0x0031
        L_0x0030:
            r5 = 0
        L_0x0031:
            if (r5 == 0) goto L_0x0036
            if (r1 == 0) goto L_0x0044
            r1 = 1
        L_0x0036:
            if (r5 != 0) goto L_0x0043
            if (r4 != 0) goto L_0x003c
            com.google.at.g.a.a.cc r4 = com.google.p4017at.p4056g.p4057a.p4058a.C54022cc.f141741c
        L_0x003c:
            int r4 = r4.f141743a
            if (r4 != r2) goto L_0x0043
            if (r0 == r1) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            com.google.common.base.C58838bb.m90868c(r2)
            r7.m46261i(r8, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2054ae.C24992ae.mo30210b(com.google.at.g.a.a.bj):void");
    }

    /* renamed from: c */
    public final void mo30211c() {
        if (this.f68166k) {
            this.f68166k = false;
            this.f68165j.clear();
            this.f68159d = null;
            this.f68160e = false;
            this.f68167l = null;
            C70868g gVar = this.f68161f;
            if (gVar != null) {
                gVar.mo20121a();
                this.f68161f = null;
            }
            this.f68162g = null;
            this.f68169n = null;
            this.f68168m = null;
            this.f68158c.clear();
            mo30214f();
            C58833ax axVar = this.f68164i;
            if (axVar.mo56113h()) {
                ((C24996ai) axVar.mo56107c()).mo30220c();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        if (r0 != r2) goto L_0x003d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30212d(com.google.p4017at.p4056g.p4057a.p4058a.C54002bj r8) {
        /*
            r7 = this;
            boolean r0 = com.google.android.libraries.lens.view.p2054ae.C25023v.m46307e(r8)
            r1 = 1
            if (r0 == 0) goto L_0x004f
            com.google.at.g.a.a.cc r0 = r8.f141681c
            if (r0 != 0) goto L_0x000d
            com.google.at.g.a.a.cc r0 = com.google.p4017at.p4056g.p4057a.p4058a.C54022cc.f141741c
        L_0x000d:
            int r2 = r0.f141743a
            if (r2 != r1) goto L_0x0016
            java.lang.Object r0 = r0.f141744b
            com.google.at.g.a.a.r r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54066r) r0
            goto L_0x0018
        L_0x0016:
            com.google.at.g.a.a.r r0 = com.google.p4017at.p4056g.p4057a.p4058a.C54066r.f141866d
        L_0x0018:
            com.google.protobuf.z r0 = r0.f141868a
            boolean r0 = r0.mo59173M()
            r0 = r0 ^ r1
            com.google.protos.bf.a.a.bm r2 = r8.f141694p
            r3 = 0
            if (r2 == 0) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            com.google.at.g.a.a.cc r4 = r8.f141681c
            if (r4 != 0) goto L_0x002e
            com.google.at.g.a.a.cc r5 = com.google.p4017at.p4056g.p4057a.p4058a.C54022cc.f141741c
            goto L_0x002f
        L_0x002e:
            r5 = r4
        L_0x002f:
            int r5 = r5.f141743a
            r6 = 5
            if (r5 != r6) goto L_0x0036
            r5 = 1
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            if (r5 == 0) goto L_0x003f
            if (r2 == 0) goto L_0x003d
            r2 = 1
            goto L_0x003f
        L_0x003d:
            r3 = 1
            goto L_0x004c
        L_0x003f:
            if (r5 != 0) goto L_0x004c
            if (r4 != 0) goto L_0x0045
            com.google.at.g.a.a.cc r4 = com.google.p4017at.p4056g.p4057a.p4058a.C54022cc.f141741c
        L_0x0045:
            int r4 = r4.f141743a
            if (r4 != r1) goto L_0x004c
            if (r0 == r2) goto L_0x004c
            goto L_0x003d
        L_0x004c:
            com.google.common.base.C58838bb.m90868c(r3)
        L_0x004f:
            com.google.bp.f.b.a.ay r0 = r7.f68159d
            if (r0 == 0) goto L_0x005b
            boolean r0 = com.google.android.libraries.lens.view.p2054ae.C25023v.m46307e(r8)
            if (r0 == 0) goto L_0x005b
            r7.f68160e = r1
        L_0x005b:
            r7.m46261i(r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2054ae.C24992ae.mo30212d(com.google.at.g.a.a.bj):void");
    }

    /* renamed from: e */
    public final void mo30213e(String str, C25395ae aeVar, Executor executor) {
        C60870cx cxVar;
        C58838bb.m90884s(!this.f68166k, "stream already started");
        this.f68166k = true;
        this.f68169n = aeVar;
        this.f68168m = executor;
        this.f68162g = new C24991ad(this);
        C58833ax axVar = this.f68157b;
        if (axVar.mo56113h()) {
            C25005e eVar = ((C25010i) axVar.mo56107c()).f68200a;
            if (str == null) {
                cxVar = eVar.f68192b.mo50254a();
            } else {
                cxVar = eVar.f68193c.mo50216c(str);
            }
            eVar.f68195e = C60922j.m93044g(cxVar, C47810es.m84963c(new C25004d(eVar)), C60826bg.f164896a);
            ((C25010i) this.f68157b.mo56107c()).f68200a.mo30222a(C37194a.f98632k);
        }
        C24994ag agVar = this.f68163h;
        C70334de deVar = new C70334de();
        C25000am amVar = (C25000am) agVar;
        String str2 = amVar.f68185g;
        if (str2 != null) {
            deVar.mo62033h(C25000am.f68179a, str2);
        }
        C54010br brVar = (C54010br) ((C54010br) ((C54010br) amVar.f68180b.mo17428b()).mo62576o(amVar.f68182d ? new C70899n[]{new C70879r(deVar), C61488i.m94204b(new C24999al(amVar))} : new C70899n[]{new C70879r(deVar)})).mo62577p(C61409d.f166071a, amVar.f68184f);
        this.f68167l = brVar;
        C24991ad adVar = this.f68162g;
        adVar.getClass();
        C70888j jVar = brVar.f189039a;
        C70338di diVar = C54011bs.f141723a;
        if (diVar == null) {
            synchronized (C54011bs.class) {
                diVar = C54011bs.f141723a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("google.internal.lens.api.v1.LensStreamService", "StreamLensResults");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54002bj.f141677q);
                    d.f187486b = C70850d.m103697c(C54008bp.f141704q);
                    diVar = d.mo62040a();
                    C54011bs.f141723a = diVar;
                }
            }
        }
        this.f68161f = (C70868g) C70876o.m103761b(jVar.mo39510a(diVar, brVar.f189040b), adVar, true);
        C58833ax axVar2 = this.f68157b;
        if (axVar2.mo56113h()) {
            ((C25010i) axVar2.mo56107c()).f68200a.mo30222a(C37194a.f98633l.mo40815i(C62722b.OK));
        }
        mo30216h();
        if (this.f68164i.mo56113h()) {
            ((C58970a) ((C58970a) f68156a.mo56224b()).mo56372aa(49639)).mo56386p("StreamStateListener is installed.");
            ((C24996ai) this.f68164i.mo56107c()).mo30219b();
        }
    }

    /* renamed from: f */
    public final void mo30214f() {
        C58833ax axVar = this.f68164i;
        if (axVar.mo56113h()) {
            ((C24996ai) axVar.mo56107c()).mo30218a();
        }
    }

    /* renamed from: g */
    public final void mo30215g(C25026y yVar) {
        Executor executor = this.f68168m;
        C25395ae aeVar = this.f68169n;
        if (executor != null && aeVar != null) {
            executor.execute(C47810es.m84977q(new C25025x(yVar, aeVar)));
        }
    }

    /* renamed from: h */
    public final void mo30216h() {
        if (m46262j()) {
            while (!this.f68165j.isEmpty()) {
                C25027z zVar = (C25027z) this.f68165j.poll();
                if (zVar != null) {
                    m46261i(zVar.mo30203a(), zVar.mo30204b());
                }
            }
        }
    }
}
