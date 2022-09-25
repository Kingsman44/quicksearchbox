package android.support.p033v7.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.j */
/* compiled from: PG */
final class C0389j extends Handler {

    /* renamed from: a */
    private final WeakReference f1346a;

    public C0389j(DialogInterface dialogInterface) {
        this.f1346a = new WeakReference(dialogInterface);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1346a.get(), message.what);
        } else if (i == 1) {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
