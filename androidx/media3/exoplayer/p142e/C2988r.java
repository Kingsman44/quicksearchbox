package androidx.media3.exoplayer.p142e;

import android.media.MediaCodec;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.p134c.C2527e;

/* renamed from: androidx.media3.exoplayer.e.r */
/* compiled from: PG */
public class C2988r extends C2527e {

    /* renamed from: a */
    public final String f8586a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2988r(Throwable th, C2989s sVar) {
        super("Decoder failed: ".concat(String.valueOf(sVar == null ? null : sVar.f8587a)), th);
        String str = null;
        int i = C2612ak.f7249a;
        this.f8586a = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : str;
    }
}
