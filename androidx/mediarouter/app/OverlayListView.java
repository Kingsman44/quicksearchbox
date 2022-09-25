package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
final class OverlayListView extends ListView {

    /* renamed from: a */
    public final List f12076a = new ArrayList();

    public OverlayListView(Context context) {
        super(context);
    }

    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.f12076a.size() > 0) {
            Iterator it = this.f12076a.iterator();
            while (it.hasNext()) {
                C3764aj ajVar = (C3764aj) it.next();
                BitmapDrawable bitmapDrawable = ajVar.f12150a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (!ajVar.f12161l) {
                    float f2 = 0.0f;
                    float max = Math.max(0.0f, Math.min(1.0f, ((float) (drawingTime - ajVar.f12159j)) / ((float) ajVar.f12154e)));
                    if (true == ajVar.f12160k) {
                        f2 = max;
                    }
                    Interpolator interpolator = ajVar.f12153d;
                    if (interpolator == null) {
                        f = f2;
                    } else {
                        f = interpolator.getInterpolation(f2);
                    }
                    int i = (int) (((float) ajVar.f12156g) * f);
                    ajVar.f12152c.top = ajVar.f12155f.top + i;
                    ajVar.f12152c.bottom = ajVar.f12155f.bottom + i;
                    float f3 = ajVar.f12157h;
                    float f4 = f3 + ((ajVar.f12158i - f3) * f);
                    ajVar.f12151b = f4;
                    BitmapDrawable bitmapDrawable2 = ajVar.f12150a;
                    if (bitmapDrawable2 != null) {
                        Rect rect = ajVar.f12152c;
                        bitmapDrawable2.setAlpha((int) (f4 * 255.0f));
                        ajVar.f12150a.setBounds(ajVar.f12152c);
                    }
                    if (ajVar.f12160k && f2 >= 1.0f) {
                        ajVar.f12161l = true;
                        C3774k kVar = ajVar.f12162m;
                        if (kVar != null) {
                            kVar.mo7997a();
                        }
                    }
                    if (!ajVar.f12161l) {
                    }
                }
                it.remove();
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
