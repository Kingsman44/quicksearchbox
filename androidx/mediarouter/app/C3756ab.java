package androidx.mediarouter.app;

import android.util.Log;
import android.widget.SeekBar;
import androidx.mediarouter.p175a.C3685au;

/* renamed from: androidx.mediarouter.app.ab */
/* compiled from: PG */
final class C3756ab implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ C3758ad f12078a;

    /* renamed from: b */
    private final Runnable f12079b = new C3755aa(this);

    public C3756ab(C3758ad adVar) {
        this.f12078a = adVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            C3685au auVar = (C3685au) seekBar.getTag();
            if (C3758ad.f12082c) {
                Log.d("MediaRouteCtrlDialog", "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i + ")");
            }
            auVar.mo7756c(i);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        C3758ad adVar = this.f12078a;
        if (adVar.f12143x != null) {
            adVar.f12141v.removeCallbacks(this.f12079b);
        }
        this.f12078a.f12143x = (C3685au) seekBar.getTag();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f12078a.f12141v.postDelayed(this.f12079b, 500);
    }
}
