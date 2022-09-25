package android.support.p031v4.app;

/* renamed from: android.support.v4.app.r */
/* compiled from: PG */
final class C0255r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0260w f918a;

    public C0255r(C0260w wVar) {
        this.f918a = wVar;
    }

    public final void run() {
        this.f918a.mOnDismissListener.onDismiss(this.f918a.mDialog);
    }
}
