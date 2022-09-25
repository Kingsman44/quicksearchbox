package com.google.android.libraries.p579ar.sceneviewer.p589ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: com.google.android.libraries.ar.sceneviewer.ui.ActualScaleButton */
/* compiled from: PG */
public final class ActualScaleButton extends LinearLayout {
    private OnVisibilityChangedListener listener;

    /* renamed from: com.google.android.libraries.ar.sceneviewer.ui.ActualScaleButton$OnVisibilityChangedListener */
    /* compiled from: PG */
    public interface OnVisibilityChangedListener {
        void onVisibilityChanged(boolean z);
    }

    public ActualScaleButton(Context context) {
        super(context);
    }

    public static ActualScaleButton create(Context context, ViewGroup viewGroup) {
        LayoutInflater.from(context).inflate(C10753R.layout.actual_scale_button, viewGroup);
        return (ActualScaleButton) viewGroup.findViewById(C10753R.C10755id.view_actual_size_button);
    }

    public void alignAbove(float f) {
        setY((f - ((float) getHeight())) - ((float) getResources().getDimensionPixelSize(C10753R.dimen.view_actual_size_button_bottom_margin)));
    }

    public void setOnVisibilityChangedListener(OnVisibilityChangedListener onVisibilityChangedListener) {
        this.listener = onVisibilityChangedListener;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        OnVisibilityChangedListener onVisibilityChangedListener = this.listener;
        if (onVisibilityChangedListener != null) {
            onVisibilityChangedListener.onVisibilityChanged(i == 0);
        }
    }

    public ActualScaleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ActualScaleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
