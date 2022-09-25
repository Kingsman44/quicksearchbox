package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.components.FullButtonComponent */
/* compiled from: PG */
public class FullButtonComponent extends LinearLayout {

    /* renamed from: a */
    public static final C59071e f36850a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.components.FullButtonComponent");

    /* renamed from: e */
    private static final int[] f36851e = {-16842910};

    /* renamed from: f */
    private static final int[] f36852f = {16842910};

    /* renamed from: b */
    public ImageComponent f36853b;

    /* renamed from: c */
    public TextView f36854c;

    /* renamed from: d */
    public LinearLayout f36855d;

    public FullButtonComponent(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo19783a(String str) {
        this.f36854c.setVisibility(0);
        this.f36854c.setText(str);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36855d = (LinearLayout) findViewById(R.id.full_button_component_button);
        this.f36853b = (ImageComponent) findViewById(R.id.full_button_component_image_component);
        this.f36854c = (TextView) findViewById(R.id.full_button_component_text_view);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            this.f36854c.setTextColor(C11307e.m26909b(getContext(), R.attr.fluid_actions_button_component_disabled_text_color, f36851e));
        } else {
            this.f36854c.setTextColor(C11307e.m26909b(getContext(), R.attr.fluid_actions_button_component_enabled_text_color, f36852f));
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
