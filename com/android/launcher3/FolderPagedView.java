package com.android.launcher3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.launcher3.CellLayout;
import com.android.launcher3.FocusHelper;
import com.android.launcher3.PageIndicator;
import com.android.launcher3.Workspace;
import com.android.launcher3.compat.DeepShortcutManagerCompat;
import com.android.launcher3.shortcuts.ShortcutsContainerListener;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class FolderPagedView extends PagedView {
    public static final int[] sTempPosArray = new int[2];
    public int mAllocatedContentSize;
    public FocusIndicatorView mFocusIndicatorView;
    public Folder mFolder;
    public int mGridCountX;
    public int mGridCountY;
    private final IconCache mIconCache;
    private final LayoutInflater mInflater;
    public final boolean mIsRtl;
    public FocusHelper.PagedFolderKeyEventListener mKeyListener;
    private final int mMaxCountX;
    private final int mMaxCountY;
    public final int mMaxItemsPerPage;
    public PageIndicator mPageIndicator;
    final HashMap mPendingAnimations = new HashMap();

    public FolderPagedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LauncherAppState instance = LauncherAppState.getInstance();
        InvariantDeviceProfile invariantDeviceProfile = instance.mInvariantDeviceProfile;
        int i = invariantDeviceProfile.numFolderColumns;
        this.mMaxCountX = i;
        int i2 = invariantDeviceProfile.numFolderRows;
        this.mMaxCountY = i2;
        this.mMaxItemsPerPage = i * i2;
        this.mInflater = LayoutInflater.from(context);
        this.mIconCache = instance.mIconCache;
        this.mIsRtl = Utilities.isRtl(getResources());
        setImportantForAccessibility(1);
        setEdgeGlowColor(getResources().getColor(R.color.folder_edge_effect_color));
    }

    public final void addViewForRank(View view, ShortcutInfo shortcutInfo, int i) {
        int i2 = this.mMaxItemsPerPage;
        int i3 = i % i2;
        int i4 = i / i2;
        shortcutInfo.rank = i;
        int i5 = this.mGridCountX;
        shortcutInfo.cellX = i3 % i5;
        shortcutInfo.cellY = i3 / i5;
        CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) view.getLayoutParams();
        layoutParams.cellX = shortcutInfo.cellX;
        layoutParams.cellY = shortcutInfo.cellY;
        Launcher launcher = this.mFolder.mLauncher;
        ((CellLayout) getChildAt(i4)).addViewToCellLayout(view, -1, (int) shortcutInfo.f16556id, layoutParams, true);
    }

    public final int allocateRankForNewItem$ar$ds() {
        int itemCount = getItemCount();
        ArrayList arrayList = new ArrayList(this.mFolder.getItemsInReadingOrder());
        arrayList.add(itemCount, (Object) null);
        arrangeChildren(arrayList, arrayList.size(), false);
        setCurrentPage(itemCount / this.mMaxItemsPerPage);
        return itemCount;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void arrangeChildren(java.util.ArrayList r29, int r30, boolean r31) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 0
        L_0x000b:
            int r5 = r28.getChildCount()
            if (r4 >= r5) goto L_0x0020
            android.view.View r5 = r0.getChildAt(r4)
            com.android.launcher3.CellLayout r5 = (com.android.launcher3.CellLayout) r5
            r5.removeAllViews()
            r2.add(r5)
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0020:
            r0.mAllocatedContentSize = r1
            int r4 = r0.mMaxItemsPerPage
            r5 = 1
            if (r1 >= r4) goto L_0x0071
        L_0x0027:
            int r4 = r0.mGridCountX
            int r6 = r0.mGridCountY
            int r7 = r4 * r6
            if (r7 >= r1) goto L_0x004d
            if (r4 <= r6) goto L_0x0035
            int r7 = r0.mMaxCountY
            if (r6 != r7) goto L_0x003e
        L_0x0035:
            int r7 = r0.mMaxCountX
            if (r4 >= r7) goto L_0x003e
            int r7 = r4 + 1
            r0.mGridCountX = r7
            goto L_0x0047
        L_0x003e:
            int r7 = r0.mMaxCountY
            if (r6 >= r7) goto L_0x0047
            int r7 = r6 + 1
            r0.mGridCountY = r7
            goto L_0x0048
        L_0x0047:
            r7 = r6
        L_0x0048:
            if (r7 != 0) goto L_0x0068
            r0.mGridCountY = r5
            goto L_0x0068
        L_0x004d:
            int r7 = r6 + -1
            int r8 = r7 * r4
            if (r8 < r1) goto L_0x005c
            if (r6 < r4) goto L_0x005c
            int r7 = java.lang.Math.max(r3, r7)
            r0.mGridCountY = r7
            goto L_0x0068
        L_0x005c:
            int r7 = r4 + -1
            int r8 = r7 * r6
            if (r8 < r1) goto L_0x0068
            int r7 = java.lang.Math.max(r3, r7)
            r0.mGridCountX = r7
        L_0x0068:
            int r7 = r0.mGridCountX
            if (r7 != r4) goto L_0x0027
            int r4 = r0.mGridCountY
            if (r4 != r6) goto L_0x0027
            goto L_0x0079
        L_0x0071:
            int r4 = r0.mMaxCountX
            r0.mGridCountX = r4
            int r4 = r0.mMaxCountY
            r0.mGridCountY = r4
        L_0x0079:
            int r4 = r28.getChildCount()
            r6 = -1
            int r4 = r4 + r6
        L_0x007f:
            if (r4 < 0) goto L_0x0091
            android.view.View r7 = r0.getChildAt(r4)
            com.android.launcher3.CellLayout r7 = (com.android.launcher3.CellLayout) r7
            int r8 = r0.mGridCountX
            int r9 = r0.mGridCountY
            r7.setGridSize(r8, r9)
            int r4 = r4 + -1
            goto L_0x007f
        L_0x0091:
            java.util.Iterator r2 = r2.iterator()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0099:
            r11 = 3
            if (r7 >= r1) goto L_0x0180
            int r12 = r29.size()
            if (r12 <= r7) goto L_0x00ab
            r12 = r29
            java.lang.Object r13 = r12.get(r7)
            android.view.View r13 = (android.view.View) r13
            goto L_0x00ae
        L_0x00ab:
            r12 = r29
            r13 = 0
        L_0x00ae:
            if (r8 == 0) goto L_0x00b4
            int r14 = r0.mMaxItemsPerPage
            if (r9 < r14) goto L_0x0109
        L_0x00b4:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00c1
            java.lang.Object r8 = r2.next()
            com.android.launcher3.CellLayout r8 = (com.android.launcher3.CellLayout) r8
            goto L_0x0108
        L_0x00c1:
            android.content.Context r8 = r28.getContext()
            com.android.launcher3.Launcher r8 = com.android.launcher3.Launcher.getLauncher(r8)
            com.android.launcher3.DeviceProfile r8 = r8.mDeviceProfile
            com.android.launcher3.CellLayout r9 = new com.android.launcher3.CellLayout
            android.content.Context r14 = r28.getContext()
            r9.<init>(r14)
            int r14 = r8.folderCellWidthPx
            int r8 = r8.folderCellHeightPx
            r9.mCellWidth = r14
            r9.mFixedCellWidth = r14
            r9.mCellHeight = r8
            r9.mFixedCellHeight = r8
            com.android.launcher3.ShortcutAndWidgetContainer r15 = r9.mShortcutsAndWidgets
            int r4 = r9.mCountX
            r15.setCellDimensions$ar$ds$bb6a3296_0(r14, r8, r4)
            com.android.launcher3.ShortcutAndWidgetContainer r4 = r9.mShortcutsAndWidgets
            r4.setMotionEventSplittingEnabled(r3)
            com.android.launcher3.ShortcutAndWidgetContainer r4 = r9.mShortcutsAndWidgets
            r8 = 2
            r4.mContainerType = r8
            r9.setImportantForAccessibility(r8)
            com.android.launcher3.ShortcutAndWidgetContainer r4 = r9.mShortcutsAndWidgets
            r4.mInvertIfRtl = r5
            int r4 = r0.mGridCountX
            int r8 = r0.mGridCountY
            r9.setGridSize(r4, r8)
            com.android.launcher3.PagedView$LayoutParams r4 = new com.android.launcher3.PagedView$LayoutParams
            r4.<init>()
            r0.addView(r9, r6, r4)
            r8 = r9
        L_0x0108:
            r9 = 0
        L_0x0109:
            if (r13 == 0) goto L_0x0175
            android.view.ViewGroup$LayoutParams r4 = r13.getLayoutParams()
            com.android.launcher3.CellLayout$LayoutParams r4 = (com.android.launcher3.CellLayout.LayoutParams) r4
            int r14 = r0.mGridCountX
            int r15 = r9 % r14
            int r14 = r9 / r14
            java.lang.Object r16 = r13.getTag()
            r6 = r16
            com.android.launcher3.ItemInfo r6 = (com.android.launcher3.ItemInfo) r6
            int r5 = r6.cellX
            if (r5 != r15) goto L_0x012b
            int r5 = r6.cellY
            if (r5 != r14) goto L_0x012b
            int r5 = r6.rank
            if (r5 == r10) goto L_0x014e
        L_0x012b:
            r6.cellX = r15
            r6.cellY = r14
            r6.rank = r10
            if (r31 == 0) goto L_0x014e
            android.content.Context r20 = r28.getContext()
            com.android.launcher3.Folder r5 = r0.mFolder
            com.android.launcher3.FolderInfo r5 = r5.mInfo
            long r14 = r5.f16556id
            r24 = 0
            int r5 = r6.cellX
            int r3 = r6.cellY
            r21 = r6
            r22 = r14
            r26 = r5
            r27 = r3
            com.android.launcher3.LauncherModel.addOrMoveItemInDatabase(r20, r21, r22, r24, r26, r27)
        L_0x014e:
            int r3 = r6.cellX
            r4.cellX = r3
            int r3 = r6.cellY
            r4.cellY = r3
            com.android.launcher3.Folder r3 = r0.mFolder
            com.android.launcher3.Launcher r3 = r3.mLauncher
            r16 = -1
            long r5 = r6.f16556id
            int r3 = (int) r5
            r19 = 1
            r14 = r8
            r15 = r13
            r17 = r3
            r18 = r4
            r14.addViewToCellLayout(r15, r16, r17, r18, r19)
            if (r10 >= r11) goto L_0x0175
            boolean r3 = r13 instanceof com.android.launcher3.BubbleTextView
            if (r3 == 0) goto L_0x0175
            com.android.launcher3.BubbleTextView r13 = (com.android.launcher3.BubbleTextView) r13
            r13.verifyHighRes()
        L_0x0175:
            int r10 = r10 + 1
            int r9 = r9 + 1
            int r7 = r7 + 1
            r3 = 0
            r5 = 1
            r6 = -1
            goto L_0x0099
        L_0x0180:
            r1 = 0
        L_0x0181:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0192
            java.lang.Object r1 = r2.next()
            android.view.View r1 = (android.view.View) r1
            r0.removeView(r1)
            r1 = 1
            goto L_0x0181
        L_0x0192:
            if (r1 == 0) goto L_0x0199
            r1 = 0
            r0.setCurrentPage(r1)
            goto L_0x019a
        L_0x0199:
            r1 = 0
        L_0x019a:
            int r2 = r28.getChildCount()
            r3 = 1
            if (r2 <= r3) goto L_0x01a3
            r2 = 1
            goto L_0x01a4
        L_0x01a3:
            r2 = 0
        L_0x01a4:
            r0.mAllowOverScroll = r2
            com.android.launcher3.PageIndicator r2 = r0.mPageIndicator
            int r4 = r28.getChildCount()
            if (r4 <= r3) goto L_0x01af
            goto L_0x01b1
        L_0x01af:
            r1 = 8
        L_0x01b1:
            r2.setVisibility(r1)
            com.android.launcher3.Folder r1 = r0.mFolder
            com.android.launcher3.ExtendedEditText r1 = r1.mFolderName
            int r2 = r28.getChildCount()
            if (r2 <= r3) goto L_0x01c6
            boolean r2 = r0.mIsRtl
            if (r2 == 0) goto L_0x01c4
            r5 = 5
            goto L_0x01c7
        L_0x01c4:
            r5 = 3
            goto L_0x01c7
        L_0x01c6:
            r5 = 1
        L_0x01c7:
            r1.setGravity(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.FolderPagedView.arrangeChildren(java.util.ArrayList, int, boolean):void");
    }

    public final void clearScrollHint() {
        if (getScrollX() != getScrollForPage(getNextPage())) {
            snapToPage(getNextPage(), 750, false, (TimeInterpolator) null);
        }
    }

    public final void completePendingPageChanges() {
        if (!this.mPendingAnimations.isEmpty()) {
            for (Map.Entry entry : new HashMap(this.mPendingAnimations).entrySet()) {
                ((View) entry.getKey()).animate().cancel();
                ((Runnable) entry.getValue()).run();
            }
        }
    }

    public final View createNewView(ShortcutInfo shortcutInfo) {
        BubbleTextView bubbleTextView = (BubbleTextView) this.mInflater.inflate(R.layout.folder_application, (ViewGroup) null, false);
        bubbleTextView.applyFromShortcutInfo(shortcutInfo, this.mIconCache, false);
        bubbleTextView.setOnClickListener(this.mFolder);
        bubbleTextView.setOnLongClickListener(this.mFolder);
        if (DeepShortcutManagerCompat.supportsShortcuts(shortcutInfo)) {
            bubbleTextView.setOnTouchListener(new ShortcutsContainerListener(bubbleTextView));
        }
        bubbleTextView.setOnFocusChangeListener(this.mFocusIndicatorView);
        bubbleTextView.setOnKeyListener(this.mKeyListener);
        bubbleTextView.setLayoutParams(new CellLayout.LayoutParams(shortcutInfo.cellX, shortcutInfo.cellY, shortcutInfo.spanX, shortcutInfo.spanY));
        return bubbleTextView;
    }

    /* access modifiers changed from: protected */
    public final int getChildGap() {
        return getPaddingLeft() + getPaddingRight();
    }

    public final int getDesiredWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        CellLayout cellLayout = (CellLayout) getChildAt(0);
        int paddingLeft = cellLayout.getPaddingLeft();
        int paddingRight = cellLayout.getPaddingRight();
        int i = cellLayout.mCountX;
        int i2 = cellLayout.mCellWidth;
        Math.max(i - 1, 0);
        int i3 = cellLayout.mWidthGap;
        return paddingLeft + paddingRight + (i * i2) + getPaddingLeft() + getPaddingRight();
    }

    /* access modifiers changed from: protected */
    public final void getEdgeVerticalPostion(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = this.mViewport.height();
    }

    public final int getItemCount() {
        int childCount = getChildCount() - 1;
        if (childCount < 0) {
            return 0;
        }
        return ((CellLayout) getChildAt(childCount)).mShortcutsAndWidgets.getChildCount() + (childCount * this.mMaxItemsPerPage);
    }

    public final View getLastItem() {
        if (getChildCount() <= 0) {
            return null;
        }
        ShortcutAndWidgetContainer shortcutAndWidgetContainer = ((CellLayout) getChildAt(getNextPage())).mShortcutsAndWidgets;
        int childCount = shortcutAndWidgetContainer.getChildCount() - 1;
        int i = this.mGridCountX;
        if (i > 0) {
            return shortcutAndWidgetContainer.getChildAt(childCount % i, childCount / i);
        }
        return shortcutAndWidgetContainer.getChildAt(childCount);
    }

    public final /* synthetic */ View getPageAt(int i) {
        return (CellLayout) getChildAt(i);
    }

    /* access modifiers changed from: protected */
    public final PageIndicator.PageMarkerResources getPageIndicatorMarker(int i) {
        return new PageIndicator.PageMarkerResources(R.drawable.ic_pageindicator_current_folder, R.drawable.ic_pageindicator_default_folder);
    }

    public final View iterateOverItems(Workspace.ItemOperator itemOperator) {
        for (int i = 0; i < getChildCount(); i++) {
            CellLayout cellLayout = (CellLayout) getChildAt(i);
            for (int i2 = 0; i2 < cellLayout.mCountY; i2++) {
                for (int i3 = 0; i3 < cellLayout.mCountX; i3++) {
                    View childAt = cellLayout.mShortcutsAndWidgets.getChildAt(i3, i2);
                    if (childAt != null && itemOperator.evaluate((ItemInfo) childAt.getTag(), childAt, this)) {
                        return childAt;
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void notifyPageSwitchListener() {
        super.notifyPageSwitchListener();
        Folder folder = this.mFolder;
        if (folder != null) {
            folder.updateTextViewFocus();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPageBeginMoving() {
        int[] iArr = sTempPosArray;
        getVisiblePages(iArr);
        for (int i = iArr[0]; i <= sTempPosArray[1]; i++) {
            verifyVisibleHighResIcons(i);
        }
    }

    public final void removeItem(View view) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                ((CellLayout) getChildAt(childCount)).removeView(view);
            } else {
                return;
            }
        }
    }

    public final void setMarkerScale(float f) {
        int childCount = this.mPageIndicator.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mPageIndicator.getChildAt(i);
            childAt.animate().cancel();
            childAt.setScaleX(f);
            childAt.setScaleY(f);
        }
    }

    public final void verifyVisibleHighResIcons(int i) {
        CellLayout cellLayout = (CellLayout) getChildAt(i);
        if (cellLayout != null) {
            ShortcutAndWidgetContainer shortcutAndWidgetContainer = cellLayout.mShortcutsAndWidgets;
            int childCount = shortcutAndWidgetContainer.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    ((BubbleTextView) shortcutAndWidgetContainer.getChildAt(childCount)).verifyHighRes();
                } else {
                    return;
                }
            }
        }
    }
}
