package com.google.android.libraries.assistant.hotword;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.assistant.hotword.p1515a.C18326a;
import com.google.android.libraries.assistant.hotword.p1515a.C18327b;
import com.google.android.libraries.assistant.soda.C19244ag;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.hotword.h */
/* compiled from: PG */
public class C18371h {

    /* renamed from: b */
    public static final C59071e f52108b = C59071e.m91332i("com.google.android.libraries.assistant.hotword.h");

    /* renamed from: a */
    private boolean f52109a = false;

    /* renamed from: c */
    final int f52110c;

    /* renamed from: d */
    ParcelFileDescriptor[] f52111d;

    /* renamed from: e */
    AudioRecord f52112e;

    /* renamed from: f */
    FileChannel f52113f;

    /* renamed from: g */
    protected final Executor f52114g;

    /* renamed from: h */
    protected final int f52115h;

    /* renamed from: i */
    ParcelFileDescriptor[] f52116i;

    /* renamed from: j */
    FileChannel f52117j;

    /* renamed from: k */
    public long f52118k = 0;

    /* renamed from: l */
    public long f52119l = 0;

    /* renamed from: m */
    public int f52120m = 50;

    /* renamed from: n */
    public boolean f52121n = true;

    /* renamed from: o */
    private final C19244ag f52122o = new C19244ag();

    /* renamed from: p */
    private final C19244ag f52123p = new C19244ag();

    public C18371h(Executor executor, int i, int i2) {
        this.f52114g = executor;
        this.f52115h = i;
        this.f52110c = i2;
    }

    public C18371h(Executor executor, int i, int i2, boolean z) {
        this.f52114g = executor;
        this.f52115h = i;
        this.f52110c = i2;
        this.f52109a = z;
    }

    /* renamed from: f */
    public static int m35742f(int i) {
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 1;
        }
        throw new RuntimeException("Add support for the audio in channel");
    }

    /* renamed from: i */
    public static AudioRecord m35743i(C18327b bVar) {
        int i = ((C18326a) bVar).f51969c;
        if (i >= 0) {
            try {
                Constructor<AudioRecord> constructor = AudioRecord.class.getConstructor(new Class[]{AudioAttributes.class, AudioFormat.class, Integer.TYPE, Integer.TYPE});
                Method method = AudioAttributes.Builder.class.getMethod("setInternalCapturePreset", new Class[]{Integer.TYPE});
                AudioFormat audioFormat = ((C18326a) bVar).f51968b;
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                method.invoke(builder, new Object[]{1999});
                try {
                    AudioRecord newInstance = constructor.newInstance(new Object[]{builder.build(), audioFormat, Integer.valueOf(C89885b.OKHTTP_VALUE), Integer.valueOf(i)});
                    if (newInstance != null) {
                        if (newInstance.getState() != 1) {
                            ((C59052c) ((C59052c) f52108b.mo56225c()).mo56372aa(47126)).mo56386p("Failed to initialize AudioRecord");
                            newInstance.release();
                            return null;
                        }
                    }
                    return newInstance;
                } catch (IllegalAccessException e) {
                    e = e;
                    ((C59052c) ((C59052c) ((C59052c) f52108b.mo56226d()).mo56382g(e)).mo56372aa(47128)).mo56386p("while invoking new AudioRecord");
                    int i2 = C90755l.f253831a;
                    return null;
                } catch (InvocationTargetException e2) {
                    e = e2;
                    ((C59052c) ((C59052c) ((C59052c) f52108b.mo56226d()).mo56382g(e)).mo56372aa(47128)).mo56386p("while invoking new AudioRecord");
                    int i22 = C90755l.f253831a;
                    return null;
                } catch (InstantiationException e3) {
                    e = e3;
                    ((C59052c) ((C59052c) ((C59052c) f52108b.mo56226d()).mo56382g(e)).mo56372aa(47128)).mo56386p("while invoking new AudioRecord");
                    int i222 = C90755l.f253831a;
                    return null;
                }
            } catch (Exception e4) {
                ((C59052c) ((C59052c) ((C59052c) f52108b.mo56225c()).mo56382g(e4)).mo56372aa(47127)).mo56395y("Failed to construct AudioRecord for capture session %d: %s", i, e4.getMessage());
            }
        }
        return null;
    }

    /* renamed from: m */
    static final void m35744m(FileChannel fileChannel, String str) {
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f52108b.mo56225c()).mo56382g(e)).mo56372aa(47141)).mo56389s("IOException: closing channel %s", str);
            }
        }
    }

    /* renamed from: n */
    static final void m35745n(ParcelFileDescriptor[] parcelFileDescriptorArr, String str) {
        if (parcelFileDescriptorArr != null) {
            try {
                parcelFileDescriptorArr[0].close();
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f52108b.mo56225c()).mo56382g(e)).mo56372aa(47145)).mo56389s("IOException: close read stream for: %s", str);
            }
            try {
                parcelFileDescriptorArr[1].close();
            } catch (IOException e2) {
                ((C59052c) ((C59052c) ((C59052c) f52108b.mo56225c()).mo56382g(e2)).mo56372aa(47144)).mo56389s("IOException: close write stream for: %s", str);
            }
        }
    }

    /* renamed from: o */
    protected static final void m35746o(C18370g gVar, boolean z) {
        if (gVar != null) {
            gVar.mo23775a(z);
        }
    }

    /* renamed from: p */
    private static synchronized long m35747p(long j) {
        long currentTimeMillis;
        synchronized (C18371h.class) {
            currentTimeMillis = (System.currentTimeMillis() * 1000) - ((SystemClock.elapsedRealtimeNanos() / 1000) - (j / 1000));
        }
        return currentTimeMillis;
    }

    /* renamed from: q */
    private final long m35748q(int i) {
        this.f52120m++;
        return this.f52118k + (((long) i) * 1000);
    }

    /* renamed from: r */
    private final ParcelFileDescriptor m35749r(C18370g gVar) {
        ParcelFileDescriptor[] l = mo23857l();
        this.f52111d = l;
        if (l == null) {
            return null;
        }
        if (this.f52109a) {
            ParcelFileDescriptor[] l2 = mo23857l();
            this.f52116i = l2;
            if (l2 == null) {
                ((C59052c) ((C59052c) f52108b.mo56225c()).mo56372aa(47136)).mo56386p("Failed to create pfdPipe for timestamp stream");
                return null;
            }
            this.f52121n = true;
        }
        mo23856k(gVar);
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.f52111d;
        if (parcelFileDescriptorArr == null) {
            return null;
        }
        return parcelFileDescriptorArr[0];
    }

    /* renamed from: a */
    public synchronized ParcelFileDescriptor mo23807a(C18370g gVar) {
        AudioRecord audioRecord;
        mo23808b();
        try {
            int i = this.f52115h;
            int i2 = this.f52110c;
            audioRecord = new AudioRecord(i, 16000, i2, 2, m35742f(i2) * 256000);
            if (audioRecord.getState() != 1) {
                ((C59052c) ((C59052c) f52108b.mo56225c()).mo56372aa(47133)).mo56386p("Failed to initialize AudioRecord");
                audioRecord.release();
                audioRecord = null;
            }
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) f52108b.mo56225c()).mo56382g(e)).mo56372aa(47132)).mo56386p("Failed to create AudioRecord");
        }
        this.f52112e = audioRecord;
        if (audioRecord == null) {
            ((C59052c) ((C59052c) f52108b.mo56225c()).mo56372aa(47137)).mo56386p("Unable to create audio record");
            return null;
        }
        return m35749r(gVar);
    }

    /* renamed from: b */
    public synchronized void mo23808b() {
        AudioRecord audioRecord = this.f52112e;
        if (audioRecord != null) {
            audioRecord.release();
            ((C59052c) ((C59052c) f52108b.mo56224b()).mo56372aa(47139)).mo56386p("Audio Stopped");
            this.f52112e = null;
        }
        m35744m(this.f52113f, "outputChannel");
        this.f52113f = null;
        m35744m(this.f52117j, "timestampOutputChannel");
        this.f52117j = null;
        m35745n(this.f52111d, "pfdPipe");
        this.f52111d = null;
        m35745n(this.f52116i, "timestampPfdPipe");
        this.f52116i = null;
    }

    /* renamed from: c */
    public synchronized void mo23809c() {
    }

    /* renamed from: d */
    public boolean mo23810d() {
        return this.f52112e != null;
    }

    /* renamed from: e */
    public StringBuilder mo23811e() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("\n    Buffer Size=");
        sb.append(mo23853g());
        sb.append("\n    Last known recording state=");
        AudioRecord audioRecord = this.f52112e;
        if (audioRecord == null) {
            obj = "None";
        } else {
            obj = Integer.valueOf(audioRecord.getRecordingState());
        }
        sb.append(obj);
        return sb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo23853g() {
        int f = m35742f(this.f52110c);
        return (f + f) * 320;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01cc  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo23854h(android.media.AudioRecord r24, byte[] r25) {
        /*
            r23 = this;
            r1 = r23
            r0 = r25
            java.lang.String r2 = "Closing audio"
            int r3 = r23.mo23853g()
            r4 = 0
            r5 = r24
            int r3 = r5.read(r0, r4, r3)
            r5 = 393221(0x60005, float:5.5102E-40)
            r6 = -1
            if (r3 >= r6) goto L_0x0047
            r0 = -3
            if (r3 == r0) goto L_0x003f
            r0 = -2
            if (r3 != r0) goto L_0x0028
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d
            java.lang.String r2 = "Bad offset/length arguments for buffer"
            r3 = 393218(0x60002, float:5.51016E-40)
            r0.<init>((java.lang.String) r2, (int) r3)
            throw r0
        L_0x0028:
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected error code: "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 393223(0x60007, float:5.51023E-40)
            r0.<init>((java.lang.String) r2, (int) r3)
            throw r0
        L_0x003f:
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d
            java.lang.String r2 = "not open"
            r0.<init>((java.lang.String) r2, (int) r5)
            throw r0
        L_0x0047:
            if (r3 <= 0) goto L_0x01e9
            boolean r7 = r1.f52109a     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            if (r7 == 0) goto L_0x017d
            boolean r7 = r1.f52121n     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            if (r7 == 0) goto L_0x017d
            android.media.AudioRecord r7 = r1.f52112e     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            if (r7 == 0) goto L_0x0174
            android.media.AudioTimestamp r5 = new android.media.AudioTimestamp     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            r5.<init>()     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            long r7 = r1.f52119l     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            int r9 = r1.f52110c     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            int r9 = m35742f(r9)     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            int r9 = r9 + r9
            int r10 = r9 * 16
            int r11 = r3 / r10
            int r12 = r3 / r9
            int r10 = r3 % r10
            if (r10 != 0) goto L_0x0144
            int r10 = r11 % 10
            if (r10 == 0) goto L_0x0073
            goto L_0x0144
        L_0x0073:
            int r10 = r1.f52120m     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            r14 = 50
            if (r10 != r14) goto L_0x00d8
            android.media.AudioRecord r10 = r1.f52112e     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            if (r10 == 0) goto L_0x00d8
            r14 = 1
            int r10 = r10.getTimestamp(r5, r14)     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            if (r10 == 0) goto L_0x0092
            long r14 = r1.m35748q(r11)     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            r16 = r14
            long r13 = (long) r12     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            long r7 = r7 + r13
            r10 = r2
            r14 = r16
            r16 = r3
            goto L_0x00d5
        L_0x0092:
            long r12 = (long) r12     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            long r7 = r7 + r12
            long r14 = r1.m35748q(r11)     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            long r12 = r5.nanoTime     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            long r12 = m35747p(r12)     // Catch:{ AsynchronousCloseException -> 0x01db, IOException -> 0x01af }
            r10 = r2
            r16 = r3
            long r2 = r5.framePosition     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            int r17 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r17 != 0) goto L_0x00ab
            long r7 = r5.framePosition     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r14 = r12
            goto L_0x00d5
        L_0x00ab:
            com.google.common.f.e r2 = f52108b     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r3 = 47123(0xb813, float:6.6033E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r17 = r2
            com.google.common.f.c r17 = (com.google.common.p4526f.C59052c) r17     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.lang.String r18 = "skipping timestamp, (framePos, timestamp) received (%d, %d) expected (%d, %d)"
            long r2 = r5.framePosition     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.lang.Long r19 = java.lang.Long.valueOf(r2)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.lang.Long r20 = java.lang.Long.valueOf(r12)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.lang.Long r21 = java.lang.Long.valueOf(r7)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.lang.Long r22 = java.lang.Long.valueOf(r14)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r17.mo56360M(r18, r19, r20, r21, r22)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
        L_0x00d5:
            r1.f52120m = r4     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            goto L_0x00e1
        L_0x00d8:
            r10 = r2
            r16 = r3
            long r14 = r1.m35748q(r11)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            long r2 = (long) r12     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            long r7 = r7 + r2
        L_0x00e1:
            r2 = 10
            int r11 = r11 / r2
            int r2 = r9 * 160
            int r2 = r2 / r9
            com.google.android.libraries.assistant.soda.ag r3 = r1.f52123p     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            int r5 = r11 * 16
            java.nio.ByteBuffer r3 = r3.mo24395a(r5)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.nio.ByteOrder r5 = java.nio.ByteOrder.nativeOrder()     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r3.order(r5)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            int r11 = r11 + r6
        L_0x00f7:
            if (r11 < 0) goto L_0x010e
            int r5 = r11 * r2
            long r12 = (long) r5     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            long r12 = r7 - r12
            r3.putLong(r12)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            long r12 = (long) r11     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r17 = 10000(0x2710, double:4.9407E-320)
            long r12 = r12 * r17
            long r12 = r14 - r12
            r3.putLong(r12)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            int r11 = r11 + -1
            goto L_0x00f7
        L_0x010e:
            r3.flip()     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.nio.channels.FileChannel r2 = r1.f52117j     // Catch:{ IOException -> 0x0134 }
            if (r2 == 0) goto L_0x011d
            r2.write(r3)     // Catch:{ IOException -> 0x0134 }
            r1.f52118k = r14     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r1.f52119l = r7     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            goto L_0x0180
        L_0x011d:
            com.google.common.f.e r0 = f52108b     // Catch:{ IOException -> 0x0134 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ IOException -> 0x0134 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x0134 }
            r2 = 47121(0xb811, float:6.603E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ IOException -> 0x0134 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x0134 }
            java.lang.String r2 = "timestampOutputChannel is null, closing audio"
            r0.mo56386p(r2)     // Catch:{ IOException -> 0x0134 }
            goto L_0x015d
        L_0x0134:
            r0 = move-exception
            com.google.common.f.e r2 = f52108b     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.lang.String r3 = "IOException timestampOutputChannel"
            r4 = 47122(0xb812, float:6.6032E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            goto L_0x015d
        L_0x0144:
            r10 = r2
            com.google.common.f.e r0 = f52108b     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r2 = 47120(0xb810, float:6.6029E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.lang.String r2 = "readSizeMS %dnot a multiple of TIMESTAMP_CHUNK_SIZE_MS %d"
            r3 = 10
            r0.mo56393w(r2, r11, r3)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
        L_0x015d:
            com.google.common.f.e r0 = f52108b     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r2 = 47119(0xb80f, float:6.6028E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.lang.String r2 = "timestamps failed, closing audio"
            r0.mo56386p(r2)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            return r6
        L_0x0174:
            r10 = r2
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.lang.String r2 = "audio record null"
            r0.<init>((java.lang.String) r2, (int) r5)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            throw r0     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
        L_0x017d:
            r10 = r2
            r16 = r3
        L_0x0180:
            com.google.android.libraries.assistant.soda.ag r2 = r1.f52122o     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            int r3 = r0.length     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.nio.ByteBuffer r2 = r2.mo24395a(r3)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r3 = r16
            java.nio.ByteBuffer r0 = r2.put(r0, r4, r3)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r0.flip()     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            java.nio.channels.FileChannel r2 = r1.f52113f     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            if (r2 == 0) goto L_0x0198
            r2.write(r0)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            goto L_0x01e9
        L_0x0198:
            com.google.common.f.e r0 = f52108b     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r2 = 47115(0xb80b, float:6.6022E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            r0.mo56386p(r10)     // Catch:{ AsynchronousCloseException -> 0x01dc, IOException -> 0x01ad }
            return r6
        L_0x01ad:
            r0 = move-exception
            goto L_0x01b1
        L_0x01af:
            r0 = move-exception
            r10 = r2
        L_0x01b1:
            java.lang.String r2 = r0.getMessage()
            if (r2 == 0) goto L_0x01cc
            java.lang.String r3 = "Broken pipe"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x01cc
            com.google.common.f.e r0 = f52108b
            com.google.common.f.x r0 = r0.mo56224b()
            r2 = 47118(0xb80e, float:6.6026E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r10)
            goto L_0x01da
        L_0x01cc:
            com.google.common.f.e r2 = f52108b
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "IOException"
            r4 = 47117(0xb80d, float:6.6025E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
        L_0x01da:
            return r6
        L_0x01db:
            r10 = r2
        L_0x01dc:
            com.google.common.f.e r0 = f52108b
            com.google.common.f.x r0 = r0.mo56224b()
            r2 = 47116(0xb80c, float:6.6024E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r10)
            return r6
        L_0x01e9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.hotword.C18371h.mo23854h(android.media.AudioRecord, byte[]):int");
    }

    /* renamed from: j */
    public final synchronized ParcelFileDescriptor mo23855j(C18327b bVar, C18370g gVar) {
        mo23808b();
        AudioRecord i = m35743i(bVar);
        this.f52112e = i;
        if (i == null) {
            ((C59052c) ((C59052c) f52108b.mo56225c()).mo56372aa(47134)).mo56386p("Unable to create audio record");
            return null;
        }
        return m35749r(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final synchronized void mo23856k(C18370g gVar) {
        ParcelFileDescriptor[] parcelFileDescriptorArr;
        if (this.f52111d == null || (this.f52109a && this.f52116i == null)) {
            ((C59052c) ((C59052c) f52108b.mo56225c()).mo56372aa(47147)).mo56386p("Parcel file descriptor or ExecutorService is null, cannot continue");
            mo23808b();
            m35746o(gVar, false);
            return;
        }
        this.f52113f = new ParcelFileDescriptor.AutoCloseOutputStream(this.f52111d[1]).getChannel();
        if (this.f52109a && (parcelFileDescriptorArr = this.f52116i) != null) {
            this.f52117j = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArr[1]).getChannel();
        }
        this.f52114g.execute(new C18369f(this, gVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final ParcelFileDescriptor[] mo23857l() {
        try {
            return ParcelFileDescriptor.createPipe();
        } catch (IOException e) {
            mo23808b();
            ((C59052c) ((C59052c) ((C59052c) f52108b.mo56225c()).mo56382g(e)).mo56372aa(47157)).mo56386p("Unable to create a parcel file descriptor pipe");
            return null;
        }
    }
}
