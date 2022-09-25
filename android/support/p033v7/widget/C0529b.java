package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p033v7.p034a.C0338a;
import android.support.p033v7.view.C0433a;
import android.support.p033v7.view.menu.C0477q;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2058bx;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.b */
/* compiled from: PG */
abstract class C0529b extends ViewGroup {

    /* renamed from: a */
    protected final C0490a f2089a;

    /* renamed from: b */
    protected final Context f2090b;

    /* renamed from: c */
    protected ActionMenuView f2091c;

    /* renamed from: d */
    protected ActionMenuPresenter f2092d;

    /* renamed from: e */
    public int f2093e;

    /* renamed from: f */
    protected C2058bx f2094f;

    /* renamed from: g */
    private boolean f2095g;

    /* renamed from: h */
    private boolean f2096h;

    C0529b(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    protected static int m1944a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: f */
    protected static final int m1947f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, LinearLayoutManager.INVALID_OFFSET), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* renamed from: g */
    protected static final int m1948g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    /* renamed from: b */
    public final C2058bx mo2556b(int i, long j) {
        C2058bx bxVar = this.f2094f;
        if (bxVar != null) {
            bxVar.mo5199a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C2058bx x = C2043bi.m5595x(this);
            x.mo5201c(1.0f);
            x.mo5202d(j);
            C0490a aVar = this.f2089a;
            aVar.mo2432d(x, 0);
            x.mo5203e(aVar);
            return x;
        }
        C2058bx x2 = C2043bi.m5595x(this);
        x2.mo5201c(0.0f);
        x2.mo5202d(j);
        C0490a aVar2 = this.f2089a;
        aVar2.mo2432d(x2, i);
        x2.mo5203e(aVar2);
        return x2;
    }

    /* renamed from: d */
    public void mo1830d(int i) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0338a.f1065a, R.attr.actionBarStyle, 0);
        mo1830d(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f2092d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.f1770i = C0433a.m1392a(actionMenuPresenter.f1591b);
            C0477q qVar = actionMenuPresenter.f1592c;
            if (qVar != null) {
                qVar.mo1665l(true);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.f2096h = false;
            actionMasked = 9;
        }
        if (!this.f2096h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.f2096h = true;
                }
                if (i == 10 || i == 3) {
                    this.f2096h = false;
                }
                return true;
            }
        }
        i = actionMasked;
        this.f2096h = false;
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2095g = false;
            actionMasked = 0;
        }
        if (!this.f2095g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.f2095g = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2095g = false;
        }
        return true;
    }

    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C2058bx bxVar = this.f2094f;
            if (bxVar != null) {
                bxVar.mo5199a();
            }
            super.setVisibility(i);
        }
    }

    public C0529b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0529b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2089a = new C0490a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2090b = context;
        } else {
            this.f2090b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
