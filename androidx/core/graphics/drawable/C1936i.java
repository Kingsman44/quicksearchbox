package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: androidx.core.graphics.drawable.i */
/* compiled from: PG */
public final class C1936i extends C1937j {
    public C1936i(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* renamed from: a */
    public final void mo5080a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    public final void getOutline(Outline outline) {
        mo5082b();
        outline.setRoundRect(this.f5840e, this.f5839d);
    }
}
