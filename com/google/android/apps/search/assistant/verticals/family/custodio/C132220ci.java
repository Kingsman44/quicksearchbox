package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.android.p265e.C5114a;
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
import com.google.p427am.p432b.p433a.C8623ab;
import com.google.p427am.p432b.p433a.C8624ac;
import com.google.p427am.p432b.p433a.C8627af;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8695y;
import com.google.p427am.p432b.p433a.C8696z;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ci */
/* compiled from: PG */
public final class C132220ci {

    /* renamed from: a */
    public static final C59071e f360888a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.ci");

    /* renamed from: b */
    public final CustodioNewsAndPodcastsSettingsFragment f360889b;

    /* renamed from: c */
    public final Bundle f360890c;

    /* renamed from: d */
    public final C46801dp f360891d;

    /* renamed from: e */
    public final C132140a f360892e;

    /* renamed from: f */
    public final C132222a f360893f = new C132222a();

    /* renamed from: g */
    public final C46439e f360894g;

    /* renamed from: h */
    public final C46440f f360895h;

    /* renamed from: i */
    public final C46485f f360896i;

    /* renamed from: j */
    public final C37215b f360897j;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ci$a */
    /* compiled from: PG */
    final class C132222a implements C46792di {
        public C132222a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132220ci.f360888a.mo56225c()).mo56382g(th)).mo56372aa(39554)).mo56386p("Failed to get news & podcast settings");
            C132220ci.this.mo110549b();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() == 1) {
                C8675e eVar = (C8675e) blVar.f29964b.get(0);
                C132220ci ciVar = C132220ci.this;
                C8628ag agVar = eVar.f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                View requireView = ciVar.f360889b.requireView();
                TextView textView = (TextView) requireView.findViewById(R.id.assistant_custodio_news_and_podcast_settings_fragment_subtitle);
                String string = ciVar.f360889b.getString(R.string.assistant_custodio_news_and_podcast_settings_subtitle);
                Object[] objArr = new Object[4];
                objArr[0] = "GENDER";
                int a = C8627af.m23352a(agVar.f29896e);
                if (a == 0) {
                    a = 1;
                }
                objArr[1] = C132220ci.m214867d(a);
                objArr[2] = "PERSON";
                objArr[3] = agVar.f29893b;
                textView.setText(C5114a.m13988b(Locale.getDefault(), string, objArr));
                ((TextView) requireView.findViewById(R.id.assistant_custodio_news_setting).findViewById(R.id.assistant_custodio_news_and_podcast_item_subtitle)).setText(ciVar.f360889b.getString(R.string.assistant_custodio_news_item_subtitle, agVar.f29893b));
                ((TextView) requireView.findViewById(R.id.assistant_custodio_podcast_setting).findViewById(R.id.assistant_custodio_news_and_podcast_item_subtitle)).setText(ciVar.f360889b.getString(R.string.assistant_custodio_podcast_item_subtitle, agVar.f29893b));
                requireView.findViewById(R.id.assistant_custodio_news_and_podcast_settings_fragment_subtitle_link).setOnClickListener(new C132217cf(ciVar, agVar));
                CompoundButton compoundButton = (CompoundButton) requireView.findViewById(R.id.assistant_custodio_news_allowed_radio_button);
                CompoundButton compoundButton2 = (CompoundButton) requireView.findViewById(R.id.assistant_custodio_news_blocked_radio_button);
                C132300ev evVar = new C132300ev();
                evVar.f361090a.add(compoundButton);
                evVar.f361090a.add(compoundButton2);
                C132218cg cgVar = new C132218cg(ciVar, evVar);
                compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                compoundButton2.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                C8633al alVar = eVar.f29993b;
                if (alVar == null) {
                    alVar = C8633al.f29901j;
                }
                C8696z zVar = alVar.f29908f;
                if (zVar == null) {
                    zVar = C8696z.f30032b;
                }
                int i = zVar.f30034a;
                int a2 = C8695y.m23377a(i);
                if (a2 == 0 || a2 != 3) {
                    int a3 = C8695y.m23377a(i);
                    if (a3 == 0 || a3 != 4) {
                        ((C59052c) ((C59052c) C132220ci.f360888a.mo56225c()).mo56372aa(39556)).mo56386p("Invalid news setting!");
                        ciVar.mo110549b();
                    } else if (!compoundButton2.isChecked()) {
                        compoundButton2.setChecked(true);
                    }
                } else if (!compoundButton.isChecked()) {
                    compoundButton.setChecked(true);
                }
                compoundButton.setOnCheckedChangeListener(cgVar);
                compoundButton2.setOnCheckedChangeListener(cgVar);
                CompoundButton compoundButton3 = (CompoundButton) requireView.findViewById(R.id.assistant_custodio_podcast_allowed_radio_button);
                CompoundButton compoundButton4 = (CompoundButton) requireView.findViewById(R.id.assistant_custodio_podcast_blocked_radio_button);
                C132300ev evVar2 = new C132300ev();
                evVar2.f361090a.add(compoundButton3);
                evVar2.f361090a.add(compoundButton4);
                C132219ch chVar = new C132219ch(ciVar, evVar2);
                compoundButton3.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                compoundButton4.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                C8633al alVar2 = eVar.f29993b;
                if (alVar2 == null) {
                    alVar2 = C8633al.f29901j;
                }
                C8624ac acVar = alVar2.f29909g;
                if (acVar == null) {
                    acVar = C8624ac.f29887b;
                }
                int i2 = acVar.f29889a;
                int a4 = C8623ab.m23350a(i2);
                if (a4 == 0 || a4 != 3) {
                    int a5 = C8623ab.m23350a(i2);
                    if (a5 == 0 || a5 != 4) {
                        ((C59052c) ((C59052c) C132220ci.f360888a.mo56225c()).mo56372aa(39557)).mo56386p("Invalid podcast setting!");
                        ciVar.mo110549b();
                    } else if (!compoundButton4.isChecked()) {
                        compoundButton4.setChecked(true);
                    }
                } else if (!compoundButton3.isChecked()) {
                    compoundButton3.setChecked(true);
                }
                compoundButton3.setOnCheckedChangeListener(chVar);
                compoundButton4.setOnCheckedChangeListener(chVar);
                C132220ci.this.mo110548a();
                C132220ci.this.f360897j.mo19974a(C37176a.f97034dt);
                return;
            }
            ((C59052c) ((C59052c) C132220ci.f360888a.mo56225c()).mo56372aa(39555)).mo56386p("Not provided with exactly one child's info!");
            C132220ci.this.mo110549b();
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132220ci.this.mo110550c();
        }
    }

    public C132220ci(CustodioNewsAndPodcastsSettingsFragment custodioNewsAndPodcastsSettingsFragment, C46485f fVar, C46801dp dpVar, C132140a aVar, C46439e eVar, C37215b bVar) {
        this.f360889b = custodioNewsAndPodcastsSettingsFragment;
        this.f360896i = fVar;
        Bundle arguments = custodioNewsAndPodcastsSettingsFragment.getArguments();
        this.f360890c = arguments == null ? new Bundle() : arguments;
        this.f360891d = dpVar;
        this.f360892e = aVar;
        this.f360894g = eVar;
        this.f360897j = bVar;
        this.f360895h = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                Void voidR = (Void) obj;
                ((C59052c) ((C59052c) ((C59052c) C132220ci.f360888a.mo56225c()).mo56382g(th)).mo56372aa(39553)).mo56389s("Failed to update news & podcast settings: %s", th.getMessage());
                C132220ci.this.mo110549b();
            }

            /* renamed from: c */
            public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
                Void voidR = (Void) obj;
                Void voidR2 = (Void) obj2;
                C132220ci.this.mo110548a();
            }

            /* renamed from: i */
            public final /* synthetic */ void mo18068i(Object obj) {
                Void voidR = (Void) obj;
                C132220ci.this.mo110550c();
            }
        };
    }

    /* renamed from: d */
    public static String m214867d(int i) {
        int i2 = i - 2;
        return i2 != 1 ? i2 != 2 ? "other" : "female" : "male";
    }

    /* renamed from: a */
    public final void mo110548a() {
        this.f360889b.requireView().findViewById(R.id.assistant_custodio_news_and_podcast_settings_progress_bar).setVisibility(8);
        this.f360889b.requireView().findViewById(R.id.assistant_custodio_news_and_podcast_settings_container).setVisibility(0);
    }

    /* renamed from: b */
    public final void mo110549b() {
        this.f360897j.mo19974a(C37176a.f97023di);
        this.f360896i.mo50482c(this.f360889b).mo50508d(R.id.assistant_custodio_news_and_podcasts_settings_fragment_to_dialog, C132287ei.m214954a(this.f360889b.getString(R.string.assistant_custodio_fatal_error_title), this.f360889b.getString(R.string.assistant_custodio_fatal_error_body), this.f360889b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }

    /* renamed from: c */
    public final void mo110550c() {
        this.f360889b.requireView().findViewById(R.id.assistant_custodio_news_and_podcast_settings_progress_bar).setVisibility(0);
        this.f360889b.requireView().findViewById(R.id.assistant_custodio_news_and_podcast_settings_container).setVisibility(8);
    }
}
