package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p747c.p753d.C12151a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.speech.recognizer.p5233a.C67451at;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.y */
/* compiled from: PG */
final class C12141y extends MediaCodec.Callback {

    /* renamed from: a */
    boolean f38810a = true;

    /* renamed from: b */
    final /* synthetic */ C12142z f38811b;

    public C12141y(C12142z zVar) {
        this.f38811b = zVar;
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.f38811b.mo20454c(codecException);
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        C12140x xVar = new C12140x(this, i);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(xVar), this.f38811b.f38816e), "Error processing input Buffers", new Object[0]);
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        if (this.f38810a) {
            C12142z zVar = this.f38811b;
            byte[] bytes = zVar.f38815d.f38795k == C67451at.AMR_WB ? "#!AMR-WB\n".getBytes() : new byte[0];
            if (bytes.length > 0) {
                zVar.f38818g.mo20437a(bytes);
            }
            this.f38810a = false;
        }
        byte[] bArr = C12142z.f38812a;
        int i2 = bufferInfo.size;
        try {
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
            if (bufferInfo.size > 0) {
                byte[] bArr2 = new byte[bufferInfo.size];
                outputBuffer.get(bArr2, 0, bufferInfo.size);
                this.f38811b.f38818g.mo20437a(bArr2);
            }
            mediaCodec.releaseOutputBuffer(i, false);
            if ((bufferInfo.flags & 4) != 0) {
                this.f38811b.f38818g.mo20438b();
                this.f38811b.mo20452a();
            }
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C12117aa.f38737a.mo56226d()).mo56382g(e)).mo56372aa(44056)).mo56386p("Codec interrupted in the middle of processing.");
            this.f38811b.mo20454c(new C12151a((Throwable) e, 3));
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }
}
