package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8664bp;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8685o;
import com.google.p427am.p432b.p433a.C8687q;
import com.google.p4479cg.C58077i;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.an */
/* compiled from: PG */
public final class C132123an {

    /* renamed from: a */
    public static final C59071e f360645a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.an");

    /* renamed from: b */
    public final CustodioDowntimeDayPickerFragment f360646b;

    /* renamed from: c */
    public final Bundle f360647c;

    /* renamed from: d */
    public final C46485f f360648d;

    /* renamed from: e */
    public final C46801dp f360649e;

    /* renamed from: f */
    public final C46439e f360650f;

    /* renamed from: g */
    public final C132140a f360651g;

    /* renamed from: h */
    public final C46440f f360652h;

    /* renamed from: i */
    public final C132125a f360653i = new C132125a();

    /* renamed from: j */
    public final C37215b f360654j;

    /* renamed from: k */
    public CustodioDowntimeDayPickerViewModel f360655k;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.an$a */
    /* compiled from: PG */
    final class C132125a implements C46792di {
        public C132125a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132123an.f360645a.mo56225c()).mo56382g(th)).mo56372aa(39522)).mo56386p("Can't fetch kid account details.");
            C132123an.this.mo110487e();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() == 1) {
                C8675e eVar = (C8675e) blVar.f29964b.get(0);
                C132123an anVar = C132123an.this;
                View requireView = anVar.f360646b.requireView();
                TextView textView = (TextView) requireView.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_subtitle);
                CustodioDowntimeDayPickerFragment custodioDowntimeDayPickerFragment = anVar.f360646b;
                Object[] objArr = new Object[1];
                C8628ag agVar = eVar.f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                objArr[0] = agVar.f29893b;
                textView.setText(custodioDowntimeDayPickerFragment.getString(R.string.assistant_custodio_downtime_day_choice_subtitle, objArr));
                CompoundButton compoundButton = (CompoundButton) requireView.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_school_nights_radio);
                anVar.mo110485b(compoundButton, anVar.f360646b.getString(R.string.assistant_custodio_downtime_days_school_night_subtext));
                CompoundButton compoundButton2 = (CompoundButton) requireView.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_weekdays_radio);
                anVar.mo110485b(compoundButton2, anVar.f360646b.getString(R.string.assistant_custodio_downtime_days_weekday_subtext));
                CompoundButton compoundButton3 = (CompoundButton) requireView.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_weekends_radio);
                anVar.mo110485b(compoundButton3, anVar.f360646b.getString(R.string.assistant_custodio_downtime_days_weekend_subtext));
                CompoundButton compoundButton4 = (CompoundButton) requireView.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_customize_radio);
                anVar.mo110485b(compoundButton4, anVar.f360646b.getString(R.string.assistant_custodio_downtime_days_custom_subtext));
                C132120ak akVar = new C132120ak(anVar, compoundButton4, requireView);
                compoundButton.setOnCheckedChangeListener(akVar);
                compoundButton2.setOnCheckedChangeListener(akVar);
                compoundButton3.setOnCheckedChangeListener(akVar);
                compoundButton4.setOnCheckedChangeListener(akVar);
                if (compoundButton4.isChecked()) {
                    requireView.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkboxes_container).setVisibility(0);
                }
                C8633al alVar = eVar.f29993b;
                if (alVar == null) {
                    alVar = C8633al.f29901j;
                }
                C8687q qVar = alVar.f29911i;
                if (qVar == null) {
                    qVar = C8687q.f30013c;
                }
                if (qVar.f30015a.size() > 0) {
                    ((TextView) requireView.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_title)).setText(anVar.f360646b.getString(R.string.assistant_custodio_downtime_day_choice_title_steady));
                    Button button = (Button) requireView.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_primary_button);
                    button.setText(anVar.f360646b.getString(R.string.assistant_custodio_settings_fragment_next_button));
                    button.setOnClickListener(new C132121al(anVar, eVar));
                    requireView.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_secondary_button).setOnClickListener(new C132122am(anVar));
                }
                if (((CustodioDowntimeDayPickerViewModel) Objects.requireNonNull(anVar.f360655k)).f360521a != 0) {
                    View requireView2 = anVar.f360646b.requireView();
                    int i = ((CustodioDowntimeDayPickerViewModel) Objects.requireNonNull(anVar.f360655k)).f360521a;
                    if (i != 0) {
                        ((RadioGroup) requireView2.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_options_radio_group)).check(i);
                        Set set = ((CustodioDowntimeDayPickerViewModel) Objects.requireNonNull(anVar.f360655k)).f360522b;
                        if (set != null) {
                            ViewGroup viewGroup = (ViewGroup) requireView2.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkboxes_container);
                            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                                CheckBox checkBox = (CheckBox) viewGroup.getChildAt(i2);
                                if (i2 == 0) {
                                    checkBox.setChecked(set.contains(C58077i.SUNDAY));
                                } else {
                                    checkBox.setChecked(set.contains(C58077i.m88832a(i2)));
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("ViewModel does not contain required information");
                    }
                } else {
                    C8633al alVar2 = eVar.f29993b;
                    if (alVar2 == null) {
                        alVar2 = C8633al.f29901j;
                    }
                    C8687q qVar2 = alVar2.f29911i;
                    if (qVar2 == null) {
                        qVar2 = C8687q.f30013c;
                    }
                    if (qVar2.f30015a.size() > 0) {
                        C8633al alVar3 = eVar.f29993b;
                        if (alVar3 == null) {
                            alVar3 = C8633al.f29901j;
                        }
                        C8687q qVar3 = alVar3.f29911i;
                        if (qVar3 == null) {
                            qVar3 = C8687q.f30013c;
                        }
                        C8685o oVar = (C8685o) qVar3.f30015a.get(0);
                        C58528ij N = C58528ij.m90014N(C58077i.MONDAY, C58077i.TUESDAY, C58077i.WEDNESDAY, C58077i.THURSDAY, C58077i.FRIDAY);
                        C58528ij N2 = C58528ij.m90014N(C58077i.SUNDAY, C58077i.MONDAY, C58077i.TUESDAY, C58077i.WEDNESDAY, C58077i.THURSDAY);
                        C58528ij K = C58528ij.m90011K(C58077i.SATURDAY, C58077i.SUNDAY);
                        View requireView3 = anVar.f360646b.requireView();
                        if (oVar.f30011a.size() > 0) {
                            HashSet hashSet = new HashSet();
                            for (C8664bp bpVar : oVar.f30011a) {
                                C58077i a = C58077i.m88832a(bpVar.f29973a);
                                if (a == null) {
                                    a = C58077i.UNRECOGNIZED;
                                }
                                hashSet.add(a);
                            }
                            if (!oVar.f30012b) {
                                if (hashSet.equals(N)) {
                                    ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_weekdays_radio)).setChecked(true);
                                } else if (hashSet.equals(K)) {
                                    ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_weekends_radio)).setChecked(true);
                                } else if (hashSet.equals(N2)) {
                                    ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_school_nights_radio)).setChecked(true);
                                }
                            }
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_customize_radio)).setChecked(true);
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_0)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_1)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_2)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_3)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_4)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_5)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_6)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_0)).setChecked(hashSet.contains(C58077i.SUNDAY));
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_1)).setChecked(hashSet.contains(C58077i.MONDAY));
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_2)).setChecked(hashSet.contains(C58077i.TUESDAY));
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_3)).setChecked(hashSet.contains(C58077i.WEDNESDAY));
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_4)).setChecked(hashSet.contains(C58077i.THURSDAY));
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_5)).setChecked(hashSet.contains(C58077i.FRIDAY));
                            ((CompoundButton) requireView3.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_6)).setChecked(hashSet.contains(C58077i.SATURDAY));
                            C132123an.m214754c(requireView3);
                        } else {
                            ((C59052c) ((C59052c) C132123an.f360645a.mo56225c()).mo56372aa(39524)).mo56386p("Set DowntimeSchedule has zero Periods");
                            anVar.mo110487e();
                        }
                        anVar.mo110489g();
                    } else {
                        compoundButton.setChecked(true);
                    }
                }
                C132123an.this.mo110486d();
                C132123an.this.f360654j.mo19974a(C37176a.f97034dt);
                return;
            }
            ((C59052c) ((C59052c) C132123an.f360645a.mo56225c()).mo56372aa(39523)).mo56386p("More than one child's data provided!");
            C132123an.this.mo110487e();
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132123an.this.mo110488f();
        }
    }

    public C132123an(final CustodioDowntimeDayPickerFragment custodioDowntimeDayPickerFragment, final C46485f fVar, C46801dp dpVar, C132140a aVar, C46439e eVar, C37215b bVar) {
        this.f360646b = custodioDowntimeDayPickerFragment;
        Bundle arguments = custodioDowntimeDayPickerFragment.getArguments();
        this.f360647c = arguments == null ? new Bundle() : arguments;
        this.f360648d = fVar;
        this.f360649e = dpVar;
        this.f360651g = aVar;
        this.f360650f = eVar;
        this.f360654j = bVar;
        this.f360652h = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                Void voidR = (Void) obj;
                ((C59052c) ((C59052c) ((C59052c) C132123an.f360645a.mo56225c()).mo56382g(th)).mo56372aa(39521)).mo56386p("Failed to update Downtime day settings");
                C132123an.this.mo110487e();
            }

            /* renamed from: c */
            public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
                Void voidR = (Void) obj;
                Void voidR2 = (Void) obj2;
                C132123an.this.mo110486d();
                fVar.mo50482c(custodioDowntimeDayPickerFragment).mo50510f();
            }

            /* renamed from: i */
            public final /* synthetic */ void mo18068i(Object obj) {
                Void voidR = (Void) obj;
                C132123an.this.mo110488f();
            }
        };
    }

    /* renamed from: c */
    public static void m214754c(View view) {
        C132126ao aoVar = new C132126ao(view);
        ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_0)).setOnCheckedChangeListener(aoVar);
        ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_1)).setOnCheckedChangeListener(aoVar);
        ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_2)).setOnCheckedChangeListener(aoVar);
        ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_3)).setOnCheckedChangeListener(aoVar);
        ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_4)).setOnCheckedChangeListener(aoVar);
        ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_5)).setOnCheckedChangeListener(aoVar);
        ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_6)).setOnCheckedChangeListener(aoVar);
    }

    /* renamed from: a */
    public final Set mo110484a() {
        int i = ((CustodioDowntimeDayPickerViewModel) Objects.requireNonNull(this.f360655k)).f360521a;
        if (i == R.id.assistant_custodio_downtime_day_picker_fragment_school_nights_radio) {
            return C58528ij.m90014N(C58077i.SUNDAY, C58077i.MONDAY, C58077i.TUESDAY, C58077i.WEDNESDAY, C58077i.THURSDAY);
        }
        if (i == R.id.assistant_custodio_downtime_day_picker_fragment_weekdays_radio) {
            return C58528ij.m90014N(C58077i.MONDAY, C58077i.TUESDAY, C58077i.WEDNESDAY, C58077i.THURSDAY, C58077i.FRIDAY);
        }
        if (i == R.id.assistant_custodio_downtime_day_picker_fragment_weekends_radio) {
            return C58528ij.m90011K(C58077i.SUNDAY, C58077i.SATURDAY);
        }
        return ((CustodioDowntimeDayPickerViewModel) Objects.requireNonNull(this.f360655k)).f360522b;
    }

    /* renamed from: b */
    public final void mo110485b(CompoundButton compoundButton, String str) {
        if (str != null && !str.isEmpty()) {
            compoundButton.append("\n");
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new TextAppearanceSpan(this.f360646b.getContext(), 2132148894), 0, str.length(), 33);
            compoundButton.append(spannableString);
        }
    }

    /* renamed from: d */
    public final void mo110486d() {
        this.f360646b.requireView().findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_progress_bar).setVisibility(8);
        this.f360646b.requireView().findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_scroll_view).setVisibility(0);
        this.f360646b.requireView().findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_bottom_bar).setVisibility(0);
    }

    /* renamed from: e */
    public final void mo110487e() {
        this.f360654j.mo19974a(C37176a.f97023di);
        this.f360648d.mo50482c(this.f360646b).mo50508d(R.id.assistant_custodio_downtime_day_picker_to_error, C132287ei.m214954a(this.f360646b.getString(R.string.assistant_custodio_fatal_error_title), this.f360646b.getString(R.string.assistant_custodio_fatal_error_body), this.f360646b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }

    /* renamed from: f */
    public final void mo110488f() {
        this.f360646b.requireView().findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_progress_bar).setVisibility(0);
        this.f360646b.requireView().findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_scroll_view).setVisibility(8);
        this.f360646b.requireView().findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_bottom_bar).setVisibility(8);
    }

    /* renamed from: g */
    public final void mo110489g() {
        View view = this.f360646b.getView();
        if (view != null) {
            ((CustodioDowntimeDayPickerViewModel) Objects.requireNonNull(this.f360655k)).f360521a = ((RadioGroup) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_options_radio_group)).getCheckedRadioButtonId();
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkboxes_container);
            HashSet hashSet = new HashSet();
            int i = 0;
            while (i < viewGroup.getChildCount()) {
                if (((CheckBox) viewGroup.getChildAt(i)).isChecked()) {
                    hashSet.add(i == 0 ? C58077i.SUNDAY : C58077i.m88832a(i));
                }
                i++;
            }
            ((CustodioDowntimeDayPickerViewModel) Objects.requireNonNull(this.f360655k)).f360522b = hashSet;
        }
    }
}
