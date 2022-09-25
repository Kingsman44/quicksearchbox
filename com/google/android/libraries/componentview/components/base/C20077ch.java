package com.google.android.libraries.componentview.components.base;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.componentview.p1697d.C20470a;

/* renamed from: com.google.android.libraries.componentview.components.base.ch */
/* compiled from: PG */
final class C20077ch implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f56316a;

    /* renamed from: b */
    final /* synthetic */ View f56317b;

    /* renamed from: c */
    final /* synthetic */ C20470a f56318c;

    /* renamed from: d */
    final /* synthetic */ float f56319d;

    /* renamed from: e */
    final /* synthetic */ float f56320e;

    /* renamed from: f */
    final /* synthetic */ float f56321f;

    /* renamed from: g */
    final /* synthetic */ float f56322g;

    /* renamed from: h */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f56323h;

    public C20077ch(View view, View view2, C20470a aVar, float f, float f2, float f3, float f4, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f56316a = view;
        this.f56317b = view2;
        this.f56318c = aVar;
        this.f56319d = f;
        this.f56320e = f2;
        this.f56321f = f3;
        this.f56322g = f4;
        this.f56323h = onGlobalLayoutListener;
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.f56316a.getVisibility() != 8) {
            C20078ci.m37955B(this.f56317b, this.f56318c, this.f56319d, this.f56320e, this.f56321f, this.f56322g, this.f56316a);
        } else {
            this.f56316a.getViewTreeObserver().addOnGlobalLayoutListener(this.f56323h);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f56316a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f56323h);
        this.f56316a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f56323h);
    }
}
