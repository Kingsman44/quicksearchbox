package com.android.launcher3.accessibility;

import android.content.Context;
import android.graphics.Rect;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.p099a.C1991k;
import androidx.customview.p103b.C2144b;
import com.android.launcher3.CellLayout;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.LauncherAppState;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* compiled from: PG */
public abstract class DragAndDropAccessibilityDelegate extends C2144b implements View.OnClickListener {
    private static final int[] sTempArray = new int[2];
    protected final Context mContext;
    protected final LauncherAccessibilityDelegate mDelegate;
    private final Rect mTempRect = new Rect();
    protected final CellLayout mView;

    public DragAndDropAccessibilityDelegate(CellLayout cellLayout) {
        super(cellLayout);
        this.mView = cellLayout;
        this.mContext = cellLayout.getContext();
        this.mDelegate = LauncherAppState.getInstance().mAccessibilityDelegate;
    }

    private final Rect getItemBounds(int i) {
        CellLayout cellLayout = this.mView;
        int i2 = cellLayout.mCountX;
        int i3 = i % i2;
        int i4 = i / i2;
        ItemInfo itemInfo = this.mDelegate.mDragInfo.info;
        cellLayout.cellToRect(i3, i4, itemInfo.spanX, itemInfo.spanY, this.mTempRect);
        return this.mTempRect;
    }

    /* access modifiers changed from: protected */
    public abstract String getConfirmationForIconDrop(int i);

    /* access modifiers changed from: protected */
    public abstract String getLocationDescriptionForIconDrop(int i);

    /* access modifiers changed from: protected */
    public final int getVirtualViewAt(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f || f > ((float) this.mView.getMeasuredWidth()) || f2 > ((float) this.mView.getMeasuredHeight())) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        CellLayout cellLayout = this.mView;
        int[] iArr = sTempArray;
        int paddingLeft = cellLayout.getPaddingLeft();
        int paddingTop = cellLayout.getPaddingTop();
        int i = cellLayout.mCellWidth;
        int i2 = cellLayout.mWidthGap;
        iArr[0] = (((int) f) - paddingLeft) / i;
        int i3 = cellLayout.mCellHeight;
        int i4 = cellLayout.mHeightGap;
        iArr[1] = (((int) f2) - paddingTop) / i3;
        int i5 = cellLayout.mCountX;
        int i6 = cellLayout.mCountY;
        int i7 = iArr[0];
        if (i7 < 0) {
            iArr[0] = 0;
            i7 = 0;
        }
        if (i7 >= i5) {
            iArr[0] = i5 - 1;
        }
        int i8 = iArr[1];
        if (i8 < 0) {
            iArr[1] = 0;
            i8 = 0;
        }
        if (i8 >= i6) {
            iArr[1] = i6 - 1;
        }
        return intersectsValidDropTarget(iArr[0] + (iArr[1] * this.mView.mCountX));
    }

    /* access modifiers changed from: protected */
    public final void getVisibleVirtualViews(List list) {
        CellLayout cellLayout = this.mView;
        int i = cellLayout.mCountX * cellLayout.mCountY;
        for (int i2 = 0; i2 < i; i2++) {
            if (intersectsValidDropTarget(i2) == i2) {
                list.add(Integer.valueOf(i2));
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract int intersectsValidDropTarget(int i);

    public final void onClick(View view) {
        onPerformActionForVirtualView$ar$ds(this.mAccessibilityFocusedVirtualViewId, 16);
    }

    /* access modifiers changed from: protected */
    public final boolean onPerformActionForVirtualView$ar$ds(int i, int i2) {
        if (i2 != 16 || i == Integer.MIN_VALUE) {
            return false;
        }
        this.mDelegate.handleAccessibleDrop(this.mView, getItemBounds(i), getConfirmationForIconDrop(i));
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription(this.mContext.getString(R.string.action_move_here));
    }

    /* access modifiers changed from: protected */
    public final void onPopulateNodeForVirtualView(int i, C1991k kVar) {
        if (i != Integer.MIN_VALUE) {
            kVar.f5921a.setContentDescription(getLocationDescriptionForIconDrop(i));
            kVar.f5921a.setBoundsInParent(getItemBounds(i));
            kVar.f5921a.addAction(16);
            kVar.f5921a.setClickable(true);
            kVar.f5921a.setFocusable(true);
            return;
        }
        throw new IllegalArgumentException("Invalid virtual view id");
    }
}
