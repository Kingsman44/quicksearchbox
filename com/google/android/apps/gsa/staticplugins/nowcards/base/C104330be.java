package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import androidx.core.p097i.C1970e;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.p489g.p494d.C9137a;
import com.google.android.apps.p489g.p494d.C9140ac;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9164b;
import com.google.android.apps.p489g.p494d.C9179bo;
import com.google.android.apps.p489g.p494d.C9180bp;
import com.google.android.apps.p489g.p494d.C9216cy;
import com.google.android.apps.p489g.p494d.C9217cz;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.apps.p489g.p494d.C9281y;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.be */
/* compiled from: PG */
public final class C104330be {

    /* renamed from: a */
    public final C104329bd f290241a;

    /* renamed from: b */
    public boolean f290242b = false;

    /* renamed from: c */
    public int f290243c = 0;

    /* renamed from: d */
    public final Map f290244d = new HashMap();

    /* renamed from: e */
    private final C89291a f290245e;

    /* renamed from: f */
    private final int f290246f;

    /* renamed from: g */
    private final int f290247g;

    public C104330be(C104329bd bdVar, C89291a aVar, int i, int i2) {
        this.f290241a = bdVar;
        this.f290245e = aVar;
        this.f290246f = i;
        this.f290247g = i2;
    }

    /* renamed from: d */
    private final C9278v m172451d(Context context, List list, C9140ac acVar, C7681g gVar, int i, int i2) {
        Object obj;
        C9281y yVar = (C9281y) C9141ad.f31521K.createBuilder();
        C9179bo boVar = (C9179bo) C9180bp.f31701b.createBuilder();
        boVar.copyOnWrite();
        C9180bp bpVar = (C9180bp) boVar.instance;
        C62971cq cqVar = bpVar.f31703a;
        if (!cqVar.mo58948c()) {
            bpVar.f31703a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) bpVar.f31703a);
        yVar.copyOnWrite();
        C9141ad adVar = (C9141ad) yVar.instance;
        C9180bp bpVar2 = (C9180bp) boVar.build();
        bpVar2.getClass();
        adVar.f31544j = bpVar2;
        adVar.f31535a |= 128;
        yVar.copyOnWrite();
        C9141ad adVar2 = (C9141ad) yVar.instance;
        adVar2.f31537c = acVar.f31520am;
        adVar2.f31535a |= 1;
        int i3 = gVar.f26835cv;
        yVar.copyOnWrite();
        C9141ad adVar3 = (C9141ad) yVar.instance;
        adVar3.f31535a |= 2;
        adVar3.f31538d = i3;
        C9137a aVar = (C9137a) C9164b.f31642o.createBuilder();
        aVar.copyOnWrite();
        C9164b bVar = (C9164b) aVar.instance;
        bVar.f31644a |= 1;
        bVar.f31645b = i2;
        yVar.copyOnWrite();
        C9141ad adVar4 = (C9141ad) yVar.instance;
        C9164b bVar2 = (C9164b) aVar.build();
        bVar2.getClass();
        adVar4.f31539e = bVar2;
        adVar4.f31535a |= 4;
        C9216cy cyVar = (C9216cy) C9217cz.f31853i.createBuilder();
        String string = context.getString(i);
        cyVar.copyOnWrite();
        C9217cz czVar = (C9217cz) cyVar.instance;
        string.getClass();
        czVar.f31855a |= 1;
        czVar.f31856b = string;
        C9273q qVar = (C9273q) C9278v.f32165Z.createBuilder();
        C9277u uVar = C9277u.PRIMARY_ACTION;
        qVar.copyOnWrite();
        C9278v vVar = (C9278v) qVar.instance;
        vVar.f32196c = uVar.f32164ay;
        vVar.f32192a |= 1;
        qVar.copyOnWrite();
        C9278v vVar2 = (C9278v) qVar.instance;
        C9217cz czVar2 = (C9217cz) cyVar.build();
        czVar2.getClass();
        vVar2.f32198e = czVar2;
        vVar2.f32192a |= 4;
        qVar.copyOnWrite();
        C9278v vVar3 = (C9278v) qVar.instance;
        C9141ad adVar5 = (C9141ad) yVar.build();
        adVar5.getClass();
        vVar3.f32169C = adVar5;
        vVar3.f32192a |= 67108864;
        C1970e c = this.f290241a.mo94084c();
        if (!(c == null || (obj = c.f5888a) == null)) {
            qVar.copyOnWrite();
            C9278v vVar4 = (C9278v) qVar.instance;
            vVar4.f32174H = (C7718hj) obj;
            vVar4.f32192a |= LinearLayoutManager.INVALID_OFFSET;
        }
        return (C9278v) qVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
        if (r2.f27507m != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0144  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.p489g.p494d.C9270n mo94086a(android.content.Context r13) {
        /*
            r12 = this;
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r0 = r12.f290241a
            androidx.core.i.e r0 = r0.mo94084c()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r0.f5889b
            if (r0 == 0) goto L_0x0019
            com.google.ai.b.hj[] r0 = (com.google.p375ai.p378b.C7718hj[]) r0
            int r0 = r0.length
            if (r0 != 0) goto L_0x0012
            goto L_0x0019
        L_0x0012:
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r0 = r12.f290241a
            com.google.ai.b.hj r0 = r0.mo94031b()
            goto L_0x001f
        L_0x0019:
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r0 = r12.f290241a
            com.google.ai.b.hj r0 = r0.mo94085g()
        L_0x001f:
            r1 = 1
            if (r0 == 0) goto L_0x0057
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r2 = r12.f290241a
            com.google.android.apps.g.d.v[] r0 = r2.mo94023C(r13, r0)
            if (r0 != 0) goto L_0x002b
            goto L_0x0057
        L_0x002b:
            r12.f290242b = r1
            com.google.android.apps.g.d.n r13 = com.google.android.apps.p489g.p494d.C9270n.f32072e
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.apps.g.d.m r13 = (com.google.android.apps.p489g.p494d.C9269m) r13
            java.util.List r0 = java.util.Arrays.asList(r0)
            r13.mo17460a(r0)
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r0 = r12.f290241a
            boolean r0 = r0.mo94055P()
            r13.copyOnWrite()
            com.google.protobuf.bv r2 = r13.instance
            com.google.android.apps.g.d.n r2 = (com.google.android.apps.p489g.p494d.C9270n) r2
            int r3 = r2.f32074a
            r1 = r1 | r3
            r2.f32074a = r1
            r2.f32076c = r0
            com.google.protobuf.bv r13 = r13.build()
            com.google.android.apps.g.d.n r13 = (com.google.android.apps.p489g.p494d.C9270n) r13
            return r13
        L_0x0057:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r2 = r12.f290241a
            com.google.ai.b.hj r2 = r2.mo94085g()
            if (r2 == 0) goto L_0x008b
            int r2 = r2.f26955a
            r3 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x008b
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r2 = r12.f290241a
            androidx.core.i.e r2 = r2.mo94084c()
            if (r2 == 0) goto L_0x00a1
            java.lang.Object r2 = r2.f5888a
            if (r2 != 0) goto L_0x0078
            goto L_0x00a1
        L_0x0078:
            com.google.ai.b.hj r2 = (com.google.p375ai.p378b.C7718hj) r2
            int r3 = r2.f26955a
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x00a1
            com.google.ai.b.mb r2 = r2.f26982w
            if (r2 != 0) goto L_0x0087
            com.google.ai.b.mb r2 = com.google.p375ai.p378b.C7845mb.f27493p
        L_0x0087:
            boolean r2 = r2.f27507m
            if (r2 == 0) goto L_0x00a1
        L_0x008b:
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r2 = r12.f290241a
            com.google.android.apps.g.d.v r2 = r2.mo94052M(r13)
            if (r2 == 0) goto L_0x0096
            r0.add(r2)
        L_0x0096:
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r2 = r12.f290241a
            com.google.android.apps.g.d.v r2 = r2.mo94053N(r13)
            if (r2 == 0) goto L_0x00a1
            r0.add(r2)
        L_0x00a1:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r3 = r12.f290241a
            com.google.ai.b.hj[] r3 = r3.mo94056Q()
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x00af:
            if (r6 >= r4) goto L_0x0140
            r7 = r3[r6]
            boolean r8 = r7.f26946R
            if (r8 == 0) goto L_0x00b9
            goto L_0x013c
        L_0x00b9:
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r8 = r12.f290241a
            com.google.android.apps.g.d.v r8 = r8.mo94013x(r13, r7)
            if (r8 == 0) goto L_0x013c
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.android.apps.g.d.q r8 = (com.google.android.apps.p489g.p494d.C9273q) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.g.d.v r9 = (com.google.android.apps.p489g.p494d.C9278v) r9
            r7.getClass()
            r9.f32174H = r7
            int r10 = r9.f32192a
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r11
            r9.f32192a = r10
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.g.d.v r9 = (com.google.android.apps.p489g.p494d.C9278v) r9
            int r10 = r9.f32195b
            r10 = r10 | r1
            r9.f32195b = r10
            r9.f32175I = r1
            r9 = r10 & 2
            if (r9 == 0) goto L_0x00ed
            goto L_0x0109
        L_0x00ed:
            com.google.ai.b.g r9 = com.google.p375ai.p378b.C7681g.DISMISS
            com.google.ai.b.g[] r10 = new com.google.p375ai.p378b.C7681g[r5]
            com.google.ai.b.h r9 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150937c(r7, r9, r10)
            if (r9 == 0) goto L_0x00f9
            r9 = 1
            goto L_0x00fa
        L_0x00f9:
            r9 = 0
        L_0x00fa:
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.apps.g.d.v r10 = (com.google.android.apps.p489g.p494d.C9278v) r10
            int r11 = r10.f32195b
            r11 = r11 | 2
            r10.f32195b = r11
            r10.f32176J = r9
        L_0x0109:
            int r9 = r7.f26961b
            r9 = r9 & 64
            if (r9 == 0) goto L_0x0133
            com.google.android.apps.gsa.shared.au.b.a r9 = r12.f290245e
            com.google.ai.b.xj r7 = r7.f26943O
            if (r7 != 0) goto L_0x0117
            com.google.ai.b.xj r7 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x0117:
            java.lang.String r7 = r9.mo83231a(r13, r7)
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x0133
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.g.d.v r9 = (com.google.android.apps.p489g.p494d.C9278v) r9
            r7.getClass()
            int r10 = r9.f32195b
            r10 = r10 | 32
            r9.f32195b = r10
            r9.f32180N = r7
        L_0x0133:
            com.google.protobuf.bv r7 = r8.build()
            com.google.android.apps.g.d.v r7 = (com.google.android.apps.p489g.p494d.C9278v) r7
            r2.add(r7)
        L_0x013c:
            int r6 = r6 + 1
            goto L_0x00af
        L_0x0140:
            int r3 = r12.f290247g
            if (r3 <= r1) goto L_0x026f
            r3 = 0
        L_0x0145:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x0196
            java.lang.Object r4 = r2.get(r3)
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            com.google.protobuf.bn r6 = r4.toBuilder()
            com.google.android.apps.g.d.q r6 = (com.google.android.apps.p489g.p494d.C9273q) r6
            com.google.android.apps.g.d.bx r4 = r4.f32210q
            if (r4 != 0) goto L_0x015d
            com.google.android.apps.g.d.bx r4 = com.google.android.apps.p489g.p494d.C9188bx.f31714x
        L_0x015d:
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.android.apps.g.d.bs r4 = (com.google.android.apps.p489g.p494d.C9183bs) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.android.apps.g.d.bx r7 = (com.google.android.apps.p489g.p494d.C9188bx) r7
            int r8 = r7.f31716a
            r8 = r8 | 1024(0x400, float:1.435E-42)
            r7.f31716a = r8
            r7.f31730o = r1
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.g.d.v r7 = (com.google.android.apps.p489g.p494d.C9278v) r7
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.apps.g.d.bx r4 = (com.google.android.apps.p489g.p494d.C9188bx) r4
            r4.getClass()
            r7.f32210q = r4
            int r4 = r7.f32192a
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            r7.f32192a = r4
            com.google.protobuf.bv r4 = r6.build()
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            r2.set(r3, r4)
            int r3 = r3 + 1
            goto L_0x0145
        L_0x0196:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
        L_0x019c:
            int r6 = r2.size()
            if (r4 >= r6) goto L_0x026e
            com.google.android.apps.g.d.av r6 = com.google.android.apps.p489g.p494d.C9159av.f31613g
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.g.d.au r6 = (com.google.android.apps.p489g.p494d.C9158au) r6
            int r7 = r12.f290247g
            int r7 = r7 + r4
            int r8 = r2.size()
            int r7 = java.lang.Math.min(r7, r8)
            java.util.List r7 = r2.subList(r4, r7)
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.g.d.av r8 = (com.google.android.apps.p489g.p494d.C9159av) r8
            com.google.protobuf.cq r9 = r8.f31616b
            boolean r10 = r9.mo58948c()
            if (r10 != 0) goto L_0x01ce
            com.google.protobuf.cq r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r9)
            r8.f31616b = r9
        L_0x01ce:
            com.google.protobuf.cq r8 = r8.f31616b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r7, (java.util.List) r8)
            int r7 = r12.f290247g
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.g.d.av r8 = (com.google.android.apps.p489g.p494d.C9159av) r8
            int r9 = r8.f31615a
            r9 = r9 | r1
            r8.f31615a = r9
            r8.f31617c = r7
            int r7 = r12.f290243c
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.g.d.av r8 = (com.google.android.apps.p489g.p494d.C9159av) r8
            int r9 = r8.f31615a
            r9 = r9 | 2
            r8.f31615a = r9
            r8.f31618d = r7
            if (r4 != 0) goto L_0x0206
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.g.d.av r4 = (com.google.android.apps.p489g.p494d.C9159av) r4
            int r7 = r4.f31615a
            r7 = r7 | 4
            r4.f31615a = r7
            r4.f31619e = r1
            r4 = 0
        L_0x0206:
            int r7 = r12.f290247g
            int r7 = r7 + r4
            int r8 = r2.size()
            if (r7 < r8) goto L_0x021e
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.g.d.av r7 = (com.google.android.apps.p489g.p494d.C9159av) r7
            int r8 = r7.f31615a
            r8 = r8 | 8
            r7.f31615a = r8
            r7.f31620f = r1
        L_0x021e:
            com.google.android.apps.g.d.v r7 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.g.d.q r7 = (com.google.android.apps.p489g.p494d.C9273q) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.apps.g.d.v r8 = (com.google.android.apps.p489g.p494d.C9278v) r8
            int r9 = r8.f32195b
            r9 = r9 | 64
            r8.f32195b = r9
            r8.f32181O = r1
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.apps.g.d.v r8 = (com.google.android.apps.p489g.p494d.C9278v) r8
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.apps.g.d.av r6 = (com.google.android.apps.p489g.p494d.C9159av) r6
            r6.getClass()
            r8.f32217x = r6
            int r6 = r8.f32192a
            r9 = 2097152(0x200000, float:2.938736E-39)
            r6 = r6 | r9
            r8.f32192a = r6
            com.google.android.apps.g.d.u r6 = com.google.android.apps.p489g.p494d.C9277u.GRID_LIST
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.apps.g.d.v r8 = (com.google.android.apps.p489g.p494d.C9278v) r8
            int r6 = r6.f32164ay
            r8.f32196c = r6
            int r6 = r8.f32192a
            r6 = r6 | r1
            r8.f32192a = r6
            com.google.protobuf.bv r6 = r7.build()
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            r3.add(r6)
            int r6 = r12.f290247g
            int r4 = r4 + r6
            goto L_0x019c
        L_0x026e:
            r2 = r3
        L_0x026f:
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r3 = r12.f290241a
            java.util.List r3 = r3.mo94054O(r13)
            r2.addAll(r3)
            int r4 = r2.size()
            int r3 = r3.size()
            int r4 = r4 - r3
            int r3 = r12.f290246f
            int r6 = r3 + 1
            r7 = -1
            if (r3 == r7) goto L_0x02cf
            if (r4 <= r6) goto L_0x02cf
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r12.f290246f
        L_0x0291:
            int r6 = r2.size()
            if (r4 >= r6) goto L_0x02a3
            java.lang.Object r6 = r2.get(r4)
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            r3.add(r6)
            int r4 = r4 + 1
            goto L_0x0291
        L_0x02a3:
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r4 = r12.f290241a
            boolean r4 = r4.mo94083I()
            if (r4 == 0) goto L_0x02ba
            r0.addAll(r2)
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r2 = r12.f290241a
            com.google.android.apps.g.d.v r13 = r2.mo94051L(r13, r3)
            if (r13 == 0) goto L_0x02d2
            r0.add(r13)
            goto L_0x02d2
        L_0x02ba:
            int r4 = r12.f290246f
            java.util.List r2 = r2.subList(r5, r4)
            r0.addAll(r2)
            com.google.android.apps.gsa.staticplugins.nowcards.base.bd r2 = r12.f290241a
            com.google.android.apps.g.d.v r13 = r2.mo94011v(r13, r3)
            if (r13 == 0) goto L_0x02d2
            r0.add(r13)
            goto L_0x02d2
        L_0x02cf:
            r0.addAll(r2)
        L_0x02d2:
            com.google.android.apps.g.d.n r13 = com.google.android.apps.p489g.p494d.C9270n.f32072e
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.apps.g.d.m r13 = (com.google.android.apps.p489g.p494d.C9269m) r13
            r13.mo17460a(r0)
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.android.apps.g.d.n r0 = (com.google.android.apps.p489g.p494d.C9270n) r0
            int r2 = r0.f32074a
            r2 = r2 | r1
            r0.f32074a = r2
            r0.f32076c = r1
            com.google.protobuf.bv r13 = r13.build()
            com.google.android.apps.g.d.n r13 = (com.google.android.apps.p489g.p494d.C9270n) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.base.C104330be.mo94086a(android.content.Context):com.google.android.apps.g.d.n");
    }

    /* renamed from: b */
    public final C9278v mo94087b(Context context, List list) {
        return m172451d(context, list, C9140ac.COLLAPSE_LIST, C7681g.LIST_CARD_SHOW_LESS, R.string.show_less, R.drawable.quantum_ic_expand_less_black_24);
    }

    /* renamed from: c */
    public final C9278v mo94088c(Context context, List list) {
        return m172451d(context, list, C9140ac.EXPAND_LIST, C7681g.LIST_CARD_SHOW_MORE, R.string.show_more, R.drawable.quantum_ic_expand_more_white_24);
    }
}
