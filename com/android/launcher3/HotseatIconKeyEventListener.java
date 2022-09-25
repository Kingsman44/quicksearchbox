package com.android.launcher3;

import android.view.View;

/* compiled from: PG */
final class HotseatIconKeyEventListener implements View.OnKeyListener {
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0107, code lost:
        if (r2 != -2) goto L_0x016b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017b A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKey(android.view.View r18, int r19, android.view.KeyEvent r20) {
        /*
            r17 = this;
            r0 = r18
            boolean r1 = com.android.launcher3.util.FocusLogic.shouldConsume(r19)
            int r2 = r20.getAction()
            r3 = 1
            if (r2 == r3) goto L_0x018e
            if (r1 == 0) goto L_0x018e
            android.content.Context r1 = r18.getContext()
            com.android.launcher3.Launcher r1 = com.android.launcher3.Launcher.getLauncher(r1)
            com.android.launcher3.DeviceProfile r2 = r1.mDeviceProfile
            android.view.View r4 = r18.getRootView()
            r5 = 2131437228(0x7f0b26ac, float:1.8496349E38)
            android.view.View r4 = r4.findViewById(r5)
            com.android.launcher3.Workspace r4 = (com.android.launcher3.Workspace) r4
            android.view.ViewParent r5 = r18.getParent()
            com.android.launcher3.ShortcutAndWidgetContainer r5 = (com.android.launcher3.ShortcutAndWidgetContainer) r5
            android.view.ViewParent r6 = r5.getParent()
            com.android.launcher3.CellLayout r6 = (com.android.launcher3.CellLayout) r6
            java.lang.Object r7 = r18.getTag()
            com.android.launcher3.ItemInfo r7 = (com.android.launcher3.ItemInfo) r7
            int r14 = r4.getNextPage()
            int r12 = r4.getChildCount()
            int r8 = r5.indexOfChild(r0)
            com.android.launcher3.ShortcutAndWidgetContainer r9 = r6.mShortcutsAndWidgets
            android.view.View r9 = r9.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            com.android.launcher3.CellLayout$LayoutParams r9 = (com.android.launcher3.CellLayout.LayoutParams) r9
            int r9 = r9.cellX
            android.view.View r9 = r4.getChildAt(r14)
            com.android.launcher3.CellLayout r9 = (com.android.launcher3.CellLayout) r9
            if (r9 != 0) goto L_0x005d
        L_0x005a:
            r1 = 1
            goto L_0x018e
        L_0x005d:
            com.android.launcher3.ShortcutAndWidgetContainer r15 = r9.mShortcutsAndWidgets
            r10 = 19
            r13 = 0
            r11 = r19
            if (r11 != r10) goto L_0x0080
            boolean r11 = r2.isVerticalBarLayout()
            if (r11 != 0) goto L_0x0081
            com.android.launcher3.InvariantDeviceProfile r1 = r2.inv
            int r1 = r1.hotseatAllAppsRank
            int[][] r1 = com.android.launcher3.util.FocusLogic.createSparseMatrixWithHotseat(r9, r6, r3, r1)
            int r2 = r15.getChildCount()
            int r8 = r8 + r2
            r9 = r1
            r10 = r8
            r5 = r15
            r1 = 19
            goto L_0x00df
        L_0x0080:
            r10 = r11
        L_0x0081:
            r11 = 21
            if (r10 != r11) goto L_0x009f
            boolean r16 = r2.isVerticalBarLayout()
            if (r16 == 0) goto L_0x009d
            com.android.launcher3.InvariantDeviceProfile r1 = r2.inv
            int r1 = r1.hotseatAllAppsRank
            int[][] r1 = com.android.launcher3.util.FocusLogic.createSparseMatrixWithHotseat(r9, r6, r13, r1)
            int r2 = r15.getChildCount()
            int r8 = r8 + r2
            r9 = r1
            r1 = r10
            r5 = r15
        L_0x009b:
            r10 = r8
            goto L_0x00df
        L_0x009d:
            r10 = 21
        L_0x009f:
            r11 = 22
            if (r10 != r11) goto L_0x00b3
            boolean r2 = r2.isVerticalBarLayout()
            if (r2 == 0) goto L_0x00b1
            r10 = 93
            r10 = r8
            r1 = 93
            r5 = 0
            r9 = 0
            goto L_0x00df
        L_0x00b1:
            r10 = 22
        L_0x00b3:
            boolean r2 = com.android.launcher3.FocusHelper.isUninstallKeyChord(r20)
            if (r2 == 0) goto L_0x00c7
            int[][] r2 = com.android.launcher3.util.FocusLogic.createSparseMatrix(r9)
            boolean r5 = com.android.launcher3.UninstallDropTarget.supportsDrop((android.content.Context) r1, (java.lang.Object) r7)
            if (r5 == 0) goto L_0x00d4
            com.android.launcher3.UninstallDropTarget.startUninstallActivity(r1, r7)
            goto L_0x00d4
        L_0x00c7:
            boolean r2 = com.android.launcher3.FocusHelper.isDeleteKeyChord(r20)
            if (r2 == 0) goto L_0x00d8
            int[][] r2 = com.android.launcher3.util.FocusLogic.createSparseMatrix(r9)
            r1.removeItem$ar$ds(r0, r7, r3)
        L_0x00d4:
            r9 = r2
            r1 = r10
            r5 = 0
            goto L_0x009b
        L_0x00d8:
            int[][] r1 = com.android.launcher3.util.FocusLogic.createSparseMatrix(r6)
            r9 = r1
            r1 = r10
            goto L_0x009b
        L_0x00df:
            android.content.res.Resources r2 = r18.getResources()
            boolean r2 = com.android.launcher3.Utilities.isRtl(r2)
            r8 = r1
            r6 = 0
            r11 = r14
            r7 = 0
            r13 = r2
            int r2 = com.android.launcher3.util.FocusLogic.handleKeyEvent(r8, r9, r10, r11, r12, r13)
            r8 = -10
            r9 = 750(0x2ee, float:1.051E-42)
            if (r2 == r8) goto L_0x0153
            r8 = -9
            if (r2 == r8) goto L_0x0153
            r8 = -8
            if (r2 == r8) goto L_0x0146
            r8 = -5
            if (r2 == r8) goto L_0x012c
            r8 = -4
            if (r2 == r8) goto L_0x0118
            r8 = -3
            if (r2 == r8) goto L_0x010a
            r8 = -2
            if (r2 == r8) goto L_0x012c
            goto L_0x016b
        L_0x010a:
            int r14 = r14 + -1
            com.android.launcher3.ShortcutAndWidgetContainer r5 = com.android.launcher3.FocusHelper.getCellLayoutChildrenForIndex(r4, r14)
            android.view.View r11 = r5.getChildAt(r7)
            r4.snapToPage(r14, r9, r7, r6)
            goto L_0x016c
        L_0x0118:
            int r14 = r14 + -1
            com.android.launcher3.ShortcutAndWidgetContainer r5 = com.android.launcher3.FocusHelper.getCellLayoutChildrenForIndex(r4, r14)
            int r8 = r5.getChildCount()
            int r8 = r8 + -1
            android.view.View r11 = r5.getChildAt(r8)
            r4.snapToPage(r14, r9, r7, r6)
            goto L_0x016c
        L_0x012c:
            int r14 = r14 + -1
            r4.snapToPage(r14, r9, r7, r6)
            android.view.View r4 = r4.getPageAt(r14)
            com.android.launcher3.CellLayout r4 = (com.android.launcher3.CellLayout) r4
            com.android.launcher3.ShortcutAndWidgetContainer r4 = r4.mShortcutsAndWidgets
            android.view.View r4 = r4.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            com.android.launcher3.CellLayout$LayoutParams r4 = (com.android.launcher3.CellLayout.LayoutParams) r4
            boolean r4 = r4.isFullscreen
            goto L_0x016b
        L_0x0146:
            int r14 = r14 + r3
            com.android.launcher3.ShortcutAndWidgetContainer r5 = com.android.launcher3.FocusHelper.getCellLayoutChildrenForIndex(r4, r14)
            android.view.View r11 = r5.getChildAt(r7)
            r4.snapToPage(r14, r9, r7, r6)
            goto L_0x016c
        L_0x0153:
            int r14 = r14 + r3
            r4.snapToPage(r14, r9, r7, r6)
            android.view.View r4 = r4.getPageAt(r14)
            com.android.launcher3.CellLayout r4 = (com.android.launcher3.CellLayout) r4
            com.android.launcher3.ShortcutAndWidgetContainer r4 = r4.mShortcutsAndWidgets
            android.view.View r4 = r4.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            com.android.launcher3.CellLayout$LayoutParams r4 = (com.android.launcher3.CellLayout.LayoutParams) r4
            boolean r4 = r4.isFullscreen
        L_0x016b:
            r11 = r6
        L_0x016c:
            if (r5 != r15) goto L_0x0179
            int r4 = r15.getChildCount()
            if (r2 < r4) goto L_0x0179
            int r4 = r15.getChildCount()
            int r2 = r2 - r4
        L_0x0179:
            if (r5 == 0) goto L_0x005a
            if (r11 != 0) goto L_0x0183
            if (r2 < 0) goto L_0x0183
            android.view.View r11 = r5.getChildAt(r2)
        L_0x0183:
            if (r11 != 0) goto L_0x0187
            goto L_0x005a
        L_0x0187:
            r11.requestFocus()
            com.android.launcher3.FocusHelper.playSoundEffect(r1, r0)
            return r3
        L_0x018e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.HotseatIconKeyEventListener.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }
}
