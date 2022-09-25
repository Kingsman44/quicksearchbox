package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.LinearLayoutManager;
import com.bumptech.glide.p287f.p288a.C5561c;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.google.android.material.chip.Chip;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.ae */
/* compiled from: PG */
final class C135807ae extends C5561c {

    /* renamed from: a */
    final /* synthetic */ C135808af f369911a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135807ae(C135808af afVar) {
        super(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        this.f369911a = afVar;
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        Chip chip = (Chip) this.f369911a.f369914c.requireView();
        chip.mo47694q(new BitmapDrawable(chip.getResources(), (Bitmap) obj));
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
    }
}
