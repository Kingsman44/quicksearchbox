package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.p033v7.widget.C0519aq;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
class MediaRouteVolumeSlider extends C0519aq {

    /* renamed from: a */
    public int f12071a;

    /* renamed from: b */
    public int f12072b;

    /* renamed from: c */
    private final float f12073c;

    /* renamed from: d */
    private boolean f12074d;

    /* renamed from: e */
    private Drawable f12075e;

    public MediaRouteVolumeSlider(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo7947a(boolean z) {
        if (this.f12074d != z) {
            this.f12074d = z;
            super.setThumb(z ? null : this.f12075e);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? PrivateKeyType.INVALID : (int) (this.f12073c * 255.0f);
        this.f12075e.setColorFilter(this.f12071a, PorterDuff.Mode.SRC_IN);
        this.f12075e.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.f12072b, PorterDuff.Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.f12071a, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    public final void setThumb(Drawable drawable) {
        this.f12075e = drawable;
        if (this.f12074d) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12073c = C3763ai.m10920a(context);
    }
}
