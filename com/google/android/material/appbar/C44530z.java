package com.google.android.material.appbar;

import android.view.View;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.material.appbar.z */
/* compiled from: PG */
final class C44530z {

    /* renamed from: a */
    public int f115780a;

    /* renamed from: b */
    public int f115781b;

    /* renamed from: c */
    private final View f115782c;

    /* renamed from: d */
    private int f115783d;

    public C44530z(View view) {
        this.f115782c = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47467a() {
        View view = this.f115782c;
        C2043bi.m5517K(view, this.f115781b - (view.getTop() - this.f115780a));
        View view2 = this.f115782c;
        C2043bi.m5516J(view2, -(view2.getLeft() - this.f115783d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47468b() {
        this.f115780a = this.f115782c.getTop();
        this.f115783d = this.f115782c.getLeft();
    }

    /* renamed from: c */
    public final boolean mo47469c(int i) {
        if (this.f115781b == i) {
            return false;
        }
        this.f115781b = i;
        mo47467a();
        return true;
    }
}
