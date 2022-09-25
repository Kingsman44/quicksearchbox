package androidx.media3.p174ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.media3.common.C2646bh;

/* renamed from: androidx.media3.ui.n */
/* compiled from: PG */
final class C3650n extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C3652p f11712a;

    public C3650n(C3652p pVar) {
        this.f11712a = pVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C3652p pVar = this.f11712a;
        C2646bh bhVar = pVar.f11726c;
        if (bhVar != null && pVar.f11727d && intent.getIntExtra("INSTANCE_ID", pVar.f11725b) == this.f11712a.f11725b) {
            String action = intent.getAction();
            if ("androidx.media3.ui.notification.play".equals(action)) {
                if (bhVar.mo5998e() == 1) {
                    bhVar.mo6017x();
                } else if (bhVar.mo5998e() == 4) {
                    bhVar.mo6264ai(bhVar.mo5996c());
                }
                bhVar.mo6260ae();
            } else if ("androidx.media3.ui.notification.pause".equals(action)) {
                bhVar.mo6259ad();
            } else if ("androidx.media3.ui.notification.prev".equals(action)) {
                bhVar.mo6267al();
            } else if ("androidx.media3.ui.notification.rewind".equals(action)) {
                bhVar.mo6261af();
            } else if ("androidx.media3.ui.notification.ffwd".equals(action)) {
                bhVar.mo6262ag();
            } else if ("androidx.media3.ui.notification.next".equals(action)) {
                bhVar.mo6265aj();
            } else if ("androidx.media3.ui.notification.stop".equals(action)) {
                bhVar.mo5982J(true);
            } else if ("androidx.media3.ui.notification.dismiss".equals(action)) {
                this.f11712a.mo7704h(true);
            }
        }
    }
}
