package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43056e;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68362ak;

/* compiled from: PG */
public class SurveyPromptBannerWrapper extends FrameLayout {
    public SurveyPromptBannerWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (C43054c.m75960c(C68362ak.f184703a.mo6453a().mo60353b(C43054c.f112610b))) {
            i2 = C43056e.m75961a(this, findViewById(R.id.survey_prompt_banner), i, i2, findViewById(R.id.survey_prompt_header), (View) null);
        }
        super.onMeasure(i, i2);
    }
}
