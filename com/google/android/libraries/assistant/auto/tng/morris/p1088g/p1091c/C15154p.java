package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a.C15139i;
import com.google.common.p4526f.C59071e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.p */
/* compiled from: PG */
public final class C15154p {

    /* renamed from: a */
    public static final C59071e f45467a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.c.p");

    /* renamed from: b */
    public final C69464a f45468b;

    /* renamed from: c */
    public final Context f45469c;

    /* renamed from: d */
    public final C15152n f45470d;

    /* renamed from: e */
    public final C15139i f45471e = new C15139i();

    /* renamed from: f */
    public final PointF f45472f = new PointF();

    /* renamed from: g */
    public View f45473g;

    /* renamed from: h */
    boolean f45474h = false;

    /* renamed from: i */
    public C15144f f45475i;

    public C15154p(C69464a aVar, Context context, C15152n nVar) {
        this.f45468b = aVar;
        this.f45469c = context;
        this.f45470d = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22029a(float r8, float r9, int r10, int r11) {
        /*
            r7 = this;
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.i r0 = r7.f45471e
            r0.mo22006c()
            r0 = 0
            r7.f45474h = r0
            com.google.android.libraries.assistant.auto.tng.morris.g.c.f r1 = r7.f45475i
            r1.getClass()
            android.view.View r2 = r7.f45473g
            r2.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a r1 = r1.f45437a
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.getDrawingRect(r3)
            r3.offsetTo(r10, r11)
            android.view.View r10 = r1.f45413b
            r10.getClass()
            r11 = 2131432232(0x7f0b1328, float:1.8486216E38)
            android.view.View r10 = r10.findViewById(r11)
            r10.getClass()
            android.graphics.Rect r10 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15130a.m31699a(r10)
            boolean r10 = android.graphics.Rect.intersects(r3, r10)
            r11 = 1
            if (r10 == 0) goto L_0x0075
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r10 = r1.f45412a
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf.f43796e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gt r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt) r0
            com.google.android.libraries.assistant.auto.tng.morris.e.gs r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14370gs.f43489c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gr r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14369gr) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.gs r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14370gs) r2
            r2.f43491a = r11
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.gs r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14370gs) r1
            r1.getClass()
            r2.f43801d = r1
            r1 = 24
            r2.f43800c = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r0
            r10.mo21875g(r0)
        L_0x0073:
            r0 = 1
            goto L_0x0098
        L_0x0075:
            android.view.View r10 = r1.f45413b
            r10.getClass()
            r2 = 2131433732(0x7f0b1904, float:1.8489258E38)
            android.view.View r10 = r10.findViewById(r2)
            r10.getClass()
            android.graphics.Rect r10 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15130a.m31699a(r10)
            boolean r10 = android.graphics.Rect.intersects(r3, r10)
            if (r10 == 0) goto L_0x0098
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r10 = r1.f45412a
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14746p.m31073f()
            r10.mo21875g(r0)
            goto L_0x0073
        L_0x0098:
            g.a.a r10 = r7.f45468b
            java.lang.Object r10 = r10.mo17428b()
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r10 = (com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h) r10
            if (r0 == 0) goto L_0x00aa
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.d r8 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a.C15134d.f45422c
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r8 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14732b.m31016a(r8)
            goto L_0x01c6
        L_0x00aa:
            com.google.android.libraries.assistant.auto.tng.morris.g.c.n r0 = r7.f45470d
            com.google.common.f.e r1 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15152n.f45456a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "Morris.BubbleMoveAnim"
            r1.mo56378ag(r2, r3)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 45984(0xb3a0, float:6.4437E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            java.lang.String r2 = "snapToScreenEdgeWithVelocity(%f, %f)"
            r1.mo56390t(r2, r8, r9)
            double r1 = (double) r8
            double r3 = (double) r9
            double r1 = java.lang.Math.hypot(r1, r3)
            r3 = 4654311885213007872(0x4097700000000000, double:1500.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e9
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.b r8 = r0.f45461e
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.d r8 = r8.mo21996a()
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.d r8 = r0.mo22024c(r8)
            com.google.android.libraries.ad.r r9 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15152n.f45457b
            r0.mo22026e(r9, r8)
            goto L_0x01c2
        L_0x00e9:
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fe
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.b r3 = r0.f45461e
            com.google.android.libraries.ad.j r3 = r3.f45416b
            float r3 = r3.f397999e
            int r4 = r0.mo22023b()
            float r4 = (float) r4
            float r4 = r4 / r2
            float r3 = r3 + r4
            goto L_0x010b
        L_0x00fe:
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.b r3 = r0.f45461e
            com.google.android.libraries.ad.j r3 = r3.f45416b
            float r3 = r3.f397998d
            int r4 = r0.mo22023b()
            float r4 = (float) r4
            float r4 = r4 / r2
            float r3 = r3 - r4
        L_0x010b:
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.b r4 = r0.f45461e
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.d r4 = r4.mo21996a()
            float r4 = r4.mo21997a()
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.b r5 = r0.f45461e
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.d r5 = r5.mo21996a()
            float r5 = r5.mo21998b()
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.c r6 = new com.google.android.libraries.assistant.auto.tng.morris.g.c.a.c
            float r4 = r3 - r4
            float r4 = r4 / r8
            float r4 = r4 * r9
            float r5 = r5 + r4
            r6.<init>(r3, r5)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x013c
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.b r1 = r0.f45461e
            com.google.android.libraries.ad.j r1 = r1.f45417c
            float r1 = r1.f397999e
            int r3 = r0.mo22022a()
            float r3 = (float) r3
            float r3 = r3 / r2
            float r1 = r1 + r3
            goto L_0x0149
        L_0x013c:
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.b r1 = r0.f45461e
            com.google.android.libraries.ad.j r1 = r1.f45417c
            float r1 = r1.f397998d
            int r3 = r0.mo22022a()
            float r3 = (float) r3
            float r3 = r3 / r2
            float r1 = r1 - r3
        L_0x0149:
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.b r2 = r0.f45461e
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.d r2 = r2.mo21996a()
            float r2 = r2.mo21998b()
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.b r3 = r0.f45461e
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.d r3 = r3.mo21996a()
            float r3 = r3.mo21997a()
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.c r4 = new com.google.android.libraries.assistant.auto.tng.morris.g.c.a.c
            float r2 = r1 - r2
            float r2 = r2 / r9
            float r2 = r2 * r8
            float r3 = r3 + r2
            r4.<init>(r3, r1)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89847o(r6, r4)
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.b r2 = r0.f45461e
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.d r2 = r2.mo21996a()
            boolean r3 = r1.isEmpty()
            r11 = r11 ^ r3
            com.google.common.base.C58838bb.m90868c(r11)
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.f r11 = new com.google.android.libraries.assistant.auto.tng.morris.g.c.a.f
            r11.<init>(r2)
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.g r2 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a.C15137g.f45426a
            java.util.Comparator r11 = p3186j$.util.Comparator.CC.comparing(r11, r2)
            com.google.common.b.pc r11 = com.google.common.p4522b.C58710pc.m90487d(r11)
            java.lang.Object r11 = r11.mo55813h(r1)
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.d r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a.C15134d) r11
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.d r11 = r0.mo22024c(r11)
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.b r0 = r0.f45461e
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.c r1 = new com.google.android.libraries.assistant.auto.tng.morris.g.c.a.c
            r1.<init>(r8, r9)
            com.google.android.libraries.ad.r r8 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15152n.f45457b
            com.google.android.libraries.ad.j r9 = r0.f45416b
            float r2 = r1.f45420a
            com.google.android.libraries.ad.d r9 = r9.mo124183i(r2)
            com.google.android.libraries.ad.e r9 = r9.mo124173c(r8)
            r2 = r11
            com.google.android.libraries.assistant.auto.tng.morris.g.c.a.c r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a.C15133c) r2
            float r3 = r2.f45420a
            r9.mo124174a(r3)
            com.google.android.libraries.ad.j r9 = r0.f45417c
            float r0 = r1.f45421b
            com.google.android.libraries.ad.d r9 = r9.mo124183i(r0)
            com.google.android.libraries.ad.e r8 = r9.mo124173c(r8)
            float r9 = r2.f45421b
            r8.mo124174a(r9)
            r8 = r11
        L_0x01c2:
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r8 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14732b.m31016a(r8)
        L_0x01c6:
            r10.mo21875g(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15154p.mo22029a(float, float, int, int):void");
    }
}
