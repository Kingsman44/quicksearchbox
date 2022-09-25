package androidx.media3.exoplayer.p142e;

import android.os.HandlerThread;
import com.google.common.base.C58881cr;

/* renamed from: androidx.media3.exoplayer.e.c */
/* compiled from: PG */
public final class C2973c implements C2986p {

    /* renamed from: a */
    public final C58881cr f8532a;

    /* renamed from: b */
    public final C58881cr f8533b;

    public C2973c(int i) {
        C2964a aVar = new C2964a(i);
        C2972b bVar = new C2972b(i);
        this.f8532a = aVar;
        this.f8533b = bVar;
    }

    /* renamed from: a */
    static /* synthetic */ HandlerThread m8407a(int i) {
        return new HandlerThread(C2974d.m8409d(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    /* renamed from: b */
    static /* synthetic */ HandlerThread m8408b(int i) {
        return new HandlerThread(C2974d.m8409d(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}
