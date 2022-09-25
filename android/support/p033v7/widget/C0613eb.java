package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p033v7.p034a.C0338a;
import android.support.p033v7.view.menu.C0456aj;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.p098j.C2043bi;
import androidx.core.widget.C2131r;
import androidx.core.widget.C2132s;

/* renamed from: android.support.v7.widget.eb */
/* compiled from: PG */
public class C0613eb implements C0456aj {

    /* renamed from: a */
    private final Context f2350a;

    /* renamed from: b */
    private ListAdapter f2351b;

    /* renamed from: c */
    private int f2352c;

    /* renamed from: d */
    private boolean f2353d;

    /* renamed from: e */
    public C0578cu f2354e;

    /* renamed from: f */
    public int f2355f = -2;

    /* renamed from: g */
    public int f2356g;

    /* renamed from: h */
    public boolean f2357h;

    /* renamed from: i */
    public boolean f2358i;

    /* renamed from: j */
    public int f2359j = 0;

    /* renamed from: k */
    public View f2360k;

    /* renamed from: l */
    public AdapterView.OnItemClickListener f2361l;

    /* renamed from: m */
    public AdapterView.OnItemSelectedListener f2362m;

    /* renamed from: n */
    final C0612ea f2363n = new C0612ea(this);

    /* renamed from: o */
    final Handler f2364o;

    /* renamed from: p */
    public boolean f2365p;

    /* renamed from: q */
    public final PopupWindow f2366q;

    /* renamed from: r */
    private DataSetObserver f2367r;

    /* renamed from: s */
    private final C0610dz f2368s = new C0610dz(this);

    /* renamed from: t */
    private final C0609dy f2369t = new C0609dy(this);

    /* renamed from: u */
    private final C0607dw f2370u = new C0607dw(this);

    /* renamed from: v */
    private final Rect f2371v = new Rect();

    /* renamed from: w */
    private Rect f2372w;

    public C0613eb(Context context, AttributeSet attributeSet, int i) {
        this.f2350a = context;
        this.f2364o = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338a.f1080p, i, 0);
        this.f2356g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2352c = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2353d = true;
        }
        obtainStyledAttributes.recycle();
        C0514al alVar = new C0514al(context, attributeSet, i);
        this.f2366q = alVar;
        alVar.setInputMethodMode(1);
    }

    /* renamed from: a */
    public final int mo2816a() {
        return this.f2356g;
    }

    /* renamed from: b */
    public final int mo2817b() {
        if (!this.f2353d) {
            return 0;
        }
        return this.f2352c;
    }

    /* renamed from: c */
    public final Drawable mo2818c() {
        return this.f2366q.getBackground();
    }

    /* renamed from: e */
    public void mo2532e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2367r;
        if (dataSetObserver == null) {
            this.f2367r = new C0608dx(this);
        } else {
            ListAdapter listAdapter2 = this.f2351b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2351b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2367r);
        }
        C0578cu cuVar = this.f2354e;
        if (cuVar != null) {
            cuVar.setAdapter(this.f2351b);
        }
    }

    /* renamed from: eJ */
    public final ListView mo1574eJ() {
        return this.f2354e;
    }

    /* renamed from: f */
    public final void mo2819f(Drawable drawable) {
        this.f2366q.setBackgroundDrawable(drawable);
    }

    /* renamed from: g */
    public final void mo2820g(int i) {
        this.f2356g = i;
    }

    /* renamed from: j */
    public final void mo2821j(int i) {
        this.f2352c = i;
        this.f2353d = true;
    }

    /* renamed from: m */
    public final void mo1575m() {
        this.f2366q.dismiss();
        this.f2366q.setContentView((View) null);
        this.f2354e = null;
        this.f2364o.removeCallbacks(this.f2363n);
    }

    /* renamed from: o */
    public final int mo2822o() {
        if (!this.f2366q.isShowing()) {
            return -1;
        }
        return this.f2354e.getSelectedItemPosition();
    }

    /* renamed from: p */
    public C0578cu mo2823p(Context context, boolean z) {
        return new C0578cu(context, z);
    }

    /* renamed from: q */
    public final void mo2824q() {
        C0578cu cuVar = this.f2354e;
        if (cuVar != null) {
            cuVar.f2225a = true;
            cuVar.requestLayout();
        }
    }

    /* renamed from: r */
    public final void mo2825r(int i) {
        Drawable background = this.f2366q.getBackground();
        if (background != null) {
            background.getPadding(this.f2371v);
            this.f2355f = this.f2371v.left + this.f2371v.right + i;
            return;
        }
        this.f2355f = i;
    }

    /* renamed from: s */
    public final void mo2826s(Rect rect) {
        this.f2372w = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: t */
    public final boolean mo2827t() {
        return this.f2366q.getInputMethodMode() == 2;
    }

    /* renamed from: u */
    public final void mo2828u() {
        this.f2366q.setInputMethodMode(2);
    }

    /* renamed from: v */
    public final void mo1576v() {
        int i;
        int i2;
        if (this.f2354e == null) {
            C0578cu p = mo2823p(this.f2350a, !this.f2365p);
            this.f2354e = p;
            p.setAdapter(this.f2351b);
            this.f2354e.setOnItemClickListener(this.f2361l);
            this.f2354e.setFocusable(true);
            this.f2354e.setFocusableInTouchMode(true);
            this.f2354e.setOnItemSelectedListener(new C0604dt(this));
            this.f2354e.setOnScrollListener(this.f2369t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2362m;
            if (onItemSelectedListener != null) {
                this.f2354e.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.f2366q.setContentView(this.f2354e);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f2366q.getContentView();
        }
        Drawable background = this.f2366q.getBackground();
        int i3 = 0;
        if (background != null) {
            background.getPadding(this.f2371v);
            i = this.f2371v.top + this.f2371v.bottom;
            if (!this.f2353d) {
                this.f2352c = -this.f2371v.top;
            }
        } else {
            this.f2371v.setEmpty();
            i = 0;
        }
        int a = C0605du.m2169a(this.f2366q, this.f2360k, this.f2352c, this.f2366q.getInputMethodMode() == 2);
        int i4 = this.f2355f;
        if (i4 == -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f2350a.getResources().getDisplayMetrics().widthPixels - (this.f2371v.left + this.f2371v.right), LinearLayoutManager.INVALID_OFFSET);
        } else if (i4 != -1) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f2350a.getResources().getDisplayMetrics().widthPixels - (this.f2371v.left + this.f2371v.right), 1073741824);
        }
        int b = this.f2354e.mo2700b(i2, a);
        if (b > 0) {
            i3 = this.f2354e.getPaddingTop() + this.f2354e.getPaddingBottom() + i;
        }
        int i5 = b + i3;
        mo2827t();
        C2132s.m5904c(this.f2366q, 1002);
        if (!this.f2366q.isShowing()) {
            int i6 = this.f2355f;
            if (i6 == -1) {
                i6 = -1;
            } else if (i6 == -2) {
                i6 = this.f2360k.getWidth();
            }
            this.f2366q.setWidth(i6);
            this.f2366q.setHeight(i5);
            C0606dv.m2171b(this.f2366q, true);
            this.f2366q.setOutsideTouchable(true);
            this.f2366q.setTouchInterceptor(this.f2368s);
            if (this.f2358i) {
                C2132s.m5903b(this.f2366q, this.f2357h);
            }
            C0606dv.m2170a(this.f2366q, this.f2372w);
            C2131r.m5901a(this.f2366q, this.f2360k, this.f2356g, this.f2352c, this.f2359j);
            this.f2354e.setSelection(-1);
            if (!this.f2365p || this.f2354e.isInTouchMode()) {
                mo2824q();
            }
            if (!this.f2365p) {
                this.f2364o.post(this.f2370u);
            }
        } else if (C2043bi.m5569aw(this.f2360k)) {
            int i7 = this.f2355f;
            if (i7 == -1) {
                i7 = -1;
            } else if (i7 == -2) {
                i7 = this.f2360k.getWidth();
            }
            this.f2366q.setOutsideTouchable(true);
            this.f2366q.update(this.f2360k, this.f2356g, this.f2352c, i7 < 0 ? -1 : i7, i5 < 0 ? -1 : i5);
        }
    }

    /* renamed from: w */
    public final void mo2829w() {
        this.f2365p = true;
        this.f2366q.setFocusable(true);
    }

    /* renamed from: x */
    public final boolean mo1577x() {
        return this.f2366q.isShowing();
    }
}
