package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.google.android.libraries.assistant.pcp.p1573k.C18927g;
import com.google.android.libraries.assistant.pcp.p1573k.C18932l;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.bq */
/* compiled from: PG */
public final class C18844bq implements C18932l {

    /* renamed from: d */
    private static final C59071e f53066d = C59071e.m91332i("com.google.android.libraries.assistant.pcp.k.a.bq");

    /* renamed from: b */
    public final C68214a f53067b;

    /* renamed from: c */
    public final C69464a f53068c;

    /* renamed from: e */
    private final PackageManager f53069e;

    /* renamed from: f */
    private final C18927g f53070f;

    /* renamed from: g */
    private final C69464a f53071g;

    /* renamed from: h */
    private final C69464a f53072h;

    /* renamed from: i */
    private final C69464a f53073i;

    /* renamed from: j */
    private final C69464a f53074j;

    /* renamed from: k */
    private final C69464a f53075k;

    /* renamed from: l */
    private final C69464a f53076l;

    /* renamed from: m */
    private final C69464a f53077m;

    /* renamed from: n */
    private final C69464a f53078n;

    /* renamed from: o */
    private final C69464a f53079o;

    /* renamed from: p */
    private final C69464a f53080p;

    /* renamed from: q */
    private final C69464a f53081q;

    public C18844bq(PackageManager packageManager, C68214a aVar, C18927g gVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8, C69464a aVar9, C69464a aVar10, C69464a aVar11, C69464a aVar12, C69464a aVar13) {
        this.f53069e = packageManager;
        this.f53067b = aVar;
        this.f53070f = gVar;
        this.f53071g = aVar2;
        this.f53072h = aVar3;
        this.f53073i = aVar4;
        this.f53074j = aVar5;
        this.f53068c = aVar6;
        this.f53075k = aVar7;
        this.f53076l = aVar8;
        this.f53077m = aVar9;
        this.f53078n = aVar10;
        this.f53079o = aVar11;
        this.f53080p = aVar12;
        this.f53081q = aVar13;
    }

    /* renamed from: a */
    public final Optional mo24190a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        for (ResolveInfo resolveInfo : this.f53069e.queryIntentServices(new Intent("android.media.browse.MediaBrowserService"), 64)) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo.packageName != null && serviceInfo.packageName.equals(str)) {
                return Optional.m71637of(new ComponentName(serviceInfo.packageName, serviceInfo.name));
            }
        }
        return Optional.empty();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: com.google.common.b.gu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0338  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo24191b(java.util.List r19, java.util.LinkedHashSet r20, com.google.assistant.p3994s.p3995a.C53306j r21, com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f r22, boolean r23, java.lang.String r24, boolean r25) {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            r3 = r21
            r4 = r22
            com.google.common.f.e r1 = f53066d
            com.google.common.f.x r2 = r1.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "TNG.MediaMngrHlpr"
            r2.mo56378ag(r5, r6)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r5 = 47452(0xb95c, float:6.6494E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r5)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r5 = "#filterComponentName() all component names %s for requested components %s"
            r7 = r20
            r2.mo56354G(r5, r0, r7)
            com.google.protobuf.bt r2 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at.f341744i
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r4.mo58887l(r2)
            com.google.protobuf.bf r5 = r4.f169962ag
            com.google.protobuf.bs r9 = r2.f169971d
            java.lang.Object r5 = r5.mo58854l(r9)
            if (r5 != 0) goto L_0x003d
            java.lang.Object r2 = r2.f169969b
            goto L_0x0041
        L_0x003d:
            java.lang.Object r2 = r2.mo58889c(r5)
        L_0x0041:
            com.google.android.apps.search.assistant.platform.pcp.f.at r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at) r2
            int r5 = r2.f341751f
            int r5 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123721ao.m203078a(r5)
            r9 = 2
            if (r5 != 0) goto L_0x004d
            goto L_0x006b
        L_0x004d:
            if (r5 != r9) goto L_0x006b
            boolean r5 = r20.isEmpty()
            if (r5 == 0) goto L_0x006b
            com.google.common.f.x r0 = r1.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r6)
            java.lang.String r1 = "#filterComponentName() no habits and no fallback."
            r2 = 47462(0xb966, float:6.6508E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            return r0
        L_0x006b:
            boolean r5 = r20.isEmpty()
            if (r5 != 0) goto L_0x008a
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r20)
            p3186j$.util.Objects.requireNonNull(r19)
            com.google.android.libraries.assistant.pcp.k.a.bh r10 = new com.google.android.libraries.assistant.pcp.k.a.bh
            r10.<init>(r0)
            j$.util.stream.Stream r5 = r5.filter(r10)
            j$.util.stream.Collector r10 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r5 = r5.collect(r10)
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
            goto L_0x008e
        L_0x008a:
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89842j(r19)
        L_0x008e:
            boolean r10 = r20.isEmpty()
            if (r10 == 0) goto L_0x00a9
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
            com.google.android.libraries.assistant.pcp.k.a.bl r10 = new com.google.android.libraries.assistant.pcp.k.a.bl
            r10.<init>(r8)
            j$.util.stream.Stream r5 = r5.filter(r10)
            j$.util.stream.Collector r10 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r5 = r5.collect(r10)
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
        L_0x00a9:
            g.a.a r10 = r8.f53078n
            java.lang.Object r10 = r10.mo17428b()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x00da
            com.google.common.f.x r10 = r1.mo56224b()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r11, r6)
            java.lang.String r11 = "filtering out YouTube Music."
            r12 = 47461(0xb965, float:6.6507E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56386p(r11)
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
            com.google.android.libraries.assistant.pcp.k.a.bn r10 = com.google.android.libraries.assistant.pcp.p1573k.p1574a.C18841bn.f53063a
            j$.util.stream.Stream r5 = r5.filter(r10)
            j$.util.stream.Collector r10 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r5 = r5.collect(r10)
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
        L_0x00da:
            com.google.common.f.x r10 = r1.mo56224b()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r11, r6)
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            r11 = 47453(0xb95d, float:6.6496E-41)
            com.google.common.f.x r10 = r10.mo56372aa(r11)
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.protobuf.cq r11 = r2.f341747b
            boolean r12 = r2.f341748c
            java.lang.String r13 = "#filterComponentName() MediaPersonalization %s Use PCP allow list %s"
            r10.mo56355H(r13, r11, r12)
            com.google.protobuf.cq r10 = r2.f341747b
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0115
            if (r23 != 0) goto L_0x0115
            g.a.a r10 = r8.f53077m
            java.lang.Object r10 = r10.mo17428b()
            com.google.protos.m.a.f r10 = (com.google.protos.p5124m.p5125a.C65603f) r10
            com.google.protobuf.cq r10 = r10.f178307a
            java.lang.String r11 = r21.name()
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x013b
        L_0x0115:
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
            com.google.android.libraries.assistant.pcp.k.a.bp r10 = new com.google.android.libraries.assistant.pcp.k.a.bp
            r10.<init>(r8)
            j$.util.stream.Stream r5 = r5.filter(r10)
            j$.util.stream.Collector r10 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r5 = r5.collect(r10)
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
            com.google.common.f.x r10 = r1.mo56224b()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r11, r6)
            java.lang.String r11 = "#filterComponentName() after audio player filter %s"
            r12 = 47460(0xb964, float:6.6506E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56389s(r11, r5)
        L_0x013b:
            com.google.assistant.s.a.j r10 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
            int r10 = r21.ordinal()
            r11 = 12
            r12 = 11
            r13 = 22
            r14 = 1
            if (r10 == r14) goto L_0x015f
            if (r10 == r13) goto L_0x0154
            if (r10 == r12) goto L_0x0154
            if (r10 == r11) goto L_0x0154
            r21.name()
            goto L_0x0181
        L_0x0154:
            g.a.a r10 = r8.f53076l
            java.lang.Object r10 = r10.mo17428b()
            com.google.protos.m.a.f r10 = (com.google.protos.p5124m.p5125a.C65603f) r10
            com.google.protobuf.cq r10 = r10.f178307a
            goto L_0x0169
        L_0x015f:
            g.a.a r10 = r8.f53075k
            java.lang.Object r10 = r10.mo17428b()
            com.google.protos.m.a.f r10 = (com.google.protos.p5124m.p5125a.C65603f) r10
            com.google.protobuf.cq r10 = r10.f178307a
        L_0x0169:
            r21.name()
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
            com.google.android.libraries.assistant.pcp.k.a.bk r15 = new com.google.android.libraries.assistant.pcp.k.a.bk
            r15.<init>(r10)
            j$.util.stream.Stream r5 = r5.filter(r15)
            j$.util.stream.Collector r10 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r5 = r5.collect(r10)
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
        L_0x0181:
            com.google.common.f.x r10 = r1.mo56224b()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r15, r6)
            java.lang.String r15 = "#filterComponentName() after deny lists %s"
            r9 = 47454(0xb95e, float:6.6497E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r9)).mo56389s(r15, r5)
            com.google.protobuf.cq r9 = r2.f341747b
            boolean r9 = r9.isEmpty()
            r10 = 25
            if (r9 != 0) goto L_0x01a0
            boolean r9 = r2.f341748c
            if (r9 == 0) goto L_0x01ea
        L_0x01a0:
            int r9 = r21.ordinal()
            if (r9 == r13) goto L_0x01b7
            if (r9 == r10) goto L_0x01ac
            r21.name()
            goto L_0x01d9
        L_0x01ac:
            g.a.a r9 = r8.f53072h
            java.lang.Object r9 = r9.mo17428b()
            com.google.protos.m.a.f r9 = (com.google.protos.p5124m.p5125a.C65603f) r9
            com.google.protobuf.cq r9 = r9.f178307a
            goto L_0x01c1
        L_0x01b7:
            g.a.a r9 = r8.f53071g
            java.lang.Object r9 = r9.mo17428b()
            com.google.protos.m.a.f r9 = (com.google.protos.p5124m.p5125a.C65603f) r9
            com.google.protobuf.cq r9 = r9.f178307a
        L_0x01c1:
            r21.name()
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
            com.google.android.libraries.assistant.pcp.k.a.bg r15 = new com.google.android.libraries.assistant.pcp.k.a.bg
            r15.<init>(r9)
            j$.util.stream.Stream r5 = r5.filter(r15)
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r5 = r5.collect(r9)
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
        L_0x01d9:
            com.google.common.f.x r9 = r1.mo56224b()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r15, r6)
            java.lang.String r15 = "#filterComponentName() after allow lists %s"
            r10 = 47455(0xb95f, float:6.6499E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r10)).mo56389s(r15, r5)
        L_0x01ea:
            if (r23 == 0) goto L_0x02a7
            int r9 = r21.ordinal()
            if (r9 == r14) goto L_0x020e
            if (r9 == r13) goto L_0x0230
            if (r9 == r12) goto L_0x0203
            if (r9 == r11) goto L_0x0203
            g.a.a r9 = r8.f53068c
            java.lang.Object r9 = r9.mo17428b()
            com.google.protos.m.a.f r9 = (com.google.protos.p5124m.p5125a.C65603f) r9
            com.google.protobuf.cq r9 = r9.f178307a
            goto L_0x0218
        L_0x0203:
            g.a.a r9 = r8.f53073i
            java.lang.Object r9 = r9.mo17428b()
            com.google.protos.m.a.f r9 = (com.google.protos.p5124m.p5125a.C65603f) r9
            com.google.protobuf.cq r9 = r9.f178307a
            goto L_0x0218
        L_0x020e:
            g.a.a r9 = r8.f53074j
            java.lang.Object r9 = r9.mo17428b()
            com.google.protos.m.a.f r9 = (com.google.protos.p5124m.p5125a.C65603f) r9
            com.google.protobuf.cq r9 = r9.f178307a
        L_0x0218:
            r21.name()
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
            com.google.android.libraries.assistant.pcp.k.a.bm r10 = new com.google.android.libraries.assistant.pcp.k.a.bm
            r10.<init>(r9)
            j$.util.stream.Stream r5 = r5.filter(r10)
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r5 = r5.collect(r9)
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
        L_0x0230:
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r19)
            p3186j$.util.Objects.requireNonNull(r5)
            com.google.android.libraries.assistant.pcp.k.a.bh r10 = new com.google.android.libraries.assistant.pcp.k.a.bh
            r10.<init>(r5)
            j$.util.stream.Stream r5 = r9.filter(r10)
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r5 = r5.collect(r9)
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
            com.google.common.f.x r9 = r1.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r6)
            java.lang.String r10 = "#filterComponentName() after Potter sorting %s"
            r13 = 47451(0xb95b, float:6.6493E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r13)).mo56389s(r10, r5)
            boolean r9 = r24.isEmpty()
            if (r9 != 0) goto L_0x0293
            com.google.assistant.s.a.j r9 = com.google.assistant.p3994s.p3995a.C53306j.MORRIS
            boolean r9 = r3.equals(r9)
            if (r9 != 0) goto L_0x0293
            com.google.assistant.s.a.j r9 = com.google.assistant.p3994s.p3995a.C53306j.MORRIS_DRIVING_SCREEN
            boolean r9 = r3.equals(r9)
            if (r9 != 0) goto L_0x0293
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r19)
            com.google.android.libraries.assistant.pcp.k.a.bi r9 = new com.google.android.libraries.assistant.pcp.k.a.bi
            r10 = r24
            r9.<init>(r10)
            j$.util.stream.Stream r0 = r0.filter(r9)
            j$.util.Optional r0 = r0.findFirst()
            com.google.android.libraries.assistant.pcp.k.a.bj r9 = new com.google.android.libraries.assistant.pcp.k.a.bj
            r9.<init>(r5)
            j$.util.Optional r0 = r0.map(r9)
            java.lang.Object r0 = r0.orElse(r5)
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0
            r5 = r0
            goto L_0x0295
        L_0x0293:
            r10 = r24
        L_0x0295:
            com.google.common.f.x r0 = r1.mo56224b()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r9, r6)
            java.lang.String r9 = "#filterComponentName() Bring server preferred to top %s"
            r13 = 47459(0xb963, float:6.6504E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r13)).mo56389s(r9, r5)
            goto L_0x02a9
        L_0x02a7:
            r10 = r24
        L_0x02a9:
            int r0 = r2.f341749d
            long r14 = (long) r0
            r16 = 0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x02e4
            int r0 = r21.ordinal()
            if (r0 == r12) goto L_0x02d8
            if (r0 == r11) goto L_0x02d8
            r11 = 25
            if (r0 == r11) goto L_0x02cb
            g.a.a r0 = r8.f53081q
            java.lang.Object r0 = r0.mo17428b()
            java.lang.Long r0 = (java.lang.Long) r0
            long r14 = r0.longValue()
            goto L_0x02e4
        L_0x02cb:
            g.a.a r0 = r8.f53079o
            java.lang.Object r0 = r0.mo17428b()
            java.lang.Long r0 = (java.lang.Long) r0
            long r14 = r0.longValue()
            goto L_0x02e4
        L_0x02d8:
            g.a.a r0 = r8.f53080p
            java.lang.Object r0 = r0.mo17428b()
            java.lang.Long r0 = (java.lang.Long) r0
            long r14 = r0.longValue()
        L_0x02e4:
            if (r25 == 0) goto L_0x02fb
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x02fb
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r5)
            j$.util.stream.Stream r0 = r0.limit(r14)
            j$.util.stream.Collector r5 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r5)
            r5 = r0
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
        L_0x02fb:
            com.google.common.f.x r0 = r1.mo56224b()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r11, r6)
            java.lang.String r11 = "#filterComponentName() final %s"
            r12 = 47456(0xb960, float:6.65E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r12)).mo56389s(r11, r5)
            com.google.assistant.s.a.j r0 = com.google.assistant.p3994s.p3995a.C53306j.AMBIENT_ASSISTANT
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x032c
            com.google.assistant.s.a.j r0 = com.google.assistant.p3994s.p3995a.C53306j.MORRIS
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x032c
            com.google.assistant.s.a.j r0 = com.google.assistant.p3994s.p3995a.C53306j.MORRIS_DRIVING_SCREEN
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x032c
            com.google.assistant.s.a.j r0 = com.google.assistant.p3994s.p3995a.C53306j.AUTO_PROJECTED
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x03ad
        L_0x032c:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x03ad
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x03ad
            int r0 = r2.f341751f
            int r0 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123721ao.m203078a(r0)
            if (r0 != 0) goto L_0x0342
            r14 = 1
            goto L_0x0343
        L_0x0342:
            r14 = r0
        L_0x0343:
            int r14 = r14 + -1
            if (r14 == 0) goto L_0x0360
            r0 = 2
            if (r14 == r0) goto L_0x0360
            com.google.common.f.x r0 = r1.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r6)
            java.lang.String r1 = r21.name()
            r2 = 47458(0xb962, float:6.6503E-41)
            java.lang.String r3 = "#filterComponentName() %s final component names are empty after filtering. No fallback."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r3, r1)
            return r5
        L_0x0360:
            com.google.common.f.x r0 = r1.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r6)
            java.lang.String r1 = r21.name()
            r5 = 47457(0xb961, float:6.6501E-41)
            java.lang.String r6 = "#filterComponentName() %s final component names are empty after filtering, fall back to all available media apps."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56389s(r6, r1)
            j$.time.Duration r0 = p3186j$.time.Duration.ZERO
            com.google.assistant.s.a.j r1 = com.google.assistant.p3994s.p3995a.C53306j.AMBIENT_ASSISTANT
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x038f
            int r1 = r2.f341746a
            r1 = r1 & 16
            if (r1 == 0) goto L_0x038f
            com.google.protobuf.ar r0 = r2.f341752g
            if (r0 != 0) goto L_0x038b
            com.google.protobuf.ar r0 = com.google.protobuf.C62910ar.f169858c
        L_0x038b:
            j$.time.Duration r0 = com.google.protobuf.p4750c.C62950b.m95473d(r0)
        L_0x038f:
            com.google.android.libraries.assistant.pcp.k.g r1 = r8.f53070f
            com.google.android.libraries.assistant.pcp.k.i r2 = com.google.android.libraries.assistant.pcp.p1573k.C18929i.MOSTLY_USED
            com.google.common.b.gu r1 = r1.mo24219c(r2, r0)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r0 = r18
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            java.util.List r0 = r0.mo24191b(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L_0x03ad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.pcp.p1573k.p1574a.C18844bq.mo24191b(java.util.List, java.util.LinkedHashSet, com.google.assistant.s.a.j, com.google.android.apps.search.assistant.platform.pcp.f.f, boolean, java.lang.String, boolean):java.util.List");
    }
}
