package androidx.media3.exoplayer;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: androidx.media3.exoplayer.e */
/* compiled from: PG */
final class C2963e implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C2997f f8518a;

    /* renamed from: b */
    private final Handler f8519b;

    public C2963e(C2997f fVar, Handler handler) {
        this.f8518a = fVar;
        this.f8519b = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.f8519b.post(new C2898d(this, i));
    }
}
