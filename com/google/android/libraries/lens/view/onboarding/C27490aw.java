package com.google.android.libraries.lens.view.onboarding;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.lens.view.onboarding.aw */
/* compiled from: PG */
final class C27490aw extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ BiConsumer f75175a;

    /* renamed from: b */
    final /* synthetic */ String f75176b;

    public C27490aw(BiConsumer biConsumer, String str) {
        this.f75175a = biConsumer;
        this.f75176b = str;
    }

    public final void onClick(View view) {
        this.f75175a.accept(view, this.f75176b);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
