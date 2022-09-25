package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.an.b.l */
/* compiled from: PG */
public final /* synthetic */ class C25414l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f69257a;

    /* renamed from: b */
    public final /* synthetic */ Rect f69258b;

    public /* synthetic */ C25414l(Bitmap bitmap, Rect rect) {
        this.f69257a = bitmap;
        this.f69258b = rect;
    }

    public final Object call() {
        Bitmap bitmap = this.f69257a;
        Rect rect = this.f69258b;
        return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
    }
}
