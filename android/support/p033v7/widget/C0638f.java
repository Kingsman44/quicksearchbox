package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.f */
/* compiled from: PG */
final class C0638f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f2403a;

    public C0638f(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f2403a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f2403a.mo1845b();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2403a;
        actionBarOverlayLayout.f1751i = actionBarOverlayLayout.f1745c.animate().translationY(0.0f).setListener(this.f2403a.f1752j);
    }
}
