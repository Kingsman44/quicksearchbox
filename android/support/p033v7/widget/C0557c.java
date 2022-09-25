package android.support.p033v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.c */
/* compiled from: PG */
final class C0557c extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f2159a;

    public C0557c(ActionBarContainer actionBarContainer) {
        this.f2159a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2159a;
        if (actionBarContainer.f1723e) {
            Drawable drawable = actionBarContainer.f1722d;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1720b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f2159a;
        Drawable drawable3 = actionBarContainer2.f1721c;
        if (drawable3 != null && actionBarContainer2.f1724f) {
            drawable3.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f2159a;
        if (!actionBarContainer.f1723e) {
            Drawable drawable = actionBarContainer.f1720b;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        } else if (actionBarContainer.f1722d != null) {
            actionBarContainer.f1720b.getOutline(outline);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
