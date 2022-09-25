package com.google.android.libraries.componentview.components.agsa;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.libraries.componentview.services.application.NavigationParams;

/* renamed from: com.google.android.libraries.componentview.components.agsa.s */
/* compiled from: PG */
final class C19880s extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ C19881t f55603a;

    /* renamed from: b */
    private final String f55604b;

    public C19880s(C19881t tVar, String str) {
        this.f55603a = tVar;
        this.f55604b = str;
    }

    public final void onClick(View view) {
        this.f55603a.f55605a.mo21039a(this.f55604b, NavigationParams.m38563c().mo25555a());
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
