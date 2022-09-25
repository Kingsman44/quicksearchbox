package com.google.android.libraries.lens.view.session;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.session.ba */
/* compiled from: PG */
public final /* synthetic */ class C27765ba implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C27766bb f75779a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f75780b;

    /* renamed from: c */
    public final /* synthetic */ RectF f75781c;

    public /* synthetic */ C27765ba(C27766bb bbVar, Bitmap bitmap, RectF rectF) {
        this.f75779a = bbVar;
        this.f75780b = bitmap;
        this.f75781c = rectF;
    }

    public final void run() {
        C27766bb bbVar = this.f75779a;
        Bitmap bitmap = this.f75780b;
        RectF rectF = this.f75781c;
        Size size = new Size(bitmap.getWidth(), bitmap.getHeight());
        Size size2 = new Size(Math.round(((float) size.getWidth()) * rectF.width()), Math.round(((float) size.getHeight()) * rectF.height()));
        int round = Math.round(((float) size.getWidth()) * rectF.left);
        int round2 = Math.round(((float) size.getHeight()) * rectF.top);
        bbVar.f75782a.mo5706i(C58833ax.m90834k(Bitmap.createBitmap(bitmap, round, round2, Math.min(size2.getWidth(), size.getWidth() - round), Math.min(size2.getHeight(), size.getHeight() - round2))));
    }
}
