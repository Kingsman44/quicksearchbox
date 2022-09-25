package com.google.android.libraries.lens.view.utils;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2096f.C25801d;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.utils.o */
/* compiled from: PG */
public final /* synthetic */ class C28126o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C28128q f76534a;

    /* renamed from: b */
    public final /* synthetic */ TextView f76535b;

    public /* synthetic */ C28126o(C28128q qVar, TextView textView) {
        this.f76534a = qVar;
        this.f76535b = textView;
    }

    public final void onClick(View view) {
        C28128q qVar = this.f76534a;
        TextView textView = this.f76535b;
        if (TextUtils.equals(textView.getText(), qVar.f76538a.getString(R.string.lens_results_feedback_response_to_rate))) {
            qVar.f76542e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=com.google.ar.lens"));
            intent.setPackage("com.android.vending");
            qVar.f76540c.mo30556f(intent);
        } else if (TextUtils.equals(textView.getText(), qVar.f76538a.getString(R.string.lens_results_feedback_response_to_positive))) {
            qVar.mo33576b(C25801d.POSITIVE_RATING);
        } else {
            qVar.mo33576b(C25801d.NEGATIVE_RATING);
        }
    }
}
