package android.support.p031v4.app;

import java.util.ArrayList;

/* renamed from: android.support.v4.app.bo */
/* compiled from: PG */
final class C0196bo implements C0195bn {

    /* renamed from: a */
    final String f765a;

    /* renamed from: b */
    final int f766b;

    /* renamed from: c */
    final int f767c;

    /* renamed from: d */
    final /* synthetic */ FragmentManager f768d;

    public C0196bo(FragmentManager fragmentManager, String str, int i, int i2) {
        this.f768d = fragmentManager;
        this.f765a = str;
        this.f766b = i;
        this.f767c = i2;
    }

    /* renamed from: j */
    public final boolean mo513j(ArrayList arrayList, ArrayList arrayList2) {
        Fragment fragment = this.f768d.f650q;
        if (fragment != null && this.f766b < 0 && this.f765a == null && fragment.getChildFragmentManager().mo462ac()) {
            return false;
        }
        return this.f768d.mo464ae(arrayList, arrayList2, this.f765a, this.f766b, this.f767c);
    }
}
