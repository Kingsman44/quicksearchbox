package android.support.p033v7.app;

import android.support.p033v7.view.menu.C0477q;
import android.view.Menu;
import android.view.View;

/* renamed from: android.support.v7.app.ba */
/* compiled from: PG */
final class C0367ba implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0372bf f1240a;

    public C0367ba(C0372bf bfVar) {
        this.f1240a = bfVar;
    }

    public final void run() {
        C0372bf bfVar = this.f1240a;
        Menu G = bfVar.mo1229G();
        C0477q qVar = G instanceof C0477q ? G : null;
        if (qVar != null) {
            qVar.mo1675s();
        }
        try {
            G.clear();
            if (!bfVar.f1247b.onCreatePanelMenu(0, G) || !bfVar.f1247b.onPreparePanel(0, (View) null, G)) {
                G.clear();
            }
            if (qVar != null) {
                qVar.mo1672r();
            }
        } catch (Throwable th) {
            if (qVar != null) {
                qVar.mo1672r();
            }
            throw th;
        }
    }
}
