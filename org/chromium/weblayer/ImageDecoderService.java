package org.chromium.weblayer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72341bj;

/* compiled from: PG */
public class ImageDecoderService extends Service {

    /* renamed from: a */
    private IBinder f193088a;

    public final IBinder onBind(Intent intent) {
        return this.f193088a;
    }

    public final void onCreate() {
        try {
            this.f193088a = C72611bt.m107417e(this).mo64481b().mo63772e(new C72341bj(this), new C72341bj(C72611bt.m107414b(this)));
        } catch (Exception e) {
            throw new C72304a(e);
        }
    }
}
