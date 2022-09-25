package android.support.p031v4.app;

import android.view.View;

/* renamed from: android.support.v4.app.v */
/* compiled from: PG */
final class C0259v extends C0171aq {

    /* renamed from: a */
    final /* synthetic */ C0171aq f922a;

    /* renamed from: b */
    final /* synthetic */ C0260w f923b;

    public C0259v(C0260w wVar, C0171aq aqVar) {
        this.f923b = wVar;
        this.f922a = aqVar;
    }

    /* renamed from: a */
    public final View mo521a(int i) {
        if (this.f922a.mo522b()) {
            return this.f922a.mo521a(i);
        }
        return this.f923b.onFindViewById(i);
    }

    /* renamed from: b */
    public final boolean mo522b() {
        return this.f922a.mo522b() || this.f923b.onHasView();
    }
}
