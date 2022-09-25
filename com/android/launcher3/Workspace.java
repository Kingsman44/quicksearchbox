package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.app.WallpaperManager;
import android.appwidget.AppWidgetHostView;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.DragController;
import com.android.launcher3.DropTarget;
import com.android.launcher3.FolderIcon;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.PageIndicator;
import com.android.launcher3.SearchDropTargetBar;
import com.android.launcher3.Stats;
import com.android.launcher3.UninstallDropTarget;
import com.android.launcher3.accessibility.LauncherAccessibilityDelegate;
import com.android.launcher3.accessibility.OverviewScreenAccessibilityDelegate;
import com.android.launcher3.compat.DeepShortcutManagerCompat;
import com.android.launcher3.graphics.DragPreviewProvider;
import com.android.launcher3.shortcuts.ShortcutsContainerListener;
import com.android.launcher3.util.ItemInfoMatcher;
import com.android.launcher3.util.LongArrayMap;
import com.android.launcher3.util.WallpaperUtils;
import com.android.launcher3.widget.PendingAddWidgetInfo;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.launcher.p5872a.C74629d;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.HashMap;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class Workspace extends PagedView implements DropTarget, DragSource, DragScroller, View.OnTouchListener, DragController.DragListener, LauncherTransitionable, ViewGroup.OnHierarchyChangeListener, Insettable, UninstallDropTarget.UninstallSource, LauncherAccessibilityDelegate.AccessibilityDragSource, Stats.LaunchSourceProvider {
    static Rect mLandscapeCellLayoutMetrics;
    static Rect mPortraitCellLayoutMetrics;
    boolean mAddNewPageOnDrag;
    private boolean mAddToExistingFolderOnDrop;
    private final Interpolator mAlphaInterpolator;
    boolean mAnimatingViewIntoPlace;
    private final Runnable mBindPages;
    public final Canvas mCanvas;
    boolean mChildrenLayersEnabled;
    private boolean mCreateUserFolderOnDrop;
    private float mCurrentScale;
    private String mCustomContentDescription;
    private long mCustomContentShowTime;
    boolean mCustomContentShowing;
    public int mDefaultPage;
    private boolean mDeferDropAfterUninstall;
    boolean mDeferRemoveExtraEmptyScreen;
    Runnable mDeferredAction;
    Runnable mDelayedResizeRunnable;
    private Point mDisplaySize;
    DragController mDragController;
    FolderIcon.FolderRingAnimator mDragFolderRingAnimator;
    private CellLayout.CellInfo mDragInfo;
    private int mDragMode;
    public Bitmap mDragOutline;
    private FolderIcon mDragOverFolderIcon;
    private int mDragOverX;
    private int mDragOverY;
    private CellLayout mDragOverlappingLayout;
    private ShortcutAndWidgetContainer mDragSourceInternal;
    CellLayout mDragTargetLayout;
    float[] mDragViewVisualCenter;
    private CellLayout mDropToLayout;
    private final Alarm mFolderCreationAlarm;
    IconCache mIconCache;
    private boolean mInScrollArea;
    public boolean mIsSwitchingState;
    private float mLastCustomContentScrollProgress;
    float mLastOverlaySroll;
    int mLastReorderX;
    int mLastReorderY;
    float mLastSetWallpaperOffsetSteps;
    Launcher mLauncher;
    Launcher.LauncherOverlay mLauncherOverlay;
    private LayoutTransition mLayoutTransition;
    private float mMaxDistanceForFolderCreation;
    int mNumPagesForWallpaperParallax;
    private int mOriginalDefaultPage;
    public HolographicOutlineHelper mOutlineHelper;
    private float mOverlayTranslation;
    public float mOverviewModeShrinkFactor;
    private View.AccessibilityDelegate mPagesAccessibilityDelegate;
    Runnable mRemoveEmptyScreenRunnable;
    private final Alarm mReorderAlarm;
    public final ArrayList mRestoredPages;
    public SparseArray mSavedStates;
    public ArrayList mScreenOrder;
    boolean mScrollInteractionBegan;
    public SpringLoadedDragController mSpringLoadedDragController;
    private float mSpringLoadedShrinkFactor;
    boolean mStartedSendingScrollEvents;
    public State mState;
    public WorkspaceStateTransitionAnimation mStateTransitionAnimation;
    private boolean mStripScreensOnPageStopMoving;
    int[] mTargetCell;
    private int[] mTempCell;
    private float[] mTempCellLayoutCenterCoordinates;
    private Matrix mTempInverseMatrix;
    private Matrix mTempMatrix;
    private int[] mTempPt;
    private int[] mTempVisiblePagesRange;
    public final int[] mTempXY;
    private long mTouchDownTime;
    private float mTransitionProgress;
    private int mUnboundedScrollX;
    private boolean mUninstallSuccessful;
    boolean mWallpaperIsLiveWallpaper;
    final WallpaperManager mWallpaperManager;
    WallpaperOffsetInterpolator mWallpaperOffset;
    IBinder mWindowToken;
    private boolean mWorkspaceFadeInAdjacentScreens;
    LongArrayMap mWorkspaceScreens;
    private float mXDown;
    private float mYDown;

    /* compiled from: PG */
    final class DeferredWidgetRefresh implements Runnable {
        private final Handler mHandler;
        private final LauncherAppWidgetHost mHost;
        private final ArrayList mInfos;
        private boolean mRefreshPending = true;

        public DeferredWidgetRefresh(ArrayList arrayList, LauncherAppWidgetHost launcherAppWidgetHost) {
            this.mInfos = arrayList;
            this.mHost = launcherAppWidgetHost;
            Handler handler = new Handler();
            this.mHandler = handler;
            launcherAppWidgetHost.mProviderChangeListeners.add(this);
            handler.postDelayed(this, 10000);
        }

        public final void run() {
            this.mHost.mProviderChangeListeners.remove(this);
            this.mHandler.removeCallbacks(this);
            if (this.mRefreshPending) {
                this.mRefreshPending = false;
                ArrayList arrayList = this.mInfos;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) arrayList.get(i);
                    AppWidgetHostView appWidgetHostView = launcherAppWidgetInfo.hostView;
                    if (appWidgetHostView instanceof PendingAppWidgetHostView) {
                        Workspace.this.mLauncher.removeItem$ar$ds((PendingAppWidgetHostView) appWidgetHostView, launcherAppWidgetInfo, false);
                        Workspace.this.mLauncher.bindAppWidget(launcherAppWidgetInfo);
                    }
                }
            }
        }
    }

    /* compiled from: PG */
    final class FolderCreationAlarmListener implements OnAlarmListener {
        final int cellX;
        final int cellY;
        final CellLayout layout;

        public FolderCreationAlarmListener(CellLayout cellLayout, int i, int i2) {
            this.layout = cellLayout;
            this.cellX = i;
            this.cellY = i2;
        }

        public final void onAlarm$ar$ds() {
            FolderIcon.FolderRingAnimator folderRingAnimator = Workspace.this.mDragFolderRingAnimator;
            if (folderRingAnimator != null) {
                folderRingAnimator.animateToNaturalState();
            }
            Workspace workspace = Workspace.this;
            workspace.mDragFolderRingAnimator = new FolderIcon.FolderRingAnimator(workspace.mLauncher, (FolderIcon) null);
            FolderIcon.FolderRingAnimator folderRingAnimator2 = Workspace.this.mDragFolderRingAnimator;
            int i = this.cellX;
            int i2 = this.cellY;
            folderRingAnimator2.mCellX = i;
            folderRingAnimator2.mCellY = i2;
            folderRingAnimator2.mCellLayout = this.layout;
            folderRingAnimator2.animateToAcceptState();
            CellLayout cellLayout = this.layout;
            cellLayout.mFolderOuterRings.add(Workspace.this.mDragFolderRingAnimator);
            this.layout.clearDragOutlines();
            Workspace.this.setDragMode(1);
        }
    }

    /* compiled from: PG */
    interface ItemOperator {
        boolean evaluate(ItemInfo itemInfo, View view, View view2);
    }

    /* compiled from: PG */
    final class ReorderAlarmListener implements OnAlarmListener {
        final View child;
        final DropTarget.DragObject dragObject;
        final int minSpanX;
        final int minSpanY;
        final int spanX;
        final int spanY;

        public ReorderAlarmListener(int i, int i2, int i3, int i4, DropTarget.DragObject dragObject2, View view) {
            this.minSpanX = i;
            this.minSpanY = i2;
            this.spanX = i3;
            this.spanY = i4;
            this.child = view;
            this.dragObject = dragObject2;
        }

        public final void onAlarm$ar$ds() {
            int[] iArr = new int[2];
            Workspace workspace = Workspace.this;
            float[] fArr = workspace.mDragViewVisualCenter;
            float f = fArr[0];
            float f2 = fArr[1];
            int i = this.minSpanX;
            int i2 = this.minSpanY;
            workspace.mTargetCell = workspace.mDragTargetLayout.findNearestArea((int) f, (int) f2, i, i2, i, i2, false, workspace.mTargetCell, (int[]) null);
            Workspace workspace2 = Workspace.this;
            int[] iArr2 = workspace2.mTargetCell;
            workspace2.mLastReorderX = iArr2[0];
            workspace2.mLastReorderY = iArr2[1];
            CellLayout cellLayout = workspace2.mDragTargetLayout;
            float[] fArr2 = workspace2.mDragViewVisualCenter;
            workspace2.mTargetCell = cellLayout.performReorder((int) fArr2[0], (int) fArr2[1], this.minSpanX, this.minSpanY, this.spanX, this.spanY, this.child, iArr2, iArr, 1);
            Workspace workspace3 = Workspace.this;
            int[] iArr3 = workspace3.mTargetCell;
            if (iArr3[0] < 0 || iArr3[1] < 0) {
                workspace3.mDragTargetLayout.revertTempState();
            } else {
                workspace3.setDragMode(3);
            }
            int i3 = iArr[0];
            boolean z = (i3 == this.spanX && iArr[1] == this.spanY) ? false : true;
            Workspace workspace4 = Workspace.this;
            CellLayout cellLayout2 = workspace4.mDragTargetLayout;
            View view = this.child;
            Bitmap bitmap = workspace4.mDragOutline;
            int[] iArr4 = workspace4.mTargetCell;
            cellLayout2.visualizeDropLocation(view, bitmap, iArr4[0], iArr4[1], i3, iArr[1], z, this.dragObject);
        }
    }

    /* compiled from: PG */
    enum State {
        NORMAL(SearchDropTargetBar.State.SEARCH_BAR, false),
        NORMAL_HIDDEN(SearchDropTargetBar.State.INVISIBLE_TRANSLATED, false),
        SPRING_LOADED(SearchDropTargetBar.State.DROP_TARGET, false),
        OVERVIEW(SearchDropTargetBar.State.INVISIBLE, true),
        OVERVIEW_HIDDEN(SearchDropTargetBar.State.INVISIBLE, true);
        
        public final SearchDropTargetBar.State searchDropTargetBarState;
        public final boolean shouldUpdateWidget;

        private State(SearchDropTargetBar.State state, boolean z) {
            this.searchDropTargetBarState = state;
            this.shouldUpdateWidget = z;
        }
    }

    /* compiled from: PG */
    final class WallpaperOffsetInterpolator implements Choreographer.FrameCallback {
        boolean mAnimating;
        float mAnimationStartOffset;
        long mAnimationStartTime;
        final Choreographer mChoreographer = Choreographer.getInstance();
        float mCurrentOffset = 0.5f;
        float mFinalOffset = 0.0f;
        final Interpolator mInterpolator = new DecelerateInterpolator(1.5f);
        int mNumScreens;
        boolean mWaitingForUpdate;

        public WallpaperOffsetInterpolator() {
        }

        private final int getNumScreensExcludingEmptyAndCustom() {
            return (Workspace.this.getChildCount() - numEmptyScreensToIgnore()) - Workspace.this.numCustomPages();
        }

        private final int numEmptyScreensToIgnore() {
            return (Workspace.this.getChildCount() - Workspace.this.numCustomPages() < 3 || !Workspace.this.hasExtraEmptyScreen()) ? 0 : 1;
        }

        private final void scheduleUpdate() {
            if (!this.mWaitingForUpdate) {
                this.mChoreographer.postFrameCallback(this);
                this.mWaitingForUpdate = true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
            r8 = r7.this$0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void updateOffset(boolean r8) {
            /*
                r7 = this;
                boolean r0 = r7.mWaitingForUpdate
                if (r0 != 0) goto L_0x0006
                if (r8 == 0) goto L_0x008e
            L_0x0006:
                r8 = 0
                r7.mWaitingForUpdate = r8
                float r0 = r7.mCurrentOffset
                boolean r1 = r7.mAnimating
                if (r1 == 0) goto L_0x0034
                long r1 = java.lang.System.currentTimeMillis()
                long r3 = r7.mAnimationStartTime
                long r1 = r1 - r3
                android.view.animation.Interpolator r3 = r7.mInterpolator
                float r4 = (float) r1
                r5 = 1132068864(0x437a0000, float:250.0)
                float r4 = r4 / r5
                float r3 = r3.getInterpolation(r4)
                float r4 = r7.mAnimationStartOffset
                float r5 = r7.mFinalOffset
                float r5 = r5 - r4
                float r5 = r5 * r3
                float r4 = r4 + r5
                r7.mCurrentOffset = r4
                r5 = 250(0xfa, double:1.235E-321)
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 >= 0) goto L_0x0031
                r8 = 1
            L_0x0031:
                r7.mAnimating = r8
                goto L_0x0038
            L_0x0034:
                float r4 = r7.mFinalOffset
                r7.mCurrentOffset = r4
            L_0x0038:
                float r8 = r7.mFinalOffset
                float r4 = r4 - r8
                float r8 = java.lang.Math.abs(r4)
                r1 = 869711765(0x33d6bf95, float:1.0E-7)
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 <= 0) goto L_0x0049
                r7.scheduleUpdate()
            L_0x0049:
                float r8 = r7.mCurrentOffset
                float r0 = r0 - r8
                float r8 = java.lang.Math.abs(r0)
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 <= 0) goto L_0x008e
                com.android.launcher3.Workspace r8 = com.android.launcher3.Workspace.this
                android.os.IBinder r0 = r8.mWindowToken
                if (r0 == 0) goto L_0x008e
                android.app.WallpaperManager r1 = r8.mWallpaperManager     // Catch:{ IllegalArgumentException -> 0x007e }
                com.android.launcher3.Workspace$WallpaperOffsetInterpolator r8 = r8.mWallpaperOffset     // Catch:{ IllegalArgumentException -> 0x007e }
                float r8 = r8.mCurrentOffset     // Catch:{ IllegalArgumentException -> 0x007e }
                r2 = 1056964608(0x3f000000, float:0.5)
                r1.setWallpaperOffsets(r0, r8, r2)     // Catch:{ IllegalArgumentException -> 0x007e }
                com.android.launcher3.Workspace r8 = com.android.launcher3.Workspace.this     // Catch:{ IllegalArgumentException -> 0x007e }
                int r0 = r8.mNumPagesForWallpaperParallax     // Catch:{ IllegalArgumentException -> 0x007e }
                float r0 = (float) r0     // Catch:{ IllegalArgumentException -> 0x007e }
                r1 = 1065353216(0x3f800000, float:1.0)
                float r0 = r1 / r0
                float r2 = r8.mLastSetWallpaperOffsetSteps     // Catch:{ IllegalArgumentException -> 0x007e }
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L_0x008e
                android.app.WallpaperManager r8 = r8.mWallpaperManager     // Catch:{ IllegalArgumentException -> 0x007e }
                r8.setWallpaperOffsetSteps(r0, r1)     // Catch:{ IllegalArgumentException -> 0x007e }
                com.android.launcher3.Workspace r8 = com.android.launcher3.Workspace.this     // Catch:{ IllegalArgumentException -> 0x007e }
                r8.mLastSetWallpaperOffsetSteps = r0     // Catch:{ IllegalArgumentException -> 0x007e }
                return
            L_0x007e:
                r8 = move-exception
                java.lang.String r0 = "Error updating wallpaper offset: "
                java.lang.String r8 = r8.toString()
                java.lang.String r8 = r0.concat(r8)
                java.lang.String r0 = "Launcher.Workspace"
                android.util.Log.e(r0, r8)
            L_0x008e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Workspace.WallpaperOffsetInterpolator.updateOffset(boolean):void");
        }

        public final void doFrame(long j) {
            updateOffset(false);
        }

        public final void syncWithScroll() {
            float wallpaperOffsetForScroll = wallpaperOffsetForScroll(Workspace.this.getScrollX());
            WallpaperOffsetInterpolator wallpaperOffsetInterpolator = Workspace.this.mWallpaperOffset;
            wallpaperOffsetInterpolator.scheduleUpdate();
            wallpaperOffsetInterpolator.mFinalOffset = Math.max(0.0f, Math.min(wallpaperOffsetForScroll, 1.0f));
            int numScreensExcludingEmptyAndCustom = wallpaperOffsetInterpolator.getNumScreensExcludingEmptyAndCustom();
            int i = wallpaperOffsetInterpolator.mNumScreens;
            if (numScreensExcludingEmptyAndCustom != i) {
                if (i > 0) {
                    wallpaperOffsetInterpolator.mAnimating = true;
                    wallpaperOffsetInterpolator.mAnimationStartOffset = wallpaperOffsetInterpolator.mCurrentOffset;
                    wallpaperOffsetInterpolator.mAnimationStartTime = System.currentTimeMillis();
                }
                wallpaperOffsetInterpolator.mNumScreens = wallpaperOffsetInterpolator.getNumScreensExcludingEmptyAndCustom();
            }
            updateOffset(true);
        }

        public final float wallpaperOffsetForScroll(int i) {
            int i2;
            int numScreensExcludingEmptyAndCustom = getNumScreensExcludingEmptyAndCustom();
            if (Workspace.this.mWallpaperIsLiveWallpaper) {
                i2 = numScreensExcludingEmptyAndCustom - 1;
            } else {
                i2 = Math.max(3, numScreensExcludingEmptyAndCustom - 1);
            }
            Workspace workspace = Workspace.this;
            workspace.mNumPagesForWallpaperParallax = i2;
            if (workspace.getChildCount() <= 1) {
                Workspace workspace2 = Workspace.this;
                if (workspace2.mIsRtl) {
                    return 1.0f - (1.0f / ((float) workspace2.mNumPagesForWallpaperParallax));
                }
                return 0.0f;
            }
            int numEmptyScreensToIgnore = numEmptyScreensToIgnore();
            int numCustomPages = Workspace.this.numCustomPages();
            int childCount = (Workspace.this.getChildCount() - 1) - numEmptyScreensToIgnore;
            Workspace workspace3 = Workspace.this;
            boolean z = workspace3.mIsRtl;
            int i3 = true != z ? childCount : numCustomPages;
            if (true == z) {
                numCustomPages = childCount;
            }
            int scrollForPage = workspace3.getScrollForPage(numCustomPages);
            int scrollForPage2 = Workspace.this.getScrollForPage(i3) - scrollForPage;
            if (scrollForPage2 == 0) {
                return 0.0f;
            }
            float max = Math.max(0.0f, Math.min(1.0f, ((float) ((i - scrollForPage) - Workspace.this.getLayoutTransitionOffsetForPage(0))) / ((float) scrollForPage2)));
            Workspace workspace4 = Workspace.this;
            return (max * ((float) ((workspace4.mWallpaperIsLiveWallpaper || numScreensExcludingEmptyAndCustom >= 3 || !workspace4.mIsRtl) ? numScreensExcludingEmptyAndCustom - 1 : (i2 - numScreensExcludingEmptyAndCustom) + 1))) / ((float) i2);
        }
    }

    static {
        new Rect();
    }

    public Workspace(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void cleanupAddToFolder() {
        FolderIcon folderIcon = this.mDragOverFolderIcon;
        if (folderIcon != null) {
            folderIcon.mFolderRingAnimator.animateToNaturalState();
            folderIcon.mOpenAlarm.cancelAlarm();
            this.mDragOverFolderIcon = null;
        }
    }

    private final void cleanupFolderCreation() {
        FolderIcon.FolderRingAnimator folderRingAnimator = this.mDragFolderRingAnimator;
        if (folderRingAnimator != null) {
            folderRingAnimator.animateToNaturalState();
            this.mDragFolderRingAnimator = null;
        }
        Alarm alarm = this.mFolderCreationAlarm;
        alarm.mAlarmListener = null;
        alarm.cancelAlarm();
    }

    private final void cleanupReorder(boolean z) {
        if (z) {
            this.mReorderAlarm.cancelAlarm();
        }
        this.mLastReorderX = -1;
        this.mLastReorderY = -1;
    }

    private final void enableHwLayersOnVisiblePages() {
        if (this.mChildrenLayersEnabled) {
            int childCount = getChildCount();
            getVisiblePages(this.mTempVisiblePagesRange);
            int[] iArr = this.mTempVisiblePagesRange;
            int i = iArr[0];
            int i2 = iArr[1];
            if (i == i2) {
                if (i2 < childCount - 1) {
                    i2++;
                } else if (i > 0) {
                    i--;
                }
            }
            CellLayout cellLayout = (CellLayout) this.mWorkspaceScreens.get(-301);
            int i3 = 0;
            while (i3 < childCount) {
                CellLayout cellLayout2 = (CellLayout) getPageAt(i3);
                cellLayout2.enableHardwareLayer(cellLayout2 != cellLayout && i <= i3 && i3 <= i2 && shouldDrawChild(cellLayout2));
                i3++;
            }
        }
    }

    public static final Rect estimateItemPosition$ar$ds(CellLayout cellLayout, int i, int i2, int i3, int i4) {
        Rect rect = new Rect();
        cellLayout.cellToRect(i, i2, i3, i4, rect);
        return rect;
    }

    private final void fadeAndRemoveEmptyScreen$ar$ds(int i, final Runnable runnable, final boolean z) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("backgroundAlpha", new float[]{0.0f});
        final CellLayout cellLayout = (CellLayout) this.mWorkspaceScreens.get(-201);
        this.mRemoveEmptyScreenRunnable = new Runnable() {
            public final void run() {
                if (Workspace.this.hasExtraEmptyScreen()) {
                    Workspace.this.mWorkspaceScreens.remove(-201);
                    Workspace.this.mScreenOrder.remove(-201L);
                    Workspace.this.removeView(cellLayout);
                    if (z) {
                        Workspace.this.stripEmptyScreens();
                    }
                }
            }
        };
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(cellLayout, new PropertyValuesHolder[]{ofFloat, ofFloat2});
        ofPropertyValuesHolder.setDuration(150);
        ofPropertyValuesHolder.setStartDelay((long) i);
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                Runnable runnable = Workspace.this.mRemoveEmptyScreenRunnable;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        ofPropertyValuesHolder.start();
    }

    static Rect getCellLayoutMetrics(BaseActivity baseActivity, int i) {
        InvariantDeviceProfile invariantDeviceProfile = LauncherAppState.getInstance().mInvariantDeviceProfile;
        Display defaultDisplay = baseActivity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getCurrentSizeRange(point, point2);
        int i2 = invariantDeviceProfile.numColumns;
        int i3 = invariantDeviceProfile.numRows;
        boolean isRtl = Utilities.isRtl(baseActivity.getResources());
        if (i == 0) {
            if (mLandscapeCellLayoutMetrics == null) {
                Rect workspacePadding = invariantDeviceProfile.landscapeProfile.getWorkspacePadding(isRtl);
                int i4 = point2.x;
                int i5 = workspacePadding.left;
                int i6 = workspacePadding.right;
                int i7 = point.y;
                int i8 = workspacePadding.top;
                int i9 = workspacePadding.bottom;
                Rect rect = new Rect();
                mLandscapeCellLayoutMetrics = rect;
                rect.set(((i4 - i5) - i6) / i2, ((i7 - i8) - i9) / i3, 0, 0);
            }
            return mLandscapeCellLayoutMetrics;
        }
        if (mPortraitCellLayoutMetrics == null) {
            Rect workspacePadding2 = invariantDeviceProfile.portraitProfile.getWorkspacePadding(isRtl);
            int i10 = point.x;
            int i11 = workspacePadding2.left;
            int i12 = workspacePadding2.right;
            int i13 = point2.y;
            int i14 = workspacePadding2.top;
            int i15 = workspacePadding2.bottom;
            Rect rect2 = new Rect();
            mPortraitCellLayoutMetrics = rect2;
            rect2.set(((i10 - i11) - i12) / i2, ((i13 - i14) - i15) / i3, 0, 0);
        }
        return mPortraitCellLayoutMetrics;
    }

    private final String getPageDescription(int i) {
        int numCustomPages = numCustomPages();
        int childCount = getChildCount() - numCustomPages;
        int indexOf = this.mScreenOrder.indexOf(-201L);
        if (indexOf >= 0 && childCount > 1) {
            if (i == indexOf) {
                return getContext().getString(R.string.workspace_new_page);
            }
            childCount--;
        }
        if (childCount == 0) {
            return getContext().getString(R.string.all_apps_home_button_label);
        }
        return getContext().getString(R.string.workspace_scroll_format, new Object[]{Integer.valueOf((i + 1) - numCustomPages), Integer.valueOf(childCount)});
    }

    public static Drawable getTextViewIcon(TextView textView) {
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                return drawable;
            }
        }
        return null;
    }

    private static final boolean isDragWidget$ar$ds(DropTarget.DragObject dragObject) {
        Object obj = dragObject.dragInfo;
        return (obj instanceof LauncherAppWidgetInfo) || (obj instanceof PendingAddWidgetInfo);
    }

    private final boolean isScrollingOverlay() {
        if (this.mLauncherOverlay != null) {
            return this.mIsRtl ? this.mUnboundedScrollX > this.mMaxScrollX : this.mUnboundedScrollX < 0;
        }
        return false;
    }

    static final void mapPointFromSelfToChild$ar$ds(View view, float[] fArr) {
        fArr[0] = fArr[0] - ((float) view.getLeft());
        fArr[1] = fArr[1] - ((float) view.getTop());
    }

    private static final void setTranslationAndAlpha$ar$ds(View view, float f, float f2) {
        if (view != null) {
            view.setTranslationX(f);
            view.setAlpha(f2);
        }
    }

    private final void updatePadding() {
        Rect workspacePadding = this.mLauncher.mDeviceProfile.getWorkspacePadding(this.mIsRtl);
        workspacePadding.left += this.mInsets.left;
        workspacePadding.right -= this.mInsets.left;
        setPadding(workspacePadding.left, workspacePadding.top, workspacePadding.right, workspacePadding.bottom);
    }

    static final boolean willAddToExistingUserFolder$ar$ds(Object obj, View view) {
        if (view != null) {
            CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.useTmpCoords && !(layoutParams.tmpCellX == layoutParams.cellX && layoutParams.tmpCellY == layoutParams.cellY)) {
                return false;
            }
        }
        if (!(view instanceof FolderIcon) || !((FolderIcon) view).acceptDrop(obj)) {
            return false;
        }
        return true;
    }

    public final boolean acceptDrop(DropTarget.DragObject dragObject) {
        int i;
        int i2;
        int i3;
        int i4;
        DropTarget.DragObject dragObject2 = dragObject;
        CellLayout cellLayout = this.mDropToLayout;
        if (dragObject2.dragSource != this) {
            if (cellLayout == null || !transitionStateShouldAllowDrop()) {
                return false;
            }
            this.mDragViewVisualCenter = dragObject2.getVisualCenter(this.mDragViewVisualCenter);
            if (this.mLauncher.isHotseatLayout(cellLayout)) {
                mapPointFromSelfToHotseatLayout(this.mLauncher.mHotseat, this.mDragViewVisualCenter);
            } else {
                mapPointFromSelfToChild$ar$ds(cellLayout, this.mDragViewVisualCenter);
            }
            CellLayout.CellInfo cellInfo = this.mDragInfo;
            if (cellInfo != null) {
                i = cellInfo.spanX;
                i2 = cellInfo.spanY;
            } else {
                ItemInfo itemInfo = (ItemInfo) dragObject2.dragInfo;
                i = itemInfo.spanX;
                i2 = itemInfo.spanY;
            }
            int i5 = i2;
            int i6 = i;
            Object obj = dragObject2.dragInfo;
            if (obj instanceof PendingAddWidgetInfo) {
                PendingAddWidgetInfo pendingAddWidgetInfo = (PendingAddWidgetInfo) obj;
                int i7 = pendingAddWidgetInfo.minSpanX;
                i3 = pendingAddWidgetInfo.minSpanY;
                i4 = i7;
            } else {
                i4 = i6;
                i3 = i5;
            }
            float[] fArr = this.mDragViewVisualCenter;
            int[] findNearestArea = cellLayout.findNearestArea((int) fArr[0], (int) fArr[1], i4, i3, i4, i3, false, this.mTargetCell, (int[]) null);
            this.mTargetCell = findNearestArea;
            float[] fArr2 = this.mDragViewVisualCenter;
            float distanceFromCell = cellLayout.getDistanceFromCell(fArr2[0], fArr2[1], findNearestArea);
            if (this.mCreateUserFolderOnDrop) {
                if (willCreateUserFolder$ar$ds((ItemInfo) dragObject2.dragInfo, cellLayout, this.mTargetCell, distanceFromCell)) {
                    return true;
                }
            }
            if (this.mAddToExistingFolderOnDrop && willAddToExistingUserFolder(dragObject2.dragInfo, cellLayout, this.mTargetCell, distanceFromCell)) {
                return true;
            }
            float[] fArr3 = this.mDragViewVisualCenter;
            CellLayout cellLayout2 = cellLayout;
            int i8 = i4;
            int i9 = i3;
            int i10 = i6;
            int i11 = i5;
            int[] performReorder = cellLayout2.performReorder((int) fArr3[0], (int) fArr3[1], i8, i9, i10, i11, (View) null, this.mTargetCell, new int[2], 4);
            this.mTargetCell = performReorder;
            if (performReorder[0] < 0 || performReorder[1] < 0) {
                boolean isHotseatLayout = this.mLauncher.isHotseatLayout(cellLayout);
                int[] iArr = this.mTargetCell;
                if (iArr != null && isHotseatLayout) {
                    Hotseat hotseat = this.mLauncher.mHotseat;
                    if (hotseat.isAllAppsButtonRank(hotseat.getOrderInHotseat(iArr[0], iArr[1]))) {
                        return false;
                    }
                }
                this.mLauncher.showOutOfSpaceMessage(isHotseatLayout);
                return false;
            }
        }
        if (getIdForScreen(cellLayout) == -201) {
            commitExtraEmptyScreen();
        }
        return true;
    }

    public final void addExtraEmptyScreen$ar$ds() {
        if (!this.mWorkspaceScreens.containsKey(-201)) {
            insertNewWorkspaceScreen$ar$ds();
        }
    }

    /* access modifiers changed from: package-private */
    public final void addInScreen(View view, long j, long j2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5;
        int i6;
        CellLayout cellLayout;
        CellLayout.LayoutParams layoutParams;
        View view2 = view;
        long j3 = j2;
        int i7 = i3;
        int i8 = i4;
        long j4 = -100;
        if (j != -100) {
            j4 = j;
        } else if (getScreenWithId(j3) == null) {
            Log.e("Launcher.Workspace", "Skipping child, screenId " + j3 + " not found");
            new Throwable().printStackTrace();
            return;
        }
        if (j3 != -201) {
            if (j4 == -101) {
                cellLayout = this.mLauncher.mHotseat.mContent;
                view.setOnKeyListener(new HotseatIconKeyEventListener());
                if (view2 instanceof FolderIcon) {
                    ((FolderIcon) view2).setTextVisible(false);
                }
                if (z2) {
                    int i9 = (int) j3;
                    i6 = this.mLauncher.mHotseat.getCellXFromOrder(i9);
                    i5 = this.mLauncher.mHotseat.getCellYFromOrder(i9);
                } else {
                    i6 = i;
                    i5 = i2;
                    this.mLauncher.mHotseat.getOrderInHotseat(i6, i5);
                }
            } else {
                i6 = i;
                i5 = i2;
                if (view2 instanceof FolderIcon) {
                    ((FolderIcon) view2).setTextVisible(true);
                }
                CellLayout screenWithId = getScreenWithId(j3);
                view.setOnKeyListener(new IconKeyEventListener());
                cellLayout = screenWithId;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null || !(layoutParams2 instanceof CellLayout.LayoutParams)) {
                layoutParams = new CellLayout.LayoutParams(i6, i5, i7, i8);
            } else {
                layoutParams = (CellLayout.LayoutParams) layoutParams2;
                layoutParams.cellX = i6;
                layoutParams.cellY = i5;
                layoutParams.cellHSpan = i7;
                layoutParams.cellVSpan = i8;
            }
            if (i7 < 0 && i8 < 0) {
                layoutParams.isLockedToGrid = false;
            }
            ItemInfo itemInfo = (ItemInfo) view.getTag();
            boolean z3 = view2 instanceof Folder;
            if (!cellLayout.addViewToCellLayout(view, true != z ? -1 : 0, (int) itemInfo.f16556id, layoutParams, !z3)) {
                int i10 = layoutParams.cellX;
                int i11 = layoutParams.cellY;
                Launcher.addDumpLog$ar$ds("Launcher.Workspace", "Failed to add to item at (" + i10 + "," + i11 + ") to CellLayout", (Exception) null);
            }
            if (!z3) {
                view.setHapticFeedbackEnabled(false);
                view.setOnLongClickListener(this.mLongClickListener);
                if ((view2 instanceof BubbleTextView) && DeepShortcutManagerCompat.supportsShortcuts(itemInfo)) {
                    view.setOnTouchListener(new ShortcutsContainerListener((BubbleTextView) view2));
                }
            }
            if (view2 instanceof DropTarget) {
                this.mDragController.mDropTargets.add((DropTarget) view2);
                return;
            }
            return;
        }
        throw new RuntimeException("Screen id should not be EXTRA_EMPTY_SCREEN_ID");
    }

    /* access modifiers changed from: package-private */
    public final void addInScreenFromBind(View view, long j, long j2, int i, int i2, int i3, int i4) {
        addInScreen(view, j, j2, i, i2, i3, i4, false, true);
    }

    /* access modifiers changed from: package-private */
    public final boolean addToExistingFolderIfNecessary$ar$ds(CellLayout cellLayout, int[] iArr, float f, DropTarget.DragObject dragObject, boolean z) {
        if (f > this.mMaxDistanceForFolderCreation) {
            return false;
        }
        View childAt = cellLayout.mShortcutsAndWidgets.getChildAt(iArr[0], iArr[1]);
        if (!this.mAddToExistingFolderOnDrop) {
            return false;
        }
        this.mAddToExistingFolderOnDrop = false;
        if (childAt instanceof FolderIcon) {
            FolderIcon folderIcon = (FolderIcon) childAt;
            if (folderIcon.acceptDrop(dragObject.dragInfo)) {
                folderIcon.onDrop(dragObject);
                if (!z) {
                    getParentCellLayoutForView(this.mDragInfo.cell).removeView(this.mDragInfo.cell);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void animateWidgetDrop(com.android.launcher3.ItemInfo r19, com.android.launcher3.CellLayout r20, com.android.launcher3.DragView r21, java.lang.Runnable r22, int r23, android.view.View r24, boolean r25) {
        /*
            r18 = this;
            r13 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            r4 = r24
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            com.android.launcher3.Launcher r6 = r13.mLauncher
            com.android.launcher3.DragLayer r6 = r6.mDragLayer
            r6.getViewRectRelativeToSelf(r2, r5)
            r6 = 2
            int[] r7 = new int[r6]
            float[] r8 = new float[r6]
            boolean r9 = r0 instanceof com.android.launcher3.widget.PendingAddShortcutInfo
            r10 = 1
            r9 = r9 ^ r10
            int[] r11 = r13.mTargetCell
            int r12 = r0.spanX
            int r14 = r0.spanY
            r15 = 0
            r6 = r11[r15]
            r11 = r11[r10]
            android.graphics.Rect r6 = estimateItemPosition$ar$ds(r1, r6, r11, r12, r14)
            int r11 = r0.itemType
            r12 = 4
            if (r11 != r12) goto L_0x0044
            com.android.launcher3.Launcher r11 = r13.mLauncher
            com.android.launcher3.DeviceProfile r11 = r11.mDeviceProfile
            android.graphics.PointF r14 = r11.appWidgetScale
            float r14 = r14.x
            android.graphics.PointF r11 = r11.appWidgetScale
            float r11 = r11.y
            com.android.launcher3.Utilities.shrinkRect(r6, r14, r11)
        L_0x0044:
            int r11 = r6.left
            r7[r15] = r11
            int r11 = r6.top
            r7[r10] = r11
            r18.setFinalTransitionTransform$ar$ds()
            com.android.launcher3.Launcher r11 = r13.mLauncher
            com.android.launcher3.DragLayer r11 = r11.mDragLayer
            float r11 = com.android.launcher3.Utilities.getDescendantCoordRelativeToParent(r1, r11, r7, r10)
            r18.resetTransitionTransform$ar$ds()
            if (r9 == 0) goto L_0x0073
            int r9 = r6.width()
            float r9 = (float) r9
            int r14 = r21.getMeasuredWidth()
            float r14 = (float) r14
            float r9 = r9 / r14
            int r14 = r6.height()
            float r14 = (float) r14
            int r12 = r21.getMeasuredHeight()
            float r12 = (float) r12
            float r14 = r14 / r12
            goto L_0x0077
        L_0x0073:
            r9 = 1065353216(0x3f800000, float:1.0)
            r14 = 1065353216(0x3f800000, float:1.0)
        L_0x0077:
            r12 = r7[r15]
            r16 = r11
            double r10 = (double) r12
            int r12 = r21.getMeasuredWidth()
            float r12 = (float) r12
            int r15 = r6.width()
            float r15 = (float) r15
            float r15 = r15 * r16
            float r12 = r12 - r15
            r15 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r15
            double r1 = (double) r12
            int r12 = r20.getUnusedHorizontalSpace()
            float r12 = (float) r12
            float r12 = r12 / r15
            r17 = r5
            double r4 = (double) r12
            double r4 = java.lang.Math.ceil(r4)
            java.lang.Double.isNaN(r1)
            double r1 = r1 - r4
            java.lang.Double.isNaN(r10)
            double r10 = r10 - r1
            int r1 = (int) r10
            r2 = 0
            r7[r2] = r1
            r1 = 1
            r2 = r7[r1]
            float r2 = (float) r2
            int r4 = r21.getMeasuredHeight()
            float r4 = (float) r4
            int r5 = r6.height()
            float r5 = (float) r5
            float r11 = r16 * r5
            float r4 = r4 - r11
            float r4 = r4 / r15
            float r2 = r2 - r4
            int r2 = (int) r2
            r7[r1] = r2
            float r9 = r9 * r16
            r2 = 0
            r8[r2] = r9
            float r14 = r14 * r16
            r8[r1] = r14
            com.android.launcher3.Launcher r1 = r13.mLauncher
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131492930(0x7f0c0042, float:1.8609326E38)
            int r1 = r1.getInteger(r2)
            int r11 = r1 + -200
            int r1 = r0.itemType
            r2 = 4
            if (r1 == r2) goto L_0x00df
            r2 = 5
            if (r1 != r2) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            r1 = 0
            goto L_0x00e0
        L_0x00df:
            r1 = 1
        L_0x00e0:
            r2 = 2
            if (r3 == r2) goto L_0x00ec
            if (r25 == 0) goto L_0x00e6
            goto L_0x00ec
        L_0x00e6:
            r4 = r21
            r2 = r24
            goto L_0x0167
        L_0x00ec:
            r2 = r24
            if (r2 == 0) goto L_0x0165
            com.android.launcher3.Launcher r1 = r13.mLauncher
            com.android.launcher3.Workspace r1 = r1.mWorkspace
            r4 = 1
            r5 = 0
            int[] r0 = r1.estimateItemSize(r0, r5, r4)
            int r1 = r24.getVisibility()
            r2.setVisibility(r5)
            r6 = r0[r5]
            r9 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            r10 = r0[r4]
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r9)
            r10 = r0[r5]
            r12 = r0[r4]
            android.graphics.Bitmap$Config r14 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r10, r12, r14)
            android.graphics.Canvas r12 = r13.mCanvas
            r12.setBitmap(r10)
            r2.measure(r6, r9)
            r6 = r0[r5]
            r0 = r0[r4]
            r2.layout(r5, r5, r6, r0)
            android.graphics.Canvas r0 = r13.mCanvas
            r2.draw(r0)
            android.graphics.Canvas r0 = r13.mCanvas
            r4 = 0
            r0.setBitmap(r4)
            r2.setVisibility(r1)
            r4 = r21
            r4.mCrossFadeBitmap = r10
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = com.android.launcher3.LauncherAnimUtils.ofFloat$ar$ds(r1)
            float r5 = (float) r11
            r6 = 1061997773(0x3f4ccccd, float:0.8)
            float r5 = r5 * r6
            int r5 = (int) r5
            long r5 = (long) r5
            r1.setDuration(r5)
            android.view.animation.DecelerateInterpolator r5 = new android.view.animation.DecelerateInterpolator
            r6 = 1069547520(0x3fc00000, float:1.5)
            r5.<init>(r6)
            r1.setInterpolator(r5)
            com.android.launcher3.DragView$2 r5 = new com.android.launcher3.DragView$2
            r5.<init>()
            r1.addUpdateListener(r5)
            r1.start()
            goto L_0x017a
        L_0x0165:
            r4 = r21
        L_0x0167:
            r0 = 2
            if (r1 == 0) goto L_0x017a
            if (r25 == 0) goto L_0x017a
            r1 = 0
            r5 = r8[r1]
            r6 = 1
            r9 = r8[r6]
            float r5 = java.lang.Math.min(r5, r9)
            r8[r6] = r5
            r8[r1] = r5
        L_0x017a:
            com.android.launcher3.Launcher r1 = r13.mLauncher
            com.android.launcher3.DragLayer r1 = r1.mDragLayer
            r5 = 4
            if (r3 != r5) goto L_0x01aa
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.getViewRectRelativeToSelf(r4, r0)
            int r2 = r0.left
            int r3 = r0.top
            r0 = 0
            r5 = r7[r0]
            r0 = 1
            r6 = r7[r0]
            r7 = 0
            r8 = 1036831949(0x3dcccccd, float:0.1)
            r9 = 1036831949(0x3dcccccd, float:0.1)
            r10 = 0
            r12 = 0
            r0 = r1
            r1 = r21
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r22
            r0.animateViewIntoPosition$ar$ds(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x01aa:
            r5 = 1
            if (r3 != r5) goto L_0x01af
            r10 = 2
            goto L_0x01b0
        L_0x01af:
            r10 = 0
        L_0x01b0:
            com.android.launcher3.Workspace$12 r9 = new com.android.launcher3.Workspace$12
            r0 = r22
            r9.<init>(r2, r0)
            r0 = r17
            int r2 = r0.left
            int r3 = r0.top
            r0 = 0
            r6 = r7[r0]
            r7 = r7[r5]
            r12 = 1065353216(0x3f800000, float:1.0)
            r14 = r8[r0]
            r8 = r8[r5]
            r0 = r1
            r1 = r21
            r4 = r6
            r5 = r7
            r6 = r12
            r7 = r14
            r12 = r18
            r0.animateViewIntoPosition$ar$ds(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Workspace.animateWidgetDrop(com.android.launcher3.ItemInfo, com.android.launcher3.CellLayout, com.android.launcher3.DragView, java.lang.Runnable, int, android.view.View, boolean):void");
    }

    public final void announceForAccessibility(CharSequence charSequence) {
        if (!this.mLauncher.isAppsViewVisible()) {
            super.announceForAccessibility(charSequence);
        }
    }

    public final void beginDragShared(View view, DragSource dragSource, boolean z) {
        Object tag = view.getTag();
        if (tag instanceof ItemInfo) {
            beginDragShared(view, dragSource, z, (ItemInfo) tag, new DragPreviewProvider(view));
            return;
        }
        String valueOf = String.valueOf(view);
        String valueOf2 = String.valueOf(view.getTag());
        throw new IllegalStateException("Drag started with a view that has no tag set. This will cause a crash (issue 11627249) down the line. View: " + valueOf + "  tag: " + valueOf2);
    }

    public final long commitExtraEmptyScreen() {
        if (this.mLauncher.mWorkspaceLoading) {
            Launcher.addDumpLog$ar$ds("Launcher.Workspace", "    - workspace loading, skip", (Exception) null);
            return -1;
        }
        int pageIndexForScreenId = getPageIndexForScreenId(-201);
        this.mWorkspaceScreens.remove(-201);
        this.mScreenOrder.remove(-201L);
        long generateNewScreenId = LauncherAppState.getLauncherProvider().mOpenHelper.generateNewScreenId();
        this.mWorkspaceScreens.put(generateNewScreenId, (CellLayout) this.mWorkspaceScreens.get(-201));
        this.mScreenOrder.add(Long.valueOf(generateNewScreenId));
        PageIndicator pageIndicator = this.mPageIndicator;
        if (pageIndicator != null) {
            PageIndicator.PageMarkerResources pageIndicatorMarker = getPageIndicatorMarker(pageIndexForScreenId);
            ((PageIndicatorMarker) pageIndicator.mMarkers.get(pageIndexForScreenId)).setMarkerDrawables(pageIndicatorMarker.activeId, pageIndicatorMarker.inactiveId);
        }
        Launcher launcher = this.mLauncher;
        launcher.mModel.updateWorkspaceScreenOrder(launcher, this.mScreenOrder);
        return generateNewScreenId;
    }

    public final void computeScroll() {
        computeScrollHelper$ar$ds();
        this.mWallpaperOffset.syncWithScroll();
    }

    /* access modifiers changed from: package-private */
    public final boolean createUserFolderIfNecessary(View view, long j, CellLayout cellLayout, int[] iArr, float f, boolean z, DragView dragView, Runnable runnable) {
        boolean z2;
        CellLayout cellLayout2 = cellLayout;
        if (f > this.mMaxDistanceForFolderCreation) {
            return false;
        }
        View childAt = cellLayout2.mShortcutsAndWidgets.getChildAt(iArr[0], iArr[1]);
        CellLayout.CellInfo cellInfo = this.mDragInfo;
        if (cellInfo != null) {
            CellLayout parentCellLayoutForView = getParentCellLayoutForView(cellInfo.cell);
            CellLayout.CellInfo cellInfo2 = this.mDragInfo;
            if (cellInfo2.cellX == iArr[0] && cellInfo2.cellY == iArr[1] && parentCellLayoutForView == cellLayout2) {
                z2 = true;
                if (childAt != null || z2 || !this.mCreateUserFolderOnDrop) {
                    return false;
                }
                this.mCreateUserFolderOnDrop = false;
                long idForScreen = getIdForScreen(cellLayout2);
                boolean z3 = childAt.getTag() instanceof ShortcutInfo;
                boolean z4 = view.getTag() instanceof ShortcutInfo;
                if (!z3 || !z4) {
                    return false;
                }
                ShortcutInfo shortcutInfo = (ShortcutInfo) view.getTag();
                ShortcutInfo shortcutInfo2 = (ShortcutInfo) childAt.getTag();
                if (!z) {
                    getParentCellLayoutForView(this.mDragInfo.cell).removeView(this.mDragInfo.cell);
                }
                Rect rect = new Rect();
                float descendantRectRelativeToSelf = this.mLauncher.mDragLayer.getDescendantRectRelativeToSelf(childAt, rect);
                cellLayout2.removeView(childAt);
                Launcher launcher = this.mLauncher;
                int i = iArr[0];
                int i2 = iArr[1];
                FolderInfo folderInfo = new FolderInfo();
                folderInfo.title = launcher.getText(R.string.folder_name);
                Launcher launcher2 = launcher;
                FolderInfo folderInfo2 = folderInfo;
                long j2 = idForScreen;
                Rect rect2 = rect;
                int i3 = i;
                ShortcutInfo shortcutInfo3 = shortcutInfo2;
                int i4 = i2;
                LauncherModel.addItemToDatabase(launcher, folderInfo, j, j2, i3, i4);
                Launcher.sFolders.put(folderInfo2.f16556id, folderInfo2);
                IconCache iconCache = launcher2.mIconCache;
                FolderIcon fromXml$ar$ds = FolderIcon.fromXml$ar$ds(launcher2, cellLayout2, folderInfo2);
                launcher2.mWorkspace.addInScreen(fromXml$ar$ds, j, j2, i3, i4, 1, 1, launcher2.isWorkspaceLocked(), false);
                launcher2.mWorkspace.getParentCellLayoutForView(fromXml$ar$ds).mShortcutsAndWidgets.measureChild(fromXml$ar$ds);
                shortcutInfo3.cellX = -1;
                shortcutInfo3.cellY = -1;
                shortcutInfo.cellX = -1;
                shortcutInfo.cellY = -1;
                if (dragView != null) {
                    Drawable topDrawable$ar$ds = FolderIcon.getTopDrawable$ar$ds((TextView) childAt);
                    fromXml$ar$ds.computePreviewDrawingParams(topDrawable$ar$ds.getIntrinsicWidth(), childAt.getMeasuredWidth());
                    fromXml$ar$ds.animateFirstItem(topDrawable$ar$ds, 350, false, (Runnable) null);
                    fromXml$ar$ds.mInfo.add(shortcutInfo3);
                    fromXml$ar$ds.onDrop$ar$ds(shortcutInfo, dragView, rect2, descendantRectRelativeToSelf, 1, runnable);
                    return true;
                }
                fromXml$ar$ds.mInfo.add(shortcutInfo3);
                fromXml$ar$ds.mInfo.add(shortcutInfo);
                return true;
            }
        }
        z2 = false;
        return childAt != null ? false : false;
    }

    public final void deferCompleteDropAfterUninstallActivity() {
        this.mDeferDropAfterUninstall = true;
    }

    /* access modifiers changed from: protected */
    public final void determineScrollingStart(MotionEvent motionEvent) {
        View pageAt;
        if (isFinishedSwitchingState()) {
            float x = motionEvent.getX() - this.mXDown;
            float abs = Math.abs(x);
            float abs2 = Math.abs(motionEvent.getY() - this.mYDown);
            if (Float.compare(abs, 0.0f) != 0) {
                float atan = (float) Math.atan((double) (abs2 / abs));
                float f = (float) this.mTouchSlop;
                if ((abs > f || abs2 > f) && (pageAt = getPageAt(this.mCurrentPage)) != null) {
                    pageAt.cancelLongPress();
                }
                long j = this.mTouchDownTime - this.mCustomContentShowTime;
                boolean z = true;
                if (!this.mIsRtl ? x <= 0.0f : x >= 0.0f) {
                    z = false;
                }
                long screenIdForPageIndex = getScreenIdForPageIndex(this.mCurrentPage);
                if ((z && screenIdForPageIndex == -301 && j > 200) || atan > 1.0471976f) {
                    return;
                }
                if (atan > 0.5235988f) {
                    super.determineScrollingStart(motionEvent, (((float) Math.sqrt((double) ((atan - 7.8112097f) / 0.5235988f))) * 4.0f) + 1.0f);
                } else {
                    determineScrollingStart(motionEvent, 1.0f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.mSavedStates = sparseArray;
    }

    public final boolean dispatchUnhandledMove(View view, int i) {
        if (workspaceInModalState() || !isFinishedSwitchingState()) {
            return false;
        }
        return super.dispatchUnhandledMove(view, i);
    }

    public final void enableAccessibleDrag(boolean z) {
        for (int i = 0; i < getChildCount(); i++) {
            ((CellLayout) getChildAt(i)).enableAccessibleDrag(z, 2);
        }
        if (z) {
            setOnClickListener((View.OnClickListener) null);
        } else {
            setOnClickListener(this.mLauncher);
        }
        this.mLauncher.mSearchDropTargetBar.enableAccessibleDrag(z);
        this.mLauncher.mHotseat.mContent.enableAccessibleDrag(z, 2);
    }

    /* access modifiers changed from: package-private */
    public final void enableChildrenCache(int i, int i2) {
        int i3 = i > i2 ? i : i2;
        if (i > i2) {
            i = i2;
        }
        int childCount = getChildCount();
        int min = Math.min(i3, childCount - 1);
        for (int max = Math.max(i, 0); max <= min; max++) {
            CellLayout cellLayout = (CellLayout) getChildAt(max);
            cellLayout.mShortcutsAndWidgets.setChildrenDrawnWithCacheEnabled(true);
            cellLayout.mShortcutsAndWidgets.setChildrenDrawingCacheEnabled(true);
        }
    }

    public final void enableFreeScroll$ar$ds() {
        if (this.mState == State.OVERVIEW) {
            super.setEnableFreeScroll(true);
        } else {
            Log.w("Launcher.Workspace", "enableFreeScroll called but not in overview: state=".concat(String.valueOf(String.valueOf(this.mState))));
        }
    }

    public final int[] estimateItemSize(ItemInfo itemInfo, boolean z, boolean z2) {
        float f;
        int[] iArr = new int[2];
        if (getChildCount() > 0) {
            CellLayout cellLayout = (CellLayout) getChildAt(numCustomPages());
            boolean z3 = itemInfo.itemType == 4;
            Rect estimateItemPosition$ar$ds = estimateItemPosition$ar$ds(cellLayout, 0, 0, itemInfo.spanX, itemInfo.spanY);
            if (z3) {
                DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
                f = Utilities.shrinkRect(estimateItemPosition$ar$ds, deviceProfile.appWidgetScale.x, deviceProfile.appWidgetScale.y);
            } else {
                f = 1.0f;
            }
            iArr[0] = estimateItemPosition$ar$ds.width();
            int height = estimateItemPosition$ar$ds.height();
            iArr[1] = height;
            if (z3 && z2) {
                iArr[0] = (int) (((float) iArr[0]) / f);
                iArr[1] = (int) (((float) height) / f);
            }
            if (z) {
                int i = iArr[0];
                float f2 = this.mSpringLoadedShrinkFactor;
                iArr[0] = (int) (((float) i) * f2);
                iArr[1] = (int) (((float) iArr[1]) * f2);
            }
            return iArr;
        }
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        return iArr;
    }

    public final void exitWidgetResizeMode() {
        this.mLauncher.mDragLayer.clearAllResizeFrames();
    }

    public final void fillInLaunchSourceData(View view, Bundle bundle) {
        bundle.putString("container", "homescreen");
        bundle.putInt("container_page", this.mCurrentPage);
    }

    public final CellLayout getCurrentDropLayout() {
        return (CellLayout) getChildAt(getNextPage());
    }

    /* access modifiers changed from: protected */
    public final String getCurrentPageDescription() {
        if (hasCustomContent() && getNextPage() == 0) {
            return this.mCustomContentDescription;
        }
        int i = this.mNextPage;
        if (i == -1) {
            i = this.mCurrentPage;
        }
        return getPageDescription(i);
    }

    public final int getDescendantFocusability() {
        if (workspaceInModalState()) {
            return 393216;
        }
        return super.getDescendantFocusability();
    }

    /* access modifiers changed from: protected */
    public final void getEdgeVerticalPostion(int[] iArr) {
        View childAt = getChildAt(getChildCount() - 1);
        iArr[0] = childAt.getTop();
        iArr[1] = childAt.getBottom();
    }

    public final View getFirstMatch(final ItemOperator itemOperator) {
        final View[] viewArr = new View[1];
        mapOverItems(false, new ItemOperator() {
            public final boolean evaluate(ItemInfo itemInfo, View view, View view2) {
                if (!ItemOperator.this.evaluate(itemInfo, view, view2)) {
                    return false;
                }
                viewArr[0] = view;
                return true;
            }
        });
        return viewArr[0];
    }

    /* access modifiers changed from: protected */
    public final void getFreeScrollPageRange(int[] iArr) {
        int numCustomPages = numCustomPages();
        int childCount = getChildCount();
        iArr[0] = Math.max(0, Math.min(numCustomPages, getChildCount() - 1));
        iArr[1] = Math.max(0, childCount - 1);
    }

    public final void getHitRectRelativeToDragLayer(Rect rect) {
        this.mLauncher.mDragLayer.getDescendantRectRelativeToSelf(this, rect);
    }

    public final long getIdForScreen(CellLayout cellLayout) {
        int indexOfValue = this.mWorkspaceScreens.indexOfValue(cellLayout);
        if (indexOfValue != -1) {
            return this.mWorkspaceScreens.keyAt(indexOfValue);
        }
        return -1;
    }

    public final float getIntrinsicIconScaleFactor() {
        return 1.0f;
    }

    public final Folder getOpenFolder() {
        DragLayer dragLayer = this.mLauncher.mDragLayer;
        int childCount = dragLayer.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = dragLayer.getChildAt(i);
            if (childAt instanceof Folder) {
                Folder folder = (Folder) childAt;
                if (folder.mInfo.opened) {
                    return folder;
                }
            }
        }
        return null;
    }

    public final int getPageIndexForScreenId(long j) {
        return indexOfChild((View) this.mWorkspaceScreens.get(j));
    }

    /* access modifiers changed from: protected */
    public final View.OnClickListener getPageIndicatorClickListener() {
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            return null;
        }
        return new View.OnClickListener() {
            public final void onClick(View view) {
                Workspace.this.mLauncher.showOverviewMode$ar$ds$49c8ce8_0(false);
            }
        };
    }

    /* access modifiers changed from: protected */
    public final String getPageIndicatorDescription() {
        String string = getResources().getString(R.string.settings_button_text);
        String currentPageDescription = getCurrentPageDescription();
        return currentPageDescription + ", " + string;
    }

    /* access modifiers changed from: protected */
    public final PageIndicator.PageMarkerResources getPageIndicatorMarker(int i) {
        return (getScreenIdForPageIndex(i) != -201 || this.mScreenOrder.size() - numCustomPages() <= 1) ? new PageIndicator.PageMarkerResources() : new PageIndicator.PageMarkerResources(R.drawable.ic_pageindicator_current, R.drawable.ic_pageindicator_add);
    }

    /* access modifiers changed from: protected */
    public final Matrix getPageShiftMatrix() {
        if (Float.compare(this.mOverlayTranslation, 0.0f) == 0) {
            return getMatrix();
        }
        this.mTempMatrix.set(getMatrix());
        this.mTempMatrix.postTranslate(-this.mOverlayTranslation, 0.0f);
        return this.mTempMatrix;
    }

    /* access modifiers changed from: package-private */
    public final CellLayout getParentCellLayoutForView(View view) {
        ArrayList workspaceAndHotseatCellLayouts = getWorkspaceAndHotseatCellLayouts();
        int size = workspaceAndHotseatCellLayouts.size();
        int i = 0;
        while (i < size) {
            CellLayout cellLayout = (CellLayout) workspaceAndHotseatCellLayouts.get(i);
            i++;
            if (cellLayout.mShortcutsAndWidgets.indexOfChild(view) >= 0) {
                return cellLayout;
            }
        }
        return null;
    }

    public final long getScreenIdForPageIndex(int i) {
        if (i < 0 || i >= this.mScreenOrder.size()) {
            return -1;
        }
        return ((Long) this.mScreenOrder.get(i)).longValue();
    }

    public final CellLayout getScreenWithId(long j) {
        return (CellLayout) this.mWorkspaceScreens.get(j);
    }

    /* access modifiers changed from: protected */
    public final int getUnboundedScrollX() {
        return isScrollingOverlay() ? this.mUnboundedScrollX : getScrollX();
    }

    /* access modifiers changed from: package-private */
    public final ArrayList getWorkspaceAndHotseatCellLayouts() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            arrayList.add((CellLayout) getChildAt(i));
        }
        Hotseat hotseat = this.mLauncher.mHotseat;
        if (hotseat != null) {
            arrayList.add(hotseat.mContent);
        }
        return arrayList;
    }

    public final boolean hasCustomContent() {
        return this.mScreenOrder.size() > 0 && ((Long) this.mScreenOrder.get(0)).longValue() == -301;
    }

    public final boolean hasExtraEmptyScreen() {
        return this.mWorkspaceScreens.containsKey(-201) && getChildCount() - numCustomPages() > 1;
    }

    public final void insertNewWorkspaceScreen$ar$ds() {
        insertNewWorkspaceScreen$ar$ds$5d2eef57_0(-201, getChildCount());
    }

    public final void insertNewWorkspaceScreen$ar$ds$5d2eef57_0(long j, int i) {
        if (!this.mWorkspaceScreens.containsKey(j)) {
            CellLayout cellLayout = (CellLayout) this.mLauncher.getLayoutInflater().inflate(R.layout.workspace_screen, this, false);
            cellLayout.setOnLongClickListener(this.mLongClickListener);
            cellLayout.setOnClickListener(this.mLauncher);
            cellLayout.setSoundEffectsEnabled(false);
            this.mWorkspaceScreens.put(j, cellLayout);
            this.mScreenOrder.add(i, Long.valueOf(j));
            addView(cellLayout, i);
            LauncherAccessibilityDelegate launcherAccessibilityDelegate = LauncherAppState.getInstance().mAccessibilityDelegate;
            if (launcherAccessibilityDelegate != null && launcherAccessibilityDelegate.isInAccessibleDrag()) {
                cellLayout.enableAccessibleDrag(true, 2);
                return;
            }
            return;
        }
        throw new RuntimeException("Screen id " + j + " already exists!");
    }

    public final boolean isDropEnabled() {
        return true;
    }

    public final boolean isFinishedSwitchingState() {
        return !this.mIsSwitchingState || this.mTransitionProgress > 0.5f;
    }

    public final boolean isInOverviewMode() {
        return this.mState == State.OVERVIEW;
    }

    public final boolean isOnOrMovingToCustomContent() {
        return hasCustomContent() && getNextPage() == 0 && this.mRestorePage == -1001;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPointInSelfOverHotseat$ar$ds(int i, int i2) {
        Rect rect;
        int[] iArr = this.mTempPt;
        iArr[0] = i;
        iArr[1] = i2;
        Utilities.getDescendantCoordRelativeToParent(this, this.mLauncher.mDragLayer, iArr, true);
        DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
        if (deviceProfile.isVerticalBarLayout()) {
            rect = new Rect(deviceProfile.availableWidthPx - deviceProfile.normalHotseatBarHeightPx, 0, Integer.MAX_VALUE, deviceProfile.availableHeightPx);
        } else {
            rect = new Rect(0, deviceProfile.availableHeightPx - deviceProfile.hotseatBarHeightPx, deviceProfile.availableWidthPx, Integer.MAX_VALUE);
        }
        int[] iArr2 = this.mTempPt;
        return rect.contains(iArr2[0], iArr2[1]);
    }

    /* access modifiers changed from: package-private */
    public final boolean isTouchActive() {
        return this.mTouchState != 0;
    }

    /* access modifiers changed from: package-private */
    public final void mapOverItems(boolean z, ItemOperator itemOperator) {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            arrayList.add(((CellLayout) getChildAt(i)).mShortcutsAndWidgets);
        }
        Hotseat hotseat = this.mLauncher.mHotseat;
        if (hotseat != null) {
            arrayList.add(hotseat.mContent.mShortcutsAndWidgets);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ShortcutAndWidgetContainer shortcutAndWidgetContainer = (ShortcutAndWidgetContainer) arrayList.get(i2);
            int childCount2 = shortcutAndWidgetContainer.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt = shortcutAndWidgetContainer.getChildAt(i3);
                ItemInfo itemInfo = (ItemInfo) childAt.getTag();
                if (z && (itemInfo instanceof FolderInfo) && (childAt instanceof FolderIcon)) {
                    FolderIcon folderIcon = (FolderIcon) childAt;
                    ArrayList itemsInReadingOrder = folderIcon.mFolder.getItemsInReadingOrder();
                    int size2 = itemsInReadingOrder.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        View view = (View) itemsInReadingOrder.get(i4);
                        if (!itemOperator.evaluate((ItemInfo) view.getTag(), view, folderIcon)) {
                            i4++;
                        } else {
                            return;
                        }
                    }
                    continue;
                } else if (itemOperator.evaluate(itemInfo, childAt, (View) null)) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void mapPointFromSelfToHotseatLayout(Hotseat hotseat, float[] fArr) {
        int[] iArr = this.mTempPt;
        iArr[0] = (int) fArr[0];
        iArr[1] = (int) fArr[1];
        Utilities.getDescendantCoordRelativeToParent(this, this.mLauncher.mDragLayer, iArr, true);
        Utilities.mapCoordInSelfToDescendent$ar$ds(hotseat.mContent, this.mLauncher.mDragLayer, this.mTempPt);
        int[] iArr2 = this.mTempPt;
        fArr[0] = (float) iArr2[0];
        fArr[1] = (float) iArr2[1];
    }

    public final void moveToScreen(int i, boolean z) {
        if (!workspaceInModalState()) {
            if (z) {
                snapToPage(i, 750, false, (TimeInterpolator) null);
            } else {
                setCurrentPage(i);
            }
        }
        View childAt = getChildAt(i);
        if (childAt != null) {
            childAt.requestFocus();
        }
    }

    /* access modifiers changed from: protected */
    public final void notifyPageSwitchListener() {
        boolean z;
        super.notifyPageSwitchListener();
        if (hasCustomContent() && getNextPage() == 0 && !this.mCustomContentShowing) {
            z = true;
        } else if (hasCustomContent() && getNextPage() != 0 && this.mCustomContentShowing) {
            z = false;
        } else {
            return;
        }
        this.mCustomContentShowing = z;
    }

    public final int numCustomPages() {
        return hasCustomContent() ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mWindowToken = getWindowToken();
        computeScroll();
        this.mDragController.mWindowToken = this.mWindowToken;
        updatePadding();
    }

    public final void onChildViewAdded(View view, View view2) {
        if (view2 instanceof CellLayout) {
            CellLayout cellLayout = (CellLayout) view2;
            cellLayout.mInterceptTouchListener = this;
            cellLayout.setClickable(true);
            cellLayout.setImportantForAccessibility(2);
            super.onChildViewAdded(view, view2);
            return;
        }
        throw new IllegalArgumentException("A Workspace can only have CellLayout children.");
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mWindowToken = null;
    }

    public final void onDragEnd() {
        if (!this.mDeferRemoveExtraEmptyScreen) {
            removeExtraEmptyScreenDelayed(true, (Runnable) null, 0, this.mDragSourceInternal != null);
        }
        updateChildrenLayersEnabled(false);
        this.mLauncher.unlockScreenOrientation(false);
        InstallShortcutReceiver.disableAndFlushInstallQueue(getContext());
        this.mDragSourceInternal = null;
    }

    public final void onDragEnter(DropTarget.DragObject dragObject) {
        this.mCreateUserFolderOnDrop = false;
        this.mAddToExistingFolderOnDrop = false;
        this.mDropToLayout = null;
        CellLayout currentDropLayout = getCurrentDropLayout();
        setCurrentDropLayout(currentDropLayout);
        setCurrentDragOverlappingLayout(currentDropLayout);
        if (!workspaceInModalState()) {
            DragLayer dragLayer = this.mLauncher.mDragLayer;
            dragLayer.mShowPageHints = true;
            Workspace workspace = dragLayer.mLauncher.mWorkspace;
            dragLayer.getDescendantRectRelativeToSelf(workspace.getChildAt(workspace.numCustomPages()), dragLayer.mScrollChildPosition);
            dragLayer.invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDragExit(com.android.launcher3.DropTarget.DragObject r3) {
        /*
            r2 = this;
            boolean r3 = r2.mInScrollArea
            if (r3 == 0) goto L_0x0018
            boolean r3 = r2.mIsPageMoving
            if (r3 == 0) goto L_0x0015
            int r3 = r2.getNextPage()
            android.view.View r3 = r2.getPageAt(r3)
            com.android.launcher3.CellLayout r3 = (com.android.launcher3.CellLayout) r3
            r2.mDropToLayout = r3
            goto L_0x001c
        L_0x0015:
            com.android.launcher3.CellLayout r3 = r2.mDragOverlappingLayout
            goto L_0x001a
        L_0x0018:
            com.android.launcher3.CellLayout r3 = r2.mDragTargetLayout
        L_0x001a:
            r2.mDropToLayout = r3
        L_0x001c:
            int r3 = r2.mDragMode
            r0 = 1
            if (r3 != r0) goto L_0x0024
            r2.mCreateUserFolderOnDrop = r0
            goto L_0x0029
        L_0x0024:
            r1 = 2
            if (r3 != r1) goto L_0x0029
            r2.mAddToExistingFolderOnDrop = r0
        L_0x0029:
            r3 = 0
            r2.setCurrentDragOverlappingLayout(r3)
            r0 = 0
            r2.mInScrollArea = r0
            r2.setCurrentDropLayout(r3)
            r2.setCurrentDragOverlappingLayout(r3)
            com.android.launcher3.SpringLoadedDragController r3 = r2.mSpringLoadedDragController
            com.android.launcher3.Alarm r3 = r3.mAlarm
            r3.cancelAlarm()
            com.android.launcher3.Launcher r3 = r2.mLauncher
            com.android.launcher3.DragLayer r3 = r3.mDragLayer
            r3.mShowPageHints = r0
            r3.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Workspace.onDragExit(com.android.launcher3.DropTarget$DragObject):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0375 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDragOver(com.android.launcher3.DropTarget.DragObject r32) {
        /*
            r31 = this;
            r8 = r31
            r6 = r32
            boolean r0 = r8.mInScrollArea
            if (r0 != 0) goto L_0x0389
            boolean r0 = r31.transitionStateShouldAllowDrop()
            if (r0 != 0) goto L_0x0010
            goto L_0x0389
        L_0x0010:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.Object r0 = r6.dragInfo
            if (r0 != 0) goto L_0x001a
            return
        L_0x001a:
            com.android.launcher3.ItemInfo r0 = (com.android.launcher3.ItemInfo) r0
            int r1 = r0.spanX
            if (r1 < 0) goto L_0x0381
            int r1 = r0.spanY
            if (r1 < 0) goto L_0x0381
            float[] r1 = r8.mDragViewVisualCenter
            float[] r1 = r6.getVisualCenter(r1)
            r8.mDragViewVisualCenter = r1
            com.android.launcher3.CellLayout$CellInfo r1 = r8.mDragInfo
            r2 = 0
            if (r1 != 0) goto L_0x0033
            r7 = r2
            goto L_0x0036
        L_0x0033:
            android.view.View r1 = r1.cell
            r7 = r1
        L_0x0036:
            boolean r1 = r31.workspaceInModalState()
            r5 = 2
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0142
            com.android.launcher3.Launcher r1 = r8.mLauncher
            com.android.launcher3.Hotseat r1 = r1.mHotseat
            if (r1 == 0) goto L_0x0061
            com.android.launcher3.DragSource r1 = r6.dragSource
            if (r1 == r8) goto L_0x0050
            boolean r1 = isDragWidget$ar$ds(r32)
            if (r1 == 0) goto L_0x0050
            goto L_0x0061
        L_0x0050:
            int r1 = r6.f16552x
            int r9 = r6.f16553y
            boolean r1 = r8.isPointInSelfOverHotseat$ar$ds(r1, r9)
            if (r1 == 0) goto L_0x0061
            com.android.launcher3.Launcher r1 = r8.mLauncher
            com.android.launcher3.Hotseat r1 = r1.mHotseat
            com.android.launcher3.CellLayout r1 = r1.mContent
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            if (r1 != 0) goto L_0x010a
            com.android.launcher3.DragView r1 = r6.dragView
            int r1 = r6.f16552x
            float r1 = (float) r1
            int r9 = r6.f16553y
            float r9 = (float) r9
            int r10 = r31.getChildCount()
            r11 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r12 = 0
        L_0x0074:
            if (r12 >= r10) goto L_0x0109
            java.util.ArrayList r13 = r8.mScreenOrder
            java.lang.Object r13 = r13.get(r12)
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            r15 = -301(0xfffffffffffffed3, double:NaN)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x008a
            goto L_0x0103
        L_0x008a:
            android.view.View r13 = r8.getChildAt(r12)
            com.android.launcher3.CellLayout r13 = (com.android.launcher3.CellLayout) r13
            float[] r14 = new float[r5]
            r14[r3] = r1
            r14[r4] = r9
            android.graphics.Matrix r15 = r13.getMatrix()
            android.graphics.Matrix r5 = r8.mTempInverseMatrix
            r15.invert(r5)
            mapPointFromSelfToChild$ar$ds(r13, r14)
            r5 = r14[r3]
            r15 = 0
            int r16 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r16 < 0) goto L_0x00c3
            int r3 = r13.getWidth()
            float r3 = (float) r3
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x00c3
            r3 = r14[r4]
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L_0x00c3
            int r5 = r13.getHeight()
            float r5 = (float) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x00c3
            r1 = r13
            goto L_0x010a
        L_0x00c3:
            float[] r3 = r8.mTempCellLayoutCenterCoordinates
            int r5 = r13.getWidth()
            r16 = 2
            int r5 = r5 / 2
            float r5 = (float) r5
            r17 = 0
            r3[r17] = r5
            int r5 = r13.getHeight()
            int r5 = r5 / 2
            float r5 = (float) r5
            r3[r4] = r5
            r5 = r3[r17]
            int r15 = r13.getLeft()
            float r15 = (float) r15
            float r5 = r5 + r15
            r3[r17] = r5
            r5 = r3[r4]
            int r15 = r13.getTop()
            float r15 = (float) r15
            float r5 = r5 + r15
            r3[r4] = r5
            r14[r17] = r1
            r14[r4] = r9
            r5 = r3[r17]
            float r5 = r1 - r5
            r3 = r3[r4]
            float r5 = r5 * r5
            r3 = 0
            float r5 = r5 + r3
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x0103
            r11 = r5
            r2 = r13
        L_0x0103:
            int r12 = r12 + 1
            r3 = 0
            r5 = 2
            goto L_0x0074
        L_0x0109:
            r1 = r2
        L_0x010a:
            com.android.launcher3.CellLayout r2 = r8.mDragTargetLayout
            if (r1 == r2) goto L_0x016e
            r8.setCurrentDropLayout(r1)
            r8.setCurrentDragOverlappingLayout(r1)
            com.android.launcher3.Workspace$State r2 = r8.mState
            com.android.launcher3.Workspace$State r3 = com.android.launcher3.Workspace.State.SPRING_LOADED
            if (r2 != r3) goto L_0x016e
            com.android.launcher3.Launcher r2 = r8.mLauncher
            boolean r1 = r2.isHotseatLayout(r1)
            if (r1 == 0) goto L_0x012a
            com.android.launcher3.SpringLoadedDragController r1 = r8.mSpringLoadedDragController
            com.android.launcher3.Alarm r1 = r1.mAlarm
            r1.cancelAlarm()
            goto L_0x016e
        L_0x012a:
            com.android.launcher3.SpringLoadedDragController r1 = r8.mSpringLoadedDragController
            com.android.launcher3.CellLayout r2 = r8.mDragTargetLayout
            com.android.launcher3.Alarm r3 = r1.mAlarm
            r3.cancelAlarm()
            com.android.launcher3.Alarm r3 = r1.mAlarm
            if (r2 != 0) goto L_0x013a
            r9 = 950(0x3b6, double:4.694E-321)
            goto L_0x013c
        L_0x013a:
            r9 = 500(0x1f4, double:2.47E-321)
        L_0x013c:
            r3.setAlarm(r9)
            r1.mScreen = r2
            goto L_0x016e
        L_0x0142:
            com.android.launcher3.Launcher r1 = r8.mLauncher
            com.android.launcher3.Hotseat r1 = r1.mHotseat
            if (r1 == 0) goto L_0x015e
            boolean r1 = isDragWidget$ar$ds(r32)
            if (r1 != 0) goto L_0x015e
            int r1 = r6.f16552x
            int r3 = r6.f16553y
            boolean r1 = r8.isPointInSelfOverHotseat$ar$ds(r1, r3)
            if (r1 == 0) goto L_0x015e
            com.android.launcher3.Launcher r1 = r8.mLauncher
            com.android.launcher3.Hotseat r1 = r1.mHotseat
            com.android.launcher3.CellLayout r2 = r1.mContent
        L_0x015e:
            if (r2 != 0) goto L_0x0164
            com.android.launcher3.CellLayout r2 = r31.getCurrentDropLayout()
        L_0x0164:
            com.android.launcher3.CellLayout r1 = r8.mDragTargetLayout
            if (r2 == r1) goto L_0x016e
            r8.setCurrentDropLayout(r2)
            r8.setCurrentDragOverlappingLayout(r2)
        L_0x016e:
            com.android.launcher3.CellLayout r1 = r8.mDragTargetLayout
            if (r1 == 0) goto L_0x0380
            com.android.launcher3.Launcher r2 = r8.mLauncher
            boolean r1 = r2.isHotseatLayout(r1)
            if (r1 == 0) goto L_0x0184
            com.android.launcher3.Launcher r1 = r8.mLauncher
            com.android.launcher3.Hotseat r1 = r1.mHotseat
            float[] r2 = r8.mDragViewVisualCenter
            r8.mapPointFromSelfToHotseatLayout(r1, r2)
            goto L_0x018b
        L_0x0184:
            com.android.launcher3.CellLayout r1 = r8.mDragTargetLayout
            float[] r2 = r8.mDragViewVisualCenter
            mapPointFromSelfToChild$ar$ds(r1, r2)
        L_0x018b:
            int r1 = r0.spanX
            int r2 = r0.spanY
            int r3 = r0.minSpanX
            if (r3 <= 0) goto L_0x019a
            int r5 = r0.minSpanY
            if (r5 <= 0) goto L_0x019a
            r2 = r3
            r3 = r5
            goto L_0x019c
        L_0x019a:
            r3 = r2
            r2 = r1
        L_0x019c:
            float[] r1 = r8.mDragViewVisualCenter
            r5 = 0
            r9 = r1[r5]
            r1 = r1[r4]
            com.android.launcher3.CellLayout r5 = r8.mDragTargetLayout
            int r9 = (int) r9
            int r1 = (int) r1
            r27 = 0
            int[] r10 = r8.mTargetCell
            r29 = 0
            r20 = r5
            r21 = r9
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r2
            r26 = r3
            r28 = r10
            int[] r1 = r20.findNearestArea(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r8.mTargetCell = r1
            r5 = 0
            r15 = r1[r5]
            r1 = r1[r4]
            r8.setCurrentDropOverCell(r15, r1)
            com.android.launcher3.CellLayout r9 = r8.mDragTargetLayout
            float[] r10 = r8.mDragViewVisualCenter
            r11 = r10[r5]
            r10 = r10[r4]
            int[] r12 = r8.mTargetCell
            float r9 = r9.getDistanceFromCell(r11, r10, r12)
            com.android.launcher3.CellLayout r10 = r8.mDragTargetLayout
            int[] r11 = r8.mTargetCell
            float r12 = r8.mMaxDistanceForFolderCreation
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x01e9
        L_0x01e3:
            r16 = r15
        L_0x01e5:
            r4 = 0
            r9 = 1
            goto L_0x02c1
        L_0x01e9:
            r9 = r11[r5]
            r12 = r11[r4]
            com.android.launcher3.ShortcutAndWidgetContainer r13 = r10.mShortcutsAndWidgets
            android.view.View r9 = r13.getChildAt(r9, r12)
            java.lang.Object r12 = r6.dragInfo
            r13 = r12
            com.android.launcher3.ItemInfo r13 = (com.android.launcher3.ItemInfo) r13
            boolean r14 = r8.willCreateUserFolder(r13, r9, r5)
            int r4 = r8.mDragMode
            if (r4 != 0) goto L_0x0232
            if (r14 == 0) goto L_0x0232
            com.android.launcher3.Alarm r4 = r8.mFolderCreationAlarm
            boolean r5 = r4.mAlarmPending
            if (r5 != 0) goto L_0x0232
            com.android.launcher3.Workspace$FolderCreationAlarmListener r5 = new com.android.launcher3.Workspace$FolderCreationAlarmListener
            r12 = 0
            r13 = r11[r12]
            r12 = 1
            r11 = r11[r12]
            r5.<init>(r10, r13, r11)
            boolean r10 = r6.accessibleDrag
            if (r10 != 0) goto L_0x021f
            r4.mAlarmListener = r5
            r10 = 0
            r4.setAlarm(r10)
            goto L_0x0222
        L_0x021f:
            r5.onAlarm$ar$ds()
        L_0x0222:
            com.android.launcher3.accessibility.DragViewStateAnnouncer r4 = r6.stateAnnouncer
            if (r4 == 0) goto L_0x01e3
            android.content.Context r5 = r31.getContext()
            java.lang.String r5 = com.android.launcher3.accessibility.WorkspaceAccessibilityHelper.getDescriptionForDropOver(r9, r5)
            r4.announce(r5)
            goto L_0x01e3
        L_0x0232:
            boolean r4 = willAddToExistingUserFolder$ar$ds(r12, r9)
            if (r4 == 0) goto L_0x02a8
            int r5 = r8.mDragMode
            if (r5 != 0) goto L_0x02a8
            r4 = r9
            com.android.launcher3.FolderIcon r4 = (com.android.launcher3.FolderIcon) r4
            r8.mDragOverFolderIcon = r4
            com.android.launcher3.Folder r5 = r4.mFolder
            boolean r5 = r5.mDestroyed
            if (r5 != 0) goto L_0x028c
            boolean r5 = r4.willAcceptItem(r13)
            if (r5 != 0) goto L_0x024e
            goto L_0x028c
        L_0x024e:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.android.launcher3.CellLayout$LayoutParams r5 = (com.android.launcher3.CellLayout.LayoutParams) r5
            android.view.ViewParent r11 = r4.getParent()
            android.view.ViewParent r11 = r11.getParent()
            com.android.launcher3.CellLayout r11 = (com.android.launcher3.CellLayout) r11
            com.android.launcher3.FolderIcon$FolderRingAnimator r14 = r4.mFolderRingAnimator
            r16 = r15
            int r15 = r5.cellX
            int r5 = r5.cellY
            r14.mCellX = r15
            r14.mCellY = r5
            r14.mCellLayout = r11
            r14.animateToAcceptState()
            com.android.launcher3.FolderIcon$FolderRingAnimator r5 = r4.mFolderRingAnimator
            java.util.ArrayList r11 = r11.mFolderOuterRings
            r11.add(r5)
            com.android.launcher3.Alarm r5 = r4.mOpenAlarm
            com.android.launcher3.OnAlarmListener r11 = r4.mOnOpenListener
            r5.mAlarmListener = r11
            boolean r11 = r12 instanceof com.android.launcher3.AppInfo
            if (r11 != 0) goto L_0x0284
            boolean r11 = r12 instanceof com.android.launcher3.ShortcutInfo
            if (r11 == 0) goto L_0x0289
        L_0x0284:
            r11 = 800(0x320, double:3.953E-321)
            r5.setAlarm(r11)
        L_0x0289:
            r4.mDragInfo = r13
            goto L_0x028e
        L_0x028c:
            r16 = r15
        L_0x028e:
            if (r10 == 0) goto L_0x0293
            r10.clearDragOutlines()
        L_0x0293:
            r5 = 2
            r8.setDragMode(r5)
            com.android.launcher3.accessibility.DragViewStateAnnouncer r4 = r6.stateAnnouncer
            if (r4 == 0) goto L_0x01e5
            android.content.Context r10 = r31.getContext()
            java.lang.String r9 = com.android.launcher3.accessibility.WorkspaceAccessibilityHelper.getDescriptionForDropOver(r9, r10)
            r4.announce(r9)
            goto L_0x01e5
        L_0x02a8:
            r16 = r15
            r5 = 2
            int r9 = r8.mDragMode
            if (r9 != r5) goto L_0x02b6
            if (r4 != 0) goto L_0x02b6
            r4 = 0
            r8.setDragMode(r4)
            goto L_0x02b7
        L_0x02b6:
            r4 = 0
        L_0x02b7:
            int r5 = r8.mDragMode
            r9 = 1
            if (r5 != r9) goto L_0x02c1
            if (r14 != 0) goto L_0x02c1
            r8.setDragMode(r4)
        L_0x02c1:
            com.android.launcher3.CellLayout r5 = r8.mDragTargetLayout
            float[] r10 = r8.mDragViewVisualCenter
            r11 = r10[r4]
            r4 = r10[r9]
            int r12 = r0.spanX
            int r13 = r0.spanY
            int r9 = (int) r11
            int r4 = (int) r4
            r28 = 0
            int[] r10 = r8.mTargetCell
            r30 = 0
            r21 = r5
            r22 = r9
            r23 = r4
            r24 = r12
            r25 = r13
            r26 = r12
            r27 = r13
            r29 = r10
            int[] r4 = r21.findNearestArea(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r9 = 0
            r10 = r4[r9]
            r9 = 1
            r11 = r4[r9]
            r15 = 0
            java.util.ArrayList r4 = r5.mIntersectingViews
            r9 = r5
            r14 = r7
            r6 = r16
            r16 = r4
            r9.getViewsIntersectingRegion(r10, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r4 = r5.mIntersectingViews
            boolean r4 = r4.isEmpty()
            r5 = 1
            r21 = r4 ^ 1
            if (r21 != 0) goto L_0x0320
            com.android.launcher3.CellLayout r9 = r8.mDragTargetLayout
            android.graphics.Bitmap r11 = r8.mDragOutline
            int[] r1 = r8.mTargetCell
            r2 = 0
            r12 = r1[r2]
            r13 = r1[r5]
            int r14 = r0.spanX
            int r15 = r0.spanY
            r16 = 0
            r10 = r7
            r17 = r32
            r9.visualizeDropLocation(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x031d:
            r11 = 1
            r12 = 2
            goto L_0x0371
        L_0x0320:
            int r4 = r8.mDragMode
            if (r4 == 0) goto L_0x0327
            r5 = 3
            if (r4 != r5) goto L_0x031d
        L_0x0327:
            com.android.launcher3.Alarm r4 = r8.mReorderAlarm
            boolean r4 = r4.mAlarmPending
            if (r4 != 0) goto L_0x031d
            int r4 = r8.mLastReorderX
            if (r4 != r6) goto L_0x0335
            int r4 = r8.mLastReorderY
            if (r4 == r1) goto L_0x031d
        L_0x0335:
            r5 = 2
            int[] r1 = new int[r5]
            com.android.launcher3.CellLayout r9 = r8.mDragTargetLayout
            float[] r4 = r8.mDragViewVisualCenter
            r6 = 0
            r6 = r4[r6]
            int r10 = (int) r6
            r6 = 1
            r4 = r4[r6]
            int r11 = (int) r4
            int r14 = r0.spanX
            int r15 = r0.spanY
            int[] r4 = r8.mTargetCell
            r19 = 0
            r12 = r2
            r13 = r3
            r16 = r7
            r17 = r4
            r18 = r1
            r9.performReorder(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.android.launcher3.Workspace$ReorderAlarmListener r9 = new com.android.launcher3.Workspace$ReorderAlarmListener
            int r4 = r0.spanX
            int r10 = r0.spanY
            r0 = r9
            r1 = r31
            r11 = 1
            r12 = 2
            r5 = r10
            r6 = r32
            r0.<init>(r2, r3, r4, r5, r6, r7)
            com.android.launcher3.Alarm r0 = r8.mReorderAlarm
            r0.mAlarmListener = r9
            r1 = 350(0x15e, double:1.73E-321)
            r0.setAlarm(r1)
        L_0x0371:
            int r0 = r8.mDragMode
            if (r0 == r11) goto L_0x0379
            if (r0 == r12) goto L_0x0379
            if (r21 != 0) goto L_0x0380
        L_0x0379:
            com.android.launcher3.CellLayout r0 = r8.mDragTargetLayout
            if (r0 == 0) goto L_0x0380
            r0.revertTempState()
        L_0x0380:
            return
        L_0x0381:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Improper spans found"
            r0.<init>(r1)
            throw r0
        L_0x0389:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Workspace.onDragOver(com.android.launcher3.DropTarget$DragObject):void");
    }

    public final void onDragStart$ar$ds(DragSource dragSource, Object obj) {
        boolean z = false;
        updateChildrenLayersEnabled(false);
        this.mLauncher.lockScreenOrientation();
        boolean z2 = true;
        InstallShortcutReceiver.mUseInstallQueue = true;
        if (this.mAddNewPageOnDrag) {
            this.mDeferRemoveExtraEmptyScreen = false;
            this.mRemoveEmptyScreenRunnable = null;
            ShortcutAndWidgetContainer shortcutAndWidgetContainer = this.mDragSourceInternal;
            if (shortcutAndWidgetContainer != null) {
                boolean z3 = shortcutAndWidgetContainer.getChildCount() == 1;
                if (indexOfChild((CellLayout) this.mDragSourceInternal.getParent()) == getChildCount() - 1) {
                    z = z3;
                    if ((z || !z2) && !this.mWorkspaceScreens.containsKey(-201)) {
                        insertNewWorkspaceScreen$ar$ds();
                    }
                    return;
                }
                z = z3;
            }
            z2 = false;
            if (z) {
            }
            insertNewWorkspaceScreen$ar$ds();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        post(this.mBindPages);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0472, code lost:
        r3 = (com.android.launcher3.LauncherAppWidgetHostView) r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03e2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0240  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDrop(com.android.launcher3.DropTarget.DragObject r47) {
        /*
            r46 = this;
            r12 = r46
            r13 = r47
            float[] r0 = r12.mDragViewVisualCenter
            float[] r0 = r13.getVisualCenter(r0)
            r12.mDragViewVisualCenter = r0
            com.android.launcher3.CellLayout r14 = r12.mDropToLayout
            if (r14 == 0) goto L_0x0027
            com.android.launcher3.Launcher r0 = r12.mLauncher
            boolean r0 = r0.isHotseatLayout(r14)
            if (r0 == 0) goto L_0x0022
            com.android.launcher3.Launcher r0 = r12.mLauncher
            com.android.launcher3.Hotseat r0 = r0.mHotseat
            float[] r1 = r12.mDragViewVisualCenter
            r12.mapPointFromSelfToHotseatLayout(r0, r1)
            goto L_0x0027
        L_0x0022:
            float[] r0 = r12.mDragViewVisualCenter
            mapPointFromSelfToChild$ar$ds(r14, r0)
        L_0x0027:
            com.android.launcher3.DragSource r0 = r13.dragSource
            r16 = -101(0xffffffffffffff9b, double:NaN)
            r10 = 2
            r9 = 0
            r8 = 1
            r7 = 0
            if (r0 == r12) goto L_0x02b8
            int[] r0 = new int[r10]
            float[] r3 = r12.mDragViewVisualCenter
            r4 = r3[r7]
            int r4 = (int) r4
            r0[r7] = r4
            r3 = r3[r8]
            int r3 = (int) r3
            r0[r8] = r3
            java.lang.Object r3 = r13.dragInfo
            com.android.launcher3.Workspace$10 r6 = new com.android.launcher3.Workspace$10
            r6.<init>()
            r5 = r3
            com.android.launcher3.ItemInfo r5 = (com.android.launcher3.ItemInfo) r5
            int r4 = r5.spanX
            int r1 = r5.spanY
            com.android.launcher3.CellLayout$CellInfo r2 = r12.mDragInfo
            if (r2 == 0) goto L_0x005a
            int r1 = r2.spanX
            int r2 = r2.spanY
            r20 = r1
            r21 = r2
            goto L_0x005e
        L_0x005a:
            r21 = r1
            r20 = r4
        L_0x005e:
            com.android.launcher3.Launcher r1 = r12.mLauncher
            boolean r1 = r1.isHotseatLayout(r14)
            if (r8 == r1) goto L_0x0068
            r16 = -100
        L_0x0068:
            long r1 = r12.getIdForScreen(r14)
            com.android.launcher3.Launcher r4 = r12.mLauncher
            boolean r4 = r4.isHotseatLayout(r14)
            if (r4 != 0) goto L_0x008d
            int r4 = r12.mCurrentPage
            long r18 = r12.getScreenIdForPageIndex(r4)
            int r4 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r4 == 0) goto L_0x008d
            com.android.launcher3.Workspace$State r4 = r12.mState
            com.android.launcher3.Workspace$State r10 = com.android.launcher3.Workspace.State.SPRING_LOADED
            if (r4 == r10) goto L_0x008d
            int r4 = r12.getPageIndexForScreenId(r1)
            r10 = 950(0x3b6, float:1.331E-42)
            r12.snapToPage(r4, r10, r7, r9)
        L_0x008d:
            boolean r4 = r3 instanceof com.android.launcher3.PendingAddItemInfo
            if (r4 == 0) goto L_0x01a7
            r10 = r3
            com.android.launcher3.PendingAddItemInfo r10 = (com.android.launcher3.PendingAddItemInfo) r10
            int r3 = r10.itemType
            if (r3 != r8) goto L_0x00e4
            r3 = r0[r7]
            r0 = r0[r8]
            r18 = 0
            int[] r6 = r12.mTargetCell
            r19 = 0
            r30 = r1
            r1 = r14
            r2 = r3
            r3 = r0
            r4 = r20
            r0 = r5
            r5 = r21
            r23 = r6
            r6 = r20
            r15 = 0
            r7 = r21
            r11 = 1
            r8 = r18
            r9 = r23
            r18 = r10
            r10 = r19
            int[] r1 = r1.findNearestArea(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.mTargetCell = r1
            float[] r2 = r12.mDragViewVisualCenter
            r3 = r2[r15]
            r2 = r2[r11]
            float r1 = r14.getDistanceFromCell(r3, r2, r1)
            java.lang.Object r2 = r13.dragInfo
            int[] r3 = r12.mTargetCell
            com.android.launcher3.ItemInfo r2 = (com.android.launcher3.ItemInfo) r2
            boolean r2 = r12.willCreateUserFolder$ar$ds(r2, r14, r3, r1)
            if (r2 != 0) goto L_0x00e2
            java.lang.Object r2 = r13.dragInfo
            int[] r3 = r12.mTargetCell
            boolean r1 = r12.willAddToExistingUserFolder(r2, r14, r3, r1)
            if (r1 == 0) goto L_0x00eb
        L_0x00e2:
            r8 = 0
            goto L_0x00ec
        L_0x00e4:
            r30 = r1
            r0 = r5
            r18 = r10
            r11 = 1
            r15 = 0
        L_0x00eb:
            r8 = 1
        L_0x00ec:
            java.lang.Object r10 = r13.dragInfo
            if (r8 == 0) goto L_0x014c
            r9 = r10
            com.android.launcher3.ItemInfo r9 = (com.android.launcher3.ItemInfo) r9
            int r1 = r9.spanX
            int r2 = r9.spanY
            int r3 = r9.minSpanX
            if (r3 <= 0) goto L_0x0103
            int r4 = r9.minSpanY
            if (r4 <= 0) goto L_0x0103
            r5 = r4
            r8 = 2
            r4 = r3
            goto L_0x0106
        L_0x0103:
            r4 = r1
            r5 = r2
            r8 = 2
        L_0x0106:
            int[] r8 = new int[r8]
            float[] r1 = r12.mDragViewVisualCenter
            r2 = r1[r15]
            int r2 = (int) r2
            r1 = r1[r11]
            int r3 = (int) r1
            int r6 = r0.spanX
            int r7 = r0.spanY
            r19 = 0
            int[] r1 = r12.mTargetCell
            r20 = 3
            r21 = r1
            r1 = r14
            r22 = r8
            r8 = r19
            r33 = r9
            r9 = r21
            r19 = r10
            r10 = r22
            r11 = r20
            int[] r1 = r1.performReorder(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mTargetCell = r1
            r1 = r22[r15]
            r10 = r33
            int r2 = r10.spanX
            if (r1 != r2) goto L_0x0143
            r11 = 1
            r2 = r22[r11]
            int r3 = r10.spanY
            if (r2 == r3) goto L_0x0141
            goto L_0x0144
        L_0x0141:
            r8 = 0
            goto L_0x0145
        L_0x0143:
            r11 = 1
        L_0x0144:
            r8 = 1
        L_0x0145:
            r10.spanX = r1
            r1 = r22[r11]
            r10.spanY = r1
            goto L_0x014f
        L_0x014c:
            r19 = r10
            r8 = 0
        L_0x014f:
            com.android.launcher3.Workspace$11 r9 = new com.android.launcher3.Workspace$11
            r10 = r19
            com.android.launcher3.ItemInfo r10 = (com.android.launcher3.ItemInfo) r10
            r7 = r0
            r0 = r9
            r1 = r46
            r2 = r18
            r3 = r16
            r5 = r30
            r19 = r7
            r7 = r10
            r0.<init>(r2, r3, r5, r7)
            r3 = r18
            int r0 = r3.itemType
            r7 = 4
            if (r0 == r7) goto L_0x0172
            r1 = 5
            if (r0 != r1) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            r0 = 0
            goto L_0x0173
        L_0x0172:
            r0 = 1
        L_0x0173:
            if (r0 == 0) goto L_0x017c
            r1 = r3
            com.android.launcher3.widget.PendingAddWidgetInfo r1 = (com.android.launcher3.widget.PendingAddWidgetInfo) r1
            android.appwidget.AppWidgetHostView r1 = r1.boundWidget
            r6 = r1
            goto L_0x017d
        L_0x017c:
            r6 = 0
        L_0x017d:
            if (r6 == 0) goto L_0x018a
            if (r8 == 0) goto L_0x018a
            com.android.launcher3.Launcher r1 = r12.mLauncher
            int r2 = r10.spanX
            int r4 = r10.spanY
            com.android.launcher3.AppWidgetResizeFrame.updateWidgetSizeRanges(r6, r1, r2, r4)
        L_0x018a:
            if (r0 == 0) goto L_0x0199
            r10 = r3
            com.android.launcher3.widget.PendingAddWidgetInfo r10 = (com.android.launcher3.widget.PendingAddWidgetInfo) r10
            com.android.launcher3.LauncherAppWidgetProviderInfo r0 = r10.info
            if (r0 == 0) goto L_0x0199
            android.content.ComponentName r0 = r0.configure
            if (r0 == 0) goto L_0x0199
            r5 = 1
            goto L_0x019a
        L_0x0199:
            r5 = 0
        L_0x019a:
            com.android.launcher3.DragView r3 = r13.dragView
            r7 = 1
            r0 = r46
            r1 = r19
            r2 = r14
            r4 = r9
            r0.animateWidgetDrop(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x01a7:
            r30 = r1
            r1 = r5
            r8 = 2
            r11 = 1
            r15 = 0
            int r2 = r1.itemType
            if (r2 == 0) goto L_0x01da
            if (r2 == r11) goto L_0x01da
            if (r2 == r8) goto L_0x01cd
            r4 = 6
            if (r2 != r4) goto L_0x01b9
            goto L_0x01da
        L_0x01b9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown item type: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01cd:
            com.android.launcher3.Launcher r1 = r12.mLauncher
            r2 = r3
            com.android.launcher3.FolderInfo r2 = (com.android.launcher3.FolderInfo) r2
            com.android.launcher3.FolderIcon r1 = com.android.launcher3.FolderIcon.fromXml$ar$ds(r1, r14, r2)
        L_0x01d6:
            r10 = r1
            r18 = r3
            goto L_0x01f8
        L_0x01da:
            long r1 = r1.container
            r4 = -1
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x01ee
            boolean r1 = r3 instanceof com.android.launcher3.AppInfo
            if (r1 == 0) goto L_0x01ee
            com.android.launcher3.AppInfo r3 = (com.android.launcher3.AppInfo) r3
            com.android.launcher3.ShortcutInfo r1 = new com.android.launcher3.ShortcutInfo
            r1.<init>((com.android.launcher3.AppInfo) r3)
            r3 = r1
        L_0x01ee:
            com.android.launcher3.Launcher r1 = r12.mLauncher
            r2 = r3
            com.android.launcher3.ShortcutInfo r2 = (com.android.launcher3.ShortcutInfo) r2
            android.view.View r1 = r1.createShortcut(r14, r2)
            goto L_0x01d6
        L_0x01f8:
            r2 = r0[r15]
            r3 = r0[r11]
            r8 = 0
            int[] r9 = r12.mTargetCell
            r0 = 0
            r1 = r14
            r4 = r20
            r5 = r21
            r7 = r6
            r6 = r20
            r36 = r7
            r7 = r21
            r19 = r10
            r10 = r0
            int[] r0 = r1.findNearestArea(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.mTargetCell = r0
            float[] r1 = r12.mDragViewVisualCenter
            r2 = r1[r15]
            r1 = r1[r11]
            float r10 = r14.getDistanceFromCell(r2, r1, r0)
            r9 = r36
            r13.postAnimationRunnable = r9
            int[] r5 = r12.mTargetCell
            r7 = 1
            com.android.launcher3.DragView r8 = r13.dragView
            java.lang.Runnable r6 = r13.postAnimationRunnable
            r0 = r46
            r1 = r19
            r2 = r16
            r4 = r14
            r20 = r6
            r6 = r10
            r21 = r9
            r9 = r20
            boolean r0 = r0.createUserFolderIfNecessary(r1, r2, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0240
            goto L_0x0533
        L_0x0240:
            int[] r2 = r12.mTargetCell
            r5 = 1
            r0 = r46
            r1 = r14
            r3 = r10
            r4 = r47
            boolean r0 = r0.addToExistingFolderIfNecessary$ar$ds(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0533
            float[] r0 = r12.mDragViewVisualCenter
            r1 = r0[r15]
            int r2 = (int) r1
            r0 = r0[r11]
            int r3 = (int) r0
            r4 = 1
            r5 = 1
            r6 = 1
            r7 = 1
            r8 = 0
            int[] r9 = r12.mTargetCell
            r10 = 0
            r0 = 3
            r1 = r14
            r11 = r0
            int[] r0 = r1.performReorder(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mTargetCell = r0
            com.android.launcher3.Launcher r1 = r12.mLauncher
            r28 = r0[r15]
            r11 = 1
            r29 = r0[r11]
            r0 = r18
            com.android.launcher3.ItemInfo r0 = (com.android.launcher3.ItemInfo) r0
            r22 = r1
            r23 = r0
            r24 = r16
            r26 = r30
            com.android.launcher3.LauncherModel.addOrMoveItemInDatabase(r22, r23, r24, r26, r28, r29)
            int[] r1 = r12.mTargetCell
            r6 = r1[r15]
            r7 = r1[r11]
            int r8 = r0.spanX
            int r9 = r0.spanY
            r10 = 0
            r11 = 0
            r0 = r46
            r1 = r19
            r2 = r16
            r4 = r30
            r0.addInScreen(r1, r2, r4, r6, r7, r8, r9, r10, r11)
            r2 = r19
            r14.onDropChild(r2)
            com.android.launcher3.ShortcutAndWidgetContainer r0 = r14.mShortcutsAndWidgets
            r0.measureChild(r2)
            com.android.launcher3.DragView r0 = r13.dragView
            if (r0 == 0) goto L_0x0533
            r46.setFinalTransitionTransform$ar$ds()
            com.android.launcher3.Launcher r0 = r12.mLauncher
            com.android.launcher3.DragLayer r0 = r0.mDragLayer
            com.android.launcher3.DragView r1 = r13.dragView
            r3 = -1
            r4 = r21
            r5 = r46
            r0.animateViewIntoPosition(r1, r2, r3, r4, r5)
            r46.resetTransitionTransform$ar$ds()
            return
        L_0x02b8:
            r7 = 4
            r8 = 2
            r11 = 1
            r15 = 0
            com.android.launcher3.CellLayout$CellInfo r0 = r12.mDragInfo
            if (r0 == 0) goto L_0x0533
            android.view.View r0 = r0.cell
            r20 = -1
            if (r14 == 0) goto L_0x04d3
            boolean r1 = r13.cancelled
            if (r1 != 0) goto L_0x04d3
            com.android.launcher3.CellLayout r10 = r12.getParentCellLayoutForView(r0)
            com.android.launcher3.Launcher r1 = r12.mLauncher
            boolean r9 = r1.isHotseatLayout(r14)
            if (r11 == r9) goto L_0x02d9
            r34 = -100
            goto L_0x02db
        L_0x02d9:
            r34 = r16
        L_0x02db:
            int[] r1 = r12.mTargetCell
            r1 = r1[r15]
            if (r1 >= 0) goto L_0x02e6
            com.android.launcher3.CellLayout$CellInfo r1 = r12.mDragInfo
            long r1 = r1.screenId
            goto L_0x02ea
        L_0x02e6:
            long r1 = r12.getIdForScreen(r14)
        L_0x02ea:
            r5 = r1
            com.android.launcher3.CellLayout$CellInfo r1 = r12.mDragInfo
            if (r1 == 0) goto L_0x02f4
            int r2 = r1.spanX
            r18 = r2
            goto L_0x02f6
        L_0x02f4:
            r18 = 1
        L_0x02f6:
            if (r1 == 0) goto L_0x02fd
            int r1 = r1.spanY
            r19 = r1
            goto L_0x02ff
        L_0x02fd:
            r19 = 1
        L_0x02ff:
            float[] r1 = r12.mDragViewVisualCenter
            r2 = r1[r15]
            int r2 = (int) r2
            r1 = r1[r11]
            int r3 = (int) r1
            r21 = 0
            int[] r4 = r12.mTargetCell
            r22 = 0
            r1 = r14
            r23 = r4
            r4 = r18
            r42 = r5
            r5 = r19
            r6 = r18
            r7 = r19
            r8 = r21
            r21 = r9
            r9 = r23
            r44 = r10
            r10 = r22
            int[] r1 = r1.findNearestArea(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.mTargetCell = r1
            float[] r2 = r12.mDragViewVisualCenter
            r3 = r2[r15]
            r2 = r2[r11]
            float r10 = r14.getDistanceFromCell(r3, r2, r1)
            boolean r1 = r12.mInScrollArea
            if (r1 != 0) goto L_0x0350
            int[] r5 = r12.mTargetCell
            r7 = 0
            com.android.launcher3.DragView r8 = r13.dragView
            r9 = 0
            r6 = r0
            r0 = r46
            r1 = r6
            r2 = r34
            r4 = r14
            r22 = r6
            r6 = r10
            boolean r0 = r0.createUserFolderIfNecessary(r1, r2, r4, r5, r6, r7, r8, r9)
            if (r0 != 0) goto L_0x034f
            goto L_0x0352
        L_0x034f:
            return
        L_0x0350:
            r22 = r0
        L_0x0352:
            int[] r2 = r12.mTargetCell
            r5 = 0
            r0 = r46
            r1 = r14
            r3 = r10
            r4 = r47
            boolean r0 = r0.addToExistingFolderIfNecessary$ar$ds(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0362
            return
        L_0x0362:
            java.lang.Object r0 = r13.dragInfo
            com.android.launcher3.ItemInfo r0 = (com.android.launcher3.ItemInfo) r0
            int r1 = r0.spanX
            int r2 = r0.spanY
            int r3 = r0.minSpanX
            if (r3 <= 0) goto L_0x0376
            int r4 = r0.minSpanY
            if (r4 <= 0) goto L_0x0376
            r5 = r4
            r10 = 2
            r4 = r3
            goto L_0x0379
        L_0x0376:
            r4 = r1
            r5 = r2
            r10 = 2
        L_0x0379:
            int[] r9 = new int[r10]
            float[] r1 = r12.mDragViewVisualCenter
            r2 = r1[r15]
            int r2 = (int) r2
            r1 = r1[r11]
            int r3 = (int) r1
            int[] r8 = r12.mTargetCell
            r23 = 2
            r1 = r14
            r6 = r18
            r7 = r19
            r18 = r8
            r8 = r22
            r19 = r9
            r9 = r18
            r18 = 2
            r10 = r19
            r11 = r23
            int[] r1 = r1.performReorder(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mTargetCell = r1
            r2 = r1[r15]
            if (r2 < 0) goto L_0x03ab
            r11 = 1
            r1 = r1[r11]
            if (r1 < 0) goto L_0x03ac
            r8 = 1
            goto L_0x03ad
        L_0x03ab:
            r11 = 1
        L_0x03ac:
            r8 = 0
        L_0x03ad:
            if (r8 == 0) goto L_0x03d2
            r10 = r22
            boolean r1 = r10 instanceof android.appwidget.AppWidgetHostView
            if (r1 == 0) goto L_0x03d4
            r1 = r19[r15]
            int r2 = r0.spanX
            if (r1 != r2) goto L_0x03c1
            r2 = r19[r11]
            int r3 = r0.spanY
            if (r2 == r3) goto L_0x03d4
        L_0x03c1:
            r0.spanX = r1
            r2 = r19[r11]
            r0.spanY = r2
            r3 = r10
            android.appwidget.AppWidgetHostView r3 = (android.appwidget.AppWidgetHostView) r3
            com.android.launcher3.Launcher r4 = r12.mLauncher
            com.android.launcher3.AppWidgetResizeFrame.updateWidgetSizeRanges(r3, r4, r1, r2)
            r19 = 1
            goto L_0x03d6
        L_0x03d2:
            r10 = r22
        L_0x03d4:
            r19 = 0
        L_0x03d6:
            int r1 = r12.mCurrentPage
            long r1 = r12.getScreenIdForPageIndex(r1)
            r6 = r42
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x03f1
            if (r21 != 0) goto L_0x03f1
            int r1 = r12.getPageIndexForScreenId(r6)
            r2 = 750(0x2ee, float:1.051E-42)
            r9 = 0
            r12.snapToPage(r1, r2, r15, r9)
            r21 = r1
            goto L_0x03f4
        L_0x03f1:
            r9 = 0
            r21 = -1
        L_0x03f4:
            if (r8 == 0) goto L_0x04af
            java.lang.Object r1 = r10.getTag()
            r8 = r1
            com.android.launcher3.ItemInfo r8 = (com.android.launcher3.ItemInfo) r8
            r1 = r44
            if (r1 == r14) goto L_0x043d
            com.android.launcher3.CellLayout r1 = r12.getParentCellLayoutForView(r10)
            if (r1 == 0) goto L_0x040a
            r1.removeView(r10)
        L_0x040a:
            int[] r1 = r12.mTargetCell
            r22 = r1[r15]
            r23 = r1[r11]
            int r4 = r8.spanX
            int r5 = r8.spanY
            r25 = 0
            r26 = 0
            r2 = r0
            r0 = r46
            r1 = r10
            r45 = r2
            r2 = r34
            r27 = r4
            r28 = r5
            r4 = r6
            r29 = r6
            r6 = r22
            r7 = r23
            r22 = r8
            r8 = r27
            r23 = r9
            r9 = r28
            r27 = r10
            r10 = r25
            r11 = r26
            r0.addInScreen(r1, r2, r4, r6, r7, r8, r9, r10, r11)
            goto L_0x0447
        L_0x043d:
            r45 = r0
            r29 = r6
            r22 = r8
            r23 = r9
            r27 = r10
        L_0x0447:
            android.view.ViewGroup$LayoutParams r0 = r27.getLayoutParams()
            com.android.launcher3.CellLayout$LayoutParams r0 = (com.android.launcher3.CellLayout.LayoutParams) r0
            int[] r1 = r12.mTargetCell
            r2 = r1[r15]
            r0.tmpCellX = r2
            r0.cellX = r2
            r2 = 1
            r1 = r1[r2]
            r0.tmpCellY = r1
            r0.cellY = r1
            r1 = r45
            int r3 = r1.spanX
            r0.cellHSpan = r3
            int r3 = r1.spanY
            r0.cellVSpan = r3
            r0.isLockedToGrid = r2
            int r3 = (r34 > r16 ? 1 : (r34 == r16 ? 0 : -1))
            if (r3 == 0) goto L_0x048f
            r8 = r27
            boolean r3 = r8 instanceof com.android.launcher3.LauncherAppWidgetHostView
            if (r3 == 0) goto L_0x0491
            r3 = r8
            com.android.launcher3.LauncherAppWidgetHostView r3 = (com.android.launcher3.LauncherAppWidgetHostView) r3
            android.appwidget.AppWidgetProviderInfo r4 = r3.getAppWidgetInfo()
            if (r4 == 0) goto L_0x0491
            int r4 = r4.resizeMode
            if (r4 == 0) goto L_0x0491
            boolean r4 = r13.accessibleDrag
            if (r4 != 0) goto L_0x0491
            com.android.launcher3.Workspace$7 r4 = new com.android.launcher3.Workspace$7
            r4.<init>(r3, r14)
            com.android.launcher3.Workspace$8 r3 = new com.android.launcher3.Workspace$8
            r3.<init>(r4)
            r9 = r3
            goto L_0x0493
        L_0x048f:
            r8 = r27
        L_0x0491:
            r9 = r23
        L_0x0493:
            com.android.launcher3.Launcher r3 = r12.mLauncher
            int r4 = r0.cellX
            int r0 = r0.cellY
            int r5 = r1.spanX
            int r1 = r1.spanY
            r32 = r3
            r33 = r22
            r36 = r29
            r38 = r4
            r39 = r0
            r40 = r5
            r41 = r1
            com.android.launcher3.LauncherModel.modifyItemInDatabase(r32, r33, r34, r36, r38, r39, r40, r41)
            goto L_0x04d0
        L_0x04af:
            r23 = r9
            r8 = r10
            r2 = 1
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            com.android.launcher3.CellLayout$LayoutParams r0 = (com.android.launcher3.CellLayout.LayoutParams) r0
            int[] r1 = r12.mTargetCell
            int r3 = r0.cellX
            r1[r15] = r3
            int r0 = r0.cellY
            r1[r2] = r0
            android.view.ViewParent r0 = r8.getParent()
            android.view.ViewParent r0 = r0.getParent()
            com.android.launcher3.CellLayout r0 = (com.android.launcher3.CellLayout) r0
            r0.markCellsAsOccupiedForView(r8)
        L_0x04d0:
            r7 = r19
            goto L_0x04de
        L_0x04d3:
            r8 = r0
            r2 = 1
            r18 = 2
            r23 = 0
            r9 = r23
            r7 = 0
            r21 = -1
        L_0x04de:
            android.view.ViewParent r0 = r8.getParent()
            android.view.ViewParent r0 = r0.getParent()
            r10 = r0
            com.android.launcher3.CellLayout r10 = (com.android.launcher3.CellLayout) r10
            com.android.launcher3.Workspace$9 r4 = new com.android.launcher3.Workspace$9
            r4.<init>(r9)
            r12.mAnimatingViewIntoPlace = r2
            com.android.launcher3.DragView r0 = r13.dragView
            boolean r0 = r0.mHasDrawn
            if (r0 == 0) goto L_0x052b
            java.lang.Object r0 = r8.getTag()
            r1 = r0
            com.android.launcher3.ItemInfo r1 = (com.android.launcher3.ItemInfo) r1
            int r0 = r1.itemType
            r3 = 4
            if (r0 == r3) goto L_0x051b
            r3 = 5
            if (r0 != r3) goto L_0x0506
            goto L_0x051b
        L_0x0506:
            if (r21 >= 0) goto L_0x050a
            r3 = -1
            goto L_0x050e
        L_0x050a:
            r0 = 300(0x12c, float:4.2E-43)
            r3 = 300(0x12c, float:4.2E-43)
        L_0x050e:
            com.android.launcher3.Launcher r0 = r12.mLauncher
            com.android.launcher3.DragLayer r0 = r0.mDragLayer
            com.android.launcher3.DragView r1 = r13.dragView
            r2 = r8
            r5 = r46
            r0.animateViewIntoPosition(r1, r2, r3, r4, r5)
            goto L_0x0530
        L_0x051b:
            if (r2 == r7) goto L_0x051f
            r5 = 0
            goto L_0x0520
        L_0x051f:
            r5 = 2
        L_0x0520:
            com.android.launcher3.DragView r3 = r13.dragView
            r7 = 0
            r0 = r46
            r2 = r10
            r6 = r8
            r0.animateWidgetDrop(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0530
        L_0x052b:
            r13.deferDragViewCleanupPostAnimation = r15
            r8.setVisibility(r15)
        L_0x0530:
            r10.onDropChild(r8)
        L_0x0533:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Workspace.onDrop(com.android.launcher3.DropTarget$DragObject):void");
    }

    public final void onEndReordering() {
        this.mIsReordering = false;
        if (!this.mLauncher.mWorkspaceLoading) {
            this.mScreenOrder.clear();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mScreenOrder.add(Long.valueOf(getIdForScreen((CellLayout) getChildAt(i))));
            }
            Launcher launcher = this.mLauncher;
            launcher.mModel.updateWorkspaceScreenOrder(launcher, this.mScreenOrder);
            setLayoutTransition(this.mLayoutTransition);
        }
    }

    public final boolean onEnterScrollArea(int i, int i2, int i3) {
        Launcher launcher = this.mLauncher;
        boolean z = !launcher.mDeviceProfile.isLandscape;
        if (launcher.mHotseat != null && z) {
            Rect rect = new Rect();
            this.mLauncher.mHotseat.getHitRect(rect);
            if (rect.contains(i, i2)) {
                return false;
            }
        }
        if (!workspaceInModalState() && !this.mIsSwitchingState && getOpenFolder() == null) {
            this.mInScrollArea = true;
            int nextPage = getNextPage() + (1 != i3 ? -1 : 1);
            setCurrentDropLayout((CellLayout) null);
            if (nextPage < 0 || nextPage >= getChildCount() || getScreenIdForPageIndex(nextPage) == -301) {
                return false;
            }
            setCurrentDragOverlappingLayout((CellLayout) getChildAt(nextPage));
            invalidate();
            return true;
        }
        return false;
    }

    public final void onExitScrollArea$ar$ds() {
        if (this.mInScrollArea) {
            invalidate();
            CellLayout currentDropLayout = getCurrentDropLayout();
            setCurrentDropLayout(currentDropLayout);
            setCurrentDragOverlappingLayout(currentDropLayout);
            this.mInScrollArea = false;
        }
    }

    public final void onFlingToDelete(DropTarget.DragObject dragObject, PointF pointF) {
    }

    public final void onFlingToDeleteCompleted() {
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        getScreenIdForPageIndex(this.mCurrentPage);
        return super.onGenericMotionEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action == 0) {
            this.mXDown = motionEvent.getX();
            this.mYDown = motionEvent.getY();
            this.mTouchDownTime = System.currentTimeMillis();
        } else if ((action == 1 || action == 6) && this.mTouchState == 0 && ((CellLayout) getChildAt(this.mCurrentPage)) != null) {
            int[] iArr = this.mTempCell;
            getLocationOnScreen(iArr);
            int actionIndex = motionEvent.getActionIndex();
            iArr[0] = iArr[0] + ((int) motionEvent.getX(actionIndex));
            iArr[1] = iArr[1] + ((int) motionEvent.getY(actionIndex));
            this.mWallpaperManager.sendWallpaperCommand(getWindowToken(), motionEvent.getAction() == 1 ? "android.wallpaper.tap" : "android.wallpaper.secondaryTap", iArr[0], iArr[1], 0, (Bundle) null);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLauncherTransitionEnd$ar$ds(boolean z) {
        this.mIsSwitchingState = false;
        updateChildrenLayersEnabled(false);
        if (this.mState == State.NORMAL && hasCustomContent()) {
            ((CellLayout) this.mWorkspaceScreens.get(-301)).setVisibility(0);
        }
    }

    public final void onLauncherTransitionPrepare$ar$ds() {
        this.mIsSwitchingState = true;
        this.mTransitionProgress = 0.0f;
        invalidate();
        updateChildrenLayersEnabled(false);
        if (this.mState != State.NORMAL && hasCustomContent()) {
            setLayoutTransition((LayoutTransition) null);
            ((CellLayout) this.mWorkspaceScreens.get(-301)).setVisibility(4);
            setLayoutTransition(this.mLayoutTransition);
        }
    }

    public final void onLauncherTransitionStart$ar$ds() {
    }

    public final void onLauncherTransitionStep$ar$ds(float f) {
        this.mTransitionProgress = f;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (this.mFirstLayout && (i5 = this.mCurrentPage) >= 0 && i5 < getChildCount()) {
            this.mWallpaperOffset.syncWithScroll();
            WallpaperOffsetInterpolator wallpaperOffsetInterpolator = this.mWallpaperOffset;
            wallpaperOffsetInterpolator.mCurrentOffset = wallpaperOffsetInterpolator.mFinalOffset;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void onOverlayScrollChanged(float f) {
        SearchDropTargetBar searchDropTargetBar;
        Hotseat hotseat;
        float min = Math.min(1.0f, Math.max(f + 0.0f, 0.0f));
        float interpolation = 1.0f - this.mAlphaInterpolator.getInterpolation(min);
        float measuredWidth = ((float) this.mLauncher.mDragLayer.getMeasuredWidth()) * min;
        if (this.mIsRtl) {
            measuredWidth = -measuredWidth;
        }
        this.mOverlayTranslation = measuredWidth;
        int i = 0;
        if (interpolation > 0.0f && interpolation < 1.0f) {
            i = 2;
        }
        Launcher launcher = this.mLauncher;
        if (!(launcher == null || (hotseat = launcher.mHotseat) == null || hotseat.getLayerType() == i)) {
            this.mLauncher.mHotseat.setLayerType(i, (Paint) null);
        }
        Launcher launcher2 = this.mLauncher;
        if (!(launcher2 == null || (searchDropTargetBar = launcher2.mSearchDropTargetBar) == null || searchDropTargetBar.getLayerType() == i)) {
            this.mLauncher.mSearchDropTargetBar.setLayerType(i, (Paint) null);
        }
        CellLayout cellLayout = (CellLayout) getChildAt(this.mCurrentPage);
        if (!(cellLayout == null || cellLayout.getLayerType() == i)) {
            cellLayout.setLayerType(i, (Paint) null);
        }
        setTranslationAndAlpha$ar$ds(this.mLauncher.mSearchDropTargetBar, measuredWidth, interpolation);
        setTranslationAndAlpha$ar$ds(this.mPageIndicator, measuredWidth, interpolation);
        setTranslationAndAlpha$ar$ds(getChildAt(this.mCurrentPage), measuredWidth, interpolation);
        setTranslationAndAlpha$ar$ds(this.mLauncher.mHotseat, measuredWidth, interpolation);
        if (measuredWidth == 0.0f) {
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    setTranslationAndAlpha$ar$ds(getChildAt(childCount), 0.0f, interpolation);
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onPageBeginMoving() {
        if (isHardwareAccelerated()) {
            updateChildrenLayersEnabled(false);
            return;
        }
        int i = this.mNextPage;
        if (i != -1) {
            enableChildrenCache(this.mCurrentPage, i);
            return;
        }
        int i2 = this.mCurrentPage;
        enableChildrenCache(i2 - 1, i2 + 1);
    }

    /* access modifiers changed from: protected */
    public final void onPageEndMoving() {
        this.mWasInOverscroll = false;
        if (isHardwareAccelerated()) {
            updateChildrenLayersEnabled(false);
        } else {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                CellLayout cellLayout = (CellLayout) getChildAt(i);
                cellLayout.mShortcutsAndWidgets.setChildrenDrawnWithCacheEnabled(false);
                if (!isHardwareAccelerated()) {
                    cellLayout.mShortcutsAndWidgets.setChildrenDrawingCacheEnabled(false);
                }
            }
        }
        if (this.mDragController.mDragging && workspaceInModalState()) {
            this.mDragController.forceTouchMove();
        }
        Runnable runnable = this.mDelayedResizeRunnable;
        if (runnable != null) {
            runnable.run();
            this.mDelayedResizeRunnable = null;
        }
        if (this.mStripScreensOnPageStopMoving) {
            stripEmptyScreens();
            this.mStripScreensOnPageStopMoving = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onScrollInteractionBegin() {
        this.mScrollInteractionBegan = true;
    }

    /* access modifiers changed from: protected */
    public final void onScrollInteractionEnd() {
        this.mScrollInteractionBegan = false;
        if (this.mStartedSendingScrollEvents) {
            this.mStartedSendingScrollEvents = false;
            this.mLauncherOverlay.onScrollInteractionEnd();
        }
    }

    public final void onStartReordering() {
        this.mTouchState = 4;
        this.mIsReordering = true;
        invalidate();
        setLayoutTransition((LayoutTransition) null);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (workspaceInModalState() || !isFinishedSwitchingState()) {
            return true;
        }
        if (workspaceInModalState() || indexOfChild(view) == this.mCurrentPage) {
            return false;
        }
        return true;
    }

    public final void onUninstallActivityReturned(boolean z) {
        this.mDeferDropAfterUninstall = false;
        this.mUninstallSuccessful = z;
        Runnable runnable = this.mDeferredAction;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        Launcher launcher = this.mLauncher;
        launcher.mVisible = i == 0;
        launcher.updateAutoAdvanceState();
        if (launcher.mVisible) {
            if (!launcher.mWorkspaceLoading) {
                launcher.mWorkspace.getViewTreeObserver().addOnDrawListener(new ViewTreeObserver.OnDrawListener() {
                    private boolean mStarted;

                    public final void onDraw(
/*
Method generation error in method: com.android.launcher3.Launcher.13.onDraw():void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.android.launcher3.Launcher.13.onDraw():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
            }
            launcher.mDefaultKeySsb.clear();
            launcher.mDefaultKeySsb.clearSpans();
            Selection.setSelection(launcher.mDefaultKeySsb, 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void overScroll(float f) {
        boolean z;
        boolean z2 = false;
        if ((f > 0.0f || (hasCustomContent() && !this.mIsRtl)) && (f < 0.0f || (hasCustomContent() && this.mIsRtl))) {
            z = false;
        } else {
            z = true;
        }
        Launcher.LauncherOverlay launcherOverlay = this.mLauncherOverlay;
        boolean z3 = launcherOverlay != null && ((f <= 0.0f && !this.mIsRtl) || (f >= 0.0f && this.mIsRtl));
        if (!(launcherOverlay == null || this.mLastOverlaySroll == 0.0f || ((f < 0.0f || this.mIsRtl) && (f > 0.0f || !this.mIsRtl)))) {
            z2 = true;
        }
        if (z3) {
            if (!this.mStartedSendingScrollEvents && this.mScrollInteractionBegan) {
                this.mStartedSendingScrollEvents = true;
                launcherOverlay.onScrollInteractionBegin();
            }
            float abs = Math.abs(f / ((float) this.mViewport.width()));
            this.mLastOverlaySroll = abs;
            this.mLauncherOverlay.onScrollChange$ar$ds$fe0f0749_0(abs);
        } else if (z) {
            dampedOverScroll(f);
        }
        if (z2) {
            this.mLauncherOverlay.onScrollChange$ar$ds$fe0f0749_0(0.0f);
        }
    }

    public final void prepareAccessibilityDrop() {
    }

    /* access modifiers changed from: protected */
    public final void reinflateWidgetsIfNecessary() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ShortcutAndWidgetContainer shortcutAndWidgetContainer = ((CellLayout) getChildAt(i)).mShortcutsAndWidgets;
            int childCount2 = shortcutAndWidgetContainer.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt = shortcutAndWidgetContainer.getChildAt(i2);
                if (childAt != null && (childAt.getTag() instanceof LauncherAppWidgetInfo)) {
                    LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) childAt.getTag();
                    LauncherAppWidgetHostView launcherAppWidgetHostView = (LauncherAppWidgetHostView) launcherAppWidgetInfo.hostView;
                    if (launcherAppWidgetHostView != null && launcherAppWidgetHostView.isReinflateRequired()) {
                        this.mLauncher.removeItem$ar$ds(launcherAppWidgetHostView, launcherAppWidgetInfo, false);
                        this.mLauncher.bindAppWidget(launcherAppWidgetInfo);
                    }
                }
            }
        }
    }

    public final void removeAllWorkspaceScreens() {
        setLayoutTransition((LayoutTransition) null);
        if (hasCustomContent()) {
            CellLayout screenWithId = getScreenWithId(-301);
            if (screenWithId != null) {
                this.mWorkspaceScreens.remove(-301);
                this.mScreenOrder.remove(-301L);
                removeView(screenWithId);
                this.mDefaultPage = this.mOriginalDefaultPage - 1;
                int i = this.mRestorePage;
                if (i != -1001) {
                    this.mRestorePage = i - 1;
                } else {
                    setCurrentPage(this.mCurrentPage - 1);
                }
            } else {
                throw new RuntimeException("Expected custom content screen to exist");
            }
        }
        removeAllViews();
        this.mScreenOrder.clear();
        this.mWorkspaceScreens.clear();
        setLayoutTransition(this.mLayoutTransition);
    }

    public final void removeExtraEmptyScreenDelayed(final boolean z, final Runnable runnable, int i, final boolean z2) {
        if (this.mLauncher.mWorkspaceLoading) {
            Launcher.addDumpLog$ar$ds("Launcher.Workspace", "    - workspace loading, skip", (Exception) null);
        } else if (i <= 0) {
            if (!hasExtraEmptyScreen() && this.mScreenOrder.size() != 0) {
                ArrayList arrayList = this.mScreenOrder;
                long longValue = ((Long) arrayList.get(arrayList.size() - 1)).longValue();
                if (longValue != -301) {
                    CellLayout cellLayout = (CellLayout) this.mWorkspaceScreens.get(longValue);
                    if (cellLayout.mShortcutsAndWidgets.getChildCount() == 0 && !cellLayout.mDropPending) {
                        this.mWorkspaceScreens.remove(longValue);
                        this.mScreenOrder.remove(Long.valueOf(longValue));
                        this.mWorkspaceScreens.put(-201, cellLayout);
                        this.mScreenOrder.add(-201L);
                        Launcher launcher = this.mLauncher;
                        launcher.mModel.updateWorkspaceScreenOrder(launcher, this.mScreenOrder);
                    }
                }
            }
            if (hasExtraEmptyScreen()) {
                if (getNextPage() == this.mScreenOrder.indexOf(-201L)) {
                    snapToPage(getNextPage() - 1, 400, false, (TimeInterpolator) null);
                    fadeAndRemoveEmptyScreen$ar$ds(400, runnable, z2);
                    return;
                }
                snapToPage(getNextPage(), 0, false, (TimeInterpolator) null);
                fadeAndRemoveEmptyScreen$ar$ds(0, runnable, z2);
                return;
            }
            if (z2) {
                stripEmptyScreens();
            }
            if (runnable != null) {
                runnable.run();
            }
        } else {
            postDelayed(new Runnable() {
                public final void run() {
                    Workspace.this.removeExtraEmptyScreenDelayed(z, runnable, 0, z2);
                }
            }, (long) i);
        }
    }

    public final void removeItemsByMatcher(final ItemInfoMatcher itemInfoMatcher) {
        ArrayList workspaceAndHotseatCellLayouts = getWorkspaceAndHotseatCellLayouts();
        int size = workspaceAndHotseatCellLayouts.size();
        for (int i = 0; i < size; i++) {
            CellLayout cellLayout = (CellLayout) workspaceAndHotseatCellLayouts.get(i);
            ShortcutAndWidgetContainer shortcutAndWidgetContainer = cellLayout.mShortcutsAndWidgets;
            final HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < shortcutAndWidgetContainer.getChildCount(); i2++) {
                View childAt = shortcutAndWidgetContainer.getChildAt(i2);
                hashMap.put((ItemInfo) childAt.getTag(), childAt);
            }
            final ArrayList arrayList = new ArrayList();
            final HashMap hashMap2 = new HashMap();
            LauncherModel.filterItemInfos(hashMap.keySet(), new LauncherModel.ItemInfoFilter() {
                public final boolean filterItem(ItemInfo itemInfo, ItemInfo itemInfo2, ComponentName componentName) {
                    ArrayList arrayList;
                    if (itemInfo instanceof FolderInfo) {
                        if (!ItemInfoMatcher.this.matches(itemInfo2, componentName)) {
                            return false;
                        }
                        if (hashMap2.containsKey(itemInfo)) {
                            arrayList = (ArrayList) hashMap2.get(itemInfo);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            hashMap2.put(itemInfo, arrayList2);
                            arrayList = arrayList2;
                        }
                        arrayList.add((ShortcutInfo) itemInfo2);
                        return true;
                    } else if (!ItemInfoMatcher.this.matches(itemInfo2, componentName)) {
                        return false;
                    } else {
                        arrayList.add((View) hashMap.get(itemInfo2));
                        return true;
                    }
                }
            });
            for (FolderInfo folderInfo : hashMap2.keySet()) {
                ArrayList arrayList2 = (ArrayList) hashMap2.get(folderInfo);
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    folderInfo.remove((ShortcutInfo) arrayList2.get(i3));
                }
            }
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                View view = (View) arrayList.get(i4);
                cellLayout.removeViewInLayout(view);
                if (view instanceof DropTarget) {
                    this.mDragController.mDropTargets.remove((DropTarget) view);
                }
            }
            if (arrayList.size() > 0) {
                shortcutAndWidgetContainer.requestLayout();
                shortcutAndWidgetContainer.invalidate();
            }
        }
        stripEmptyScreens();
    }

    public final void removeWorkspaceItem(View view) {
        CellLayout parentCellLayoutForView = getParentCellLayoutForView(view);
        if (parentCellLayoutForView != null) {
            parentCellLayoutForView.removeView(view);
        }
        if (view instanceof DropTarget) {
            this.mDragController.mDropTargets.remove((DropTarget) view);
        }
    }

    public final void resetTransitionTransform$ar$ds() {
        if (this.mIsSwitchingState) {
            setScaleX(this.mCurrentScale);
            setScaleY(this.mCurrentScale);
        }
    }

    public final void restoreInstanceStateForChild(int i) {
        if (this.mSavedStates != null) {
            this.mRestoredPages.add(Integer.valueOf(i));
            CellLayout cellLayout = (CellLayout) getChildAt(i);
            if (cellLayout != null) {
                try {
                    cellLayout.dispatchRestoreInstanceState(this.mSavedStates);
                } catch (IllegalArgumentException e) {
                    Log.e("CellLayout", "Ignoring an error while restoring a view instance state", e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void screenScrolled(int i) {
        float f;
        float f2;
        int i2;
        if (this.mWorkspaceFadeInAdjacentScreens && !workspaceInModalState() && !this.mIsSwitchingState) {
            for (int numCustomPages = numCustomPages(); numCustomPages < getChildCount(); numCustomPages++) {
                CellLayout cellLayout = (CellLayout) getChildAt(numCustomPages);
                if (cellLayout != null) {
                    int scrollForPage = i - (getScrollForPage(numCustomPages) + (this.mViewport.width() / 2));
                    int childCount = getChildCount();
                    int i3 = numCustomPages + 1;
                    if ((scrollForPage < 0 && !this.mIsRtl) || (scrollForPage > 0 && this.mIsRtl)) {
                        i3 = numCustomPages - 1;
                    }
                    if (i3 < 0 || i3 > childCount - 1) {
                        i2 = cellLayout.getMeasuredWidth() + this.mPageSpacing;
                    } else {
                        i2 = Math.abs(getScrollForPage(i3) - getScrollForPage(numCustomPages));
                    }
                    cellLayout.mShortcutsAndWidgets.setAlpha(1.0f - Math.abs(Math.max(Math.min(((float) scrollForPage) / ((float) i2), 1.0f), -1.0f)));
                }
            }
        }
        float f3 = 0.0f;
        if (hasCustomContent()) {
            int indexOf = this.mScreenOrder.indexOf(-301L);
            int scrollX = getScrollX();
            int scrollForPage2 = getScrollForPage(indexOf);
            int layoutTransitionOffsetForPage = getLayoutTransitionOffsetForPage(indexOf);
            float scrollForPage3 = (float) (getScrollForPage(indexOf + 1) - getScrollForPage(indexOf));
            float f4 = scrollForPage3 - ((float) ((scrollX - scrollForPage2) - layoutTransitionOffsetForPage));
            float f5 = f4 / scrollForPage3;
            if (this.mIsRtl) {
                f2 = Math.min(0.0f, f4);
            } else {
                f2 = Math.max(0.0f, f4);
            }
            f = Math.max(0.0f, f5);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        if (Float.compare(f, this.mLastCustomContentScrollProgress) != 0) {
            CellLayout cellLayout2 = (CellLayout) this.mWorkspaceScreens.get(-301);
            if (f > 0.0f && cellLayout2.getVisibility() != 0 && !workspaceInModalState()) {
                cellLayout2.setVisibility(0);
            }
            this.mLastCustomContentScrollProgress = f;
            if (this.mState == State.NORMAL) {
                DragLayer dragLayer = this.mLauncher.mDragLayer;
                if (f != 1.0f) {
                    f3 = 0.8f * f;
                }
                dragLayer.setBackgroundAlpha(f3);
            }
            Hotseat hotseat = this.mLauncher.mHotseat;
            if (hotseat != null) {
                hotseat.setTranslationX(f2);
            }
            PageIndicator pageIndicator = this.mPageIndicator;
            if (pageIndicator != null) {
                pageIndicator.setTranslationX(f2);
            }
        }
        enableHwLayersOnVisiblePages();
    }

    public final void scrollLeft() {
        if (!workspaceInModalState() && !this.mIsSwitchingState) {
            super.scrollLeft();
        }
        Folder openFolder = getOpenFolder();
        if (openFolder != null) {
            openFolder.completeDragExit();
        }
    }

    public final void scrollRight() {
        if (!workspaceInModalState() && !this.mIsSwitchingState) {
            super.scrollRight();
        }
        Folder openFolder = getOpenFolder();
        if (openFolder != null) {
            openFolder.completeDragExit();
        }
    }

    public final void scrollTo(int i, int i2) {
        this.mUnboundedScrollX = i;
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: package-private */
    public final void setCurrentDragOverlappingLayout(CellLayout cellLayout) {
        CellLayout cellLayout2 = this.mDragOverlappingLayout;
        if (cellLayout2 != null) {
            cellLayout2.setIsDragOverlapping(false);
        }
        this.mDragOverlappingLayout = cellLayout;
        if (cellLayout != null) {
            cellLayout.setIsDragOverlapping(true);
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public final void setCurrentDropLayout(CellLayout cellLayout) {
        CellLayout cellLayout2 = this.mDragTargetLayout;
        if (cellLayout2 != null) {
            cellLayout2.revertTempState();
            CellLayout cellLayout3 = this.mDragTargetLayout;
            if (cellLayout3.mDragging) {
                cellLayout3.mDragging = false;
            }
            int[] iArr = cellLayout3.mDragCell;
            iArr[1] = -1;
            iArr[0] = -1;
            cellLayout3.mDragOutlineAnims[cellLayout3.mDragOutlineCurrent].animate(2);
            int i = cellLayout3.mDragOutlineCurrent;
            int length = cellLayout3.mDragOutlineAnims.length;
            cellLayout3.mDragOutlineCurrent = (i + 1) & 3;
            cellLayout3.revertTempState();
            cellLayout3.setIsDragOverlapping(false);
        }
        this.mDragTargetLayout = cellLayout;
        if (cellLayout != null) {
            cellLayout.mDragging = true;
        }
        cleanupReorder(true);
        cleanupFolderCreation();
        setCurrentDropOverCell(-1, -1);
    }

    /* access modifiers changed from: package-private */
    public final void setCurrentDropOverCell(int i, int i2) {
        if (i != this.mDragOverX || i2 != this.mDragOverY) {
            this.mDragOverX = i;
            this.mDragOverY = i2;
            setDragMode(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setDragMode(int i) {
        if (i != this.mDragMode) {
            if (i == 0) {
                cleanupAddToFolder();
                cleanupReorder(false);
                cleanupFolderCreation();
            } else if (i == 2) {
                cleanupReorder(true);
                cleanupFolderCreation();
            } else if (i == 1) {
                cleanupAddToFolder();
                cleanupReorder(true);
            } else if (i == 3) {
                cleanupAddToFolder();
                cleanupFolderCreation();
            }
            this.mDragMode = i;
        }
    }

    public final void setFinalTransitionTransform$ar$ds() {
        if (this.mIsSwitchingState) {
            this.mCurrentScale = getScaleX();
            setScaleX(this.mStateTransitionAnimation.mNewScale);
            setScaleY(this.mStateTransitionAnimation.mNewScale);
        }
    }

    public final void setInsets(Rect rect) {
        this.mInsets.set(rect);
        CellLayout screenWithId = getScreenWithId(-301);
        if (screenWithId != null) {
            View childAt = screenWithId.mShortcutsAndWidgets.getChildAt(0);
            if (childAt instanceof Insettable) {
                ((Insettable) childAt).setInsets(this.mInsets);
            }
        }
        updatePadding();
    }

    /* access modifiers changed from: protected */
    public final void setWallpaperDimension() {
        new AsyncTask() {
            public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
                Void[] voidArr = (Void[]) objArr;
                SharedPreferences sharedPreferences = Workspace.this.mLauncher.getSharedPreferences("com.android.launcher3.WallpaperCropActivity", 4);
                Resources resources = Workspace.this.mLauncher.getResources();
                WindowManager windowManager = Workspace.this.mLauncher.getWindowManager();
                Workspace workspace = Workspace.this;
                WallpaperManager wallpaperManager = workspace.mWallpaperManager;
                C74629d dVar = workspace.mLauncher.mLauncherCallbacks$ar$class_merging;
                WallpaperUtils.suggestWallpaperDimension(resources, sharedPreferences, windowManager, wallpaperManager, dVar != null ? C90772bp.m148279F(dVar.f208805b) : true);
                return null;
            }
        }.executeOnExecutor(Utilities.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* access modifiers changed from: protected */
    public final boolean shouldDrawChild(View view) {
        CellLayout cellLayout = (CellLayout) view;
        if (super.shouldDrawChild(view)) {
            return this.mIsSwitchingState || cellLayout.mShortcutsAndWidgets.getAlpha() > 0.0f || cellLayout.getBackgroundAlpha() > 0.0f;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void snapToDestination() {
        if (isScrollingOverlay()) {
            int i = this.mIsRtl ? this.mMaxScrollX : 0;
            this.mWasInOverscroll = false;
            int scrollY = getScrollY();
            this.mUnboundedScrollX = i;
            super.scrollTo(i, scrollY);
            return;
        }
        super.snapToDestination();
    }

    public final void startDrag(CellLayout.CellInfo cellInfo, boolean z) {
        View view = cellInfo.cell;
        if (view.isInTouchMode()) {
            this.mDragInfo = cellInfo;
            view.setVisibility(4);
            ((CellLayout) view.getParent().getParent()).markCellsAsUnoccupiedForView(view);
            beginDragShared(view, this, z);
        }
    }

    public final void stripEmptyScreens() {
        if (this.mLauncher.mWorkspaceLoading) {
            Launcher.addDumpLog$ar$ds("Launcher.Workspace", "    - workspace loading, skip", (Exception) null);
        } else if (this.mIsPageMoving) {
            this.mStripScreensOnPageStopMoving = true;
        } else {
            int nextPage = getNextPage();
            ArrayList arrayList = new ArrayList();
            int size = this.mWorkspaceScreens.size();
            for (int i = 0; i < size; i++) {
                long keyAt = this.mWorkspaceScreens.keyAt(i);
                CellLayout cellLayout = (CellLayout) this.mWorkspaceScreens.valueAt(i);
                if (keyAt >= 0 && cellLayout.mShortcutsAndWidgets.getChildCount() == 0) {
                    arrayList.add(Long.valueOf(keyAt));
                }
            }
            LauncherAccessibilityDelegate launcherAccessibilityDelegate = LauncherAppState.getInstance().mAccessibilityDelegate;
            int numCustomPages = numCustomPages() + 1;
            int size2 = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                Long l = (Long) arrayList.get(i3);
                CellLayout cellLayout2 = (CellLayout) this.mWorkspaceScreens.get(l.longValue());
                this.mWorkspaceScreens.remove(l.longValue());
                this.mScreenOrder.remove(l);
                if (getChildCount() > numCustomPages) {
                    if (indexOfChild(cellLayout2) < nextPage) {
                        i2++;
                    }
                    if (launcherAccessibilityDelegate != null && launcherAccessibilityDelegate.isInAccessibleDrag()) {
                        cellLayout2.enableAccessibleDrag(false, 2);
                    }
                    removeView(cellLayout2);
                } else {
                    this.mRemoveEmptyScreenRunnable = null;
                    this.mWorkspaceScreens.put(-201, cellLayout2);
                    this.mScreenOrder.add(-201L);
                }
            }
            if (!arrayList.isEmpty()) {
                Launcher launcher = this.mLauncher;
                launcher.mModel.updateWorkspaceScreenOrder(launcher, this.mScreenOrder);
            }
            if (i2 >= 0) {
                setCurrentPage(nextPage - i2);
            }
        }
    }

    public final boolean supportsAppInfoDropTarget() {
        return false;
    }

    public final boolean supportsDeleteDropTarget() {
        return true;
    }

    public final boolean supportsFlingToDelete() {
        return true;
    }

    public final boolean transitionStateShouldAllowDrop() {
        if (!this.mIsSwitchingState || this.mTransitionProgress > 0.5f) {
            return this.mState == State.NORMAL || this.mState == State.SPRING_LOADED;
        }
        return false;
    }

    public final void updateAccessibilityFlags() {
        int i = 0;
        if (Utilities.ATLEAST_LOLLIPOP) {
            int childCount = getChildCount();
            for (int numCustomPages = numCustomPages(); numCustomPages < childCount; numCustomPages++) {
                CellLayout cellLayout = (CellLayout) getPageAt(numCustomPages);
                if (this.mState == State.OVERVIEW) {
                    cellLayout.setImportantForAccessibility(1);
                    cellLayout.mShortcutsAndWidgets.setImportantForAccessibility(4);
                    cellLayout.setContentDescription(getPageDescription(numCustomPages));
                    if (this.mPagesAccessibilityDelegate == null) {
                        this.mPagesAccessibilityDelegate = new OverviewScreenAccessibilityDelegate(this);
                    }
                    cellLayout.setAccessibilityDelegate(this.mPagesAccessibilityDelegate);
                } else {
                    int i2 = this.mState == State.NORMAL ? 0 : 4;
                    cellLayout.setImportantForAccessibility(2);
                    cellLayout.mShortcutsAndWidgets.setImportantForAccessibility(i2);
                    cellLayout.setContentDescription((CharSequence) null);
                    cellLayout.setAccessibilityDelegate((View.AccessibilityDelegate) null);
                }
            }
            if (!(this.mState == State.NORMAL || this.mState == State.OVERVIEW)) {
                i = 4;
            }
            setImportantForAccessibility(i);
            return;
        }
        if (this.mState != State.NORMAL) {
            i = 4;
        }
        setImportantForAccessibility(i);
    }

    /* access modifiers changed from: package-private */
    public final void updateChildrenLayersEnabled(boolean z) {
        boolean z2 = true;
        boolean z3 = this.mState == State.OVERVIEW || this.mIsSwitchingState;
        if (!z && !z3 && !this.mAnimatingViewIntoPlace && !this.mIsPageMoving) {
            z2 = false;
        }
        if (z2 != this.mChildrenLayersEnabled) {
            this.mChildrenLayersEnabled = z2;
            if (!z2) {
                for (int i = 0; i < getChildCount(); i++) {
                    ((CellLayout) getChildAt(i)).enableHardwareLayer(false);
                }
                return;
            }
            enableHwLayersOnVisiblePages();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean willAddToExistingUserFolder(Object obj, CellLayout cellLayout, int[] iArr, float f) {
        if (f > this.mMaxDistanceForFolderCreation) {
            return false;
        }
        return willAddToExistingUserFolder$ar$ds(obj, cellLayout.mShortcutsAndWidgets.getChildAt(iArr[0], iArr[1]));
    }

    /* access modifiers changed from: package-private */
    public final boolean willCreateUserFolder(ItemInfo itemInfo, View view, boolean z) {
        if (view != null) {
            CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.useTmpCoords && !(layoutParams.tmpCellX == layoutParams.cellX && layoutParams.tmpCellY == layoutParams.cellY)) {
                return false;
            }
        }
        CellLayout.CellInfo cellInfo = this.mDragInfo;
        boolean z2 = cellInfo != null && view == cellInfo.cell;
        if (view != null && !z2 && (!z || this.mCreateUserFolderOnDrop)) {
            boolean z3 = view.getTag() instanceof ShortcutInfo;
            int i = itemInfo.itemType;
            boolean z4 = i == 0 || i == 1 || i == 6;
            if (!z3 || !z4) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean willCreateUserFolder$ar$ds(ItemInfo itemInfo, CellLayout cellLayout, int[] iArr, float f) {
        if (f > this.mMaxDistanceForFolderCreation) {
            return false;
        }
        return willCreateUserFolder(itemInfo, cellLayout.mShortcutsAndWidgets.getChildAt(iArr[0], iArr[1]), true);
    }

    public final boolean workspaceInModalState() {
        return this.mState != State.NORMAL;
    }

    public Workspace(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTouchDownTime = -1;
        this.mCustomContentShowTime = -1;
        this.mWorkspaceScreens = new LongArrayMap();
        this.mScreenOrder = new ArrayList();
        this.mDeferRemoveExtraEmptyScreen = false;
        this.mAddNewPageOnDrag = true;
        this.mTargetCell = new int[2];
        this.mDragOverX = -1;
        this.mDragOverY = -1;
        this.mLastCustomContentScrollProgress = -1.0f;
        this.mCustomContentDescription = BuildConfig.FLAVOR;
        this.mDragTargetLayout = null;
        this.mDragOverlappingLayout = null;
        this.mDropToLayout = null;
        this.mTempCell = new int[2];
        this.mTempPt = new int[2];
        this.mDragViewVisualCenter = new float[2];
        this.mTempCellLayoutCenterCoordinates = new float[2];
        this.mTempInverseMatrix = new Matrix();
        this.mTempMatrix = new Matrix();
        this.mState = State.NORMAL;
        this.mIsSwitchingState = false;
        this.mAnimatingViewIntoPlace = false;
        this.mChildrenLayersEnabled = true;
        this.mStripScreensOnPageStopMoving = false;
        this.mInScrollArea = false;
        this.mDragOutline = null;
        this.mTempXY = new int[2];
        this.mTempVisiblePagesRange = new int[2];
        this.mLastSetWallpaperOffsetSteps = 0.0f;
        this.mDisplaySize = new Point();
        this.mFolderCreationAlarm = new Alarm();
        this.mReorderAlarm = new Alarm();
        this.mDragFolderRingAnimator = null;
        this.mDragOverFolderIcon = null;
        this.mCreateUserFolderOnDrop = false;
        this.mAddToExistingFolderOnDrop = false;
        this.mCanvas = new Canvas();
        this.mDragMode = 0;
        this.mLastReorderX = -1;
        this.mLastReorderY = -1;
        this.mRestoredPages = new ArrayList();
        this.mLastOverlaySroll = 0.0f;
        this.mBindPages = new Runnable() {
            public final void run() {
                Runnable[] runnableArr;
                LauncherModel launcherModel = Workspace.this.mLauncher.mModel;
                if (!LauncherModel.mDeferredBindRunnables.isEmpty()) {
                    synchronized (LauncherModel.mDeferredBindRunnables) {
                        ArrayList arrayList = LauncherModel.mDeferredBindRunnables;
                        runnableArr = (Runnable[]) arrayList.toArray(new Runnable[arrayList.size()]);
                        LauncherModel.mDeferredBindRunnables.clear();
                    }
                    for (Runnable post : runnableArr) {
                        launcherModel.mHandler.post(post);
                    }
                }
            }
        };
        this.mAlphaInterpolator = new DecelerateInterpolator(3.0f);
        this.mOutlineHelper = HolographicOutlineHelper.obtain(context);
        this.mLauncher = Launcher.getLauncher(context);
        this.mStateTransitionAnimation = new WorkspaceStateTransitionAnimation(this.mLauncher, this);
        Resources resources = getResources();
        this.mWorkspaceFadeInAdjacentScreens = this.mLauncher.mDeviceProfile.shouldFadeAdjacentWorkspaceScreens();
        this.mWallpaperManager = WallpaperManager.getInstance(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Workspace, i, 0);
        this.mSpringLoadedShrinkFactor = ((float) resources.getInteger(R.integer.config_workspaceSpringLoadShrinkPercentage)) / 100.0f;
        this.mOverviewModeShrinkFactor = ((float) resources.getInteger(R.integer.config_workspaceOverviewShrinkPercentage)) / 100.0f;
        int i2 = obtainStyledAttributes.getInt(2, 1);
        this.mDefaultPage = i2;
        this.mOriginalDefaultPage = i2;
        obtainStyledAttributes.recycle();
        setOnHierarchyChangeListener(this);
        setHapticFeedbackEnabled(false);
        this.mCurrentPage = this.mDefaultPage;
        LauncherAppState instance = LauncherAppState.getInstance();
        DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
        this.mIconCache = instance.mIconCache;
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        setChildrenDrawnWithCacheEnabled(true);
        this.mMinScale = this.mOverviewModeShrinkFactor;
        this.mUseMinScale = true;
        requestLayout();
        LayoutTransition layoutTransition = new LayoutTransition();
        this.mLayoutTransition = layoutTransition;
        layoutTransition.enableTransitionType(3);
        this.mLayoutTransition.enableTransitionType(1);
        this.mLayoutTransition.disableTransitionType(2);
        this.mLayoutTransition.disableTransitionType(0);
        setLayoutTransition(this.mLayoutTransition);
        this.mWallpaperOffset = new WallpaperOffsetInterpolator();
        this.mLauncher.getWindowManager().getDefaultDisplay().getSize(this.mDisplaySize);
        this.mMaxDistanceForFolderCreation = ((float) deviceProfile.iconSizePx) * 0.55f;
        setWallpaperDimension();
        setEdgeGlowColor(getResources().getColor(R.color.workspace_edge_effect_color));
        setMotionEventSplittingEnabled(true);
    }

    public final void onDropCompleted(View view, DropTarget.DragObject dragObject, boolean z, boolean z2) {
        View view2;
        CellLayout cellLayout;
        CellLayout.CellInfo cellInfo;
        if (this.mDeferDropAfterUninstall) {
            final View view3 = view;
            final DropTarget.DragObject dragObject2 = dragObject;
            final boolean z3 = z;
            final boolean z4 = z2;
            this.mDeferredAction = new Runnable() {
                public final void run() {
                    Workspace.this.onDropCompleted(view3, dragObject2, z3, z4);
                    Workspace.this.mDeferredAction = null;
                }
            };
            return;
        }
        boolean z5 = this.mDeferredAction != null;
        if (!z2 || (z5 && !this.mUninstallSuccessful)) {
            CellLayout.CellInfo cellInfo2 = this.mDragInfo;
            if (!(cellInfo2 == null || (cellLayout = this.mLauncher.getCellLayout(cellInfo2.container, cellInfo2.screenId)) == null)) {
                cellLayout.onDropChild(this.mDragInfo.cell);
            }
        } else if (!(view == this || (cellInfo = this.mDragInfo) == null)) {
            removeWorkspaceItem(cellInfo.cell);
        }
        if ((dragObject.cancelled || (z5 && !this.mUninstallSuccessful)) && (view2 = this.mDragInfo.cell) != null) {
            view2.setVisibility(0);
        }
        this.mDragOutline = null;
        this.mDragInfo = null;
    }

    public final DragView beginDragShared(View view, DragSource dragSource, boolean z, ItemInfo itemInfo, DragPreviewProvider dragPreviewProvider) {
        Rect rect;
        Point point;
        View view2 = view;
        DragPreviewProvider dragPreviewProvider2 = dragPreviewProvider;
        view.clearFocus();
        view2.setPressed(false);
        this.mDragOutline = dragPreviewProvider2.createDragOutline(this.mCanvas);
        Launcher launcher = this.mLauncher;
        if (launcher.mWorkspace.isOnOrMovingToCustomContent()) {
            Workspace workspace = launcher.mWorkspace;
            workspace.moveToScreen(workspace.mDefaultPage, false);
        }
        C74629d dVar = launcher.mLauncherCallbacks$ar$class_merging;
        Bitmap createDragBitmap = dragPreviewProvider2.createDragBitmap(this.mCanvas);
        int i = dragPreviewProvider2.previewPadding / 2;
        float scaleAndPosition = dragPreviewProvider2.getScaleAndPosition(createDragBitmap, this.mTempXY);
        int[] iArr = this.mTempXY;
        int i2 = iArr[0];
        int i3 = iArr[1];
        DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
        boolean z2 = view2 instanceof BubbleTextView;
        if (z2) {
            int i4 = deviceProfile.iconSizePx;
            int paddingTop = view.getPaddingTop();
            int width = (createDragBitmap.getWidth() - i4) / 2;
            i3 += paddingTop;
            point = new Point(-i, i);
            rect = new Rect(width, paddingTop, width + i4, i4 + paddingTop);
        } else if (view2 instanceof FolderIcon) {
            int i5 = deviceProfile.folderIconSizePx;
            Point point2 = new Point(-i, i - view.getPaddingTop());
            rect = new Rect(0, view.getPaddingTop(), view.getWidth(), i5);
            point = point2;
        } else {
            point = null;
            rect = null;
        }
        if (z2) {
            BubbleTextView bubbleTextView = (BubbleTextView) view2;
            bubbleTextView.setPressed(false);
            bubbleTextView.setStayPressed(false);
        }
        if (view.getParent() instanceof ShortcutAndWidgetContainer) {
            this.mDragSourceInternal = (ShortcutAndWidgetContainer) view.getParent();
        }
        DragView startDrag$ar$ds = this.mDragController.startDrag$ar$ds(createDragBitmap, i2, i3, dragSource, itemInfo, point, rect, scaleAndPosition, z);
        startDrag$ar$ds.mIntrinsicIconScale = dragSource.getIntrinsicIconScaleFactor();
        createDragBitmap.recycle();
        return startDrag$ar$ds;
    }

    /* access modifiers changed from: protected */
    public final void determineScrollingStart(MotionEvent motionEvent, float f) {
        if (!this.mIsSwitchingState) {
            super.determineScrollingStart(motionEvent, 1.0f);
        }
    }
}
