package com.google.android.apps.gsa.staticplugins.opa.p8621x;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.content.C1877c;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.staticplugins.opa.C109205hl;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C52146gy;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.x.c */
/* compiled from: PG */
public final /* synthetic */ class C114515c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114524l f317573a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f317574b;

    /* renamed from: c */
    public final /* synthetic */ C52146gy f317575c;

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f317576d;

    public /* synthetic */ C114515c(C114524l lVar, RadioButton radioButton, C52146gy gyVar, LinearLayout linearLayout) {
        this.f317573a = lVar;
        this.f317574b = radioButton;
        this.f317575c = gyVar;
        this.f317576d = linearLayout;
    }

    public final void onClick(View view) {
        C114524l lVar = this.f317573a;
        RadioButton radioButton = this.f317574b;
        C52146gy gyVar = this.f317575c;
        LinearLayout linearLayout = this.f317576d;
        for (RadioButton radioButton2 : lVar.f317601i) {
            radioButton2.setClickable(false);
            if (!radioButton2.equals(radioButton)) {
                radioButton2.setTextColor(C1878d.m5128a(lVar.f317598f, R.color.feedback_survey_border_color));
            }
        }
        if (gyVar.f136829b) {
            View inflate = LayoutInflater.from(lVar.f317598f).inflate(R.layout.feedback_input_other_response, (ViewGroup) null);
            linearLayout.addView(inflate);
            EditText editText = (EditText) inflate.findViewById(R.id.feedback_input_other_response);
            TextView textView = (TextView) inflate.findViewById(R.id.cancel_input_button);
            if (!gyVar.f136831d.isEmpty()) {
                textView.setText(gyVar.f136831d);
                textView.setOnClickListener(new C114516d(lVar));
            } else {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) inflate.findViewById(R.id.send_input_button);
            textView2.setText(gyVar.f136832e);
            textView2.setClickable(false);
            textView2.setBackground(C1877c.m5125a(lVar.f317598f, R.drawable.rounded_dark_light_rectangle_button_disabled));
            textView2.setTextColor(C1878d.m5128a(lVar.f317598f, R.color.feedback_survey_border_color));
            editText.getText().clear();
            editText.setHint(gyVar.f136830c);
            editText.setVisibility(0);
            editText.addTextChangedListener(new C114521i(lVar, editText, textView2));
            lVar.f317596d.setFocusable(true);
            editText.requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) lVar.f317598f.getSystemService("input_method");
            if (inputMethodManager != null) {
                editText.post(new C114519g(inputMethodManager, editText));
            }
            editText.setOnEditorActionListener(new C114517e(lVar, textView2, radioButton));
            textView2.setOnClickListener(new C114518f(lVar, editText, radioButton));
            linearLayout.setVisibility(0);
            C109205hl hlVar = lVar.f317603k;
            if (hlVar != null) {
                hlVar.mo97661b();
                return;
            }
            return;
        }
        lVar.mo101385c(radioButton, gyVar.f136828a);
    }
}
