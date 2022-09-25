package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.support.p031v4.media.session.C0320v;
import android.util.Log;
import android.view.View;

/* renamed from: androidx.mediarouter.app.q */
/* compiled from: PG */
final class C3780q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C3758ad f12197a;

    public C3780q(C3758ad adVar) {
        this.f12197a = adVar;
    }

    public final void onClick(View view) {
        PendingIntent c;
        C0320v vVar = this.f12197a.f12087D;
        if (vVar != null && (c = vVar.mo1035c()) != null) {
            try {
                c.send();
                this.f12197a.dismiss();
            } catch (PendingIntent.CanceledException unused) {
                new StringBuilder().append(c);
                Log.e("MediaRouteCtrlDialog", c.toString().concat(" was not sent, it had been canceled."));
            }
        }
    }
}
