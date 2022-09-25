package androidx.media3.exoplayer.p138b;

import androidx.media3.common.C2680x;

/* renamed from: androidx.media3.exoplayer.b.t */
/* compiled from: PG */
public final class C2824t extends Exception {

    /* renamed from: a */
    public final int f7875a;

    /* renamed from: b */
    public final boolean f7876b;

    /* renamed from: c */
    public final C2680x f7877c;

    public C2824t(int i, C2680x xVar, boolean z) {
        super("AudioTrack write failed: " + i);
        this.f7876b = z;
        this.f7875a = i;
        this.f7877c = xVar;
    }
}
