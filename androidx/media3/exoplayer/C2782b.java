package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: androidx.media3.exoplayer.b */
/* compiled from: PG */
final class C2782b extends BroadcastReceiver implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2857c f7689a;

    /* renamed from: b */
    private final Handler f7690b;

    /* renamed from: c */
    private final C2845bo f7691c;

    public C2782b(C2857c cVar, Handler handler, C2845bo boVar) {
        this.f7689a = cVar;
        this.f7690b = handler;
        this.f7691c = boVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f7690b.post(this);
        }
    }

    public final void run() {
        if (this.f7689a.f8039a) {
            this.f7691c.f7944a.mo6597aN(false, -1, 3);
        }
    }
}
