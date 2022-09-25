package com.google.android.libraries.assistant.soda;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.os.SystemClock;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
class AudioInput {

    /* renamed from: a */
    private static final C59071e f53848a = C59071e.m91332i("com.google.android.libraries.assistant.soda.AudioInput");

    /* renamed from: b */
    private final long f53849b;

    /* renamed from: c */
    private final int f53850c;

    /* renamed from: d */
    private final int f53851d;

    /* renamed from: e */
    private final int f53852e;

    /* renamed from: f */
    private final int f53853f;

    /* renamed from: g */
    private int f53854g;

    /* renamed from: h */
    private int f53855h;

    /* renamed from: i */
    private final int f53856i;

    /* renamed from: j */
    private final boolean f53857j;

    /* renamed from: k */
    private int f53858k = 0;

    /* renamed from: l */
    private AudioRecord f53859l;

    /* renamed from: m */
    private ByteBuffer f53860m;

    /* renamed from: n */
    private ByteBuffer f53861n;

    /* renamed from: o */
    private final int f53862o;

    /* renamed from: p */
    private final boolean f53863p;

    /* renamed from: q */
    private long f53864q = 0;

    /* renamed from: r */
    private long f53865r = 0;

    /* renamed from: s */
    private int f53866s;

    /* renamed from: t */
    private boolean f53867t = false;

    public AudioInput(long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        this.f53849b = j;
        this.f53856i = i;
        this.f53850c = i2;
        this.f53851d = i3;
        this.f53852e = i4;
        this.f53853f = i5;
        this.f53862o = i6;
        this.f53863p = z;
        this.f53857j = z2;
        ((C59052c) ((C59052c) f53848a.mo56224b()).mo56372aa(47554)).mo56365R("Ctor: nativeAudioInput = %d chunkSizeMs=%d source=%d sampleRate=%d channels=%d bytesPerSample=%d dspCaptureSession=%d isLoopbackSession=%b allowNonBlockingApiUse=%b", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* renamed from: a */
    private final long m36609a(int i) {
        this.f53866s++;
        return this.f53864q + (((long) i) * 1000);
    }

    /* renamed from: b */
    private final void m36610b() {
        AudioRecord audioRecord = this.f53859l;
        if (audioRecord != null) {
            audioRecord.release();
            this.f53859l = null;
        }
    }

    /* renamed from: c */
    private final boolean m36611c(int i, int i2, int i3) {
        try {
            AudioRecord build = new AudioRecord.Builder().setAudioSource(this.f53850c).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.f53851d).setChannelMask(i).setEncoding(i2).build()).setBufferSizeInBytes(i3).build();
            this.f53859l = build;
            if (build == null) {
                ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47558)).mo56386p("Init: Cannot create AudioRecord instance!");
                return false;
            } else if (build.getState() == 1) {
                return true;
            } else {
                ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47557)).mo56386p("Init: AudioRecord instance state not INITIALIZED");
                m36610b();
                return false;
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47559)).mo56389s("Init: Cannot create AudioRecord instance: %s", e.getMessage());
            return false;
        }
    }

    /* renamed from: d */
    private final boolean m36612d(int i, int i2, int i3, int i4) {
        try {
            Constructor<AudioRecord> constructor = AudioRecord.class.getConstructor(new Class[]{AudioAttributes.class, AudioFormat.class, Integer.TYPE, Integer.TYPE});
            Method method = AudioAttributes.Builder.class.getMethod("setInternalCapturePreset", new Class[]{Integer.TYPE});
            AudioFormat build = new AudioFormat.Builder().setChannelMask(i).setEncoding(i2).setSampleRate(this.f53851d).build();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            method.invoke(builder, new Object[]{Integer.valueOf(this.f53850c)});
            try {
                AudioRecord newInstance = constructor.newInstance(new Object[]{builder.build(), build, Integer.valueOf(i3), Integer.valueOf(i4)});
                this.f53859l = newInstance;
                if (newInstance != null) {
                    if (newInstance.getState() != 1) {
                        ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47560)).mo56386p("Failed to initialize AudioRecord");
                        m36610b();
                        return false;
                    }
                }
                return true;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47562)).mo56386p("Exception while invoking new AudioRecord");
                return false;
            }
        } catch (Exception unused2) {
            ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47561)).mo56387q("Failed to construct AudioRecord for capture session %d", this.f53862o);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009d A[SYNTHETIC, Splitter:B:17:0x009d] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m36613e(int r11, int r12) {
        /*
            r10 = this;
            int r0 = r10.f53855h
            int r0 = r0 * 5
            r1 = 4
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class<android.media.AudioAttributes> r4 = android.media.AudioAttributes.class
            r3[r2] = r4     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class<android.media.AudioFormat> r4 = android.media.AudioFormat.class
            r5 = 1
            r3[r5] = r4     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00d5 }
            r6 = 2
            r3[r6] = r4     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00d5 }
            r7 = 3
            r3[r7] = r4     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class<android.media.AudioRecord> r4 = android.media.AudioRecord.class
            java.lang.reflect.Constructor r3 = r4.getConstructor(r3)     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00d5 }
            r4[r2] = r8     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class<android.media.AudioAttributes$Builder> r8 = android.media.AudioAttributes.Builder.class
            java.lang.String r9 = "setInternalCapturePreset"
            java.lang.reflect.Method r4 = r8.getMethod(r9, r4)     // Catch:{ Exception -> 0x00d5 }
            android.media.AudioFormat$Builder r8 = new android.media.AudioFormat$Builder     // Catch:{ Exception -> 0x00d5 }
            r8.<init>()     // Catch:{ Exception -> 0x00d5 }
            r9 = 16
            if (r11 == r9) goto L_0x005c
            r9 = 12
            if (r11 != r9) goto L_0x003d
            goto L_0x005c
        L_0x003d:
            r9 = 15
            if (r11 != r9) goto L_0x0045
            r8.setChannelIndexMask(r9)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x005f
        L_0x0045:
            com.google.common.f.e r12 = f53848a     // Catch:{ Exception -> 0x00d5 }
            com.google.common.f.x r12 = r12.mo56225c()     // Catch:{ Exception -> 0x00d5 }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ Exception -> 0x00d5 }
            r0 = 47566(0xb9ce, float:6.6654E-41)
            com.google.common.f.x r12 = r12.mo56372aa(r0)     // Catch:{ Exception -> 0x00d5 }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r0 = "Invalid loopback channelConfig: %d"
            r12.mo56387q(r0, r11)     // Catch:{ Exception -> 0x00d5 }
            return r2
        L_0x005c:
            r8.setChannelMask(r11)     // Catch:{ Exception -> 0x00d5 }
        L_0x005f:
            r8.setEncoding(r12)     // Catch:{ Exception -> 0x00d5 }
            int r11 = r10.f53851d     // Catch:{ Exception -> 0x00d5 }
            r8.setSampleRate(r11)     // Catch:{ Exception -> 0x00d5 }
            android.media.AudioFormat r11 = r8.build()     // Catch:{ Exception -> 0x00d5 }
            android.media.AudioAttributes$Builder r12 = new android.media.AudioAttributes$Builder     // Catch:{ Exception -> 0x00d5 }
            r12.<init>()     // Catch:{ Exception -> 0x00d5 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00d5 }
            int r9 = r10.f53850c     // Catch:{ Exception -> 0x00d5 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x00d5 }
            r8[r2] = r9     // Catch:{ Exception -> 0x00d5 }
            r4.invoke(r12, r8)     // Catch:{ Exception -> 0x00d5 }
            android.media.AudioAttributes r12 = r12.build()     // Catch:{ Exception -> 0x00d5 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00be }
            r1[r2] = r12     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00be }
            r1[r5] = r11     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00be }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00be }
            r1[r6] = r11     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00be }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00be }
            r1[r7] = r11     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00be }
            java.lang.Object r11 = r3.newInstance(r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00be }
            android.media.AudioRecord r11 = (android.media.AudioRecord) r11     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00be }
            r10.f53859l = r11     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00be }
            if (r11 == 0) goto L_0x00bd
            int r11 = r11.getState()     // Catch:{ Exception -> 0x00d5 }
            if (r11 == r5) goto L_0x00bd
            com.google.common.f.e r11 = f53848a     // Catch:{ Exception -> 0x00d5 }
            com.google.common.f.x r11 = r11.mo56225c()     // Catch:{ Exception -> 0x00d5 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ Exception -> 0x00d5 }
            r12 = 47563(0xb9cb, float:6.665E-41)
            com.google.common.f.x r11 = r11.mo56372aa(r12)     // Catch:{ Exception -> 0x00d5 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r12 = "Failed to initialize AudioRecord for loopback"
            r11.mo56386p(r12)     // Catch:{ Exception -> 0x00d5 }
            r10.m36610b()     // Catch:{ Exception -> 0x00d5 }
            return r2
        L_0x00bd:
            return r5
        L_0x00be:
            com.google.common.f.e r11 = f53848a     // Catch:{ Exception -> 0x00d5 }
            com.google.common.f.x r11 = r11.mo56225c()     // Catch:{ Exception -> 0x00d5 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ Exception -> 0x00d5 }
            r12 = 47565(0xb9cd, float:6.6653E-41)
            com.google.common.f.x r11 = r11.mo56372aa(r12)     // Catch:{ Exception -> 0x00d5 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r12 = "Exception while invoking new AudioRecord for loopback"
            r11.mo56386p(r12)     // Catch:{ Exception -> 0x00d5 }
            return r2
        L_0x00d5:
            com.google.common.f.e r11 = f53848a
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r12 = "Failed to construct AudioRecord for loopback session"
            r0 = 47564(0xb9cc, float:6.6651E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.soda.AudioInput.m36613e(int, int):boolean");
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private int readBuffer() {
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        this.f53860m.clear();
        AudioRecord audioRecord = this.f53859l;
        if (audioRecord == null) {
            ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47550)).mo56386p("Cannot read audio, no audio record!");
            return -1;
        }
        if (this.f53857j) {
            int capacity = this.f53860m.capacity();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(capacity);
            i = 0;
            int i3 = 0;
            while (true) {
                if (this.f53867t) {
                    break;
                }
                allocateDirect.clear();
                AudioRecord audioRecord2 = this.f53859l;
                if (audioRecord2 == null) {
                    break;
                }
                int read = audioRecord2.read(allocateDirect, capacity - i, 1);
                if (read < 0) {
                    i = read;
                    break;
                }
                if (read != 0) {
                    allocateDirect.position(read);
                    allocateDirect.flip();
                    this.f53860m.put(allocateDirect);
                    i += read;
                    if (i == this.f53860m.capacity()) {
                        break;
                    }
                    i3 = 0;
                } else {
                    i3++;
                    if (i3 >= 6) {
                        break;
                    }
                }
                try {
                    Thread.sleep((long) this.f53856i);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        } else {
            ByteBuffer byteBuffer = this.f53860m;
            i = audioRecord.read(byteBuffer, byteBuffer.capacity());
        }
        if (i < 0) {
            ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47549)).mo56387q("ReadBuffer: read failed with error: %d", i);
            return -1;
        } else if (i == 0) {
            int i4 = this.f53858k;
            if (i4 >= 10) {
                ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47548)).mo56386p("ReadBuffer: too many consecutive zero byte buffers.");
                this.f53858k = 0;
                return -1;
            }
            this.f53858k = i4 + 1;
            return 0;
        } else {
            this.f53858k = 0;
            this.f53861n.position(0);
            ByteBuffer byteBuffer2 = this.f53861n;
            int i5 = this.f53854g;
            int i6 = i / ((this.f53851d / 1000) * i5);
            long j4 = this.f53865r;
            int i7 = i / i5;
            if (this.f53859l == null) {
                ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47553)).mo56386p("approximating timestamps, no audio record!");
                j = m36609a(i6);
                i2 = i;
            } else {
                if (this.f53866s == 100) {
                    AudioTimestamp audioTimestamp = new AudioTimestamp();
                    int timestamp = this.f53859l.getTimestamp(audioTimestamp, 1);
                    if (timestamp != 0) {
                        ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47552)).mo56387q("audioRecord.getTimestamp returned error %d, Estimating timestamps instead.", timestamp);
                        j3 = m36609a(i6);
                        j2 = j4 + ((long) i7);
                        i2 = i;
                    } else {
                        j2 = j4 + ((long) i7);
                        long a = m36609a(i6);
                        long currentTimeMillis = (System.currentTimeMillis() * 1000) - ((SystemClock.elapsedRealtimeNanos() / 1000) - (audioTimestamp.nanoTime / 1000));
                        if (audioTimestamp.framePosition == j2) {
                            j2 = audioTimestamp.framePosition;
                            i2 = i;
                            j3 = currentTimeMillis;
                        } else {
                            long j5 = audioTimestamp.framePosition;
                            long j6 = (long) ((this.f53851d * this.f53856i) / 1000);
                            long j7 = j6 + j6;
                            long abs = Math.abs(j5 - j2);
                            i2 = i;
                            long j8 = (1000000 * abs) / ((long) this.f53851d);
                            long j9 = j5 < j2 ? currentTimeMillis + j8 : currentTimeMillis - j8;
                            if (abs > j7) {
                                ((C59052c) ((C59052c) f53848a.mo56224b()).mo56372aa(47551)).mo56361N("Adjusting timestamps: (framePos, timestamp) received(%d, %d) expected (%d, %d), adjusted timestamp %d", Long.valueOf(j5), Long.valueOf(currentTimeMillis), Long.valueOf(j2), Long.valueOf(a), Long.valueOf(j9));
                            }
                            j3 = j9;
                        }
                    }
                    this.f53866s = 0;
                } else {
                    i2 = i;
                    j3 = m36609a(i6);
                    j2 = j4 + ((long) i7);
                }
                j = j3;
                this.f53864q = j;
                this.f53865r = j2;
            }
            byteBuffer2.putLong(j);
            if (i2 != this.f53860m.capacity()) {
                this.f53860m.capacity();
            }
            return i2;
        }
    }

    private void stop() {
        this.f53867t = true;
        if (this.f53859l != null) {
            ((C59052c) ((C59052c) f53848a.mo56224b()).mo56372aa(47555)).mo56386p("Stopping recording");
        }
        AudioRecord audioRecord = this.f53859l;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        m36610b();
        this.f53867t = false;
    }

    public boolean start() {
        int i;
        int i2;
        boolean z;
        int i3 = this.f53853f;
        if (i3 == 2) {
            i = 2;
        } else if (i3 == 4) {
            i = 4;
        } else {
            ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47567)).mo56387q("Unsupported sample size %d", this.f53853f);
            ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47576)).mo56386p("Cannot start, initialization failed!");
            return false;
        }
        int i4 = this.f53852e;
        if (i4 == 1) {
            i2 = 16;
        } else if (i4 == 2) {
            i2 = 12;
        } else if (i4 != 4) {
            ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47568)).mo56387q("Unsupported number of channels: %d", this.f53852e);
            ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47576)).mo56386p("Cannot start, initialization failed!");
            return false;
        } else {
            i2 = 15;
        }
        int i5 = i4 * i3;
        this.f53854g = i5;
        int i6 = (this.f53851d * this.f53856i) / 1000;
        int i7 = i5 * i6;
        this.f53855h = i7;
        try {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i7);
            this.f53860m = allocateDirect;
            if (this.f53855h != allocateDirect.capacity()) {
                ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47572)).mo56393w("Init: Allocated buffer's size=%d is different from requested size=%d", this.f53860m.capacity(), this.f53855h);
            } else {
                this.f53860m.order(ByteOrder.nativeOrder());
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(8);
                this.f53861n = allocateDirect2;
                allocateDirect2.order(ByteOrder.BIG_ENDIAN);
                if (this.f53863p) {
                    z = m36613e(i2, i);
                } else {
                    int minBufferSize = AudioRecord.getMinBufferSize(this.f53851d, i2, i);
                    if (minBufferSize == -1 || minBufferSize == -2) {
                        ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47569)).mo56386p("Init: AudioRecord.getMinBufferSize returned error!");
                    } else {
                        int i8 = minBufferSize * 5;
                        if (i8 < this.f53855h * 5) {
                            ((C59052c) ((C59052c) f53848a.mo56226d()).mo56372aa(47571)).mo56393w("Init: calculated AudioRecord internal buffer size (%d) is smaller than expected buffer size (%d). Rounding up.", i8, this.f53855h * 5);
                            i8 = this.f53855h * 5;
                        }
                        ((C59052c) ((C59052c) f53848a.mo56224b()).mo56372aa(47570)).mo56361N("Init: mPcmBuffer capacity=%d(%d frames) internalBufferSize=%d minInternalBufferSize=%d mBytesPerReadBuffer=%d", Integer.valueOf(this.f53860m.capacity()), Integer.valueOf(i6), Integer.valueOf(i8), Integer.valueOf(minBufferSize), Integer.valueOf(this.f53855h));
                        int i9 = this.f53862o;
                        if (i9 >= 0) {
                            z = m36612d(i2, i, 320000, i9);
                        } else if (this.f53850c == 1999) {
                            z = m36612d(i2, i, i8, 0);
                        } else {
                            z = m36611c(i2, i, i8);
                        }
                    }
                }
                if (z) {
                    nativeCacheDirectBufferAddress(this.f53849b, this.f53860m, this.f53861n);
                    AudioRecord audioRecord = this.f53859l;
                    if (audioRecord != null) {
                        try {
                            audioRecord.startRecording();
                            this.f53858k = 0;
                            this.f53864q = System.currentTimeMillis() * 1000;
                            this.f53865r = 0;
                            this.f53866s = 100;
                            return true;
                        } catch (IllegalStateException e) {
                            m36610b();
                            ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47574)).mo56389s("Cannot start, startRecording() failed: %s", e.getMessage());
                            return false;
                        }
                    } else {
                        ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47575)).mo56386p("Cannot start, no audio record!");
                        return false;
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47573)).mo56389s("Init: Cannot create mPcmBuffer: %s", e2.getMessage());
        }
        ((C59052c) ((C59052c) f53848a.mo56225c()).mo56372aa(47576)).mo56386p("Cannot start, initialization failed!");
        return false;
    }
}
