package com.android.launcher3;

import android.graphics.PointF;
import android.graphics.Rect;
import com.android.launcher3.accessibility.DragViewStateAnnouncer;

/* compiled from: PG */
public interface DropTarget {

    /* compiled from: PG */
    public final class DragObject {
        public boolean accessibleDrag;
        public boolean cancelled = false;
        public boolean deferDragViewCleanupPostAnimation = true;
        public boolean dragComplete = false;
        public Object dragInfo = null;
        public DragSource dragSource = null;
        public DragView dragView = null;
        public Runnable postAnimationRunnable = null;
        public DragViewStateAnnouncer stateAnnouncer;

        /* renamed from: x */
        public int f16552x = -1;
        public int xOffset = -1;

        /* renamed from: y */
        public int f16553y = -1;
        public int yOffset = -1;

        public final float[] getVisualCenter(float[] fArr) {
            if (fArr == null) {
                fArr = new float[2];
            }
            int i = this.f16552x;
            int i2 = this.xOffset;
            int i3 = this.f16553y;
            int i4 = this.yOffset;
            fArr[0] = (float) ((i - i2) + (this.dragView.mDragRegion.width() / 2));
            fArr[1] = (float) ((i3 - i4) + (this.dragView.mDragRegion.height() / 2));
            return fArr;
        }
    }

    boolean acceptDrop(DragObject dragObject);

    void getHitRectRelativeToDragLayer(Rect rect);

    boolean isDropEnabled();

    void onDragEnter(DragObject dragObject);

    void onDragExit(DragObject dragObject);

    void onDragOver(DragObject dragObject);

    void onDrop(DragObject dragObject);

    void onFlingToDelete(DragObject dragObject, PointF pointF);

    void prepareAccessibilityDrop();
}
