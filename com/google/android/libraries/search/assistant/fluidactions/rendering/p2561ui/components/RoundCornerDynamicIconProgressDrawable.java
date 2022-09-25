package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.RoundCornerDynamicIconProgressDrawable */
/* compiled from: PG */
public final class RoundCornerDynamicIconProgressDrawable extends InsetDrawable {
    public RoundCornerDynamicIconProgressDrawable() {
        super((Drawable) null, 0);
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        if (changingConfigurations == 0) {
            return 4096;
        }
        return changingConfigurations;
    }

    public final Drawable.ConstantState getConstantState() {
        Drawable.ConstantState constantState = super.getConstantState();
        constantState.getClass();
        return new C33264e(constantState);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        onLevelChange(getLevel());
    }

    public final boolean onLayoutDirectionChanged(int i) {
        onLevelChange(getLevel());
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        LayerDrawable layerDrawable = (LayerDrawable) getDrawable();
        if (layerDrawable != null) {
            Rect bounds = layerDrawable.getBounds();
            Rect bounds2 = getBounds();
            if (bounds2.height() > 0 && bounds2.width() > bounds2.height()) {
                int width = bounds2.width();
                int height = bounds2.height();
                double height2 = (double) bounds2.height();
                Double.isNaN(height2);
                double d = (double) (width - height);
                Double.isNaN(d);
                double d2 = (1.0d - ((height2 * 0.75d) / d)) * 10000.0d;
                int findIndexByLayerId = layerDrawable.findIndexByLayerId(R.id.fa_device_setting_slider_icon);
                int layerGravity = layerDrawable.getLayerGravity(findIndexByLayerId);
                double d3 = (double) i;
                if ((d3 < d2 || layerGravity != 8388627) && (d3 >= d2 || layerGravity != 8388629)) {
                    int layerWidth = layerDrawable.getLayerWidth(findIndexByLayerId);
                    if (d3 >= d2) {
                        layerDrawable.setLayerGravity(findIndexByLayerId, 8388627);
                        double width2 = (double) bounds2.width();
                        double height3 = (double) bounds2.height();
                        Double.isNaN(height3);
                        Double.isNaN(width2);
                        double d4 = (double) layerWidth;
                        Double.isNaN(d4);
                        layerDrawable.setLayerInsetStart(findIndexByLayerId, (int) ((width2 - (height3 * 1.25d)) - (d4 * 0.5d)));
                    } else {
                        layerDrawable.setLayerGravity(findIndexByLayerId, 8388629);
                        double height4 = (double) bounds2.height();
                        Double.isNaN(height4);
                        double d5 = (double) layerWidth;
                        Double.isNaN(d5);
                        layerDrawable.setLayerInsetEnd(findIndexByLayerId, (int) ((height4 * 0.5d) - (d5 * 0.5d)));
                    }
                }
                layerDrawable.setBounds(bounds2.left, bounds.top, bounds2.left + Math.min(bounds2.height() + (((bounds2.width() - bounds2.height()) * i) / 10000), bounds2.width() - 1), bounds.bottom);
            }
        }
        return super.onLevelChange(i);
    }

    public RoundCornerDynamicIconProgressDrawable(Drawable drawable) {
        super(drawable, 0);
    }
}
