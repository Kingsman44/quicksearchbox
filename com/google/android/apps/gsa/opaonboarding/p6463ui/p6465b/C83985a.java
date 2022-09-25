package com.google.android.apps.gsa.opaonboarding.p6463ui.p6465b;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.b.a */
/* compiled from: PG */
public class C83985a extends LinearLayout {
    public C83985a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.consent_element_template, this);
    }

    /* renamed from: a */
    public final ImageView mo77422a() {
        return (ImageView) findViewById(R.id.consent_element_image);
    }

    /* renamed from: b */
    public final void mo77423b(View view) {
        ((ViewGroup) findViewById(R.id.consent_element_control)).addView(view);
    }

    /* renamed from: c */
    public final void mo77424c(String str) {
        ((TextView) findViewById(R.id.consent_element_title_text)).setText(Html.fromHtml(str));
    }
}
