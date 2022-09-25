package com.google.android.libraries.lens.view.utils;

import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.feedback.FeedbackBannerView;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.utils.n */
/* compiled from: PG */
public final /* synthetic */ class C28125n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C28128q f76528a;

    /* renamed from: b */
    public final /* synthetic */ TextView f76529b;

    /* renamed from: c */
    public final /* synthetic */ TextView f76530c;

    /* renamed from: d */
    public final /* synthetic */ TextView f76531d;

    /* renamed from: e */
    public final /* synthetic */ TextView f76532e;

    /* renamed from: f */
    public final /* synthetic */ FeedbackBannerView f76533f;

    public /* synthetic */ C28125n(C28128q qVar, TextView textView, TextView textView2, TextView textView3, TextView textView4, FeedbackBannerView feedbackBannerView) {
        this.f76528a = qVar;
        this.f76529b = textView;
        this.f76530c = textView2;
        this.f76531d = textView3;
        this.f76532e = textView4;
        this.f76533f = feedbackBannerView;
    }

    public final void onClick(View view) {
        C28128q qVar = this.f76528a;
        TextView textView = this.f76529b;
        TextView textView2 = this.f76530c;
        TextView textView3 = this.f76531d;
        TextView textView4 = this.f76532e;
        FeedbackBannerView feedbackBannerView = this.f76533f;
        qVar.f76542e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        textView.setText(R.string.lens_results_feedback_response_to_negative);
        textView2.setText(R.string.lens_results_feedback_send_report);
        textView3.setVisibility(8);
        textView4.setVisibility(8);
        feedbackBannerView.mo30945a();
    }
}
