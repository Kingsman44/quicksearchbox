package androidx.viewpager2.widget;

import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: androidx.viewpager2.widget.m */
/* compiled from: PG */
final class C4310m extends C4309l {

    /* renamed from: a */
    final /* synthetic */ ViewPager2 f13934a;

    public C4310m(ViewPager2 viewPager2) {
        this.f13934a = viewPager2;
    }

    /* renamed from: a */
    public final CharSequence mo9240a() {
        return "androidx.viewpager.widget.ViewPager";
    }

    /* renamed from: f */
    public final void mo9245f(C1991k kVar) {
        if (!this.f13934a.f13899i) {
            kVar.mo5159g(C1988h.f5908f);
            kVar.mo5159g(C1988h.f5907e);
            kVar.f5921a.setScrollable(false);
        }
    }

    /* renamed from: o */
    public final boolean mo9254o(int i) {
        return (i == 8192 || i == 4096) && !this.f13934a.f13899i;
    }

    /* renamed from: p */
    public final boolean mo9255p() {
        return true;
    }

    /* renamed from: q */
    public final boolean mo9256q(int i) {
        if (mo9254o(i)) {
            return false;
        }
        throw new IllegalStateException();
    }
}
