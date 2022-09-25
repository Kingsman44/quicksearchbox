package com.google.android.libraries.lens.view.feedback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class FeedbackBannerView extends ConstraintLayout {

    /* renamed from: a */
    public View f70108a;

    /* renamed from: b */
    public TextView f70109b;

    /* renamed from: c */
    public Button f70110c;

    /* renamed from: d */
    public Button f70111d;

    /* renamed from: e */
    public Button f70112e;

    public FeedbackBannerView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo30945a() {
        C1756o oVar = new C1756o();
        oVar.mo4889i(this);
        oVar.mo4891k(R.id.results_feedback_prompt_text, 7, R.id.send_report, 6);
        oVar.mo4888h(this);
        this.f70112e.setVisibility(0);
        this.f70112e.sendAccessibilityEvent(8);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f70108a = findViewById(R.id.feedback_banner);
        this.f70109b = (TextView) findViewById(R.id.results_feedback_prompt_text);
        this.f70110c = (Button) findViewById(R.id.thumbs_up);
        this.f70111d = (Button) findViewById(R.id.thumbs_down);
        this.f70112e = (Button) findViewById(R.id.send_report);
    }

    public FeedbackBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
