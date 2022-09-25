package com.google.android.libraries.p2460r.p2469c;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32058a;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57499g;

/* renamed from: com.google.android.libraries.r.c.f */
/* compiled from: PG */
final class C32128f extends ClickableSpan {

    /* renamed from: a */
    private final C57499g f86281a;

    /* renamed from: b */
    private final C32058a f86282b;

    /* renamed from: c */
    private final C57438di f86283c;

    public C32128f(C57499g gVar, C32058a aVar, C57438di diVar) {
        this.f86281a = gVar;
        this.f86282b = aVar;
        this.f86283c = diVar;
    }

    public final void onClick(View view) {
        this.f86282b.mo37841a(this.f86281a, 1, this.f86283c, view, C57418cp.f153391a);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
