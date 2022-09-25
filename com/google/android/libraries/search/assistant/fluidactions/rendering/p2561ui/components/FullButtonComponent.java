package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.FullButtonComponent */
/* compiled from: PG */
public final class FullButtonComponent extends LinearLayout {

    /* renamed from: a */
    public static final C59071e f88952a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.FullButtonComponent");

    /* renamed from: e */
    private static final int[] f88953e = {-16842910};

    /* renamed from: f */
    private static final int[] f88954f = {16842910};

    /* renamed from: b */
    public ImageComponent f88955b = null;

    /* renamed from: c */
    public TextView f88956c = null;

    /* renamed from: d */
    public LinearLayout f88957d = null;

    public FullButtonComponent(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo38646a(String str) {
        TextView textView = this.f88956c;
        if (textView != null) {
            textView.setVisibility(0);
            this.f88956c.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f88957d = (LinearLayout) findViewById(R.id.fa_full_button_component_container);
        this.f88955b = (ImageComponent) findViewById(R.id.fa_full_button_component_image);
        this.f88956c = (TextView) findViewById(R.id.fa_full_button_component_text);
    }

    public final void setEnabled(boolean z) {
        LinearLayout linearLayout;
        super.setEnabled(z);
        if (this.f88956c != null && (linearLayout = this.f88957d) != null) {
            linearLayout.setEnabled(z);
            if (!z) {
                this.f88956c.setTextColor(C33234l.m61645c(getContext(), R.attr.fa_button_component_foreground_normal_color, f88953e));
            } else {
                this.f88956c.setTextColor(C33234l.m61645c(getContext(), R.attr.fa_button_component_foreground_normal_color, f88954f));
            }
        }
    }

    public FullButtonComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FullButtonComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FullButtonComponent(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
