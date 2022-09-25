package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.core.p098j.C2043bi;
import androidx.p198v.p199a.p200a.C4244c;
import com.google.android.material.internal.C44733be;
import com.google.android.material.theme.p3518a.C44965a;

/* renamed from: com.google.android.material.progressindicator.f */
/* compiled from: PG */
public abstract class C44848f extends ProgressBar {

    /* renamed from: a */
    public final C44849g f117002a;

    /* renamed from: b */
    public int f117003b;

    /* renamed from: c */
    public boolean f117004c;

    /* renamed from: d */
    public long f117005d = -1;

    /* renamed from: e */
    public boolean f117006e = false;

    /* renamed from: f */
    public final int f117007f = 4;

    /* renamed from: g */
    private final boolean f117008g;

    /* renamed from: h */
    private final int f117009h;

    /* renamed from: i */
    private final int f117010i;

    /* renamed from: j */
    private final Runnable f117011j = new C44844b(this);

    /* renamed from: k */
    private final Runnable f117012k = new C44845c(this);

    /* renamed from: l */
    private final C4244c f117013l = new C44846d(this);

    /* renamed from: m */
    private final C4244c f117014m = new C44847e(this);

    protected C44848f(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C44965a.m79936a(context, attributeSet, i, 2132151808), attributeSet, i);
        Context context2 = getContext();
        this.f117002a = mo48253a(context2, attributeSet);
        TypedArray a = C44733be.m79295a(context2, attributeSet, C44843ag.f116995a, i, i2, new int[0]);
        this.f117009h = a.getInt(5, -1);
        this.f117010i = Math.min(a.getInt(3, -1), 1000);
        a.recycle();
        this.f117008g = true;
    }

    /* renamed from: a */
    public abstract C44849g mo48253a(Context context, AttributeSet attributeSet);

    /* renamed from: b */
    public final C44858p mo48269b() {
        return (C44858p) super.getProgressDrawable();
    }

    /* renamed from: c */
    public final C44865w mo48270c() {
        return (C44865w) super.getIndeterminateDrawable();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo48271d(boolean z) {
        if (this.f117008g) {
            ((C44862t) getCurrentDrawable()).mo48319g(mo48280j(), false, z);
        }
    }

    /* renamed from: e */
    public final void mo48272e() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f117011j);
            return;
        }
        removeCallbacks(this.f117012k);
        long uptimeMillis = SystemClock.uptimeMillis() - this.f117005d;
        long j = (long) this.f117010i;
        if (uptimeMillis >= j) {
            this.f117012k.run();
        } else {
            postDelayed(this.f117012k, j - uptimeMillis);
        }
    }

    /* renamed from: f */
    public final void mo48273f() {
        ((C44862t) getCurrentDrawable()).mo48319g(false, false, true);
        if (((C44858p) super.getProgressDrawable()) != null && ((C44858p) super.getProgressDrawable()).isVisible()) {
            return;
        }
        if (((C44865w) super.getIndeterminateDrawable()) == null || !((C44865w) super.getIndeterminateDrawable()).isVisible()) {
            setVisibility(4);
        }
    }

    /* renamed from: g */
    public final void mo48274g() {
        if (this.f117010i > 0) {
            this.f117005d = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public final Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return (C44865w) super.getIndeterminateDrawable();
        }
        return (C44858p) super.getProgressDrawable();
    }

    public final /* synthetic */ Drawable getIndeterminateDrawable() {
        return (C44865w) super.getIndeterminateDrawable();
    }

    public final /* synthetic */ Drawable getProgressDrawable() {
        return (C44858p) super.getProgressDrawable();
    }

    /* renamed from: h */
    public void mo48254h(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (((C44858p) super.getProgressDrawable()) != null && !z) {
                ((C44858p) super.getProgressDrawable()).jumpToCurrentState();
            }
        } else if (((C44858p) super.getProgressDrawable()) != null) {
            this.f117003b = i;
            this.f117004c = z;
            this.f117006e = true;
            if (!((C44865w) super.getIndeterminateDrawable()).isVisible() || C44836a.m79572a(getContext().getContentResolver()) == 0.0f) {
                this.f117013l.mo8946b((C44865w) super.getIndeterminateDrawable());
            } else {
                ((C44865w) super.getIndeterminateDrawable()).f117068b.mo48259c();
            }
        }
    }

    /* renamed from: i */
    public final void mo48278i() {
        if (this.f117009h > 0) {
            removeCallbacks(this.f117011j);
            postDelayed(this.f117011j, (long) this.f117009h);
            return;
        }
        ((C44844b) this.f117011j).f116998a.mo48274g();
    }

    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo48280j() {
        if (!C2043bi.m5569aw(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(((C44858p) super.getProgressDrawable()) == null || ((C44865w) super.getIndeterminateDrawable()) == null)) {
            ((C44865w) super.getIndeterminateDrawable()).f117068b.mo48258b(this.f117013l);
        }
        if (((C44858p) super.getProgressDrawable()) != null) {
            ((C44858p) super.getProgressDrawable()).mo48315c(this.f117014m);
        }
        if (((C44865w) super.getIndeterminateDrawable()) != null) {
            ((C44865w) super.getIndeterminateDrawable()).mo48315c(this.f117014m);
        }
        if (mo48280j()) {
            mo48274g();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f117012k);
        removeCallbacks(this.f117011j);
        ((C44862t) getCurrentDrawable()).mo48319g(false, false, false);
        if (((C44865w) super.getIndeterminateDrawable()) != null) {
            ((C44865w) super.getIndeterminateDrawable()).mo48322i(this.f117014m);
            ((C44865w) super.getIndeterminateDrawable()).f117068b.mo48261e();
        }
        if (((C44858p) super.getProgressDrawable()) != null) {
            ((C44858p) super.getProgressDrawable()).mo48322i(this.f117014m);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        C44863u uVar = null;
        if (isIndeterminate()) {
            if (((C44865w) super.getIndeterminateDrawable()) != null) {
                uVar = ((C44865w) super.getIndeterminateDrawable()).f117067a;
            }
        } else if (((C44858p) super.getProgressDrawable()) != null) {
            uVar = ((C44858p) super.getProgressDrawable()).f117045a;
        }
        if (uVar != null) {
            if (uVar.mo48294b() < 0) {
                i3 = getDefaultSize(getSuggestedMinimumWidth(), i);
            } else {
                i3 = uVar.mo48294b() + getPaddingLeft() + getPaddingRight();
            }
            if (uVar.mo48293a() < 0) {
                i4 = getDefaultSize(getSuggestedMinimumHeight(), i2);
            } else {
                i4 = uVar.mo48293a() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        mo48271d(i == 0);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        mo48271d(false);
    }

    public final synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            Drawable currentDrawable = getCurrentDrawable();
            if (currentDrawable != null) {
                ((C44862t) currentDrawable).mo48319g(false, false, false);
            }
            super.setIndeterminate(z);
            Drawable currentDrawable2 = getCurrentDrawable();
            if (currentDrawable2 != null) {
                ((C44862t) currentDrawable2).mo48319g(mo48280j(), false, false);
            }
            if ((currentDrawable2 instanceof C44865w) && mo48280j()) {
                ((C44865w) currentDrawable2).f117068b.mo48260d();
            }
            this.f117006e = false;
        }
    }

    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof C44865w) {
            ((C44862t) drawable).mo48319g(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public final synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            mo48254h(i, false);
        }
    }

    public final void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof C44858p) {
            C44858p pVar = (C44858p) drawable;
            pVar.mo48319g(false, false, false);
            super.setProgressDrawable(pVar);
            pVar.setLevel((int) ((((float) getProgress()) / ((float) getMax())) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }
}
