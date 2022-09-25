package com.google.android.libraries.p590as.p591a;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.libraries.p590as.p591a.p592a.C10767a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59337t;
import com.google.common.p4575r.C60757n;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.chromium.net.PrivateKeyType;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.libraries.as.a.c */
/* compiled from: PG */
public final class C10769c extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private static final C59071e f35738a = C59071e.m91332i("com.google.android.libraries.as.a.c");

    /* renamed from: b */
    private final InputStream f35739b;

    /* renamed from: c */
    private final int f35740c;

    /* renamed from: d */
    private final int f35741d;

    /* renamed from: e */
    private final int f35742e;

    /* renamed from: f */
    private final String f35743f;

    /* renamed from: g */
    private final int f35744g;

    /* renamed from: h */
    private final ByteBuffer f35745h;

    /* renamed from: i */
    private final ByteBuffer f35746i;

    /* renamed from: j */
    private MediaCodec f35747j;

    /* renamed from: k */
    private ByteBuffer[] f35748k;

    /* renamed from: l */
    private ByteBuffer[] f35749l;

    /* renamed from: m */
    private int f35750m = -1;

    /* renamed from: n */
    private boolean f35751n;

    /* renamed from: o */
    private boolean f35752o;

    /* renamed from: p */
    private boolean f35753p;

    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0174 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10769c(java.io.InputStream r17, java.lang.String r18, int r19, int r20, int r21, int r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r19
            r3 = r20
            r4 = r22
            r16.<init>()
            r5 = -1
            r1.f35750m = r5
            r6 = 0
            r1.f35753p = r6
            r1.f35740c = r3
            r7 = r17
            r1.f35739b = r7
            r1.f35741d = r2
            r1.f35742e = r4
            r1.f35743f = r0
            if (r0 == 0) goto L_0x0193
            int r7 = r18.hashCode()
            r8 = 3
            r9 = 2
            r10 = 1
            switch(r7) {
                case -1606874997: goto L_0x004a;
                case -53558318: goto L_0x0040;
                case 1504619009: goto L_0x0036;
                case 1504891608: goto L_0x002c;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0053
        L_0x002c:
            java.lang.String r7 = "audio/opus"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0053
            r5 = 3
            goto L_0x0053
        L_0x0036:
            java.lang.String r7 = "audio/flac"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0053
            r5 = 2
            goto L_0x0053
        L_0x0040:
            java.lang.String r7 = "audio/mp4a-latm"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0053
            r5 = 0
            goto L_0x0053
        L_0x004a:
            java.lang.String r7 = "audio/amr-wb"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0053
            r5 = 1
        L_0x0053:
            r7 = 5
            r11 = 7
            if (r5 == 0) goto L_0x0121
            if (r5 == r10) goto L_0x0101
            if (r5 == r9) goto L_0x0077
            if (r5 != r8) goto L_0x006f
            r1.f35744g = r8
            r5 = 21
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r5 = r5.order(r6)
            r1.f35746i = r5
            goto L_0x012b
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Unsupported audio codec"
            r0.<init>(r2)
            throw r0
        L_0x0077:
            r1.f35744g = r9
            r5 = 42
            byte[] r12 = new byte[r5]
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.wrap(r12)
            r1.f35746i = r12
            int r13 = r12.remaining()
            if (r13 < r5) goto L_0x008b
            r5 = 1
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            com.google.common.base.C58838bb.m90883r(r5)
            com.google.android.libraries.as.a.h r5 = new com.google.android.libraries.as.a.h
            r5.<init>()
            r13 = 1716281667(0x664c6143, double:8.479558103E-315)
            r15 = 32
            r5.mo19267a(r13, r15)
            r13 = 1
            r5.mo19267a(r13, r10)
            r13 = 0
            r5.mo19267a(r13, r11)
            r9 = 34
            r11 = 24
            r5.mo19267a(r9, r11)
            r9 = 16
            r15 = 16
            r5.mo19267a(r9, r15)
            r9 = 65535(0xffff, double:3.23786E-319)
            r5.mo19267a(r9, r15)
            r5.mo19267a(r13, r11)
            r5.mo19267a(r13, r11)
            long r9 = (long) r2
            r11 = 20
            r5.mo19267a(r9, r11)
            int r9 = r4 + -1
            long r9 = (long) r9
            r5.mo19267a(r9, r8)
            r8 = 15
            r5.mo19267a(r8, r7)
            r8 = 36
            r5.mo19267a(r13, r8)
            r8 = 64
            r5.mo19267a(r13, r8)
            r5.mo19267a(r13, r8)
            int r8 = r5.f35774b
            if (r8 != 0) goto L_0x00e3
            r6 = 1
        L_0x00e3:
            java.lang.String r8 = "Cannot convert to byte array if not byte aligned."
            com.google.common.base.C58838bb.m90884s(r6, r8)
            java.io.ByteArrayOutputStream r6 = r5.f35773a     // Catch:{ IOException -> 0x00fa }
            r6.flush()     // Catch:{ IOException -> 0x00fa }
            java.io.ByteArrayOutputStream r5 = r5.f35773a
            byte[] r5 = r5.toByteArray()
            r12.put(r5)
            r12.flip()
            goto L_0x012b
        L_0x00fa:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x0101:
            r5 = 16000(0x3e80, float:2.2421E-41)
            if (r2 != r5) goto L_0x0107
            r5 = 1
            goto L_0x0108
        L_0x0107:
            r5 = 0
        L_0x0108:
            com.google.common.base.C58838bb.m90883r(r5)
            r5 = 1
            if (r4 != r5) goto L_0x010f
            r6 = 1
        L_0x010f:
            com.google.common.base.C58838bb.m90883r(r6)
            r1.f35744g = r5
            java.lang.String r5 = "#!AMR-WB\n"
            byte[] r5 = r5.getBytes()
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r1.f35746i = r5
            goto L_0x012b
        L_0x0121:
            r1.f35744g = r6
            byte[] r5 = new byte[r11]
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r1.f35746i = r5
        L_0x012b:
            byte[] r5 = new byte[r3]
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r1.f35745h = r5
            r5.position(r3)
            android.media.MediaFormat r3 = new android.media.MediaFormat
            r3.<init>()
            java.lang.String r5 = "mime"
            r3.setString(r5, r0)
            java.lang.String r5 = "sample-rate"
            r3.setInteger(r5, r2)
            java.lang.String r2 = "bitrate"
            r5 = r21
            r3.setInteger(r2, r5)
            java.lang.String r2 = "channel-count"
            r3.setInteger(r2, r4)
            int r2 = r1.f35744g
            r4 = 2
            if (r2 != r4) goto L_0x015b
            java.lang.String r2 = "flac-compression-level"
            r3.setInteger(r2, r7)
        L_0x015b:
            int r2 = r1.f35744g     // Catch:{ IOException -> 0x0180, IllegalArgumentException -> 0x017e }
            boolean r2 = m25762e(r2)     // Catch:{ IOException -> 0x0180, IllegalArgumentException -> 0x017e }
            if (r2 == 0) goto L_0x017a
            java.lang.String r0 = "OMX.google.aac.encoder"
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ IOException -> 0x016d }
            r1.m25760c(r0, r3)     // Catch:{ IOException -> 0x016d }
            return
        L_0x016d:
            r0 = move-exception
            com.google.android.libraries.as.a.a.a r2 = new com.google.android.libraries.as.a.a.a     // Catch:{ Exception -> 0x0174 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0174 }
            throw r2     // Catch:{ Exception -> 0x0174 }
        L_0x0174:
            java.lang.String r0 = r1.f35743f     // Catch:{ IOException -> 0x0180, IllegalArgumentException -> 0x017e }
            r1.m25761d(r0, r3)     // Catch:{ IOException -> 0x0180, IllegalArgumentException -> 0x017e }
            return
        L_0x017a:
            r1.m25761d(r0, r3)     // Catch:{ IOException -> 0x0180, IllegalArgumentException -> 0x017e }
            return
        L_0x017e:
            r0 = move-exception
            goto L_0x0181
        L_0x0180:
            r0 = move-exception
        L_0x0181:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = r1.f35743f
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Failed to create codec mimeType: "
            java.lang.String r3 = r4.concat(r3)
            r2.<init>(r3, r0)
            throw r2
        L_0x0193:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Null mimetype provided"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p590as.p591a.C10769c.<init>(java.io.InputStream, java.lang.String, int, int, int, int):void");
    }

    /* renamed from: a */
    private final void m25758a(boolean z) {
        MediaCodec mediaCodec = this.f35747j;
        if (mediaCodec != null) {
            if (z) {
                m25759b(mediaCodec);
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.f35747j.dequeueOutputBuffer(bufferInfo, 10000);
            if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.f35747j.getOutputFormat();
                C58838bb.m90883r(this.f35741d == outputFormat.getInteger("sample-rate"));
                C58838bb.m90883r(this.f35742e == outputFormat.getInteger("channel-count"));
                C58838bb.m90883r(this.f35743f.equals(outputFormat.getString("mime")));
                dequeueOutputBuffer = this.f35747j.dequeueOutputBuffer(bufferInfo, 10000);
            }
            C58838bb.m90883r(dequeueOutputBuffer != -2);
            int i = 4;
            if ((bufferInfo.flags & 4) != 0) {
                int i2 = bufferInfo.size;
                this.f35752o = true;
            }
            if (dequeueOutputBuffer != -1) {
                if (dequeueOutputBuffer == -3) {
                    this.f35749l = this.f35747j.getOutputBuffers();
                } else if (dequeueOutputBuffer == -1) {
                } else {
                    if ((bufferInfo.flags & 2) != 0) {
                        this.f35750m = dequeueOutputBuffer;
                        MediaCodec mediaCodec2 = this.f35747j;
                        if (mediaCodec2 != null) {
                            m25759b(mediaCodec2);
                            return;
                        }
                        return;
                    }
                    int i3 = bufferInfo.offset;
                    int i4 = bufferInfo.size;
                    this.f35750m = dequeueOutputBuffer;
                    int i5 = this.f35744g;
                    if (m25762e(i5)) {
                        this.f35746i.clear();
                        int i6 = this.f35741d;
                        int i7 = this.f35742e;
                        ByteBuffer byteBuffer = this.f35746i;
                        C58838bb.m90883r(byteBuffer.remaining() >= 7);
                        int i8 = 12;
                        long a = C10766a.m25757a(C10766a.m25757a(C10766a.m25757a(C10766a.m25757a(C10766a.m25757a(0, 12, 4095), 1, 0), 2, 0), 1, 1), 2, 0);
                        switch (i6) {
                            case 7350:
                                break;
                            case 8000:
                                i8 = 11;
                                break;
                            case 11025:
                                i8 = 10;
                                break;
                            case 12000:
                                i8 = 9;
                                break;
                            case 16000:
                                i8 = 8;
                                break;
                            case 22050:
                                i8 = 7;
                                break;
                            case 24000:
                                i8 = 6;
                                break;
                            case 32000:
                                i8 = 5;
                                break;
                            case 44100:
                                i8 = 4;
                                break;
                            case 48000:
                                i8 = 3;
                                break;
                            case 64000:
                                i8 = 2;
                                break;
                            case 88200:
                                i8 = 1;
                                break;
                            case 96000:
                                i8 = 0;
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid sample rate: " + i6);
                        }
                        long a2 = C10766a.m25757a(C10766a.m25757a(a, 4, i8), 1, 0);
                        switch (i7) {
                            case 1:
                                i = 1;
                                break;
                            case 2:
                                i = 2;
                                break;
                            case 3:
                                i = 3;
                                break;
                            case 4:
                                break;
                            case 5:
                                i = 5;
                                break;
                            case 6:
                                i = 6;
                                break;
                            case 8:
                                i = 7;
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid channel count: " + i7);
                        }
                        long a3 = C10766a.m25757a(C10766a.m25757a(C10766a.m25757a(C10766a.m25757a(C10766a.m25757a(C10766a.m25757a(C10766a.m25757a(C10766a.m25757a(a2, 3, i), 1, 0), 1, 0), 1, 0), 1, 0), 13, i4 + 7), 11, 2047), 2, 0);
                        byteBuffer.put((byte) ((int) ((a3 >>> 48) & 255)));
                        byteBuffer.put((byte) ((int) ((a3 >>> 40) & 255)));
                        byteBuffer.put((byte) ((int) ((a3 >>> 32) & 255)));
                        byteBuffer.put((byte) ((int) ((a3 >>> 24) & 255)));
                        byteBuffer.put((byte) ((int) ((a3 >>> 16) & 255)));
                        byteBuffer.put((byte) ((int) ((a3 >>> 8) & 255)));
                        byteBuffer.put((byte) ((int) a3));
                        this.f35746i.flip();
                    } else if (i5 == 3) {
                        this.f35746i.clear();
                        if (!this.f35753p) {
                            this.f35753p = true;
                            int i9 = this.f35741d;
                            int i10 = this.f35742e;
                            ByteBuffer byteBuffer2 = this.f35746i;
                            byteBuffer2.put("OpusHead".getBytes());
                            byteBuffer2.put((byte) 1);
                            byteBuffer2.put((byte) (i10 & PrivateKeyType.INVALID));
                            byteBuffer2.putShort(80);
                            byteBuffer2.putInt((int) (((long) i9) & 4294967295L));
                            byteBuffer2.putShort(0);
                            byteBuffer2.put((byte) 0);
                        }
                        ByteBuffer byteBuffer3 = this.f35746i;
                        if (i4 > 223) {
                            byteBuffer3.put((byte) ((i4 & 31) + 223));
                            byteBuffer3.put((byte) ((i4 >> 5) - 7));
                        } else {
                            byteBuffer3.put((byte) i4);
                        }
                        this.f35746i.flip();
                    }
                    ByteBuffer byteBuffer4 = this.f35749l[dequeueOutputBuffer];
                    byteBuffer4.clear();
                    byteBuffer4.position(i3);
                    byteBuffer4.limit(i3 + i4);
                }
            }
        } else {
            throw new C10767a();
        }
    }

    /* renamed from: b */
    private final void m25759b(MediaCodec mediaCodec) {
        int i = this.f35750m;
        if (i >= 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f35750m = -1;
        }
    }

    /* renamed from: d */
    private final void m25761d(String str, MediaFormat mediaFormat) {
        try {
            m25760c(MediaCodec.createEncoderByType(str), mediaFormat);
        } catch (IOException e) {
            throw new C10767a(e);
        }
    }

    /* renamed from: e */
    private static boolean m25762e(int i) {
        return i == 0;
    }

    public final synchronized void close() {
        C59337t.m92221a(this.f35739b);
        MediaCodec mediaCodec = this.f35747j;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                this.f35747j.release();
            } catch (IllegalStateException e) {
                ((C59052c) ((C59052c) ((C59052c) f35738a.mo56226d()).mo56382g(e)).mo56372aa(53922)).mo56386p("MediaCodec has already been stopped or released.");
            }
            this.f35747j = null;
            return;
        }
        ((C59052c) ((C59052c) f35738a.mo56226d()).mo56372aa(53923)).mo56386p("close() called when codec is already closed");
    }

    public final synchronized void finalize() {
        if (this.f35747j != null) {
            close();
            ((C59052c) ((C59052c) f35738a.mo56225c()).mo56372aa(53926)).mo56386p("No one closed");
        }
    }

    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        boolean z = this.f35751n && !this.f35745h.hasRemaining();
        while (!z && !this.f35751n && ((r4 = this.f35750m) == -1 || !this.f35749l[r4].hasRemaining())) {
            MediaCodec mediaCodec = this.f35747j;
            if (mediaCodec != null) {
                m25759b(mediaCodec);
                synchronized (this) {
                    int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000);
                    if (dequeueInputBuffer != -1) {
                        ByteBuffer byteBuffer = this.f35748k[dequeueInputBuffer];
                        byteBuffer.clear();
                        byteBuffer.position(0);
                        C58838bb.m90883r(byteBuffer.hasRemaining());
                        while (true) {
                            if (byteBuffer.position() >= this.f35740c || !byteBuffer.hasRemaining() || this.f35751n) {
                                break;
                            } else if (this.f35745h.hasRemaining()) {
                                int h = C60757n.m92747h(this.f35745h.remaining(), byteBuffer.remaining(), this.f35740c - byteBuffer.position());
                                byteBuffer.put(this.f35745h.array(), this.f35745h.position(), h);
                                ByteBuffer byteBuffer2 = this.f35745h;
                                byteBuffer2.position(byteBuffer2.position() + h);
                            } else {
                                int read = this.f35739b.read(this.f35745h.array());
                                if (read == -1) {
                                    break;
                                }
                                this.f35745h.position(0);
                                this.f35745h.limit(read);
                            }
                        }
                        if (byteBuffer.position() > 0) {
                            mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, byteBuffer.position(), 0, 0);
                        } else {
                            this.f35751n = true;
                            mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                        }
                    }
                }
                m25758a(false);
            } else {
                throw new C10767a();
            }
        }
        if (this.f35751n && ((i3 = this.f35750m) == -1 || !this.f35749l[i3].hasRemaining())) {
            if (this.f35752o) {
                return -1;
            }
            m25758a(true);
            int i5 = this.f35750m;
            if (i5 == -1 || !this.f35749l[i5].hasRemaining()) {
                return 0;
            }
        }
        if (this.f35746i.hasRemaining()) {
            i4 = Math.min(i2, this.f35746i.remaining());
            this.f35746i.get(bArr, i, i4);
            i += i4;
            i2 -= i4;
        }
        ByteBuffer byteBuffer3 = this.f35749l[this.f35750m];
        C58838bb.m90883r(byteBuffer3.hasRemaining());
        int min = Math.min(i2, byteBuffer3.remaining());
        byteBuffer3.get(bArr, i, min);
        return min + i4;
    }

    /* renamed from: c */
    private final synchronized void m25760c(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        try {
            this.f35747j = mediaCodec;
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f35747j.start();
            this.f35748k = this.f35747j.getInputBuffers();
            this.f35749l = this.f35747j.getOutputBuffers();
        } catch (Exception e) {
            throw new IllegalArgumentException("Could not create codec", e);
        }
    }
}
