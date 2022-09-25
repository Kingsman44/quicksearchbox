package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.components.LottieImageComponent */
/* compiled from: PG */
public class LottieImageComponent extends LinearLayout {

    /* renamed from: a */
    public LottieAnimationView f36869a;

    public LottieImageComponent(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36869a = new LottieAnimationView(getContext());
    }

    public LottieImageComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LottieImageComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
