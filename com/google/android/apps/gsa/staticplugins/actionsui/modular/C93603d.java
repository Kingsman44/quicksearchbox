package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.d */
/* compiled from: PG */
public final class C93603d extends Drawable {

    /* renamed from: a */
    private final Paint f261328a;

    /* renamed from: b */
    private final RectF f261329b = new RectF();

    /* renamed from: c */
    private final C93576c f261330c;

    /* renamed from: d */
    private int f261331d;

    public C93603d(Resources resources, C93576c cVar) {
        Paint paint = new Paint();
        this.f261328a = paint;
        paint.setColor(resources.getColor(R.color.action_card_blue));
        this.f261330c = cVar;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float level = (float) getLevel();
        this.f261329b.top = (float) bounds.top;
        this.f261329b.bottom = (float) bounds.bottom;
        this.f261329b.right = ((float) bounds.left) + ((((float) bounds.width()) * level) / 10000.0f);
        if (level > 9500.0f) {
            this.f261329b.left = ((float) bounds.left) + ((((float) bounds.width()) * (level - 4.492998E-4f)) / 500.0f);
        } else {
            this.f261329b.left = (float) bounds.left;
        }
        canvas.drawRoundRect(this.f261329b, (float) bounds.height(), (float) bounds.height(), this.f261328a);
    }

    public final int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        invalidateSelf();
        int i2 = this.f261331d;
        if ((i2 > 8500 && i <= 8500) || ((i2 > 9900 && i <= 9900) || ((i2 <= 8500 && i > 8500) || (i2 <= 9900 && i > 9900)))) {
            C93576c cVar = this.f261330c;
            boolean z = false;
            boolean z2 = i > 8500;
            if (i > 9900) {
                z = true;
            }
            cVar.mo87904ik(z2, z);
        }
        this.f261331d = i;
        return true;
    }

    public final void setAlpha(int i) {
        this.f261328a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f261328a.setColorFilter(colorFilter);
    }
}
