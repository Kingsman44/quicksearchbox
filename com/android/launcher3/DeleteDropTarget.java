package com.android.launcher3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.android.launcher3.DropTarget;
import com.android.launcher3.util.FlingAnimation;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class DeleteDropTarget extends ButtonDropTarget {
    public DeleteDropTarget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void removeWorkspaceOrFolderItem(Launcher launcher, ItemInfo itemInfo, View view) {
        launcher.removeItem$ar$ds(view, itemInfo, true);
        launcher.mWorkspace.stripEmptyScreens();
        launcher.mDragLayer.announceForAccessibility(launcher.getString(R.string.item_removed));
    }

    public final void completeDrop(DropTarget.DragObject dragObject) {
        Object obj = dragObject.dragInfo;
        DragSource dragSource = dragObject.dragSource;
        if ((dragSource instanceof Workspace) || (dragSource instanceof Folder)) {
            removeWorkspaceOrFolderItem(this.mLauncher, (ItemInfo) obj, (View) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.mHoverColor = getResources().getColor(R.color.delete_target_hover_tint);
        setDrawable(R.drawable.ic_remove_launcher);
    }

    public final void onFlingToDelete(final DropTarget.DragObject dragObject, PointF pointF) {
        dragObject.dragView.setColor(0);
        dragObject.dragView.getScaleX();
        DragLayer dragLayer = this.mLauncher.mDragLayer;
        FlingAnimation flingAnimation = new FlingAnimation(dragObject, pointF, getIconRect(dragObject.dragView.getMeasuredWidth(), dragObject.dragView.getMeasuredHeight(), this.mDrawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight()), dragLayer);
        final int i = flingAnimation.mDuration + 300;
        final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        dragLayer.animateView(dragObject.dragView, flingAnimation, i, new TimeInterpolator() {
            private int mCount = -1;
            private float mOffset = 0.0f;

            public final float getInterpolation(float f) {
                int i = this.mCount;
                if (i < 0) {
                    this.mCount = i + 1;
                } else if (i == 0) {
                    this.mOffset = Math.min(0.5f, ((float) (AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)) / ((float) i));
                    this.mCount++;
                }
                return Math.min(1.0f, this.mOffset + f);
            }
        }, new Runnable() {
            public final void run() {
                DeleteDropTarget.this.mLauncher.exitSpringLoadedDragMode();
                DeleteDropTarget.this.completeDrop(dragObject);
                DragController dragController = DeleteDropTarget.this.mLauncher.mDragController;
                dragObject.dragSource.onFlingToDeleteCompleted();
            }
        }, 0, (View) null);
    }

    /* access modifiers changed from: protected */
    public final boolean supportsDrop(DragSource dragSource, Object obj) {
        return dragSource.supportsDeleteDropTarget() && supportsDrop(obj);
    }

    public DeleteDropTarget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static boolean supportsDrop(Object obj) {
        return (obj instanceof ShortcutInfo) || (obj instanceof LauncherAppWidgetInfo) || (obj instanceof FolderInfo);
    }
}
