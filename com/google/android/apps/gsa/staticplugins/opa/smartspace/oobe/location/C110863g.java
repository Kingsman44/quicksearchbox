package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.location;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.location.g */
/* compiled from: PG */
final class C110863g extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ C110866j f308864a;

    public C110863g(C110866j jVar) {
        this.f308864a = jVar;
    }

    public final void onClick(View view) {
        C110866j jVar = this.f308864a;
        C18509a aVar = (C18509a) jVar.f308872f.mo17428b();
        aVar.mo24024f("ambient_assistant");
        jVar.f308868b.startActivityForResult(aVar.mo24020b().mo24031a(), 0);
        this.f308864a.f308873g.mo86704i(this);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f308864a.f308868b.getResources().getColor(R.color.aa_link_text_color));
        textPaint.setUnderlineText(false);
    }
}
