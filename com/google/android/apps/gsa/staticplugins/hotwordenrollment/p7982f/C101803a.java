package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7982f;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.f.a */
/* compiled from: PG */
final class C101803a extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ Runnable f283946a;

    /* renamed from: b */
    final /* synthetic */ C101804b f283947b;

    public C101803a(C101804b bVar, Runnable runnable) {
        this.f283947b = bVar;
        this.f283946a = runnable;
    }

    public final void onClick(View view) {
        this.f283946a.run();
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(C1878d.m5128a(this.f283947b.f283948a.requireContext(), R.color.quantum_googblue));
    }
}
