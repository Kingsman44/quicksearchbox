package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;

/* renamed from: com.google.android.material.floatingactionbutton.f */
/* compiled from: PG */
final class C44667f implements C44677p {

    /* renamed from: a */
    final /* synthetic */ ExtendedFloatingActionButton f116448a;

    public C44667f(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.f116448a = extendedFloatingActionButton;
    }

    /* renamed from: a */
    public final int mo47964a() {
        return this.f116448a.getMeasuredHeight();
    }

    /* renamed from: b */
    public final int mo47965b() {
        return this.f116448a.f116356r;
    }

    /* renamed from: c */
    public final int mo47966c() {
        return this.f116448a.f116355q;
    }

    /* renamed from: d */
    public final int mo47967d() {
        int measuredWidth = this.f116448a.getMeasuredWidth();
        int b = this.f116448a.mo32790b();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f116448a;
        return (measuredWidth - (b + b)) + extendedFloatingActionButton.f116355q + extendedFloatingActionButton.f116356r;
    }

    /* renamed from: e */
    public final ViewGroup.LayoutParams mo47968e() {
        return new ViewGroup.LayoutParams(-2, -2);
    }
}
