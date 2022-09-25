package com.google.android.libraries.lens.view.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.feedback.FeedbackBannerView;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2096f.C25801d;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;

/* renamed from: com.google.android.libraries.lens.view.utils.q */
/* compiled from: PG */
public final class C28128q {

    /* renamed from: a */
    public final Context f76538a;

    /* renamed from: b */
    public final C27232l f76539b;

    /* renamed from: c */
    public final C25537t f76540c;

    /* renamed from: d */
    public final C28310af f76541d;

    /* renamed from: e */
    public final C28443m f76542e;

    /* renamed from: f */
    public final C28306ab f76543f;

    public C28128q(Context context, C27232l lVar, C25537t tVar, C28310af afVar, C28443m mVar, C28306ab abVar) {
        this.f76538a = context;
        this.f76539b = lVar;
        this.f76540c = tVar;
        this.f76541d = afVar;
        this.f76542e = mVar;
        this.f76543f = abVar;
    }

    /* renamed from: a */
    public final FeedbackBannerView mo33575a() {
        FeedbackBannerView feedbackBannerView = (FeedbackBannerView) LayoutInflater.from(this.f76538a).inflate(R.layout.results_feedback_banner, (ViewGroup) null);
        C28310af afVar = this.f76541d;
        C28306ab abVar = this.f76543f;
        abVar.mo33802c(feedbackBannerView.f70108a, afVar.mo33805a(C28427h.m53115a(60839)));
        abVar.mo33802c(feedbackBannerView.f70110c, afVar.mo33805a(C28427h.m53115a(54628)));
        abVar.mo33802c(feedbackBannerView.f70111d, afVar.mo33805a(C28427h.m53115a(54629)));
        abVar.mo33802c(feedbackBannerView.f70112e, afVar.mo33805a(C28427h.m53115a(60230)));
        TextView textView = (TextView) feedbackBannerView.findViewById(R.id.results_feedback_prompt_text);
        TextView textView2 = (TextView) feedbackBannerView.findViewById(R.id.send_report);
        textView2.getViewTreeObserver().addOnGlobalLayoutListener(new C28127p(textView2, feedbackBannerView));
        TextView textView3 = textView;
        TextView textView4 = textView2;
        TextView textView5 = (TextView) feedbackBannerView.findViewById(R.id.thumbs_up);
        TextView textView6 = (TextView) feedbackBannerView.findViewById(R.id.thumbs_down);
        FeedbackBannerView feedbackBannerView2 = feedbackBannerView;
        C28124m mVar = new C28124m(this, textView3, textView4, textView5, textView6, feedbackBannerView2);
        C28125n nVar = new C28125n(this, textView3, textView4, textView5, textView6, feedbackBannerView2);
        C28126o oVar = new C28126o(this, textView);
        feedbackBannerView.f70110c.setOnClickListener(mVar);
        feedbackBannerView.f70111d.setOnClickListener(nVar);
        feedbackBannerView.f70112e.setOnClickListener(oVar);
        return feedbackBannerView;
    }

    /* renamed from: b */
    public final void mo33576b(C25801d dVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("ae-action://send_feedback").buildUpon().appendQueryParameter("ep", dVar.name()).build());
        this.f76540c.mo30556f(intent);
    }
}
