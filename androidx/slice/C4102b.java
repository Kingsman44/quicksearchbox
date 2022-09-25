package androidx.slice;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: androidx.slice.b */
/* compiled from: PG */
public final class C4102b extends InsetDrawable {

    /* renamed from: a */
    private final float f13130a;

    /* renamed from: b */
    private final Path f13131b = new Path();

    public C4102b(Drawable drawable, float f) {
        super(drawable, 0);
        this.f13130a = f;
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.f13131b);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Path path = this.f13131b;
        if (path != null) {
            path.reset();
            Path path2 = this.f13131b;
            RectF rectF = new RectF(rect);
            float f = this.f13130a;
            path2.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
        super.onBoundsChange(rect);
    }
}
