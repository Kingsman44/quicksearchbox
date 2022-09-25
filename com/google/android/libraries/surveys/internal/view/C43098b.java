package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.p3328e.C43056e;

/* renamed from: com.google.android.libraries.surveys.internal.view.b */
/* compiled from: PG */
public final class C43098b extends LinearLayout {

    /* renamed from: a */
    public final Button f112718a;

    /* renamed from: b */
    public final Button f112719b;

    public C43098b(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_invitation, this, true);
        Button button = (Button) findViewById(R.id.survey_prompt_take_survey_button);
        this.f112718a = button;
        Button button2 = (Button) findViewById(R.id.survey_prompt_no_thanks_button);
        this.f112719b = button2;
        m76061a(button);
        m76061a(button2);
    }

    /* renamed from: a */
    private final void m76061a(Button button) {
        C43056e.m75963c(findViewById(R.id.survey_prompt_buttons), button, 0, R.dimen.survey_button_accessibility_padding);
    }
}
