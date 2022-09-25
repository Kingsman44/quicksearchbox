package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.material.bottomsheet.C44565p;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.h */
/* compiled from: PG */
public final class C94321h extends C83907bm {

    /* renamed from: b */
    public static final C59071e f263566b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.h");

    /* renamed from: c */
    public C90021c f263567c;

    /* renamed from: d */
    public C68214a f263568d;

    /* renamed from: e */
    public C92371d f263569e;

    /* renamed from: f */
    public C83893b f263570f;

    /* renamed from: g */
    public C58833ax f263571g;

    /* renamed from: h */
    public C58833ax f263572h;

    /* renamed from: i */
    public C90743b f263573i;

    /* renamed from: j */
    public C22871g f263574j;

    /* renamed from: k */
    public OpaPageLayout f263575k;

    /* renamed from: l */
    C44565p f263576l;

    /* renamed from: m */
    public int f263577m = 0;

    /* renamed from: n */
    public int f263578n = 0;

    /* renamed from: o */
    public boolean f263579o = false;

    /* renamed from: p */
    public C83923j f263580p;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f263575k = (OpaPageLayout) layoutInflater.inflate(R.layout.avocado_consent, (ViewGroup) null);
        Bundle arguments = getArguments();
        arguments.getClass();
        this.f263579o = arguments.getBoolean("is_unicorn_account_key", false);
        C83923j jVar = (C83923j) C90734ar.m148199b(arguments, "device_id_list_key", C83923j.f228570d.getParserForType());
        this.f263580p = jVar;
        C58838bb.m90867b(jVar, "Must supply DeviceScanResult under key %s", "device_id_list_key");
        HeaderLayout headerLayout = (HeaderLayout) this.f263575k.f228728c.findViewById(R.id.opa_header);
        if (this.f263579o) {
            C84018m.m133908c(headerLayout.f228718a, getString(R.string.unicorn_consent_screen_title, new Object[]{this.f263569e.mo87022c()}), TextView.BufferType.NORMAL, headerLayout);
            C84018m.m133908c(headerLayout.f228719b, getString(R.string.unicorn_consent_screen_message, new Object[]{this.f263569e.mo87022c()}), TextView.BufferType.NORMAL, headerLayout);
        } else {
            C84018m.m133908c(headerLayout.f228718a, getString(R.string.consent_screen_title), TextView.BufferType.NORMAL, headerLayout);
            C84018m.m133908c(headerLayout.f228719b, Html.fromHtml(getString(R.string.consent_screen_message)), TextView.BufferType.NORMAL, headerLayout);
        }
        FooterLayout footerLayout = this.f263575k.f228726a;
        footerLayout.mo77362c(2);
        C28295m.m52919e(this.f263575k, new C28292j(62526));
        Button a = footerLayout.mo77360a();
        a.setText(getString(R.string.consent_screen_continue_button_text));
        a.setOnClickListener(new C94302f(this));
        Button b = footerLayout.mo77361b();
        b.setText(getString(R.string.consent_screen_cancel_button_text));
        b.setOnClickListener(new C94320g(this));
        return this.f263575k;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C89849ae aeVar = C89849ae.FACE_MATCH_VALUE_PROP_SCREEN_EXIT;
        if (this.f263577m == 1) {
            aeVar = this.f263578n == 1 ? C89849ae.FACE_MATCH_CONSENT_AGREED : C89849ae.FACE_MATCH_CONSENT_SCREEN_EXIT;
        }
        ((C89859i) this.f263568d.mo27525b()).mo83702b(aeVar);
    }
}
