package com.google.android.apps.gsa.staticplugins.opaonboarding.p8663g;

import android.accounts.Account;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.opaonboarding.personalresults.C83952c;
import com.google.android.apps.gsa.opaonboarding.personalresults.PersonalResultsPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101496ad;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.g.v */
/* compiled from: PG */
public final class C115904v extends C83907bm {

    /* renamed from: b */
    public static final C59071e f321367b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opaonboarding.g.v");

    /* renamed from: c */
    public C92371d f321368c;

    /* renamed from: d */
    public C58833ax f321369d;

    /* renamed from: e */
    public C83893b f321370e;

    /* renamed from: f */
    public C22871g f321371f;

    /* renamed from: g */
    public l f321372g;

    /* renamed from: h */
    public C68214a f321373h;

    /* renamed from: i */
    public C83952c f321374i;

    /* renamed from: j */
    private String f321375j;

    /* renamed from: k */
    private C83973o f321376k;

    /* renamed from: l */
    private C101495ac f321377l;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo102310e(boolean z) {
        C89849ae aeVar;
        new C90873ag(this.f321374i.mo77356a(this.f321377l, this.f321375j, getActivity(), (Account) this.f321370e.mo77278a().mo56111f(), z).mo77355a(), this.f321371f, "updateAndRecordPersonalResults", new C115899q(this)).mo85223a(new C115900r(this));
        if (z) {
            aeVar = C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_PR_ENABLED;
        } else {
            aeVar = C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_PR_DISABLED;
        }
        ((C89859i) this.f321373h.mo27525b()).mo83702b(aeVar);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f321375j = ((Account) this.f321370e.mo77278a().mo56107c()).name;
        this.f321377l = ((C101496ad) ((C58847bk) this.f321369d).f156646a).mo92327a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        PersonalResultsPage personalResultsPage = (PersonalResultsPage) layoutInflater.inflate(R.layout.personal_results, (ViewGroup) null);
        C28295m.m52919e(personalResultsPage, new C28292j(44614));
        personalResultsPage.f228691c.mo77360a().setOnClickListener(new C89943l(new C115897o(this)));
        personalResultsPage.f228691c.mo77361b().setOnClickListener(new C89943l(new C115898p(this)));
        HeaderLayout headerLayout = personalResultsPage.f228689a;
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.opa_voice_match_personal_result_subtitle, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C92371d dVar = this.f321368c;
        if (dVar.f257556a || dVar.f257558c.mo56113h()) {
            String b = C5114a.m13988b(Locale.getDefault(), getString(R.string.opa_personal_results_unicorn_title), "GENDER", this.f321368c.mo87023d(), "PERSON", this.f321368c.mo87022c());
            HeaderLayout headerLayout2 = personalResultsPage.f228689a;
            C84018m.m133908c(headerLayout2.f228718a, b, TextView.BufferType.NORMAL, headerLayout2);
            if (this.f321368c.mo87034o()) {
                personalResultsPage.f228690b.setText(Html.fromHtml(C5114a.m13988b(Locale.getDefault(), getString(R.string.opa_personal_results_unicorn_explanation_dragonglass), "GENDER", this.f321368c.mo87023d(), "PERSON", this.f321368c.mo87022c())));
            } else {
                personalResultsPage.f228690b.setText(Html.fromHtml(C5114a.m13988b(Locale.getDefault(), getString(R.string.opa_personal_results_unicorn_explanation), "GENDER", this.f321368c.mo87023d(), "PERSON", this.f321368c.mo87022c())));
            }
            personalResultsPage.mo77354c(2);
        } else {
            HeaderLayout headerLayout3 = personalResultsPage.f228689a;
            C84018m.m133908c(headerLayout3.f228718a, C84018m.m133906a(R.string.opa_personal_results_title, headerLayout3), TextView.BufferType.NORMAL, headerLayout3);
            personalResultsPage.f228690b.setText(true != this.f321368c.mo87034o() ? R.string.opa_personal_results_explanation_non_dragonglass : R.string.opa_personal_results_explanation_dragonglass);
            personalResultsPage.mo77354c(1);
        }
        C83973o oVar = new C83973o(personalResultsPage.mo77352a(), personalResultsPage.mo77353b(), new C115903u());
        oVar.mo77402c();
        oVar.mo77403d();
        this.f321376k = oVar;
        return personalResultsPage;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f321376k;
        if (oVar != null) {
            oVar.mo77406g();
            this.f321376k = null;
        }
    }
}
