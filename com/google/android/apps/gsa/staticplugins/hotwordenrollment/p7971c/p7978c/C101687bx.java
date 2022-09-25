package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.p265e.C5114a;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.av.aq;
import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.assistant.settings.features.av.eq;
import com.google.android.apps.gsa.assistant.settings.features.p5702av.C72879n;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83983ah;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101888e;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101890g;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.p3562ao.p3570b.p3571a.p3572a.p3573a.C45593d;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bx */
/* compiled from: PG */
public final class C101687bx {

    /* renamed from: a */
    public final C101674bk f283721a;

    /* renamed from: b */
    public final bh f283722b;

    /* renamed from: c */
    public final C101860a f283723c;

    /* renamed from: d */
    public final ei f283724d;

    /* renamed from: e */
    public final dn f283725e;

    /* renamed from: f */
    public final C90743b f283726f;

    /* renamed from: g */
    public final C101888e f283727g;

    /* renamed from: h */
    public final C101890g f283728h;

    /* renamed from: i */
    public final C89859i f283729i;

    /* renamed from: j */
    public final C101497ae f283730j;

    /* renamed from: k */
    public final boolean f283731k;

    /* renamed from: l */
    public C83975q f283732l = null;

    /* renamed from: m */
    public final int f283733m;

    /* renamed from: n */
    private final C74555u f283734n;

    public C101687bx(C101674bk bkVar, C101644ah ahVar, eq eqVar, C74555u uVar, C101860a aVar, ei eiVar, dn dnVar, C90743b bVar, C101888e eVar, C101890g gVar, C89859i iVar, C101497ae aeVar, boolean z) {
        this.f283721a = bkVar;
        bh bhVar = ahVar.f283627b;
        bhVar = bhVar == null ? bh.c : bhVar;
        this.f283722b = bhVar;
        this.f283734n = uVar;
        this.f283723c = aVar;
        this.f283724d = eiVar;
        this.f283725e = dnVar;
        this.f283726f = bVar;
        this.f283727g = eVar;
        this.f283728h = gVar;
        this.f283729i = iVar;
        this.f283730j = aeVar;
        this.f283733m = eqVar.a(bhVar.a == 2 ? (String) bhVar.b : BuildConfig.FLAVOR, 1, aeVar.f283244a.f284137d.get());
        this.f283731k = z;
    }

    /* renamed from: f */
    private final ItemView m168235f(String str, int i) {
        ItemView itemView = new ItemView(this.f283721a.requireContext());
        itemView.p(str);
        itemView.h(i);
        return itemView;
    }

    /* renamed from: a */
    public final ar mo92493a() {
        aq createBuilder = ar.f.createBuilder();
        C45595b i = dn.i(this.f283734n.mo70883a());
        createBuilder.copyOnWrite();
        ar arVar = createBuilder.instance;
        arVar.b = i.f119929nK;
        arVar.a |= 1;
        C45593d b = this.f283727g.mo92668b();
        createBuilder.copyOnWrite();
        ar arVar2 = createBuilder.instance;
        arVar2.c = b.f119162e;
        arVar2.a |= 2;
        return createBuilder.build();
    }

    /* renamed from: b */
    public final void mo92494b() {
        this.f283729i.mo83702b(C89849ae.VOICE_MATCH_SLA_CONSENT_DECLINE);
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), this.f283721a);
    }

    /* renamed from: c */
    public final void mo92495c(OpaPageLayout opaPageLayout) {
        String str;
        OpaPageLayout opaPageLayout2 = opaPageLayout;
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout2.findViewById(R.id.opa_header);
        Resources resources = opaPageLayout.getResources();
        boolean g = this.f283730j.mo92334g();
        String str2 = BuildConfig.FLAVOR;
        if (g) {
            Object[] objArr = new Object[2];
            objArr[0] = this.f283730j.mo92329b();
            ei eiVar = this.f283724d;
            bh bhVar = this.f283722b;
            objArr[1] = eiVar.d(bhVar.a == 2 ? (String) bhVar.b : str2);
            str = resources.getString(R.string.structure_level_voice_match_consent_header_title_kid, objArr);
        } else {
            Object[] objArr2 = new Object[1];
            ei eiVar2 = this.f283724d;
            bh bhVar2 = this.f283722b;
            objArr2[0] = eiVar2.d(bhVar2.a == 2 ? (String) bhVar2.b : str2);
            str = resources.getString(R.string.structure_level_voice_match_consent_header_title, objArr2);
        }
        C84018m.m133908c(headerLayout.f228718a, str, TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.structure_level_voice_match_consent_header_description, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        mo92497e();
        ((LottieAnimationView) opaPageLayout2.findViewById(R.id.hotword_intro_animation)).setVisibility(8);
        C83983ah.m133842b(opaPageLayout2, new C101676bm(this)).mo77412a();
        opaPageLayout2.findViewById(R.id.consent_details_section_header).d();
        opaPageLayout2.findViewById(R.id.consent_details_forewarning_item).o(this.f283721a.getResources().getText(R.string.structure_level_voice_match_consent_forewarning_item_text));
        if (this.f283730j.mo92334g()) {
            String b = this.f283730j.mo92329b();
            String c = this.f283730j.mo92330c();
            opaPageLayout2.findViewById(R.id.consent_details_identification_item).o(C5114a.m13988b(Locale.getDefault(), this.f283721a.getString(R.string.structure_level_voice_match_consent_identification_item_text_kid, b), "GENDER", c));
            opaPageLayout2.findViewById(R.id.consent_details_privacy_item).o(C5114a.m13988b(Locale.getDefault(), this.f283721a.getString(R.string.structure_level_voice_match_consent_privacy_item_text_kid), "GENDER", c));
            opaPageLayout2.findViewById(R.id.consent_details_retention_item).o(C5114a.m13988b(Locale.getDefault(), this.f283721a.getString(R.string.structure_level_voice_match_consent_retention_item_text_kid, b), "GENDER", c));
            opaPageLayout2.findViewById(R.id.consent_details_forewarning_item).o(C5114a.m13988b(Locale.getDefault(), this.f283721a.getString(R.string.structure_level_voice_match_consent_forewarning_item_text_kid, b), new Object[0]));
            opaPageLayout2.findViewById(R.id.consent_device_list_section_header).c(this.f283721a.getString(R.string.structure_level_voice_match_consent_device_list_section_header_kid, b));
            ((TextView) opaPageLayout2.findViewById(R.id.consent_assurance_text)).setText(this.f283721a.getString(R.string.structure_level_voice_match_consent_assurance_text_kid, b));
        }
        LinearLayout linearLayout = (LinearLayout) opaPageLayout2.findViewById(R.id.consent_device_list);
        linearLayout.addView(m168235f(this.f283721a.getString(R.string.structure_level_voice_match_consent_future_devices_hint), R.drawable.quantum_ic_google_home_devices_grey600_24));
        ei eiVar3 = this.f283724d;
        bh bhVar3 = this.f283722b;
        if (bhVar3.a == 2) {
            str2 = (String) bhVar3.b;
        }
        for (C72879n nVar : eiVar3.j(str2, 1)) {
            linearLayout.addView(m168235f(nVar.mo64575c(), nVar.mo64573a()));
        }
        opaPageLayout2.findViewById(R.id.consent_screen_views_container).setVisibility(0);
        if (this.f283727g.mo92669c()) {
            FrameLayout frameLayout = (FrameLayout) opaPageLayout2.findViewById(R.id.server_side_consent_container);
            frameLayout.addView(this.f283728h.mo92670a(this.f283721a.getContext()));
            frameLayout.setVisibility(0);
            opaPageLayout2.findViewById(R.id.local_consent_container).setVisibility(8);
            opaPageLayout2.findViewById(R.id.consent_assurance_text).setVisibility(8);
        } else {
            opaPageLayout2.findViewById(R.id.local_consent_container).setVisibility(0);
        }
        if (this.f283726f.mo85090c()) {
            C90743b.m148214a(headerLayout.f228718a, 500);
        }
    }

    /* renamed from: d */
    public final void mo92496d() {
        this.f283729i.mo83702b(C89849ae.VOICE_MATCH_SLA_CONSENT_ACCEPT);
        C47393f.m84236g(new C101783w(), this.f283721a);
    }

    /* renamed from: e */
    public final void mo92497e() {
        C83975q qVar = this.f283732l;
        if (qVar != null) {
            qVar.mo77406g();
            this.f283732l = null;
        }
    }
}
