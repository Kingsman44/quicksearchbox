package androidx.mediarouter.app;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.mediarouter.app.ag */
/* compiled from: PG */
final class C3761ag {
    /* renamed from: a */
    public static int m10919a(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i < i2 ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        if (typedValue.type == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (typedValue.type != 6) {
            return -2;
        } else {
            fraction = typedValue.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
        }
        return (int) fraction;
    }
}
