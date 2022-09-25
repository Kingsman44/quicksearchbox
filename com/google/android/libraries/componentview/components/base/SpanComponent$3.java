package com.google.android.libraries.componentview.components.base;

import android.content.ActivityNotFoundException;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20477h;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.p1699f.C20524l;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.p4271bq.C56429h;

/* compiled from: PG */
class SpanComponent$3 extends URLSpan {

    /* renamed from: a */
    final /* synthetic */ C19983f f55663a;

    /* renamed from: b */
    final /* synthetic */ C20058bp f55664b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpanComponent$3(C20058bp bpVar, String str, C19983f fVar) {
        super(str);
        this.f55664b = bpVar;
        this.f55663a = fVar;
    }

    public final void onClick(View view) {
        this.f55664b.mo25421J(4, (C20477h) null);
        try {
            C20058bp bpVar = this.f55664b;
            C20524l lVar = bpVar.f56235b;
            C19983f fVar = this.f55663a;
            C56429h hVar = bpVar.f57588z.f150542d;
            if (hVar == null) {
                hVar = C56429h.f150547k;
            }
            lVar.mo25440b(fVar, hVar);
        } catch (ActivityNotFoundException unused) {
            C20598by G = this.f55664b.mo25418G();
            G.mo25535e(C19742a.INVALID_INTENT);
            G.mo25536f("Intent is invalid! There is no activity can handle it!");
            G.mo25534d(C20058bp.m37897g(this.f55664b.f56238e));
            C20520h.m38498c("SpanComponent", G.mo25531a(), this.f55664b.f56236c, new Object[0]);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
    }
}
