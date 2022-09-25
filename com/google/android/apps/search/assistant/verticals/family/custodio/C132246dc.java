package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p427am.p432b.p433a.C8624ac;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8630ai;
import com.google.p427am.p432b.p433a.C8631aj;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8635an;
import com.google.p427am.p432b.p433a.C8636ao;
import com.google.p427am.p432b.p433a.C8641at;
import com.google.p427am.p432b.p433a.C8642au;
import com.google.p427am.p432b.p433a.C8644aw;
import com.google.p427am.p432b.p433a.C8645ax;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8682l;
import com.google.p427am.p432b.p433a.C8683m;
import com.google.p427am.p432b.p433a.C8685o;
import com.google.p427am.p432b.p433a.C8687q;
import com.google.p427am.p432b.p433a.C8692v;
import com.google.p427am.p432b.p433a.C8693w;
import com.google.p427am.p432b.p433a.C8696z;
import com.google.protobuf.C62963cj;
import java.util.HashSet;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.dc */
/* compiled from: PG */
public final class C132246dc {

    /* renamed from: a */
    public static final C59071e f360946a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.dc");

    /* renamed from: b */
    public final Activity f360947b;

    /* renamed from: c */
    public final CustodioSettingsFragment f360948c;

    /* renamed from: d */
    public final Bundle f360949d;

    /* renamed from: e */
    public final C46485f f360950e;

    /* renamed from: f */
    public final C46801dp f360951f;

    /* renamed from: g */
    public final C132140a f360952g;

    /* renamed from: h */
    public final C132247a f360953h;

    /* renamed from: i */
    public final boolean f360954i;

    /* renamed from: j */
    public final boolean f360955j;

    /* renamed from: k */
    public final C37215b f360956k;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.dc$a */
    /* compiled from: PG */
    final class C132247a implements C46792di {

        /* renamed from: a */
        public ProgressBar f360957a;

        /* renamed from: b */
        public ScrollView f360958b;

        /* renamed from: c */
        public View f360959c;

        /* renamed from: d */
        public Button f360960d;

        /* renamed from: e */
        public TextView f360961e;

        /* renamed from: f */
        public TextView f360962f;

        /* renamed from: g */
        public View f360963g;

        /* renamed from: h */
        public View f360964h;

        /* renamed from: i */
        public View f360965i;

        /* renamed from: k */
        private final Context f360967k;

        public C132247a() {
            this.f360967k = C132246dc.this.f360948c.requireContext();
        }

        /* renamed from: d */
        private static final void m214903d(View view, int i, String str, String str2) {
            ((ImageView) view.findViewById(R.id.assistant_custodio_settings_fragment_item_banner)).setImageResource(i);
            ((TextView) view.findViewById(R.id.assistant_custodio_settings_fragment_item_title)).setText(str);
            ((TextView) view.findViewById(R.id.assistant_custodio_settings_fragment_item_subtitle)).setText(str2);
        }

        /* renamed from: e */
        private static final void m214904e(View view, int i, int i2, String str) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.assistant_custodio_settings_fragment_item_summary_list);
            while (linearLayout.getChildCount() <= i) {
                linearLayout.addView(LayoutInflater.from(view.getContext()).inflate(R.layout.assistant_custodio_settings_fragment_item_summary_item, linearLayout, false));
            }
            View childAt = linearLayout.getChildAt(i);
            ((ImageView) childAt.findViewById(R.id.assistant_custodio_settings_frament_item_summary_item_image)).setImageResource(i2);
            ((TextView) childAt.findViewById(R.id.assistant_custodio_settings_frament_item_summary_item_title)).setText(str);
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132246dc.f360946a.mo56225c()).mo56382g(th)).mo56372aa(39566)).mo56386p("Failed to fetch required information!");
            C132246dc.this.mo110565b();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() == 1) {
                C8675e eVar = (C8675e) blVar.f29964b.get(0);
                C8633al alVar = eVar.f29993b;
                if (alVar == null) {
                    alVar = C8633al.f29901j;
                }
                C8628ag agVar = eVar.f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                if (C132246dc.this.f360949d.getBoolean("use_add_devices_text", false)) {
                    ((TextView) Objects.requireNonNull(this.f360961e)).setText(this.f360967k.getString(R.string.assistant_custodio_settings_fragment_add_devices_title, new Object[]{agVar.f29893b}));
                } else if (C132246dc.this.f360949d.getBoolean("use_gha_child_sla_text_key")) {
                    ((TextView) Objects.requireNonNull(this.f360961e)).setText(this.f360967k.getString(R.string.assistant_custodio_settings_fragment_gha_mmv2_title));
                } else if (eVar.f29995d) {
                    ((TextView) Objects.requireNonNull(this.f360961e)).setText(this.f360967k.getString(R.string.assistant_custodio_settings_fragment_steady_state_title));
                } else {
                    ((TextView) Objects.requireNonNull(this.f360961e)).setText(this.f360967k.getString(R.string.assistant_custodio_settings_fragment_setup_title));
                }
                if (C132246dc.this.f360949d.getBoolean("use_add_devices_text", false)) {
                    ((TextView) Objects.requireNonNull(this.f360962f)).setText(this.f360967k.getString(R.string.assistant_custodio_settings_fragment_add_devices_subtitle, new Object[]{agVar.f29893b}));
                } else {
                    ((TextView) Objects.requireNonNull(this.f360962f)).setText(this.f360967k.getString(R.string.assistant_custodio_settings_fragment_subtitle, new Object[]{agVar.f29893b}));
                }
                if (eVar.f29995d) {
                    ((View) Objects.requireNonNull(this.f360959c)).setVisibility(true != C132246dc.this.f360949d.getBoolean("force_enable_settings_next_button", false) ? 8 : 0);
                } else {
                    ((View) Objects.requireNonNull(this.f360959c)).setVisibility(0);
                }
                ((Button) Objects.requireNonNull(this.f360960d)).setOnClickListener(new C132245db(this, eVar, agVar));
                View view = (View) Objects.requireNonNull(this.f360963g);
                String string = this.f360967k.getString(R.string.assistant_custodio_settings_fragment_media_item_title);
                Context context = this.f360967k;
                C8642au auVar = alVar.f29904b;
                if (auVar == null) {
                    auVar = C8642au.f29924f;
                }
                HashSet hashSet = new HashSet(new C62963cj(auVar.f29928d, C8642au.f29923e));
                C8693w wVar = alVar.f29903a;
                if (wVar == null) {
                    wVar = C8693w.f30027f;
                }
                HashSet hashSet2 = new HashSet(new C62963cj(wVar.f30031d, C8693w.f30026e));
                boolean contains = hashSet.contains(C8641at.YOUTUBE);
                int i = R.string.assistant_custodio_settings_fragment_media_item_subtitle_with_youtube;
                if (!contains && !hashSet.contains(C8641at.YOUTUBE_KIDS) && !hashSet.contains(C8641at.YOUTUBE_TV) && !hashSet2.contains(C8692v.YOUTUBE)) {
                    i = R.string.assistant_custodio_settings_fragment_media_item_subtitle_no_youtube;
                }
                m214903d(view, R.drawable.assistant_custodio_media_settings_banner, string, context.getString(i, new Object[]{agVar.f29893b}));
                C8693w wVar2 = alVar.f29903a;
                if (wVar2 == null) {
                    wVar2 = C8693w.f30027f;
                }
                String b = C132262dp.m214923b(C132246dc.this.f360948c.requireContext(), wVar2);
                if (b == null) {
                    ((C59052c) ((C59052c) C132246dc.f360946a.mo56225c()).mo56372aa(39571)).mo56386p("Invalid music setting state!");
                    C132246dc.this.mo110565b();
                } else {
                    m214904e(view, 0, R.drawable.quantum_ic_audiotrack_vd_theme_24, b);
                }
                C8696z zVar = alVar.f29908f;
                if (zVar == null) {
                    zVar = C8696z.f30032b;
                }
                C8624ac acVar = alVar.f29909g;
                if (acVar == null) {
                    acVar = C8624ac.f29887b;
                }
                String d = C132262dp.m214925d(C132246dc.this.f360948c.requireContext(), zVar, acVar);
                if (d == null) {
                    ((C59052c) ((C59052c) C132246dc.f360946a.mo56225c()).mo56372aa(39572)).mo56386p("Invalid news & podcast settings!");
                    C132246dc.this.mo110565b();
                } else {
                    m214904e(view, 2, R.drawable.quantum_ic_podcasts_vd_theme_24, d);
                }
                C8642au auVar2 = alVar.f29904b;
                if (auVar2 == null) {
                    auVar2 = C8642au.f29924f;
                }
                String c = C132262dp.m214924c(C132246dc.this.f360948c.requireContext(), auVar2);
                if (c == null) {
                    ((C59052c) ((C59052c) C132246dc.f360946a.mo56225c()).mo56372aa(39574)).mo56386p("Invalid video setting state!");
                    C132246dc.this.mo110565b();
                } else {
                    m214904e(view, 1, R.drawable.quantum_ic_ondemand_video_vd_theme_24, c);
                }
                View view2 = (View) Objects.requireNonNull(this.f360964h);
                m214903d(view2, R.drawable.assistant_custodio_assistant_features_settings_banner, this.f360967k.getString(R.string.assistant_custodio_settings_fragment_features_item_title), this.f360967k.getString(R.string.assistant_custodio_settings_fragment_features_item_subtitle, new Object[]{agVar.f29893b}));
                C8683m mVar = alVar.f29905c;
                if (mVar == null) {
                    mVar = C8683m.f30006b;
                }
                Context requireContext = C132246dc.this.f360948c.requireContext();
                int a = C8682l.m23368a(mVar.f30008a);
                if (a == 0) {
                    a = 1;
                }
                int i2 = a - 2;
                String str5 = null;
                if (i2 == 1) {
                    str = requireContext.getString(R.string.assistant_custodio_communications_settings_summary_calls_allowed);
                } else if (i2 != 2) {
                    str = null;
                } else {
                    str = requireContext.getString(R.string.assistant_custodio_communications_settings_summary_calls_blocked);
                }
                if (str == null) {
                    ((C59052c) ((C59052c) C132246dc.f360946a.mo56225c()).mo56372aa(39569)).mo56386p("Invalid call settings!");
                    C132246dc.this.mo110565b();
                } else {
                    m214904e(view2, 0, R.drawable.quantum_gm_ic_phone_forwarded_vd_theme_24, str);
                }
                C8636ao aoVar = alVar.f29907e;
                if (aoVar == null) {
                    aoVar = C8636ao.f29912b;
                }
                Context requireContext2 = C132246dc.this.f360948c.requireContext();
                int a2 = C8635an.m23354a(aoVar.f29914a);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i3 = a2 - 2;
                if (i3 == 2) {
                    str2 = requireContext2.getString(R.string.assistant_custodio_aog_settings_summary_aog_restricted);
                } else if (i3 != 3) {
                    str2 = null;
                } else {
                    str2 = requireContext2.getString(R.string.assistant_custodio_aog_settings_summary_aog_blocked);
                }
                if (str2 == null) {
                    ((C59052c) ((C59052c) C132246dc.f360946a.mo56225c()).mo56372aa(39568)).mo56386p("Invalid AoG settings!");
                    C132246dc.this.mo110565b();
                } else {
                    m214904e(view2, 2, R.drawable.quantum_ic_apps_policy_vd_theme_24, str2);
                }
                C8631aj ajVar = alVar.f29906d;
                if (ajVar == null) {
                    ajVar = C8631aj.f29898b;
                }
                Context requireContext3 = C132246dc.this.f360948c.requireContext();
                int a3 = C8630ai.m23353a(ajVar.f29900a);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i4 = a3 - 2;
                if (i4 == 1) {
                    str3 = requireContext3.getString(R.string.assistant_custodio_search_settings_summary_search_allowed);
                } else if (i4 != 2) {
                    str3 = null;
                } else {
                    str3 = requireContext3.getString(R.string.assistant_custodio_search_settings_summary_search_restricted);
                }
                if (str3 == null) {
                    ((C59052c) ((C59052c) C132246dc.f360946a.mo56225c()).mo56372aa(39573)).mo56386p("Invalid search settings!");
                    C132246dc.this.mo110565b();
                } else {
                    m214904e(view2, 1, R.drawable.quantum_gm_ic_question_answer_vd_theme_24, str3);
                }
                if (C132246dc.this.f360955j) {
                    C8645ax axVar = alVar.f29910h;
                    if (axVar == null) {
                        axVar = C8645ax.f29929b;
                    }
                    Context requireContext4 = C132246dc.this.f360948c.requireContext();
                    int a4 = C8644aw.m23360a(axVar.f29931a);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    int i5 = a4 - 2;
                    if (i5 == 1) {
                        str4 = requireContext4.getString(R.string.assistant_custodio_webview_settings_summary_websites_allowed);
                    } else if (i5 != 2) {
                        str4 = null;
                    } else {
                        str4 = requireContext4.getString(R.string.assistant_custodio_webview_settings_summary_websites_blocked);
                    }
                    if (str4 == null) {
                        ((C59052c) ((C59052c) C132246dc.f360946a.mo56225c()).mo56372aa(39575)).mo56386p("Invalid webview settings!");
                        C132246dc.this.mo110565b();
                    } else {
                        m214904e(view2, 3, R.drawable.quantum_gm_ic_tabs_vd_theme_24, str4);
                    }
                }
                View view3 = (View) Objects.requireNonNull(this.f360965i);
                m214903d(view3, R.drawable.assistant_custodio_downtime_settings_banner, this.f360967k.getString(R.string.assistant_custodio_settings_fragment_downtime_item_title), this.f360967k.getString(R.string.assistant_custodio_settings_fragment_downtime_item_subtitle, new Object[]{agVar.f29893b}));
                C8687q qVar = alVar.f29911i;
                if (qVar == null) {
                    qVar = C8687q.f30013c;
                }
                Context requireContext5 = C132246dc.this.f360948c.requireContext();
                if (qVar.f30015a.size() > 0) {
                    String a5 = C132262dp.m214922a(requireContext5, (C8685o) qVar.f30015a.get(0));
                    String e = C132262dp.m214926e(requireContext5, (C8685o) qVar.f30015a.get(0));
                    if (!(a5 == null || e == null)) {
                        str5 = requireContext5.getString(R.string.assistant_custodio_downtime_settings_summary_downtime_on, new Object[]{a5, e});
                    }
                } else {
                    str5 = requireContext5.getString(R.string.assistant_custodio_downtime_settings_summary_downtime_off);
                }
                if (str5 == null) {
                    ((C59052c) ((C59052c) C132246dc.f360946a.mo56225c()).mo56372aa(39570)).mo56386p("Invalid Downtime settings!");
                    C132246dc.this.mo110565b();
                } else {
                    m214904e(view3, 0, R.drawable.quantum_gm_ic_partly_cloudy_night_vd_theme_24, str5);
                }
                Button button = (Button) view3.findViewById(R.id.assistant_custodio_settings_fragment_item_edit_button);
                C8687q qVar2 = alVar.f29911i;
                if (qVar2 == null) {
                    qVar2 = C8687q.f30013c;
                }
                button.setText(qVar2.f30015a.size() > 0 ? R.string.assistant_custodio_settings_fragment_downtime_edit_button : R.string.assistant_custodio_settings_fragment_downtime_item_button);
                ((Button) Objects.requireNonNull(this.f360960d)).setEnabled(true);
                ((ProgressBar) Objects.requireNonNull(this.f360957a)).setVisibility(8);
                ((ScrollView) Objects.requireNonNull(this.f360958b)).setVisibility(0);
                C132246dc.this.f360956k.mo19974a(C37176a.f97034dt);
                return;
            }
            ((C59052c) ((C59052c) C132246dc.f360946a.mo56225c()).mo56372aa(39567)).mo56387q("Expected one child's data provided to CustodioSettingsFragment, got %d!", blVar.f29964b.size());
            C132246dc.this.mo110565b();
        }

        /* renamed from: c */
        public final void mo18079c() {
            ((Button) Objects.requireNonNull(this.f360960d)).setEnabled(false);
            ((ProgressBar) Objects.requireNonNull(this.f360957a)).setVisibility(0);
            ((ScrollView) Objects.requireNonNull(this.f360958b)).setVisibility(8);
        }
    }

    public C132246dc(Activity activity, CustodioSettingsFragment custodioSettingsFragment, C46485f fVar, C46801dp dpVar, C132140a aVar, boolean z, boolean z2, C37215b bVar) {
        this.f360947b = activity;
        this.f360948c = custodioSettingsFragment;
        this.f360950e = fVar;
        this.f360951f = dpVar;
        this.f360952g = aVar;
        Bundle arguments = custodioSettingsFragment.getArguments();
        this.f360949d = arguments == null ? new Bundle() : arguments;
        this.f360953h = new C132247a();
        this.f360954i = z;
        this.f360955j = z2;
        this.f360956k = bVar;
    }

    /* renamed from: a */
    public final void mo110564a(String str) {
        String str2 = true != this.f360949d.getBoolean("finish_flow_on_settings_page", false) ? "action_navigate_to_voice_match_deeplinking_fragment" : "action_finish_activity";
        this.f360956k.mo19974a(C37176a.f97024dj);
        Bundle a = C132287ei.m214954a(this.f360948c.getString(R.string.assistant_custodio_default_settings_dialog_title), this.f360948c.getString(R.string.assistant_custodio_default_settings_dialog_body, str), this.f360948c.getString(R.string.assistant_custodio_default_settings_dialog_primary_button_text), str2, this.f360948c.getString(R.string.assistant_custodio_default_settings_dialog_secondary_button_text), "action_dismiss_dialog");
        a.putAll(this.f360949d);
        this.f360950e.mo50482c(this.f360948c).mo50508d(R.id.assistant_custodio_settings_fragment_to_dialog, a);
    }

    /* renamed from: b */
    public final void mo110565b() {
        this.f360956k.mo19974a(C37176a.f97023di);
        this.f360950e.mo50482c(this.f360948c).mo50508d(R.id.assistant_custodio_settings_fragment_to_dialog, C132287ei.m214954a(this.f360948c.getString(R.string.assistant_custodio_fatal_error_title), this.f360948c.getString(R.string.assistant_custodio_fatal_error_body), this.f360948c.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }
}
