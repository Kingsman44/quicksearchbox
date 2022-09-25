package com.google.android.material.tabs;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;

/* renamed from: com.google.android.material.tabs.l */
/* compiled from: PG */
public final class C44909l {

    /* renamed from: a */
    public Drawable f117220a;

    /* renamed from: b */
    public CharSequence f117221b;

    /* renamed from: c */
    public CharSequence f117222c;

    /* renamed from: d */
    public int f117223d = -1;

    /* renamed from: e */
    public View f117224e;

    /* renamed from: f */
    public final int f117225f = 1;

    /* renamed from: g */
    public TabLayout f117226g;

    /* renamed from: h */
    public C44912o f117227h;

    /* renamed from: i */
    public int f117228i = -1;

    /* renamed from: a */
    public final void mo48441a() {
        TabLayout tabLayout = this.f117226g;
        if (tabLayout != null) {
            tabLayout.mo48413h(this, true);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo48442b() {
        C44912o oVar = this.f117227h;
        if (oVar != null) {
            oVar.mo48447b();
        }
    }

    /* renamed from: c */
    public final void mo48443c(Drawable drawable) {
        this.f117220a = drawable;
        TabLayout tabLayout = this.f117226g;
        if (tabLayout.f117199q == 1 || tabLayout.f117202t == 2) {
            tabLayout.mo48417l(true);
        }
        mo48442b();
    }

    /* renamed from: d */
    public final void mo48444d(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.f117222c) && !TextUtils.isEmpty(charSequence)) {
            this.f117227h.setContentDescription(charSequence);
        }
        this.f117221b = charSequence;
        mo48442b();
    }
}
