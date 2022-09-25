package com.google.android.apps.gsa.staticplugins.p8010i.p8012b;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6498ab.p6499a.C84395a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86669cg;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

@C84395a
/* renamed from: com.google.android.apps.gsa.staticplugins.i.b.b */
/* compiled from: PG */
public final class C102246b implements C86686h {

    /* renamed from: c */
    private static final C59071e f285297c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.i.b.b");

    /* renamed from: a */
    public final C86669cg f285298a;

    /* renamed from: d */
    private final Context f285299d;

    /* renamed from: e */
    private final C58833ax f285300e;

    /* renamed from: f */
    private final C22871g f285301f;

    /* renamed from: g */
    private final C86124t f285302g;

    public C102246b(Context context, C58833ax axVar, C86669cg cgVar, C22871g gVar, C86124t tVar) {
        this.f285299d = context;
        this.f285300e = axVar;
        this.f285298a = cgVar;
        this.f285301f = gVar;
        this.f285302g = tVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i = clientEventData.f236955a.f237480b;
        C87739bu buVar = C87739bu.UNKNOWN;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
    }

    /* renamed from: h */
    public final void mo80295h() {
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015e, code lost:
        if (com.google.p4479cg.p4480a.C58069f.m88829a(r4) != false) goto L_0x0160;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80297j(long r17, com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb r19, com.google.common.base.C58833ax r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            com.google.protobuf.bt r4 = com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38346a.f101532a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r5 = r3.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            java.lang.String r5 = "AssistantReminderSesCtl"
            r6 = 4
            r7 = 2
            r8 = 1
            if (r4 != 0) goto L_0x0034
            com.google.common.f.e r3 = f285297c
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Triggered AssistantReminder session without UntrustedDeeplinkDataHandleWithCare extension."
            r9 = 13940(0x3674, float:1.9534E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r9)).mo56386p(r4)
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            goto L_0x0124
        L_0x0034:
            com.google.protobuf.bt r4 = com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38346a.f101532a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r9 = r4.f169971d
            java.lang.Object r3 = r3.mo58854l(r9)
            if (r3 != 0) goto L_0x004a
            java.lang.Object r3 = r4.f169969b
            goto L_0x004e
        L_0x004a:
            java.lang.Object r3 = r4.mo58889c(r3)
        L_0x004e:
            com.google.android.libraries.search.g.a.b.a.c r3 = (com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38348c) r3
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99484h.f278394d
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r9 = r3.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r9.mo58857o(r4)
            if (r4 != 0) goto L_0x0079
            com.google.common.f.e r3 = f285297c
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Triggered AssistantReminder session without UntrustedAssistant extension."
            r9 = 13939(0x3673, float:1.9533E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r9)).mo56386p(r4)
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            goto L_0x0124
        L_0x0079:
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99484h.f278394d
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r9 = r4.f169971d
            java.lang.Object r3 = r3.mo58854l(r9)
            if (r3 != 0) goto L_0x008f
            java.lang.Object r3 = r4.f169969b
            goto L_0x0093
        L_0x008f:
            java.lang.Object r3 = r4.mo58889c(r3)
        L_0x0093:
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.h r3 = (com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99484h) r3
            int r4 = r3.f278396a
            if (r4 != r8) goto L_0x0110
            java.lang.Object r4 = r3.f278397b
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.f r4 = (com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99482f) r4
            int r4 = r4.f278387a
            r9 = r4 & 1
            if (r9 == 0) goto L_0x00fb
            r4 = r4 & r7
            if (r4 == 0) goto L_0x00e6
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f285302g
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90145x.f251886f
            boolean r4 = r4.mo79746e(r9)
            if (r4 == 0) goto L_0x00d6
            int r4 = r3.f278396a
            if (r4 != r8) goto L_0x00b9
            java.lang.Object r4 = r3.f278397b
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.f r4 = (com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99482f) r4
            goto L_0x00bb
        L_0x00b9:
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.f r4 = com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99482f.f278385g
        L_0x00bb:
            int r4 = r4.f278387a
            r4 = r4 & r6
            if (r4 == 0) goto L_0x00c1
            goto L_0x00d6
        L_0x00c1:
            com.google.common.f.e r3 = f285297c
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Triggered AssistantReminder session without reminder time."
            r9 = 13935(0x366f, float:1.9527E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r9)).mo56386p(r4)
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            goto L_0x0124
        L_0x00d6:
            int r4 = r3.f278396a
            if (r4 != r8) goto L_0x00df
            java.lang.Object r3 = r3.f278397b
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.f r3 = (com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99482f) r3
            goto L_0x00e1
        L_0x00df:
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.f r3 = com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99482f.f278385g
        L_0x00e1:
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            goto L_0x0124
        L_0x00e6:
            com.google.common.f.e r3 = f285297c
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Triggered AssistantReminder session without reminder date."
            r9 = 13936(0x3670, float:1.9528E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r9)).mo56386p(r4)
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            goto L_0x0124
        L_0x00fb:
            com.google.common.f.e r3 = f285297c
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Triggered AssistantReminder session without reminder title."
            r9 = 13937(0x3671, float:1.953E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r9)).mo56386p(r4)
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            goto L_0x0124
        L_0x0110:
            com.google.common.f.e r3 = f285297c
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Triggered AssistantReminder session without CreateReminder data."
            r9 = 13938(0x3672, float:1.9531E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r9)).mo56386p(r4)
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
        L_0x0124:
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f285302g
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90145x.f251882b
            boolean r4 = r4.mo79746e(r9)
            if (r4 == 0) goto L_0x0713
            boolean r4 = r3.mo56113h()
            if (r4 == 0) goto L_0x0713
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.f r3 = (com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99482f) r3
            com.google.cg.d r4 = r3.f278389c
            if (r4 != 0) goto L_0x0140
            com.google.cg.d r4 = com.google.p4479cg.C58072d.f155218d
        L_0x0140:
            int r9 = com.google.p4479cg.p4480a.C58066c.m88822d(r4)
            boolean r4 = com.google.p4479cg.p4480a.C58065b.m88818a(r9, r4)
            if (r4 == 0) goto L_0x0701
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f285302g
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90145x.f251886f
            boolean r4 = r4.mo79746e(r9)
            if (r4 == 0) goto L_0x0160
            com.google.cg.m r4 = r3.f278390d
            if (r4 != 0) goto L_0x015a
            com.google.cg.m r4 = com.google.p4479cg.C58081m.f155254e
        L_0x015a:
            boolean r4 = com.google.p4479cg.p4480a.C58069f.m88829a(r4)
            if (r4 == 0) goto L_0x0701
        L_0x0160:
            com.google.protos.an.b.b r4 = com.google.protos.p4850an.p4853b.C63358b.f171216l
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.protos.an.b.a r4 = (com.google.protos.p4850an.p4853b.C63357a) r4
            com.google.cg.d r9 = r3.f278389c
            if (r9 != 0) goto L_0x016e
            com.google.cg.d r9 = com.google.p4479cg.C58072d.f155218d
        L_0x016e:
            int r9 = r9.f155220a
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.protos.an.b.b r10 = (com.google.protos.p4850an.p4853b.C63358b) r10
            int r11 = r10.f171218a
            r11 = r11 | r8
            r10.f171218a = r11
            r10.f171219b = r9
            com.google.cg.d r9 = r3.f278389c
            if (r9 != 0) goto L_0x0184
            com.google.cg.d r9 = com.google.p4479cg.C58072d.f155218d
        L_0x0184:
            int r9 = r9.f155221b
            int r9 = com.google.protos.p4850an.p4853b.C63378v.m96231a(r9)
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.protos.an.b.b r10 = (com.google.protos.p4850an.p4853b.C63358b) r10
            int r11 = r9 + -1
            if (r9 == 0) goto L_0x06ff
            r10.f171220c = r11
            int r9 = r10.f171218a
            r9 = r9 | r7
            r10.f171218a = r9
            com.google.cg.d r9 = r3.f278389c
            if (r9 != 0) goto L_0x01a2
            com.google.cg.d r9 = com.google.p4479cg.C58072d.f155218d
        L_0x01a2:
            int r9 = r9.f155222c
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.protos.an.b.b r10 = (com.google.protos.p4850an.p4853b.C63358b) r10
            int r11 = r10.f171218a
            r11 = r11 | r6
            r10.f171218a = r11
            r10.f171221d = r9
            com.google.android.apps.gsa.search.core.i.t r9 = r0.f285302g
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90145x.f251886f
            boolean r9 = r9.mo79746e(r10)
            if (r9 == 0) goto L_0x0201
            com.google.cg.m r9 = r3.f278390d
            if (r9 != 0) goto L_0x01c2
            com.google.cg.m r9 = com.google.p4479cg.C58081m.f155254e
        L_0x01c2:
            int r9 = r9.f155256a
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.protos.an.b.b r10 = (com.google.protos.p4850an.p4853b.C63358b) r10
            int r11 = r10.f171218a
            r11 = r11 | 16
            r10.f171218a = r11
            r10.f171222e = r9
            com.google.cg.m r9 = r3.f278390d
            if (r9 != 0) goto L_0x01d9
            com.google.cg.m r9 = com.google.p4479cg.C58081m.f155254e
        L_0x01d9:
            int r9 = r9.f155257b
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.protos.an.b.b r10 = (com.google.protos.p4850an.p4853b.C63358b) r10
            int r11 = r10.f171218a
            r11 = r11 | 32
            r10.f171218a = r11
            r10.f171223f = r9
            com.google.cg.m r9 = r3.f278390d
            if (r9 != 0) goto L_0x01f0
            com.google.cg.m r9 = com.google.p4479cg.C58081m.f155254e
        L_0x01f0:
            int r9 = r9.f155258c
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.protos.an.b.b r10 = (com.google.protos.p4850an.p4853b.C63358b) r10
            int r11 = r10.f171218a
            r11 = r11 | 64
            r10.f171218a = r11
            r10.f171224g = r9
        L_0x0201:
            com.google.protos.an.b.d r9 = com.google.protos.p4850an.p4853b.C63360d.f171230f
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.protos.an.b.c r9 = (com.google.protos.p4850an.p4853b.C63359c) r9
            r9.mo59206a(r4)
            com.google.protobuf.bv r4 = r9.build()
            com.google.protos.an.b.d r4 = (com.google.protos.p4850an.p4853b.C63360d) r4
            com.google.knowledge.a.a.n r9 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.knowledge.a.a.m r9 = (com.google.knowledge.p4661a.p4662a.C61751m) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.knowledge.a.a.n r10 = (com.google.knowledge.p4661a.p4662a.C61752n) r10
            int r11 = r10.f166810a
            r11 = r11 | r6
            r10.f166810a = r11
            java.lang.String r11 = "CreateReminder"
            r10.f166811b = r11
            com.google.knowledge.a.a.h r10 = com.google.knowledge.p4661a.p4662a.C61746h.f166791g
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.knowledge.a.a.g r10 = (com.google.knowledge.p4661a.p4662a.C61745g) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.knowledge.a.a.h r11 = (com.google.knowledge.p4661a.p4662a.C61746h) r11
            int r12 = r11.f166793a
            r12 = r12 | r7
            r11.f166793a = r12
            java.lang.String r12 = "title"
            r11.f166796d = r12
            com.google.knowledge.a.a.j r11 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.knowledge.a.a.i r11 = (com.google.knowledge.p4661a.p4662a.C61747i) r11
            com.google.knowledge.a.a.t r12 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.knowledge.a.a.s r12 = (com.google.knowledge.p4661a.p4662a.C61757s) r12
            java.lang.String r13 = r3.f278388b
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.knowledge.a.a.t r14 = (com.google.knowledge.p4661a.p4662a.C61758t) r14
            r13.getClass()
            r14.f166826a = r8
            r14.f166827b = r13
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.knowledge.a.a.j r13 = (com.google.knowledge.p4661a.p4662a.C61748j) r13
            com.google.protobuf.bv r12 = r12.build()
            com.google.knowledge.a.a.t r12 = (com.google.knowledge.p4661a.p4662a.C61758t) r12
            r12.getClass()
            r13.f166803b = r12
            r12 = 3
            r13.f166802a = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.knowledge.a.a.h r13 = (com.google.knowledge.p4661a.p4662a.C61746h) r13
            com.google.protobuf.bv r11 = r11.build()
            com.google.knowledge.a.a.j r11 = (com.google.knowledge.p4661a.p4662a.C61748j) r11
            r11.getClass()
            r13.f166797e = r11
            int r11 = r13.f166793a
            r11 = r11 | r6
            r13.f166793a = r11
            r9.mo58184c(r10)
            com.google.knowledge.a.a.h r10 = com.google.knowledge.p4661a.p4662a.C61746h.f166791g
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.knowledge.a.a.g r10 = (com.google.knowledge.p4661a.p4662a.C61745g) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.knowledge.a.a.h r11 = (com.google.knowledge.p4661a.p4662a.C61746h) r11
            int r13 = r11.f166793a
            r13 = r13 | r7
            r11.f166793a = r13
            java.lang.String r13 = "datetime"
            r11.f166796d = r13
            com.google.knowledge.a.a.j r11 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.knowledge.a.a.i r11 = (com.google.knowledge.p4661a.p4662a.C61747i) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.knowledge.a.a.j r13 = (com.google.knowledge.p4661a.p4662a.C61748j) r13
            r4.getClass()
            r13.f166803b = r4
            r13.f166802a = r6
            r10.copyOnWrite()
            com.google.protobuf.bv r4 = r10.instance
            com.google.knowledge.a.a.h r4 = (com.google.knowledge.p4661a.p4662a.C61746h) r4
            com.google.protobuf.bv r11 = r11.build()
            com.google.knowledge.a.a.j r11 = (com.google.knowledge.p4661a.p4662a.C61748j) r11
            r11.getClass()
            r4.f166797e = r11
            int r11 = r4.f166793a
            r11 = r11 | r6
            r4.f166793a = r11
            r9.mo58184c(r10)
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f285302g
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90145x.f251885e
            boolean r4 = r4.mo79746e(r10)
            if (r4 == 0) goto L_0x0351
            java.lang.String r4 = r3.f278392f
            boolean r4 = com.google.common.base.C58879cp.m90962d(r4)
            if (r4 != 0) goto L_0x0351
            com.google.knowledge.a.a.h r4 = com.google.knowledge.p4661a.p4662a.C61746h.f166791g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.knowledge.a.a.g r4 = (com.google.knowledge.p4661a.p4662a.C61745g) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.knowledge.a.a.h r10 = (com.google.knowledge.p4661a.p4662a.C61746h) r10
            int r11 = r10.f166793a
            r11 = r11 | r7
            r10.f166793a = r11
            java.lang.String r11 = "client_assigned_id"
            r10.f166796d = r11
            com.google.knowledge.a.a.j r10 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.knowledge.a.a.i r10 = (com.google.knowledge.p4661a.p4662a.C61747i) r10
            com.google.knowledge.a.a.t r11 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.knowledge.a.a.s r11 = (com.google.knowledge.p4661a.p4662a.C61757s) r11
            java.lang.String r13 = r3.f278392f
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.knowledge.a.a.t r14 = (com.google.knowledge.p4661a.p4662a.C61758t) r14
            r13.getClass()
            r14.f166826a = r8
            r14.f166827b = r13
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.knowledge.a.a.j r13 = (com.google.knowledge.p4661a.p4662a.C61748j) r13
            com.google.protobuf.bv r11 = r11.build()
            com.google.knowledge.a.a.t r11 = (com.google.knowledge.p4661a.p4662a.C61758t) r11
            r11.getClass()
            r13.f166803b = r11
            r13.f166802a = r12
            r4.copyOnWrite()
            com.google.protobuf.bv r11 = r4.instance
            com.google.knowledge.a.a.h r11 = (com.google.knowledge.p4661a.p4662a.C61746h) r11
            com.google.protobuf.bv r10 = r10.build()
            com.google.knowledge.a.a.j r10 = (com.google.knowledge.p4661a.p4662a.C61748j) r10
            r10.getClass()
            r11.f166797e = r10
            int r10 = r11.f166793a
            r10 = r10 | r6
            r11.f166793a = r10
            r9.mo58184c(r4)
        L_0x0351:
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f285302g
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90145x.f251886f
            boolean r4 = r4.mo79746e(r10)
            if (r4 == 0) goto L_0x03c0
            com.google.knowledge.a.a.h r4 = com.google.knowledge.p4661a.p4662a.C61746h.f166791g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.knowledge.a.a.g r4 = (com.google.knowledge.p4661a.p4662a.C61745g) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.knowledge.a.a.h r10 = (com.google.knowledge.p4661a.p4662a.C61746h) r10
            int r11 = r10.f166793a
            r11 = r11 | r7
            r10.f166793a = r11
            java.lang.String r11 = "require_explicit_confirmation"
            r10.f166796d = r11
            com.google.knowledge.a.a.j r10 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.knowledge.a.a.i r10 = (com.google.knowledge.p4661a.p4662a.C61747i) r10
            com.google.knowledge.a.a.t r11 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.knowledge.a.a.s r11 = (com.google.knowledge.p4661a.p4662a.C61757s) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.knowledge.a.a.t r13 = (com.google.knowledge.p4661a.p4662a.C61758t) r13
            r13.f166826a = r6
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r8)
            r13.f166827b = r14
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.knowledge.a.a.j r13 = (com.google.knowledge.p4661a.p4662a.C61748j) r13
            com.google.protobuf.bv r11 = r11.build()
            com.google.knowledge.a.a.t r11 = (com.google.knowledge.p4661a.p4662a.C61758t) r11
            r11.getClass()
            r13.f166803b = r11
            r13.f166802a = r12
            r4.copyOnWrite()
            com.google.protobuf.bv r11 = r4.instance
            com.google.knowledge.a.a.h r11 = (com.google.knowledge.p4661a.p4662a.C61746h) r11
            com.google.protobuf.bv r10 = r10.build()
            com.google.knowledge.a.a.j r10 = (com.google.knowledge.p4661a.p4662a.C61748j) r10
            r10.getClass()
            r11.f166797e = r10
            int r10 = r11.f166793a
            r10 = r10 | r6
            r11.f166793a = r10
            r9.mo58184c(r4)
        L_0x03c0:
            int r4 = r3.f278387a
            r4 = r4 & 8
            if (r4 == 0) goto L_0x04f9
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.e r4 = r3.f278391e
            if (r4 != 0) goto L_0x03cc
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.e r4 = com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99481e.f278378e
        L_0x03cc:
            int r10 = r4.f278380a
            if (r10 != r7) goto L_0x0421
            java.lang.Object r10 = r4.f278381b
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.d r10 = (com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99480d) r10
            java.lang.String r10 = r10.f278376a
            com.google.android.apps.gsa.search.core.i.t r11 = r0.f285302g
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90145x.f251888h
            boolean r11 = r11.mo79746e(r13)
            if (r11 == 0) goto L_0x03fb
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r13 = "com.google.android.googlequicksearchbox.GOOGLE_SEARCH"
            r11.<init>(r13)
            java.lang.String r13 = "query"
            r11.putExtra(r13, r10)
            r10 = 268468224(0x10008000, float:2.5342157E-29)
            r11.addFlags(r10)
            java.lang.String r10 = r11.toUri(r8)
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
            goto L_0x0423
        L_0x03fb:
            android.net.Uri$Builder r11 = new android.net.Uri$Builder
            r11.<init>()
            java.lang.String r13 = "https"
            android.net.Uri$Builder r11 = r11.scheme(r13)
            java.lang.String r13 = "www.google.com"
            android.net.Uri$Builder r11 = r11.authority(r13)
            java.lang.String r13 = "search"
            android.net.Uri$Builder r11 = r11.path(r13)
            java.lang.String r13 = "q"
            android.net.Uri$Builder r10 = r11.appendQueryParameter(r13, r10)
            java.lang.String r10 = r10.toString()
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
            goto L_0x0423
        L_0x0421:
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
        L_0x0423:
            boolean r11 = r10.mo56113h()
            if (r11 == 0) goto L_0x04f9
            com.google.knowledge.a.a.h r11 = com.google.knowledge.p4661a.p4662a.C61746h.f166791g
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.knowledge.a.a.g r11 = (com.google.knowledge.p4661a.p4662a.C61745g) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.knowledge.a.a.h r13 = (com.google.knowledge.p4661a.p4662a.C61746h) r13
            int r14 = r13.f166793a
            r14 = r14 | r7
            r13.f166793a = r14
            java.lang.String r14 = "payload_button_text"
            r13.f166796d = r14
            com.google.knowledge.a.a.j r13 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.knowledge.a.a.i r13 = (com.google.knowledge.p4661a.p4662a.C61747i) r13
            com.google.knowledge.a.a.t r14 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.knowledge.a.a.s r14 = (com.google.knowledge.p4661a.p4662a.C61757s) r14
            java.lang.String r4 = r4.f278382c
            r14.copyOnWrite()
            com.google.protobuf.bv r15 = r14.instance
            com.google.knowledge.a.a.t r15 = (com.google.knowledge.p4661a.p4662a.C61758t) r15
            r4.getClass()
            r15.f166826a = r8
            r15.f166827b = r4
            r13.copyOnWrite()
            com.google.protobuf.bv r4 = r13.instance
            com.google.knowledge.a.a.j r4 = (com.google.knowledge.p4661a.p4662a.C61748j) r4
            com.google.protobuf.bv r14 = r14.build()
            com.google.knowledge.a.a.t r14 = (com.google.knowledge.p4661a.p4662a.C61758t) r14
            r14.getClass()
            r4.f166803b = r14
            r4.f166802a = r12
            r11.copyOnWrite()
            com.google.protobuf.bv r4 = r11.instance
            com.google.knowledge.a.a.h r4 = (com.google.knowledge.p4661a.p4662a.C61746h) r4
            com.google.protobuf.bv r13 = r13.build()
            com.google.knowledge.a.a.j r13 = (com.google.knowledge.p4661a.p4662a.C61748j) r13
            r13.getClass()
            r4.f166797e = r13
            int r13 = r4.f166793a
            r13 = r13 | r6
            r4.f166793a = r13
            r9.mo58184c(r11)
            com.google.knowledge.a.a.h r4 = com.google.knowledge.p4661a.p4662a.C61746h.f166791g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.knowledge.a.a.g r4 = (com.google.knowledge.p4661a.p4662a.C61745g) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r11 = r4.instance
            com.google.knowledge.a.a.h r11 = (com.google.knowledge.p4661a.p4662a.C61746h) r11
            int r13 = r11.f166793a
            r13 = r13 | r7
            r11.f166793a = r13
            java.lang.String r13 = "url_payload"
            r11.f166796d = r13
            com.google.knowledge.a.a.j r11 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.knowledge.a.a.i r11 = (com.google.knowledge.p4661a.p4662a.C61747i) r11
            com.google.knowledge.a.a.t r13 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.knowledge.a.a.s r13 = (com.google.knowledge.p4661a.p4662a.C61757s) r13
            java.lang.Object r10 = r10.mo56107c()
            java.lang.String r10 = (java.lang.String) r10
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.knowledge.a.a.t r14 = (com.google.knowledge.p4661a.p4662a.C61758t) r14
            r10.getClass()
            r14.f166826a = r8
            r14.f166827b = r10
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.knowledge.a.a.j r10 = (com.google.knowledge.p4661a.p4662a.C61748j) r10
            com.google.protobuf.bv r13 = r13.build()
            com.google.knowledge.a.a.t r13 = (com.google.knowledge.p4661a.p4662a.C61758t) r13
            r13.getClass()
            r10.f166803b = r13
            r10.f166802a = r12
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.knowledge.a.a.h r10 = (com.google.knowledge.p4661a.p4662a.C61746h) r10
            com.google.protobuf.bv r11 = r11.build()
            com.google.knowledge.a.a.j r11 = (com.google.knowledge.p4661a.p4662a.C61748j) r11
            r11.getClass()
            r10.f166797e = r11
            int r11 = r10.f166793a
            r11 = r11 | r6
            r10.f166793a = r11
            r9.mo58184c(r4)
        L_0x04f9:
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f285302g
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90145x.f251883c
            boolean r4 = r4.mo79746e(r10)
            if (r4 == 0) goto L_0x0646
            com.google.common.f.e r4 = f285297c
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r10, r5)
            java.lang.String r5 = "Reminder Client Type equal or less than zero."
            r10 = 13934(0x366e, float:1.9526E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r10)).mo56386p(r5)
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.e r4 = r3.f278391e
            if (r4 != 0) goto L_0x051b
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.e r4 = com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99481e.f278378e
        L_0x051b:
            int r4 = r4.f278383d
            if (r4 <= 0) goto L_0x052c
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.e r3 = r3.f278391e
            if (r3 != 0) goto L_0x0525
            com.google.android.apps.gsa.staticplugins.deeplink.c.a.e r3 = com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99481e.f278378e
        L_0x0525:
            int r3 = r3.f278383d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x054c
        L_0x052c:
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f285302g
            com.google.android.apps.gsa.shared.m.h r4 = com.google.android.apps.gsa.shared.p7066m.C90145x.f251881a
            java.lang.String r3 = r3.mo79758x(r4)
            java.lang.String r4 = "FORESIGHT"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x053f
            java.lang.String r3 = "1"
            goto L_0x054c
        L_0x053f:
            java.lang.String r4 = "FORESIGHT_TAP_TO_PAYLOAD"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x054a
            java.lang.String r3 = "2"
            goto L_0x054c
        L_0x054a:
            java.lang.String r3 = ""
        L_0x054c:
            com.google.knowledge.a.a.h r4 = com.google.knowledge.p4661a.p4662a.C61746h.f166791g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.knowledge.a.a.g r4 = (com.google.knowledge.p4661a.p4662a.C61745g) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.knowledge.a.a.h r5 = (com.google.knowledge.p4661a.p4662a.C61746h) r5
            int r10 = r5.f166793a
            r10 = r10 | r7
            r5.f166793a = r10
            java.lang.String r10 = "notificationOverrides"
            r5.f166796d = r10
            com.google.knowledge.a.a.j r5 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.knowledge.a.a.i r5 = (com.google.knowledge.p4661a.p4662a.C61747i) r5
            com.google.knowledge.a.a.n r10 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.knowledge.a.a.m r10 = (com.google.knowledge.p4661a.p4662a.C61751m) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.knowledge.a.a.n r11 = (com.google.knowledge.p4661a.p4662a.C61752n) r11
            int r12 = r11.f166810a
            r12 = r12 | r6
            r11.f166810a = r12
            java.lang.String r12 = "notificationOverridesArgs"
            r11.f166811b = r12
            com.google.knowledge.a.a.h r11 = com.google.knowledge.p4661a.p4662a.C61746h.f166791g
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.knowledge.a.a.g r11 = (com.google.knowledge.p4661a.p4662a.C61745g) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.knowledge.a.a.h r12 = (com.google.knowledge.p4661a.p4662a.C61746h) r12
            int r13 = r12.f166793a
            r13 = r13 | r7
            r12.f166793a = r13
            java.lang.String r13 = "client_type"
            r12.f166796d = r13
            com.google.knowledge.a.a.j r12 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.knowledge.a.a.i r12 = (com.google.knowledge.p4661a.p4662a.C61747i) r12
            com.google.protos.an.e.d r13 = com.google.protos.p4850an.p4865e.C63590d.f172003c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.protos.an.e.c r13 = (com.google.protos.p4850an.p4865e.C63589c) r13
            com.google.protos.an.e.h r14 = com.google.protos.p4850an.p4865e.C63594h.f172008d
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.protos.an.e.e r14 = (com.google.protos.p4850an.p4865e.C63591e) r14
            r14.copyOnWrite()
            com.google.protobuf.bv r15 = r14.instance
            com.google.protos.an.e.h r15 = (com.google.protos.p4850an.p4865e.C63594h) r15
            r15.f172011b = r8
            int r6 = r15.f172010a
            r6 = r6 | r8
            r15.f172010a = r6
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            com.google.protos.an.e.h r6 = (com.google.protos.p4850an.p4865e.C63594h) r6
            r3.getClass()
            int r15 = r6.f172010a
            r15 = r15 | r7
            r6.f172010a = r15
            r6.f172012c = r3
            r13.copyOnWrite()
            com.google.protobuf.bv r3 = r13.instance
            com.google.protos.an.e.d r3 = (com.google.protos.p4850an.p4865e.C63590d) r3
            com.google.protobuf.bv r6 = r14.build()
            com.google.protos.an.e.h r6 = (com.google.protos.p4850an.p4865e.C63594h) r6
            r6.getClass()
            r3.f172006b = r6
            r3.f172005a = r8
            r12.copyOnWrite()
            com.google.protobuf.bv r3 = r12.instance
            com.google.knowledge.a.a.j r3 = (com.google.knowledge.p4661a.p4662a.C61748j) r3
            com.google.protobuf.bv r6 = r13.build()
            com.google.protos.an.e.d r6 = (com.google.protos.p4850an.p4865e.C63590d) r6
            r6.getClass()
            r3.f166803b = r6
            r6 = 6
            r3.f166802a = r6
            r11.copyOnWrite()
            com.google.protobuf.bv r3 = r11.instance
            com.google.knowledge.a.a.h r3 = (com.google.knowledge.p4661a.p4662a.C61746h) r3
            com.google.protobuf.bv r6 = r12.build()
            com.google.knowledge.a.a.j r6 = (com.google.knowledge.p4661a.p4662a.C61748j) r6
            r6.getClass()
            r3.f166797e = r6
            int r6 = r3.f166793a
            r12 = 4
            r6 = r6 | r12
            r3.f166793a = r6
            r10.mo58184c(r11)
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.knowledge.a.a.j r3 = (com.google.knowledge.p4661a.p4662a.C61748j) r3
            com.google.protobuf.bv r6 = r10.build()
            com.google.knowledge.a.a.n r6 = (com.google.knowledge.p4661a.p4662a.C61752n) r6
            r6.getClass()
            r3.f166803b = r6
            r3.f166802a = r7
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.knowledge.a.a.h r3 = (com.google.knowledge.p4661a.p4662a.C61746h) r3
            com.google.protobuf.bv r5 = r5.build()
            com.google.knowledge.a.a.j r5 = (com.google.knowledge.p4661a.p4662a.C61748j) r5
            r5.getClass()
            r3.f166797e = r5
            int r5 = r3.f166793a
            r6 = 4
            r5 = r5 | r6
            r3.f166793a = r5
            r9.mo58184c(r4)
        L_0x0646:
            com.google.protobuf.bv r3 = r9.build()
            com.google.knowledge.a.a.n r3 = (com.google.knowledge.p4661a.p4662a.C61752n) r3
            com.google.assistant.e.j.hd r4 = com.google.assistant.p3897e.p3921j.C52152hd.f136850c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.hc r4 = (com.google.assistant.p3897e.p3921j.C52151hc) r4
            com.google.protobuf.z r3 = r3.toByteString()
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.hd r5 = (com.google.assistant.p3897e.p3921j.C52152hd) r5
            r3.getClass()
            int r6 = r5.f136852a
            r6 = r6 | r8
            r5.f136852a = r6
            r5.f136853b = r3
            com.google.protobuf.bv r3 = r4.build()
            com.google.assistant.e.j.hd r3 = (com.google.assistant.p3897e.p3921j.C52152hd) r3
            com.google.assistant.e.j.ka r4 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.jz r4 = (com.google.assistant.p3897e.p3921j.C52228jz) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.ka r5 = (com.google.assistant.p3897e.p3921j.C52230ka) r5
            int r6 = r5.f137059a
            r6 = r6 | r8
            r5.f137059a = r6
            java.lang.String r6 = "assistant.api.client_input.IntentInput"
            r5.f137060b = r6
            com.google.protobuf.z r3 = r3.toByteString()
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.ka r5 = (com.google.assistant.p3897e.p3921j.C52230ka) r5
            r3.getClass()
            int r6 = r5.f137059a
            r6 = r6 | r7
            r5.f137059a = r6
            r5.f137061c = r3
            com.google.protobuf.bv r3 = r4.build()
            com.google.assistant.e.j.ka r3 = (com.google.assistant.p3897e.p3921j.C52230ka) r3
            com.google.assistant.e.j.du r4 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.ds r4 = (com.google.assistant.p3897e.p3921j.C51803ds) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.du r5 = (com.google.assistant.p3897e.p3921j.C51805du) r5
            int r6 = r5.f135926a
            r6 = r6 | r8
            r5.f135926a = r6
            java.lang.String r6 = "asst_input.INTENT"
            r5.f135927b = r6
            java.lang.String r5 = "intent_input"
            r4.mo53729a(r5, r3)
            com.google.protobuf.bv r3 = r4.build()
            com.google.assistant.e.j.du r3 = (com.google.assistant.p3897e.p3921j.C51805du) r3
            com.google.android.apps.gsa.search.shared.h.h r4 = new com.google.android.apps.gsa.search.shared.h.h
            r4.<init>()
            r4.f236563i = r1
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f285302g
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90145x.f251887g
            boolean r5 = r5.mo79746e(r6)
            r4.f236497A = r5
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f285302g
            com.google.android.apps.gsa.shared.m.f r6 = com.google.android.apps.gsa.shared.p7066m.C90145x.f251884d
            long r5 = r5.mo79743a(r6)
            int r6 = (int) r5
            r4.f236560f = r6
            byte[] r3 = r3.toByteArray()
            r4.f236517U = r3
            com.google.assistant.e.f.d r3 = com.google.assistant.p3897e.p3912f.C51209d.UI_CLICK
            r4.f236557c = r3
            android.os.Bundle r3 = r4.mo81685a()
            com.google.common.base.ax r4 = r0.f285300e
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.search.shared.h.k r4 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r4
            android.content.Context r5 = r0.f285299d
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r4.mo81689c(r5, r3, r6)
            goto L_0x0713
        L_0x06ff:
            r1 = 0
            throw r1
        L_0x0701:
            com.google.common.f.e r3 = f285297c
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "CreateReminder has invalid date or time."
            r5 = 13942(0x3676, float:1.9537E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
        L_0x0713:
            com.google.android.libraries.gsa.k.g r3 = r0.f285301f
            com.google.android.apps.gsa.staticplugins.i.b.a r4 = new com.google.android.apps.gsa.staticplugins.i.b.a
            r4.<init>(r0, r1)
            java.lang.String r1 = "destroy AssistantReminderSessionController"
            r3.mo28212l(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8010i.p8012b.C102246b.mo80297j(long, com.google.android.apps.gsa.search.shared.service.c.b.bb, com.google.common.base.ax):void");
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
