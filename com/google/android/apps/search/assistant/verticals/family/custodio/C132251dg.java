package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p427am.p432b.p433a.C8627af;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.dg */
/* compiled from: PG */
public final class C132251dg {

    /* renamed from: a */
    public static final C59071e f360970a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.dg");

    /* renamed from: b */
    public final Activity f360971b;

    /* renamed from: c */
    public final CustodioSetupSummaryFragment f360972c;

    /* renamed from: d */
    public final Bundle f360973d;

    /* renamed from: e */
    public final C46485f f360974e;

    /* renamed from: f */
    public final C132140a f360975f;

    /* renamed from: g */
    public final C46801dp f360976g;

    /* renamed from: h */
    public final C132252a f360977h;

    /* renamed from: i */
    public final C37215b f360978i;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.dg$a */
    /* compiled from: PG */
    final class C132252a implements C46792di {
        public C132252a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132251dg.f360970a.mo56225c()).mo56382g(th)).mo56372aa(39576)).mo56386p("Failed to fetch required information!");
            C132251dg.this.mo110568b();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() == 1) {
                C8628ag agVar = ((C8675e) blVar.f29964b.get(0)).f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                TextView textView = (TextView) C132251dg.this.f360972c.requireView().findViewById(R.id.assistant_custodio_setup_summary_fragment_title);
                if (C132251dg.this.f360973d.getBoolean("use_add_devices_text", false)) {
                    textView.setText(C132251dg.this.f360972c.getString(R.string.assistant_custodio_setup_summary_fragment_title_device_focused, agVar.f29893b));
                } else {
                    textView.setText(C132251dg.this.f360972c.getString(R.string.assistant_custodio_setup_summary_fragment_title, agVar.f29893b));
                }
                TextView textView2 = (TextView) C132251dg.this.f360972c.requireView().findViewById(R.id.assistant_custodio_setup_summary_fragment_subheading);
                if (C132251dg.this.f360973d.getBoolean("use_add_devices_text", false)) {
                    textView2.setText(C132251dg.this.f360972c.getString(R.string.assistant_custodio_setup_summary_fragment_add_devices_subheading));
                } else {
                    textView2.setText(C132251dg.this.f360972c.getString(R.string.assistant_custodio_setup_summary_fragment_subheading));
                }
                View findViewById = C132251dg.this.f360972c.requireView().findViewById(R.id.assistant_custodio_setup_summary_fragment_bullet_1);
                String string = C132251dg.this.f360972c.getString(R.string.assistant_custodio_setup_summary_fragment_bullet_1);
                Object[] objArr = new Object[4];
                objArr[0] = "GENDER";
                int a = C8627af.m23352a(agVar.f29896e);
                if (a == 0) {
                    a = 1;
                }
                objArr[1] = C132251dg.m214910c(a);
                objArr[2] = "PERSON";
                objArr[3] = agVar.f29893b;
                C132251dg.m214909a(findViewById, R.drawable.quantum_gm_ic_settings_vd_theme_24, C5114a.m13988b(Locale.getDefault(), string, objArr));
                View findViewById2 = C132251dg.this.f360972c.requireView().findViewById(R.id.assistant_custodio_setup_summary_fragment_bullet_2);
                String string2 = C132251dg.this.f360972c.getString(R.string.assistant_custodio_setup_summary_fragment_bullet_2);
                Object[] objArr2 = new Object[4];
                objArr2[0] = "GENDER";
                int a2 = C8627af.m23352a(agVar.f29896e);
                if (a2 == 0) {
                    a2 = 1;
                }
                objArr2[1] = C132251dg.m214910c(a2);
                objArr2[2] = "PERSON";
                objArr2[3] = agVar.f29893b;
                C132251dg.m214909a(findViewById2, R.drawable.quantum_gm_ic_graphic_eq_vd_theme_24, C5114a.m13988b(Locale.getDefault(), string2, objArr2));
                View findViewById3 = C132251dg.this.f360972c.requireView().findViewById(R.id.assistant_custodio_setup_summary_fragment_bullet_3);
                String string3 = C132251dg.this.f360972c.getString(R.string.assistant_custodio_setup_summary_fragment_bullet_3);
                Object[] objArr3 = new Object[4];
                objArr3[0] = "GENDER";
                int a3 = C8627af.m23352a(agVar.f29896e);
                if (a3 == 0) {
                    a3 = 1;
                }
                objArr3[1] = C132251dg.m214910c(a3);
                objArr3[2] = "PERSON";
                objArr3[3] = agVar.f29893b;
                C132251dg.m214909a(findViewById3, R.drawable.quantum_gm_ic_warning_amber_vd_theme_24, C5114a.m13988b(Locale.getDefault(), string3, objArr3));
                C132251dg dgVar = C132251dg.this;
                dgVar.f360972c.requireView().findViewById(R.id.assistant_custodio_setup_summary_fragment_progress_bar).setVisibility(8);
                dgVar.f360972c.requireView().findViewById(R.id.assistant_custodio_setup_summary_fragment_bottom_bar).setVisibility(0);
                dgVar.f360972c.requireView().findViewById(R.id.assistant_custodio_setup_summary_fragment_scroll_view).setVisibility(0);
                C132251dg.this.f360978i.mo19974a(C37176a.f97034dt);
                return;
            }
            ((C59052c) ((C59052c) C132251dg.f360970a.mo56225c()).mo56372aa(39577)).mo56387q("One child's data was expected, found %d", blVar.f29964b.size());
            C132251dg.this.mo110568b();
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132251dg dgVar = C132251dg.this;
            dgVar.f360972c.requireView().findViewById(R.id.assistant_custodio_setup_summary_fragment_progress_bar).setVisibility(0);
            dgVar.f360972c.requireView().findViewById(R.id.assistant_custodio_setup_summary_fragment_scroll_view).setVisibility(8);
            dgVar.f360972c.requireView().findViewById(R.id.assistant_custodio_setup_summary_fragment_bottom_bar).setVisibility(8);
        }
    }

    public C132251dg(Activity activity, CustodioSetupSummaryFragment custodioSetupSummaryFragment, C46485f fVar, C132140a aVar, C46801dp dpVar, C37215b bVar) {
        this.f360971b = activity;
        this.f360972c = custodioSetupSummaryFragment;
        Bundle arguments = custodioSetupSummaryFragment.getArguments();
        this.f360973d = arguments == null ? new Bundle() : arguments;
        this.f360974e = fVar;
        this.f360975f = aVar;
        this.f360976g = dpVar;
        this.f360977h = new C132252a();
        this.f360978i = bVar;
    }

    /* renamed from: a */
    public static void m214909a(View view, int i, String str) {
        ((ImageView) view.findViewById(R.id.assistant_custodio_setup_summary_fragment_item_icon)).setImageResource(i);
        ((TextView) view.findViewById(R.id.assistant_custodio_setup_summary_fragment_item_text)).setText(str);
    }

    /* renamed from: c */
    public static String m214910c(int i) {
        int i2 = i - 2;
        return i2 != 1 ? i2 != 2 ? "other" : "female" : "male";
    }

    /* renamed from: b */
    public final void mo110568b() {
        this.f360978i.mo19974a(C37176a.f97023di);
        this.f360974e.mo50482c(this.f360972c).mo50508d(R.id.assistant_custodio_setup_summary_fragment_to_dialog, C132287ei.m214954a(this.f360972c.getString(R.string.assistant_custodio_fatal_error_title), this.f360972c.getString(R.string.assistant_custodio_fatal_error_body), this.f360972c.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }
}
