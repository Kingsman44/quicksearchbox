package com.google.android.libraries.lens.view.gallery.data;

import com.google.android.libraries.lens.view.p2078at.C25501ag;
import com.google.android.libraries.lens.view.p2078at.C25513as;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.i */
/* compiled from: PG */
public final /* synthetic */ class C26390i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C26393l f71801a;

    public /* synthetic */ C26390i(C26393l lVar) {
        this.f71801a = lVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C26393l lVar = this.f71801a;
        C60870cx cxVar = lVar.f71810g;
        if (cxVar == null) {
            C26398q qVar = lVar.f71811h;
            C25513as asVar = qVar.f71822f;
            if (!asVar.mo30543a(C25501ag.m46966a(asVar.f69476b))) {
                cxVar = C60856cj.m92900i(C26406y.f71844d);
            } else {
                qVar.f71818b.f71826a.mo19974a(C37194a.f98498bH);
                cxVar = qVar.f71819c.mo50872b(qVar.f71821e, new String[]{"_id", "_size", "date_modified", "bucket_display_name"}, (String) null, (String[]) null, "date_modified DESC").f121591a.mo57272e(new C26397p(qVar), qVar.f71820d).mo57275g();
            }
            lVar.f71810g = cxVar;
            C47633f h = C47633f.m84733g(cxVar).mo51515h(new C26388g(lVar), C60826bg.f164896a);
            C26392k kVar = new C26392k(lVar);
            C60856cj.m92911t(h.f164926b, C47810es.m84974n(kVar), lVar.f71807d);
        }
        return cxVar;
    }
}
