package com.google.android.material.tabs;

import androidx.viewpager2.widget.C4313p;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.tabs.s */
/* compiled from: PG */
final class C44916s extends C4313p {

    /* renamed from: a */
    private final WeakReference f117244a;

    /* renamed from: b */
    private int f117245b = 0;

    /* renamed from: c */
    private int f117246c = 0;

    public C44916s(TabLayout tabLayout) {
        this.f117244a = new WeakReference(tabLayout);
    }

    /* renamed from: a */
    public final void mo9201a(int i) {
        this.f117245b = this.f117246c;
        this.f117246c = i;
    }

    /* renamed from: b */
    public final void mo9202b(int i) {
        TabLayout tabLayout = (TabLayout) this.f117244a.get();
        if (tabLayout != null && tabLayout.mo48401a() != i && i < tabLayout.f117183a.size()) {
            int i2 = this.f117246c;
            boolean z = true;
            if (!(i2 == 0 || (i2 == 2 && this.f117245b == 0))) {
                z = false;
            }
            tabLayout.mo48413h(tabLayout.mo48406b(i), z);
        }
    }

    /* renamed from: d */
    public final void mo9233d(int i, float f, int i2) {
        TabLayout tabLayout = (TabLayout) this.f117244a.get();
        if (tabLayout != null) {
            int i3 = this.f117246c;
            boolean z = false;
            boolean z2 = i3 != 2 || this.f117245b == 1;
            if (!(i3 == 2 && this.f117245b == 0)) {
                z = true;
            }
            tabLayout.mo48415j(i, f, z2, z);
        }
    }
}
