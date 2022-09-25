package com.google.audio.hearing.common;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public final class OggOpusEncoder {

    /* renamed from: a */
    private static final C59071e f143349a = C59071e.m91332i("com.google.audio.hearing.common.OggOpusEncoder");

    /* renamed from: b */
    private long f143350b = 0;

    static {
        try {
            System.loadLibrary("ogg_opus_encoder");
        } catch (UnsatisfiedLinkError e) {
            ((C59052c) ((C59052c) ((C59052c) f143349a.mo56226d()).mo56382g(e)).mo56372aa(54869)).mo56386p("System did not find libogg_opus_encoder.so! Make sure your JVM explicitly loads this lib, particularly if you are on Android.");
        }
    }

    private native byte[] flush(long j);

    private native void free(long j);

    private native long init(int i, int i2, int i3, boolean z);

    private native byte[] processAudioBytes(long j, byte[] bArr, int i, int i2);

    /* renamed from: a */
    public final byte[] mo54136a() {
        long j = this.f143350b;
        if (j != 0) {
            byte[] flush = flush(j);
            free(this.f143350b);
            this.f143350b = 0;
            return flush;
        }
        ((C59052c) ((C59052c) f143349a.mo56225c()).mo56372aa(54871)).mo56386p("stop() called multiple times or without call to initialize()!");
        return new byte[0];
    }

    /* renamed from: b */
    public final void mo54137b(int i, int i2, int i3) {
        if (this.f143350b != 0) {
            mo54136a();
        }
        this.f143350b = init(i, i2, i3, true);
    }

    /* renamed from: c */
    public final byte[] mo54138c(byte[] bArr, int i) {
        return processAudioBytes(this.f143350b, bArr, 0, i);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        super.finalize();
        if (this.f143350b != 0) {
            ((C59052c) ((C59052c) f143349a.mo56225c()).mo56372aa(54870)).mo56386p("Native OggOpusEncoder resources weren't cleaned up. You must call stop()!");
            free(this.f143350b);
        }
    }
}
