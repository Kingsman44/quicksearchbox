package androidx.media3.exoplayer.p138b;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2664h;
import androidx.media3.common.C2665i;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2619g;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.C2851bu;
import androidx.media3.exoplayer.p137a.C2731bt;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* renamed from: androidx.media3.exoplayer.b.am */
/* compiled from: PG */
public final class C2796am implements C2825u {

    /* renamed from: a */
    public static final Object f7723a = new Object();

    /* renamed from: b */
    public static ExecutorService f7724b;

    /* renamed from: c */
    public static int f7725c;

    /* renamed from: A */
    public ByteBuffer f7726A;

    /* renamed from: B */
    public int f7727B;

    /* renamed from: C */
    public boolean f7728C;

    /* renamed from: D */
    public boolean f7729D;

    /* renamed from: E */
    public int f7730E;

    /* renamed from: F */
    public C2665i f7731F;

    /* renamed from: G */
    public long f7732G;

    /* renamed from: H */
    public boolean f7733H;

    /* renamed from: I */
    public boolean f7734I;

    /* renamed from: J */
    public final C2789af f7735J;

    /* renamed from: K */
    public C2799ap f7736K;

    /* renamed from: L */
    private final C2809e[] f7737L;

    /* renamed from: M */
    private final C2791ah f7738M;

    /* renamed from: N */
    private long f7739N;

    /* renamed from: O */
    private long f7740O;

    /* renamed from: P */
    private C2809e[] f7741P;

    /* renamed from: Q */
    private ByteBuffer[] f7742Q;

    /* renamed from: R */
    private ByteBuffer f7743R;

    /* renamed from: S */
    private int f7744S;

    /* renamed from: T */
    private boolean f7745T;

    /* renamed from: d */
    public final C2806b f7746d;

    /* renamed from: e */
    public final C2830z f7747e;

    /* renamed from: f */
    public final C2805av f7748f;

    /* renamed from: g */
    public final C2809e[] f7749g;

    /* renamed from: h */
    public final C2619g f7750h;

    /* renamed from: i */
    public final C2828x f7751i = new C2828x(new C2792ai(this));

    /* renamed from: j */
    public final ArrayDeque f7752j;

    /* renamed from: k */
    public C2795al f7753k;

    /* renamed from: l */
    public final C2791ah f7754l;

    /* renamed from: m */
    public C2731bt f7755m;

    /* renamed from: n */
    public C2788ae f7756n;

    /* renamed from: o */
    public C2788ae f7757o;

    /* renamed from: p */
    public AudioTrack f7758p;

    /* renamed from: q */
    public C2664h f7759q;

    /* renamed from: r */
    public C2790ag f7760r;

    /* renamed from: s */
    public C2790ag f7761s;

    /* renamed from: t */
    public long f7762t;

    /* renamed from: u */
    public long f7763u;

    /* renamed from: v */
    public int f7764v;

    /* renamed from: w */
    public boolean f7765w;

    /* renamed from: x */
    public boolean f7766x;

    /* renamed from: y */
    public long f7767y;

    /* renamed from: z */
    public float f7768z;

    public C2796am(C2787ad adVar) {
        this.f7746d = adVar.f7696a;
        C2789af afVar = adVar.f7698c;
        this.f7735J = afVar;
        int i = C2612ak.f7249a;
        C2619g gVar = new C2619g((byte[]) null);
        this.f7750h = gVar;
        gVar.mo6192d();
        C2830z zVar = new C2830z();
        this.f7747e = zVar;
        C2805av avVar = new C2805av();
        this.f7748f = avVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C2829y[]{new C2801ar(), zVar, avVar});
        Collections.addAll(arrayList, afVar.f7708a);
        this.f7749g = (C2809e[]) arrayList.toArray(new C2809e[0]);
        this.f7737L = new C2809e[]{new C2798ao()};
        this.f7768z = 1.0f;
        this.f7759q = C2664h.f7421a;
        this.f7730E = 0;
        this.f7731F = new C2665i();
        this.f7761s = new C2790ag(C2640bb.f7312a, false, 0, 0);
        this.f7744S = -1;
        this.f7741P = new C2809e[0];
        this.f7742Q = new ByteBuffer[0];
        this.f7752j = new ArrayDeque();
        this.f7754l = new C2791ah();
        this.f7738M = new C2791ah();
    }

    /* renamed from: r */
    public static boolean m7657r(AudioTrack audioTrack) {
        int i = C2612ak.f7249a;
        return audioTrack.isOffloadedPlayback();
    }

    /* renamed from: s */
    private final void m7658s() {
        int i = 0;
        while (true) {
            C2809e[] eVarArr = this.f7741P;
            if (i < eVarArr.length) {
                C2809e eVar = eVarArr[i];
                eVar.mo6542c();
                this.f7742Q[i] = eVar.mo6541b();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    private final void m7659t(ByteBuffer byteBuffer, long j) {
        C2799ap apVar;
        C2851bu buVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f7743R;
            boolean z = false;
            if (byteBuffer2 != null) {
                C2601a.m6830b(byteBuffer2 == byteBuffer);
            } else {
                this.f7743R = byteBuffer;
                int i = C2612ak.f7249a;
            }
            int remaining = byteBuffer.remaining();
            int i2 = C2612ak.f7249a;
            int write = this.f7758p.write(byteBuffer, remaining, 1);
            this.f7732G = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((write == -6 || write == -32) && this.f7740O > 0) {
                    z = true;
                }
                C2824t tVar = new C2824t(write, this.f7757o.f7699a, z);
                C2799ap apVar2 = this.f7736K;
                if (apVar2 != null) {
                    apVar2.mo6502a(tVar);
                }
                if (!tVar.f7876b) {
                    this.f7738M.mo6479a(tVar);
                    return;
                }
                throw tVar;
            }
            this.f7738M.f7715a = null;
            if (m7657r(this.f7758p)) {
                if (this.f7740O > 0) {
                    this.f7734I = false;
                }
                if (this.f7729D && (apVar = this.f7736K) != null && write < remaining && !this.f7734I && (buVar = apVar.f7770a.f7773h) != null) {
                    buVar.f8016a.f8073d = true;
                }
            }
            int i3 = this.f7757o.f7701c;
            if (i3 == 0) {
                this.f7739N += (long) write;
            }
            if (write == remaining) {
                if (i3 != 0) {
                    if (byteBuffer == this.f7726A) {
                        z = true;
                    }
                    C2601a.m6832d(z);
                    this.f7740O += ((long) this.f7764v) * ((long) this.f7727B);
                }
                this.f7743R = null;
            }
        }
    }

    /* renamed from: u */
    private final boolean m7660u() {
        if (!"audio/raw".equals(this.f7757o.f7699a.f7496n)) {
            return false;
        }
        int i = this.f7757o.f7699a.f7479C;
        return true;
    }

    /* renamed from: a */
    public final int mo6483a(C2680x xVar) {
        if (!"audio/raw".equals(xVar.f7496n)) {
            if (!this.f7733H) {
                int i = C2612ak.f7249a;
            }
            return this.f7746d.mo6546a(xVar) != null ? 2 : 0;
        } else if (!C2612ak.m6956af(xVar.f7479C)) {
            int i2 = xVar.f7479C;
            C2633u.m7050e("DefaultAudioSink", "Invalid PCM encoding: " + i2);
            return 0;
        } else if (xVar.f7479C != 2) {
            return 1;
        } else {
            return 2;
        }
    }

    /* renamed from: b */
    public final void mo6484b() {
        if (mo6499q()) {
            this.f7762t = 0;
            this.f7763u = 0;
            this.f7739N = 0;
            this.f7740O = 0;
            this.f7734I = false;
            this.f7764v = 0;
            this.f7761s = new C2790ag(mo6492j().f7711a, mo6492j().f7712b, 0, 0);
            this.f7767y = 0;
            this.f7760r = null;
            this.f7752j.clear();
            this.f7726A = null;
            this.f7727B = 0;
            this.f7743R = null;
            this.f7745T = false;
            this.f7728C = false;
            this.f7744S = -1;
            this.f7748f.f7828f = 0;
            m7658s();
            AudioTrack audioTrack = this.f7751i.f7895b;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f7758p.pause();
            }
            if (m7657r(this.f7758p)) {
                C2795al alVar = this.f7753k;
                alVar.getClass();
                this.f7758p.unregisterStreamEventCallback(alVar.f7721b);
                alVar.f7720a.removeCallbacksAndMessages((Object) null);
            }
            int i = C2612ak.f7249a;
            C2788ae aeVar = this.f7756n;
            if (aeVar != null) {
                this.f7757o = aeVar;
                this.f7756n = null;
            }
            C2828x xVar = this.f7751i;
            xVar.mo6567c();
            xVar.f7895b = null;
            xVar.f7897d = null;
            AudioTrack audioTrack2 = this.f7758p;
            C2619g gVar = this.f7750h;
            gVar.mo6193e();
            synchronized (f7723a) {
                if (f7724b == null) {
                    f7724b = C2612ak.m6940W("ExoPlayer:AudioTrackReleaseThread");
                }
                f7725c++;
                f7724b.execute(new C2784aa(audioTrack2, gVar));
            }
            this.f7758p = null;
        }
        this.f7738M.f7715a = null;
        this.f7754l.f7715a = null;
    }

    /* renamed from: d */
    public final void mo6486d() {
        mo6484b();
        for (C2809e f : this.f7749g) {
            f.mo6544f();
        }
        C2809e[] eVarArr = this.f7737L;
        int length = eVarArr.length;
        for (int i = 0; i <= 0; i++) {
            eVarArr[i].mo6544f();
        }
        this.f7729D = false;
        this.f7733H = false;
    }

    /* renamed from: e */
    public final boolean mo6487e() {
        return mo6499q() && this.f7751i.mo6568d(mo6490h());
    }

    /* renamed from: f */
    public final boolean mo6488f(C2680x xVar) {
        return mo6483a(xVar) != 0;
    }

    /* renamed from: g */
    public final long mo6489g() {
        C2788ae aeVar = this.f7757o;
        return aeVar.f7701c == 0 ? this.f7762t / ((long) aeVar.f7700b) : this.f7763u;
    }

    /* renamed from: h */
    public final long mo6490h() {
        C2788ae aeVar = this.f7757o;
        return aeVar.f7701c == 0 ? this.f7739N / ((long) aeVar.f7702d) : this.f7740O;
    }

    /* renamed from: i */
    public final AudioTrack mo6491i(C2788ae aeVar) {
        try {
            return aeVar.mo6477b(false, this.f7759q, this.f7730E);
        } catch (C2822r e) {
            C2799ap apVar = this.f7736K;
            if (apVar != null) {
                apVar.mo6502a(e);
            }
            throw e;
        }
    }

    /* renamed from: j */
    public final C2790ag mo6492j() {
        C2790ag agVar = this.f7760r;
        if (agVar != null) {
            return agVar;
        }
        return !this.f7752j.isEmpty() ? (C2790ag) this.f7752j.getLast() : this.f7761s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0096, code lost:
        r12 = r12.f7770a.f7771f;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6493k(long r12) {
        /*
            r11 = this;
            boolean r0 = r11.m7660u()
            if (r0 == 0) goto L_0x002a
            androidx.media3.exoplayer.b.af r0 = r11.f7735J
            androidx.media3.exoplayer.b.ag r1 = r11.mo6492j()
            androidx.media3.common.bb r1 = r1.f7711a
            androidx.media3.exoplayer.b.au r0 = r0.f7710c
            float r2 = r1.f7313b
            float r3 = r0.f7811b
            r4 = 1
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x001d
            r0.f7811b = r2
            r0.f7815f = r4
        L_0x001d:
            float r2 = r1.f7314c
            float r3 = r0.f7812c
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x002c
            r0.f7812c = r2
            r0.f7815f = r4
            goto L_0x002c
        L_0x002a:
            androidx.media3.common.bb r1 = androidx.media3.common.C2640bb.f7312a
        L_0x002c:
            r3 = r1
            boolean r0 = r11.m7660u()
            r1 = 0
            if (r0 == 0) goto L_0x0042
            androidx.media3.exoplayer.b.af r0 = r11.f7735J
            androidx.media3.exoplayer.b.ag r2 = r11.mo6492j()
            boolean r2 = r2.f7712b
            androidx.media3.exoplayer.b.as r0 = r0.f7709b
            r0.f7780d = r2
            r0 = r2
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            java.util.ArrayDeque r9 = r11.f7752j
            androidx.media3.exoplayer.b.ag r10 = new androidx.media3.exoplayer.b.ag
            r4 = 0
            long r5 = java.lang.Math.max(r4, r12)
            androidx.media3.exoplayer.b.ae r12 = r11.f7757o
            long r7 = r11.mo6490h()
            long r7 = r12.mo6476a(r7)
            r2 = r10
            r4 = r0
            r2.<init>(r3, r4, r5, r7)
            r9.add(r10)
            androidx.media3.exoplayer.b.ae r12 = r11.f7757o
            androidx.media3.exoplayer.b.e[] r12 = r12.f7707i
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r2 = r12.length
        L_0x0069:
            if (r1 >= r2) goto L_0x007d
            r3 = r12[r1]
            boolean r4 = r3.mo6533g()
            if (r4 == 0) goto L_0x0077
            r13.add(r3)
            goto L_0x007a
        L_0x0077:
            r3.mo6542c()
        L_0x007a:
            int r1 = r1 + 1
            goto L_0x0069
        L_0x007d:
            int r12 = r13.size()
            androidx.media3.exoplayer.b.e[] r1 = new androidx.media3.exoplayer.p138b.C2809e[r12]
            java.lang.Object[] r13 = r13.toArray(r1)
            androidx.media3.exoplayer.b.e[] r13 = (androidx.media3.exoplayer.p138b.C2809e[]) r13
            r11.f7741P = r13
            java.nio.ByteBuffer[] r12 = new java.nio.ByteBuffer[r12]
            r11.f7742Q = r12
            r11.m7658s()
            androidx.media3.exoplayer.b.ap r12 = r11.f7736K
            if (r12 == 0) goto L_0x00a6
            androidx.media3.exoplayer.b.aq r12 = r12.f7770a
            androidx.media3.exoplayer.b.p r12 = r12.f7771f
            android.os.Handler r13 = r12.f7869a
            if (r13 == 0) goto L_0x00a6
            androidx.media3.exoplayer.b.j r1 = new androidx.media3.exoplayer.b.j
            r1.<init>(r12, r0)
            r13.post(r1)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p138b.C2796am.mo6493k(long):void");
    }

    /* renamed from: l */
    public final void mo6494l() {
        if (!this.f7745T) {
            this.f7745T = true;
            C2828x xVar = this.f7751i;
            long h = mo6490h();
            xVar.f7917x = xVar.mo6566b();
            xVar.f7915v = SystemClock.elapsedRealtime() * 1000;
            xVar.f7918y = h;
            this.f7758p.stop();
        }
    }

    /* renamed from: m */
    public final void mo6495m(long j) {
        ByteBuffer byteBuffer;
        int length = this.f7741P.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f7742Q[i - 1];
            } else {
                byteBuffer = this.f7726A;
                if (byteBuffer == null) {
                    byteBuffer = C2809e.f7843a;
                }
            }
            if (i == length) {
                m7659t(byteBuffer, j);
            } else {
                C2809e eVar = this.f7741P[i];
                if (i > this.f7744S) {
                    eVar.mo6500e(byteBuffer);
                }
                ByteBuffer b = eVar.mo6541b();
                this.f7742Q[i] = b;
                if (b.hasRemaining()) {
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

    /* renamed from: n */
    public final void mo6496n(C2640bb bbVar, boolean z) {
        C2790ag j = mo6492j();
        if (!bbVar.equals(j.f7711a) || z != j.f7712b) {
            C2790ag agVar = new C2790ag(bbVar, z, -9223372036854775807L, -9223372036854775807L);
            if (mo6499q()) {
                this.f7760r = agVar;
            } else {
                this.f7761s = agVar;
            }
        }
    }

    /* renamed from: o */
    public final void mo6497o() {
        if (mo6499q()) {
            int i = C2612ak.f7249a;
            this.f7758p.setVolume(this.f7768z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6498p() {
        /*
            r9 = this;
            int r0 = r9.f7744S
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L_0x000b
            r9.f7744S = r2
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.f7744S
            androidx.media3.exoplayer.b.e[] r5 = r9.f7741P
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo6543d()
        L_0x001f:
            r9.mo6495m(r7)
            boolean r0 = r4.mo6545h()
            if (r0 != 0) goto L_0x0029
            return r2
        L_0x0029:
            int r0 = r9.f7744S
            int r0 = r0 + r1
            r9.f7744S = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f7743R
            if (r0 == 0) goto L_0x003b
            r9.m7659t(r0, r7)
            java.nio.ByteBuffer r0 = r9.f7743R
            if (r0 == 0) goto L_0x003b
            return r2
        L_0x003b:
            r9.f7744S = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p138b.C2796am.mo6498p():boolean");
    }

    /* renamed from: q */
    public final boolean mo6499q() {
        return this.f7758p != null;
    }

    /* renamed from: c */
    public final void mo6485c() {
        this.f7729D = true;
        if (mo6499q()) {
            C2827w wVar = this.f7751i.f7897d;
            wVar.getClass();
            wVar.mo6564a(0);
            this.f7758p.play();
        }
    }
}
