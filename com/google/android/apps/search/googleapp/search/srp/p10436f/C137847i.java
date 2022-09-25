package com.google.android.apps.search.googleapp.search.srp.p10436f;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138793d;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138794e;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.f.i */
/* compiled from: PG */
final class C137847i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C137843g f375055a;

    public C137847i(C137843g gVar) {
        this.f375055a = gVar;
    }

    public final void onClick(View view) {
        C137843g gVar = this.f375055a;
        gVar.f375030e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        if (gVar.f375046u.f375183b) {
            C47393f.m84237h(C138793d.f377546a, view);
            return;
        }
        C139708c cVar = gVar.f375041p;
        cVar.f379734a.set(Optional.m71637of(C37182a.f97862bo));
        C37258g gVar2 = C37182a.f97862bo;
        C69664n.m101060f(gVar2, "GOOGLEAPP_SEARCH_BOX_SRP_MIC_TAP");
        cVar.mo115177d(gVar2);
        gVar.f375042q.mo83702b(C89849ae.SEARCH_WIDGET_MIC_TAP);
        C47393f.m84237h(C138794e.f377547a, view);
    }
}
