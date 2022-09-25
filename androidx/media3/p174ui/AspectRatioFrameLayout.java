package androidx.media3.p174ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: androidx.media3.ui.AspectRatioFrameLayout */
/* compiled from: PG */
public final class AspectRatioFrameLayout extends FrameLayout {
    public AspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3653q.f11749a, 0, 0);
            try {
                obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
