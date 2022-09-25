package androidx.emoji.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/* compiled from: PG */
public class ExtractButtonCompat extends Button {
    public ExtractButtonCompat(Context context) {
        super(context, (AttributeSet) null);
    }

    public final boolean hasWindowFocus() {
        return isEnabled() && getVisibility() == 0;
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
