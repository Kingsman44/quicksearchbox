package com.android.launcher3.allapps;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p033v7.widget.C0640fb;
import android.util.AttributeSet;
import android.view.View;
import com.android.launcher3.BaseRecyclerView;
import com.android.launcher3.BaseRecyclerViewFastScrollBar;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.Stats;
import com.android.launcher3.Utilities;
import com.android.launcher3.allapps.AlphabeticalAppsList;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* compiled from: PG */
public class AllAppsRecyclerView extends BaseRecyclerView implements Stats.LaunchSourceProvider {
    public AlphabeticalAppsList mApps;
    public HeaderElevationController mElevationController;
    private AllAppsBackgroundDrawable mEmptySearchBackground;
    private int mEmptySearchBackgroundTopOffset;
    public AllAppsFastScrollHelper mFastScrollHelper;
    public int mIconHeight;
    public int mNumAppsPerRow;
    public int mPredictionIconHeight;
    private BaseRecyclerView.ScrollPositionState mScrollPosState;

    public AllAppsRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void updateEmptySearchBackgroundBounds() {
        if (this.mEmptySearchBackground != null) {
            int measuredWidth = getMeasuredWidth();
            AllAppsBackgroundDrawable allAppsBackgroundDrawable = this.mEmptySearchBackground;
            int i = allAppsBackgroundDrawable.mWidth;
            int i2 = (measuredWidth - i) / 2;
            int i3 = this.mEmptySearchBackgroundTopOffset;
            allAppsBackgroundDrawable.setBounds(i2, i3, i + i2, allAppsBackgroundDrawable.mHeight + i3);
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        canvas.clipRect(this.mBackgroundPadding.left, this.mBackgroundPadding.top, getWidth() - this.mBackgroundPadding.right, getHeight() - this.mBackgroundPadding.bottom);
        super.dispatchDraw(canvas);
    }

    public final void fillInLaunchSourceData(View view, Bundle bundle) {
        int childAdapterPosition;
        bundle.putString("container", "all_apps");
        if (this.mApps.hasFilter()) {
            bundle.putString("sub_container", "search");
        } else if (!(view instanceof BubbleTextView) || (childAdapterPosition = getChildAdapterPosition((BubbleTextView) view)) == -1 || ((AlphabeticalAppsList.AdapterItem) this.mApps.mAdapterItems.get(childAdapterPosition)).viewType != 2) {
            bundle.putString("sub_container", "a-z");
        } else {
            bundle.putString("sub_container", "prediction");
        }
    }

    /* access modifiers changed from: protected */
    public final int getTop(int i) {
        if (getChildCount() == 0 || i <= 0) {
            return 0;
        }
        return this.mPredictionIconHeight + ((i - 1) * this.mIconHeight);
    }

    public final void onDraw(Canvas canvas) {
        AllAppsBackgroundDrawable allAppsBackgroundDrawable = this.mEmptySearchBackground;
        if (allAppsBackgroundDrawable != null && allAppsBackgroundDrawable.getAlpha() > 0) {
            canvas.clipRect(this.mBackgroundPadding.left, this.mBackgroundPadding.top, getWidth() - this.mBackgroundPadding.right, getHeight() - this.mBackgroundPadding.bottom);
            this.mEmptySearchBackground.draw(canvas);
        }
        super.onDraw(canvas);
    }

    public final void onFastScrollCompleted() {
        AllAppsFastScrollHelper allAppsFastScrollHelper = this.mFastScrollHelper;
        allAppsFastScrollHelper.mRv.removeCallbacks(allAppsFastScrollHelper.mSmoothSnapNextFrameRunnable);
        allAppsFastScrollHelper.mRv.removeCallbacks(allAppsFastScrollHelper.mFastScrollToTargetSectionRunnable);
        allAppsFastScrollHelper.mHasFastScrollTouchSettled = false;
        allAppsFastScrollHelper.mHasFastScrollTouchSettledAtLeastOnce = false;
        allAppsFastScrollHelper.mCurrentFastScrollSection = null;
        allAppsFastScrollHelper.mTargetFastScrollSection = null;
        allAppsFastScrollHelper.mTargetFastScrollPosition = -1;
        allAppsFastScrollHelper.updateTrackedViewsFastScrollFocusState();
        allAppsFastScrollHelper.mTrackedFastScrollViews.clear();
    }

    public final void onSearchResultsChanged() {
        scrollToTop();
        if (this.mApps.hasNoFilteredResults()) {
            if (this.mEmptySearchBackground == null) {
                AllAppsBackgroundDrawable allAppsBackgroundDrawable = new AllAppsBackgroundDrawable(getContext());
                this.mEmptySearchBackground = allAppsBackgroundDrawable;
                allAppsBackgroundDrawable.setAlpha(0);
                this.mEmptySearchBackground.setCallback(this);
                updateEmptySearchBackgroundBounds();
            }
            AllAppsBackgroundDrawable allAppsBackgroundDrawable2 = this.mEmptySearchBackground;
            if (allAppsBackgroundDrawable2.getAlpha() != 255) {
                AllAppsBackgroundDrawable.cancelAnimator$ar$ds$b7d8fd49_0(allAppsBackgroundDrawable2.mBackgroundAnim);
                allAppsBackgroundDrawable2.mBackgroundAnim = null;
                allAppsBackgroundDrawable2.mBackgroundAnim = ObjectAnimator.ofInt(allAppsBackgroundDrawable2, "alpha", new int[]{255});
                allAppsBackgroundDrawable2.mBackgroundAnim.setDuration(150);
                allAppsBackgroundDrawable2.mBackgroundAnim.start();
                return;
            }
            return;
        }
        AllAppsBackgroundDrawable allAppsBackgroundDrawable3 = this.mEmptySearchBackground;
        if (allAppsBackgroundDrawable3 != null && allAppsBackgroundDrawable3.getAlpha() != 0) {
            AllAppsBackgroundDrawable.cancelAnimator$ar$ds$b7d8fd49_0(allAppsBackgroundDrawable3.mBackgroundAnim);
            allAppsBackgroundDrawable3.mBackgroundAnim = null;
            allAppsBackgroundDrawable3.setAlpha(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        updateEmptySearchBackgroundBounds();
    }

    public final void onUpdateScrollbar(int i) {
        int i2;
        int i3;
        if (this.mApps.mAdapterItems.isEmpty() || this.mNumAppsPerRow == 0) {
            this.mScrollbar.setThumbOffset(-1, -1);
            return;
        }
        AlphabeticalAppsList alphabeticalAppsList = this.mApps;
        int i4 = alphabeticalAppsList.mNumAppRowsInAdapter;
        BaseRecyclerView.ScrollPositionState scrollPositionState = this.mScrollPosState;
        scrollPositionState.rowIndex = -1;
        scrollPositionState.rowTopOffset = -1;
        scrollPositionState.itemPos = -1;
        List list = alphabeticalAppsList.mAdapterItems;
        if (!list.isEmpty() && this.mNumAppsPerRow != 0) {
            int childCount = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i5);
                int childAdapterPosition = getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1) {
                    AlphabeticalAppsList.AdapterItem adapterItem = (AlphabeticalAppsList.AdapterItem) list.get(childAdapterPosition);
                    if (adapterItem.viewType != 0) {
                        scrollPositionState.rowIndex = adapterItem.rowIndex;
                        scrollPositionState.rowTopOffset = this.mLayout.getDecoratedTop(childAt);
                        scrollPositionState.itemPos = childAdapterPosition;
                        break;
                    }
                }
                i5++;
            }
        }
        if (this.mScrollPosState.rowIndex < 0) {
            this.mScrollbar.setThumbOffset(-1, -1);
            return;
        }
        int availableScrollBarHeight = getAvailableScrollBarHeight();
        int availableScrollHeight = getAvailableScrollHeight(this.mApps.mNumAppRowsInAdapter);
        if (availableScrollHeight <= 0) {
            this.mScrollbar.setThumbOffset(-1, -1);
            return;
        }
        int scrollTop = this.mBackgroundPadding.top + ((int) ((((float) getScrollTop(this.mScrollPosState)) / ((float) availableScrollHeight)) * ((float) availableScrollBarHeight)));
        if (this.mScrollbar.mIsThumbDetached) {
            if (Utilities.isRtl(getResources())) {
                i2 = this.mBackgroundPadding.left;
            } else {
                i2 = (getWidth() - this.mBackgroundPadding.right) - this.mScrollbar.getThumbWidth();
            }
            BaseRecyclerViewFastScrollBar baseRecyclerViewFastScrollBar = this.mScrollbar;
            if (baseRecyclerViewFastScrollBar.mIsDragging) {
                baseRecyclerViewFastScrollBar.setThumbOffset(i2, (int) baseRecyclerViewFastScrollBar.mLastTouchY);
                return;
            }
            int i6 = baseRecyclerViewFastScrollBar.mThumbOffset.y;
            int i7 = scrollTop - i6;
            if (((float) (i7 * i)) > 0.0f) {
                if (i < 0) {
                    i3 = Math.max((int) (((float) (i * i6)) / ((float) scrollTop)), i7);
                } else {
                    i3 = Math.min((int) (((float) (i * (availableScrollBarHeight - i6))) / ((float) (availableScrollBarHeight - scrollTop))), i7);
                }
                int max = Math.max(0, Math.min(availableScrollBarHeight, i6 + i3));
                this.mScrollbar.setThumbOffset(i2, max);
                if (scrollTop == max) {
                    this.mScrollbar.mIsThumbDetached = false;
                    return;
                }
                return;
            }
            this.mScrollbar.setThumbOffset(i2, i6);
            return;
        }
        synchronizeScrollBarThumbOffsetToViewScroll(this.mScrollPosState, i4);
    }

    public final String scrollToPositionAtProgress(float f) {
        if (this.mApps.mNumAppRowsInAdapter == 0) {
            return BuildConfig.FLAVOR;
        }
        stopScroll();
        List list = this.mApps.mFastScrollerSections;
        AlphabeticalAppsList.FastScrollSectionInfo fastScrollSectionInfo = (AlphabeticalAppsList.FastScrollSectionInfo) list.get(0);
        int i = 1;
        while (i < list.size()) {
            AlphabeticalAppsList.FastScrollSectionInfo fastScrollSectionInfo2 = (AlphabeticalAppsList.FastScrollSectionInfo) list.get(i);
            if (fastScrollSectionInfo2.touchFraction > f) {
                break;
            }
            i++;
            fastScrollSectionInfo = fastScrollSectionInfo2;
        }
        int scrollTop = getScrollTop(this.mScrollPosState);
        int availableScrollHeight = getAvailableScrollHeight(this.mApps.mNumAppRowsInAdapter);
        AllAppsFastScrollHelper allAppsFastScrollHelper = this.mFastScrollHelper;
        int i2 = allAppsFastScrollHelper.mTargetFastScrollPosition;
        int i3 = fastScrollSectionInfo.fastScrollToItem.position;
        if (i2 != i3) {
            allAppsFastScrollHelper.mTargetFastScrollPosition = i3;
            allAppsFastScrollHelper.mRv.removeCallbacks(allAppsFastScrollHelper.mSmoothSnapNextFrameRunnable);
            allAppsFastScrollHelper.mRv.removeCallbacks(allAppsFastScrollHelper.mFastScrollToTargetSectionRunnable);
            int childCount = allAppsFastScrollHelper.mRv.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = allAppsFastScrollHelper.mRv.getChildAt(i4);
                if (childAt instanceof BaseRecyclerViewFastScrollBar.FastScrollFocusableView) {
                    allAppsFastScrollHelper.mTrackedFastScrollViews.add((BaseRecyclerViewFastScrollBar.FastScrollFocusableView) childAt);
                }
            }
            if (allAppsFastScrollHelper.mHasFastScrollTouchSettled) {
                allAppsFastScrollHelper.mCurrentFastScrollSection = fastScrollSectionInfo.sectionName;
                allAppsFastScrollHelper.mTargetFastScrollSection = null;
                allAppsFastScrollHelper.updateTrackedViewsFastScrollFocusState();
            } else {
                allAppsFastScrollHelper.mCurrentFastScrollSection = null;
                allAppsFastScrollHelper.mTargetFastScrollSection = fastScrollSectionInfo.sectionName;
                allAppsFastScrollHelper.mHasFastScrollTouchSettled = false;
                allAppsFastScrollHelper.updateTrackedViewsFastScrollFocusState();
                allAppsFastScrollHelper.mRv.postDelayed(allAppsFastScrollHelper.mFastScrollToTargetSectionRunnable, true != allAppsFastScrollHelper.mHasFastScrollTouchSettledAtLeastOnce ? 100 : 200);
            }
            int min = Math.min(availableScrollHeight, allAppsFastScrollHelper.mRv.getPaddingTop() + allAppsFastScrollHelper.mRv.getTop(fastScrollSectionInfo.fastScrollToItem.rowIndex));
            for (int i5 = 0; i5 < 10; i5++) {
                allAppsFastScrollHelper.mFastScrollFrames[i5] = (min - scrollTop) / 10;
            }
            allAppsFastScrollHelper.mFastScrollFrameIndex = 0;
            allAppsFastScrollHelper.mRv.postOnAnimation(allAppsFastScrollHelper.mSmoothSnapNextFrameRunnable);
        }
        return fastScrollSectionInfo.sectionName;
    }

    public final void scrollToTop() {
        BaseRecyclerViewFastScrollBar baseRecyclerViewFastScrollBar = this.mScrollbar;
        if (baseRecyclerViewFastScrollBar.mIsThumbDetached) {
            baseRecyclerViewFastScrollBar.mIsThumbDetached = false;
        }
        scrollToPosition(0);
        HeaderElevationController headerElevationController = this.mElevationController;
        if (headerElevationController != null) {
            headerElevationController.mCurrentY = 0;
            headerElevationController.onScroll(0);
        }
    }

    public final void setAdapter(C0640fb fbVar) {
        super.setAdapter(fbVar);
        ((AllAppsGridAdapter) fbVar).mBindViewCallback$ar$class_merging = this.mFastScrollHelper;
    }

    /* access modifiers changed from: protected */
    public final boolean supportsFastScrolling() {
        return !this.mApps.hasFilter();
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.mEmptySearchBackground || super.verifyDrawable(drawable);
    }

    public AllAppsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AllAppsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AllAppsRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.mScrollPosState = new BaseRecyclerView.ScrollPositionState();
        Resources resources = getResources();
        this.mOnItemTouchListeners.add(this);
        this.mScrollbar.mCanThumbDetach = true;
        this.mEmptySearchBackgroundTopOffset = resources.getDimensionPixelSize(R.dimen.all_apps_empty_search_bg_top_offset);
    }
}
