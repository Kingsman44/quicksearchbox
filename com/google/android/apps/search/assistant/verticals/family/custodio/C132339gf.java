package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.C0816c;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p427am.p432b.p433a.C8625ad;
import com.google.p427am.p432b.p433a.C8627af;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8647az;
import com.google.p427am.p432b.p433a.C8649ba;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.gf */
/* compiled from: PG */
public final class C132339gf {

    /* renamed from: a */
    public static final C59071e f361248a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.gf");

    /* renamed from: b */
    public final VoiceMatchDeeplinkingFragment f361249b;

    /* renamed from: c */
    public final Bundle f361250c;

    /* renamed from: d */
    public final C46801dp f361251d;

    /* renamed from: e */
    public final C132140a f361252e;

    /* renamed from: f */
    public final C46485f f361253f;

    /* renamed from: g */
    public final C132341a f361254g;

    /* renamed from: h */
    public final C46439e f361255h;

    /* renamed from: i */
    public final C46440f f361256i;

    /* renamed from: j */
    public final C37215b f361257j;

    /* renamed from: k */
    public final boolean f361258k;

    /* renamed from: l */
    public VoiceMatchDeeplinkingFragmentViewModel f361259l;

    /* renamed from: m */
    public C0816c f361260m;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.gf$a */
    /* compiled from: PG */
    final class C132341a implements C46792di {
        public C132341a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132339gf.f361248a.mo56225c()).mo56382g(th)).mo56372aa(39589)).mo56386p("Failed to fetch kid account details");
            C132339gf.this.mo110654b();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (!((VoiceMatchDeeplinkingFragmentViewModel) Objects.requireNonNull(C132339gf.this.f361259l)).f360620a) {
                if (blVar.f29964b.size() == 1) {
                    C8675e eVar = (C8675e) blVar.f29964b.get(0);
                    C8628ag agVar = eVar.f29994c;
                    if (agVar == null) {
                        agVar = C8628ag.f29890g;
                    }
                    ((VoiceMatchDeeplinkingFragmentViewModel) Objects.requireNonNull(C132339gf.this.f361259l)).f360621b = eVar;
                    C132339gf.this.mo110655c(eVar, agVar);
                    C132339gf.this.f361257j.mo19974a(C37176a.f97034dt);
                    return;
                }
                throw new IllegalStateException("More than one child's data provided!");
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C132339gf(VoiceMatchDeeplinkingFragment voiceMatchDeeplinkingFragment, C46801dp dpVar, C132140a aVar, C46485f fVar, C46439e eVar, final C37215b bVar, boolean z) {
        this.f361249b = voiceMatchDeeplinkingFragment;
        Bundle arguments = voiceMatchDeeplinkingFragment.getArguments();
        this.f361250c = arguments == null ? new Bundle() : arguments;
        this.f361251d = dpVar;
        this.f361252e = aVar;
        this.f361253f = fVar;
        this.f361255h = eVar;
        this.f361257j = bVar;
        this.f361258k = z;
        this.f361256i = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                Void voidR = (Void) obj;
                ((C59052c) ((C59052c) ((C59052c) C132339gf.f361248a.mo56225c()).mo56382g(th)).mo56372aa(39588)).mo56386p("Failed to update Custodio setup bit");
                C132339gf.this.mo110654b();
            }

            /* renamed from: c */
            public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
                Void voidR = (Void) obj;
                Void voidR2 = (Void) obj2;
                bVar.mo19974a(C37176a.f97002dN);
                C132339gf.this.mo110653a();
            }

            /* renamed from: i */
            public final /* synthetic */ void mo18068i(Object obj) {
            }
        };
        this.f361254g = new C132341a();
    }

    /* renamed from: a */
    public final void mo110653a() {
        this.f361253f.mo50482c(this.f361249b).mo50508d(R.id.assistant_voice_match_deeplinking_fragment_success, this.f361250c);
    }

    /* renamed from: b */
    public final void mo110654b() {
        this.f361257j.mo19974a(C37176a.f97023di);
        this.f361253f.mo50482c(this.f361249b).mo50508d(R.id.assistant_voice_match_deeplinking_fragment_to_dialog, C132287ei.m214954a(this.f361249b.getString(R.string.assistant_custodio_fatal_error_title), this.f361249b.getString(R.string.assistant_custodio_fatal_error_body), this.f361249b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }

    /* renamed from: c */
    public final void mo110655c(C8675e eVar, C8628ag agVar) {
        String str;
        String string = this.f361250c.getString("account_name");
        String string2 = this.f361250c.getString("entry_point_id");
        if (string == null || string2 == null) {
            ((C59052c) ((C59052c) f361248a.mo56225c()).mo56372aa(39593)).mo56386p("Not provided with required account name!");
            mo110654b();
            return;
        }
        C18509a c = C18522b.m35986c();
        C18523c cVar = (C18523c) c;
        cVar.f52494c = string;
        cVar.f52492a = "speaker_id_enrollment";
        c.mo24019a().putString("assistant_settings_feature_action", "parental_controls_device_discovery");
        Bundle a = c.mo24019a();
        Bundle bundle = new Bundle();
        bundle.putString("assistant_settings_unicorn_child_user_id", eVar.f29992a);
        bundle.putString("assistant_settings_unicorn_child_email", agVar.f29895d);
        bundle.putString("assistant_settings_unicorn_child_name", agVar.f29893b);
        int a2 = C8627af.m23352a(agVar.f29896e);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 2;
        bundle.putString("assistant_settings_unicorn_child_gender", i != 1 ? i != 2 ? "other" : "female" : "male");
        ArrayList arrayList = new ArrayList();
        if (this.f361250c.getBoolean("custodio_is_from_device_list")) {
            for (C8649ba baVar : eVar.f29997f) {
                int a3 = C8647az.m23361a(baVar.f29940g);
                if (a3 != 0 && a3 == 4) {
                    Bundle bundle2 = new Bundle();
                    if ((baVar.f29934a & 1) != 0) {
                        bundle2.putString("custodio_eligible_cast_device_id", baVar.f29935b);
                        bundle2.putString("custodio_eligible_lib_assistant_device_id", baVar.f29935b);
                    }
                    int i2 = baVar.f29934a;
                    if ((i2 & 4) != 0) {
                        str = baVar.f29937d;
                    } else {
                        str = (i2 & 32) != 0 ? baVar.f29938e : (i2 & 64) != 0 ? baVar.f29939f : null;
                    }
                    if (str != null) {
                        bundle2.putString("custodio_eligible_assistant_device_name", str);
                    }
                    arrayList.add(bundle2);
                }
            }
        }
        bundle.putParcelableArrayList("custodio_eligible_device_info", arrayList);
        bundle.putString("assistant_settings_parental_controls_entry_point", string2);
        int i3 = agVar.f29897f;
        int a4 = C8625ad.m23351a(i3);
        if (a4 != 0 && a4 == 4) {
            bundle.putInt("assistant_settings_supervised_account_type", 1);
        } else {
            int a5 = C8625ad.m23351a(i3);
            if (a5 != 0 && a5 == 3) {
                bundle.putInt("assistant_settings_supervised_account_type", 0);
            } else {
                int a6 = C8625ad.m23351a(i3);
                if (a6 != 0 && a6 == 5) {
                    bundle.putInt("assistant_settings_supervised_account_type", 2);
                }
            }
        }
        a.putParcelable("assistant_settings_unicorn_impersonation_info", bundle);
        Intent a7 = c.mo24020b().mo24031a();
        try {
            C0816c cVar2 = this.f361260m;
            if (cVar2 != null) {
                cVar2.mo526b(a7);
                this.f361257j.mo19974a(C37176a.f96996dH);
            }
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f361248a.mo56225c()).mo56382g(e)).mo56372aa(39594)).mo56386p("Error intenting to AGSA");
            mo110654b();
        }
    }
}
