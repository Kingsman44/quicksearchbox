package com.android.launcher3.allapps;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.android.launcher3.BaseRecyclerViewFastScrollBar;
import com.android.launcher3.FastBitmapDrawable;
import com.android.launcher3.allapps.AlphabeticalAppsList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
public final class AllAppsFastScrollHelper {
    private final AlphabeticalAppsList mApps;
    String mCurrentFastScrollSection;
    int mFastScrollFrameIndex;
    final int[] mFastScrollFrames = new int[10];
    final Runnable mFastScrollToTargetSectionRunnable = new Runnable() {
        public final void run() {
            AllAppsFastScrollHelper allAppsFastScrollHelper = AllAppsFastScrollHelper.this;
            allAppsFastScrollHelper.mCurrentFastScrollSection = allAppsFastScrollHelper.mTargetFastScrollSection;
            allAppsFastScrollHelper.mHasFastScrollTouchSettled = true;
            allAppsFastScrollHelper.mHasFastScrollTouchSettledAtLeastOnce = true;
            allAppsFastScrollHelper.updateTrackedViewsFastScrollFocusState();
        }
    };
    public boolean mHasFastScrollTouchSettled;
    public boolean mHasFastScrollTouchSettledAtLeastOnce;
    public final AllAppsRecyclerView mRv;
    final Runnable mSmoothSnapNextFrameRunnable = new Runnable() {
        public final void run() {
            AllAppsFastScrollHelper allAppsFastScrollHelper = AllAppsFastScrollHelper.this;
            int i = allAppsFastScrollHelper.mFastScrollFrameIndex;
            if (i < 10) {
                allAppsFastScrollHelper.mRv.scrollBy(0, allAppsFastScrollHelper.mFastScrollFrames[i]);
                AllAppsFastScrollHelper allAppsFastScrollHelper2 = AllAppsFastScrollHelper.this;
                allAppsFastScrollHelper2.mFastScrollFrameIndex++;
                allAppsFastScrollHelper2.mRv.postOnAnimation(allAppsFastScrollHelper2.mSmoothSnapNextFrameRunnable);
            }
        }
    };
    int mTargetFastScrollPosition = -1;
    String mTargetFastScrollSection;
    public final HashSet mTrackedFastScrollViews = new HashSet();

    public AllAppsFastScrollHelper(AllAppsRecyclerView allAppsRecyclerView, AlphabeticalAppsList alphabeticalAppsList) {
        this.mRv = allAppsRecyclerView;
        this.mApps = alphabeticalAppsList;
    }

    public final void updateTrackedViewsFastScrollFocusState() {
        Iterator it = this.mTrackedFastScrollViews.iterator();
        while (it.hasNext()) {
            BaseRecyclerViewFastScrollBar.FastScrollFocusableView fastScrollFocusableView = (BaseRecyclerViewFastScrollBar.FastScrollFocusableView) it.next();
            C0673gh childViewHolder = this.mRv.getChildViewHolder((View) fastScrollFocusableView);
            updateViewFastScrollFocusState(fastScrollFocusableView, childViewHolder != null ? childViewHolder.getPosition() : -1, true);
        }
    }

    public final void updateViewFastScrollFocusState(BaseRecyclerViewFastScrollBar.FastScrollFocusableView fastScrollFocusableView, int i, boolean z) {
        FastBitmapDrawable.State state = FastBitmapDrawable.State.NORMAL;
        if (this.mCurrentFastScrollSection != null && i >= 0) {
            AlphabeticalAppsList.AdapterItem adapterItem = (AlphabeticalAppsList.AdapterItem) this.mApps.mAdapterItems.get(i);
            state = (!adapterItem.sectionName.equals(this.mCurrentFastScrollSection) || adapterItem.position != this.mTargetFastScrollPosition) ? FastBitmapDrawable.State.FAST_SCROLL_UNHIGHLIGHTED : FastBitmapDrawable.State.FAST_SCROLL_HIGHLIGHTED;
        }
        fastScrollFocusableView.setFastScrollFocusState(state, z);
    }
}
