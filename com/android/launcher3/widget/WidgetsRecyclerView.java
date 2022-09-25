package com.android.launcher3.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import com.android.launcher3.BaseRecyclerView;
import com.android.launcher3.model.WidgetsModel;
import com.evernote.android.state.BuildConfig;

/* compiled from: PG */
public class WidgetsRecyclerView extends BaseRecyclerView {
    private BaseRecyclerView.ScrollPositionState mScrollPosState;
    public WidgetsModel mWidgets;

    public WidgetsRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        canvas.clipRect(this.mBackgroundPadding.left, this.mBackgroundPadding.top, getWidth() - this.mBackgroundPadding.right, getHeight() - this.mBackgroundPadding.bottom);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r1 = getChildAt(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getCurScrollState$ar$ds(com.android.launcher3.BaseRecyclerView.ScrollPositionState r4) {
        /*
            r3 = this;
            r0 = -1
            r4.rowIndex = r0
            r4.rowTopOffset = r0
            r4.itemPos = r0
            com.android.launcher3.model.WidgetsModel r1 = r3.mWidgets
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            java.util.ArrayList r1 = r1.mPackageItemInfos
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            r1 = 0
            android.view.View r1 = r3.getChildAt(r1)
            int r2 = r3.getChildAdapterPosition(r1)
            if (r2 == r0) goto L_0x002c
            r4.rowIndex = r2
            android.support.v7.widget.fo r0 = r3.mLayout
            int r0 = r0.getDecoratedTop(r1)
            r4.rowTopOffset = r0
            r4.itemPos = r2
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.widget.WidgetsRecyclerView.getCurScrollState$ar$ds(com.android.launcher3.BaseRecyclerView$ScrollPositionState):void");
    }

    public final int getFastScrollerTrackColor$ar$ds() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public final int getTop(int i) {
        if (getChildCount() == 0) {
            return 0;
        }
        return getChildAt(0).getMeasuredHeight() * i;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.mOnItemTouchListeners.add(this);
    }

    public final void onUpdateScrollbar(int i) {
        WidgetsModel widgetsModel = this.mWidgets;
        if (widgetsModel != null) {
            int size = widgetsModel.mPackageItemInfos.size();
            if (size == 0) {
                this.mScrollbar.setThumbOffset(-1, -1);
                return;
            }
            getCurScrollState$ar$ds(this.mScrollPosState);
            BaseRecyclerView.ScrollPositionState scrollPositionState = this.mScrollPosState;
            if (scrollPositionState.rowIndex < 0) {
                this.mScrollbar.setThumbOffset(-1, -1);
            } else {
                synchronizeScrollBarThumbOffsetToViewScroll(scrollPositionState, size);
            }
        }
    }

    public final String scrollToPositionAtProgress(float f) {
        int size;
        WidgetsModel widgetsModel = this.mWidgets;
        if (widgetsModel == null || (size = widgetsModel.mPackageItemInfos.size()) == 0) {
            return BuildConfig.FLAVOR;
        }
        stopScroll();
        getCurScrollState$ar$ds(this.mScrollPosState);
        float f2 = ((float) size) * f;
        ((LinearLayoutManager) this.mLayout).scrollToPositionWithOffset(0, (int) (-(((float) getAvailableScrollHeight(size)) * f)));
        if (f == 1.0f) {
            f2 -= 4.0f;
        }
        return this.mWidgets.getPackageItemInfo((int) f2).titleSectionName;
    }

    public WidgetsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WidgetsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScrollPosState = new BaseRecyclerView.ScrollPositionState();
    }

    public WidgetsRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i);
    }
}
