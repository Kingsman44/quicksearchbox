package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.common.C2583aj;
import androidx.media3.common.C2584ak;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2591ar;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.hls.p148a.C3133a;
import androidx.media3.exoplayer.hls.p148a.C3136d;
import androidx.media3.exoplayer.hls.p148a.C3137e;
import androidx.media3.exoplayer.hls.p148a.C3138f;
import androidx.media3.exoplayer.hls.p148a.C3139g;
import androidx.media3.exoplayer.hls.p148a.C3141i;
import androidx.media3.exoplayer.hls.p148a.C3152t;
import androidx.media3.exoplayer.hls.p148a.C3156x;
import androidx.media3.exoplayer.hls.p148a.C3157y;
import androidx.media3.exoplayer.p137a.C2731bt;
import androidx.media3.exoplayer.p139c.C2859b;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p139c.C2868k;
import androidx.media3.exoplayer.p145h.C3005a;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3034aq;
import androidx.media3.exoplayer.p145h.C3035ar;
import androidx.media3.exoplayer.p145h.C3036as;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.exoplayer.p145h.C3129x;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.exoplayer.p151k.C3253s;
import androidx.media3.exoplayer.p151k.C3256v;
import androidx.media3.exoplayer.p151k.C3259y;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2504h;
import java.util.List;

/* compiled from: PG */
public final class HlsMediaSource extends C3005a implements C3156x {

    /* renamed from: a */
    private final C3173m f9190a;

    /* renamed from: b */
    private final C2584ak f9191b;

    /* renamed from: c */
    private final C2868k f9192c;

    /* renamed from: d */
    private final boolean f9193d;

    /* renamed from: e */
    private final int f9194e;

    /* renamed from: f */
    private final C3157y f9195f;

    /* renamed from: g */
    private final long f9196g;

    /* renamed from: h */
    private final C2590aq f9197h;

    /* renamed from: i */
    private C2583aj f9198i;

    /* renamed from: j */
    private C2495an f9199j;

    /* renamed from: k */
    private final C3163c f9200k;

    /* renamed from: l */
    private final C3245k f9201l;

    /* compiled from: PG */
    public final class Factory implements C3035ar {

        /* renamed from: a */
        private C3173m f9202a = C3173m.f9420b;

        /* renamed from: b */
        private C3152t f9203b = new C3133a();

        /* renamed from: c */
        private boolean f9204c = true;

        /* renamed from: d */
        private int f9205d = 1;

        /* renamed from: e */
        private long f9206e = -9223372036854775807L;

        /* renamed from: f */
        private final C3163c f9207f;

        /* renamed from: g */
        private C3129x f9208g = new C3129x();

        /* renamed from: h */
        private C3245k f9209h = new C3245k((byte[]) null);

        /* renamed from: i */
        private C2859b f9210i = new C2859b();

        public Factory(C2504h hVar) {
            this.f9207f = new C3163c(hVar);
        }

        /* renamed from: a */
        public final HlsMediaSource mo6760b(C2590aq aqVar) {
            C2584ak akVar = aqVar.f7154c;
            akVar.getClass();
            C3152t tVar = this.f9203b;
            List list = akVar.f7135e;
            if (!list.isEmpty()) {
                tVar = new C3138f(list);
            }
            return new HlsMediaSource(aqVar, this.f9207f, this.f9202a, C2859b.m7902a(aqVar), this.f9209h, new C3137e(this.f9207f, tVar), this.f9206e, this.f9204c, this.f9205d);
        }
    }

    static {
        C2591ar.m6797b("media3.exoplayer.hls");
    }

    public HlsMediaSource(C2590aq aqVar, C3163c cVar, C3173m mVar, C2868k kVar, C3245k kVar2, C3157y yVar, long j, boolean z, int i) {
        C2584ak akVar = aqVar.f7154c;
        akVar.getClass();
        this.f9191b = akVar;
        this.f9197h = aqVar;
        this.f9198i = aqVar.f7156e;
        this.f9200k = cVar;
        this.f9190a = mVar;
        this.f9192c = kVar;
        this.f9201l = kVar2;
        this.f9195f = yVar;
        this.f9196g = j;
        this.f9193d = z;
        this.f9194e = i;
    }

    /* renamed from: d */
    private static C3139g m9141d(List list, long j) {
        C3139g gVar = null;
        for (int i = 0; i < list.size(); i++) {
            C3139g gVar2 = (C3139g) list.get(i);
            long j2 = gVar2.f9263g;
            if (j2 <= j && gVar2.f9252a) {
                gVar = gVar2;
            } else if (j2 > j) {
                break;
            }
        }
        return gVar;
    }

    /* renamed from: e */
    private static C3141i m9142e(List list, long j) {
        return (C3141i) list.get(C2612ak.m6977b(list, Long.valueOf(j), true, true));
    }

    /* renamed from: a */
    public final C2590aq mo6745a() {
        return this.f9197h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0160  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7122b(androidx.media3.exoplayer.hls.p148a.C3144l r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            boolean r2 = r1.f9287m
            if (r2 == 0) goto L_0x0010
            long r5 = r1.f9279e
            long r5 = androidx.media3.common.p136b.C2612ak.m6918A(r5)
            r10 = r5
            goto L_0x0015
        L_0x0010:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0015:
            int r2 = r1.f9275a
            r5 = 2
            r6 = 1
            if (r2 == r5) goto L_0x0024
            if (r2 != r6) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0025
        L_0x0024:
            r8 = r10
        L_0x0025:
            androidx.media3.exoplayer.hls.n r2 = new androidx.media3.exoplayer.hls.n
            androidx.media3.exoplayer.hls.a.y r7 = r0.f9195f
            androidx.media3.exoplayer.hls.a.e r7 = (androidx.media3.exoplayer.hls.p148a.C3137e) r7
            androidx.media3.exoplayer.hls.a.o r7 = r7.f9245h
            r7.getClass()
            r2.<init>(r7)
            androidx.media3.exoplayer.hls.a.y r7 = r0.f9195f
            androidx.media3.exoplayer.hls.a.e r7 = (androidx.media3.exoplayer.hls.p148a.C3137e) r7
            boolean r12 = r7.f9248k
            if (r12 == 0) goto L_0x0183
            long r13 = r1.f9279e
            long r6 = r7.f9249l
            long r17 = r13 - r6
            boolean r6 = r1.f9286l
            if (r6 == 0) goto L_0x004c
            long r6 = r1.f9292r
            long r6 = r17 + r6
            r22 = r6
            goto L_0x0051
        L_0x004c:
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0051:
            boolean r6 = r1.f9287m
            if (r6 == 0) goto L_0x0066
            long r6 = r0.f9196g
            long r6 = androidx.media3.common.p136b.C2612ak.m6996u(r6)
            long r6 = androidx.media3.common.p136b.C2612ak.m6998w(r6)
            long r13 = r1.f9279e
            long r3 = r1.f9292r
            long r13 = r13 + r3
            long r6 = r6 - r13
            goto L_0x0068
        L_0x0066:
            r6 = 0
        L_0x0068:
            androidx.media3.common.aj r3 = r0.f9198i
            long r3 = r3.f7126a
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r19 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r19 == 0) goto L_0x007e
            long r3 = androidx.media3.common.p136b.C2612ak.m6998w(r3)
            r24 = r3
            r30 = r6
            goto L_0x00b3
        L_0x007e:
            androidx.media3.exoplayer.hls.a.k r3 = r1.f9293s
            r30 = r6
            long r5 = r1.f9276b
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x008c
            long r12 = r1.f9292r
            long r12 = r12 - r5
            goto L_0x00af
        L_0x008c:
            long r12 = r3.f9273d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00a2
            r19 = r12
            long r12 = r1.f9285k
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00a2
            r12 = r19
            goto L_0x00af
        L_0x00a2:
            long r12 = r3.f9272c
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00a9
            goto L_0x00af
        L_0x00a9:
            long r5 = r1.f9284j
            r12 = 3
            long r12 = r12 * r5
        L_0x00af:
            long r12 = r12 + r30
            r24 = r12
        L_0x00b3:
            long r5 = r1.f9292r
            long r28 = r5 + r30
            r26 = r30
            long r5 = androidx.media3.common.p136b.C2612ak.m6994s(r24, r26, r28)
            androidx.media3.common.aq r3 = r0.f9197h
            androidx.media3.common.aj r3 = r3.f7156e
            float r7 = r3.f7129d
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x00e5
            float r3 = r3.f7130e
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x00e5
            androidx.media3.exoplayer.hls.a.k r3 = r1.f9293s
            long r13 = r3.f9272c
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r12 != 0) goto L_0x00e5
            long r12 = r3.f9273d
            int r3 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x00e5
            r3 = 1
            goto L_0x00e6
        L_0x00e5:
            r3 = 0
        L_0x00e6:
            androidx.media3.common.ai r12 = new androidx.media3.common.ai
            r12.<init>()
            long r5 = androidx.media3.common.p136b.C2612ak.m6918A(r5)
            r12.f7121a = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x00f8
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00fc
        L_0x00f8:
            androidx.media3.common.aj r6 = r0.f9198i
            float r6 = r6.f7129d
        L_0x00fc:
            r12.f7124d = r6
            if (r3 == 0) goto L_0x0101
            goto L_0x0105
        L_0x0101:
            androidx.media3.common.aj r3 = r0.f9198i
            float r5 = r3.f7130e
        L_0x0105:
            r12.f7125e = r5
            androidx.media3.common.aj r3 = new androidx.media3.common.aj
            r3.<init>(r12)
            r0.f9198i = r3
            long r5 = r1.f9276b
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x011a
            goto L_0x0127
        L_0x011a:
            long r5 = r1.f9292r
            long r5 = r5 + r30
            androidx.media3.common.aj r3 = r0.f9198i
            long r12 = r3.f7126a
            long r12 = androidx.media3.common.p136b.C2612ak.m6998w(r12)
            long r5 = r5 - r12
        L_0x0127:
            boolean r3 = r1.f9278d
            if (r3 == 0) goto L_0x012c
            goto L_0x0155
        L_0x012c:
            java.util.List r3 = r1.f9290p
            androidx.media3.exoplayer.hls.a.g r3 = m9141d(r3, r5)
            if (r3 == 0) goto L_0x0137
            long r5 = r3.f9263g
            goto L_0x0155
        L_0x0137:
            java.util.List r3 = r1.f9289o
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0142
            r5 = 0
            goto L_0x0155
        L_0x0142:
            java.util.List r3 = r1.f9289o
            androidx.media3.exoplayer.hls.a.i r3 = m9142e(r3, r5)
            java.util.List r12 = r3.f9258b
            androidx.media3.exoplayer.hls.a.g r5 = m9141d(r12, r5)
            if (r5 == 0) goto L_0x0153
            long r5 = r5.f9263g
            goto L_0x0155
        L_0x0153:
            long r5 = r3.f9263g
        L_0x0155:
            int r3 = r1.f9275a
            r4 = 2
            if (r3 != r4) goto L_0x0160
            boolean r3 = r1.f9277c
            if (r3 == 0) goto L_0x0160
            r3 = 1
            goto L_0x0161
        L_0x0160:
            r3 = 0
        L_0x0161:
            androidx.media3.exoplayer.h.cj r4 = new androidx.media3.exoplayer.h.cj
            r7 = r4
            long r14 = r1.f9292r
            r20 = 1
            boolean r1 = r1.f9286l
            r12 = 1
            r21 = r1 ^ 1
            androidx.media3.common.aq r1 = r0.f9197h
            r24 = r1
            androidx.media3.common.aj r1 = r0.f9198i
            r25 = r1
            r12 = r22
            r16 = r17
            r18 = r5
            r22 = r3
            r23 = r2
            r7.<init>(r8, r10, r12, r14, r16, r18, r20, r21, r22, r23, r24, r25)
            goto L_0x01cd
        L_0x0183:
            long r3 = r1.f9276b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x01b2
            java.util.List r3 = r1.f9289o
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0197
            goto L_0x01b2
        L_0x0197:
            boolean r3 = r1.f9278d
            if (r3 != 0) goto L_0x01ad
            long r3 = r1.f9276b
            long r5 = r1.f9292r
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01a4
            goto L_0x01ad
        L_0x01a4:
            java.util.List r5 = r1.f9289o
            androidx.media3.exoplayer.hls.a.i r3 = m9142e(r5, r3)
            long r3 = r3.f9263g
            goto L_0x01af
        L_0x01ad:
            long r3 = r1.f9276b
        L_0x01af:
            r18 = r3
            goto L_0x01b4
        L_0x01b2:
            r18 = 0
        L_0x01b4:
            androidx.media3.exoplayer.h.cj r4 = new androidx.media3.exoplayer.h.cj
            r7 = r4
            long r14 = r1.f9292r
            r12 = r14
            r16 = 0
            r20 = 1
            r21 = 0
            r22 = 1
            androidx.media3.common.aq r1 = r0.f9197h
            r24 = r1
            r25 = 0
            r23 = r2
            r7.<init>(r8, r10, r12, r14, r16, r18, r20, r21, r22, r23, r24, r25)
        L_0x01cd:
            r0.mo6952y(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.mo7122b(androidx.media3.exoplayer.hls.a.l):void");
    }

    /* renamed from: c */
    public final void mo6747c() {
        C3137e eVar = (C3137e) this.f9195f;
        C3256v vVar = eVar.f9242e;
        if (vVar != null) {
            vVar.mo7250c(LinearLayoutManager.INVALID_OFFSET);
        }
        Uri uri = eVar.f9246i;
        if (uri != null) {
            eVar.mo7144g(uri);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.media3.exoplayer.k.o, androidx.media3.exoplayer.hls.a.y] */
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo6750f(C2495an anVar) {
        this.f9199j = anVar;
        this.f9192c.mo6611b();
        C2868k kVar = this.f9192c;
        Looper.myLooper().getClass();
        C2601a.m6829a(this.f8712q);
        kVar.mo6615f();
        C3065bc q = mo6944q((C3036as) null);
        ? r1 = this.f9195f;
        Uri uri = this.f9191b.f7131a;
        C3137e eVar = r1;
        eVar.f9243f = C2612ak.m6922E((Handler.Callback) null);
        eVar.f9241d = q;
        eVar.f9244g = this;
        C3259y yVar = new C3259y(eVar.f9250m.mo7163a(), uri, 4, eVar.f9238a.mo7133a());
        C2601a.m6832d(eVar.f9242e == null);
        eVar.f9242e = new C3256v("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        eVar.f9242e.mo7254g(yVar, r1, C3245k.m9467b(yVar.f9793c));
        q.mo7011j(new C3027aj(yVar.f9792b), yVar.f9793c);
    }

    /* renamed from: h */
    public final void mo6752h(C3034aq aqVar) {
        C3177q qVar = (C3177q) aqVar;
        ((C3137e) qVar.f9448a).f9240c.remove(qVar);
        for (C3185y yVar : qVar.f9450c) {
            if (yVar.f9521n) {
                for (C3184x xVar : yVar.f9516i) {
                    xVar.mo7081q();
                    xVar.mo7085v();
                }
            }
            yVar.f9510c.mo7251d(yVar);
            yVar.f9514g.removeCallbacksAndMessages((Object) null);
            yVar.f9525r = true;
            yVar.f9515h.clear();
        }
        qVar.f9449b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo6753i() {
        C3137e eVar = (C3137e) this.f9195f;
        eVar.f9246i = null;
        eVar.f9247j = null;
        eVar.f9245h = null;
        eVar.f9249l = -9223372036854775807L;
        eVar.f9242e.mo7251d((C3253s) null);
        eVar.f9242e = null;
        for (C3136d dVar : eVar.f9239b.values()) {
            dVar.f9228b.mo7251d((C3253s) null);
        }
        eVar.f9243f.removeCallbacksAndMessages((Object) null);
        eVar.f9243f = null;
        eVar.f9239b.clear();
        this.f9192c.mo6612c();
    }

    /* renamed from: m */
    public final C3034aq mo6757m(C3036as asVar, C3241g gVar, long j) {
        C3065bc q = mo6944q(asVar);
        C2862e p = mo6943p(asVar);
        C3173m mVar = this.f9190a;
        C3157y yVar = this.f9195f;
        C3163c cVar = this.f9200k;
        C2495an anVar = this.f9199j;
        C2868k kVar = this.f9192c;
        C3245k kVar2 = this.f9201l;
        boolean z = this.f9193d;
        int i = this.f9194e;
        C2731bt btVar = this.f8712q;
        C2601a.m6829a(btVar);
        return new C3177q(mVar, yVar, cVar, anVar, kVar, p, kVar2, q, gVar, z, i, btVar);
    }
}
