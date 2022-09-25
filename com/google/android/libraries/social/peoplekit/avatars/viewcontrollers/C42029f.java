package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.p287f.p288a.C5570l;
import com.bumptech.glide.p287f.p289b.C5582f;

/* renamed from: com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.f */
/* compiled from: PG */
final class C42029f extends C5570l {

    /* renamed from: a */
    final /* synthetic */ int f109804a;

    /* renamed from: b */
    final /* synthetic */ int f109805b;

    /* renamed from: c */
    final /* synthetic */ int f109806c;

    /* renamed from: d */
    final /* synthetic */ C42031h f109807d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42029f(C42031h hVar, int i, int i2, int i3, int i4, int i5) {
        super(i, i2);
        this.f109807d = hVar;
        this.f109804a = i3;
        this.f109805b = i4;
        this.f109806c = i5;
    }

    /* renamed from: i */
    private final void m73591i() {
        C42031h hVar = this.f109807d;
        Bitmap[] bitmapArr = hVar.f109818j;
        int i = this.f109804a;
        bitmapArr[i] = null;
        hVar.f109817i[i].setShader((Shader) null);
        C42028e eVar = this.f109807d.f109820l;
        if (eVar != null) {
            eVar.f109803a.invalidate();
        }
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
        m73591i();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        C42031h hVar = this.f109807d;
        Bitmap[] bitmapArr = hVar.f109818j;
        int i = this.f109804a;
        bitmapArr[i] = (Bitmap) obj;
        hVar.mo44516c(this.f109805b, this.f109806c, i);
    }

    /* renamed from: f */
    public final void mo11991f(Drawable drawable) {
        m73591i();
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
        m73591i();
    }
}
