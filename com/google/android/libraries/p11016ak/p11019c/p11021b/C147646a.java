package com.google.android.libraries.p11016ak.p11019c.p11021b;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.ak.c.b.a */
/* compiled from: PG */
public final class C147646a {

    /* renamed from: a */
    private static final C58495hd f398486a = C58495hd.m89904r(24000, 6, 32000, 5, 44100, 4, 48000, 3, 64000, 2);

    /* renamed from: b */
    private boolean f398487b;

    /* renamed from: c */
    private MediaCodec f398488c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo124393a() {
        C58838bb.m90884s(!this.f398487b, "Already initialized.");
        C58838bb.m90871f(f398486a.containsKey(24000), "Unsupported sample rate %s", 24000);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        this.f398488c = createEncoderByType;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/mp4a-latm");
        mediaFormat.setInteger("channel-count", 1);
        mediaFormat.setInteger("sample-rate", 24000);
        mediaFormat.setInteger("bitrate", 32768);
        mediaFormat.setInteger("aac-profile", 2);
        createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f398488c.start();
        this.f398487b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo124394b() {
        MediaCodec mediaCodec = this.f398488c;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
        this.f398487b = false;
        this.f398488c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized boolean mo124395c() {
        return this.f398487b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized byte[] mo124396d(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        C58838bb.m90884s(this.f398487b, "Not initialized. Please call start() first.");
        int dequeueInputBuffer = this.f398488c.dequeueInputBuffer(-1);
        if (dequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer = this.f398488c.getInputBuffers()[dequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            this.f398488c.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, 0, 0);
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.f398488c.dequeueOutputBuffer(bufferInfo, 0);
            ByteBuffer[] outputBuffers = this.f398488c.getOutputBuffers();
            byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                if (dequeueOutputBuffer < 0) {
                    if (dequeueOutputBuffer != -2) {
                    }
                }
                if (dequeueOutputBuffer == -2) {
                    dequeueOutputBuffer = this.f398488c.dequeueOutputBuffer(bufferInfo, 0);
                } else {
                    ByteBuffer byteBuffer2 = outputBuffers[dequeueOutputBuffer];
                    byteBuffer2.position(bufferInfo.offset);
                    byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
                    int i = bufferInfo.size;
                    byte[] bArr2 = new byte[i];
                    byteBuffer2.get(bArr2);
                    int i2 = i + 7;
                    byteArrayOutputStream.write(new byte[]{-1, -7, (byte) ((((Integer) f398486a.get(24000)).intValue() << 2) + 64), (byte) ((i2 >> 11) + 64), (byte) ((i2 & 2047) >> 3), (byte) (((i2 & 7) << 5) + 31), -4});
                    byteArrayOutputStream.write(bArr2);
                    this.f398488c.releaseOutputBuffer(dequeueOutputBuffer, false);
                    dequeueOutputBuffer = this.f398488c.dequeueOutputBuffer(bufferInfo, 0);
                }
            }
        } else {
            throw new IOException("No input buffer available");
        }
        return byteArrayOutputStream.toByteArray();
    }
}
