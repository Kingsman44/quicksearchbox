package androidx.preference;

/* renamed from: androidx.preference.aj */
/* compiled from: PG */
final class C3984aj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PreferenceGroup f12813a;

    public C3984aj(PreferenceGroup preferenceGroup) {
        this.f12813a = preferenceGroup;
    }

    public final void run() {
        synchronized (this) {
            this.f12813a.f12755a.clear();
        }
    }
}
