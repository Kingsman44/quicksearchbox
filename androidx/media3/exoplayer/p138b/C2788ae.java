package androidx.media3.exoplayer.p138b;

import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.media3.common.C2664h;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.b.ae */
/* compiled from: PG */
final class C2788ae {

    /* renamed from: a */
    public final C2680x f7699a;

    /* renamed from: b */
    public final int f7700b;

    /* renamed from: c */
    public final int f7701c;

    /* renamed from: d */
    public final int f7702d;

    /* renamed from: e */
    public final int f7703e;

    /* renamed from: f */
    public final int f7704f;

    /* renamed from: g */
    public final int f7705g;

    /* renamed from: h */
    public final int f7706h;

    /* renamed from: i */
    public final C2809e[] f7707i;

    public C2788ae(C2680x xVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, C2809e[] eVarArr) {
        this.f7699a = xVar;
        this.f7700b = i;
        this.f7701c = i2;
        this.f7702d = i3;
        this.f7703e = i4;
        this.f7704f = i5;
        this.f7705g = i6;
        this.f7706h = i7;
        this.f7707i = eVarArr;
    }

    /* renamed from: a */
    public final long mo6476a(long j) {
        return (j * 1000000) / ((long) this.f7703e);
    }

    /* renamed from: b */
    public final AudioTrack mo6477b(boolean z, C2664h hVar, int i) {
        try {
            int i2 = C2612ak.f7249a;
            int i3 = this.f7703e;
            AudioTrack build = new AudioTrack.Builder().setAudioAttributes(hVar.mo6330a().f7420a).setAudioFormat(new AudioFormat.Builder().setSampleRate(i3).setChannelMask(this.f7704f).setEncoding(this.f7705g).build()).setTransferMode(1).setBufferSizeInBytes(this.f7706h).setSessionId(i).setOffloadedPlayback(this.f7701c == 1).build();
            int state = build.getState();
            if (state == 1) {
                return build;
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new C2822r(state, this.f7703e, this.f7704f, this.f7706h, this.f7699a, mo6478c(), (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C2822r(0, this.f7703e, this.f7704f, this.f7706h, this.f7699a, mo6478c(), e);
        }
    }

    /* renamed from: c */
    public final boolean mo6478c() {
        return this.f7701c == 1;
    }
}
