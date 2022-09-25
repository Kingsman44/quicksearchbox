package androidx.mediarouter.app;

import android.util.Log;
import android.widget.SeekBar;
import androidx.mediarouter.p175a.C3665aa;
import androidx.mediarouter.p175a.C3685au;

/* renamed from: androidx.mediarouter.app.z */
/* compiled from: PG */
final class C3789z extends C3665aa {

    /* renamed from: a */
    final /* synthetic */ C3758ad f12215a;

    public C3789z(C3758ad adVar) {
        this.f12215a = adVar;
    }

    /* renamed from: e */
    public final void mo7713e(C3685au auVar) {
        this.f12215a.mo7968q(true);
    }

    /* renamed from: g */
    public final void mo7715g() {
        this.f12215a.mo7968q(false);
    }

    /* renamed from: j */
    public final void mo7718j(C3685au auVar) {
        SeekBar seekBar = (SeekBar) this.f12215a.f12086C.get(auVar);
        int i = auVar.f11873m;
        if (C3758ad.f12082c) {
            Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + i);
        }
        if (seekBar != null && this.f12215a.f12143x != auVar) {
            seekBar.setProgress(i);
        }
    }
}
