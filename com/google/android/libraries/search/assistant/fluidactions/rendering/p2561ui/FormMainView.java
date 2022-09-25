package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormMainView */
/* compiled from: PG */
public final class FormMainView extends LinearLayout {

    /* renamed from: a */
    private TextView f88871a = null;

    public FormMainView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo38617a(C51953ff ffVar) {
        if ((ffVar.f136317a & 1) != 0) {
            String str = ffVar.f136318b;
            TextView textView = this.f88871a;
            if (textView != null) {
                textView.setVisibility(0);
                this.f88871a.setText(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f88871a = (TextView) findViewById(R.id.fa_form_main_view_title);
    }

    public FormMainView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FormMainView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FormMainView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
