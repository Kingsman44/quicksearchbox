package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C1745d;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2104s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.p2376g.C30643a;
import com.google.android.material.card.MaterialCardView;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.bq */
/* compiled from: PG */
public class C30746bq extends C30741bl {

    /* renamed from: c */
    public final MaterialCardView f82981c;

    /* renamed from: d */
    public final boolean f82982d;

    /* renamed from: e */
    public final C30643a f82983e;

    /* renamed from: f */
    public View f82984f;

    /* renamed from: g */
    public final View f82985g;

    /* renamed from: h */
    public boolean f82986h;

    /* renamed from: i */
    public final ViewTreeObserver.OnGlobalLayoutListener f82987i = new C30745bp(this);

    /* renamed from: j */
    private final int f82988j;

    /* renamed from: k */
    private final int f82989k;

    /* renamed from: l */
    private int f82990l = -1;

    /* renamed from: m */
    private int f82991m = -1;

    public C30746bq(Context context) {
        super(context);
        MaterialCardView materialCardView = (MaterialCardView) ((ConstraintLayout) this.f82975a).findViewById(R.id.og_popover);
        this.f82981c = materialCardView;
        View findViewById = ((ConstraintLayout) this.f82975a).findViewById(R.id.dialog_scrim);
        this.f82985g = findViewById;
        findViewById.setOnClickListener(new C30742bm(this));
        Resources resources = getContext().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        this.f82988j = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
        this.f82989k = context.getResources().getDimensionPixelSize(R.dimen.account_menu_popover_vertical_margin_from_disc);
        this.f82982d = context.getResources().getBoolean(R.bool.is_large_screen);
        C30643a aVar = new C30643a(context);
        this.f82983e = aVar;
        materialCardView.mo4473c(aVar.f82732a);
        materialCardView.mo47610k(ColorStateList.valueOf(aVar.f82732a));
    }

    /* renamed from: n */
    static boolean m57427n(View view) {
        return (view.getMeasuredHeightAndState() & 16777216) == 16777216;
    }

    /* renamed from: o */
    private final void m57428o() {
        int i;
        int i2;
        if (!this.f82986h) {
            C1756o oVar = new C1756o();
            oVar.mo4889i((ConstraintLayout) this.f82975a);
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.account_menu_popover_vertical_margin);
            float f = 0.5f;
            boolean z = false;
            if (this.f82990l >= 0) {
                oVar.mo4882A(0.0f);
                oVar.mo4904z(this.f82990l);
                i = 0;
            } else {
                oVar.mo4882A(0.5f);
                oVar.mo4904z(0);
                i = dimensionPixelSize;
            }
            oVar.mo4888h((ConstraintLayout) this.f82975a);
            C1745d dVar = (C1745d) this.f82981c.getLayoutParams();
            dVar.topMargin = i;
            dVar.bottomMargin = dimensionPixelSize;
            C1756o oVar2 = new C1756o();
            oVar2.mo4889i((ConstraintLayout) this.f82975a);
            if (this.f82982d && this.f82991m >= 0) {
                z = true;
            }
            if (true == z) {
                f = 1.0f;
            }
            if (z) {
                i2 = this.f82991m;
            } else {
                i2 = ((ConstraintLayout) this.f82975a).getResources().getDimensionPixelSize(R.dimen.account_menu_popover_side_margin);
            }
            oVar2.mo4899u(R.id.og_popover, f);
            oVar2.mo4888h((ConstraintLayout) this.f82975a);
            C2104s.m5793f((ViewGroup.MarginLayoutParams) this.f82981c.getLayoutParams(), i2);
            this.f82981c.requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36444a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo36445g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo36446h() {
        return m57427n(this.f82984f);
    }

    /* renamed from: i */
    public final void mo36447i(View view) {
        if (C2043bi.m5570ax(view)) {
            mo36449k(view);
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C30744bo(this, view));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo36448j(Activity activity, int i, View view) {
        if (i == -1) {
            this.f82990l = -1;
            this.f82991m = -1;
            m57428o();
            return;
        }
        if (view == null) {
            view = activity.findViewById(i);
        }
        if (view != null) {
            mo36447i(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo36449k(View view) {
        int i;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f82990l = ((iArr[1] + view.getHeight()) - this.f82988j) + this.f82989k;
        int i2 = iArr[0];
        if (C2043bi.m5577f(view) == 1) {
            i = i2 + view.getPaddingLeft();
        } else {
            i = ((((ConstraintLayout) this.f82975a).getResources().getDisplayMetrics().widthPixels - i2) - view.getWidth()) + view.getPaddingRight();
        }
        this.f82991m = i;
        m57428o();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36450m(boolean r4) {
        /*
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            android.view.View r1 = r0.getDecorView()
            int r1 = r1.getSystemUiVisibility()
            r1 = r1 | 256(0x100, float:3.59E-43)
            com.google.android.libraries.onegoogle.accountmenu.g.a r2 = r3.f82983e
            boolean r2 = r2.f82738g
            if (r4 == 0) goto L_0x0020
            if (r2 == 0) goto L_0x0019
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            goto L_0x001b
        L_0x0019:
            r1 = r1 & -8193(0xffffffffffffdfff, float:NaN)
        L_0x001b:
            if (r2 == 0) goto L_0x0022
            r1 = r1 | 16
            goto L_0x0024
        L_0x0020:
            r1 = r1 | 512(0x200, float:7.175E-43)
        L_0x0022:
            r1 = r1 & -17
        L_0x0024:
            android.view.View r2 = r0.getDecorView()
            r2.setSystemUiVisibility(r1)
            com.google.android.libraries.onegoogle.accountmenu.g.a r1 = r3.f82983e
            int r1 = r1.f82732a
            r2 = 1
            if (r2 == r4) goto L_0x0033
            r1 = 0
        L_0x0033:
            r0.setStatusBarColor(r1)
            r0.setNavigationBarColor(r1)
            r0.setNavigationBarDividerColor(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmenu.internal.C30746bq.mo36450m(boolean):void");
    }

    public void setContentView(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        view.addOnAttachStateChangeListener(new C30743bn(this));
        this.f82984f = view;
        m57428o();
        this.f82981c.addView(view);
        View findViewById = this.f82984f.findViewById(R.id.close_button);
        if (findViewById != null) {
            C2043bi.m5530X(findViewById, this.f82983e.f82737f);
        }
        mo1197b().mo1189q(this.f82975a);
    }
}
