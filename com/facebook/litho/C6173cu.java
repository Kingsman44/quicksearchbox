package com.facebook.litho;

import androidx.viewpager.widget.C4281n;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.litho.cu */
/* compiled from: PG */
final class C6173cu extends C4281n {

    /* renamed from: a */
    public final WeakReference f18216a;

    /* renamed from: b */
    public final WeakReference f18217b;

    public C6173cu(ComponentTree componentTree, ViewPager viewPager) {
        this.f18216a = new WeakReference(componentTree);
        this.f18217b = new WeakReference(viewPager);
    }

    /* renamed from: c */
    public final void mo9183c(int i, float f, int i2) {
        ComponentTree componentTree = (ComponentTree) this.f18216a.get();
        if (componentTree != null) {
            componentTree.mo12717l();
        }
    }
}
