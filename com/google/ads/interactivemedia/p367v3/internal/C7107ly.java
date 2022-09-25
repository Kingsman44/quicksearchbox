package com.google.ads.interactivemedia.p367v3.internal;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.io.EOFException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ly */
/* compiled from: PG */
public final class C7107ly implements C7053jy {

    /* renamed from: a */
    public static final /* synthetic */ int f22873a = 0;

    /* renamed from: b */
    private final long f22874b;

    /* renamed from: c */
    private final aee f22875c;

    /* renamed from: d */
    private final C7012ik f22876d;

    /* renamed from: e */
    private final C7064ki f22877e;

    /* renamed from: f */
    private final C7065kj f22878f;

    /* renamed from: g */
    private final C7073kr f22879g;

    /* renamed from: h */
    private C7056ka f22880h;

    /* renamed from: i */
    private C7073kr f22881i;

    /* renamed from: j */
    private C7073kr f22882j;

    /* renamed from: k */
    private int f22883k;

    /* renamed from: l */
    private C7243qz f22884l;

    /* renamed from: m */
    private long f22885m;

    /* renamed from: n */
    private long f22886n;

    /* renamed from: o */
    private long f22887o;

    /* renamed from: p */
    private int f22888p;

    /* renamed from: q */
    private C7108lz f22889q;

    /* renamed from: r */
    private boolean f22890r;

    /* renamed from: s */
    private long f22891s;

    static {
        int i = C7106lx.f22872b;
    }

    public C7107ly() {
        this((byte[]) null);
    }

    /* renamed from: b */
    private final long m21099b(long j) {
        return this.f22885m + ((j * 1000000) / ((long) this.f22876d.f22428d));
    }

    /* renamed from: c */
    private static boolean m21100c(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m21101i(com.google.ads.interactivemedia.p367v3.internal.C7050jv r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r0.f22883k
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.m21102j(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.ads.interactivemedia.v3.internal.lz r2 = r0.f22889q
            r5 = 0
            r10 = 1
            if (r2 != 0) goto L_0x01b2
            com.google.ads.interactivemedia.v3.internal.aee r2 = new com.google.ads.interactivemedia.v3.internal.aee
            com.google.ads.interactivemedia.v3.internal.ik r11 = r0.f22876d
            int r11 = r11.f22427c
            r2.<init>((int) r11)
            byte[] r11 = r2.mo14555i()
            com.google.ads.interactivemedia.v3.internal.ik r12 = r0.f22876d
            int r12 = r12.f22427c
            r1.mo16094g(r11, r4, r12)
            com.google.ads.interactivemedia.v3.internal.ik r11 = r0.f22876d
            int r12 = r11.f22425a
            r12 = r12 & r10
            r13 = 36
            r14 = 21
            if (r12 == 0) goto L_0x003c
            int r11 = r11.f22429e
            if (r11 == r10) goto L_0x0040
            r15 = 36
            goto L_0x0047
        L_0x003c:
            int r11 = r11.f22429e
            if (r11 == r10) goto L_0x0043
        L_0x0040:
            r15 = 21
            goto L_0x0047
        L_0x0043:
            r14 = 13
            r15 = 13
        L_0x0047:
            int r11 = r2.mo14551e()
            int r12 = r15 + 4
            r14 = 1483304551(0x58696e67, float:1.02664153E15)
            r10 = 1447187017(0x56425249, float:5.3414667E13)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r11 < r12) goto L_0x0069
            r2.mo14554h(r15)
            int r11 = r2.mo14568v()
            if (r11 == r14) goto L_0x0067
            if (r11 != r9) goto L_0x0069
            r13 = 1231971951(0x496e666f, float:976486.94)
            goto L_0x007f
        L_0x0067:
            r13 = r11
            goto L_0x007f
        L_0x0069:
            int r11 = r2.mo14551e()
            r12 = 40
            if (r11 < r12) goto L_0x007e
            r2.mo14554h(r13)
            int r11 = r2.mo14568v()
            if (r11 != r10) goto L_0x007e
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x007f
        L_0x007e:
            r13 = 0
        L_0x007f:
            if (r13 == r14) goto L_0x00a3
            if (r13 != r9) goto L_0x0084
            goto L_0x00a3
        L_0x0084:
            if (r13 != r10) goto L_0x009e
            long r11 = r20.mo16100m()
            long r13 = r20.mo16099l()
            com.google.ads.interactivemedia.v3.internal.ik r15 = r0.f22876d
            r16 = r2
            com.google.ads.interactivemedia.v3.internal.ma r2 = com.google.ads.interactivemedia.p367v3.internal.C7110ma.m21113f(r11, r13, r15, r16)
            com.google.ads.interactivemedia.v3.internal.ik r9 = r0.f22876d
            int r9 = r9.f22427c
            r1.mo16091d(r9)
            goto L_0x0102
        L_0x009e:
            r20.mo16097j()
            r2 = 0
            goto L_0x0102
        L_0x00a3:
            long r11 = r20.mo16100m()
            long r17 = r20.mo16099l()
            com.google.ads.interactivemedia.v3.internal.ik r10 = r0.f22876d
            r7 = r13
            r13 = r17
            r8 = r15
            r15 = r10
            r16 = r2
            com.google.ads.interactivemedia.v3.internal.mb r2 = com.google.ads.interactivemedia.p367v3.internal.C7111mb.m21119f(r11, r13, r15, r16)
            if (r2 == 0) goto L_0x00ed
            com.google.ads.interactivemedia.v3.internal.ki r10 = r0.f22877e
            boolean r10 = r10.mo16123a()
            if (r10 != 0) goto L_0x00ed
            r20.mo16097j()
            int r15 = r8 + 141
            r1.mo16096i(r15)
            com.google.ads.interactivemedia.v3.internal.aee r8 = r0.f22875c
            byte[] r8 = r8.mo14555i()
            r10 = 3
            r1.mo16094g(r8, r4, r10)
            com.google.ads.interactivemedia.v3.internal.aee r8 = r0.f22875c
            r8.mo14554h(r4)
            com.google.ads.interactivemedia.v3.internal.ki r8 = r0.f22877e
            com.google.ads.interactivemedia.v3.internal.aee r10 = r0.f22875c
            int r10 = r10.mo14564r()
            int r11 = r10 >> 12
            r10 = r10 & 4095(0xfff, float:5.738E-42)
            if (r11 > 0) goto L_0x00e9
            if (r10 <= 0) goto L_0x00ed
        L_0x00e9:
            r8.f22617a = r11
            r8.f22618b = r10
        L_0x00ed:
            com.google.ads.interactivemedia.v3.internal.ik r8 = r0.f22876d
            int r8 = r8.f22427c
            r1.mo16091d(r8)
            if (r2 == 0) goto L_0x0102
            boolean r8 = r2.mo16074a()
            if (r8 != 0) goto L_0x0102
            if (r7 != r9) goto L_0x0102
            com.google.ads.interactivemedia.v3.internal.lz r2 = r19.m21104l(r20)
        L_0x0102:
            com.google.ads.interactivemedia.v3.internal.qz r7 = r0.f22884l
            long r8 = r20.mo16099l()
            if (r7 == 0) goto L_0x0151
            int r10 = r7.mo16341a()
            r11 = 0
        L_0x010f:
            if (r11 >= r10) goto L_0x0151
            com.google.ads.interactivemedia.v3.internal.qy r12 = r7.mo16342b(r11)
            boolean r13 = r12 instanceof com.google.ads.interactivemedia.p367v3.internal.C7277sf
            if (r13 == 0) goto L_0x014e
            com.google.ads.interactivemedia.v3.internal.sf r12 = (com.google.ads.interactivemedia.p367v3.internal.C7277sf) r12
            int r10 = r7.mo16341a()
            r11 = 0
        L_0x0120:
            if (r11 >= r10) goto L_0x0144
            com.google.ads.interactivemedia.v3.internal.qy r13 = r7.mo16342b(r11)
            boolean r14 = r13 instanceof com.google.ads.interactivemedia.p367v3.internal.C7281sj
            if (r14 == 0) goto L_0x0141
            com.google.ads.interactivemedia.v3.internal.sj r13 = (com.google.ads.interactivemedia.p367v3.internal.C7281sj) r13
            java.lang.String r14 = r13.f23739f
            java.lang.String r15 = "TLEN"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0141
            java.lang.String r7 = r13.f23751b
            long r10 = java.lang.Long.parseLong(r7)
            long r10 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.m19755b(r10)
            goto L_0x0149
        L_0x0141:
            int r11 = r11 + 1
            goto L_0x0120
        L_0x0144:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0149:
            com.google.ads.interactivemedia.v3.internal.lw r7 = com.google.ads.interactivemedia.p367v3.internal.C7105lw.m21090f(r8, r12, r10)
            goto L_0x0152
        L_0x014e:
            int r11 = r11 + 1
            goto L_0x010f
        L_0x0151:
            r7 = 0
        L_0x0152:
            boolean r8 = r0.f22890r
            if (r8 == 0) goto L_0x015c
            com.google.ads.interactivemedia.v3.internal.kn r2 = new com.google.ads.interactivemedia.v3.internal.kn
            r2.<init>()
            goto L_0x0169
        L_0x015c:
            if (r7 == 0) goto L_0x0160
            r2 = r7
            goto L_0x0163
        L_0x0160:
            if (r2 != 0) goto L_0x0163
            r2 = 0
        L_0x0163:
            if (r2 != 0) goto L_0x0169
            com.google.ads.interactivemedia.v3.internal.lz r2 = r19.m21104l(r20)
        L_0x0169:
            r0.f22889q = r2
            com.google.ads.interactivemedia.v3.internal.ka r7 = r0.f22880h
            r7.mo16115am(r2)
            com.google.ads.interactivemedia.v3.internal.kr r2 = r0.f22882j
            com.google.ads.interactivemedia.v3.internal.cx r7 = new com.google.ads.interactivemedia.v3.internal.cx
            r7.<init>()
            com.google.ads.interactivemedia.v3.internal.ik r8 = r0.f22876d
            java.lang.String r8 = r8.f22426b
            r7.mo15630ae(r8)
            r8 = 4096(0x1000, float:5.74E-42)
            r7.mo15621W(r8)
            com.google.ads.interactivemedia.v3.internal.ik r8 = r0.f22876d
            int r8 = r8.f22429e
            r7.mo15606H(r8)
            com.google.ads.interactivemedia.v3.internal.ik r8 = r0.f22876d
            int r8 = r8.f22428d
            r7.mo15631af(r8)
            com.google.ads.interactivemedia.v3.internal.ki r8 = r0.f22877e
            int r8 = r8.f22617a
            r7.mo15611M(r8)
            com.google.ads.interactivemedia.v3.internal.ki r8 = r0.f22877e
            int r8 = r8.f22618b
            r7.mo15612N(r8)
            com.google.ads.interactivemedia.v3.internal.qz r8 = r0.f22884l
            r7.mo15622X(r8)
            com.google.ads.interactivemedia.v3.internal.cy r7 = r7.mo15625a()
            r2.mo16102a(r7)
            long r7 = r20.mo16099l()
            r0.f22887o = r7
            goto L_0x01c7
        L_0x01b2:
            long r7 = r0.f22887o
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x01c7
            long r7 = r20.mo16099l()
            long r9 = r0.f22887o
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x01c7
            long r9 = r9 - r7
            int r2 = (int) r9
            r1.mo16091d(r2)
        L_0x01c7:
            int r2 = r0.f22888p
            if (r2 != 0) goto L_0x0247
            r20.mo16097j()
            boolean r2 = r19.m21103k(r20)
            if (r2 == 0) goto L_0x01d6
            goto L_0x0259
        L_0x01d6:
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22875c
            r2.mo14554h(r4)
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22875c
            int r2 = r2.mo14568v()
            int r7 = r0.f22883k
            long r7 = (long) r7
            boolean r7 = m21100c(r2, r7)
            if (r7 == 0) goto L_0x0240
            int r7 = com.google.ads.interactivemedia.p367v3.internal.C7013il.m20763a(r2)
            if (r7 != r3) goto L_0x01f1
            goto L_0x0240
        L_0x01f1:
            com.google.ads.interactivemedia.v3.internal.ik r7 = r0.f22876d
            r7.mo16016a(r2)
            long r7 = r0.f22885m
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0221
            com.google.ads.interactivemedia.v3.internal.lz r2 = r0.f22889q
            long r7 = r20.mo16099l()
            long r7 = r2.mo16129d(r7)
            r0.f22885m = r7
            long r7 = r0.f22874b
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x0221
            com.google.ads.interactivemedia.v3.internal.lz r2 = r0.f22889q
            long r5 = r2.mo16129d(r5)
            long r7 = r0.f22885m
            long r9 = r0.f22874b
            long r9 = r9 - r5
            long r7 = r7 + r9
            r0.f22885m = r7
        L_0x0221:
            com.google.ads.interactivemedia.v3.internal.ik r2 = r0.f22876d
            int r5 = r2.f22427c
            r0.f22888p = r5
            com.google.ads.interactivemedia.v3.internal.lz r6 = r0.f22889q
            boolean r7 = r6 instanceof com.google.ads.interactivemedia.p367v3.internal.C7104lv
            if (r7 != 0) goto L_0x022f
            r2 = r5
            goto L_0x0247
        L_0x022f:
            com.google.ads.interactivemedia.v3.internal.lv r6 = (com.google.ads.interactivemedia.p367v3.internal.C7104lv) r6
            long r3 = r0.f22886n
            int r1 = r2.f22431g
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.m21099b(r3)
            com.google.ads.interactivemedia.v3.internal.ik r1 = r0.f22876d
            int r1 = r1.f22427c
            r1 = 0
            throw r1
        L_0x0240:
            r5 = 1
            r1.mo16091d(r5)
            r0.f22883k = r4
            goto L_0x0258
        L_0x0247:
            r5 = 1
            com.google.ads.interactivemedia.v3.internal.kr r6 = r0.f22882j
            int r1 = r6.mo16104c(r1, r2, r5)
            if (r1 != r3) goto L_0x0251
            goto L_0x0259
        L_0x0251:
            int r2 = r0.f22888p
            int r2 = r2 - r1
            r0.f22888p = r2
            if (r2 <= 0) goto L_0x025a
        L_0x0258:
            r3 = 0
        L_0x0259:
            return r3
        L_0x025a:
            com.google.ads.interactivemedia.v3.internal.kr r5 = r0.f22882j
            long r1 = r0.f22886n
            long r6 = r0.m21099b(r1)
            r8 = 1
            com.google.ads.interactivemedia.v3.internal.ik r1 = r0.f22876d
            int r9 = r1.f22427c
            r10 = 0
            r11 = 0
            r5.mo16103b(r6, r8, r9, r10, r11)
            long r1 = r0.f22886n
            com.google.ads.interactivemedia.v3.internal.ik r3 = r0.f22876d
            int r3 = r3.f22431g
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.f22886n = r1
            r0.f22888p = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7107ly.m21101i(com.google.ads.interactivemedia.v3.internal.jv):int");
    }

    /* renamed from: j */
    private final boolean m21102j(C7050jv jvVar, boolean z) {
        int i;
        int i2;
        int a;
        int i3 = true != z ? C89885b.S3REQUEST_VALUE : 32768;
        jvVar.mo16097j();
        if (jvVar.mo16099l() == 0) {
            C7243qz a2 = this.f22878f.mo16125a(jvVar, (C7269ry) null);
            this.f22884l = a2;
            if (a2 != null) {
                this.f22877e.mo16124b(a2);
            }
            i = (int) jvVar.mo16098k();
            if (!z) {
                jvVar.mo16091d(i);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!m21103k(jvVar)) {
                this.f22875c.mo14554h(0);
                int v = this.f22875c.mo14568v();
                if ((i2 == 0 || m21100c(v, (long) i2)) && (a = C7013il.m20763a(v)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f22876d.mo16016a(v);
                        i2 = v;
                    }
                    jvVar.mo16096i(a - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            jvVar.mo16097j();
                            jvVar.mo16096i(i + i6);
                        } else {
                            jvVar.mo16091d(1);
                        }
                        i5 = i6;
                        i2 = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw new C6886dt("Searched too many bytes.");
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            jvVar.mo16091d(i + i5);
        } else {
            jvVar.mo16097j();
        }
        this.f22883k = i2;
        return true;
    }

    /* renamed from: k */
    private final boolean m21103k(C7050jv jvVar) {
        C7108lz lzVar = this.f22889q;
        if (lzVar != null) {
            long e = lzVar.mo16130e();
            if (e != -1 && jvVar.mo16098k() > e - 4) {
                return true;
            }
        }
        try {
            return !jvVar.mo16093f(this.f22875c.mo14555i(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: l */
    private final C7108lz m21104l(C7050jv jvVar) {
        jvVar.mo16094g(this.f22875c.mo14555i(), 0, 4);
        this.f22875c.mo14554h(0);
        this.f22876d.mo16016a(this.f22875c.mo14568v());
        return new C7103lu(jvVar.mo16100m(), jvVar.mo16099l(), this.f22876d);
    }

    /* renamed from: a */
    public final void mo16165a() {
        this.f22890r = true;
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        this.f22880h = kaVar;
        C7073kr ak = kaVar.mo16113ak(0, 1);
        this.f22881i = ak;
        this.f22882j = ak;
        this.f22880h.mo16114al();
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        this.f22883k = 0;
        this.f22885m = -9223372036854775807L;
        this.f22886n = 0;
        this.f22888p = 0;
        this.f22891s = j2;
        C7108lz lzVar = this.f22889q;
        if (lzVar instanceof C7104lv) {
            C7104lv lvVar = (C7104lv) lzVar;
            throw null;
        }
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        return m21102j(jvVar, true);
    }

    /* renamed from: h */
    public final int mo16112h(C7050jv jvVar, C7067kl klVar) {
        ary.m19466s(this.f22881i);
        int i = aeu.f20466a;
        int i2 = m21101i(jvVar);
        if (i2 != -1) {
            return i2;
        }
        if (this.f22889q instanceof C7104lv) {
            if (this.f22889q.mo16076c() != m21099b(this.f22886n)) {
                C7104lv lvVar = (C7104lv) this.f22889q;
                throw null;
            }
        }
        return -1;
    }

    public C7107ly(long j) {
        this.f22874b = j;
        this.f22875c = new aee(10);
        this.f22876d = new C7012ik();
        this.f22877e = new C7064ki();
        this.f22885m = -9223372036854775807L;
        this.f22878f = new C7065kj();
        C7052jx jxVar = new C7052jx();
        this.f22879g = jxVar;
        this.f22882j = jxVar;
    }

    public C7107ly(byte[] bArr) {
        this(-9223372036854775807L);
    }
}
