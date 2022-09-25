package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.widget.bc */
/* compiled from: PG */
final class C0533bc extends C0613eb implements C0535be {

    /* renamed from: a */
    public CharSequence f2101a;

    /* renamed from: b */
    ListAdapter f2102b;

    /* renamed from: c */
    public final Rect f2103c = new Rect();

    /* renamed from: d */
    final /* synthetic */ AppCompatSpinner f2104d;

    /* renamed from: r */
    private int f2105r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0533bc(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2104d = appCompatSpinner;
        this.f2360k = appCompatSpinner;
        mo2829w();
        this.f2361l = new C0528az(this);
    }

    /* renamed from: d */
    public final CharSequence mo2531d() {
        return this.f2101a;
    }

    /* renamed from: e */
    public final void mo2532e(ListAdapter listAdapter) {
        super.mo2532e(listAdapter);
        this.f2102b = listAdapter;
    }

    /* renamed from: h */
    public final void mo2535h(int i) {
        this.f2105r = i;
    }

    /* renamed from: i */
    public final void mo2536i(CharSequence charSequence) {
        this.f2101a = charSequence;
    }

    /* renamed from: k */
    public final void mo2538k(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean isShowing = this.f2366q.isShowing();
        mo2563n();
        mo2828u();
        super.mo1576v();
        C0578cu cuVar = this.f2354e;
        cuVar.setChoiceMode(1);
        C0524av.m1929d(cuVar, i);
        C0524av.m1928c(cuVar, i2);
        int selectedItemPosition = this.f2104d.getSelectedItemPosition();
        C0578cu cuVar2 = this.f2354e;
        if (this.f2366q.isShowing() && cuVar2 != null) {
            cuVar2.f2225a = false;
            cuVar2.setSelection(selectedItemPosition);
            if (cuVar2.getChoiceMode() != 0) {
                cuVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = this.f2104d.getViewTreeObserver()) != null) {
            C0531ba baVar = new C0531ba(this);
            viewTreeObserver.addOnGlobalLayoutListener(baVar);
            this.f2366q.setOnDismissListener(new C0532bb(this, baVar));
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.widget.SpinnerAdapter, android.widget.ListAdapter] */
    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo2563n() {
        int i;
        Drawable background = this.f2366q.getBackground();
        if (background != null) {
            background.getPadding(this.f2104d.f1811d);
            if (C0763jq.m2570b(this.f2104d)) {
                i = this.f2104d.f1811d.right;
            } else {
                i = -this.f2104d.f1811d.left;
            }
        } else {
            Rect rect = this.f2104d.f1811d;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = this.f2104d.getPaddingLeft();
        int paddingRight = this.f2104d.getPaddingRight();
        int width = this.f2104d.getWidth();
        AppCompatSpinner appCompatSpinner = this.f2104d;
        int i2 = appCompatSpinner.f1810c;
        if (i2 == -2) {
            int a = appCompatSpinner.mo1969a(this.f2102b, this.f2366q.getBackground());
            int i3 = (this.f2104d.getContext().getResources().getDisplayMetrics().widthPixels - this.f2104d.f1811d.left) - this.f2104d.f1811d.right;
            if (a > i3) {
                a = i3;
            }
            mo2825r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            mo2825r((width - paddingLeft) - paddingRight);
        } else {
            mo2825r(i2);
        }
        this.f2356g = C0763jq.m2570b(this.f2104d) ? i + (((width - paddingRight) - this.f2355f) - this.f2105r) : i + paddingLeft + this.f2105r;
    }
}
