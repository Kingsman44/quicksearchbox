package androidx.core.p098j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* renamed from: androidx.core.j.ah */
/* compiled from: PG */
final class C2014ah {
    /* renamed from: a */
    static PointerIcon m5363a(Bitmap bitmap, float f, float f2) {
        return PointerIcon.create(bitmap, f, f2);
    }

    /* renamed from: b */
    static PointerIcon m5364b(Context context, int i) {
        return PointerIcon.getSystemIcon(context, i);
    }

    /* renamed from: c */
    static PointerIcon m5365c(Resources resources, int i) {
        return PointerIcon.load(resources, i);
    }
}
