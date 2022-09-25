package android.support.p033v7.widget;

import java.util.Arrays;

/* renamed from: android.support.v7.widget.de */
/* compiled from: PG */
final class C0589de implements C0651fm {

    /* renamed from: a */
    int f2285a;

    /* renamed from: b */
    int f2286b;

    /* renamed from: c */
    int[] f2287c;

    /* renamed from: d */
    int f2288d;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2730b() {
        int[] iArr = this.f2287c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f2288d = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo2731c(RecyclerView recyclerView, boolean z) {
        this.f2288d = 0;
        int[] iArr = this.f2287c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        C0653fo foVar = recyclerView.mLayout;
        if (recyclerView.mAdapter != null && foVar != null && foVar.isItemPrefetchEnabled()) {
            if (z) {
                if (!recyclerView.mAdapterHelper.mo3294k()) {
                    foVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                foVar.collectAdjacentPrefetchPositions(this.f2285a, this.f2286b, recyclerView.mState, this);
            }
            int i = this.f2288d;
            if (i > foVar.mPrefetchMaxCountObserved) {
                foVar.mPrefetchMaxCountObserved = i;
                foVar.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.mo3038o();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo2732d(int i) {
        if (this.f2287c != null) {
            int i2 = this.f2288d;
            int i3 = i2 + i2;
            for (int i4 = 0; i4 < i3; i4 += 2) {
                if (this.f2287c[i4] == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2729a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 >= 0) {
            int i3 = this.f2288d;
            int i4 = i3 + i3;
            int[] iArr = this.f2287c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2287c = iArr2;
                Arrays.fill(iArr2, -1);
            } else {
                int length = iArr.length;
                if (i4 >= length) {
                    int[] iArr3 = new int[(i4 + i4)];
                    this.f2287c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, length);
                }
            }
            int[] iArr4 = this.f2287c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.f2288d++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }
}
