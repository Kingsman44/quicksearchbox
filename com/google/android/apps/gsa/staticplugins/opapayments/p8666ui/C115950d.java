package com.google.android.apps.gsa.staticplugins.opapayments.p8666ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.ui.d */
/* compiled from: PG */
public final class C115950d extends FrameLayout {

    /* renamed from: a */
    public final TextView f321512a = ((TextView) findViewById(R.id.identity_element_description_text));

    /* renamed from: b */
    public final Switch f321513b = ((Switch) findViewById(R.id.identity_element_switch_button));

    public C115950d(Context context) {
        super(context, (AttributeSet) null);
        View.inflate(getContext(), R.layout.opa_payments_setup_summary_switch, this);
    }
}
