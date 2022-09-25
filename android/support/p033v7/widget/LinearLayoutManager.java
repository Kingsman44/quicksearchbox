package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.p041a.C0501k;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.widget.LinearLayoutManager */
/* compiled from: PG */
public class LinearLayoutManager extends C0653fo implements C0501k, C0668gc {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C0598dn mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C0599do mLayoutChunkResult;
    private C0600dp mLayoutState;
    int mOrientation;
    C0626eo mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* renamed from: android.support.v7.widget.LinearLayoutManager$SavedState */
    /* compiled from: PG */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0601dq();

        /* renamed from: a */
        int f1828a;

        /* renamed from: b */
        int f1829b;

        /* renamed from: c */
        boolean f1830c;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f1828a = parcel.readInt();
            this.f1829b = parcel.readInt();
            this.f1830c = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f1828a = savedState.f1828a;
            this.f1829b = savedState.f1829b;
            this.f1830c = savedState.f1830c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo2127a() {
            return this.f1828a >= 0;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1828a);
            parcel.writeInt(this.f1829b);
            parcel.writeInt(this.f1830c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(C0670ge geVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        C0626eo eoVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return C0681gp.m2385a(geVar, eoVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(C0670ge geVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        C0626eo eoVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return C0681gp.m2386b(geVar, eoVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(C0670ge geVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        C0626eo eoVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return C0681gp.m2387c(geVar, eoVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        if (this.mShouldReverseLayout) {
            return findFirstPartiallyOrCompletelyInvisibleChild();
        }
        return findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        if (this.mShouldReverseLayout) {
            return findLastPartiallyOrCompletelyInvisibleChild();
        }
        return findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i, C0661fw fwVar, C0670ge geVar, boolean z) {
        int f;
        int f2 = this.mOrientationHelper.mo2843f() - i;
        if (f2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-f2, fwVar, geVar);
        int i3 = i + i2;
        if (!z || (f = this.mOrientationHelper.mo2843f() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo2851n(f);
        return f + i2;
    }

    private int fixLayoutStartGap(int i, C0661fw fwVar, C0670ge geVar, boolean z) {
        int j;
        int j2 = i - this.mOrientationHelper.mo2847j();
        if (j2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(j2, fwVar, geVar);
        int i3 = i + i2;
        if (!z || (j = i3 - this.mOrientationHelper.mo2847j()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo2851n(-j);
        return i2 - j;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(C0661fw fwVar, C0670ge geVar, int i, int i2) {
        if (geVar.f2466k && getChildCount() != 0 && !geVar.f2462g && supportsPredictiveItemAnimations()) {
            List list = fwVar.f2434d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C0673gh ghVar = (C0673gh) list.get(i5);
                if (!ghVar.isRemoved()) {
                    if ((ghVar.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        i3 += this.mOrientationHelper.mo2839b(ghVar.itemView);
                    } else {
                        i4 += this.mOrientationHelper.mo2839b(ghVar.itemView);
                    }
                }
            }
            this.mLayoutState.f2331l = list;
            if (i3 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
                C0600dp dpVar = this.mLayoutState;
                dpVar.f2327h = i3;
                dpVar.f2322c = 0;
                dpVar.mo2789b((View) null);
                fill(fwVar, this.mLayoutState, geVar, false);
            }
            if (i4 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
                C0600dp dpVar2 = this.mLayoutState;
                dpVar2.f2327h = i4;
                dpVar2.f2322c = 0;
                dpVar2.mo2789b((View) null);
                fill(fwVar, this.mLayoutState, geVar, false);
            }
            this.mLayoutState.f2331l = null;
        }
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.mo2841d(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(C0661fw fwVar, C0600dp dpVar) {
        if (dpVar.f2320a && !dpVar.f2332m) {
            int i = dpVar.f2326g;
            int i2 = dpVar.f2328i;
            if (dpVar.f2325f == -1) {
                recycleViewsFromEnd(fwVar, i, i2);
            } else {
                recycleViewsFromStart(fwVar, i, i2);
            }
        }
    }

    private void recycleViewsFromEnd(C0661fw fwVar, int i, int i2) {
        int childCount = getChildCount();
        if (i >= 0) {
            int e = (this.mOrientationHelper.mo2842e() - i) + i2;
            if (this.mShouldReverseLayout) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (this.mOrientationHelper.mo2841d(childAt) < e || this.mOrientationHelper.mo2850m(childAt) < e) {
                        recycleChildren(fwVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.mOrientationHelper.mo2841d(childAt2) < e || this.mOrientationHelper.mo2850m(childAt2) < e) {
                    recycleChildren(fwVar, i4, i5);
                    return;
                }
            }
        }
    }

    private void recycleViewsFromStart(C0661fw fwVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int childCount = getChildCount();
            if (this.mShouldReverseLayout) {
                int i4 = childCount - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View childAt = getChildAt(i5);
                    if (this.mOrientationHelper.mo2838a(childAt) > i3 || this.mOrientationHelper.mo2849l(childAt) > i3) {
                        recycleChildren(fwVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (this.mOrientationHelper.mo2838a(childAt2) > i3 || this.mOrientationHelper.mo2849l(childAt2) > i3) {
                    recycleChildren(fwVar, 0, i6);
                    return;
                }
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        this.mShouldReverseLayout = (this.mOrientation == 1 || !isLayoutRTL()) ? this.mReverseLayout : !this.mReverseLayout;
    }

    private boolean updateAnchorFromChildren(C0661fw fwVar, C0670ge geVar, C0598dn dnVar) {
        View findReferenceChild;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            C0654fp fpVar = (C0654fp) focusedChild.getLayoutParams();
            if (!fpVar.f2420c.isRemoved() && fpVar.f2420c.getLayoutPosition() >= 0 && fpVar.f2420c.getLayoutPosition() < geVar.mo3052a()) {
                dnVar.mo2785c(focusedChild, getPosition(focusedChild));
                return true;
            }
        }
        boolean z2 = this.mLastStackFromEnd;
        boolean z3 = this.mStackFromEnd;
        if (z2 != z3 || (findReferenceChild = findReferenceChild(fwVar, geVar, dnVar.f2314d, z3)) == null) {
            return false;
        }
        dnVar.mo2784b(findReferenceChild, getPosition(findReferenceChild));
        if (!geVar.f2462g && supportsPredictiveItemAnimations()) {
            int d = this.mOrientationHelper.mo2841d(findReferenceChild);
            int a = this.mOrientationHelper.mo2838a(findReferenceChild);
            int j = this.mOrientationHelper.mo2847j();
            int f = this.mOrientationHelper.mo2843f();
            boolean z4 = a <= j && d < j;
            if (d >= f && a > f) {
                z = true;
            }
            if (z4 || z) {
                if (true == dnVar.f2314d) {
                    j = f;
                }
                dnVar.f2313c = j;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(C0670ge geVar, C0598dn dnVar) {
        int i;
        int i2;
        boolean z = false;
        if (!geVar.f2462g && (i = this.mPendingScrollPosition) != -1) {
            if (i < 0 || i >= geVar.mo3052a()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = INVALID_OFFSET;
            } else {
                int i3 = this.mPendingScrollPosition;
                dnVar.f2312b = i3;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.mo2127a()) {
                    boolean z2 = savedState.f1830c;
                    dnVar.f2314d = z2;
                    if (z2) {
                        dnVar.f2313c = this.mOrientationHelper.mo2843f() - this.mPendingSavedState.f1829b;
                    } else {
                        dnVar.f2313c = this.mOrientationHelper.mo2847j() + this.mPendingSavedState.f1829b;
                    }
                    return true;
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(i3);
                    if (findViewByPosition == null) {
                        if (getChildCount() > 0) {
                            if ((this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout) {
                                z = true;
                            }
                            dnVar.f2314d = z;
                        }
                        dnVar.mo2783a();
                    } else if (this.mOrientationHelper.mo2839b(findViewByPosition) > this.mOrientationHelper.mo2848k()) {
                        dnVar.mo2783a();
                        return true;
                    } else if (this.mOrientationHelper.mo2841d(findViewByPosition) - this.mOrientationHelper.mo2847j() < 0) {
                        dnVar.f2313c = this.mOrientationHelper.mo2847j();
                        dnVar.f2314d = false;
                        return true;
                    } else if (this.mOrientationHelper.mo2843f() - this.mOrientationHelper.mo2838a(findViewByPosition) < 0) {
                        dnVar.f2313c = this.mOrientationHelper.mo2843f();
                        dnVar.f2314d = true;
                        return true;
                    } else {
                        if (dnVar.f2314d) {
                            i2 = this.mOrientationHelper.mo2838a(findViewByPosition) + this.mOrientationHelper.mo2852o();
                        } else {
                            i2 = this.mOrientationHelper.mo2841d(findViewByPosition);
                        }
                        dnVar.f2313c = i2;
                    }
                    return true;
                } else {
                    boolean z3 = this.mShouldReverseLayout;
                    dnVar.f2314d = z3;
                    if (z3) {
                        dnVar.f2313c = this.mOrientationHelper.mo2843f() - this.mPendingScrollPositionOffset;
                    } else {
                        dnVar.f2313c = this.mOrientationHelper.mo2847j() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void updateAnchorInfoForLayout(C0661fw fwVar, C0670ge geVar, C0598dn dnVar) {
        if (!updateAnchorFromPendingData(geVar, dnVar) && !updateAnchorFromChildren(fwVar, geVar, dnVar)) {
            dnVar.mo2783a();
            dnVar.f2312b = this.mStackFromEnd ? geVar.mo3052a() - 1 : 0;
        }
    }

    private void updateLayoutState(int i, int i2, boolean z, C0670ge geVar) {
        int i3;
        this.mLayoutState.f2332m = resolveIsInfinite();
        this.mLayoutState.f2325f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(geVar, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        C0600dp dpVar = this.mLayoutState;
        int i5 = i == 1 ? max2 : max;
        dpVar.f2327h = i5;
        if (i != 1) {
            max = max2;
        }
        dpVar.f2328i = max;
        if (i == 1) {
            dpVar.f2327h = i5 + this.mOrientationHelper.mo2844g();
            View childClosestToEnd = getChildClosestToEnd();
            C0600dp dpVar2 = this.mLayoutState;
            if (true == this.mShouldReverseLayout) {
                i4 = -1;
            }
            dpVar2.f2324e = i4;
            int position = getPosition(childClosestToEnd);
            C0600dp dpVar3 = this.mLayoutState;
            dpVar2.f2323d = position + dpVar3.f2324e;
            dpVar3.f2321b = this.mOrientationHelper.mo2838a(childClosestToEnd);
            i3 = this.mOrientationHelper.mo2838a(childClosestToEnd) - this.mOrientationHelper.mo2843f();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.f2327h += this.mOrientationHelper.mo2847j();
            C0600dp dpVar4 = this.mLayoutState;
            if (true != this.mShouldReverseLayout) {
                i4 = -1;
            }
            dpVar4.f2324e = i4;
            int position2 = getPosition(childClosestToStart);
            C0600dp dpVar5 = this.mLayoutState;
            dpVar4.f2323d = position2 + dpVar5.f2324e;
            dpVar5.f2321b = this.mOrientationHelper.mo2841d(childClosestToStart);
            i3 = (-this.mOrientationHelper.mo2841d(childClosestToStart)) + this.mOrientationHelper.mo2847j();
        }
        C0600dp dpVar6 = this.mLayoutState;
        dpVar6.f2322c = i2;
        if (z) {
            dpVar6.f2322c = i2 - i3;
        }
        dpVar6.f2326g = i3;
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.f2322c = this.mOrientationHelper.mo2843f() - i2;
        C0600dp dpVar = this.mLayoutState;
        dpVar.f2324e = true != this.mShouldReverseLayout ? 1 : -1;
        dpVar.f2323d = i;
        dpVar.f2325f = 1;
        dpVar.f2321b = i2;
        dpVar.f2326g = INVALID_OFFSET;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.f2322c = i2 - this.mOrientationHelper.mo2847j();
        C0600dp dpVar = this.mLayoutState;
        dpVar.f2323d = i;
        int i3 = 1;
        if (true != this.mShouldReverseLayout) {
            i3 = -1;
        }
        dpVar.f2324e = i3;
        dpVar.f2325f = -1;
        dpVar.f2321b = i2;
        dpVar.f2326g = INVALID_OFFSET;
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* access modifiers changed from: protected */
    public void calculateExtraLayoutSpace(C0670ge geVar, int[] iArr) {
        int extraLayoutSpace = getExtraLayoutSpace(geVar);
        int i = this.mLayoutState.f2325f;
        int i2 = i == -1 ? 0 : extraLayoutSpace;
        if (i != -1) {
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i2;
    }

    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, C0670ge geVar, C0651fm fmVar) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            ensureLayoutState();
            updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, geVar);
            collectPrefetchPositionsForLayoutState(geVar, this.mLayoutState, fmVar);
        }
    }

    public void collectPrefetchPositionsForLayoutState(C0670ge geVar, C0600dp dpVar, C0651fm fmVar) {
        int i = dpVar.f2323d;
        if (i >= 0 && i < geVar.mo3052a()) {
            fmVar.mo2729a(i, Math.max(0, dpVar.f2326g));
        }
    }

    public int computeHorizontalScrollExtent(C0670ge geVar) {
        return computeScrollExtent(geVar);
    }

    public int computeHorizontalScrollOffset(C0670ge geVar) {
        return computeScrollOffset(geVar);
    }

    public int computeHorizontalScrollRange(C0670ge geVar) {
        return computeScrollRange(geVar);
    }

    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayout) {
            i2 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    public int computeVerticalScrollExtent(C0670ge geVar) {
        return computeScrollExtent(geVar);
    }

    public int computeVerticalScrollOffset(C0670ge geVar) {
        return computeScrollOffset(geVar);
    }

    public int computeVerticalScrollRange(C0670ge geVar) {
        return computeScrollRange(geVar);
    }

    public C0600dp createLayoutState() {
        return new C0600dp();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(C0661fw fwVar, C0600dp dpVar, C0670ge geVar, boolean z) {
        int i = dpVar.f2322c;
        int i2 = dpVar.f2326g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                dpVar.f2326g = i2 + i;
            }
            recycleByLayoutState(fwVar, dpVar);
        }
        int i3 = dpVar.f2322c + dpVar.f2327h;
        C0599do doVar = this.mLayoutChunkResult;
        while (true) {
            if ((!dpVar.f2332m && i3 <= 0) || !dpVar.mo2790c(geVar)) {
                break;
            }
            doVar.f2316a = 0;
            doVar.f2317b = false;
            doVar.f2318c = false;
            doVar.f2319d = false;
            layoutChunk(fwVar, geVar, dpVar, doVar);
            if (!doVar.f2317b) {
                int i4 = dpVar.f2321b;
                int i5 = doVar.f2316a;
                dpVar.f2321b = i4 + (dpVar.f2325f * i5);
                if (!doVar.f2318c || dpVar.f2331l != null || !geVar.f2462g) {
                    dpVar.f2322c -= i5;
                    i3 -= i5;
                }
                int i6 = dpVar.f2326g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    dpVar.f2326g = i7;
                    int i8 = dpVar.f2322c;
                    if (i8 < 0) {
                        dpVar.f2326g = i7 + i8;
                    }
                    recycleByLayoutState(fwVar, dpVar);
                }
                if (z && doVar.f2319d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - dpVar.f2322c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        int d = this.mOrientationHelper.mo2841d(getChildAt(i));
        int j = this.mOrientationHelper.mo2847j();
        int i3 = d < j ? 16388 : 4097;
        int i4 = d < j ? 16644 : 4161;
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.mo3261a(i, i2, i4, i3);
        }
        return this.mVerticalBoundCheck.mo3261a(i, i2, i4, i3);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = 320;
        int i4 = true != z ? 320 : 24579;
        if (true != z2) {
            i3 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.mo3261a(i, i2, i4, i3);
        }
        return this.mVerticalBoundCheck.mo3261a(i, i2, i4, i3);
    }

    public View findReferenceChild(C0661fw fwVar, C0670ge geVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z2) {
            i2 = -1;
            i3 = getChildCount() - 1;
            i = -1;
        } else {
            i2 = childCount;
            i3 = 0;
            i = 1;
        }
        int a = geVar.mo3052a();
        int j = this.mOrientationHelper.mo2847j();
        int f = this.mOrientationHelper.mo2843f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i2) {
            View childAt = getChildAt(i3);
            int position = getPosition(childAt);
            int d = this.mOrientationHelper.mo2841d(childAt);
            int a2 = this.mOrientationHelper.mo2838a(childAt);
            if (position >= 0 && position < a) {
                if (!((C0654fp) childAt.getLayoutParams()).f2420c.isRemoved()) {
                    boolean z3 = a2 <= j && d < j;
                    boolean z4 = d >= f && a2 > f;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = childAt;
                    }
                    view2 = childAt;
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i3 += i;
        }
        if (view != null) {
            return view;
        }
        return view2 == null ? view3 : view2;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public C0654fp generateDefaultLayoutParams() {
        return new C0654fp(-2, -2);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public int getExtraLayoutSpace(C0670ge geVar) {
        if (geVar.f2456a != -1) {
            return this.mOrientationHelper.mo2848k();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(C0661fw fwVar, C0670ge geVar, C0600dp dpVar, C0599do doVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = dpVar.mo2788a(fwVar);
        if (a == null) {
            doVar.f2317b = true;
            return;
        }
        C0654fp fpVar = (C0654fp) a.getLayoutParams();
        if (dpVar.f2331l == null) {
            if (this.mShouldReverseLayout == (dpVar.f2325f == -1)) {
                addView(a);
            } else {
                addView(a, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (dpVar.f2325f == -1)) {
                addDisappearingView(a);
            } else {
                addDisappearingView(a, 0);
            }
        }
        measureChildWithMargins(a, 0, 0);
        doVar.f2316a = this.mOrientationHelper.mo2839b(a);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                i5 = getWidth() - getPaddingRight();
                i4 = i5 - this.mOrientationHelper.mo2840c(a);
            } else {
                i4 = getPaddingLeft();
                i5 = this.mOrientationHelper.mo2840c(a) + i4;
            }
            if (dpVar.f2325f == -1) {
                int i6 = dpVar.f2321b;
                i = i6;
                i2 = i5;
                i3 = i6 - doVar.f2316a;
            } else {
                int i7 = dpVar.f2321b;
                i3 = i7;
                i2 = i5;
                i = doVar.f2316a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int c = this.mOrientationHelper.mo2840c(a) + paddingTop;
            if (dpVar.f2325f == -1) {
                int i8 = dpVar.f2321b;
                i2 = i8;
                i3 = paddingTop;
                i = c;
                i4 = i8 - doVar.f2316a;
            } else {
                int i9 = dpVar.f2321b;
                i3 = paddingTop;
                i2 = doVar.f2316a + i9;
                i = c;
                i4 = i9;
            }
        }
        layoutDecoratedWithMargins(a, i4, i3, i2, i);
        if (fpVar.f2420c.isRemoved() || fpVar.f2420c.isUpdated()) {
            doVar.f2318c = true;
        }
        doVar.f2319d = a.hasFocusable();
    }

    public void onAnchorReady(C0661fw fwVar, C0670ge geVar, C0598dn dnVar, int i) {
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, C0661fw fwVar) {
        super.onDetachedFromWindow(recyclerView, fwVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(fwVar);
            fwVar.mo3027d();
        }
    }

    public View onFocusSearchFailed(View view, int i, C0661fw fwVar, C0670ge geVar) {
        int convertFocusDirectionToLayoutDirection;
        View view2;
        View view3;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (((float) this.mOrientationHelper.mo2848k()) * MAX_SCROLL_FACTOR), false, geVar);
        C0600dp dpVar = this.mLayoutState;
        dpVar.f2326g = INVALID_OFFSET;
        dpVar.f2320a = false;
        fill(fwVar, dpVar, geVar, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            view3 = getChildClosestToStart();
        } else {
            view3 = getChildClosestToEnd();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    public void onLayoutChildren(C0661fw fwVar, C0670ge geVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View findViewByPosition;
        int i7;
        int i8 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && geVar.mo3052a() == 0) {
            removeAndRecycleAllViews(fwVar);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.mo2127a()) {
            this.mPendingScrollPosition = savedState.f1828a;
        }
        ensureLayoutState();
        this.mLayoutState.f2320a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        C0598dn dnVar = this.mAnchorInfo;
        if (!dnVar.f2315e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            dnVar.mo2786d();
            C0598dn dnVar2 = this.mAnchorInfo;
            dnVar2.f2314d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(fwVar, geVar, dnVar2);
            this.mAnchorInfo.f2315e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo2841d(focusedChild) >= this.mOrientationHelper.mo2843f() || this.mOrientationHelper.mo2838a(focusedChild) <= this.mOrientationHelper.mo2847j())) {
            this.mAnchorInfo.mo2785c(focusedChild, getPosition(focusedChild));
        }
        C0600dp dpVar = this.mLayoutState;
        dpVar.f2325f = dpVar.f2330k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(geVar, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.mo2847j();
        int max2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.mo2844g();
        if (!(!geVar.f2462g || (i6 = this.mPendingScrollPosition) == -1 || this.mPendingScrollPositionOffset == Integer.MIN_VALUE || (findViewByPosition = findViewByPosition(i6)) == null)) {
            if (this.mShouldReverseLayout) {
                i7 = (this.mOrientationHelper.mo2843f() - this.mOrientationHelper.mo2838a(findViewByPosition)) - this.mPendingScrollPositionOffset;
            } else {
                i7 = this.mPendingScrollPositionOffset - (this.mOrientationHelper.mo2841d(findViewByPosition) - this.mOrientationHelper.mo2847j());
            }
            if (i7 > 0) {
                max += i7;
            } else {
                max2 -= i7;
            }
        }
        C0598dn dnVar3 = this.mAnchorInfo;
        if (!dnVar3.f2314d ? true != this.mShouldReverseLayout : true == this.mShouldReverseLayout) {
            i8 = 1;
        }
        onAnchorReady(fwVar, geVar, dnVar3, i8);
        detachAndScrapAttachedViews(fwVar);
        this.mLayoutState.f2332m = resolveIsInfinite();
        C0600dp dpVar2 = this.mLayoutState;
        dpVar2.f2329j = geVar.f2462g;
        dpVar2.f2328i = 0;
        C0598dn dnVar4 = this.mAnchorInfo;
        if (dnVar4.f2314d) {
            updateLayoutStateToFillStart(dnVar4);
            C0600dp dpVar3 = this.mLayoutState;
            dpVar3.f2327h = max;
            fill(fwVar, dpVar3, geVar, false);
            C0600dp dpVar4 = this.mLayoutState;
            i2 = dpVar4.f2321b;
            int i9 = dpVar4.f2323d;
            int i10 = dpVar4.f2322c;
            if (i10 > 0) {
                max2 += i10;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            C0600dp dpVar5 = this.mLayoutState;
            dpVar5.f2327h = max2;
            dpVar5.f2323d += dpVar5.f2324e;
            fill(fwVar, dpVar5, geVar, false);
            C0600dp dpVar6 = this.mLayoutState;
            i = dpVar6.f2321b;
            int i11 = dpVar6.f2322c;
            if (i11 > 0) {
                updateLayoutStateToFillStart(i9, i2);
                C0600dp dpVar7 = this.mLayoutState;
                dpVar7.f2327h = i11;
                fill(fwVar, dpVar7, geVar, false);
                i2 = this.mLayoutState.f2321b;
            }
        } else {
            updateLayoutStateToFillEnd(dnVar4);
            C0600dp dpVar8 = this.mLayoutState;
            dpVar8.f2327h = max2;
            fill(fwVar, dpVar8, geVar, false);
            C0600dp dpVar9 = this.mLayoutState;
            i = dpVar9.f2321b;
            int i12 = dpVar9.f2323d;
            int i13 = dpVar9.f2322c;
            if (i13 > 0) {
                max += i13;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            C0600dp dpVar10 = this.mLayoutState;
            dpVar10.f2327h = max;
            dpVar10.f2323d += dpVar10.f2324e;
            fill(fwVar, dpVar10, geVar, false);
            C0600dp dpVar11 = this.mLayoutState;
            i2 = dpVar11.f2321b;
            int i14 = dpVar11.f2322c;
            if (i14 > 0) {
                updateLayoutStateToFillEnd(i12, i);
                C0600dp dpVar12 = this.mLayoutState;
                dpVar12.f2327h = i14;
                fill(fwVar, dpVar12, geVar, false);
                i = this.mLayoutState.f2321b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap = fixLayoutEndGap(i, fwVar, geVar, true);
                int i15 = i2 + fixLayoutEndGap;
                i4 = fixLayoutStartGap(i15, fwVar, geVar, false);
                i5 = i15 + i4;
                i3 = i + fixLayoutEndGap;
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i2, fwVar, geVar, true);
                i3 = i + fixLayoutStartGap;
                i4 = fixLayoutEndGap(i3, fwVar, geVar, false);
                i5 = i2 + fixLayoutStartGap + i4;
            }
            i = i3 + i4;
        }
        layoutForPredictiveAnimations(fwVar, geVar, i2, i);
        if (!geVar.f2462g) {
            C0626eo eoVar = this.mOrientationHelper;
            eoVar.f2387b = eoVar.mo2848k();
        } else {
            this.mAnchorInfo.mo2786d();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    public void onLayoutCompleted(C0670ge geVar) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mAnchorInfo.mo2786d();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.f1828a = -1;
            }
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState2.f1830c = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState2.f1829b = this.mOrientationHelper.mo2843f() - this.mOrientationHelper.mo2838a(childClosestToEnd);
                savedState2.f1828a = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState2.f1828a = getPosition(childClosestToStart);
                savedState2.f1829b = this.mOrientationHelper.mo2841d(childClosestToStart) - this.mOrientationHelper.mo2847j();
            }
        } else {
            savedState2.f1828a = -1;
        }
        return savedState2;
    }

    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c = position < position2 ? (char) 1 : 65535;
        if (this.mShouldReverseLayout) {
            if (c == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo2843f() - (this.mOrientationHelper.mo2841d(view2) + this.mOrientationHelper.mo2839b(view)));
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo2843f() - this.mOrientationHelper.mo2838a(view2));
            }
        } else if (c == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo2841d(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo2838a(view2) - this.mOrientationHelper.mo2839b(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo2845h() == 0 && this.mOrientationHelper.mo2842e() == 0;
    }

    public int scrollBy(int i, C0661fw fwVar, C0670ge geVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f2320a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        updateLayoutState(i2, abs, true, geVar);
        C0600dp dpVar = this.mLayoutState;
        int fill = dpVar.f2326g + fill(fwVar, dpVar, geVar, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.mo2851n(-i);
        this.mLayoutState.f2330k = i;
        return i;
    }

    public int scrollHorizontallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, fwVar, geVar);
    }

    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f1828a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f1828a = -1;
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, fwVar, geVar);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (z != this.mReverseLayout) {
            this.mReverseLayout = z;
            requestLayout();
        }
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (this.mStackFromEnd != z) {
            this.mStackFromEnd = z;
            requestLayout();
        }
    }

    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, C0670ge geVar, int i) {
        C0602dr drVar = new C0602dr(recyclerView.getContext());
        drVar.f2449g = i;
        startSmoothScroll(drVar);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    /* access modifiers changed from: package-private */
    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() > 0) {
            boolean z = false;
            int position = getPosition(getChildAt(0));
            int d = this.mOrientationHelper.mo2841d(getChildAt(0));
            if (this.mShouldReverseLayout) {
                int i = 1;
                while (i < getChildCount()) {
                    View childAt = getChildAt(i);
                    int position2 = getPosition(childAt);
                    int d2 = this.mOrientationHelper.mo2841d(childAt);
                    if (position2 < position) {
                        logChildren();
                        StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                        if (d2 < d) {
                            z = true;
                        }
                        sb.append(z);
                        throw new RuntimeException(sb.toString());
                    } else if (d2 <= d) {
                        i++;
                    } else {
                        logChildren();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            int i2 = 1;
            while (i2 < getChildCount()) {
                View childAt2 = getChildAt(i2);
                int position3 = getPosition(childAt2);
                int d3 = this.mOrientationHelper.mo2841d(childAt2);
                if (position3 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    if (d3 < d) {
                        z = true;
                    }
                    sb2.append(z);
                    throw new RuntimeException(sb2.toString());
                } else if (d3 >= d) {
                    i2++;
                } else {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0598dn();
        this.mLayoutChunkResult = new C0599do();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    private void recycleChildren(C0661fw fwVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                while (true) {
                    i2--;
                    if (i2 >= i) {
                        removeAndRecycleViewAt(i2, fwVar);
                    } else {
                        return;
                    }
                }
            } else {
                while (i > i2) {
                    removeAndRecycleViewAt(i, fwVar);
                    i--;
                }
            }
        }
    }

    public void collectInitialPrefetchPositions(int i, C0651fm fmVar) {
        boolean z;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        int i3 = -1;
        if (savedState == null || !savedState.mo2127a()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.f1830c;
            i2 = savedState.f1828a;
        }
        if (true != z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            fmVar.mo2729a(i2, 0);
            i2 += i3;
        }
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && this.mOrientation == 1) {
                        return 1;
                    }
                    return INVALID_OFFSET;
                } else if (this.mOrientation == 0) {
                    return 1;
                } else {
                    return INVALID_OFFSET;
                }
            } else if (this.mOrientation == 1) {
                return -1;
            } else {
                return INVALID_OFFSET;
            }
        } else if (this.mOrientation == 0) {
            return -1;
        } else {
            return INVALID_OFFSET;
        }
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i != this.mOrientation || this.mOrientationHelper == null) {
                C0626eo p = C0626eo.m2232p(this, i);
                this.mOrientationHelper = p;
                this.mAnchorInfo.f2311a = p;
                this.mOrientation = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0598dn();
        this.mLayoutChunkResult = new C0599do();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        C0652fn properties = getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f2416a);
        setReverseLayout(properties.f2418c);
        setStackFromEnd(properties.f2419d);
    }

    private void updateLayoutStateToFillEnd(C0598dn dnVar) {
        updateLayoutStateToFillEnd(dnVar.f2312b, dnVar.f2313c);
    }

    private void updateLayoutStateToFillStart(C0598dn dnVar) {
        updateLayoutStateToFillStart(dnVar.f2312b, dnVar.f2313c);
    }
}
