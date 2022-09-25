package com.facebook.litho;

import android.view.ViewParent;
import androidx.core.p098j.C2043bi;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: com.facebook.litho.cv */
/* compiled from: PG */
final class C6174cv {

    /* renamed from: a */
    public final List f18218a = new ArrayList(2);

    /* renamed from: b */
    private final ComponentTree f18219b;

    public C6174cv(ComponentTree componentTree) {
        this.f18219b = componentTree;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13148a(LithoView lithoView) {
        if (this.f18219b.f17910m) {
            for (ViewParent parent = lithoView.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof ViewPager) {
                    ViewPager viewPager = (ViewPager) parent;
                    C6173cu cuVar = new C6173cu(this.f18219b, viewPager);
                    try {
                        viewPager.mo9137f(cuVar);
                    } catch (ConcurrentModificationException unused) {
                        C2043bi.m5520N(viewPager, new C6171cs(viewPager, cuVar));
                    }
                    this.f18218a.add(cuVar);
                }
            }
        }
    }
}
