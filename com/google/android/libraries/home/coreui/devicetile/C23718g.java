package com.google.android.libraries.home.coreui.devicetile;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.g */
/* compiled from: PG */
final class C23718g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ EditText f64871a;

    /* renamed from: b */
    final /* synthetic */ CheckBox f64872b;

    public C23718g(EditText editText, CheckBox checkBox) {
        this.f64871a = editText;
        this.f64872b = checkBox;
    }

    public final void onClick(View view) {
        C23723l.m44216b(this.f64871a, this.f64872b.isChecked());
    }
}
