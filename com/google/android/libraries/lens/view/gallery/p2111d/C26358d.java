package com.google.android.libraries.lens.view.gallery.p2111d;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.carousel.C25946b;
import com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.logging.p2185ve.C28306ab;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.d */
/* compiled from: PG */
public final class C26358d extends C0673gh implements C26355aq {

    /* renamed from: e */
    public static final /* synthetic */ int f71652e = 0;

    /* renamed from: a */
    public final C25989d f71653a;

    /* renamed from: b */
    public final C25946b f71654b;

    /* renamed from: c */
    public final C26354ap f71655c;

    /* renamed from: d */
    public FilterCarouselView f71656d;

    public C26358d(C25989d dVar, C25946b bVar, ViewGroup viewGroup, C26354ap apVar) {
        super(apVar.mo31549a(R.layout.lens_gallery_camera, viewGroup));
        this.f71653a = dVar;
        this.f71654b = bVar;
        this.f71655c = apVar;
    }

    /* renamed from: a */
    public final void mo31534a() {
        this.itemView.setOnClickListener((View.OnClickListener) null);
        FilterCarouselView filterCarouselView = this.f71656d;
        if (filterCarouselView != null) {
            filterCarouselView.mo17754z().f70552e.setAdapter((C0640fb) null);
            C28306ab.m52929e(filterCarouselView);
            ((ViewGroup) this.itemView).removeView(filterCarouselView);
        }
        this.f71656d = null;
        C28306ab.m52929e(this.itemView);
    }
}
