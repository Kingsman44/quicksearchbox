package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.s */
/* compiled from: PG */
final class C106424s implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ AmbientAssistantFeedbackFragment f296860a;

    public C106424s(AmbientAssistantFeedbackFragment ambientAssistantFeedbackFragment) {
        this.f296860a = ambientAssistantFeedbackFragment;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (((RadioButton) radioGroup.findViewById(i)).getText().toString().equals("Card did not show up")) {
            TextView textView = this.f296860a.f296787o;
            textView.getClass();
            textView.setVisibility(8);
            RadioGroup radioGroup2 = this.f296860a.f296788p;
            radioGroup2.getClass();
            radioGroup2.setVisibility(8);
            RadioGroup radioGroup3 = this.f296860a.f296788p;
            radioGroup3.getClass();
            radioGroup3.clearCheck();
            TextView textView2 = this.f296860a.f296789q;
            textView2.getClass();
            textView2.setVisibility(8);
            RadioGroup radioGroup4 = this.f296860a.f296790r;
            radioGroup4.getClass();
            radioGroup4.setVisibility(8);
            RadioGroup radioGroup5 = this.f296860a.f296790r;
            radioGroup5.getClass();
            radioGroup5.clearCheck();
            return;
        }
        TextView textView3 = this.f296860a.f296787o;
        textView3.getClass();
        textView3.setVisibility(0);
        RadioGroup radioGroup6 = this.f296860a.f296788p;
        radioGroup6.getClass();
        radioGroup6.setVisibility(0);
        TextView textView4 = this.f296860a.f296789q;
        textView4.getClass();
        textView4.setVisibility(0);
        RadioGroup radioGroup7 = this.f296860a.f296790r;
        radioGroup7.getClass();
        radioGroup7.setVisibility(0);
    }
}
