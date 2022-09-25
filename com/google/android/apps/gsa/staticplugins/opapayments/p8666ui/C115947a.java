package com.google.android.apps.gsa.staticplugins.opapayments.p8666ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.ui.a */
/* compiled from: PG */
public final class C115947a extends FrameLayout {

    /* renamed from: a */
    public final TextView f321506a = ((TextView) findViewById(R.id.oobe_list_element_title_text));

    /* renamed from: b */
    public final TextView f321507b = ((TextView) findViewById(R.id.oobe_list_element_message_text));

    public C115947a(Context context) {
        super(context, (AttributeSet) null);
        View.inflate(getContext(), R.layout.opa_payments_oobe_list_element, this);
    }
}
