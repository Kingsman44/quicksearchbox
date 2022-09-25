package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114872do;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.af */
/* compiled from: PG */
final class C114975af extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ boolean f319086a;

    /* renamed from: b */
    final /* synthetic */ Runnable f319087b;

    /* renamed from: c */
    final /* synthetic */ Integer f319088c;

    /* renamed from: d */
    final /* synthetic */ C114976ag f319089d;

    public C114975af(C114976ag agVar, boolean z, Runnable runnable, Integer num) {
        this.f319089d = agVar;
        this.f319086a = z;
        this.f319087b = runnable;
        this.f319088c = num;
    }

    public final void onClick(View view) {
        C89949q.m146521e(C28285c.m52882i(view, 5, (Integer) null), false);
        if (this.f319086a) {
            C114976ag agVar = this.f319089d;
            C114872do.m190400c(agVar.f319092c, agVar.f319097h, this.f319087b, agVar.f319096g);
            return;
        }
        this.f319087b.run();
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f319088c == null) {
            textPaint.setColor(this.f319089d.f319091b.getResources().getColor(R.color.ambient_clickspan_color));
        } else {
            textPaint.setColor(this.f319089d.f319091b.getResources().getColor(this.f319088c.intValue()));
        }
        textPaint.setUnderlineText(true);
    }
}
