package com.google.android.apps.gsa.staticplugins.opapayments.p8666ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.ui.c */
/* compiled from: PG */
public final class C115949c extends FrameLayout {

    /* renamed from: a */
    public final TextView f321509a = ((TextView) findViewById(R.id.summary_card_element_title_text));

    /* renamed from: b */
    public final TextView f321510b = ((TextView) findViewById(R.id.summary_card_element_subtitle_text));

    /* renamed from: c */
    public final TextView f321511c = ((TextView) findViewById(R.id.summary_element_change_button));

    public C115949c(Context context) {
        super(context, (AttributeSet) null);
        View.inflate(getContext(), R.layout.opa_payments_setup_summary_card_element, this);
    }
}
