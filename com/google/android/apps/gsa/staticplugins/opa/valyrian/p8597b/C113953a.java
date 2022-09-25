package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C1936i;
import com.google.android.libraries.gsa.p1876k.C22868d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.b.a */
/* compiled from: PG */
final class C113953a implements C22868d {

    /* renamed from: a */
    final /* synthetic */ ImageView f315579a;

    /* renamed from: b */
    final /* synthetic */ C113954b f315580b;

    public C113953a(C113954b bVar, ImageView imageView) {
        this.f315580b = bVar;
        this.f315579a = imageView;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        this.f315580b.mo100816b(this.f315579a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C113954b bVar = this.f315580b;
            ImageView imageView = this.f315579a;
            C1936i iVar = new C1936i(bVar.f315581a.getResources(), bitmap);
            iVar.mo5083d();
            imageView.setImageDrawable(iVar);
            imageView.setBackgroundColor(0);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return;
        }
        this.f315580b.mo100816b(this.f315579a);
    }
}
