package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.el */
/* compiled from: PG */
final class C108666el extends C0673gh implements View.OnClickListener {

    /* renamed from: a */
    public final Context f302233a;

    /* renamed from: b */
    public final C108669eo f302234b;

    /* renamed from: c */
    public final ImageView f302235c;

    /* renamed from: d */
    public final ImageView f302236d;

    /* renamed from: e */
    public final TextView f302237e;

    /* renamed from: f */
    public final TextView f302238f;

    /* renamed from: g */
    public final C83893b f302239g;

    /* renamed from: h */
    public C108679ey f302240h;

    public C108666el(Context context, C108669eo eoVar, C83893b bVar, View view) {
        super(view);
        this.f302233a = context;
        this.f302234b = eoVar;
        this.f302239g = bVar;
        this.f302235c = (ImageView) view.findViewById(R.id.app_status);
        this.f302236d = (ImageView) view.findViewById(R.id.app_icon);
        this.f302237e = (TextView) view.findViewById(R.id.app_name);
        this.f302238f = (TextView) view.findViewById(R.id.app_description);
        view.setOnClickListener(this);
    }

    public final void onClick(View view) {
        if (!this.f302240h.mo97058b()) {
            new AlertDialog.Builder(this.f302233a).setTitle(this.f302233a.getString(R.string.assistant_settings_provider_link_dialog_title, new Object[]{this.f302240h.f302272a.f130921b})).setMessage(this.f302233a.getString(R.string.assistant_settings_music_link_dialog_text, new Object[]{this.f302240h.f302272a.f130921b})).setPositiveButton(this.f302233a.getString(R.string.media_linking_dialog_positive_button_text), new C108665ek(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create().show();
        }
    }
}
