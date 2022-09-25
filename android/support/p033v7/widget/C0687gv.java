package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p033v7.app.C0382c;
import android.support.p033v7.view.C0433a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.gv */
/* compiled from: PG */
public final class C0687gv extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    Runnable f2512a;

    /* renamed from: b */
    public final C0597dm f2513b;

    /* renamed from: c */
    public Spinner f2514c;

    /* renamed from: d */
    public boolean f2515d;

    /* renamed from: e */
    int f2516e;

    /* renamed from: f */
    int f2517f;

    /* renamed from: g */
    private C0684gs f2518g;

    /* renamed from: h */
    private int f2519h;

    /* renamed from: i */
    private int f2520i;

    static {
        new DecelerateInterpolator();
    }

    public C0687gv(Context context) {
        super(context);
        new C0686gu(this);
        setHorizontalScrollBarEnabled(false);
        this.f2519h = C0433a.m1394c(context);
        requestLayout();
        this.f2517f = C0433a.m1393b(context);
        C0597dm dmVar = new C0597dm(getContext(), (AttributeSet) null, R.attr.actionBarTabBarStyle);
        dmVar.setMeasureWithLargestChildEnabled(true);
        dmVar.setGravity(17);
        dmVar.setLayoutParams(new C0596dl(-2, -1));
        this.f2513b = dmVar;
        addView(dmVar, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: d */
    private final boolean m2389d() {
        Spinner spinner = this.f2514c;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private final void m2390e() {
        if (m2389d()) {
            removeView(this.f2514c);
            addView(this.f2513b, new ViewGroup.LayoutParams(-2, -1));
            mo3165c(this.f2514c.getSelectedItemPosition());
        }
    }

    /* renamed from: a */
    public final C0685gt mo3163a(C0382c cVar, boolean z) {
        C0685gt gtVar = new C0685gt(this, getContext(), cVar, z);
        if (z) {
            gtVar.setBackgroundDrawable((Drawable) null);
            gtVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2519h));
        } else {
            gtVar.setFocusable(true);
            if (this.f2518g == null) {
                this.f2518g = new C0684gs(this);
            }
            gtVar.setOnClickListener(this.f2518g);
        }
        return gtVar;
    }

    /* renamed from: b */
    public final void mo3164b(int i) {
        View childAt = this.f2513b.getChildAt(i);
        Runnable runnable = this.f2512a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0682gq gqVar = new C0682gq(this, childAt);
        this.f2512a = gqVar;
        post(gqVar);
    }

    /* renamed from: c */
    public final void mo3165c(int i) {
        this.f2520i = i;
        int childCount = this.f2513b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f2513b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo3164b(i);
            }
            i2++;
        }
        Spinner spinner = this.f2514c;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2512a;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        this.f2519h = C0433a.m1394c(context);
        requestLayout();
        this.f2517f = C0433a.m1393b(context);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2512a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ((C0685gt) view).f2504a.mo1277f();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f2513b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f2516e = -1;
        } else {
            if (childCount > 2) {
                i3 = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
                this.f2516e = i3;
            } else {
                i3 = View.MeasureSpec.getSize(i) / 2;
                this.f2516e = i3;
            }
            this.f2516e = Math.min(i3, this.f2517f);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2519h, 1073741824);
        if (z || !this.f2515d) {
            m2390e();
        } else {
            this.f2513b.measure(0, makeMeasureSpec);
            if (this.f2513b.getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                m2390e();
            } else if (!m2389d()) {
                if (this.f2514c == null) {
                    AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, R.attr.actionDropDownStyle);
                    appCompatSpinner.setLayoutParams(new C0596dl(-2, -1));
                    appCompatSpinner.setOnItemSelectedListener(this);
                    this.f2514c = appCompatSpinner;
                }
                removeView(this.f2513b);
                addView(this.f2514c, new ViewGroup.LayoutParams(-2, -1));
                if (this.f2514c.getAdapter() == null) {
                    this.f2514c.setAdapter(new C0683gr(this));
                }
                Runnable runnable = this.f2512a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                    this.f2512a = null;
                }
                this.f2514c.setSelection(this.f2520i);
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            mo3165c(this.f2520i);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
