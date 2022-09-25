package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.y */
/* compiled from: PG */
class C44529y extends C1770c {

    /* renamed from: a */
    private C44530z f115778a;

    /* renamed from: b */
    private int f115779b = 0;

    public C44529y() {
    }

    public C44529y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: C */
    public final int mo47465C() {
        C44530z zVar = this.f115778a;
        if (zVar != null) {
            return zVar.f115781b;
        }
        return 0;
    }

    /* renamed from: D */
    public final boolean mo47466D(int i) {
        C44530z zVar = this.f115778a;
        if (zVar != null) {
            return zVar.mo47469c(i);
        }
        this.f115779b = i;
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo47463W(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.mo4927k(view, i);
    }

    /* renamed from: g */
    public boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo47463W(coordinatorLayout, view, i);
        if (this.f115778a == null) {
            this.f115778a = new C44530z(view);
        }
        this.f115778a.mo47468b();
        this.f115778a.mo47467a();
        int i2 = this.f115779b;
        if (i2 == 0) {
            return true;
        }
        this.f115778a.mo47469c(i2);
        this.f115779b = 0;
        return true;
    }
}
