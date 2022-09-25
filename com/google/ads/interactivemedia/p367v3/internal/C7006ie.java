package com.google.ads.interactivemedia.p367v3.internal;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ie */
/* compiled from: PG */
public final class C7006ie implements C6988hn {

    /* renamed from: A */
    private long f22357A;

    /* renamed from: B */
    private long f22358B;

    /* renamed from: C */
    private int f22359C;

    /* renamed from: D */
    private boolean f22360D;

    /* renamed from: E */
    private boolean f22361E;

    /* renamed from: F */
    private long f22362F;

    /* renamed from: G */
    private float f22363G;

    /* renamed from: H */
    private C6971gx[] f22364H;

    /* renamed from: I */
    private ByteBuffer[] f22365I;

    /* renamed from: J */
    private ByteBuffer f22366J;

    /* renamed from: K */
    private int f22367K;

    /* renamed from: L */
    private ByteBuffer f22368L;

    /* renamed from: M */
    private byte[] f22369M;

    /* renamed from: N */
    private int f22370N;

    /* renamed from: O */
    private int f22371O;

    /* renamed from: P */
    private boolean f22372P;

    /* renamed from: Q */
    private boolean f22373Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f22374R;

    /* renamed from: S */
    private int f22375S;

    /* renamed from: T */
    private C6993hs f22376T;

    /* renamed from: U */
    private boolean f22377U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public long f22378V;

    /* renamed from: W */
    private boolean f22379W;

    /* renamed from: X */
    private boolean f22380X;

    /* renamed from: Y */
    private final C6998hx f22381Y;

    /* renamed from: a */
    private final C6967gt f22382a = null;

    /* renamed from: b */
    private final boolean f22383b;

    /* renamed from: c */
    private final C6995hu f22384c;

    /* renamed from: d */
    private final C7018iq f22385d;

    /* renamed from: e */
    private final C6971gx[] f22386e;

    /* renamed from: f */
    private final C6971gx[] f22387f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ConditionVariable f22388g;

    /* renamed from: h */
    private final C6992hr f22389h;

    /* renamed from: i */
    private final ArrayDeque f22390i;

    /* renamed from: j */
    private final boolean f22391j;

    /* renamed from: k */
    private final boolean f22392k;

    /* renamed from: l */
    private C7005id f22393l;

    /* renamed from: m */
    private final C7000hz f22394m;

    /* renamed from: n */
    private final C7000hz f22395n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C6986hl f22396o;

    /* renamed from: p */
    private C6997hw f22397p;

    /* renamed from: q */
    private C6997hw f22398q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public AudioTrack f22399r;

    /* renamed from: s */
    private C6966gs f22400s;

    /* renamed from: t */
    private C6999hy f22401t;

    /* renamed from: u */
    private C6999hy f22402u;

    /* renamed from: v */
    private C6888dv f22403v;

    /* renamed from: w */
    private ByteBuffer f22404w;

    /* renamed from: x */
    private int f22405x;

    /* renamed from: y */
    private long f22406y;

    /* renamed from: z */
    private long f22407z;

    public C7006ie(C6967gt gtVar, C6998hx hxVar) {
        this.f22381Y = hxVar;
        int i = aeu.f20466a;
        this.f22383b = false;
        this.f22391j = false;
        this.f22392k = false;
        this.f22388g = new ConditionVariable(true);
        this.f22389h = new C6992hr(new C7002ia(this));
        C6995hu huVar = new C6995hu();
        this.f22384c = huVar;
        C7018iq iqVar = new C7018iq();
        this.f22385d = iqVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C6994ht[]{new C7014im(), huVar, iqVar});
        Collections.addAll(arrayList, hxVar.mo15995a());
        this.f22386e = (C6971gx[]) arrayList.toArray(new C6971gx[0]);
        this.f22387f = new C6971gx[]{new C7008ig()};
        this.f22363G = 1.0f;
        this.f22400s = C6966gs.f22224a;
        this.f22375S = 0;
        this.f22376T = new C6993hs();
        this.f22402u = new C6999hy(C6888dv.f21944a, false, 0, 0);
        this.f22403v = C6888dv.f21944a;
        this.f22371O = -1;
        this.f22364H = new C6971gx[0];
        this.f22365I = new ByteBuffer[0];
        this.f22390i = new ArrayDeque();
        this.f22394m = new C7000hz();
        this.f22395n = new C7000hz();
    }

    /* renamed from: G */
    private final void m20675G() {
        int i = 0;
        while (true) {
            C6971gx[] gxVarArr = this.f22364H;
            if (i < gxVarArr.length) {
                C6971gx gxVar = gxVarArr[i];
                gxVar.mo15898g();
                this.f22365I[i] = gxVar.mo15896e();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: H */
    private final void m20676H(long j) {
        ByteBuffer byteBuffer;
        int length = this.f22364H.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f22365I[i - 1];
            } else {
                byteBuffer = this.f22366J;
                if (byteBuffer == null) {
                    byteBuffer = C6971gx.f22236a;
                }
            }
            if (i == length) {
                m20677I(byteBuffer, j);
            } else {
                C6971gx gxVar = this.f22364H[i];
                gxVar.mo15894c(byteBuffer);
                ByteBuffer e = gxVar.mo15896e();
                this.f22365I[i] = e;
                if (e.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r15 < r14) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012b  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20677I(java.nio.ByteBuffer r13, long r14) {
        /*
            r12 = this;
            boolean r0 = r13.hasRemaining()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.nio.ByteBuffer r0 = r12.f22368L
            r1 = 21
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r13) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19462o(r0)
            goto L_0x003b
        L_0x0018:
            r12.f22368L = r13
            int r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            if (r0 >= r1) goto L_0x003b
            int r0 = r13.remaining()
            byte[] r4 = r12.f22369M
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r12.f22369M = r4
        L_0x002d:
            int r4 = r13.position()
            byte[] r5 = r12.f22369M
            r13.get(r5, r3, r0)
            r13.position(r4)
            r12.f22370N = r3
        L_0x003b:
            int r0 = r13.remaining()
            int r4 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            if (r4 >= r1) goto L_0x006f
            com.google.ads.interactivemedia.v3.internal.hr r14 = r12.f22389h
            long r4 = r12.f22357A
            int r14 = r14.mo15974f(r4)
            if (r14 <= 0) goto L_0x006c
            int r14 = java.lang.Math.min(r0, r14)
            android.media.AudioTrack r15 = r12.f22399r
            byte[] r1 = r12.f22369M
            int r4 = r12.f22370N
            int r14 = r15.write(r1, r4, r14)
            if (r14 <= 0) goto L_0x00f5
            int r15 = r12.f22370N
            int r15 = r15 + r14
            r12.f22370N = r15
            int r15 = r13.position()
            int r15 = r15 + r14
            r13.position(r15)
            goto L_0x00f5
        L_0x006c:
            r14 = 0
            goto L_0x00f5
        L_0x006f:
            boolean r1 = r12.f22377U
            if (r1 == 0) goto L_0x00ef
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r1)
            android.media.AudioTrack r6 = r12.f22399r
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            r4 = 26
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r1 < r4) goto L_0x0096
            r9 = 1
            long r10 = r14 * r7
            r7 = r13
            r8 = r0
            int r14 = r6.write(r7, r8, r9, r10)
            goto L_0x00f5
        L_0x0096:
            java.nio.ByteBuffer r1 = r12.f22404w
            if (r1 != 0) goto L_0x00af
            r1 = 16
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r12.f22404w = r1
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.order(r4)
            java.nio.ByteBuffer r1 = r12.f22404w
            r4 = 1431633921(0x55550001, float:1.46372496E13)
            r1.putInt(r4)
        L_0x00af:
            int r1 = r12.f22405x
            if (r1 != 0) goto L_0x00c9
            java.nio.ByteBuffer r1 = r12.f22404w
            r4 = 4
            r1.putInt(r4, r0)
            java.nio.ByteBuffer r1 = r12.f22404w
            r4 = 8
            long r14 = r14 * r7
            r1.putLong(r4, r14)
            java.nio.ByteBuffer r14 = r12.f22404w
            r14.position(r3)
            r12.f22405x = r0
        L_0x00c9:
            java.nio.ByteBuffer r14 = r12.f22404w
            int r14 = r14.remaining()
            if (r14 <= 0) goto L_0x00e0
            java.nio.ByteBuffer r15 = r12.f22404w
            int r15 = r6.write(r15, r14, r2)
            if (r15 >= 0) goto L_0x00dd
            r12.f22405x = r3
            r14 = r15
            goto L_0x00f5
        L_0x00dd:
            if (r15 >= r14) goto L_0x00e0
            goto L_0x006c
        L_0x00e0:
            int r14 = m20690V(r6, r13, r0)
            if (r14 >= 0) goto L_0x00e9
            r12.f22405x = r3
            goto L_0x00f5
        L_0x00e9:
            int r15 = r12.f22405x
            int r15 = r15 - r14
            r12.f22405x = r15
            goto L_0x00f5
        L_0x00ef:
            android.media.AudioTrack r14 = r12.f22399r
            int r14 = m20690V(r14, r13, r0)
        L_0x00f5:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r12.f22378V = r4
            if (r14 >= 0) goto L_0x012b
            int r13 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            r15 = 24
            if (r13 < r15) goto L_0x0109
            r13 = -6
            if (r14 == r13) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r14 = -6
            goto L_0x010f
        L_0x0109:
            r13 = -32
            if (r14 != r13) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r2 = 0
        L_0x010f:
            if (r2 == 0) goto L_0x0114
            r12.m20678J()
        L_0x0114:
            com.google.ads.interactivemedia.v3.internal.hm r13 = new com.google.ads.interactivemedia.v3.internal.hm
            r13.<init>(r14, r2)
            com.google.ads.interactivemedia.v3.internal.hl r14 = r12.f22396o
            if (r14 == 0) goto L_0x0120
            r14.mo15930d(r13)
        L_0x0120:
            boolean r14 = r13.f22267a
            if (r14 != 0) goto L_0x012a
            com.google.ads.interactivemedia.v3.internal.hz r14 = r12.f22395n
            r14.mo16000a(r13)
            return
        L_0x012a:
            throw r13
        L_0x012b:
            com.google.ads.interactivemedia.v3.internal.hz r15 = r12.f22395n
            r15.mo16001b()
            android.media.AudioTrack r15 = r12.f22399r
            boolean r15 = m20689U(r15)
            if (r15 == 0) goto L_0x016b
            long r4 = r12.f22358B
            r6 = 0
            int r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x0142
            r12.f22380X = r3
        L_0x0142:
            boolean r15 = r12.f22374R
            if (r15 == 0) goto L_0x016b
            com.google.ads.interactivemedia.v3.internal.hl r15 = r12.f22396o
            if (r15 == 0) goto L_0x016b
            if (r14 >= r0) goto L_0x016b
            boolean r15 = r12.f22380X
            if (r15 != 0) goto L_0x016b
            com.google.ads.interactivemedia.v3.internal.hr r15 = r12.f22389h
            long r4 = r15.mo15975g(r4)
            com.google.ads.interactivemedia.v3.internal.hl r15 = r12.f22396o
            com.google.ads.interactivemedia.v3.internal.ii r15 = (com.google.ads.interactivemedia.p367v3.internal.C7010ii) r15
            com.google.ads.interactivemedia.v3.internal.ij r1 = r15.f22413a
            com.google.ads.interactivemedia.v3.internal.ec r1 = r1.f22424l
            if (r1 == 0) goto L_0x016b
            com.google.ads.interactivemedia.v3.internal.ij r15 = r15.f22413a
            com.google.ads.interactivemedia.v3.internal.ec r15 = r15.f22424l
            r15.mo15579a(r4)
        L_0x016b:
            com.google.ads.interactivemedia.v3.internal.hw r15 = r12.f22398q
            int r15 = r15.f22326c
            if (r15 != 0) goto L_0x0178
            long r4 = r12.f22357A
            long r6 = (long) r14
            long r4 = r4 + r6
            r12.f22357A = r4
            r15 = 0
        L_0x0178:
            if (r14 != r0) goto L_0x0194
            if (r15 == 0) goto L_0x0191
            java.nio.ByteBuffer r14 = r12.f22366J
            if (r13 != r14) goto L_0x0181
            goto L_0x0182
        L_0x0181:
            r2 = 0
        L_0x0182:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r2)
            long r13 = r12.f22358B
            int r15 = r12.f22359C
            int r0 = r12.f22367K
            int r15 = r15 * r0
            long r0 = (long) r15
            long r13 = r13 + r0
            r12.f22358B = r13
        L_0x0191:
            r13 = 0
            r12.f22368L = r13
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7006ie.m20677I(java.nio.ByteBuffer, long):void");
    }

    /* renamed from: J */
    private final void m20678J() {
        if (this.f22398q.mo15994d()) {
            this.f22379W = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m20679K() {
        /*
            r9 = this;
            int r0 = r9.f22371O
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L_0x000b
            r9.f22371O = r2
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.f22371O
            com.google.ads.interactivemedia.v3.internal.gx[] r5 = r9.f22364H
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo15895d()
        L_0x001f:
            r9.m20676H(r7)
            boolean r0 = r4.mo15897f()
            if (r0 != 0) goto L_0x0029
            return r2
        L_0x0029:
            int r0 = r9.f22371O
            int r0 = r0 + r1
            r9.f22371O = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f22368L
            if (r0 == 0) goto L_0x003b
            r9.m20677I(r0, r7)
            java.nio.ByteBuffer r0 = r9.f22368L
            if (r0 == 0) goto L_0x003b
            return r2
        L_0x003b:
            r9.f22371O = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7006ie.m20679K():boolean");
    }

    /* renamed from: L */
    private final void m20680L() {
        if (m20685Q()) {
            if (aeu.f20466a >= 21) {
                this.f22399r.setVolume(this.f22363G);
                return;
            }
            AudioTrack audioTrack = this.f22399r;
            float f = this.f22363G;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: M */
    private final void m20681M(C6888dv dvVar, boolean z) {
        C6999hy O = m20683O();
        if (!dvVar.equals(O.f22337a) || z != O.f22338b) {
            C6999hy hyVar = new C6999hy(dvVar, z, -9223372036854775807L, -9223372036854775807L);
            if (m20685Q()) {
                this.f22401t = hyVar;
            } else {
                this.f22402u = hyVar;
            }
        }
    }

    /* renamed from: N */
    private final C6888dv m20682N() {
        return m20683O().f22337a;
    }

    /* renamed from: O */
    private final C6999hy m20683O() {
        C6999hy hyVar = this.f22401t;
        if (hyVar != null) {
            return hyVar;
        }
        return !this.f22390i.isEmpty() ? (C6999hy) this.f22390i.getLast() : this.f22402u;
    }

    /* renamed from: P */
    private final void m20684P(long j) {
        C6888dv dvVar;
        boolean z;
        if (this.f22398q.f22332i) {
            dvVar = this.f22381Y.mo15996b(m20682N());
        } else {
            dvVar = C6888dv.f21944a;
        }
        C6888dv dvVar2 = dvVar;
        if (this.f22398q.f22332i) {
            C6998hx hxVar = this.f22381Y;
            boolean x = mo16012x();
            hxVar.mo15999e(x);
            z = x;
        } else {
            z = false;
        }
        this.f22390i.add(new C6999hy(dvVar2, z, Math.max(0, j), this.f22398q.mo15991a(m20687S())));
        C6971gx[] gxVarArr = this.f22398q.f22333j;
        ArrayList arrayList = new ArrayList();
        for (C6971gx gxVar : gxVarArr) {
            if (gxVar.mo15893b()) {
                arrayList.add(gxVar);
            } else {
                gxVar.mo15898g();
            }
        }
        int size = arrayList.size();
        this.f22364H = (C6971gx[]) arrayList.toArray(new C6971gx[size]);
        this.f22365I = new ByteBuffer[size];
        m20675G();
        C6986hl hlVar = this.f22396o;
        if (hlVar != null) {
            ((C7010ii) hlVar).f22413a.f22415c.mo15917h(z);
        }
    }

    /* renamed from: Q */
    private final boolean m20685Q() {
        return this.f22399r != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final long m20686R() {
        C6997hw hwVar = this.f22398q;
        return hwVar.f22326c == 0 ? this.f22406y / ((long) hwVar.f22325b) : this.f22407z;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public final long m20687S() {
        C6997hw hwVar = this.f22398q;
        return hwVar.f22326c == 0 ? this.f22357A / ((long) hwVar.f22327d) : this.f22358B;
    }

    /* renamed from: T */
    private static Pair m20688T(C6864cy cyVar, C6967gt gtVar) {
        return null;
    }

    /* renamed from: U */
    private static boolean m20689U(AudioTrack audioTrack) {
        return aeu.f20466a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: V */
    private static int m20690V(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* renamed from: W */
    private final void m20691W() {
        if (!this.f22373Q) {
            this.f22373Q = true;
            this.f22389h.mo15977i(m20687S());
            this.f22399r.stop();
            this.f22405x = 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static AudioFormat m20692X(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* renamed from: a */
    public final void mo15931a(C6986hl hlVar) {
        this.f22396o = hlVar;
    }

    /* renamed from: b */
    public final boolean mo15932b(C6864cy cyVar) {
        return mo15933c(cyVar) != 0;
    }

    /* renamed from: c */
    public final int mo15933c(C6864cy cyVar) {
        if (!"audio/raw".equals(cyVar.f21812l)) {
            return 0;
        }
        if (aeu.m18506X(cyVar.f21795A)) {
            return cyVar.f21795A != 2 ? 1 : 2;
        }
        int i = cyVar.f21795A;
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid PCM encoding: ");
        sb.append(i);
        Log.w("AudioTrack", sb.toString());
        return 0;
    }

    /* renamed from: d */
    public final long mo15934d(boolean z) {
        if (!m20685Q() || this.f22361E) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f22389h.mo15970b(z), this.f22398q.mo15991a(m20687S()));
        while (!this.f22390i.isEmpty() && min >= ((C6999hy) this.f22390i.getFirst()).f22340d) {
            this.f22402u = (C6999hy) this.f22390i.remove();
        }
        C6999hy hyVar = this.f22402u;
        long j = min - hyVar.f22340d;
        if (!hyVar.f22337a.equals(C6888dv.f21944a)) {
            if (this.f22390i.isEmpty()) {
                j = this.f22381Y.mo15997c(j);
            } else {
                j = aeu.m18497O(j, this.f22402u.f22337a.f21945b);
            }
        }
        return this.f22402u.f22339c + j + this.f22398q.mo15991a(this.f22381Y.mo15998d());
    }

    /* renamed from: e */
    public final void mo15935e() {
        this.f22374R = true;
        if (m20685Q()) {
            this.f22389h.mo15971c();
            this.f22399r.play();
        }
    }

    /* renamed from: f */
    public final void mo15936f() {
        this.f22360D = true;
    }

    /* renamed from: g */
    public final boolean mo15937g(ByteBuffer byteBuffer, long j, int i) {
        int i2;
        int i3;
        byte b;
        byte b2;
        int i4;
        byte b3;
        int i5;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        int i6 = i;
        ByteBuffer byteBuffer3 = this.f22366J;
        ary.m19462o(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.f22397p != null) {
            if (!m20679K()) {
                return false;
            }
            C6997hw hwVar = this.f22397p;
            C6997hw hwVar2 = this.f22398q;
            if (hwVar2.f22326c == hwVar.f22326c && hwVar2.f22330g == hwVar.f22330g && hwVar2.f22328e == hwVar.f22328e && hwVar2.f22329f == hwVar.f22329f && hwVar2.f22327d == hwVar.f22327d) {
                this.f22398q = hwVar;
                this.f22397p = null;
                if (m20689U(this.f22399r)) {
                    this.f22399r.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f22399r;
                    C6864cy cyVar = this.f22398q.f22324a;
                    audioTrack.setOffloadDelayPadding(cyVar.f21796B, cyVar.f21797C);
                    this.f22380X = true;
                }
            } else {
                m20691W();
                if (mo15940j()) {
                    return false;
                }
                mo15951u();
            }
            m20684P(j2);
        }
        if (!m20685Q()) {
            try {
                this.f22388g.block();
                C6997hw hwVar3 = this.f22398q;
                ary.m19467t(hwVar3);
                AudioTrack c = hwVar3.mo15993c(this.f22377U, this.f22400s, this.f22375S);
                this.f22399r = c;
                if (m20689U(c)) {
                    AudioTrack audioTrack2 = this.f22399r;
                    if (this.f22393l == null) {
                        this.f22393l = new C7005id(this);
                    }
                    this.f22393l.mo16010a(audioTrack2);
                    AudioTrack audioTrack3 = this.f22399r;
                    C6864cy cyVar2 = this.f22398q.f22324a;
                    audioTrack3.setOffloadDelayPadding(cyVar2.f21796B, cyVar2.f21797C);
                }
                int audioSessionId = this.f22399r.getAudioSessionId();
                if (this.f22375S != audioSessionId) {
                    this.f22375S = audioSessionId;
                    C6986hl hlVar = this.f22396o;
                    if (hlVar != null) {
                        ((C7010ii) hlVar).f22413a.f22415c.mo15916g(audioSessionId);
                    }
                }
                C6992hr hrVar = this.f22389h;
                AudioTrack audioTrack4 = this.f22399r;
                C6997hw hwVar4 = this.f22398q;
                hrVar.mo15969a(audioTrack4, hwVar4.f22326c == 2, hwVar4.f22330g, hwVar4.f22327d, hwVar4.f22331h);
                m20680L();
                int i7 = this.f22376T.f22311a;
                this.f22361E = true;
            } catch (C6985hk e) {
                m20678J();
                C6986hl hlVar2 = this.f22396o;
                if (hlVar2 != null) {
                    hlVar2.mo15930d(e);
                }
                throw e;
            } catch (C6985hk e2) {
                if (!e2.f22266a) {
                    this.f22394m.mo16000a(e2);
                    return false;
                }
                throw e2;
            }
        }
        this.f22394m.mo16001b();
        if (this.f22361E) {
            this.f22362F = Math.max(0, j2);
            this.f22360D = false;
            this.f22361E = false;
            m20684P(j2);
            if (this.f22374R) {
                mo15935e();
            }
        }
        if (!this.f22389h.mo15973e(m20687S())) {
            return false;
        }
        if (this.f22366J == null) {
            ary.m19462o(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C6997hw hwVar5 = this.f22398q;
            if (hwVar5.f22326c != 0 && this.f22359C == 0) {
                int i8 = hwVar5.f22330g;
                switch (i8) {
                    case 5:
                    case 6:
                    case 18:
                        i2 = C6963gp.m20519e(byteBuffer);
                        break;
                    case 7:
                    case 8:
                        int i9 = C7007if.f22408a;
                        int position = byteBuffer.position();
                        byte b4 = byteBuffer2.get(position);
                        if (b4 != -2) {
                            if (b4 == -1) {
                                i3 = (byteBuffer2.get(position + 4) & 7) << 4;
                                b3 = byteBuffer2.get(position + 7);
                            } else if (b4 != 31) {
                                i4 = (byteBuffer2.get(position + 4) & 1) << 6;
                                b2 = byteBuffer2.get(position + 5);
                            } else {
                                i3 = (byteBuffer2.get(position + 5) & 7) << 4;
                                b3 = byteBuffer2.get(position + 6);
                            }
                            b = b3 & 60;
                            i2 = (((b >> 2) | i3) + 1) * 32;
                            break;
                        } else {
                            i4 = (byteBuffer2.get(position + 5) & 1) << 6;
                            b2 = byteBuffer2.get(position + 4);
                        }
                        b = b2 & 252;
                        i2 = (((b >> 2) | i3) + 1) * 32;
                    case 9:
                        int b5 = C7013il.m20764b(aeu.m18512ac(byteBuffer2, byteBuffer.position()));
                        if (b5 != -1) {
                            i2 = b5;
                            break;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    case 10:
                    case 16:
                        i2 = 1024;
                        break;
                    case 11:
                    case 12:
                        i2 = 2048;
                        break;
                    case 14:
                        int i10 = C6963gp.f22211a;
                        int position2 = byteBuffer.position();
                        int limit = byteBuffer.limit() - 10;
                        int i11 = position2;
                        while (true) {
                            if (i11 > limit) {
                                i5 = -1;
                            } else if ((aeu.m18512ac(byteBuffer2, i11 + 4) & -2) == -126718022) {
                                i5 = i11 - position2;
                            } else {
                                i11++;
                            }
                        }
                        if (i5 != -1) {
                            i2 = (40 << ((byteBuffer2.get((byteBuffer.position() + i5) + ((byteBuffer2.get((byteBuffer.position() + i5) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            break;
                        } else {
                            i2 = 0;
                            break;
                        }
                    case 15:
                        i2 = 512;
                        break;
                    case 17:
                        int i12 = C6965gr.f22222a;
                        byte[] bArr = new byte[16];
                        int position3 = byteBuffer.position();
                        byteBuffer2.get(bArr);
                        byteBuffer2.position(position3);
                        i2 = C6965gr.m20521a(new aed(bArr)).f22221d;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unexpected audio encoding: ");
                        sb.append(i8);
                        throw new IllegalStateException(sb.toString());
                }
                this.f22359C = i2;
                if (i2 == 0) {
                    return true;
                }
            }
            if (this.f22401t != null) {
                if (!m20679K()) {
                    return false;
                }
                m20684P(j2);
                this.f22401t = null;
            }
            long R = this.f22362F + (((m20686R() - this.f22385d.mo16029q()) * 1000000) / ((long) this.f22398q.f22324a.f21826z));
            if (!this.f22360D && Math.abs(R - j2) > 200000) {
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("Discontinuity detected [expected ");
                sb2.append(R);
                sb2.append(", got ");
                sb2.append(j2);
                sb2.append("]");
                Log.e("AudioTrack", sb2.toString());
                this.f22360D = true;
            }
            if (this.f22360D) {
                if (!m20679K()) {
                    return false;
                }
                long j3 = j2 - R;
                this.f22362F += j3;
                this.f22360D = false;
                m20684P(j2);
                C6986hl hlVar3 = this.f22396o;
                if (!(hlVar3 == null || j3 == 0)) {
                    ((C7010ii) hlVar3).f22413a.mo16014W();
                }
            }
            if (this.f22398q.f22326c == 0) {
                this.f22406y += (long) byteBuffer.remaining();
            } else {
                this.f22407z += (long) (this.f22359C * i6);
            }
            this.f22366J = byteBuffer2;
            this.f22367K = i6;
        }
        m20676H(j2);
        if (!this.f22366J.hasRemaining()) {
            this.f22366J = null;
            this.f22367K = 0;
            return true;
        } else if (!this.f22389h.mo15976h(m20687S())) {
            return false;
        } else {
            Log.w("AudioTrack", "Resetting stalled audio track");
            mo15951u();
            return true;
        }
    }

    /* renamed from: h */
    public final void mo15938h() {
        if (!this.f22372P && m20685Q() && m20679K()) {
            m20691W();
            this.f22372P = true;
        }
    }

    /* renamed from: i */
    public final boolean mo15939i() {
        if (m20685Q()) {
            return this.f22372P && !mo15940j();
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo15940j() {
        return m20685Q() && this.f22389h.mo15978j(m20687S());
    }

    /* renamed from: k */
    public final void mo15941k(C6888dv dvVar) {
        m20681M(new C6888dv(aeu.m18492J(dvVar.f21945b, 0.1f, 8.0f), aeu.m18492J(dvVar.f21946c, 0.1f, 8.0f)), mo16012x());
    }

    /* renamed from: l */
    public final C6888dv mo15942l() {
        return m20682N();
    }

    /* renamed from: m */
    public final void mo15943m(boolean z) {
        m20681M(m20682N(), z);
    }

    /* renamed from: n */
    public final void mo15944n(C6966gs gsVar) {
        if (!this.f22400s.equals(gsVar)) {
            this.f22400s = gsVar;
            if (!this.f22377U) {
                mo15951u();
                this.f22375S = 0;
            }
        }
    }

    /* renamed from: o */
    public final void mo15945o(int i) {
        if (this.f22375S != i) {
            this.f22375S = i;
            mo15951u();
        }
    }

    /* renamed from: p */
    public final void mo15946p(C6993hs hsVar) {
        if (!this.f22376T.equals(hsVar)) {
            int i = hsVar.f22311a;
            float f = hsVar.f22312b;
            if (this.f22399r != null) {
                int i2 = this.f22376T.f22311a;
            }
            this.f22376T = hsVar;
        }
    }

    /* renamed from: q */
    public final void mo15947q(int i) {
        ary.m19464q(aeu.f20466a >= 21);
        if (!this.f22377U || this.f22375S != i) {
            this.f22377U = true;
            this.f22375S = i;
            mo15951u();
        }
    }

    /* renamed from: r */
    public final void mo15948r() {
        if (this.f22377U) {
            this.f22377U = false;
            this.f22375S = 0;
            mo15951u();
        }
    }

    /* renamed from: s */
    public final void mo15949s(float f) {
        if (this.f22363G != f) {
            this.f22363G = f;
            m20680L();
        }
    }

    /* renamed from: t */
    public final void mo15950t() {
        this.f22374R = false;
        if (m20685Q() && this.f22389h.mo15979k()) {
            this.f22399r.pause();
        }
    }

    /* renamed from: u */
    public final void mo15951u() {
        if (m20685Q()) {
            this.f22406y = 0;
            this.f22407z = 0;
            this.f22357A = 0;
            this.f22358B = 0;
            this.f22380X = false;
            this.f22359C = 0;
            this.f22402u = new C6999hy(m20682N(), mo16012x(), 0, 0);
            this.f22362F = 0;
            this.f22401t = null;
            this.f22390i.clear();
            this.f22366J = null;
            this.f22367K = 0;
            this.f22368L = null;
            this.f22373Q = false;
            this.f22372P = false;
            this.f22371O = -1;
            this.f22404w = null;
            this.f22405x = 0;
            this.f22385d.mo16028p();
            m20675G();
            if (this.f22389h.mo15972d()) {
                this.f22399r.pause();
            }
            if (m20689U(this.f22399r)) {
                C7005id idVar = this.f22393l;
                ary.m19467t(idVar);
                idVar.mo16011b(this.f22399r);
            }
            AudioTrack audioTrack = this.f22399r;
            this.f22399r = null;
            C6997hw hwVar = this.f22397p;
            if (hwVar != null) {
                this.f22398q = hwVar;
                this.f22397p = null;
            }
            this.f22389h.mo15980l();
            this.f22388g.close();
            new C6996hv(this, audioTrack).start();
        }
        this.f22395n.mo16001b();
        this.f22394m.mo16001b();
    }

    /* renamed from: v */
    public final void mo15952v() {
        mo15951u();
        for (C6971gx h : this.f22386e) {
            h.mo15899h();
        }
        C6971gx[] gxVarArr = this.f22387f;
        int length = gxVarArr.length;
        for (int i = 0; i <= 0; i++) {
            gxVarArr[i].mo15899h();
        }
        this.f22375S = 0;
        this.f22374R = false;
        this.f22379W = false;
    }

    /* renamed from: w */
    public final void mo15953w(C6864cy cyVar, int[] iArr) {
        if ("audio/raw".equals(cyVar.f21812l)) {
            ary.m19462o(aeu.m18506X(cyVar.f21795A));
            int aa = aeu.m18510aa(cyVar.f21795A, cyVar.f21825y);
            C6971gx[] gxVarArr = this.f22386e;
            this.f22385d.mo16027o(cyVar.f21796B, cyVar.f21797C);
            if (aeu.f20466a < 21 && cyVar.f21825y == 8 && iArr == null) {
                int[] iArr2 = new int[6];
                for (int i = 0; i < 6; i++) {
                    iArr2[i] = i;
                }
                iArr = iArr2;
            }
            this.f22384c.mo15989o(iArr);
            C6969gv gvVar = new C6969gv(cyVar.f21826z, cyVar.f21825y, cyVar.f21795A);
            int length = gxVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C6971gx gxVar = gxVarArr[i2];
                try {
                    C6969gv a = gxVar.mo15892a(gvVar);
                    if (true == gxVar.mo15893b()) {
                        gvVar = a;
                    }
                    i2++;
                } catch (C6970gw e) {
                    throw new C6984hj((Throwable) e);
                }
            }
            int i3 = gvVar.f22234d;
            int i4 = gvVar.f22232b;
            int i5 = gvVar.f22233c;
            int Z = aeu.m18508Z(i5);
            int aa2 = aeu.m18510aa(i3, i5);
            if (i3 == 0) {
                String valueOf = String.valueOf(cyVar);
                String.valueOf(valueOf).length();
                throw new C6984hj("Invalid output encoding (mode=0) for: ".concat(String.valueOf(valueOf)));
            } else if (Z != 0) {
                this.f22379W = false;
                C6997hw hwVar = new C6997hw(cyVar, aa, 0, aa2, i4, Z, i3, false, true, gxVarArr);
                if (m20685Q()) {
                    this.f22397p = hwVar;
                } else {
                    this.f22398q = hwVar;
                }
            } else {
                String valueOf2 = String.valueOf(cyVar);
                String.valueOf(valueOf2).length();
                throw new C6984hj("Invalid output channel config (mode=0) for: ".concat(String.valueOf(valueOf2)));
            }
        } else {
            int i6 = cyVar.f21826z;
            String valueOf3 = String.valueOf(cyVar);
            String.valueOf(valueOf3).length();
            throw new C6984hj("Unable to configure passthrough for: ".concat(String.valueOf(valueOf3)));
        }
    }

    /* renamed from: x */
    public final boolean mo16012x() {
        return m20683O().f22338b;
    }
}
