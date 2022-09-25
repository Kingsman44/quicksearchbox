package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cn */
/* compiled from: PG */
public final class C132227cn {

    /* renamed from: a */
    public static final C59071e f360903a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.cn");

    /* renamed from: b */
    public final CustodioOverviewFragment f360904b;

    /* renamed from: c */
    public final Bundle f360905c;

    /* renamed from: d */
    public final C46485f f360906d;

    /* renamed from: e */
    public final C46801dp f360907e;

    /* renamed from: f */
    public final C132228a f360908f;

    /* renamed from: g */
    public final C132140a f360909g;

    /* renamed from: h */
    public final C37215b f360910h;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cn$a */
    /* compiled from: PG */
    final class C132228a implements C46792di {
        public C132228a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132227cn.f360903a.mo56225c()).mo56382g(th)).mo56372aa(39560)).mo56386p("Failed to fetch required information!");
            C132227cn cnVar = C132227cn.this;
            cnVar.f360910h.mo19974a(C37176a.f97023di);
            cnVar.f360906d.mo50482c(cnVar.f360904b).mo50508d(R.id.assistant_custodio_overview_fragment_to_dialog, C132287ei.m214954a(cnVar.f360904b.getString(R.string.assistant_custodio_fatal_error_title), cnVar.f360904b.getString(R.string.assistant_custodio_fatal_error_body), cnVar.f360904b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() == 1) {
                C8628ag agVar = ((C8675e) blVar.f29964b.get(0)).f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                View requireView = C132227cn.this.f360904b.requireView();
                TextView textView = (TextView) requireView.findViewById(R.id.assistant_custodio_overview_title);
                TextView textView2 = (TextView) requireView.findViewById(R.id.assistant_custodio_overview_subtitle);
                TextView textView3 = (TextView) requireView.findViewById(R.id.assistant_custodio_overview_subtitle_link);
                if (C132227cn.this.f360905c.getBoolean("use_add_devices_text", false)) {
                    textView3.setText(BuildConfig.FLAVOR);
                    textView3.setOnClickListener((View.OnClickListener) null);
                    textView3.setVisibility(4);
                } else {
                    textView3.setText(C132227cn.this.f360904b.getString(R.string.assistant_custodio_overview_subtitle_link));
                    textView3.setOnClickListener(new C132226cm(this));
                    textView3.setVisibility(0);
                }
                textView.setText(C132227cn.this.f360904b.getString(R.string.assistant_custodio_overview_title_add_devices, agVar.f29893b));
                String string = C132227cn.this.f360904b.getString(R.string.assistant_custodio_overview_subtitle_add_devices);
                Object[] objArr = new Object[4];
                objArr[0] = "GENDER";
                int a = C8627af.m23352a(agVar.f29896e);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 2;
                objArr[1] = i != 1 ? i != 2 ? "other" : "female" : "male";
                objArr[2] = "PERSON";
                objArr[3] = agVar.f29893b;
                textView2.setText(C5114a.m13988b(Locale.getDefault(), string, objArr));
                C132227cn.m214878a(requireView.findViewById(R.id.assistant_custodio_overview_step_1), R.drawable.assistant_custodio_overview_first_bullet, C132227cn.this.f360904b.getString(R.string.assistant_custodio_overview_step_1_title_add_devices, agVar.f29893b), C132227cn.this.f360904b.getString(R.string.assistant_custodio_overview_step_1_subtitle_add_devices, agVar.f29893b));
                C132227cn.m214878a(requireView.findViewById(R.id.assistant_custodio_overview_step_2), R.drawable.assistant_custodio_overview_second_bullet, C132227cn.this.f360904b.getString(R.string.assistant_custodio_overview_step_2_title_add_devices), C132227cn.this.f360904b.getString(R.string.assistant_custodio_overview_step_2_subtitle_add_devices, agVar.f29893b));
                C132227cn.m214878a(requireView.findViewById(R.id.assistant_custodio_overview_step_3), R.drawable.assistant_custodio_overview_third_bullet, C132227cn.this.f360904b.getString(R.string.assistant_custodio_overview_step_3_title_add_devices, agVar.f29893b), C132227cn.this.f360904b.getString(R.string.assistant_custodio_overview_step_3_subtitle_add_devices, agVar.f29893b));
                C132227cn.this.mo110555c(false);
                C132227cn.this.f360910h.mo19974a(C37176a.f97034dt);
                return;
            }
            throw new IllegalStateException("Expected one child's data to be provided, got " + blVar.f29964b.size() + "!");
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132227cn.this.mo110555c(true);
        }
    }

    public C132227cn(CustodioOverviewFragment custodioOverviewFragment, C46485f fVar, C46801dp dpVar, C132140a aVar, C37215b bVar) {
        this.f360904b = custodioOverviewFragment;
        Bundle arguments = custodioOverviewFragment.getArguments();
        this.f360905c = arguments == null ? new Bundle() : arguments;
        this.f360906d = fVar;
        this.f360907e = dpVar;
        this.f360908f = new C132228a();
        this.f360909g = aVar;
        this.f360910h = bVar;
    }

    /* renamed from: a */
    public static void m214878a(View view, int i, String str, String str2) {
        ((TextView) view.findViewById(R.id.assistant_custodio_step_title)).setText(str);
        ((TextView) view.findViewById(R.id.assistant_custodio_step_subtitle)).setText(str2);
        ((ImageView) view.findViewById(R.id.assistant_custodio_step_image)).setImageResource(i);
    }

    /* renamed from: b */
    public final void mo110554b() {
        this.f360910h.mo19974a(C37176a.f97037dw);
        this.f360906d.mo50482c(this.f360904b).mo50508d(R.id.assistant_custodio_overview_fragment_to_dialog, C132287ei.m214954a(this.f360904b.getString(R.string.assistant_custodio_how_it_works_dialog_title), this.f360904b.getString(R.string.assistant_custodio_how_it_works_dialog_body), this.f360904b.getString(R.string.assistant_custodio_how_it_works_dialog_primary_button_text), "action_dismiss_dialog", (String) null, (String) null));
    }

    /* renamed from: c */
    public final void mo110555c(boolean z) {
        int i = 8;
        this.f360904b.requireView().findViewById(R.id.assistant_custodio_overview_progress_bar).setVisibility(true != z ? 8 : 0);
        View findViewById = this.f360904b.requireView().findViewById(R.id.assistant_custodio_overview_main_content);
        if (true != z) {
            i = 0;
        }
        findViewById.setVisibility(i);
    }
}
