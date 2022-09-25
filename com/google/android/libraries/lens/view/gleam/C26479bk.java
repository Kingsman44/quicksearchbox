package com.google.android.libraries.lens.view.gleam;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;

/* renamed from: com.google.android.libraries.lens.view.gleam.bk */
/* compiled from: PG */
final class C26479bk {

    /* renamed from: a */
    public final Region f72128a;

    /* renamed from: b */
    private final Region f72129b = new Region();

    public C26479bk(Path path, RectF rectF) {
        Region region = new Region();
        this.f72128a = region;
        region.setPath(path, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        new PointF((rectF.left + rectF.right) / 2.0f, (rectF.bottom + rectF.top) / 2.0f);
    }
}
