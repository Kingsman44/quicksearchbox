package com.google.android.material.tabs;

import android.database.DataSetObserver;

/* renamed from: com.google.android.material.tabs.i */
/* compiled from: PG */
final class C44906i extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ TabLayout f117214a;

    public C44906i(TabLayout tabLayout) {
        this.f117214a = tabLayout;
    }

    public final void onChanged() {
        this.f117214a.mo48410f();
    }

    public final void onInvalidated() {
        this.f117214a.mo48410f();
    }
}
