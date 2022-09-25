package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* compiled from: PG */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a */
    private final Runnable f6022a;

    /* renamed from: b */
    private final Runnable f6023b;

    public ContentLoadingProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final void m5828a() {
        removeCallbacks(this.f6022a);
        removeCallbacks(this.f6023b);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m5828a();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m5828a();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6022a = new C2119f(this);
        this.f6023b = new C2120g(this);
    }
}
