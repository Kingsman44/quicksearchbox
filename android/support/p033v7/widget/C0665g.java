package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.g */
/* compiled from: PG */
final class C0665g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f2440a;

    public C0665g(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f2440a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f2440a.mo1845b();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2440a;
        actionBarOverlayLayout.f1751i = actionBarOverlayLayout.f1745c.animate().translationY((float) (-this.f2440a.f1745c.getHeight())).setListener(this.f2440a.f1752j);
    }
}
