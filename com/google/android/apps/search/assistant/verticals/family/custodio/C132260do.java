package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60757n;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8647az;
import com.google.p427am.p432b.p433a.C8649ba;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4820d.p4822b.p4823a.C63223c;
import com.google.protos.p4816ai.p4820d.p4822b.p4823a.C63224d;
import p3186j$.util.Collection;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.do */
/* compiled from: PG */
public final class C132260do {

    /* renamed from: a */
    public static final C59071e f360986a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.do");

    /* renamed from: b */
    public final CustodioSteadyStateSettingsFragment f360987b;

    /* renamed from: c */
    public final Bundle f360988c;

    /* renamed from: d */
    public final C46485f f360989d;

    /* renamed from: e */
    public final C46801dp f360990e;

    /* renamed from: f */
    public final C132140a f360991f;

    /* renamed from: g */
    public final C132261a f360992g;

    /* renamed from: h */
    public final boolean f360993h;

    /* renamed from: i */
    public final C37215b f360994i;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.do$a */
    /* compiled from: PG */
    final class C132261a implements C46792di {

        /* renamed from: a */
        public ProgressBar f360995a;

        /* renamed from: b */
        public ScrollView f360996b;

        /* renamed from: c */
        public View f360997c;

        /* renamed from: d */
        public TextView f360998d;

        /* renamed from: e */
        public TextView f360999e;

        /* renamed from: f */
        public View f361000f;

        /* renamed from: g */
        public View f361001g;

        /* renamed from: h */
        public View f361002h;

        /* renamed from: i */
        public View f361003i;

        /* renamed from: k */
        private final Context f361005k;

        public C132261a() {
            this.f361005k = C132260do.this.f360987b.requireContext();
        }

        /* renamed from: d */
        private static final void m214918d(View view, int i, String str, String str2) {
            ((ImageView) view.findViewById(R.id.assistant_custodio_steady_state_settings_fragment_item_image)).setImageResource(i);
            ((TextView) view.findViewById(R.id.assistant_custodio_steady_state_settings_fragment_item_line1)).setText(str);
            ((TextView) view.findViewById(R.id.assistant_custodio_steady_state_settings_fragment_item_line2)).setText(str2);
            ((ImageView) view.findViewById(R.id.assistant_custodio_steady_state_settings_fragment_arrow_image)).setImageResource(R.drawable.assistant_custodio_steady_state_settings_toggle);
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132260do.f360986a.mo56225c()).mo56382g(th)).mo56372aa(39578)).mo56386p("Failed to fetch required information!");
            C132260do.this.mo110574a();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() == 1) {
                C8675e eVar = (C8675e) blVar.f29964b.get(0);
                C8628ag agVar = eVar.f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                View view = (View) Objects.requireNonNull(this.f360997c);
                int i = 0;
                for (C8649ba baVar : eVar.f29997f) {
                    int a = C8647az.m23361a(baVar.f29940g);
                    if (a != 0 && a == 4) {
                        i++;
                    }
                }
                if (i != 0) {
                    String string = this.f361005k.getString(R.string.assistant_custodio_steady_state_banner_link_device_text);
                    String string2 = this.f361005k.getString(R.string.assistant_custodio_steady_state_banner_link_device_link_text);
                    ((ImageView) view.findViewById(R.id.assistant_custodio_steady_state_settings_fragment_banner_image)).setImageResource(R.drawable.assistant_custodio_steady_state_settings_banner);
                    ((TextView) view.findViewById(R.id.assistant_custodio_steady_state_settings_fragment_banner_text)).setText(string);
                    ((Button) view.findViewById(R.id.assistant_custodio_steady_state_settings_fragment_link_text)).setText(string2);
                    ((View) Objects.requireNonNull(view)).setVisibility(0);
                } else {
                    ((View) Objects.requireNonNull(view)).setVisibility(8);
                }
                ((TextView) Objects.requireNonNull(this.f360998d)).setText(this.f361005k.getString(R.string.assistant_custodio_steady_state_settings_fragment_setup_title));
                ((TextView) Objects.requireNonNull(this.f360999e)).setText(this.f361005k.getString(R.string.assistant_custodio_settings_fragment_subtitle, new Object[]{agVar.f29893b}));
                m214918d((View) Objects.requireNonNull(this.f361000f), R.drawable.assistant_custodio_steady_state_settings_media, this.f361005k.getString(R.string.assistant_custodio_steady_state_media_title), this.f361005k.getString(R.string.assistant_custodio_steady_state_media_subtitle, new Object[]{agVar.f29893b}));
                m214918d((View) Objects.requireNonNull(this.f361001g), R.drawable.assistant_custodio_steady_state_settings_features, this.f361005k.getString(R.string.assistant_custodio_steady_state_assistant_feature_title), this.f361005k.getString(R.string.assistant_custodio_steady_state_assistant_feature_subtitle, new Object[]{agVar.f29893b}));
                m214918d((View) Objects.requireNonNull(this.f361002h), R.drawable.assistant_custodio_steady_state_settings_downtime, this.f361005k.getString(R.string.assistant_custodio_steady_state_downtime_title), this.f361005k.getString(R.string.assistant_custodio_steady_state_downtime_subtitle, new Object[]{agVar.f29893b}));
                m214918d((View) Objects.requireNonNull(this.f361003i), R.drawable.assistant_custodio_steady_state_settings_devices, this.f361005k.getString(R.string.assistant_custodio_steady_state_devices_title), this.f361005k.getString(R.string.assistant_custodio_steady_state_devices_subtitle, new Object[]{agVar.f29893b}));
                ((ProgressBar) Objects.requireNonNull(this.f360995a)).setVisibility(8);
                ((ScrollView) Objects.requireNonNull(this.f360996b)).setVisibility(0);
                C37215b bVar = C132260do.this.f360994i;
                C37258g gVar = C37176a.f97034dt;
                C62940bt btVar = C63224d.f170804o;
                C63223c cVar = (C63223c) C63224d.f170803n.createBuilder();
                long count = Collection.EL.stream(eVar.f29997f).filter(C132259dn.f360985a).count();
                cVar.copyOnWrite();
                C63224d dVar = (C63224d) cVar.instance;
                dVar.f170806a |= 1024;
                dVar.f170818m = C60757n.m92748i(count);
                bVar.mo19974a(gVar.mo40812e(btVar, (C63224d) cVar.build()));
                return;
            }
            ((C59052c) ((C59052c) C132260do.f360986a.mo56225c()).mo56372aa(39579)).mo56387q("Expected one child's data provided to CustodioSteadyStateSettingsFragment, got %d!", blVar.f29964b.size());
            C132260do.this.mo110574a();
        }

        /* renamed from: c */
        public final void mo18079c() {
            ((ProgressBar) Objects.requireNonNull(this.f360995a)).setVisibility(0);
            ((ScrollView) Objects.requireNonNull(this.f360996b)).setVisibility(8);
            ((View) Objects.requireNonNull(this.f360997c)).setVisibility(8);
        }
    }

    public C132260do(CustodioSteadyStateSettingsFragment custodioSteadyStateSettingsFragment, C46485f fVar, C46801dp dpVar, C132140a aVar, boolean z, C37215b bVar) {
        this.f360987b = custodioSteadyStateSettingsFragment;
        this.f360989d = fVar;
        this.f360990e = dpVar;
        this.f360991f = aVar;
        Bundle arguments = custodioSteadyStateSettingsFragment.getArguments();
        this.f360988c = arguments == null ? new Bundle() : arguments;
        this.f360992g = new C132261a();
        this.f360993h = z;
        this.f360994i = bVar;
    }

    /* renamed from: a */
    public final void mo110574a() {
        this.f360994i.mo19974a(C37176a.f97023di);
        this.f360989d.mo50482c(this.f360987b).mo50508d(R.id.assistant_custodio_steady_state_settings_fragment_to_dialog, C132287ei.m214954a(this.f360987b.getString(R.string.assistant_custodio_fatal_error_title), this.f360987b.getString(R.string.assistant_custodio_fatal_error_body), this.f360987b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }
}
