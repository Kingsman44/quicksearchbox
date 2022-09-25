package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Parcelable;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2061c;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.DropTarget;
import com.android.launcher3.FolderIcon;
import com.android.launcher3.accessibility.DragAndDropAccessibilityDelegate;
import com.android.launcher3.accessibility.FolderAccessibilityHelper;
import com.android.launcher3.accessibility.WorkspaceAccessibilityHelper;
import com.android.launcher3.util.ParcelableSparseArray;
import com.google.android.googlequicksearchbox.R;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import org.chromium.net.NetError;

/* compiled from: PG */
public class CellLayout extends ViewGroup implements BubbleTextView.BubbleTextShadowHandler {
    private static final Paint sPaint = new Paint();
    private final TransitionDrawable mBackground;
    private float mBackgroundAlpha;
    public int mCellHeight;
    public int mCellWidth;
    public float mChildScale;
    public int mCountX;
    public int mCountY;
    private int[] mDirectionVector;
    public final int[] mDragCell;
    float[] mDragOutlineAlphas;
    public InterruptibleInOutAnimator[] mDragOutlineAnims;
    public int mDragOutlineCurrent;
    private final Paint mDragOutlinePaint;
    Rect[] mDragOutlines;
    public boolean mDragging;
    public boolean mDropPending;
    private TimeInterpolator mEaseOutInterpolator;
    public int mFixedCellHeight;
    public int mFixedCellWidth;
    public int mFixedHeight;
    public int mFixedWidth;
    public int[] mFolderLeaveBehindCell;
    public ArrayList mFolderOuterRings;
    public int mHeightGap;
    public float mHotseatScale;
    public View.OnTouchListener mInterceptTouchListener;
    public ArrayList mIntersectingViews;
    public boolean mIsDragOverlapping;
    public boolean mIsDragTarget;
    public boolean mIsHotseat;
    public boolean mItemPlacementDirty;
    public boolean mJailContent;
    private Launcher mLauncher;
    boolean[][] mOccupied;
    private Rect mOccupiedRect;
    int[] mPreviousReorderDirection;
    HashMap mReorderAnimators;
    float mReorderPreviewAnimationMagnitude;
    HashMap mShakeAnimators;
    public ShortcutAndWidgetContainer mShortcutsAndWidgets;
    private StylusEventHelper mStylusEventHelper;
    final int[] mTempLocation;
    private final Rect mTempRect;
    private final Stack mTempRectStack;
    boolean[][] mTmpOccupied;
    final int[] mTmpPoint;
    private final ClickShadowView mTouchFeedbackView;
    private DragAndDropAccessibilityDelegate mTouchHelper;
    private boolean mUseTouchHelper;
    public int mWidthGap;

    /* compiled from: PG */
    final class CellAndSpan {
        int spanX;
        int spanY;

        /* renamed from: x */
        int f16545x;

        /* renamed from: y */
        int f16546y;

        public CellAndSpan() {
        }

        public CellAndSpan(int i, int i2, int i3, int i4) {
            this.f16545x = i;
            this.f16546y = i2;
            this.spanX = i3;
            this.spanY = i4;
        }

        public final void copy(CellAndSpan cellAndSpan) {
            cellAndSpan.f16545x = this.f16545x;
            cellAndSpan.f16546y = this.f16546y;
            cellAndSpan.spanX = this.spanX;
            cellAndSpan.spanY = this.spanY;
        }

        public final String toString() {
            int i = this.f16545x;
            int i2 = this.f16546y;
            int i3 = this.spanX;
            int i4 = this.spanY;
            return "(" + i + ", " + i2 + ": " + i3 + ", " + i4 + ")";
        }
    }

    /* compiled from: PG */
    public final class CellInfo {
        final View cell;
        int cellX = -1;
        int cellY = -1;
        final long container;
        final long screenId;
        final int spanX;
        final int spanY;

        public CellInfo(View view, ItemInfo itemInfo) {
            this.cell = view;
            this.cellX = itemInfo.cellX;
            this.cellY = itemInfo.cellY;
            this.spanX = itemInfo.spanX;
            this.spanY = itemInfo.spanY;
            this.screenId = itemInfo.screenId;
            this.container = itemInfo.container;
        }

        public final String toString() {
            View view = this.cell;
            String valueOf = String.valueOf(view == null ? "null" : view.getClass());
            int i = this.cellX;
            int i2 = this.cellY;
            return "Cell[view=" + valueOf + ", x=" + i + ", y=" + i2 + "]";
        }
    }

    /* compiled from: PG */
    final class ItemConfiguration {
        int dragViewSpanX;
        int dragViewSpanY;
        int dragViewX;
        int dragViewY;
        ArrayList intersectingViews;
        boolean isSolution = false;
        final HashMap map = new HashMap();
        public final HashMap savedMap = new HashMap();
        final ArrayList sortedViews = new ArrayList();
    }

    /* compiled from: PG */
    public class LayoutParams extends ViewGroup.MarginLayoutParams {
        public boolean canReorder;
        @ViewDebug.ExportedProperty
        public int cellHSpan;
        @ViewDebug.ExportedProperty
        public int cellVSpan;
        @ViewDebug.ExportedProperty
        public int cellX;
        @ViewDebug.ExportedProperty
        public int cellY;
        boolean dropped;
        public boolean isFullscreen;
        public boolean isLockedToGrid;
        public int tmpCellX;
        public int tmpCellY;
        public boolean useTmpCoords;
        @ViewDebug.ExportedProperty

        /* renamed from: x */
        int f16547x;
        @ViewDebug.ExportedProperty

        /* renamed from: y */
        int f16548y;

        public LayoutParams(int i, int i2, int i3, int i4) {
            super(-1, -1);
            this.isLockedToGrid = true;
            this.isFullscreen = false;
            this.canReorder = true;
            this.cellX = i;
            this.cellY = i2;
            this.cellHSpan = i3;
            this.cellVSpan = i4;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        public int getX() {
            return this.f16547x;
        }

        public int getY() {
            return this.f16548y;
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public void setWidth(int i) {
            this.width = i;
        }

        public void setX(int i) {
            this.f16547x = i;
        }

        public void setY(int i) {
            this.f16548y = i;
        }

        public final void setup$ar$ds$9c4dc3d3_0(int i, int i2, boolean z, int i3, float f, float f2) {
            int i4;
            int i5;
            if (this.isLockedToGrid) {
                int i6 = this.cellHSpan;
                int i7 = this.cellVSpan;
                boolean z2 = this.useTmpCoords;
                if (z2) {
                    i4 = this.tmpCellX;
                } else {
                    i4 = this.cellX;
                }
                if (z2) {
                    i5 = this.tmpCellY;
                } else {
                    i5 = this.cellY;
                }
                if (z) {
                    i4 = (i3 - i4) - i6;
                }
                this.width = (int) ((((((float) (i6 * i)) / f) + (0.0f / f)) - ((float) this.leftMargin)) - ((float) this.rightMargin));
                this.height = (int) ((((((float) (i7 * i2)) / f2) + (0.0f / f2)) - ((float) this.topMargin)) - ((float) this.bottomMargin));
                this.f16547x = (i4 * i) + this.leftMargin;
                this.f16548y = (i5 * i2) + this.topMargin;
            }
        }

        public final String toString() {
            int i = this.cellX;
            int i2 = this.cellY;
            return "(" + i + ", " + i2 + ")";
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.isLockedToGrid = true;
            this.isFullscreen = false;
            this.canReorder = true;
            this.cellHSpan = 1;
            this.cellVSpan = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.isLockedToGrid = true;
            this.isFullscreen = false;
            this.canReorder = true;
            this.cellHSpan = 1;
            this.cellVSpan = 1;
        }
    }

    /* compiled from: PG */
    final class ReorderPreviewAnimation {

        /* renamed from: a */
        Animator f16549a;
        final View child;
        float finalDeltaX;
        float finalDeltaY;
        final float finalScale;
        float initDeltaX;
        float initDeltaY;
        float initScale;
        final int mode;
        boolean repeating = false;
        final /* synthetic */ CellLayout this$0;

        public ReorderPreviewAnimation(CellLayout cellLayout, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            CellLayout cellLayout2 = cellLayout;
            int i8 = i;
            this.this$0 = cellLayout2;
            CellLayout cellLayout3 = cellLayout;
            int i9 = i6;
            int i10 = i7;
            cellLayout3.regionToCenterPoint(i2, i3, i9, i10, cellLayout2.mTmpPoint);
            int[] iArr = cellLayout2.mTmpPoint;
            int i11 = iArr[0];
            int i12 = 1;
            int i13 = iArr[1];
            cellLayout3.regionToCenterPoint(i4, i5, i9, i10, iArr);
            int[] iArr2 = cellLayout2.mTmpPoint;
            int i14 = iArr2[0] - i11;
            int i15 = iArr2[1] - i13;
            this.child = view;
            this.mode = i8;
            setInitialAnimationValues(false);
            this.finalScale = (cellLayout2.mChildScale - (4.0f / ((float) view.getWidth()))) * this.initScale;
            float f = this.initDeltaX;
            this.finalDeltaX = f;
            float f2 = this.initDeltaY;
            this.finalDeltaY = f2;
            i12 = 1 != i8 ? -1 : i12;
            if (i14 != i15 || i14 != 0) {
                if (i15 == 0) {
                    this.finalDeltaX = f + (((float) (-i12)) * Math.signum((float) i14) * cellLayout2.mReorderPreviewAnimationMagnitude);
                } else if (i14 == 0) {
                    this.finalDeltaY = f2 + (((float) (-i12)) * Math.signum((float) i15) * cellLayout2.mReorderPreviewAnimationMagnitude);
                } else {
                    float f3 = (float) i15;
                    float f4 = (float) i14;
                    double atan = Math.atan((double) (f3 / f4));
                    float f5 = (float) (-i12);
                    float f6 = this.finalDeltaX;
                    double signum = (double) (Math.signum(f4) * f5);
                    double cos = Math.cos(atan);
                    double d = (double) cellLayout2.mReorderPreviewAnimationMagnitude;
                    Double.isNaN(d);
                    double abs = Math.abs(cos * d);
                    Double.isNaN(signum);
                    this.finalDeltaX = f6 + ((float) ((int) (signum * abs)));
                    float f7 = this.finalDeltaY;
                    double signum2 = (double) (f5 * Math.signum(f3));
                    double sin = Math.sin(atan);
                    double d2 = (double) cellLayout2.mReorderPreviewAnimationMagnitude;
                    Double.isNaN(d2);
                    double abs2 = Math.abs(sin * d2);
                    Double.isNaN(signum2);
                    this.finalDeltaY = f7 + ((float) ((int) (signum2 * abs2)));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void completeAnimationImmediately() {
            Animator animator = this.f16549a;
            if (animator != null) {
                animator.cancel();
            }
            setInitialAnimationValues(true);
            AnimatorSet createAnimatorSet = LauncherAnimUtils.createAnimatorSet();
            this.f16549a = createAnimatorSet;
            createAnimatorSet.playTogether(new Animator[]{LauncherAnimUtils.ofFloat(this.child, "scaleX", this.initScale), LauncherAnimUtils.ofFloat(this.child, "scaleY", this.initScale), LauncherAnimUtils.ofFloat(this.child, "translationX", this.initDeltaX), LauncherAnimUtils.ofFloat(this.child, "translationY", this.initDeltaY)});
            createAnimatorSet.setDuration(150);
            createAnimatorSet.setInterpolator(new DecelerateInterpolator(1.5f));
            createAnimatorSet.start();
        }

        /* access modifiers changed from: package-private */
        public final void setInitialAnimationValues(boolean z) {
            if (z) {
                View view = this.child;
                if (view instanceof LauncherAppWidgetHostView) {
                    LauncherAppWidgetHostView launcherAppWidgetHostView = (LauncherAppWidgetHostView) view;
                    this.initScale = launcherAppWidgetHostView.mScaleToFit;
                    this.initDeltaX = launcherAppWidgetHostView.mTranslationForCentering.x;
                    this.initDeltaY = launcherAppWidgetHostView.mTranslationForCentering.y;
                    return;
                }
                this.initScale = this.this$0.mChildScale;
                this.initDeltaX = 0.0f;
                this.initDeltaY = 0.0f;
                return;
            }
            this.initScale = this.child.getScaleX();
            this.initDeltaX = this.child.getTranslationX();
            this.initDeltaY = this.child.getTranslationY();
        }
    }

    /* compiled from: PG */
    final class ViewCluster {
        final int[] bottomEdge;
        boolean bottomEdgeDirty;
        final Rect boundingRect = new Rect();
        boolean boundingRectDirty;
        final PositionComparator comparator;
        final ItemConfiguration config;
        final int[] leftEdge;
        boolean leftEdgeDirty;
        final int[] rightEdge;
        boolean rightEdgeDirty;
        final int[] topEdge;
        boolean topEdgeDirty;
        final ArrayList views;

        /* compiled from: PG */
        final class PositionComparator implements Comparator {
            int whichEdge = 0;

            public PositionComparator() {
            }

            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                CellAndSpan cellAndSpan = (CellAndSpan) ViewCluster.this.config.map.get((View) obj);
                CellAndSpan cellAndSpan2 = (CellAndSpan) ViewCluster.this.config.map.get((View) obj2);
                int i6 = this.whichEdge;
                if (i6 == 0) {
                    i3 = cellAndSpan2.f16545x + cellAndSpan2.spanX;
                    i = cellAndSpan.f16545x;
                    i2 = cellAndSpan.spanX;
                } else if (i6 != 1) {
                    if (i6 != 2) {
                        i5 = cellAndSpan.f16546y;
                        i4 = cellAndSpan2.f16546y;
                    } else {
                        i5 = cellAndSpan.f16545x;
                        i4 = cellAndSpan2.f16545x;
                    }
                    return i5 - i4;
                } else {
                    i3 = cellAndSpan2.f16546y + cellAndSpan2.spanY;
                    i = cellAndSpan.f16546y;
                    i2 = cellAndSpan.spanY;
                }
                return i3 - (i + i2);
            }
        }

        public ViewCluster(ArrayList arrayList, ItemConfiguration itemConfiguration) {
            int i = CellLayout.this.mCountY;
            this.leftEdge = new int[i];
            this.rightEdge = new int[i];
            int i2 = CellLayout.this.mCountX;
            this.topEdge = new int[i2];
            this.bottomEdge = new int[i2];
            this.comparator = new PositionComparator();
            this.views = (ArrayList) arrayList.clone();
            this.config = itemConfiguration;
            resetEdges();
        }

        /* access modifiers changed from: package-private */
        public final void computeEdge(int i, int[] iArr) {
            int size = this.views.size();
            for (int i2 = 0; i2 < size; i2++) {
                CellAndSpan cellAndSpan = (CellAndSpan) this.config.map.get(this.views.get(i2));
                if (i == 0) {
                    int i3 = cellAndSpan.f16545x;
                    for (int i4 = cellAndSpan.f16546y; i4 < cellAndSpan.f16546y + cellAndSpan.spanY; i4++) {
                        int i5 = iArr[i4];
                        if (i3 < i5 || i5 < 0) {
                            iArr[i4] = i3;
                        }
                    }
                } else if (i == 1) {
                    int i6 = cellAndSpan.f16546y;
                    for (int i7 = cellAndSpan.f16545x; i7 < cellAndSpan.f16545x + cellAndSpan.spanX; i7++) {
                        int i8 = iArr[i7];
                        if (i6 < i8 || i8 < 0) {
                            iArr[i7] = i6;
                        }
                    }
                } else if (i != 2) {
                    int i9 = cellAndSpan.f16546y + cellAndSpan.spanY;
                    for (int i10 = cellAndSpan.f16545x; i10 < cellAndSpan.f16545x + cellAndSpan.spanX; i10++) {
                        if (i9 > iArr[i10]) {
                            iArr[i10] = i9;
                        }
                    }
                } else {
                    int i11 = cellAndSpan.f16545x + cellAndSpan.spanX;
                    for (int i12 = cellAndSpan.f16546y; i12 < cellAndSpan.f16546y + cellAndSpan.spanY; i12++) {
                        if (i11 > iArr[i12]) {
                            iArr[i12] = i11;
                        }
                    }
                }
            }
        }

        public final Rect getBoundingRect() {
            if (this.boundingRectDirty) {
                ArrayList arrayList = this.views;
                int size = arrayList.size();
                boolean z = true;
                int i = 0;
                while (i < size) {
                    CellAndSpan cellAndSpan = (CellAndSpan) this.config.map.get((View) arrayList.get(i));
                    if (z) {
                        Rect rect = this.boundingRect;
                        int i2 = cellAndSpan.f16545x;
                        int i3 = cellAndSpan.f16546y;
                        rect.set(i2, i3, cellAndSpan.spanX + i2, cellAndSpan.spanY + i3);
                    } else {
                        Rect rect2 = this.boundingRect;
                        int i4 = cellAndSpan.f16545x;
                        int i5 = cellAndSpan.f16546y;
                        rect2.union(i4, i5, cellAndSpan.spanX + i4, cellAndSpan.spanY + i5);
                    }
                    i++;
                    z = false;
                }
            }
            return this.boundingRect;
        }

        /* access modifiers changed from: package-private */
        public final void resetEdges() {
            for (int i = 0; i < CellLayout.this.mCountX; i++) {
                this.topEdge[i] = -1;
                this.bottomEdge[i] = -1;
            }
            for (int i2 = 0; i2 < CellLayout.this.mCountY; i2++) {
                this.leftEdge[i2] = -1;
                this.rightEdge[i2] = -1;
            }
            this.leftEdgeDirty = true;
            this.rightEdgeDirty = true;
            this.bottomEdgeDirty = true;
            this.topEdgeDirty = true;
            this.boundingRectDirty = true;
        }
    }

    public CellLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void clearOccupiedCells() {
        for (int i = 0; i < this.mCountX; i++) {
            for (int i2 = 0; i2 < this.mCountY; i2++) {
                this.mOccupied[i][i2] = false;
            }
        }
    }

    private static final void computeDirectionVector$ar$ds(float f, float f2, int[] iArr) {
        double atan = Math.atan((double) (f2 / f));
        iArr[0] = 0;
        iArr[1] = 0;
        if (Math.abs(Math.cos(atan)) > 0.5d) {
            iArr[0] = (int) Math.signum(f);
        }
        if (Math.abs(Math.sin(atan)) > 0.5d) {
            iArr[1] = (int) Math.signum(f2);
        }
    }

    private final void copyCurrentStateToSolution$ar$ds(ItemConfiguration itemConfiguration) {
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mShortcutsAndWidgets.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            itemConfiguration.map.put(childAt, new CellAndSpan(layoutParams.cellX, layoutParams.cellY, layoutParams.cellHSpan, layoutParams.cellVSpan));
            itemConfiguration.savedMap.put(childAt, new CellAndSpan());
            itemConfiguration.sortedViews.add(childAt);
        }
    }

    private final void findNearestArea$ar$ds(int i, int i2, int i3, int i4, int[] iArr, boolean[][] zArr, boolean[][] zArr2, int[] iArr2) {
        int i5 = i3;
        int i6 = i4;
        int[] iArr3 = iArr2 == null ? new int[2] : iArr2;
        int i7 = this.mCountX;
        int i8 = this.mCountY;
        int i9 = LinearLayoutManager.INVALID_OFFSET;
        float f = Float.MAX_VALUE;
        for (int i10 = 0; i10 < i8 - (i6 - 1); i10++) {
            for (int i11 = 0; i11 < i7 - (i5 - 1); i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 < i5) {
                        for (int i13 = 0; i13 < i6; i13++) {
                            if (zArr[i11 + i12][i10 + i13] && (zArr2 == null || zArr2[i12][i13])) {
                                break;
                            }
                        }
                        i12++;
                    } else {
                        int i14 = i11 - i;
                        int i15 = i10 - i2;
                        float hypot = (float) Math.hypot((double) i14, (double) i15);
                        int[] iArr4 = this.mTmpPoint;
                        computeDirectionVector$ar$ds((float) i14, (float) i15, iArr4);
                        int i16 = (iArr[0] * iArr4[0]) + (iArr[1] * iArr4[1]);
                        if (Float.compare(hypot, f) < 0 || (Float.compare(hypot, f) == 0 && i16 > i9)) {
                            iArr3[0] = i11;
                            iArr3[1] = i10;
                            f = hypot;
                            i9 = i16;
                        }
                    }
                }
            }
        }
        if (f == Float.MAX_VALUE) {
            iArr3[0] = -1;
            iArr3[1] = -1;
        }
    }

    private static final ParcelableSparseArray getJailedArray$ar$ds(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(R.id.cell_layout_jail_id);
        return parcelable instanceof ParcelableSparseArray ? (ParcelableSparseArray) parcelable : new ParcelableSparseArray();
    }

    private final void markCellsForRect$ar$ds(Rect rect, boolean[][] zArr) {
        markCellsForView(rect.left, rect.top, rect.width(), rect.height(), zArr, true);
    }

    private final void markCellsForView(int i, int i2, int i3, int i4, boolean[][] zArr, boolean z) {
        if (i >= 0 && i2 >= 0) {
            int i5 = i;
            while (i5 < i + i3 && i5 < this.mCountX) {
                int i6 = i2;
                while (i6 < i2 + i4 && i6 < this.mCountY) {
                    zArr[i5][i6] = z;
                    i6++;
                }
                i5++;
            }
        }
    }

    private final boolean pushViewsToTempLocation(ArrayList arrayList, Rect rect, int[] iArr, View view, ItemConfiguration itemConfiguration) {
        int i;
        int i2;
        boolean z;
        int i3;
        ArrayList arrayList2;
        int i4;
        int[] iArr2;
        ArrayList arrayList3 = arrayList;
        Rect rect2 = rect;
        ItemConfiguration itemConfiguration2 = itemConfiguration;
        ViewCluster viewCluster = new ViewCluster(arrayList3, itemConfiguration2);
        Rect boundingRect = viewCluster.getBoundingRect();
        int i5 = iArr[0];
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        if (i5 < 0) {
            i = boundingRect.right - rect2.left;
            i2 = 0;
        } else if (i5 > 0) {
            i = rect2.right - boundingRect.left;
            i2 = 2;
        } else if (iArr[1] < 0) {
            i = boundingRect.bottom - rect2.top;
            i2 = 1;
        } else {
            i = rect2.bottom - boundingRect.top;
            i2 = 3;
        }
        if (i <= 0) {
            return false;
        }
        int i9 = 0;
        for (int size = arrayList.size(); i9 < size; size = size) {
            CellAndSpan cellAndSpan = (CellAndSpan) itemConfiguration2.map.get((View) arrayList3.get(i9));
            int i10 = i9;
            markCellsForView(cellAndSpan.f16545x, cellAndSpan.f16546y, cellAndSpan.spanX, cellAndSpan.spanY, this.mTmpOccupied, false);
            i9 = i10 + 1;
            i2 = i2;
        }
        int i11 = i2;
        for (View view2 : itemConfiguration2.map.keySet()) {
            ((CellAndSpan) itemConfiguration2.map.get(view2)).copy((CellAndSpan) itemConfiguration2.savedMap.get(view2));
        }
        ViewCluster.PositionComparator positionComparator = viewCluster.comparator;
        positionComparator.whichEdge = i11;
        Collections.sort(viewCluster.config.sortedViews, positionComparator);
        boolean z2 = false;
        while (i > 0 && !z2) {
            ArrayList arrayList4 = itemConfiguration2.sortedViews;
            int size2 = arrayList4.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                View view3 = (View) arrayList4.get(i12);
                if (!viewCluster.views.contains(view3) && view3 != view) {
                    CellAndSpan cellAndSpan2 = (CellAndSpan) viewCluster.config.map.get(view3);
                    if (i11 == 0) {
                        if (viewCluster.leftEdgeDirty) {
                            viewCluster.computeEdge(0, viewCluster.leftEdge);
                        }
                        iArr2 = viewCluster.leftEdge;
                    } else if (i11 == i8) {
                        if (viewCluster.topEdgeDirty) {
                            viewCluster.computeEdge(i8, viewCluster.topEdge);
                        }
                        iArr2 = viewCluster.topEdge;
                    } else if (i11 != i7) {
                        if (viewCluster.bottomEdgeDirty) {
                            viewCluster.computeEdge(i6, viewCluster.bottomEdge);
                        }
                        iArr2 = viewCluster.bottomEdge;
                    } else {
                        if (viewCluster.rightEdgeDirty) {
                            viewCluster.computeEdge(i7, viewCluster.rightEdge);
                        }
                        iArr2 = viewCluster.rightEdge;
                    }
                    if (i11 != 0) {
                        if (i11 != i8) {
                            if (i11 == i7) {
                                int i13 = cellAndSpan2.f16546y;
                                while (true) {
                                    if (i13 < cellAndSpan2.f16546y + cellAndSpan2.spanY) {
                                        if (iArr2[i13] == cellAndSpan2.f16545x) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                int i14 = cellAndSpan2.f16545x;
                                while (true) {
                                    if (i14 >= cellAndSpan2.f16545x + cellAndSpan2.spanX) {
                                        break;
                                    } else if (iArr2[i14] == cellAndSpan2.f16546y) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        } else {
                            int i15 = cellAndSpan2.f16545x;
                            while (true) {
                                if (i15 < cellAndSpan2.f16545x + cellAndSpan2.spanX) {
                                    if (iArr2[i15] == cellAndSpan2.f16546y + cellAndSpan2.spanY) {
                                        break;
                                    }
                                    i15++;
                                    View view4 = view;
                                } else {
                                    break;
                                }
                            }
                        }
                    } else {
                        int i16 = cellAndSpan2.f16546y;
                        while (true) {
                            if (i16 < cellAndSpan2.f16546y + cellAndSpan2.spanY) {
                                if (iArr2[i16] == cellAndSpan2.f16545x + cellAndSpan2.spanX) {
                                    break;
                                }
                                i16++;
                            } else {
                                break;
                            }
                        }
                    }
                    if (!((LayoutParams) view3.getLayoutParams()).canReorder) {
                        z2 = true;
                        break;
                    }
                    viewCluster.views.add(view3);
                    viewCluster.resetEdges();
                    CellAndSpan cellAndSpan3 = (CellAndSpan) itemConfiguration2.map.get(view3);
                    i3 = i12;
                    i4 = size2;
                    arrayList2 = arrayList4;
                    markCellsForView(cellAndSpan3.f16545x, cellAndSpan3.f16546y, cellAndSpan3.spanX, cellAndSpan3.spanY, this.mTmpOccupied, false);
                    i12 = i3 + 1;
                    size2 = i4;
                    arrayList4 = arrayList2;
                    i6 = 3;
                    i7 = 2;
                    i8 = 1;
                }
                i3 = i12;
                i4 = size2;
                arrayList2 = arrayList4;
                i12 = i3 + 1;
                size2 = i4;
                arrayList4 = arrayList2;
                i6 = 3;
                i7 = 2;
                i8 = 1;
            }
            i--;
            ArrayList arrayList5 = viewCluster.views;
            int size3 = arrayList5.size();
            for (int i17 = 0; i17 < size3; i17++) {
                CellAndSpan cellAndSpan4 = (CellAndSpan) viewCluster.config.map.get((View) arrayList5.get(i17));
                if (i11 == 0) {
                    cellAndSpan4.f16545x--;
                } else if (i11 == 1) {
                    cellAndSpan4.f16546y--;
                } else if (i11 != 2) {
                    cellAndSpan4.f16546y++;
                } else {
                    cellAndSpan4.f16545x++;
                }
            }
            viewCluster.resetEdges();
            i6 = 3;
            i7 = 2;
            i8 = 1;
        }
        Rect boundingRect2 = viewCluster.getBoundingRect();
        if (z2 || boundingRect2.left < 0 || boundingRect2.right > this.mCountX || boundingRect2.top < 0 || boundingRect2.bottom > this.mCountY) {
            for (View view5 : itemConfiguration2.savedMap.keySet()) {
                ((CellAndSpan) itemConfiguration2.savedMap.get(view5)).copy((CellAndSpan) itemConfiguration2.map.get(view5));
            }
            z = false;
        } else {
            z = true;
        }
        ArrayList arrayList6 = viewCluster.views;
        int size4 = arrayList6.size();
        for (int i18 = 0; i18 < size4; i18++) {
            CellAndSpan cellAndSpan5 = (CellAndSpan) itemConfiguration2.map.get((View) arrayList6.get(i18));
            markCellsForView(cellAndSpan5.f16545x, cellAndSpan5.f16546y, cellAndSpan5.spanX, cellAndSpan5.spanY, this.mTmpOccupied, true);
        }
        return z;
    }

    public final boolean addViewToCellLayout(View view, int i, int i2, LayoutParams layoutParams, boolean z) {
        int i3;
        if (view instanceof BubbleTextView) {
            ((BubbleTextView) view).setTextVisibility(!this.mIsHotseat);
        }
        view.setScaleX(getChildrenScale());
        view.setScaleY(getChildrenScale());
        int i4 = layoutParams.cellX;
        if (i4 < 0) {
            return false;
        }
        int i5 = this.mCountX;
        if (i4 > i5 - 1 || (i3 = layoutParams.cellY) < 0) {
            return false;
        }
        int i6 = this.mCountY;
        if (i3 > i6 - 1) {
            return false;
        }
        if (layoutParams.cellHSpan < 0) {
            layoutParams.cellHSpan = i5;
        }
        if (layoutParams.cellVSpan < 0) {
            layoutParams.cellVSpan = i6;
        }
        view.setId(i2);
        this.mShortcutsAndWidgets.addView(view, i, layoutParams);
        if (z) {
            markCellsAsOccupiedForView(view);
        }
        return true;
    }

    public final boolean animateChildToPosition(View view, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        final View view2 = view;
        int i5 = i;
        int i6 = i2;
        ShortcutAndWidgetContainer shortcutAndWidgetContainer = this.mShortcutsAndWidgets;
        boolean[][] zArr = this.mOccupied;
        if (!z) {
            zArr = this.mTmpOccupied;
        }
        if (shortcutAndWidgetContainer.indexOfChild(view2) == -1) {
            return false;
        }
        final LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        ItemInfo itemInfo = (ItemInfo) view.getTag();
        if (this.mReorderAnimators.containsKey(layoutParams)) {
            ((Animator) this.mReorderAnimators.get(layoutParams)).cancel();
            this.mReorderAnimators.remove(layoutParams);
        }
        int i7 = layoutParams.f16547x;
        int i8 = layoutParams.f16548y;
        if (z2) {
            zArr[layoutParams.cellX][layoutParams.cellY] = false;
            zArr[i5][i6] = true;
        }
        layoutParams.isLockedToGrid = true;
        if (z) {
            itemInfo.cellX = i5;
            layoutParams.cellX = i5;
            itemInfo.cellY = i6;
            layoutParams.cellY = i6;
        } else {
            layoutParams.tmpCellX = i5;
            layoutParams.tmpCellY = i6;
        }
        LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
        if (view2 instanceof LauncherAppWidgetHostView) {
            DeviceProfile deviceProfile = shortcutAndWidgetContainer.mLauncher.mDeviceProfile;
            int i9 = shortcutAndWidgetContainer.mCellWidth;
            int i10 = shortcutAndWidgetContainer.mCellHeight;
            int i11 = shortcutAndWidgetContainer.mWidthGap;
            int i12 = shortcutAndWidgetContainer.mHeightGap;
            layoutParams2.setup$ar$ds$9c4dc3d3_0(i9, i10, shortcutAndWidgetContainer.invertLayoutHorizontally(), shortcutAndWidgetContainer.mCountX, deviceProfile.appWidgetScale.x, deviceProfile.appWidgetScale.y);
        } else {
            int i13 = shortcutAndWidgetContainer.mCellWidth;
            int i14 = shortcutAndWidgetContainer.mCellHeight;
            int i15 = shortcutAndWidgetContainer.mWidthGap;
            int i16 = shortcutAndWidgetContainer.mHeightGap;
            layoutParams2.setup$ar$ds$9c4dc3d3_0(i13, i14, shortcutAndWidgetContainer.invertLayoutHorizontally(), shortcutAndWidgetContainer.mCountX, 1.0f, 1.0f);
        }
        layoutParams.isLockedToGrid = false;
        final int i17 = layoutParams.f16547x;
        int i18 = layoutParams.f16548y;
        layoutParams.f16547x = i7;
        layoutParams.f16548y = i8;
        if (i7 == i17 && i8 == i18) {
            layoutParams.isLockedToGrid = true;
            return true;
        }
        ValueAnimator ofFloat$ar$ds = LauncherAnimUtils.ofFloat$ar$ds(0.0f, 1.0f);
        ofFloat$ar$ds.setDuration((long) i3);
        this.mReorderAnimators.put(layoutParams, ofFloat$ar$ds);
        final LayoutParams layoutParams3 = layoutParams;
        final int i19 = i7;
        final int i20 = i8;
        final int i21 = i18;
        final View view3 = view;
        ofFloat$ar$ds.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LayoutParams layoutParams = LayoutParams.this;
                float f = 1.0f - floatValue;
                layoutParams.f16547x = (int) ((((float) i19) * f) + (((float) i17) * floatValue));
                layoutParams.f16548y = (int) ((f * ((float) i20)) + (floatValue * ((float) i21)));
                view3.requestLayout();
            }
        });
        ofFloat$ar$ds.addListener(new AnimatorListenerAdapter() {
            boolean cancelled = false;

            public final void onAnimationCancel(Animator animator) {
                this.cancelled = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.cancelled) {
                    layoutParams.isLockedToGrid = true;
                    view2.requestLayout();
                }
                if (CellLayout.this.mReorderAnimators.containsKey(layoutParams)) {
                    CellLayout.this.mReorderAnimators.remove(layoutParams);
                }
            }
        });
        ofFloat$ar$ds.setStartDelay((long) i4);
        ofFloat$ar$ds.start();
        return true;
    }

    public final void animateItemsToSolution(ItemConfiguration itemConfiguration, View view, boolean z) {
        CellAndSpan cellAndSpan;
        ItemConfiguration itemConfiguration2 = itemConfiguration;
        boolean[][] zArr = this.mTmpOccupied;
        for (int i = 0; i < this.mCountX; i++) {
            for (int i2 = 0; i2 < this.mCountY; i2++) {
                zArr[i][i2] = false;
            }
        }
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.mShortcutsAndWidgets.getChildAt(i3);
            if (!(childAt == view || (cellAndSpan = (CellAndSpan) itemConfiguration2.map.get(childAt)) == null)) {
                animateChildToPosition(childAt, cellAndSpan.f16545x, cellAndSpan.f16546y, 150, 0, false, false);
                markCellsForView(cellAndSpan.f16545x, cellAndSpan.f16546y, cellAndSpan.spanX, cellAndSpan.spanY, zArr, true);
            }
        }
        if (z) {
            markCellsForView(itemConfiguration2.dragViewX, itemConfiguration2.dragViewY, itemConfiguration2.dragViewSpanX, itemConfiguration2.dragViewSpanY, zArr, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r1 = r11.intersectingViews;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void beginOrAdjustReorderPreviewAnimations$ar$ds(com.android.launcher3.CellLayout.ItemConfiguration r19, android.view.View r20, int r21) {
        /*
            r18 = this;
            r10 = r18
            r11 = r19
            com.android.launcher3.ShortcutAndWidgetContainer r0 = r10.mShortcutsAndWidgets
            int r12 = r0.getChildCount()
            r14 = 0
        L_0x000b:
            if (r14 >= r12) goto L_0x00f9
            com.android.launcher3.ShortcutAndWidgetContainer r0 = r10.mShortcutsAndWidgets
            android.view.View r2 = r0.getChildAt(r14)
            r15 = r20
            if (r2 != r15) goto L_0x0019
            goto L_0x00f3
        L_0x0019:
            java.util.HashMap r0 = r11.map
            java.lang.Object r0 = r0.get(r2)
            com.android.launcher3.CellLayout$CellAndSpan r0 = (com.android.launcher3.CellLayout.CellAndSpan) r0
            r9 = 1
            if (r21 != 0) goto L_0x0030
            java.util.ArrayList r1 = r11.intersectingViews
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0030
            r1 = 1
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            com.android.launcher3.CellLayout$LayoutParams r3 = (com.android.launcher3.CellLayout.LayoutParams) r3
            if (r0 == 0) goto L_0x00f3
            if (r1 != 0) goto L_0x00f3
            com.android.launcher3.CellLayout$ReorderPreviewAnimation r8 = new com.android.launcher3.CellLayout$ReorderPreviewAnimation
            int r4 = r3.cellX
            int r5 = r3.cellY
            int r6 = r0.f16545x
            int r7 = r0.f16546y
            int r3 = r0.spanX
            int r1 = r0.spanY
            r0 = r8
            r16 = r1
            r1 = r18
            r17 = r3
            r3 = r21
            r13 = r8
            r8 = r17
            r10 = 1
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            float r0 = r13.finalDeltaX
            float r1 = r13.initDeltaX
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006d
            float r0 = r13.finalDeltaY
            float r1 = r13.initDeltaY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006d
            r9 = 1
            goto L_0x006e
        L_0x006d:
            r9 = 0
        L_0x006e:
            com.android.launcher3.CellLayout r0 = r13.this$0
            java.util.HashMap r0 = r0.mShakeAnimators
            android.view.View r1 = r13.child
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x009c
            com.android.launcher3.CellLayout r0 = r13.this$0
            java.util.HashMap r0 = r0.mShakeAnimators
            android.view.View r1 = r13.child
            java.lang.Object r0 = r0.get(r1)
            com.android.launcher3.CellLayout$ReorderPreviewAnimation r0 = (com.android.launcher3.CellLayout.ReorderPreviewAnimation) r0
            android.animation.Animator r0 = r0.f16549a
            if (r0 == 0) goto L_0x008d
            r0.cancel()
        L_0x008d:
            com.android.launcher3.CellLayout r0 = r13.this$0
            java.util.HashMap r0 = r0.mShakeAnimators
            android.view.View r1 = r13.child
            r0.remove(r1)
            if (r9 == 0) goto L_0x009f
            r13.completeAnimationImmediately()
            goto L_0x00f3
        L_0x009c:
            if (r9 == 0) goto L_0x009f
            goto L_0x00f3
        L_0x009f:
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = com.android.launcher3.LauncherAnimUtils.ofFloat$ar$ds(r1)
            r13.f16549a = r1
            com.android.launcher3.CellLayout r2 = r13.this$0
            android.content.Context r2 = r2.getContext()
            boolean r2 = com.android.launcher3.Utilities.isPowerSaverOn(r2)
            if (r2 != 0) goto L_0x00be
            r1.setRepeatMode(r0)
            r0 = -1
            r1.setRepeatCount(r0)
        L_0x00be:
            int r0 = r13.mode
            if (r10 == r0) goto L_0x00c5
            r2 = 350(0x15e, double:1.73E-321)
            goto L_0x00c7
        L_0x00c5:
            r2 = 300(0x12c, double:1.48E-321)
        L_0x00c7:
            r1.setDuration(r2)
            double r2 = java.lang.Math.random()
            r4 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r2 = r2 * r4
            int r0 = (int) r2
            long r2 = (long) r0
            r1.setStartDelay(r2)
            com.android.launcher3.CellLayout$ReorderPreviewAnimation$1 r0 = new com.android.launcher3.CellLayout$ReorderPreviewAnimation$1
            r0.<init>()
            r1.addUpdateListener(r0)
            com.android.launcher3.CellLayout$ReorderPreviewAnimation$2 r0 = new com.android.launcher3.CellLayout$ReorderPreviewAnimation$2
            r0.<init>()
            r1.addListener(r0)
            com.android.launcher3.CellLayout r0 = r13.this$0
            java.util.HashMap r0 = r0.mShakeAnimators
            android.view.View r2 = r13.child
            r0.put(r2, r13)
            r1.start()
        L_0x00f3:
            int r14 = r14 + 1
            r10 = r18
            goto L_0x000b
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.CellLayout.beginOrAdjustReorderPreviewAnimations$ar$ds(com.android.launcher3.CellLayout$ItemConfiguration, android.view.View, int):void");
    }

    public final void cancelLongPress() {
        super.cancelLongPress();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).cancelLongPress();
        }
    }

    /* access modifiers changed from: package-private */
    public final void cellToPoint(int i, int i2, int[] iArr) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        iArr[0] = paddingLeft + (i * this.mCellWidth);
        iArr[1] = paddingTop + (i2 * this.mCellHeight);
    }

    public final void cellToRect(int i, int i2, int i3, int i4, Rect rect) {
        int i5 = this.mCellWidth;
        int i6 = this.mCellHeight;
        int paddingLeft = getPaddingLeft() + (i * i5);
        int paddingTop = getPaddingTop() + (i2 * i6);
        rect.set(paddingLeft, paddingTop, (i3 * i5) + paddingLeft, (i4 * i6) + paddingTop);
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void clearDragOutlines() {
        this.mDragOutlineAnims[this.mDragOutlineCurrent].animate(2);
        int[] iArr = this.mDragCell;
        iArr[1] = -1;
        iArr[0] = -1;
    }

    public final void commitTempPlacement() {
        for (int i = 0; i < this.mCountX; i++) {
            for (int i2 = 0; i2 < this.mCountY; i2++) {
                this.mOccupied[i][i2] = this.mTmpOccupied[i][i2];
            }
        }
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.mShortcutsAndWidgets.getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ItemInfo itemInfo = (ItemInfo) childAt.getTag();
            if (itemInfo != null) {
                int i4 = itemInfo.cellX;
                int i5 = layoutParams.tmpCellX;
                if (!(i4 == i5 && itemInfo.cellY == layoutParams.tmpCellY && itemInfo.spanX == layoutParams.cellHSpan && itemInfo.spanY == layoutParams.cellVSpan)) {
                    itemInfo.requiresDbUpdate = true;
                }
                layoutParams.cellX = i5;
                itemInfo.cellX = i5;
                int i6 = layoutParams.tmpCellY;
                layoutParams.cellY = i6;
                itemInfo.cellY = i6;
                itemInfo.spanX = layoutParams.cellHSpan;
                itemInfo.spanY = layoutParams.cellVSpan;
            }
        }
        Workspace workspace = this.mLauncher.mWorkspace;
        int childCount2 = this.mShortcutsAndWidgets.getChildCount();
        long idForScreen = workspace.getIdForScreen(this);
        boolean isHotseatLayout = workspace.mLauncher.isHotseatLayout(this);
        int i7 = true != isHotseatLayout ? -100 : NetError.ERR_CONNECTION_RESET;
        if (true == isHotseatLayout) {
            idForScreen = -1;
        }
        for (int i8 = 0; i8 < childCount2; i8++) {
            ItemInfo itemInfo2 = (ItemInfo) this.mShortcutsAndWidgets.getChildAt(i8).getTag();
            if (itemInfo2 != null && itemInfo2.requiresDbUpdate) {
                itemInfo2.requiresDbUpdate = false;
                long j = idForScreen;
                LauncherModel.modifyItemInDatabase(workspace.mLauncher, itemInfo2, (long) i7, j, itemInfo2.cellX, itemInfo2.cellY, itemInfo2.spanX, itemInfo2.spanY);
            }
        }
    }

    public final void completeAndClearReorderPreviewAnimations() {
        for (ReorderPreviewAnimation completeAnimationImmediately : this.mShakeAnimators.values()) {
            completeAnimationImmediately.completeAnimationImmediately();
        }
        this.mShakeAnimators.clear();
    }

    public final void copySolutionToTempState(ItemConfiguration itemConfiguration, View view) {
        for (int i = 0; i < this.mCountX; i++) {
            for (int i2 = 0; i2 < this.mCountY; i2++) {
                this.mTmpOccupied[i][i2] = false;
            }
        }
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.mShortcutsAndWidgets.getChildAt(i3);
            if (childAt != view) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                CellAndSpan cellAndSpan = (CellAndSpan) itemConfiguration.map.get(childAt);
                if (cellAndSpan != null) {
                    int i4 = cellAndSpan.f16545x;
                    layoutParams.tmpCellX = i4;
                    int i5 = cellAndSpan.f16546y;
                    layoutParams.tmpCellY = i5;
                    int i6 = cellAndSpan.spanX;
                    layoutParams.cellHSpan = i6;
                    int i7 = cellAndSpan.spanY;
                    layoutParams.cellVSpan = i7;
                    markCellsForView(i4, i5, i6, i7, this.mTmpOccupied, true);
                }
            }
        }
        markCellsForView(itemConfiguration.dragViewX, itemConfiguration.dragViewY, itemConfiguration.dragViewSpanX, itemConfiguration.dragViewSpanY, this.mTmpOccupied, true);
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.mUseTouchHelper || !this.mTouchHelper.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        if (this.mJailContent) {
            sparseArray = getJailedArray$ar$ds(sparseArray);
        }
        super.dispatchRestoreInstanceState(sparseArray);
    }

    /* access modifiers changed from: protected */
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        if (this.mJailContent) {
            ParcelableSparseArray jailedArray$ar$ds = getJailedArray$ar$ds(sparseArray);
            super.dispatchSaveInstanceState(jailedArray$ar$ds);
            sparseArray.put(R.id.cell_layout_jail_id, jailedArray$ar$ds);
            return;
        }
        super.dispatchSaveInstanceState(sparseArray);
    }

    public final void enableAccessibleDrag(boolean z, int i) {
        this.mUseTouchHelper = z;
        if (!z) {
            C2043bi.m5526T(this, (C2061c) null);
            setImportantForAccessibility(2);
            this.mShortcutsAndWidgets.setImportantForAccessibility(2);
            setOnClickListener(this.mLauncher);
        } else {
            if (i == 2) {
                if (!(this.mTouchHelper instanceof WorkspaceAccessibilityHelper)) {
                    this.mTouchHelper = new WorkspaceAccessibilityHelper(this);
                }
            } else if (!(this.mTouchHelper instanceof FolderAccessibilityHelper)) {
                this.mTouchHelper = new FolderAccessibilityHelper(this);
            }
            C2043bi.m5526T(this, this.mTouchHelper);
            setImportantForAccessibility(1);
            this.mShortcutsAndWidgets.setImportantForAccessibility(1);
            setOnClickListener(this.mTouchHelper);
        }
        if (getParent() != null) {
            getParent().notifySubtreeAccessibilityStateChanged(this, this, 1);
        }
    }

    public final void enableHardwareLayer(boolean z) {
        this.mShortcutsAndWidgets.setLayerType(true != z ? 0 : 2, sPaint);
    }

    public final boolean findCellForSpan(int[] iArr, int i, int i2) {
        int i3 = this.mCountX - (i - 1);
        int i4 = this.mCountY - (i2 - 1);
        boolean z = false;
        for (int i5 = 0; i5 < i4 && !z; i5++) {
            int i6 = 0;
            while (true) {
                if (i6 >= i3) {
                    break;
                }
                for (int i7 = 0; i7 < i; i7++) {
                    int i8 = 0;
                    while (i8 < i2) {
                        int i9 = i6 + i7;
                        if (this.mOccupied[i9][i5 + i8]) {
                            i6 = i9 + 1;
                        } else {
                            i8++;
                        }
                    }
                }
                z = true;
                if (iArr != null) {
                    iArr[0] = i6;
                    iArr[1] = i5;
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] findNearestArea(int r28, int r29, int r30, int r31, int r32, int r33, boolean r34, int[] r35, int[] r36) {
        /*
            r27 = this;
            r6 = r27
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            java.util.Stack r0 = r6.mTempRectStack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0028
            r0 = 0
        L_0x0013:
            int r1 = r6.mCountX
            int r2 = r6.mCountY
            int r1 = r1 * r2
            if (r0 >= r1) goto L_0x0028
            java.util.Stack r1 = r6.mTempRectStack
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.push(r2)
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0028:
            r0 = r28
            float r0 = (float) r0
            int r1 = r6.mCellWidth
            int r2 = r9 + -1
            int r1 = r1 * r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0 - r1
            int r12 = (int) r0
            r0 = r29
            float r0 = (float) r0
            int r1 = r6.mCellHeight
            int r3 = r10 + -1
            int r1 = r1 * r3
            float r1 = (float) r1
            float r1 = r1 / r2
            float r0 = r0 - r1
            int r13 = (int) r0
            if (r35 == 0) goto L_0x0049
            r14 = r35
            goto L_0x004d
        L_0x0049:
            r0 = 2
            int[] r0 = new int[r0]
            r14 = r0
        L_0x004d:
            android.graphics.Rect r15 = new android.graphics.Rect
            r5 = -1
            r15.<init>(r5, r5, r5, r5)
            java.util.Stack r4 = new java.util.Stack
            r4.<init>()
            int r3 = r6.mCountX
            int r2 = r6.mCountY
            if (r7 <= 0) goto L_0x01fc
            if (r8 <= 0) goto L_0x01fc
            if (r9 <= 0) goto L_0x01fc
            if (r10 <= 0) goto L_0x01fc
            if (r9 < r7) goto L_0x01fc
            if (r10 < r8) goto L_0x01fc
            r16 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r18 = r16
            r1 = 0
        L_0x0070:
            int r0 = r8 + -1
            int r0 = r2 - r0
            r20 = 1
            if (r1 >= r0) goto L_0x01db
            r0 = 0
        L_0x0079:
            int r21 = r7 + -1
            int r5 = r3 - r21
            if (r0 >= r5) goto L_0x01c4
            if (r34 == 0) goto L_0x0134
            r5 = 0
        L_0x0082:
            if (r5 >= r7) goto L_0x00ad
            r11 = 0
        L_0x0085:
            if (r11 >= r8) goto L_0x00a8
            r29 = r4
            boolean[][] r4 = r6.mOccupied
            int r22 = r0 + r5
            r4 = r4[r22]
            int r22 = r1 + r11
            boolean r4 = r4[r22]
            if (r4 == 0) goto L_0x00a3
            r5 = r29
            r23 = r2
            r24 = r3
            r35 = r14
            r26 = -1
            r14 = r0
            r2 = r1
            goto L_0x01b1
        L_0x00a3:
            int r11 = r11 + 1
            r4 = r29
            goto L_0x0085
        L_0x00a8:
            r29 = r4
            int r5 = r5 + 1
            goto L_0x0082
        L_0x00ad:
            r29 = r4
            if (r7 < r9) goto L_0x00b3
            r4 = 1
            goto L_0x00b4
        L_0x00b3:
            r4 = 0
        L_0x00b4:
            if (r8 < r10) goto L_0x00b8
            r5 = 1
            goto L_0x00b9
        L_0x00b8:
            r5 = 0
        L_0x00b9:
            r11 = r8
            r22 = 1
        L_0x00bc:
            if (r4 == 0) goto L_0x00c8
            if (r5 != 0) goto L_0x00c2
            r5 = 0
            goto L_0x00c8
        L_0x00c2:
            r23 = r1
            r35 = r14
            goto L_0x013c
        L_0x00c8:
            if (r22 == 0) goto L_0x00f5
            if (r4 != 0) goto L_0x00f5
            r4 = 0
            r23 = 0
        L_0x00cf:
            if (r4 >= r11) goto L_0x00ec
            int r8 = r0 + r7
            r35 = r14
            int r14 = r3 + -1
            if (r8 > r14) goto L_0x00e3
            boolean[][] r14 = r6.mOccupied
            r8 = r14[r8]
            int r14 = r1 + r4
            boolean r8 = r8[r14]
            if (r8 == 0) goto L_0x00e5
        L_0x00e3:
            r23 = 1
        L_0x00e5:
            int r4 = r4 + 1
            r8 = r31
            r14 = r35
            goto L_0x00cf
        L_0x00ec:
            r35 = r14
            if (r23 != 0) goto L_0x00f2
            int r7 = r7 + 1
        L_0x00f2:
            r4 = r23
            goto L_0x011d
        L_0x00f5:
            r35 = r14
            if (r5 != 0) goto L_0x011d
            r5 = 0
            r8 = 0
        L_0x00fb:
            if (r5 >= r7) goto L_0x0115
            int r14 = r1 + r11
            r23 = r1
            int r1 = r2 + -1
            if (r14 > r1) goto L_0x010f
            boolean[][] r1 = r6.mOccupied
            int r24 = r0 + r5
            r1 = r1[r24]
            boolean r1 = r1[r14]
            if (r1 == 0) goto L_0x0110
        L_0x010f:
            r8 = 1
        L_0x0110:
            int r5 = r5 + 1
            r1 = r23
            goto L_0x00fb
        L_0x0115:
            r23 = r1
            if (r8 != 0) goto L_0x011b
            int r11 = r11 + 1
        L_0x011b:
            r5 = r8
            goto L_0x011f
        L_0x011d:
            r23 = r1
        L_0x011f:
            if (r7 < r9) goto L_0x0123
            r1 = 1
            goto L_0x0124
        L_0x0123:
            r1 = 0
        L_0x0124:
            r4 = r4 | r1
            if (r11 < r10) goto L_0x0129
            r1 = 1
            goto L_0x012a
        L_0x0129:
            r1 = 0
        L_0x012a:
            r5 = r5 | r1
            r22 = r22 ^ 1
            r8 = r31
            r14 = r35
            r1 = r23
            goto L_0x00bc
        L_0x0134:
            r23 = r1
            r29 = r4
            r35 = r14
            r7 = -1
            r11 = -1
        L_0x013c:
            int[] r8 = r6.mTmpPoint
            r4 = 1
            r5 = 1
            r14 = r0
            r0 = r27
            r22 = r23
            r1 = r14
            r23 = r2
            r2 = r22
            r24 = r3
            r3 = r4
            r25 = r29
            r4 = r5
            r26 = -1
            r5 = r8
            r0.regionToCenterPoint(r1, r2, r3, r4, r5)
            java.util.Stack r0 = r6.mTempRectStack
            java.lang.Object r0 = r0.pop()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r1 = r14 + r7
            int r3 = r2 + r11
            r0.set(r14, r2, r1, r3)
            int r1 = r25.size()
            r3 = 0
        L_0x016a:
            if (r3 >= r1) goto L_0x0182
            int r4 = r3 + 1
            r5 = r25
            java.lang.Object r3 = r5.get(r3)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x017e
            r1 = 1
            goto L_0x0185
        L_0x017e:
            r3 = r4
            r25 = r5
            goto L_0x016a
        L_0x0182:
            r5 = r25
            r1 = 0
        L_0x0185:
            r5.push(r0)
            r3 = 0
            r4 = r8[r3]
            int r4 = r4 - r12
            double r3 = (double) r4
            r8 = r8[r20]
            int r8 = r8 - r13
            double r8 = (double) r8
            double r3 = java.lang.Math.hypot(r3, r8)
            int r8 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r8 > 0) goto L_0x019b
            if (r1 == 0) goto L_0x01a1
        L_0x019b:
            boolean r1 = r0.contains(r15)
            if (r1 == 0) goto L_0x01b1
        L_0x01a1:
            r1 = 0
            r35[r1] = r14
            r35[r20] = r2
            if (r36 == 0) goto L_0x01ac
            r36[r1] = r7
            r36[r20] = r11
        L_0x01ac:
            r15.set(r0)
            r18 = r3
        L_0x01b1:
            int r0 = r14 + 1
            r7 = r30
            r8 = r31
            r9 = r32
            r14 = r35
            r1 = r2
            r4 = r5
            r2 = r23
            r3 = r24
            r5 = -1
            goto L_0x0079
        L_0x01c4:
            r23 = r2
            r24 = r3
            r5 = r4
            r35 = r14
            r26 = -1
            r2 = r1
            int r1 = r2 + 1
            r7 = r30
            r8 = r31
            r9 = r32
            r2 = r23
            r5 = -1
            goto L_0x0070
        L_0x01db:
            r5 = r4
            r35 = r14
            r26 = -1
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x01e9
            r0 = 0
            r35[r0] = r26
            r35[r20] = r26
        L_0x01e9:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x01fb
            java.util.Stack r0 = r6.mTempRectStack
            java.lang.Object r1 = r5.pop()
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r0.push(r1)
            goto L_0x01e9
        L_0x01fb:
            return r35
        L_0x01fc:
            r35 = r14
            return r35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.CellLayout.findNearestArea(int, int, int, int, int, int, boolean, int[], int[]):int[]");
    }

    public final ItemConfiguration findReorderSolution(int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, View view, boolean z, ItemConfiguration itemConfiguration) {
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        int i7;
        CellAndSpan cellAndSpan;
        int i8 = i4;
        int i9 = i5;
        int i10 = i6;
        View view2 = view;
        ItemConfiguration itemConfiguration2 = itemConfiguration;
        copyCurrentStateToSolution$ar$ds(itemConfiguration2);
        boolean[][] zArr = this.mTmpOccupied;
        for (int i11 = 0; i11 < this.mCountX; i11++) {
            for (int i12 = 0; i12 < this.mCountY; i12++) {
                zArr[i11][i12] = this.mOccupied[i11][i12];
            }
        }
        int[] findNearestArea = findNearestArea(i, i2, i5, i6, i5, i6, false, new int[2], (int[]) null);
        int i13 = findNearestArea[0];
        int i14 = findNearestArea[1];
        if (i13 >= 0 && i14 >= 0) {
            this.mIntersectingViews.clear();
            int i15 = i13 + i9;
            int i16 = i14 + i10;
            this.mOccupiedRect.set(i13, i14, i15, i16);
            if (!(view2 == null || (cellAndSpan = (CellAndSpan) itemConfiguration2.map.get(view2)) == null)) {
                cellAndSpan.f16545x = i13;
                cellAndSpan.f16546y = i14;
            }
            Rect rect = new Rect(i13, i14, i15, i16);
            Rect rect2 = new Rect();
            Iterator it = itemConfiguration2.map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    View view3 = (View) it.next();
                    if (view3 != view2) {
                        CellAndSpan cellAndSpan2 = (CellAndSpan) itemConfiguration2.map.get(view3);
                        LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                        int i17 = cellAndSpan2.f16545x;
                        int i18 = cellAndSpan2.f16546y;
                        rect2.set(i17, i18, cellAndSpan2.spanX + i17, cellAndSpan2.spanY + i18);
                        if (Rect.intersects(rect, rect2)) {
                            if (!layoutParams.canReorder) {
                                break;
                            }
                            this.mIntersectingViews.add(view3);
                        }
                    }
                } else {
                    itemConfiguration2.intersectingViews = new ArrayList(this.mIntersectingViews);
                    ArrayList arrayList2 = this.mIntersectingViews;
                    Rect rect3 = this.mOccupiedRect;
                    if (Math.abs(iArr[0]) + Math.abs(iArr[1]) > 1) {
                        int i19 = iArr[1];
                        iArr[1] = 0;
                        if (!pushViewsToTempLocation(arrayList2, rect3, iArr, view, itemConfiguration)) {
                            iArr[1] = i19;
                            int i20 = iArr[0];
                            iArr[0] = 0;
                            if (!pushViewsToTempLocation(arrayList2, rect3, iArr, view, itemConfiguration)) {
                                iArr[0] = i20;
                                iArr[0] = -i20;
                                int i21 = -iArr[1];
                                iArr[1] = i21;
                                iArr[1] = 0;
                                int i22 = i21;
                                if (!pushViewsToTempLocation(arrayList2, rect3, iArr, view, itemConfiguration)) {
                                    iArr[1] = i22;
                                    int i23 = iArr[0];
                                    iArr[0] = 0;
                                    if (!pushViewsToTempLocation(arrayList2, rect3, iArr, view, itemConfiguration)) {
                                        iArr[0] = i23;
                                        iArr[0] = -i23;
                                        iArr[1] = -iArr[1];
                                    }
                                }
                            }
                        }
                        itemConfiguration2.isSolution = true;
                        itemConfiguration2.dragViewX = findNearestArea[0];
                        itemConfiguration2.dragViewY = findNearestArea[1];
                        itemConfiguration2.dragViewSpanX = i9;
                        itemConfiguration2.dragViewSpanY = i10;
                    } else {
                        if (!pushViewsToTempLocation(arrayList2, rect3, iArr, view, itemConfiguration)) {
                            iArr[0] = -iArr[0];
                            iArr[1] = -iArr[1];
                            if (!pushViewsToTempLocation(arrayList2, rect3, iArr, view, itemConfiguration)) {
                                int i24 = -iArr[0];
                                iArr[0] = i24;
                                int i25 = -iArr[1];
                                iArr[1] = i25;
                                iArr[1] = i24;
                                iArr[0] = i25;
                                if (!pushViewsToTempLocation(arrayList2, rect3, iArr, view, itemConfiguration)) {
                                    iArr[0] = -iArr[0];
                                    iArr[1] = -iArr[1];
                                    if (!pushViewsToTempLocation(arrayList2, rect3, iArr, view, itemConfiguration)) {
                                        int i26 = -iArr[0];
                                        iArr[0] = i26;
                                        int i27 = -iArr[1];
                                        iArr[1] = i27;
                                        iArr[1] = i26;
                                        iArr[0] = i27;
                                    }
                                }
                            }
                        }
                        itemConfiguration2.isSolution = true;
                        itemConfiguration2.dragViewX = findNearestArea[0];
                        itemConfiguration2.dragViewY = findNearestArea[1];
                        itemConfiguration2.dragViewSpanX = i9;
                        itemConfiguration2.dragViewSpanY = i10;
                    }
                    ArrayList arrayList3 = this.mIntersectingViews;
                    Rect rect4 = this.mOccupiedRect;
                    if (arrayList3.size() != 0) {
                        int size = arrayList3.size();
                        Rect rect5 = null;
                        for (int i28 = 0; i28 < size; i28++) {
                            CellAndSpan cellAndSpan3 = (CellAndSpan) itemConfiguration2.map.get((View) arrayList3.get(i28));
                            if (rect5 == null) {
                                int i29 = cellAndSpan3.f16545x;
                                int i30 = cellAndSpan3.f16546y;
                                rect5 = new Rect(i29, i30, cellAndSpan3.spanX + i29, cellAndSpan3.spanY + i30);
                            } else {
                                int i31 = cellAndSpan3.f16545x;
                                int i32 = cellAndSpan3.f16546y;
                                rect5.union(i31, i32, cellAndSpan3.spanX + i31, cellAndSpan3.spanY + i32);
                            }
                        }
                        int i33 = 0;
                        for (int size2 = arrayList3.size(); i33 < size2; size2 = size2) {
                            CellAndSpan cellAndSpan4 = (CellAndSpan) itemConfiguration2.map.get((View) arrayList3.get(i33));
                            int i34 = i33;
                            markCellsForView(cellAndSpan4.f16545x, cellAndSpan4.f16546y, cellAndSpan4.spanX, cellAndSpan4.spanY, this.mTmpOccupied, false);
                            i33 = i34 + 1;
                            rect5 = rect5;
                        }
                        Rect rect6 = rect5;
                        int width = rect6.width();
                        int[] iArr2 = new int[2];
                        iArr2[1] = rect6.height();
                        iArr2[0] = width;
                        boolean[][] zArr2 = (boolean[][]) Array.newInstance(Boolean.TYPE, iArr2);
                        int i35 = rect6.top;
                        int i36 = rect6.left;
                        int size3 = arrayList3.size();
                        int i37 = 0;
                        while (i37 < size3) {
                            CellAndSpan cellAndSpan5 = (CellAndSpan) itemConfiguration2.map.get((View) arrayList3.get(i37));
                            int i38 = i37;
                            int i39 = size3;
                            markCellsForView(cellAndSpan5.f16545x - i36, cellAndSpan5.f16546y - i35, cellAndSpan5.spanX, cellAndSpan5.spanY, zArr2, true);
                            i37 = i38 + 1;
                            i36 = i36;
                            size3 = i39;
                            i35 = i35;
                        }
                        markCellsForRect$ar$ds(rect4, this.mTmpOccupied);
                        boolean[][] zArr3 = zArr2;
                        ArrayList arrayList4 = arrayList3;
                        findNearestArea$ar$ds(rect6.left, rect6.top, rect6.width(), rect6.height(), iArr, this.mTmpOccupied, zArr3, this.mTempLocation);
                        int[] iArr3 = this.mTempLocation;
                        int i40 = iArr3[0];
                        if (i40 < 0 || iArr3[1] < 0) {
                            arrayList = arrayList4;
                            z2 = false;
                        } else {
                            int i41 = i40 - rect6.left;
                            int i42 = this.mTempLocation[1] - rect6.top;
                            int size4 = arrayList4.size();
                            for (int i43 = 0; i43 < size4; i43++) {
                                CellAndSpan cellAndSpan6 = (CellAndSpan) itemConfiguration2.map.get((View) arrayList4.get(i43));
                                cellAndSpan6.f16545x += i41;
                                cellAndSpan6.f16546y += i42;
                            }
                            arrayList = arrayList4;
                            z2 = true;
                        }
                        int size5 = arrayList.size();
                        for (int i44 = 0; i44 < size5; i44++) {
                            CellAndSpan cellAndSpan7 = (CellAndSpan) itemConfiguration2.map.get((View) arrayList.get(i44));
                            markCellsForView(cellAndSpan7.f16545x, cellAndSpan7.f16546y, cellAndSpan7.spanX, cellAndSpan7.spanY, this.mTmpOccupied, true);
                        }
                        if (!z2) {
                            ArrayList arrayList5 = this.mIntersectingViews;
                            int size6 = arrayList5.size();
                            int i45 = 0;
                            while (true) {
                                if (i45 >= size6) {
                                    break;
                                }
                                Rect rect7 = this.mOccupiedRect;
                                CellAndSpan cellAndSpan8 = (CellAndSpan) itemConfiguration2.map.get((View) arrayList5.get(i45));
                                CellAndSpan cellAndSpan9 = cellAndSpan8;
                                int i46 = i45;
                                markCellsForView(cellAndSpan8.f16545x, cellAndSpan8.f16546y, cellAndSpan8.spanX, cellAndSpan8.spanY, this.mTmpOccupied, false);
                                markCellsForRect$ar$ds(rect7, this.mTmpOccupied);
                                int i47 = size6;
                                findNearestArea$ar$ds(cellAndSpan9.f16545x, cellAndSpan9.f16546y, cellAndSpan9.spanX, cellAndSpan9.spanY, iArr, this.mTmpOccupied, (boolean[][]) null, this.mTempLocation);
                                int[] iArr4 = this.mTempLocation;
                                int i48 = iArr4[0];
                                if (i48 < 0 || (i7 = iArr4[1]) < 0) {
                                    z3 = false;
                                } else {
                                    cellAndSpan9.f16545x = i48;
                                    cellAndSpan9.f16546y = i7;
                                    z3 = true;
                                }
                                markCellsForView(cellAndSpan9.f16545x, cellAndSpan9.f16546y, cellAndSpan9.spanX, cellAndSpan9.spanY, this.mTmpOccupied, true);
                                int i49 = i46 + 1;
                                if (!z3) {
                                    break;
                                }
                                i45 = i49;
                                size6 = i47;
                            }
                        }
                    }
                    itemConfiguration2.isSolution = true;
                    itemConfiguration2.dragViewX = findNearestArea[0];
                    itemConfiguration2.dragViewY = findNearestArea[1];
                    itemConfiguration2.dragViewSpanX = i9;
                    itemConfiguration2.dragViewSpanY = i10;
                }
            }
        }
        int i50 = i4;
        if (i9 > i3 && (i50 == i10 || z)) {
            return findReorderSolution(i, i2, i3, i4, i9 - 1, i6, iArr, view, false, itemConfiguration);
        } else if (i10 > i50) {
            return findReorderSolution(i, i2, i3, i4, i5, i10 - 1, iArr, view, true, itemConfiguration);
        } else {
            itemConfiguration2.isSolution = false;
            return itemConfiguration2;
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public float getBackgroundAlpha() {
        return this.mBackgroundAlpha;
    }

    public final float getChildrenScale() {
        if (this.mIsHotseat) {
            return this.mHotseatScale;
        }
        return 1.0f;
    }

    public final float getDistanceFromCell(float f, float f2, int[] iArr) {
        regionToCenterPoint(iArr[0], iArr[1], 1, 1, this.mTmpPoint);
        int[] iArr2 = this.mTmpPoint;
        return (float) Math.hypot((double) (f - ((float) iArr2[0])), (double) (f2 - ((float) iArr2[1])));
    }

    public final int getUnusedHorizontalSpace() {
        return ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - (this.mCountX * this.mCellWidth);
    }

    public final void getViewsIntersectingRegion(int i, int i2, int i3, int i4, View view, Rect rect, ArrayList arrayList) {
        if (rect != null) {
            rect.set(i, i2, i + i3, i2 + i4);
        }
        arrayList.clear();
        Rect rect2 = new Rect(i, i2, i3 + i, i4 + i2);
        Rect rect3 = new Rect();
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = this.mShortcutsAndWidgets.getChildAt(i5);
            if (childAt != view) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i6 = layoutParams.cellX;
                int i7 = layoutParams.cellY;
                rect3.set(i6, i7, layoutParams.cellHSpan + i6, layoutParams.cellVSpan + i7);
                if (Rect.intersects(rect2, rect3)) {
                    this.mIntersectingViews.add(childAt);
                    if (rect != null) {
                        rect.union(rect3);
                    }
                }
            }
        }
    }

    public final boolean isOccupied(int i, int i2) {
        if (i < this.mCountX && i2 < this.mCountY) {
            return this.mOccupied[i][i2];
        }
        throw new RuntimeException("Position exceeds the bound of this CellLayout");
    }

    public final boolean isRegionVacant(int i, int i2, int i3, int i4) {
        int i5 = (i3 + i) - 1;
        int i6 = (i4 + i2) - 1;
        if (i < 0 || i2 < 0 || i5 >= this.mCountX || i6 >= this.mCountY) {
            return false;
        }
        while (i <= i5) {
            for (int i7 = i2; i7 <= i6; i7++) {
                if (this.mOccupied[i][i7]) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    public final void markCellsAsOccupiedForView(View view) {
        if (view != null && view.getParent() == this.mShortcutsAndWidgets) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            markCellsForView(layoutParams.cellX, layoutParams.cellY, layoutParams.cellHSpan, layoutParams.cellVSpan, this.mOccupied, true);
        }
    }

    public final void markCellsAsUnoccupiedForView(View view) {
        if (view != null && view.getParent() == this.mShortcutsAndWidgets) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            markCellsForView(layoutParams.cellX, layoutParams.cellY, layoutParams.cellHSpan, layoutParams.cellVSpan, this.mOccupied, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.mIsDragTarget) {
            if (this.mBackgroundAlpha > 0.0f) {
                this.mBackground.draw(canvas);
            }
            Paint paint = this.mDragOutlinePaint;
            int i = 0;
            while (true) {
                Rect[] rectArr = this.mDragOutlines;
                int length = rectArr.length;
                if (i >= 4) {
                    break;
                }
                float f = this.mDragOutlineAlphas[i];
                if (f > 0.0f) {
                    this.mTempRect.set(rectArr[i]);
                    Utilities.scaleRectAboutCenter(this.mTempRect, getChildrenScale());
                    Object obj = this.mDragOutlineAnims[i].mTag;
                    paint.setAlpha((int) (f + 0.5f));
                    canvas.drawBitmap((Bitmap) obj, (Rect) null, this.mTempRect, paint);
                }
                i++;
            }
            int i2 = FolderIcon.FolderRingAnimator.sPreviewSize;
            DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
            for (int i3 = 0; i3 < this.mFolderOuterRings.size(); i3++) {
                FolderIcon.FolderRingAnimator folderRingAnimator = (FolderIcon.FolderRingAnimator) this.mFolderOuterRings.get(i3);
                cellToPoint(folderRingAnimator.mCellX, folderRingAnimator.mCellY, this.mTempLocation);
                View childAt = this.mShortcutsAndWidgets.getChildAt(folderRingAnimator.mCellX, folderRingAnimator.mCellY);
                if (childAt != null) {
                    int[] iArr = this.mTempLocation;
                    int i4 = iArr[0] + (this.mCellWidth / 2);
                    int paddingTop = iArr[1] + (i2 / 2) + childAt.getPaddingTop() + deviceProfile.folderBackgroundOffset;
                    Drawable drawable = FolderIcon.FolderRingAnimator.sSharedOuterRingDrawable;
                    int childrenScale = (int) (folderRingAnimator.mOuterRingSize * getChildrenScale());
                    canvas.save();
                    int i5 = childrenScale / 2;
                    canvas.translate((float) (i4 - i5), (float) (paddingTop - i5));
                    drawable.setBounds(0, 0, childrenScale, childrenScale);
                    drawable.draw(canvas);
                    canvas.restore();
                    Drawable drawable2 = FolderIcon.FolderRingAnimator.sSharedInnerRingDrawable;
                    int childrenScale2 = (int) (folderRingAnimator.mInnerRingSize * getChildrenScale());
                    canvas.save();
                    int i6 = childrenScale2 / 2;
                    canvas.translate((float) (i4 - i6), (float) (paddingTop - i6));
                    drawable2.setBounds(0, 0, childrenScale2, childrenScale2);
                    drawable2.draw(canvas);
                    canvas.restore();
                }
            }
            int[] iArr2 = this.mFolderLeaveBehindCell;
            if (iArr2[0] >= 0 && iArr2[1] >= 0) {
                Drawable drawable3 = FolderIcon.sSharedFolderLeaveBehind;
                int intrinsicWidth = drawable3.getIntrinsicWidth();
                int intrinsicHeight = drawable3.getIntrinsicHeight();
                int[] iArr3 = this.mFolderLeaveBehindCell;
                cellToPoint(iArr3[0], iArr3[1], this.mTempLocation);
                int[] iArr4 = this.mFolderLeaveBehindCell;
                View childAt2 = this.mShortcutsAndWidgets.getChildAt(iArr4[0], iArr4[1]);
                if (childAt2 != null) {
                    int[] iArr5 = this.mTempLocation;
                    int i7 = iArr5[0];
                    int i8 = this.mCellWidth;
                    int i9 = iArr5[1];
                    int paddingTop2 = childAt2.getPaddingTop();
                    int i10 = deviceProfile.folderBackgroundOffset;
                    canvas.save();
                    int i11 = intrinsicWidth / 2;
                    canvas.translate((float) ((i7 + (i8 / 2)) - i11), (float) ((((i9 + (i2 / 2)) + paddingTop2) + i10) - i11));
                    drawable3.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    drawable3.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void onDropChild(View view) {
        if (view != null) {
            ((LayoutParams) view.getLayoutParams()).dropped = true;
            view.requestLayout();
            markCellsAsOccupiedForView(view);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mUseTouchHelper) {
            return true;
        }
        View.OnTouchListener onTouchListener = this.mInterceptTouchListener;
        return onTouchListener != null && onTouchListener.onTouch(this, motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mShortcutsAndWidgets.getChildCount() > 0) {
            boolean z2 = ((LayoutParams) this.mShortcutsAndWidgets.getChildAt(0).getLayoutParams()).isFullscreen;
        }
        int paddingLeft = getPaddingLeft() + ((int) Math.ceil((double) (((float) getUnusedHorizontalSpace()) / 2.0f)));
        int paddingTop = getPaddingTop();
        ClickShadowView clickShadowView = this.mTouchFeedbackView;
        clickShadowView.layout(paddingLeft, paddingTop, clickShadowView.getMeasuredWidth() + paddingLeft, this.mTouchFeedbackView.getMeasuredHeight() + paddingTop);
        this.mShortcutsAndWidgets.layout(paddingLeft, paddingTop, (i3 + paddingLeft) - i, (i4 + paddingTop) - i2);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = size - (getPaddingLeft() + getPaddingRight());
        int paddingTop = size2 - (getPaddingTop() + getPaddingBottom());
        if (this.mFixedCellWidth < 0 || this.mFixedCellHeight < 0) {
            int i4 = this.mCountX;
            int i5 = paddingLeft / i4;
            int i6 = paddingTop / this.mCountY;
            if (!(i5 == this.mCellWidth && i6 == this.mCellHeight)) {
                this.mCellWidth = i5;
                this.mCellHeight = i6;
                this.mShortcutsAndWidgets.setCellDimensions$ar$ds$bb6a3296_0(i5, i6, i4);
            }
        }
        int i7 = this.mFixedWidth;
        if (i7 > 0 && (i3 = this.mFixedHeight) > 0) {
            paddingLeft = i7;
            paddingTop = i3;
        } else if (mode == 0 || mode2 == 0) {
            throw new RuntimeException("CellLayout cannot have UNSPECIFIED dimensions");
        }
        this.mWidthGap = 0;
        this.mHeightGap = 0;
        ClickShadowView clickShadowView = this.mTouchFeedbackView;
        clickShadowView.measure(View.MeasureSpec.makeMeasureSpec(this.mCellWidth + clickShadowView.getExtraSize(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCellHeight + this.mTouchFeedbackView.getExtraSize(), 1073741824));
        this.mShortcutsAndWidgets.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        int measuredWidth = this.mShortcutsAndWidgets.getMeasuredWidth();
        int measuredHeight = this.mShortcutsAndWidgets.getMeasuredHeight();
        if (this.mFixedWidth <= 0 || this.mFixedHeight <= 0) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mBackground.getPadding(this.mTempRect);
        this.mBackground.setBounds(-this.mTempRect.left, -this.mTempRect.top, i + this.mTempRect.right, i2 + this.mTempRect.bottom);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.mLauncher.mWorkspace.isInOverviewMode() || !this.mStylusEventHelper.checkAndPerformStylusEvent(motionEvent)) {
            return onTouchEvent;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01d4, code lost:
        if (r3 == 3) goto L_0x01de;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] performReorder(int r24, int r25, int r26, int r27, int r28, int r29, android.view.View r30, int[] r31, int[] r32, int r33) {
        /*
            r23 = this;
            r11 = r23
            r12 = r28
            r13 = r29
            r14 = r30
            r10 = r33
            r7 = 0
            r9 = 0
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r28
            r4 = r29
            r5 = r28
            r6 = r29
            r8 = r31
            int[] r15 = r0.findNearestArea(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r9 = 2
            if (r32 != 0) goto L_0x0028
            int[] r0 = new int[r9]
            r16 = r0
            goto L_0x002a
        L_0x0028:
            r16 = r32
        L_0x002a:
            r8 = 3
            r7 = 1
            r6 = 0
            if (r10 == r9) goto L_0x0034
            if (r10 == r8) goto L_0x0034
            r0 = 4
            if (r10 != r0) goto L_0x005f
        L_0x0034:
            int[] r0 = r11.mPreviousReorderDirection
            r1 = r0[r6]
            r2 = -100
            if (r1 == r2) goto L_0x005f
            int[] r3 = r11.mDirectionVector
            r3[r6] = r1
            r1 = r0[r7]
            r3[r7] = r1
            if (r10 == r9) goto L_0x0052
            if (r10 != r8) goto L_0x004b
            r1 = 3
            r10 = 3
            goto L_0x0053
        L_0x004b:
            r31 = r15
            r8 = 1
            r9 = 0
            r15 = 2
            goto L_0x0118
        L_0x0052:
            r1 = r10
        L_0x0053:
            r0[r6] = r2
            r0[r7] = r2
            r7 = r1
            r31 = r15
            r8 = 1
            r9 = 0
            r15 = 2
            goto L_0x0119
        L_0x005f:
            int[] r5 = r11.mDirectionVector
            int[] r4 = new int[r9]
            r17 = 0
            r18 = 0
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r28
            r19 = r4
            r4 = r29
            r20 = r5
            r5 = r28
            r6 = r29
            r7 = r17
            r8 = r19
            r31 = r15
            r15 = 2
            r9 = r18
            r0.findNearestArea(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r9 = 0
            r1 = r19[r9]
            r8 = 1
            r2 = r19[r8]
            r5 = r6
            r0.regionToRect(r1, r2, r3, r4, r5)
            int r0 = r6.centerX()
            int r0 = r24 - r0
            int r1 = r6.centerY()
            int r1 = r25 - r1
            r6.offset(r0, r1)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r1 = r19[r9]
            r2 = r19[r8]
            java.util.ArrayList r6 = r11.mIntersectingViews
            r0 = r23
            r5 = r30
            r17 = r6
            r6 = r7
            r32 = r7
            r7 = r17
            r0.getViewsIntersectingRegion(r1, r2, r3, r4, r5, r6, r7)
            int r6 = r32.width()
            int r7 = r32.height()
            r5 = r32
            int r1 = r5.left
            int r2 = r5.top
            int r3 = r5.width()
            int r4 = r5.height()
            r17 = r5
            r0.regionToRect(r1, r2, r3, r4, r5)
            int r0 = r17.centerX()
            int r0 = r0 - r24
            int r0 = r0 / r12
            int r1 = r17.centerY()
            int r1 = r1 - r25
            int r1 = r1 / r13
            int r2 = r11.mCountX
            if (r6 == r2) goto L_0x00ee
            if (r12 != r2) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r6 = r0
            goto L_0x00ef
        L_0x00ee:
            r6 = 0
        L_0x00ef:
            int r0 = r11.mCountY
            if (r7 == r0) goto L_0x00f5
            if (r13 != r0) goto L_0x00f6
        L_0x00f5:
            r1 = 0
        L_0x00f6:
            if (r6 != 0) goto L_0x0105
            if (r1 != 0) goto L_0x0101
            r0 = r20
            r0[r9] = r8
            r0[r8] = r9
            goto L_0x010c
        L_0x0101:
            r0 = r20
            r6 = 0
            goto L_0x0107
        L_0x0105:
            r0 = r20
        L_0x0107:
            float r2 = (float) r6
            float r1 = (float) r1
            computeDirectionVector$ar$ds(r2, r1, r0)
        L_0x010c:
            int[] r0 = r11.mPreviousReorderDirection
            int[] r1 = r11.mDirectionVector
            r2 = r1[r9]
            r0[r9] = r2
            r1 = r1[r8]
            r0[r8] = r1
        L_0x0118:
            r7 = r10
        L_0x0119:
            int[] r6 = r11.mDirectionVector
            com.android.launcher3.CellLayout$ItemConfiguration r17 = new com.android.launcher3.CellLayout$ItemConfiguration
            r17.<init>()
            r18 = 1
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r19 = r6
            r6 = r29
            r21 = r7
            r7 = r19
            r8 = r30
            r9 = r18
            r22 = r10
            r10 = r17
            com.android.launcher3.CellLayout$ItemConfiguration r10 = r0.findReorderSolution(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.android.launcher3.CellLayout$ItemConfiguration r9 = new com.android.launcher3.CellLayout$ItemConfiguration
            r9.<init>()
            int[] r8 = new int[r15]
            int[] r7 = new int[r15]
            r17 = 1
            r12 = r7
            r7 = r17
            r13 = r8
            r15 = r9
            r9 = r12
            r0.findNearestArea(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = r13[r0]
            if (r1 < 0) goto L_0x0177
            r1 = 1
            r2 = r13[r1]
            if (r2 < 0) goto L_0x0178
            r11.copyCurrentStateToSolution$ar$ds(r15)
            r2 = r13[r0]
            r15.dragViewX = r2
            r2 = r13[r1]
            r15.dragViewY = r2
            r2 = r12[r0]
            r15.dragViewSpanX = r2
            r2 = r12[r1]
            r15.dragViewSpanY = r2
            r15.isSolution = r1
            r7 = 1
            goto L_0x017b
        L_0x0177:
            r1 = 1
        L_0x0178:
            r15.isSolution = r0
            r7 = 0
        L_0x017b:
            boolean r2 = r10.isSolution
            if (r2 == 0) goto L_0x018e
            int r2 = r10.dragViewSpanX
            int r3 = r10.dragViewSpanY
            int r2 = r2 * r3
            int r3 = r15.dragViewSpanX
            int r4 = r15.dragViewSpanY
            int r3 = r3 * r4
            if (r2 < r3) goto L_0x018e
            goto L_0x0193
        L_0x018e:
            if (r7 == 0) goto L_0x0192
            r10 = r15
            goto L_0x0193
        L_0x0192:
            r10 = 0
        L_0x0193:
            r2 = -1
            r3 = r22
            if (r3 != 0) goto L_0x01b7
            if (r10 == 0) goto L_0x01ae
            r11.beginOrAdjustReorderPreviewAnimations$ar$ds(r10, r14, r0)
            int r2 = r10.dragViewX
            r31[r0] = r2
            int r2 = r10.dragViewY
            r31[r1] = r2
            int r2 = r10.dragViewSpanX
            r16[r0] = r2
            int r0 = r10.dragViewSpanY
            r16[r1] = r0
            goto L_0x01b6
        L_0x01ae:
            r16[r1] = r2
            r16[r0] = r2
            r31[r1] = r2
            r31[r0] = r2
        L_0x01b6:
            return r31
        L_0x01b7:
            r11.setUseTempCoords(r1)
            if (r10 == 0) goto L_0x01fd
            int r2 = r10.dragViewX
            r31[r0] = r2
            int r2 = r10.dragViewY
            r31[r1] = r2
            int r2 = r10.dragViewSpanX
            r16[r0] = r2
            int r2 = r10.dragViewSpanY
            r16[r1] = r2
            if (r3 == r1) goto L_0x01dc
            r2 = r21
            r4 = 2
            if (r2 == r4) goto L_0x01da
            r2 = 3
            if (r3 != r2) goto L_0x01d7
            goto L_0x01de
        L_0x01d7:
            r1 = 2
            r7 = 1
            goto L_0x0207
        L_0x01da:
            r2 = 3
            goto L_0x01de
        L_0x01dc:
            r2 = 3
            r4 = 2
        L_0x01de:
            r11.copySolutionToTempState(r10, r14)
            r11.mItemPlacementDirty = r1
            if (r3 != r4) goto L_0x01e7
            r7 = 1
            goto L_0x01e8
        L_0x01e7:
            r7 = 0
        L_0x01e8:
            r11.animateItemsToSolution(r10, r14, r7)
            if (r3 == r4) goto L_0x01f4
            if (r3 != r2) goto L_0x01f0
            goto L_0x01f4
        L_0x01f0:
            r11.beginOrAdjustReorderPreviewAnimations$ar$ds(r10, r14, r1)
            goto L_0x01d7
        L_0x01f4:
            r23.commitTempPlacement()
            r23.completeAndClearReorderPreviewAnimations()
            r11.mItemPlacementDirty = r0
            goto L_0x01d7
        L_0x01fd:
            r16[r1] = r2
            r16[r0] = r2
            r31[r1] = r2
            r31[r0] = r2
            r1 = 2
            r7 = 0
        L_0x0207:
            if (r3 == r1) goto L_0x020b
            if (r7 != 0) goto L_0x020e
        L_0x020b:
            r11.setUseTempCoords(r0)
        L_0x020e:
            com.android.launcher3.ShortcutAndWidgetContainer r0 = r11.mShortcutsAndWidgets
            r0.requestLayout()
            return r31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.CellLayout.performReorder(int, int, int, int, int, int, android.view.View, int[], int[], int):int[]");
    }

    /* access modifiers changed from: package-private */
    public final void regionToCenterPoint(int i, int i2, int i3, int i4, int[] iArr) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = this.mCellWidth;
        iArr[0] = paddingLeft + (i * i5) + ((i3 * i5) / 2);
        int i6 = this.mCellHeight;
        iArr[1] = paddingTop + (i2 * i6) + ((i4 * i6) / 2);
    }

    /* access modifiers changed from: package-private */
    public final void regionToRect(int i, int i2, int i3, int i4, Rect rect) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = this.mCellWidth;
        int i6 = paddingLeft + (i * i5);
        int i7 = this.mCellHeight;
        int i8 = paddingTop + (i2 * i7);
        rect.set(i6, i8, (i3 * i5) + i6, (i4 * i7) + i8);
    }

    public final void removeAllViews() {
        clearOccupiedCells();
        this.mShortcutsAndWidgets.removeAllViews();
    }

    public final void removeAllViewsInLayout() {
        if (this.mShortcutsAndWidgets.getChildCount() > 0) {
            clearOccupiedCells();
            this.mShortcutsAndWidgets.removeAllViewsInLayout();
        }
    }

    public final void removeView(View view) {
        markCellsAsUnoccupiedForView(view);
        this.mShortcutsAndWidgets.removeView(view);
    }

    public final void removeViewAt(int i) {
        markCellsAsUnoccupiedForView(this.mShortcutsAndWidgets.getChildAt(i));
        this.mShortcutsAndWidgets.removeViewAt(i);
    }

    public final void removeViewInLayout(View view) {
        markCellsAsUnoccupiedForView(view);
        this.mShortcutsAndWidgets.removeViewInLayout(view);
    }

    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            markCellsAsUnoccupiedForView(this.mShortcutsAndWidgets.getChildAt(i3));
        }
        this.mShortcutsAndWidgets.removeViews(i, i2);
    }

    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            markCellsAsUnoccupiedForView(this.mShortcutsAndWidgets.getChildAt(i3));
        }
        this.mShortcutsAndWidgets.removeViewsInLayout(i, i2);
    }

    /* access modifiers changed from: package-private */
    public final void revertTempState() {
        completeAndClearReorderPreviewAnimations();
        if (this.mItemPlacementDirty) {
            int childCount = this.mShortcutsAndWidgets.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.mShortcutsAndWidgets.getChildAt(i);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i2 = layoutParams.tmpCellX;
                int i3 = layoutParams.cellX;
                if (i2 != i3 || layoutParams.tmpCellY != layoutParams.cellY) {
                    layoutParams.tmpCellX = i3;
                    int i4 = layoutParams.cellY;
                    layoutParams.tmpCellY = i4;
                    animateChildToPosition(childAt, i3, i4, 150, 0, false, false);
                }
            }
            this.mItemPlacementDirty = false;
        }
    }

    public void setBackgroundAlpha(float f) {
        if (this.mBackgroundAlpha != f) {
            this.mBackgroundAlpha = f;
            this.mBackground.setAlpha((int) (f * 255.0f));
        }
    }

    /* access modifiers changed from: protected */
    public final void setChildrenDrawingCacheEnabled(boolean z) {
        this.mShortcutsAndWidgets.setChildrenDrawingCacheEnabled(z);
    }

    /* access modifiers changed from: protected */
    public final void setChildrenDrawnWithCacheEnabled(boolean z) {
        this.mShortcutsAndWidgets.setChildrenDrawnWithCacheEnabled(z);
    }

    public final void setGridSize(int i, int i2) {
        this.mCountX = i;
        this.mCountY = i2;
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i;
        this.mOccupied = (boolean[][]) Array.newInstance(Boolean.TYPE, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = i2;
        iArr2[0] = i;
        this.mTmpOccupied = (boolean[][]) Array.newInstance(Boolean.TYPE, iArr2);
        this.mTempRectStack.clear();
        this.mShortcutsAndWidgets.setCellDimensions$ar$ds$bb6a3296_0(this.mCellWidth, this.mCellHeight, this.mCountX);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public final void setIsDragOverlapping(boolean z) {
        if (this.mIsDragOverlapping != z) {
            this.mIsDragOverlapping = z;
            if (z) {
                this.mBackground.startTransition(120);
            } else if (this.mBackgroundAlpha > 0.0f) {
                this.mBackground.reverseTransition(120);
            } else {
                this.mBackground.resetTransition();
            }
            invalidate();
        }
    }

    public final void setPressedIcon(BubbleTextView bubbleTextView, Bitmap bitmap) {
        if (bitmap == null) {
            this.mTouchFeedbackView.setBitmap((Bitmap) null);
            this.mTouchFeedbackView.animate().cancel();
        } else if (this.mTouchFeedbackView.setBitmap(bitmap)) {
            this.mTouchFeedbackView.alignWithIconView(bubbleTextView, this.mShortcutsAndWidgets);
            this.mTouchFeedbackView.animateShadow();
        }
    }

    public final void setUseTempCoords(boolean z) {
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((LayoutParams) this.mShortcutsAndWidgets.getChildAt(i).getLayoutParams()).useTmpCoords = z;
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            return this.mIsDragTarget && drawable == this.mBackground;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void visualizeDropLocation(View view, Bitmap bitmap, int i, int i2, int i3, int i4, boolean z, DropTarget.DragObject dragObject) {
        int i5;
        int i6;
        String str;
        View view2 = view;
        Bitmap bitmap2 = bitmap;
        int i7 = i;
        int i8 = i2;
        DropTarget.DragObject dragObject2 = dragObject;
        int[] iArr = this.mDragCell;
        int i9 = iArr[0];
        int i10 = iArr[1];
        if (bitmap2 != null || view2 != null) {
            if (i7 != i9 || i8 != i10) {
                DragView dragView = dragObject2.dragView;
                Point point = dragView.mDragVisualizeOffset;
                Rect rect = dragView.mDragRegion;
                iArr[0] = i7;
                iArr[1] = i8;
                int[] iArr2 = this.mTmpPoint;
                cellToPoint(i7, i8, iArr2);
                int i11 = iArr2[0];
                int i12 = iArr2[1];
                if (view2 != null && point == null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i13 = marginLayoutParams.leftMargin;
                    i6 = i12 + marginLayoutParams.topMargin + (((this.mCellHeight * i4) - bitmap.getHeight()) / 2);
                    i5 = i11 + i13 + (((this.mCellWidth * i3) - bitmap.getWidth()) / 2);
                } else if (point == null || rect == null) {
                    i5 = i11 + (((this.mCellWidth * i3) - bitmap.getWidth()) / 2);
                    i6 = i12 + (((this.mCellHeight * i4) - bitmap.getHeight()) / 2);
                } else {
                    i5 = i11 + point.x + (((this.mCellWidth * i3) - rect.width()) / 2);
                    i6 = i12 + point.y + ((int) Math.max(0.0f, ((float) (this.mCellHeight - this.mShortcutsAndWidgets.getCellContentHeight())) / 2.0f));
                }
                int i14 = this.mDragOutlineCurrent;
                this.mDragOutlineAnims[i14].animate(2);
                Rect[] rectArr = this.mDragOutlines;
                int length = rectArr.length;
                int i15 = (i14 + 1) & 3;
                this.mDragOutlineCurrent = i15;
                Rect rect2 = rectArr[i15];
                rect2.set(i5, i6, bitmap.getWidth() + i5, bitmap.getHeight() + i6);
                if (z) {
                    cellToRect(i, i2, i3, i4, rect2);
                    if (view2 instanceof LauncherAppWidgetHostView) {
                        DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
                        Utilities.shrinkRect(rect2, deviceProfile.appWidgetScale.x, deviceProfile.appWidgetScale.y);
                    }
                }
                float f = this.mChildScale;
                Utilities.shrinkRect(rect2, f, f);
                InterruptibleInOutAnimator interruptibleInOutAnimator = this.mDragOutlineAnims[this.mDragOutlineCurrent];
                interruptibleInOutAnimator.mTag = bitmap2;
                interruptibleInOutAnimator.animate(1);
                if (dragObject2.stateAnnouncer != null) {
                    if (this.mIsHotseat) {
                        str = getContext().getString(R.string.move_to_hotseat_position, new Object[]{Integer.valueOf(Math.max(i, i2) + 1)});
                    } else {
                        str = getContext().getString(R.string.move_to_empty_cell, new Object[]{Integer.valueOf(i8 + 1), Integer.valueOf(i7 + 1)});
                    }
                    dragObject2.stateAnnouncer.announce(str);
                }
            }
        }
    }

    public CellLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public CellLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        final int i2 = 0;
        this.mDropPending = false;
        this.mIsDragTarget = true;
        this.mJailContent = true;
        this.mTmpPoint = new int[2];
        this.mTempLocation = new int[2];
        this.mFolderOuterRings = new ArrayList();
        this.mFolderLeaveBehindCell = new int[]{-1, -1};
        this.mFixedWidth = -1;
        this.mFixedHeight = -1;
        this.mIsDragOverlapping = false;
        this.mDragOutlines = new Rect[4];
        this.mDragOutlineAlphas = new float[4];
        this.mDragOutlineAnims = new InterruptibleInOutAnimator[4];
        this.mDragOutlineCurrent = 0;
        this.mDragOutlinePaint = new Paint();
        this.mReorderAnimators = new HashMap();
        this.mShakeAnimators = new HashMap();
        this.mItemPlacementDirty = false;
        int[] iArr = new int[2];
        this.mDragCell = iArr;
        this.mDragging = false;
        this.mIsHotseat = false;
        this.mHotseatScale = 1.0f;
        this.mChildScale = 1.0f;
        this.mIntersectingViews = new ArrayList();
        this.mOccupiedRect = new Rect();
        this.mDirectionVector = new int[2];
        this.mPreviousReorderDirection = new int[2];
        this.mTempRect = new Rect();
        this.mUseTouchHelper = false;
        this.mTempRectStack = new Stack();
        setWillNotDraw(false);
        setClipToPadding(false);
        Launcher launcher = Launcher.getLauncher(context);
        this.mLauncher = launcher;
        DeviceProfile deviceProfile = launcher.mDeviceProfile;
        this.mCellHeight = -1;
        this.mCellWidth = -1;
        this.mFixedCellHeight = -1;
        this.mFixedCellWidth = -1;
        this.mWidthGap = 0;
        this.mHeightGap = 0;
        InvariantDeviceProfile invariantDeviceProfile = deviceProfile.inv;
        int i3 = invariantDeviceProfile.numColumns;
        this.mCountX = i3;
        int i4 = invariantDeviceProfile.numRows;
        this.mCountY = i4;
        int[] iArr2 = new int[2];
        iArr2[1] = i4;
        iArr2[0] = i3;
        this.mOccupied = (boolean[][]) Array.newInstance(Boolean.TYPE, iArr2);
        int[] iArr3 = new int[2];
        iArr3[1] = i4;
        iArr3[0] = i3;
        this.mTmpOccupied = (boolean[][]) Array.newInstance(Boolean.TYPE, iArr3);
        int[] iArr4 = this.mPreviousReorderDirection;
        iArr4[0] = -100;
        iArr4[1] = -100;
        setAlwaysDrawnWithCacheEnabled(false);
        Resources resources = getResources();
        this.mHotseatScale = ((float) deviceProfile.hotseatIconSizePx) / ((float) deviceProfile.iconSizePx);
        TransitionDrawable transitionDrawable = (TransitionDrawable) resources.getDrawable(R.drawable.bg_screenpanel);
        this.mBackground = transitionDrawable;
        transitionDrawable.setCallback(this);
        transitionDrawable.setAlpha((int) (this.mBackgroundAlpha * 255.0f));
        this.mReorderPreviewAnimationMagnitude = ((float) deviceProfile.iconSizePx) * 0.12f;
        this.mEaseOutInterpolator = new DecelerateInterpolator(2.5f);
        iArr[1] = -1;
        iArr[0] = -1;
        int i5 = 0;
        while (true) {
            Rect[] rectArr = this.mDragOutlines;
            int length = rectArr.length;
            if (i5 >= 4) {
                break;
            }
            rectArr[i5] = new Rect(-1, -1, -1, -1);
            i5++;
        }
        int integer = resources.getInteger(R.integer.config_dragOutlineFadeTime);
        float integer2 = (float) resources.getInteger(R.integer.config_dragOutlineMaxAlpha);
        Arrays.fill(this.mDragOutlineAlphas, 0.0f);
        while (true) {
            int length2 = this.mDragOutlineAnims.length;
            if (i2 < 4) {
                final InterruptibleInOutAnimator interruptibleInOutAnimator = new InterruptibleInOutAnimator((long) integer, integer2);
                interruptibleInOutAnimator.mAnimator.setInterpolator(this.mEaseOutInterpolator);
                interruptibleInOutAnimator.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (interruptibleInOutAnimator.mTag == null) {
                            valueAnimator.cancel();
                            return;
                        }
                        CellLayout.this.mDragOutlineAlphas[i2] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CellLayout cellLayout = CellLayout.this;
                        cellLayout.invalidate(cellLayout.mDragOutlines[i2]);
                    }
                });
                interruptibleInOutAnimator.mAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        if (((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue() == 0.0f) {
                            InterruptibleInOutAnimator.this.mTag = null;
                        }
                    }
                });
                this.mDragOutlineAnims[i2] = interruptibleInOutAnimator;
                i2++;
            } else {
                ShortcutAndWidgetContainer shortcutAndWidgetContainer = new ShortcutAndWidgetContainer(context);
                this.mShortcutsAndWidgets = shortcutAndWidgetContainer;
                shortcutAndWidgetContainer.setCellDimensions$ar$ds$bb6a3296_0(this.mCellWidth, this.mCellHeight, this.mCountX);
                this.mStylusEventHelper = new StylusEventHelper(this);
                ClickShadowView clickShadowView = new ClickShadowView(context);
                this.mTouchFeedbackView = clickShadowView;
                addView(clickShadowView);
                addView(this.mShortcutsAndWidgets);
                return;
            }
        }
    }
}
