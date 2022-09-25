package com.google.android.libraries.p1969j.p1970a.p1971a.p1972a;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: com.google.android.libraries.j.a.a.a.n */
/* compiled from: PG */
final class C23936n extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ C23939q f65436a;

    public C23936n(C23939q qVar) {
        this.f65436a = qVar;
    }

    public final void onClick(View view) {
        this.f65436a.f65467o.onClick(view);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
    }
}
