package com.google.android.libraries.home.coreui.devicetile;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.core.app.C1827n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.textfield.TextInputLayout;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.h */
/* compiled from: PG */
final class C23719h implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ C0392m f64873a;

    /* renamed from: b */
    final /* synthetic */ int f64874b;

    /* renamed from: c */
    final /* synthetic */ boolean f64875c;

    /* renamed from: d */
    final /* synthetic */ boolean f64876d;

    public C23719h(C0392m mVar, int i, boolean z, boolean z2) {
        this.f64873a = mVar;
        this.f64874b = i;
        this.f64875c = z;
        this.f64876d = z2;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Object a = C1827n.m5006a(this.f64873a, R.id.controls_pin_input_layout);
        C69664n.m101059e(a, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
        TextInputLayout textInputLayout = (TextInputLayout) a;
        textInputLayout.mo48472g(this.f64874b);
        if (this.f64875c) {
            textInputLayout.mo48470e(this.f64873a.getContext().getString(R.string.controls_twofactor_too_many_attempts_failure_message));
            textInputLayout.f117308b.mo48602l(this.f64873a.getContext().getDrawable(R.drawable.quantum_ic_error_vd_theme_24));
        }
        Object a2 = C1827n.m5006a(this.f64873a, R.id.controls_pin_use_alpha);
        C69664n.m101059e(a2, "null cannot be cast to non-null type android.widget.CheckBox");
        CheckBox checkBox = (CheckBox) a2;
        checkBox.setChecked(this.f64876d);
        Object a3 = C1827n.m5006a(this.f64873a, R.id.controls_pin_input);
        C69664n.m101059e(a3, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) a3;
        C23723l.m44216b(editText, checkBox.isChecked());
        CheckBox checkBox2 = (CheckBox) this.f64873a.mo1197b().mo1177e(R.id.controls_pin_use_alpha);
        if (checkBox2 != null) {
            checkBox2.setOnClickListener(new C23718g(editText, checkBox));
        }
        editText.requestFocus();
    }
}
