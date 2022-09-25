package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.surveys.internal.view.h */
/* compiled from: PG */
public final /* synthetic */ class C43150h implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C43156n f112841a;

    /* renamed from: b */
    public final /* synthetic */ int f112842b;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f112843c;

    /* renamed from: d */
    public final /* synthetic */ EditText f112844d;

    public /* synthetic */ C43150h(C43156n nVar, int i, CheckBox checkBox, EditText editText) {
        this.f112841a = nVar;
        this.f112842b = i;
        this.f112843c = checkBox;
        this.f112844d = editText;
    }

    public final void onFocusChange(View view, boolean z) {
        C43156n nVar = this.f112841a;
        int i = this.f112842b;
        CheckBox checkBox = this.f112843c;
        EditText editText = this.f112844d;
        if (z) {
            nVar.f112853a[i] = true;
            checkBox.setChecked(true);
            editText.setHintTextColor(C1878d.m5128a(nVar.getContext(), R.color.survey_hint_text_color));
            nVar.f112855c.mo46138a(new C43154l(nVar.f112854b, nVar.f112853a));
            return;
        }
        editText.setHintTextColor(C1878d.m5128a(nVar.getContext(), R.color.survey_hint_text_unfocused_color));
    }
}
