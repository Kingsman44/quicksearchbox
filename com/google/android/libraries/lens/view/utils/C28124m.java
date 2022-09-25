package com.google.android.libraries.lens.view.utils;

import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.feedback.FeedbackBannerView;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.utils.m */
/* compiled from: PG */
public final /* synthetic */ class C28124m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C28128q f76522a;

    /* renamed from: b */
    public final /* synthetic */ TextView f76523b;

    /* renamed from: c */
    public final /* synthetic */ TextView f76524c;

    /* renamed from: d */
    public final /* synthetic */ TextView f76525d;

    /* renamed from: e */
    public final /* synthetic */ TextView f76526e;

    /* renamed from: f */
    public final /* synthetic */ FeedbackBannerView f76527f;

    public /* synthetic */ C28124m(C28128q qVar, TextView textView, TextView textView2, TextView textView3, TextView textView4, FeedbackBannerView feedbackBannerView) {
        this.f76522a = qVar;
        this.f76523b = textView;
        this.f76524c = textView2;
        this.f76525d = textView3;
        this.f76526e = textView4;
        this.f76527f = feedbackBannerView;
    }

    public final void onClick(View view) {
        C28128q qVar = this.f76522a;
        TextView textView = this.f76523b;
        TextView textView2 = this.f76524c;
        TextView textView3 = this.f76525d;
        TextView textView4 = this.f76526e;
        FeedbackBannerView feedbackBannerView = this.f76527f;
        qVar.f76542e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        String str = (String) qVar.f76539b.mo32701h().mo56111f();
        if (str == null || !C58485gu.m89847o("com.google.ar.lens", "com.google.ar.lens.dev").contains(str)) {
            textView.setText(R.string.lens_results_feedback_response_to_positive);
            textView2.setText(R.string.lens_results_feedback_send_report);
        } else {
            textView.setText(R.string.lens_results_feedback_response_to_rate);
            textView2.setText(R.string.lens_results_feedback_rate);
        }
        textView3.setVisibility(8);
        textView4.setVisibility(8);
        feedbackBannerView.mo30945a();
    }
}
