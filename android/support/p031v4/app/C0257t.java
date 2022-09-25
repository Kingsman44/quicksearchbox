package android.support.p031v4.app;

import android.content.DialogInterface;

/* renamed from: android.support.v4.app.t */
/* compiled from: PG */
final class C0257t implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C0260w f920a;

    public C0257t(C0260w wVar) {
        this.f920a = wVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f920a.mDialog != null) {
            C0260w wVar = this.f920a;
            wVar.onDismiss(wVar.mDialog);
        }
    }
}
