package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.features.p5777z.p5778a.C73551a;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84031z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C50181no;
import com.google.common.base.C58831av;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.gk */
/* compiled from: PG */
public final class C108719gk extends C83907bm {

    /* renamed from: b */
    public static final C59071e f302341b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.gk");

    /* renamed from: c */
    public C83893b f302342c;

    /* renamed from: d */
    public C108623cw f302343d;

    /* renamed from: e */
    public C73551a f302344e;

    /* renamed from: f */
    public C22871g f302345f;

    /* renamed from: g */
    private C83973o f302346g;

    /* renamed from: h */
    private LegacyOpaStandardPage f302347h;

    /* renamed from: g */
    private final C50181no m180823g() {
        byte[] byteArray = ((Bundle) C58831av.m90830c(getArguments(), Bundle.EMPTY)).getByteArray("home-automation-provider");
        if (byteArray == null) {
            C59104x c = f302341b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "3pAuthFrag");
            ((C59052c) ((C59052c) c).mo56372aa(24230)).mo56389s("#getHomeAutomationProviderFromArgs: Couldn't find provider in fragment bundle %s", getArguments());
            return null;
        }
        try {
            C50181no noVar = (C50181no) C62942bv.parseFrom((C62942bv) C50181no.f130444i, byteArray, C62921ba.m95368a());
            C58976aa aaVar = C58975e.f156826a;
            return noVar;
        } catch (C62974ct unused) {
            C59104x c2 = f302341b.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "3pAuthFrag");
            ((C59052c) ((C59052c) c2).mo56372aa(24229)).mo56386p("#getHomeAutomationProviderFromArgs: provider invalid in fragment bundle");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo97079e(C50181no noVar) {
        Intent a = this.f302344e.mo65043a(noVar, (Account) this.f302342c.mo77278a().mo56111f());
        if (a == null) {
            C59104x c = f302341b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "3pAuthFrag");
            ((C59052c) ((C59052c) c).mo56372aa(24233)).mo56386p("no valid account linking mechanism.");
            mo77318iT().mo77313b();
            return;
        }
        startActivityForResult(a, 111);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (i == 111) {
            if (i2 == -1) {
                C59104x b = f302341b.mo56224b();
                b.mo56378ag(C58975e.f156826a, "3pAuthFrag");
                ((C59052c) ((C59052c) b).mo56372aa(24235)).mo56386p("sending settings ui update request after 3p auth to get immediate consistency.");
                if (m180823g() != null) {
                    new C90873ag(this.f302343d.mo97033c(), this.f302345f, "HA Sync Result", C108714gf.f302339a).mo85223a(C108715gg.f302340a);
                }
                mo77318iT().mo77312a();
                return;
            }
            C89949q.m146525j(C108607cg.m180627a(15), (C60321oe) null, (C63196b) null, (String) null);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C58976aa aaVar = C58975e.f156826a;
        getActivity();
        C50181no g = m180823g();
        if (g == null) {
            C59104x c = f302341b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "3pAuthFrag");
            ((C59052c) ((C59052c) c).mo56372aa(24226)).mo56386p("no valid HA provider");
            mo77318iT().mo77313b();
            return null;
        } else if (((Bundle) C58831av.m90830c(getArguments(), Bundle.EMPTY)).getBoolean("skip-upsell")) {
            mo97079e(g);
            return null;
        } else {
            LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.third_party_upsell, (ViewGroup) null);
            this.f302347h = legacyOpaStandardPage;
            C28295m.m52919e(legacyOpaStandardPage, new C28292j(44604));
            String str = g.f130447b;
            if (C58837ba.m90859h(str)) {
                C59104x c2 = f302341b.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "3pAuthFrag");
                ((C59052c) ((C59052c) c2).mo56372aa(24238)).mo56386p("no valid auth url");
                mo77318iT().mo77313b();
            } else {
                LegacyOpaStandardPage legacyOpaStandardPage2 = this.f302347h;
                String string = getString(R.string.third_party_auth_title, new Object[]{str});
                HeaderLayout headerLayout = legacyOpaStandardPage2.f228723b;
                C84018m.m133908c(headerLayout.f228718a, string, TextView.BufferType.NORMAL, headerLayout);
                LegacyOpaStandardPage legacyOpaStandardPage3 = this.f302347h;
                String string2 = getString(R.string.third_party_auth_explanation, new Object[]{str});
                HeaderLayout headerLayout2 = legacyOpaStandardPage3.f228723b;
                C84018m.m133908c(headerLayout2.f228719b, string2, TextView.BufferType.NORMAL, headerLayout2);
                this.f302347h.f228725d.mo77360a().setOnClickListener(new C89943l(new C108712gd(this, g)));
                this.f302347h.f228725d.mo77361b().setOnClickListener(new C89943l(new C108713ge(this)));
                LegacyOpaStandardPage legacyOpaStandardPage4 = this.f302347h;
                C84031z zVar = legacyOpaStandardPage4.f228724c;
                C83973o oVar = new C83973o(zVar.f228892o, zVar.f228888k, new C108718gj());
                oVar.mo77402c();
                oVar.mo77403d();
                legacyOpaStandardPage4.mo77366a();
                this.f302346g = oVar;
            }
            return this.f302347h;
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f302346g;
        if (oVar != null) {
            oVar.mo77406g();
        }
        this.f302346g = null;
    }
}
