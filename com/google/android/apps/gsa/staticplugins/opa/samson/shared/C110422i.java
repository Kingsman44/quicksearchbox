package com.google.android.apps.gsa.staticplugins.opa.samson.shared;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.p033v7.widget.AppCompatImageView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.shared.i */
/* compiled from: PG */
public final class C110422i extends AppCompatImageView {

    /* renamed from: a */
    private final Paint f307779a;

    /* renamed from: b */
    private final int f307780b;

    /* renamed from: c */
    private final int f307781c;

    public C110422i(Context context, int i) {
        super(context);
        Resources resources = context.getResources();
        this.f307780b = resources.getDimensionPixelSize(R.dimen.overflow_dot_radius);
        this.f307781c = resources.getDimensionPixelSize(R.dimen.notification_icon_size);
        Paint paint = new Paint(1);
        this.f307779a = paint;
        paint.setColor(i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle((float) (this.f307781c / 2), (float) (getHeight() / 2), (float) this.f307780b, this.f307779a);
    }
}
