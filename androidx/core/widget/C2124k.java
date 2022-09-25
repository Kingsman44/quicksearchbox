package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.k */
/* compiled from: PG */
public final class C2124k {
    /* renamed from: a */
    public static ColorStateList m5890a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    /* renamed from: b */
    public static PorterDuff.Mode m5891b(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* renamed from: c */
    public static void m5892c(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* renamed from: d */
    public static void m5893d(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
