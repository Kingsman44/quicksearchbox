package com.android.p261d.p263b;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.android.d.b.c */
/* compiled from: PG */
public final class C5044c {

    /* renamed from: A */
    public static final int f15922A = m13851a(0, 532);

    /* renamed from: B */
    public static final int f15923B = m13851a(0, -32104);

    /* renamed from: C */
    public static final int f15924C;

    /* renamed from: D */
    public static final int f15925D;

    /* renamed from: E */
    public static final int f15926E;

    /* renamed from: F */
    public static final int f15927F;

    /* renamed from: G */
    public static final int f15928G = m13851a(2, -32102);

    /* renamed from: H */
    public static final int f15929H = m13851a(2, -32099);

    /* renamed from: I */
    public static final int f15930I = m13851a(2, -30686);

    /* renamed from: J */
    public static final int f15931J = m13851a(2, -30684);

    /* renamed from: K */
    public static final int f15932K = m13851a(2, -30681);

    /* renamed from: L */
    public static final int f15933L = m13851a(2, -30680);

    /* renamed from: M */
    public static final int f15934M = m13851a(2, -28672);

    /* renamed from: N */
    public static final int f15935N = m13851a(2, -28669);

    /* renamed from: O */
    public static final int f15936O = m13851a(2, -28668);

    /* renamed from: P */
    public static final int f15937P = m13851a(2, -28415);

    /* renamed from: Q */
    public static final int f15938Q = m13851a(2, -28414);

    /* renamed from: R */
    public static final int f15939R = m13851a(2, -28159);

    /* renamed from: S */
    public static final int f15940S = m13851a(2, -28158);

    /* renamed from: T */
    public static final int f15941T = m13851a(2, -28157);

    /* renamed from: U */
    public static final int f15942U = m13851a(2, -28156);

    /* renamed from: V */
    public static final int f15943V = m13851a(2, -28155);

    /* renamed from: W */
    public static final int f15944W = m13851a(2, -28154);

    /* renamed from: X */
    public static final int f15945X = m13851a(2, -28153);

    /* renamed from: Y */
    public static final int f15946Y = m13851a(2, -28152);

    /* renamed from: Z */
    public static final int f15947Z = m13851a(2, -28151);

    /* renamed from: a */
    public static final int f15948a = m13851a(0, 256);

    /* renamed from: aA */
    public static final int f15949aA = m13851a(2, -23549);

    /* renamed from: aB */
    public static final int f15950aB = m13851a(2, -23548);

    /* renamed from: aC */
    public static final int f15951aC = m13851a(2, -23547);

    /* renamed from: aD */
    public static final int f15952aD = m13851a(2, -23546);

    /* renamed from: aE */
    public static final int f15953aE = m13851a(2, -23545);

    /* renamed from: aF */
    public static final int f15954aF = m13851a(2, -23544);

    /* renamed from: aG */
    public static final int f15955aG = m13851a(2, -23543);

    /* renamed from: aH */
    public static final int f15956aH = m13851a(2, -23542);

    /* renamed from: aI */
    public static final int f15957aI = m13851a(2, -23541);

    /* renamed from: aJ */
    public static final int f15958aJ = m13851a(2, -23540);

    /* renamed from: aK */
    public static final int f15959aK = m13851a(2, -23520);

    /* renamed from: aL */
    public static final int f15960aL = m13851a(4, 0);

    /* renamed from: aM */
    public static final int f15961aM = m13851a(4, 1);

    /* renamed from: aN */
    public static final int f15962aN = m13851a(4, 2);

    /* renamed from: aO */
    public static final int f15963aO = m13851a(4, 3);

    /* renamed from: aP */
    public static final int f15964aP = m13851a(4, 4);

    /* renamed from: aQ */
    public static final int f15965aQ = m13851a(4, 5);

    /* renamed from: aR */
    public static final int f15966aR = m13851a(4, 6);

    /* renamed from: aS */
    public static final int f15967aS = m13851a(4, 7);

    /* renamed from: aT */
    public static final int f15968aT = m13851a(4, 8);

    /* renamed from: aU */
    public static final int f15969aU = m13851a(4, 9);

    /* renamed from: aV */
    public static final int f15970aV = m13851a(4, 10);

    /* renamed from: aW */
    public static final int f15971aW = m13851a(4, 11);

    /* renamed from: aX */
    public static final int f15972aX = m13851a(4, 12);

    /* renamed from: aY */
    public static final int f15973aY = m13851a(4, 13);

    /* renamed from: aZ */
    public static final int f15974aZ = m13851a(4, 14);

    /* renamed from: aa */
    public static final int f15975aa = m13851a(2, -28150);

    /* renamed from: ab */
    public static final int f15976ab = m13851a(2, -28140);

    /* renamed from: ac */
    public static final int f15977ac = m13851a(2, -28036);

    /* renamed from: ad */
    public static final int f15978ad = m13851a(2, -28026);

    /* renamed from: ae */
    public static final int f15979ae = m13851a(2, -28016);

    /* renamed from: af */
    public static final int f15980af = m13851a(2, -28015);

    /* renamed from: ag */
    public static final int f15981ag = m13851a(2, -28014);

    /* renamed from: ah */
    public static final int f15982ah = m13851a(2, -24576);

    /* renamed from: ai */
    public static final int f15983ai = m13851a(2, -24575);

    /* renamed from: aj */
    public static final int f15984aj = m13851a(2, -24574);

    /* renamed from: ak */
    public static final int f15985ak = m13851a(2, -24573);

    /* renamed from: al */
    public static final int f15986al = m13851a(2, -24572);

    /* renamed from: am */
    public static final int f15987am;

    /* renamed from: an */
    public static final int f15988an = m13851a(2, -24053);

    /* renamed from: ao */
    public static final int f15989ao = m13851a(2, -24052);

    /* renamed from: ap */
    public static final int f15990ap = m13851a(2, -24050);

    /* renamed from: aq */
    public static final int f15991aq = m13851a(2, -24049);

    /* renamed from: ar */
    public static final int f15992ar = m13851a(2, -24048);

    /* renamed from: as */
    public static final int f15993as = m13851a(2, -24044);

    /* renamed from: at */
    public static final int f15994at = m13851a(2, -24043);

    /* renamed from: au */
    public static final int f15995au = m13851a(2, -24041);

    /* renamed from: av */
    public static final int f15996av = m13851a(2, -23808);

    /* renamed from: aw */
    public static final int f15997aw = m13851a(2, -23807);

    /* renamed from: ax */
    public static final int f15998ax = m13851a(2, -23806);

    /* renamed from: ay */
    public static final int f15999ay = m13851a(2, -23551);

    /* renamed from: az */
    public static final int f16000az = m13851a(2, -23550);

    /* renamed from: b */
    public static final int f16001b = m13851a(0, 257);

    /* renamed from: ba */
    public static final int f16002ba = m13851a(4, 15);

    /* renamed from: bb */
    public static final int f16003bb = m13851a(4, 16);

    /* renamed from: bc */
    public static final int f16004bc = m13851a(4, 17);

    /* renamed from: bd */
    public static final int f16005bd = m13851a(4, 18);

    /* renamed from: be */
    public static final int f16006be = m13851a(4, 19);

    /* renamed from: bf */
    public static final int f16007bf = m13851a(4, 20);

    /* renamed from: bg */
    public static final int f16008bg = m13851a(4, 23);

    /* renamed from: bh */
    public static final int f16009bh = m13851a(4, 24);

    /* renamed from: bi */
    public static final int f16010bi = m13851a(4, 25);

    /* renamed from: bj */
    public static final int f16011bj = m13851a(4, 26);

    /* renamed from: bk */
    public static final int f16012bk = m13851a(4, 27);

    /* renamed from: bl */
    public static final int f16013bl = m13851a(4, 28);

    /* renamed from: bm */
    public static final int f16014bm = m13851a(4, 29);

    /* renamed from: bn */
    public static final int f16015bn = m13851a(4, 30);

    /* renamed from: bo */
    public static final int f16016bo = m13851a(3, 1);

    /* renamed from: bp */
    public static final HashSet f16017bp;

    /* renamed from: bq */
    protected static final HashSet f16018bq;

    /* renamed from: br */
    public static final ByteOrder f16019br = ByteOrder.BIG_ENDIAN;

    /* renamed from: c */
    public static final int f16020c = m13851a(0, 258);

    /* renamed from: d */
    public static final int f16021d = m13851a(0, 259);

    /* renamed from: e */
    public static final int f16022e = m13851a(0, 262);

    /* renamed from: f */
    public static final int f16023f = m13851a(0, 270);

    /* renamed from: g */
    public static final int f16024g = m13851a(0, 271);

    /* renamed from: h */
    public static final int f16025h = m13851a(0, 272);

    /* renamed from: i */
    public static final int f16026i;

    /* renamed from: j */
    public static final int f16027j = m13851a(0, 274);

    /* renamed from: k */
    public static final int f16028k = m13851a(0, 277);

    /* renamed from: l */
    public static final int f16029l = m13851a(0, 278);

    /* renamed from: m */
    public static final int f16030m;

    /* renamed from: n */
    public static final int f16031n = m13851a(0, 282);

    /* renamed from: o */
    public static final int f16032o = m13851a(0, 283);

    /* renamed from: p */
    public static final int f16033p = m13851a(0, 284);

    /* renamed from: q */
    public static final int f16034q = m13851a(0, 296);

    /* renamed from: r */
    public static final int f16035r = m13851a(0, 301);

    /* renamed from: s */
    public static final int f16036s = m13851a(0, 305);

    /* renamed from: t */
    public static final int f16037t = m13851a(0, 306);

    /* renamed from: u */
    public static final int f16038u = m13851a(0, 315);

    /* renamed from: v */
    public static final int f16039v = m13851a(0, 318);

    /* renamed from: w */
    public static final int f16040w = m13851a(0, 319);

    /* renamed from: x */
    public static final int f16041x = m13851a(0, 529);

    /* renamed from: y */
    public static final int f16042y = m13851a(0, 530);

    /* renamed from: z */
    public static final int f16043z = m13851a(0, 531);

    /* renamed from: bs */
    private C5043b f16044bs = new C5043b(f16019br);

    /* renamed from: bt */
    private final DateFormat f16045bt;

    /* renamed from: bu */
    private SparseIntArray f16046bu;

    static {
        int a = m13851a(0, 273);
        f16026i = a;
        int a2 = m13851a(0, 279);
        f16030m = a2;
        int a3 = m13851a(0, -30871);
        f15924C = a3;
        int a4 = m13851a(0, -30683);
        f15925D = a4;
        int a5 = m13851a(1, 513);
        f15926E = a5;
        int a6 = m13851a(1, 514);
        f15927F = a6;
        int a7 = m13851a(2, -24571);
        f15987am = a7;
        HashSet hashSet = new HashSet();
        f16017bp = hashSet;
        hashSet.add(Short.valueOf((short) a4));
        hashSet.add(Short.valueOf((short) a3));
        hashSet.add(Short.valueOf((short) a5));
        hashSet.add(Short.valueOf((short) a7));
        hashSet.add(Short.valueOf((short) a));
        HashSet hashSet2 = new HashSet(hashSet);
        f16018bq = hashSet2;
        hashSet2.add((short) -1);
        hashSet2.add(Short.valueOf((short) a6));
        hashSet2.add(Short.valueOf((short) a2));
    }

    public C5044c() {
        new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd");
        this.f16045bt = simpleDateFormat;
        Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        this.f16046bu = null;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    /* renamed from: a */
    public static int m13851a(int i, short s) {
        return (i << 16) | ((char) s);
    }

    /* renamed from: c */
    protected static int m13852c(int[] iArr) {
        int[] iArr2 = C5051j.f16085a;
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (iArr2[i2] == iArr[i3]) {
                    i |= 1 << i2;
                    break;
                }
                i3++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public static int m13853d(short s) {
        if (s == 3) {
            return 180;
        }
        if (s != 6) {
            return s != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: g */
    public static short m13854g(int i) {
        return (short) i;
    }

    /* renamed from: i */
    protected static boolean m13855i(int i, int i2) {
        int i3 = i >>> 24;
        int[] iArr = C5051j.f16085a;
        for (int i4 = 0; i4 < 5; i4++) {
            if (i2 == iArr[i4] && ((i3 >> i4) & 1) == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int mo9993b(int i) {
        if (mo9994e().get(i) == 0) {
            return -1;
        }
        return i >>> 16;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final SparseIntArray mo9994e() {
        if (this.f16046bu == null) {
            this.f16046bu = new SparseIntArray();
            int c = m13852c(new int[]{0, 1}) << 24;
            int i = c | C89885b.S3REQUEST_VALUE;
            SparseIntArray sparseIntArray = this.f16046bu;
            int i2 = f16024g;
            sparseIntArray.put(i2, i);
            int i3 = c | C89885b.HTTP_MALFORMED_URL_VALUE;
            this.f16046bu.put(f15948a, i3);
            this.f16046bu.put(f16001b, i3);
            this.f16046bu.put(f16020c, 196611 | c);
            int i4 = c | C89885b.GWS_FETCH_INTERRUPTED_VALUE;
            this.f16046bu.put(f16021d, i4);
            this.f16046bu.put(f16022e, i4);
            this.f16046bu.put(f16027j, i4);
            this.f16046bu.put(f16028k, i4);
            this.f16046bu.put(f16033p, i4);
            this.f16046bu.put(f16042y, c | C89885b.GWS_RESPONSE_SIZE_EXCEEDED_VALUE);
            this.f16046bu.put(f16043z, i4);
            int i5 = c | C89885b.OKHTTP_HTTP_PROXY_AUTH_VALUE;
            this.f16046bu.put(f16031n, i5);
            this.f16046bu.put(f16032o, i5);
            this.f16046bu.put(f16034q, i4);
            int i6 = 262144 | c;
            this.f16046bu.put(f16026i, i6);
            this.f16046bu.put(f16029l, i3);
            this.f16046bu.put(f16030m, i6);
            this.f16046bu.put(f16035r, 197376 | c);
            this.f16046bu.put(f16039v, 327682 | c);
            int i7 = 327686 | c;
            this.f16046bu.put(f16040w, i7);
            this.f16046bu.put(f16041x, c | C89885b.OKHTTP_VERSION_NOT_3_VALUE);
            this.f16046bu.put(f15922A, i7);
            this.f16046bu.put(f16037t, c | C89885b.S3REQUEST_BUILD_RAW_AUDIO_DATA_FAILED_VALUE);
            this.f16046bu.put(f16023f, i);
            this.f16046bu.put(i2, i);
            this.f16046bu.put(f16025h, i);
            this.f16046bu.put(f16036s, i);
            this.f16046bu.put(f16038u, i);
            this.f16046bu.put(f15923B, i);
            this.f16046bu.put(f15924C, i3);
            this.f16046bu.put(f15925D, i3);
            int c2 = (m13852c(new int[]{1}) << 24) | C89885b.HTTP_MALFORMED_URL_VALUE;
            this.f16046bu.put(f15926E, c2);
            this.f16046bu.put(f15927F, c2);
            int c3 = m13852c(new int[]{2}) << 24;
            int i8 = 458756 | c3;
            this.f16046bu.put(f15934M, i8);
            this.f16046bu.put(f15982ah, i8);
            int i9 = c3 | C89885b.GWS_FETCH_INTERRUPTED_VALUE;
            this.f16046bu.put(f15983ai, i9);
            this.f16046bu.put(f15937P, i8);
            int i10 = c3 | C89885b.OKHTTP_HTTP_PROXY_AUTH_VALUE;
            this.f16046bu.put(f15938Q, i10);
            int i11 = 262145 | c3;
            this.f16046bu.put(f15984aj, i11);
            this.f16046bu.put(f15985ak, i11);
            int i12 = c3 | 458752;
            this.f16046bu.put(f15977ac, i12);
            this.f16046bu.put(f15978ad, i12);
            this.f16046bu.put(f15986al, c3 | C89885b.S3REQUEST_BUILD_S3_RECOGNIZER_INFO_FAILED_VALUE);
            int i13 = c3 | C89885b.S3REQUEST_BUILD_RAW_AUDIO_DATA_FAILED_VALUE;
            this.f16046bu.put(f15935N, i13);
            this.f16046bu.put(f15936O, i13);
            SparseIntArray sparseIntArray2 = this.f16046bu;
            int i14 = c3 | C89885b.S3REQUEST_VALUE;
            sparseIntArray2.put(f15979ae, i14);
            this.f16046bu.put(f15980af, i14);
            this.f16046bu.put(f15981ag, i14);
            this.f16046bu.put(f15959aK, 131105 | c3);
            this.f16046bu.put(f15928G, i10);
            this.f16046bu.put(f15929H, i10);
            this.f16046bu.put(f15930I, i9);
            this.f16046bu.put(f15931J, i14);
            int i15 = 196608 | c3;
            this.f16046bu.put(f15932K, i15);
            this.f16046bu.put(f15933L, i12);
            int i16 = 655361 | c3;
            this.f16046bu.put(f15939R, i16);
            this.f16046bu.put(f15940S, i10);
            this.f16046bu.put(f15941T, i16);
            this.f16046bu.put(f15942U, i16);
            this.f16046bu.put(f15943V, i10);
            this.f16046bu.put(f15944W, i10);
            this.f16046bu.put(f15945X, i9);
            this.f16046bu.put(f15946Y, i9);
            this.f16046bu.put(f15947Z, i9);
            this.f16046bu.put(f15975aa, i10);
            this.f16046bu.put(f15976ab, i15);
            this.f16046bu.put(f15988an, i10);
            this.f16046bu.put(f15989ao, i12);
            this.f16046bu.put(f15990ap, i10);
            this.f16046bu.put(f15991aq, i10);
            this.f16046bu.put(f15992ar, i9);
            this.f16046bu.put(f15993as, 196610 | c3);
            this.f16046bu.put(f15994at, i10);
            this.f16046bu.put(f15995au, i9);
            int i17 = c3 | 458753;
            this.f16046bu.put(f15996av, i17);
            this.f16046bu.put(f15997aw, i17);
            this.f16046bu.put(f15998ax, i12);
            this.f16046bu.put(f15999ay, i9);
            this.f16046bu.put(f16000az, i9);
            this.f16046bu.put(f15949aA, i9);
            this.f16046bu.put(f15950aB, i10);
            this.f16046bu.put(f15951aC, i9);
            this.f16046bu.put(f15952aD, i9);
            this.f16046bu.put(f15953aE, i10);
            this.f16046bu.put(f15954aF, i9);
            this.f16046bu.put(f15955aG, i9);
            this.f16046bu.put(f15956aH, i9);
            this.f16046bu.put(f15957aI, i12);
            this.f16046bu.put(f15958aJ, i9);
            this.f16046bu.put(f15987am, i11);
            int c4 = m13852c(new int[]{4}) << 24;
            this.f16046bu.put(f15960aL, 65540 | c4);
            int i18 = 131074 | c4;
            this.f16046bu.put(f15961aM, i18);
            this.f16046bu.put(f15963aO, i18);
            int i19 = 655363 | c4;
            this.f16046bu.put(f15962aN, i19);
            this.f16046bu.put(f15964aP, i19);
            this.f16046bu.put(f15965aQ, 65537 | c4);
            int i20 = c4 | C89885b.OKHTTP_HTTP_PROXY_AUTH_VALUE;
            this.f16046bu.put(f15966aR, i20);
            this.f16046bu.put(f15967aS, c4 | C89885b.OKHTTP_VERSION_NOT_3_VALUE);
            int i21 = c4 | C89885b.S3REQUEST_VALUE;
            this.f16046bu.put(f15968aT, i21);
            this.f16046bu.put(f15969aU, i18);
            this.f16046bu.put(f15970aV, i18);
            this.f16046bu.put(f15971aW, i20);
            this.f16046bu.put(f15972aX, i18);
            this.f16046bu.put(f15973aY, i20);
            this.f16046bu.put(f15974aZ, i18);
            this.f16046bu.put(f16002ba, i20);
            this.f16046bu.put(f16003bb, i18);
            this.f16046bu.put(f16004bc, i20);
            this.f16046bu.put(f16005bd, i21);
            this.f16046bu.put(f16006be, i18);
            this.f16046bu.put(f16007bf, i20);
            this.f16046bu.put(f16008bg, i18);
            this.f16046bu.put(f16009bh, i20);
            this.f16046bu.put(f16010bi, i18);
            this.f16046bu.put(f16011bj, i20);
            int i22 = 458752 | c4;
            this.f16046bu.put(f16012bk, i22);
            this.f16046bu.put(f16013bl, i22);
            this.f16046bu.put(f16014bm, 131083 | c4);
            this.f16046bu.put(f16015bn, c4 | C89885b.GWS_CHUNK_PRODUCER_STOPPED_VALUE);
            this.f16046bu.put(f16016bo, (m13852c(new int[]{3}) << 24) | C89885b.S3REQUEST_VALUE);
        }
        return this.f16046bu;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer mo9995f(int r6, int r7) {
        /*
            r5 = this;
            boolean r0 = com.android.p261d.p263b.C5050i.m13867d(r7)
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r6 = r1
            goto L_0x001f
        L_0x0009:
            short r6 = (short) r6
            com.android.d.b.b r0 = r5.f16044bs
            com.android.d.b.j[] r0 = r0.f15918a
            r7 = r0[r7]
            if (r7 != 0) goto L_0x0013
            goto L_0x0007
        L_0x0013:
            java.util.Map r7 = r7.f16087c
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            java.lang.Object r6 = r7.get(r6)
            com.android.d.b.i r6 = (com.android.p261d.p263b.C5050i) r6
        L_0x001f:
            r7 = 0
            if (r6 != 0) goto L_0x0024
        L_0x0022:
            r0 = r1
            goto L_0x003e
        L_0x0024:
            java.lang.Object r6 = r6.f16083h
            if (r6 != 0) goto L_0x0029
            goto L_0x0022
        L_0x0029:
            boolean r0 = r6 instanceof long[]
            if (r0 == 0) goto L_0x0022
            long[] r6 = (long[]) r6
            int r0 = r6.length
            int[] r0 = new int[r0]
            r2 = 0
        L_0x0033:
            int r3 = r6.length
            if (r2 >= r3) goto L_0x003e
            r3 = r6[r2]
            int r4 = (int) r3
            r0[r2] = r4
            int r2 = r2 + 1
            goto L_0x0033
        L_0x003e:
            if (r0 == 0) goto L_0x004b
            int r6 = r0.length
            if (r6 > 0) goto L_0x0044
            goto L_0x004b
        L_0x0044:
            r6 = r0[r7]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p261d.p263b.C5044c.mo9995f(int, int):java.lang.Integer");
    }

    /* renamed from: h */
    public final void mo9996h(InputStream inputStream) {
        try {
            C5049h hVar = new C5049h(inputStream, this);
            C5043b bVar = new C5043b(hVar.f16061a.f15916b.order());
            for (int a = hVar.mo9997a(); a != 5; a = hVar.mo9997a()) {
                if (a == 0) {
                    C5051j jVar = new C5051j(hVar.f16062b);
                    bVar.f15918a[jVar.f16086b] = jVar;
                } else if (a == 1) {
                    C5050i iVar = hVar.f16063c;
                    if (!iVar.mo10002c()) {
                        int i = iVar.f16084i;
                        if (i >= hVar.f16061a.f15915a) {
                            hVar.f16067g.put(Integer.valueOf(i), new C5046e(iVar, true));
                        }
                    } else {
                        bVar.mo9991a(iVar.f16082g).mo10009b(iVar);
                    }
                } else if (a != 2) {
                    int i2 = 0;
                    if (a == 3) {
                        C5050i iVar2 = hVar.f16066f;
                        if (iVar2 != null) {
                            i2 = (int) iVar2.mo10000a(0);
                        }
                        byte[] bArr = new byte[i2];
                        if (i2 == hVar.f16061a.read(bArr)) {
                            bVar.f15919b = bArr;
                        } else {
                            Log.w("ExifReader", "Failed to read the compressed thumbnail");
                        }
                    } else if (a == 4) {
                        C5050i iVar3 = hVar.f16065e;
                        if (iVar3 != null) {
                            i2 = (int) iVar3.mo10000a(0);
                        }
                        byte[] bArr2 = new byte[i2];
                        if (i2 == hVar.f16061a.read(bArr2)) {
                            int i3 = hVar.f16064d.f16051a;
                            if (i3 < bVar.f15920c.size()) {
                                bVar.f15920c.set(i3, bArr2);
                            } else {
                                for (int size = bVar.f15920c.size(); size < i3; size++) {
                                    bVar.f15920c.add((Object) null);
                                }
                                bVar.f15920c.add(bArr2);
                            }
                        } else {
                            Log.w("ExifReader", "Failed to read the strip bytes");
                        }
                    }
                } else {
                    C5050i iVar4 = hVar.f16063c;
                    if (iVar4.f16079d == 7) {
                        hVar.mo9999c(iVar4);
                    }
                    bVar.mo9991a(iVar4.f16082g).mo10009b(iVar4);
                }
            }
            this.f16044bs = bVar;
        } catch (C5045d e) {
            throw new IOException("Invalid exif format : ".concat(e.toString()));
        }
    }
}
