package androidx.mediarouter.app;

import android.support.p031v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.mediarouter.p175a.C3687aw;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.mediarouter.app.w */
/* compiled from: PG */
final class C3786w implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C3758ad f12208a;

    public C3786w(C3758ad adVar) {
        this.f12208a = adVar;
    }

    public final void onClick(View view) {
        PlaybackStateCompat playbackStateCompat;
        int id = view.getId();
        int i = 1;
        if (id == 16908313 || id == 16908314) {
            if (this.f12208a.f12125f.mo7764k()) {
                C3687aw awVar = this.f12208a.f12124e;
                if (id == 16908313) {
                    i = 2;
                }
                awVar.mo7777m(i);
            }
            this.f12208a.dismiss();
        } else if (id == R.id.mr_control_playback_ctrl) {
            C3758ad adVar = this.f12208a;
            if (adVar.f12087D != null && (playbackStateCompat = adVar.f12089F) != null) {
                int i2 = 0;
                if (playbackStateCompat.f994a != 3) {
                    i = 0;
                }
                if (i != 0 && adVar.mo7975z()) {
                    this.f12208a.f12087D.mo1037e().mo1017b();
                    i2 = R.string.mr_controller_pause;
                } else if (i != 0 && this.f12208a.mo7957B()) {
                    this.f12208a.f12087D.mo1037e().mo1031p();
                    i2 = R.string.mr_controller_stop;
                } else if (i == 0 && this.f12208a.mo7956A()) {
                    this.f12208a.f12087D.mo1037e().mo1018c();
                    i2 = R.string.mr_controller_play;
                }
                AccessibilityManager accessibilityManager = this.f12208a.f12106W;
                if (accessibilityManager != null && accessibilityManager.isEnabled() && i2 != 0) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                    obtain.setPackageName(this.f12208a.f12126g.getPackageName());
                    obtain.setClassName(getClass().getName());
                    obtain.getText().add(this.f12208a.f12126g.getString(i2));
                    this.f12208a.f12106W.sendAccessibilityEvent(obtain);
                }
            }
        } else if (id == R.id.mr_close) {
            this.f12208a.dismiss();
        }
    }
}
