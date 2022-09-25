package com.facebook.litho;

import androidx.viewpager.widget.ViewPager;

/* renamed from: com.facebook.litho.ct */
/* compiled from: PG */
final class C6172ct implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ViewPager f18214a;

    /* renamed from: b */
    final /* synthetic */ C6173cu f18215b;

    public C6172ct(C6173cu cuVar, ViewPager viewPager) {
        this.f18215b = cuVar;
        this.f18214a = viewPager;
    }

    public final void run() {
        this.f18214a.mo9145j(this.f18215b);
    }
}
