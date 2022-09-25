package com.google.android.libraries.elements.p1728g;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.p287f.p288a.C5561c;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.p1707b.C20696c;
import com.google.android.libraries.elements.p1714d.C20818bb;

/* renamed from: com.google.android.libraries.elements.g.c */
/* compiled from: PG */
public final class C21175c extends C5561c {

    /* renamed from: a */
    private final ImageProxy f59396a;

    /* renamed from: b */
    private final ImageView.ScaleType f59397b;

    /* renamed from: d */
    private final C21259bb f59398d;

    /* renamed from: e */
    private final C20818bb f59399e;

    public C21175c(ImageProxy imageProxy, C20818bb bbVar, int i, int i2, ImageView.ScaleType scaleType, C21259bb bbVar2) {
        super(i, i2);
        this.f59396a = imageProxy;
        this.f59399e = bbVar;
        this.f59397b = scaleType;
        this.f59398d = bbVar2;
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
        if (drawable != null) {
            C20818bb bbVar = this.f59399e;
            bbVar.f58300a = drawable;
            bbVar.invalidateSelf();
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof BitmapDrawable) {
            ImageView.ScaleType scaleType = this.f59397b;
            if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            drawable = new C20696c(((BitmapDrawable) drawable).getBitmap(), scaleType, this.f59398d);
        }
        C21195w.m39832e(drawable, this.f59396a);
        C20818bb bbVar = this.f59399e;
        bbVar.f58300a = drawable;
        bbVar.invalidateSelf();
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
        if (drawable != null) {
            C20818bb bbVar = this.f59399e;
            bbVar.f58300a = drawable;
            bbVar.invalidateSelf();
        }
    }
}
