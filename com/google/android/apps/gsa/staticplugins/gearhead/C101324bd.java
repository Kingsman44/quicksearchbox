package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.android.apps.auto.p450a.p451a.C8898bp;
import com.google.android.apps.auto.p450a.p451a.C8899bq;
import com.google.android.apps.gsa.projection.C84190d;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.gearhead.sdk.assistant.C142657c;
import com.google.android.gearhead.sdk.assistant.CarAssistantSetting;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.bd */
/* compiled from: PG */
final class C101324bd extends C142657c {

    /* renamed from: a */
    final /* synthetic */ C101325be f282742a;

    public C101324bd(C101325be beVar) {
        this.f282742a = beVar;
    }

    /* renamed from: b */
    public final void mo92228b() {
        ((C58970a) ((C58970a) C101325be.f282743a.mo56224b()).mo56372aa(19980)).mo56386p("close()");
        this.f282742a.mo92237n("close()", new C101323bc(this));
    }

    /* renamed from: c */
    public final void mo92229c(byte[] bArr) {
        C8899bq bqVar;
        try {
            bqVar = (C8899bq) C62942bv.parseFrom((C62942bv) C8899bq.f30897b, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) C101325be.f282743a.mo56226d()).mo56382g(e)).mo56372aa(19983)).mo56386p("sendGearheadEvent failed");
            bqVar = null;
        }
        if (bqVar != null) {
            C8898bp a = C8898bp.m23511a(bqVar.f30899a);
            if (a == null) {
                a = C8898bp.EVENT_TYPE_UNSPECIFIED;
            }
            C101325be.m167594o(a);
        }
    }

    /* renamed from: d */
    public final void mo92230d() {
        ((C58970a) ((C58970a) C101325be.f282743a.mo56224b()).mo56372aa(19988)).mo56386p("stopVoiceSession()");
        C101325be beVar = this.f282742a;
        beVar.mo92236m(new C101306aq(beVar), "stopOrDequeueVoiceSessionInternal");
    }

    /* renamed from: e */
    public final void mo92231e() {
        ((C58970a) ((C58970a) C101325be.f282743a.mo56226d()).mo56372aa(19984)).mo56386p("setSetting() not implemented");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r5 != 9) goto L_0x00b7;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92232f(com.google.android.gearhead.sdk.assistant.VoiceSessionConfig r10, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot r11, com.google.android.gearhead.sdk.assistant.C142664j r12) {
        /*
            r9 = this;
            com.google.common.f.a.d r0 = com.google.android.apps.gsa.staticplugins.gearhead.C101325be.f282743a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "startVoiceSession()"
            r2 = 19985(0x4e11, float:2.8005E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            if (r11 != 0) goto L_0x0019
            com.google.android.apps.gsa.staticplugins.gearhead.be r10 = r9.f282742a
            com.google.android.libraries.search.logging.d.kp r10 = r10.f282747D
            java.lang.String r11 = "NULL_CLIENT_STATE_SNAPSHOT"
            r10.mo41687b(r11)
            goto L_0x0043
        L_0x0019:
            com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot r0 = r11.f387107c
            if (r0 != 0) goto L_0x0027
            com.google.android.apps.gsa.staticplugins.gearhead.be r10 = r9.f282742a
            com.google.android.libraries.search.logging.d.kp r10 = r10.f282747D
            java.lang.String r11 = "NULL_GEARHEAD_STATE_SNAPSHOT"
            r10.mo41687b(r11)
            goto L_0x0043
        L_0x0027:
            int r0 = r0.f387108a
            r1 = 2
            if (r0 == r1) goto L_0x0036
            com.google.android.apps.gsa.staticplugins.gearhead.be r10 = r9.f282742a
            com.google.android.libraries.search.logging.d.kp r10 = r10.f282747D
            java.lang.String r11 = "INVALID_UI_MODE"
            r10.mo41687b(r11)
            goto L_0x0043
        L_0x0036:
            boolean r0 = r10.f387138i
            if (r0 != 0) goto L_0x0051
            com.google.android.apps.gsa.staticplugins.gearhead.be r10 = r9.f282742a
            com.google.android.libraries.search.logging.d.kp r10 = r10.f282747D
            java.lang.String r11 = "FUSION_NOT_REQUESTED"
            r10.mo41687b(r11)
        L_0x0043:
            com.google.common.f.a.d r10 = com.google.android.apps.gsa.staticplugins.gearhead.C101325be.f282743a
            com.google.common.f.x r10 = r10.mo56225c()
            java.lang.String r11 = "Only Car Projection with Fusion is supported"
            r12 = 19986(0x4e12, float:2.8006E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r12)).mo56386p(r11)
            return
        L_0x0051:
            com.google.android.apps.gsa.staticplugins.gearhead.be r0 = r9.f282742a
            int r2 = r10.f387135f
            r3 = 1
            r4 = 4
            if (r2 != r4) goto L_0x005b
            goto L_0x0102
        L_0x005b:
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97465ak
            int r5 = r10.f387130a
            r6 = 3
            if (r5 == r3) goto L_0x00ac
            if (r5 == r1) goto L_0x00a9
            if (r5 == r6) goto L_0x00a6
            if (r5 == r4) goto L_0x0099
            r6 = 5
            if (r5 == r6) goto L_0x0087
            r6 = 8
            if (r5 == r6) goto L_0x00a9
            com.google.common.f.a.d r5 = com.google.android.apps.gsa.staticplugins.gearhead.C101325be.f282743a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5
            r6 = 19995(0x4e1b, float:2.8019E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5
            java.lang.String r6 = "AppFlow logging unsupported AAP voice session type: %d"
            int r7 = r10.f387130a
            r5.mo56387q(r6, r7)
            goto L_0x00b7
        L_0x0087:
            int r5 = r10.f387135f
            if (r5 == r6) goto L_0x0096
            r6 = 6
            if (r5 == r6) goto L_0x0093
            r6 = 9
            if (r5 == r6) goto L_0x0096
            goto L_0x00b7
        L_0x0093:
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97554cT
            goto L_0x00b7
        L_0x0096:
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97486bE
            goto L_0x00b7
        L_0x0099:
            com.google.android.apps.auto.a.a.bp r2 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.C11793d.m27457a(r10)
            com.google.android.libraries.search.b.i.c r2 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.C11793d.m27458b(r2)
            if (r2 != 0) goto L_0x00b7
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97464aj
            goto L_0x00b7
        L_0x00a6:
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97619df
            goto L_0x00b7
        L_0x00a9:
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97462ah
            goto L_0x00b7
        L_0x00ac:
            int r5 = r10.f387135f
            if (r5 != r3) goto L_0x00b3
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97461ag
            goto L_0x00b7
        L_0x00b3:
            if (r5 != r6) goto L_0x00b7
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97460af
        L_0x00b7:
            g.a.a r5 = r0.f282795y
            java.lang.Object r5 = r5.mo17428b()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00ff
            com.google.android.libraries.search.b.i.a r2 = r2.mo40779c()
            long r5 = r10.f387136g
            j$.time.Duration r5 = p3186j$.time.Duration.ofMillis(r5)
            long r5 = r5.toNanos()
            com.google.android.libraries.f.a r7 = r0.f282775e
            long r7 = r7.mo26872d()
            long r5 = r5 + r7
            com.google.android.libraries.f.a r7 = r0.f282775e
            long r7 = r7.mo26870b()
            j$.time.Duration r7 = p3186j$.time.Duration.ofMillis(r7)
            long r7 = r7.toNanos()
            long r5 = r5 - r7
            r2.mo40791o(r5)
            r0.mo92234k(r2)
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97616dc
            com.google.android.libraries.f.a r5 = r0.f282775e
            long r5 = r5.mo26872d()
            com.google.android.libraries.search.b.i.a r2 = r2.mo40811d(r5)
            r0.mo92234k(r2)
            goto L_0x0102
        L_0x00ff:
            r0.mo92234k(r2)
        L_0x0102:
            int r0 = r10.f387135f
            if (r0 != r4) goto L_0x010d
            com.google.android.apps.gsa.staticplugins.gearhead.be r0 = r9.f282742a
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97683ey
            r0.mo92234k(r2)
        L_0x010d:
            java.lang.String r0 = "Tell me the latest news"
            java.lang.String r2 = r10.f387132c
            boolean r0 = r0.equals(r2)
            r2 = 0
            if (r0 == 0) goto L_0x0147
            com.google.android.apps.gsa.staticplugins.gearhead.be r0 = r9.f282742a
            com.google.android.apps.gsa.search.core.i.t r0 = r0.f282776f
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250440dF
            boolean r0 = r0.mo79746e(r5)
            if (r0 != 0) goto L_0x0147
            com.google.common.o.uf r0 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.tz r0 = (com.google.common.p4552o.C60548tz) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r5 = r4.f164093a
            r1 = r1 | r5
            r4.f164093a = r1
            r1 = 86480(0x151d0, float:1.21184E-40)
            r4.f164258m = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r2, r2, r2)
            goto L_0x01a0
        L_0x0147:
            com.google.android.apps.gsa.staticplugins.gearhead.be r0 = r9.f282742a
            g.a.a r0 = r0.f282793w
            java.lang.Object r0 = r0.mo17428b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01a0
            android.os.Bundle r0 = r10.f387137h
            if (r0 == 0) goto L_0x01a0
            int r1 = r10.f387130a
            if (r1 != r4) goto L_0x0177
            java.lang.String r1 = "DIRECT_QUERY_FROM_GEARHEAD_ID"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0177
            com.google.android.apps.gsa.staticplugins.gearhead.be r0 = r9.f282742a
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b r0 = r0.f282790t
            android.os.Bundle r5 = r10.f387137h
            long r5 = r5.getLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0.f37596f = r1
        L_0x0177:
            android.os.Bundle r0 = r10.f387137h
            java.lang.String r1 = "IS_SEND_FEEDBACK_QUERY"
            boolean r0 = r0.getBoolean(r1)
            if (r0 == 0) goto L_0x01a0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.voicesearch.USER_INITIALIZED_FEEDBACK"
            r0.<init>(r1)
            int r1 = r10.f387130a
            if (r1 != r4) goto L_0x018e
            r1 = 1
            goto L_0x018f
        L_0x018e:
            r1 = 0
        L_0x018f:
            java.lang.String r4 = "com.google.android.voicesearch.IS_DIRECT_ACTION"
            r0.putExtra(r4, r1)
            com.google.android.apps.gsa.staticplugins.gearhead.be r1 = r9.f282742a
            com.google.android.apps.gsa.staticplugins.gearhead.ax r4 = new com.google.android.apps.gsa.staticplugins.gearhead.ax
            r4.<init>(r9, r0)
            java.lang.String r0 = "startActivity() for feedback initialization intent"
            r1.mo92237n(r0, r4)
        L_0x01a0:
            com.google.android.apps.gsa.staticplugins.gearhead.be r0 = r9.f282742a
            r0.f282750G = r2
            r0 = 1520(0x5f0, float:2.13E-42)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r0)
            com.google.android.apps.gsa.staticplugins.gearhead.be r0 = r9.f282742a
            r0.f282755L = r12
            com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot r12 = r11.f387107c
            if (r12 == 0) goto L_0x01d1
            androidx.c.o r12 = r12.f387112e
            if (r12 != 0) goto L_0x01b6
            goto L_0x01d1
        L_0x01b6:
            java.lang.Object r12 = r12.mo3726e(r3)
            java.lang.String r12 = (java.lang.String) r12
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x01d1
            android.content.SharedPreferences r0 = r0.f282774d
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "opa_on_auto_sticky_media_app"
            android.content.SharedPreferences$Editor r12 = r0.putString(r1, r12)
            r12.apply()
        L_0x01d1:
            com.google.android.apps.gsa.staticplugins.gearhead.be r12 = r9.f282742a
            g.a.a r12 = r12.f282745B
            java.lang.Object r12 = r12.mo17428b()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x01fb
            com.google.android.apps.gsa.staticplugins.gearhead.be r12 = r9.f282742a
            com.google.android.apps.gsa.staticplugins.gearhead.projected.i r12 = r12.f282784n
            com.google.common.util.concurrent.cx r12 = r12.mo92253a()
            com.google.android.apps.gsa.staticplugins.gearhead.be r0 = r9.f282742a
            com.google.android.libraries.gsa.k.g r0 = r0.f282788r
            com.google.android.apps.gsa.staticplugins.gearhead.ay r1 = com.google.android.apps.gsa.staticplugins.gearhead.C101314ay.f282728a
            com.google.android.apps.gsa.shared.util.c.ag r2 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r3 = "Stop Prewarm Assistant"
            r2.<init>(r12, r0, r3, r1)
            com.google.android.apps.gsa.staticplugins.gearhead.az r12 = com.google.android.apps.gsa.staticplugins.gearhead.C101315az.f282729a
            r2.mo85223a(r12)
        L_0x01fb:
            com.google.android.apps.gsa.staticplugins.gearhead.be r12 = r9.f282742a
            boolean r12 = r12.mo92242t()
            if (r12 == 0) goto L_0x0224
            com.google.android.apps.gsa.staticplugins.gearhead.be r12 = r9.f282742a
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.b r12 = r12.f282789s
            com.google.common.util.concurrent.cx r12 = r12.mo20077a()
            com.google.android.apps.gsa.staticplugins.gearhead.be r0 = r9.f282742a
            com.google.android.libraries.gsa.k.g r0 = r0.f282788r
            com.google.android.apps.gsa.staticplugins.gearhead.ba r1 = new com.google.android.apps.gsa.staticplugins.gearhead.ba
            r1.<init>(r9, r10, r11)
            com.google.android.apps.gsa.shared.util.c.ag r2 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r3 = "#Prewarm Assistant"
            r2.<init>(r12, r0, r3, r1)
            com.google.android.apps.gsa.staticplugins.gearhead.bb r12 = new com.google.android.apps.gsa.staticplugins.gearhead.bb
            r12.<init>(r9, r10, r11)
            r2.mo85223a(r12)
            return
        L_0x0224:
            com.google.android.apps.gsa.staticplugins.gearhead.be r12 = r9.f282742a
            r12.mo92239q(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.gearhead.C101324bd.mo92232f(com.google.android.gearhead.sdk.assistant.VoiceSessionConfig, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot, com.google.android.gearhead.sdk.assistant.j):void");
    }

    /* renamed from: a */
    public final CarAssistantSetting mo92227a(int i) {
        CarAssistantSetting carAssistantSetting = new CarAssistantSetting();
        carAssistantSetting.f387094a = i;
        boolean z = true;
        switch (i) {
            case 1:
                C101330bj bjVar = this.f282742a.f282779i;
                if (!bjVar.f282813c || !bjVar.f282814d) {
                    z = false;
                }
                carAssistantSetting.f387095b = z;
                return carAssistantSetting;
            case 2:
                C84190d dVar = this.f282742a.f282754K;
                if (!dVar.f229175a.mo79746e(C90086ek.f250444dJ) || !dVar.mo77657a()) {
                    z = false;
                }
                carAssistantSetting.f387095b = z;
                return carAssistantSetting;
            case 3:
                carAssistantSetting.f387097d = C58837ba.m90858g(this.f282742a.f282777g.mo79659F());
                return carAssistantSetting;
            case 4:
            case 6:
                carAssistantSetting.f387095b = true;
                return carAssistantSetting;
            case 5:
                C101325be beVar = this.f282742a;
                carAssistantSetting.f387097d = beVar.f282785o.d(C58837ba.m90858g(beVar.f282777g.mo79659F())).toLanguageTag();
                return carAssistantSetting;
            case 7:
                carAssistantSetting.f387095b = this.f282742a.mo92241s();
                return carAssistantSetting;
            case 8:
                C101325be beVar2 = this.f282742a;
                ((C58970a) ((C58970a) C101325be.f282743a.mo56224b()).mo56372aa(20040)).mo56389s("isTranscriptionThroughAssistantEnabled: %b", Boolean.valueOf(beVar2.f282776f.mo79746e(C90086ek.f250320as)));
                carAssistantSetting.f387095b = beVar2.f282776f.mo79746e(C90086ek.f250320as);
                return carAssistantSetting;
            case 9:
                carAssistantSetting.f387095b = ((Boolean) this.f282742a.f282792v.mo17428b()).booleanValue();
                return carAssistantSetting;
            case 10:
                carAssistantSetting.f387095b = ((Boolean) this.f282742a.f282794x.mo17428b()).booleanValue();
                return carAssistantSetting;
            default:
                ((C58970a) ((C58970a) C101325be.f282743a.mo56226d()).mo56372aa(19977)).mo56386p("getSetting() not implemented");
                return carAssistantSetting;
        }
    }
}
