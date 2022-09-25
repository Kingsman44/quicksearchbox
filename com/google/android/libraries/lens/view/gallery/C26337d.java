package com.google.android.libraries.lens.view.gallery;

import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2074ap.C25464d;

/* renamed from: com.google.android.libraries.lens.view.gallery.d */
/* compiled from: PG */
public final /* synthetic */ class C26337d implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26420g f71595a;

    public /* synthetic */ C26337d(C26420g gVar) {
        this.f71595a = gVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26420g gVar = this.f71595a;
        ((GalleryRecyclerView) gVar.f71898c.requireView()).setPadding(0, gVar.f71898c.getResources().getDimensionPixelSize(R.dimen.lens_gallery_expanded_top_padding) + ((C25464d) obj).mo30499a(), 0, 0);
    }
}
