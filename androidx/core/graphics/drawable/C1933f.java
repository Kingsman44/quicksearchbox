package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* renamed from: androidx.core.graphics.drawable.f */
/* compiled from: PG */
final class C1933f {
    /* renamed from: a */
    static Drawable m5237a(Drawable drawable, Drawable drawable2) {
        return new AdaptiveIconDrawable(drawable, drawable2);
    }

    /* renamed from: b */
    static Icon m5238b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }
}
