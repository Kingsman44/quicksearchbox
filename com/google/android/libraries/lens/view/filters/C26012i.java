package com.google.android.libraries.lens.view.filters;

import com.google.android.libraries.lens.view.filters.carousel.C25943a;
import com.google.android.libraries.lens.view.filters.carousel.C25946b;
import com.google.android.libraries.lens.view.filters.carousel.C25950f;
import com.google.android.libraries.lens.view.filters.carousel.C25960p;
import com.google.android.libraries.lens.view.filters.carousel.C25961q;
import com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView;
import com.google.android.libraries.lens.view.filters.carousel.FilterTooltip;
import com.google.android.libraries.lens.view.filters.p2101e.C25987b;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.C25994i;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.onboarding.C27481an;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.filters.i */
/* compiled from: PG */
public final class C26012i {

    /* renamed from: r */
    public static final /* synthetic */ int f70675r = 0;

    /* renamed from: a */
    public final C26017n f70676a;

    /* renamed from: b */
    public final C25989d f70677b;

    /* renamed from: c */
    public final C25987b f70678c;

    /* renamed from: d */
    public final C25935c f70679d;

    /* renamed from: e */
    public final C28443m f70680e;

    /* renamed from: f */
    public final C28306ab f70681f;

    /* renamed from: g */
    public final C27481an f70682g;

    /* renamed from: h */
    public final C28310af f70683h;

    /* renamed from: i */
    public final C25752a f70684i;

    /* renamed from: j */
    public final C24974a f70685j;

    /* renamed from: k */
    public final C25946b f70686k;

    /* renamed from: l */
    public FilterCarouselView f70687l;

    /* renamed from: m */
    public final C25950f f70688m = new C26006g(this);

    /* renamed from: n */
    public C25943a f70689n;

    /* renamed from: o */
    public C25922ba f70690o;

    /* renamed from: p */
    final C25960p f70691p = new C26008h(this);

    /* renamed from: q */
    public boolean f70692q;

    static {
        C58974d.m91135i("FilterCarouselFragment");
    }

    public C26012i(C26017n nVar, C25989d dVar, C25987b bVar, C25935c cVar, C28443m mVar, C28306ab abVar, C28310af afVar, C25752a aVar, C27481an anVar, C24974a aVar2, C25946b bVar2) {
        this.f70676a = nVar;
        this.f70677b = dVar;
        this.f70678c = bVar;
        this.f70679d = cVar;
        this.f70680e = mVar;
        this.f70681f = abVar;
        this.f70683h = afVar;
        this.f70684i = aVar;
        this.f70682g = anVar;
        this.f70685j = aVar2;
        this.f70686k = bVar2;
    }

    /* renamed from: a */
    public final float mo31215a() {
        return this.f70692q ? 0.0f : 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo31216b() {
        FilterTooltip filterTooltip = this.f70687l.mo17754z().f70551d;
        if (filterTooltip != null) {
            filterTooltip.mo17754z().mo31160a();
        }
    }

    /* renamed from: c */
    public final void mo31217c(boolean z) {
        if (z) {
            C25961q a = this.f70687l.mo17754z();
            C25994i iVar = this.f70677b.f70642a;
            a.mo31147i(iVar.mo31208a(iVar.f70649b));
            return;
        }
        C25961q a2 = this.f70687l.mo17754z();
        C25994i iVar2 = this.f70677b.f70642a;
        a2.mo31146h(iVar2.mo31208a(iVar2.f70649b));
    }

    /* renamed from: d */
    public final void mo31218d() {
        this.f70689n.notifyItemChanged(this.f70677b.f70642a.mo31208a(C25980d.TRANSLATE));
    }

    /* renamed from: e */
    public final void mo31219e() {
        float a = mo31215a();
        FilterCarouselView filterCarouselView = this.f70687l;
        filterCarouselView.getClass();
        filterCarouselView.setAlpha(a);
        FilterCarouselView filterCarouselView2 = this.f70687l;
        filterCarouselView2.getClass();
        filterCarouselView2.setVisibility(a == 0.0f ? 4 : 0);
    }
}
