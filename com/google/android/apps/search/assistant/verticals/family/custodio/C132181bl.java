package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;
import androidx.navigation.C3892m;
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
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8664bp;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8685o;
import com.google.p427am.p432b.p433a.C8687q;
import com.google.p4479cg.C58080l;
import com.google.p4479cg.C58081m;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.bl */
/* compiled from: PG */
public final class C132181bl {

    /* renamed from: a */
    public static final C59071e f360779a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.bl");

    /* renamed from: b */
    public final CustodioDowntimeTimePickerFragment f360780b;

    /* renamed from: c */
    public final Bundle f360781c;

    /* renamed from: d */
    public final C46485f f360782d;

    /* renamed from: e */
    public final C46801dp f360783e;

    /* renamed from: f */
    public final C46439e f360784f;

    /* renamed from: g */
    public final C132140a f360785g;

    /* renamed from: h */
    public final C46440f f360786h;

    /* renamed from: i */
    public final C132183a f360787i = new C132183a();

    /* renamed from: j */
    public final C37215b f360788j;

    /* renamed from: k */
    public CustodioDowntimeTimePickerViewModel f360789k;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.bl$a */
    /* compiled from: PG */
    final class C132183a implements C46792di {
        public C132183a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132181bl.f360779a.mo56225c()).mo56382g(th)).mo56372aa(39534)).mo56386p("Can't fetch kid account details.");
            C132181bl.this.mo110523b();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() != 1) {
                ((C59052c) ((C59052c) C132181bl.f360779a.mo56225c()).mo56372aa(39535)).mo56386p("More than one child's data provided!");
                C132181bl.this.mo110523b();
            }
            C8675e eVar = (C8675e) blVar.f29964b.get(0);
            ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(C132181bl.this.f360789k)).f360535a = eVar;
            C132181bl blVar2 = C132181bl.this;
            View requireView = blVar2.f360780b.requireView();
            C8633al alVar = eVar.f29993b;
            if (alVar == null) {
                alVar = C8633al.f29901j;
            }
            C8687q qVar = alVar.f29911i;
            if (qVar == null) {
                qVar = C8687q.f30013c;
            }
            if (qVar.f30015a.size() > 0) {
                ((TextView) requireView.findViewById(R.id.assistant_custodio_downtime_time_picker_fragment_title)).setText(blVar2.f360780b.getString(R.string.assistant_custodio_downtime_time_choice_title_steady));
                if (!((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar2.f360789k)).f360536b) {
                    C8633al alVar2 = eVar.f29993b;
                    if (alVar2 == null) {
                        alVar2 = C8633al.f29901j;
                    }
                    C8687q qVar2 = alVar2.f29911i;
                    if (qVar2 == null) {
                        qVar2 = C8687q.f30013c;
                    }
                    C58081m mVar = ((C8664bp) ((C8685o) qVar2.f30015a.get(0)).f30011a.get(0)).f29974b;
                    if (mVar == null) {
                        mVar = C58081m.f155254e;
                    }
                    C8633al alVar3 = eVar.f29993b;
                    if (alVar3 == null) {
                        alVar3 = C8633al.f29901j;
                    }
                    C8687q qVar3 = alVar3.f29911i;
                    if (qVar3 == null) {
                        qVar3 = C8687q.f30013c;
                    }
                    C58081m mVar2 = ((C8664bp) ((C8685o) qVar3.f30015a.get(0)).f30011a.get(0)).f29975c;
                    if (mVar2 == null) {
                        mVar2 = C58081m.f155254e;
                    }
                    C58080l lVar = ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar2.f360789k)).f360537c;
                    int i = mVar.f155256a;
                    lVar.copyOnWrite();
                    ((C58081m) lVar.instance).f155256a = i;
                    int i2 = mVar.f155257b;
                    lVar.copyOnWrite();
                    ((C58081m) lVar.instance).f155257b = i2;
                    C58080l lVar2 = ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar2.f360789k)).f360538d;
                    int i3 = mVar2.f155256a;
                    lVar2.copyOnWrite();
                    ((C58081m) lVar2.instance).f155256a = i3;
                    int i4 = mVar2.f155257b;
                    lVar2.copyOnWrite();
                    ((C58081m) lVar2.instance).f155257b = i4;
                }
                requireView.findViewById(R.id.assistant_custodio_downtime_time_picker_fragment_secondary_button).setOnClickListener(new C132180bk(blVar2));
            } else if (!((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar2.f360789k)).f360536b) {
                C58080l lVar3 = ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar2.f360789k)).f360537c;
                lVar3.copyOnWrite();
                C58081m mVar3 = C58081m.f155254e;
                ((C58081m) lVar3.instance).f155256a = 20;
                C58080l lVar4 = ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar2.f360789k)).f360538d;
                lVar4.copyOnWrite();
                ((C58081m) lVar4.instance).f155256a = 6;
            }
            TextView textView = (TextView) requireView.findViewById(R.id.assistant_custodio_downtime_time_picker_fragment_same_time_text);
            blVar2.mo110524c((TextView) requireView.findViewById(R.id.assistant_custodio_downtime_time_picker_fragment_begin_time), textView, ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar2.f360789k)).f360537c);
            blVar2.mo110524c((TextView) requireView.findViewById(R.id.assistant_custodio_downtime_time_picker_fragment_end_time), textView, ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar2.f360789k)).f360538d);
            C132181bl.this.mo110522a();
            C132181bl.this.f360788j.mo19974a(C37176a.f97034dt);
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132181bl.this.mo110526e();
        }
    }

    public C132181bl(final CustodioDowntimeTimePickerFragment custodioDowntimeTimePickerFragment, final C46485f fVar, C46801dp dpVar, C132140a aVar, C46439e eVar, C37215b bVar) {
        this.f360780b = custodioDowntimeTimePickerFragment;
        Bundle arguments = custodioDowntimeTimePickerFragment.getArguments();
        this.f360781c = arguments == null ? new Bundle() : arguments;
        this.f360782d = fVar;
        this.f360783e = dpVar;
        this.f360785g = aVar;
        this.f360784f = eVar;
        this.f360788j = bVar;
        this.f360786h = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                Void voidR = (Void) obj;
                ((C59052c) ((C59052c) ((C59052c) C132181bl.f360779a.mo56225c()).mo56382g(th)).mo56372aa(39533)).mo56386p("Failed to update Downtime settings.");
                C132181bl.this.mo110523b();
            }

            /* renamed from: c */
            public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
                Void voidR = (Void) obj;
                Void voidR2 = (Void) obj2;
                C132181bl.this.mo110522a();
                C3892m d = fVar.mo50482c(custodioDowntimeTimePickerFragment).mo50505a().mo8044d();
                fVar.mo50482c(custodioDowntimeTimePickerFragment).mo50505a().mo8062v(R.id.assistant_custodio_downtime_settings_fragment, d != null && d.f12477b.f12360i == R.id.assistant_custodio_downtime_day_picker_fragment, false);
            }

            /* renamed from: i */
            public final /* synthetic */ void mo18068i(Object obj) {
                Void voidR = (Void) obj;
                C132181bl.this.mo110526e();
            }
        };
    }

    /* renamed from: a */
    public final void mo110522a() {
        this.f360780b.requireView().findViewById(R.id.assistant_custodio_downtime_time_picker_fragment_progress_bar).setVisibility(8);
        this.f360780b.requireView().findViewById(R.id.assistant_custodio_downtime_time_picker_fragment_scroll_view).setVisibility(0);
        this.f360780b.requireView().findViewById(R.id.assistant_custodio_downtime_time_picker_fragment_bottom_bar).setVisibility(0);
    }

    /* renamed from: b */
    public final void mo110523b() {
        this.f360788j.mo19974a(C37176a.f97023di);
        this.f360782d.mo50482c(this.f360780b).mo50508d(R.id.assistant_custodio_downtime_time_picker_to_error, C132287ei.m214954a(this.f360780b.getString(R.string.assistant_custodio_fatal_error_title), this.f360780b.getString(R.string.assistant_custodio_fatal_error_body), this.f360780b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }

    /* renamed from: c */
    public final void mo110524c(TextView textView, TextView textView2, C58080l lVar) {
        textView.setText(C132262dp.m214927f(this.f360780b.requireContext(), (C58081m) lVar.build()));
        if (((C58081m) ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(this.f360789k)).f360537c.instance).f155256a == ((C58081m) ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(this.f360789k)).f360538d.instance).f155256a && ((C58081m) ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(this.f360789k)).f360537c.instance).f155257b == ((C58081m) ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(this.f360789k)).f360538d.instance).f155257b) {
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo110525d(TextView textView, TextView textView2, C58080l lVar) {
        Context context = this.f360780b.getContext();
        C132179bj bjVar = new C132179bj(this, lVar, textView, textView2);
        C58081m mVar = (C58081m) lVar.instance;
        TimePickerDialog timePickerDialog = new TimePickerDialog(context, bjVar, mVar.f155256a, mVar.f155257b, DateFormat.is24HourFormat(this.f360780b.getContext()));
        timePickerDialog.setCancelable(true);
        timePickerDialog.setCanceledOnTouchOutside(true);
        timePickerDialog.show();
    }

    /* renamed from: e */
    public final void mo110526e() {
        this.f360780b.requireView().findViewById(R.id.assistant_custodio_downtime_time_picker_fragment_progress_bar).setVisibility(0);
        this.f360780b.requireView().findViewById(R.id.assistant_custodio_downtime_time_picker_fragment_scroll_view).setVisibility(8);
        this.f360780b.requireView().findViewById(R.id.assistant_custodio_downtime_time_picker_fragment_bottom_bar).setVisibility(8);
    }
}
