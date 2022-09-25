package com.android.launcher3.accessibility;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.launcher3.AppInfo;
import com.android.launcher3.CellLayout;
import com.android.launcher3.FolderInfo;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.accessibility.LauncherAccessibilityDelegate;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* compiled from: PG */
public final class WorkspaceAccessibilityHelper extends DragAndDropAccessibilityDelegate {
    public WorkspaceAccessibilityHelper(CellLayout cellLayout) {
        super(cellLayout);
    }

    public static String getDescriptionForDropOver(View view, Context context) {
        ItemInfo itemInfo = (ItemInfo) view.getTag();
        if (itemInfo instanceof ShortcutInfo) {
            return context.getString(R.string.create_folder_with, new Object[]{itemInfo.title});
        } else if (!(itemInfo instanceof FolderInfo)) {
            return BuildConfig.FLAVOR;
        } else {
            if (TextUtils.isEmpty(itemInfo.title)) {
                ArrayList arrayList = ((FolderInfo) itemInfo).contents;
                int size = arrayList.size();
                ShortcutInfo shortcutInfo = null;
                for (int i = 0; i < size; i++) {
                    ShortcutInfo shortcutInfo2 = (ShortcutInfo) arrayList.get(i);
                    if (shortcutInfo == null || shortcutInfo.rank > shortcutInfo2.rank) {
                        shortcutInfo = shortcutInfo2;
                    }
                }
                if (shortcutInfo != null) {
                    return context.getString(R.string.add_to_folder_with_app, new Object[]{shortcutInfo.title});
                }
            }
            return context.getString(R.string.add_to_folder, new Object[]{itemInfo.title});
        }
    }

    /* access modifiers changed from: protected */
    public final String getConfirmationForIconDrop(int i) {
        CellLayout cellLayout = this.mView;
        int i2 = cellLayout.mCountX;
        int i3 = i % i2;
        int i4 = i / i2;
        LauncherAccessibilityDelegate.DragInfo dragInfo = this.mDelegate.mDragInfo;
        View childAt = cellLayout.mShortcutsAndWidgets.getChildAt(i3, i4);
        if (childAt == null || childAt == dragInfo.item) {
            return this.mContext.getString(R.string.item_moved);
        }
        ItemInfo itemInfo = (ItemInfo) childAt.getTag();
        if ((itemInfo instanceof AppInfo) || (itemInfo instanceof ShortcutInfo)) {
            return this.mContext.getString(R.string.folder_created);
        }
        return itemInfo instanceof FolderInfo ? this.mContext.getString(R.string.added_to_folder) : BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final String getLocationDescriptionForIconDrop(int i) {
        CellLayout cellLayout = this.mView;
        int i2 = cellLayout.mCountX;
        int i3 = i % i2;
        int i4 = i / i2;
        LauncherAccessibilityDelegate.DragInfo dragInfo = this.mDelegate.mDragInfo;
        View childAt = cellLayout.mShortcutsAndWidgets.getChildAt(i3, i4);
        if (childAt != null && childAt != dragInfo.item) {
            return getDescriptionForDropOver(childAt, this.mContext);
        }
        if (this.mView.mIsHotseat) {
            return this.mContext.getString(R.string.move_to_hotseat_position, new Object[]{Integer.valueOf(i + 1)});
        }
        return this.mContext.getString(R.string.move_to_empty_cell, new Object[]{Integer.valueOf(i4 + 1), Integer.valueOf(i3 + 1)});
    }

    /* access modifiers changed from: protected */
    public final int intersectsValidDropTarget(int i) {
        CellLayout cellLayout = this.mView;
        int i2 = cellLayout.mCountX;
        int i3 = cellLayout.mCountY;
        int i4 = i % i2;
        int i5 = i / i2;
        LauncherAccessibilityDelegate.DragInfo dragInfo = this.mDelegate.mDragInfo;
        if (dragInfo.dragType$ar$edu == 3) {
            if (!cellLayout.mIsHotseat) {
                ItemInfo itemInfo = dragInfo.info;
                int i6 = itemInfo.spanX;
                int i7 = itemInfo.spanY;
                for (int i8 = 0; i8 < i6; i8++) {
                    for (int i9 = 0; i9 < i7; i9++) {
                        int i10 = i4 - i8;
                        int i11 = i5 - i9;
                        if (i10 >= 0 && i11 >= 0) {
                            int i12 = i10;
                            boolean z = true;
                            while (true) {
                                if (i12 < i10 + i6) {
                                    if (!z) {
                                        break;
                                    }
                                    int i13 = i11;
                                    while (true) {
                                        if (i13 >= i11 + i7) {
                                            z = true;
                                            break;
                                        } else if (i12 >= i2 || i13 >= i3 || this.mView.isOccupied(i12, i13)) {
                                            z = false;
                                        } else {
                                            i13++;
                                        }
                                    }
                                    z = false;
                                    i12++;
                                } else if (z) {
                                    return i10 + (i2 * i11);
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }
        View childAt = cellLayout.mShortcutsAndWidgets.getChildAt(i4, i5);
        if (childAt == null || childAt == dragInfo.item) {
            return i;
        }
        if (dragInfo.dragType$ar$edu != 2) {
            ItemInfo itemInfo2 = (ItemInfo) childAt.getTag();
            if ((itemInfo2 instanceof AppInfo) || (itemInfo2 instanceof FolderInfo) || (itemInfo2 instanceof ShortcutInfo)) {
                return i;
            }
        }
        return -1;
    }
}
