package com.google.android.libraries.lens.view.gallery;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.libraries.lens.view.gallery.data.C26398q;
import com.google.android.libraries.lens.view.gallery.p2111d.C26369o;
import com.google.android.libraries.lens.view.gallery.p2112e.C26415h;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.libraries.lens.view.gallery.ag */
/* compiled from: PG */
final class C26306ag implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C26299ac f71523a;

    public C26306ag(C26299ac acVar) {
        this.f71523a = acVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        Bitmap bitmap;
        C26369o oVar = (C26369o) bVar;
        C26299ac acVar = this.f71523a;
        C26398q qVar = acVar.f71485Q;
        Uri withAppendedId = ContentUris.withAppendedId(qVar.f71821e, oVar.f71725a.mo31586b());
        ImageView imageView = oVar.f71726b;
        C26415h hVar = null;
        if ((imageView.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap()) != null) {
            hVar = new C26415h(imageView, bitmap);
        }
        acVar.mo31504d();
        acVar.mo31508h(false);
        return C47392e.m84229a(new C26314ao(withAppendedId, oVar.f71725a.mo31588d(), hVar));
    }
}
