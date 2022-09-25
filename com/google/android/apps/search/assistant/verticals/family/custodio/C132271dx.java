package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
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
import com.google.p427am.p432b.p433a.C8639ar;
import com.google.p427am.p432b.p433a.C8640as;
import com.google.p427am.p432b.p433a.C8641at;
import com.google.p427am.p432b.p433a.C8642au;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8692v;
import com.google.p427am.p432b.p433a.C8693w;
import com.google.protobuf.C62963cj;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.dx */
/* compiled from: PG */
public final class C132271dx {

    /* renamed from: a */
    public static final C59071e f361025a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.dx");

    /* renamed from: b */
    public final CustodioVideoSettingsFragment f361026b;

    /* renamed from: c */
    public final Bundle f361027c;

    /* renamed from: d */
    public final C46801dp f361028d;

    /* renamed from: e */
    public final C132140a f361029e;

    /* renamed from: f */
    public final C132273a f361030f = new C132273a();

    /* renamed from: g */
    public final C46439e f361031g;

    /* renamed from: h */
    public final C132300ev f361032h;

    /* renamed from: i */
    public final C46440f f361033i;

    /* renamed from: j */
    public final C132277a f361034j;

    /* renamed from: k */
    public final C37215b f361035k;

    /* renamed from: l */
    public final C46485f f361036l;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.dx$a */
    /* compiled from: PG */
    final class C132273a implements C46792di {
        public C132273a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132271dx.f361025a.mo56225c()).mo56382g(th)).mo56372aa(39582)).mo56386p("Failed to fetch required information!");
            C132271dx.this.mo110578c();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            int a;
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() == 1) {
                C8675e eVar = (C8675e) blVar.f29964b.get(0);
                C132271dx dxVar = C132271dx.this;
                C8628ag agVar = eVar.f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                C8633al alVar = eVar.f29993b;
                if (alVar == null) {
                    alVar = C8633al.f29901j;
                }
                C8642au auVar = alVar.f29904b;
                if (auVar == null) {
                    auVar = C8642au.f29924f;
                }
                C58528ij F = C58528ij.m90006F(new C62963cj(auVar.f29928d, C8642au.f29923e));
                View requireView = dxVar.f361026b.requireView();
                MediaFilterRadioButton mediaFilterRadioButton = (MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_all_videos_setting);
                MediaFilterRadioButton mediaFilterRadioButton2 = (MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_some_videos_setting);
                MediaProviderCheckBox mediaProviderCheckBox = (MediaProviderCheckBox) requireView.findViewById(R.id.assistant_custodio_youtube_video_provider);
                MediaFilterRadioButton mediaFilterRadioButton3 = (MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_none_videos_setting);
                ((TextView) requireView.findViewById(R.id.assistant_custodio_video_settings_fragment_subtitle)).setText(dxVar.f361026b.getString(R.string.assistant_custodio_video_settings_fragment_subtitle, agVar.f29893b));
                requireView.findViewById(R.id.assistant_custodio_video_settings_fragment_subtitle_link).setOnClickListener(new C132268du(dxVar, agVar, eVar));
                mediaFilterRadioButton.mo110453d((C132296er) null);
                mediaFilterRadioButton2.mo110453d((C132296er) null);
                mediaProviderCheckBox.mo110461b((C132299eu) null);
                mediaFilterRadioButton3.mo110453d((C132296er) null);
                MediaFilterRadioButton mediaFilterRadioButton4 = (MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_all_videos_setting);
                String string = dxVar.f361026b.getString(R.string.assistant_custodio_play_all_video_setting_subtitle);
                Object[] objArr = new Object[4];
                objArr[0] = "GENDER";
                int a2 = C8627af.m23352a(agVar.f29896e);
                if (a2 == 0) {
                    a2 = 1;
                }
                objArr[1] = C132271dx.m214937g(a2);
                objArr[2] = "PERSON";
                objArr[3] = agVar.f29893b;
                C132271dx.m214935a(mediaFilterRadioButton4, R.drawable.quantum_ic_ondemand_video_vd_theme_24, R.string.assistant_custodio_play_all_video_setting_title, C5114a.m13988b(Locale.getDefault(), string, objArr));
                int a3 = C8640as.m23358a(auVar.f29926a);
                mediaFilterRadioButton.setChecked(a3 != 0 && a3 == 3);
                boolean z = F.contains(C8641at.YOUTUBE) && F.contains(C8641at.YOUTUBE_KIDS) && F.contains(C8641at.YOUTUBE_TV);
                if (z) {
                    C132271dx.m214935a((MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_some_videos_setting), R.drawable.quantum_ic_video_youtube_vd_theme_24, R.string.assistant_custodio_play_some_video_setting_title, dxVar.f361026b.getString(R.string.assistant_custodio_play_some_video_setting_subtitle, agVar.f29893b));
                    requireView.findViewById(R.id.assistant_custodio_play_some_videos_setting).setVisibility(0);
                    int a4 = C8640as.m23358a(auVar.f29926a);
                    mediaFilterRadioButton2.setChecked(a4 != 0 && a4 == 4);
                    if (mediaFilterRadioButton2.isChecked()) {
                        requireView.findViewById(R.id.assistant_custodio_youtube_video_provider).setVisibility(0);
                        requireView.findViewById(R.id.assistant_custodio_video_provider_divider).setVisibility(0);
                        mediaProviderCheckBox.setChecked(new C62963cj(auVar.f29927b, C8642au.f29922c).contains(C8641at.YOUTUBE));
                    } else {
                        requireView.findViewById(R.id.assistant_custodio_youtube_video_provider).setVisibility(8);
                        requireView.findViewById(R.id.assistant_custodio_video_provider_divider).setVisibility(8);
                    }
                } else {
                    requireView.findViewById(R.id.assistant_custodio_play_some_videos_setting).setVisibility(8);
                    requireView.findViewById(R.id.assistant_custodio_youtube_video_provider).setVisibility(8);
                    requireView.findViewById(R.id.assistant_custodio_video_provider_divider).setVisibility(8);
                }
                MediaFilterRadioButton mediaFilterRadioButton5 = (MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_none_videos_setting);
                CustodioVideoSettingsFragment custodioVideoSettingsFragment = dxVar.f361026b;
                C8633al alVar2 = eVar.f29993b;
                if (alVar2 == null) {
                    alVar2 = C8633al.f29901j;
                }
                C132271dx.m214935a(mediaFilterRadioButton5, R.drawable.quantum_ic_block_vd_theme_24, R.string.assistant_custodio_play_none_video_setting_title, custodioVideoSettingsFragment.getString(true != C132271dx.m214936f(alVar2) ? R.string.assistant_custodio_play_none_video_setting_subtitle_no_youtube : R.string.assistant_custodio_play_none_video_setting_subtitle_with_youtube, agVar.f29893b));
                int i = auVar.f29926a;
                int a5 = C8640as.m23358a(i);
                mediaFilterRadioButton3.setChecked((a5 != 0 && a5 == 5) || (!z && (a = C8640as.m23358a(i)) != 0 && a == 4));
                C132269dv dvVar = new C132269dv(dxVar, mediaFilterRadioButton2, requireView, F);
                mediaFilterRadioButton.mo110453d(dvVar);
                mediaProviderCheckBox.mo110461b(new C132270dw(dxVar, F));
                mediaFilterRadioButton2.mo110453d(dvVar);
                mediaFilterRadioButton3.mo110453d(dvVar);
                C132271dx.this.mo110577b();
                C132271dx.this.f361035k.mo19974a(C37176a.f97034dt);
                return;
            }
            ((C59052c) ((C59052c) C132271dx.f361025a.mo56225c()).mo56372aa(39583)).mo56386p("More than one child's data provided!");
            C132271dx.this.mo110578c();
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132271dx.this.mo110580e();
        }
    }

    public C132271dx(CustodioVideoSettingsFragment custodioVideoSettingsFragment, C46801dp dpVar, C132140a aVar, C46439e eVar, C132277a aVar2, C37215b bVar, C46485f fVar) {
        this.f361026b = custodioVideoSettingsFragment;
        Bundle arguments = custodioVideoSettingsFragment.getArguments();
        this.f361027c = arguments == null ? new Bundle() : arguments;
        this.f361028d = dpVar;
        this.f361029e = aVar;
        this.f361031g = eVar;
        this.f361034j = aVar2;
        this.f361035k = bVar;
        this.f361036l = fVar;
        this.f361032h = new C132300ev();
        this.f361033i = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                Void voidR = (Void) obj;
                ((C59052c) ((C59052c) ((C59052c) C132271dx.f361025a.mo56225c()).mo56382g(th)).mo56372aa(39581)).mo56386p("Failed to update video settings!");
                C132271dx.this.mo110578c();
            }

            /* renamed from: c */
            public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
                Void voidR = (Void) obj;
                Void voidR2 = (Void) obj2;
                C132271dx.this.mo110577b();
            }

            /* renamed from: i */
            public final /* synthetic */ void mo18068i(Object obj) {
                Void voidR = (Void) obj;
                C132271dx.this.mo110580e();
            }
        };
    }

    /* renamed from: a */
    public static void m214935a(MediaFilterRadioButton mediaFilterRadioButton, int i, int i2, String str) {
        mediaFilterRadioButton.mo110454e(mediaFilterRadioButton.getContext().getString(i2));
        mediaFilterRadioButton.mo110451b(str);
        mediaFilterRadioButton.mo110452c(i);
    }

    /* renamed from: f */
    public static boolean m214936f(C8633al alVar) {
        C8642au auVar = alVar.f29904b;
        if (auVar == null) {
            auVar = C8642au.f29924f;
        }
        HashSet hashSet = new HashSet(new C62963cj(auVar.f29928d, C8642au.f29923e));
        C8693w wVar = alVar.f29903a;
        if (wVar == null) {
            wVar = C8693w.f30027f;
        }
        return hashSet.contains(C8641at.YOUTUBE) || hashSet.contains(C8641at.YOUTUBE_KIDS) || hashSet.contains(C8641at.YOUTUBE_TV) || new HashSet(new C62963cj(wVar.f30031d, C8693w.f30026e)).contains(C8692v.YOUTUBE);
    }

    /* renamed from: g */
    public static String m214937g(int i) {
        int i2 = i - 2;
        return i2 != 1 ? i2 != 2 ? "other" : "female" : "male";
    }

    /* renamed from: b */
    public final void mo110577b() {
        this.f361026b.requireView().findViewById(R.id.assistant_custodio_video_settings_progress_bar).setVisibility(8);
        this.f361026b.requireView().findViewById(R.id.assistant_custodio_video_settings_container).setVisibility(0);
    }

    /* renamed from: c */
    public final void mo110578c() {
        this.f361035k.mo19974a(C37176a.f97023di);
        this.f361036l.mo50482c(this.f361026b).mo50508d(R.id.assistant_custodio_video_settings_fragment_to_dialog, C132287ei.m214954a(this.f361026b.getString(R.string.assistant_custodio_fatal_error_title), this.f361026b.getString(R.string.assistant_custodio_fatal_error_body), this.f361026b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }

    /* renamed from: d */
    public final void mo110579d(Set set) {
        mo110577b();
        String string = this.f361027c.getString("entry_point_id");
        String string2 = this.f361027c.getString("supervised_oid");
        if (string2 == null || string == null) {
            ((C59052c) ((C59052c) f361025a.mo56225c()).mo56372aa(39584)).mo56386p("Not provided with required argument!");
            mo110578c();
            return;
        }
        View requireView = this.f361026b.requireView();
        MediaFilterRadioButton mediaFilterRadioButton = (MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_some_videos_setting);
        MediaProviderCheckBox mediaProviderCheckBox = (MediaProviderCheckBox) requireView.findViewById(R.id.assistant_custodio_youtube_video_provider);
        C8639ar arVar = (C8639ar) C8642au.f29924f.createBuilder();
        if (((MediaFilterRadioButton) requireView.findViewById(R.id.assistant_custodio_play_all_videos_setting)).isChecked()) {
            arVar.copyOnWrite();
            ((C8642au) arVar.instance).f29926a = 1;
        } else if (mediaFilterRadioButton.isChecked()) {
            arVar.copyOnWrite();
            ((C8642au) arVar.instance).f29926a = 2;
            if (mediaProviderCheckBox.isChecked() && set.contains(C8641at.YOUTUBE) && set.contains(C8641at.YOUTUBE_KIDS) && set.contains(C8641at.YOUTUBE_TV)) {
                arVar.mo17205a(C8641at.YOUTUBE);
                arVar.mo17205a(C8641at.YOUTUBE_TV);
                arVar.mo17205a(C8641at.YOUTUBE_KIDS);
            }
        } else {
            arVar.copyOnWrite();
            ((C8642au) arVar.instance).f29926a = 3;
        }
        C8632ak akVar = (C8632ak) C8633al.f29901j.createBuilder();
        akVar.copyOnWrite();
        C8642au auVar = (C8642au) arVar.build();
        auVar.getClass();
        ((C8633al) akVar.instance).f29904b = auVar;
        C46439e eVar = this.f361031g;
        C46438d b = C46438d.m82810b(this.f361029e.mo110504d(string, string2, (C8633al) akVar.build()));
        eVar.mo50428h(b.f121541a, (Object) null, this.f361033i);
    }

    /* renamed from: e */
    public final void mo110580e() {
        this.f361026b.requireView().findViewById(R.id.assistant_custodio_video_settings_progress_bar).setVisibility(0);
        this.f361026b.requireView().findViewById(R.id.assistant_custodio_video_settings_container).setVisibility(8);
    }
}
