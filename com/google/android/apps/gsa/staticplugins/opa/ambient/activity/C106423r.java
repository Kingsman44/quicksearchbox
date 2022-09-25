package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.r */
/* compiled from: PG */
final class C106423r implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ EditText f296858a;

    /* renamed from: b */
    final /* synthetic */ RadioButton f296859b;

    public C106423r(EditText editText, RadioButton radioButton) {
        this.f296858a = editText;
        this.f296859b = radioButton;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.f296858a.setEnabled(i == this.f296859b.getId());
    }
}
