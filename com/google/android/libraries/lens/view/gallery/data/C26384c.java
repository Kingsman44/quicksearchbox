package com.google.android.libraries.lens.view.gallery.data;

import com.google.apps.tiktok.dataservice.C46783d;
import com.google.apps.tiktok.tracing.C47770dh;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.c */
/* compiled from: PG */
final class C26384c extends C46783d {

    /* renamed from: a */
    final /* synthetic */ GalleryContentObserver f71790a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26384c(GalleryContentObserver galleryContentObserver, C47770dh dhVar, Executor executor) {
        super(dhVar, "gallery update", executor);
        this.f71790a = galleryContentObserver;
    }

    /* renamed from: a */
    public final void mo21781a(boolean z) {
        this.f71790a.mo31576b();
    }
}
