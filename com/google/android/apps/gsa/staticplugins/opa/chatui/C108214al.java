package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105939at;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105940au;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.al */
/* compiled from: PG */
public final class C108214al implements C108211ai {

    /* renamed from: a */
    private static final C59071e f300983a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.al");

    /* renamed from: b */
    private final C108230ba f300984b;

    /* renamed from: c */
    private final C108213ak f300985c;

    /* renamed from: d */
    private final C108303dt f300986d;

    /* renamed from: e */
    private final C91097g f300987e;

    /* renamed from: f */
    private final SharedPreferences f300988f;

    /* renamed from: g */
    private final C86054o f300989g;

    /* renamed from: h */
    private final C109790aj f300990h;

    /* renamed from: i */
    private final C107698i f300991i;

    /* renamed from: j */
    private final C86124t f300992j;

    public C108214al(C108230ba baVar, C108213ak akVar, C108303dt dtVar, C91097g gVar, C86054o oVar, SharedPreferences sharedPreferences, C109790aj ajVar, C107698i iVar, C86124t tVar) {
        this.f300984b = baVar;
        this.f300985c = akVar;
        this.f300986d = dtVar;
        this.f300987e = gVar;
        this.f300989g = oVar;
        this.f300988f = sharedPreferences;
        this.f300990h = ajVar;
        this.f300991i = iVar;
        this.f300992j = tVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0133  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96592a(com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj r7, java.lang.String r8, java.util.Map r9) {
        /*
            r6 = this;
            java.lang.String r0 = "S.query"
            com.google.android.apps.gsa.staticplugins.opa.chatui.dt r1 = r6.f300986d
            java.lang.String r2 = r7.f301037s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0011
            java.lang.String[] r5 = new java.lang.String[r4]
            r5[r3] = r2
            r1.mo96758u(r5)
        L_0x0011:
            r7.f301033o = r3
            int r7 = r8.hashCode()
            r1 = -2062973216(0xffffffff850986e0, float:-6.466482E-36)
            r2 = 2
            if (r7 == r1) goto L_0x003c
            r1 = -258276855(0xfffffffff09b0209, float:-3.837811E29)
            if (r7 == r1) goto L_0x0032
            r1 = 1668304045(0x63704cad, float:4.4327437E21)
            if (r7 == r1) goto L_0x0028
            goto L_0x0046
        L_0x0028:
            java.lang.String r7 = "LockscreenPermissionPromoDecline"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0046
            r7 = 1
            goto L_0x0047
        L_0x0032:
            java.lang.String r7 = "LockscreenPermissionPromo"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0046
            r7 = 0
            goto L_0x0047
        L_0x003c:
            java.lang.String r7 = "AcknowledgeDisclosuresAction"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0046
            r7 = 2
            goto L_0x0047
        L_0x0046:
            r7 = -1
        L_0x0047:
            java.lang.String r8 = "opa_lockscreen_permission_promo_not_needed"
            r1 = 0
            if (r7 == 0) goto L_0x0133
            if (r7 == r4) goto L_0x0125
            if (r7 == r2) goto L_0x0052
            goto L_0x0124
        L_0x0052:
            com.google.android.apps.gsa.search.core.google.gaia.o r7 = r6.f300989g
            android.accounts.Account r7 = r7.mo79668a()
            if (r7 != 0) goto L_0x006a
            android.content.SharedPreferences r7 = r6.f300988f
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r8 = "opa_has_acknowledged_third_party_disclosures"
            android.content.SharedPreferences$Editor r7 = r7.putBoolean(r8, r4)
            r7.apply()
            goto L_0x0070
        L_0x006a:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.aj r8 = r6.f300990h
            r2 = 3
            r8.mo98128j(r7, r2)
        L_0x0070:
            com.google.android.apps.gsa.search.core.i.t r7 = r6.f300992j
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247245dX
            boolean r7 = r7.mo79746e(r8)
            if (r7 != 0) goto L_0x007c
            goto L_0x0124
        L_0x007c:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r7 = r6.f300984b
            boolean r8 = r7 instanceof com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g
            if (r8 == 0) goto L_0x0124
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r7 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r7
            com.google.common.base.ax r7 = r7.mo100833bf()
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r7 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r7
            boolean r7 = r7.mo100908dj()
            if (r7 == 0) goto L_0x0124
            java.lang.String r7 = "ZeroStateActionData"
            boolean r8 = r9.containsKey(r7)
            if (r8 == 0) goto L_0x0124
            java.lang.Object r7 = r9.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            com.google.common.l.i r8 = com.google.common.p4541l.C59326i.f157516d     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            byte[] r7 = r8.mo56836k(r7)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            r8.<init>(r7)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            r7.<init>(r8)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            java.lang.Object r8 = r7.readObject()     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            r7.close()     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            boolean r7 = r8 instanceof java.util.Map     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            if (r7 == 0) goto L_0x00d1
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            boolean r7 = r8.containsKey(r0)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            if (r7 == 0) goto L_0x00d1
            java.lang.Object r7 = r8.get(r0)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
            java.lang.String r8 = "UTF-8"
            java.lang.String r1 = p3186j$.net.URLDecoder.decode(r7, r8)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0117 }
        L_0x00d1:
            if (r1 == 0) goto L_0x0124
            com.google.android.apps.gsa.staticplugins.opa.chatui.ak r7 = r6.f300985c
            if (r7 == 0) goto L_0x00da
            r7.mo96598a()
        L_0x00da:
            com.google.assistant.e.j.du r7 = com.google.android.apps.gsa.staticplugins.opa.p8378m.C109460f.m182157a(r1)
            com.google.android.apps.gsa.search.shared.service.b.oy r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy.f238174g
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.ox r8 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox) r8
            com.google.protobuf.z r7 = r7.toByteString()
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.search.shared.service.b.oy r9 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r9
            r7.getClass()
            int r0 = r9.f238176a
            r0 = r0 | r4
            r9.f238176a = r0
            r9.f238177b = r7
            com.google.protobuf.bv r7 = r8.build()
            com.google.android.apps.gsa.search.shared.service.b.oy r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r7
            com.google.android.apps.gsa.search.shared.service.j r8 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r9 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_CLIENT_INPUT
            r8.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r9)
            com.google.protobuf.bt r9 = com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow.f238173a
            r8.mo82014b(r9, r7)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r7 = r8.mo82013a()
            com.google.android.apps.gsa.staticplugins.opa.az.i r8 = r6.f300991i
            r8.mo96219b(r7)
            return
        L_0x0117:
            com.google.common.f.e r7 = f300983a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "Could not Base64-decode Zero state action data."
            r9 = 23944(0x5d88, float:3.3553E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)
        L_0x0124:
            return
        L_0x0125:
            android.content.SharedPreferences r7 = r6.f300988f
            android.content.SharedPreferences$Editor r7 = r7.edit()
            android.content.SharedPreferences$Editor r7 = r7.putBoolean(r8, r4)
            r7.apply()
            return
        L_0x0133:
            android.content.SharedPreferences r7 = r6.f300988f
            android.content.SharedPreferences$Editor r7 = r7.edit()
            android.content.SharedPreferences$Editor r7 = r7.putBoolean(r8, r4)
            r7.apply()
            com.google.android.apps.gsa.opaonboarding.am r7 = com.google.android.apps.gsa.opaonboarding.C83880an.m133553o()
            r8 = r7
            com.google.android.apps.gsa.opaonboarding.g r8 = (com.google.android.apps.gsa.opaonboarding.C83940g) r8
            java.lang.String r9 = "opa_android:hotword_training_and_lockscreen_permission"
            r8.f228605a = r9
            com.google.android.apps.gsa.opaonboarding.e r9 = new com.google.android.apps.gsa.opaonboarding.e
            r9.<init>(r3, r1, r1)
            r8.f228607c = r9
            com.google.common.o.a.w r8 = com.google.common.p4552o.p4553a.C59567w.f158058g
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.common.o.a.v r8 = (com.google.common.p4552o.p4553a.C59566v) r8
            com.google.android.apps.gsa.assistant.b.a.b r9 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.OPA_HOTWORD_TRAINING
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.common.o.a.w r0 = (com.google.common.p4552o.p4553a.C59567w) r0
            int r9 = r9.f32835aq
            r0.f158062c = r9
            int r9 = r0.f158060a
            r9 = r9 | r2
            r0.f158060a = r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.common.o.a.w r8 = (com.google.common.p4552o.p4553a.C59567w) r8
            r7.mo77222b(r8)
            com.google.android.apps.gsa.opaonboarding.an r7 = r7.mo77221a()
            android.content.Intent r7 = r7.mo77240n()
            com.google.android.apps.gsa.shared.util.t.g r8 = r6.f300987e
            r8.mo65089a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.C108214al.mo96592a(com.google.android.apps.gsa.staticplugins.opa.chatui.aj, java.lang.String, java.util.Map):void");
    }

    /* renamed from: b */
    public final void mo96593b(C108212aj ajVar) {
        C108303dt dtVar = this.f300986d;
        C60870cx f = dtVar.mo96744f(ajVar);
        if (f != null) {
            C105952bf bfVar = (C105952bf) dtVar.f301271b.mo27525b();
            int i = ajVar.f301039u;
            C58976aa aaVar = C58975e.f156826a;
            new C90873ag(f, bfVar.f295807c, "HistoryStore:Update", new C105939at(bfVar, i)).mo85223a(new C105940au(i));
        }
    }

    /* renamed from: c */
    public final void mo96594c(int i) {
        if (this.f300984b.mo95401al() && i == 0) {
            this.f300984b.mo95413ax();
        }
    }
}
