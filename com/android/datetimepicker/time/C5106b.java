package com.android.datetimepicker.time;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.android.datetimepicker.time.b */
/* compiled from: PG */
public final class C5106b extends View {

    /* renamed from: a */
    private final Paint f16297a;

    public C5106b(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f16297a = paint;
        Resources resources = context.getResources();
        resources.getColor(17170443);
        resources.getColor(R.color.numbers_text_color);
        paint.setAntiAlias(true);
    }

    public final void onDraw(Canvas canvas) {
        getWidth();
    }
}
