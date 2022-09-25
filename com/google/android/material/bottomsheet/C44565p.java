package com.google.android.material.bottomsheet;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p033v7.app.C0358as;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2069cc;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.bottomsheet.p */
/* compiled from: PG */
public class C44565p extends C0358as {

    /* renamed from: a */
    private FrameLayout f115953a;

    /* renamed from: c */
    private CoordinatorLayout f115954c;

    /* renamed from: d */
    private final boolean f115955d;

    /* renamed from: e */
    private C44555f f115956e;

    /* renamed from: n */
    public BottomSheetBehavior f115957n;

    /* renamed from: o */
    public FrameLayout f115958o;

    /* renamed from: p */
    boolean f115959p;

    /* renamed from: q */
    public boolean f115960q;

    /* renamed from: r */
    public boolean f115961r;

    /* renamed from: s */
    public C44564o f115962s;

    public C44565p(Context context) {
        this(context, 0);
        this.f115955d = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* renamed from: a */
    private final View m78835a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m78836g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f115953a.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        if (this.f115955d) {
            C2043bi.m5555ai(this.f115958o, new C44559j(this));
        }
        this.f115958o.removeAllViews();
        if (layoutParams == null) {
            this.f115958o.addView(view);
        } else {
            this.f115958o.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new C44560k(this));
        C2043bi.m5526T(this.f115958o, new C44561l(this));
        this.f115958o.setOnTouchListener(new C44562m());
        return this.f115953a;
    }

    /* renamed from: g */
    private final void m78836g() {
        if (this.f115953a == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f115953a = frameLayout;
            this.f115954c = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f115953a.findViewById(R.id.design_bottom_sheet);
            this.f115958o = frameLayout2;
            BottomSheetBehavior C = BottomSheetBehavior.m78767C(frameLayout2);
            this.f115957n = C;
            C.mo47506D(this.f115956e);
            this.f115957n.mo47518u(this.f115959p);
        }
    }

    public final void cancel() {
        mo47541h();
        super.cancel();
    }

    /* renamed from: h */
    public final BottomSheetBehavior mo47541h() {
        if (this.f115957n == null) {
            m78836g();
        }
        return this.f115957n;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.f115955d && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            FrameLayout frameLayout = this.f115953a;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f115954c;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            C2069cc.m5650a(window, !z);
            C44564o oVar = this.f115962s;
            if (oVar != null) {
                oVar.mo47539c(window);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(LinearLayoutManager.INVALID_OFFSET);
            window.setLayout(-1, -1);
        }
    }

    public final void onDetachedFromWindow() {
        C44564o oVar = this.f115962s;
        if (oVar != null) {
            oVar.mo47539c((Window) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f115957n;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f115862E == 5) {
            bottomSheetBehavior.mo47519v(4);
        }
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f115959p != z) {
            this.f115959p = z;
            BottomSheetBehavior bottomSheetBehavior = this.f115957n;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo47518u(z);
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f115959p) {
            this.f115959p = true;
        }
        this.f115960q = z;
        this.f115961r = true;
    }

    public final void setContentView(int i) {
        mo1197b().mo1189q(m78835a(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        mo1197b().mo1189q(m78835a(0, view, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1197b().mo1189q(m78835a(0, view, layoutParams));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C44565p(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x001b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968810(0x7f0400ea, float:1.7546284E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0018
            int r5 = r5.resourceId
            goto L_0x001b
        L_0x0018:
            r5 = 2132150655(0x7f16097f, float:1.994335E38)
        L_0x001b:
            r3.<init>(r4, r5)
            r3.f115959p = r0
            r3.f115960q = r0
            com.google.android.material.bottomsheet.n r4 = new com.google.android.material.bottomsheet.n
            r4.<init>(r3)
            r3.f115956e = r4
            r3.mo1201e()
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            r0 = 2130969443(0x7f040363, float:1.7547568E38)
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r1, r1)
            r3.f115955d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.C44565p.<init>(android.content.Context, int):void");
    }
}
