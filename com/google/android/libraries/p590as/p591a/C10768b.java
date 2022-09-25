package com.google.android.libraries.p590as.p591a;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.libraries.as.a.b */
/* compiled from: PG */
public final class C10768b extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final MediaCodec.BufferInfo f35729a;

    /* renamed from: b */
    private InputStream f35730b;

    /* renamed from: c */
    private MediaCodec f35731c;

    /* renamed from: d */
    private boolean f35732d;

    /* renamed from: e */
    private boolean f35733e;

    /* renamed from: f */
    private final byte[] f35734f = new byte[320];

    /* renamed from: g */
    private int f35735g = 0;

    /* renamed from: h */
    private int f35736h = 0;

    /* renamed from: i */
    private final byte[] f35737i = new byte[1];

    public C10768b(InputStream inputStream) {
        this.f35730b = inputStream;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/3gpp");
        mediaFormat.setInteger("sample-rate", 8000);
        mediaFormat.setInteger("channel-count", 1);
        mediaFormat.setInteger("bitrate", 12200);
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/3gpp");
            this.f35731c = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f35731c.start();
            this.f35729a = new MediaCodec.BufferInfo();
        } catch (Exception e) {
            MediaCodec mediaCodec = this.f35731c;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            this.f35731c = null;
            throw e;
        } catch (Throwable th) {
            this.f35729a = new MediaCodec.BufferInfo();
            throw th;
        }
    }

    public final void close() {
        try {
            InputStream inputStream = this.f35730b;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f35730b = null;
            try {
                MediaCodec mediaCodec = this.f35731c;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
            } finally {
                this.f35731c = null;
            }
        } catch (Throwable th) {
            this.f35730b = null;
            MediaCodec mediaCodec2 = this.f35731c;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            throw th;
        } finally {
            this.f35731c = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        MediaCodec mediaCodec = this.f35731c;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
    }

    public final int read() {
        if (read(this.f35737i, 0, 1) == 1) {
            return this.f35737i[0] & 255;
        }
        return -1;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int dequeueInputBuffer;
        if (this.f35731c != null) {
            if (this.f35736h >= this.f35735g && !this.f35732d) {
                this.f35736h = 0;
                this.f35735g = 0;
                while (!this.f35733e && (dequeueInputBuffer = this.f35731c.dequeueInputBuffer(0)) >= 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 320) {
                            break;
                        }
                        int read = this.f35730b.read(this.f35734f, i3, 320 - i3);
                        if (read == -1) {
                            this.f35733e = true;
                            break;
                        }
                        i3 += read;
                    }
                    this.f35731c.getInputBuffer(dequeueInputBuffer).put(this.f35734f, 0, i3);
                    this.f35731c.queueInputBuffer(dequeueInputBuffer, 0, i3, 0, true != this.f35733e ? 0 : 4);
                }
                int dequeueOutputBuffer = this.f35731c.dequeueOutputBuffer(this.f35729a, 0);
                if (dequeueOutputBuffer >= 0) {
                    this.f35735g = this.f35729a.size;
                    this.f35731c.getOutputBuffer(dequeueOutputBuffer).get(this.f35734f, 0, this.f35735g);
                    this.f35731c.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.f35729a.flags & 4) != 0) {
                        this.f35732d = true;
                    }
                }
            }
            int i4 = this.f35736h;
            int i5 = this.f35735g;
            if (i4 >= i5) {
                return (!this.f35733e || !this.f35732d) ? 0 : -1;
            }
            int i6 = i5 - i4;
            int i7 = i2;
            if (i7 <= i6) {
                i6 = i7;
            }
            System.arraycopy(this.f35734f, i4, bArr, i, i6);
            this.f35736h += i6;
            return i6;
        }
        throw new IllegalStateException("not open");
    }
}
