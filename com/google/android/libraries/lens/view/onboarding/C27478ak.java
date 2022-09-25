package com.google.android.libraries.lens.view.onboarding;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.lens.view.onboarding.ak */
/* compiled from: PG */
final class C27478ak extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ BiConsumer f75140a;

    /* renamed from: b */
    final /* synthetic */ String f75141b;

    public C27478ak(BiConsumer biConsumer, String str) {
        this.f75140a = biConsumer;
        this.f75141b = str;
    }

    public final void onClick(View view) {
        this.f75140a.accept(view, this.f75141b);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
