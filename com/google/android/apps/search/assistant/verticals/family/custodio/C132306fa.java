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

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.fa */
/* compiled from: PG */
public final class C132306fa {

    /* renamed from: a */
    public static final C59071e f361096a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.fa");

    /* renamed from: b */
    public final SelectedChildVerificationDialogFragment f361097b;

    /* renamed from: c */
    public final Bundle f361098c;

    /* renamed from: d */
    public final C132140a f361099d;

    /* renamed from: e */
    public final C46801dp f361100e;

    /* renamed from: f */
    public final C46485f f361101f;

    /* renamed from: g */
    public final boolean f361102g;

    /* renamed from: h */
    public final C132307a f361103h;

    /* renamed from: i */
    public final C37215b f361104i;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.fa$a */
    /* compiled from: PG */
    final class C132307a implements C46792di {

        /* renamed from: a */
        public ProgressBar f361105a;

        /* renamed from: b */
        public TextView f361106b;

        /* renamed from: c */
        public TextView f361107c;

        /* renamed from: d */
        public ViewGroup f361108d;

        /* renamed from: e */
        public Button f361109e;

        public C132307a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132306fa.f361096a.mo56225c()).mo56382g(th)).mo56372aa(39586)).mo56386p("Failed to fetch required child information!");
            C132306fa faVar = C132306fa.this;
            faVar.f361104i.mo19974a(C37176a.f97023di);
            faVar.f361101f.mo50482c(faVar.f361097b).mo50508d(R.id.assistant_selected_child_verification_dialog_fragment_error, C132287ei.m214954a(faVar.f361097b.getString(R.string.assistant_custodio_fatal_error_title), faVar.f361097b.getString(R.string.assistant_custodio_fatal_error_body), faVar.f361097b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (this.f361105a == null || this.f361106b == null || this.f361107c == null) {
                throw new IllegalStateException("One or more dialog views were null in onNewData! Was initialize called first?");
            } else if (blVar.f29964b.size() == 1) {
                C8628ag agVar = ((C8675e) blVar.f29964b.get(0)).f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                ((TextView) Objects.requireNonNull(this.f361106b)).setText(C132306fa.this.f361097b.getString(R.string.assistant_custodio_selected_child_verification_dialog_title, agVar.f29893b));
                ((TextView) Objects.requireNonNull(this.f361107c)).setText(C132306fa.this.f361097b.getString(R.string.assistant_custodio_selected_child_verification_dialog_body, agVar.f29893b));
                ((ProgressBar) Objects.requireNonNull(this.f361105a)).setVisibility(8);
                ((TextView) Objects.requireNonNull(this.f361106b)).setVisibility(0);
                ((TextView) Objects.requireNonNull(this.f361107c)).setVisibility(0);
                ((Button) Objects.requireNonNull(this.f361109e)).setText(R.string.assistant_custodio_selected_child_verification_dialog_button_text);
                if (C132306fa.this.f361102g) {
                    ((Button) Objects.requireNonNull(this.f361109e)).setOnClickListener(new C132303ey(this));
                } else {
                    ((Button) Objects.requireNonNull(this.f361109e)).setOnClickListener(new C132304ez(this));
                }
                ((Button) Objects.requireNonNull(this.f361109e)).setVisibility(0);
                ((ViewGroup) Objects.requireNonNull(this.f361108d)).setVisibility(0);
                C132306fa.this.f361104i.mo19974a(C37176a.f97034dt);
            } else {
                throw new IllegalStateException("More than one child's data provided to SelectedChildVerificationDialogFragment!");
            }
        }

        /* renamed from: c */
        public final void mo18079c() {
            ((ProgressBar) Objects.requireNonNull(this.f361105a)).setVisibility(0);
            ((TextView) Objects.requireNonNull(this.f361106b)).setVisibility(8);
            ((TextView) Objects.requireNonNull(this.f361107c)).setVisibility(8);
            ((ViewGroup) Objects.requireNonNull(this.f361108d)).setVisibility(8);
            ((Button) Objects.requireNonNull(this.f361109e)).setVisibility(8);
        }
    }

    public C132306fa(SelectedChildVerificationDialogFragment selectedChildVerificationDialogFragment, C132140a aVar, C46801dp dpVar, C46485f fVar, boolean z, C37215b bVar) {
        this.f361097b = selectedChildVerificationDialogFragment;
        this.f361099d = aVar;
        this.f361100e = dpVar;
        this.f361101f = fVar;
        Bundle arguments = selectedChildVerificationDialogFragment.getArguments();
        this.f361098c = arguments == null ? new Bundle() : arguments;
        this.f361102g = z;
        this.f361103h = new C132307a();
        this.f361104i = bVar;
    }
}
