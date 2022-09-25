package com.facebook.litho.widget;

import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C4075m;
import androidx.recyclerview.widget.C4078p;
import androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager;
import java.lang.ref.WeakReference;

/* compiled from: PG */
public final class DiscoverStaggeredGridLayoutInfo implements C6427am {

    /* renamed from: a */
    public C6425ak f19027a;

    /* renamed from: b */
    private final DiscoverLithoStaggeredGridLayoutManager f19028b;

    /* compiled from: PG */
    public final class DiscoverLithoStaggeredGridLayoutManager extends DiscoverStaggeredGridLayoutManager {

        /* renamed from: o */
        private int[] f19030o;

        /* renamed from: p */
        private WeakReference f19031p = new WeakReference((Object) null);

        public DiscoverLithoStaggeredGridLayoutManager(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        /* renamed from: s */
        private final int[] m17337s() {
            int i = this.f12951b;
            if (i <= 0) {
                return null;
            }
            if (this.f19030o == null) {
                this.f19030o = new int[i];
            }
            return this.f19030o;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final String mo8508f(int i) {
            if (i == -1) {
                return null;
            }
            return (String) DiscoverStaggeredGridLayoutInfo.this.f19027a.mo13511m(i).mo13525g("contentId");
        }

        public final C0654fp generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            C4075m mVar;
            if (layoutParams instanceof C6472cd) {
                mVar = new C4075m((C0654fp) (C6472cd) layoutParams);
            } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                mVar = new C4075m((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                mVar = new C4075m(layoutParams);
            }
            mVar.width = -2;
            return mVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public final boolean mo8514l(int i) {
            Integer num;
            C6425ak akVar = DiscoverStaggeredGridLayoutInfo.this.f19027a;
            if (i == 0 || akVar == null || (num = (Integer) akVar.mo13511m(i).mo13525g("topLevelIndex")) == null || !num.equals((Integer) akVar.mo13511m(i - 1).mo13525g("topLevelIndex"))) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public final boolean mo8515m(int i) {
            if (i == -1) {
                return false;
            }
            C6491cw m = DiscoverStaggeredGridLayoutInfo.this.f19027a.mo13511m(i);
            if (!m.mo13532n() || !m.mo13530l()) {
                return false;
            }
            return true;
        }

        /* renamed from: o */
        public final int[] mo8517o(int[] iArr) {
            return super.mo8517o(m17337s());
        }

        public final void onLayoutCompleted(C0670ge geVar) {
            this.f12958i = -1;
            this.f12959j = LinearLayoutManager.INVALID_OFFSET;
            this.f12961l = null;
            this.f12962m.mo8550a();
            RecyclerView recyclerView = (RecyclerView) this.f19031p.get();
            if (recyclerView != null) {
                recyclerView.getHandler().postAtFrontOfQueue(new C6553r(recyclerView));
                this.f19031p.clear();
            }
        }

        /* renamed from: p */
        public final int[] mo8518p(int[] iArr) {
            return super.mo8518p(m17337s());
        }

        /* renamed from: q */
        public final int[] mo8519q() {
            return super.mo8518p(m17337s());
        }

        /* renamed from: r */
        public final int[] mo8520r() {
            int[] s = m17337s();
            int i = this.f12951b;
            if (i <= 0) {
                return DiscoverStaggeredGridLayoutManager.f12950a;
            }
            if (s == null || s.length < i) {
                s = new int[i];
            }
            for (int i2 = 0; i2 < this.f12951b; i2++) {
                C4078p pVar = this.f12952c[i2];
                s[i2] = pVar.f13058f.f12956g ? pVar.mo8558d(0, pVar.f13053a.size(), false) : pVar.mo8558d(pVar.f13053a.size() - 1, -1, false);
            }
            return s;
        }
    }

    public DiscoverStaggeredGridLayoutInfo(int i, int i2, int i3) {
        DiscoverLithoStaggeredGridLayoutManager discoverLithoStaggeredGridLayoutManager = new DiscoverLithoStaggeredGridLayoutManager(i, i2, i3);
        this.f19028b = discoverLithoStaggeredGridLayoutManager;
        discoverLithoStaggeredGridLayoutManager.mo8511i(false);
    }

    /* renamed from: b */
    public final int mo13480b() {
        return C6552q.m17847b(this.f19028b.mo8519q());
    }

    /* renamed from: c */
    public final int mo13481c() {
        return C6552q.m17847b(this.f19028b.mo8517o((int[]) null));
    }

    /* renamed from: d */
    public final int mo13482d() {
        return C6552q.m17846a(this.f19028b.mo8518p((int[]) null));
    }

    /* renamed from: e */
    public final int mo13483e() {
        return C6552q.m17846a(this.f19028b.mo8520r());
    }

    /* renamed from: f */
    public final int mo13484f(int i, C6491cw cwVar) {
        if (this.f19028b.f12955f != 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        Integer num = (Integer) cwVar.mo13525g("OVERRIDE_SIZE");
        if (num != null) {
            return View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec((cwVar.mo13530l() ? this.f19028b.f12951b : 1) * (View.MeasureSpec.getSize(i) / this.f19028b.f12951b), 1073741824);
    }

    /* renamed from: h */
    public final int mo13486h() {
        return this.f19028b.getItemCount();
    }

    /* renamed from: i */
    public final int mo13487i() {
        return this.f19028b.f12955f;
    }

    /* renamed from: j */
    public final C0653fo mo13488j() {
        return this.f19028b;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C6426al mo13489k(int i, int i2) {
        DiscoverLithoStaggeredGridLayoutManager discoverLithoStaggeredGridLayoutManager = this.f19028b;
        return new C6554s(i, i2, discoverLithoStaggeredGridLayoutManager.f12955f, discoverLithoStaggeredGridLayoutManager.f12951b);
    }

    /* renamed from: l */
    public final void mo13490l(int i, int i2) {
        DiscoverLithoStaggeredGridLayoutManager discoverLithoStaggeredGridLayoutManager = this.f19028b;
        DiscoverStaggeredGridLayoutManager.SavedState savedState = discoverLithoStaggeredGridLayoutManager.f12961l;
        if (savedState != null) {
            savedState.mo8529a();
        }
        discoverLithoStaggeredGridLayoutManager.f12958i = i;
        discoverLithoStaggeredGridLayoutManager.f12959j = i2;
        discoverLithoStaggeredGridLayoutManager.requestLayout();
    }

    /* renamed from: m */
    public final void mo13491m(C6425ak akVar) {
        this.f19027a = akVar;
    }

    /* renamed from: a */
    public final int mo13479a(int i, int i2, int i3, int i4) {
        double ceil;
        DiscoverLithoStaggeredGridLayoutManager discoverLithoStaggeredGridLayoutManager = this.f19028b;
        int i5 = discoverLithoStaggeredGridLayoutManager.f12951b;
        if (discoverLithoStaggeredGridLayoutManager.f12955f != 0) {
            double d = (double) i4;
            double d2 = (double) i2;
            Double.isNaN(d);
            Double.isNaN(d2);
            ceil = Math.ceil(d / d2);
        } else {
            double d3 = (double) i3;
            double d4 = (double) i;
            Double.isNaN(d3);
            Double.isNaN(d4);
            ceil = Math.ceil(d3 / d4);
        }
        return ((int) ceil) * i5;
    }

    /* renamed from: g */
    public final int mo13485g(int i, C6491cw cwVar) {
        if (this.f19028b.f12955f == 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        Integer num = (Integer) cwVar.mo13525g("OVERRIDE_SIZE");
        if (num != null) {
            return View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec((cwVar.mo13530l() ? this.f19028b.f12951b : 1) * (View.MeasureSpec.getSize(i) / this.f19028b.f12951b), 1073741824);
    }
}
