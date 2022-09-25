package androidx.media3.exoplayer.hls.p148a;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.C2599az;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.exoplayer.p151k.C3249o;
import androidx.media3.exoplayer.p151k.C3252r;
import androidx.media3.exoplayer.p151k.C3256v;
import androidx.media3.exoplayer.p151k.C3259y;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2510n;
import java.io.IOException;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.hls.a.d */
/* compiled from: PG */
public final class C3136d implements C3249o {

    /* renamed from: a */
    public final Uri f9227a;

    /* renamed from: b */
    public final C3256v f9228b = new C3256v("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: c */
    public C3144l f9229c;

    /* renamed from: d */
    public long f9230d;

    /* renamed from: e */
    public long f9231e;

    /* renamed from: f */
    public boolean f9232f;

    /* renamed from: g */
    public IOException f9233g;

    /* renamed from: h */
    final /* synthetic */ C3137e f9234h;

    /* renamed from: i */
    private final C2505i f9235i;

    /* renamed from: j */
    private long f9236j;

    /* renamed from: k */
    private long f9237k;

    public C3136d(C3137e eVar, Uri uri) {
        this.f9234h = eVar;
        this.f9227a = uri;
        this.f9235i = eVar.f9250m.mo7163a();
    }

    /* renamed from: d */
    public final void mo7138d(Uri uri) {
        C3137e eVar = this.f9234h;
        C3259y yVar = new C3259y(this.f9235i, uri, 4, eVar.f9238a.mo7134b(eVar.f9245h, this.f9229c));
        this.f9228b.mo7254g(yVar, this, C3245k.m9467b(yVar.f9793c));
        this.f9234h.f9241d.mo7011j(new C3027aj(yVar.f9792b), yVar.f9793c);
    }

    /* renamed from: e */
    public final void mo7139e(Uri uri) {
        this.f9231e = 0;
        if (!this.f9232f) {
            C3256v vVar = this.f9228b;
            if (!vVar.mo7253f() && !vVar.mo7252e()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.f9237k;
                if (elapsedRealtime < j) {
                    this.f9232f = true;
                    this.f9234h.f9243f.postDelayed(new C3135c(this, uri), j - elapsedRealtime);
                    return;
                }
                mo7138d(uri);
            }
        }
    }

    /* renamed from: eX */
    public final /* bridge */ /* synthetic */ void mo6825eX(C3252r rVar, boolean z) {
        C3259y yVar = (C3259y) rVar;
        long j = yVar.f9791a;
        C2510n nVar = yVar.f9792b;
        C2493al alVar = yVar.f9794d;
        this.f9234h.f9241d.mo7005d(new C3027aj(nVar, (byte[]) null), 4);
    }

    /* renamed from: f */
    public final boolean mo7140f(long j) {
        this.f9231e = SystemClock.elapsedRealtime() + j;
        if (this.f9227a.equals(this.f9234h.f9246i)) {
            C3137e eVar = this.f9234h;
            List list = eVar.f9245h.f9305c;
            int size = list.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = 0;
            while (i < size) {
                C3136d dVar = (C3136d) eVar.f9239b.get(((C3146n) list.get(i)).f9297a);
                dVar.getClass();
                if (elapsedRealtime > dVar.f9231e) {
                    eVar.f9246i = dVar.f9227a;
                    dVar.mo7139e(eVar.mo7142d(eVar.f9246i));
                } else {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: fb */
    public final /* bridge */ /* synthetic */ void mo6826fb(C3252r rVar, long j, long j2) {
        C3259y yVar = (C3259y) rVar;
        C3148p pVar = (C3148p) yVar.f9795e;
        long j3 = yVar.f9791a;
        C2510n nVar = yVar.f9792b;
        C2493al alVar = yVar.f9794d;
        C3027aj ajVar = new C3027aj(nVar, (byte[]) null);
        if (pVar instanceof C3144l) {
            mo7141g((C3144l) pVar);
            this.f9234h.f9241d.mo7007f(ajVar, 4);
        } else {
            this.f9233g = C2599az.m6821c("Loaded playlist has unexpected type.", (Throwable) null);
            this.f9234h.f9241d.mo7009h(ajVar, 4, this.f9233g, true);
        }
        long j4 = yVar.f9791a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: fe */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ androidx.media3.exoplayer.p151k.C3250p mo6827fe(androidx.media3.exoplayer.p151k.C3252r r8, java.io.IOException r9, int r10) {
        /*
            r7 = this;
            androidx.media3.exoplayer.k.y r8 = (androidx.media3.exoplayer.p151k.C3259y) r8
            androidx.media3.exoplayer.h.aj r0 = new androidx.media3.exoplayer.h.aj
            long r1 = r8.f9791a
            androidx.media3.b.n r1 = r8.f9792b
            androidx.media3.b.al r2 = r8.f9794d
            r3 = 0
            r0.<init>(r1, r3)
            android.net.Uri r1 = r2.f6846b
            java.lang.String r2 = "_HLS_msn"
            java.lang.String r1 = r1.getQueryParameter(r2)
            boolean r2 = r9 instanceof androidx.media3.exoplayer.hls.p148a.C3149q
            r3 = 1
            if (r1 != 0) goto L_0x001e
            if (r2 == 0) goto L_0x0036
            r2 = 1
        L_0x001e:
            boolean r1 = r9 instanceof androidx.media3.p132b.C2486ae
            if (r1 == 0) goto L_0x0028
            r1 = r9
            androidx.media3.b.ae r1 = (androidx.media3.p132b.C2486ae) r1
            int r1 = r1.f6832d
            goto L_0x002b
        L_0x0028:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x002b:
            if (r2 != 0) goto L_0x0074
            r2 = 400(0x190, float:5.6E-43)
            if (r1 == r2) goto L_0x0074
            r2 = 503(0x1f7, float:7.05E-43)
            if (r1 != r2) goto L_0x0036
            goto L_0x0074
        L_0x0036:
            int r1 = r8.f9793c
            androidx.media3.exoplayer.k.n r1 = new androidx.media3.exoplayer.k.n
            r1.<init>(r9, r10)
            androidx.media3.exoplayer.hls.a.e r10 = r7.f9234h
            android.net.Uri r2 = r7.f9227a
            r4 = 0
            boolean r10 = r10.mo7146i(r2, r1, r4)
            if (r10 == 0) goto L_0x005e
            long r1 = androidx.media3.exoplayer.p151k.C3245k.m9468c(r1)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x005b
            androidx.media3.exoplayer.k.p r10 = new androidx.media3.exoplayer.k.p
            r10.<init>(r4, r1)
            goto L_0x0060
        L_0x005b:
            androidx.media3.exoplayer.k.p r10 = androidx.media3.exoplayer.p151k.C3256v.f9787c
            goto L_0x0060
        L_0x005e:
            androidx.media3.exoplayer.k.p r10 = androidx.media3.exoplayer.p151k.C3256v.f9786b
        L_0x0060:
            boolean r1 = r10.mo7243a()
            r1 = r1 ^ r3
            androidx.media3.exoplayer.hls.a.e r2 = r7.f9234h
            androidx.media3.exoplayer.h.bc r2 = r2.f9241d
            int r3 = r8.f9793c
            r2.mo7009h(r0, r3, r9, r1)
            if (r1 != 0) goto L_0x0071
            goto L_0x008c
        L_0x0071:
            long r8 = r8.f9791a
            return r10
        L_0x0074:
            long r1 = android.os.SystemClock.elapsedRealtime()
            r7.f9237k = r1
            android.net.Uri r10 = r7.f9227a
            r7.mo7139e(r10)
            androidx.media3.exoplayer.hls.a.e r10 = r7.f9234h
            androidx.media3.exoplayer.h.bc r10 = r10.f9241d
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a
            int r8 = r8.f9793c
            r10.mo7009h(r0, r8, r9, r3)
            androidx.media3.exoplayer.k.p r10 = androidx.media3.exoplayer.p151k.C3256v.f9786b
        L_0x008c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.p148a.C3136d.mo6827fe(androidx.media3.exoplayer.k.r, java.io.IOException, int):androidx.media3.exoplayer.k.p");
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0204  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7141g(androidx.media3.exoplayer.hls.p148a.C3144l r36) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            androidx.media3.exoplayer.hls.a.l r2 = r0.f9229c
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.f9230d = r3
            androidx.media3.exoplayer.hls.a.e r5 = r0.f9234h
            r8 = 0
            if (r2 == 0) goto L_0x00a4
            long r9 = r1.f9282h
            long r11 = r2.f9282h
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x001b
            goto L_0x00a4
        L_0x001b:
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0020
            goto L_0x004c
        L_0x0020:
            java.util.List r9 = r1.f9289o
            int r9 = r9.size()
            java.util.List r10 = r2.f9289o
            int r10 = r10.size()
            int r9 = r9 - r10
            if (r9 == 0) goto L_0x0033
            if (r9 <= 0) goto L_0x004c
            goto L_0x00a4
        L_0x0033:
            java.util.List r9 = r1.f9290p
            int r9 = r9.size()
            java.util.List r10 = r2.f9290p
            int r10 = r10.size()
            if (r9 > r10) goto L_0x00a4
            if (r9 != r10) goto L_0x004c
            boolean r9 = r1.f9286l
            if (r9 == 0) goto L_0x004c
            boolean r9 = r2.f9286l
            if (r9 != 0) goto L_0x004c
            goto L_0x00a4
        L_0x004c:
            boolean r5 = r1.f9286l
            if (r5 == 0) goto L_0x00a1
            boolean r5 = r2.f9286l
            if (r5 == 0) goto L_0x0055
            goto L_0x00a1
        L_0x0055:
            androidx.media3.exoplayer.hls.a.l r5 = new androidx.media3.exoplayer.hls.a.l
            r9 = r5
            int r10 = r2.f9275a
            java.lang.String r11 = r2.f9314t
            java.util.List r12 = r2.f9315u
            long r13 = r2.f9276b
            boolean r15 = r2.f9278d
            long r6 = r2.f9279e
            r16 = r6
            boolean r6 = r2.f9280f
            r18 = r6
            int r6 = r2.f9281g
            r19 = r6
            long r6 = r2.f9282h
            r20 = r6
            int r6 = r2.f9283i
            r22 = r6
            long r6 = r2.f9284j
            r23 = r6
            long r6 = r2.f9285k
            r25 = r6
            boolean r6 = r2.f9316v
            r27 = r6
            r28 = 1
            boolean r6 = r2.f9287m
            r29 = r6
            androidx.media3.common.DrmInitData r6 = r2.f9288n
            r30 = r6
            java.util.List r6 = r2.f9289o
            r31 = r6
            java.util.List r6 = r2.f9290p
            r32 = r6
            androidx.media3.exoplayer.hls.a.k r6 = r2.f9293s
            r33 = r6
            java.util.Map r6 = r2.f9291q
            r34 = r6
            r9.<init>(r10, r11, r12, r13, r15, r16, r18, r19, r20, r22, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0146
        L_0x00a1:
            r5 = r2
            goto L_0x0146
        L_0x00a4:
            boolean r6 = r1.f9287m
            if (r6 == 0) goto L_0x00ad
            long r6 = r1.f9279e
        L_0x00aa:
            r16 = r6
            goto L_0x00da
        L_0x00ad:
            androidx.media3.exoplayer.hls.a.l r6 = r5.f9247j
            if (r6 == 0) goto L_0x00b4
            long r6 = r6.f9279e
            goto L_0x00b6
        L_0x00b4:
            r6 = 0
        L_0x00b6:
            if (r2 != 0) goto L_0x00b9
            goto L_0x00aa
        L_0x00b9:
            java.util.List r9 = r2.f9289o
            int r9 = r9.size()
            androidx.media3.exoplayer.hls.a.i r10 = androidx.media3.exoplayer.hls.p148a.C3137e.m9172e(r2, r1)
            if (r10 == 0) goto L_0x00cb
            long r6 = r2.f9279e
            long r9 = r10.f9263g
        L_0x00c9:
            long r6 = r6 + r9
            goto L_0x00aa
        L_0x00cb:
            long r9 = (long) r9
            long r11 = r1.f9282h
            long r13 = r2.f9282h
            long r11 = r11 - r13
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x00aa
            long r6 = r2.f9279e
            long r9 = r2.f9292r
            goto L_0x00c9
        L_0x00da:
            boolean r6 = r1.f9280f
            if (r6 == 0) goto L_0x00e3
            int r5 = r1.f9281g
        L_0x00e0:
            r19 = r5
            goto L_0x0104
        L_0x00e3:
            androidx.media3.exoplayer.hls.a.l r5 = r5.f9247j
            if (r5 == 0) goto L_0x00ea
            int r5 = r5.f9281g
            goto L_0x00eb
        L_0x00ea:
            r5 = 0
        L_0x00eb:
            if (r2 == 0) goto L_0x00e0
            androidx.media3.exoplayer.hls.a.i r6 = androidx.media3.exoplayer.hls.p148a.C3137e.m9172e(r2, r1)
            if (r6 == 0) goto L_0x00e0
            int r5 = r2.f9281g
            int r6 = r6.f9262f
            int r5 = r5 + r6
            java.util.List r6 = r1.f9289o
            java.lang.Object r6 = r6.get(r8)
            androidx.media3.exoplayer.hls.a.i r6 = (androidx.media3.exoplayer.hls.p148a.C3141i) r6
            int r6 = r6.f9262f
            int r5 = r5 - r6
            goto L_0x00e0
        L_0x0104:
            androidx.media3.exoplayer.hls.a.l r5 = new androidx.media3.exoplayer.hls.a.l
            r9 = r5
            int r10 = r1.f9275a
            java.lang.String r11 = r1.f9314t
            java.util.List r12 = r1.f9315u
            long r13 = r1.f9276b
            boolean r15 = r1.f9278d
            r18 = 1
            long r6 = r1.f9282h
            r20 = r6
            int r6 = r1.f9283i
            r22 = r6
            long r6 = r1.f9284j
            r23 = r6
            long r6 = r1.f9285k
            r25 = r6
            boolean r6 = r1.f9316v
            r27 = r6
            boolean r6 = r1.f9286l
            r28 = r6
            boolean r6 = r1.f9287m
            r29 = r6
            androidx.media3.common.DrmInitData r6 = r1.f9288n
            r30 = r6
            java.util.List r6 = r1.f9289o
            r31 = r6
            java.util.List r6 = r1.f9290p
            r32 = r6
            androidx.media3.exoplayer.hls.a.k r6 = r1.f9293s
            r33 = r6
            java.util.Map r6 = r1.f9291q
            r34 = r6
            r9.<init>(r10, r11, r12, r13, r15, r16, r18, r19, r20, r22, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x0146:
            r0.f9229c = r5
            r6 = 0
            r7 = 1
            if (r5 == r2) goto L_0x0186
            r0.f9233g = r6
            r0.f9236j = r3
            androidx.media3.exoplayer.hls.a.e r1 = r0.f9234h
            android.net.Uri r6 = r0.f9227a
            android.net.Uri r8 = r1.f9246i
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0170
            androidx.media3.exoplayer.hls.a.l r6 = r1.f9247j
            if (r6 != 0) goto L_0x0169
            boolean r6 = r5.f9286l
            r6 = r6 ^ r7
            r1.f9248k = r6
            long r8 = r5.f9279e
            r1.f9249l = r8
        L_0x0169:
            r1.f9247j = r5
            androidx.media3.exoplayer.hls.a.x r6 = r1.f9244g
            r6.mo7122b(r5)
        L_0x0170:
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f9240c
            java.util.Iterator r1 = r1.iterator()
        L_0x0176:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x01cf
            java.lang.Object r5 = r1.next()
            androidx.media3.exoplayer.hls.a.u r5 = (androidx.media3.exoplayer.hls.p148a.C3153u) r5
            r5.mo7135k()
            goto L_0x0176
        L_0x0186:
            boolean r5 = r5.f9286l
            if (r5 != 0) goto L_0x01cf
            long r9 = r1.f9282h
            java.util.List r1 = r1.f9289o
            int r1 = r1.size()
            androidx.media3.exoplayer.hls.a.l r5 = r0.f9229c
            long r11 = (long) r1
            long r9 = r9 + r11
            long r11 = r5.f9282h
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x01a3
            androidx.media3.exoplayer.hls.a.v r6 = new androidx.media3.exoplayer.hls.a.v
            r6.<init>()
            r8 = 1
            goto L_0x01bf
        L_0x01a3:
            long r9 = r0.f9236j
            long r9 = r3 - r9
            double r9 = (double) r9
            long r11 = r5.f9284j
            long r11 = androidx.media3.common.p136b.C2612ak.m6918A(r11)
            double r11 = (double) r11
            r13 = 4615063718147915776(0x400c000000000000, double:3.5)
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r13
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x01bf
            androidx.media3.exoplayer.hls.a.w r6 = new androidx.media3.exoplayer.hls.a.w
            r6.<init>()
        L_0x01bf:
            if (r6 == 0) goto L_0x01cf
            r0.f9233g = r6
            androidx.media3.exoplayer.hls.a.e r1 = r0.f9234h
            android.net.Uri r5 = r0.f9227a
            androidx.media3.exoplayer.k.n r9 = new androidx.media3.exoplayer.k.n
            r9.<init>(r6, r7)
            r1.mo7146i(r5, r9, r8)
        L_0x01cf:
            androidx.media3.exoplayer.hls.a.l r1 = r0.f9229c
            androidx.media3.exoplayer.hls.a.k r5 = r1.f9293s
            boolean r5 = r5.f9274e
            if (r5 != 0) goto L_0x01e2
            if (r1 == r2) goto L_0x01dc
            long r1 = r1.f9284j
            goto L_0x01e4
        L_0x01dc:
            long r1 = r1.f9284j
            r5 = 2
            long r1 = r1 / r5
            goto L_0x01e4
        L_0x01e2:
            r1 = 0
        L_0x01e4:
            long r1 = androidx.media3.common.p136b.C2612ak.m6918A(r1)
            long r3 = r3 + r1
            r0.f9237k = r3
            androidx.media3.exoplayer.hls.a.l r1 = r0.f9229c
            long r1 = r1.f9285k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0204
            android.net.Uri r1 = r0.f9227a
            androidx.media3.exoplayer.hls.a.e r2 = r0.f9234h
            android.net.Uri r2 = r2.f9246i
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0285
        L_0x0204:
            androidx.media3.exoplayer.hls.a.l r1 = r0.f9229c
            boolean r2 = r1.f9286l
            if (r2 != 0) goto L_0x0285
            if (r1 == 0) goto L_0x0280
            androidx.media3.exoplayer.hls.a.k r1 = r1.f9293s
            long r5 = r1.f9270a
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0219
            boolean r1 = r1.f9274e
            if (r1 != 0) goto L_0x0219
            goto L_0x0280
        L_0x0219:
            android.net.Uri r1 = r0.f9227a
            android.net.Uri$Builder r1 = r1.buildUpon()
            androidx.media3.exoplayer.hls.a.l r2 = r0.f9229c
            androidx.media3.exoplayer.hls.a.k r5 = r2.f9293s
            boolean r5 = r5.f9274e
            if (r5 == 0) goto L_0x0263
            long r5 = r2.f9282h
            java.util.List r2 = r2.f9289o
            int r2 = r2.size()
            long r8 = (long) r2
            long r5 = r5 + r8
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "_HLS_msn"
            r1.appendQueryParameter(r5, r2)
            androidx.media3.exoplayer.hls.a.l r2 = r0.f9229c
            long r5 = r2.f9285k
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x0263
            java.util.List r2 = r2.f9290p
            int r5 = r2.size()
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x025a
            java.lang.Object r2 = com.google.common.p4522b.C58557jl.m90131l(r2)
            androidx.media3.exoplayer.hls.a.g r2 = (androidx.media3.exoplayer.hls.p148a.C3139g) r2
            boolean r2 = r2.f9253b
            if (r2 == 0) goto L_0x025a
            int r5 = r5 + -1
        L_0x025a:
            java.lang.String r2 = "_HLS_part"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.appendQueryParameter(r2, r5)
        L_0x0263:
            androidx.media3.exoplayer.hls.a.l r2 = r0.f9229c
            androidx.media3.exoplayer.hls.a.k r2 = r2.f9293s
            long r5 = r2.f9270a
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x027b
            boolean r2 = r2.f9271b
            if (r7 == r2) goto L_0x0274
            java.lang.String r2 = "YES"
            goto L_0x0276
        L_0x0274:
            java.lang.String r2 = "v2"
        L_0x0276:
            java.lang.String r3 = "_HLS_skip"
            r1.appendQueryParameter(r3, r2)
        L_0x027b:
            android.net.Uri r1 = r1.build()
            goto L_0x0282
        L_0x0280:
            android.net.Uri r1 = r0.f9227a
        L_0x0282:
            r0.mo7139e(r1)
        L_0x0285:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.p148a.C3136d.mo7141g(androidx.media3.exoplayer.hls.a.l):void");
    }
}
