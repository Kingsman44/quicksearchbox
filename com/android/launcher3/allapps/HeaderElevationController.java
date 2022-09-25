package com.android.launcher3.allapps;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public abstract class HeaderElevationController extends C0658ft {
    public int mCurrentY = 0;

    /* compiled from: PG */
    public final class ControllerV16 extends HeaderElevationController {
        private final float mScrollToElevation;
        private final View mShadow;

        public ControllerV16(View view) {
            Resources resources = view.getContext().getResources();
            this.mScrollToElevation = resources.getDimension(R.dimen.all_apps_header_scroll_to_elevation);
            View view2 = new View(view.getContext());
            this.mShadow = view2;
            view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{503316480, 0}));
            view2.setAlpha(0.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.all_apps_header_shadow_height));
            layoutParams.topMargin = ((FrameLayout.LayoutParams) view.getLayoutParams()).height;
            ((ViewGroup) view.getParent()).addView(view2, layoutParams);
        }

        public final void onScroll(int i) {
            this.mShadow.setAlpha(Math.min((float) i, this.mScrollToElevation) / this.mScrollToElevation);
        }

        public final void updateBackgroundPadding(Rect rect) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mShadow.getLayoutParams();
            layoutParams.leftMargin = rect.left;
            layoutParams.rightMargin = rect.right;
            this.mShadow.requestLayout();
        }
    }

    /* compiled from: PG */
    public final class ControllerVL extends HeaderElevationController {
        private final View mHeader;
        private final float mMaxElevation;
        private final float mScrollToElevation;

        public ControllerVL(View view) {
            this.mHeader = view;
            view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
            Resources resources = view.getContext().getResources();
            this.mMaxElevation = resources.getDimension(R.dimen.all_apps_header_max_elevation);
            this.mScrollToElevation = resources.getDimension(R.dimen.all_apps_header_scroll_to_elevation);
        }

        public final void onScroll(int i) {
            float min = this.mMaxElevation * (Math.min((float) i, this.mScrollToElevation) / this.mScrollToElevation);
            if (Float.compare(this.mHeader.getElevation(), min) != 0) {
                this.mHeader.setElevation(min);
            }
        }
    }

    public abstract void onScroll(int i);

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.mCurrentY + i2;
        this.mCurrentY = i3;
        onScroll(i3);
    }

    public void updateBackgroundPadding(Rect rect) {
    }
}
