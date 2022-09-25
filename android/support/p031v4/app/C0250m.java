package android.support.p031v4.app;

import android.util.Log;

/* renamed from: android.support.v4.app.m */
/* compiled from: PG */
final class C0250m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0253p f908a;

    /* renamed from: b */
    final /* synthetic */ C0238dc f909b;

    public C0250m(C0253p pVar, C0238dc dcVar) {
        this.f908a = pVar;
        this.f909b = dcVar;
    }

    public final void run() {
        this.f908a.mo766b();
        if (FragmentManager.m246Z(2)) {
            Log.v("FragmentManager", "Transition for operation " + this.f909b + "has completed");
        }
    }
}
