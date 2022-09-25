package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

import android.databinding.C0118a;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.speech.hotword.p7282a.C92349f;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44534d;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.t */
/* compiled from: PG */
public final /* synthetic */ class C102220t implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102226z f285226a;

    public /* synthetic */ C102220t(C102226z zVar) {
        this.f285226a = zVar;
    }

    public final void onClick(View view) {
        ContextThemeWrapper contextThemeWrapper;
        int i;
        C102226z zVar = this.f285226a;
        if (!zVar.f285242f.mo92957D()) {
            zVar.mo93011c(view);
            return;
        }
        View view2 = zVar.f285238b.getView();
        C102230s sVar = zVar.f285251o;
        sVar.mo93023e();
        View view3 = sVar.f285265a;
        int height = view3 instanceof OpaPageLayout ? ((OpaPageLayout) view3).f228726a.getHeight() : -1;
        if (view2 == null || height < 0) {
            C59104x c = C102226z.f285236a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VMConsentFragmentPeer");
            C0118a.m96d(c, "View is null or footer is null when trying to setup and show the bottom sheet.", 20641, C58979ad.FULL);
            return;
        }
        C59104x b = C102226z.f285236a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VMConsentFragmentPeer");
        ((C59052c) ((C59052c) b).mo56372aa(20642)).mo56386p("setupAndShowBottomSheet");
        int height2 = view2.getHeight();
        zVar.mo93013e(C89849ae.VOICE_MATCH_BOTTOM_SHEET_CONSENT_SCREEN_START);
        View inflate = zVar.f285238b.getActivity().getLayoutInflater().inflate(R.layout.hotword_enrollment_voice_match_consent_opa_bottomsheet_content, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.consent_bottom_title)).setText(zVar.f285242f.mo92965e());
        ((TextView) inflate.findViewById(R.id.consent_bottom_message)).setText(R.string.opa_hotword_tisid_bottom_sheet_summary_enrollment);
        zVar.mo93016h((TextView) inflate.findViewById(R.id.hotword_intro_legal_text));
        if (zVar.f285242f.mo92988y()) {
            zVar.mo93017i(inflate);
        }
        if (zVar.f285239c.mo70886d().mo70847a() != ac.b || !zVar.f285254r.mo93971b()) {
            contextThemeWrapper = zVar.f285238b.getActivity();
        } else {
            contextThemeWrapper = new ContextThemeWrapper(zVar.f285238b.getActivity(), 2132150743);
            if (C44534d.m78715b()) {
                contextThemeWrapper.getTheme().applyStyle(2132150627, true);
            }
        }
        zVar.f285253q = new C92349f(contextThemeWrapper, height2, height);
        zVar.f285253q.setContentView(inflate);
        FooterLayout footerLayout = zVar.f285253q.f257463k;
        footerLayout.mo77362c(2);
        footerLayout.mo77363d(true);
        Button a = footerLayout.mo77360a();
        a.setText(R.string.hotword_enrollment_voice_match_allow);
        Button b2 = footerLayout.mo77361b();
        if (zVar.f285244h.mo92337j()) {
            i = R.string.hotword_enrollment_voice_match_no_thanks;
        } else {
            i = zVar.f285242f.mo92962b();
        }
        b2.setText(i);
        b2.setOnClickListener(new C102222v(zVar, view));
        a.setOnClickListener(new C102223w(zVar, view));
        if (zVar.f285240d.f253818a.isEnabled()) {
            C92349f fVar = zVar.f285253q;
            fVar.getClass();
            fVar.mo86996a(zVar.f285241e);
        }
        C92349f fVar2 = zVar.f285253q;
        fVar2.getClass();
        fVar2.show();
    }
}
