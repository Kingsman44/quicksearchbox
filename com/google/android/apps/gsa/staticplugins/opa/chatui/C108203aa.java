package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.aa */
/* compiled from: PG */
final class C108203aa extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ URLSpan f300959a;

    /* renamed from: b */
    final /* synthetic */ Resources f300960b;

    /* renamed from: c */
    final /* synthetic */ C108204ab f300961c;

    public C108203aa(C108204ab abVar, URLSpan uRLSpan, Resources resources) {
        this.f300961c = abVar;
        this.f300959a = uRLSpan;
        this.f300960b = resources;
    }

    public final void onClick(View view) {
        Intent x = C87566i.m142325x(this.f300959a.getURL());
        C28292j jVar = this.f300961c.f301030l;
        if (jVar != null) {
            C89949q.m146521e(C28285c.m52883j(jVar, 5, (Integer) null), false);
        }
        this.f300961c.f300963a.mo65089a(x);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f300960b.getColor(R.color.opa_text_secondary));
        textPaint.setUnderlineText(true);
    }
}
