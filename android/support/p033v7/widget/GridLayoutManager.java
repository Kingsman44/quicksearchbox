package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.p098j.p099a.C1990j;
import androidx.core.p098j.p099a.C1991k;
import java.util.Arrays;

/* renamed from: android.support.v7.widget.GridLayoutManager */
/* compiled from: PG */
public class GridLayoutManager extends LinearLayoutManager {
    int[] mCachedBorders;
    final Rect mDecorInsets = new Rect();
    boolean mPendingSpanCountChange = false;
    final SparseIntArray mPreLayoutSpanIndexCache = new SparseIntArray();
    final SparseIntArray mPreLayoutSpanSizeCache = new SparseIntArray();
    View[] mSet;
    public int mSpanCount = -1;
    public C0594dj mSpanSizeLookup = new C0592dh();

    public GridLayoutManager(Context context, int i) {
        super(context);
        setSpanCount(i);
    }

    private final void calculateItemBorders(int i) {
        int i2;
        int length;
        int[] iArr = this.mCachedBorders;
        int i3 = this.mSpanCount;
        if (!(iArr != null && (length = iArr.length) == i3 + 1 && iArr[length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.mCachedBorders = iArr;
    }

    private final void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    private final int getSpanGroupIndex(C0661fw fwVar, C0670ge geVar, int i) {
        if (!geVar.f2462g) {
            return this.mSpanSizeLookup.getSpanGroupIndex(i, this.mSpanCount);
        }
        int a = fwVar.mo3024a(i);
        if (a != -1) {
            return this.mSpanSizeLookup.getSpanGroupIndex(a, this.mSpanCount);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    private final int getSpanIndex(C0661fw fwVar, C0670ge geVar, int i) {
        if (!geVar.f2462g) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i, this.mSpanCount);
        }
        int i2 = this.mPreLayoutSpanIndexCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = fwVar.mo3024a(i);
        if (a != -1) {
            return this.mSpanSizeLookup.getCachedSpanIndex(a, this.mSpanCount);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    private final int getSpanSize(C0661fw fwVar, C0670ge geVar, int i) {
        if (!geVar.f2462g) {
            return this.mSpanSizeLookup.getSpanSize(i);
        }
        int i2 = this.mPreLayoutSpanSizeCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = fwVar.mo3024a(i);
        if (a != -1) {
            return this.mSpanSizeLookup.getSpanSize(a);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    private final void measureChild(View view, int i, boolean z) {
        int i2;
        int i3;
        C0593di diVar = (C0593di) view.getLayoutParams();
        Rect rect = diVar.f2421d;
        int i4 = rect.top + rect.bottom + diVar.topMargin + diVar.bottomMargin;
        int i5 = rect.left + rect.right + diVar.leftMargin + diVar.rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(diVar.f2300a, diVar.f2301b);
        if (this.mOrientation == 1) {
            i2 = getChildMeasureSpec(spaceForSpanRange, i, i5, diVar.width, false);
            i3 = getChildMeasureSpec(this.mOrientationHelper.mo2848k(), getHeightMode(), i4, diVar.height, true);
        } else {
            int childMeasureSpec = getChildMeasureSpec(spaceForSpanRange, i, i4, diVar.height, false);
            int childMeasureSpec2 = getChildMeasureSpec(this.mOrientationHelper.mo2848k(), getWidthMode(), i5, diVar.width, true);
            i3 = childMeasureSpec;
            i2 = childMeasureSpec2;
        }
        measureChildWithDecorationsAndMargin(view, i2, i3, z);
    }

    private final void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        boolean z2;
        C0654fp fpVar = (C0654fp) view.getLayoutParams();
        if (z) {
            z2 = shouldReMeasureChild(view, i, i2, fpVar);
        } else {
            z2 = shouldMeasureChild(view, i, i2, fpVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    private final void updateMeasurements() {
        int i;
        int i2;
        if (getOrientation() == 1) {
            i2 = getWidth() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = getHeight() - getPaddingBottom();
            i = getPaddingTop();
        }
        calculateItemBorders(i2 - i);
    }

    public final boolean checkLayoutParams(C0654fp fpVar) {
        return fpVar instanceof C0593di;
    }

    public final void collectPrefetchPositionsForLayoutState(C0670ge geVar, C0600dp dpVar, C0651fm fmVar) {
        int i = this.mSpanCount;
        for (int i2 = 0; i2 < this.mSpanCount && dpVar.mo2790c(geVar) && i > 0; i2++) {
            int i3 = dpVar.f2323d;
            fmVar.mo2729a(i3, Math.max(0, dpVar.f2326g));
            i -= this.mSpanSizeLookup.getSpanSize(i3);
            dpVar.f2323d += dpVar.f2324e;
        }
    }

    public final View findReferenceChild(C0661fw fwVar, C0670ge geVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int childCount = getChildCount();
        if (z2) {
            i = -1;
            i2 = getChildCount() - 1;
            i3 = -1;
        } else {
            i3 = 1;
            i = childCount;
            i2 = 0;
        }
        int a = geVar.mo3052a();
        ensureLayoutState();
        int j = this.mOrientationHelper.mo2847j();
        int f = this.mOrientationHelper.mo2843f();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            if (position >= 0 && position < a && getSpanIndex(fwVar, geVar, position) == 0) {
                if (((C0654fp) childAt.getLayoutParams()).f2420c.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.mo2841d(childAt) < f && this.mOrientationHelper.mo2838a(childAt) >= j) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    public final C0654fp generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new C0593di(-2, -1);
        }
        return new C0593di(-1, -2);
    }

    public final C0654fp generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0593di(context, attributeSet);
    }

    public final int getColumnCountForAccessibility(C0661fw fwVar, C0670ge geVar) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        if (geVar.mo3052a() <= 0) {
            return 0;
        }
        return getSpanGroupIndex(fwVar, geVar, geVar.mo3052a() - 1) + 1;
    }

    public int getRowCountForAccessibility(C0661fw fwVar, C0670ge geVar) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        if (geVar.mo3052a() <= 0) {
            return 0;
        }
        return getSpanGroupIndex(fwVar, geVar, geVar.mo3052a() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    public final int getSpaceForSpanRange(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.mCachedBorders;
        int i3 = this.mSpanCount - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    public final void layoutChunk(C0661fw fwVar, C0670ge geVar, C0600dp dpVar, C0599do doVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z;
        View a;
        C0661fw fwVar2 = fwVar;
        C0670ge geVar2 = geVar;
        C0600dp dpVar2 = dpVar;
        C0599do doVar2 = doVar;
        int i14 = this.mOrientationHelper.mo2846i();
        boolean z2 = i14 != 1073741824;
        int i15 = getChildCount() > 0 ? this.mCachedBorders[this.mSpanCount] : 0;
        if (z2) {
            updateMeasurements();
        }
        int i16 = dpVar2.f2324e;
        int i17 = this.mSpanCount;
        if (i16 != 1) {
            i17 = getSpanIndex(fwVar2, geVar2, dpVar2.f2323d) + getSpanSize(fwVar2, geVar2, dpVar2.f2323d);
        }
        int i18 = 0;
        while (i18 < this.mSpanCount && dpVar2.mo2790c(geVar2) && i17 > 0) {
            int i19 = dpVar2.f2323d;
            int spanSize = getSpanSize(fwVar2, geVar2, i19);
            if (spanSize <= this.mSpanCount) {
                i17 -= spanSize;
                if (i17 < 0 || (a = dpVar2.mo2788a(fwVar2)) == null) {
                    break;
                }
                this.mSet[i18] = a;
                i18++;
            } else {
                throw new IllegalArgumentException("Item at position " + i19 + " requires " + spanSize + " spans but GridLayoutManager has only " + this.mSpanCount + " spans.");
            }
        }
        if (i18 != 0) {
            if (i16 == 1) {
                i2 = i18;
                i3 = 0;
                i = 1;
            } else {
                i3 = i18 - 1;
                i2 = -1;
                i = -1;
            }
            int i20 = 0;
            while (i3 != i2) {
                View view = this.mSet[i3];
                C0593di diVar = (C0593di) view.getLayoutParams();
                int spanSize2 = getSpanSize(fwVar2, geVar2, getPosition(view));
                diVar.f2301b = spanSize2;
                diVar.f2300a = i20;
                i20 += spanSize2;
                i3 += i;
            }
            float f = 0.0f;
            int i21 = 0;
            for (int i22 = 0; i22 < i18; i22++) {
                View view2 = this.mSet[i22];
                if (dpVar2.f2331l != null) {
                    z = false;
                    if (i16 == 1) {
                        addDisappearingView(view2);
                    } else {
                        addDisappearingView(view2, 0);
                    }
                } else if (i16 == 1) {
                    addView(view2);
                    z = false;
                } else {
                    z = false;
                    addView(view2, 0);
                }
                calculateItemDecorationsForChild(view2, this.mDecorInsets);
                measureChild(view2, i14, z);
                int b = this.mOrientationHelper.mo2839b(view2);
                if (b > i21) {
                    i21 = b;
                }
                float c = ((float) this.mOrientationHelper.mo2840c(view2)) / ((float) ((C0593di) view2.getLayoutParams()).f2301b);
                if (c > f) {
                    f = c;
                }
            }
            if (z2) {
                calculateItemBorders(Math.max(Math.round(f * ((float) this.mSpanCount)), i15));
                i21 = 0;
                for (int i23 = 0; i23 < i18; i23++) {
                    View view3 = this.mSet[i23];
                    measureChild(view3, 1073741824, true);
                    int b2 = this.mOrientationHelper.mo2839b(view3);
                    if (b2 > i21) {
                        i21 = b2;
                    }
                }
            }
            for (int i24 = 0; i24 < i18; i24++) {
                View view4 = this.mSet[i24];
                if (this.mOrientationHelper.mo2839b(view4) != i21) {
                    C0593di diVar2 = (C0593di) view4.getLayoutParams();
                    Rect rect = diVar2.f2421d;
                    int i25 = rect.top + rect.bottom + diVar2.topMargin + diVar2.bottomMargin;
                    int i26 = rect.left + rect.right + diVar2.leftMargin + diVar2.rightMargin;
                    int spaceForSpanRange = getSpaceForSpanRange(diVar2.f2300a, diVar2.f2301b);
                    if (this.mOrientation == 1) {
                        i13 = getChildMeasureSpec(spaceForSpanRange, 1073741824, i26, diVar2.width, false);
                        i12 = View.MeasureSpec.makeMeasureSpec(i21 - i25, 1073741824);
                    } else {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i26, 1073741824);
                        i12 = getChildMeasureSpec(spaceForSpanRange, 1073741824, i25, diVar2.height, false);
                        i13 = makeMeasureSpec;
                    }
                    measureChildWithDecorationsAndMargin(view4, i13, i12, true);
                }
            }
            int i27 = 0;
            doVar2.f2316a = i21;
            if (this.mOrientation == 1) {
                if (dpVar2.f2325f == -1) {
                    int i28 = dpVar2.f2321b;
                    i7 = i28 - i21;
                    i6 = i28;
                } else {
                    int i29 = dpVar2.f2321b;
                    i6 = i29 + i21;
                    i7 = i29;
                }
                i5 = 0;
                i4 = 0;
            } else if (dpVar2.f2325f == -1) {
                i4 = dpVar2.f2321b;
                i5 = i4 - i21;
                i7 = 0;
                i6 = 0;
            } else {
                int i30 = dpVar2.f2321b;
                i5 = i30;
                i6 = 0;
                i4 = i30 + i21;
                i7 = 0;
            }
            while (i27 < i18) {
                View view5 = this.mSet[i27];
                C0593di diVar3 = (C0593di) view5.getLayoutParams();
                if (this.mOrientation != 1) {
                    int paddingTop = getPaddingTop() + this.mCachedBorders[diVar3.f2300a];
                    i11 = paddingTop;
                    i9 = i5;
                    i8 = i4;
                    i10 = this.mOrientationHelper.mo2840c(view5) + paddingTop;
                } else if (isLayoutRTL()) {
                    int paddingLeft = getPaddingLeft() + this.mCachedBorders[this.mSpanCount - diVar3.f2300a];
                    i11 = i7;
                    i10 = i6;
                    i8 = paddingLeft;
                    i9 = paddingLeft - this.mOrientationHelper.mo2840c(view5);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.mCachedBorders[diVar3.f2300a];
                    i11 = i7;
                    i10 = i6;
                    i9 = paddingLeft2;
                    i8 = this.mOrientationHelper.mo2840c(view5) + paddingLeft2;
                }
                layoutDecoratedWithMargins(view5, i9, i11, i8, i10);
                if (diVar3.f2420c.isRemoved() || diVar3.f2420c.isUpdated()) {
                    doVar2.f2318c = true;
                }
                doVar2.f2319d |= view5.hasFocusable();
                i27++;
                i7 = i11;
                i6 = i10;
                i5 = i9;
                i4 = i8;
            }
            Arrays.fill(this.mSet, (Object) null);
            return;
        }
        doVar2.f2317b = true;
    }

    public final void onAnchorReady(C0661fw fwVar, C0670ge geVar, C0598dn dnVar, int i) {
        updateMeasurements();
        if (geVar.mo3052a() > 0 && !geVar.f2462g) {
            int spanIndex = getSpanIndex(fwVar, geVar, dnVar.f2312b);
            if (i == 1) {
                while (spanIndex > 0) {
                    int i2 = dnVar.f2312b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    dnVar.f2312b = i3;
                    spanIndex = getSpanIndex(fwVar, geVar, i3);
                }
            } else {
                int a = geVar.mo3052a() - 1;
                int i4 = dnVar.f2312b;
                while (i4 < a) {
                    int i5 = i4 + 1;
                    int spanIndex2 = getSpanIndex(fwVar, geVar, i5);
                    if (spanIndex2 <= spanIndex) {
                        break;
                    }
                    i4 = i5;
                    spanIndex = spanIndex2;
                }
                dnVar.f2312b = i4;
            }
        }
        ensureViewSet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
        if (r13 != (r2 > r15)) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f0, code lost:
        if (r13 != r14) goto L_0x0128;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onFocusSearchFailed(android.view.View r23, int r24, android.support.p033v7.widget.C0661fw r25, android.support.p033v7.widget.C0670ge r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.findContainingItemView(r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.di r5 = (android.support.p033v7.widget.C0593di) r5
            int r6 = r5.f2300a
            int r5 = r5.f2301b
            int r5 = r5 + r6
            android.view.View r7 = super.onFocusSearchFailed(r23, r24, r25, r26)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r24
            int r7 = r0.convertFocusDirectionToLayoutDirection(r7)
            r8 = 1
            if (r7 == r8) goto L_0x002b
            r7 = 0
            goto L_0x002c
        L_0x002b:
            r7 = 1
        L_0x002c:
            boolean r10 = r0.mShouldReverseLayout
            r11 = -1
            if (r7 == r10) goto L_0x0039
            int r7 = r22.getChildCount()
            int r7 = r7 + r11
            r10 = -1
            r12 = -1
            goto L_0x0040
        L_0x0039:
            int r7 = r22.getChildCount()
            r10 = r7
            r7 = 0
            r12 = 1
        L_0x0040:
            int r13 = r0.mOrientation
            if (r13 != r8) goto L_0x004c
            boolean r13 = r22.isLayoutRTL()
            if (r13 == 0) goto L_0x004c
            r13 = 1
            goto L_0x004d
        L_0x004c:
            r13 = 0
        L_0x004d:
            int r14 = r0.getSpanGroupIndex(r1, r2, r7)
            r11 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x0059:
            if (r11 == r10) goto L_0x013b
            int r9 = r0.getSpanGroupIndex(r1, r2, r11)
            android.view.View r1 = r0.getChildAt(r11)
            if (r1 != r3) goto L_0x0067
            goto L_0x013b
        L_0x0067:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x007f
            if (r9 == r14) goto L_0x007f
            if (r4 != 0) goto L_0x013b
            r18 = r3
            r19 = r8
            r21 = r10
        L_0x0077:
            r23 = r14
        L_0x0079:
            r10 = r16
            r8 = r17
            goto L_0x0128
        L_0x007f:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            android.support.v7.widget.di r9 = (android.support.p033v7.widget.C0593di) r9
            int r2 = r9.f2300a
            r18 = r3
            int r3 = r9.f2301b
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x0098
            if (r2 != r6) goto L_0x0098
            if (r3 == r5) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            return r1
        L_0x0098:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00ac
            if (r4 == 0) goto L_0x00a1
            goto L_0x00ac
        L_0x00a1:
            r19 = r8
            r21 = r10
        L_0x00a5:
            r23 = r14
            r10 = r16
            r8 = r17
            goto L_0x00f8
        L_0x00ac:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b5
            if (r7 != 0) goto L_0x00b5
            goto L_0x00a1
        L_0x00b5:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d6
            if (r10 > r8) goto L_0x00d3
            if (r10 != r8) goto L_0x0124
            if (r2 > r15) goto L_0x00cf
            r10 = 0
            goto L_0x00d0
        L_0x00cf:
            r10 = 1
        L_0x00d0:
            if (r13 == r10) goto L_0x00d3
            goto L_0x0124
        L_0x00d3:
            r19 = r8
            goto L_0x00a5
        L_0x00d6:
            if (r4 != 0) goto L_0x0124
            r19 = r8
            r23 = r14
            r8 = 1
            r14 = 0
            boolean r20 = r0.isViewPartiallyVisible(r1, r14, r8)
            if (r20 == 0) goto L_0x0079
            r8 = r17
            if (r10 > r8) goto L_0x00f6
            if (r10 != r8) goto L_0x00f3
            r10 = r16
            if (r2 > r10) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r14 = 1
        L_0x00f0:
            if (r13 == r14) goto L_0x00f8
            goto L_0x0128
        L_0x00f3:
            r10 = r16
            goto L_0x0128
        L_0x00f6:
            r10 = r16
        L_0x00f8:
            boolean r14 = r1.hasFocusable()
            if (r14 == 0) goto L_0x0112
            int r4 = r9.f2300a
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r17 = r8
            r16 = r10
            r4 = r1
            r8 = r2
            goto L_0x012e
        L_0x0112:
            int r7 = r9.f2300a
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x012e
        L_0x0124:
            r19 = r8
            goto L_0x0077
        L_0x0128:
            r17 = r8
            r16 = r10
            r8 = r19
        L_0x012e:
            int r11 = r11 + r12
            r14 = r23
            r1 = r25
            r2 = r26
            r3 = r18
            r10 = r21
            goto L_0x0059
        L_0x013b:
            if (r4 == 0) goto L_0x013e
            return r4
        L_0x013e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, android.support.v7.widget.fw, android.support.v7.widget.ge):android.view.View");
    }

    public final void onInitializeAccessibilityNodeInfo(C0661fw fwVar, C0670ge geVar, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(fwVar, geVar, kVar);
        kVar.f5921a.setClassName(GridView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfoForItem(C0661fw fwVar, C0670ge geVar, View view, C1991k kVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0593di)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, kVar);
            return;
        }
        C0593di diVar = (C0593di) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(fwVar, geVar, diVar.f2420c.getLayoutPosition());
        if (this.mOrientation == 0) {
            kVar.mo5155d(C1990j.m5333a(diVar.f2300a, diVar.f2301b, spanGroupIndex, 1, false, false));
            return;
        }
        kVar.mo5155d(C1990j.m5333a(spanGroupIndex, 1, diVar.f2300a, diVar.f2301b, false, false));
    }

    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.mSpanIndexCache.clear();
        this.mSpanSizeLookup.mSpanGroupIndexCache.clear();
    }

    public final void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.mSpanIndexCache.clear();
        this.mSpanSizeLookup.mSpanGroupIndexCache.clear();
    }

    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.mSpanSizeLookup.mSpanIndexCache.clear();
        this.mSpanSizeLookup.mSpanGroupIndexCache.clear();
    }

    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.mSpanIndexCache.clear();
        this.mSpanSizeLookup.mSpanGroupIndexCache.clear();
    }

    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.mSpanSizeLookup.mSpanIndexCache.clear();
        this.mSpanSizeLookup.mSpanGroupIndexCache.clear();
    }

    public final void onLayoutChildren(C0661fw fwVar, C0670ge geVar) {
        if (geVar.f2462g) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0593di diVar = (C0593di) getChildAt(i).getLayoutParams();
                int layoutPosition = diVar.f2420c.getLayoutPosition();
                this.mPreLayoutSpanSizeCache.put(layoutPosition, diVar.f2301b);
                this.mPreLayoutSpanIndexCache.put(layoutPosition, diVar.f2300a);
            }
        }
        super.onLayoutChildren(fwVar, geVar);
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    public final void onLayoutCompleted(C0670ge geVar) {
        super.onLayoutCompleted(geVar);
        this.mPendingSpanCountChange = false;
    }

    public final int scrollHorizontallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i, fwVar, geVar);
    }

    public final int scrollVerticallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i, fwVar, geVar);
    }

    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            i4 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            i3 = chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            i3 = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            i4 = chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    public final void setSpanCount(int i) {
        if (i != this.mSpanCount) {
            this.mPendingSpanCountChange = true;
            if (i > 0) {
                this.mSpanCount = i;
                this.mSpanSizeLookup.mSpanIndexCache.clear();
                requestLayout();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }

    public C0654fp generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0593di((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0593di(layoutParams);
    }

    public final void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public GridLayoutManager(Context context, int i, int i2) {
        super(context, i2, false);
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setSpanCount(getProperties(context, attributeSet, i, i2).f2417b);
    }
}
