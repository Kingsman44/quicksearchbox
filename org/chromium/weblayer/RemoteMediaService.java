package org.chromium.weblayer;

import android.content.Intent;
import org.chromium.p5643b.p5644a.C72341bj;

/* compiled from: PG */
public class RemoteMediaService extends C72572ah {

    /* renamed from: b */
    private int f193091b;

    /* renamed from: b */
    public final void mo64424b() {
        mo64434a().f193174f.mo63782o(this.f193091b);
    }

    /* renamed from: c */
    public final void mo64425c(C72611bt btVar, Intent intent) {
        int intExtra = intent.getIntExtra("REMOTE_MEDIA_SERVICE_NOTIFICATION_ID_KEY", 0);
        this.f193091b = intExtra;
        if (intExtra != 0) {
            btVar.f193174f.mo63783p(new C72341bj(this), intent);
            return;
        }
        throw new RuntimeException("Invalid RemoteMediaService notification id");
    }
}
