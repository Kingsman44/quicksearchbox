package androidx.core.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;

/* renamed from: androidx.core.graphics.drawable.a */
/* compiled from: PG */
public final class C1928a {
    /* renamed from: a */
    public static int m5215a(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* renamed from: b */
    static Drawable m5216b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }

    /* renamed from: c */
    static Drawable m5217c(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    /* renamed from: d */
    public static void m5218d(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    /* renamed from: e */
    public static boolean m5219e(Drawable drawable) {
        return drawable.isAutoMirrored();
    }
}
