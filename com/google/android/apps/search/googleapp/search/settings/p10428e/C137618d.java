package com.google.android.apps.search.googleapp.search.settings.p10428e;

import android.view.View;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.search.googleapp.search.settings.p10428e.p10429a.C137614b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.e.d */
/* compiled from: PG */
final class C137618d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C137619e f374333a;

    /* renamed from: b */
    final /* synthetic */ C137617c f374334b;

    public C137618d(C137619e eVar, C137617c cVar) {
        this.f374333a = eVar;
        this.f374334b = cVar;
    }

    public final void onClick(View view) {
        C137615b bVar = (C137615b) this.f374333a.f374337c.get(this.f374334b.getBindingAdapterPosition());
        if (!bVar.f374330f) {
            C137614b bVar2 = this.f374333a.f374335a;
            String str = bVar.f374329e;
            C69664n.m101061g(str, "countryCode");
            C86337q b = bVar2.f374324d.f331369a.mo80076b();
            b.mo80073h("selected_search_country_code", str);
            b.apply();
            C60870cx cxVar = C60866ct.f164955a;
            bVar2.f374322b.mo50787a(cxVar, C137614b.f374321a);
            C46439e eVar = this.f374333a.f374336b;
            C46438d b2 = C46438d.m82810b(cxVar);
            eVar.mo50428h(b2.f121541a, (Object) null, C137615b.f374326b);
        }
    }
}
