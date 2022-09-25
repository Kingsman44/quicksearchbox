package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ChipComponent */
/* compiled from: PG */
public final class ChipComponent extends LinearLayout {

    /* renamed from: a */
    public static final C59071e f88943a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ChipComponent");

    /* renamed from: b */
    public int f88944b = -1;

    /* renamed from: c */
    public LinearLayout f88945c = null;

    /* renamed from: d */
    public LinearLayout f88946d = null;

    /* renamed from: e */
    public LinearLayout f88947e = null;

    /* renamed from: f */
    public ImageComponent f88948f = null;

    /* renamed from: g */
    public TextView f88949g = null;

    /* renamed from: h */
    public LinearLayout f88950h = null;

    /* renamed from: i */
    public ImageComponent f88951i = null;

    public ChipComponent(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo38643a(C51012dc dcVar) {
        ImageComponent imageComponent = this.f88951i;
        if (imageComponent != null && this.f88950h != null) {
            imageComponent.setVisibility(0);
            this.f88950h.setVisibility(0);
            this.f88951i.mo38649b(dcVar, (Drawable) null);
        }
    }

    /* renamed from: b */
    public final void mo38644b(String str) {
        TextView textView = this.f88949g;
        if (textView != null) {
            textView.setVisibility(0);
            this.f88949g.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f88945c = (LinearLayout) findViewById(R.id.fa_chip_component_container);
        this.f88946d = (LinearLayout) findViewById(R.id.fa_chip_component_button);
        this.f88947e = (LinearLayout) findViewById(R.id.fa_chip_component_icon_container);
        this.f88948f = (ImageComponent) findViewById(R.id.fa_chip_component_image);
        this.f88949g = (TextView) findViewById(R.id.fa_chip_component_text_view);
        this.f88950h = (LinearLayout) findViewById(R.id.fa_chip_component_cancel);
        this.f88951i = (ImageComponent) findViewById(R.id.fa_chip_component_cancel_icon);
    }

    public ChipComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChipComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ChipComponent(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
