package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.p287f.p288a.C5570l;
import com.bumptech.glide.p287f.p289b.C5582f;

/* renamed from: com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.g */
/* compiled from: PG */
final class C42030g extends C5570l {

    /* renamed from: a */
    final /* synthetic */ C42031h f109808a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42030g(C42031h hVar, int i, int i2) {
        super(i, i2);
        this.f109808a = hVar;
    }

    /* renamed from: i */
    private final void m73596i() {
        C42031h hVar = this.f109808a;
        hVar.f109815g = null;
        hVar.f109812d.setShader((Shader) null);
        C42028e eVar = this.f109808a.f109820l;
        if (eVar != null) {
            eVar.f109803a.invalidate();
        }
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
        m73596i();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        C42031h hVar = this.f109808a;
        hVar.f109815g = (Bitmap) obj;
        BitmapShader bitmapShader = (BitmapShader) hVar.f109812d.getShader();
        if (bitmapShader == null) {
            BitmapShader bitmapShader2 = new BitmapShader(hVar.f109815g, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
            bitmapShader2.setLocalMatrix(hVar.mo44514a((float) hVar.f109810b, (float) hVar.f109811c, (float) hVar.f109815g.getWidth(), (float) hVar.f109815g.getHeight(), 0));
            hVar.f109812d.setShader(bitmapShader2);
        } else {
            bitmapShader.setLocalMatrix(hVar.mo44514a((float) hVar.f109810b, (float) hVar.f109811c, (float) hVar.f109815g.getWidth(), (float) hVar.f109815g.getHeight(), 0));
        }
        C42028e eVar = hVar.f109820l;
        if (eVar != null) {
            eVar.f109803a.invalidate();
        }
    }

    /* renamed from: f */
    public final void mo11991f(Drawable drawable) {
        m73596i();
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
        m73596i();
    }
}
