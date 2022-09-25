package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138794e;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.h */
/* compiled from: PG */
final class C138606h implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C138611m f376959a;

    /* renamed from: b */
    final /* synthetic */ View f376960b;

    public C138606h(C138611m mVar, View view) {
        this.f376959a = mVar;
        this.f376960b = view;
    }

    public final void onClick(View view) {
        this.f376959a.mo114402c();
        this.f376959a.f376977h.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f376960b));
        this.f376959a.f376972c.mo114117g();
        this.f376959a.f376975f.mo83702b(C89849ae.SEARCH_WIDGET_MIC_TAP);
        C139708c cVar = this.f376959a.f376974e;
        cVar.f379734a.set(Optional.m71637of(C37182a.f97861bn));
        C37258g gVar = C37182a.f97861bn;
        C69664n.m101060f(gVar, "GOOGLEAPP_SEARCH_BOX_SUGGEST_MIC_TAP");
        cVar.mo115177d(gVar);
        C47393f.m84237h(C138794e.f377547a, this.f376960b);
    }
}
