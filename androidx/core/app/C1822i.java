package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;

/* renamed from: androidx.core.app.i */
/* compiled from: PG */
final class C1822i {
    /* renamed from: a */
    static ActivityOptions m4993a(Context context, int i, int i2) {
        return ActivityOptions.makeCustomAnimation(context, i, i2);
    }

    /* renamed from: b */
    static ActivityOptions m4994b(View view, int i, int i2, int i3, int i4) {
        return ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
    }

    /* renamed from: c */
    static ActivityOptions m4995c(View view, Bitmap bitmap, int i, int i2) {
        return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
    }
}
