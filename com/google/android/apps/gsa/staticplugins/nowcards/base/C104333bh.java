package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.bh */
/* compiled from: PG */
public final class C104333bh {

    /* renamed from: a */
    public static final Rect f290263a = new Rect();

    /* renamed from: b */
    public final Paint f290264b;

    /* renamed from: c */
    public final Context f290265c;

    public C104333bh(Context context) {
        this.f290265c = context;
        Paint paint = new Paint();
        this.f290264b = paint;
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.create("sans-serif-medium", 0));
    }
}
