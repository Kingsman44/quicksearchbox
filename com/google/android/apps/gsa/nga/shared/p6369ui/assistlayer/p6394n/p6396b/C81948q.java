package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6394n.p6396b;

import android.app.Presentation;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.C1827n;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6397o.C81953a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.apps.gsa.opa.p6447h.C83707m;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.n.b.q */
/* compiled from: PG */
final class C81948q extends Presentation {

    /* renamed from: c */
    public static final /* synthetic */ int f224050c = 0;

    /* renamed from: d */
    private static final C59071e f224051d = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.n.b.q");

    /* renamed from: a */
    public final C83707m f224052a;

    /* renamed from: b */
    public final C81993bc f224053b;

    /* renamed from: e */
    private final C81941j f224054e;

    /* renamed from: f */
    private final C81953a f224055f;

    /* renamed from: g */
    private final Optional f224056g;

    public C81948q(Context context, Display display, C83707m mVar, C81941j jVar, C81953a aVar, C81993bc bcVar, Optional optional) {
        super(context, display);
        this.f224052a = mVar;
        this.f224054e = jVar;
        this.f224055f = aVar;
        this.f224053b = bcVar;
        this.f224056g = optional;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C59052c) ((C59052c) f224051d.mo56224b()).mo56372aa(6336)).mo56386p("SecondaryPantheraPresentation.Create");
        Context a = this.f224055f.mo75409a(getContext());
        Configuration configuration = a.getResources().getConfiguration();
        Configuration configuration2 = new Configuration(configuration);
        configuration2.uiMode = (configuration.uiMode & -49) | 32;
        a.getResources().updateConfiguration(configuration2, a.getResources().getDisplayMetrics());
        setContentView(LayoutInflater.from(a).inflate(R.layout.secondary_display_panthera, (ViewGroup) null));
        ((TextView) C1827n.m5006a(this, R.id.sed_panthera_greeting)).setText(" ");
        ((TextView) C1827n.m5006a(this, R.id.sed_panthera_action)).setText(" ");
        ((TextView) C1827n.m5006a(this, R.id.sed_panthera_greeting)).setSelected(true);
        ((TextView) C1827n.m5006a(this, R.id.sed_panthera_action)).setSelected(true);
        findViewById(R.id.sed_panthera_x_mark).setOnClickListener(new C81947p(this, (View) C1827n.m5006a(this, R.id.sed_panthera_root)));
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        ((C59052c) ((C59052c) f224051d.mo56224b()).mo56372aa(6337)).mo56386p("SecondaryPantheraPresentation.onStart");
        this.f224056g.ifPresent(C81943l.f224044a);
        View view = (View) C1827n.m5006a(this, R.id.sed_panthera_root);
        this.f224053b.mo75434e(view);
        this.f224053b.mo75435f(view, 161784, false);
        this.f224053b.mo75433d(view, 161785);
        this.f224054e.mo75404a(R.string.sed_display_text_greeting, new C81944m(this));
        this.f224054e.mo75404a(R.string.sed_display_text_action, new C81945n(this));
        this.f224054e.mo75404a(R.string.sed_display_a11y_close, new C81946o(this));
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        ((C59052c) ((C59052c) f224051d.mo56224b()).mo56372aa(6338)).mo56386p("SecondaryPantheraPresentation.onStop");
        this.f224056g.ifPresent(C81942k.f224043a);
        this.f224054e.f224041c.mo76661a();
    }
}
