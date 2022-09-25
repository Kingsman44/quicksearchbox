package android.support.p033v7.widget;

import android.util.SparseArray;

/* renamed from: android.support.v7.widget.ge */
/* compiled from: PG */
public final class C0670ge {

    /* renamed from: a */
    public int f2456a = -1;

    /* renamed from: b */
    int f2457b = 0;

    /* renamed from: c */
    int f2458c = 0;

    /* renamed from: d */
    int f2459d = 1;

    /* renamed from: e */
    int f2460e = 0;

    /* renamed from: f */
    public boolean f2461f = false;

    /* renamed from: g */
    public boolean f2462g = false;

    /* renamed from: h */
    boolean f2463h = false;

    /* renamed from: i */
    boolean f2464i = false;

    /* renamed from: j */
    boolean f2465j = false;

    /* renamed from: k */
    public boolean f2466k = false;

    /* renamed from: l */
    int f2467l;

    /* renamed from: m */
    long f2468m;

    /* renamed from: n */
    int f2469n;

    /* renamed from: o */
    int f2470o;

    /* renamed from: p */
    int f2471p;

    /* renamed from: q */
    private SparseArray f2472q;

    /* renamed from: a */
    public final int mo3052a() {
        return this.f2462g ? this.f2457b - this.f2458c : this.f2460e;
    }

    /* renamed from: b */
    public final Object mo3053b(int i) {
        SparseArray sparseArray = this.f2472q;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3054c(int i) {
        if ((this.f2459d & i) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f2459d));
        }
    }

    /* renamed from: d */
    public final void mo3055d(int i, Object obj) {
        if (this.f2472q == null) {
            this.f2472q = new SparseArray();
        }
        this.f2472q.put(i, obj);
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2456a + ", mData=" + this.f2472q + ", mItemCount=" + this.f2460e + ", mIsMeasuring=" + this.f2464i + ", mPreviousLayoutItemCount=" + this.f2457b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2458c + ", mStructureChanged=" + this.f2461f + ", mInPreLayout=" + this.f2462g + ", mRunSimpleAnimations=" + this.f2465j + ", mRunPredictiveAnimations=" + this.f2466k + '}';
    }
}
