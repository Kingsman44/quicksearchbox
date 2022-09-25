package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import androidx.mediarouter.p175a.C3753z;

/* renamed from: androidx.mediarouter.app.ae */
/* compiled from: PG */
public final class C3759ae extends C0260w {

    /* renamed from: a */
    public Dialog f12146a;

    /* renamed from: b */
    public C3753z f12147b;

    public C3759ae() {
        setCancelable(true);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.f12146a;
        if (dialog != null) {
            ((C3758ad) dialog).mo7970t();
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C3758ad adVar = new C3758ad(getContext());
        this.f12146a = adVar;
        return adVar;
    }

    public final void onStop() {
        super.onStop();
        Dialog dialog = this.f12146a;
        if (dialog != null) {
            ((C3758ad) dialog).mo7962j(false);
        }
    }
}
