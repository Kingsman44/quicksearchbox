package androidx.camera.core;

/* renamed from: androidx.camera.core.dl */
/* compiled from: PG */
public final /* synthetic */ class C1535dl implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1547dx f4233a;

    public /* synthetic */ C1535dl(C1547dx dxVar) {
        this.f4233a = dxVar;
    }

    public final void run() {
        this.f4233a.f4252c.cancel(true);
    }
}
