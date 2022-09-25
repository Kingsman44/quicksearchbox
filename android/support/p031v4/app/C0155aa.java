package android.support.p031v4.app;

import android.view.View;

/* renamed from: android.support.v4.app.aa */
/* compiled from: PG */
final class C0155aa extends C0171aq {

    /* renamed from: a */
    final /* synthetic */ Fragment f694a;

    public C0155aa(Fragment fragment) {
        this.f694a = fragment;
    }

    /* renamed from: a */
    public final View mo521a(int i) {
        View view = this.f694a.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this.f694a + " does not have a view");
    }

    /* renamed from: b */
    public final boolean mo522b() {
        return this.f694a.mView != null;
    }
}
