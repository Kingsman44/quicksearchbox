package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.assistant.shared.l.t;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8443o.C110308s;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110419f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.Collections;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.ah */
/* compiled from: PG */
public final class C110197ah extends C83907bm {

    /* renamed from: b */
    public static final C59071e f307061b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.j.ah");

    /* renamed from: c */
    public C83893b f307062c;

    /* renamed from: d */
    public C68214a f307063d;

    /* renamed from: e */
    public C68214a f307064e;

    /* renamed from: f */
    public C110419f f307065f;

    /* renamed from: g */
    public C69464a f307066g;

    /* renamed from: h */
    boolean f307067h;

    /* renamed from: i */
    public C110199aj f307068i;

    /* renamed from: j */
    OpaPageLayout f307069j;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.getClass();
        C110199aj ajVar = (C110199aj) C90734ar.m148199b(arguments, "args", C110199aj.f307070c.getParserForType());
        C58838bb.m90867b(ajVar, "Must supply TrustedFragmentArgs under key %s", "args");
        this.f307068i = ajVar;
        this.f307067h = this.f307065f.f307772a.getBoolean("key_personal_response_has_shown".concat(String.valueOf(((Account) this.f307062c.mo77278a().mo56107c()).name)), false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.trusted_devices, (ViewGroup) null);
        this.f307069j = opaPageLayout;
        C28295m.m52919e(opaPageLayout, new C28292j(58297));
        HeaderLayout headerLayout = (HeaderLayout) this.f307069j.f228728c.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.trusted_dock_title_string, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.trusted_dock_message_string, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        OpaPageLayout opaPageLayout2 = this.f307069j;
        opaPageLayout2.getClass();
        FooterLayout footerLayout = opaPageLayout2.f228726a;
        footerLayout.mo77362c(2);
        C84018m.m133907b(footerLayout.mo77360a(), R.string.s_oobe_action_text, footerLayout);
        C84018m.m133907b(footerLayout.mo77361b(), R.string.s_oobe_cancel_text, footerLayout);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C110193ad(this)));
        footerLayout.mo77361b().setOnClickListener(new C89943l(new C110194ae(this)));
        OpaPageLayout opaPageLayout3 = this.f307069j;
        opaPageLayout3.getClass();
        ((TextView) opaPageLayout3.findViewById(R.id.trusted_devices_learn_more)).setOnClickListener(new C110196ag(this));
        OpaPageLayout opaPageLayout4 = this.f307069j;
        opaPageLayout4.getClass();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) opaPageLayout4.findViewById(R.id.trusted_devices_illustration_transition);
        OpaPageLayout opaPageLayout5 = this.f307069j;
        opaPageLayout5.getClass();
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) opaPageLayout5.findViewById(R.id.trusted_devices_illustration);
        if (this.f307067h) {
            lottieAnimationView.mo9689a(new C110195af(lottieAnimationView2, lottieAnimationView));
            lottieAnimationView.mo9695f();
        } else {
            lottieAnimationView2.setVisibility(0);
            lottieAnimationView.setVisibility(8);
            lottieAnimationView2.mo9695f();
        }
        return this.f307069j;
    }

    public final void onResume() {
        super.onResume();
        Account account = (Account) this.f307062c.mo77278a().mo56107c();
        C110308s sVar = (C110308s) this.f307063d.mo27525b();
        t tVar = this.f307068i.f307073b;
        if (tVar == null) {
            tVar = t.d;
        }
        String f = sVar.mo98558f(account.name);
        if (sVar.mo98556d(Collections.unmodifiableList(sVar.mo98557e(f).instance.a), tVar.b) == null) {
            sVar.mo98559g(f, tVar);
        }
    }
}
