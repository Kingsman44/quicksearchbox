package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Context;
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
import com.google.p427am.p432b.p433a.C8627af;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8685o;
import com.google.p427am.p432b.p433a.C8687q;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ba */
/* compiled from: PG */
public final class C132167ba {

    /* renamed from: a */
    public static final C59071e f360743a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.ba");

    /* renamed from: b */
    public final CustodioDowntimeSettingsFragment f360744b;

    /* renamed from: c */
    public final Bundle f360745c;

    /* renamed from: d */
    public final C46485f f360746d;

    /* renamed from: e */
    public final C46801dp f360747e;

    /* renamed from: f */
    public final C46439e f360748f;

    /* renamed from: g */
    public final C132140a f360749g;

    /* renamed from: h */
    public final C46440f f360750h;

    /* renamed from: i */
    public final C46440f f360751i;

    /* renamed from: j */
    public final C132170a f360752j = new C132170a();

    /* renamed from: k */
    public final C37215b f360753k;

    /* renamed from: l */
    public boolean f360754l;

    /* renamed from: m */
    public C132173bd f360755m;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ba$a */
    /* compiled from: PG */
    final class C132170a implements C46792di {
        public C132170a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132167ba.f360743a.mo56225c()).mo56382g(th)).mo56372aa(39529)).mo56386p("Can't fetch kid account details.");
            C132167ba.this.mo110511a();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() == 1) {
                C8675e eVar = (C8675e) blVar.f29964b.get(0);
                C132167ba baVar = C132167ba.this;
                String string = baVar.f360745c.getString("entry_point_id");
                String string2 = baVar.f360745c.getString("supervised_oid");
                if (string2 == null || string == null) {
                    throw new IllegalStateException("Not provided with required argument!");
                }
                View requireView = baVar.f360744b.requireView();
                baVar.f360755m = new C132173bd(baVar, eVar, string, string2);
                C8633al alVar = eVar.f29993b;
                if (alVar == null) {
                    alVar = C8633al.f29901j;
                }
                C8687q qVar = alVar.f29911i;
                if (qVar == null) {
                    qVar = C8687q.f30013c;
                }
                if (qVar.f30015a.size() > 0) {
                    CompoundButton compoundButton = (CompoundButton) requireView.findViewById(R.id.assistant_fragment_custodio_downtime_settings_switch_compat);
                    compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                    C8633al alVar2 = eVar.f29993b;
                    if (alVar2 == null) {
                        alVar2 = C8633al.f29901j;
                    }
                    C8687q qVar2 = alVar2.f29911i;
                    if (qVar2 == null) {
                        qVar2 = C8687q.f30013c;
                    }
                    compoundButton.setChecked(qVar2.f30016b);
                    compoundButton.setOnCheckedChangeListener(new C132133au(baVar, string, string2, eVar));
                    TextView textView = (TextView) requireView.findViewById(R.id.assistant_fragment_custodio_downtime_settings_set_days);
                    Context requireContext = baVar.f360744b.requireContext();
                    C8633al alVar3 = eVar.f29993b;
                    if (alVar3 == null) {
                        alVar3 = C8633al.f29901j;
                    }
                    C8687q qVar3 = alVar3.f29911i;
                    if (qVar3 == null) {
                        qVar3 = C8687q.f30013c;
                    }
                    textView.setText(C132262dp.m214922a(requireContext, (C8685o) qVar3.f30015a.get(0)));
                    Context requireContext2 = baVar.f360744b.requireContext();
                    C8633al alVar4 = eVar.f29993b;
                    if (alVar4 == null) {
                        alVar4 = C8633al.f29901j;
                    }
                    C8687q qVar4 = alVar4.f29911i;
                    if (qVar4 == null) {
                        qVar4 = C8687q.f30013c;
                    }
                    String e = C132262dp.m214926e(requireContext2, (C8685o) qVar4.f30015a.get(0));
                    if (e == null) {
                        ((C59052c) ((C59052c) C132167ba.f360743a.mo56225c()).mo56372aa(39531)).mo56386p("Invalid time range.");
                        baVar.mo110511a();
                        C132167ba.this.f360753k.mo19974a(C37176a.f97034dt);
                        return;
                    }
                    ((TextView) requireView.findViewById(R.id.assistant_fragment_custodio_downtime_settings_set_times)).setText(e);
                    TextView textView2 = (TextView) requireView.findViewById(R.id.assistant_fragment_custodio_downtime_settings_steady_title);
                    CustodioDowntimeSettingsFragment custodioDowntimeSettingsFragment = baVar.f360744b;
                    Object[] objArr = new Object[1];
                    C8628ag agVar = eVar.f29994c;
                    if (agVar == null) {
                        agVar = C8628ag.f29890g;
                    }
                    objArr[0] = agVar.f29893b;
                    textView2.setText(custodioDowntimeSettingsFragment.getString(R.string.assistant_custodio_downtime_settings_steady_title, objArr));
                    TextView textView3 = (TextView) requireView.findViewById(R.id.assistant_fragment_custodio_downtime_settings_steady_subtitle);
                    String string3 = baVar.f360744b.getString(R.string.assistant_custodio_downtime_settings_steady_subtitle);
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = "GENDER";
                    C8628ag agVar2 = eVar.f29994c;
                    int a = C8627af.m23352a((agVar2 == null ? C8628ag.f29890g : agVar2).f29896e);
                    if (a == 0) {
                        a = 1;
                    }
                    objArr2[1] = C132167ba.m214804d(a);
                    objArr2[2] = "PERSON";
                    if (agVar2 == null) {
                        agVar2 = C8628ag.f29890g;
                    }
                    objArr2[3] = agVar2.f29893b;
                    textView3.setText(C5114a.m13988b(Locale.getDefault(), string3, objArr2));
                    baVar.mo110513c();
                    baVar.f360754l = true;
                } else {
                    TextView textView4 = (TextView) requireView.findViewById(R.id.assistant_fragment_custodio_downtime_settings_splash_subtitle);
                    CustodioDowntimeSettingsFragment custodioDowntimeSettingsFragment2 = baVar.f360744b;
                    Object[] objArr3 = new Object[1];
                    C8628ag agVar3 = eVar.f29994c;
                    if (agVar3 == null) {
                        agVar3 = C8628ag.f29890g;
                    }
                    objArr3[0] = agVar3.f29893b;
                    textView4.setText(custodioDowntimeSettingsFragment2.getString(R.string.assistant_custodio_downtime_settings_splash_subtitle, objArr3));
                    baVar.f360744b.requireView().findViewById(R.id.assistant_fragment_custodio_downtime_settings_progress_bar).setVisibility(8);
                    baVar.f360744b.requireView().findViewById(R.id.assistant_fragment_custodio_downtime_settings_splash_scroll_view).setVisibility(0);
                    baVar.f360744b.requireView().findViewById(R.id.assistant_fragment_custodio_downtime_settings_steady_scroll_view).setVisibility(8);
                    baVar.f360744b.requireView().findViewById(R.id.assistant_fragment_custodio_downtime_settings_bottom_bar).setVisibility(0);
                    baVar.f360754l = false;
                }
                baVar.f360744b.requireActivity().invalidateOptionsMenu();
                C132167ba.this.f360753k.mo19974a(C37176a.f97034dt);
                return;
            }
            ((C59052c) ((C59052c) C132167ba.f360743a.mo56225c()).mo56372aa(39530)).mo56386p("More than one child's data provided!");
            C132167ba.this.mo110511a();
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132167ba.this.mo110512b();
        }
    }

    public C132167ba(final CustodioDowntimeSettingsFragment custodioDowntimeSettingsFragment, final C46485f fVar, C46801dp dpVar, C132140a aVar, C46439e eVar, C37215b bVar) {
        this.f360744b = custodioDowntimeSettingsFragment;
        this.f360746d = fVar;
        this.f360747e = dpVar;
        this.f360749g = aVar;
        Bundle arguments = custodioDowntimeSettingsFragment.getArguments();
        this.f360745c = arguments == null ? new Bundle() : arguments;
        this.f360748f = eVar;
        this.f360753k = bVar;
        this.f360754l = false;
        this.f360750h = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                Void voidR = (Void) obj;
                ((C59052c) ((C59052c) ((C59052c) C132167ba.f360743a.mo56225c()).mo56382g(th)).mo56372aa(39527)).mo56386p("Failed to update Downtime settings.");
                C132167ba.this.mo110511a();
            }

            /* renamed from: c */
            public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
                Void voidR = (Void) obj;
                Void voidR2 = (Void) obj2;
                C132167ba.this.mo110513c();
            }

            /* renamed from: i */
            public final /* synthetic */ void mo18068i(Object obj) {
                Void voidR = (Void) obj;
                C132167ba.this.mo110512b();
            }
        };
        this.f360751i = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                Void voidR = (Void) obj;
                ((C59052c) ((C59052c) ((C59052c) C132167ba.f360743a.mo56225c()).mo56382g(th)).mo56372aa(39528)).mo56386p("Failed to delete Downtime settings.");
                C132167ba.this.mo110511a();
            }

            /* renamed from: c */
            public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
                Void voidR = (Void) obj;
                Void voidR2 = (Void) obj2;
                fVar.mo50482c(custodioDowntimeSettingsFragment).mo50510f();
            }

            /* renamed from: i */
            public final /* synthetic */ void mo18068i(Object obj) {
                Void voidR = (Void) obj;
                C132167ba.this.mo110512b();
            }
        };
    }

    /* renamed from: d */
    public static String m214804d(int i) {
        int i2 = i - 2;
        return i2 != 1 ? i2 != 2 ? "other" : "female" : "male";
    }

    /* renamed from: a */
    public final void mo110511a() {
        this.f360753k.mo19974a(C37176a.f97023di);
        this.f360746d.mo50482c(this.f360744b).mo50508d(R.id.assistant_custodio_downtime_settings_to_error, C132287ei.m214954a(this.f360744b.getString(R.string.assistant_custodio_fatal_error_title), this.f360744b.getString(R.string.assistant_custodio_fatal_error_body), this.f360744b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }

    /* renamed from: b */
    public final void mo110512b() {
        this.f360744b.requireView().findViewById(R.id.assistant_fragment_custodio_downtime_settings_progress_bar).setVisibility(0);
        this.f360744b.requireView().findViewById(R.id.assistant_fragment_custodio_downtime_settings_splash_scroll_view).setVisibility(8);
        this.f360744b.requireView().findViewById(R.id.assistant_fragment_custodio_downtime_settings_steady_scroll_view).setVisibility(8);
        this.f360744b.requireView().findViewById(R.id.assistant_fragment_custodio_downtime_settings_bottom_bar).setVisibility(8);
    }

    /* renamed from: c */
    public final void mo110513c() {
        this.f360744b.requireView().findViewById(R.id.assistant_fragment_custodio_downtime_settings_progress_bar).setVisibility(8);
        this.f360744b.requireView().findViewById(R.id.assistant_fragment_custodio_downtime_settings_splash_scroll_view).setVisibility(8);
        this.f360744b.requireView().findViewById(R.id.assistant_fragment_custodio_downtime_settings_steady_scroll_view).setVisibility(0);
        this.f360744b.requireView().findViewById(R.id.assistant_fragment_custodio_downtime_settings_bottom_bar).setVisibility(8);
    }
}
