package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102288a;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102291d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65949b;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.t */
/* compiled from: PG */
public final class C102378t extends C22939d {

    /* renamed from: a */
    public ImageViewerPage f285699a;

    /* renamed from: b */
    public final C102291d f285700b;

    /* renamed from: c */
    public final C21370a f285701c;

    /* renamed from: d */
    public final C102288a f285702d;

    /* renamed from: e */
    public final C91189au f285703e;

    /* renamed from: f */
    public final C22871g f285704f;

    /* renamed from: g */
    public C102360cf f285705g;

    /* renamed from: h */
    public C102374p f285706h;

    /* renamed from: i */
    public int f285707i = -1;

    /* renamed from: j */
    private final Context f285708j;

    public C102378t(C22945j jVar, C102288a aVar, C102291d dVar, Context context, C21370a aVar2, C91189au auVar, C22871g gVar, C102360cf cfVar) {
        super(jVar);
        this.f285700b = dVar;
        this.f285701c = aVar2;
        this.f285708j = context;
        this.f285702d = aVar;
        this.f285703e = auVar;
        this.f285704f = gVar;
        this.f285705g = cfVar;
    }

    /* renamed from: e */
    public final void mo93177e() {
        if (this.f285706h != null && ((Boolean) ((C102339bl) this.f285700b).f285609b.f63720e).booleanValue()) {
            RelatedContentHeader relatedContentHeader = this.f285699a.f285459f;
            relatedContentHeader.animate().alpha(0.0f).setDuration(200).withEndAction(new C102336bi(relatedContentHeader));
        }
    }

    /* renamed from: f */
    public final void mo93178f() {
        C65949b bVar = (C65949b) ((C102339bl) this.f285700b).f285610c.f63720e;
        if (this.f285706h != null && !bVar.equals(C65949b.f179368e)) {
            ImageViewerPage imageViewerPage = this.f285699a;
            imageViewerPage.f285472s = bVar;
            if (imageViewerPage.getWidth() != 0) {
                ((C102384z) imageViewerPage.f285473t).f285721a.mo93074e();
            } else {
                imageViewerPage.getViewTreeObserver().addOnGlobalLayoutListener(new C102311ak(imageViewerPage));
            }
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ImageViewerPage imageViewerPage = (ImageViewerPage) LayoutInflater.from(this.f285708j).inflate(R.layout.monet_viewer_page, (ViewGroup) null, false);
        this.f285699a = imageViewerPage;
        mo28295iC(imageViewerPage);
        ((C102339bl) this.f285700b).f285608a.mo28726b(new C102375q(this));
        ((C102339bl) this.f285700b).f285609b.mo28726b(new C102376r(this));
        ((C102339bl) this.f285700b).f285610c.mo28726b(new C102377s(this));
    }
}
