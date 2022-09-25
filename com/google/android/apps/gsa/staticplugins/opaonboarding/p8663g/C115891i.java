package com.google.android.apps.gsa.staticplugins.opaonboarding.p8663g;

import android.accounts.Account;
import android.app.Activity;
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
import com.google.android.apps.gsa.opaonboarding.p6459a.C83819a;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83823ad;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83824ae;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83825af;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83841av;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83843c;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83865y;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.opaonboarding.personalresults.PersonalResultsPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49886cq;
import com.google.assistant.p3861at.C49890cu;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Collections;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.g.i */
/* compiled from: PG */
public final class C115891i extends C83907bm {

    /* renamed from: b */
    public static final C59071e f321341b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opaonboarding.g.i");

    /* renamed from: c */
    public C115894l f321342c;

    /* renamed from: d */
    public boolean f321343d;

    /* renamed from: e */
    public C83893b f321344e;

    /* renamed from: f */
    public l f321345f;

    /* renamed from: g */
    public C58833ax f321346g;

    /* renamed from: h */
    public C68214a f321347h;

    /* renamed from: i */
    public C92371d f321348i;

    /* renamed from: j */
    private C83973o f321349j;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo102303e(boolean z) {
        Activity activity = getActivity();
        if (activity != null) {
            C83824ae aeVar = (C83824ae) C83825af.f228447c.createBuilder();
            String str = ((Account) this.f321344e.mo77278a().mo56107c()).name;
            aeVar.copyOnWrite();
            C83825af afVar = (C83825af) aeVar.instance;
            str.getClass();
            afVar.f228449a |= 1;
            afVar.f228450b = str;
            C83825af afVar2 = (C83825af) aeVar.build();
            C83865y yVar = (C83865y) C83823ad.f228441e.createBuilder();
            yVar.mo77206a(this.f321342c.f321356d);
            int i = 3;
            int i2 = true != this.f321342c.f321358f ? 3 : 5;
            yVar.copyOnWrite();
            C83823ad adVar = (C83823ad) yVar.instance;
            adVar.f228445c = i2 - 1;
            adVar.f228443a |= 1;
            if (!z) {
                i = 2;
            } else {
                C115894l lVar = this.f321342c;
                if (lVar.f321358f) {
                    i = 5;
                } else if (lVar.f321359g || lVar.f321357e) {
                    i = 4;
                }
            }
            yVar.copyOnWrite();
            C83823ad adVar2 = (C83823ad) yVar.instance;
            adVar2.f228446d = i - 1;
            adVar2.f228443a = 2 | adVar2.f228443a;
            C83823ad adVar3 = (C83823ad) yVar.build();
            C83843c cVar = (C83843c) C83841av.f228478e.createBuilder();
            cVar.copyOnWrite();
            C83841av avVar = (C83841av) cVar.instance;
            afVar2.getClass();
            avVar.f228481b = afVar2;
            avVar.f228480a = 1;
            cVar.copyOnWrite();
            C83841av avVar2 = (C83841av) cVar.instance;
            adVar3.getClass();
            avVar2.f228483d = adVar3;
            avVar2.f228482c = 5;
            ((C83819a) this.f321346g.mo56107c()).mo77204a(activity, (C83841av) cVar.build());
        }
    }

    /* renamed from: g */
    public final void mo102304g(boolean z) {
        int i;
        C59104x b = f321341b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PersonalResultsAlone");
        ((C59052c) ((C59052c) b).mo56372aa(30143)).mo56389s("Current version info for this request: %s", this.f321345f.e());
        l lVar = this.f321345f;
        Account account = (Account) this.f321344e.mo77278a().mo56111f();
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        for (String str : this.f321342c.f321356d) {
            C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
            int i2 = 3;
            if (z) {
                C115894l lVar2 = this.f321342c;
                i = (lVar2.f321359g || lVar2.f321358f || !lVar2.f321357e) ? 2 : 4;
            } else {
                i = 3;
            }
            cnVar.copyOnWrite();
            C49891cv cvVar = (C49891cv) cnVar.instance;
            cvVar.f129666d = i - 1;
            cvVar.f129663a |= 2;
            C115894l lVar3 = this.f321342c;
            if (lVar3.f321359g || lVar3.f321358f) {
                if (!z) {
                    i2 = 2;
                } else if (!lVar3.f321358f) {
                    i2 = 4;
                }
                cnVar.copyOnWrite();
                C49891cv cvVar2 = (C49891cv) cnVar.instance;
                cvVar2.f129667e = i2 - 1;
                cvVar2.f129663a |= 4;
            }
            C59071e eVar = f321341b;
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "PersonalResultsAlone");
            C59052c cVar = (C59052c) ((C59052c) b2).mo56372aa(30139);
            int a = C49886cq.m85760a(((C49891cv) cnVar.instance).f129666d);
            if (a == 0) {
                a = 1;
            }
            cVar.mo56387q("Personal: %d", a - 1);
            if ((4 & ((C49891cv) cnVar.instance).f129663a) != 0) {
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "PersonalResultsAlone");
                C59052c cVar2 = (C59052c) ((C59052c) b3).mo56372aa(30141);
                int a2 = C49890cu.m85762a(((C49891cv) cnVar.instance).f129667e);
                if (a2 == 0) {
                    a2 = 1;
                }
                cVar2.mo56387q("Proactive: %d", a2 - 1);
            }
            C49875cf a3 = C49875cf.m85755a(((Integer) Collections.unmodifiableMap(this.f321342c.f321355c).get(str)).intValue());
            C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
            dfVar.copyOnWrite();
            C49903dg dgVar = (C49903dg) dfVar.instance;
            str.getClass();
            dgVar.f129714a = 1 | dgVar.f129714a;
            dgVar.f129715b = str;
            dfVar.copyOnWrite();
            C49903dg dgVar2 = (C49903dg) dfVar.instance;
            dgVar2.f129716c = a3.f129621v;
            dgVar2.f129714a = 2 | dgVar2.f129714a;
            dfVar.copyOnWrite();
            C49903dg dgVar3 = (C49903dg) dfVar.instance;
            C49891cv cvVar3 = (C49891cv) cnVar.build();
            cvVar3.getClass();
            dgVar3.f129719f = cvVar3;
            dgVar3.f129714a |= 32;
            daVar.mo53371b(dfVar);
            if (a3 == C49875cf.UNKNOWN) {
                C59104x d = eVar.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PersonalResultsAlone");
                ((C59052c) ((C59052c) d).mo56372aa(30140)).mo56386p("Unknown Device Type");
                int i3 = C90755l.f253831a;
            }
        }
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C49898db dbVar = (C49898db) daVar.build();
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        lVar.l(account, (C49875cf) null, (acx) acw.build(), new C115887e(this), getClass().getSimpleName());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.getClass();
        C115894l lVar = (C115894l) C90734ar.m148199b(arguments, "personal_results_args", C115894l.f321351j.getParserForType());
        C58838bb.m90867b(lVar, "Must supply PersonalResultsFragmentArgs under key %s", "personal_results_args");
        this.f321342c = lVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PersonalResultsPage personalResultsPage = (PersonalResultsPage) layoutInflater.inflate(R.layout.personal_results, (ViewGroup) null);
        HeaderLayout headerLayout = personalResultsPage.f228689a;
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.personal_results_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        personalResultsPage.mo77354c(1);
        if (this.f321342c.f321357e) {
            personalResultsPage.f228690b.setText(R.string.personal_results_explanation_dragonglass);
        } else {
            personalResultsPage.f228690b.setText(R.string.personal_results_explanation_non_dragonglass);
        }
        C115894l lVar = this.f321342c;
        if (lVar.f321358f) {
            if (lVar.f321360h) {
                int i = true != lVar.f321357e ? R.string.opa_personal_results_unicorn_explanation : R.string.opa_personal_results_unicorn_explanation_dragonglass;
                String b = C5114a.m13988b(Locale.getDefault(), getString(R.string.personal_results_custodio_unicorn_title), "GENDER", this.f321348i.mo87023d(), "PERSON", this.f321348i.mo87022c());
                HeaderLayout headerLayout2 = personalResultsPage.f228689a;
                C84018m.m133908c(headerLayout2.f228718a, b, TextView.BufferType.NORMAL, headerLayout2);
                String b2 = C5114a.m13988b(Locale.getDefault(), getString(R.string.opa_voice_match_personal_result_subtitle_unicorn), "GENDER", this.f321348i.mo87023d(), "PERSON", this.f321348i.mo87022c());
                HeaderLayout headerLayout3 = personalResultsPage.f228689a;
                C84018m.m133908c(headerLayout3.f228719b, b2, TextView.BufferType.NORMAL, headerLayout3);
                personalResultsPage.f228690b.setText(Html.fromHtml(C5114a.m13988b(Locale.getDefault(), getString(i), "GENDER", this.f321348i.mo87023d(), "PERSON", this.f321348i.mo87022c())));
                personalResultsPage.mo77354c(2);
                personalResultsPage.f228691c.mo77360a().setText(R.string.fm_personal_results_action_button_unicorn);
            } else {
                HeaderLayout headerLayout4 = personalResultsPage.f228689a;
                C84018m.m133908c(headerLayout4.f228718a, C84018m.m133906a(R.string.fm_personal_result_title, headerLayout4), TextView.BufferType.NORMAL, headerLayout4);
                HeaderLayout headerLayout5 = personalResultsPage.f228689a;
                C84018m.m133908c(headerLayout5.f228719b, C84018m.m133906a(R.string.fm_personal_result_subtitle, headerLayout5), TextView.BufferType.NORMAL, headerLayout5);
                personalResultsPage.f228690b.setText(Html.fromHtml(getString(R.string.personal_results_explanation_face_match_enabled)).toString());
                personalResultsPage.f228691c.mo77360a().setText(R.string.fm_personal_results_action_button);
            }
        }
        C28295m.m52919e(personalResultsPage, new C28292j(44614));
        personalResultsPage.f228691c.mo77360a().setOnClickListener(new C89943l(new C115885c(this)));
        personalResultsPage.f228691c.mo77361b().setOnClickListener(new C89943l(new C115886d(this)));
        if (!this.f321342c.f321360h) {
            C83973o oVar = new C83973o(personalResultsPage.mo77352a(), personalResultsPage.mo77353b(), new C115890h());
            oVar.mo77402c();
            oVar.mo77403d();
            this.f321349j = oVar;
        }
        return personalResultsPage;
    }

    public final void onDestroy() {
        C89849ae aeVar;
        C89849ae aeVar2;
        super.onDestroy();
        if (this.f321342c.f321358f) {
            if (this.f321343d) {
                aeVar2 = C89849ae.FACE_MATCH_ENROLLMENT_SUCCESS_WITH_PERSONAL_RESULTS;
            } else {
                aeVar2 = C89849ae.FACE_MATCH_ENROLLMENT_SUCCESS_WITHOUT_PERSONAL_RESULTS;
            }
            ((C89859i) this.f321347h.mo27525b()).mo83702b(aeVar2);
        }
        if (this.f321343d) {
            aeVar = C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_PR_ENABLED;
        } else {
            aeVar = C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_PR_DISABLED;
        }
        ((C89859i) this.f321347h.mo27525b()).mo83702b(aeVar);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f321349j;
        if (oVar != null) {
            oVar.mo77406g();
            this.f321349j = null;
        }
    }
}
