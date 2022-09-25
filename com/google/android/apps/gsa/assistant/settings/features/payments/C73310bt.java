package com.google.android.apps.gsa.assistant.settings.features.payments;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.payments.bt */
/* compiled from: PG */
public final class C73310bt {

    /* renamed from: a */
    public final View f194186a;

    /* renamed from: b */
    private final ViewGroup f194187b;

    public C73310bt(ViewGroup viewGroup, View view) {
        this.f194187b = viewGroup;
        this.f194186a = view;
    }

    /* renamed from: a */
    public final void mo64837a() {
        this.f194187b.addView(this.f194186a);
    }

    /* renamed from: b */
    public final void mo64838b() {
        this.f194187b.removeView(this.f194186a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo64839c() {
        return this.f194186a.getParent() == this.f194187b;
    }
}
