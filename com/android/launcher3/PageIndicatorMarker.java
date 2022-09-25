package com.android.launcher3;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class PageIndicatorMarker extends FrameLayout {
    public ImageView mActiveMarker;
    public ImageView mInactiveMarker;

    public PageIndicatorMarker(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: package-private */
    public final void inactivate(boolean z) {
        if (z) {
            this.mInactiveMarker.animate().cancel();
            this.mInactiveMarker.setAlpha(1.0f);
            this.mActiveMarker.animate().cancel();
            this.mActiveMarker.setAlpha(0.0f);
            this.mActiveMarker.setScaleX(0.5f);
            this.mActiveMarker.setScaleY(0.5f);
            return;
        }
        this.mInactiveMarker.animate().alpha(1.0f).setDuration(175).start();
        this.mActiveMarker.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(175).start();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.mActiveMarker = (ImageView) findViewById(R.id.active);
        this.mInactiveMarker = (ImageView) findViewById(R.id.inactive);
    }

    /* access modifiers changed from: package-private */
    public final void setMarkerDrawables(int i, int i2) {
        Resources resources = getResources();
        this.mActiveMarker.setImageDrawable(resources.getDrawable(i));
        this.mInactiveMarker.setImageDrawable(resources.getDrawable(i2));
    }

    public PageIndicatorMarker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageIndicatorMarker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
