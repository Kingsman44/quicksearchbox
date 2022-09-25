package com.google.android.apps.gsa.search.core.state;

import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.aj */
/* compiled from: PG */
public final class C86813aj implements C87143ik {

    /* renamed from: a */
    private final C86812ai f234487a;

    /* renamed from: b */
    private final C86842bk f234488b;

    /* renamed from: c */
    private final C86842bk f234489c;

    /* renamed from: d */
    private final C86842bk f234490d;

    /* renamed from: e */
    private final C86842bk f234491e;

    /* renamed from: f */
    private final C86842bk f234492f;

    public C86813aj(C86812ai aiVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f234487a = aiVar;
        this.f234488b = new C86842bk(aVar);
        this.f234489c = new C86842bk(aVar2);
        this.f234490d = new C86842bk(aVar3);
        this.f234491e = new C86842bk(aVar4);
        this.f234492f = new C86842bk(aVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234487a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234488b
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234489c
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234490d
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234491e
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234492f
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r1 = r0.f234488b
            boolean r2 = r1.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234489c
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234490d
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234491e
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234492f
            boolean r2 = r2.f234552a
            if (r2 == 0) goto L_0x01df
        L_0x003b:
            com.google.android.apps.gsa.search.core.state.ai r2 = r0.f234487a
            com.google.android.apps.gsa.search.core.state.bk r3 = r0.f234489c
            com.google.android.apps.gsa.search.core.state.bk r4 = r0.f234490d
            com.google.android.apps.gsa.search.core.state.bk r5 = r0.f234491e
            com.google.android.apps.gsa.search.core.state.bk r6 = r0.f234492f
            com.google.android.apps.gsa.search.core.state.dw r7 = r1.mo80533a()
            com.google.android.apps.gsa.search.core.state.z r7 = (com.google.android.apps.gsa.search.core.state.C87171z) r7
            com.google.android.apps.gsa.search.core.state.dw r8 = r3.mo80533a()
            com.google.android.apps.gsa.search.core.state.al r8 = (com.google.android.apps.gsa.search.core.state.C86815al) r8
            com.google.android.apps.gsa.search.core.state.dw r9 = r6.mo80533a()
            com.google.android.apps.gsa.search.core.state.fn r9 = (com.google.android.apps.gsa.search.core.state.C87052fn) r9
            boolean r10 = r5.f234552a
            if (r10 == 0) goto L_0x01a4
            com.google.android.apps.gsa.search.core.state.dw r5 = r5.mo80533a()
            com.google.android.apps.gsa.search.core.state.a.g r5 = (com.google.android.apps.gsa.search.core.state.p6864a.C86792g) r5
            long r12 = r5.mo80445c()
            com.google.android.apps.gsa.search.shared.service.ClientConfig r10 = r5.mo80446e()
            boolean r14 = r5.mo80449h()
            com.google.android.apps.gsa.search.shared.service.c.c r5 = r5.mo80447f()
            java.lang.String r5 = r5.mo81992b()
            java.lang.String r15 = "search"
            boolean r5 = r5.equals(r15)
            r15 = 0
            if (r5 == 0) goto L_0x0083
            com.google.android.apps.gsa.search.shared.service.ClientConfig r10 = com.google.android.apps.gsa.search.shared.service.ClientConfig.f236948a
            r12 = r15
            r14 = 0
        L_0x0083:
            com.google.android.apps.gsa.search.shared.service.ClientConfig r5 = r2.f234471a
            if (r10 != r5) goto L_0x0099
            r5 = r7
            r17 = r8
            long r7 = r2.f234472b
            int r18 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r18 == 0) goto L_0x0091
            goto L_0x009c
        L_0x0091:
            boolean r7 = r2.f234473c
            if (r14 == r7) goto L_0x01a7
            r2.f234473c = r14
            goto L_0x01a2
        L_0x0099:
            r5 = r7
            r17 = r8
        L_0x009c:
            long r7 = r2.f234472b
            int r19 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r19 == 0) goto L_0x0102
            com.google.common.o.uf r7 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.common.o.tz r7 = (com.google.common.p4552o.C60548tz) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.common.o.uf r8 = (com.google.common.p4552o.C60555uf) r8
            int r15 = r8.f164093a
            r15 = r15 | 2
            r8.f164093a = r15
            r15 = 221(0xdd, float:3.1E-43)
            r8.f164258m = r15
            dagger.a r8 = r2.f234476f
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.state.fn r8 = (com.google.android.apps.gsa.search.core.state.C87052fn) r8
            com.google.android.apps.gsa.shared.search.Query r8 = r8.f235177m
            r15 = r12
            long r11 = r8.f252749G
            java.lang.String r8 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r11)
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.common.o.uf r11 = (com.google.common.p4552o.C60555uf) r11
            r8.getClass()
            int r12 = r11.f164093a
            r12 = r12 | 4
            r11.f164093a = r12
            r11.f164259n = r8
            com.google.android.apps.gsa.search.shared.service.ClientConfig r8 = r2.f234471a
            com.google.common.o.amo r8 = r8.f236951d
            com.google.common.o.amo r8 = com.google.android.apps.gsa.shared.logger.C89949q.m146517a(r8)
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.common.o.uf r11 = (com.google.common.p4552o.C60555uf) r11
            int r8 = r8.f159234au
            r11.f164070D = r8
            int r8 = r11.f164146b
            r8 = r8 | 8
            r11.f164146b = r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.common.o.uf r7 = (com.google.common.p4552o.C60555uf) r7
            r8 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r7, r8, r8, r8)
            goto L_0x0103
        L_0x0102:
            r15 = r12
        L_0x0103:
            r7 = 0
            int r11 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0165
            com.google.common.o.uf r7 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.common.o.tz r7 = (com.google.common.p4552o.C60548tz) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.common.o.uf r8 = (com.google.common.p4552o.C60555uf) r8
            int r11 = r8.f164093a
            r11 = r11 | 2
            r8.f164093a = r11
            r11 = 222(0xde, float:3.11E-43)
            r8.f164258m = r11
            dagger.a r8 = r2.f234476f
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.state.fn r8 = (com.google.android.apps.gsa.search.core.state.C87052fn) r8
            com.google.android.apps.gsa.shared.search.Query r8 = r8.f235177m
            long r11 = r8.f252749G
            java.lang.String r8 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r11)
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.common.o.uf r11 = (com.google.common.p4552o.C60555uf) r11
            r8.getClass()
            int r12 = r11.f164093a
            r12 = r12 | 4
            r11.f164093a = r12
            r11.f164259n = r8
            com.google.common.o.amo r8 = r10.f236951d
            com.google.common.o.amo r8 = com.google.android.apps.gsa.shared.logger.C89949q.m146517a(r8)
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.common.o.uf r11 = (com.google.common.p4552o.C60555uf) r11
            int r8 = r8.f159234au
            r11.f164070D = r8
            int r8 = r11.f164146b
            r8 = r8 | 8
            r11.f164146b = r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.common.o.uf r7 = (com.google.common.p4552o.C60555uf) r7
            r8 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r7, r8, r8, r8)
        L_0x0165:
            r2.f234471a = r10
            r12 = r15
            r2.f234472b = r12
            r2.f234473c = r14
            r2.mo80519f()
            dagger.a r7 = r2.f234474d
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.state.z r7 = (com.google.android.apps.gsa.search.core.state.C87171z) r7
            dagger.a r8 = r2.f234475e
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.state.bb r8 = (com.google.android.apps.gsa.search.core.state.C86833bb) r8
            dagger.a r10 = r2.f234476f
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.search.core.state.fn r10 = (com.google.android.apps.gsa.search.core.state.C87052fn) r10
            dagger.a r11 = r2.f234477g
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.search.core.state.al r11 = (com.google.android.apps.gsa.search.core.state.C86815al) r11
            boolean r11 = r11.mo80523a()
            r2.mo80520g(r7, r8, r10, r11)
            dagger.a r7 = r2.f234474d
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.state.z r7 = (com.google.android.apps.gsa.search.core.state.C87171z) r7
            r8 = 1
            r2.mo80517b(r7, r8)
        L_0x01a2:
            r11 = 1
            goto L_0x01a8
        L_0x01a4:
            r5 = r7
            r17 = r8
        L_0x01a7:
            r11 = 0
        L_0x01a8:
            boolean r7 = r6.f234552a
            if (r7 == 0) goto L_0x01b1
            boolean r7 = r2.mo80519f()
            r11 = r11 | r7
        L_0x01b1:
            boolean r7 = r1.f234552a
            if (r7 != 0) goto L_0x01c1
            boolean r7 = r4.f234552a
            if (r7 != 0) goto L_0x01c1
            boolean r6 = r6.f234552a
            if (r6 != 0) goto L_0x01c1
            boolean r3 = r3.f234552a
            if (r3 == 0) goto L_0x01d0
        L_0x01c1:
            com.google.android.apps.gsa.search.core.state.dw r3 = r4.mo80533a()
            com.google.android.apps.gsa.search.core.state.bb r3 = (com.google.android.apps.gsa.search.core.state.C86833bb) r3
            boolean r4 = r17.mo80523a()
            boolean r3 = r2.mo80520g(r5, r3, r9, r4)
            r11 = r11 | r3
        L_0x01d0:
            boolean r1 = r1.f234552a
            if (r1 == 0) goto L_0x01d8
            r1 = 0
            r2.mo80517b(r5, r1)
        L_0x01d8:
            if (r11 == 0) goto L_0x01df
            com.google.android.apps.gsa.search.core.state.ai r1 = r0.f234487a
            r1.mo80591ar()
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C86813aj.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
