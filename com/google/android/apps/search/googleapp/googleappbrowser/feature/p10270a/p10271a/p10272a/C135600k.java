package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.p10272a;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.libraries.lens.sdk.avs.data.C24877l;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.k */
/* compiled from: PG */
final class C135600k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f369354a;

    /* renamed from: b */
    final /* synthetic */ C135603n f369355b;

    public C135600k(C135603n nVar, ImageView imageView) {
        this.f369355b = nVar;
        this.f369354a = imageView;
    }

    public final void onGlobalLayout() {
        this.f369354a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C135604o oVar = this.f369355b.f369375j;
        oVar.getClass();
        C24877l lVar = oVar.f369381b;
        lVar.getClass();
        if (lVar.f67960a.containsKey("bounding_boxes")) {
            C135603n nVar = this.f369355b;
            C135593d dVar = nVar.f369376k;
            dVar.getClass();
            Bitmap bitmap = nVar.f369372g;
            bitmap.getClass();
            C135604o oVar2 = nVar.f369375j;
            oVar2.getClass();
            C24877l lVar2 = oVar2.f369381b;
            lVar2.getClass();
            dVar.mo112401b(bitmap, lVar2);
        }
    }
}
