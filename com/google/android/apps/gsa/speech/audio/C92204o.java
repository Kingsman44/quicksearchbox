package com.google.android.apps.gsa.speech.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Base64;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.speech.audio.o */
/* compiled from: PG */
public final class C92204o extends C92211v {

    /* renamed from: a */
    public final int f257063a;

    /* renamed from: b */
    private boolean f257064b;

    /* renamed from: c */
    private boolean f257065c;

    /* renamed from: d */
    private boolean f257066d;

    /* renamed from: e */
    private final MediaExtractor f257067e;

    /* renamed from: f */
    private final MediaCodec f257068f;

    /* renamed from: g */
    private ByteBuffer f257069g;

    /* renamed from: h */
    private int f257070h;

    /* renamed from: i */
    private int f257071i;

    public C92204o(byte[] bArr, int i) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f257067e = mediaExtractor;
        mediaExtractor.setDataSource("data:;base64,".concat(String.valueOf(Base64.encodeToString(bArr, 0))));
        mediaExtractor.selectTrack(i);
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
        String string = trackFormat.getString("mime");
        this.f257063a = trackFormat.getInteger("sample-rate");
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
        this.f257068f = createDecoderByType;
        createDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
        createDecoderByType.start();
    }

    /* renamed from: a */
    public final int mo86824a() {
        return this.f257063a;
    }

    public final void close() {
        MediaExtractor mediaExtractor = this.f257067e;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
        MediaCodec mediaCodec = this.f257068f;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f257068f.release();
        }
    }

    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        boolean z;
        long j;
        int i4;
        byte[] bArr2 = bArr;
        if (this.f257066d && this.f257064b) {
            return -1;
        }
        int min = Math.min(bArr2.length - i, i2);
        int i5 = 0;
        int i6 = i;
        while (!this.f257066d && min > 0) {
            if (!this.f257064b) {
                int dequeueInputBuffer = this.f257068f.dequeueInputBuffer(5000);
                if (dequeueInputBuffer >= 0) {
                    int readSampleData = this.f257067e.readSampleData(this.f257068f.getInputBuffer(dequeueInputBuffer), 0);
                    if (readSampleData < 0) {
                        j = 0;
                        z = true;
                        i4 = 0;
                    } else {
                        j = this.f257067e.getSampleTime();
                        i4 = readSampleData;
                        z = false;
                    }
                    this.f257068f.queueInputBuffer(dequeueInputBuffer, 0, i4, j, true != z ? 0 : 4);
                    if (!z) {
                        this.f257067e.advance();
                    }
                    this.f257064b = z;
                }
                z = false;
                this.f257064b = z;
            }
            int i7 = this.f257071i;
            if (i7 == 0) {
                if (this.f257069g == null) {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    int dequeueOutputBuffer = this.f257068f.dequeueOutputBuffer(bufferInfo, 5000);
                    this.f257070h = dequeueOutputBuffer;
                    if (dequeueOutputBuffer >= 0) {
                        this.f257069g = this.f257068f.getOutputBuffer(dequeueOutputBuffer);
                        int i8 = bufferInfo.size;
                        if ((bufferInfo.flags & 4) != 0) {
                            this.f257065c = true;
                        }
                        i7 = i8;
                    } else {
                        i3 = 0;
                        min -= i3;
                        i6 += i3;
                        i5 += i3;
                    }
                } else {
                    i7 = 0;
                }
            }
            i3 = Math.min(i7, min);
            ByteBuffer byteBuffer = this.f257069g;
            if (byteBuffer != null) {
                byteBuffer.get(bArr2, i6, i3);
                this.f257071i = i7 - i3;
            }
            if (this.f257071i == 0) {
                this.f257068f.releaseOutputBuffer(this.f257070h, false);
                this.f257069g = null;
                if (this.f257065c) {
                    this.f257066d = true;
                }
            }
            min -= i3;
            i6 += i3;
            i5 += i3;
        }
        return i5;
    }
}
