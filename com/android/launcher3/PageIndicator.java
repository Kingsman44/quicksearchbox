package com.android.launcher3;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* compiled from: PG */
public class PageIndicator extends LinearLayout {
    private int mActiveMarkerIndex;
    private LayoutInflater mLayoutInflater;
    public ArrayList mMarkers;
    private int mMaxWindowSize;
    private int[] mWindowRange;

    /* compiled from: PG */
    public final class PageMarkerResources {
        final int activeId;
        final int inactiveId;

        public PageMarkerResources() {
            this.activeId = R.drawable.ic_pageindicator_current;
            this.inactiveId = R.drawable.ic_pageindicator_default;
        }

        public PageMarkerResources(int i, int i2) {
            this.activeId = i;
            this.inactiveId = i2;
        }
    }

    public PageIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: package-private */
    public final void addMarker$ar$ds(int i, PageMarkerResources pageMarkerResources) {
        int max = Math.max(0, Math.min(i, this.mMarkers.size()));
        PageIndicatorMarker pageIndicatorMarker = (PageIndicatorMarker) this.mLayoutInflater.inflate(R.layout.page_indicator_marker, this, false);
        pageIndicatorMarker.setMarkerDrawables(pageMarkerResources.activeId, pageMarkerResources.inactiveId);
        this.mMarkers.add(max, pageIndicatorMarker);
        offsetWindowCenterTo(this.mActiveMarkerIndex, true);
    }

    /* access modifiers changed from: package-private */
    public final void offsetWindowCenterTo(int i, boolean z) {
        if (i < 0) {
            new Throwable().printStackTrace();
        }
        int min = Math.min(this.mMarkers.size(), this.mMaxWindowSize);
        int min2 = Math.min(this.mMarkers.size(), Math.max(0, i - (min / 2)) + this.mMaxWindowSize);
        int min3 = min2 - Math.min(this.mMarkers.size(), min);
        this.mMarkers.size();
        int[] iArr = this.mWindowRange;
        boolean z2 = (iArr[0] == min3 && iArr[1] == min2) ? false : true;
        if (!z) {
            LayoutTransition layoutTransition = getLayoutTransition();
            layoutTransition.disableTransitionType(2);
            layoutTransition.disableTransitionType(3);
            layoutTransition.disableTransitionType(0);
            layoutTransition.disableTransitionType(1);
        }
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            PageIndicatorMarker pageIndicatorMarker = (PageIndicatorMarker) getChildAt(childCount);
            int indexOf = this.mMarkers.indexOf(pageIndicatorMarker);
            if (indexOf < min3 || indexOf >= min2) {
                removeView(pageIndicatorMarker);
            }
        }
        for (int i2 = 0; i2 < this.mMarkers.size(); i2++) {
            PageIndicatorMarker pageIndicatorMarker2 = (PageIndicatorMarker) this.mMarkers.get(i2);
            if (min3 > i2 || i2 >= min2) {
                pageIndicatorMarker2.inactivate(true);
            } else {
                if (indexOfChild(pageIndicatorMarker2) < 0) {
                    addView(pageIndicatorMarker2, i2 - min3);
                }
                if (i2 != i) {
                    pageIndicatorMarker2.inactivate(z2);
                } else if (z2) {
                    pageIndicatorMarker2.mActiveMarker.animate().cancel();
                    pageIndicatorMarker2.mActiveMarker.setAlpha(1.0f);
                    pageIndicatorMarker2.mActiveMarker.setScaleX(1.0f);
                    pageIndicatorMarker2.mActiveMarker.setScaleY(1.0f);
                    pageIndicatorMarker2.mInactiveMarker.animate().cancel();
                    pageIndicatorMarker2.mInactiveMarker.setAlpha(0.0f);
                } else {
                    pageIndicatorMarker2.mActiveMarker.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(175).start();
                    pageIndicatorMarker2.mInactiveMarker.animate().alpha(0.0f).setDuration(175).start();
                }
            }
        }
        if (!z) {
            LayoutTransition layoutTransition2 = getLayoutTransition();
            layoutTransition2.enableTransitionType(2);
            layoutTransition2.enableTransitionType(3);
            layoutTransition2.enableTransitionType(0);
            layoutTransition2.enableTransitionType(1);
        }
        int[] iArr2 = this.mWindowRange;
        iArr2[0] = min3;
        iArr2[1] = min2;
    }

    /* access modifiers changed from: package-private */
    public final void removeAllMarkers$ar$ds() {
        while (this.mMarkers.size() > 0) {
            removeMarker$ar$ds(Integer.MAX_VALUE);
        }
    }

    /* access modifiers changed from: package-private */
    public final void removeMarker$ar$ds(int i) {
        if (this.mMarkers.size() > 0) {
            this.mMarkers.remove(Math.max(0, Math.min(this.mMarkers.size() - 1, i)));
            offsetWindowCenterTo(this.mActiveMarkerIndex, true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setActiveMarker(int i) {
        this.mActiveMarkerIndex = i;
        offsetWindowCenterTo(i, false);
    }

    public PageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mWindowRange = new int[2];
        this.mMarkers = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PageIndicator, i, 0);
        this.mMaxWindowSize = obtainStyledAttributes.getInteger(0, 15);
        int[] iArr = this.mWindowRange;
        iArr[0] = 0;
        iArr[1] = 0;
        this.mLayoutInflater = LayoutInflater.from(context);
        obtainStyledAttributes.recycle();
        getLayoutTransition().setDuration(175);
    }
}
