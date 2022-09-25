package androidx.recyclerview.widget;

import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager;
import com.google.common.p4522b.C58557jl;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.p */
/* compiled from: PG */
public final class C4078p {

    /* renamed from: a */
    public final ArrayList f13053a = new ArrayList();

    /* renamed from: b */
    int f13054b = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: c */
    int f13055c = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: d */
    int f13056d = 0;

    /* renamed from: e */
    final int f13057e;

    /* renamed from: f */
    public final /* synthetic */ DiscoverStaggeredGridLayoutManager f13058f;

    public C4078p(DiscoverStaggeredGridLayoutManager discoverStaggeredGridLayoutManager, int i) {
        this.f13058f = discoverStaggeredGridLayoutManager;
        this.f13057e = i;
    }

    /* renamed from: a */
    public final int mo8555a() {
        if (this.f13058f.f12956g) {
            return mo8572r(this.f13053a.size() - 1, -1);
        }
        return mo8572r(0, this.f13053a.size());
    }

    /* renamed from: b */
    public final int mo8556b() {
        if (this.f13058f.f12956g) {
            return mo8572r(0, this.f13053a.size());
        }
        return mo8572r(this.f13053a.size() - 1, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo8557c(int i, int i2, boolean z, boolean z2, boolean z3) {
        int j = this.f13058f.f12953d.mo2847j();
        int f = this.f13058f.f12953d.mo2843f();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f13053a.get(i);
            int d = this.f13058f.f12953d.mo2841d(view);
            int a = this.f13058f.f12953d.mo2838a(view);
            boolean z4 = false;
            boolean z5 = !z3 ? d < f : d <= f;
            if (!z3 ? a > j : a >= j) {
                z4 = true;
            }
            if (z5 && z4) {
                if (z) {
                    if (z2) {
                        if (d >= j && a <= f) {
                            return this.f13058f.getPosition(view);
                        }
                    }
                } else if (z2) {
                    return this.f13058f.getPosition(view);
                }
                if (d < j || a > f) {
                    return this.f13058f.getPosition(view);
                }
            }
            i += i3;
        }
        return -1;
    }

    /* renamed from: d */
    public final int mo8558d(int i, int i2, boolean z) {
        return mo8557c(i, i2, z, true, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo8559e() {
        int i = this.f13055c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        mo8565k();
        return this.f13055c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo8560f(int i) {
        int i2 = this.f13055c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f13053a.size() == 0) {
            return i;
        }
        mo8565k();
        return this.f13055c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo8561g() {
        int i = this.f13054b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        mo8566l();
        return this.f13054b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo8562h(int i) {
        int i2 = this.f13054b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f13053a.size() == 0) {
            return i;
        }
        mo8566l();
        return this.f13054b;
    }

    /* renamed from: i */
    public final View mo8563i(int i, int i2) {
        View view = null;
        if (i2 != -1) {
            int size = this.f13053a.size() - 1;
            while (size >= 0) {
                View view2 = (View) this.f13053a.get(size);
                DiscoverStaggeredGridLayoutManager discoverStaggeredGridLayoutManager = this.f13058f;
                if (discoverStaggeredGridLayoutManager.f12956g && discoverStaggeredGridLayoutManager.getPosition(view2) >= i) {
                    break;
                }
                DiscoverStaggeredGridLayoutManager discoverStaggeredGridLayoutManager2 = this.f13058f;
                if ((!discoverStaggeredGridLayoutManager2.f12956g && discoverStaggeredGridLayoutManager2.getPosition(view2) <= i) || !view2.hasFocusable()) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = this.f13053a.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) this.f13053a.get(i3);
                DiscoverStaggeredGridLayoutManager discoverStaggeredGridLayoutManager3 = this.f13058f;
                if (discoverStaggeredGridLayoutManager3.f12956g && discoverStaggeredGridLayoutManager3.getPosition(view3) <= i) {
                    break;
                }
                DiscoverStaggeredGridLayoutManager discoverStaggeredGridLayoutManager4 = this.f13058f;
                if ((!discoverStaggeredGridLayoutManager4.f12956g && discoverStaggeredGridLayoutManager4.getPosition(view3) >= i) || !view3.hasFocusable()) {
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
    public final void mo8564j(View view) {
        C4075m mVar = (C4075m) view.getLayoutParams();
        mVar.f13051a = this;
        this.f13053a.add(view);
        this.f13055c = LinearLayoutManager.INVALID_OFFSET;
        if (this.f13053a.size() == 1) {
            this.f13054b = LinearLayoutManager.INVALID_OFFSET;
        }
        if (mVar.f2420c.isRemoved() || mVar.f2420c.isUpdated()) {
            this.f13056d += this.f13058f.f12953d.mo2839b(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo8565k() {
        DiscoverStaggeredGridLayoutManager.LazySpanLookup.FullSpanItem b;
        View view = (View) C58557jl.m90131l(this.f13053a);
        C4075m mVar = (C4075m) view.getLayoutParams();
        this.f13055c = this.f13058f.f12953d.mo2838a(view);
        if (mVar.f13052b && (b = this.f13058f.f12960k.mo8522b(mVar.f2420c.getLayoutPosition())) != null && b.f12979b == 1) {
            this.f13055c += b.mo8525a(this.f13057e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo8566l() {
        DiscoverStaggeredGridLayoutManager.LazySpanLookup.FullSpanItem b;
        View view = (View) this.f13053a.get(0);
        C4075m mVar = (C4075m) view.getLayoutParams();
        this.f13054b = this.f13058f.f12953d.mo2841d(view);
        if (mVar.f13052b && (b = this.f13058f.f12960k.mo8522b(mVar.f2420c.getLayoutPosition())) != null && b.f12979b == -1) {
            this.f13054b -= b.mo8525a(this.f13057e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo8567m() {
        this.f13053a.clear();
        this.f13054b = LinearLayoutManager.INVALID_OFFSET;
        this.f13055c = LinearLayoutManager.INVALID_OFFSET;
        this.f13056d = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo8568n(int i) {
        int i2 = this.f13054b;
        if (i2 != Integer.MIN_VALUE) {
            this.f13054b = i2 + i;
        }
        int i3 = this.f13055c;
        if (i3 != Integer.MIN_VALUE) {
            this.f13055c = i3 + i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo8569o() {
        int size = this.f13053a.size();
        View view = (View) this.f13053a.remove(size - 1);
        C4075m mVar = (C4075m) view.getLayoutParams();
        mVar.f13051a = null;
        if (mVar.f2420c.isRemoved() || mVar.f2420c.isUpdated()) {
            this.f13056d -= this.f13058f.f12953d.mo2839b(view);
        }
        if (size == 1) {
            this.f13054b = LinearLayoutManager.INVALID_OFFSET;
        }
        this.f13055c = LinearLayoutManager.INVALID_OFFSET;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo8570p() {
        View view = (View) this.f13053a.remove(0);
        C4075m mVar = (C4075m) view.getLayoutParams();
        mVar.f13051a = null;
        if (this.f13053a.size() == 0) {
            this.f13055c = LinearLayoutManager.INVALID_OFFSET;
        }
        if (mVar.f2420c.isRemoved() || mVar.f2420c.isUpdated()) {
            this.f13056d -= this.f13058f.f12953d.mo2839b(view);
        }
        this.f13054b = LinearLayoutManager.INVALID_OFFSET;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo8571q(View view) {
        C4075m mVar = (C4075m) view.getLayoutParams();
        mVar.f13051a = this;
        this.f13053a.add(0, view);
        this.f13054b = LinearLayoutManager.INVALID_OFFSET;
        if (this.f13053a.size() == 1) {
            this.f13055c = LinearLayoutManager.INVALID_OFFSET;
        }
        if (mVar.f2420c.isRemoved() || mVar.f2420c.isUpdated()) {
            this.f13056d += this.f13058f.f12953d.mo2839b(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final int mo8572r(int i, int i2) {
        return mo8557c(i, i2, false, false, true);
    }
}
