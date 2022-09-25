package androidx.lifecycle;

/* renamed from: androidx.lifecycle.ab */
/* compiled from: PG */
final class C2327ab implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LiveData f6522a;

    public C2327ab(LiveData liveData) {
        this.f6522a = liveData;
    }

    public final void run() {
        Object obj;
        synchronized (this.f6522a.f6493b) {
            obj = this.f6522a.f6497f;
            this.f6522a.f6497f = LiveData.f6492a;
        }
        this.f6522a.mo5708l(obj);
    }
}
