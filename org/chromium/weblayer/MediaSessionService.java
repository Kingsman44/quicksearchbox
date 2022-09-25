package org.chromium.weblayer;

import android.content.Intent;
import android.content.IntentFilter;
import org.chromium.p5643b.p5644a.C72341bj;

/* compiled from: PG */
public class MediaSessionService extends C72572ah {

    /* renamed from: b */
    private BroadcastReceiver f193089b;

    /* renamed from: b */
    public final void mo64424b() {
        mo64434a().f193174f.mo63779l();
    }

    /* renamed from: c */
    public final void mo64425c(C72611bt btVar, Intent intent) {
        btVar.f193174f.mo63780m(new C72341bj(this), intent);
    }

    /* renamed from: d */
    public final void mo64426d() {
        this.f193089b = new C72574aj(this);
        registerReceiver(this.f193089b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    public final void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.f193089b;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }
}
