package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ChipComponent */
/* compiled from: PG */
public class ChipComponent extends LinearLayout {

    /* renamed from: a */
    public int f36826a;

    /* renamed from: b */
    public LinearLayout f36827b;

    /* renamed from: c */
    public LinearLayout f36828c;

    /* renamed from: d */
    public LinearLayout f36829d;

    /* renamed from: e */
    public ImageComponent f36830e;

    /* renamed from: f */
    public TextView f36831f;

    /* renamed from: g */
    public LinearLayout f36832g;

    /* renamed from: h */
    public ImageComponent f36833h;

    public ChipComponent(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final int mo19773a(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        return C1878d.m5128a(getContext(), typedValue.resourceId != 0 ? typedValue.resourceId : typedValue.data);
    }

    /* renamed from: b */
    public final void mo19774b(String str) {
        this.f36831f.setVisibility(0);
        this.f36831f.setText(str);
    }

    /* renamed from: c */
    public final void mo19775c(String str, int i) {
        this.f36833h.setVisibility(0);
        this.f36832g.setVisibility(0);
        this.f36833h.mo19788d(str, i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36827b = (LinearLayout) findViewById(R.id.chip_component_container);
        this.f36828c = (LinearLayout) findViewById(R.id.chip_component_button);
        this.f36829d = (LinearLayout) findViewById(R.id.chip_icon_container);
        this.f36830e = (ImageComponent) findViewById(R.id.chip_component_image);
        this.f36831f = (TextView) findViewById(R.id.chip_component_text_view);
        this.f36832g = (LinearLayout) findViewById(R.id.chip_component_cancel);
        this.f36833h = (ImageComponent) findViewById(R.id.chip_component_cancel_icon);
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
