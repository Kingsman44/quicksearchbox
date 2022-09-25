package androidx.viewpager.widget;

import android.database.DataSetObserver;

/* renamed from: androidx.viewpager.widget.l */
/* compiled from: PG */
final class C4279l extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ ViewPager f13860a;

    public C4279l(ViewPager viewPager) {
        this.f13860a = viewPager;
    }

    public final void onChanged() {
        this.f13860a.mo9138g();
    }

    public final void onInvalidated() {
        this.f13860a.mo9138g();
    }
}
