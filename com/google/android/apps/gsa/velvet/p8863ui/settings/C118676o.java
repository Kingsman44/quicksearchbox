package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.content.DialogInterface;
import android.preference.PreferenceActivity;
import android.widget.CompoundButton;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.o */
/* compiled from: PG */
final class C118676o implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CompoundButton f331060a;

    /* renamed from: b */
    final /* synthetic */ CompoundButton.OnCheckedChangeListener f331061b;

    /* renamed from: c */
    final /* synthetic */ PreferenceActivity.Header f331062c;

    /* renamed from: d */
    final /* synthetic */ C118678q f331063d;

    public C118676o(C118678q qVar, CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, PreferenceActivity.Header header) {
        this.f331063d = qVar;
        this.f331060a = compoundButton;
        this.f331061b = onCheckedChangeListener;
        this.f331062c = header;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f331060a.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f331060a.setChecked(false);
        this.f331060a.setOnCheckedChangeListener(this.f331061b);
        this.f331063d.mo103856a(this.f331062c, false);
        dialogInterface.dismiss();
    }
}
