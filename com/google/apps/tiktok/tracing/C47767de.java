package com.google.apps.tiktok.tracing;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: com.google.apps.tiktok.tracing.de */
/* compiled from: PG */
public final class C47767de extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ String f123755a;

    /* renamed from: b */
    final /* synthetic */ ClickableSpan f123756b;

    /* renamed from: c */
    final /* synthetic */ C47770dh f123757c;

    public C47767de(C47770dh dhVar, String str, ClickableSpan clickableSpan) {
        this.f123757c = dhVar;
        this.f123755a = str;
        this.f123756b = clickableSpan;
    }

    public final void onClick(View view) {
        C47538ax c = this.f123757c.mo51613c(this.f123755a);
        try {
            this.f123756b.onClick(view);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    public final void updateDrawState(TextPaint textPaint) {
        this.f123756b.updateDrawState(textPaint);
    }
}
