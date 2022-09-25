package com.google.android.libraries.componentview.components.base;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.libraries.componentview.p1697d.C20477h;
import com.google.android.libraries.componentview.services.application.C20546a;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20613d;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import java.util.List;

/* compiled from: PG */
class SpanComponent$4 extends URLSpan {

    /* renamed from: a */
    final /* synthetic */ String f55665a;

    /* renamed from: b */
    final /* synthetic */ List f55666b;

    /* renamed from: c */
    final /* synthetic */ C20058bp f55667c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpanComponent$4(C20058bp bpVar, String str, String str2, List list) {
        super(str);
        this.f55667c = bpVar;
        this.f55665a = str2;
        this.f55666b = list;
    }

    public final void onClick(View view) {
        this.f55667c.mo25421J(4, (C20477h) null);
        C20546a aVar = this.f55667c.f56237d;
        Integer.toString(this.f55665a.hashCode());
        aVar.mo25478d(this.f55666b, 0);
        C56425d dVar = this.f55667c.f57588z;
        if ((dVar.f150539a & 4) != 0) {
            C56429h hVar = dVar.f150542d;
            if (hVar == null) {
                hVar = C56429h.f150547k;
            }
            C20601ca caVar = this.f55667c.f56236c;
            C20613d dVar2 = new C20613d();
            dVar2.mo25529b(this.f55665a);
            dVar2.mo25530c(hVar.f150556h);
            dVar2.f57816c = hVar.f150555g;
            dVar2.f57817d = hVar.f150558j;
            caVar.mo21037a(dVar2.mo25528a());
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
    }
}
