package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.view.View;
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
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.as */
/* compiled from: PG */
public final class C132130as {

    /* renamed from: a */
    public static final C59071e f360663a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.as");

    /* renamed from: b */
    public final CustodioDowntimeOverviewFragment f360664b;

    /* renamed from: c */
    public final Bundle f360665c;

    /* renamed from: d */
    public final C46485f f360666d;

    /* renamed from: e */
    public final C46801dp f360667e;

    /* renamed from: f */
    public final C132140a f360668f;

    /* renamed from: g */
    public final C132131a f360669g = new C132131a();

    /* renamed from: h */
    public final C37215b f360670h;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.as$a */
    /* compiled from: PG */
    final class C132131a implements C46792di {
        public C132131a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132130as.f360663a.mo56225c()).mo56382g(th)).mo56372aa(39525)).mo56386p("Can't fetch kid account details.");
            C132130as.this.mo110493a();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() == 1) {
                C8675e eVar = (C8675e) blVar.f29964b.get(0);
                C132130as asVar = C132130as.this;
                View requireView = asVar.f360664b.requireView();
                TextView textView = (TextView) requireView.findViewById(R.id.assistant_custodio_downtime_overview_fragment_overview_subtitle);
                CustodioDowntimeOverviewFragment custodioDowntimeOverviewFragment = asVar.f360664b;
                Object[] objArr = new Object[1];
                C8628ag agVar = eVar.f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                objArr[0] = agVar.f29893b;
                textView.setText(custodioDowntimeOverviewFragment.getString(R.string.assistant_custodio_downtime_overview_subtitle, objArr));
                TextView textView2 = (TextView) requireView.findViewById(R.id.assistant_custodio_downtime_overview_fragment_calls_item);
                CustodioDowntimeOverviewFragment custodioDowntimeOverviewFragment2 = asVar.f360664b;
                Object[] objArr2 = new Object[1];
                C8628ag agVar2 = eVar.f29994c;
                if (agVar2 == null) {
                    agVar2 = C8628ag.f29890g;
                }
                objArr2[0] = agVar2.f29893b;
                textView2.setText(custodioDowntimeOverviewFragment2.getString(R.string.assistant_custodio_downtime_list_calls, objArr2));
                TextView textView3 = (TextView) requireView.findViewById(R.id.assistant_custodio_downtime_overview_fragment_search_item);
                CustodioDowntimeOverviewFragment custodioDowntimeOverviewFragment3 = asVar.f360664b;
                Object[] objArr3 = new Object[1];
                C8628ag agVar3 = eVar.f29994c;
                if (agVar3 == null) {
                    agVar3 = C8628ag.f29890g;
                }
                objArr3[0] = agVar3.f29893b;
                textView3.setText(custodioDowntimeOverviewFragment3.getString(R.string.assistant_custodio_downtime_list_search, objArr3));
                TextView textView4 = (TextView) requireView.findViewById(R.id.assistant_custodio_downtime_overview_fragment_actions_item);
                CustodioDowntimeOverviewFragment custodioDowntimeOverviewFragment4 = asVar.f360664b;
                Object[] objArr4 = new Object[1];
                C8628ag agVar4 = eVar.f29994c;
                if (agVar4 == null) {
                    agVar4 = C8628ag.f29890g;
                }
                objArr4[0] = agVar4.f29893b;
                textView4.setText(custodioDowntimeOverviewFragment4.getString(R.string.assistant_custodio_downtime_list_actions, objArr4));
                TextView textView5 = (TextView) requireView.findViewById(R.id.assistant_custodio_downtime_overview_fragment_media_item);
                CustodioDowntimeOverviewFragment custodioDowntimeOverviewFragment5 = asVar.f360664b;
                Object[] objArr5 = new Object[1];
                C8628ag agVar5 = eVar.f29994c;
                if (agVar5 == null) {
                    agVar5 = C8628ag.f29890g;
                }
                objArr5[0] = agVar5.f29893b;
                textView5.setText(custodioDowntimeOverviewFragment5.getString(R.string.assistant_custodio_downtime_list_media, objArr5));
                C132130as asVar2 = C132130as.this;
                asVar2.f360664b.requireView().findViewById(R.id.assistant_custodio_downtime_overview_fragment_progress_bar).setVisibility(8);
                asVar2.f360664b.requireView().findViewById(R.id.assistant_custodio_downtime_overview_fragment_scroll_view).setVisibility(0);
                asVar2.f360664b.requireView().findViewById(R.id.assistant_custodio_downtime_overview_fragment_bottom_bar).setVisibility(0);
                C132130as.this.f360670h.mo19974a(C37176a.f97034dt);
                return;
            }
            ((C59052c) ((C59052c) C132130as.f360663a.mo56225c()).mo56372aa(39526)).mo56386p("More than one child's data provided!");
            C132130as.this.mo110493a();
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132130as asVar = C132130as.this;
            asVar.f360664b.requireView().findViewById(R.id.assistant_custodio_downtime_overview_fragment_progress_bar).setVisibility(0);
            asVar.f360664b.requireView().findViewById(R.id.assistant_custodio_downtime_overview_fragment_scroll_view).setVisibility(8);
            asVar.f360664b.requireView().findViewById(R.id.assistant_custodio_downtime_overview_fragment_bottom_bar).setVisibility(8);
        }
    }

    public C132130as(CustodioDowntimeOverviewFragment custodioDowntimeOverviewFragment, C46485f fVar, C46801dp dpVar, C132140a aVar, C37215b bVar) {
        this.f360664b = custodioDowntimeOverviewFragment;
        Bundle arguments = custodioDowntimeOverviewFragment.getArguments();
        this.f360665c = arguments == null ? new Bundle() : arguments;
        this.f360666d = fVar;
        this.f360667e = dpVar;
        this.f360668f = aVar;
        this.f360670h = bVar;
    }

    /* renamed from: a */
    public final void mo110493a() {
        this.f360670h.mo19974a(C37176a.f97023di);
        this.f360666d.mo50482c(this.f360664b).mo50508d(R.id.assistant_custodio_downtime_overview_to_error, C132287ei.m214954a(this.f360664b.getString(R.string.assistant_custodio_fatal_error_title), this.f360664b.getString(R.string.assistant_custodio_fatal_error_body), this.f360664b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }
}
