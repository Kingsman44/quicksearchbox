package com.google.android.apps.gsa.staticplugins.avocado;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.av.au;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.fl */
/* compiled from: PG */
final class C94314fl extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ C94315fm f263539a;

    public C94314fl(C94315fm fmVar) {
        this.f263539a = fmVar;
    }

    public final void onClick(View view) {
        au.c(this.f263539a.getContext(), R.string.dialog_learn_more_fm_title, R.string.dialog_learn_more_fm_content);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
