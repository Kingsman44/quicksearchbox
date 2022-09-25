package com.google.android.material.tabs;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0642fd;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: com.google.android.material.tabs.u */
/* compiled from: PG */
public final class C44918u {

    /* renamed from: a */
    private final TabLayout f117248a;

    /* renamed from: b */
    private final ViewPager2 f117249b;

    /* renamed from: c */
    private final C44915r f117250c;

    /* renamed from: d */
    private C0640fb f117251d;

    /* renamed from: e */
    private boolean f117252e;

    /* renamed from: f */
    private C44916s f117253f;

    /* renamed from: g */
    private C44905h f117254g;

    /* renamed from: h */
    private C0642fd f117255h;

    public C44918u(TabLayout tabLayout, ViewPager2 viewPager2, C44915r rVar) {
        this.f117248a = tabLayout;
        this.f117249b = viewPager2;
        this.f117250c = rVar;
    }

    /* renamed from: a */
    public final void mo48453a() {
        if (!this.f117252e) {
            C0640fb fbVar = this.f117249b.f13896f.mAdapter;
            this.f117251d = fbVar;
            if (fbVar != null) {
                this.f117252e = true;
                C44916s sVar = new C44916s(this.f117248a);
                this.f117253f = sVar;
                this.f117249b.f13892b.mo9232c(sVar);
                C44917t tVar = new C44917t(this.f117249b);
                this.f117254g = tVar;
                this.f117248a.mo48408d(tVar);
                C44914q qVar = new C44914q(this);
                this.f117255h = qVar;
                this.f117251d.mObservable.registerObserver(qVar);
                mo48455c();
                this.f117248a.mo48418m(this.f117249b.f13893c);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* renamed from: b */
    public final void mo48454b() {
        C0640fb fbVar = this.f117251d;
        if (fbVar != null) {
            fbVar.mObservable.unregisterObserver(this.f117255h);
            this.f117255h = null;
        }
        TabLayout tabLayout = this.f117248a;
        tabLayout.f117167A.remove(this.f117254g);
        ViewPager2 viewPager2 = this.f117249b;
        viewPager2.f13892b.mo9234e(this.f117253f);
        this.f117254g = null;
        this.f117253f = null;
        this.f117251d = null;
        this.f117252e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo48455c() {
        this.f117248a.mo48411g();
        C0640fb fbVar = this.f117251d;
        if (fbVar != null) {
            int itemCount = fbVar.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                C44909l c = this.f117248a.mo48407c();
                this.f117250c.mo17416a(c, i);
                this.f117248a.mo48409e(c, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.f117249b.f13893c, this.f117248a.f117183a.size() - 1);
                if (min != this.f117248a.mo48401a()) {
                    TabLayout tabLayout = this.f117248a;
                    tabLayout.mo48413h(tabLayout.mo48406b(min), true);
                }
            }
        }
    }
}
