package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.p034a.C0338a;
import android.support.p033v7.view.C0435c;
import android.support.p033v7.view.menu.C0454ah;
import android.support.p033v7.view.menu.C0477q;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.ActionBarContextView */
/* compiled from: PG */
public class ActionBarContextView extends C0529b {

    /* renamed from: g */
    public CharSequence f1729g;

    /* renamed from: h */
    public CharSequence f1730h;

    /* renamed from: i */
    public View f1731i;

    /* renamed from: j */
    public boolean f1732j;

    /* renamed from: k */
    private View f1733k;

    /* renamed from: l */
    private View f1734l;

    /* renamed from: m */
    private LinearLayout f1735m;

    /* renamed from: n */
    private TextView f1736n;

    /* renamed from: o */
    private TextView f1737o;

    /* renamed from: p */
    private int f1738p;

    /* renamed from: q */
    private int f1739q;

    /* renamed from: r */
    private int f1740r;

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    public final void mo1830d(int i) {
        this.f2093e = i;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* renamed from: h */
    public final void mo1833h(C0435c cVar) {
        View view = this.f1731i;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1740r, this, false);
            this.f1731i = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1731i);
        }
        View findViewById = this.f1731i.findViewById(R.id.action_mode_close_button);
        this.f1733k = findViewById;
        findViewById.setOnClickListener(new C0584d(cVar));
        C0477q qVar = (C0477q) cVar.mo1258a();
        ActionMenuPresenter actionMenuPresenter = this.f2092d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1887l();
            actionMenuPresenter.mo1890p();
        }
        this.f2092d = new ActionMenuPresenter(getContext());
        this.f2092d.mo1891q();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        qVar.mo1655f(this.f2092d, this.f2090b);
        ActionMenuPresenter actionMenuPresenter2 = this.f2092d;
        C0454ah ahVar = actionMenuPresenter2.f1595f;
        if (actionMenuPresenter2.f1595f == null) {
            actionMenuPresenter2.f1595f = (C0454ah) actionMenuPresenter2.f1593d.inflate(R.layout.abc_action_menu_layout, this, false);
            actionMenuPresenter2.f1595f.mo1454a(actionMenuPresenter2.f1592c);
            actionMenuPresenter2.mo1546f(true);
        }
        C0454ah ahVar2 = actionMenuPresenter2.f1595f;
        if (ahVar != ahVar2) {
            ((ActionMenuView) ahVar2).mo1900g(actionMenuPresenter2);
        }
        this.f2091c = (ActionMenuView) ahVar2;
        C2043bi.m5530X(this.f2091c, (Drawable) null);
        addView(this.f2091c, layoutParams);
    }

    /* renamed from: i */
    public final void mo1834i() {
        if (this.f1735m == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1735m = linearLayout;
            this.f1736n = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1737o = (TextView) this.f1735m.findViewById(R.id.action_bar_subtitle);
            if (this.f1738p != 0) {
                this.f1736n.setTextAppearance(getContext(), this.f1738p);
            }
            if (this.f1739q != 0) {
                this.f1737o.setTextAppearance(getContext(), this.f1739q);
            }
        }
        this.f1736n.setText(this.f1729g);
        this.f1737o.setText(this.f1730h);
        boolean z = !TextUtils.isEmpty(this.f1729g);
        boolean isEmpty = TextUtils.isEmpty(this.f1730h);
        boolean z2 = !isEmpty;
        int i = 8;
        this.f1737o.setVisibility(true != isEmpty ? 0 : 8);
        LinearLayout linearLayout2 = this.f1735m;
        if (z || z2) {
            i = 0;
        }
        linearLayout2.setVisibility(i);
        if (this.f1735m.getParent() == null) {
            addView(this.f1735m);
        }
    }

    /* renamed from: j */
    public final void mo1835j() {
        removeAllViews();
        this.f1734l = null;
        this.f2091c = null;
        this.f2092d = null;
        View view = this.f1733k;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: k */
    public final void mo1836k(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1734l;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1734l = view;
        if (!(view == null || (linearLayout = this.f1735m) == null)) {
            removeView(linearLayout);
            this.f1735m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* renamed from: l */
    public final void mo1837l(CharSequence charSequence) {
        this.f1729g = charSequence;
        mo1834i();
        C2043bi.m5528V(this, charSequence);
    }

    /* renamed from: m */
    public final void mo1838m(boolean z) {
        if (z != this.f1732j) {
            requestLayout();
        }
        this.f1732j = z;
    }

    /* renamed from: n */
    public final void mo1839n() {
        ActionMenuPresenter actionMenuPresenter = this.f2092d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1889o();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f2092d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1887l();
            this.f2092d.mo1890p();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = C0763jq.m2570b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1731i;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1731i.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a = m1944a(paddingRight, i5, b);
            paddingRight = m1944a(a + m1948g(this.f1731i, a, paddingTop, paddingTop2, b), i6, b);
        }
        LinearLayout linearLayout = this.f1735m;
        if (!(linearLayout == null || this.f1734l != null || linearLayout.getVisibility() == 8)) {
            paddingRight += m1948g(this.f1735m, paddingRight, paddingTop, paddingTop2, b);
        }
        View view2 = this.f1734l;
        if (view2 != null) {
            m1948g(view2, paddingRight, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2091c;
        if (actionMenuView != null) {
            m1948g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f2093e;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, LinearLayoutManager.INVALID_OFFSET);
            View view = this.f1731i;
            if (view != null) {
                int f = m1947f(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1731i.getLayoutParams();
                paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f2091c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = m1947f(this.f2091c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f1735m;
            if (linearLayout != null && this.f1734l == null) {
                if (this.f1732j) {
                    this.f1735m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1735m.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1735m.setVisibility(true != z ? 8 : 0);
                } else {
                    paddingLeft = m1947f(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f1734l;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : LinearLayoutManager.INVALID_OFFSET;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = LinearLayoutManager.INVALID_OFFSET;
                }
                if (layoutParams.height >= 0) {
                    i5 = Math.min(layoutParams.height, i5);
                }
                this.f1734l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f2093e <= 0) {
                int childCount = getChildCount();
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i7) {
                        i7 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i7);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0735ip f = C0735ip.m2473f(context, attributeSet, C0338a.f1068d, i, 0);
        C2043bi.m5530X(this, f.mo3246b(0));
        this.f1738p = f.f2596b.getResourceId(5, 0);
        this.f1739q = f.f2596b.getResourceId(4, 0);
        this.f2093e = f.f2596b.getLayoutDimension(3, 0);
        this.f1740r = f.f2596b.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        f.f2596b.recycle();
    }
}
