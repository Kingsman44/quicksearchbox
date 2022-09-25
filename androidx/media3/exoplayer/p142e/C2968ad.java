package androidx.media3.exoplayer.p142e;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: androidx.media3.exoplayer.e.ad */
/* compiled from: PG */
final class C2968ad {

    /* renamed from: a */
    public MediaCodecInfo[] f8525a;

    /* renamed from: b */
    private final int f8526b;

    public C2968ad(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f8526b = i;
    }

    /* renamed from: a */
    public final void mo6867a() {
        if (this.f8525a == null) {
            this.f8525a = new MediaCodecList(this.f8526b).getCodecInfos();
        }
    }
}
