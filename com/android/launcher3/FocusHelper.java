package com.android.launcher3;

import android.animation.TimeInterpolator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.launcher3.CellLayout;
import com.android.launcher3.util.FocusLogic;
import org.chromium.net.NetError;

/* compiled from: PG */
public final class FocusHelper {

    /* compiled from: PG */
    public final class PagedFolderKeyEventListener implements View.OnKeyListener {
        private final Folder mFolder;

        public PagedFolderKeyEventListener(Folder folder) {
            this.mFolder = folder;
        }

        public final void handleNoopKey(int i, View view) {
            if (i == 20) {
                this.mFolder.mFolderName.requestFocus();
                FocusHelper.playSoundEffect(20, view);
            }
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            View view2 = view;
            int i2 = i;
            boolean shouldConsume = FocusLogic.shouldConsume(i);
            if (keyEvent.getAction() == 1) {
                return shouldConsume;
            }
            int i3 = 0;
            if (!(view.getParent() instanceof ShortcutAndWidgetContainer)) {
                return false;
            }
            ShortcutAndWidgetContainer shortcutAndWidgetContainer = (ShortcutAndWidgetContainer) view.getParent();
            CellLayout cellLayout = (CellLayout) shortcutAndWidgetContainer.getParent();
            int indexOfChild = shortcutAndWidgetContainer.indexOfChild(view2);
            FolderPagedView folderPagedView = (FolderPagedView) cellLayout.getParent();
            int indexOfChild2 = folderPagedView.indexOfChild(cellLayout);
            int childCount = folderPagedView.getChildCount();
            boolean isRtl = Utilities.isRtl(view.getResources());
            int[][] createSparseMatrix = FocusLogic.createSparseMatrix(cellLayout);
            int[][] iArr = createSparseMatrix;
            int handleKeyEvent = FocusLogic.handleKeyEvent(i, createSparseMatrix, indexOfChild, indexOfChild2, childCount, isRtl);
            if (handleKeyEvent == -1) {
                handleNoopKey(i2, view2);
                return shouldConsume;
            }
            View view3 = null;
            switch (handleKeyEvent) {
                case NetError.ERR_ACCESS_DENIED /*-10*/:
                case NetError.ERR_UNEXPECTED /*-9*/:
                    int i4 = indexOfChild2 + 1;
                    ShortcutAndWidgetContainer cellLayoutChildrenForIndex = FocusHelper.getCellLayoutChildrenForIndex(folderPagedView, i4);
                    if (cellLayoutChildrenForIndex != null) {
                        folderPagedView.snapToPage(i4, 750, false, (TimeInterpolator) null);
                        int i5 = ((CellLayout.LayoutParams) view.getLayoutParams()).cellY;
                        if (!(cellLayoutChildrenForIndex.invertLayoutHorizontally() ^ (handleKeyEvent == -9))) {
                            i3 = ((CellLayout) cellLayoutChildrenForIndex.getParent()).mCountX - 1;
                        }
                        while (true) {
                            if (i3 < 0) {
                                break;
                            } else {
                                int i6 = i5;
                                while (i6 >= 0) {
                                    View childAt = cellLayoutChildrenForIndex.getChildAt(i3, i6);
                                    if (childAt != null) {
                                        view3 = childAt;
                                        break;
                                    } else {
                                        i6--;
                                    }
                                }
                                i3--;
                            }
                        }
                    }
                    break;
                case NetError.ERR_FILE_TOO_BIG /*-8*/:
                    int i7 = indexOfChild2 + 1;
                    ShortcutAndWidgetContainer cellLayoutChildrenForIndex2 = FocusHelper.getCellLayoutChildrenForIndex(folderPagedView, i7);
                    if (cellLayoutChildrenForIndex2 != null) {
                        folderPagedView.snapToPage(i7, 750, false, (TimeInterpolator) null);
                        view3 = cellLayoutChildrenForIndex2.getChildAt(0, 0);
                        break;
                    }
                    break;
                case NetError.ERR_TIMED_OUT /*-7*/:
                    view3 = folderPagedView.getLastItem();
                    break;
                case -6:
                    view3 = cellLayout.mShortcutsAndWidgets.getChildAt(0, 0);
                    break;
                case -5:
                case -2:
                    int i8 = indexOfChild2 - 1;
                    ShortcutAndWidgetContainer cellLayoutChildrenForIndex3 = FocusHelper.getCellLayoutChildrenForIndex(folderPagedView, i8);
                    if (cellLayoutChildrenForIndex3 != null) {
                        int i9 = ((CellLayout.LayoutParams) view.getLayoutParams()).cellY;
                        folderPagedView.snapToPage(i8, 750, false, (TimeInterpolator) null);
                        if (!((handleKeyEvent == -5) ^ cellLayoutChildrenForIndex3.invertLayoutHorizontally())) {
                            i3 = iArr.length - 1;
                        }
                        view3 = cellLayoutChildrenForIndex3.getChildAt(i3, i9);
                        break;
                    }
                    break;
                case -4:
                    int i10 = indexOfChild2 - 1;
                    ShortcutAndWidgetContainer cellLayoutChildrenForIndex4 = FocusHelper.getCellLayoutChildrenForIndex(folderPagedView, i10);
                    if (cellLayoutChildrenForIndex4 != null) {
                        folderPagedView.snapToPage(i10, 750, false, (TimeInterpolator) null);
                        view3 = cellLayoutChildrenForIndex4.getChildAt(iArr.length - 1, iArr[0].length - 1);
                        break;
                    }
                    break;
                case -3:
                    int i11 = indexOfChild2 - 1;
                    ShortcutAndWidgetContainer cellLayoutChildrenForIndex5 = FocusHelper.getCellLayoutChildrenForIndex(folderPagedView, i11);
                    if (cellLayoutChildrenForIndex5 != null) {
                        folderPagedView.snapToPage(i11, 750, false, (TimeInterpolator) null);
                        view3 = cellLayoutChildrenForIndex5.getChildAt(0, 0);
                        break;
                    }
                    break;
                default:
                    view3 = shortcutAndWidgetContainer.getChildAt(handleKeyEvent);
                    break;
            }
            if (view3 != null) {
                view3.requestFocus();
                FocusHelper.playSoundEffect(i2, view2);
            } else {
                handleNoopKey(i2, view2);
            }
            return shouldConsume;
        }
    }

    static ShortcutAndWidgetContainer getCellLayoutChildrenForIndex(ViewGroup viewGroup, int i) {
        return ((CellLayout) viewGroup.getChildAt(i)).mShortcutsAndWidgets;
    }

    public static View getFirstFocusableIconInReadingOrder(CellLayout cellLayout, boolean z) {
        int i = cellLayout.mCountX;
        for (int i2 = 0; i2 < cellLayout.mCountY; i2++) {
            int i3 = 1;
            if (true == z) {
                i3 = -1;
            }
            int i4 = z ? i - 1 : 0;
            while (i4 >= 0 && i4 < i) {
                View childAt = cellLayout.mShortcutsAndWidgets.getChildAt(i4, i2);
                if (childAt != null && childAt.isFocusable()) {
                    return childAt;
                }
                i4 += i3;
            }
        }
        return null;
    }

    public static View getFirstFocusableIconInReverseReadingOrder(CellLayout cellLayout, boolean z) {
        int i = cellLayout.mCountX;
        for (int i2 = cellLayout.mCountY - 1; i2 >= 0; i2--) {
            int i3 = 1;
            if (true != z) {
                i3 = -1;
            }
            int i4 = z ? 0 : i - 1;
            while (i4 >= 0 && i4 < i) {
                View childAt = cellLayout.mShortcutsAndWidgets.getChildAt(i4, i2);
                if (childAt != null && childAt.isFocusable()) {
                    return childAt;
                }
                i4 += i3;
            }
        }
        return null;
    }

    public static View handleNextPageFirstItem(Workspace workspace, CellLayout cellLayout, int i, boolean z) {
        int i2 = i + 1;
        if (i2 >= workspace.getChildCount()) {
            return null;
        }
        View firstFocusableIconInReadingOrder = getFirstFocusableIconInReadingOrder((CellLayout) workspace.getChildAt(i2), z);
        if (firstFocusableIconInReadingOrder != null) {
            return firstFocusableIconInReadingOrder;
        }
        View firstFocusableIconInReadingOrder2 = getFirstFocusableIconInReadingOrder(cellLayout, z);
        workspace.snapToPage(i2, 750, false, (TimeInterpolator) null);
        return firstFocusableIconInReadingOrder2;
    }

    public static View handlePreviousPageLastItem(Workspace workspace, CellLayout cellLayout, int i, boolean z) {
        int i2 = i - 1;
        if (i2 < 0) {
            return null;
        }
        View firstFocusableIconInReverseReadingOrder = getFirstFocusableIconInReverseReadingOrder((CellLayout) workspace.getChildAt(i2), z);
        if (firstFocusableIconInReverseReadingOrder != null) {
            return firstFocusableIconInReverseReadingOrder;
        }
        View firstFocusableIconInReverseReadingOrder2 = getFirstFocusableIconInReverseReadingOrder(cellLayout, z);
        workspace.snapToPage(i2, 750, false, (TimeInterpolator) null);
        return firstFocusableIconInReverseReadingOrder2;
    }

    public static boolean isDeleteKeyChord(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return (keyCode == 67 || keyCode == 112) && keyEvent.hasModifiers(4096);
    }

    public static boolean isUninstallKeyChord(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return (keyCode == 67 || keyCode == 112) && keyEvent.hasModifiers(4097);
    }

    static void playSoundEffect(int i, View view) {
        if (i != 92) {
            if (i != 93) {
                if (i != 122) {
                    if (i != 123) {
                        switch (i) {
                            case 19:
                                break;
                            case 20:
                                break;
                            case 21:
                                view.playSoundEffect(1);
                                return;
                            case 22:
                                view.playSoundEffect(3);
                                return;
                            default:
                                return;
                        }
                    }
                }
            }
            view.playSoundEffect(4);
            return;
        }
        view.playSoundEffect(2);
    }
}
