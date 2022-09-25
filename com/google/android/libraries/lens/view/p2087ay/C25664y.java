package com.google.android.libraries.lens.view.p2087ay;

import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.android.libraries.lens.view.gleam.C26508cm;
import com.google.android.libraries.lens.view.gleam.C26525dc;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26752d;
import com.google.android.libraries.lens.view.utils.C28120i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.ay.y */
/* compiled from: PG */
public final class C25664y {

    /* renamed from: a */
    public static final C58974d f69785a = C58974d.m91135i("GleamManager");

    /* renamed from: b */
    public final Object f69786b = new Object();

    /* renamed from: c */
    public long f69787c;

    /* renamed from: d */
    public C58833ax f69788d = C58836b.f156633a;

    /* renamed from: e */
    public final Set f69789e = C58758qx.m90653k();

    /* renamed from: f */
    public final Object f69790f = new Object();

    /* renamed from: g */
    public final List f69791g = new ArrayList();

    /* renamed from: h */
    public C58839bc f69792h = C26504ci.f72199a;

    /* renamed from: i */
    public boolean f69793i;

    /* renamed from: j */
    public final C26752d f69794j;

    /* renamed from: k */
    public final C21370a f69795k;

    /* renamed from: l */
    public final C25646g f69796l;

    /* renamed from: m */
    public final C26508cm f69797m;

    /* renamed from: n */
    public final C25626ai f69798n;

    /* renamed from: o */
    public final boolean f69799o;

    /* renamed from: p */
    public final boolean f69800p;

    /* renamed from: q */
    public long f69801q = 0;

    /* renamed from: r */
    public long f69802r = 0;

    /* renamed from: s */
    final C25654o f69803s = new C25654o(this);

    /* renamed from: t */
    private final boolean f69804t;

    public C25664y(C21370a aVar, C26508cm cmVar, C26752d dVar, C25646g gVar, C25626ai aiVar, boolean z, boolean z2, boolean z3) {
        this.f69795k = aVar;
        this.f69797m = cmVar;
        this.f69794j = dVar;
        this.f69796l = gVar;
        this.f69798n = aiVar;
        this.f69799o = z;
        this.f69800p = z2;
        this.f69804t = z3;
        dVar.f72882c = new C25655p(this);
    }

    /* renamed from: a */
    public final int mo30767a(C25349y yVar) {
        C58485gu f = mo30772f();
        int size = f.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C26504ci ciVar = (C26504ci) f.get(i2);
            if (ciVar.mo31767l() && ciVar.mo31760d() == yVar) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r1v62, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.lens.view.p2069am.C25310ar mo30768b(long r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.String r3 = "GM:getRenderableGleamsFor"
            android.os.Trace.beginSection(r3)
            com.google.common.b.gu r3 = r21.mo30772f()
            com.google.android.libraries.lens.view.am.ar r4 = com.google.android.libraries.lens.view.p2069am.C25310ar.f68865c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.lens.view.am.aq r4 = (com.google.android.libraries.lens.view.p2069am.C25309aq) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.lens.view.am.ar r5 = (com.google.android.libraries.lens.view.p2069am.C25310ar) r5
            r5.f68868b = r1
            int r5 = r3.size()
            r7 = 0
        L_0x0023:
            if (r7 >= r5) goto L_0x0449
            java.lang.Object r8 = r3.get(r7)
            com.google.android.libraries.lens.view.gleam.ci r8 = (com.google.android.libraries.lens.view.gleam.C26504ci) r8
            com.google.common.base.bc r9 = r0.f69792h
            boolean r9 = r9.mo5941a(r8)
            if (r9 == 0) goto L_0x0439
            r9 = 0
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0045
            com.google.android.libraries.lens.view.vision.u r9 = r8.f72215i
            long r9 = r9.mo33666i()
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0045
            goto L_0x0439
        L_0x0045:
            boolean r9 = r8.mo31767l()
            if (r9 == 0) goto L_0x041b
            boolean r9 = r8.mo31766k()
            if (r9 == 0) goto L_0x040d
            com.google.bp.f.b.a.ap r9 = r8.f72229w
            com.google.protobuf.cq r9 = r9.f149783b
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x0439
            com.google.bp.f.b.a.ap r9 = r8.f72229w
            com.google.protobuf.cq r9 = r9.f149783b
            int r9 = r9.size()
            r10 = 1
            if (r9 <= 0) goto L_0x0068
            r9 = 1
            goto L_0x0069
        L_0x0068:
            r9 = 0
        L_0x0069:
            com.google.common.base.C58838bb.m90883r(r9)
            com.google.android.libraries.lens.view.vision.u r9 = r8.f72215i
            com.google.android.libraries.lens.view.am.ap r11 = com.google.android.libraries.lens.view.p2069am.C25308ap.f68839y
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.libraries.lens.view.am.x r11 = (com.google.android.libraries.lens.view.p2069am.C25348x) r11
            com.google.android.libraries.lens.view.vision.u r12 = r8.f72214h
            int r12 = r12.mo33664h()
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.libraries.lens.view.am.ap r13 = (com.google.android.libraries.lens.view.p2069am.C25308ap) r13
            r13.f68845f = r12
            com.google.lens.j.bv r12 = com.google.lens.p4707j.C62445bv.f168618e
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.lens.j.bu r12 = (com.google.lens.p4707j.C62444bu) r12
            android.util.Size r13 = r8.f72218l
            com.google.lens.j.br r13 = com.google.android.libraries.lens.view.vision.C28180v.m52673a(r9, r13)
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.lens.j.bv r14 = (com.google.lens.p4707j.C62445bv) r14
            r13.getClass()
            r14.f168621b = r13
            int r13 = r14.f168620a
            r13 = r13 | r10
            r14.f168620a = r13
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.libraries.lens.view.am.ap r13 = (com.google.android.libraries.lens.view.p2069am.C25308ap) r13
            com.google.protobuf.bv r12 = r12.build()
            com.google.lens.j.bv r12 = (com.google.lens.p4707j.C62445bv) r12
            r12.getClass()
            r13.f68847h = r12
            com.google.bp.f.b.a.ap r12 = r8.f72229w
            com.google.common.base.b r13 = com.google.common.base.C58836b.f156633a
            java.lang.String r12 = com.google.android.libraries.lens.common.text.C24141q.m44841c(r12, r13)
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.libraries.lens.view.am.ap r13 = (com.google.android.libraries.lens.view.p2069am.C25308ap) r13
            r12.getClass()
            r13.f68849j = r12
            com.google.android.libraries.lens.view.am.y r12 = com.google.android.libraries.lens.view.p2069am.C25349y.TEXT_GLEAM
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.libraries.lens.view.am.ap r13 = (com.google.android.libraries.lens.view.p2069am.C25308ap) r13
            int r12 = r12.getNumber()
            r13.f68848i = r12
            com.google.android.libraries.lens.view.vision.u r12 = r8.f72215i
            com.google.android.libraries.lens.view.am.am r13 = com.google.android.libraries.lens.view.p2069am.C25305am.f68828d
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.lens.view.am.al r13 = (com.google.android.libraries.lens.view.p2069am.C25304al) r13
            com.google.android.libraries.lens.view.vision.u r14 = r8.f72215i
            com.google.android.libraries.lens.view.vision.u r15 = r8.f72214h
            long r15 = r15.mo33666i()
            long r17 = r14.mo33666i()
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x00fb
            com.google.android.libraries.lens.view.am.az r14 = com.google.android.libraries.lens.view.p2069am.C25318az.f68885b
            r18 = r3
            r17 = r11
            goto L_0x01e4
        L_0x00fb:
            float r15 = r14.mo33658c()
            com.google.android.libraries.lens.view.vision.u r6 = r8.f72214h
            float r6 = r6.mo33658c()
            float r15 = r15 - r6
            r17 = r11
            double r10 = (double) r15
            double r10 = java.lang.Math.toDegrees(r10)
            com.google.android.libraries.lens.view.am.ay r15 = com.google.android.libraries.lens.view.p2069am.C25317ay.f68879e
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.android.libraries.lens.view.am.ax r15 = (com.google.android.libraries.lens.view.p2069am.C25316ax) r15
            com.google.android.libraries.lens.view.am.av r18 = com.google.android.libraries.lens.view.p2069am.C25314av.f68875c
            com.google.protobuf.bn r18 = r18.createBuilder()
            r6 = r18
            com.google.android.libraries.lens.view.am.au r6 = (com.google.android.libraries.lens.view.p2069am.C25313au) r6
            com.google.android.libraries.lens.view.vision.u r1 = r8.f72214h
            float r1 = r1.mo33662f()
            android.util.Size r2 = r8.f72218l
            int r2 = r2.getWidth()
            r6.copyOnWrite()
            r18 = r3
            com.google.protobuf.bv r3 = r6.instance
            com.google.android.libraries.lens.view.am.av r3 = (com.google.android.libraries.lens.view.p2069am.C25314av) r3
            float r2 = (float) r2
            float r1 = r1 / r2
            r3.f68877a = r1
            com.google.android.libraries.lens.view.vision.u r1 = r8.f72214h
            float r1 = r1.mo33663g()
            android.util.Size r2 = r8.f72218l
            int r2 = r2.getHeight()
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.android.libraries.lens.view.am.av r3 = (com.google.android.libraries.lens.view.p2069am.C25314av) r3
            float r2 = (float) r2
            float r1 = r1 / r2
            r3.f68878b = r1
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.android.libraries.lens.view.am.ay r1 = (com.google.android.libraries.lens.view.p2069am.C25317ay) r1
            com.google.protobuf.bv r2 = r6.build()
            com.google.android.libraries.lens.view.am.av r2 = (com.google.android.libraries.lens.view.p2069am.C25314av) r2
            r2.getClass()
            r1.f68881a = r2
            com.google.android.libraries.lens.view.am.av r1 = com.google.android.libraries.lens.view.p2069am.C25314av.f68875c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.lens.view.am.au r1 = (com.google.android.libraries.lens.view.p2069am.C25313au) r1
            float r2 = r14.mo33662f()
            android.util.Size r3 = r8.f72218l
            int r3 = r3.getWidth()
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.libraries.lens.view.am.av r6 = (com.google.android.libraries.lens.view.p2069am.C25314av) r6
            float r3 = (float) r3
            float r2 = r2 / r3
            r6.f68877a = r2
            float r2 = r14.mo33663g()
            android.util.Size r3 = r8.f72218l
            int r3 = r3.getHeight()
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.libraries.lens.view.am.av r6 = (com.google.android.libraries.lens.view.p2069am.C25314av) r6
            float r3 = (float) r3
            float r2 = r2 / r3
            r6.f68878b = r2
            r15.copyOnWrite()
            com.google.protobuf.bv r2 = r15.instance
            com.google.android.libraries.lens.view.am.ay r2 = (com.google.android.libraries.lens.view.p2069am.C25317ay) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.lens.view.am.av r1 = (com.google.android.libraries.lens.view.p2069am.C25314av) r1
            r1.getClass()
            r2.f68882b = r1
            float r1 = r14.mo33659d()
            com.google.android.libraries.lens.view.vision.u r2 = r8.f72214h
            float r2 = r2.mo33659d()
            r15.copyOnWrite()
            com.google.protobuf.bv r3 = r15.instance
            com.google.android.libraries.lens.view.am.ay r3 = (com.google.android.libraries.lens.view.p2069am.C25317ay) r3
            float r1 = r1 / r2
            r3.f68884d = r1
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.android.libraries.lens.view.am.ay r1 = (com.google.android.libraries.lens.view.p2069am.C25317ay) r1
            float r2 = (float) r10
            r1.f68883c = r2
            com.google.protobuf.bv r1 = r15.build()
            com.google.android.libraries.lens.view.am.ay r1 = (com.google.android.libraries.lens.view.p2069am.C25317ay) r1
            com.google.android.libraries.lens.view.am.az r2 = com.google.android.libraries.lens.view.p2069am.C25318az.f68885b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.lens.view.am.aw r2 = (com.google.android.libraries.lens.view.p2069am.C25315aw) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.lens.view.am.az r3 = (com.google.android.libraries.lens.view.p2069am.C25318az) r3
            r1.getClass()
            r3.f68887a = r1
            com.google.protobuf.bv r1 = r2.build()
            r14 = r1
            com.google.android.libraries.lens.view.am.az r14 = (com.google.android.libraries.lens.view.p2069am.C25318az) r14
        L_0x01e4:
            r13.copyOnWrite()
            com.google.protobuf.bv r1 = r13.instance
            com.google.android.libraries.lens.view.am.am r1 = (com.google.android.libraries.lens.view.p2069am.C25305am) r1
            r14.getClass()
            r1.f68830a = r14
            com.google.common.base.ax r1 = r12.mo33677t()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r1 = r1.mo56109e(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r13.copyOnWrite()
            com.google.protobuf.bv r2 = r13.instance
            com.google.android.libraries.lens.view.am.am r2 = (com.google.android.libraries.lens.view.p2069am.C25305am) r2
            r2.f68831b = r1
            boolean r1 = r12.mo33655B()
            r13.copyOnWrite()
            com.google.protobuf.bv r2 = r13.instance
            com.google.android.libraries.lens.view.am.am r2 = (com.google.android.libraries.lens.view.p2069am.C25305am) r2
            r2.f68832c = r1
            com.google.protobuf.bv r1 = r13.build()
            com.google.android.libraries.lens.view.am.am r1 = (com.google.android.libraries.lens.view.p2069am.C25305am) r1
            r17.copyOnWrite()
            r11 = r17
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.libraries.lens.view.am.ap r2 = (com.google.android.libraries.lens.view.p2069am.C25308ap) r2
            r1.getClass()
            r2.f68854o = r1
            boolean r1 = r8.mo31765j()
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.libraries.lens.view.am.ap r2 = (com.google.android.libraries.lens.view.p2069am.C25308ap) r2
            r2.f68852m = r1
            com.google.common.base.ax r1 = r8.f72227u
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x025b
            com.google.common.base.ax r1 = r8.f72227u
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.lens.view.am.ao r1 = (com.google.android.libraries.lens.view.p2069am.C25307ao) r1
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.libraries.lens.view.am.ap r2 = (com.google.android.libraries.lens.view.p2069am.C25308ap) r2
            r1.getClass()
            r2.f68842c = r1
            r1 = 16
            r2.f68841b = r1
        L_0x025b:
            com.google.bp.f.b.a.y r1 = r8.f72216j
            com.google.common.base.ax r1 = com.google.android.libraries.lens.view.utils.C28120i.m52397a(r1)
            boolean r2 = r1.mo56113h()
            if (r2 == 0) goto L_0x02a2
            com.google.android.libraries.lens.view.am.aa r2 = com.google.android.libraries.lens.view.p2069am.C25293aa.f68800c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.lens.view.am.z r2 = (com.google.android.libraries.lens.view.p2069am.C25350z) r2
            java.lang.Object r1 = r1.mo56107c()
            java.lang.String r1 = (java.lang.String) r1
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.lens.view.am.aa r3 = (com.google.android.libraries.lens.view.p2069am.C25293aa) r3
            r1.getClass()
            r3.f68802a = r1
            com.google.android.libraries.lens.view.vision.u r1 = r8.f72214h
            long r12 = r1.mo33666i()
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.libraries.lens.view.am.aa r1 = (com.google.android.libraries.lens.view.p2069am.C25293aa) r1
            r1.f68803b = r12
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.lens.view.am.aa r1 = (com.google.android.libraries.lens.view.p2069am.C25293aa) r1
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.libraries.lens.view.am.ap r2 = (com.google.android.libraries.lens.view.p2069am.C25308ap) r2
            r1.getClass()
            r2.f68855p = r1
        L_0x02a2:
            com.google.android.libraries.lens.view.am.ak r1 = com.google.android.libraries.lens.view.p2069am.C25303ak.f68821f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.lens.view.am.ab r1 = (com.google.android.libraries.lens.view.p2069am.C25294ab) r1
            com.google.common.b.gu r2 = r8.f72225s
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            com.google.common.base.C58838bb.m90883r(r2)
            com.google.common.b.gu r2 = r8.f72225s
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.libraries.lens.view.am.ak r3 = (com.google.android.libraries.lens.view.p2069am.C25303ak) r3
            com.google.protobuf.cq r10 = r3.f68825c
            boolean r12 = r10.mo58948c()
            if (r12 != 0) goto L_0x02cc
            com.google.protobuf.cq r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r10)
            r3.f68825c = r10
        L_0x02cc:
            com.google.protobuf.cq r3 = r3.f68825c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r3)
            com.google.common.b.gu r2 = r8.f72226t
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.libraries.lens.view.am.ak r3 = (com.google.android.libraries.lens.view.p2069am.C25303ak) r3
            com.google.protobuf.cq r10 = r3.f68826d
            boolean r12 = r10.mo58948c()
            if (r12 != 0) goto L_0x02e8
            com.google.protobuf.cq r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r10)
            r3.f68826d = r10
        L_0x02e8:
            com.google.protobuf.cq r3 = r3.f68826d
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r3)
            com.google.android.libraries.lens.view.am.aj r2 = com.google.android.libraries.lens.view.p2069am.C25302aj.f68817c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.lens.view.am.ai r2 = (com.google.android.libraries.lens.view.p2069am.C25301ai) r2
            com.google.bp.f.b.a.ap r3 = r8.f72229w
            int r3 = r3.f149785d
            int r3 = com.google.lens.p4707j.C62475cy.m94782b(r3)
            if (r3 != 0) goto L_0x0300
            r3 = 2
        L_0x0300:
            r2.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.android.libraries.lens.view.am.aj r12 = (com.google.android.libraries.lens.view.p2069am.C25302aj) r12
            int r3 = com.google.lens.p4707j.C62475cy.m94781a(r3)
            r12.f68820b = r3
            com.google.bp.f.b.a.ap r3 = r8.f72229w
            com.google.bp.f.b.a.ae r3 = r3.f149784c
            if (r3 != 0) goto L_0x0315
            com.google.bp.f.b.a.ae r3 = com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae.f149753h
        L_0x0315:
            com.google.android.libraries.lens.view.am.i r12 = r8.f72219m
            com.google.android.libraries.lens.e.a.n r3 = com.google.android.libraries.lens.view.p2177w.C28185a.m52689g(r3, r12)
            r2.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.android.libraries.lens.view.am.aj r12 = (com.google.android.libraries.lens.view.p2069am.C25302aj) r12
            r3.getClass()
            r12.f68819a = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.libraries.lens.view.am.ak r3 = (com.google.android.libraries.lens.view.p2069am.C25303ak) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.lens.view.am.aj r2 = (com.google.android.libraries.lens.view.p2069am.C25302aj) r2
            r2.getClass()
            r3.f68827e = r2
            com.google.common.b.gu r2 = r9.mo33679u()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x03e9
            com.google.android.libraries.lens.view.vision.u r2 = r8.f72214h
            android.util.Size r3 = r8.f72218l
            float r9 = r2.mo33662f()
            float r12 = r2.mo33663g()
            float r13 = r2.mo33659d()
            float r14 = r2.mo33660e()
            float r2 = r2.mo33658c()
            r15 = 4
            android.graphics.PointF[] r6 = new android.graphics.PointF[r15]
            r17 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 * r17
            float r15 = r9 - r13
            float r14 = r14 * r17
            float r10 = r12 - r14
            r20 = r5
            android.graphics.PointF r5 = new android.graphics.PointF
            r5.<init>(r15, r10)
            r16 = 0
            r6[r16] = r5
            float r14 = r14 + r12
            android.graphics.PointF r5 = new android.graphics.PointF
            r5.<init>(r15, r14)
            r15 = 1
            r6[r15] = r5
            float r13 = r13 + r9
            android.graphics.PointF r5 = new android.graphics.PointF
            r5.<init>(r13, r14)
            r14 = 2
            r6[r14] = r5
            android.graphics.PointF r5 = new android.graphics.PointF
            r5.<init>(r13, r10)
            r10 = 3
            r6[r10] = r5
            android.graphics.PointF[] r2 = com.google.android.libraries.lens.common.p1998a.C24097e.m44768b(r9, r12, r2, r14, r6)
            com.google.common.b.gp r5 = com.google.common.p4522b.C58485gu.m89837e()
            r6 = 0
            r9 = 4
        L_0x0397:
            if (r6 >= r9) goto L_0x03be
            r10 = r2[r6]
            float r10 = r10.x
            int r12 = r3.getWidth()
            float r12 = (float) r12
            float r10 = r10 / r12
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r5.mo55395g(r10)
            r10 = r2[r6]
            float r10 = r10.y
            int r12 = r3.getHeight()
            float r12 = (float) r12
            float r10 = r10 / r12
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r5.mo55395g(r10)
            int r6 = r6 + 1
            goto L_0x0397
        L_0x03be:
            com.google.common.b.gu r2 = r5.mo55394f()
            com.google.lens.j.dn r2 = com.google.android.libraries.lens.common.p1998a.C24095c.m44766k(r2)
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.libraries.lens.view.am.ak r3 = (com.google.android.libraries.lens.view.p2069am.C25303ak) r3
            r2.getClass()
            r3.f68824b = r2
            com.google.android.libraries.lens.view.vision.u r2 = r8.f72215i
            com.google.common.b.gu r2 = r2.mo33679u()
            com.google.lens.j.dn r2 = com.google.android.libraries.lens.common.p1998a.C24095c.m44766k(r2)
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.libraries.lens.view.am.ak r3 = (com.google.android.libraries.lens.view.p2069am.C25303ak) r3
            r2.getClass()
            r3.f68823a = r2
            goto L_0x03ed
        L_0x03e9:
            r20 = r5
            r16 = 0
        L_0x03ed:
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.libraries.lens.view.am.ap r2 = (com.google.android.libraries.lens.view.p2069am.C25308ap) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.lens.view.am.ak r1 = (com.google.android.libraries.lens.view.p2069am.C25303ak) r1
            r1.getClass()
            r2.f68844e = r1
            r1 = 12
            r2.f68843d = r1
            com.google.protobuf.bv r1 = r11.build()
            com.google.android.libraries.lens.view.am.ap r1 = (com.google.android.libraries.lens.view.p2069am.C25308ap) r1
            r4.mo30370a(r1)
            goto L_0x043f
        L_0x040d:
            r18 = r3
            r20 = r5
            r16 = 0
            com.google.android.libraries.lens.view.am.ap r1 = r8.mo31761e()
            r4.mo30370a(r1)
            goto L_0x043f
        L_0x041b:
            r18 = r3
            r20 = r5
            r16 = 0
            boolean r1 = r0.f69804t
            if (r1 == 0) goto L_0x043f
            com.google.android.libraries.lens.view.am.y r1 = com.google.android.libraries.lens.view.p2069am.C25349y.NONE
            com.google.android.libraries.lens.view.am.y r2 = r8.mo31760d()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x043f
            com.google.android.libraries.lens.view.am.ap r1 = r8.mo31761e()
            r4.mo30370a(r1)
            goto L_0x043f
        L_0x0439:
            r18 = r3
            r20 = r5
            r16 = 0
        L_0x043f:
            int r7 = r7 + 1
            r1 = r22
            r3 = r18
            r5 = r20
            goto L_0x0023
        L_0x0449:
            android.os.Trace.endSection()
            com.google.protobuf.bv r1 = r4.build()
            com.google.android.libraries.lens.view.am.ar r1 = (com.google.android.libraries.lens.view.p2069am.C25310ar) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2087ay.C25664y.mo30768b(long):com.google.android.libraries.lens.view.am.ar");
    }

    /* renamed from: c */
    public final C58833ax mo30769c(int i) {
        synchronized (this.f69790f) {
            for (C26504ci ciVar : this.f69791g) {
                if (ciVar.f72214h.mo33664h() == i) {
                    C58833ax k = C58833ax.m90834k(ciVar);
                    return k;
                }
            }
            return C58836b.f156633a;
        }
    }

    /* renamed from: d */
    public final C58833ax mo30770d(String str) {
        C26504ci ciVar = (C26504ci) mo30773g().get(str);
        if (ciVar == null || !this.f69792h.mo5941a(ciVar)) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(ciVar);
    }

    /* renamed from: e */
    public final C58833ax mo30771e() {
        synchronized (this.f69790f) {
            for (C26504ci ciVar : this.f69791g) {
                if (ciVar.f72224r) {
                    C58833ax k = C58833ax.m90834k(ciVar);
                    return k;
                }
            }
            return C58836b.f156633a;
        }
    }

    /* renamed from: f */
    public final C58485gu mo30772f() {
        C58480gp gpVar = new C58480gp(4);
        synchronized (this.f69790f) {
            gpVar.mo55396h(this.f69791g);
        }
        return gpVar.mo55394f();
    }

    /* renamed from: g */
    public final C58495hd mo30773g() {
        C58485gu f = mo30772f();
        C58490gz gzVar = new C58490gz(4);
        int size = f.size();
        for (int i = 0; i < size; i++) {
            C26504ci ciVar = (C26504ci) f.get(i);
            C58833ax a = C28120i.m52397a(ciVar.f72216j);
            if (a.mo56113h()) {
                gzVar.mo55429h((String) a.mo56107c(), ciVar);
            }
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: h */
    public final void mo30774h(long j) {
        this.f69788d.mo56109e(-1L);
        this.f69787c = j;
        this.f69788d = C58833ax.m90834k(Long.valueOf(j));
        synchronized (this.f69786b) {
            this.f69798n.mo30744d(j, mo30772f());
        }
    }

    /* renamed from: i */
    public final void mo30775i(C58839bc bcVar) {
        C58485gu f = mo30772f();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            C26504ci ciVar = (C26504ci) f.get(i);
            if (bcVar.mo5941a(ciVar)) {
                mo30776j(ciVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo30776j(C26504ci ciVar) {
        boolean remove;
        if (this.f69798n.mo30746f()) {
            this.f69798n.mo30745e(ciVar);
        }
        synchronized (this.f69790f) {
            remove = this.f69791g.remove(ciVar);
        }
        if (!remove) {
            ((C58970a) ((C58970a) f69785a.mo56226d()).mo56372aa(50225)).mo56387q("Could not remove Gleam with id=%d", ciVar.f72214h.mo33664h());
        }
    }

    /* renamed from: k */
    public final void mo30777k() {
        Collection.EL.stream(mo30772f()).forEach(C25658s.f69778a);
    }

    /* renamed from: l */
    public final void mo30778l(C26525dc dcVar) {
        this.f69789e.remove(dcVar);
    }
}
