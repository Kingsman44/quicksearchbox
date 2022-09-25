package com.google.android.libraries.lens.view.textoverlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.p1998a.C24096d;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.ab */
/* compiled from: PG */
final class C28067ab extends Drawable {

    /* renamed from: a */
    public final C24096d f76386a;

    /* renamed from: b */
    public C58485gu f76387b = C58485gu.m89845m();

    /* renamed from: c */
    public Path f76388c;

    /* renamed from: d */
    private final Paint f76389d;

    /* renamed from: e */
    private final Paint f76390e;

    public C28067ab(Context context) {
        Resources resources = context.getResources();
        this.f76386a = new C24096d(resources.getDimensionPixelSize(R.dimen.lens_tts_word_horizontal_padding), resources.getDimensionPixelSize(R.dimen.lens_tts_word_rounded_corners_radius), resources.getDimensionPixelSize(R.dimen.lens_tts_word_vertical_padding));
        Paint paint = new Paint(1);
        this.f76389d = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f76390e = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.lens_tts_word_stroke_width));
        paint.setColor(C1878d.m5128a(context, R.color.lens_word_playing_fill_color));
        paint2.setColor(C1878d.m5128a(context, R.color.lens_word_playing_stroke_color));
    }

    /* renamed from: a */
    public final void mo33525a() {
        this.f76388c = null;
        this.f76387b = C58485gu.m89845m();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Path path = this.f76388c;
        if (path != null) {
            canvas.drawPath(path, this.f76389d);
            canvas.drawPath(path, this.f76390e);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
