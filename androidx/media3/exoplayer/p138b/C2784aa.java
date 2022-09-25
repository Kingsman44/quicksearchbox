package androidx.media3.exoplayer.p138b;

import android.media.AudioTrack;
import androidx.media3.common.p136b.C2619g;

/* renamed from: androidx.media3.exoplayer.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C2784aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AudioTrack f7693a;

    /* renamed from: b */
    public final /* synthetic */ C2619g f7694b;

    public /* synthetic */ C2784aa(AudioTrack audioTrack, C2619g gVar) {
        this.f7693a = audioTrack;
        this.f7694b = gVar;
    }

    public final void run() {
        AudioTrack audioTrack = this.f7693a;
        C2619g gVar = this.f7694b;
        try {
            audioTrack.flush();
            audioTrack.release();
            gVar.mo6192d();
            synchronized (C2796am.f7723a) {
                int i = C2796am.f7725c - 1;
                C2796am.f7725c = i;
                if (i == 0) {
                    C2796am.f7724b.shutdown();
                    C2796am.f7724b = null;
                }
            }
        } catch (Throwable th) {
            gVar.mo6192d();
            synchronized (C2796am.f7723a) {
                int i2 = C2796am.f7725c - 1;
                C2796am.f7725c = i2;
                if (i2 == 0) {
                    C2796am.f7724b.shutdown();
                    C2796am.f7724b = null;
                }
                throw th;
            }
        }
    }
}
