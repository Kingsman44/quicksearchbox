package androidx.slice.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import java.util.Calendar;

/* renamed from: androidx.slice.widget.av */
/* compiled from: PG */
public final class C4144av {
    /* renamed from: a */
    public static int m11881a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* renamed from: b */
    public static Bitmap m11882b(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle((float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2), (float) (bitmap.getWidth() / 2), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: c */
    public static Drawable m11883c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: d */
    public static CharSequence m11884d(Context context, long j) {
        if (j >= System.currentTimeMillis() && !DateUtils.isToday(j)) {
            return DateUtils.formatDateTime(context, j, 8);
        }
        return DateUtils.getRelativeTimeSpanString(j, Calendar.getInstance().getTimeInMillis(), 60000, C89885b.HTTP_VALUE);
    }

    /* renamed from: e */
    public static void m11885e(Context context, ProgressBar progressBar) {
        int a = m11881a(context, R.attr.colorControlHighlight);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable != null && a != 0) {
            indeterminateDrawable.setColorFilter(a, PorterDuff.Mode.MULTIPLY);
            progressBar.setProgressDrawable(indeterminateDrawable);
        }
    }
}
