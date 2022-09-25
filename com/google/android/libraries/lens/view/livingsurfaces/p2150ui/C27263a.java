package com.google.android.libraries.lens.view.livingsurfaces.p2150ui;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p287f.p288a.C5564f;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.ui.a */
/* compiled from: PG */
final class C27263a extends C5564f {

    /* renamed from: b */
    final /* synthetic */ String f74571b;

    /* renamed from: c */
    final /* synthetic */ C27264b f74572c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27263a(C27264b bVar, PlanarGleamAttributionView planarGleamAttributionView, String str) {
        super(planarGleamAttributionView);
        this.f74572c = bVar;
        this.f74571b = str;
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
        ((C59052c) ((C59052c) C27264b.f74573a.mo56226d()).mo56372aa(49647)).mo56389s("Failed to load icon image %s", this.f74571b);
        ((PlanarGleamAttributionView) this.f16849a).mo28945lq(this.f74572c.f74574b);
        this.f74572c.mo32793b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11860b(Drawable drawable) {
        ((PlanarGleamAttributionView) this.f16849a).mo28945lq(drawable);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        ((PlanarGleamAttributionView) this.f16849a).mo28945lq((Drawable) obj);
        this.f74572c.mo32793b();
    }
}
