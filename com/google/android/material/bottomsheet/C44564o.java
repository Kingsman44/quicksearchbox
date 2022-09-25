package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import androidx.core.p098j.C2088cv;
import com.google.android.material.internal.C44750j;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3515l.C44779j;

/* renamed from: com.google.android.material.bottomsheet.o */
/* compiled from: PG */
final class C44564o extends C44555f {

    /* renamed from: a */
    private final Boolean f115949a;

    /* renamed from: b */
    private final C2082cp f115950b;

    /* renamed from: c */
    private Window f115951c;

    /* renamed from: d */
    private boolean f115952d;

    public C44564o(View view, C2082cp cpVar) {
        ColorStateList colorStateList;
        this.f115950b = cpVar;
        C44779j jVar = BottomSheetBehavior.m78767C(view).f115899j;
        if (jVar != null) {
            colorStateList = jVar.f116741C.f116721d;
        } else {
            colorStateList = C2043bi.m5585n(view);
        }
        if (colorStateList != null) {
            this.f115949a = Boolean.valueOf(C44535e.m78723f(colorStateList.getDefaultColor()));
        } else if (view.getBackground() instanceof ColorDrawable) {
            this.f115949a = Boolean.valueOf(C44535e.m78723f(((ColorDrawable) view.getBackground()).getColor()));
        } else {
            this.f115949a = null;
        }
    }

    /* renamed from: e */
    private final void m78830e(View view) {
        boolean z;
        if (view.getTop() < this.f115950b.mo5242d()) {
            Window window = this.f115951c;
            if (window != null) {
                Boolean bool = this.f115949a;
                if (bool == null) {
                    z = this.f115952d;
                } else {
                    z = bool.booleanValue();
                }
                C44750j.m79355a(window, z);
            }
            view.setPadding(view.getPaddingLeft(), this.f115950b.mo5242d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else if (view.getTop() != 0) {
            Window window2 = this.f115951c;
            if (window2 != null) {
                C44750j.m79355a(window2, this.f115952d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public final void mo32311a(View view, float f) {
        m78830e(view);
    }

    /* renamed from: b */
    public final void mo32312b(View view, int i) {
        m78830e(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo47539c(Window window) {
        if (this.f115951c != window) {
            this.f115951c = window;
            if (window != null) {
                this.f115952d = new C2088cv(window, window.getDecorView()).f5998a.mo5254f();
            }
        }
    }

    /* renamed from: d */
    public final void mo47531d(View view) {
        m78830e(view);
    }
}
