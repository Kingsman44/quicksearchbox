package com.google.android.libraries.surveys.internal.view;

import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.surveys.internal.view.k */
/* compiled from: PG */
final class C43153k implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ C43156n f112849a;

    /* renamed from: b */
    private final int f112850b;

    public C43153k(C43156n nVar, int i) {
        this.f112849a = nVar;
        this.f112850b = i;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CheckBox checkBox;
        int i = 0;
        if ("NoneOfTheAbove".equals(compoundButton.getTag())) {
            C43156n nVar = this.f112849a;
            nVar.f112853a[this.f112850b] = z;
            if (z) {
                if (nVar.getChildCount() != this.f112849a.f112853a.length + 1) {
                    Log.e("SurveyMultipleSelectView", "Number of children (checkboxes) contained in the answers container was not equal to the number of possible responses including \"None of the Above\". Note this is not expected to happen in prod.");
                }
                for (int i2 = 0; i2 < this.f112849a.getChildCount(); i2++) {
                    CheckBox checkBox2 = (CheckBox) this.f112849a.getChildAt(i2).findViewById(R.id.survey_multiple_select_checkbox);
                    if (!"NoneOfTheAbove".equals(checkBox2.getTag())) {
                        checkBox2.setChecked(false);
                    }
                }
            }
        } else if ("OtherPleaseSpecify".equals(compoundButton.getTag())) {
            this.f112849a.f112853a[this.f112850b] = z;
            if (z) {
                while (true) {
                    if (i >= this.f112849a.getChildCount()) {
                        break;
                    }
                    EditText editText = (EditText) this.f112849a.getChildAt(i).findViewById(R.id.survey_other_option);
                    if (editText != null) {
                        editText.requestFocus();
                        break;
                    }
                    i++;
                }
            }
        } else {
            C43156n nVar2 = this.f112849a;
            nVar2.f112853a[this.f112850b] = z;
            if (z && (checkBox = (CheckBox) nVar2.findViewWithTag("NoneOfTheAbove")) != null) {
                checkBox.setChecked(false);
            }
        }
        C43156n nVar3 = this.f112849a;
        nVar3.f112855c.mo46138a(new C43154l(nVar3.f112854b, nVar3.f112853a));
    }
}
