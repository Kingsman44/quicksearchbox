package com.google.ads.interactivemedia.p367v3.internal;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qi */
/* compiled from: PG */
public abstract class C7226qi extends C6820bh {

    /* renamed from: b */
    private static final byte[] f23588b = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private C7225qh f23589A;

    /* renamed from: B */
    private C7224qg f23590B;

    /* renamed from: C */
    private int f23591C;

    /* renamed from: D */
    private boolean f23592D;

    /* renamed from: E */
    private boolean f23593E;

    /* renamed from: F */
    private boolean f23594F;

    /* renamed from: G */
    private boolean f23595G;

    /* renamed from: H */
    private boolean f23596H;

    /* renamed from: I */
    private boolean f23597I;

    /* renamed from: J */
    private boolean f23598J;

    /* renamed from: K */
    private boolean f23599K;

    /* renamed from: L */
    private boolean f23600L;

    /* renamed from: M */
    private boolean f23601M;

    /* renamed from: N */
    private C7221qd f23602N;

    /* renamed from: O */
    private ByteBuffer[] f23603O;

    /* renamed from: P */
    private ByteBuffer[] f23604P;

    /* renamed from: Q */
    private long f23605Q;

    /* renamed from: R */
    private int f23606R;

    /* renamed from: S */
    private int f23607S;

    /* renamed from: T */
    private ByteBuffer f23608T;

    /* renamed from: U */
    private boolean f23609U;

    /* renamed from: V */
    private boolean f23610V;

    /* renamed from: W */
    private boolean f23611W;

    /* renamed from: X */
    private boolean f23612X;

    /* renamed from: Y */
    private boolean f23613Y;

    /* renamed from: Z */
    private int f23614Z;

    /* renamed from: a */
    protected C7022iu f23615a;

    /* renamed from: aa */
    private int f23616aa;

    /* renamed from: ab */
    private int f23617ab;

    /* renamed from: ac */
    private boolean f23618ac;

    /* renamed from: ad */
    private boolean f23619ad;

    /* renamed from: ae */
    private boolean f23620ae;

    /* renamed from: af */
    private long f23621af;

    /* renamed from: ag */
    private long f23622ag;

    /* renamed from: ah */
    private boolean f23623ah;

    /* renamed from: ai */
    private boolean f23624ai;

    /* renamed from: aj */
    private boolean f23625aj;

    /* renamed from: ak */
    private boolean f23626ak;

    /* renamed from: al */
    private C6826bn f23627al;

    /* renamed from: am */
    private long f23628am = -9223372036854775807L;

    /* renamed from: an */
    private long f23629an = -9223372036854775807L;

    /* renamed from: ao */
    private int f23630ao;

    /* renamed from: ap */
    private C7037ji f23631ap;

    /* renamed from: aq */
    private C7037ji f23632aq;

    /* renamed from: c */
    private final C7228qk f23633c;

    /* renamed from: d */
    private final float f23634d;

    /* renamed from: e */
    private final C7024iw f23635e = new C7024iw(0);

    /* renamed from: f */
    private final C7024iw f23636f = new C7024iw(0);

    /* renamed from: g */
    private final C7220qc f23637g = new C7220qc();

    /* renamed from: h */
    private final aer f23638h = new aer();

    /* renamed from: i */
    private final ArrayList f23639i = new ArrayList();

    /* renamed from: j */
    private final MediaCodec.BufferInfo f23640j = new MediaCodec.BufferInfo();

    /* renamed from: k */
    private final long[] f23641k = new long[10];

    /* renamed from: l */
    private final long[] f23642l = new long[10];

    /* renamed from: m */
    private final long[] f23643m = new long[10];

    /* renamed from: n */
    private C6864cy f23644n;

    /* renamed from: o */
    private C6864cy f23645o;

    /* renamed from: p */
    private MediaCrypto f23646p;

    /* renamed from: q */
    private boolean f23647q;

    /* renamed from: r */
    private final long f23648r = -9223372036854775807L;

    /* renamed from: s */
    private float f23649s = 1.0f;

    /* renamed from: t */
    private MediaCodec f23650t;

    /* renamed from: u */
    private C7222qe f23651u;

    /* renamed from: v */
    private C6864cy f23652v;

    /* renamed from: w */
    private MediaFormat f23653w;

    /* renamed from: x */
    private boolean f23654x;

    /* renamed from: y */
    private float f23655y;

    /* renamed from: z */
    private ArrayDeque f23656z;

    public C7226qi(int i, C7228qk qkVar, float f) {
        super(i);
        ary.m19467t(qkVar);
        this.f23633c = qkVar;
        this.f23634d = f;
        mo16324as();
    }

    /* renamed from: W */
    private final void mo16014W() {
        this.f23612X = false;
        this.f23637g.mo16030a();
        this.f23611W = false;
    }

    /* renamed from: aA */
    protected static boolean m21572aA(C6864cy cyVar) {
        Class cls = cyVar.f21799E;
        return cls == null || C7038jj.class.equals(cls);
    }

    /* renamed from: aB */
    private final void mo14632aB() {
        if (aeu.f20466a < 21) {
            this.f23603O = null;
            this.f23604P = null;
        }
    }

    /* renamed from: aC */
    private final boolean m21574aC() {
        return this.f23607S >= 0;
    }

    /* renamed from: aD */
    private final void m21575aD() {
        this.f23606R = -1;
        this.f23635e.f22515b = null;
    }

    /* renamed from: aE */
    private final void m21576aE() {
        this.f23607S = -1;
        this.f23608T = null;
    }

    /* renamed from: aF */
    private final boolean m21577aF() {
        ByteBuffer byteBuffer;
        if (this.f23650t == null || this.f23616aa == 2 || this.f23623ah) {
            return false;
        }
        if (this.f23606R < 0) {
            int b = this.f23651u.mo16299b();
            this.f23606R = b;
            if (b < 0) {
                return false;
            }
            C7024iw iwVar = this.f23635e;
            if (aeu.f20466a >= 21) {
                byteBuffer = this.f23650t.getInputBuffer(b);
            } else {
                byteBuffer = this.f23603O[b];
            }
            iwVar.f22515b = byteBuffer;
            this.f23635e.mo16030a();
        }
        if (this.f23616aa == 1) {
            if (!this.f23601M) {
                this.f23619ad = true;
                this.f23651u.mo16305h(this.f23606R, 0, 0, 4);
                m21575aD();
            }
            this.f23616aa = 2;
            return false;
        } else if (this.f23599K) {
            this.f23599K = false;
            this.f23635e.f22515b.put(f23588b);
            this.f23651u.mo16305h(this.f23606R, 38, 0, 0);
            m21575aD();
            this.f23618ac = true;
            return true;
        } else {
            if (this.f23614Z == 1) {
                for (int i = 0; i < this.f23652v.f21814n.size(); i++) {
                    this.f23635e.f22515b.put((byte[]) this.f23652v.f21814n.get(i));
                }
                this.f23614Z = 2;
            }
            int position = this.f23635e.f22515b.position();
            C6865cz A = mo15500A();
            int F = mo15505F(A, this.f23635e, false);
            if (mo15518j()) {
                this.f23622ag = this.f23621af;
            }
            if (F == -3) {
                return false;
            }
            if (F == -5) {
                if (this.f23614Z == 2) {
                    this.f23635e.mo16030a();
                    this.f23614Z = 1;
                }
                mo14626U(A);
                return true;
            } else if (this.f23635e.mo16032c()) {
                if (this.f23614Z == 2) {
                    this.f23635e.mo16030a();
                    this.f23614Z = 1;
                }
                this.f23623ah = true;
                if (!this.f23618ac) {
                    m21581aJ();
                    return false;
                }
                try {
                    if (!this.f23601M) {
                        this.f23619ad = true;
                        this.f23651u.mo16305h(this.f23606R, 0, 0, 4);
                        m21575aD();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw mo15503D(e, this.f23644n);
                }
            } else if (this.f23618ac || this.f23635e.mo16033d()) {
                boolean k = this.f23635e.mo16044k();
                if (k) {
                    this.f23635e.f22514a.mo16040c(position);
                }
                if (this.f23593E && !k) {
                    ByteBuffer byteBuffer2 = this.f23635e.f22515b;
                    byte[] bArr = aec.f20417a;
                    int position2 = byteBuffer2.position();
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = i2 + 1;
                        if (i4 >= position2) {
                            byteBuffer2.clear();
                            break;
                        }
                        byte b2 = byteBuffer2.get(i2) & 255;
                        if (i3 == 3) {
                            if (b2 == 1) {
                                if ((byteBuffer2.get(i4) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer2.duplicate();
                                    duplicate.position(i2 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer2.position(0);
                                    byteBuffer2.put(duplicate);
                                    break;
                                }
                                b2 = 1;
                            }
                        } else if (b2 == 0) {
                            i3++;
                        }
                        if (b2 != 0) {
                            i3 = 0;
                        }
                        i2 = i4;
                    }
                    if (this.f23635e.f22515b.position() == 0) {
                        return true;
                    }
                    this.f23593E = false;
                }
                C7024iw iwVar2 = this.f23635e;
                long j = iwVar2.f22517d;
                C7221qd qdVar = this.f23602N;
                if (qdVar != null) {
                    j = qdVar.mo16297b(this.f23644n, iwVar2);
                }
                long j2 = j;
                if (this.f23635e.mo16031b()) {
                    this.f23639i.add(Long.valueOf(j2));
                }
                if (this.f23625aj) {
                    this.f23638h.mo14592a(j2, this.f23644n);
                    this.f23625aj = false;
                }
                if (this.f23602N != null) {
                    this.f23621af = Math.max(this.f23621af, this.f23635e.f22517d);
                } else {
                    this.f23621af = Math.max(this.f23621af, j2);
                }
                this.f23635e.mo16045l();
                if (this.f23635e.mo16034e()) {
                    mo14644au(this.f23635e);
                }
                mo14629X(this.f23635e);
                if (k) {
                    try {
                        this.f23651u.mo16306i(this.f23606R, this.f23635e.f22514a, j2);
                    } catch (MediaCodec.CryptoException e2) {
                        throw mo15503D(e2, this.f23644n);
                    }
                } else {
                    this.f23651u.mo16305h(this.f23606R, this.f23635e.f22515b.limit(), j2, 0);
                }
                m21575aD();
                this.f23618ac = true;
                this.f23614Z = 0;
                this.f23615a.f22505c++;
                return true;
            } else {
                this.f23635e.mo16030a();
                if (this.f23614Z == 2) {
                    this.f23614Z = 1;
                }
                return true;
            }
        }
    }

    /* renamed from: aG */
    private final void m21578aG() {
        if (aeu.f20466a >= 23) {
            float ae = mo14639ae(this.f23649s, mo15501B());
            float f = this.f23655y;
            if (f != ae) {
                if (ae == -1.0f) {
                    m21580aI();
                } else if (f != -1.0f || ae > this.f23634d) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", ae);
                    this.f23650t.setParameters(bundle);
                    this.f23655y = ae;
                }
            }
        }
    }

    /* renamed from: aH */
    private final void m21579aH() {
        if (aeu.f20466a < 23) {
            m21580aI();
        } else if (this.f23618ac) {
            this.f23616aa = 1;
            this.f23617ab = 2;
        } else {
            m21583aL();
        }
    }

    /* renamed from: aI */
    private final void m21580aI() {
        if (this.f23618ac) {
            this.f23616aa = 1;
            this.f23617ab = 3;
            return;
        }
        m21582aK();
    }

    /* renamed from: aK */
    private final void m21582aK() {
        mo16321ao();
        mo16314af();
    }

    /* renamed from: aL */
    private final void m21583aL() {
        m21582aK();
    }

    /* renamed from: aM */
    private final void m21584aM(C7037ji jiVar) {
        this.f23632aq = jiVar;
    }

    /* renamed from: aN */
    private final void m21585aN(C7037ji jiVar) {
        this.f23631ap = jiVar;
    }

    /* renamed from: aO */
    private final boolean m21586aO(C7037ji jiVar, C6864cy cyVar) {
        return true;
    }

    /* renamed from: aP */
    private final C7038jj m21587aP(C7037ji jiVar) {
        return null;
    }

    /* renamed from: ab */
    private final boolean m21588ab(boolean z) {
        C6865cz A = mo15500A();
        this.f23636f.mo16030a();
        int F = mo15505F(A, this.f23636f, z);
        if (F == -5) {
            mo14626U(A);
            return true;
        } else if (F != -4 || !this.f23636f.mo16032c()) {
            return false;
        } else {
            this.f23623ah = true;
            m21581aJ();
            return false;
        }
    }

    /* renamed from: ac */
    private final boolean mo14637ac(long j) {
        return true;
    }

    /* renamed from: I */
    public void mo14619I(float f) {
        this.f23649s = f;
        if (this.f23650t != null && this.f23617ab != 3 && mo15516e() != 0) {
            m21578aG();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo15508J(long j, long j2) {
        boolean z = true;
        if (this.f23629an == -9223372036854775807L) {
            if (this.f23628am != -9223372036854775807L) {
                z = false;
            }
            ary.m19464q(z);
            this.f23628am = j;
            this.f23629an = j2;
            return;
        }
        int i = this.f23630ao;
        if (i == 10) {
            long j3 = this.f23642l[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.f23630ao = i + 1;
        }
        long[] jArr = this.f23641k;
        int i2 = this.f23630ao - 1;
        jArr[i2] = j;
        this.f23642l[i2] = j2;
        this.f23643m[i2] = this.f23621af;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:91|92|(1:94)(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:156|157|158|159|160|(1:162)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b9, code lost:
        if (r0 == 2) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        m21581aJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x028a, code lost:
        r15 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x028c, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r0 = r15.f23624ai;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x028e, code lost:
        if (r0 != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0290, code lost:
        mo16321ao();
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e5, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0151, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        m21581aJ();
        r0 = r15.f23624ai;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0156, code lost:
        if (r0 != false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0158, code lost:
        mo16321ao();
        r15 = r15;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x0287 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0151 */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0124 A[EDGE_INSN: B:208:0x0124->B:78:0x0124 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c4 A[Catch:{ IllegalStateException -> 0x030c }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e4 A[Catch:{ IllegalStateException -> 0x030c }, EDGE_INSN: B:215:0x00e4->B:62:0x00e4 ?: BREAK  
    EDGE_INSN: B:216:0x00e4->B:62:0x00e4 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f0 A[Catch:{ IllegalStateException -> 0x030c }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fe A[Catch:{ IllegalStateException -> 0x030c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0101 A[Catch:{ IllegalStateException -> 0x030c }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010a A[Catch:{ IllegalStateException -> 0x030c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0112 A[Catch:{ IllegalStateException -> 0x030c }] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15782L(long r23, long r25) {
        /*
            r22 = this;
            r15 = r22
            boolean r0 = r15.f23626ak
            r14 = 0
            if (r0 == 0) goto L_0x000c
            r15.f23626ak = r14
            r22.m21581aJ()
        L_0x000c:
            com.google.ads.interactivemedia.v3.internal.bn r0 = r15.f23627al
            r13 = 0
            if (r0 != 0) goto L_0x033c
            r11 = 21
            boolean r0 = r15.f23624ai     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 == 0) goto L_0x001b
            r22.mo16015aa()     // Catch:{ IllegalStateException -> 0x030c }
            return
        L_0x001b:
            com.google.ads.interactivemedia.v3.internal.cy r0 = r15.f23644n     // Catch:{ IllegalStateException -> 0x030c }
            r12 = 1
            if (r0 != 0) goto L_0x0028
            boolean r0 = r15.m21588ab(r12)     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            r22.mo16314af()     // Catch:{ IllegalStateException -> 0x030c }
            boolean r0 = r15.f23611W     // Catch:{ IllegalStateException -> 0x030c }
            r10 = -3
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = "bypassRender"
            com.google.ads.interactivemedia.p367v3.internal.atv.m19619k(r0)     // Catch:{ IllegalStateException -> 0x030c }
        L_0x0035:
            com.google.ads.interactivemedia.v3.internal.qc r0 = r15.f23637g     // Catch:{ IllegalStateException -> 0x030c }
            boolean r1 = r15.f23624ai     // Catch:{ IllegalStateException -> 0x030c }
            r1 = r1 ^ r12
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r1)     // Catch:{ IllegalStateException -> 0x030c }
            boolean r1 = r0.mo16293s()     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 != 0) goto L_0x007e
            r6 = 0
            java.nio.ByteBuffer r7 = r0.f22515b     // Catch:{ IllegalStateException -> 0x030c }
            int r8 = r15.f23607S     // Catch:{ IllegalStateException -> 0x030c }
            r9 = 0
            int r16 = r0.mo16292r()     // Catch:{ IllegalStateException -> 0x030c }
            long r17 = r0.mo16291q()     // Catch:{ IllegalStateException -> 0x030c }
            boolean r19 = r0.mo16031b()     // Catch:{ IllegalStateException -> 0x030c }
            boolean r20 = r0.mo16032c()     // Catch:{ IllegalStateException -> 0x030c }
            com.google.ads.interactivemedia.v3.internal.cy r4 = r15.f23645o     // Catch:{ IllegalStateException -> 0x030c }
            r1 = r22
            r2 = r23
            r21 = r4
            r4 = r25
            r10 = r16
            r11 = r17
            r13 = r19
            r14 = r20
            r15 = r21
            boolean r1 = r1.mo14631Z(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0295 }
            if (r1 == 0) goto L_0x007b
            long r1 = r0.f22517d     // Catch:{ IllegalStateException -> 0x0295 }
            r15 = r22
            r15.mo14645av(r1)     // Catch:{ IllegalStateException -> 0x030c }
            goto L_0x007e
        L_0x007b:
            r15 = r22
            goto L_0x0087
        L_0x007e:
            boolean r1 = r0.mo16032c()     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 == 0) goto L_0x008a
            r14 = 1
            r15.f23624ai = r14     // Catch:{ IllegalStateException -> 0x030c }
        L_0x0087:
            r13 = 0
            goto L_0x0124
        L_0x008a:
            r14 = 1
            r0.mo16289o()     // Catch:{ IllegalStateException -> 0x030c }
            boolean r1 = r15.f23612X     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 == 0) goto L_0x00ad
            boolean r1 = r0.mo16293s()     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 == 0) goto L_0x00a6
            r22.mo16014W()     // Catch:{ IllegalStateException -> 0x030c }
            r13 = 0
            r15.f23612X = r13     // Catch:{ IllegalStateException -> 0x030c }
            r22.mo16314af()     // Catch:{ IllegalStateException -> 0x030c }
            boolean r1 = r15.f23611W     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 == 0) goto L_0x0124
            goto L_0x00ae
        L_0x00a6:
            r10 = -3
            r11 = 21
            r12 = 1
            r13 = 0
        L_0x00ab:
            r14 = 0
            goto L_0x0035
        L_0x00ad:
            r13 = 0
        L_0x00ae:
            boolean r1 = r15.f23623ah     // Catch:{ IllegalStateException -> 0x030c }
            r1 = r1 ^ r14
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r1)     // Catch:{ IllegalStateException -> 0x030c }
            com.google.ads.interactivemedia.v3.internal.cz r1 = r22.mo15500A()     // Catch:{ IllegalStateException -> 0x030c }
        L_0x00b8:
            boolean r2 = r0.mo16294t()     // Catch:{ IllegalStateException -> 0x030c }
            if (r2 != 0) goto L_0x00e4
            boolean r2 = r0.mo16032c()     // Catch:{ IllegalStateException -> 0x030c }
            if (r2 != 0) goto L_0x00e4
            com.google.ads.interactivemedia.v3.internal.iw r2 = r0.mo16290p()     // Catch:{ IllegalStateException -> 0x030c }
            int r2 = r15.mo15505F(r1, r2, r13)     // Catch:{ IllegalStateException -> 0x030c }
            r3 = -5
            if (r2 == r3) goto L_0x00e1
            r3 = -4
            if (r2 == r3) goto L_0x00dc
            r11 = -3
            if (r2 != r11) goto L_0x00d6
            goto L_0x00e5
        L_0x00d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x030c }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x030c }
            throw r0     // Catch:{ IllegalStateException -> 0x030c }
        L_0x00dc:
            r11 = -3
            r0.mo16295u()     // Catch:{ IllegalStateException -> 0x030c }
            goto L_0x00b8
        L_0x00e1:
            r11 = -3
            r2 = 1
            goto L_0x00e6
        L_0x00e4:
            r11 = -3
        L_0x00e5:
            r2 = 0
        L_0x00e6:
            boolean r3 = r0.mo16293s()     // Catch:{ IllegalStateException -> 0x030c }
            if (r3 != 0) goto L_0x00fe
            boolean r3 = r15.f23625aj     // Catch:{ IllegalStateException -> 0x030c }
            if (r3 == 0) goto L_0x00fe
            com.google.ads.interactivemedia.v3.internal.cy r3 = r15.f23644n     // Catch:{ IllegalStateException -> 0x030c }
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r3)     // Catch:{ IllegalStateException -> 0x030c }
            r15.f23645o = r3     // Catch:{ IllegalStateException -> 0x030c }
            r4 = 0
            r15.mo14627V(r3, r4)     // Catch:{ IllegalStateException -> 0x030c }
            r15.f23625aj = r13     // Catch:{ IllegalStateException -> 0x030c }
            goto L_0x00ff
        L_0x00fe:
            r4 = 0
        L_0x00ff:
            if (r2 == 0) goto L_0x0104
            r15.mo14626U(r1)     // Catch:{ IllegalStateException -> 0x030c }
        L_0x0104:
            boolean r1 = r0.mo16032c()     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 == 0) goto L_0x010c
            r15.f23623ah = r14     // Catch:{ IllegalStateException -> 0x030c }
        L_0x010c:
            boolean r1 = r0.mo16293s()     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 != 0) goto L_0x0124
            r0.mo16045l()     // Catch:{ IllegalStateException -> 0x030c }
            java.nio.ByteBuffer r0 = r0.f22515b     // Catch:{ IllegalStateException -> 0x030c }
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()     // Catch:{ IllegalStateException -> 0x030c }
            r0.order(r1)     // Catch:{ IllegalStateException -> 0x030c }
            r13 = r4
            r10 = -3
            r11 = 21
            r12 = 1
            goto L_0x00ab
        L_0x0124:
            com.google.ads.interactivemedia.p367v3.internal.atv.m19620l()     // Catch:{ IllegalStateException -> 0x030c }
            r1 = r15
        L_0x0128:
            r2 = 0
            goto L_0x0302
        L_0x012b:
            r11 = -3
            r13 = 0
            r14 = 1
            android.media.MediaCodec r0 = r15.f23650t     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 == 0) goto L_0x02f2
            android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x030c }
            java.lang.String r0 = "drainAndFeed"
            com.google.ads.interactivemedia.p367v3.internal.atv.m19619k(r0)     // Catch:{ IllegalStateException -> 0x030c }
        L_0x013a:
            boolean r0 = r22.m21574aC()     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 != 0) goto L_0x024d
            boolean r0 = r15.f23597I     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 == 0) goto L_0x015d
            boolean r0 = r15.f23619ad     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 == 0) goto L_0x015d
            com.google.ads.interactivemedia.v3.internal.qe r0 = r15.f23651u     // Catch:{ IllegalStateException -> 0x0151 }
            android.media.MediaCodec$BufferInfo r1 = r15.f23640j     // Catch:{ IllegalStateException -> 0x0151 }
            int r0 = r0.mo16300c(r1)     // Catch:{ IllegalStateException -> 0x0151 }
            goto L_0x0165
        L_0x0151:
            r22.m21581aJ()     // Catch:{ IllegalStateException -> 0x030c }
            boolean r0 = r15.f23624ai     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 == 0) goto L_0x0293
            r22.mo16321ao()     // Catch:{ IllegalStateException -> 0x030c }
            goto L_0x0293
        L_0x015d:
            com.google.ads.interactivemedia.v3.internal.qe r0 = r15.f23651u     // Catch:{ IllegalStateException -> 0x030c }
            android.media.MediaCodec$BufferInfo r1 = r15.f23640j     // Catch:{ IllegalStateException -> 0x030c }
            int r0 = r0.mo16300c(r1)     // Catch:{ IllegalStateException -> 0x030c }
        L_0x0165:
            if (r0 >= 0) goto L_0x01c0
            r1 = -2
            if (r0 != r1) goto L_0x0199
            r15.f23620ae = r14     // Catch:{ IllegalStateException -> 0x030c }
            com.google.ads.interactivemedia.v3.internal.qe r0 = r15.f23651u     // Catch:{ IllegalStateException -> 0x030c }
            android.media.MediaFormat r0 = r0.mo16301d()     // Catch:{ IllegalStateException -> 0x030c }
            int r1 = r15.f23591C     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 == 0) goto L_0x018b
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x030c }
            r2 = 32
            if (r1 != r2) goto L_0x018b
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 != r2) goto L_0x018b
            r15.f23600L = r14     // Catch:{ IllegalStateException -> 0x030c }
            goto L_0x013a
        L_0x018b:
            boolean r1 = r15.f23598J     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 == 0) goto L_0x0194
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r14)     // Catch:{ IllegalStateException -> 0x030c }
        L_0x0194:
            r15.f23653w = r0     // Catch:{ IllegalStateException -> 0x030c }
            r15.f23654x = r14     // Catch:{ IllegalStateException -> 0x030c }
            goto L_0x013a
        L_0x0199:
            if (r0 != r11) goto L_0x01aa
            int r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ IllegalStateException -> 0x030c }
            r12 = 21
            if (r0 >= r12) goto L_0x013a
            android.media.MediaCodec r0 = r15.f23650t     // Catch:{ IllegalStateException -> 0x030c }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ IllegalStateException -> 0x030c }
            r15.f23604P = r0     // Catch:{ IllegalStateException -> 0x030c }
            goto L_0x013a
        L_0x01aa:
            r12 = 21
            boolean r0 = r15.f23601M     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 != 0) goto L_0x01b2
            goto L_0x0293
        L_0x01b2:
            boolean r0 = r15.f23623ah     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 != 0) goto L_0x01bb
            int r0 = r15.f23616aa     // Catch:{ IllegalStateException -> 0x030c }
            r1 = 2
            if (r0 != r1) goto L_0x0293
        L_0x01bb:
            r22.m21581aJ()     // Catch:{ IllegalStateException -> 0x030c }
            goto L_0x0293
        L_0x01c0:
            r12 = 21
            boolean r1 = r15.f23600L     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 == 0) goto L_0x01cf
            r15.f23600L = r13     // Catch:{ IllegalStateException -> 0x030c }
            android.media.MediaCodec r1 = r15.f23650t     // Catch:{ IllegalStateException -> 0x030c }
            r1.releaseOutputBuffer(r0, r13)     // Catch:{ IllegalStateException -> 0x030c }
            goto L_0x013a
        L_0x01cf:
            android.media.MediaCodec$BufferInfo r1 = r15.f23640j     // Catch:{ IllegalStateException -> 0x030c }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 != 0) goto L_0x01e2
            android.media.MediaCodec$BufferInfo r1 = r15.f23640j     // Catch:{ IllegalStateException -> 0x030c }
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x030c }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x01e2
            r22.m21581aJ()     // Catch:{ IllegalStateException -> 0x030c }
            goto L_0x0293
        L_0x01e2:
            r15.f23607S = r0     // Catch:{ IllegalStateException -> 0x030c }
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ IllegalStateException -> 0x030c }
            if (r1 < r12) goto L_0x01ef
            android.media.MediaCodec r1 = r15.f23650t     // Catch:{ IllegalStateException -> 0x030c }
            java.nio.ByteBuffer r0 = r1.getOutputBuffer(r0)     // Catch:{ IllegalStateException -> 0x030c }
            goto L_0x01f3
        L_0x01ef:
            java.nio.ByteBuffer[] r1 = r15.f23604P     // Catch:{ IllegalStateException -> 0x030c }
            r0 = r1[r0]     // Catch:{ IllegalStateException -> 0x030c }
        L_0x01f3:
            r15.f23608T = r0     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 == 0) goto L_0x020c
            android.media.MediaCodec$BufferInfo r1 = r15.f23640j     // Catch:{ IllegalStateException -> 0x030c }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x030c }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x030c }
            java.nio.ByteBuffer r0 = r15.f23608T     // Catch:{ IllegalStateException -> 0x030c }
            android.media.MediaCodec$BufferInfo r1 = r15.f23640j     // Catch:{ IllegalStateException -> 0x030c }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x030c }
            android.media.MediaCodec$BufferInfo r2 = r15.f23640j     // Catch:{ IllegalStateException -> 0x030c }
            int r2 = r2.size     // Catch:{ IllegalStateException -> 0x030c }
            int r1 = r1 + r2
            r0.limit(r1)     // Catch:{ IllegalStateException -> 0x030c }
        L_0x020c:
            android.media.MediaCodec$BufferInfo r0 = r15.f23640j     // Catch:{ IllegalStateException -> 0x030c }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x030c }
            java.util.ArrayList r2 = r15.f23639i     // Catch:{ IllegalStateException -> 0x030c }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x030c }
            r3 = 0
        L_0x0217:
            if (r3 >= r2) goto L_0x0233
            java.util.ArrayList r4 = r15.f23639i     // Catch:{ IllegalStateException -> 0x030c }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x030c }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x030c }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x030c }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0230
            java.util.ArrayList r0 = r15.f23639i     // Catch:{ IllegalStateException -> 0x030c }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x030c }
            r0 = 1
            goto L_0x0234
        L_0x0230:
            int r3 = r3 + 1
            goto L_0x0217
        L_0x0233:
            r0 = 0
        L_0x0234:
            r15.f23609U = r0     // Catch:{ IllegalStateException -> 0x030c }
            long r0 = r15.f23622ag     // Catch:{ IllegalStateException -> 0x030c }
            android.media.MediaCodec$BufferInfo r2 = r15.f23640j     // Catch:{ IllegalStateException -> 0x030c }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x030c }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0242
            r0 = 1
            goto L_0x0243
        L_0x0242:
            r0 = 0
        L_0x0243:
            r15.f23610V = r0     // Catch:{ IllegalStateException -> 0x030c }
            android.media.MediaCodec$BufferInfo r0 = r15.f23640j     // Catch:{ IllegalStateException -> 0x030c }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x030c }
            r15.mo16316aj(r0)     // Catch:{ IllegalStateException -> 0x030c }
            goto L_0x024f
        L_0x024d:
            r12 = 21
        L_0x024f:
            boolean r0 = r15.f23597I     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 == 0) goto L_0x029b
            boolean r0 = r15.f23619ad     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 == 0) goto L_0x029b
            android.media.MediaCodec r6 = r15.f23650t     // Catch:{ IllegalStateException -> 0x0287 }
            java.nio.ByteBuffer r7 = r15.f23608T     // Catch:{ IllegalStateException -> 0x0287 }
            int r8 = r15.f23607S     // Catch:{ IllegalStateException -> 0x0287 }
            android.media.MediaCodec$BufferInfo r0 = r15.f23640j     // Catch:{ IllegalStateException -> 0x0287 }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x0287 }
            r10 = 1
            android.media.MediaCodec$BufferInfo r0 = r15.f23640j     // Catch:{ IllegalStateException -> 0x0287 }
            long r4 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0287 }
            boolean r0 = r15.f23609U     // Catch:{ IllegalStateException -> 0x0287 }
            boolean r2 = r15.f23610V     // Catch:{ IllegalStateException -> 0x0287 }
            com.google.ads.interactivemedia.v3.internal.cy r3 = r15.f23645o     // Catch:{ IllegalStateException -> 0x0287 }
            r1 = r22
            r16 = r2
            r17 = r3
            r2 = r23
            r18 = r4
            r4 = r25
            r20 = -3
            r11 = r18
            r13 = r0
            r0 = 1
            r14 = r16
            r15 = r17
            boolean r1 = r1.mo14631Z(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0287 }
            goto L_0x02c1
        L_0x0287:
            r22.m21581aJ()     // Catch:{ IllegalStateException -> 0x0295 }
            r15 = r22
            boolean r0 = r15.f23624ai     // Catch:{ IllegalStateException -> 0x030c }
            if (r0 == 0) goto L_0x0293
            r22.mo16321ao()     // Catch:{ IllegalStateException -> 0x030c }
        L_0x0293:
            r1 = r15
            goto L_0x02e3
        L_0x0295:
            r0 = move-exception
            r2 = 0
            r1 = r22
            goto L_0x030f
        L_0x029b:
            r0 = 1
            r20 = -3
            android.media.MediaCodec r6 = r15.f23650t     // Catch:{ IllegalStateException -> 0x030c }
            java.nio.ByteBuffer r7 = r15.f23608T     // Catch:{ IllegalStateException -> 0x030c }
            int r8 = r15.f23607S     // Catch:{ IllegalStateException -> 0x030c }
            android.media.MediaCodec$BufferInfo r1 = r15.f23640j     // Catch:{ IllegalStateException -> 0x030c }
            int r9 = r1.flags     // Catch:{ IllegalStateException -> 0x030c }
            r10 = 1
            android.media.MediaCodec$BufferInfo r1 = r15.f23640j     // Catch:{ IllegalStateException -> 0x030c }
            long r11 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x030c }
            boolean r13 = r15.f23609U     // Catch:{ IllegalStateException -> 0x030c }
            boolean r14 = r15.f23610V     // Catch:{ IllegalStateException -> 0x030c }
            com.google.ads.interactivemedia.v3.internal.cy r4 = r15.f23645o     // Catch:{ IllegalStateException -> 0x030c }
            r1 = r22
            r2 = r23
            r16 = r4
            r4 = r25
            r15 = r16
            boolean r1 = r1.mo14631Z(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02ee }
        L_0x02c1:
            if (r1 == 0) goto L_0x02e1
            r1 = r22
            android.media.MediaCodec$BufferInfo r2 = r1.f23640j     // Catch:{ IllegalStateException -> 0x030a }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x030a }
            r1.mo14645av(r2)     // Catch:{ IllegalStateException -> 0x030a }
            android.media.MediaCodec$BufferInfo r2 = r1.f23640j     // Catch:{ IllegalStateException -> 0x030a }
            int r2 = r2.flags     // Catch:{ IllegalStateException -> 0x030a }
            r22.m21576aE()     // Catch:{ IllegalStateException -> 0x030a }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x02db
            r22.m21581aJ()     // Catch:{ IllegalStateException -> 0x030a }
            goto L_0x02e3
        L_0x02db:
            r15 = r1
            r11 = -3
            r13 = 0
            r14 = 1
            goto L_0x013a
        L_0x02e1:
            r1 = r22
        L_0x02e3:
            boolean r0 = r22.m21577aF()     // Catch:{ IllegalStateException -> 0x030a }
            if (r0 != 0) goto L_0x02e3
            com.google.ads.interactivemedia.p367v3.internal.atv.m19620l()     // Catch:{ IllegalStateException -> 0x030a }
            goto L_0x0128
        L_0x02ee:
            r0 = move-exception
            r1 = r22
            goto L_0x030e
        L_0x02f2:
            r1 = r15
            com.google.ads.interactivemedia.v3.internal.iu r0 = r1.f23615a     // Catch:{ IllegalStateException -> 0x030a }
            int r2 = r0.f22506d     // Catch:{ IllegalStateException -> 0x030a }
            int r3 = r22.mo15506G(r23)     // Catch:{ IllegalStateException -> 0x030a }
            int r2 = r2 + r3
            r0.f22506d = r2     // Catch:{ IllegalStateException -> 0x030a }
            r2 = 0
            r1.m21588ab(r2)     // Catch:{ IllegalStateException -> 0x0308 }
        L_0x0302:
            com.google.ads.interactivemedia.v3.internal.iu r0 = r1.f23615a     // Catch:{ IllegalStateException -> 0x0308 }
            r0.mo16041a()     // Catch:{ IllegalStateException -> 0x0308 }
            return
        L_0x0308:
            r0 = move-exception
            goto L_0x030f
        L_0x030a:
            r0 = move-exception
            goto L_0x030e
        L_0x030c:
            r0 = move-exception
            r1 = r15
        L_0x030e:
            r2 = 0
        L_0x030f:
            int r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            r4 = 21
            if (r3 < r4) goto L_0x0319
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 != 0) goto L_0x032e
        L_0x0319:
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()
            int r4 = r3.length
            if (r4 <= 0) goto L_0x033b
            r2 = r3[r2]
            java.lang.String r2 = r2.getClassName()
            java.lang.String r3 = "android.media.MediaCodec"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x033b
        L_0x032e:
            com.google.ads.interactivemedia.v3.internal.qg r2 = r1.f23590B
            com.google.ads.interactivemedia.v3.internal.qf r0 = r1.mo14643at(r0, r2)
            com.google.ads.interactivemedia.v3.internal.cy r2 = r1.f23644n
            com.google.ads.interactivemedia.v3.internal.bn r0 = r1.mo15503D(r0, r2)
            throw r0
        L_0x033b:
            throw r0
        L_0x033c:
            r4 = r13
            r1 = r15
            r1.f23627al = r4
            goto L_0x0342
        L_0x0341:
            throw r0
        L_0x0342:
            goto L_0x0341
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7226qi.mo15782L(long, long):void");
    }

    /* renamed from: M */
    public boolean mo14621M() {
        if (this.f23644n == null) {
            return false;
        }
        if (mo15507H() || m21574aC()) {
            return true;
        }
        return this.f23605Q != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f23605Q;
    }

    /* renamed from: N */
    public boolean mo15783N() {
        return this.f23624ai;
    }

    /* renamed from: O */
    public final int mo15784O(C6864cy cyVar) {
        try {
            return mo14622P(this.f23633c, cyVar);
        } catch (C7234qq e) {
            throw mo15503D(e, cyVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public abstract int mo14622P(C7228qk qkVar, C6864cy cyVar);

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public abstract List mo14623Q(C7228qk qkVar, C6864cy cyVar, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public boolean mo16013R(C6864cy cyVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public abstract void mo14624S(C7224qg qgVar, C7222qe qeVar, C6864cy cyVar, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo14625T(String str, long j, long j2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0090, code lost:
        if (r1.f21818r == r3.f21818r) goto L_0x0094;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14626U(com.google.ads.interactivemedia.p367v3.internal.C6865cz r6) {
        /*
            r5 = this;
            r0 = 1
            r5.f23625aj = r0
            com.google.ads.interactivemedia.v3.internal.cy r1 = r6.f21827a
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r1)
            com.google.ads.interactivemedia.v3.internal.ji r6 = r6.f21828b
            r5.m21584aM(r6)
            r5.f23644n = r1
            boolean r6 = r5.f23611W
            if (r6 == 0) goto L_0x0016
            r5.f23612X = r0
            return
        L_0x0016:
            android.media.MediaCodec r6 = r5.f23650t
            if (r6 != 0) goto L_0x0021
            r6 = 0
            r5.f23656z = r6
            r5.mo16314af()
            return
        L_0x0021:
            com.google.ads.interactivemedia.v3.internal.ji r6 = r5.f23632aq
            if (r6 != 0) goto L_0x0029
            com.google.ads.interactivemedia.v3.internal.ji r2 = r5.f23631ap
            if (r2 != 0) goto L_0x0046
        L_0x0029:
            if (r6 == 0) goto L_0x002f
            com.google.ads.interactivemedia.v3.internal.ji r2 = r5.f23631ap
            if (r2 == 0) goto L_0x0046
        L_0x002f:
            com.google.ads.interactivemedia.v3.internal.ji r2 = r5.f23631ap
            if (r6 == r2) goto L_0x0039
            com.google.ads.interactivemedia.v3.internal.qg r6 = r5.f23590B
            boolean r6 = r6.f23582f
            if (r6 == 0) goto L_0x0046
        L_0x0039:
            int r6 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            r2 = 23
            if (r6 >= r2) goto L_0x004a
            com.google.ads.interactivemedia.v3.internal.ji r6 = r5.f23632aq
            com.google.ads.interactivemedia.v3.internal.ji r2 = r5.f23631ap
            if (r6 != r2) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            r5.m21580aI()
            return
        L_0x004a:
            com.google.ads.interactivemedia.v3.internal.qg r6 = r5.f23590B
            com.google.ads.interactivemedia.v3.internal.cy r2 = r5.f23652v
            int r6 = r5.mo14638ad(r6, r2, r1)
            if (r6 == 0) goto L_0x00bd
            if (r6 == r0) goto L_0x00a5
            r2 = 2
            if (r6 == r2) goto L_0x0071
            r0 = 3
            if (r6 != r0) goto L_0x006b
            r5.f23652v = r1
            r5.m21578aG()
            com.google.ads.interactivemedia.v3.internal.ji r6 = r5.f23632aq
            com.google.ads.interactivemedia.v3.internal.ji r0 = r5.f23631ap
            if (r6 == r0) goto L_0x00b8
            r5.m21579aH()
            return
        L_0x006b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L_0x0071:
            boolean r6 = r5.f23592D
            if (r6 == 0) goto L_0x0079
            r5.m21580aI()
            return
        L_0x0079:
            r5.f23613Y = r0
            r5.f23614Z = r0
            int r6 = r5.f23591C
            if (r6 == r2) goto L_0x0094
            r2 = 0
            if (r6 != r0) goto L_0x0093
            int r6 = r1.f21817q
            com.google.ads.interactivemedia.v3.internal.cy r3 = r5.f23652v
            int r4 = r3.f21817q
            if (r6 != r4) goto L_0x0093
            int r6 = r1.f21818r
            int r3 = r3.f21818r
            if (r6 != r3) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            r5.f23599K = r0
            r5.f23652v = r1
            r5.m21578aG()
            com.google.ads.interactivemedia.v3.internal.ji r6 = r5.f23632aq
            com.google.ads.interactivemedia.v3.internal.ji r0 = r5.f23631ap
            if (r6 == r0) goto L_0x00b8
            r5.m21579aH()
            return
        L_0x00a5:
            r5.f23652v = r1
            r5.m21578aG()
            com.google.ads.interactivemedia.v3.internal.ji r6 = r5.f23632aq
            com.google.ads.interactivemedia.v3.internal.ji r1 = r5.f23631ap
            if (r6 != r1) goto L_0x00b9
            boolean r6 = r5.f23618ac
            if (r6 == 0) goto L_0x00b8
            r5.f23616aa = r0
            r5.f23617ab = r0
        L_0x00b8:
            return
        L_0x00b9:
            r5.m21579aH()
            return
        L_0x00bd:
            r5.m21580aI()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7226qi.mo14626U(com.google.ads.interactivemedia.v3.internal.cz):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public void mo14627V(C6864cy cyVar, MediaFormat mediaFormat) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo14629X(C7024iw iwVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public void mo14630Y() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public abstract boolean mo14631Z(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6864cy cyVar);

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public void mo16015aa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ad */
    public int mo14638ad(C7224qg qgVar, C6864cy cyVar, C6864cy cyVar2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public float mo14639ae(float f, C6864cy[] cyVarArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0237 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0239 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0252 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0254 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0287 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02a1 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02a3 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02aa A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02d5 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02ed A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02ef A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0304 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0306 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0311 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0356 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0357 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x036b A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0379 A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x039e A[Catch:{ Exception -> 0x03a5, qq -> 0x00ea, qh -> 0x0400 }] */
    /* renamed from: af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16314af() {
        /*
            r21 = this;
            r7 = r21
            android.media.MediaCodec r0 = r7.f23650t
            if (r0 != 0) goto L_0x0408
            boolean r0 = r7.f23611W
            if (r0 != 0) goto L_0x0408
            com.google.ads.interactivemedia.v3.internal.cy r0 = r7.f23644n
            if (r0 != 0) goto L_0x0010
            goto L_0x0408
        L_0x0010:
            com.google.ads.interactivemedia.v3.internal.ji r1 = r7.f23632aq
            r8 = 1
            if (r1 != 0) goto L_0x004a
            boolean r0 = r7.mo16013R(r0)
            if (r0 == 0) goto L_0x004a
            com.google.ads.interactivemedia.v3.internal.cy r0 = r7.f23644n
            r21.mo16014W()
            java.lang.String r0 = r0.f21812l
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "audio/opus"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0040
            com.google.ads.interactivemedia.v3.internal.qc r0 = r7.f23637g
            r0.mo16287m(r8)
            goto L_0x0047
        L_0x0040:
            com.google.ads.interactivemedia.v3.internal.qc r0 = r7.f23637g
            r1 = 32
            r0.mo16287m(r1)
        L_0x0047:
            r7.f23611W = r8
            return
        L_0x004a:
            com.google.ads.interactivemedia.v3.internal.ji r0 = r7.f23632aq
            r7.m21585aN(r0)
            com.google.ads.interactivemedia.v3.internal.cy r0 = r7.f23644n
            java.lang.String r0 = r0.f21812l
            com.google.ads.interactivemedia.v3.internal.ji r0 = r7.f23631ap
            if (r0 == 0) goto L_0x0069
            boolean r0 = com.google.ads.interactivemedia.p367v3.internal.C7038jj.f22543a
            if (r0 != 0) goto L_0x005c
            goto L_0x0069
        L_0x005c:
            com.google.ads.interactivemedia.v3.internal.ji r0 = r7.f23631ap
            com.google.ads.interactivemedia.v3.internal.jd r0 = r0.mo16073a()
            com.google.ads.interactivemedia.v3.internal.cy r1 = r7.f23644n
            com.google.ads.interactivemedia.v3.internal.bn r0 = r7.mo15503D(r0, r1)
            throw r0
        L_0x0069:
            android.media.MediaCrypto r9 = r7.f23646p     // Catch:{ qh -> 0x0400 }
            boolean r10 = r7.f23647q     // Catch:{ qh -> 0x0400 }
            java.util.ArrayDeque r0 = r7.f23656z     // Catch:{ qh -> 0x0400 }
            java.lang.String r11 = "MediaCodecRenderer"
            r12 = 0
            r13 = 0
            if (r0 != 0) goto L_0x00f6
            com.google.ads.interactivemedia.v3.internal.qk r0 = r7.f23633c     // Catch:{ qq -> 0x00ea }
            com.google.ads.interactivemedia.v3.internal.cy r1 = r7.f23644n     // Catch:{ qq -> 0x00ea }
            java.util.List r0 = r7.mo14623Q(r0, r1, r10)     // Catch:{ qq -> 0x00ea }
            boolean r1 = r0.isEmpty()     // Catch:{ qq -> 0x00ea }
            if (r1 == 0) goto L_0x00cf
            if (r10 == 0) goto L_0x00cf
            com.google.ads.interactivemedia.v3.internal.qk r0 = r7.f23633c     // Catch:{ qq -> 0x00ea }
            com.google.ads.interactivemedia.v3.internal.cy r1 = r7.f23644n     // Catch:{ qq -> 0x00ea }
            java.util.List r0 = r7.mo14623Q(r0, r1, r13)     // Catch:{ qq -> 0x00ea }
            boolean r1 = r0.isEmpty()     // Catch:{ qq -> 0x00ea }
            if (r1 != 0) goto L_0x00cf
            com.google.ads.interactivemedia.v3.internal.cy r1 = r7.f23644n     // Catch:{ qq -> 0x00ea }
            java.lang.String r1 = r1.f21812l     // Catch:{ qq -> 0x00ea }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ qq -> 0x00ea }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ qq -> 0x00ea }
            int r3 = r3.length()     // Catch:{ qq -> 0x00ea }
            int r3 = r3 + 99
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ qq -> 0x00ea }
            int r4 = r4.length()     // Catch:{ qq -> 0x00ea }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ qq -> 0x00ea }
            r4.<init>(r3)     // Catch:{ qq -> 0x00ea }
            java.lang.String r3 = "Drm session requires secure decoder for "
            r4.append(r3)     // Catch:{ qq -> 0x00ea }
            r4.append(r1)     // Catch:{ qq -> 0x00ea }
            java.lang.String r1 = ", but no secure decoder available. Trying to proceed with "
            r4.append(r1)     // Catch:{ qq -> 0x00ea }
            r4.append(r2)     // Catch:{ qq -> 0x00ea }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{ qq -> 0x00ea }
            java.lang.String r1 = r4.toString()     // Catch:{ qq -> 0x00ea }
            android.util.Log.w(r11, r1)     // Catch:{ qq -> 0x00ea }
        L_0x00cf:
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch:{ qq -> 0x00ea }
            r1.<init>()     // Catch:{ qq -> 0x00ea }
            r7.f23656z = r1     // Catch:{ qq -> 0x00ea }
            boolean r1 = r0.isEmpty()     // Catch:{ qq -> 0x00ea }
            if (r1 != 0) goto L_0x00e7
            java.util.ArrayDeque r1 = r7.f23656z     // Catch:{ qq -> 0x00ea }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ qq -> 0x00ea }
            com.google.ads.interactivemedia.v3.internal.qg r0 = (com.google.ads.interactivemedia.p367v3.internal.C7224qg) r0     // Catch:{ qq -> 0x00ea }
            r1.add(r0)     // Catch:{ qq -> 0x00ea }
        L_0x00e7:
            r7.f23589A = r12     // Catch:{ qq -> 0x00ea }
            goto L_0x00f6
        L_0x00ea:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.qh r1 = new com.google.ads.interactivemedia.v3.internal.qh     // Catch:{ qh -> 0x0400 }
            com.google.ads.interactivemedia.v3.internal.cy r2 = r7.f23644n     // Catch:{ qh -> 0x0400 }
            r3 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.ads.interactivemedia.p367v3.internal.C6864cy) r2, (java.lang.Throwable) r0, (boolean) r10, (int) r3)     // Catch:{ qh -> 0x0400 }
            throw r1     // Catch:{ qh -> 0x0400 }
        L_0x00f6:
            java.util.ArrayDeque r0 = r7.f23656z     // Catch:{ qh -> 0x0400 }
            boolean r0 = r0.isEmpty()     // Catch:{ qh -> 0x0400 }
            if (r0 != 0) goto L_0x03f4
        L_0x00fe:
            android.media.MediaCodec r0 = r7.f23650t     // Catch:{ qh -> 0x0400 }
            if (r0 != 0) goto L_0x03f0
            java.util.ArrayDeque r0 = r7.f23656z     // Catch:{ qh -> 0x0400 }
            java.lang.Object r0 = r0.peekFirst()     // Catch:{ qh -> 0x0400 }
            r14 = r0
            com.google.ads.interactivemedia.v3.internal.qg r14 = (com.google.ads.interactivemedia.p367v3.internal.C7224qg) r14     // Catch:{ qh -> 0x0400 }
            boolean r0 = r7.mo14640ag(r14)     // Catch:{ qh -> 0x0400 }
            if (r0 != 0) goto L_0x0112
            return
        L_0x0112:
            java.lang.String r0 = r14.f23577a     // Catch:{ Exception -> 0x03a5 }
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r15 = 23
            if (r1 >= r15) goto L_0x011f
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0129
        L_0x011f:
            float r1 = r7.f23649s     // Catch:{ Exception -> 0x03a5 }
            com.google.ads.interactivemedia.v3.internal.cy[] r3 = r21.mo15501B()     // Catch:{ Exception -> 0x03a5 }
            float r1 = r7.mo14639ae(r1, r3)     // Catch:{ Exception -> 0x03a5 }
        L_0x0129:
            float r3 = r7.f23634d     // Catch:{ Exception -> 0x03a5 }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0132
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0133
        L_0x0132:
            r5 = r1
        L_0x0133:
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x039a }
            java.lang.String r1 = "createCodec:"
            int r2 = r0.length()     // Catch:{ Exception -> 0x039a }
            if (r2 == 0) goto L_0x0144
            java.lang.String r1 = r1.concat(r0)     // Catch:{ Exception -> 0x039a }
            goto L_0x014a
        L_0x0144:
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x039a }
            r2.<init>(r1)     // Catch:{ Exception -> 0x039a }
            r1 = r2
        L_0x014a:
            com.google.ads.interactivemedia.p367v3.internal.atv.m19619k(r1)     // Catch:{ Exception -> 0x039a }
            android.media.MediaCodec r6 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x039a }
            com.google.ads.interactivemedia.v3.internal.qw r4 = new com.google.ads.interactivemedia.v3.internal.qw     // Catch:{ Exception -> 0x0396 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x0396 }
            com.google.ads.interactivemedia.p367v3.internal.atv.m19620l()     // Catch:{ Exception -> 0x0396 }
            java.lang.String r1 = "configureCodec"
            com.google.ads.interactivemedia.p367v3.internal.atv.m19619k(r1)     // Catch:{ Exception -> 0x0396 }
            com.google.ads.interactivemedia.v3.internal.cy r3 = r7.f23644n     // Catch:{ Exception -> 0x0396 }
            r1 = r21
            r2 = r14
            r18 = r3
            r3 = r4
            r19 = r4
            r4 = r18
            r18 = r5
            r5 = r9
            r20 = r6
            r6 = r18
            r1.mo14624S(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0392 }
            com.google.ads.interactivemedia.p367v3.internal.atv.m19620l()     // Catch:{ Exception -> 0x0392 }
            java.lang.String r1 = "startCodec"
            com.google.ads.interactivemedia.p367v3.internal.atv.m19619k(r1)     // Catch:{ Exception -> 0x0392 }
            r19.mo16298a()     // Catch:{ Exception -> 0x0392 }
            com.google.ads.interactivemedia.p367v3.internal.atv.m19620l()     // Catch:{ Exception -> 0x0392 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0392 }
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x0392 }
            r2 = 21
            if (r1 >= r2) goto L_0x0198
            java.nio.ByteBuffer[] r1 = r20.getInputBuffers()     // Catch:{ Exception -> 0x0392 }
            r7.f23603O = r1     // Catch:{ Exception -> 0x0392 }
            java.nio.ByteBuffer[] r1 = r20.getOutputBuffers()     // Catch:{ Exception -> 0x0392 }
            r7.f23604P = r1     // Catch:{ Exception -> 0x0392 }
        L_0x0198:
            r1 = r20
            r7.f23650t = r1     // Catch:{ Exception -> 0x03a5 }
            r1 = r19
            r7.f23651u = r1     // Catch:{ Exception -> 0x03a5 }
            r7.f23590B = r14     // Catch:{ Exception -> 0x03a5 }
            r1 = r18
            r7.f23655y = r1     // Catch:{ Exception -> 0x03a5 }
            com.google.ads.interactivemedia.v3.internal.cy r1 = r7.f23644n     // Catch:{ Exception -> 0x03a5 }
            r7.f23652v = r1     // Catch:{ Exception -> 0x03a5 }
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            java.lang.String r5 = "OMX.Exynos.avc.dec.secure"
            r6 = 25
            if (r1 > r6) goto L_0x01e2
            boolean r1 = r5.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x01e2
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d     // Catch:{ Exception -> 0x03a5 }
            java.lang.String r12 = "SM-T585"
            boolean r1 = r1.startsWith(r12)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x01e0
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d     // Catch:{ Exception -> 0x03a5 }
            java.lang.String r12 = "SM-A510"
            boolean r1 = r1.startsWith(r12)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x01e0
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d     // Catch:{ Exception -> 0x03a5 }
            java.lang.String r12 = "SM-A520"
            boolean r1 = r1.startsWith(r12)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x01e0
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d     // Catch:{ Exception -> 0x03a5 }
            java.lang.String r12 = "SM-J700"
            boolean r1 = r1.startsWith(r12)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x01e2
        L_0x01e0:
            r1 = 2
            goto L_0x0223
        L_0x01e2:
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            r12 = 24
            if (r1 >= r12) goto L_0x0222
            java.lang.String r1 = "OMX.Nvidia.h264.decode"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x01f8
            java.lang.String r1 = "OMX.Nvidia.h264.decode.secure"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x0222
        L_0x01f8:
            java.lang.String r1 = "flounder"
            java.lang.String r12 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x03a5 }
            boolean r1 = r1.equals(r12)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x0220
            java.lang.String r1 = "flounder_lte"
            java.lang.String r12 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x03a5 }
            boolean r1 = r1.equals(r12)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x0220
            java.lang.String r1 = "grouper"
            java.lang.String r12 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x03a5 }
            boolean r1 = r1.equals(r12)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x0220
            java.lang.String r1 = "tilapia"
            java.lang.String r12 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x03a5 }
            boolean r1 = r1.equals(r12)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x0222
        L_0x0220:
            r1 = 1
            goto L_0x0223
        L_0x0222:
            r1 = 0
        L_0x0223:
            r7.f23591C = r1     // Catch:{ Exception -> 0x03a5 }
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d     // Catch:{ Exception -> 0x03a5 }
            java.lang.String r12 = "SM-T230"
            boolean r1 = r1.startsWith(r12)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x0239
            java.lang.String r1 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x0239
            r1 = 1
            goto L_0x023a
        L_0x0239:
            r1 = 0
        L_0x023a:
            r7.f23592D = r1     // Catch:{ Exception -> 0x03a5 }
            com.google.ads.interactivemedia.v3.internal.cy r1 = r7.f23652v     // Catch:{ Exception -> 0x03a5 }
            int r12 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            if (r12 >= r2) goto L_0x0254
            java.util.List r1 = r1.f21814n     // Catch:{ Exception -> 0x03a5 }
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x0254
            java.lang.String r1 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x0254
            r1 = 1
            goto L_0x0255
        L_0x0254:
            r1 = 0
        L_0x0255:
            r7.f23593E = r1     // Catch:{ Exception -> 0x03a5 }
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            r12 = 19
            r13 = 18
            if (r1 < r13) goto L_0x0290
            if (r1 != r13) goto L_0x0271
            java.lang.String r1 = "OMX.SEC.avc.dec"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x0290
            java.lang.String r1 = "OMX.SEC.avc.dec.secure"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x0290
        L_0x0271:
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            if (r1 != r12) goto L_0x028e
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d     // Catch:{ Exception -> 0x03a5 }
            java.lang.String r6 = "SM-G800"
            boolean r1 = r1.startsWith(r6)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x028e
            java.lang.String r1 = "OMX.Exynos.avc.dec"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x0290
            boolean r1 = r5.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x028e
            goto L_0x0290
        L_0x028e:
            r1 = 0
            goto L_0x0291
        L_0x0290:
            r1 = 1
        L_0x0291:
            r7.f23594F = r1     // Catch:{ Exception -> 0x03a5 }
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            r5 = 29
            if (r1 != r5) goto L_0x02a3
            java.lang.String r1 = "c2.android.aac.decoder"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x02a3
            r1 = 1
            goto L_0x02a4
        L_0x02a3:
            r1 = 0
        L_0x02a4:
            r7.f23595G = r1     // Catch:{ Exception -> 0x03a5 }
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            if (r1 > r15) goto L_0x02b5
            java.lang.String r1 = "OMX.google.vorbis.decoder"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x02b3
            goto L_0x02b5
        L_0x02b3:
            r1 = 1
            goto L_0x02df
        L_0x02b5:
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            if (r1 > r12) goto L_0x02de
            java.lang.String r1 = "hb2000"
            java.lang.String r6 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x03a5 }
            boolean r1 = r1.equals(r6)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x02cd
            java.lang.String r1 = "stvm8"
            java.lang.String r6 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x03a5 }
            boolean r1 = r1.equals(r6)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x02de
        L_0x02cd:
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x02b3
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x02de
            goto L_0x02b3
        L_0x02de:
            r1 = 0
        L_0x02df:
            r7.f23596H = r1     // Catch:{ Exception -> 0x03a5 }
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            if (r1 != r2) goto L_0x02ef
            java.lang.String r1 = "OMX.google.aac.decoder"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x02ef
            r1 = 1
            goto L_0x02f0
        L_0x02ef:
            r1 = 0
        L_0x02f0:
            r7.f23597I = r1     // Catch:{ Exception -> 0x03a5 }
            com.google.ads.interactivemedia.v3.internal.cy r1 = r7.f23652v     // Catch:{ Exception -> 0x03a5 }
            int r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            if (r2 > r13) goto L_0x0306
            int r1 = r1.f21825y     // Catch:{ Exception -> 0x03a5 }
            if (r1 != r8) goto L_0x0306
            java.lang.String r1 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x0306
            r1 = 1
            goto L_0x0307
        L_0x0306:
            r1 = 0
        L_0x0307:
            r7.f23598J = r1     // Catch:{ Exception -> 0x03a5 }
            java.lang.String r1 = r14.f23577a     // Catch:{ Exception -> 0x03a5 }
            int r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            r6 = 25
            if (r2 > r6) goto L_0x031c
            java.lang.String r2 = "OMX.rk.video_decoder.avc"
            boolean r2 = r2.equals(r1)     // Catch:{ Exception -> 0x03a5 }
            if (r2 != 0) goto L_0x031a
            goto L_0x031c
        L_0x031a:
            r1 = 1
            goto L_0x035f
        L_0x031c:
            int r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            r6 = 17
            if (r2 > r6) goto L_0x032a
            java.lang.String r2 = "OMX.allwinner.video.decoder.avc"
            boolean r2 = r2.equals(r1)     // Catch:{ Exception -> 0x03a5 }
            if (r2 != 0) goto L_0x031a
        L_0x032a:
            int r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x03a5 }
            if (r2 > r5) goto L_0x033e
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel"
            boolean r2 = r2.equals(r1)     // Catch:{ Exception -> 0x03a5 }
            if (r2 != 0) goto L_0x031a
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x03a5 }
            if (r1 != 0) goto L_0x031a
        L_0x033e:
            java.lang.String r1 = "Amazon"
            java.lang.String r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20468c     // Catch:{ Exception -> 0x03a5 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x0357
            java.lang.String r1 = "AFTS"
            java.lang.String r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d     // Catch:{ Exception -> 0x03a5 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x0357
            boolean r1 = r14.f23582f     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x0357
            goto L_0x031a
        L_0x0357:
            boolean r1 = r21.mo14641ah()     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x035e
            goto L_0x031a
        L_0x035e:
            r1 = 0
        L_0x035f:
            r7.f23601M = r1     // Catch:{ Exception -> 0x03a5 }
            java.lang.String r1 = "c2.android.mp3.decoder"
            java.lang.String r2 = r14.f23577a     // Catch:{ Exception -> 0x03a5 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x03a5 }
            if (r1 == 0) goto L_0x0372
            com.google.ads.interactivemedia.v3.internal.qd r1 = new com.google.ads.interactivemedia.v3.internal.qd     // Catch:{ Exception -> 0x03a5 }
            r1.<init>()     // Catch:{ Exception -> 0x03a5 }
            r7.f23602N = r1     // Catch:{ Exception -> 0x03a5 }
        L_0x0372:
            int r1 = r21.mo15516e()     // Catch:{ Exception -> 0x03a5 }
            r2 = 2
            if (r1 != r2) goto L_0x0382
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03a5 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 + r5
            r7.f23605Q = r1     // Catch:{ Exception -> 0x03a5 }
        L_0x0382:
            com.google.ads.interactivemedia.v3.internal.iu r1 = r7.f23615a     // Catch:{ Exception -> 0x03a5 }
            int r2 = r1.f22503a     // Catch:{ Exception -> 0x03a5 }
            int r2 = r2 + r8
            r1.f22503a = r2     // Catch:{ Exception -> 0x03a5 }
            long r5 = r3 - r16
            r1 = r21
            r2 = r0
            r1.mo14625T(r2, r3, r5)     // Catch:{ Exception -> 0x03a5 }
            goto L_0x03e9
        L_0x0392:
            r0 = move-exception
            r1 = r20
            goto L_0x0398
        L_0x0396:
            r0 = move-exception
            r1 = r6
        L_0x0398:
            r6 = r1
            goto L_0x039c
        L_0x039a:
            r0 = move-exception
            r6 = 0
        L_0x039c:
            if (r6 == 0) goto L_0x03a4
            r21.mo14632aB()     // Catch:{ Exception -> 0x03a5 }
            r6.release()     // Catch:{ Exception -> 0x03a5 }
        L_0x03a4:
            throw r0     // Catch:{ Exception -> 0x03a5 }
        L_0x03a5:
            r0 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r14)     // Catch:{ qh -> 0x0400 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ qh -> 0x0400 }
            int r2 = r2.length()     // Catch:{ qh -> 0x0400 }
            int r2 = r2 + 30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ qh -> 0x0400 }
            r3.<init>(r2)     // Catch:{ qh -> 0x0400 }
            java.lang.String r2 = "Failed to initialize decoder: "
            r3.append(r2)     // Catch:{ qh -> 0x0400 }
            r3.append(r1)     // Catch:{ qh -> 0x0400 }
            java.lang.String r1 = r3.toString()     // Catch:{ qh -> 0x0400 }
            com.google.ads.interactivemedia.p367v3.internal.adu.m18340a(r11, r1, r0)     // Catch:{ qh -> 0x0400 }
            java.util.ArrayDeque r1 = r7.f23656z     // Catch:{ qh -> 0x0400 }
            r1.removeFirst()     // Catch:{ qh -> 0x0400 }
            com.google.ads.interactivemedia.v3.internal.qh r1 = new com.google.ads.interactivemedia.v3.internal.qh     // Catch:{ qh -> 0x0400 }
            com.google.ads.interactivemedia.v3.internal.cy r2 = r7.f23644n     // Catch:{ qh -> 0x0400 }
            r1.<init>((com.google.ads.interactivemedia.p367v3.internal.C6864cy) r2, (java.lang.Throwable) r0, (boolean) r10, (com.google.ads.interactivemedia.p367v3.internal.C7224qg) r14)     // Catch:{ qh -> 0x0400 }
            com.google.ads.interactivemedia.v3.internal.qh r0 = r7.f23589A     // Catch:{ qh -> 0x0400 }
            if (r0 != 0) goto L_0x03db
            r7.f23589A = r1     // Catch:{ qh -> 0x0400 }
            goto L_0x03e1
        L_0x03db:
            com.google.ads.interactivemedia.v3.internal.qh r0 = com.google.ads.interactivemedia.p367v3.internal.C7225qh.m21570a(r0, r1)     // Catch:{ qh -> 0x0400 }
            r7.f23589A = r0     // Catch:{ qh -> 0x0400 }
        L_0x03e1:
            java.util.ArrayDeque r0 = r7.f23656z     // Catch:{ qh -> 0x0400 }
            boolean r0 = r0.isEmpty()     // Catch:{ qh -> 0x0400 }
            if (r0 != 0) goto L_0x03ed
        L_0x03e9:
            r12 = 0
            r13 = 0
            goto L_0x00fe
        L_0x03ed:
            com.google.ads.interactivemedia.v3.internal.qh r0 = r7.f23589A     // Catch:{ qh -> 0x0400 }
            throw r0     // Catch:{ qh -> 0x0400 }
        L_0x03f0:
            r1 = r12
            r7.f23656z = r1     // Catch:{ qh -> 0x0400 }
            return
        L_0x03f4:
            com.google.ads.interactivemedia.v3.internal.qh r0 = new com.google.ads.interactivemedia.v3.internal.qh     // Catch:{ qh -> 0x0400 }
            com.google.ads.interactivemedia.v3.internal.cy r1 = r7.f23644n     // Catch:{ qh -> 0x0400 }
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r3 = 0
            r0.<init>((com.google.ads.interactivemedia.p367v3.internal.C6864cy) r1, (java.lang.Throwable) r3, (boolean) r10, (int) r2)     // Catch:{ qh -> 0x0400 }
            throw r0     // Catch:{ qh -> 0x0400 }
        L_0x0400:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.cy r1 = r7.f23644n
            com.google.ads.interactivemedia.v3.internal.bn r0 = r7.mo15503D(r0, r1)
            throw r0
        L_0x0408:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7226qi.mo16314af():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ag */
    public boolean mo14640ag(C7224qg qgVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ah */
    public boolean mo14641ah() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ai */
    public final void mo16315ai(C6826bn bnVar) {
        this.f23627al = bnVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aj */
    public final void mo16316aj(long j) {
        C6864cy cyVar = (C6864cy) this.f23638h.mo14596e(j);
        if (cyVar == null && this.f23654x) {
            cyVar = (C6864cy) this.f23638h.mo14595d();
        }
        if (cyVar != null) {
            this.f23645o = cyVar;
        } else if (!this.f23654x || this.f23645o == null) {
            return;
        }
        mo14627V(this.f23645o, this.f23653w);
        this.f23654x = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ak */
    public final C6864cy mo16317ak() {
        return this.f23644n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: al */
    public final C6864cy mo16318al() {
        return this.f23645o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public final MediaCodec mo16319am() {
        return this.f23650t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public final C7224qg mo16320an() {
        return this.f23590B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ao */
    public final void mo16321ao() {
        try {
            MediaCodec mediaCodec = this.f23650t;
            if (mediaCodec != null) {
                this.f23615a.f22504b++;
                mediaCodec.release();
            }
            this.f23650t = null;
            this.f23651u = null;
            try {
                MediaCrypto mediaCrypto = this.f23646p;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f23646p = null;
                m21585aN((C7037ji) null);
                mo16324as();
            }
        } catch (Throwable th) {
            this.f23650t = null;
            this.f23651u = null;
            MediaCrypto mediaCrypto2 = this.f23646p;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.f23646p = null;
            m21585aN((C7037ji) null);
            mo16324as();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ap */
    public final boolean mo16322ap() {
        boolean aq = mo16323aq();
        if (aq) {
            mo16314af();
        }
        return aq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ar */
    public void mo14642ar() {
        m21575aD();
        m21576aE();
        this.f23605Q = -9223372036854775807L;
        this.f23619ad = false;
        this.f23618ac = false;
        this.f23599K = false;
        this.f23600L = false;
        this.f23609U = false;
        this.f23610V = false;
        this.f23639i.clear();
        this.f23621af = -9223372036854775807L;
        this.f23622ag = -9223372036854775807L;
        C7221qd qdVar = this.f23602N;
        if (qdVar != null) {
            qdVar.mo16296a();
        }
        this.f23616aa = 0;
        this.f23617ab = 0;
        this.f23614Z = this.f23613Y ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public final void mo16324as() {
        mo14642ar();
        this.f23627al = null;
        this.f23602N = null;
        this.f23656z = null;
        this.f23590B = null;
        this.f23652v = null;
        this.f23653w = null;
        this.f23654x = false;
        this.f23620ae = false;
        this.f23655y = -1.0f;
        this.f23591C = 0;
        this.f23592D = false;
        this.f23593E = false;
        this.f23594F = false;
        this.f23595G = false;
        this.f23596H = false;
        this.f23597I = false;
        this.f23598J = false;
        this.f23601M = false;
        this.f23613Y = false;
        this.f23614Z = 0;
        mo14632aB();
        this.f23647q = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public C7223qf mo14643at(Throwable th, C7224qg qgVar) {
        return new C7223qf(th, qgVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: au */
    public void mo14644au(C7024iw iwVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: av */
    public void mo14645av(long j) {
        while (true) {
            int i = this.f23630ao;
            if (i != 0 && j >= this.f23643m[0]) {
                long[] jArr = this.f23641k;
                this.f23628am = jArr[0];
                this.f23629an = this.f23642l[0];
                int i2 = i - 1;
                this.f23630ao = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f23642l;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f23630ao);
                long[] jArr3 = this.f23643m;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f23630ao);
                mo14630Y();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aw */
    public final float mo16325aw() {
        return this.f23649s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ax */
    public final void mo16326ax() {
        this.f23626ak = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ay */
    public final long mo16327ay() {
        return this.f23621af;
    }

    /* access modifiers changed from: protected */
    /* renamed from: az */
    public final long mo16328az() {
        return this.f23629an;
    }

    /* renamed from: s */
    public final int mo15527s() {
        return 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo14647u(boolean z, boolean z2) {
        this.f23615a = new C7022iu();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo14648v(long j, boolean z) {
        this.f23623ah = false;
        this.f23624ai = false;
        this.f23626ak = false;
        if (this.f23611W) {
            this.f23637g.mo16288n();
        } else {
            mo16322ap();
        }
        if (this.f23638h.mo14594c() > 0) {
            this.f23625aj = true;
        }
        this.f23638h.mo14593b();
        int i = this.f23630ao;
        if (i != 0) {
            int i2 = i - 1;
            this.f23629an = this.f23642l[i2];
            this.f23628am = this.f23641k[i2];
            this.f23630ao = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo14651y() {
        this.f23644n = null;
        this.f23628am = -9223372036854775807L;
        this.f23629an = -9223372036854775807L;
        this.f23630ao = 0;
        if (this.f23632aq == null && this.f23631ap == null) {
            mo16323aq();
        } else {
            mo14652z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo14652z() {
        try {
            mo16014W();
            mo16321ao();
        } finally {
            m21584aM((C7037ji) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aq */
    public final boolean mo16323aq() {
        if (this.f23650t == null) {
            return false;
        }
        if (this.f23617ab == 3 || this.f23594F || ((this.f23595G && !this.f23620ae) || (this.f23596H && this.f23619ad))) {
            mo16321ao();
            return true;
        }
        try {
            this.f23651u.mo16302e();
            return false;
        } finally {
            mo14642ar();
        }
    }

    /* renamed from: aJ */
    private final void m21581aJ() {
        int i = this.f23617ab;
        if (i == 1) {
            mo16322ap();
        } else if (i == 2) {
            m21583aL();
        } else if (i != 3) {
            this.f23624ai = true;
            mo16015aa();
        } else {
            m21582aK();
        }
    }
}
