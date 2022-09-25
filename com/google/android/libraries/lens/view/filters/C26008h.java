package com.google.android.libraries.lens.view.filters;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.p091b.C1874w;
import com.google.android.libraries.lens.view.filters.carousel.C25960p;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25981e;
import com.google.android.libraries.lens.view.main.C27342ce;
import com.google.android.libraries.lens.view.main.C27383ds;
import com.google.android.libraries.lens.view.main.C27384dt;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59918c;
import com.google.common.p4552o.p4563i.C59961k;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;

/* renamed from: com.google.android.libraries.lens.view.filters.h */
/* compiled from: PG */
final class C26008h implements C25960p {

    /* renamed from: a */
    final /* synthetic */ C26012i f70672a;

    public C26008h(C26012i iVar) {
        this.f70672a = iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo31136a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo31137b() {
    }

    /* renamed from: c */
    public final void mo31138c(int i, boolean z) {
        C25935c cVar;
        int i2 = C26012i.f70675r;
        C26012i iVar = this.f70672a;
        C25989d dVar = iVar.f70677b;
        if (dVar != null && (cVar = iVar.f70679d) != null && cVar.isAdded()) {
            C25981e b = dVar.f70642a.mo31209b(i);
            boolean z2 = true;
            if (!z && this.f70672a.f70677b.f70642a.f70649b != b.mo31185d()) {
                View view = this.f70672a.f70679d.getView();
                if (view != null) {
                    view.performHapticFeedback(3);
                }
                C26012i iVar2 = this.f70672a;
                View findViewByPosition = iVar2.f70687l.mo17754z().mo31143e().findViewByPosition(iVar2.f70677b.f70642a.mo31208a(b.mo31185d()));
                if (findViewByPosition != null) {
                    C28443m mVar = iVar2.f70680e;
                    C28440j h = C28442l.m53142h();
                    C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
                    C59918c cVar2 = (C59918c) C59961k.f162053f.createBuilder();
                    C56306df b2 = b.mo31185d().mo31199b();
                    cVar2.copyOnWrite();
                    C59961k kVar = (C59961k) cVar2.instance;
                    kVar.f162058d = b2.f150068m;
                    kVar.f162055a |= 1;
                    C59961k kVar2 = (C59961k) cVar2.build();
                    bhVar.copyOnWrite();
                    C59900bi biVar = (C59900bi) bhVar.instance;
                    kVar2.getClass();
                    biVar.f161894b = kVar2;
                    biVar.f161893a |= 2;
                    h.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
                    mVar.mo33853c(h.mo33894a(), C28485y.m53234a(findViewByPosition));
                }
                if (b.mo31185d().equals(C25980d.TRANSLATE)) {
                    this.f70672a.mo31218d();
                }
            }
            C25922ba baVar = this.f70672a.f70690o;
            if (baVar != null) {
                if (z) {
                    ((C26022s) baVar).mo31231l(b);
                } else {
                    C26022s sVar = (C26022s) baVar;
                    if (sVar.f70713b.f70642a.f70649b != b.mo31185d()) {
                        sVar.mo31227h(b);
                        C27383ds dsVar = sVar.f70730s;
                        if (dsVar != null) {
                            C26234v vVar = dsVar.f74876a.f74924aT;
                            vVar.getClass();
                            C26236x a = vVar.mo17754z();
                            C25497ac acVar = dsVar.f74876a.f74957ba;
                            if (acVar == null) {
                                acVar = C25497ac.NONE;
                            }
                            a.mo31451a(acVar, b);
                            dsVar.f74876a.mo32940ab();
                        }
                    }
                }
                C25922ba baVar2 = ((C26022s) baVar).f70729r;
                if (baVar2 != null) {
                    C25901ah ahVar = ((C27342ce) baVar2).f74834a;
                    C59071e eVar = C27384dt.f74877a;
                    C25909ap a2 = ahVar.mo17754z();
                    if (z) {
                        C25928bg bgVar = a2.f70394m;
                        bgVar.mo31081a();
                        bgVar.mo31086f();
                        return;
                    }
                    a2.f70394m.mo31083c();
                    C25981e a3 = a2.f70384c.mo31203a();
                    C25916aw a4 = a2.f70395n.mo17754z();
                    Drawable f = C1874w.m5109f(a4.f70411c.getResources(), a3.mo31184c(), (Resources.Theme) null);
                    f.getClass();
                    a4.f70411c.setImageDrawable(f);
                    C25928bg bgVar2 = a2.f70394m;
                    if (a3.mo31185d() != C25980d.AUTO_FILTER) {
                        z2 = false;
                    }
                    bgVar2.f70434e = z2;
                    bgVar2.mo31083c();
                }
            }
        }
    }
}
