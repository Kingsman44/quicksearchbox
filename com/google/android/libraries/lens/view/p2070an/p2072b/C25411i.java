package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Size;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.an.b.i */
/* compiled from: PG */
abstract class C25411i {
    /* renamed from: h */
    public static C25409g m46824h() {
        C25390a aVar = new C25390a();
        aVar.mo30431d(-1);
        return aVar;
    }

    /* renamed from: a */
    public abstract int mo30448a();

    /* renamed from: b */
    public abstract Bitmap mo30449b();

    /* renamed from: c */
    public abstract Rect mo30450c();

    /* renamed from: d */
    public abstract C58833ax mo30451d();

    /* renamed from: e */
    public abstract C58833ax mo30452e();

    /* renamed from: f */
    public abstract C58833ax mo30454f();

    /* renamed from: g */
    public final Size mo30467g() {
        return new Size(mo30450c().width(), mo30450c().height());
    }
}
