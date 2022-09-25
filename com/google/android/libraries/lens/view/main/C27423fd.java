package com.google.android.libraries.lens.view.main;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.google.android.libraries.lens.p2014e.C24227s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.main.fd */
/* compiled from: PG */
public abstract class C27423fd {
    /* renamed from: c */
    public static C27423fd m51093c(Bitmap bitmap, RectF rectF) {
        if (rectF != null) {
            RectF rectF2 = new RectF(rectF);
            rectF2.intersect(C24227s.f66272a);
            rectF = rectF2;
        }
        return new C27310b(bitmap, C58833ax.m90833j(rectF));
    }

    /* renamed from: a */
    public abstract Bitmap mo32854a();

    /* renamed from: b */
    public abstract C58833ax mo32855b();
}
