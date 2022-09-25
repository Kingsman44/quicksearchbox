package com.android.launcher3.accessibility;

import com.android.launcher3.CellLayout;
import com.android.launcher3.FolderPagedView;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class FolderAccessibilityHelper extends DragAndDropAccessibilityDelegate {
    private final FolderPagedView mParent;
    private final int mStartPosition;

    public FolderAccessibilityHelper(CellLayout cellLayout) {
        super(cellLayout);
        FolderPagedView folderPagedView = (FolderPagedView) cellLayout.getParent();
        this.mParent = folderPagedView;
        this.mStartPosition = folderPagedView.indexOfChild(cellLayout) * cellLayout.mCountX * cellLayout.mCountY;
    }

    /* access modifiers changed from: protected */
    public final String getConfirmationForIconDrop(int i) {
        return this.mContext.getString(R.string.item_moved);
    }

    /* access modifiers changed from: protected */
    public final String getLocationDescriptionForIconDrop(int i) {
        return this.mContext.getString(R.string.move_to_position, new Object[]{Integer.valueOf(i + this.mStartPosition + 1)});
    }

    /* access modifiers changed from: protected */
    public final int intersectsValidDropTarget(int i) {
        return Math.min(i, (this.mParent.mAllocatedContentSize - this.mStartPosition) - 1);
    }
}
