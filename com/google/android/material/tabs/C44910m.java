package com.google.android.material.tabs;

import androidx.viewpager.widget.C4277j;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.tabs.m */
/* compiled from: PG */
public final class C44910m implements C4277j {

    /* renamed from: a */
    public int f117229a;

    /* renamed from: b */
    public int f117230b;

    /* renamed from: c */
    private final WeakReference f117231c;

    public C44910m(TabLayout tabLayout) {
        this.f117231c = new WeakReference(tabLayout);
    }

    /* renamed from: a */
    public final void mo9182a(int i) {
        this.f117229a = this.f117230b;
        this.f117230b = i;
    }

    /* renamed from: c */
    public final void mo9183c(int i, float f, int i2) {
        TabLayout tabLayout = (TabLayout) this.f117231c.get();
        if (tabLayout != null) {
            int i3 = this.f117230b;
            boolean z = false;
            boolean z2 = i3 != 2 || this.f117229a == 1;
            if (!(i3 == 2 && this.f117229a == 0)) {
                z = true;
            }
            tabLayout.mo48415j(i, f, z2, z);
        }
    }

    /* renamed from: e */
    public final void mo9184e(int i) {
        TabLayout tabLayout = (TabLayout) this.f117231c.get();
        if (tabLayout != null && tabLayout.mo48401a() != i && i < tabLayout.f117183a.size()) {
            int i2 = this.f117230b;
            boolean z = true;
            if (!(i2 == 0 || (i2 == 2 && this.f117229a == 0))) {
                z = false;
            }
            tabLayout.mo48413h(tabLayout.mo48406b(i), z);
        }
    }
}
