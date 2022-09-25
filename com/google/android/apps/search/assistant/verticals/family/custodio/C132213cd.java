package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10062e.C132277a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p427am.p432b.p433a.C8627af;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8632ak;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8690t;
import com.google.p427am.p432b.p433a.C8691u;
import com.google.p427am.p432b.p433a.C8692v;
import com.google.p427am.p432b.p433a.C8693w;
import com.google.protobuf.C62963cj;
import java.util.Locale;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cd */
/* compiled from: PG */
public final class C132213cd {

    /* renamed from: a */
    public static final C59071e f360868a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.cd");

    /* renamed from: b */
    public final CustodioMusicSettingsFragment f360869b;

    /* renamed from: c */
    public final Bundle f360870c;

    /* renamed from: d */
    public final C46801dp f360871d;

    /* renamed from: e */
    public final C132140a f360872e;

    /* renamed from: f */
    public final C132215a f360873f = new C132215a();

    /* renamed from: g */
    public final C46439e f360874g;

    /* renamed from: h */
    public final C46440f f360875h;

    /* renamed from: i */
    public final C132300ev f360876i;

    /* renamed from: j */
    public final C132277a f360877j;

    /* renamed from: k */
    public final C37215b f360878k;

    /* renamed from: l */
    public final C46485f f360879l;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cd$a */
    /* compiled from: PG */
    final class C132215a implements C46792di {
        public C132215a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132213cd.f360868a.mo56225c()).mo56382g(th)).mo56372aa(39549)).mo56386p("Failed to fetch required information!");
            C132213cd.this.mo110542c();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() == 1) {
                C8675e eVar = (C8675e) blVar.f29964b.get(0);
                C132213cd.this.mo110544e(false);
                C132213cd cdVar = C132213cd.this;
                C8628ag agVar = eVar.f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                TextView textView = (TextView) cdVar.f360869b.requireView().findViewById(R.id.assistant_custodio_music_settings_fragment_subtitle);
                String string = cdVar.f360869b.getString(R.string.assistant_custodio_music_settings_fragment_subtitle, agVar.f29893b);
                Object[] objArr = new Object[2];
                objArr[0] = "GENDER";
                int a = C8627af.m23352a(agVar.f29896e);
                if (a == 0) {
                    a = 1;
                }
                objArr[1] = C132213cd.m214856f(a);
                textView.setText(C5114a.m13988b(Locale.getDefault(), string, objArr));
                cdVar.f360869b.requireView().findViewById(R.id.assistant_custodio_music_settings_fragment_subtitle_link).setOnClickListener(new C132212cc(cdVar, agVar, eVar));
                C8633al alVar = eVar.f29993b;
                if (alVar == null) {
                    alVar = C8633al.f29901j;
                }
                C8693w wVar = alVar.f29903a;
                if (wVar == null) {
                    wVar = C8693w.f30027f;
                }
                C58528ij F = C58528ij.m90006F(new C62963cj(wVar.f30031d, C8693w.f30026e));
                C8633al alVar2 = eVar.f29993b;
                if (alVar2 == null) {
                    alVar2 = C8633al.f29901j;
                }
                C8693w wVar2 = alVar2.f29903a;
                if (wVar2 == null) {
                    wVar2 = C8693w.f30027f;
                }
                int a2 = C8691u.m23375a(wVar2.f30029a);
                if (a2 == 0) {
                    a2 = 1;
                }
                View requireView = cdVar.f360869b.requireView();
                if (a2 == 2 || a2 == 1) {
                    ((C59052c) ((C59052c) C132213cd.f360868a.mo56225c()).mo56372aa(39551)).mo56386p("Invalid music settings state!");
                    cdVar.mo110542c();
                } else {
                    MediaFilterRadioButton mediaFilterRadioButton = (MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_some_music_setting);
                    View findViewById = requireView.findViewById(R.id.assistant_custodio_music_providers_container);
                    boolean z = a2 != 4;
                    findViewById.setVisibility((a2 != 4 || F.isEmpty()) ? 8 : 0);
                    C132211cb cbVar = new C132211cb(cdVar, mediaFilterRadioButton, requireView, F);
                    C132213cd.m214854a((MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_all_music_setting), R.drawable.quantum_ic_audiotrack_vd_theme_24, R.string.assistant_custodio_play_all_music_setting_title, cdVar.f360869b.getString(R.string.assistant_custodio_play_all_music_setting_subtitle, agVar.f29893b), a2 == 3, cbVar);
                    if (F.isEmpty()) {
                        requireView.findViewById(R.id.assistant_custodio_play_some_music_setting).setVisibility(8);
                    } else {
                        requireView.findViewById(R.id.assistant_custodio_play_some_music_setting).setVisibility(0);
                        C132213cd.m214854a((MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_some_music_setting), R.drawable.quantum_ic_library_music_vd_theme_24, R.string.assistant_custodio_play_some_music_setting_title, cdVar.f360869b.getString(R.string.assistant_custodio_play_some_music_setting_subtitle, agVar.f29893b), !z, cbVar);
                    }
                    C132213cd.m214854a((MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_none_music_setting), R.drawable.quantum_ic_music_off_vd_theme_24, R.string.assistant_custodio_play_none_music_setting_title, cdVar.f360869b.getString(R.string.assistant_custodio_play_none_music_setting_subtitle, agVar.f29893b), a2 == 5 || (a2 == 4 && F.isEmpty()), cbVar);
                }
                C8633al alVar3 = eVar.f29993b;
                if (alVar3 == null) {
                    alVar3 = C8633al.f29901j;
                }
                C8693w wVar3 = alVar3.f29903a;
                if (wVar3 == null) {
                    wVar3 = C8693w.f30027f;
                }
                C58528ij F2 = C58528ij.m90006F(new C62963cj(wVar3.f30030b, C8693w.f30025c));
                C132199bz bzVar = new C132199bz(cdVar, F);
                C132213cd.m214855b(cdVar.f360869b, R.id.assistant_custodio_youtube_music_provider, R.string.assistant_custodio_youtube_media_provider_name, R.string.assistant_custodio_youtube_media_provider_link, F.contains(C8692v.YOUTUBE), F2.contains(C8692v.YOUTUBE), bzVar, new C132210ca(cdVar));
                C132213cd.m214855b(cdVar.f360869b, R.id.assistant_custodio_pandora_music_provider, R.string.assistant_custodio_pandora_music_media_provider_name, 0, F.contains(C8692v.PANDORA), F2.contains(C8692v.PANDORA), bzVar, (View.OnClickListener) null);
                C132213cd.m214855b(cdVar.f360869b, R.id.assistant_custodio_spotify_music_provider, R.string.assistant_custodio_spotifiy_music_media_provider_name, 0, F.contains(C8692v.SPOTIFY), F2.contains(C8692v.SPOTIFY), bzVar, (View.OnClickListener) null);
                C132213cd.m214855b(cdVar.f360869b, R.id.assistant_custodio_apple_music_provider, R.string.assistant_custodio_apple_music_media_provider_name, 0, F.contains(C8692v.APPLE_MUSIC), F2.contains(C8692v.APPLE_MUSIC), bzVar, (View.OnClickListener) null);
                C132213cd.this.f360878k.mo19974a(C37176a.f97034dt);
                return;
            }
            ((C59052c) ((C59052c) C132213cd.f360868a.mo56225c()).mo56372aa(39550)).mo56386p("Not provided with exactly one child's info!");
            C132213cd.this.mo110542c();
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132213cd.this.mo110544e(true);
        }
    }

    public C132213cd(CustodioMusicSettingsFragment custodioMusicSettingsFragment, C46801dp dpVar, C132140a aVar, C46439e eVar, C132277a aVar2, C37215b bVar, C46485f fVar) {
        this.f360869b = custodioMusicSettingsFragment;
        Bundle arguments = custodioMusicSettingsFragment.getArguments();
        this.f360870c = arguments == null ? new Bundle() : arguments;
        this.f360871d = dpVar;
        this.f360872e = aVar;
        this.f360874g = eVar;
        this.f360877j = aVar2;
        this.f360878k = bVar;
        this.f360879l = fVar;
        this.f360875h = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                Void voidR = (Void) obj;
                ((C59052c) ((C59052c) ((C59052c) C132213cd.f360868a.mo56225c()).mo56382g(th)).mo56372aa(39548)).mo56386p("Failed to update music settings!");
                C132213cd.this.mo110542c();
            }

            /* renamed from: c */
            public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
                Void voidR = (Void) obj;
                Void voidR2 = (Void) obj2;
                C132213cd.this.mo110544e(false);
            }

            /* renamed from: i */
            public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
                Void voidR = (Void) obj;
                C132213cd.this.mo110544e(true);
            }
        };
        this.f360876i = new C132300ev();
    }

    /* renamed from: a */
    public static void m214854a(MediaFilterRadioButton mediaFilterRadioButton, int i, int i2, String str, boolean z, C132296er erVar) {
        mediaFilterRadioButton.mo110454e(mediaFilterRadioButton.getContext().getString(i2));
        mediaFilterRadioButton.mo110451b(str);
        mediaFilterRadioButton.mo110452c(i);
        mediaFilterRadioButton.mo110453d((C132296er) null);
        mediaFilterRadioButton.setChecked(z);
        mediaFilterRadioButton.mo110453d(erVar);
    }

    /* renamed from: b */
    public static void m214855b(Fragment fragment, int i, int i2, int i3, boolean z, boolean z2, C132299eu euVar, View.OnClickListener onClickListener) {
        MediaProviderCheckBox mediaProviderCheckBox = (MediaProviderCheckBox) fragment.requireView().findViewById(i);
        if (!z) {
            mediaProviderCheckBox.setVisibility(8);
            return;
        }
        mediaProviderCheckBox.setVisibility(0);
        ((TextView) Objects.requireNonNull(mediaProviderCheckBox.f360602d)).setText(fragment.getString(i2));
        if (i3 == 0 || onClickListener == null) {
            mediaProviderCheckBox.mo110463d((String) null);
        } else {
            mediaProviderCheckBox.mo110463d(fragment.getString(i3));
            mediaProviderCheckBox.mo110462c((View.OnClickListener) Objects.requireNonNull(onClickListener));
        }
        mediaProviderCheckBox.mo110461b((C132299eu) null);
        mediaProviderCheckBox.setChecked(z2);
        mediaProviderCheckBox.mo110461b(euVar);
    }

    /* renamed from: f */
    public static String m214856f(int i) {
        int i2 = i - 2;
        return i2 != 1 ? i2 != 2 ? "other" : "female" : "male";
    }

    /* renamed from: c */
    public final void mo110542c() {
        this.f360878k.mo19974a(C37176a.f97023di);
        this.f360879l.mo50482c(this.f360869b).mo50508d(R.id.assistant_custodio_music_settings_fragment_to_dialog, C132287ei.m214954a(this.f360869b.getString(R.string.assistant_custodio_fatal_error_title), this.f360869b.getString(R.string.assistant_custodio_fatal_error_body), this.f360869b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }

    /* renamed from: d */
    public final void mo110543d(Set set) {
        mo110544e(false);
        String string = this.f360870c.getString("entry_point_id");
        String string2 = this.f360870c.getString("supervised_oid");
        if (string2 == null || string == null) {
            ((C59052c) ((C59052c) f360868a.mo56225c()).mo56372aa(39552)).mo56386p("Not provided with required argument!");
            mo110542c();
            return;
        }
        View requireView = this.f360869b.requireView();
        MediaFilterRadioButton mediaFilterRadioButton = (MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_some_music_setting);
        MediaProviderCheckBox mediaProviderCheckBox = (MediaProviderCheckBox) requireView.findViewById(R.id.assistant_custodio_youtube_music_provider);
        MediaProviderCheckBox mediaProviderCheckBox2 = (MediaProviderCheckBox) requireView.findViewById(R.id.assistant_custodio_pandora_music_provider);
        MediaProviderCheckBox mediaProviderCheckBox3 = (MediaProviderCheckBox) requireView.findViewById(R.id.assistant_custodio_spotify_music_provider);
        MediaProviderCheckBox mediaProviderCheckBox4 = (MediaProviderCheckBox) requireView.findViewById(R.id.assistant_custodio_apple_music_provider);
        C8690t tVar = (C8690t) C8693w.f30027f.createBuilder();
        if (((MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_all_music_setting)).isChecked()) {
            tVar.copyOnWrite();
            ((C8693w) tVar.instance).f30029a = 1;
        } else if (mediaFilterRadioButton.isChecked()) {
            tVar.copyOnWrite();
            ((C8693w) tVar.instance).f30029a = 2;
            if (set.contains(C8692v.YOUTUBE) && mediaProviderCheckBox.isChecked()) {
                tVar.mo17214a(C8692v.YOUTUBE);
            }
            if (set.contains(C8692v.PANDORA) && mediaProviderCheckBox2.isChecked()) {
                tVar.mo17214a(C8692v.PANDORA);
            }
            if (set.contains(C8692v.SPOTIFY) && mediaProviderCheckBox3.isChecked()) {
                tVar.mo17214a(C8692v.SPOTIFY);
            }
            if (set.contains(C8692v.APPLE_MUSIC) && mediaProviderCheckBox4.isChecked()) {
                tVar.mo17214a(C8692v.APPLE_MUSIC);
            }
        } else {
            tVar.copyOnWrite();
            ((C8693w) tVar.instance).f30029a = 3;
        }
        C46439e eVar = this.f360874g;
        C132140a aVar = this.f360872e;
        C8632ak akVar = (C8632ak) C8633al.f29901j.createBuilder();
        akVar.copyOnWrite();
        C8693w wVar = (C8693w) tVar.build();
        wVar.getClass();
        ((C8633al) akVar.instance).f29903a = wVar;
        C46438d b = C46438d.m82810b(aVar.mo110504d(string, string2, (C8633al) akVar.build()));
        eVar.mo50428h(b.f121541a, (Object) null, this.f360875h);
    }

    /* renamed from: e */
    public final void mo110544e(boolean z) {
        int i = 8;
        this.f360869b.requireView().findViewById(R.id.assistant_custodio_music_settings_progress_bar).setVisibility(true != z ? 8 : 0);
        View findViewById = this.f360869b.requireView().findViewById(R.id.assistant_custodio_music_settings_container);
        if (true != z) {
            i = 0;
        }
        findViewById.setVisibility(i);
    }
}
