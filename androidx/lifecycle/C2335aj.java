package androidx.lifecycle;

import android.app.Activity;

/* renamed from: androidx.lifecycle.aj */
/* compiled from: PG */
final class C2335aj extends C2377h {

    /* renamed from: a */
    final /* synthetic */ C2336ak f6532a;

    public C2335aj(C2336ak akVar) {
        this.f6532a = akVar;
    }

    public final void onActivityPostResumed(Activity activity) {
        C2338am amVar = this.f6532a.f6533a;
        int i = amVar.f6536c + 1;
        amVar.f6536c = i;
        if (i != 1) {
            return;
        }
        if (amVar.f6537d) {
            amVar.f6540g.mo5793e(C2382m.ON_RESUME);
            amVar.f6537d = false;
            return;
        }
        amVar.f6539f.removeCallbacks(amVar.f6541h);
    }

    public final void onActivityPostStarted(Activity activity) {
        C2338am amVar = this.f6532a.f6533a;
        int i = amVar.f6535b + 1;
        amVar.f6535b = i;
        if (i == 1 && amVar.f6538e) {
            amVar.f6540g.mo5793e(C2382m.ON_START);
            amVar.f6538e = false;
        }
    }
}
