package com.google.android.apps.search.podcasts.widgets.thumbnail;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5588e;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.thumbnail.c */
/* compiled from: PG */
public final class C141282c implements C5592i {

    /* renamed from: a */
    final /* synthetic */ ThumbnailView f383572a;

    public C141282c(ThumbnailView thumbnailView) {
        this.f383572a = thumbnailView;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        C69664n.m101061g(obj, "model");
        C69664n.m101061g(nVar, "target");
        C5588e d = nVar.mo11990d();
        if (d == null || !d.mo12022j()) {
            ThumbnailView thumbnailView = this.f383572a;
            String str = thumbnailView.f383559b;
            if (str != null) {
                thumbnailView.mo116306c(str);
            }
            this.f383572a.f383560c.setVisibility(8);
        }
        C59052c cVar = (C59052c) ThumbnailView.f383558a.mo56224b();
        cVar.mo56379ah(new C59094n(41660));
        cVar.mo56389s("Error loading thumbnail image:", apVar);
        return false;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        C69664n.m101061g(obj2, "model");
        C69664n.m101061g(nVar, "target");
        C69664n.m101061g(aVar, "dataSource");
        this.f383572a.f383560c.setVisibility(0);
        return false;
    }
}
