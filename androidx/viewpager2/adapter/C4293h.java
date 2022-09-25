package androidx.viewpager2.adapter;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0642fd;
import android.support.p033v7.widget.RecyclerView;
import android.view.ViewParent;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2389t;
import androidx.viewpager2.widget.C4313p;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.viewpager2.adapter.h */
/* compiled from: PG */
final class C4293h {

    /* renamed from: a */
    public C4313p f13885a;

    /* renamed from: b */
    public C0642fd f13886b;

    /* renamed from: c */
    public C2389t f13887c;

    /* renamed from: d */
    public ViewPager2 f13888d;

    /* renamed from: e */
    final /* synthetic */ FragmentStateAdapter f13889e;

    /* renamed from: f */
    private long f13890f = -1;

    public C4293h(FragmentStateAdapter fragmentStateAdapter) {
        this.f13889e = fragmentStateAdapter;
    }

    /* renamed from: b */
    public static final ViewPager2 m12323b(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        new StringBuilder("Expected ViewPager2 instance. Got: ").append(parent);
        throw new IllegalStateException("Expected ViewPager2 instance. Got: ".concat(String.valueOf(parent)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9203a(boolean z) {
        int i;
        Fragment fragment;
        if (!this.f13889e.f13863b.mo461ab() && this.f13888d.f13897g.f13921c == 0 && !this.f13889e.f13864c.mo3686m() && this.f13889e.getItemCount() != 0 && (i = this.f13888d.f13893c) < this.f13889e.getItemCount()) {
            long j = (long) i;
            if ((j != this.f13890f || z) && (fragment = (Fragment) this.f13889e.f13864c.mo3678e(j)) != null && fragment.isAdded()) {
                this.f13890f = j;
                C0154a aVar = new C0154a(this.f13889e.f13863b);
                ArrayList arrayList = new ArrayList();
                Fragment fragment2 = null;
                for (int i2 = 0; i2 < this.f13889e.f13864c.mo3675c(); i2++) {
                    long d = this.f13889e.f13864c.mo3677d(i2);
                    Fragment fragment3 = (Fragment) this.f13889e.f13864c.mo3680g(i2);
                    if (fragment3.isAdded()) {
                        if (d != this.f13890f) {
                            aVar.mo517n(fragment3, C2383n.STARTED);
                            arrayList.add(this.f13889e.f13865d.mo9200c());
                        } else {
                            fragment2 = fragment3;
                        }
                        fragment3.setMenuVisibility(d == this.f13890f);
                    }
                }
                if (fragment2 != null) {
                    aVar.mo517n(fragment2, C2383n.RESUMED);
                    arrayList.add(this.f13889e.f13865d.mo9200c());
                }
                if (!aVar.f809e.isEmpty()) {
                    aVar.mo509f();
                    Collections.reverse(arrayList);
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C4290e.m12317b((List) arrayList.get(i3));
                    }
                }
            }
        }
    }
}
