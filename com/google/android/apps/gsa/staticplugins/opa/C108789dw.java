package com.google.android.apps.gsa.staticplugins.opa;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83613ab;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac;
import com.google.android.apps.gsa.search.shared.p6930h.C87559b;
import com.google.android.apps.gsa.search.shared.p6941ui.C88523c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108326eo;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109100ar;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109105b;
import com.google.android.apps.gsa.staticplugins.opa.inproducthelp.ChatUiHelpController;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C52334nx;
import com.google.assistant.p3897e.p3921j.C52336nz;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.dw */
/* compiled from: PG */
final class C108789dw extends C88523c {

    /* renamed from: a */
    final /* synthetic */ C109040fj f302516a;

    /* renamed from: b */
    private boolean f302517b = false;

    public C108789dw(C109040fj fjVar) {
        this.f302516a = fjVar;
    }

    /* renamed from: i */
    private final void m180937i(int i) {
        C109040fj fjVar = this.f302516a;
        if (fjVar.f303370cb) {
            fjVar.mo97542o();
            this.f302516a.mo97490az(false);
            this.f302516a.mo97414B();
            this.f302516a.mo97431S(true);
            this.f302516a.mo97459aU();
        } else {
            fjVar.mo97498bH(false, true, false, i);
        }
        this.f302517b = true;
    }

    /* renamed from: a */
    public final void mo82145a() {
        C59071e eVar = C109040fj.f303210a;
        C58976aa aaVar = C58975e.f156826a;
        this.f302516a.f303320ba.mo100765i();
        this.f302516a.mo97459aU();
        if (!this.f302516a.f303267aa.mo82125f() || this.f302516a.f303455t.mo79746e(C90014bt.f247091ac)) {
            this.f302516a.mo97544q();
        }
        this.f302516a.f303218D.mo96344a(4);
    }

    /* renamed from: b */
    public final void mo82146b() {
        C59071e eVar = C109040fj.f303210a;
        C58976aa aaVar = C58975e.f156826a;
        if (C113987f.m188690a(this.f302516a.f303455t)) {
            this.f302516a.f303238X.mo96155ag();
        }
        C109105b bVar = this.f302516a.f303323bd;
        if (bVar.mo97615g()) {
            C109100ar arVar = bVar.f303830g;
            arVar.getClass();
            arVar.mo97592h(false);
            C109100ar arVar2 = bVar.f303830g;
            arVar2.getClass();
            arVar2.mo97597m();
        } else if (bVar.mo97614f()) {
            C108326eo eoVar = new C108326eo(bVar.f303827d);
            eoVar.f301334a = bVar.f303825b.getString(R.string.opa_lockhart_oobe_tap_mic_to_talk);
            bVar.f303824a.mo95430s(eoVar);
        } else if (bVar.f303833j == C113984c.UPGRADED_USER_WITH_TIMEOUT_TO_QUERY_SUGGESTION) {
            bVar.f303836m = 5;
        } else if (bVar.mo97616h()) {
            C109100ar arVar3 = bVar.f303830g;
            arVar3.getClass();
            arVar3.f303782o.setVisibility(4);
        }
    }

    /* renamed from: c */
    public final void mo82147c() {
        C59071e eVar = C109040fj.f303210a;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f302516a.f303238X.mo96129aB()) {
            this.f302516a.mo97462aX(0);
        }
        C109040fj fjVar = this.f302516a;
        if (fjVar.f303315bV.f300678a && fjVar.f303259aS) {
            fjVar.f303230P.setVisibility(0);
            this.f302516a.f303225K.mo95259k(8);
        }
        if (C109040fj.m181378bx(this.f302516a.f303450o) && this.f302516a.f303455t.mo79746e(C90014bt.f247769nR)) {
            ((C113989h) ((C113988g) this.f302516a.f303450o).mo100833bf().mo56107c()).mo100890cf();
            if (C113987f.m188690a(this.f302516a.f303455t)) {
                this.f302516a.f303238X.mo96156ah();
            }
        }
        C109105b bVar = this.f302516a.f303323bd;
        if (bVar.mo97615g()) {
            C109100ar arVar = bVar.f303830g;
            arVar.getClass();
            arVar.mo97592h(true);
            C109100ar arVar2 = bVar.f303830g;
            arVar2.getClass();
            arVar2.mo97597m();
        } else if (bVar.mo97614f()) {
            C108326eo eoVar = new C108326eo(bVar.f303827d);
            eoVar.f301334a = bVar.f303825b.getString(R.string.opa_lockhart_oobe_listening);
            bVar.f303824a.mo95430s(eoVar);
        } else if (bVar.mo97616h()) {
            C109100ar arVar3 = bVar.f303830g;
            arVar3.getClass();
            arVar3.mo97598n();
        }
    }

    /* renamed from: d */
    public final void mo82148d() {
        C59071e eVar = C109040fj.f303210a;
        C58976aa aaVar = C58975e.f156826a;
        C109040fj fjVar = this.f302516a;
        if (fjVar.f303315bV.f300678a && fjVar.f303259aS) {
            fjVar.f303230P.setVisibility(8);
            this.f302516a.f303225K.mo95259k(0);
        }
    }

    /* renamed from: e */
    public final void mo82149e() {
        this.f302516a.f303450o.mo95396ag();
        if (!this.f302516a.f303455t.mo79746e(C90014bt.f247760nI)) {
            this.f302516a.f303450o.mo95375Q(false);
        }
        ((C87559b) this.f302516a.f303443h.mo56107c()).mo81680a();
        this.f302516a.f303218D.mo96344a(4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0253  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82150f() {
        /*
            r9 = this;
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            dagger.a r0 = r0.f303313bT
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.mf r0 = (com.google.android.apps.gsa.staticplugins.opa.C109467mf) r0
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_TEXT_QUERY_TIMEOUT
            r0.mo97847b(r1)
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.v.t r0 = r0.f303320ba
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_NO_SPEECH_DETECTED
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            r0.mo100764h(r1, r2, r2, r2)
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            com.google.android.apps.gsa.search.core.i.t r0 = r0.f303455t
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247161bt
            com.google.common.b.gu r0 = r0.mo79745c(r1)
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.util.ca r1 = r1.f303393cy
            java.lang.String r1 = r1.f315214a
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x003c
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.fl r0 = r0.f303444i
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_AUTO_TIMER
            r0.mo95167z(r1)
            return
        L_0x003c:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.av.a r1 = r0.f303274ah
            android.os.Bundle r0 = r0.f303442g
            boolean r0 = r1.mo96078e(r0)
            if (r0 != 0) goto L_0x0283
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            android.os.Bundle r0 = r0.f303442g
            boolean r0 = com.google.android.apps.gsa.staticplugins.opa.C109040fj.m181376bn(r0)
            if (r0 == 0) goto L_0x005d
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            com.google.android.apps.gsa.search.core.i.t r0 = r0.f303455t
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247685ln
            boolean r0 = r0.mo79746e(r1)
            goto L_0x0065
        L_0x005d:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            android.os.Bundle r1 = r0.f303442g
            boolean r0 = r0.mo97495bE(r1)
        L_0x0065:
            if (r0 == 0) goto L_0x006c
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            r0.mo97487aw()
        L_0x006c:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            android.os.Bundle r0 = r0.f303442g
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142268aP(r0)
            r1 = 2
            if (r0 == 0) goto L_0x008a
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.ay.as r0 = r0.f303238X
            boolean r0 = r0.mo96131aD()
            if (r0 != 0) goto L_0x0082
            goto L_0x008a
        L_0x0082:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.ay.as r0 = r0.f303238X
            r0.mo96141aN(r1)
            return
        L_0x008a:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.af.x r0 = r0.f303324be
            boolean r0 = r0.mo95321b()
            if (r0 == 0) goto L_0x0095
            return
        L_0x0095:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r0 = r0.f303323bd
            boolean r0 = r0.mo97613e()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00c6
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r4 = r0.f303323bd
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r4 = r4.f303833j
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r5 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_VIDEO
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ba
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f303455t
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247439hF
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x00ba
            goto L_0x00c4
        L_0x00ba:
            com.google.android.apps.gsa.search.core.i.t r0 = r0.f303455t
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247156bo
            boolean r0 = r0.mo79746e(r4)
            if (r0 != 0) goto L_0x00c6
        L_0x00c4:
            r0 = 1
            goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            com.google.android.apps.gsa.staticplugins.opa.fj r4 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r4 = r4.f303450o
            com.google.android.apps.gsa.staticplugins.opa.chatui.id r4 = r4.mo95424m()
            boolean r4 = r4.f301560g
            com.google.android.apps.gsa.staticplugins.opa.fj r5 = r9.f302516a
            com.google.android.apps.gsa.search.core.i.t r5 = r5.f303455t
            com.google.android.apps.gsa.shared.m.h r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247465hf
            com.google.common.b.gu r5 = r5.mo79745c(r6)
            com.google.android.apps.gsa.staticplugins.opa.fj r6 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.util.ca r6 = r6.f303393cy
            java.lang.String r6 = r6.f315214a
            boolean r5 = com.google.common.p4522b.C58557jl.m90139t(r5, r6)
            com.google.android.apps.gsa.staticplugins.opa.fj r6 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r6 = r6.f303450o
            boolean r6 = r6.mo95399aj()
            if (r6 == 0) goto L_0x00fc
            com.google.android.apps.gsa.staticplugins.opa.fj r6 = r9.f302516a
            android.os.Bundle r7 = r6.f303442g
            boolean r6 = r6.mo97495bE(r7)
            if (r6 == 0) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            r6 = 0
            goto L_0x00fd
        L_0x00fc:
            r6 = 1
        L_0x00fd:
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r9.f302516a
            com.google.android.apps.gsa.search.core.i.t r7 = r7.f303455t
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247685ln
            boolean r7 = r7.mo79746e(r8)
            if (r7 == 0) goto L_0x0112
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r9.f302516a
            android.os.Bundle r7 = r7.f303442g
            boolean r7 = com.google.android.apps.gsa.staticplugins.opa.C109040fj.m181376bn(r7)
            r6 = r6 | r7
        L_0x0112:
            if (r5 != 0) goto L_0x013a
            com.google.android.apps.gsa.staticplugins.opa.fj r5 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.ey r5 = r5.f303275ai
            com.google.android.apps.gsa.staticplugins.opa.ey r7 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_CONVERSATION
            if (r5 == r7) goto L_0x013a
            if (r6 == 0) goto L_0x013a
            com.google.android.apps.gsa.staticplugins.opa.fj r5 = r9.f302516a
            boolean r5 = r5.mo97519bk()
            if (r5 != 0) goto L_0x013a
            com.google.android.apps.gsa.staticplugins.opa.fj r5 = r9.f302516a
            boolean r6 = r5.f303259aS
            if (r6 != 0) goto L_0x013a
            boolean r5 = r5.mo97527bu()
            if (r5 != 0) goto L_0x013a
            boolean r5 = r9.f302517b
            if (r5 != 0) goto L_0x013a
            if (r4 != 0) goto L_0x013a
            r4 = 1
            goto L_0x013b
        L_0x013a:
            r4 = 0
        L_0x013b:
            if (r4 == 0) goto L_0x015f
            com.google.common.o.uf r5 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.tz r5 = (com.google.common.p4552o.C60548tz) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6
            int r7 = r6.f164093a
            r1 = r1 | r7
            r6.f164093a = r1
            r1 = 1401(0x579, float:1.963E-42)
            r6.f164258m = r1
            com.google.protobuf.bv r1 = r5.build()
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            r5 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r1, r5, r5, r5)
        L_0x015f:
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.av.a r5 = r1.f303274ah
            android.os.Bundle r1 = r1.f303442g
            boolean r1 = r5.mo96077d(r1)
            if (r1 == 0) goto L_0x0172
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            android.app.Activity r1 = r1.f303441f
            r1.finish()
        L_0x0172:
            if (r4 == 0) goto L_0x0182
            if (r0 != 0) goto L_0x0182
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.ac.r r0 = r0.f303262aV
            boolean r0 = r0.mo95240v()
            if (r0 != 0) goto L_0x0182
            r0 = 1
            goto L_0x0183
        L_0x0182:
            r0 = 0
        L_0x0183:
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247611kS
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x01b2
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.au.q r4 = r1.f303239Y
            if (r4 == 0) goto L_0x01b2
            if (r0 == 0) goto L_0x01e9
            boolean r5 = r4.f299365p
            if (r5 != 0) goto L_0x01e9
            android.view.ViewGroup r1 = r1.f303449n
            r4.mo96066a(r1)
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90024cc.f248135f
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x01e9
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            r1.mo97503bM()
            goto L_0x01e9
        L_0x01b2:
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247686lo
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x01e9
            if (r0 == 0) goto L_0x01e9
            r1 = 17
            r9.m180937i(r1)
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            r1.mo97452aN(r3)
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            dagger.a r1 = r1.f303374cf
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.cy r1 = (com.google.android.apps.gsa.staticplugins.opa.util.C113870cy) r1
            com.google.assistant.e.j.hd r1 = r1.mo100735a()
            com.google.android.apps.gsa.staticplugins.opa.fj r4 = r9.f302516a
            dagger.a r4 = r4.f303374cf
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.cy r4 = (com.google.android.apps.gsa.staticplugins.opa.util.C113870cy) r4
            com.google.android.apps.gsa.staticplugins.opa.fj r4 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.az.i r4 = r4.f303454s
            com.google.android.apps.gsa.staticplugins.opa.util.C113870cy.m188506b(r1, r4)
        L_0x01e9:
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247684lm
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x021e
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248396D
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x0211
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r1 = r1.f303323bd
            if (r1 == 0) goto L_0x0211
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = r1.f303833j
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r4 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.NEST_PROMO_SUGGESTION
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x021e
        L_0x0211:
            if (r0 == 0) goto L_0x021e
            r0 = 14
            r9.m180937i(r0)
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            r1 = 7
            r0.mo97506bP(r1)
        L_0x021e:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r9.f302516a
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r0 = r0.f303323bd
            r0.f303834k = r2
            com.google.android.apps.gsa.staticplugins.opa.greeting.ar r1 = r0.f303830g
            if (r1 == 0) goto L_0x0249
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FRE_INPUT_PLATE_QUERY_SUGGESTION_TIMEOUT
            r1.mo97594j(r4)
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f303791x
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247438hE
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x0249
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r4 = r1.f303788u
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r5 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_VIDEO
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0249
            r1.mo97602r()
            com.google.android.apps.gsa.staticplugins.opa.dm r1 = r1.f303763ab
            r1.mo97162b()
        L_0x0249:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = r0.f303833j
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r4 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_VIDEO
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x026c
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f303827d
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247438hE
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x025e
            goto L_0x0283
        L_0x025e:
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f303827d
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247439hF
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0283
            r0.mo97609a(r3)
            return
        L_0x026c:
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f303827d
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247156bo
            boolean r1 = r1.mo79746e(r3)
            if (r1 != 0) goto L_0x0283
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f303827d
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247257dj
            boolean r1 = r1.mo79746e(r3)
            if (r1 == 0) goto L_0x0283
            r0.mo97609a(r2)
        L_0x0283:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C108789dw.mo82150f():void");
    }

    /* renamed from: g */
    public final void mo82151g() {
        int i;
        this.f302516a.f303314bU.mo101383a();
        C58976aa aaVar = C58975e.f156826a;
        C109040fj fjVar = this.f302516a;
        ChatUiHelpController chatUiHelpController = fjVar.f303460y;
        boolean z = false;
        if (chatUiHelpController == null || chatUiHelpController.f304448i.f137376e) {
            fjVar.f303320ba.mo100765i();
            C58833ax axVar = C58836b.f156633a;
            if (this.f302516a.f303455t.mo79746e(C90014bt.f247244dW)) {
                axVar = C58833ax.m90834k(Long.valueOf(C90719ac.f253778a.f253779b.nextLong()));
            }
            this.f302516a.mo97540m(C89849ae.OPA_MIC_TAP, (Long) axVar.mo56111f());
            this.f302516a.mo97439aA();
            this.f302516a.f303281ao.putInt("android.opa.extra.TRIGGERED_BY", 44);
            Bundle bundle = this.f302516a.f303281ao;
            C83613ab abVar = (C83613ab) C83614ac.f227951e.createBuilder();
            e eVar = e.w;
            abVar.copyOnWrite();
            C83614ac acVar = (C83614ac) abVar.instance;
            acVar.f227955c = eVar.ca;
            acVar.f227953a |= 2;
            abVar.copyOnWrite();
            C83614ac acVar2 = (C83614ac) abVar.instance;
            acVar2.f227954b = 1;
            acVar2.f227953a |= 1;
            bundle.putByteArray("android.opa.extra.OPEN_MIC_EVENT_DATA", ((C83614ac) abVar.build()).toByteArray());
            this.f302516a.mo97551x(axVar);
            this.f302516a.f303218D.mo96344a(4);
            if (this.f302516a.f303455t.mo79746e(C90014bt.f247303ec) && !((C107759j) this.f302516a.f303375cg.mo27525b()).f299830a.get()) {
                this.f302516a.mo97509ba();
            }
            C109040fj fjVar2 = this.f302516a;
            if (fjVar2.f303371cc && fjVar2.f303455t.mo79746e(C90126fx.f251276fk)) {
                C109040fj fjVar3 = this.f302516a;
                fjVar3.f303308bO = true;
                fjVar3.f303444i.mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_OTHER);
                if (this.f302516a.f303238X.mo96131aD()) {
                    this.f302516a.f303238X.mo96198z(com.google.android.apps.gsa.assistant.shared.p.e.h);
                }
                this.f302516a.mo97462aX(0);
            }
        } else if (chatUiHelpController.f304449j && (i = chatUiHelpController.f304450k) >= 0 && i < chatUiHelpController.f304446g.size()) {
            int b = C52336nz.m86575b(((C52334nx) chatUiHelpController.f304446g.get(chatUiHelpController.f304450k)).f137359e);
            if (b != 0 && b == 3 && !chatUiHelpController.f304448i.f137376e) {
                z = true;
            }
            chatUiHelpController.f304451l = z;
        }
    }

    /* renamed from: h */
    public final void mo82152h() {
        C59071e eVar = C109040fj.f303210a;
        C58976aa aaVar = C58975e.f156826a;
        this.f302516a.mo97540m(C89849ae.OPA_STOP_RECORDING_CLICKED, (Long) null);
        this.f302516a.mo97459aU();
        this.f302516a.f303218D.mo96344a(4);
    }
}
