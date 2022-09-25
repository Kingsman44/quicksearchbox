package androidx.preference;

import android.support.p033v7.widget.C0640fb;

/* renamed from: androidx.preference.ac */
/* compiled from: PG */
public final class C3977ac implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Preference f12795a;

    /* renamed from: b */
    final /* synthetic */ C3983ai f12796b;

    public C3977ac(C3983ai aiVar, Preference preference) {
        this.f12796b = aiVar;
        this.f12795a = preference;
    }

    public final void run() {
        C0640fb fbVar = this.f12796b.f12808c.mAdapter;
        if (fbVar instanceof C3985ak) {
            int b = ((C3985ak) fbVar).mo8417b(this.f12795a);
            if (b != -1) {
                this.f12796b.f12808c.scrollToPosition(b);
                return;
            }
            fbVar.mObservable.registerObserver(new C3982ah(fbVar, this.f12796b.f12808c, this.f12795a));
        } else if (fbVar != null) {
            throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
        }
    }
}
