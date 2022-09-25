package com.google.android.libraries.lens.view.gallery;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.carousel.C25960p;
import com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25981e;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59918c;
import com.google.common.p4552o.p4563i.C59961k;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;

/* renamed from: com.google.android.libraries.lens.view.gallery.y */
/* compiled from: PG */
final class C26438y implements C25960p {

    /* renamed from: a */
    final /* synthetic */ C26299ac f71931a;

    public C26438y(C26299ac acVar) {
        this.f71931a = acVar;
    }

    /* renamed from: a */
    public final void mo31136a() {
        this.f71931a.f71471C.f71455a = true;
    }

    /* renamed from: b */
    public final void mo31137b() {
        this.f71931a.f71471C.f71455a = false;
    }

    /* renamed from: c */
    public final void mo31138c(int i, boolean z) {
        C25981e b = this.f71931a.f71510r.f70642a.mo31209b(i);
        if (!z && this.f71931a.f71510r.f70642a.f70649b != b.mo31185d()) {
            C26299ac acVar = this.f71931a;
            View findViewByPosition = ((FilterCarouselView) acVar.f71495c.requireView().findViewById(R.id.filter_carousel_view)).mo17754z().mo31143e().findViewByPosition(acVar.f71510r.f70642a.mo31208a(b.mo31185d()));
            if (findViewByPosition != null) {
                C28443m mVar = acVar.f71498f;
                C28440j h = C28442l.m53142h();
                C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
                C59918c cVar = (C59918c) C59961k.f162053f.createBuilder();
                C56306df b2 = b.mo31185d().mo31199b();
                cVar.copyOnWrite();
                C59961k kVar = (C59961k) cVar.instance;
                kVar.f162058d = b2.f150068m;
                kVar.f162055a |= 1;
                C59961k kVar2 = (C59961k) cVar.build();
                bhVar.copyOnWrite();
                C59900bi biVar = (C59900bi) bhVar.instance;
                kVar2.getClass();
                biVar.f161894b = kVar2;
                biVar.f161893a |= 2;
                h.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
                mVar.mo33853c(h.mo33894a(), C28485y.m53234a(findViewByPosition));
            }
            this.f71931a.f71510r.mo31205d(b.mo31185d());
            this.f71931a.f71512t.mo31110c(b);
            this.f71931a.mo31510j();
        }
    }
}
