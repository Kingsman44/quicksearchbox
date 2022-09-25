package android.support.p033v7.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p033v7.p037c.C0408a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.p094f.C1901n;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2044bj;
import androidx.core.p098j.C2050bp;
import androidx.core.p098j.C2110y;
import androidx.core.p098j.C2111z;
import androidx.core.p098j.p099a.C1982b;
import androidx.core.widget.C2123j;
import androidx.customview.p102a.C2140a;
import androidx.customview.view.AbsSavedState;
import com.evernote.android.state.BuildConfig;
import com.facebook.litho.widget.C6496da;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.RecyclerView */
/* compiled from: PG */
public class RecyclerView extends ViewGroup implements C2110y {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final float DECELERATION_RATE = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    private static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final C0671gf sDefaultEdgeEffectFactory = new C0671gf();
    static final Interpolator sQuinticInterpolator = new C0635ex();
    C0675gj mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public C0640fb mAdapter;
    C0777w mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    public EdgeEffect mBottomGlow;
    public C6496da mChildDrawingOrderCallback$ar$class_merging;
    C0550bt mChildHelper;
    public boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C0643fe mEdgeEffectFactory;
    boolean mFirstLayoutComplete;
    C0591dg mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private C0657fs mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public C0646fh mItemAnimator;
    private C0647fi mItemAnimatorListener$ar$class_merging;
    private Runnable mItemAnimatorRunner;
    public final ArrayList mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    public C0653fo mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    public EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    public final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C0663fy mObserver;
    public List mOnChildAttachStateListeners;
    public C0656fr mOnFlingListener;
    public final ArrayList mOnItemTouchListeners;
    final List mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    C0589de mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final C0661fw mRecycler;
    final List mRecyclerListeners;
    final int[] mReusableIntPair;
    public EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    public C0658ft mScrollListener;
    private List mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    public int mScrollState;
    private C2111z mScrollingChildHelper;
    final C0670ge mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    public EdgeEffect mTopGlow;
    public int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final C0672gg mViewFlinger;
    private final C0636ey mViewInfoProcessCallback$ar$class_merging;
    final C0756jj mViewInfoStore;

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(C0673gh ghVar) {
        WeakReference weakReference = ghVar.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != ghVar.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            ghVar.mNestedRecyclerView = null;
        }
    }

    public static final int consumeFlingInStretch$ar$ds(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && C2123j.m5886a(edgeEffect) != 0.0f) {
            int round = Math.round((((float) (-i2)) / 4.0f) * C2123j.m5887b(edgeEffect, (((float) (-i)) * 4.0f) / ((float) i2), 0.5f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        } else if (i >= 0 || edgeEffect2 == null || C2123j.m5886a(edgeEffect2) == 0.0f) {
            return i;
        } else {
            float f = (float) i2;
            int round2 = Math.round((f / 4.0f) * C2123j.m5887b(edgeEffect2, (((float) i) * 4.0f) / f, 0.5f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        }
    }

    private final void createLayoutManager$ar$ds(Context context, String str, AttributeSet attributeSet, int i) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = String.valueOf(context.getPackageName()).concat(String.valueOf(trim));
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(C0653fo.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0653fo) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e7);
                }
            }
        }
    }

    private final void dispatchLayoutStep1() {
        C0755ji jiVar;
        int i;
        this.mState.mo3054c(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f2464i = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.mo3267e();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        C0673gh ghVar = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            ghVar = findContainingViewHolder(focusedChild);
        }
        if (ghVar == null) {
            resetFocusInfo();
        } else {
            C0670ge geVar = this.mState;
            geVar.f2468m = this.mAdapter.mHasStableIds ? ghVar.mItemId : -1;
            if (this.mDataSetHasChangedAfterLayout) {
                i = -1;
            } else {
                i = ghVar.isRemoved() ? ghVar.mOldPosition : ghVar.getAbsoluteAdapterPosition();
            }
            geVar.f2467l = i;
            C0670ge geVar2 = this.mState;
            View view = ghVar.itemView;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            geVar2.f2469n = id;
        }
        C0670ge geVar3 = this.mState;
        geVar3.f2463h = geVar3.f2465j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        geVar3.f2462g = geVar3.f2466k;
        geVar3.f2460e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f2465j) {
            int a = this.mChildHelper.mo2601a();
            for (int i2 = 0; i2 < a; i2++) {
                C0673gh childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo2604d(i2));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.mHasStableIds)) {
                    C0646fh fhVar = this.mItemAnimator;
                    C0646fh.m2290w(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    this.mViewInfoStore.mo3266d(childViewHolderInt, fhVar.mo2898v(childViewHolderInt));
                    if (this.mState.f2463h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f2643b.mo3682i(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f2466k) {
            int b = this.mChildHelper.mo2602b();
            for (int i3 = 0; i3 < b; i3++) {
                C0673gh childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.mo2605e(i3));
                if (!childViewHolderInt2.shouldIgnore() && childViewHolderInt2.mOldPosition == -1) {
                    childViewHolderInt2.mOldPosition = childViewHolderInt2.mPosition;
                }
            }
            C0670ge geVar4 = this.mState;
            boolean z = geVar4.f2461f;
            geVar4.f2461f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, geVar4);
            this.mState.f2461f = z;
            for (int i4 = 0; i4 < this.mChildHelper.mo2601a(); i4++) {
                C0673gh childViewHolderInt3 = getChildViewHolderInt(this.mChildHelper.mo2604d(i4));
                if (!childViewHolderInt3.shouldIgnore() && ((jiVar = (C0755ji) this.mViewInfoStore.f2642a.get(childViewHolderInt3)) == null || (jiVar.f2639b & 4) == 0)) {
                    C0646fh.m2290w(childViewHolderInt3);
                    boolean hasAnyOfTheFlags = childViewHolderInt3.hasAnyOfTheFlags(8192);
                    C0646fh fhVar2 = this.mItemAnimator;
                    childViewHolderInt3.getUnmodifiedPayloads();
                    C0645fg v = fhVar2.mo2898v(childViewHolderInt3);
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt3, v);
                    } else {
                        C0756jj jjVar = this.mViewInfoStore;
                        C0755ji jiVar2 = (C0755ji) jjVar.f2642a.get(childViewHolderInt3);
                        if (jiVar2 == null) {
                            jiVar2 = C0755ji.m2546a();
                            jjVar.f2642a.put(childViewHolderInt3, jiVar2);
                        }
                        jiVar2.f2639b |= 2;
                        jiVar2.f2640c = v;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
        this.mState.f2459d = 2;
    }

    private final void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.mo3054c(6);
        this.mAdapterHelper.mo3287d();
        this.mState.f2460e = this.mAdapter.getItemCount();
        this.mState.f2458c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f1831a;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C0670ge geVar = this.mState;
        geVar.f2462g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, geVar);
        C0670ge geVar2 = this.mState;
        geVar2.f2461f = false;
        geVar2.f2465j = geVar2.f2465j && this.mItemAnimator != null;
        geVar2.f2459d = 4;
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
    }

    private final boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < size) {
            C0657fs fsVar = (C0657fs) this.mOnItemTouchListeners.get(i);
            if (!fsVar.onInterceptTouchEvent(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.mInterceptingOnItemTouchListener = fsVar;
                return true;
            }
        }
        return false;
    }

    private final void findMinMaxChildLayoutPositions(int[] iArr) {
        int a = this.mChildHelper.mo2601a();
        if (a != 0) {
            int i = Integer.MAX_VALUE;
            int i2 = LinearLayoutManager.INVALID_OFFSET;
            for (int i3 = 0; i3 < a; i3++) {
                C0673gh childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo2604d(i3));
                if (!childViewHolderInt.shouldIgnore()) {
                    int layoutPosition = childViewHolderInt.getLayoutPosition();
                    if (layoutPosition < i) {
                        i = layoutPosition;
                    }
                    if (layoutPosition > i2) {
                        i2 = layoutPosition;
                    }
                }
            }
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    static C0673gh getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C0654fp) view.getLayoutParams()).f2420c;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C0654fp fpVar = (C0654fp) view.getLayoutParams();
        Rect rect2 = fpVar.f2421d;
        rect.set((view.getLeft() - rect2.left) - fpVar.leftMargin, (view.getTop() - rect2.top) - fpVar.topMargin, view.getRight() + rect2.right + fpVar.rightMargin, view.getBottom() + rect2.bottom + fpVar.bottomMargin);
    }

    static final long getNanoTime$ar$ds() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    private final void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private final boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private final void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.mo3292i();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.mo3289f();
        } else {
            this.mAdapterHelper.mo3287d();
        }
        boolean z2 = true;
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        C0670ge geVar = this.mState;
        boolean z4 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.mHasStableIds);
        geVar.f2465j = z4;
        if (!z4 || !z3 || this.mDataSetHasChangedAfterLayout || !predictiveItemAnimationsEnabled()) {
            z2 = false;
        }
        geVar.f2466k = z2;
    }

    private final int releaseHorizontalGlow(int i, float f) {
        float height = f / ((float) getHeight());
        float width = ((float) i) / ((float) getWidth());
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || C2123j.m5886a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (!(edgeEffect2 == null || C2123j.m5886a(edgeEffect2) == 0.0f)) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float b = C2123j.m5887b(this.mRightGlow, width, height);
                    if (C2123j.m5886a(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = b;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f3 = -C2123j.m5887b(this.mLeftGlow, -width, 1.0f - height);
                if (C2123j.m5886a(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * ((float) getWidth()));
    }

    private final int releaseVerticalGlow(int i, float f) {
        float width = f / ((float) getWidth());
        float height = ((float) i) / ((float) getHeight());
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || C2123j.m5886a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (!(edgeEffect2 == null || C2123j.m5886a(edgeEffect2) == 0.0f)) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float b = C2123j.m5887b(this.mBottomGlow, height, 1.0f - width);
                    if (C2123j.m5886a(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = b;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f3 = -C2123j.m5887b(this.mTopGlow, -height, width);
                if (C2123j.m5886a(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * ((float) getHeight()));
    }

    private final void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0654fp) {
            C0654fp fpVar = (C0654fp) layoutParams;
            if (!fpVar.f2422e) {
                Rect rect = fpVar.f2421d;
                this.mTempRect.left -= rect.left;
                this.mTempRect.right += rect.right;
                this.mTempRect.top -= rect.top;
                this.mTempRect.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        } else {
            view2 = null;
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private final void resetFocusInfo() {
        C0670ge geVar = this.mState;
        geVar.f2468m = -1;
        geVar.f2467l = -1;
        geVar.f2469n = -1;
    }

    private final void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        getScrollingChildHelper().mo5280b(0);
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C2043bi.m5519M(this);
        }
    }

    private final void setAdapterInternal(C0640fb fbVar, boolean z, boolean z2) {
        C0640fb fbVar2 = this.mAdapter;
        if (fbVar2 != null) {
            fbVar2.mObservable.unregisterObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.mo3292i();
        C0640fb fbVar3 = this.mAdapter;
        this.mAdapter = fbVar;
        if (fbVar != null) {
            fbVar.mObservable.registerObserver(this.mObserver);
            fbVar.onAttachedToRecyclerView(this);
        }
        C0653fo foVar = this.mLayout;
        if (foVar != null) {
            foVar.onAdapterChanged(fbVar3, this.mAdapter);
        }
        C0661fw fwVar = this.mRecycler;
        C0640fb fbVar4 = this.mAdapter;
        fwVar.mo3027d();
        fwVar.mo3029f(fbVar3, true);
        C0660fv b = fwVar.mo3025b();
        if (fbVar3 != null) {
            b.mo3021f();
        }
        if (!z && b.f2429b == 0) {
            b.mo3020e();
        }
        if (fbVar4 != null) {
            b.mo3019d();
        }
        fwVar.mo3028e();
        this.mState.f2461f = true;
    }

    private final boolean shouldAbsorb(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float a = C2123j.m5886a(edgeEffect);
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / (this.mPhysicalCoef * 0.015f)));
        double d = (double) DECELERATION_RATE;
        double d2 = (double) (this.mPhysicalCoef * 0.015f);
        Double.isNaN(d);
        Double.isNaN(d);
        double exp = Math.exp((d / (-1.0d + d)) * log);
        Double.isNaN(d2);
        if (((float) (d2 * exp)) < a * ((float) i2)) {
            return true;
        }
        return false;
    }

    private final void stopScrollersInternal() {
        this.mViewFlinger.mo3060d();
        C0653fo foVar = this.mLayout;
        if (foVar != null) {
            foVar.stopSmoothScroller();
        }
    }

    public final void addAnimatingView(C0673gh ghVar) {
        View view = ghVar.itemView;
        ViewParent parent = view.getParent();
        this.mRecycler.mo3037n(getChildViewHolder(view));
        if (ghVar.isTmpDetached()) {
            this.mChildHelper.mo2607g(view, -1, view.getLayoutParams(), true);
        } else if (parent != this) {
            this.mChildHelper.mo2606f(view, -1, true);
        } else {
            C0550bt btVar = this.mChildHelper;
            int indexOfChild = btVar.f2143c.f2402a.indexOfChild(view);
            if (indexOfChild >= 0) {
                btVar.f2141a.mo2597e(indexOfChild);
                btVar.mo2609i(view);
                return;
            }
            new StringBuilder("view is not a child, cannot hide ").append(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C0653fo foVar = this.mLayout;
        if (foVar == null || !foVar.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public final void addItemDecoration$ar$ds(C0648fj fjVar) {
        C0653fo foVar = this.mLayout;
        if (foVar != null) {
            foVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        this.mItemDecorations.add(fjVar);
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public final void addOnChildAttachStateChangeListener(C0655fq fqVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(fqVar);
    }

    public final void addOnScrollListener(C0658ft ftVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(ftVar);
    }

    /* access modifiers changed from: package-private */
    public final void animateAppearance(C0673gh ghVar, C0645fg fgVar, C0645fg fgVar2) {
        ghVar.setIsRecyclable(false);
        if (this.mItemAnimator.mo2891o(ghVar, fgVar, fgVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public final void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(exceptionLabel()));
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR.concat(exceptionLabel())));
        }
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0654fp) && this.mLayout.checkLayoutParams((C0654fp) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final void clearOldPositions() {
        int b = this.mChildHelper.mo2602b();
        for (int i = 0; i < b; i++) {
            C0673gh childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo2605e(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        C0661fw fwVar = this.mRecycler;
        int size = fwVar.f2433c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0673gh) fwVar.f2433c.get(i2)).clearOldPosition();
        }
        int size2 = fwVar.f2431a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((C0673gh) fwVar.f2431a.get(i3)).clearOldPosition();
        }
        ArrayList arrayList = fwVar.f2432b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((C0673gh) fwVar.f2432b.get(i4)).clearOldPosition();
            }
        }
    }

    public final void clearOnScrollListeners() {
        List list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public final int computeHorizontalScrollExtent() {
        C0653fo foVar = this.mLayout;
        if (foVar != null && foVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        C0653fo foVar = this.mLayout;
        if (foVar != null && foVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        C0653fo foVar = this.mLayout;
        if (foVar != null && foVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        C0653fo foVar = this.mLayout;
        if (foVar != null && foVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        C0653fo foVar = this.mLayout;
        if (foVar != null && foVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        C0653fo foVar = this.mLayout;
        if (foVar != null && foVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final void considerReleasingGlowsOnScroll(int i, int i2) {
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C2043bi.m5519M(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C1901n.m5168a("RV FullInvalidate");
            dispatchLayout();
            C1901n.m5169b();
        } else if (this.mAdapterHelper.mo3294k()) {
            if (this.mAdapterHelper.mo3293j(4) && !this.mAdapterHelper.mo3293j(11)) {
                C1901n.m5168a("RV PartialInvalidate");
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.mo3289f();
                if (!this.mLayoutWasDefered) {
                    int a = this.mChildHelper.mo2601a();
                    int i = 0;
                    while (true) {
                        if (i < a) {
                            C0673gh childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo2604d(i));
                            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                                dispatchLayout();
                                break;
                            }
                            i++;
                        } else {
                            this.mAdapterHelper.mo3286c();
                            break;
                        }
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll(true);
                C1901n.m5169b();
            } else if (this.mAdapterHelper.mo3294k()) {
                C1901n.m5168a("RV FullInvalidate");
                dispatchLayout();
                C1901n.m5169b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(C0653fo.chooseSize(i, getPaddingLeft() + getPaddingRight(), C2043bi.m5580i(this)), C0653fo.chooseSize(i2, getPaddingTop() + getPaddingBottom(), C2043bi.m5579h(this)));
    }

    /* access modifiers changed from: package-private */
    public final void dispatchChildDetached(View view) {
        C0673gh childViewHolderInt = getChildViewHolderInt(view);
        C0640fb fbVar = this.mAdapter;
        if (!(fbVar == null || childViewHolderInt == null)) {
            fbVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C0655fq) this.mOnChildAttachStateListeners.get(size)).mo2458b(view);
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02e6, code lost:
        if (r0.mChildHelper.mo2611k(getFocusedChild()) != false) goto L_0x02e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchLayout() {
        /*
            r17 = this;
            r0 = r17
            android.support.v7.widget.fb r1 = r0.mAdapter
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.w(r2, r1)
            return
        L_0x000e:
            android.support.v7.widget.fo r1 = r0.mLayout
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x0018:
            android.support.v7.widget.ge r1 = r0.mState
            r3 = 0
            r1.f2464i = r3
            boolean r1 = r0.mLastAutoMeasureSkippedDueToExact
            r4 = 1
            if (r1 == 0) goto L_0x0034
            int r1 = r0.mLastAutoMeasureNonExactMeasuredWidth
            int r5 = r17.getWidth()
            if (r1 != r5) goto L_0x0032
            int r1 = r0.mLastAutoMeasureNonExactMeasuredHeight
            int r5 = r17.getHeight()
            if (r1 == r5) goto L_0x0034
        L_0x0032:
            r1 = 1
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            r0.mLastAutoMeasureNonExactMeasuredWidth = r3
            r0.mLastAutoMeasureNonExactMeasuredHeight = r3
            r0.mLastAutoMeasureSkippedDueToExact = r3
            android.support.v7.widget.ge r5 = r0.mState
            int r5 = r5.f2459d
            if (r5 != r4) goto L_0x004d
            r17.dispatchLayoutStep1()
            android.support.v7.widget.fo r1 = r0.mLayout
            r1.setExactMeasureSpecsFrom(r0)
            r17.dispatchLayoutStep2()
            goto L_0x0088
        L_0x004d:
            android.support.v7.widget.w r5 = r0.mAdapterHelper
            java.util.ArrayList r6 = r5.f2673b
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0060
            java.util.ArrayList r5 = r5.f2672a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0060
            goto L_0x0080
        L_0x0060:
            if (r1 != 0) goto L_0x0080
            android.support.v7.widget.fo r1 = r0.mLayout
            int r1 = r1.getWidth()
            int r5 = r17.getWidth()
            if (r1 != r5) goto L_0x0080
            android.support.v7.widget.fo r1 = r0.mLayout
            int r1 = r1.getHeight()
            int r5 = r17.getHeight()
            if (r1 != r5) goto L_0x0080
            android.support.v7.widget.fo r1 = r0.mLayout
            r1.setExactMeasureSpecsFrom(r0)
            goto L_0x0088
        L_0x0080:
            android.support.v7.widget.fo r1 = r0.mLayout
            r1.setExactMeasureSpecsFrom(r0)
            r17.dispatchLayoutStep2()
        L_0x0088:
            android.support.v7.widget.ge r1 = r0.mState
            r5 = 4
            r1.mo3054c(r5)
            r17.startInterceptRequestLayout()
            r17.onEnterLayoutOrScroll()
            android.support.v7.widget.ge r1 = r0.mState
            r1.f2459d = r4
            boolean r1 = r1.f2465j
            r6 = 0
            r7 = -1
            if (r1 == 0) goto L_0x0259
            android.support.v7.widget.bt r1 = r0.mChildHelper
            int r1 = r1.mo2601a()
            int r1 = r1 + r7
        L_0x00a5:
            if (r1 < 0) goto L_0x01c3
            android.support.v7.widget.bt r8 = r0.mChildHelper
            android.view.View r8 = r8.mo2604d(r1)
            android.support.v7.widget.gh r8 = getChildViewHolderInt(r8)
            boolean r9 = r8.shouldIgnore()
            if (r9 == 0) goto L_0x00b9
            goto L_0x01be
        L_0x00b9:
            long r9 = r0.getChangedHolderKey(r8)
            android.support.v7.widget.fh r11 = r0.mItemAnimator
            android.support.v7.widget.fg r11 = r11.mo2897u(r8)
            android.support.v7.widget.jj r12 = r0.mViewInfoStore
            androidx.c.k r12 = r12.f2643b
            java.lang.Object r12 = r12.mo3678e(r9)
            android.support.v7.widget.gh r12 = (android.support.p033v7.widget.C0673gh) r12
            if (r12 == 0) goto L_0x01b9
            boolean r13 = r12.shouldIgnore()
            if (r13 != 0) goto L_0x01b9
            android.support.v7.widget.jj r13 = r0.mViewInfoStore
            boolean r13 = r13.mo3270h(r12)
            android.support.v7.widget.jj r14 = r0.mViewInfoStore
            boolean r14 = r14.mo3270h(r8)
            if (r13 == 0) goto L_0x00ec
            if (r12 != r8) goto L_0x00ec
            android.support.v7.widget.jj r9 = r0.mViewInfoStore
            r9.mo3265c(r8, r11)
            goto L_0x01be
        L_0x00ec:
            android.support.v7.widget.jj r15 = r0.mViewInfoStore
            android.support.v7.widget.fg r15 = r15.mo3263a(r12, r5)
            android.support.v7.widget.jj r5 = r0.mViewInfoStore
            r5.mo3265c(r8, r11)
            android.support.v7.widget.jj r5 = r0.mViewInfoStore
            r11 = 8
            android.support.v7.widget.fg r5 = r5.mo3263a(r8, r11)
            if (r15 != 0) goto L_0x018f
            android.support.v7.widget.bt r5 = r0.mChildHelper
            int r5 = r5.mo2601a()
            r11 = 0
        L_0x0108:
            if (r11 >= r5) goto L_0x016e
            android.support.v7.widget.bt r13 = r0.mChildHelper
            android.view.View r13 = r13.mo2604d(r11)
            android.support.v7.widget.gh r13 = getChildViewHolderInt(r13)
            if (r13 != r8) goto L_0x0117
            goto L_0x016b
        L_0x0117:
            long r14 = r0.getChangedHolderKey(r13)
            int r16 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r16 != 0) goto L_0x016b
            android.support.v7.widget.fb r1 = r0.mAdapter
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x014a
            boolean r1 = r1.mHasStableIds
            if (r1 == 0) goto L_0x014a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r17.exceptionLabel()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x014a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r17.exceptionLabel()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x016b:
            int r11 = r11 + 1
            goto L_0x0108
        L_0x016e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r5.<init>(r9)
            r5.append(r12)
            java.lang.String r9 = " cannot be found but it is necessary for "
            r5.append(r9)
            r5.append(r8)
            java.lang.String r8 = r17.exceptionLabel()
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            goto L_0x01be
        L_0x018f:
            r12.setIsRecyclable(r3)
            if (r13 == 0) goto L_0x0197
            r0.addAnimatingView(r12)
        L_0x0197:
            if (r12 == r8) goto L_0x01ad
            if (r14 == 0) goto L_0x019e
            r0.addAnimatingView(r8)
        L_0x019e:
            r12.mShadowedHolder = r8
            r0.addAnimatingView(r12)
            android.support.v7.widget.fw r9 = r0.mRecycler
            r9.mo3037n(r12)
            r8.setIsRecyclable(r3)
            r8.mShadowingHolder = r12
        L_0x01ad:
            android.support.v7.widget.fh r9 = r0.mItemAnimator
            boolean r5 = r9.mo2892p(r12, r8, r15, r5)
            if (r5 == 0) goto L_0x01be
            r17.postAnimationRunner()
            goto L_0x01be
        L_0x01b9:
            android.support.v7.widget.jj r5 = r0.mViewInfoStore
            r5.mo3265c(r8, r11)
        L_0x01be:
            int r1 = r1 + -1
            r5 = 4
            goto L_0x00a5
        L_0x01c3:
            android.support.v7.widget.jj r1 = r0.mViewInfoStore
            android.support.v7.widget.ey r2 = r0.mViewInfoProcessCallback$ar$class_merging
            androidx.c.n r5 = r1.f2642a
            int r5 = r5.f3122d
            int r5 = r5 + r7
        L_0x01cc:
            if (r5 < 0) goto L_0x0259
            androidx.c.n r8 = r1.f2642a
            java.lang.Object r8 = r8.mo3702e(r5)
            android.support.v7.widget.gh r8 = (android.support.p033v7.widget.C0673gh) r8
            androidx.c.n r9 = r1.f2642a
            java.lang.Object r9 = r9.mo3704f(r5)
            android.support.v7.widget.ji r9 = (android.support.p033v7.widget.C0755ji) r9
            int r10 = r9.f2639b
            r11 = r10 & 3
            r12 = 3
            if (r11 != r12) goto L_0x01ea
            r2.mo2861b(r8)
            goto L_0x0252
        L_0x01ea:
            r11 = r10 & 1
            if (r11 == 0) goto L_0x01fc
            android.support.v7.widget.fg r10 = r9.f2640c
            if (r10 != 0) goto L_0x01f6
            r2.mo2861b(r8)
            goto L_0x0252
        L_0x01f6:
            android.support.v7.widget.fg r11 = r9.f2641d
            r2.mo2860a(r8, r10, r11)
            goto L_0x0252
        L_0x01fc:
            r11 = r10 & 14
            r12 = 14
            if (r11 != r12) goto L_0x020c
            android.support.v7.widget.fg r10 = r9.f2640c
            android.support.v7.widget.fg r11 = r9.f2641d
            android.support.v7.widget.RecyclerView r12 = r2.f2401a
            r12.animateAppearance(r8, r10, r11)
            goto L_0x0252
        L_0x020c:
            r11 = r10 & 12
            r12 = 12
            if (r11 != r12) goto L_0x023b
            android.support.v7.widget.fg r10 = r9.f2640c
            android.support.v7.widget.fg r11 = r9.f2641d
            r8.setIsRecyclable(r3)
            android.support.v7.widget.RecyclerView r12 = r2.f2401a
            boolean r13 = r12.mDataSetHasChangedAfterLayout
            if (r13 == 0) goto L_0x022d
            android.support.v7.widget.fh r12 = r12.mItemAnimator
            boolean r8 = r12.mo2892p(r8, r8, r10, r11)
            if (r8 == 0) goto L_0x0252
            android.support.v7.widget.RecyclerView r8 = r2.f2401a
            r8.postAnimationRunner()
            goto L_0x0252
        L_0x022d:
            android.support.v7.widget.fh r12 = r12.mItemAnimator
            boolean r8 = r12.mo2894r(r8, r10, r11)
            if (r8 == 0) goto L_0x0252
            android.support.v7.widget.RecyclerView r8 = r2.f2401a
            r8.postAnimationRunner()
            goto L_0x0252
        L_0x023b:
            r11 = r10 & 4
            if (r11 == 0) goto L_0x0245
            android.support.v7.widget.fg r10 = r9.f2640c
            r2.mo2860a(r8, r10, r6)
            goto L_0x0252
        L_0x0245:
            r10 = r10 & 8
            if (r10 == 0) goto L_0x0252
            android.support.v7.widget.fg r10 = r9.f2640c
            android.support.v7.widget.fg r11 = r9.f2641d
            android.support.v7.widget.RecyclerView r12 = r2.f2401a
            r12.animateAppearance(r8, r10, r11)
        L_0x0252:
            android.support.p033v7.widget.C0755ji.m2548c(r9)
            int r5 = r5 + -1
            goto L_0x01cc
        L_0x0259:
            android.support.v7.widget.fo r1 = r0.mLayout
            android.support.v7.widget.fw r2 = r0.mRecycler
            r1.removeAndRecycleScrapInt(r2)
            android.support.v7.widget.ge r1 = r0.mState
            int r2 = r1.f2460e
            r1.f2457b = r2
            r0.mDataSetHasChangedAfterLayout = r3
            r0.mDispatchItemsChangedEvent = r3
            r1.f2465j = r3
            r1.f2466k = r3
            android.support.v7.widget.fo r1 = r0.mLayout
            r1.mRequestedSimpleAnimations = r3
            android.support.v7.widget.fw r1 = r0.mRecycler
            java.util.ArrayList r1 = r1.f2432b
            if (r1 == 0) goto L_0x027b
            r1.clear()
        L_0x027b:
            android.support.v7.widget.fo r1 = r0.mLayout
            boolean r2 = r1.mPrefetchMaxObservedInInitialPrefetch
            if (r2 == 0) goto L_0x028a
            r1.mPrefetchMaxCountObserved = r3
            r1.mPrefetchMaxObservedInInitialPrefetch = r3
            android.support.v7.widget.fw r1 = r0.mRecycler
            r1.mo3038o()
        L_0x028a:
            android.support.v7.widget.fo r1 = r0.mLayout
            android.support.v7.widget.ge r2 = r0.mState
            r1.onLayoutCompleted(r2)
            r0.onExitLayoutOrScroll(r4)
            r0.stopInterceptRequestLayout(r3)
            android.support.v7.widget.jj r1 = r0.mViewInfoStore
            r1.mo3267e()
            int[] r1 = r0.mMinMaxLayoutPositions
            r2 = r1[r3]
            r5 = r1[r4]
            r0.findMinMaxChildLayoutPositions(r1)
            int[] r1 = r0.mMinMaxLayoutPositions
            r8 = r1[r3]
            if (r8 != r2) goto L_0x02af
            r1 = r1[r4]
            if (r1 == r5) goto L_0x02b2
        L_0x02af:
            r0.dispatchOnScrolled(r3, r3)
        L_0x02b2:
            boolean r1 = r0.mPreserveFocusAfterLayout
            if (r1 == 0) goto L_0x0379
            android.support.v7.widget.fb r1 = r0.mAdapter
            if (r1 == 0) goto L_0x0379
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0379
            int r1 = r17.getDescendantFocusability()
            r2 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r2) goto L_0x0379
            int r1 = r17.getDescendantFocusability()
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r2) goto L_0x02d6
            boolean r1 = r17.isFocused()
            if (r1 != 0) goto L_0x0379
        L_0x02d6:
            boolean r1 = r17.isFocused()
            if (r1 != 0) goto L_0x02e8
            android.view.View r1 = r17.getFocusedChild()
            android.support.v7.widget.bt r2 = r0.mChildHelper
            boolean r1 = r2.mo2611k(r1)
            if (r1 == 0) goto L_0x0379
        L_0x02e8:
            android.support.v7.widget.ge r1 = r0.mState
            long r1 = r1.f2468m
            r4 = -1
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x02fd
            android.support.v7.widget.fb r8 = r0.mAdapter
            boolean r8 = r8.mHasStableIds
            if (r8 == 0) goto L_0x02fd
            android.support.v7.widget.gh r1 = r0.findViewHolderForItemId(r1)
            goto L_0x02fe
        L_0x02fd:
            r1 = r6
        L_0x02fe:
            if (r1 == 0) goto L_0x0316
            android.support.v7.widget.bt r2 = r0.mChildHelper
            android.view.View r8 = r1.itemView
            boolean r2 = r2.mo2611k(r8)
            if (r2 != 0) goto L_0x0316
            android.view.View r2 = r1.itemView
            boolean r2 = r2.hasFocusable()
            if (r2 != 0) goto L_0x0313
            goto L_0x0316
        L_0x0313:
            android.view.View r6 = r1.itemView
            goto L_0x035e
        L_0x0316:
            android.support.v7.widget.bt r1 = r0.mChildHelper
            int r1 = r1.mo2601a()
            if (r1 <= 0) goto L_0x035e
            android.support.v7.widget.ge r1 = r0.mState
            int r2 = r1.f2467l
            if (r2 != r7) goto L_0x0325
            goto L_0x0326
        L_0x0325:
            r3 = r2
        L_0x0326:
            int r1 = r1.mo3052a()
            r2 = r3
        L_0x032b:
            if (r2 >= r1) goto L_0x0342
            android.support.v7.widget.gh r8 = r0.findViewHolderForAdapterPosition(r2)
            if (r8 != 0) goto L_0x0334
            goto L_0x0342
        L_0x0334:
            android.view.View r9 = r8.itemView
            boolean r9 = r9.hasFocusable()
            if (r9 == 0) goto L_0x033f
            android.view.View r6 = r8.itemView
            goto L_0x035e
        L_0x033f:
            int r2 = r2 + 1
            goto L_0x032b
        L_0x0342:
            int r1 = java.lang.Math.min(r1, r3)
            int r1 = r1 + r7
        L_0x0347:
            if (r1 < 0) goto L_0x035e
            android.support.v7.widget.gh r2 = r0.findViewHolderForAdapterPosition(r1)
            if (r2 != 0) goto L_0x0350
            goto L_0x035e
        L_0x0350:
            android.view.View r3 = r2.itemView
            boolean r3 = r3.hasFocusable()
            if (r3 == 0) goto L_0x035b
            android.view.View r6 = r2.itemView
            goto L_0x035e
        L_0x035b:
            int r1 = r1 + -1
            goto L_0x0347
        L_0x035e:
            if (r6 == 0) goto L_0x0379
            android.support.v7.widget.ge r1 = r0.mState
            int r1 = r1.f2469n
            long r2 = (long) r1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0376
            android.view.View r1 = r6.findViewById(r1)
            if (r1 == 0) goto L_0x0376
            boolean r2 = r1.isFocusable()
            if (r2 == 0) goto L_0x0376
            r6 = r1
        L_0x0376:
            r6.requestFocus()
        L_0x0379:
            r17.resetFocusInfo()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.RecyclerView.dispatchLayout():void");
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo5281c(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo5282d(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo5283e(i, i2, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo5284f(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled$ar$ds(i);
        C0658ft ftVar = this.mScrollListener;
        if (ftVar != null) {
            ftVar.onScrolled(this, i, i2);
        }
        List list = this.mScrollListeners;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C0658ft) this.mScrollListeners.get(size)).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((C0648fj) this.mItemDecorations.get(i)).onDrawOver$ar$ds(canvas, this);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || (this.mItemAnimator != null && this.mItemDecorations.size() > 0 && this.mItemAnimator.mo2695k())) {
            C2043bi.m5519M(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: package-private */
    public final void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo2886a(this);
            this.mBottomGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo2886a(this);
            this.mLeftGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void ensureRightGlow() {
        if (this.mRightGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo2886a(this);
            this.mRightGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void ensureTopGlow() {
        if (this.mTopGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo2886a(this);
            this.mTopGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void fillRemainingScrollValues(C0670ge geVar) {
        if (this.mScrollState == 2) {
            OverScroller overScroller = this.mViewFlinger.f2473a;
            geVar.f2470o = overScroller.getFinalX() - overScroller.getCurrX();
            geVar.f2471p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        geVar.f2470o = 0;
        geVar.f2471p = 0;
    }

    public final View findChildViewUnder(float f, float f2) {
        int a = this.mChildHelper.mo2601a();
        while (true) {
            a--;
            if (a < 0) {
                return null;
            }
            View d = this.mChildHelper.mo2604d(a);
            float translationX = d.getTranslationX();
            float translationY = d.getTranslationY();
            if (f >= ((float) d.getLeft()) + translationX && f <= ((float) d.getRight()) + translationX && f2 >= ((float) d.getTop()) + translationY && f2 <= ((float) d.getBottom()) + translationY) {
                return d;
            }
        }
    }

    public final View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final C0673gh findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public final C0673gh findViewHolderForAdapterPosition(int i) {
        C0673gh ghVar = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int b = this.mChildHelper.mo2602b();
        for (int i2 = 0; i2 < b; i2++) {
            C0673gh childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo2605e(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!this.mChildHelper.mo2611k(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                ghVar = childViewHolderInt;
            }
        }
        return ghVar;
    }

    public final C0673gh findViewHolderForItemId(long j) {
        C0640fb fbVar = this.mAdapter;
        C0673gh ghVar = null;
        if (fbVar != null && fbVar.mHasStableIds) {
            int b = this.mChildHelper.mo2602b();
            for (int i = 0; i < b; i++) {
                C0673gh childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo2605e(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.mItemId == j) {
                    if (!this.mChildHelper.mo2611k(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    ghVar = childViewHolderInt;
                }
            }
        }
        return ghVar;
    }

    public final C0673gh findViewHolderForPosition(int i, boolean z) {
        int b = this.mChildHelper.mo2602b();
        C0673gh ghVar = null;
        for (int i2 = 0; i2 < b; i2++) {
            C0673gh childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo2605e(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.mChildHelper.mo2611k(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                ghVar = childViewHolderInt;
            }
        }
        return ghVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fling(int r9, int r10) {
        /*
            r8 = this;
            android.support.v7.widget.fo r0 = r8.mLayout
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r9 = "RecyclerView"
            java.lang.String r10 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r9, r10)
            return r1
        L_0x000d:
            boolean r2 = r8.mLayoutSuppressed
            if (r2 == 0) goto L_0x0012
            return r1
        L_0x0012:
            boolean r0 = r0.canScrollHorizontally()
            android.support.v7.widget.fo r2 = r8.mLayout
            boolean r2 = r2.canScrollVertically()
            if (r0 == 0) goto L_0x0026
            int r3 = java.lang.Math.abs(r9)
            int r4 = r8.mMinFlingVelocity
            if (r3 >= r4) goto L_0x0027
        L_0x0026:
            r9 = 0
        L_0x0027:
            if (r2 == 0) goto L_0x0031
            int r3 = java.lang.Math.abs(r10)
            int r4 = r8.mMinFlingVelocity
            if (r3 >= r4) goto L_0x0032
        L_0x0031:
            r10 = 0
        L_0x0032:
            if (r9 != 0) goto L_0x0039
            if (r10 == 0) goto L_0x0038
            r9 = 0
            goto L_0x0039
        L_0x0038:
            return r1
        L_0x0039:
            r3 = 0
            if (r9 == 0) goto L_0x007c
            android.widget.EdgeEffect r4 = r8.mLeftGlow
            if (r4 == 0) goto L_0x005e
            float r4 = androidx.core.widget.C2123j.m5886a(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x005e
            int r4 = -r9
            android.widget.EdgeEffect r5 = r8.mLeftGlow
            int r6 = r8.getWidth()
            boolean r5 = r8.shouldAbsorb(r5, r4, r6)
            if (r5 == 0) goto L_0x005b
            android.widget.EdgeEffect r9 = r8.mLeftGlow
            r9.onAbsorb(r4)
        L_0x005a:
            r9 = 0
        L_0x005b:
            r4 = r9
            r9 = 0
            goto L_0x007d
        L_0x005e:
            android.widget.EdgeEffect r4 = r8.mRightGlow
            if (r4 == 0) goto L_0x007c
            float r4 = androidx.core.widget.C2123j.m5886a(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x007c
            android.widget.EdgeEffect r4 = r8.mRightGlow
            int r5 = r8.getWidth()
            boolean r4 = r8.shouldAbsorb(r4, r9, r5)
            if (r4 == 0) goto L_0x005b
            android.widget.EdgeEffect r4 = r8.mRightGlow
            r4.onAbsorb(r9)
            goto L_0x005a
        L_0x007c:
            r4 = 0
        L_0x007d:
            if (r10 == 0) goto L_0x00be
            android.widget.EdgeEffect r5 = r8.mTopGlow
            if (r5 == 0) goto L_0x00a0
            float r5 = androidx.core.widget.C2123j.m5886a(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00a0
            int r3 = -r10
            android.widget.EdgeEffect r5 = r8.mTopGlow
            int r6 = r8.getHeight()
            boolean r5 = r8.shouldAbsorb(r5, r3, r6)
            if (r5 == 0) goto L_0x009e
            android.widget.EdgeEffect r10 = r8.mTopGlow
            r10.onAbsorb(r3)
        L_0x009d:
            r10 = 0
        L_0x009e:
            r3 = 0
            goto L_0x00c0
        L_0x00a0:
            android.widget.EdgeEffect r5 = r8.mBottomGlow
            if (r5 == 0) goto L_0x00be
            float r5 = androidx.core.widget.C2123j.m5886a(r5)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00be
            android.widget.EdgeEffect r3 = r8.mBottomGlow
            int r5 = r8.getHeight()
            boolean r3 = r8.shouldAbsorb(r3, r10, r5)
            if (r3 == 0) goto L_0x009e
            android.widget.EdgeEffect r3 = r8.mBottomGlow
            r3.onAbsorb(r10)
            goto L_0x009d
        L_0x00be:
            r3 = r10
            r10 = 0
        L_0x00c0:
            if (r4 != 0) goto L_0x00c9
            if (r10 == 0) goto L_0x00c6
            r4 = 0
            goto L_0x00c9
        L_0x00c6:
            r10 = 0
            r4 = 0
            goto L_0x00e4
        L_0x00c9:
            int r5 = r8.mMaxFlingVelocity
            int r6 = -r5
            int r4 = java.lang.Math.min(r4, r5)
            int r4 = java.lang.Math.max(r6, r4)
            int r5 = r8.mMaxFlingVelocity
            int r6 = -r5
            int r10 = java.lang.Math.min(r10, r5)
            int r10 = java.lang.Math.max(r6, r10)
            android.support.v7.widget.gg r5 = r8.mViewFlinger
            r5.mo3057a(r4, r10)
        L_0x00e4:
            r5 = 1
            if (r9 != 0) goto L_0x00f1
            if (r3 != 0) goto L_0x00f0
            if (r4 != 0) goto L_0x00ef
            if (r10 == 0) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            return r1
        L_0x00ef:
            return r5
        L_0x00f0:
            r9 = 0
        L_0x00f1:
            float r10 = (float) r9
            float r4 = (float) r3
            androidx.core.j.z r6 = r8.getScrollingChildHelper()
            boolean r6 = r6.mo5282d(r10, r4)
            if (r6 != 0) goto L_0x0141
            if (r0 != 0) goto L_0x0104
            if (r2 == 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            r6 = 0
            goto L_0x0105
        L_0x0104:
            r6 = 1
        L_0x0105:
            androidx.core.j.z r7 = r8.getScrollingChildHelper()
            r7.mo5281c(r10, r4, r6)
            android.support.v7.widget.fr r10 = r8.mOnFlingListener
            if (r10 == 0) goto L_0x0118
            boolean r10 = r10.mo3014e(r9, r3)
            if (r10 != 0) goto L_0x0117
            goto L_0x0118
        L_0x0117:
            return r5
        L_0x0118:
            if (r6 == 0) goto L_0x0141
            if (r2 == 0) goto L_0x011e
            r0 = r0 | 2
        L_0x011e:
            androidx.core.j.z r10 = r8.getScrollingChildHelper()
            r10.mo5286h(r0, r5)
            int r10 = r8.mMaxFlingVelocity
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = -r10
            int r9 = java.lang.Math.max(r10, r9)
            int r10 = r8.mMaxFlingVelocity
            int r0 = java.lang.Math.min(r3, r10)
            int r10 = -r10
            int r10 = java.lang.Math.max(r10, r0)
            android.support.v7.widget.gg r0 = r8.mViewFlinger
            r0.mo3057a(r9, r10)
            return r5
        L_0x0141:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.RecyclerView.fling(int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x019e, code lost:
        if (r8 > 0) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01bc, code lost:
        if (r10 > 0) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01bf, code lost:
        if (r8 < 0) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c2, code lost:
        if (r10 < 0) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01cb, code lost:
        if ((r10 * r3) > 0) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d4, code lost:
        if ((r10 * r3) < 0) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01d8, code lost:
        if (r1 != false) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.findNextFocus(r13, r14, r15 == 2 ? 130 : 33) != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006e, code lost:
        if (r3.findNextFocus(r13, r14, true != ((r13.mLayout.getLayoutDirection() == 1) ^ (r15 == 2)) ? 17 : 66) == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        consumePendingUpdateOperations();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0077, code lost:
        if (findContainingItemView(r14) != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0079, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007a, code lost:
        startInterceptRequestLayout();
        r13.mLayout.onFocusSearchFailed(r14, r15, r13.mRecycler, r13.mState);
        stopInterceptRequestLayout(false);
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c9 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            android.support.v7.widget.fo r0 = r13.mLayout
            android.view.View r0 = r0.onInterceptFocusSearch(r14, r15)
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            android.support.v7.widget.fb r0 = r13.mAdapter
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001f
            android.support.v7.widget.fo r0 = r13.mLayout
            if (r0 == 0) goto L_0x001f
            boolean r0 = r13.isComputingLayout()
            if (r0 != 0) goto L_0x001f
            boolean r0 = r13.mLayoutSuppressed
            if (r0 != 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 17
            r5 = 66
            r6 = 130(0x82, float:1.82E-43)
            r7 = 33
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x008e
            if (r15 == r9) goto L_0x0035
            if (r15 != r1) goto L_0x008e
            r15 = 1
        L_0x0035:
            android.support.v7.widget.fo r0 = r13.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L_0x004a
            if (r15 != r9) goto L_0x0042
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x0044
        L_0x0042:
            r0 = 33
        L_0x0044:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 == 0) goto L_0x0070
        L_0x004a:
            android.support.v7.widget.fo r0 = r13.mLayout
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L_0x0089
            android.support.v7.widget.fo r0 = r13.mLayout
            int r0 = r0.getLayoutDirection()
            if (r0 != r1) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r15 != r9) goto L_0x0061
            r10 = 1
            goto L_0x0062
        L_0x0061:
            r10 = 0
        L_0x0062:
            r0 = r0 ^ r10
            if (r1 == r0) goto L_0x0068
            r0 = 17
            goto L_0x006a
        L_0x0068:
            r0 = 66
        L_0x006a:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0089
        L_0x0070:
            r13.consumePendingUpdateOperations()
            android.view.View r0 = r13.findContainingItemView(r14)
            if (r0 != 0) goto L_0x007a
            return r8
        L_0x007a:
            r13.startInterceptRequestLayout()
            android.support.v7.widget.fo r0 = r13.mLayout
            android.support.v7.widget.fw r10 = r13.mRecycler
            android.support.v7.widget.ge r11 = r13.mState
            r0.onFocusSearchFailed(r14, r15, r10, r11)
            r13.stopInterceptRequestLayout(r2)
        L_0x0089:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00b2
        L_0x008e:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00b1
            if (r0 == 0) goto L_0x00b1
            r13.consumePendingUpdateOperations()
            android.view.View r0 = r13.findContainingItemView(r14)
            if (r0 != 0) goto L_0x00a0
            return r8
        L_0x00a0:
            r13.startInterceptRequestLayout()
            android.support.v7.widget.fo r0 = r13.mLayout
            android.support.v7.widget.fw r3 = r13.mRecycler
            android.support.v7.widget.ge r10 = r13.mState
            android.view.View r0 = r0.onFocusSearchFailed(r14, r15, r3, r10)
            r13.stopInterceptRequestLayout(r2)
            goto L_0x00b2
        L_0x00b1:
            r0 = r3
        L_0x00b2:
            if (r0 == 0) goto L_0x00c9
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00c9
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00c5
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00c5:
            r13.requestChildOnScreen(r0, r8)
            return r14
        L_0x00c9:
            if (r0 == 0) goto L_0x01db
            if (r0 == r13) goto L_0x01db
            if (r0 != r14) goto L_0x00d1
            goto L_0x01db
        L_0x00d1:
            android.view.View r3 = r13.findContainingItemView(r0)
            if (r3 == 0) goto L_0x01db
            if (r14 != 0) goto L_0x00db
            goto L_0x01da
        L_0x00db:
            android.view.View r3 = r13.findContainingItemView(r14)
            if (r3 == 0) goto L_0x01da
            android.graphics.Rect r3 = r13.mTempRect
            int r8 = r14.getWidth()
            int r10 = r14.getHeight()
            r3.set(r2, r2, r8, r10)
            android.graphics.Rect r3 = r13.mTempRect2
            int r8 = r0.getWidth()
            int r10 = r0.getHeight()
            r3.set(r2, r2, r8, r10)
            android.graphics.Rect r3 = r13.mTempRect
            r13.offsetDescendantRectToMyCoords(r14, r3)
            android.graphics.Rect r3 = r13.mTempRect2
            r13.offsetDescendantRectToMyCoords(r0, r3)
            android.support.v7.widget.fo r3 = r13.mLayout
            int r3 = r3.getLayoutDirection()
            r8 = -1
            if (r3 != r1) goto L_0x0110
            r3 = -1
            goto L_0x0111
        L_0x0110:
            r3 = 1
        L_0x0111:
            android.graphics.Rect r10 = r13.mTempRect
            int r10 = r10.left
            android.graphics.Rect r11 = r13.mTempRect2
            int r11 = r11.left
            if (r10 < r11) goto L_0x0125
            android.graphics.Rect r10 = r13.mTempRect
            int r10 = r10.right
            android.graphics.Rect r11 = r13.mTempRect2
            int r11 = r11.left
            if (r10 > r11) goto L_0x0131
        L_0x0125:
            android.graphics.Rect r10 = r13.mTempRect
            int r10 = r10.right
            android.graphics.Rect r11 = r13.mTempRect2
            int r11 = r11.right
            if (r10 >= r11) goto L_0x0131
            r10 = 1
            goto L_0x0152
        L_0x0131:
            android.graphics.Rect r10 = r13.mTempRect
            int r10 = r10.right
            android.graphics.Rect r11 = r13.mTempRect2
            int r11 = r11.right
            if (r10 > r11) goto L_0x0145
            android.graphics.Rect r10 = r13.mTempRect
            int r10 = r10.left
            android.graphics.Rect r11 = r13.mTempRect2
            int r11 = r11.right
            if (r10 < r11) goto L_0x0151
        L_0x0145:
            android.graphics.Rect r10 = r13.mTempRect
            int r10 = r10.left
            android.graphics.Rect r11 = r13.mTempRect2
            int r11 = r11.left
            if (r10 <= r11) goto L_0x0151
            r10 = -1
            goto L_0x0152
        L_0x0151:
            r10 = 0
        L_0x0152:
            android.graphics.Rect r11 = r13.mTempRect
            int r11 = r11.top
            android.graphics.Rect r12 = r13.mTempRect2
            int r12 = r12.top
            if (r11 < r12) goto L_0x0166
            android.graphics.Rect r11 = r13.mTempRect
            int r11 = r11.bottom
            android.graphics.Rect r12 = r13.mTempRect2
            int r12 = r12.top
            if (r11 > r12) goto L_0x0172
        L_0x0166:
            android.graphics.Rect r11 = r13.mTempRect
            int r11 = r11.bottom
            android.graphics.Rect r12 = r13.mTempRect2
            int r12 = r12.bottom
            if (r11 >= r12) goto L_0x0172
            r8 = 1
            goto L_0x0192
        L_0x0172:
            android.graphics.Rect r11 = r13.mTempRect
            int r11 = r11.bottom
            android.graphics.Rect r12 = r13.mTempRect2
            int r12 = r12.bottom
            if (r11 > r12) goto L_0x0186
            android.graphics.Rect r11 = r13.mTempRect
            int r11 = r11.top
            android.graphics.Rect r12 = r13.mTempRect2
            int r12 = r12.bottom
            if (r11 < r12) goto L_0x0191
        L_0x0186:
            android.graphics.Rect r11 = r13.mTempRect
            int r11 = r11.top
            android.graphics.Rect r12 = r13.mTempRect2
            int r12 = r12.top
            if (r11 <= r12) goto L_0x0191
            goto L_0x0192
        L_0x0191:
            r8 = 0
        L_0x0192:
            if (r15 == r1) goto L_0x01ce
            if (r15 == r9) goto L_0x01c5
            if (r15 == r4) goto L_0x01c2
            if (r15 == r7) goto L_0x01bf
            if (r15 == r5) goto L_0x01bc
            if (r15 != r6) goto L_0x01a1
            if (r8 <= 0) goto L_0x01db
            goto L_0x01da
        L_0x01a1:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid direction: "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = r13.exceptionLabel()
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r14.<init>(r15)
            throw r14
        L_0x01bc:
            if (r10 <= 0) goto L_0x01db
            goto L_0x01da
        L_0x01bf:
            if (r8 >= 0) goto L_0x01db
            goto L_0x01da
        L_0x01c2:
            if (r10 >= 0) goto L_0x01db
            goto L_0x01da
        L_0x01c5:
            if (r8 > 0) goto L_0x01d8
            if (r8 != 0) goto L_0x01d7
            int r10 = r10 * r3
            if (r10 <= 0) goto L_0x01db
            goto L_0x01d8
        L_0x01ce:
            if (r8 < 0) goto L_0x01d8
            if (r8 != 0) goto L_0x01d7
            int r10 = r10 * r3
            if (r10 >= 0) goto L_0x01db
            goto L_0x01d8
        L_0x01d7:
            r1 = 0
        L_0x01d8:
            if (r1 == 0) goto L_0x01db
        L_0x01da:
            return r0
        L_0x01db:
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0653fo foVar = this.mLayout;
        if (foVar != null) {
            return foVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(exceptionLabel()));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0653fo foVar = this.mLayout;
        if (foVar != null) {
            return foVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(exceptionLabel()));
    }

    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    /* access modifiers changed from: package-private */
    public final int getAdapterPositionInRecyclerView(C0673gh ghVar) {
        if (ghVar.hasAnyOfTheFlags(524) || !ghVar.isBound()) {
            return -1;
        }
        C0777w wVar = this.mAdapterHelper;
        int i = ghVar.mPosition;
        int size = wVar.f2672a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0776v vVar = (C0776v) wVar.f2672a.get(i2);
            int i3 = vVar.f2668a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = vVar.f2669b;
                    if (i4 <= i) {
                        int i5 = vVar.f2671d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = vVar.f2669b;
                    if (i6 == i) {
                        i = vVar.f2671d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (vVar.f2671d <= i) {
                            i++;
                        }
                    }
                }
            } else if (vVar.f2669b <= i) {
                i += vVar.f2671d;
            }
        }
        return i;
    }

    public final int getBaseline() {
        C0653fo foVar = this.mLayout;
        if (foVar != null) {
            return foVar.getBaseline();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public final long getChangedHolderKey(C0673gh ghVar) {
        return this.mAdapter.mHasStableIds ? ghVar.mItemId : (long) ghVar.mPosition;
    }

    public final int getChildAdapterPosition(View view) {
        C0673gh childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i, int i2) {
        return this.mChildDrawingOrderCallback$ar$class_merging == null ? super.getChildDrawingOrder(i, i2) : (i - 1) - i2;
    }

    public final long getChildItemId(View view) {
        C0673gh childViewHolderInt;
        C0640fb fbVar = this.mAdapter;
        if (fbVar == null || !fbVar.mHasStableIds || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.mItemId;
    }

    public final int getChildLayoutPosition(View view) {
        C0673gh childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    public final C0673gh getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    /* access modifiers changed from: package-private */
    public final Rect getItemDecorInsetsForChild(View view) {
        C0654fp fpVar = (C0654fp) view.getLayoutParams();
        if (!fpVar.f2422e) {
            return fpVar.f2421d;
        }
        if (this.mState.f2462g && (fpVar.f2420c.isUpdated() || fpVar.f2420c.isInvalid())) {
            return fpVar.f2421d;
        }
        Rect rect = fpVar.f2421d;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            ((C0648fj) this.mItemDecorations.get(i)).getItemOffsets(this.mTempRect, view, this, this.mState);
            rect.left += this.mTempRect.left;
            rect.top += this.mTempRect.top;
            rect.right += this.mTempRect.right;
            rect.bottom += this.mTempRect.bottom;
        }
        fpVar.f2422e = false;
        return rect;
    }

    public final C0648fj getItemDecorationAt(int i) {
        int size = this.mItemDecorations.size();
        if (i >= 0 && i < size) {
            return (C0648fj) this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + size);
    }

    public final C2111z getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C2111z(this);
        }
        return this.mScrollingChildHelper;
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo5285g(0);
    }

    public final boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mo3294k();
    }

    /* access modifiers changed from: package-private */
    public final void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public final void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            C0653fo foVar = this.mLayout;
            if (foVar != null) {
                foVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public final boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f6017a;
    }

    /* access modifiers changed from: package-private */
    public final void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public final void markItemDecorInsetsDirty() {
        int b = this.mChildHelper.mo2602b();
        for (int i = 0; i < b; i++) {
            ((C0654fp) this.mChildHelper.mo2605e(i).getLayoutParams()).f2422e = true;
        }
        C0661fw fwVar = this.mRecycler;
        int size = fwVar.f2433c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0654fp fpVar = (C0654fp) ((C0673gh) fwVar.f2433c.get(i2)).itemView.getLayoutParams();
            if (fpVar != null) {
                fpVar.f2422e = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.mChildHelper.mo2602b();
        for (int i4 = 0; i4 < b; i4++) {
            C0673gh childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo2605e(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f2461f = true;
                } else if (i5 >= i) {
                    childViewHolderInt.mFlags |= 8;
                    childViewHolderInt.offsetPosition(-i2, z);
                    childViewHolderInt.mPosition = i - 1;
                    this.mState.f2461f = true;
                }
            }
        }
        C0661fw fwVar = this.mRecycler;
        int size = fwVar.f2433c.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0673gh ghVar = (C0673gh) fwVar.f2433c.get(size);
                if (ghVar != null) {
                    int i6 = ghVar.mPosition;
                    if (i6 >= i3) {
                        ghVar.offsetPosition(-i2, z);
                    } else if (i6 >= i) {
                        ghVar.mFlags |= 8;
                        fwVar.mo3032i(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        this.mRecycler.mo3028e();
        C0653fo foVar = this.mLayout;
        if (foVar != null) {
            foVar.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            C0591dg dgVar = (C0591dg) C0591dg.f2294a.get();
            this.mGapWorker = dgVar;
            if (dgVar == null) {
                this.mGapWorker = new C0591dg();
                Display q = C2043bi.m5588q(this);
                float f = 60.0f;
                if (!isInEditMode() && q != null) {
                    float refreshRate = q.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C0591dg dgVar2 = this.mGapWorker;
                dgVar2.f2298e = (long) (1.0E9f / f);
                C0591dg.f2294a.set(dgVar2);
            }
            this.mGapWorker.f2296c.add(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        C0591dg dgVar;
        super.onDetachedFromWindow();
        C0646fh fhVar = this.mItemAnimator;
        if (fhVar != null) {
            fhVar.mo2688d();
        }
        stopScroll();
        this.mIsAttached = false;
        C0653fo foVar = this.mLayout;
        if (foVar != null) {
            foVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        C0755ji.m2547b();
        C0661fw fwVar = this.mRecycler;
        for (int i = 0; i < fwVar.f2433c.size(); i++) {
            C2140a.m5939b(((C0673gh) fwVar.f2433c.get(i)).itemView);
        }
        fwVar.mo3029f(fwVar.f2438h.mAdapter, false);
        Iterator a = C2050bp.m5609a(this).mo5191a();
        while (a.hasNext()) {
            C2140a.m5938a((View) a.next()).mo5371a();
        }
        if (ALLOW_THREAD_GAP_WORK && (dgVar = this.mGapWorker) != null) {
            dgVar.f2296c.remove(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            ((C0648fj) this.mItemDecorations.get(i)).onDraw(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: package-private */
    public final void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: package-private */
    public final void onExitLayoutOrScroll(boolean z) {
        int i;
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 <= 0) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                int i3 = this.mEatenAccessibilityChangeFlags;
                this.mEatenAccessibilityChangeFlags = 0;
                if (i3 != 0 && isAccessibilityEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    C1982b.m5325b(obtain, i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
                    C0673gh ghVar = (C0673gh) this.mPendingAccessibilityImportanceChange.get(size);
                    if (ghVar.itemView.getParent() == this && !ghVar.shouldIgnore() && (i = ghVar.mPendingAccessibilityState) != -1) {
                        C2043bi.m5551ae(ghVar.itemView, i);
                        ghVar.mPendingAccessibilityState = -1;
                    }
                }
                this.mPendingAccessibilityImportanceChange.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            android.support.v7.widget.fo r0 = r14.mLayout
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r14.mLayoutSuppressed
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            int r0 = r15.getAction()
            r2 = 8
            if (r0 != r2) goto L_0x0109
            int r0 = r15.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L_0x003c
            android.support.v7.widget.fo r0 = r14.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L_0x002c
            r0 = 9
            float r0 = r15.getAxisValue(r0)
            float r0 = -r0
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            android.support.v7.widget.fo r3 = r14.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L_0x0060
            r3 = 10
            float r3 = r15.getAxisValue(r3)
            goto L_0x0061
        L_0x003c:
            int r0 = r15.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x005f
            r0 = 26
            float r3 = r15.getAxisValue(r0)
            android.support.v7.widget.fo r0 = r14.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L_0x0055
            float r0 = -r3
            goto L_0x0060
        L_0x0055:
            android.support.v7.widget.fo r0 = r14.mLayout
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L_0x005f
            r0 = 0
            goto L_0x0061
        L_0x005f:
            r0 = 0
        L_0x0060:
            r3 = 0
        L_0x0061:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0069
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0109
        L_0x0069:
            float r2 = r14.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r14.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            android.support.v7.widget.fo r3 = r14.mLayout
            if (r3 != 0) goto L_0x0080
            java.lang.String r15 = "RecyclerView"
            java.lang.String r0 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r15, r0)
            goto L_0x0109
        L_0x0080:
            boolean r4 = r14.mLayoutSuppressed
            if (r4 != 0) goto L_0x0109
            int[] r4 = r14.mReusableIntPair
            r4[r1] = r1
            r5 = 1
            r4[r5] = r1
            boolean r3 = r3.canScrollHorizontally()
            android.support.v7.widget.fo r4 = r14.mLayout
            boolean r4 = r4.canScrollVertically()
            if (r4 == 0) goto L_0x009a
            r6 = r3 | 2
            goto L_0x009b
        L_0x009a:
            r6 = r3
        L_0x009b:
            r7 = 1073741824(0x40000000, float:2.0)
            if (r15 != 0) goto L_0x00a6
            int r8 = r14.getHeight()
            float r8 = (float) r8
            float r8 = r8 / r7
            goto L_0x00aa
        L_0x00a6:
            float r8 = r15.getY()
        L_0x00aa:
            if (r15 != 0) goto L_0x00b3
            int r9 = r14.getWidth()
            float r9 = (float) r9
            float r9 = r9 / r7
            goto L_0x00b7
        L_0x00b3:
            float r9 = r15.getX()
        L_0x00b7:
            int r7 = r14.releaseHorizontalGlow(r2, r8)
            int r2 = r2 - r7
            int r7 = r14.releaseVerticalGlow(r0, r9)
            int r0 = r0 - r7
            androidx.core.j.z r7 = r14.getScrollingChildHelper()
            r7.mo5286h(r6, r5)
            if (r5 == r3) goto L_0x00cc
            r9 = 0
            goto L_0x00cd
        L_0x00cc:
            r9 = r2
        L_0x00cd:
            if (r5 == r4) goto L_0x00d1
            r10 = 0
            goto L_0x00d2
        L_0x00d1:
            r10 = r0
        L_0x00d2:
            int[] r11 = r14.mReusableIntPair
            int[] r12 = r14.mScrollOffset
            androidx.core.j.z r8 = r14.getScrollingChildHelper()
            r13 = 1
            boolean r6 = r8.mo5283e(r9, r10, r11, r12, r13)
            if (r6 == 0) goto L_0x00e9
            int[] r6 = r14.mReusableIntPair
            r7 = r6[r1]
            int r2 = r2 - r7
            r6 = r6[r5]
            int r0 = r0 - r6
        L_0x00e9:
            if (r5 == r3) goto L_0x00ed
            r3 = 0
            goto L_0x00ee
        L_0x00ed:
            r3 = r2
        L_0x00ee:
            if (r5 == r4) goto L_0x00f2
            r4 = 0
            goto L_0x00f3
        L_0x00f2:
            r4 = r0
        L_0x00f3:
            r14.scrollByInternal(r3, r4, r15, r5)
            android.support.v7.widget.dg r15 = r14.mGapWorker
            if (r15 == 0) goto L_0x0102
            if (r2 != 0) goto L_0x00ff
            if (r0 == 0) goto L_0x0102
            r2 = 0
        L_0x00ff:
            r15.mo2733a(r14, r2, r0)
        L_0x0102:
            androidx.core.j.z r15 = r14.getScrollingChildHelper()
            r15.mo5280b(r5)
        L_0x0109:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cb, code lost:
        if (r0 != false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0195, code lost:
        if (r11.mScrollState != 2) goto L_0x01a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = r11.mLayoutSuppressed
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 0
            r11.mInterceptingOnItemTouchListener = r0
            boolean r0 = r11.findInterceptingOnItemTouchListener(r12)
            r2 = 1
            if (r0 == 0) goto L_0x0014
            r11.cancelScroll()
            return r2
        L_0x0014:
            android.support.v7.widget.fo r0 = r11.mLayout
            if (r0 != 0) goto L_0x0019
            return r1
        L_0x0019:
            boolean r0 = r0.canScrollHorizontally()
            android.support.v7.widget.fo r3 = r11.mLayout
            boolean r3 = r3.canScrollVertically()
            android.view.VelocityTracker r4 = r11.mVelocityTracker
            if (r4 != 0) goto L_0x002d
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r11.mVelocityTracker = r4
        L_0x002d:
            android.view.VelocityTracker r4 = r11.mVelocityTracker
            r4.addMovement(r12)
            int r4 = r12.getActionMasked()
            int r5 = r12.getActionIndex()
            r6 = 2
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto L_0x00e0
            if (r4 == r2) goto L_0x00d2
            if (r4 == r6) goto L_0x0074
            r0 = 3
            if (r4 == r0) goto L_0x006f
            r0 = 5
            if (r4 == r0) goto L_0x0053
            r0 = 6
            if (r4 == r0) goto L_0x004e
            goto L_0x01b9
        L_0x004e:
            r11.onPointerUp(r12)
            goto L_0x01b9
        L_0x0053:
            int r0 = r12.getPointerId(r5)
            r11.mScrollPointerId = r0
            float r0 = r12.getX(r5)
            float r0 = r0 + r7
            int r0 = (int) r0
            r11.mLastTouchX = r0
            r11.mInitialTouchX = r0
            float r12 = r12.getY(r5)
            float r12 = r12 + r7
            int r12 = (int) r12
            r11.mLastTouchY = r12
            r11.mInitialTouchY = r12
            goto L_0x01b9
        L_0x006f:
            r11.cancelScroll()
            goto L_0x01b9
        L_0x0074:
            int r4 = r11.mScrollPointerId
            int r4 = r12.findPointerIndex(r4)
            if (r4 >= 0) goto L_0x0097
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r12.<init>(r0)
            int r0 = r11.mScrollPointerId
            r12.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r12.append(r0)
            java.lang.String r0 = "RecyclerView"
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r0, r12)
            return r1
        L_0x0097:
            float r5 = r12.getX(r4)
            float r5 = r5 + r7
            int r5 = (int) r5
            float r12 = r12.getY(r4)
            float r12 = r12 + r7
            int r12 = (int) r12
            int r4 = r11.mScrollState
            if (r4 == r2) goto L_0x01b9
            int r4 = r11.mInitialTouchX
            int r4 = r5 - r4
            int r6 = r11.mInitialTouchY
            int r6 = r12 - r6
            if (r0 == 0) goto L_0x00bd
            int r0 = java.lang.Math.abs(r4)
            int r4 = r11.mTouchSlop
            if (r0 <= r4) goto L_0x00bd
            r11.mLastTouchX = r5
            r0 = 1
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            if (r3 == 0) goto L_0x00cb
            int r3 = java.lang.Math.abs(r6)
            int r4 = r11.mTouchSlop
            if (r3 <= r4) goto L_0x00cb
            r11.mLastTouchY = r12
            goto L_0x00cd
        L_0x00cb:
            if (r0 == 0) goto L_0x01b9
        L_0x00cd:
            r11.setScrollState(r2)
            goto L_0x01b9
        L_0x00d2:
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            r12.clear()
            androidx.core.j.z r12 = r11.getScrollingChildHelper()
            r12.mo5280b(r1)
            goto L_0x01b9
        L_0x00e0:
            boolean r4 = r11.mIgnoreMotionEventTillDown
            if (r4 == 0) goto L_0x00e6
            r11.mIgnoreMotionEventTillDown = r1
        L_0x00e6:
            int r4 = r12.getPointerId(r1)
            r11.mScrollPointerId = r4
            float r4 = r12.getX()
            float r4 = r4 + r7
            int r4 = (int) r4
            r11.mLastTouchX = r4
            r11.mInitialTouchX = r4
            float r4 = r12.getY()
            float r4 = r4 + r7
            int r4 = (int) r4
            r11.mLastTouchY = r4
            r11.mInitialTouchY = r4
            android.widget.EdgeEffect r4 = r11.mLeftGlow
            r5 = 1065353216(0x3f800000, float:1.0)
            r7 = -1
            r8 = 0
            if (r4 == 0) goto L_0x0129
            float r4 = androidx.core.widget.C2123j.m5886a(r4)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0129
            boolean r4 = r11.canScrollHorizontally(r7)
            if (r4 != 0) goto L_0x0129
            android.widget.EdgeEffect r4 = r11.mLeftGlow
            float r9 = r12.getY()
            int r10 = r11.getHeight()
            float r10 = (float) r10
            float r9 = r9 / r10
            float r9 = r5 - r9
            androidx.core.widget.C2123j.m5887b(r4, r8, r9)
            r4 = 1
            goto L_0x012a
        L_0x0129:
            r4 = 0
        L_0x012a:
            android.widget.EdgeEffect r9 = r11.mRightGlow
            if (r9 == 0) goto L_0x014c
            float r9 = androidx.core.widget.C2123j.m5886a(r9)
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 == 0) goto L_0x014c
            boolean r9 = r11.canScrollHorizontally(r2)
            if (r9 != 0) goto L_0x014c
            android.widget.EdgeEffect r4 = r11.mRightGlow
            float r9 = r12.getY()
            int r10 = r11.getHeight()
            float r10 = (float) r10
            float r9 = r9 / r10
            androidx.core.widget.C2123j.m5887b(r4, r8, r9)
            r4 = 1
        L_0x014c:
            android.widget.EdgeEffect r9 = r11.mTopGlow
            if (r9 == 0) goto L_0x016e
            float r9 = androidx.core.widget.C2123j.m5886a(r9)
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 == 0) goto L_0x016e
            boolean r7 = r11.canScrollVertically(r7)
            if (r7 != 0) goto L_0x016e
            android.widget.EdgeEffect r4 = r11.mTopGlow
            float r7 = r12.getX()
            int r9 = r11.getWidth()
            float r9 = (float) r9
            float r7 = r7 / r9
            androidx.core.widget.C2123j.m5887b(r4, r8, r7)
            r4 = 1
        L_0x016e:
            android.widget.EdgeEffect r7 = r11.mBottomGlow
            if (r7 == 0) goto L_0x0191
            float r7 = androidx.core.widget.C2123j.m5886a(r7)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0191
            boolean r7 = r11.canScrollVertically(r2)
            if (r7 != 0) goto L_0x0191
            android.widget.EdgeEffect r4 = r11.mBottomGlow
            float r12 = r12.getX()
            int r6 = r11.getWidth()
            float r6 = (float) r6
            float r12 = r12 / r6
            float r5 = r5 - r12
            androidx.core.widget.C2123j.m5887b(r4, r8, r5)
            goto L_0x0197
        L_0x0191:
            if (r4 != 0) goto L_0x0197
            int r12 = r11.mScrollState
            if (r12 != r6) goto L_0x01a8
        L_0x0197:
            android.view.ViewParent r12 = r11.getParent()
            r12.requestDisallowInterceptTouchEvent(r2)
            r11.setScrollState(r2)
            androidx.core.j.z r12 = r11.getScrollingChildHelper()
            r12.mo5280b(r2)
        L_0x01a8:
            int[] r12 = r11.mNestedOffsets
            r12[r2] = r1
            r12[r1] = r1
            if (r3 == 0) goto L_0x01b2
            r0 = r0 | 2
        L_0x01b2:
            androidx.core.j.z r12 = r11.getScrollingChildHelper()
            r12.mo5286h(r0, r1)
        L_0x01b9:
            int r12 = r11.mScrollState
            if (r12 != r2) goto L_0x01be
            return r2
        L_0x01be:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1901n.m5168a("RV OnLayout");
        dispatchLayout();
        C1901n.m5169b();
        this.mFirstLayoutComplete = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0653fo foVar = this.mLayout;
        if (foVar == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (foVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (!z && this.mAdapter != null) {
                if (this.mState.f2459d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.setMeasureSpecs(i, i2);
                this.mState.f2464i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
                if (this.mLayout.shouldMeasureTwice()) {
                    this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f2464i = true;
                    dispatchLayoutStep2();
                    this.mLayout.setMeasuredDimensionFromChildren(i, i2);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll(true);
                C0670ge geVar = this.mState;
                if (geVar.f2466k) {
                    geVar.f2462g = true;
                } else {
                    this.mAdapterHelper.mo3287d();
                    this.mState.f2462g = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f2466k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0640fb fbVar = this.mAdapter;
            if (fbVar != null) {
                this.mState.f2460e = fbVar.getItemCount();
            } else {
                this.mState.f2460e = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f2462g = false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.f6116d);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f1831a = savedState2.f1831a;
        } else {
            C0653fo foVar = this.mLayout;
            savedState.f1831a = foVar != null ? foVar.onSaveInstanceState() : null;
        }
        return savedState;
    }

    public void onScrolled$ar$ds(int i) {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0182, code lost:
        if (r10 != 0) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r0.mLayoutSuppressed
            r3 = 0
            if (r2 != 0) goto L_0x020b
            boolean r2 = r0.mIgnoreMotionEventTillDown
            if (r2 == 0) goto L_0x000f
            goto L_0x020b
        L_0x000f:
            android.support.v7.widget.fs r2 = r0.mInterceptingOnItemTouchListener
            r4 = 3
            r5 = 1
            if (r2 != 0) goto L_0x01f9
            int r2 = r18.getAction()
            if (r2 != 0) goto L_0x001c
            goto L_0x0024
        L_0x001c:
            boolean r2 = r17.findInterceptingOnItemTouchListener(r18)
            if (r2 == 0) goto L_0x0024
            goto L_0x0207
        L_0x0024:
            android.support.v7.widget.fo r2 = r0.mLayout
            if (r2 != 0) goto L_0x0029
            return r3
        L_0x0029:
            boolean r2 = r2.canScrollHorizontally()
            android.support.v7.widget.fo r6 = r0.mLayout
            boolean r6 = r6.canScrollVertically()
            android.view.VelocityTracker r7 = r0.mVelocityTracker
            if (r7 != 0) goto L_0x003d
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r0.mVelocityTracker = r7
        L_0x003d:
            int r7 = r18.getActionMasked()
            int r8 = r18.getActionIndex()
            if (r7 != 0) goto L_0x004e
            int[] r7 = r0.mNestedOffsets
            r7[r5] = r3
            r7[r3] = r3
            r7 = 0
        L_0x004e:
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r18)
            int[] r10 = r0.mNestedOffsets
            r11 = r10[r3]
            float r11 = (float) r11
            r10 = r10[r5]
            float r10 = (float) r10
            r9.offsetLocation(r11, r10)
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r7 == 0) goto L_0x01cb
            if (r7 == r5) goto L_0x018a
            r11 = 2
            if (r7 == r11) goto L_0x0096
            if (r7 == r4) goto L_0x0091
            r2 = 5
            if (r7 == r2) goto L_0x0075
            r2 = 6
            if (r7 == r2) goto L_0x0070
            goto L_0x01f0
        L_0x0070:
            r17.onPointerUp(r18)
            goto L_0x01f0
        L_0x0075:
            int r2 = r1.getPointerId(r8)
            r0.mScrollPointerId = r2
            float r2 = r1.getX(r8)
            float r2 = r2 + r10
            int r2 = (int) r2
            r0.mLastTouchX = r2
            r0.mInitialTouchX = r2
            float r1 = r1.getY(r8)
            float r1 = r1 + r10
            int r1 = (int) r1
            r0.mLastTouchY = r1
            r0.mInitialTouchY = r1
            goto L_0x01f0
        L_0x0091:
            r17.cancelScroll()
            goto L_0x01f0
        L_0x0096:
            int r4 = r0.mScrollPointerId
            int r4 = r1.findPointerIndex(r4)
            if (r4 >= 0) goto L_0x00b9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error processing scroll; pointer index for id "
            r1.<init>(r2)
            int r2 = r0.mScrollPointerId
            r1.append(r2)
            java.lang.String r2 = " not found. Did any MotionEvents get skipped?"
            r1.append(r2)
            java.lang.String r2 = "RecyclerView"
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r2, r1)
            return r3
        L_0x00b9:
            float r7 = r1.getX(r4)
            float r7 = r7 + r10
            int r7 = (int) r7
            float r4 = r1.getY(r4)
            float r4 = r4 + r10
            int r4 = (int) r4
            int r8 = r0.mLastTouchX
            int r8 = r8 - r7
            int r10 = r0.mLastTouchY
            int r10 = r10 - r4
            int r11 = r0.mScrollState
            if (r11 == r5) goto L_0x0102
            if (r2 == 0) goto L_0x00e6
            if (r8 <= 0) goto L_0x00db
            int r11 = r0.mTouchSlop
            int r8 = r8 - r11
            int r8 = java.lang.Math.max(r3, r8)
            goto L_0x00e2
        L_0x00db:
            int r11 = r0.mTouchSlop
            int r8 = r8 + r11
            int r8 = java.lang.Math.min(r3, r8)
        L_0x00e2:
            if (r8 == 0) goto L_0x00e6
            r11 = 1
            goto L_0x00e7
        L_0x00e6:
            r11 = 0
        L_0x00e7:
            if (r6 == 0) goto L_0x00fd
            if (r10 <= 0) goto L_0x00f3
            int r12 = r0.mTouchSlop
            int r10 = r10 - r12
            int r10 = java.lang.Math.max(r3, r10)
            goto L_0x00fa
        L_0x00f3:
            int r12 = r0.mTouchSlop
            int r10 = r10 + r12
            int r10 = java.lang.Math.min(r3, r10)
        L_0x00fa:
            if (r10 == 0) goto L_0x00fd
            r11 = 1
        L_0x00fd:
            if (r11 == 0) goto L_0x0102
            r0.setScrollState(r5)
        L_0x0102:
            int r11 = r0.mScrollState
            if (r11 != r5) goto L_0x01f0
            int[] r11 = r0.mReusableIntPair
            r11[r3] = r3
            r11[r5] = r3
            float r11 = r18.getY()
            int r11 = r0.releaseHorizontalGlow(r8, r11)
            int r8 = r8 - r11
            float r11 = r18.getX()
            int r11 = r0.releaseVerticalGlow(r10, r11)
            int r10 = r10 - r11
            if (r5 == r2) goto L_0x0122
            r12 = 0
            goto L_0x0123
        L_0x0122:
            r12 = r8
        L_0x0123:
            if (r5 == r6) goto L_0x0127
            r13 = 0
            goto L_0x0128
        L_0x0127:
            r13 = r10
        L_0x0128:
            int[] r14 = r0.mReusableIntPair
            int[] r15 = r0.mScrollOffset
            androidx.core.j.z r11 = r17.getScrollingChildHelper()
            r16 = 0
            boolean r11 = r11.mo5283e(r12, r13, r14, r15, r16)
            if (r11 == 0) goto L_0x0159
            int[] r11 = r0.mReusableIntPair
            r12 = r11[r3]
            int r8 = r8 - r12
            r11 = r11[r5]
            int r10 = r10 - r11
            int[] r11 = r0.mNestedOffsets
            r12 = r11[r3]
            int[] r13 = r0.mScrollOffset
            r14 = r13[r3]
            int r12 = r12 + r14
            r11[r3] = r12
            r12 = r11[r5]
            r13 = r13[r5]
            int r12 = r12 + r13
            r11[r5] = r12
            android.view.ViewParent r11 = r17.getParent()
            r11.requestDisallowInterceptTouchEvent(r5)
        L_0x0159:
            int[] r11 = r0.mScrollOffset
            r12 = r11[r3]
            int r7 = r7 - r12
            r0.mLastTouchX = r7
            r7 = r11[r5]
            int r4 = r4 - r7
            r0.mLastTouchY = r4
            if (r5 == r2) goto L_0x0169
            r2 = 0
            goto L_0x016a
        L_0x0169:
            r2 = r8
        L_0x016a:
            if (r5 == r6) goto L_0x016e
            r4 = 0
            goto L_0x016f
        L_0x016e:
            r4 = r10
        L_0x016f:
            boolean r1 = r0.scrollByInternal(r2, r4, r1, r3)
            if (r1 == 0) goto L_0x017c
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r5)
        L_0x017c:
            android.support.v7.widget.dg r1 = r0.mGapWorker
            if (r1 == 0) goto L_0x01f0
            if (r8 != 0) goto L_0x0185
            if (r10 == 0) goto L_0x01f0
            goto L_0x0186
        L_0x0185:
            r3 = r8
        L_0x0186:
            r1.mo2733a(r0, r3, r10)
            goto L_0x01f0
        L_0x018a:
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            r1.addMovement(r9)
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            int r4 = r0.mMaxFlingVelocity
            float r4 = (float) r4
            r7 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r7, r4)
            r1 = 0
            if (r2 == 0) goto L_0x01a6
            android.view.VelocityTracker r2 = r0.mVelocityTracker
            int r4 = r0.mScrollPointerId
            float r2 = r2.getXVelocity(r4)
            float r2 = -r2
            goto L_0x01a7
        L_0x01a6:
            r2 = 0
        L_0x01a7:
            if (r6 == 0) goto L_0x01b3
            android.view.VelocityTracker r4 = r0.mVelocityTracker
            int r6 = r0.mScrollPointerId
            float r4 = r4.getYVelocity(r6)
            float r4 = -r4
            goto L_0x01b4
        L_0x01b3:
            r4 = 0
        L_0x01b4:
            int r6 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x01bc
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x01c4
        L_0x01bc:
            int r1 = (int) r2
            int r2 = (int) r4
            boolean r1 = r0.fling(r1, r2)
            if (r1 != 0) goto L_0x01c7
        L_0x01c4:
            r0.setScrollState(r3)
        L_0x01c7:
            r17.resetScroll()
            goto L_0x01f5
        L_0x01cb:
            int r4 = r1.getPointerId(r3)
            r0.mScrollPointerId = r4
            float r4 = r18.getX()
            float r4 = r4 + r10
            int r4 = (int) r4
            r0.mLastTouchX = r4
            r0.mInitialTouchX = r4
            float r1 = r18.getY()
            float r1 = r1 + r10
            int r1 = (int) r1
            r0.mLastTouchY = r1
            r0.mInitialTouchY = r1
            if (r6 == 0) goto L_0x01e9
            r2 = r2 | 2
        L_0x01e9:
            androidx.core.j.z r1 = r17.getScrollingChildHelper()
            r1.mo5286h(r2, r3)
        L_0x01f0:
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            r1.addMovement(r9)
        L_0x01f5:
            r9.recycle()
            return r5
        L_0x01f9:
            r2.onTouchEvent$ar$ds(r1)
            int r1 = r18.getAction()
            if (r1 == r4) goto L_0x0204
            if (r1 != r5) goto L_0x0207
        L_0x0204:
            r1 = 0
            r0.mInterceptingOnItemTouchListener = r1
        L_0x0207:
            r17.cancelScroll()
            return r5
        L_0x020b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C2043bi.m5520N(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        int b = this.mChildHelper.mo2602b();
        for (int i = 0; i < b; i++) {
            C0673gh childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo2605e(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.mFlags |= 6;
            }
        }
        markItemDecorInsetsDirty();
        C0661fw fwVar = this.mRecycler;
        int size = fwVar.f2433c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0673gh ghVar = (C0673gh) fwVar.f2433c.get(i2);
            if (ghVar != null) {
                ghVar.mFlags |= 6;
                ghVar.addChangePayload((Object) null);
            }
        }
        C0640fb fbVar = fwVar.f2438h.mAdapter;
        if (fbVar == null || !fbVar.mHasStableIds) {
            fwVar.mo3031h();
        }
    }

    /* access modifiers changed from: package-private */
    public final void recordAnimationInfoIfBouncedHiddenView(C0673gh ghVar, C0645fg fgVar) {
        ghVar.setFlags(0, 8192);
        if (this.mState.f2463h && ghVar.isUpdated() && !ghVar.isRemoved() && !ghVar.shouldIgnore()) {
            this.mViewInfoStore.f2643b.mo3682i(getChangedHolderKey(ghVar), ghVar);
        }
        this.mViewInfoStore.mo3266d(ghVar, fgVar);
    }

    /* access modifiers changed from: package-private */
    public final void removeAndRecycleViews() {
        C0646fh fhVar = this.mItemAnimator;
        if (fhVar != null) {
            fhVar.mo2688d();
        }
        C0653fo foVar = this.mLayout;
        if (foVar != null) {
            foVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.mo3027d();
    }

    /* access modifiers changed from: protected */
    public final void removeDetachedView(View view, boolean z) {
        C0673gh childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public final void removeItemDecoration(C0648fj fjVar) {
        C0653fo foVar = this.mLayout;
        if (foVar != null) {
            foVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(fjVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public final void removeItemDecorationAt(int i) {
        int size = this.mItemDecorations.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + size);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public final void removeOnChildAttachStateChangeListener(C0655fq fqVar) {
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(fqVar);
        }
    }

    public final void removeOnItemTouchListener(C0657fs fsVar) {
        this.mOnItemTouchListeners.remove(fsVar);
        if (this.mInterceptingOnItemTouchListener == fsVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public final void removeOnScrollListener(C0658ft ftVar) {
        List list = this.mScrollListeners;
        if (list != null) {
            list.remove(ftVar);
        }
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            ((C0657fs) this.mOnItemTouchListeners.get(i)).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public final void scrollBy(int i, int i2) {
        C0653fo foVar = this.mLayout;
        if (foVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean canScrollHorizontally = foVar.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (!canScrollHorizontally) {
                if (canScrollVertically) {
                    canScrollVertically = true;
                } else {
                    return;
                }
            }
            if (true != canScrollHorizontally) {
                i = 0;
            }
            if (true != canScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, (MotionEvent) null, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010d, code lost:
        if (r9 == 0.0f) goto L_0x0112;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean scrollByInternal(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r18.consumePendingUpdateOperations()
            android.support.v7.widget.fb r4 = r0.mAdapter
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0025
            int[] r4 = r0.mReusableIntPair
            r4[r6] = r6
            r4[r5] = r6
            r0.scrollStep(r1, r2, r4)
            int[] r4 = r0.mReusableIntPair
            r7 = r4[r6]
            r4 = r4[r5]
            int r8 = r1 - r7
            int r9 = r2 - r4
            goto L_0x0029
        L_0x0025:
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0029:
            java.util.ArrayList r10 = r0.mItemDecorations
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0034
            r18.invalidate()
        L_0x0034:
            int[] r15 = r0.mReusableIntPair
            r15[r6] = r6
            r15[r5] = r6
            int[] r14 = r0.mScrollOffset
            androidx.core.j.z r10 = r18.getScrollingChildHelper()
            r11 = r7
            r12 = r4
            r13 = r8
            r16 = r14
            r14 = r9
            r17 = r15
            r15 = r16
            r16 = r22
            r10.mo5284f(r11, r12, r13, r14, r15, r16, r17)
            int[] r10 = r0.mReusableIntPair
            r11 = r10[r6]
            int r8 = r8 - r11
            r10 = r10[r5]
            int r9 = r9 - r10
            if (r11 != 0) goto L_0x005e
            if (r10 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r10 = 0
            goto L_0x005f
        L_0x005e:
            r10 = 1
        L_0x005f:
            int r11 = r0.mLastTouchX
            int[] r12 = r0.mScrollOffset
            r13 = r12[r6]
            int r11 = r11 - r13
            r0.mLastTouchX = r11
            int r11 = r0.mLastTouchY
            r12 = r12[r5]
            int r11 = r11 - r12
            r0.mLastTouchY = r11
            int[] r11 = r0.mNestedOffsets
            r14 = r11[r6]
            int r14 = r14 + r13
            r11[r6] = r14
            r13 = r11[r5]
            int r13 = r13 + r12
            r11[r5] = r13
            int r11 = r18.getOverScrollMode()
            r12 = 2
            if (r11 == r12) goto L_0x0115
            if (r3 == 0) goto L_0x0112
            r11 = 8194(0x2002, float:1.1482E-41)
            boolean r11 = androidx.core.p098j.C2109x.m5816a(r3, r11)
            if (r11 != 0) goto L_0x0112
            float r11 = r21.getX()
            float r8 = (float) r8
            float r3 = r21.getY()
            float r9 = (float) r9
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            int r14 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r14 >= 0) goto L_0x00b6
            r18.ensureLeftGlow()
            android.widget.EdgeEffect r14 = r0.mLeftGlow
            float r15 = -r8
            int r5 = r18.getWidth()
            float r5 = (float) r5
            float r15 = r15 / r5
            int r5 = r18.getHeight()
            float r5 = (float) r5
            float r3 = r3 / r5
            float r3 = r12 - r3
            androidx.core.widget.C2123j.m5887b(r14, r15, r3)
        L_0x00b4:
            r3 = 1
            goto L_0x00d1
        L_0x00b6:
            int r5 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d0
            r18.ensureRightGlow()
            android.widget.EdgeEffect r5 = r0.mRightGlow
            int r14 = r18.getWidth()
            float r14 = (float) r14
            float r14 = r8 / r14
            int r15 = r18.getHeight()
            float r15 = (float) r15
            float r3 = r3 / r15
            androidx.core.widget.C2123j.m5887b(r5, r14, r3)
            goto L_0x00b4
        L_0x00d0:
            r3 = 0
        L_0x00d1:
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x00eb
            r18.ensureTopGlow()
            android.widget.EdgeEffect r3 = r0.mTopGlow
            float r5 = -r9
            int r8 = r18.getHeight()
            float r8 = (float) r8
            float r5 = r5 / r8
            int r8 = r18.getWidth()
            float r8 = (float) r8
            float r11 = r11 / r8
            androidx.core.widget.C2123j.m5887b(r3, r5, r11)
            goto L_0x010f
        L_0x00eb:
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x0105
            r18.ensureBottomGlow()
            android.widget.EdgeEffect r3 = r0.mBottomGlow
            int r5 = r18.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            int r5 = r18.getWidth()
            float r5 = (float) r5
            float r11 = r11 / r5
            float r12 = r12 - r11
            androidx.core.widget.C2123j.m5887b(r3, r9, r12)
            goto L_0x010f
        L_0x0105:
            if (r3 != 0) goto L_0x010f
            int r3 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x010f
            int r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0112
        L_0x010f:
            androidx.core.p098j.C2043bi.m5519M(r18)
        L_0x0112:
            r18.considerReleasingGlowsOnScroll(r19, r20)
        L_0x0115:
            if (r7 != 0) goto L_0x011e
            if (r4 == 0) goto L_0x011b
            r7 = 0
            goto L_0x011e
        L_0x011b:
            r4 = 0
            r7 = 0
            goto L_0x0121
        L_0x011e:
            r0.dispatchOnScrolled(r7, r4)
        L_0x0121:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x012a
            r18.invalidate()
        L_0x012a:
            if (r10 != 0) goto L_0x0132
            if (r7 != 0) goto L_0x0132
            if (r4 == 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            return r6
        L_0x0132:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.RecyclerView.scrollByInternal(int, int, android.view.MotionEvent, int):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void scrollStep(int i, int i2, int[] iArr) {
        C0673gh ghVar;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C1901n.m5168a("RV Scroll");
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        C1901n.m5169b();
        int a = this.mChildHelper.mo2601a();
        for (int i3 = 0; i3 < a; i3++) {
            View d = this.mChildHelper.mo2604d(i3);
            C0673gh childViewHolder = getChildViewHolder(d);
            if (!(childViewHolder == null || (ghVar = childViewHolder.mShadowingHolder) == null)) {
                View view = ghVar.itemView;
                int left = d.getLeft();
                int top = d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            C0653fo foVar = this.mLayout;
            if (foVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            foVar.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (isComputingLayout()) {
            int i = 0;
            int a = accessibilityEvent != null ? C1982b.m5324a(accessibilityEvent) : 0;
            if (a != 0) {
                i = a;
            }
            this.mEatenAccessibilityChangeFlags |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public final void setAccessibilityDelegateCompat(C0675gj gjVar) {
        this.mAccessibilityDelegate = gjVar;
        C2043bi.m5526T(this, gjVar);
    }

    public void setAdapter(C0640fb fbVar) {
        suppressLayout(false);
        setAdapterInternal(fbVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public final void setChildImportantForAccessibilityInternal$ar$ds(C0673gh ghVar, int i) {
        if (isComputingLayout()) {
            ghVar.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(ghVar);
            return;
        }
        C2043bi.m5551ae(ghVar.itemView, i);
    }

    public final void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public final void setItemAnimator(C0646fh fhVar) {
        C0646fh fhVar2 = this.mItemAnimator;
        if (fhVar2 != null) {
            fhVar2.mo2688d();
            this.mItemAnimator.f2412l = null;
        }
        this.mItemAnimator = fhVar;
        if (fhVar != null) {
            fhVar.f2412l = this.mItemAnimatorListener$ar$class_merging;
        }
    }

    public void setLayoutManager(C0653fo foVar) {
        if (foVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                C0646fh fhVar = this.mItemAnimator;
                if (fhVar != null) {
                    fhVar.mo2688d();
                }
                this.mLayout.removeAndRecycleAllViews(this.mRecycler);
                this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
                this.mRecycler.mo3027d();
                if (this.mIsAttached) {
                    this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
                }
                this.mLayout.setRecyclerView((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.mo3027d();
            }
            C0550bt btVar = this.mChildHelper;
            btVar.f2141a.mo2596d();
            int size = btVar.f2142b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                btVar.f2143c.mo2862a((View) btVar.f2142b.get(size));
                btVar.f2142b.remove(size);
            }
            C0637ez ezVar = btVar.f2143c;
            int childCount = ezVar.f2402a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ezVar.f2402a.getChildAt(i);
                ezVar.f2402a.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            ezVar.f2402a.removeAllViews();
            this.mLayout = foVar;
            if (foVar != null) {
                if (foVar.mRecyclerView == null) {
                    this.mLayout.setRecyclerView(this);
                    if (this.mIsAttached) {
                        this.mLayout.dispatchAttachedToWindow(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + foVar + " is already attached to a RecyclerView:" + foVar.mRecyclerView.exceptionLabel());
                }
            }
            this.mRecycler.mo3038o();
            requestLayout();
        }
    }

    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public final void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo5279a(z);
    }

    /* access modifiers changed from: package-private */
    public final void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            C0653fo foVar = this.mLayout;
            if (foVar != null) {
                foVar.onScrollStateChanged(i);
            }
            List list = this.mScrollListeners;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((C0658ft) this.mScrollListeners.get(size)).onScrollStateChanged(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void smoothScrollBy$ar$ds$a5e2b4f9_0(int i, int i2, Interpolator interpolator, boolean z) {
        C0653fo foVar = this.mLayout;
        if (foVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i3 = 0;
            if (true != foVar.canScrollHorizontally()) {
                i = 0;
            }
            if (true != this.mLayout.canScrollVertically()) {
                i2 = 0;
            }
            if (i == 0) {
                if (i2 != 0) {
                    i = 0;
                } else {
                    return;
                }
            }
            if (z) {
                if (i != 0) {
                    i3 = 1;
                }
                if (i2 != 0) {
                    i3 |= 2;
                }
                getScrollingChildHelper().mo5286h(i3, 1);
            }
            this.mViewFlinger.mo3059c(i, i2, LinearLayoutManager.INVALID_OFFSET, interpolator);
        }
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            C0653fo foVar = this.mLayout;
            if (foVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                foVar.smoothScrollToPosition(this, this.mState, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo5286h(i, 0);
    }

    /* access modifiers changed from: package-private */
    public final void stopInterceptRequestLayout(boolean z) {
        int i = this.mInterceptRequestLayoutDepth;
        if (i <= 0) {
            this.mInterceptRequestLayoutDepth = 1;
            i = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (i == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().mo5280b(0);
    }

    public final void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public final void swapAdapter(C0640fb fbVar, boolean z) {
        suppressLayout(false);
        setAdapterInternal(fbVar, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$SavedState */
    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C0664fz();

        /* renamed from: a */
        Parcelable f1831a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1831a = parcel.readParcelable(classLoader == null ? C0653fo.class.getClassLoader() : classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeParcelable(this.f1831a, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.mObserver = new C0663fy(this);
        this.mRecycler = new C0661fw(this);
        this.mViewInfoStore = new C0756jj();
        this.mUpdateChildViewsRunnable = new C0633ev(this);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList();
        this.mOnItemTouchListeners = new ArrayList();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new C0568ck();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C0672gg(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C0589de() : null;
        this.mState = new C0670ge();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener$ar$class_merging = new C0647fi(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new C0634ew(this);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback$ar$class_merging = new C0636ey(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C2044bj.m5598a(viewConfiguration);
        this.mScaledVerticalScrollFactor = C2044bj.m5599b(viewConfiguration);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f2412l = this.mItemAnimatorListener$ar$class_merging;
        this.mAdapterHelper = new C0777w(new C0639fa(this));
        this.mChildHelper = new C0550bt(new C0637ez(this));
        if (C2043bi.m5576e(this) == 0) {
            C2043bi.m5552af(this, 8);
        }
        if (C2043bi.m5575d(this) == 0) {
            C2043bi.m5551ae(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0675gj(this));
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C0408a.f1383a, i2, 0);
        TypedArray typedArray = obtainStyledAttributes;
        C2043bi.m5525S(this, context, C0408a.f1383a, attributeSet, obtainStyledAttributes, i, 0);
        String string = typedArray.getString(8);
        if (typedArray.getInt(2, -1) == -1) {
            setDescendantFocusability(C89885b.HTTP_VALUE);
        }
        this.mClipToPadding = typedArray.getBoolean(1, true);
        if (typedArray.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArray.getDrawable(6);
            Drawable drawable = typedArray.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArray.getDrawable(4);
            Drawable drawable2 = typedArray.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(exceptionLabel()));
            }
            Resources resources = getContext().getResources();
            new C0583cz(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
        }
        typedArray.recycle();
        createLayoutManager$ar$ds(context2, string, attributeSet2, i2);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        C2043bi.m5525S(this, context, iArr, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        getScrollingChildHelper().mo5279a(z);
        setTag(R.id.is_pooling_container_tag, true);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0653fo foVar = this.mLayout;
        if (foVar != null) {
            return foVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(exceptionLabel()));
    }
}
