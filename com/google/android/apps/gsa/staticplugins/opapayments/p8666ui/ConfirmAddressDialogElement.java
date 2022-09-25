package com.google.android.apps.gsa.staticplugins.opapayments.p8666ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.ui.ConfirmAddressDialogElement */
/* compiled from: PG */
public class ConfirmAddressDialogElement extends FrameLayout {

    /* renamed from: a */
    public final RadioButton f321503a;

    /* renamed from: b */
    public final TextView f321504b;

    /* renamed from: c */
    private final TextView f321505c;

    public ConfirmAddressDialogElement(Context context) {
        this(context, (AttributeSet) null);
    }

    public ConfirmAddressDialogElement(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.opa_payments_confirm_address_dialog_radio_element, this);
        this.f321503a = (RadioButton) findViewById(R.id.radio_button);
        TextView textView = (TextView) findViewById(R.id.title_text);
        this.f321505c = textView;
        TextView textView2 = (TextView) findViewById(R.id.summary_text);
        this.f321504b = textView2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C115948b.f321508a, 0, 0);
            try {
                C84018m.m133908c(textView, obtainStyledAttributes.getString(1), TextView.BufferType.NORMAL, this);
                C84018m.m133908c(textView2, obtainStyledAttributes.getString(0), TextView.BufferType.NORMAL, this);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
