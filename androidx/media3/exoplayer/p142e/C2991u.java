package androidx.media3.exoplayer.p142e;

import androidx.media3.common.C2680x;

/* renamed from: androidx.media3.exoplayer.e.u */
/* compiled from: PG */
public final class C2991u extends Exception {

    /* renamed from: a */
    public final String f8595a;

    /* renamed from: b */
    public final boolean f8596b;

    /* renamed from: c */
    public final C2989s f8597c;

    /* renamed from: d */
    public final String f8598d;

    public C2991u(C2680x xVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + String.valueOf(xVar), th, xVar.f7496n, false, (C2989s) null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i));
    }

    public C2991u(String str, Throwable th, String str2, boolean z, C2989s sVar, String str3) {
        super(str, th);
        this.f8595a = str2;
        this.f8596b = false;
        this.f8597c = sVar;
        this.f8598d = str3;
    }
}
