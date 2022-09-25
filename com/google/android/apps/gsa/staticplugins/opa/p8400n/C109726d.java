package com.google.android.apps.gsa.staticplugins.opa.p8400n;

import com.google.android.apps.gsa.opa.C83580ak;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3917i.p3918a.C51555ma;
import com.google.assistant.p3897e.p3917i.p3918a.C51556mb;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.n.d */
/* compiled from: PG */
public final class C109726d implements C83580ak {

    /* renamed from: a */
    private static final C59071e f305685a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.n.d");

    /* renamed from: b */
    private final C21370a f305686b;

    /* renamed from: c */
    private final C68214a f305687c;

    /* renamed from: d */
    private final C68214a f305688d;

    /* renamed from: e */
    private C51556mb f305689e;

    /* renamed from: f */
    private long f305690f = -1;

    public C109726d(C21370a aVar, C68214a aVar2, C68214a aVar3) {
        this.f305686b = aVar;
        this.f305687c = aVar2;
        this.f305688d = aVar3;
    }

    /* renamed from: i */
    private final C51555ma m182680i(String str) {
        for (C51555ma maVar : m182681j().f134375a) {
            C51809dy dyVar = maVar.f134371b;
            if (dyVar == null) {
                dyVar = C51809dy.f135933f;
            }
            if (dyVar.f135936b.equals(str)) {
                return maVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    private final C51556mb m182681j() {
        C51556mb mbVar = this.f305689e;
        if (mbVar != null) {
            return mbVar;
        }
        byte[] e = ((C86338r) this.f305687c.mo27525b()).mo80079e(mo98050g(), (byte[]) null);
        if (e != null) {
            try {
                return (C51556mb) C62942bv.parseFrom((C62942bv) C51556mb.f134373b, e);
            } catch (C62974ct unused) {
                C59104x d = f305685a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OpaStartUpDisplayHelper");
                ((C59052c) ((C59052c) d).mo56372aa(24068)).mo56386p("Attempted to read malformed StartUpDisplayParams from shared prefs.");
                mo76921b();
                return this.f305689e;
            }
        } else {
            C51556mb mbVar2 = C51556mb.f134373b;
            this.f305689e = mbVar2;
            return mbVar2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fb A[RETURN] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.assistant.p3897e.p3921j.C51809dy m182682k(java.lang.String r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r2 = "OpaStartUpDisplayHelper"
            com.google.assistant.e.i.a.ma r3 = r18.m182680i(r19)
            r4 = 0
            if (r3 != 0) goto L_0x000c
            return r4
        L_0x000c:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            com.google.assistant.e.j.so r5 = r3.f134370a
            if (r5 != 0) goto L_0x0014
            com.google.assistant.e.j.so r5 = com.google.assistant.p3897e.p3921j.C52460so.f137714d
        L_0x0014:
            long r5 = r5.f137717b
            long r5 = r0.toMillis(r5)
            com.google.android.libraries.f.a r0 = r1.f305686b
            long r7 = r0.mo26870b()
            long r9 = r1.f305690f
            r11 = -1
            r13 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x002b
            goto L_0x003b
        L_0x002b:
            dagger.a r0 = r1.f305687c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.r r0 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r0
            java.lang.String r9 = r18.mo98051h()
            long r9 = r0.getLong(r9, r13)
        L_0x003b:
            dagger.a r0 = r1.f305687c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.r r0 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r0
            dagger.a r15 = r1.f305688d
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r15 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r15
            java.lang.String r15 = r15.mo79659F()
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r11 = "opa_active_media_session_data_"
            java.lang.String r11 = r11.concat(r15)
            byte[] r0 = r0.mo80079e(r11, r4)
            if (r0 == 0) goto L_0x00e8
            com.google.android.apps.gsa.staticplugins.opa.audio.b r11 = com.google.android.apps.gsa.staticplugins.opa.audio.C107617b.f299379e     // Catch:{ ct -> 0x00d5 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r11, (byte[]) r0)     // Catch:{ ct -> 0x00d5 }
            r11 = r0
            com.google.android.apps.gsa.staticplugins.opa.audio.b r11 = (com.google.android.apps.gsa.staticplugins.opa.audio.C107617b) r11     // Catch:{ ct -> 0x00d5 }
            java.lang.String r0 = "ui.SHOW_HISTORY"
            com.google.assistant.e.i.a.ma r0 = r1.m182680i(r0)     // Catch:{ ct -> 0x00d5 }
            if (r0 != 0) goto L_0x0073
        L_0x0070:
            r16 = -1
            goto L_0x00cc
        L_0x0073:
            com.google.assistant.e.j.dy r0 = r0.f134371b     // Catch:{ ct -> 0x00b8 }
            if (r0 != 0) goto L_0x0079
            com.google.assistant.e.j.dy r0 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f     // Catch:{ ct -> 0x00b8 }
        L_0x0079:
            com.google.assistant.e.j.dw r0 = r0.f135938d     // Catch:{ ct -> 0x00b8 }
            if (r0 != 0) goto L_0x007f
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ ct -> 0x00b8 }
        L_0x007f:
            com.google.protobuf.cq r0 = r0.f135932a     // Catch:{ ct -> 0x00b8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ ct -> 0x00b8 }
        L_0x0085:
            boolean r12 = r0.hasNext()     // Catch:{ ct -> 0x00b8 }
            if (r12 == 0) goto L_0x0070
            java.lang.Object r12 = r0.next()     // Catch:{ ct -> 0x00b8 }
            com.google.assistant.e.j.kc r12 = (com.google.assistant.p3897e.p3921j.C52232kc) r12     // Catch:{ ct -> 0x00b8 }
            java.lang.String r15 = "show_history_args"
            java.lang.String r13 = r12.f137065b     // Catch:{ ct -> 0x00b8 }
            boolean r13 = r15.equals(r13)     // Catch:{ ct -> 0x00b8 }
            if (r13 == 0) goto L_0x00b5
            com.google.assistant.e.j.ka r0 = r12.f137066c     // Catch:{ ct -> 0x00b8 }
            if (r0 != 0) goto L_0x00a1
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x00b8 }
        L_0x00a1:
            com.google.protobuf.z r0 = r0.f137061c     // Catch:{ ct -> 0x00b8 }
            com.google.assistant.e.j.agq r12 = com.google.assistant.p3897e.p3921j.agq.f135069b     // Catch:{ ct -> 0x00b8 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r12, (com.google.protobuf.C63088z) r0)     // Catch:{ ct -> 0x00b8 }
            com.google.assistant.e.j.agq r0 = (com.google.assistant.p3897e.p3921j.agq) r0     // Catch:{ ct -> 0x00b8 }
            if (r0 == 0) goto L_0x00b0
            long r12 = r0.f135071a     // Catch:{ ct -> 0x00b8 }
            goto L_0x00b2
        L_0x00b0:
            r12 = 0
        L_0x00b2:
            r16 = r12
            goto L_0x00cc
        L_0x00b5:
            r13 = 0
            goto L_0x0085
        L_0x00b8:
            r0 = move-exception
            com.google.common.f.e r12 = f305685a     // Catch:{ ct -> 0x00d5 }
            com.google.common.f.x r12 = r12.mo56225c()     // Catch:{ ct -> 0x00d5 }
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x00d5 }
            r12.mo56378ag(r13, r2)     // Catch:{ ct -> 0x00d5 }
            java.lang.String r13 = "Failed to parse ui.THIRD_PARTY_START_INDICATOR clientOp."
            r14 = 24067(0x5e03, float:3.3725E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56382g(r0)).mo56372aa(r14)).mo56386p(r13)     // Catch:{ ct -> 0x00d5 }
            goto L_0x0070
        L_0x00cc:
            long r12 = r11.f299383c     // Catch:{ ct -> 0x00d5 }
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00e8
            long r13 = r11.f299382b     // Catch:{ ct -> 0x00d5 }
            goto L_0x00ea
        L_0x00d5:
            r0 = move-exception
            com.google.common.f.e r11 = f305685a
            com.google.common.f.x r11 = r11.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r2)
            java.lang.String r2 = "Invalid MediaSessionData proto stored in sharedpref."
            r12 = 24066(0x5e02, float:3.3724E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56382g(r0)).mo56372aa(r12)).mo56386p(r2)
        L_0x00e8:
            r13 = 0
        L_0x00ea:
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x00ef
            r9 = r13
        L_0x00ef:
            long r7 = r7 - r9
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fb
            com.google.assistant.e.j.dy r0 = r3.f134371b
            if (r0 != 0) goto L_0x00fa
            com.google.assistant.e.j.dy r0 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x00fa:
            return r0
        L_0x00fb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8400n.C109726d.m182682k(java.lang.String):com.google.assistant.e.j.dy");
    }

    /* renamed from: a */
    public final C51809dy mo76920a() {
        return m182682k("ui.THIRD_PARTY_START_INDICATOR");
    }

    /* renamed from: b */
    public final void mo76921b() {
        this.f305689e = C51556mb.f134373b;
        this.f305690f = 0;
        C86337q b = ((C86338r) this.f305687c.mo27525b()).mo80076b();
        b.mo80075j(mo98051h());
        b.mo80075j(mo98050g());
        b.apply();
    }

    /* renamed from: c */
    public final void mo76922c(byte[] bArr) {
        try {
            this.f305689e = (C51556mb) C62942bv.parseFrom((C62942bv) C51556mb.f134373b, bArr);
            this.f305690f = this.f305686b.mo26870b();
            C86337q b = ((C86338r) this.f305687c.mo27525b()).mo80076b();
            b.mo80072g(mo98051h(), this.f305690f);
            b.mo80068c(mo98050g(), bArr);
            b.apply();
        } catch (C62974ct e) {
            C59104x d = f305685a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaStartUpDisplayHelper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(24069)).mo56386p("Failed to parse StartUpDisplayParams proto.");
        }
    }

    /* renamed from: d */
    public final boolean mo76923d() {
        return !C51556mb.f134373b.equals(m182681j());
    }

    /* renamed from: e */
    public final boolean mo76924e() {
        return m182682k("ui.SHOW_HISTORY") != null;
    }

    /* renamed from: f */
    public final boolean mo76925f() {
        return m182682k("ui.THIRD_PARTY_START_INDICATOR") != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo98050g() {
        return "opa_start_up_display_params_".concat(String.valueOf(((C86054o) this.f305688d.mo27525b()).mo79659F()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final String mo98051h() {
        return "opa_start_up_display_params_timestamp_".concat(String.valueOf(((C86054o) this.f305688d.mo27525b()).mo79659F()));
    }
}
