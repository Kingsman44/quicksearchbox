package android.support.p033v7.widget;

import androidx.core.p094f.C1901n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: android.support.v7.widget.dg */
/* compiled from: PG */
final class C0591dg implements Runnable {

    /* renamed from: a */
    static final ThreadLocal f2294a = new ThreadLocal();

    /* renamed from: b */
    static final Comparator f2295b = new C0588dd();

    /* renamed from: c */
    final ArrayList f2296c = new ArrayList();

    /* renamed from: d */
    long f2297d;

    /* renamed from: e */
    long f2298e;

    /* renamed from: f */
    private final ArrayList f2299f = new ArrayList();

    /* renamed from: b */
    private static final C0673gh m2141b(RecyclerView recyclerView, int i, long j) {
        int b = recyclerView.mChildHelper.mo2602b();
        for (int i2 = 0; i2 < b; i2++) {
            C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo2605e(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        C0661fw fwVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            C0673gh q = fwVar.mo3040q(i, j);
            if (q != null) {
                if (!q.isBound() || q.isInvalid()) {
                    fwVar.mo3026c(q, false);
                } else {
                    fwVar.mo3033j(q.itemView);
                }
            }
            return q;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2733a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.mIsAttached && this.f2297d == 0) {
            this.f2297d = RecyclerView.getNanoTime$ar$ds();
            recyclerView.post(this);
        }
        C0589de deVar = recyclerView.mPrefetchRegistry;
        deVar.f2285a = i;
        deVar.f2286b = i2;
    }

    public final void run() {
        WeakReference weakReference;
        C0590df dfVar;
        long j = 0;
        try {
            C1901n.m5168a("RV Prefetch");
            if (this.f2296c.isEmpty()) {
                this.f2297d = 0;
            } else {
                int size = this.f2296c.size();
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f2296c.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView.getDrawingTime(), j2);
                    }
                }
                if (j2 == 0) {
                    this.f2297d = 0;
                } else {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.f2298e;
                    int size2 = this.f2296c.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView2 = (RecyclerView) this.f2296c.get(i3);
                        if (recyclerView2.getWindowVisibility() == 0) {
                            recyclerView2.mPrefetchRegistry.mo2731c(recyclerView2, false);
                            i2 += recyclerView2.mPrefetchRegistry.f2288d;
                        }
                    }
                    this.f2299f.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView3 = (RecyclerView) this.f2296c.get(i5);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            C0589de deVar = recyclerView3.mPrefetchRegistry;
                            int abs = Math.abs(deVar.f2285a) + Math.abs(deVar.f2286b);
                            int i6 = 0;
                            while (true) {
                                int i7 = deVar.f2288d;
                                if (i6 >= i7 + i7) {
                                    break;
                                }
                                if (i4 >= this.f2299f.size()) {
                                    dfVar = new C0590df();
                                    this.f2299f.add(dfVar);
                                } else {
                                    dfVar = (C0590df) this.f2299f.get(i4);
                                }
                                int[] iArr = deVar.f2287c;
                                try {
                                    int i8 = iArr[i6 + 1];
                                    dfVar.f2289a = i8 <= abs;
                                    dfVar.f2290b = abs;
                                    dfVar.f2291c = i8;
                                    dfVar.f2292d = recyclerView3;
                                    dfVar.f2293e = iArr[i6];
                                    i4++;
                                    i6 += 2;
                                } catch (Throwable th) {
                                    th = th;
                                    j = 0;
                                    this.f2297d = j;
                                    C1901n.m5169b();
                                    throw th;
                                }
                            }
                        }
                    }
                    Collections.sort(this.f2299f, f2295b);
                    int i9 = 0;
                    while (true) {
                        if (i9 >= this.f2299f.size()) {
                            break;
                        }
                        C0590df dfVar2 = (C0590df) this.f2299f.get(i9);
                        RecyclerView recyclerView4 = dfVar2.f2292d;
                        if (recyclerView4 == null) {
                            break;
                        }
                        C0673gh b = m2141b(recyclerView4, dfVar2.f2293e, true != dfVar2.f2289a ? nanos : Long.MAX_VALUE);
                        if (b != null && (weakReference = b.mNestedRecyclerView) != null && b.isBound() && !b.isInvalid()) {
                            RecyclerView recyclerView5 = (RecyclerView) weakReference.get();
                            if (recyclerView5 != null) {
                                if (recyclerView5.mDataSetHasChangedAfterLayout && recyclerView5.mChildHelper.mo2602b() != 0) {
                                    recyclerView5.removeAndRecycleViews();
                                }
                                C0589de deVar2 = recyclerView5.mPrefetchRegistry;
                                deVar2.mo2731c(recyclerView5, true);
                                if (deVar2.f2288d != 0) {
                                    C1901n.m5168a("RV Nested Prefetch");
                                    C0670ge geVar = recyclerView5.mState;
                                    C0640fb fbVar = recyclerView5.mAdapter;
                                    geVar.f2459d = 1;
                                    geVar.f2460e = fbVar.getItemCount();
                                    geVar.f2462g = false;
                                    geVar.f2463h = false;
                                    geVar.f2464i = false;
                                    int i10 = 0;
                                    while (true) {
                                        int i11 = deVar2.f2288d;
                                        if (i10 >= i11 + i11) {
                                            break;
                                        }
                                        m2141b(recyclerView5, deVar2.f2287c[i10], nanos);
                                        i10 += 2;
                                    }
                                    C1901n.m5169b();
                                }
                            }
                        }
                        dfVar2.f2289a = false;
                        dfVar2.f2290b = 0;
                        dfVar2.f2291c = 0;
                        dfVar2.f2292d = null;
                        dfVar2.f2293e = 0;
                        i9++;
                    }
                    this.f2297d = 0;
                }
            }
            C1901n.m5169b();
        } catch (Throwable th2) {
            th = th2;
            this.f2297d = j;
            C1901n.m5169b();
            throw th;
        }
    }
}
