package com.google.android.apps.search.googleapp.search.settings.p10427d;

import android.view.View;
import com.google.android.apps.gsa.p8867w.p8879i.p8880a.C118798a;
import com.google.android.apps.gsa.p8867w.p8879i.p8880a.C118799b;
import com.google.android.apps.search.googleapp.search.settings.p10424a.C137563c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.d.e */
/* compiled from: PG */
final class C137602e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C137603f f374284a;

    /* renamed from: b */
    final /* synthetic */ C137601d f374285b;

    public C137602e(C137603f fVar, C137601d dVar) {
        this.f374284a = fVar;
        this.f374285b = dVar;
    }

    public final void onClick(View view) {
        C137599b bVar = (C137599b) this.f374284a.f374287b.get(this.f374285b.getBindingAdapterPosition());
        if (!bVar.f374279e) {
            C137563c cVar = this.f374284a.f374286a;
            C8506p pVar = bVar.f374278d;
            C69664n.m101061g(pVar, "language");
            C118799b bVar2 = cVar.f374175e;
            C60870cx b = bVar2.f331366e.mo19399b(new C118798a(bVar2, pVar));
            C46459k.m82829b(b, "Fail to updated selected search language", new Object[0]);
            cVar.f374172b.mo50787a(b, C137563c.f374171a);
        }
    }
}
