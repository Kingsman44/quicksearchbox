package com.google.android.apps.gsa.speech.utils.p7317ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.URLSpan;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.speech.utils.ui.NoUnderlineURLSpan */
/* compiled from: PG */
public final class NoUnderlineURLSpan extends URLSpan {

    /* renamed from: a */
    private final Context f258637a;

    public NoUnderlineURLSpan(String str, Context context) {
        super(str);
        this.f258637a = context;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(C1878d.m5128a(this.f258637a, R.color.quantum_googblue));
    }
}
