package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.o */
/* compiled from: PG */
public final class C115639o {

    /* renamed from: a */
    public final Context f320795a;

    /* renamed from: b */
    public AlertDialog f320796b;

    /* renamed from: c */
    private final AlertDialog.Builder f320797c;

    /* renamed from: d */
    private final View f320798d;

    /* renamed from: e */
    private final ImageView f320799e;

    /* renamed from: f */
    private final ViewGroup f320800f;

    /* renamed from: g */
    private final TextView f320801g;

    /* renamed from: h */
    private final ViewGroup f320802h;

    /* renamed from: i */
    private final TextView f320803i;

    /* renamed from: j */
    private final TextView f320804j;

    /* renamed from: k */
    private final TextView f320805k;

    /* renamed from: l */
    private final LinearLayout f320806l;

    public C115639o(AlertDialog.Builder builder, Context context) {
        this.f320797c = builder;
        this.f320795a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.omp_gm_dialog, (ViewGroup) null);
        this.f320798d = inflate;
        builder.setView(inflate);
        this.f320799e = (ImageView) inflate.findViewById(R.id.icon);
        this.f320800f = (ViewGroup) inflate.findViewById(R.id.icon_view_container);
        this.f320801g = (TextView) inflate.findViewById(R.id.title);
        this.f320802h = (ViewGroup) inflate.findViewById(R.id.message_view_container);
        this.f320803i = (TextView) inflate.findViewById(R.id.message);
        this.f320804j = (TextView) inflate.findViewById(R.id.positive_button);
        this.f320805k = (TextView) inflate.findViewById(R.id.negative_button);
        this.f320806l = (LinearLayout) inflate.findViewById(R.id.button_container);
    }

    /* renamed from: f */
    private final void m191774f(TextView textView, String str, C115638n nVar) {
        if (C58837ba.m90859h(str)) {
            textView.setVisibility(8);
            textView.setText(BuildConfig.FLAVOR);
            textView.setOnClickListener(C115636l.f320792a);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
        textView.setOnClickListener(new C115637m(this, nVar));
    }

    /* renamed from: g */
    private final void m191775g() {
        if (this.f320804j.getVisibility() == 8 && this.f320805k.getVisibility() == 8) {
            this.f320806l.setVisibility(8);
        } else {
            this.f320806l.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final AlertDialog mo102159a() {
        if (this.f320796b == null) {
            AlertDialog create = this.f320797c.create();
            this.f320796b = create;
            create.setOnShowListener(new C115635k(this));
        }
        return this.f320796b;
    }

    /* renamed from: b */
    public final void mo102160b(String str) {
        if (str != null) {
            this.f320802h.setVisibility(0);
            this.f320803i.setVisibility(0);
            this.f320803i.setText(str);
            this.f320802h.removeAllViews();
            this.f320802h.addView(this.f320803i);
            return;
        }
        this.f320803i.setVisibility(8);
        this.f320803i.setText(BuildConfig.FLAVOR);
        this.f320802h.setVisibility(8);
        this.f320802h.removeAllViews();
    }

    /* renamed from: c */
    public final void mo102161c(String str, C115638n nVar) {
        m191774f(this.f320805k, str, nVar);
        m191775g();
    }

    /* renamed from: d */
    public final void mo102162d(String str, C115638n nVar) {
        m191774f(this.f320804j, str, nVar);
        m191775g();
    }

    /* renamed from: e */
    public final void mo102163e(String str) {
        this.f320799e.setVisibility(0);
        this.f320799e.setImageResource(R.drawable.quantum_gm_ic_error_outline_googblue_24);
        this.f320800f.setVisibility(0);
        this.f320800f.removeAllViews();
        this.f320800f.addView(this.f320799e);
        this.f320801g.setVisibility(0);
        this.f320801g.setText(str);
    }
}
