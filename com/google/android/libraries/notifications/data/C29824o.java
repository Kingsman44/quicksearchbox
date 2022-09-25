package com.google.android.libraries.notifications.data;

import com.google.p4160bf.p4164b.p4165a.C55683w;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55520a;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55568d;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.libraries.notifications.data.o */
/* compiled from: PG */
public abstract class C29824o {
    /* renamed from: a */
    public abstract int mo35020a();

    /* renamed from: b */
    public abstract C55683w mo35021b();

    /* renamed from: c */
    public abstract C55564bq mo35022c();

    /* renamed from: d */
    public abstract C63070h mo35023d();

    /* renamed from: e */
    public abstract C62910ar mo35024e();

    /* renamed from: f */
    public abstract String mo35026f();

    /* renamed from: g */
    public abstract String mo35027g();

    /* renamed from: h */
    public abstract String mo35028h();

    /* renamed from: i */
    public abstract String mo35030i();

    /* renamed from: j */
    public abstract C29789c mo35031j();

    /* renamed from: k */
    public abstract int mo35032k();

    /* renamed from: m */
    public final C55568d mo35133m() {
        C55520a aVar = (C55520a) C55568d.f146611j.createBuilder();
        String h = mo35028h();
        aVar.copyOnWrite();
        C55568d dVar = (C55568d) aVar.instance;
        h.getClass();
        dVar.f146613a |= 2;
        dVar.f146618f = h;
        String i = mo35030i();
        aVar.copyOnWrite();
        C55568d dVar2 = (C55568d) aVar.instance;
        i.getClass();
        dVar2.f146613a |= 4;
        dVar2.f146619g = i;
        C55564bq c = mo35022c();
        aVar.copyOnWrite();
        C55568d dVar3 = (C55568d) aVar.instance;
        c.getClass();
        dVar3.f146620h = c;
        dVar3.f146613a |= 32;
        C63070h d = mo35023d();
        aVar.copyOnWrite();
        C55568d dVar4 = (C55568d) aVar.instance;
        d.getClass();
        dVar4.f146621i = d;
        dVar4.f146613a |= 64;
        if (!mo35026f().isEmpty()) {
            String f = mo35026f();
            aVar.copyOnWrite();
            C55568d dVar5 = (C55568d) aVar.instance;
            f.getClass();
            dVar5.f146614b = 4;
            dVar5.f146615c = f;
        } else {
            int k = mo35032k();
            aVar.copyOnWrite();
            C55568d dVar6 = (C55568d) aVar.instance;
            int i2 = k - 1;
            if (k != 0) {
                dVar6.f146615c = Integer.valueOf(i2);
                dVar6.f146614b = 7;
            } else {
                throw null;
            }
        }
        if (!mo35027g().isEmpty()) {
            String g = mo35027g();
            aVar.copyOnWrite();
            C55568d dVar7 = (C55568d) aVar.instance;
            g.getClass();
            dVar7.f146616d = 8;
            dVar7.f146617e = g;
        }
        if (!mo35021b().equals(C55683w.f146907d)) {
            C55683w b = mo35021b();
            aVar.copyOnWrite();
            C55568d dVar8 = (C55568d) aVar.instance;
            b.getClass();
            dVar8.f146617e = b;
            dVar8.f146616d = 9;
        }
        if (!mo35024e().equals(C62910ar.f169858c)) {
            C62910ar e = mo35024e();
            aVar.copyOnWrite();
            C55568d dVar9 = (C55568d) aVar.instance;
            e.getClass();
            dVar9.f146617e = e;
            dVar9.f146616d = 10;
        }
        return (C55568d) aVar.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if ((r7.f146614b == 4 ? (java.lang.String) r7.f146615c : r4).isEmpty() == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r0 == false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (android.os.Build.VERSION.SDK_INT != 30) goto L_0x0061;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.common.base.C58833ax m55128l(com.google.p4160bf.p4164b.p4165a.p4166a.C55568d r7) {
        /*
            r7.getClass()
            int r0 = r7.f146614b
            r1 = 7
            r2 = 1
            if (r0 != r1) goto L_0x0017
            java.lang.Object r0 = r7.f146615c
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55567c.m87709a(r0)
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            int r0 = r0 + -1
            r3 = 4
            java.lang.String r4 = ""
            if (r0 == r2) goto L_0x004f
            r5 = 2
            if (r0 == r5) goto L_0x0041
            r5 = 3
            if (r0 == r5) goto L_0x0036
            int r0 = r7.f146614b
            if (r0 != r3) goto L_0x002e
            java.lang.Object r0 = r7.f146615c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x002f
        L_0x002e:
            r0 = r4
        L_0x002f:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0121
            goto L_0x0061
        L_0x0036:
            e.a.a.o.a.m r0 = p5304e.p5305a.p5306a.p5409o.p5410a.C68949m.f185237a
            e.a.a.o.a.n r0 = r0.mo6453a()
            boolean r0 = r0.mo60807b()
            goto L_0x004b
        L_0x0041:
            e.a.a.o.a.m r0 = p5304e.p5305a.p5306a.p5409o.p5410a.C68949m.f185237a
            e.a.a.o.a.n r0 = r0.mo6453a()
            boolean r0 = r0.mo60808c()
        L_0x004b:
            if (r0 != 0) goto L_0x0061
            goto L_0x0121
        L_0x004f:
            e.a.a.o.a.m r0 = p5304e.p5305a.p5306a.p5409o.p5410a.C68949m.f185237a
            e.a.a.o.a.n r0 = r0.mo6453a()
            boolean r0 = r0.mo60806a()
            if (r0 == 0) goto L_0x0121
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r0 == r5) goto L_0x0121
        L_0x0061:
            com.google.android.libraries.notifications.data.c r0 = new com.google.android.libraries.notifications.data.c
            r0.<init>()
            r5 = 0
            r0.mo35016b(r5)
            r0.f80738c = r4
            r0.f80736a = r4
            r0.f80741f = r2
            com.google.bf.b.a.a.bq r6 = com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq.f146602f
            r0.mo35019e(r6)
            com.google.protobuf.h r6 = com.google.protobuf.C63070h.f170215c
            r0.f80739d = r6
            r0.f80740e = r4
            com.google.bf.b.a.w r6 = com.google.p4160bf.p4164b.p4165a.C55683w.f146907d
            r0.mo35017c(r6)
            com.google.protobuf.ar r6 = com.google.protobuf.C62910ar.f169858c
            r0.mo35018d(r6)
            r0.mo35016b(r5)
            java.lang.String r5 = r7.f146618f
            if (r5 == 0) goto L_0x0119
            r0.f80737b = r5
            java.lang.String r5 = r7.f146619g
            if (r5 == 0) goto L_0x0111
            r0.f80738c = r5
            int r5 = r7.f146614b
            if (r5 != r1) goto L_0x00a8
            java.lang.Object r1 = r7.f146615c
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55567c.m87709a(r1)
            if (r1 != 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r2 = r1
        L_0x00a8:
            r0.f80741f = r2
            int r1 = r7.f146614b
            if (r1 != r3) goto L_0x00b3
            java.lang.Object r1 = r7.f146615c
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00b4
        L_0x00b3:
            r1 = r4
        L_0x00b4:
            if (r1 == 0) goto L_0x0109
            r0.f80736a = r1
            com.google.bf.b.a.a.bq r1 = r7.f146620h
            if (r1 != 0) goto L_0x00be
            com.google.bf.b.a.a.bq r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq.f146602f
        L_0x00be:
            r0.mo35019e(r1)
            com.google.protobuf.h r1 = r7.f146621i
            if (r1 != 0) goto L_0x00c7
            com.google.protobuf.h r1 = com.google.protobuf.C63070h.f170215c
        L_0x00c7:
            r0.f80739d = r1
            int r1 = r7.f146616d
            r2 = 8
            if (r1 != r2) goto L_0x00d6
            java.lang.Object r1 = r7.f146617e
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            r1 = 8
        L_0x00d6:
            if (r4 == 0) goto L_0x0101
            r0.f80740e = r4
            r2 = 9
            if (r1 != r2) goto L_0x00e3
            java.lang.Object r1 = r7.f146617e
            com.google.bf.b.a.w r1 = (com.google.p4160bf.p4164b.p4165a.C55683w) r1
            goto L_0x00e5
        L_0x00e3:
            com.google.bf.b.a.w r1 = com.google.p4160bf.p4164b.p4165a.C55683w.f146907d
        L_0x00e5:
            r0.mo35017c(r1)
            int r1 = r7.f146616d
            r2 = 10
            if (r1 != r2) goto L_0x00f3
            java.lang.Object r7 = r7.f146617e
            com.google.protobuf.ar r7 = (com.google.protobuf.C62910ar) r7
            goto L_0x00f5
        L_0x00f3:
            com.google.protobuf.ar r7 = com.google.protobuf.C62910ar.f169858c
        L_0x00f5:
            r0.mo35018d(r7)
            com.google.android.libraries.notifications.data.o r7 = r0.mo35015a()
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
            return r7
        L_0x0101:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "Null replyHintText"
            r7.<init>(r0)
            throw r7
        L_0x0109:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "Null actionId"
            r7.<init>(r0)
            throw r7
        L_0x0111:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "Null url"
            r7.<init>(r0)
            throw r7
        L_0x0119:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "Null text"
            r7.<init>(r0)
            throw r7
        L_0x0121:
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.C29824o.m55128l(com.google.bf.b.a.a.d):com.google.common.base.ax");
    }
}
