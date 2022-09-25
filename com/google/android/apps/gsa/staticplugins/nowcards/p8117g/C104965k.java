package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import com.google.android.apps.gsa.staticplugins.nowcards.base.C104307ai;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104308aj;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.k */
/* compiled from: PG */
public final class C104965k extends C104307ai {
    public C104965k(C7718hj hjVar, CardRenderingContext cardRenderingContext, C104308aj ajVar) {
        super(hjVar, cardRenderingContext, ajVar);
    }

    /* JADX WARNING: type inference failed for: r2v23, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02ac A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.p489g.p494d.C9270n mo94024a(android.content.Context r13) {
        /*
            r12 = this;
            com.google.ai.b.hj r13 = r12.f290132c
            com.google.ai.b.jo r0 = r13.f26977r
            if (r0 != 0) goto L_0x0008
            com.google.ai.b.jo r0 = com.google.p375ai.p378b.C7777jo.f27217m
        L_0x0008:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.apps.g.d.ar r2 = com.google.android.apps.p489g.p494d.C9155ar.f31598g
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.g.d.aq r2 = (com.google.android.apps.p489g.p494d.C9154aq) r2
            int r3 = r0.f27219a
            r3 = r3 & 2
            r4 = 1
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = r0.f27221c
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.g.d.ar r5 = (com.google.android.apps.p489g.p494d.C9155ar) r5
            r3.getClass()
            int r6 = r5.f31600a
            r6 = r6 | r4
            r5.f31600a = r6
            r5.f31601b = r3
        L_0x002f:
            int r3 = r0.f27219a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0049
            java.lang.String r3 = r0.f27222d
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.g.d.ar r5 = (com.google.android.apps.p489g.p494d.C9155ar) r5
            r3.getClass()
            int r6 = r5.f31600a
            r6 = r6 | 2
            r5.f31600a = r6
            r5.f31602c = r3
        L_0x0049:
            int r3 = r0.f27219a
            r3 = r3 & 16
            if (r3 == 0) goto L_0x0067
            int r3 = r0.f27225g
            int r3 = com.google.p375ai.p378b.C7776jn.m22840a(r3)
            if (r3 != 0) goto L_0x0058
            r3 = 1
        L_0x0058:
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.g.d.ar r5 = (com.google.android.apps.p489g.p494d.C9155ar) r5
            r5.f31603d = r3
            int r3 = r5.f31600a
            r3 = r3 | 4
            r5.f31600a = r3
        L_0x0067:
            int r3 = r0.f27219a
            r3 = r3 & 32
            if (r3 == 0) goto L_0x0085
            int r3 = r0.f27226h
            int r3 = com.google.p375ai.p378b.C7774jl.m22839a(r3)
            if (r3 != 0) goto L_0x0076
            r3 = 1
        L_0x0076:
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.g.d.ar r5 = (com.google.android.apps.p489g.p494d.C9155ar) r5
            r5.f31604e = r3
            int r3 = r5.f31600a
            r3 = r3 | 8
            r5.f31600a = r3
        L_0x0085:
            com.google.protobuf.cq r3 = r0.f27224f
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x009f
            com.google.protobuf.cq r3 = r0.f27224f
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.g.d.ar r5 = (com.google.android.apps.p489g.p494d.C9155ar) r5
            r5.mo17449a()
            com.google.protobuf.cq r5 = r5.f31605f
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r5)
            goto L_0x0104
        L_0x009f:
            int r3 = r0.f27219a
            r3 = r3 & 8
            if (r3 == 0) goto L_0x0104
            com.google.ai.b.nw r3 = com.google.p375ai.p378b.C7893nw.f27731q
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.ai.b.nv r3 = (com.google.p375ai.p378b.C7892nv) r3
            java.lang.String r5 = r0.f27223e
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.ai.b.nw r6 = (com.google.p375ai.p378b.C7893nw) r6
            r5.getClass()
            int r7 = r6.f27733a
            r7 = r7 | 512(0x200, float:7.175E-43)
            r6.f27733a = r7
            r6.f27743k = r5
            int r5 = r0.f27219a
            r6 = r5 & 64
            if (r6 == 0) goto L_0x00ec
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00ec
            int r5 = r0.f27227i
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.ai.b.nw r6 = (com.google.p375ai.p378b.C7893nw) r6
            int r7 = r6.f27733a
            r7 = r7 | r4
            r6.f27733a = r7
            r6.f27734b = r5
            int r5 = r0.f27228j
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.ai.b.nw r6 = (com.google.p375ai.p378b.C7893nw) r6
            int r7 = r6.f27733a
            r7 = r7 | 2
            r6.f27733a = r7
            r6.f27735c = r5
        L_0x00ec:
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.g.d.ar r5 = (com.google.android.apps.p489g.p494d.C9155ar) r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.ai.b.nw r3 = (com.google.p375ai.p378b.C7893nw) r3
            r3.getClass()
            r5.mo17449a()
            com.google.protobuf.cq r5 = r5.f31605f
            r5.add(r3)
        L_0x0104:
            com.google.android.apps.g.d.v r3 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.g.d.q r3 = (com.google.android.apps.p489g.p494d.C9273q) r3
            com.google.android.apps.g.d.u r5 = com.google.android.apps.p489g.p494d.C9277u.GENERIC_CARD
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            int r5 = r5.f32164ay
            r6.f32196c = r5
            int r5 = r6.f32192a
            r5 = r5 | r4
            r6.f32192a = r5
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.g.d.v r5 = (com.google.android.apps.p489g.p494d.C9278v) r5
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.g.d.ar r2 = (com.google.android.apps.p489g.p494d.C9155ar) r2
            r2.getClass()
            r5.f32207n = r2
            int r2 = r5.f32192a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r5.f32192a = r2
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            r13.getClass()
            r2.f32174H = r13
            int r5 = r2.f32192a
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r6
            r2.f32192a = r5
            int r2 = r0.f27219a
            r2 = r2 & 256(0x100, float:3.59E-43)
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            r7 = 0
            if (r2 == 0) goto L_0x016e
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DETAILS
            com.google.ai.b.an r8 = r0.f27230l
            if (r8 != 0) goto L_0x015a
            com.google.ai.b.an r8 = com.google.p375ai.p378b.C7526an.f26049l
        L_0x015a:
            com.google.android.apps.g.d.ad r2 = com.google.android.apps.gsa.sidekick.shared.util.C91988g.m150966c(r8, r2, r7)
            if (r2 == 0) goto L_0x016e
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.android.apps.g.d.v r8 = (com.google.android.apps.p489g.p494d.C9278v) r8
            r8.f32169C = r2
            int r2 = r8.f32192a
            r2 = r2 | r5
            r8.f32192a = r2
        L_0x016e:
            com.google.protobuf.bv r2 = r3.build()
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            r1.add(r2)
            com.google.protobuf.cq r0 = r0.f27229k
            java.util.Iterator r0 = r0.iterator()
        L_0x017d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02b1
            java.lang.Object r2 = r0.next()
            com.google.ai.b.an r2 = (com.google.p375ai.p378b.C7526an) r2
            int r3 = r2.f26051a
            r3 = r3 & r4
            r8 = 0
            if (r3 == 0) goto L_0x02ac
            com.google.ai.b.g r3 = com.google.p375ai.p378b.C7681g.GENERIC_CARD_BUTTON_CLICK
            int r9 = r2.f26051a
            r10 = r9 & 4
            if (r10 == 0) goto L_0x019a
            java.lang.String r10 = r2.f26054d
            goto L_0x019b
        L_0x019a:
            r10 = r8
        L_0x019b:
            r9 = r9 & 2
            if (r9 == 0) goto L_0x01a2
            java.lang.String r9 = r2.f26053c
            goto L_0x01a3
        L_0x01a2:
            r9 = r8
        L_0x01a3:
            java.lang.String r11 = "android.settings.WIFI_SETTINGS"
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L_0x01b8
            com.google.android.apps.g.d.ac r9 = com.google.android.apps.p489g.p494d.C9140ac.ENABLE_WIFI
            com.google.android.apps.g.d.ad r3 = com.google.android.apps.gsa.sidekick.shared.util.C91988g.m150965b(r9, r3, r7)
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.android.apps.g.d.y r3 = (com.google.android.apps.p489g.p494d.C9281y) r3
            goto L_0x01e1
        L_0x01b8:
            java.lang.String r11 = "android.net.wifi.action.REQUEST_SCAN_ALWAYS_AVAILABLE"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x01cd
            com.google.android.apps.g.d.ac r9 = com.google.android.apps.p489g.p494d.C9140ac.ENABLE_WIFI_SCAN
            com.google.android.apps.g.d.ad r3 = com.google.android.apps.gsa.sidekick.shared.util.C91988g.m150965b(r9, r3, r7)
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.android.apps.g.d.y r3 = (com.google.android.apps.p489g.p494d.C9281y) r3
            goto L_0x01e1
        L_0x01cd:
            java.lang.String r10 = "https://www.google.com/history/settings"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x01eb
            com.google.android.apps.g.d.ac r9 = com.google.android.apps.p489g.p494d.C9140ac.WEB_HISTORY_SETTINGS
            com.google.android.apps.g.d.ad r3 = com.google.android.apps.gsa.sidekick.shared.util.C91988g.m150965b(r9, r3, r7)
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.android.apps.g.d.y r3 = (com.google.android.apps.p489g.p494d.C9281y) r3
        L_0x01e1:
            com.google.android.apps.gsa.sidekick.shared.util.C91988g.m150964a(r3, r2)
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.g.d.ad r3 = (com.google.android.apps.p489g.p494d.C9141ad) r3
            goto L_0x01ef
        L_0x01eb:
            com.google.android.apps.g.d.ad r3 = com.google.android.apps.gsa.sidekick.shared.util.C91988g.m150966c(r2, r3, r7)
        L_0x01ef:
            if (r3 != 0) goto L_0x01f3
            goto L_0x02ac
        L_0x01f3:
            com.google.protobuf.bn r8 = r3.toBuilder()
            com.google.android.apps.g.d.y r8 = (com.google.android.apps.p489g.p494d.C9281y) r8
            int r3 = r3.f31535a
            r3 = r3 & 4
            if (r3 != 0) goto L_0x0230
            com.google.android.apps.g.d.b r3 = com.google.android.apps.p489g.p494d.C9164b.f31642o
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.g.d.a r3 = (com.google.android.apps.p489g.p494d.C9137a) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.android.apps.g.d.b r9 = (com.google.android.apps.p489g.p494d.C9164b) r9
            int r10 = r9.f31644a
            r10 = r10 | r4
            r9.f31644a = r10
            r10 = 2131234585(0x7f080f19, float:1.808534E38)
            r9.f31645b = r10
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.g.d.ad r9 = (com.google.android.apps.p489g.p494d.C9141ad) r9
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.g.d.b r3 = (com.google.android.apps.p489g.p494d.C9164b) r3
            r3.getClass()
            r9.f31539e = r3
            int r3 = r9.f31535a
            r3 = r3 | 4
            r9.f31535a = r3
        L_0x0230:
            com.google.android.apps.g.d.v r3 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.g.d.q r3 = (com.google.android.apps.p489g.p494d.C9273q) r3
            com.google.android.apps.g.d.u r9 = com.google.android.apps.p489g.p494d.C9277u.PRIMARY_ACTION
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            com.google.android.apps.g.d.v r10 = (com.google.android.apps.p489g.p494d.C9278v) r10
            int r9 = r9.f32164ay
            r10.f32196c = r9
            int r9 = r10.f32192a
            r9 = r9 | r4
            r10.f32192a = r9
            com.google.android.apps.g.d.cz r9 = com.google.android.apps.p489g.p494d.C9217cz.f31853i
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.g.d.cy r9 = (com.google.android.apps.p489g.p494d.C9216cy) r9
            java.lang.String r2 = r2.f26052b
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.apps.g.d.cz r10 = (com.google.android.apps.p489g.p494d.C9217cz) r10
            r2.getClass()
            int r11 = r10.f31855a
            r11 = r11 | r4
            r10.f31855a = r11
            r10.f31856b = r2
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            com.google.protobuf.bv r9 = r9.build()
            com.google.android.apps.g.d.cz r9 = (com.google.android.apps.p489g.p494d.C9217cz) r9
            r9.getClass()
            r2.f32198e = r9
            int r9 = r2.f32192a
            r9 = r9 | 4
            r2.f32192a = r9
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            r13.getClass()
            r2.f32174H = r13
            int r9 = r2.f32192a
            r9 = r9 | r6
            r2.f32192a = r9
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.apps.g.d.ad r8 = (com.google.android.apps.p489g.p494d.C9141ad) r8
            r8.getClass()
            r2.f32169C = r8
            int r8 = r2.f32192a
            r8 = r8 | r5
            r2.f32192a = r8
            com.google.protobuf.bv r2 = r3.build()
            r8 = r2
            com.google.android.apps.g.d.v r8 = (com.google.android.apps.p489g.p494d.C9278v) r8
        L_0x02ac:
            m172340G(r1, r8)
            goto L_0x017d
        L_0x02b1:
            com.google.android.apps.g.d.n r13 = com.google.android.apps.p489g.p494d.C9270n.f32072e
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.apps.g.d.m r13 = (com.google.android.apps.p489g.p494d.C9269m) r13
            r13.mo17460a(r1)
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.android.apps.g.d.n r0 = (com.google.android.apps.p489g.p494d.C9270n) r0
            int r1 = r0.f32074a
            r1 = r1 | r4
            r0.f32074a = r1
            r0.f32076c = r4
            com.google.protobuf.bv r13 = r13.build()
            com.google.android.apps.g.d.n r13 = (com.google.android.apps.p489g.p494d.C9270n) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104965k.mo94024a(android.content.Context):com.google.android.apps.g.d.n");
    }
}
