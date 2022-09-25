package com.google.android.apps.search.assistant.verticals.ambient.feedback.full;

import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.full.j */
/* compiled from: PG */
public final /* synthetic */ class C130630j implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f357763a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f357764b;

    public /* synthetic */ C130630j(EditText editText, RadioButton radioButton) {
        this.f357763a = editText;
        this.f357764b = radioButton;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.f357763a.setEnabled(i == this.f357764b.getId());
    }
}
