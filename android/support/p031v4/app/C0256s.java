package android.support.p031v4.app;

import android.content.DialogInterface;

/* renamed from: android.support.v4.app.s */
/* compiled from: PG */
final class C0256s implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ C0260w f919a;

    public C0256s(C0260w wVar) {
        this.f919a = wVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f919a.mDialog != null) {
            C0260w wVar = this.f919a;
            wVar.onCancel(wVar.mDialog);
        }
    }
}
