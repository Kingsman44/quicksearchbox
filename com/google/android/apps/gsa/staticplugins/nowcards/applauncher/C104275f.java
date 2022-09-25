package com.google.android.apps.gsa.staticplugins.nowcards.applauncher;

import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.cards.C91704s;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104308aj;
import com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104913ak;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105048f;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7718hj;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.applauncher.f */
/* compiled from: PG */
public final class C104275f extends C104913ak {

    /* renamed from: j */
    private static final C59071e f290049j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.applauncher.f");

    /* renamed from: l */
    private final C68214a f290050l;

    public C104275f(C7718hj hjVar, C7718hj[] hjVarArr, CardRenderingContext cardRenderingContext, C105048f fVar, C89291a aVar, C91704s sVar, C104308aj ajVar, C68214a aVar2) {
        super(hjVar, hjVarArr, cardRenderingContext, aVar, fVar, sVar, ajVar);
        this.f290050l = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
        if (r7.contains(r0) != false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
        if (r3.f256460d.getLaunchIntentForPackage(r0) != null) goto L_0x00b2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.p489g.p494d.C9270n mo94024a(android.content.Context r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            androidx.core.i.e r0 = r18.mo86081c()
            r3 = 0
            if (r0 != 0) goto L_0x000c
            return r3
        L_0x000c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Object r5 = r0.f5888a
            r6 = -1
            r7 = 1
            if (r5 == 0) goto L_0x0043
            com.google.ai.b.hj r5 = (com.google.p375ai.p378b.C7718hj) r5
            com.google.ai.b.mb r5 = r5.f26982w
            if (r5 != 0) goto L_0x001f
            com.google.ai.b.mb r5 = com.google.p375ai.p378b.C7845mb.f27493p
        L_0x001f:
            int r8 = r5.f27495a
            r8 = r8 & r7
            if (r8 == 0) goto L_0x0026
            int r6 = r5.f27498d
        L_0x0026:
            com.google.protobuf.cq r5 = r5.f27496b
            java.util.Iterator r5 = r5.iterator()
        L_0x002c:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0043
            java.lang.Object r8 = r5.next()
            com.google.ai.b.rp r8 = (com.google.p375ai.p378b.C7994rp) r8
            com.google.ai.b.hj r9 = r1.f290132c
            r10 = 2
            com.google.android.apps.g.d.v r8 = r1.mo94395R(r2, r9, r8, r10)
            m172340G(r4, r8)
            goto L_0x002c
        L_0x0043:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r0 = r0.f5889b
            if (r0 == 0) goto L_0x0196
            r10 = r0
            com.google.ai.b.hj[] r10 = (com.google.p375ai.p378b.C7718hj[]) r10
            int r11 = r10.length
            r12 = 0
        L_0x0056:
            if (r12 >= r11) goto L_0x0196
            r13 = r10[r12]
            int r0 = r13.f26955a
            r14 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0166
            com.google.ai.b.lr r0 = r13.f26981v
            if (r0 != 0) goto L_0x0067
            com.google.ai.b.lr r0 = com.google.p375ai.p378b.C7834lr.f27467c
        L_0x0067:
            com.google.protobuf.cq r0 = r0.f27469a
            java.util.Iterator r15 = r0.iterator()
        L_0x006d:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x018e
            java.lang.Object r0 = r15.next()
            com.google.ai.b.rp r0 = (com.google.p375ai.p378b.C7994rp) r0
            r9 = 3
            com.google.android.apps.g.d.v r9 = r1.mo94395R(r2, r13, r0, r9)
            if (r9 == 0) goto L_0x015e
            int r0 = r9.f32192a
            r16 = r0 & r14
            if (r16 == 0) goto L_0x0105
            com.google.android.apps.g.d.h r0 = r9.f32213t
            if (r0 != 0) goto L_0x008c
            com.google.android.apps.g.d.h r0 = com.google.android.apps.p489g.p494d.C9264h.f32054e
        L_0x008c:
            r14 = r0
            java.lang.String r0 = r14.f32057b
            boolean r17 = android.text.TextUtils.isEmpty(r0)
            if (r17 != 0) goto L_0x00ef
            if (r6 == 0) goto L_0x00ef
            dagger.a r3 = r1.f290050l
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.sidekick.shared.util.ap r3 = (com.google.android.apps.gsa.sidekick.shared.util.C91965ap) r3
            java.util.Set r7 = r3.f256461e
            if (r7 == 0) goto L_0x00aa
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x00c7
            goto L_0x00b2
        L_0x00aa:
            android.content.pm.PackageManager r3 = r3.f256460d     // Catch:{ RuntimeException -> 0x00b9 }
            android.content.Intent r0 = r3.getLaunchIntentForPackage(r0)     // Catch:{ RuntimeException -> 0x00b9 }
            if (r0 == 0) goto L_0x00c7
        L_0x00b2:
            r5.add(r9)
            int r6 = r6 + -1
            goto L_0x0160
        L_0x00b9:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.sidekick.shared.util.C91965ap.f256459c
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r7 = "Package manager crashed."
            r1 = 11943(0x2ea7, float:1.6736E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r1)).mo56386p(r7)
        L_0x00c7:
            java.lang.String r0 = r14.f32058c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x015e
            java.lang.String r0 = r14.f32059d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x015e
            com.google.android.apps.g.d.ad r0 = r9.f32169C
            if (r0 != 0) goto L_0x00dd
            com.google.android.apps.g.d.ad r0 = com.google.android.apps.p489g.p494d.C9141ad.f31521K
        L_0x00dd:
            com.google.android.apps.g.d.cd r0 = r0.f31541g
            if (r0 != 0) goto L_0x00e3
            com.google.android.apps.g.d.cd r0 = com.google.android.apps.p489g.p494d.C9195cd.f31746j
        L_0x00e3:
            java.lang.String r0 = r0.f31752e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x015e
            r5.add(r9)
            goto L_0x0102
        L_0x00ef:
            java.lang.String r0 = r14.f32058c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x015e
            java.lang.String r0 = r14.f32059d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x015e
            r5.add(r9)
        L_0x0102:
            int r6 = r6 + -1
            goto L_0x015e
        L_0x0105:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x015b
            int r0 = r9.f32196c
            com.google.android.apps.g.d.u r0 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r0)
            if (r0 != 0) goto L_0x0113
            com.google.android.apps.g.d.u r0 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0113:
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TEXTONLY
            if (r0 == r1) goto L_0x015b
            com.google.android.apps.g.d.bx r0 = r9.f32210q
            if (r0 != 0) goto L_0x011d
            com.google.android.apps.g.d.bx r0 = com.google.android.apps.p489g.p494d.C9188bx.f31714x
        L_0x011d:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.apps.g.d.bs r0 = (com.google.android.apps.p489g.p494d.C9183bs) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.g.d.bx r1 = (com.google.android.apps.p489g.p494d.C9188bx) r1
            int r3 = r1.f31716a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r1.f31716a = r3
            r3 = 1
            r1.f31730o = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.g.d.bx r0 = (com.google.android.apps.p489g.p494d.C9188bx) r0
            com.google.protobuf.bn r1 = r9.toBuilder()
            com.google.android.apps.g.d.q r1 = (com.google.android.apps.p489g.p494d.C9273q) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            r0.getClass()
            r3.f32210q = r0
            int r0 = r3.f32192a
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r3.f32192a = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.android.apps.g.d.v r0 = (com.google.android.apps.p489g.p494d.C9278v) r0
            r8.add(r0)
            goto L_0x015e
        L_0x015b:
            r8.add(r9)
        L_0x015e:
            r1 = r18
        L_0x0160:
            r3 = 0
            r7 = 1
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x006d
        L_0x0166:
            com.google.common.f.e r0 = f290049j
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "ModulesAppLaunchEntryAd"
            r0.mo56378ag(r1, r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 21929(0x55a9, float:3.0729E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            int r1 = r13.f26966g
            com.google.ai.b.ik r1 = com.google.p375ai.p378b.C7746ik.m22834a(r1)
            if (r1 != 0) goto L_0x0187
            com.google.ai.b.ik r1 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x0187:
            java.lang.String r3 = "Didn't find a ModuleEntry for app launch item, type:%d"
            int r1 = r1.f27108J
            r0.mo56387q(r3, r1)
        L_0x018e:
            int r12 = r12 + 1
            r1 = r18
            r3 = 0
            r7 = 1
            goto L_0x0056
        L_0x0196:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x01ab
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x01ab
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x01a9
            goto L_0x01ab
        L_0x01a9:
            r1 = 0
            return r1
        L_0x01ab:
            com.google.android.apps.g.d.n r0 = com.google.android.apps.p489g.p494d.C9270n.f32072e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.g.d.m r0 = (com.google.android.apps.p489g.p494d.C9269m) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.g.d.n r1 = (com.google.android.apps.p489g.p494d.C9270n) r1
            int r3 = r1.f32074a
            r6 = 1
            r3 = r3 | r6
            r1.f32074a = r3
            r1.f32076c = r6
            r0.mo17460a(r4)
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x020f
            com.google.android.apps.g.d.v r1 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.g.d.q r1 = (com.google.android.apps.p489g.p494d.C9273q) r1
            com.google.android.apps.g.d.x r3 = com.google.android.apps.p489g.p494d.C9280x.f32220d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.g.d.w r3 = (com.google.android.apps.p489g.p494d.C9279w) r3
            r3.mo17466a(r8)
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.g.d.x r3 = (com.google.android.apps.p489g.p494d.C9280x) r3
            r3.getClass()
            r4.f32211r = r3
            int r3 = r4.f32192a
            r6 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r6
            r4.f32192a = r3
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            int r3 = r3.f32164ay
            r4.f32196c = r3
            int r3 = r4.f32192a
            r6 = 1
            r3 = r3 | r6
            r4.f32192a = r3
            r0.mo17461b(r1)
            goto L_0x0210
        L_0x020f:
            r6 = 1
        L_0x0210:
            int r1 = r5.size()
            if (r1 != r6) goto L_0x02be
            r1 = 0
            java.lang.Object r3 = r5.get(r1)
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            com.google.android.apps.g.d.h r1 = r3.f32213t
            if (r1 != 0) goto L_0x0223
            com.google.android.apps.g.d.h r1 = com.google.android.apps.p489g.p494d.C9264h.f32054e
        L_0x0223:
            java.lang.String r3 = "com.google.android.googlequicksearchbox"
            java.lang.String r1 = r1.f32057b
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x02be
            com.google.android.apps.g.d.v r1 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.g.d.q r1 = (com.google.android.apps.p489g.p494d.C9273q) r1
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.PRIMARY_ACTION
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            int r3 = r3.f32164ay
            r4.f32196c = r3
            int r3 = r4.f32192a
            r6 = 1
            r3 = r3 | r6
            r4.f32192a = r3
            com.google.android.apps.g.d.cz r3 = com.google.android.apps.p489g.p494d.C9217cz.f31853i
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.g.d.cy r3 = (com.google.android.apps.p489g.p494d.C9216cy) r3
            r4 = 2132092214(0x7f152536, float:1.9824818E38)
            java.lang.String r4 = r2.getString(r4)
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.g.d.cz r6 = (com.google.android.apps.p489g.p494d.C9217cz) r6
            r4.getClass()
            int r7 = r6.f31855a
            r8 = 1
            r7 = r7 | r8
            r6.f31855a = r7
            r6.f31856b = r4
            r4 = 2132082821(0x7f150085, float:1.9805767E38)
            java.lang.String r2 = r2.getString(r4)
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.g.d.cz r4 = (com.google.android.apps.p489g.p494d.C9217cz) r4
            r2.getClass()
            int r6 = r4.f31855a
            r6 = r6 | 16
            r4.f31855a = r6
            r4.f31861g = r2
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.g.d.cz r3 = (com.google.android.apps.p489g.p494d.C9217cz) r3
            r3.getClass()
            r2.f32198e = r3
            int r3 = r2.f32192a
            r3 = r3 | 4
            r2.f32192a = r3
            r2 = 0
            java.lang.Object r2 = r5.get(r2)
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            com.google.android.apps.g.d.ad r2 = r2.f32169C
            if (r2 != 0) goto L_0x02a7
            com.google.android.apps.g.d.ad r2 = com.google.android.apps.p489g.p494d.C9141ad.f31521K
        L_0x02a7:
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            r2.getClass()
            r3.f32169C = r2
            int r2 = r3.f32192a
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 | r4
            r3.f32192a = r2
            r0.mo17461b(r1)
            goto L_0x0300
        L_0x02be:
            com.google.android.apps.g.d.v r1 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.g.d.q r1 = (com.google.android.apps.p489g.p494d.C9273q) r1
            com.google.android.apps.g.d.x r2 = com.google.android.apps.p489g.p494d.C9280x.f32220d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.g.d.w r2 = (com.google.android.apps.p489g.p494d.C9279w) r2
            r2.mo17466a(r5)
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.g.d.x r2 = (com.google.android.apps.p489g.p494d.C9280x) r2
            r2.getClass()
            r3.f32212s = r2
            int r2 = r3.f32192a
            r4 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r4
            r3.f32192a = r2
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.APP_LAUNCHER_MODULE
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            int r2 = r2.f32164ay
            r3.f32196c = r2
            int r2 = r3.f32192a
            r4 = 1
            r2 = r2 | r4
            r3.f32192a = r2
            r0.mo17461b(r1)
        L_0x0300:
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.g.d.n r0 = (com.google.android.apps.p489g.p494d.C9270n) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.applauncher.C104275f.mo94024a(android.content.Context):com.google.android.apps.g.d.n");
    }

    /* renamed from: b */
    public final C7718hj mo94031b() {
        return null;
    }
}
