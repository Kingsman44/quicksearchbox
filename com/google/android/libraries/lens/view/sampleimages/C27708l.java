package com.google.android.libraries.lens.view.sampleimages;

import android.graphics.Bitmap;
import android.view.View;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.libraries.lens.view.sampleimages.l */
/* compiled from: PG */
public final /* synthetic */ class C27708l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f75653a;

    /* renamed from: b */
    public final /* synthetic */ C27698b f75654b;

    public /* synthetic */ C27708l(Bitmap bitmap, C27698b bVar) {
        this.f75653a = bitmap;
        this.f75654b = bVar;
    }

    public final void onClick(View view) {
        Bitmap bitmap = this.f75653a;
        C47393f.m84237h(new C27697a(bitmap.copy(bitmap.getConfig(), false), this.f75654b), view);
    }
}
