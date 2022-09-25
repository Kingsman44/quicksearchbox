package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8630ai;
import com.google.p427am.p432b.p433a.C8631aj;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8635an;
import com.google.p427am.p432b.p433a.C8636ao;
import com.google.p427am.p432b.p433a.C8644aw;
import com.google.p427am.p432b.p433a.C8645ax;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8682l;
import com.google.p427am.p432b.p433a.C8683m;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.v */
/* compiled from: PG */
public final class C132358v {

    /* renamed from: a */
    public static final C59071e f361294a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.v");

    /* renamed from: b */
    public final CustodioAssistantFeaturesSettingsFragment f361295b;

    /* renamed from: c */
    public final Bundle f361296c;

    /* renamed from: d */
    public final C46801dp f361297d;

    /* renamed from: e */
    public final C132140a f361298e;

    /* renamed from: f */
    public final C132360a f361299f = new C132360a();

    /* renamed from: g */
    public final C46439e f361300g;

    /* renamed from: h */
    public final C46440f f361301h;

    /* renamed from: i */
    public final C37215b f361302i;

    /* renamed from: j */
    public final C46485f f361303j;

    /* renamed from: k */
    public final boolean f361304k;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.v$a */
    /* compiled from: PG */
    final class C132360a implements C46792di {
        public C132360a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132358v.f361294a.mo56225c()).mo56382g(th)).mo56372aa(39512)).mo56386p("Can't fetch kid account details");
            C132358v.this.mo110666b();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            boolean z = true;
            if (blVar.f29964b.size() == 1) {
                C8675e eVar = (C8675e) blVar.f29964b.get(0);
                C132358v.this.mo110667c(false);
                C132358v vVar = C132358v.this;
                C8628ag agVar = eVar.f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                String str = agVar.f29893b;
                View requireView = vVar.f361295b.requireView();
                ((TextView) requireView.findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_subtitle)).setText(vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_subtitle, str));
                requireView.findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_subtitle_link).setOnClickListener(new C132357u(vVar, eVar, str));
                View findViewById = requireView.findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_calling_section);
                String string = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_calling_item_title_text);
                String string2 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_calling_item_subtitle_text, str);
                String string3 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_calling_item_option_1_text, str);
                String string4 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_calling_item_option_2_text, str);
                C8633al alVar = eVar.f29993b;
                if (alVar == null) {
                    alVar = C8633al.f29901j;
                }
                C8683m mVar = alVar.f29905c;
                if (mVar == null) {
                    mVar = C8683m.f30006b;
                }
                int a = C8682l.m23368a(mVar.f30008a);
                vVar.mo110665a(findViewById, R.drawable.quantum_gm_ic_phone_forwarded_vd_theme_24, string, string2, string3, string4, a != 0 && a == 3);
                View findViewById2 = requireView.findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_answers_section);
                String string5 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_answers_item_title_text);
                String string6 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_answers_item_subtitle_text);
                String string7 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_answers_item_option_1_text);
                String string8 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_answers_item_option_2_text);
                C8633al alVar2 = eVar.f29993b;
                if (alVar2 == null) {
                    alVar2 = C8633al.f29901j;
                }
                C8631aj ajVar = alVar2.f29906d;
                if (ajVar == null) {
                    ajVar = C8631aj.f29898b;
                }
                int a2 = C8630ai.m23353a(ajVar.f29900a);
                vVar.mo110665a(findViewById2, R.drawable.quantum_gm_ic_question_answer_vd_theme_24, string5, string6, string7, string8, a2 != 0 && a2 == 3);
                View findViewById3 = requireView.findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_actions_section);
                String string9 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_actions_item_title_text);
                String string10 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_actions_item_subtitle_text);
                String string11 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_actions_item_option_1_text);
                String string12 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_actions_item_option_2_text);
                C8633al alVar3 = eVar.f29993b;
                if (alVar3 == null) {
                    alVar3 = C8633al.f29901j;
                }
                C8636ao aoVar = alVar3.f29907e;
                if (aoVar == null) {
                    aoVar = C8636ao.f29912b;
                }
                int a3 = C8635an.m23354a(aoVar.f29914a);
                vVar.mo110665a(findViewById3, R.drawable.quantum_ic_apps_policy_vd_theme_24, string9, string10, string11, string12, a3 != 0 && a3 == 4);
                if (vVar.f361304k) {
                    View findViewById4 = requireView.findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_websites_section);
                    String string13 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_websites_item_title_text);
                    String string14 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_websites_item_subtitle_text, str);
                    String string15 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_websites_item_option_1_text);
                    String string16 = vVar.f361295b.getString(R.string.assistant_custodio_assistant_features_settings_fragment_websites_item_option_2_text);
                    C8633al alVar4 = eVar.f29993b;
                    if (alVar4 == null) {
                        alVar4 = C8633al.f29901j;
                    }
                    C8645ax axVar = alVar4.f29910h;
                    if (axVar == null) {
                        axVar = C8645ax.f29929b;
                    }
                    int a4 = C8644aw.m23360a(axVar.f29931a);
                    if (a4 == 0 || a4 != 3) {
                        z = false;
                    }
                    vVar.mo110665a(findViewById4, R.drawable.quantum_gm_ic_tabs_vd_theme_24, string13, string14, string15, string16, z);
                    requireView.findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_websites_section).setVisibility(0);
                } else {
                    requireView.findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_websites_section).setVisibility(8);
                }
                C132358v.this.f361302i.mo19974a(C37176a.f97034dt);
                return;
            }
            ((C59052c) ((C59052c) C132358v.f361294a.mo56225c()).mo56372aa(39513)).mo56386p("More than one child's data provided!");
            C132358v.this.mo110666b();
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132358v.this.mo110667c(true);
        }
    }

    public C132358v(CustodioAssistantFeaturesSettingsFragment custodioAssistantFeaturesSettingsFragment, C46801dp dpVar, C132140a aVar, C46439e eVar, C37215b bVar, C46485f fVar, boolean z) {
        this.f361295b = custodioAssistantFeaturesSettingsFragment;
        Bundle arguments = custodioAssistantFeaturesSettingsFragment.getArguments();
        this.f361296c = arguments == null ? new Bundle() : arguments;
        this.f361297d = dpVar;
        this.f361298e = aVar;
        this.f361300g = eVar;
        this.f361302i = bVar;
        this.f361303j = fVar;
        this.f361304k = z;
        this.f361301h = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                Void voidR = (Void) obj;
                throw new IllegalStateException("Failed to update video settings!", th);
            }

            /* renamed from: c */
            public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
                Void voidR = (Void) obj;
                Void voidR2 = (Void) obj2;
                C132358v.this.mo110667c(false);
            }

            /* renamed from: i */
            public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
                Void voidR = (Void) obj;
                C132358v.this.mo110667c(true);
            }
        };
    }

    /* renamed from: d */
    public static boolean m215119d(View view, int i) {
        return ((RadioButton) view.findViewById(i).findViewById(R.id.assistant_custodio_assistant_features_settings_fragments_item_options).findViewById(R.id.assistant_custodio_assistant_features_settings_fragments_item_option_2)).isChecked();
    }

    /* renamed from: a */
    public final void mo110665a(View view, int i, String str, String str2, String str3, String str4, boolean z) {
        ((ImageView) view.findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_item_image)).setImageResource(i);
        ((TextView) view.findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_item_title)).setText(str);
        ((TextView) view.findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_item_subtitle)).setText(str2);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.assistant_custodio_assistant_features_settings_fragments_item_options);
        radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        radioGroup.check(true != z ? R.id.assistant_custodio_assistant_features_settings_fragments_item_option_1 : R.id.assistant_custodio_assistant_features_settings_fragments_item_option_2);
        ((RadioButton) radioGroup.findViewById(R.id.assistant_custodio_assistant_features_settings_fragments_item_option_1)).setText(str3);
        ((RadioButton) radioGroup.findViewById(R.id.assistant_custodio_assistant_features_settings_fragments_item_option_2)).setText(str4);
        radioGroup.setOnCheckedChangeListener(new C132356t(this));
    }

    /* renamed from: b */
    public final void mo110666b() {
        this.f361302i.mo19974a(C37176a.f97023di);
        this.f361303j.mo50482c(this.f361295b).mo50508d(R.id.assistant_custodio_assistant_features_settings_fragment_to_dialog, C132287ei.m214954a(this.f361295b.getString(R.string.assistant_custodio_fatal_error_title), this.f361295b.getString(R.string.assistant_custodio_fatal_error_body), this.f361295b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }

    /* renamed from: c */
    public final void mo110667c(boolean z) {
        int i = 8;
        this.f361295b.requireView().findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_progress_bar).setVisibility(true != z ? 8 : 0);
        View findViewById = this.f361295b.requireView().findViewById(R.id.assistant_custodio_assistant_features_settings_fragment_container);
        if (true != z) {
            i = 0;
        }
        findViewById.setVisibility(i);
    }
}
