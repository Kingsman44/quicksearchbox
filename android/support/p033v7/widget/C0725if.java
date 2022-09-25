package android.support.p033v7.widget;

import android.support.p033v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.if */
/* compiled from: PG */
public final class C0725if {

    /* renamed from: a */
    public final ArrayList f2560a = new ArrayList();

    /* renamed from: b */
    int f2561b = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: c */
    int f2562c = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: d */
    int f2563d = 0;

    /* renamed from: e */
    final int f2564e;

    /* renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f2565f;

    public C0725if(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f2565f = staggeredGridLayoutManager;
        this.f2564e = i;
    }

    /* renamed from: a */
    public final int mo3208a() {
        if (this.f2565f.f1842f) {
            return mo3225r(this.f2560a.size() - 1, -1);
        }
        return mo3225r(0, this.f2560a.size());
    }

    /* renamed from: b */
    public final int mo3209b() {
        if (this.f2565f.f1842f) {
            return mo3225r(0, this.f2560a.size());
        }
        return mo3225r(this.f2560a.size() - 1, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo3210c(int i, int i2, boolean z, boolean z2, boolean z3) {
        int j = this.f2565f.f1839c.mo2847j();
        int f = this.f2565f.f1839c.mo2843f();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f2560a.get(i);
            int d = this.f2565f.f1839c.mo2841d(view);
            int a = this.f2565f.f1839c.mo2838a(view);
            boolean z4 = false;
            boolean z5 = !z3 ? d < f : d <= f;
            if (!z3 ? a > j : a >= j) {
                z4 = true;
            }
            if (z5 && z4) {
                if (z) {
                    if (z2) {
                        if (d >= j && a <= f) {
                            return this.f2565f.getPosition(view);
                        }
                    }
                } else if (z2) {
                    return this.f2565f.getPosition(view);
                }
                if (d < j || a > f) {
                    return this.f2565f.getPosition(view);
                }
            }
            i += i3;
        }
        return -1;
    }

    /* renamed from: d */
    public final int mo3211d(int i, int i2, boolean z) {
        return mo3210c(i, i2, z, true, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo3212e() {
        int i = this.f2562c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        mo3218k();
        return this.f2562c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo3213f(int i) {
        int i2 = this.f2562c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f2560a.size() == 0) {
            return i;
        }
        mo3218k();
        return this.f2562c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo3214g() {
        int i = this.f2561b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        mo3219l();
        return this.f2561b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo3215h(int i) {
        int i2 = this.f2561b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f2560a.size() == 0) {
            return i;
        }
        mo3219l();
        return this.f2561b;
    }

    /* renamed from: i */
    public final View mo3216i(int i, int i2) {
        View view = null;
        if (i2 != -1) {
            int size = this.f2560a.size() - 1;
            while (size >= 0) {
                View view2 = (View) this.f2560a.get(size);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2565f;
                if (staggeredGridLayoutManager.f1842f && staggeredGridLayoutManager.getPosition(view2) >= i) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.f2565f;
                if ((!staggeredGridLayoutManager2.f1842f && staggeredGridLayoutManager2.getPosition(view2) <= i) || !view2.hasFocusable()) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = this.f2560a.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) this.f2560a.get(i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = this.f2565f;
                if (staggeredGridLayoutManager3.f1842f && staggeredGridLayoutManager3.getPosition(view3) <= i) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = this.f2565f;
                if ((!staggeredGridLayoutManager4.f1842f && staggeredGridLayoutManager4.getPosition(view3) >= i) || !view3.hasFocusable()) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo3217j(View view) {
        C0722ic icVar = (C0722ic) view.getLayoutParams();
        icVar.f2558a = this;
        this.f2560a.add(view);
        this.f2562c = LinearLayoutManager.INVALID_OFFSET;
        if (this.f2560a.size() == 1) {
            this.f2561b = LinearLayoutManager.INVALID_OFFSET;
        }
        if (icVar.f2420c.isRemoved() || icVar.f2420c.isUpdated()) {
            this.f2563d += this.f2565f.f1839c.mo2839b(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo3218k() {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem a;
        ArrayList arrayList = this.f2560a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        C0722ic icVar = (C0722ic) view.getLayoutParams();
        this.f2562c = this.f2565f.f1839c.mo2838a(view);
        if (icVar.f2559b && (a = this.f2565f.f1846j.mo2336a(icVar.f2420c.getLayoutPosition())) != null && a.f1864b == 1) {
            this.f2562c += a.mo2345a(this.f2564e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo3219l() {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem a;
        View view = (View) this.f2560a.get(0);
        C0722ic icVar = (C0722ic) view.getLayoutParams();
        this.f2561b = this.f2565f.f1839c.mo2841d(view);
        if (icVar.f2559b && (a = this.f2565f.f1846j.mo2336a(icVar.f2420c.getLayoutPosition())) != null && a.f1864b == -1) {
            this.f2561b -= a.mo2345a(this.f2564e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo3220m() {
        this.f2560a.clear();
        this.f2561b = LinearLayoutManager.INVALID_OFFSET;
        this.f2562c = LinearLayoutManager.INVALID_OFFSET;
        this.f2563d = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo3221n(int i) {
        int i2 = this.f2561b;
        if (i2 != Integer.MIN_VALUE) {
            this.f2561b = i2 + i;
        }
        int i3 = this.f2562c;
        if (i3 != Integer.MIN_VALUE) {
            this.f2562c = i3 + i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo3222o() {
        int size = this.f2560a.size();
        View view = (View) this.f2560a.remove(size - 1);
        C0722ic icVar = (C0722ic) view.getLayoutParams();
        icVar.f2558a = null;
        if (icVar.f2420c.isRemoved() || icVar.f2420c.isUpdated()) {
            this.f2563d -= this.f2565f.f1839c.mo2839b(view);
        }
        if (size == 1) {
            this.f2561b = LinearLayoutManager.INVALID_OFFSET;
        }
        this.f2562c = LinearLayoutManager.INVALID_OFFSET;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo3223p() {
        View view = (View) this.f2560a.remove(0);
        C0722ic icVar = (C0722ic) view.getLayoutParams();
        icVar.f2558a = null;
        if (this.f2560a.size() == 0) {
            this.f2562c = LinearLayoutManager.INVALID_OFFSET;
        }
        if (icVar.f2420c.isRemoved() || icVar.f2420c.isUpdated()) {
            this.f2563d -= this.f2565f.f1839c.mo2839b(view);
        }
        this.f2561b = LinearLayoutManager.INVALID_OFFSET;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo3224q(View view) {
        C0722ic icVar = (C0722ic) view.getLayoutParams();
        icVar.f2558a = this;
        this.f2560a.add(0, view);
        this.f2561b = LinearLayoutManager.INVALID_OFFSET;
        if (this.f2560a.size() == 1) {
            this.f2562c = LinearLayoutManager.INVALID_OFFSET;
        }
        if (icVar.f2420c.isRemoved() || icVar.f2420c.isUpdated()) {
            this.f2563d += this.f2565f.f1839c.mo2839b(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final int mo3225r(int i, int i2) {
        return mo3210c(i, i2, false, false, true);
    }
}
