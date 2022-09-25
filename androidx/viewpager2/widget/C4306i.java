package androidx.viewpager2.widget;

/* renamed from: androidx.viewpager2.widget.i */
/* compiled from: PG */
final class C4306i extends C4313p {

    /* renamed from: a */
    final /* synthetic */ ViewPager2 f13932a;

    public C4306i(ViewPager2 viewPager2) {
        this.f13932a = viewPager2;
    }

    /* renamed from: a */
    public final void mo9201a(int i) {
        if (i == 0) {
            this.f13932a.mo9220h();
        }
    }

    /* renamed from: b */
    public final void mo9202b(int i) {
        ViewPager2 viewPager2 = this.f13932a;
        if (viewPager2.f13893c != i) {
            viewPager2.f13893c = i;
            viewPager2.f13901k.mo9250k();
        }
    }
}
