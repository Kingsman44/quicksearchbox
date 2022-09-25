package android.support.p031v4.app;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.app.au */
/* compiled from: PG */
final class C0175au implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0209ca f745a;

    /* renamed from: b */
    final /* synthetic */ C0176av f746b;

    public C0175au(C0176av avVar, C0209ca caVar) {
        this.f746b = avVar;
        this.f745a = caVar;
    }

    public final void onViewAttachedToWindow(View view) {
        C0209ca caVar = this.f745a;
        Fragment fragment = caVar.f785a;
        caVar.mo664e();
        this.f746b.f747a.mo466ag();
        C0239dd.m562k((ViewGroup) fragment.mView.getParent()).mo749h();
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
