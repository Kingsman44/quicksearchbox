package com.android.launcher3.accessibility;

import android.animation.TimeInterpolator;
import android.app.AlertDialog;
import android.appwidget.AppWidgetProviderInfo;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.launcher3.AppInfo;
import com.android.launcher3.AppWidgetResizeFrame;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.DeleteDropTarget;
import com.android.launcher3.DragController;
import com.android.launcher3.DragSource;
import com.android.launcher3.DropTarget;
import com.android.launcher3.Folder;
import com.android.launcher3.FolderInfo;
import com.android.launcher3.InfoDropTarget;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAppWidgetHostView;
import com.android.launcher3.LauncherAppWidgetInfo;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.PendingAddItemInfo;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.UninstallDropTarget;
import com.android.launcher3.Utilities;
import com.android.launcher3.Workspace;
import com.android.launcher3.shortcuts.DeepShortcutsContainer;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* compiled from: PG */
public class LauncherAccessibilityDelegate extends View.AccessibilityDelegate implements DragController.DragListener {
    protected final SparseArray mActions;
    public DragInfo mDragInfo = null;
    private AccessibilityDragSource mDragSource = null;
    final Launcher mLauncher;

    /* compiled from: PG */
    public interface AccessibilityDragSource {
        void enableAccessibleDrag(boolean z);

        void startDrag(CellLayout.CellInfo cellInfo, boolean z);
    }

    /* compiled from: PG */
    public final class DragInfo {
        public int dragType$ar$edu;
        public ItemInfo info;
        public View item;
    }

    public LauncherAccessibilityDelegate(Launcher launcher) {
        SparseArray sparseArray = new SparseArray();
        this.mActions = sparseArray;
        this.mLauncher = launcher;
        sparseArray.put(R.id.action_remove, new AccessibilityNodeInfo.AccessibilityAction(R.id.action_remove, launcher.getText(R.string.delete_target_label)));
        sparseArray.put(R.id.action_info, new AccessibilityNodeInfo.AccessibilityAction(R.id.action_info, launcher.getText(R.string.info_target_label)));
        sparseArray.put(R.id.action_uninstall, new AccessibilityNodeInfo.AccessibilityAction(R.id.action_uninstall, launcher.getText(R.string.delete_target_uninstall_label)));
        sparseArray.put(R.id.action_add_to_workspace, new AccessibilityNodeInfo.AccessibilityAction(R.id.action_add_to_workspace, launcher.getText(R.string.action_add_to_workspace)));
        sparseArray.put(R.id.action_move, new AccessibilityNodeInfo.AccessibilityAction(R.id.action_move, launcher.getText(R.string.action_move)));
        sparseArray.put(R.id.action_move_to_workspace, new AccessibilityNodeInfo.AccessibilityAction(R.id.action_move_to_workspace, launcher.getText(R.string.action_move_to_workspace)));
        sparseArray.put(R.id.action_resize, new AccessibilityNodeInfo.AccessibilityAction(R.id.action_resize, launcher.getText(R.string.action_resize)));
        sparseArray.put(R.id.action_deep_shortcuts, new AccessibilityNodeInfo.AccessibilityAction(R.id.action_deep_shortcuts, launcher.getText(R.string.action_deep_shortcut)));
    }

    private static final ArrayList getSupportedResizeActions$ar$ds(View view, LauncherAppWidgetInfo launcherAppWidgetInfo) {
        ArrayList arrayList = new ArrayList();
        AppWidgetProviderInfo appWidgetInfo = ((LauncherAppWidgetHostView) view).getAppWidgetInfo();
        if (appWidgetInfo == null) {
            return arrayList;
        }
        CellLayout cellLayout = (CellLayout) view.getParent().getParent();
        if ((appWidgetInfo.resizeMode & 1) != 0) {
            if (cellLayout.isRegionVacant(launcherAppWidgetInfo.cellX + launcherAppWidgetInfo.spanX, launcherAppWidgetInfo.cellY, 1, launcherAppWidgetInfo.spanY) || cellLayout.isRegionVacant(launcherAppWidgetInfo.cellX - 1, launcherAppWidgetInfo.cellY, 1, launcherAppWidgetInfo.spanY)) {
                arrayList.add(Integer.valueOf(R.string.action_increase_width));
            }
            int i = launcherAppWidgetInfo.spanX;
            if (i > launcherAppWidgetInfo.minSpanX && i > 1) {
                arrayList.add(Integer.valueOf(R.string.action_decrease_width));
            }
        }
        if ((appWidgetInfo.resizeMode & 2) != 0) {
            if (cellLayout.isRegionVacant(launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY + launcherAppWidgetInfo.spanY, launcherAppWidgetInfo.spanX, 1) || cellLayout.isRegionVacant(launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY - 1, launcherAppWidgetInfo.spanX, 1)) {
                arrayList.add(Integer.valueOf(R.string.action_increase_height));
            }
            int i2 = launcherAppWidgetInfo.spanY;
            if (i2 > launcherAppWidgetInfo.minSpanY && i2 > 1) {
                arrayList.add(Integer.valueOf(R.string.action_decrease_height));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void addActions(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        if (view.getTag() instanceof ItemInfo) {
            ItemInfo itemInfo = (ItemInfo) view.getTag();
            if ((view instanceof BubbleTextView) && ((BubbleTextView) view).hasDeepShortcuts()) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) this.mActions.get(R.id.action_deep_shortcuts));
            }
            if (DeleteDropTarget.supportsDrop(itemInfo)) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) this.mActions.get(R.id.action_remove));
            }
            if (UninstallDropTarget.supportsDrop(view.getContext(), (Object) itemInfo)) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) this.mActions.get(R.id.action_uninstall));
            }
            view.getContext();
            if (InfoDropTarget.supportsDrop$ar$ds(itemInfo)) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) this.mActions.get(R.id.action_info));
            }
            if ((itemInfo instanceof ShortcutInfo) || (itemInfo instanceof LauncherAppWidgetInfo) || (itemInfo instanceof FolderInfo)) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) this.mActions.get(R.id.action_move));
                if (itemInfo.container >= 0) {
                    accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) this.mActions.get(R.id.action_move_to_workspace));
                } else if ((itemInfo instanceof LauncherAppWidgetInfo) && !getSupportedResizeActions$ar$ds(view, (LauncherAppWidgetInfo) itemInfo).isEmpty()) {
                    accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) this.mActions.get(R.id.action_resize));
                }
            }
            if ((itemInfo instanceof AppInfo) || (itemInfo instanceof PendingAddItemInfo)) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) this.mActions.get(R.id.action_add_to_workspace));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void announceConfirmation(int i) {
        announceConfirmation(this.mLauncher.getResources().getString(i));
    }

    /* access modifiers changed from: protected */
    public final long findSpaceOnWorkspace(ItemInfo itemInfo, int[] iArr) {
        Workspace workspace = this.mLauncher.mWorkspace;
        ArrayList arrayList = workspace.mScreenOrder;
        int i = workspace.mCurrentPage;
        long longValue = ((Long) arrayList.get(i)).longValue();
        boolean findCellForSpan = ((CellLayout) workspace.getPageAt(i)).findCellForSpan(iArr, itemInfo.spanX, itemInfo.spanY);
        int hasCustomContent = workspace.hasCustomContent();
        while (!findCellForSpan) {
            if (hasCustomContent < arrayList.size()) {
                longValue = ((Long) arrayList.get(hasCustomContent)).longValue();
                findCellForSpan = ((CellLayout) workspace.getPageAt(hasCustomContent)).findCellForSpan(iArr, itemInfo.spanX, itemInfo.spanY);
                hasCustomContent++;
            } else {
                workspace.addExtraEmptyScreen$ar$ds();
                long commitExtraEmptyScreen = workspace.commitExtraEmptyScreen();
                if (!workspace.getScreenWithId(commitExtraEmptyScreen).findCellForSpan(iArr, itemInfo.spanX, itemInfo.spanY)) {
                    Log.wtf("LauncherAccessibilityDelegate", "Not enough space on an empty screen");
                }
                return commitExtraEmptyScreen;
            }
        }
        return longValue;
    }

    public final void handleAccessibleDrop(View view, Rect rect, String str) {
        if (isInAccessibleDrag()) {
            int[] iArr = new int[2];
            if (rect == null) {
                iArr[0] = view.getWidth() / 2;
                iArr[1] = view.getHeight() / 2;
            } else {
                iArr[0] = rect.centerX();
                iArr[1] = rect.centerY();
            }
            Utilities.getDescendantCoordRelativeToParent(view, this.mLauncher.mDragLayer, iArr, false);
            DragController dragController = this.mLauncher.mDragController;
            int[] iArr2 = dragController.mCoordinatesTemp;
            DropTarget findDropTarget = dragController.findDropTarget(iArr[0], iArr[1], iArr2);
            DropTarget.DragObject dragObject = dragController.mDragObject;
            dragObject.f16552x = iArr2[0];
            dragObject.f16553y = iArr2[1];
            dragController.checkTouchMove(findDropTarget);
            findDropTarget.prepareAccessibilityDrop();
            dragController.drop((float) iArr[0], (float) iArr[1]);
            dragController.endDrag();
            if (!TextUtils.isEmpty(str)) {
                announceConfirmation(str);
            }
        }
    }

    public final boolean isInAccessibleDrag() {
        return this.mDragInfo != null;
    }

    public final void onDragEnd() {
        this.mLauncher.mDragController.mListeners.remove(this);
        this.mDragInfo = null;
        AccessibilityDragSource accessibilityDragSource = this.mDragSource;
        if (accessibilityDragSource != null) {
            accessibilityDragSource.enableAccessibleDrag(false);
            this.mDragSource = null;
        }
    }

    public final void onDragStart$ar$ds(DragSource dragSource, Object obj) {
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        addActions(view, accessibilityNodeInfo);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!(view.getTag() instanceof ItemInfo) || !performAction(view, (ItemInfo) view.getTag(), i)) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        return true;
    }

    public boolean performAction(final View view, final ItemInfo itemInfo, int i) {
        if (i == R.id.action_remove) {
            DeleteDropTarget.removeWorkspaceOrFolderItem(this.mLauncher, itemInfo, view);
            return true;
        } else if (i == R.id.action_info) {
            InfoDropTarget.startDetailsActivityForInfo(itemInfo, this.mLauncher);
            return true;
        } else if (i == R.id.action_uninstall) {
            return UninstallDropTarget.startUninstallActivity(this.mLauncher, itemInfo);
        } else {
            if (i == R.id.action_move) {
                DragInfo dragInfo = new DragInfo();
                this.mDragInfo = dragInfo;
                dragInfo.info = itemInfo;
                dragInfo.item = view;
                dragInfo.dragType$ar$edu = 1;
                if (itemInfo instanceof FolderInfo) {
                    dragInfo.dragType$ar$edu = 2;
                } else if (itemInfo instanceof LauncherAppWidgetInfo) {
                    dragInfo.dragType$ar$edu = 3;
                }
                CellLayout.CellInfo cellInfo = new CellLayout.CellInfo(view, itemInfo);
                Rect rect = new Rect();
                this.mLauncher.mDragLayer.getDescendantRectRelativeToSelf(view, rect);
                DragController dragController = this.mLauncher.mDragController;
                int centerX = rect.centerX();
                int centerY = rect.centerY();
                dragController.mMotionDownX = centerX;
                dragController.mMotionDownY = centerY;
                dragController.mLastDropTarget = null;
                Workspace workspace = this.mLauncher.mWorkspace;
                Folder openFolder = workspace.getOpenFolder();
                if (openFolder != null) {
                    if (openFolder.getItemsInReadingOrder().contains(view)) {
                        this.mDragSource = openFolder;
                    } else {
                        this.mLauncher.closeFolder(true);
                    }
                }
                if (this.mDragSource == null) {
                    this.mDragSource = workspace;
                }
                this.mDragSource.enableAccessibleDrag(true);
                this.mDragSource.startDrag(cellInfo, true);
                DragController dragController2 = this.mLauncher.mDragController;
                if (dragController2.mDragging) {
                    dragController2.mListeners.add(this);
                }
            } else if (i == R.id.action_add_to_workspace) {
                final int[] iArr = new int[2];
                final long findSpaceOnWorkspace = findSpaceOnWorkspace(itemInfo, iArr);
                final ItemInfo itemInfo2 = itemInfo;
                this.mLauncher.showWorkspace$ar$ds(new Runnable() {
                    public final void run() {
                        ItemInfo itemInfo = itemInfo2;
                        if (itemInfo instanceof AppInfo) {
                            ShortcutInfo shortcutInfo = new ShortcutInfo((AppInfo) itemInfo);
                            Launcher launcher = LauncherAccessibilityDelegate.this.mLauncher;
                            long j = findSpaceOnWorkspace;
                            int[] iArr = iArr;
                            LauncherModel.addItemToDatabase(launcher, shortcutInfo, -100, j, iArr[0], iArr[1]);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(shortcutInfo);
                            LauncherAccessibilityDelegate.this.mLauncher.bindItems(arrayList, 0, arrayList.size(), true);
                        } else if (itemInfo instanceof PendingAddItemInfo) {
                            PendingAddItemInfo pendingAddItemInfo = (PendingAddItemInfo) itemInfo;
                            Workspace workspace = LauncherAccessibilityDelegate.this.mLauncher.mWorkspace;
                            workspace.snapToPage(workspace.getPageIndexForScreenId(findSpaceOnWorkspace), 750, false, (TimeInterpolator) null);
                            LauncherAccessibilityDelegate.this.mLauncher.addPendingItem(pendingAddItemInfo, -100, findSpaceOnWorkspace, iArr, pendingAddItemInfo.spanX, pendingAddItemInfo.spanY);
                        }
                        LauncherAccessibilityDelegate.this.announceConfirmation((int) R.string.item_added_to_workspace);
                    }
                });
                return true;
            } else if (i == R.id.action_move_to_workspace) {
                Folder openFolder2 = this.mLauncher.mWorkspace.getOpenFolder();
                this.mLauncher.closeFolder(openFolder2, true);
                ShortcutInfo shortcutInfo = (ShortcutInfo) itemInfo;
                openFolder2.mInfo.remove(shortcutInfo);
                int[] iArr2 = new int[2];
                LauncherModel.moveItemInDatabase(this.mLauncher, shortcutInfo, -100, findSpaceOnWorkspace(itemInfo, iArr2), iArr2[0], iArr2[1]);
                new Handler().post(new Runnable() {
                    public final void run() {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(itemInfo);
                        LauncherAccessibilityDelegate.this.mLauncher.bindItems(arrayList, 0, arrayList.size(), true);
                        LauncherAccessibilityDelegate.this.announceConfirmation((int) R.string.item_moved);
                    }
                });
            } else if (i == R.id.action_resize) {
                final LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) itemInfo;
                final ArrayList supportedResizeActions$ar$ds = getSupportedResizeActions$ar$ds(view, launcherAppWidgetInfo);
                CharSequence[] charSequenceArr = new CharSequence[supportedResizeActions$ar$ds.size()];
                for (int i2 = 0; i2 < supportedResizeActions$ar$ds.size(); i2++) {
                    charSequenceArr[i2] = this.mLauncher.getText(((Integer) supportedResizeActions$ar$ds.get(i2)).intValue());
                }
                new AlertDialog.Builder(this.mLauncher).setTitle(R.string.action_resize).setItems(charSequenceArr, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        LauncherAccessibilityDelegate launcherAccessibilityDelegate = LauncherAccessibilityDelegate.this;
                        int intValue = ((Integer) supportedResizeActions$ar$ds.get(i)).intValue();
                        View view = view;
                        LauncherAppWidgetInfo launcherAppWidgetInfo = launcherAppWidgetInfo;
                        CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) view.getLayoutParams();
                        CellLayout cellLayout = (CellLayout) view.getParent().getParent();
                        cellLayout.markCellsAsUnoccupiedForView(view);
                        if (intValue == R.string.action_increase_width) {
                            if ((view.getLayoutDirection() == 1 && cellLayout.isRegionVacant(launcherAppWidgetInfo.cellX - 1, launcherAppWidgetInfo.cellY, 1, launcherAppWidgetInfo.spanY)) || !cellLayout.isRegionVacant(launcherAppWidgetInfo.cellX + launcherAppWidgetInfo.spanX, launcherAppWidgetInfo.cellY, 1, launcherAppWidgetInfo.spanY)) {
                                layoutParams.cellX--;
                                launcherAppWidgetInfo.cellX--;
                            }
                            layoutParams.cellHSpan++;
                            launcherAppWidgetInfo.spanX++;
                        } else if (intValue == R.string.action_decrease_width) {
                            layoutParams.cellHSpan--;
                            launcherAppWidgetInfo.spanX--;
                        } else if (intValue == R.string.action_increase_height) {
                            if (!cellLayout.isRegionVacant(launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY + launcherAppWidgetInfo.spanY, launcherAppWidgetInfo.spanX, 1)) {
                                layoutParams.cellY--;
                                launcherAppWidgetInfo.cellY--;
                            }
                            layoutParams.cellVSpan++;
                            launcherAppWidgetInfo.spanY++;
                        } else if (intValue == R.string.action_decrease_height) {
                            layoutParams.cellVSpan--;
                            launcherAppWidgetInfo.spanY--;
                        }
                        cellLayout.markCellsAsOccupiedForView(view);
                        Rect rect = new Rect();
                        AppWidgetResizeFrame.getWidgetSizeRanges$ar$ds(launcherAccessibilityDelegate.mLauncher, launcherAppWidgetInfo.spanX, launcherAppWidgetInfo.spanY, rect);
                        ((LauncherAppWidgetHostView) view).updateAppWidgetSize((Bundle) null, rect.left, rect.top, rect.right, rect.bottom);
                        view.requestLayout();
                        LauncherModel.updateItemInDatabase(launcherAccessibilityDelegate.mLauncher, launcherAppWidgetInfo);
                        launcherAccessibilityDelegate.announceConfirmation(launcherAccessibilityDelegate.mLauncher.getString(R.string.widget_resized, new Object[]{Integer.valueOf(launcherAppWidgetInfo.spanX), Integer.valueOf(launcherAppWidgetInfo.spanY)}));
                        dialogInterface.dismiss();
                    }
                }).show();
                return true;
            } else if (i != R.id.action_deep_shortcuts || DeepShortcutsContainer.showForIcon((BubbleTextView) view) == null) {
                return false;
            } else {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void announceConfirmation(String str) {
        this.mLauncher.mDragLayer.announceForAccessibility(str);
    }
}
