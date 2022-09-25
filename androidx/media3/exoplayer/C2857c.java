package androidx.media3.exoplayer;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.c */
/* compiled from: PG */
final class C2857c {

    /* renamed from: a */
    public boolean f8039a;

    /* renamed from: b */
    private final Context f8040b;

    /* renamed from: c */
    private final C2782b f8041c;

    public C2857c(Context context, Handler handler, C2845bo boVar) {
        this.f8040b = context.getApplicationContext();
        this.f8041c = new C2782b(this, handler, boVar);
    }

    /* renamed from: a */
    public final void mo6606a(boolean z) {
        if (z) {
            if (!this.f8039a) {
                C2612ak.m6919B(this.f8040b, this.f8041c, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                this.f8039a = true;
            }
        } else if (this.f8039a) {
            this.f8040b.unregisterReceiver(this.f8041c);
            this.f8039a = false;
        }
    }
}
