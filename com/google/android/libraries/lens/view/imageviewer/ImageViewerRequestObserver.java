package com.google.android.libraries.lens.view.imageviewer;

import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
public final class ImageViewerRequestObserver implements C43773b {

    /* renamed from: a */
    public static final C58974d f73428a = C58974d.m91135i("IVObserver");

    /* renamed from: b */
    public final C43861g f73429b;

    /* renamed from: c */
    private final RequestBlockMixin f73430c;

    public ImageViewerRequestObserver(RequestBlockMixin requestBlockMixin, C43861g gVar) {
        this.f73430c = requestBlockMixin;
        this.f73429b = gVar;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        RequestBlockMixin requestBlockMixin = this.f73430c;
        requestBlockMixin.mo46747b(R.id.request_allow_image_viewer_request, C26950m.f73459a);
        requestBlockMixin.mo46749d(R.id.request_block_all, new C26949l(this));
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
