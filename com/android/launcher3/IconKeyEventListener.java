package com.android.launcher3;

import android.view.View;

/* compiled from: PG */
final class IconKeyEventListener implements View.OnKeyListener {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e1 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKey(android.view.View r23, int r24, android.view.KeyEvent r25) {
        /*
            r22 = this;
            r0 = r23
            boolean r1 = com.android.launcher3.util.FocusLogic.shouldConsume(r24)
            int r2 = r25.getAction()
            r3 = 1
            if (r2 == r3) goto L_0x01eb
            if (r1 == 0) goto L_0x01eb
            android.content.Context r1 = r23.getContext()
            com.android.launcher3.Launcher r1 = com.android.launcher3.Launcher.getLauncher(r1)
            com.android.launcher3.DeviceProfile r2 = r1.mDeviceProfile
            android.view.ViewParent r4 = r23.getParent()
            com.android.launcher3.ShortcutAndWidgetContainer r4 = (com.android.launcher3.ShortcutAndWidgetContainer) r4
            android.view.ViewParent r5 = r4.getParent()
            com.android.launcher3.CellLayout r5 = (com.android.launcher3.CellLayout) r5
            android.view.ViewParent r6 = r5.getParent()
            com.android.launcher3.Workspace r6 = (com.android.launcher3.Workspace) r6
            android.view.ViewParent r7 = r6.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r8 = 2131435567(0x7f0b202f, float:1.849298E38)
            android.view.View r8 = r7.findViewById(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r9 = 2131432284(0x7f0b135c, float:1.8486321E38)
            android.view.View r7 = r7.findViewById(r9)
            com.android.launcher3.Hotseat r7 = (com.android.launcher3.Hotseat) r7
            java.lang.Object r9 = r23.getTag()
            com.android.launcher3.ItemInfo r9 = (com.android.launcher3.ItemInfo) r9
            int r12 = r4.indexOfChild(r0)
            int r15 = r6.indexOfChild(r5)
            int r20 = r6.getChildCount()
            r14 = 0
            android.view.View r7 = r7.getChildAt(r14)
            com.android.launcher3.CellLayout r7 = (com.android.launcher3.CellLayout) r7
            com.android.launcher3.ShortcutAndWidgetContainer r13 = r7.mShortcutsAndWidgets
            r10 = 20
            r11 = r24
            if (r11 != r10) goto L_0x0076
            boolean r11 = r2.isVerticalBarLayout()
            if (r11 != 0) goto L_0x0077
            com.android.launcher3.InvariantDeviceProfile r1 = r2.inv
            int r1 = r1.hotseatAllAppsRank
            int[][] r1 = com.android.launcher3.util.FocusLogic.createSparseMatrixWithHotseat(r5, r7, r3, r1)
            r11 = r1
            r1 = 20
            goto L_0x00b6
        L_0x0076:
            r10 = r11
        L_0x0077:
            r11 = 22
            if (r10 != r11) goto L_0x008d
            boolean r16 = r2.isVerticalBarLayout()
            if (r16 == 0) goto L_0x008b
            com.android.launcher3.InvariantDeviceProfile r1 = r2.inv
            int r1 = r1.hotseatAllAppsRank
            int[][] r1 = com.android.launcher3.util.FocusLogic.createSparseMatrixWithHotseat(r5, r7, r14, r1)
        L_0x0089:
            r11 = r1
            goto L_0x00a1
        L_0x008b:
            r10 = 22
        L_0x008d:
            boolean r2 = com.android.launcher3.FocusHelper.isUninstallKeyChord(r25)
            if (r2 == 0) goto L_0x00a3
            int[][] r2 = com.android.launcher3.util.FocusLogic.createSparseMatrix(r5)
            boolean r5 = com.android.launcher3.UninstallDropTarget.supportsDrop((android.content.Context) r1, (java.lang.Object) r9)
            if (r5 == 0) goto L_0x00a0
            com.android.launcher3.UninstallDropTarget.startUninstallActivity(r1, r9)
        L_0x00a0:
            r11 = r2
        L_0x00a1:
            r1 = r10
            goto L_0x00b6
        L_0x00a3:
            boolean r2 = com.android.launcher3.FocusHelper.isDeleteKeyChord(r25)
            if (r2 == 0) goto L_0x00b1
            int[][] r2 = com.android.launcher3.util.FocusLogic.createSparseMatrix(r5)
            r1.removeItem$ar$ds(r0, r9, r3)
            goto L_0x00a0
        L_0x00b1:
            int[][] r1 = com.android.launcher3.util.FocusLogic.createSparseMatrix(r5)
            goto L_0x0089
        L_0x00b6:
            android.content.res.Resources r2 = r23.getResources()
            boolean r2 = com.android.launcher3.Utilities.isRtl(r2)
            r10 = r1
            r5 = r13
            r13 = r15
            r9 = 0
            r14 = r20
            r3 = r15
            r15 = r2
            int r2 = com.android.launcher3.util.FocusLogic.handleKeyEvent(r10, r11, r12, r13, r14, r15)
            android.content.res.Resources r10 = r23.getResources()
            boolean r10 = com.android.launcher3.Utilities.isRtl(r10)
            android.view.View r11 = r6.getChildAt(r3)
            com.android.launcher3.CellLayout r11 = (com.android.launcher3.CellLayout) r11
            r12 = -4
            r13 = -8
            r14 = -1
            r15 = 0
            switch(r2) {
                case -10: goto L_0x017c;
                case -9: goto L_0x0135;
                case -8: goto L_0x012f;
                case -7: goto L_0x0123;
                case -6: goto L_0x0117;
                case -5: goto L_0x0135;
                case -4: goto L_0x0111;
                case -3: goto L_0x00f8;
                case -2: goto L_0x017c;
                case -1: goto L_0x00ed;
                default: goto L_0x00df;
            }
        L_0x00df:
            if (r2 < 0) goto L_0x01c5
            int r3 = r4.getChildCount()
            if (r2 >= r3) goto L_0x01c5
            android.view.View r8 = r4.getChildAt(r2)
            goto L_0x01df
        L_0x00ed:
            r2 = 19
            if (r1 != r2) goto L_0x00f5
            r1 = 19
            goto L_0x01df
        L_0x00f5:
            r8 = r15
            goto L_0x01df
        L_0x00f8:
            int r2 = r3 + -1
            android.view.View r3 = r6.getChildAt(r2)
            com.android.launcher3.CellLayout r3 = (com.android.launcher3.CellLayout) r3
            android.view.View r8 = com.android.launcher3.FocusHelper.getFirstFocusableIconInReadingOrder(r3, r10)
            if (r8 != 0) goto L_0x01df
            android.view.View r8 = com.android.launcher3.FocusHelper.getFirstFocusableIconInReadingOrder(r7, r10)
            r3 = 750(0x2ee, float:1.051E-42)
            r6.snapToPage(r2, r3, r9, r15)
            goto L_0x01df
        L_0x0111:
            android.view.View r8 = com.android.launcher3.FocusHelper.handlePreviousPageLastItem(r6, r7, r3, r10)
            goto L_0x01df
        L_0x0117:
            android.view.View r8 = com.android.launcher3.FocusHelper.getFirstFocusableIconInReadingOrder(r11, r10)
            if (r8 != 0) goto L_0x01df
            android.view.View r8 = com.android.launcher3.FocusHelper.getFirstFocusableIconInReadingOrder(r7, r10)
            goto L_0x01df
        L_0x0123:
            android.view.View r8 = com.android.launcher3.FocusHelper.getFirstFocusableIconInReverseReadingOrder(r11, r10)
            if (r8 != 0) goto L_0x01df
            android.view.View r8 = com.android.launcher3.FocusHelper.getFirstFocusableIconInReverseReadingOrder(r7, r10)
            goto L_0x01df
        L_0x012f:
            android.view.View r8 = com.android.launcher3.FocusHelper.handleNextPageFirstItem(r6, r7, r3, r10)
            goto L_0x01df
        L_0x0135:
            int r4 = r3 + 1
            r5 = -5
            if (r2 != r5) goto L_0x013d
            int r2 = r3 + -1
            goto L_0x013e
        L_0x013d:
            r2 = r4
        L_0x013e:
            android.view.ViewGroup$LayoutParams r4 = r23.getLayoutParams()
            com.android.launcher3.CellLayout$LayoutParams r4 = (com.android.launcher3.CellLayout.LayoutParams) r4
            int r4 = r4.cellY
            com.android.launcher3.ShortcutAndWidgetContainer r5 = com.android.launcher3.FocusHelper.getCellLayoutChildrenForIndex(r6, r2)
            if (r5 == 0) goto L_0x00f5
            android.view.ViewParent r8 = r5.getParent()
            com.android.launcher3.CellLayout r8 = (com.android.launcher3.CellLayout) r8
            int[][] r17 = com.android.launcher3.util.FocusLogic.createSparseMatrixWithPivotColumn(r8, r14, r4)
            r18 = 100
            android.content.res.Resources r4 = r23.getResources()
            boolean r21 = com.android.launcher3.Utilities.isRtl(r4)
            r16 = r1
            r19 = r2
            int r2 = com.android.launcher3.util.FocusLogic.handleKeyEvent(r16, r17, r18, r19, r20, r21)
            if (r2 != r13) goto L_0x0170
            android.view.View r8 = com.android.launcher3.FocusHelper.handleNextPageFirstItem(r6, r7, r3, r10)
            goto L_0x01df
        L_0x0170:
            if (r2 != r12) goto L_0x0177
            android.view.View r8 = com.android.launcher3.FocusHelper.handlePreviousPageLastItem(r6, r7, r3, r10)
            goto L_0x01df
        L_0x0177:
            android.view.View r8 = r5.getChildAt(r2)
            goto L_0x01df
        L_0x017c:
            int r4 = r3 + -1
            r5 = -10
            if (r2 != r5) goto L_0x0185
            int r2 = r3 + 1
            goto L_0x0186
        L_0x0185:
            r2 = r4
        L_0x0186:
            android.view.ViewGroup$LayoutParams r4 = r23.getLayoutParams()
            com.android.launcher3.CellLayout$LayoutParams r4 = (com.android.launcher3.CellLayout.LayoutParams) r4
            int r4 = r4.cellY
            com.android.launcher3.ShortcutAndWidgetContainer r5 = com.android.launcher3.FocusHelper.getCellLayoutChildrenForIndex(r6, r2)
            if (r5 == 0) goto L_0x00f5
            android.view.ViewParent r8 = r5.getParent()
            com.android.launcher3.CellLayout r8 = (com.android.launcher3.CellLayout) r8
            int r9 = r8.mCountX
            int[][] r17 = com.android.launcher3.util.FocusLogic.createSparseMatrixWithPivotColumn(r8, r9, r4)
            r18 = 100
            android.content.res.Resources r4 = r23.getResources()
            boolean r21 = com.android.launcher3.Utilities.isRtl(r4)
            r16 = r1
            r19 = r2
            int r2 = com.android.launcher3.util.FocusLogic.handleKeyEvent(r16, r17, r18, r19, r20, r21)
            if (r2 != r13) goto L_0x01b9
            android.view.View r8 = com.android.launcher3.FocusHelper.handleNextPageFirstItem(r6, r7, r3, r10)
            goto L_0x01df
        L_0x01b9:
            if (r2 != r12) goto L_0x01c0
            android.view.View r8 = com.android.launcher3.FocusHelper.handlePreviousPageLastItem(r6, r7, r3, r10)
            goto L_0x01df
        L_0x01c0:
            android.view.View r8 = r5.getChildAt(r2)
            goto L_0x01df
        L_0x01c5:
            int r3 = r4.getChildCount()
            if (r3 > r2) goto L_0x00f5
            int r3 = r4.getChildCount()
            int r6 = r5.getChildCount()
            int r3 = r3 + r6
            if (r2 >= r3) goto L_0x00f5
            int r3 = r4.getChildCount()
            int r2 = r2 - r3
            android.view.View r8 = r5.getChildAt(r2)
        L_0x01df:
            if (r8 != 0) goto L_0x01e3
            r1 = 1
            goto L_0x01eb
        L_0x01e3:
            r8.requestFocus()
            com.android.launcher3.FocusHelper.playSoundEffect(r1, r0)
            r0 = 1
            return r0
        L_0x01eb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.IconKeyEventListener.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }
}
