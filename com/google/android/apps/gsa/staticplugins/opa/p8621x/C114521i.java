package com.google.android.apps.gsa.staticplugins.opa.p8621x;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.C1877c;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.x.i */
/* compiled from: PG */
final class C114521i implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ EditText f317587a;

    /* renamed from: b */
    final /* synthetic */ TextView f317588b;

    /* renamed from: c */
    final /* synthetic */ C114524l f317589c;

    public C114521i(C114524l lVar, EditText editText, TextView textView) {
        this.f317589c = lVar;
        this.f317587a = editText;
        this.f317588b = textView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(this.f317587a.getText())) {
            this.f317588b.setClickable(false);
            this.f317588b.setBackground(C1877c.m5125a(this.f317589c.f317598f, R.drawable.rounded_dark_light_rectangle_button_disabled));
            this.f317588b.setTextColor(C1878d.m5128a(this.f317589c.f317598f, R.color.feedback_survey_border_color));
            return;
        }
        this.f317588b.setClickable(true);
        this.f317588b.setBackground(C1877c.m5125a(this.f317589c.f317598f, R.drawable.rounded_dark_light_rectangle_button));
        this.f317588b.setTextColor(C1878d.m5128a(this.f317589c.f317598f, R.color.feedback_survey_font_color));
    }
}
