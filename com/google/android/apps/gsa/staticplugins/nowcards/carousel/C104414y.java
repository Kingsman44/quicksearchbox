package com.google.android.apps.gsa.staticplugins.nowcards.carousel;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.cards.C91704s;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104308aj;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105048f;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.apps.p489g.p494d.C9279w;
import com.google.android.apps.p489g.p494d.C9280x;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7650ew;
import com.google.p375ai.p378b.C7693gl;
import com.google.p375ai.p378b.C7694gm;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7998rt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.carousel.y */
/* compiled from: PG */
public final class C104414y extends C104389ab {

    /* renamed from: l */
    private static final C59071e f290548l = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.carousel.y");

    /* renamed from: m */
    private final C104308aj f290549m;

    public C104414y(C7718hj hjVar, C7718hj[] hjVarArr, CardRenderingContext cardRenderingContext, C105048f fVar, C89291a aVar, C91704s sVar, C104308aj ajVar) {
        super(hjVar, hjVarArr, cardRenderingContext, fVar, aVar, sVar, ajVar);
        this.f290549m = ajVar;
    }

    /* renamed from: T */
    private final C9278v m172633T(Context context, List list, C7998rt rtVar, boolean z) {
        if (list.isEmpty()) {
            return null;
        }
        if (rtVar != null && rtVar.f28108t && !z) {
            return null;
        }
        List U = m172634U(context, list, 3);
        C9279w wVar = (C9279w) C9280x.f32220d.createBuilder();
        wVar.mo17466a(U);
        if (rtVar != null) {
            wVar.copyOnWrite();
            C9280x xVar = (C9280x) wVar.instance;
            xVar.f32224c = rtVar;
            xVar.f32222a |= 1;
        }
        C9273q qVar = (C9273q) C9278v.f32165Z.createBuilder();
        qVar.copyOnWrite();
        C9278v vVar = (C9278v) qVar.instance;
        C9280x xVar2 = (C9280x) wVar.build();
        xVar2.getClass();
        vVar.f32211r = xVar2;
        vVar.f32192a |= 32768;
        C9277u uVar = C9277u.METADATA_CARD_SMALL_CAROUSEL;
        qVar.copyOnWrite();
        C9278v vVar2 = (C9278v) qVar.instance;
        vVar2.f32196c = uVar.f32164ay;
        vVar2.f32192a |= 1;
        C7718hj hjVar = this.f290132c;
        qVar.copyOnWrite();
        C9278v vVar3 = (C9278v) qVar.instance;
        hjVar.getClass();
        vVar3.f32174H = hjVar;
        vVar3.f32192a |= LinearLayoutManager.INVALID_OFFSET;
        qVar.copyOnWrite();
        C9278v vVar4 = (C9278v) qVar.instance;
        vVar4.f32195b |= 1;
        vVar4.f32175I = false;
        return (C9278v) qVar.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.google.android.apps.gsa.staticplugins.nowcards.base.ai} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m172634U(android.content.Context r11, java.util.List r12, int r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0009:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x01c9
            java.lang.Object r1 = r12.next()
            com.google.ai.b.hj r1 = (com.google.p375ai.p378b.C7718hj) r1
            com.google.ai.b.lr r2 = m172341K(r1)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x00ca
            int r5 = r1.f26955a
            r5 = r5 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0025
            goto L_0x00ca
        L_0x0025:
            com.google.protobuf.cq r5 = r2.f27469a
            int r5 = r5.size()
            if (r3 >= r5) goto L_0x0009
            com.google.protobuf.cq r5 = r2.f27469a
            java.lang.Object r5 = r5.get(r3)
            com.google.ai.b.rp r5 = (com.google.p375ai.p378b.C7994rp) r5
            com.google.android.apps.g.d.v r5 = r10.mo94395R(r11, r1, r5, r13)
            if (r5 != 0) goto L_0x003d
            goto L_0x00c6
        L_0x003d:
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.android.apps.g.d.q r5 = (com.google.android.apps.p489g.p494d.C9273q) r5
            com.google.protobuf.cq r6 = r2.f27469a
            int r6 = r6.size()
            m172635V(r5, r1, r3, r6)
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            int r7 = r6.f32192a
            r7 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x00af
            int r6 = r6.f32196c
            com.google.android.apps.g.d.u r6 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r6)
            if (r6 != 0) goto L_0x0060
            com.google.android.apps.g.d.u r6 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0060:
            com.google.android.apps.g.d.u r7 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TEXTONLY
            if (r6 == r7) goto L_0x00af
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            int r6 = r6.f32196c
            com.google.android.apps.g.d.u r6 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r6)
            if (r6 != 0) goto L_0x0072
            com.google.android.apps.g.d.u r6 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0072:
            boolean r6 = com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104411v.m172629a(r6)
            if (r6 == 0) goto L_0x00af
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            com.google.android.apps.g.d.bx r6 = r6.f32210q
            if (r6 != 0) goto L_0x0082
            com.google.android.apps.g.d.bx r6 = com.google.android.apps.p489g.p494d.C9188bx.f31714x
        L_0x0082:
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.android.apps.g.d.bs r6 = (com.google.android.apps.p489g.p494d.C9183bs) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.g.d.bx r7 = (com.google.android.apps.p489g.p494d.C9188bx) r7
            int r8 = r7.f31716a
            r8 = r8 | 1024(0x400, float:1.435E-42)
            r7.f31716a = r8
            r7.f31730o = r4
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.g.d.v r7 = (com.google.android.apps.p489g.p494d.C9278v) r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.apps.g.d.bx r6 = (com.google.android.apps.p489g.p494d.C9188bx) r6
            r6.getClass()
            r7.f32210q = r6
            int r6 = r7.f32192a
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            r7.f32192a = r6
        L_0x00af:
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            int r7 = r6.f32195b
            r7 = r7 | r4
            r6.f32195b = r7
            r6.f32175I = r4
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.apps.g.d.v r5 = (com.google.android.apps.p489g.p494d.C9278v) r5
            r0.add(r5)
        L_0x00c6:
            int r3 = r3 + 1
            goto L_0x0025
        L_0x00ca:
            com.google.android.apps.gsa.sidekick.shared.cards.s r2 = r10.f292337k
            if (r2 != 0) goto L_0x00e3
            com.google.common.f.e r2 = f290548l
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r5 = "No Adapter Factory.  This implies that an adapter delegated to ModulesEntryAdapter which is not allowed to delegate a second time."
            r6 = 21975(0x55d7, float:3.0794E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56386p(r5)
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x0190
        L_0x00e3:
            int r5 = r1.f26955a
            r5 = r5 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x00f3
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r2 = r10.f290131b
            com.google.android.apps.gsa.staticplugins.nowcards.base.aj r5 = r10.f290549m
            com.google.android.apps.gsa.staticplugins.nowcards.f.g r6 = new com.google.android.apps.gsa.staticplugins.nowcards.f.g
            r6.<init>(r1, r2, r5)
            goto L_0x00fc
        L_0x00f3:
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r5 = r10.f290131b
            java.lang.Object r2 = r2.mo85588l(r1, r5)
            r6 = r2
            com.google.android.apps.gsa.staticplugins.nowcards.base.ai r6 = (com.google.android.apps.gsa.staticplugins.nowcards.base.C104307ai) r6
        L_0x00fc:
            if (r6 != 0) goto L_0x0126
            com.google.common.f.e r2 = f290548l
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r5 = 21974(0x55d6, float:3.0792E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r5)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            int r5 = r1.f26966g
            com.google.ai.b.ik r5 = com.google.p375ai.p378b.C7746ik.m22834a(r5)
            if (r5 != 0) goto L_0x0118
            com.google.ai.b.ik r5 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x0118:
            java.lang.String r6 = "No Adapter was created by the factory for type %d. This could mean that the server sent an entry type that can't be delegated."
            int r5 = r5.f27108J
            r2.mo56387q(r6, r5)
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x0190
        L_0x0126:
            com.google.android.apps.g.d.n r2 = r6.mo94024a(r11)
            if (r2 == 0) goto L_0x0138
            com.google.protobuf.cq r5 = r2.f32075b
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0135
            goto L_0x0138
        L_0x0135:
            com.google.protobuf.cq r2 = r2.f32075b
            goto L_0x0190
        L_0x0138:
            com.google.common.f.e r2 = f290548l
            com.google.common.f.x r5 = r2.mo56226d()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            r7 = 21972(0x55d4, float:3.079E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r7)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.ai.b.hj r7 = r6.f290132c
            com.google.ai.b.fo r7 = r7.f26968i
            if (r7 != 0) goto L_0x0150
            com.google.ai.b.fo r7 = com.google.p375ai.p378b.C7669fo.f26633e
        L_0x0150:
            java.lang.String r7 = com.google.android.apps.gsa.sidekick.shared.util.C91994m.m150997d(r7)
            com.google.ai.b.hj r8 = r6.f290132c
            com.google.ai.b.qv r8 = r8.f26971l
            if (r8 != 0) goto L_0x015c
            com.google.ai.b.qv r8 = com.google.p375ai.p378b.C7973qv.f28001c
        L_0x015c:
            int r8 = r8.f28003a
            com.google.ai.b.a.b r8 = com.google.p375ai.p378b.p379a.C7512b.m22771a(r8)
            if (r8 != 0) goto L_0x0166
            com.google.ai.b.a.b r8 = com.google.p375ai.p378b.p379a.C7512b.UNKNOWN_CARD_CATEGORY
        L_0x0166:
            java.lang.String r9 = "Empty card for entry. id: %s category: %s"
            r5.mo56354G(r9, r7, r8)
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r5 = 21973(0x55d5, float:3.0791E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r5)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.ai.b.hj r5 = r6.f290132c
            int r5 = r5.f26966g
            com.google.ai.b.ik r5 = com.google.p375ai.p378b.C7746ik.m22834a(r5)
            if (r5 != 0) goto L_0x0185
            com.google.ai.b.ik r5 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x0185:
            java.lang.String r6 = "Adapter did not create card for entry type: %s"
            r2.mo56389s(r6, r5)
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x0190:
            int r5 = r2.size()
            if (r3 >= r5) goto L_0x0009
            java.lang.Object r5 = r2.get(r3)
            com.google.android.apps.g.d.v r5 = (com.google.android.apps.p489g.p494d.C9278v) r5
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.android.apps.g.d.q r5 = (com.google.android.apps.p489g.p494d.C9273q) r5
            int r6 = r2.size()
            m172635V(r5, r1, r3, r6)
            com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b.C104843d.m173800a(r5)
            com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b.C104843d.m173801b(r5, r4)
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            int r7 = r6.f32195b
            r7 = r7 | r4
            r6.f32195b = r7
            r6.f32175I = r4
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.apps.g.d.v r5 = (com.google.android.apps.p489g.p494d.C9278v) r5
            r0.add(r5)
            int r3 = r3 + 1
            goto L_0x0190
        L_0x01c9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104414y.m172634U(android.content.Context, java.util.List, int):java.util.List");
    }

    /* renamed from: V */
    private static final void m172635V(C9273q qVar, C7718hj hjVar, int i, int i2) {
        int a;
        int a2;
        boolean z = false;
        int i3 = 1;
        boolean z2 = i == 0;
        if (i == i2 - 1) {
            z = true;
        }
        C7694gm gmVar = hjVar.f26956aa;
        if (gmVar == null) {
            gmVar = C7694gm.f26861e;
        }
        if ((gmVar.f26863a & 1) != 0) {
            C7694gm gmVar2 = hjVar.f26956aa;
            int a3 = C7693gl.m22807a((gmVar2 == null ? C7694gm.f26861e : gmVar2).f26864b);
            if (!(a3 == 0 || a3 == 1)) {
                if (gmVar2 == null) {
                    gmVar2 = C7694gm.f26861e;
                }
                int i4 = gmVar2.f26864b;
                int a4 = C7693gl.m22807a(i4);
                if (a4 == 0) {
                    a4 = 1;
                }
                int i5 = hjVar.f26952X;
                int a5 = C7650ew.m22795a(i5);
                if ((a5 != 0 && a5 == 5) || (((a = C7650ew.m22795a(i5)) != 0 && a == 4) || ((a2 = C7650ew.m22795a(i5)) != 0 && a2 == 7))) {
                    int a6 = C7693gl.m22807a(i4);
                    if (a6 != 0) {
                        i3 = a6;
                    }
                    qVar.copyOnWrite();
                    C9278v vVar = (C9278v) qVar.instance;
                    C9278v vVar2 = C9278v.f32165Z;
                    vVar.f32184R = i3 - 1;
                    vVar.f32195b |= 512;
                    return;
                } else if (a4 == 5) {
                    qVar.copyOnWrite();
                    C9278v vVar3 = (C9278v) qVar.instance;
                    C9278v vVar4 = C9278v.f32165Z;
                    vVar3.f32186T = 1;
                    vVar3.f32195b |= 2048;
                    qVar.copyOnWrite();
                    C9278v vVar5 = (C9278v) qVar.instance;
                    vVar5.f32185S = 2;
                    vVar5.f32195b |= 1024;
                    return;
                } else if (z2 && z && a4 == 6) {
                    qVar.copyOnWrite();
                    C9278v vVar6 = (C9278v) qVar.instance;
                    C9278v vVar7 = C9278v.f32165Z;
                    vVar6.f32184R = 5;
                    vVar6.f32195b |= 512;
                    return;
                } else if (z2 && (a4 == 2 || a4 == 6)) {
                    qVar.copyOnWrite();
                    C9278v vVar8 = (C9278v) qVar.instance;
                    C9278v vVar9 = C9278v.f32165Z;
                    vVar8.f32184R = 1;
                    vVar8.f32195b |= 512;
                    return;
                } else if (!z || !(a4 == 4 || a4 == 6)) {
                    qVar.copyOnWrite();
                    C9278v vVar10 = (C9278v) qVar.instance;
                    C9278v vVar11 = C9278v.f32165Z;
                    vVar10.f32184R = 2;
                    vVar10.f32195b |= 512;
                    return;
                } else {
                    qVar.copyOnWrite();
                    C9278v vVar12 = (C9278v) qVar.instance;
                    C9278v vVar13 = C9278v.f32165Z;
                    vVar12.f32184R = 3;
                    vVar12.f32195b |= 512;
                    return;
                }
            }
        }
        ((C59052c) ((C59052c) f290548l.mo56226d()).mo56372aa(21976)).mo56386p("Server did not send DisplayProperties");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.p489g.p494d.C9270n mo94024a(android.content.Context r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.core.i.e r2 = r18.mo86081c()
            r3 = 0
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            boolean r4 = r0.f290135f
            java.lang.Object r5 = r2.f5888a
            if (r5 == 0) goto L_0x0031
            com.google.ai.b.hj r5 = (com.google.p375ai.p378b.C7718hj) r5
            com.google.ai.b.ja r5 = r5.f26951W
            if (r5 != 0) goto L_0x001a
            com.google.ai.b.ja r5 = com.google.p375ai.p378b.C7763ja.f27187g
        L_0x001a:
            if (r5 == 0) goto L_0x002f
            com.google.ai.b.rt r6 = r5.f27191c
            if (r6 != 0) goto L_0x0022
            com.google.ai.b.rt r6 = com.google.p375ai.p378b.C7998rt.f28087v
        L_0x0022:
            com.google.ai.b.rt r7 = r5.f27190b
            if (r7 != 0) goto L_0x0028
            com.google.ai.b.rt r7 = com.google.p375ai.p378b.C7998rt.f28087v
        L_0x0028:
            com.google.ai.b.rt r8 = r5.f27192d
            if (r8 != 0) goto L_0x0035
            com.google.ai.b.rt r8 = com.google.p375ai.p378b.C7998rt.f28087v
            goto L_0x0035
        L_0x002f:
            r6 = r3
            goto L_0x0033
        L_0x0031:
            r5 = r3
            r6 = r5
        L_0x0033:
            r7 = r6
            r8 = r7
        L_0x0035:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.Object r2 = r2.f5889b
            if (r2 == 0) goto L_0x0099
            com.google.ai.b.hj[] r2 = (com.google.p375ai.p378b.C7718hj[]) r2
            int r15 = r2.length
            r16 = 0
            r3 = 0
        L_0x005d:
            if (r3 >= r15) goto L_0x0099
            r16 = r15
            r15 = r2[r3]
            r17 = r2
            boolean r2 = r15.f26953Y
            if (r2 == 0) goto L_0x006c
            if (r4 != 0) goto L_0x006c
            goto L_0x0092
        L_0x006c:
            int r2 = r15.f26952X
            int r2 = com.google.p375ai.p378b.C7650ew.m22795a(r2)
            if (r2 != 0) goto L_0x0075
            r2 = 1
        L_0x0075:
            int r2 = r2 + -1
            switch(r2) {
                case 1: goto L_0x008f;
                case 2: goto L_0x008b;
                case 3: goto L_0x0087;
                case 4: goto L_0x0083;
                case 5: goto L_0x007f;
                case 6: goto L_0x007b;
                case 7: goto L_0x008b;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x0092
        L_0x007b:
            r13.add(r15)
            goto L_0x0092
        L_0x007f:
            r14.add(r15)
            goto L_0x0092
        L_0x0083:
            r10.add(r15)
            goto L_0x0092
        L_0x0087:
            r12.add(r15)
            goto L_0x0092
        L_0x008b:
            r11.add(r15)
            goto L_0x0092
        L_0x008f:
            r9.add(r15)
        L_0x0092:
            int r3 = r3 + 1
            r15 = r16
            r2 = r17
            goto L_0x005d
        L_0x0099:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f290474j = r2
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L_0x00b0
            java.util.List r2 = r0.f290474j
            r3 = 2
            java.util.List r3 = r0.m172634U(r1, r9, r3)
            r2.addAll(r3)
        L_0x00b0:
            com.google.android.apps.g.d.v r2 = r0.m172633T(r1, r12, r7, r4)
            if (r2 == 0) goto L_0x00bb
            java.util.List r3 = r0.f290474j
            r3.add(r2)
        L_0x00bb:
            com.google.android.apps.g.d.v r2 = r0.m172633T(r1, r13, r8, r4)
            if (r2 == 0) goto L_0x00c6
            java.util.List r3 = r0.f290474j
            r3.add(r2)
        L_0x00c6:
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto L_0x00d6
            java.util.List r2 = r0.f290474j
            r3 = 3
            java.util.List r3 = r0.m172634U(r1, r11, r3)
            r2.addAll(r3)
        L_0x00d6:
            com.google.android.apps.g.d.v r2 = r0.m172633T(r1, r10, r6, r4)
            if (r2 == 0) goto L_0x00e1
            java.util.List r3 = r0.f290474j
            r3.add(r2)
        L_0x00e1:
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto L_0x00f1
            java.util.List r2 = r0.f290474j
            r3 = 4
            java.util.List r1 = r0.m172634U(r1, r14, r3)
            r2.addAll(r1)
        L_0x00f1:
            java.util.List r1 = r0.f290474j
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00fb
            r1 = 0
            return r1
        L_0x00fb:
            com.google.android.apps.g.d.n r1 = com.google.android.apps.p489g.p494d.C9270n.f32072e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.g.d.m r1 = (com.google.android.apps.p489g.p494d.C9269m) r1
            java.util.List r2 = r0.f290474j
            r1.mo17460a(r2)
            if (r5 == 0) goto L_0x011b
            boolean r2 = r5.f27193e
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.g.d.n r3 = (com.google.android.apps.p489g.p494d.C9270n) r3
            int r4 = r3.f32074a
            r5 = 1
            r4 = r4 | r5
            r3.f32074a = r4
            r3.f32076c = r2
        L_0x011b:
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.g.d.n r1 = (com.google.android.apps.p489g.p494d.C9270n) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104414y.mo94024a(android.content.Context):com.google.android.apps.g.d.n");
    }

    /* renamed from: b */
    public final C7718hj mo94031b() {
        return null;
    }
}
