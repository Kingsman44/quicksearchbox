package org.chromium.weblayer;

import android.content.Context;
import android.content.Intent;

/* renamed from: org.chromium.weblayer.aj */
/* compiled from: PG */
final class C72574aj extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ MediaSessionService f193103a;

    public C72574aj(MediaSessionService mediaSessionService) {
        this.f193103a = mediaSessionService;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            Intent intent2 = new Intent(this.f193103a.getApplication(), MediaSessionService.class);
            intent2.setAction(intent.getAction());
            this.f193103a.getApplication().startService(intent2);
        }
    }
}
