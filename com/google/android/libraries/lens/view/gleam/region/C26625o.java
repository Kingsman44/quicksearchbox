package com.google.android.libraries.lens.view.gleam.region;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25518ax;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.gleam.region.o */
/* compiled from: PG */
public final class C26625o {

    /* renamed from: a */
    private static final RectF f72608a = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: a */
    public static RectF m49191a(RectF rectF, Size size, C58833ax axVar) {
        RectF rectF2 = new RectF(rectF.left / ((float) size.getWidth()), rectF.top / ((float) size.getHeight()), rectF.right / ((float) size.getWidth()), rectF.bottom / ((float) size.getHeight()));
        RectF rectF3 = new RectF(rectF2);
        if (axVar.mo56113h()) {
            C25518ax axVar2 = (C25518ax) axVar.mo56107c();
            rectF3 = new RectF((((rectF2.left - 8.0f) - axVar2.f69479a.x) / axVar2.f69480b) + 0.5f, (((rectF2.top - 8.0f) - axVar2.f69479a.y) / axVar2.f69480b) + 0.5f, (((rectF2.right - 8.0f) - axVar2.f69479a.x) / axVar2.f69480b) + 0.5f, (((rectF2.bottom - 8.0f) - axVar2.f69479a.y) / axVar2.f69480b) + 0.5f);
        }
        rectF3.intersect(f72608a);
        return rectF3;
    }

    /* renamed from: b */
    public static RectF m49192b(PointF pointF, Size size, Context context) {
        float dimensionPixelSize = ((float) context.getResources().getDimensionPixelSize(R.dimen.region_default_size)) / 2.0f;
        float width = dimensionPixelSize / ((float) size.getWidth());
        float height = dimensionPixelSize / ((float) size.getHeight());
        return new RectF(pointF.x - width, pointF.y - height, pointF.x + width, pointF.y + height);
    }
}
