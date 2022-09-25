package com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.view;

import android.view.View;
import android.widget.CheckBox;

/* renamed from: com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.view.a */
/* compiled from: PG */
public final /* synthetic */ class C101433a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CheckableView f283003a;

    public /* synthetic */ C101433a(CheckableView checkableView) {
        this.f283003a = checkableView;
    }

    public final void onClick(View view) {
        CheckBox checkBox = this.f283003a.f283002d;
        checkBox.setChecked(!checkBox.isChecked());
    }
}
