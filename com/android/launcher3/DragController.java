package com.android.launcher3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import com.android.launcher3.DropTarget;
import com.android.launcher3.accessibility.DragViewStateAnnouncer;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* compiled from: PG */
public final class DragController {
    public final int[] mCoordinatesTemp = new int[2];
    int mDistanceSinceScroll = 0;
    private final Rect mDragLayerRect = new Rect();
    public DropTarget.DragObject mDragObject;
    DragScroller mDragScroller;
    public boolean mDragging;
    public final ArrayList mDropTargets = new ArrayList();
    public DropTarget mFlingToDeleteDropTarget;
    protected final int mFlingToDeleteThresholdVelocity;
    private final Handler mHandler;
    private InputMethodManager mInputMethodManager;
    public boolean mIsAccessibleDrag;
    private final boolean mIsRtl;
    public DropTarget mLastDropTarget;
    final int[] mLastTouch = new int[2];
    long mLastTouchUpTime = -1;
    public final Launcher mLauncher;
    public final ArrayList mListeners = new ArrayList();
    public int mMotionDownX;
    public int mMotionDownY;
    public View mMoveTarget;
    private final Rect mRectTemp = new Rect();
    private final ScrollRunnable mScrollRunnable = new ScrollRunnable();
    int mScrollState = 0;
    public View mScrollView;
    private final int mScrollZone;
    private final int[] mTmpPoint = new int[2];
    private VelocityTracker mVelocityTracker;
    public IBinder mWindowToken;

    /* compiled from: PG */
    public interface DragListener {
        void onDragEnd();

        void onDragStart$ar$ds(DragSource dragSource, Object obj);
    }

    /* compiled from: PG */
    final class ScrollRunnable implements Runnable {
        public int mDirection;

        public ScrollRunnable() {
        }

        public final void run() {
            DragScroller dragScroller = DragController.this.mDragScroller;
            if (dragScroller != null) {
                if (this.mDirection == 0) {
                    dragScroller.scrollLeft();
                } else {
                    dragScroller.scrollRight();
                }
                DragController dragController = DragController.this;
                dragController.mScrollState = 0;
                dragController.mDistanceSinceScroll = 0;
                dragController.mDragScroller.onExitScrollArea$ar$ds();
                DragController.this.mLauncher.mDragLayer.onExitScrollArea();
                DragController dragController2 = DragController.this;
                if (dragController2.mDragging) {
                    int[] iArr = dragController2.mLastTouch;
                    dragController2.checkScrollState(iArr[0], iArr[1]);
                }
            }
        }
    }

    public DragController(Launcher launcher) {
        Resources resources = launcher.getResources();
        this.mLauncher = launcher;
        this.mHandler = new Handler();
        this.mScrollZone = resources.getDimensionPixelSize(R.dimen.scroll_zone);
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mFlingToDeleteThresholdVelocity = (int) (((float) resources.getInteger(R.integer.config_flingToDeleteMinVelocity)) * resources.getDisplayMetrics().density);
        this.mIsRtl = Utilities.isRtl(resources);
    }

    private final void clearScrollRunnable() {
        this.mHandler.removeCallbacks(this.mScrollRunnable);
        if (this.mScrollState == 1) {
            this.mScrollState = 0;
            this.mScrollRunnable.mDirection = 1;
            this.mDragScroller.onExitScrollArea$ar$ds();
            this.mLauncher.mDragLayer.onExitScrollArea();
        }
    }

    private final void handleMoveEvent(int i, int i2) {
        this.mDragObject.dragView.move(i, i2);
        int[] iArr = this.mCoordinatesTemp;
        DropTarget findDropTarget = findDropTarget(i, i2, iArr);
        DropTarget.DragObject dragObject = this.mDragObject;
        dragObject.f16552x = iArr[0];
        dragObject.f16553y = iArr[1];
        checkTouchMove(findDropTarget);
        int i3 = this.mDistanceSinceScroll;
        int[] iArr2 = this.mLastTouch;
        double d = (double) i3;
        double hypot = Math.hypot((double) (iArr2[0] - i), (double) (iArr2[1] - i2));
        Double.isNaN(d);
        this.mDistanceSinceScroll = (int) (d + hypot);
        int[] iArr3 = this.mLastTouch;
        iArr3[0] = i;
        iArr3[1] = i2;
        checkScrollState(i, i2);
    }

    public final void acquireVelocityTrackerAndAddMovement(MotionEvent motionEvent) {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
    }

    public final void cancelDrag() {
        if (this.mDragging) {
            DropTarget dropTarget = this.mLastDropTarget;
            if (dropTarget != null) {
                dropTarget.onDragExit(this.mDragObject);
            }
            DropTarget.DragObject dragObject = this.mDragObject;
            dragObject.deferDragViewCleanupPostAnimation = false;
            dragObject.cancelled = true;
            dragObject.dragComplete = true;
            dragObject.dragSource.onDropCompleted((View) null, dragObject, false, false);
        }
        endDrag();
    }

    /* access modifiers changed from: package-private */
    public final void checkScrollState(int i, int i2) {
        int i3 = this.mDistanceSinceScroll < ViewConfiguration.get(this.mLauncher).getScaledWindowTouchSlop() ? 900 : 500;
        DragLayer dragLayer = this.mLauncher.mDragLayer;
        boolean z = this.mIsRtl;
        boolean z2 = !z;
        if (i < this.mScrollZone) {
            if (this.mScrollState == 0) {
                this.mScrollState = 1;
                if (this.mDragScroller.onEnterScrollArea(i, i2, z ? 1 : 0)) {
                    dragLayer.onEnterScrollArea$ar$ds();
                    ScrollRunnable scrollRunnable = this.mScrollRunnable;
                    scrollRunnable.mDirection = z;
                    this.mHandler.postDelayed(scrollRunnable, (long) i3);
                }
            }
        } else if (i <= this.mScrollView.getWidth() - this.mScrollZone) {
            clearScrollRunnable();
        } else if (this.mScrollState == 0) {
            this.mScrollState = 1;
            if (this.mDragScroller.onEnterScrollArea(i, i2, z2 ? 1 : 0)) {
                dragLayer.onEnterScrollArea$ar$ds();
                ScrollRunnable scrollRunnable2 = this.mScrollRunnable;
                scrollRunnable2.mDirection = z2;
                this.mHandler.postDelayed(scrollRunnable2, (long) i3);
            }
        }
    }

    public final void checkTouchMove(DropTarget dropTarget) {
        if (dropTarget != null) {
            DropTarget dropTarget2 = this.mLastDropTarget;
            if (dropTarget2 != dropTarget) {
                if (dropTarget2 != null) {
                    dropTarget2.onDragExit(this.mDragObject);
                }
                dropTarget.onDragEnter(this.mDragObject);
            }
            dropTarget.onDragOver(this.mDragObject);
        } else {
            DropTarget dropTarget3 = this.mLastDropTarget;
            if (dropTarget3 != null) {
                dropTarget3.onDragExit(this.mDragObject);
            }
        }
        this.mLastDropTarget = dropTarget;
    }

    public final void drop(float f, float f2) {
        int[] iArr = this.mCoordinatesTemp;
        DropTarget findDropTarget = findDropTarget((int) f, (int) f2, iArr);
        DropTarget.DragObject dragObject = this.mDragObject;
        dragObject.f16552x = iArr[0];
        boolean z = true;
        dragObject.f16553y = iArr[1];
        if (findDropTarget != null) {
            dragObject.dragComplete = true;
            findDropTarget.onDragExit(dragObject);
            if (findDropTarget.acceptDrop(this.mDragObject)) {
                findDropTarget.onDrop(this.mDragObject);
                DropTarget.DragObject dragObject2 = this.mDragObject;
                dragObject2.dragSource.onDropCompleted((View) findDropTarget, dragObject2, false, z);
            }
        }
        z = false;
        DropTarget.DragObject dragObject22 = this.mDragObject;
        dragObject22.dragSource.onDropCompleted((View) findDropTarget, dragObject22, false, z);
    }

    public final void dropOnFlingToDeleteTarget$ar$ds(PointF pointF) {
        int[] iArr = this.mCoordinatesTemp;
        DropTarget.DragObject dragObject = this.mDragObject;
        boolean z = false;
        dragObject.f16552x = iArr[0];
        dragObject.f16553y = iArr[1];
        DropTarget dropTarget = this.mLastDropTarget;
        if (!(dropTarget == null || this.mFlingToDeleteDropTarget == dropTarget)) {
            dropTarget.onDragExit(dragObject);
        }
        this.mFlingToDeleteDropTarget.onDragEnter(this.mDragObject);
        DropTarget.DragObject dragObject2 = this.mDragObject;
        dragObject2.dragComplete = true;
        this.mFlingToDeleteDropTarget.onDragExit(dragObject2);
        if (this.mFlingToDeleteDropTarget.acceptDrop(this.mDragObject)) {
            this.mFlingToDeleteDropTarget.onFlingToDelete(this.mDragObject, pointF);
            z = true;
        }
        DropTarget.DragObject dragObject3 = this.mDragObject;
        dragObject3.dragSource.onDropCompleted((View) this.mFlingToDeleteDropTarget, dragObject3, true, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r2 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void endDrag() {
        /*
            r5 = this;
            boolean r0 = r5.mDragging
            r1 = 0
            if (r0 == 0) goto L_0x0039
            r0 = 0
            r5.mDragging = r0
            r5.mIsAccessibleDrag = r0
            r5.clearScrollRunnable()
            com.android.launcher3.DropTarget$DragObject r2 = r5.mDragObject
            com.android.launcher3.DragView r3 = r2.dragView
            if (r3 == 0) goto L_0x0020
            boolean r2 = r2.deferDragViewCleanupPostAnimation
            if (r2 != 0) goto L_0x001a
            r3.remove()
        L_0x001a:
            com.android.launcher3.DropTarget$DragObject r3 = r5.mDragObject
            r3.dragView = r1
            if (r2 != 0) goto L_0x0039
        L_0x0020:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList r3 = r5.mListeners
            r2.<init>(r3)
            int r3 = r2.size()
        L_0x002b:
            if (r0 >= r3) goto L_0x0039
            java.lang.Object r4 = r2.get(r0)
            com.android.launcher3.DragController$DragListener r4 = (com.android.launcher3.DragController.DragListener) r4
            r4.onDragEnd()
            int r0 = r0 + 1
            goto L_0x002b
        L_0x0039:
            android.view.VelocityTracker r0 = r5.mVelocityTracker
            if (r0 == 0) goto L_0x0042
            r0.recycle()
            r5.mVelocityTracker = r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.DragController.endDrag():void");
    }

    public final DropTarget findDropTarget(int i, int i2, int[] iArr) {
        Rect rect = this.mRectTemp;
        ArrayList arrayList = this.mDropTargets;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return null;
            }
            DropTarget dropTarget = (DropTarget) arrayList.get(size);
            if (dropTarget.isDropEnabled()) {
                dropTarget.getHitRectRelativeToDragLayer(rect);
                DropTarget.DragObject dragObject = this.mDragObject;
                dragObject.f16552x = i;
                dragObject.f16553y = i2;
                if (rect.contains(i, i2)) {
                    iArr[0] = i;
                    iArr[1] = i2;
                    Utilities.mapCoordInSelfToDescendent$ar$ds((View) dropTarget, this.mLauncher.mDragLayer, iArr);
                    return dropTarget;
                }
            }
        }
    }

    public final void forceTouchMove() {
        int[] iArr = this.mCoordinatesTemp;
        int[] iArr2 = this.mLastTouch;
        DropTarget findDropTarget = findDropTarget(iArr2[0], iArr2[1], iArr);
        DropTarget.DragObject dragObject = this.mDragObject;
        dragObject.f16552x = iArr[0];
        dragObject.f16553y = iArr[1];
        checkTouchMove(findDropTarget);
    }

    public final int[] getClampedDragLayerPos(float f, float f2) {
        this.mLauncher.mDragLayer.getLocalVisibleRect(this.mDragLayerRect);
        this.mTmpPoint[0] = (int) Math.max((float) this.mDragLayerRect.left, Math.min(f, (float) (this.mDragLayerRect.right - 1)));
        this.mTmpPoint[1] = (int) Math.max((float) this.mDragLayerRect.top, Math.min(f2, (float) (this.mDragLayerRect.bottom - 1)));
        return this.mTmpPoint;
    }

    public final Point getMotionDown() {
        return new Point(this.mMotionDownX, this.mMotionDownY);
    }

    public final PointF isFlingingToDelete(DragSource dragSource) {
        if (this.mFlingToDeleteDropTarget == null || !dragSource.supportsFlingToDelete()) {
            return null;
        }
        this.mVelocityTracker.computeCurrentVelocity(1000, (float) ViewConfiguration.get(this.mLauncher).getScaledMaximumFlingVelocity());
        if (this.mVelocityTracker.getYVelocity() < ((float) this.mFlingToDeleteThresholdVelocity)) {
            PointF pointF = new PointF(this.mVelocityTracker.getXVelocity(), this.mVelocityTracker.getYVelocity());
            PointF pointF2 = new PointF(0.0f, -1.0f);
            if (((double) ((float) Math.acos((double) (((pointF.x * pointF2.x) + (pointF.y * pointF2.y)) / (pointF.length() * pointF2.length()))))) <= Math.toRadians(35.0d)) {
                return pointF;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (com.android.launcher3.ShortcutInfo) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAppsRemoved(com.android.launcher3.util.ItemInfoMatcher r3) {
        /*
            r2 = this;
            com.android.launcher3.DropTarget$DragObject r0 = r2.mDragObject
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r0.dragInfo
            boolean r1 = r0 instanceof com.android.launcher3.ShortcutInfo
            if (r1 == 0) goto L_0x001b
            com.android.launcher3.ShortcutInfo r0 = (com.android.launcher3.ShortcutInfo) r0
            android.content.ComponentName r1 = r0.getTargetComponent()
            if (r1 == 0) goto L_0x001b
            boolean r3 = r3.matches(r0, r1)
            if (r3 == 0) goto L_0x001b
            r2.cancelDrag()
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.DragController.onAppsRemoved(com.android.launcher3.util.ItemInfoMatcher):void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mDragging || this.mIsAccessibleDrag) {
            return false;
        }
        acquireVelocityTrackerAndAddMovement(motionEvent);
        int action = motionEvent.getAction();
        int[] clampedDragLayerPos = getClampedDragLayerPos(motionEvent.getX(), motionEvent.getY());
        int i = clampedDragLayerPos[0];
        int i2 = clampedDragLayerPos[1];
        if (action == 0) {
            this.mMotionDownX = i;
            this.mMotionDownY = i2;
            if (i < this.mScrollZone || i > this.mScrollView.getWidth() - this.mScrollZone) {
                this.mScrollState = 1;
                this.mHandler.postDelayed(this.mScrollRunnable, 500);
            } else {
                this.mScrollState = 0;
            }
            handleMoveEvent(i, i2);
        } else if (action == 1) {
            handleMoveEvent(i, i2);
            this.mHandler.removeCallbacks(this.mScrollRunnable);
            if (this.mDragging) {
                PointF isFlingingToDelete = isFlingingToDelete(this.mDragObject.dragSource);
                if (true != DeleteDropTarget.supportsDrop(this.mDragObject.dragInfo)) {
                    isFlingingToDelete = null;
                }
                if (isFlingingToDelete != null) {
                    dropOnFlingToDeleteTarget$ar$ds(isFlingingToDelete);
                } else {
                    drop((float) i, (float) i2);
                }
            }
            endDrag();
        } else if (action == 2) {
            handleMoveEvent(i, i2);
        } else if (action == 3) {
            this.mHandler.removeCallbacks(this.mScrollRunnable);
            cancelDrag();
        }
        return true;
    }

    public final DragView startDrag$ar$ds(Bitmap bitmap, int i, int i2, DragSource dragSource, Object obj, Point point, Rect rect, float f, boolean z) {
        int i3;
        int i4;
        DragSource dragSource2 = dragSource;
        Object obj2 = obj;
        Point point2 = point;
        Rect rect2 = rect;
        if (this.mInputMethodManager == null) {
            this.mInputMethodManager = (InputMethodManager) this.mLauncher.getSystemService("input_method");
        }
        this.mInputMethodManager.hideSoftInputFromWindow(this.mWindowToken, 0);
        ArrayList arrayList = this.mListeners;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((DragListener) arrayList.get(i5)).onDragStart$ar$ds(dragSource2, obj2);
        }
        int i6 = this.mMotionDownX - i;
        int i7 = this.mMotionDownY - i2;
        if (rect2 == null) {
            i3 = 0;
        } else {
            i3 = rect2.left;
        }
        if (rect2 == null) {
            i4 = 0;
        } else {
            i4 = rect2.top;
        }
        this.mDragging = true;
        this.mIsAccessibleDrag = z;
        this.mDragObject = new DropTarget.DragObject();
        int dimensionPixelSize = this.mLauncher.getResources().getDimensionPixelSize(R.dimen.dragViewScale);
        DragView dragView = r8;
        DragView dragView2 = new DragView(this.mLauncher, bitmap, i6, i7, f, (float) dimensionPixelSize);
        this.mDragObject.dragView = dragView;
        DropTarget.DragObject dragObject = this.mDragObject;
        dragObject.dragComplete = false;
        if (this.mIsAccessibleDrag) {
            dragObject.xOffset = bitmap.getWidth() / 2;
            this.mDragObject.yOffset = bitmap.getHeight() / 2;
            this.mDragObject.accessibleDrag = true;
        } else {
            dragObject.xOffset = this.mMotionDownX - (i + i3);
            dragObject.yOffset = this.mMotionDownY - (i2 + i4);
            dragObject.stateAnnouncer = DragViewStateAnnouncer.createFor(dragView);
        }
        DropTarget.DragObject dragObject2 = this.mDragObject;
        dragObject2.dragSource = dragSource2;
        dragObject2.dragInfo = obj2;
        if (point2 != null) {
            dragView.mDragVisualizeOffset = new Point(point2);
        }
        if (rect2 != null) {
            dragView.mDragRegion = new Rect(rect2);
        }
        this.mLauncher.mDragLayer.performHapticFeedback(0);
        dragView.show(this.mMotionDownX, this.mMotionDownY);
        handleMoveEvent(this.mMotionDownX, this.mMotionDownY);
        return dragView;
    }
}
