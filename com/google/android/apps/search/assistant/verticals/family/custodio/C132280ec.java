package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
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
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ec */
/* compiled from: PG */
public final class C132280ec {

    /* renamed from: a */
    public static final C59071e f361050a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.ec");

    /* renamed from: b */
    public final DeviceListUnlinkDialogFragment f361051b;

    /* renamed from: c */
    public final Bundle f361052c;

    /* renamed from: d */
    public final C132140a f361053d;

    /* renamed from: e */
    public final C46801dp f361054e;

    /* renamed from: f */
    public final C46485f f361055f;

    /* renamed from: g */
    public final C132281a f361056g;

    /* renamed from: h */
    public final C37215b f361057h;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ec$a */
    /* compiled from: PG */
    final class C132281a implements C46792di {

        /* renamed from: a */
        public ProgressBar f361058a;

        /* renamed from: b */
        public TextView f361059b;

        /* renamed from: c */
        public TextView f361060c;

        /* renamed from: d */
        public ViewGroup f361061d;

        /* renamed from: e */
        public Button f361062e;

        /* renamed from: f */
        public Button f361063f;

        public C132281a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132280ec.f361050a.mo56225c()).mo56382g(th)).mo56372aa(39585)).mo56386p("Failed to fetch required child information!");
            C132280ec ecVar = C132280ec.this;
            ecVar.f361057h.mo19974a(C37176a.f97023di);
            ecVar.f361055f.mo50482c(ecVar.f361051b).mo50508d(R.id.assistant_device_list_unlink_dialog_fragment_error, C132287ei.m214954a(ecVar.f361051b.getString(R.string.assistant_custodio_fatal_error_title), ecVar.f361051b.getString(R.string.assistant_custodio_fatal_error_body), ecVar.f361051b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            String str;
            C8660bl blVar = (C8660bl) obj;
            if (this.f361058a == null || this.f361059b == null || this.f361060c == null) {
                throw new IllegalStateException("One or more dialog views were null in onNewData! Was initialize called first?");
            } else if (blVar.f29964b.size() == 1) {
                C8628ag agVar = ((C8675e) blVar.f29964b.get(0)).f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                TextView textView = (TextView) Objects.requireNonNull(this.f361059b);
                C132280ec ecVar = C132280ec.this;
                DeviceListUnlinkDialogFragment deviceListUnlinkDialogFragment = ecVar.f361051b;
                int i = true != ecVar.f361052c.getBoolean("is_SLA_flow") ? R.string.assistant_custodio_device_list_unlink_dialog_title : R.string.assistant_custodio_device_list_unlink_dialog_title_SLA;
                Object[] objArr = new Object[2];
                objArr[0] = agVar.f29893b;
                if (C132280ec.this.f361052c.getBoolean("is_SLA_flow")) {
                    str = C132280ec.this.f361052c.getString("home_name");
                } else {
                    str = C132280ec.this.f361052c.getString("device_name");
                }
                objArr[1] = str;
                textView.setText(deviceListUnlinkDialogFragment.getString(i, objArr));
                TextView textView2 = (TextView) Objects.requireNonNull(this.f361060c);
                C132280ec ecVar2 = C132280ec.this;
                textView2.setText(ecVar2.f361051b.getString(true != ecVar2.f361052c.getBoolean("is_SLA_flow") ? R.string.assistant_custodio_device_list_unlink_dialog_body : R.string.assistant_custodio_device_list_unlink_dialog_body_SLA, agVar.f29893b));
                ((ProgressBar) Objects.requireNonNull(this.f361058a)).setVisibility(8);
                ((TextView) Objects.requireNonNull(this.f361059b)).setVisibility(0);
                ((TextView) Objects.requireNonNull(this.f361060c)).setVisibility(0);
                ((Button) Objects.requireNonNull(this.f361062e)).setText(R.string.assistant_custodio_device_list_unlink_dialog_positive_button);
                ((Button) Objects.requireNonNull(this.f361063f)).setText(R.string.assistant_custodio_device_list_unlink_dialog_negative_button);
                ((Button) Objects.requireNonNull(this.f361062e)).setOnClickListener(new C132278ea(this));
                ((Button) Objects.requireNonNull(this.f361063f)).setOnClickListener(new C132279eb(this));
                ((Button) Objects.requireNonNull(this.f361062e)).setVisibility(0);
                ((Button) Objects.requireNonNull(this.f361063f)).setVisibility(0);
                ((ViewGroup) Objects.requireNonNull(this.f361061d)).setVisibility(0);
                C132280ec.this.f361057h.mo19974a(C37176a.f97034dt);
            } else {
                throw new IllegalStateException("More than one child's data provided to DeviceListUnlinkDialogFragment!");
            }
        }

        /* renamed from: c */
        public final void mo18079c() {
            ((ProgressBar) Objects.requireNonNull(this.f361058a)).setVisibility(0);
            ((TextView) Objects.requireNonNull(this.f361059b)).setVisibility(8);
            ((TextView) Objects.requireNonNull(this.f361060c)).setVisibility(8);
            ((ViewGroup) Objects.requireNonNull(this.f361061d)).setVisibility(8);
            ((Button) Objects.requireNonNull(this.f361062e)).setVisibility(8);
            ((Button) Objects.requireNonNull(this.f361063f)).setVisibility(8);
        }
    }

    public C132280ec(DeviceListUnlinkDialogFragment deviceListUnlinkDialogFragment, C132140a aVar, C46801dp dpVar, C46485f fVar, C37215b bVar) {
        this.f361051b = deviceListUnlinkDialogFragment;
        this.f361053d = aVar;
        this.f361054e = dpVar;
        this.f361055f = fVar;
        Bundle arguments = deviceListUnlinkDialogFragment.getArguments();
        this.f361052c = arguments == null ? new Bundle() : arguments;
        this.f361056g = new C132281a();
        this.f361057h = bVar;
    }
}
