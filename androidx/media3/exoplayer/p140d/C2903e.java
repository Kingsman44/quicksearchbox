package androidx.media3.exoplayer.p140d;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2593at;
import androidx.media3.common.C2600b;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2642bd;
import androidx.media3.common.C2643be;
import androidx.media3.common.C2644bf;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2658bt;
import androidx.media3.common.C2659c;
import androidx.media3.common.C2664h;
import androidx.media3.common.C2672p;
import androidx.media3.common.Metadata;
import androidx.media3.common.p135a.C2568d;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.C2848br;
import androidx.media3.exoplayer.p145h.p146a.C3009d;
import androidx.media3.exoplayer.p145h.p146a.C3015j;
import androidx.media3.p132b.C2503g;
import androidx.media3.p132b.C2510n;
import com.google.ads.interactivemedia.p367v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.AdsLoader;
import com.google.ads.interactivemedia.p367v3.api.AdsManager;
import com.google.ads.interactivemedia.p367v3.api.AdsRequest;
import com.google.ads.interactivemedia.p367v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.p367v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p367v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p367v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate;
import com.google.common.p4522b.C58334be;
import com.google.common.p4522b.C58458fu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.d.e */
/* compiled from: PG */
public final class C2903e implements C2644bf {

    /* renamed from: A */
    public long f8213A;

    /* renamed from: B */
    public long f8214B;

    /* renamed from: C */
    public boolean f8215C;

    /* renamed from: D */
    public long f8216D;

    /* renamed from: E */
    private final List f8217E;

    /* renamed from: F */
    private final C2510n f8218F;

    /* renamed from: G */
    private final C2902d f8219G;

    /* renamed from: H */
    private final Runnable f8220H;

    /* renamed from: I */
    private boolean f8221I;

    /* renamed from: J */
    private boolean f8222J;

    /* renamed from: K */
    private boolean f8223K;

    /* renamed from: a */
    public final Object f8224a;

    /* renamed from: b */
    public final C2649bk f8225b = new C2649bk();

    /* renamed from: c */
    public final Handler f8226c = C2612ak.m6921D(Looper.getMainLooper(), (Handler.Callback) null);

    /* renamed from: d */
    public final List f8227d;

    /* renamed from: e */
    public final List f8228e;

    /* renamed from: f */
    public final C58334be f8229f;

    /* renamed from: g */
    public final AdDisplayContainer f8230g;

    /* renamed from: h */
    public final Runnable f8231h;

    /* renamed from: i */
    public Object f8232i;

    /* renamed from: j */
    public C2646bh f8233j;

    /* renamed from: k */
    public VideoProgressUpdate f8234k;

    /* renamed from: l */
    public VideoProgressUpdate f8235l;

    /* renamed from: m */
    public int f8236m;

    /* renamed from: n */
    public AdsManager f8237n;

    /* renamed from: o */
    public C3009d f8238o;

    /* renamed from: p */
    public C2651bm f8239p;

    /* renamed from: q */
    public long f8240q;

    /* renamed from: r */
    public C2659c f8241r;

    /* renamed from: s */
    public boolean f8242s;

    /* renamed from: t */
    public int f8243t;

    /* renamed from: u */
    public AdMediaInfo f8244u;

    /* renamed from: v */
    public C2901c f8245v;

    /* renamed from: w */
    public boolean f8246w;

    /* renamed from: x */
    public int f8247x;

    /* renamed from: y */
    public C2901c f8248y;

    /* renamed from: z */
    public long f8249z;

    public C2903e(Context context, List list, C2510n nVar, Object obj, ViewGroup viewGroup) {
        C2503g gVar;
        ImaSdkSettings createImaSdkSettings = ImaSdkFactory.getInstance().createImaSdkSettings();
        createImaSdkSettings.setLanguage(C2612ak.m6966ap()[0]);
        createImaSdkSettings.setPlayerType("google/exo.ext.ima");
        createImaSdkSettings.setPlayerVersion("1.0.0-beta02");
        this.f8217E = list;
        this.f8218F = nVar;
        this.f8224a = obj;
        C2902d dVar = new C2902d(this);
        this.f8219G = dVar;
        this.f8227d = new ArrayList();
        this.f8228e = new ArrayList(1);
        this.f8220H = new C2899a(this);
        this.f8229f = new C58458fu(16);
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.f8234k = videoProgressUpdate;
        this.f8235l = videoProgressUpdate;
        this.f8249z = -9223372036854775807L;
        this.f8213A = -9223372036854775807L;
        this.f8214B = -9223372036854775807L;
        this.f8216D = -9223372036854775807L;
        this.f8240q = -9223372036854775807L;
        this.f8239p = C2651bm.f7353c;
        this.f8241r = C2659c.f7412a;
        this.f8231h = new C2900b(this);
        if (viewGroup != null) {
            this.f8230g = ImaSdkFactory.createAdDisplayContainer(viewGroup, dVar);
        } else {
            this.f8230g = ImaSdkFactory.createAudioAdDisplayContainer(context, dVar);
        }
        AdsLoader createAdsLoader = ImaSdkFactory.getInstance().createAdsLoader(context, createImaSdkSettings, this.f8230g);
        createAdsLoader.addAdErrorListener(dVar);
        createAdsLoader.addAdsLoadedListener(dVar);
        try {
            AdsRequest createAdsRequest = ImaSdkFactory.getInstance().createAdsRequest();
            if ("data".equals(nVar.f6891a.getScheme())) {
                gVar = new C2503g();
                gVar.mo5880b(nVar);
                byte[] bArr = new byte[1024];
                int i = 0;
                int i2 = 0;
                while (i != -1) {
                    int length = bArr.length;
                    bArr = i2 == length ? Arrays.copyOf(bArr, length + length) : bArr;
                    i = gVar.mo5879a(bArr, i2, bArr.length - i2);
                    if (i != -1) {
                        i2 += i;
                    }
                }
                createAdsRequest.setAdsResponse(C2612ak.m6929L(Arrays.copyOf(bArr, i2)));
                gVar.mo5882d();
            } else {
                createAdsRequest.setAdTagUrl(nVar.f6891a.toString());
            }
            Object obj2 = new Object();
            this.f8232i = obj2;
            createAdsRequest.setUserRequestContext(obj2);
            createAdsRequest.setContentProgressProvider(this.f8219G);
            createAdsLoader.requestAds(createAdsRequest);
        } catch (IOException e) {
            this.f8241r = new C2659c(this.f8224a, new long[0]);
            mo6737R();
            this.f8238o = new C3009d(e);
            mo6735P();
        } catch (Throwable th) {
            gVar.mo5882d();
            throw th;
        }
    }

    /* renamed from: I */
    public static long m8095I(C2646bh bhVar, C2651bm bmVar, C2649bk bkVar) {
        long j = bhVar.mo6003j();
        if (bmVar.mo6304o()) {
            return j;
        }
        return j - C2612ak.m6918A(bmVar.mo6023d(bhVar.mo5997d(), bkVar, false).f7332e);
    }

    /* renamed from: U */
    private final int m8096U() {
        C2646bh bhVar = this.f8233j;
        if (bhVar == null) {
            return -1;
        }
        long w = C2612ak.m6998w(m8095I(bhVar, this.f8239p, this.f8225b));
        int b = this.f8241r.mo6320b(w, C2612ak.m6998w(this.f8240q));
        return b == -1 ? this.f8241r.mo6319a(w, C2612ak.m6998w(this.f8240q)) : b;
    }

    /* renamed from: V */
    private final void m8097V() {
        if (!this.f8222J && this.f8240q != -9223372036854775807L && this.f8214B == -9223372036854775807L) {
            C2646bh bhVar = this.f8233j;
            bhVar.getClass();
            if (m8095I(bhVar, this.f8239p, this.f8225b) + 5000 >= this.f8240q) {
                m8100Y();
            }
        }
    }

    /* renamed from: X */
    private final void m8099X() {
        int a;
        C2646bh bhVar = this.f8233j;
        if (this.f8237n != null && bhVar != null) {
            if (!this.f8246w && !bhVar.mo5989Q()) {
                m8097V();
                if (!this.f8222J && !this.f8239p.mo6304o()) {
                    long I = m8095I(bhVar, this.f8239p, this.f8225b);
                    this.f8239p.mo6023d(bhVar.mo5997d(), this.f8225b, false);
                    if (this.f8225b.mo6282c(C2612ak.m6998w(I)) != -1) {
                        this.f8215C = false;
                        this.f8214B = I;
                    }
                }
            }
            boolean z = this.f8246w;
            int i = this.f8247x;
            boolean Q = bhVar.mo5989Q();
            this.f8246w = Q;
            int b = Q ? bhVar.mo5995b() : -1;
            this.f8247x = b;
            if (z && b != i) {
                AdMediaInfo adMediaInfo = this.f8244u;
                if (adMediaInfo == null) {
                    C2633u.m7050e("AdTagLoader", "onEnded without ad media info");
                } else {
                    C2901c cVar = (C2901c) this.f8229f.get(adMediaInfo);
                    int i2 = this.f8247x;
                    if (i2 == -1 || (cVar != null && cVar.f8211b < i2)) {
                        for (int i3 = 0; i3 < this.f8228e.size(); i3++) {
                            ((VideoAdPlayer.VideoAdPlayerCallback) this.f8228e.get(i3)).onEnded(adMediaInfo);
                        }
                    }
                }
            }
            if (!this.f8222J && !z && this.f8246w && this.f8243t == 0) {
                C2600b c = this.f8241r.mo6321c(bhVar.mo5994a());
                if (c.f7218a == Long.MIN_VALUE) {
                    m8100Y();
                } else {
                    this.f8249z = SystemClock.elapsedRealtime();
                    long A = C2612ak.m6918A(c.f7218a);
                    this.f8213A = A;
                    if (A == Long.MIN_VALUE) {
                        this.f8213A = this.f8240q;
                    }
                }
            }
            C2646bh bhVar2 = this.f8233j;
            if (bhVar2 != null && (a = bhVar2.mo5994a()) != -1) {
                C2600b c2 = this.f8241r.mo6321c(a);
                int b2 = bhVar2.mo5995b();
                int i4 = c2.f7219b;
                if (i4 == -1 || i4 <= b2 || c2.f7221d[b2] == 0) {
                    this.f8226c.removeCallbacks(this.f8231h);
                    this.f8226c.postDelayed(this.f8231h, 10000);
                }
            }
        }
    }

    /* renamed from: Y */
    private final void m8100Y() {
        int i = 0;
        for (int i2 = 0; i2 < this.f8228e.size(); i2++) {
            ((VideoAdPlayer.VideoAdPlayerCallback) this.f8228e.get(i2)).onContentComplete();
        }
        this.f8222J = true;
        while (true) {
            C2659c cVar = this.f8241r;
            if (i < cVar.f7415c) {
                if (cVar.mo6321c(i).f7218a != Long.MIN_VALUE) {
                    this.f8241r = this.f8241r.mo6326g(i);
                }
                i++;
            } else {
                mo6737R();
                return;
            }
        }
    }

    /* renamed from: A */
    public final /* synthetic */ void mo6220A(boolean z) {
    }

    /* renamed from: B */
    public final /* synthetic */ void mo6221B(int i, int i2) {
    }

    /* renamed from: C */
    public final void mo6222C(C2651bm bmVar, int i) {
        if (!bmVar.mo6304o()) {
            this.f8239p = bmVar;
            C2646bh bhVar = this.f8233j;
            bhVar.getClass();
            long j = bmVar.mo6023d(bhVar.mo5997d(), this.f8225b, false).f7331d;
            this.f8240q = C2612ak.m6918A(j);
            C2659c cVar = this.f8241r;
            long j2 = cVar.f7417e;
            if (j != j2) {
                if (j2 != j) {
                    Object obj = cVar.f7414b;
                    C2600b[] bVarArr = cVar.f7419g;
                    long j3 = cVar.f7416d;
                    int i2 = cVar.f7418f;
                    cVar = new C2659c(obj, bVarArr, j3, j);
                }
                this.f8241r = cVar;
                mo6737R();
            }
            mo6733N(m8095I(bhVar, bmVar, this.f8225b), this.f8240q);
            m8099X();
        }
    }

    /* renamed from: D */
    public final /* synthetic */ void mo6223D(C2657bs bsVar) {
    }

    /* renamed from: E */
    public final /* synthetic */ void mo6224E(C2658bt btVar) {
    }

    /* renamed from: F */
    public final /* synthetic */ void mo6225F(float f) {
    }

    /* renamed from: G */
    public final int mo6727G(double d) {
        double d2 = (double) ((float) d);
        Double.isNaN(d2);
        long round = Math.round(d2 * 1000000.0d);
        int i = 0;
        while (true) {
            C2659c cVar = this.f8241r;
            if (i < cVar.f7415c) {
                long j = cVar.mo6321c(i).f7218a;
                if (j != Long.MIN_VALUE && Math.abs(j - round) < 1000) {
                    return i;
                }
                i++;
            } else {
                throw new IllegalStateException("Failed to find cue point");
            }
        }
    }

    /* renamed from: H */
    public final int mo6728H() {
        C2646bh bhVar = this.f8233j;
        if (bhVar == null) {
            return this.f8236m;
        }
        if (!bhVar.mo6272ar(22)) {
            return bhVar.mo6015v().mo6314a(1) ? 100 : 0;
        }
        C2848br brVar = (C2848br) bhVar;
        brVar.mo6600aQ();
        return (int) (brVar.f8012y * 100.0f);
    }

    /* renamed from: J */
    public final VideoProgressUpdate mo6729J() {
        C2646bh bhVar = this.f8233j;
        if (bhVar == null) {
            return this.f8235l;
        }
        if (this.f8243t == 0 || !this.f8246w) {
            return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        }
        long l = bhVar.mo6005l();
        if (l == -9223372036854775807L) {
            return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        }
        return new VideoProgressUpdate(this.f8233j.mo6004k(), l);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate mo6730K() {
        /*
            r8 = this;
            long r0 = r8.f8240q
            r2 = 1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            long r5 = r8.f8214B
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0019
            r8.f8215C = r2
        L_0x0017:
            r2 = r0
            goto L_0x0043
        L_0x0019:
            androidx.media3.common.bh r1 = r8.f8233j
            if (r1 != 0) goto L_0x0020
            com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate r0 = r8.f8234k
            return r0
        L_0x0020:
            long r5 = r8.f8249z
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0031
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r8.f8249z
            long r5 = r8.f8213A
            long r1 = r1 - r3
            long r5 = r5 + r1
            goto L_0x0017
        L_0x0031:
            int r3 = r8.f8243t
            if (r3 != 0) goto L_0x0050
            boolean r3 = r8.f8246w
            if (r3 != 0) goto L_0x0050
            if (r0 == 0) goto L_0x0050
            androidx.media3.common.bm r0 = r8.f8239p
            androidx.media3.common.bk r3 = r8.f8225b
            long r5 = m8095I(r1, r0, r3)
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            long r0 = r8.f8240q
            goto L_0x004a
        L_0x0048:
            r0 = -1
        L_0x004a:
            com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate r2 = new com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate
            r2.<init>(r5, r0)
            return r2
        L_0x0050:
            com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate r0 = com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate.VIDEO_TIME_NOT_READY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p140d.C2903e.mo6730K():com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate");
    }

    /* renamed from: L */
    public final void mo6731L(Exception exc) {
        int U = m8096U();
        if (U == -1) {
            C2633u.m7050e("AdTagLoader", C2633u.m7046a("Unable to determine ad group index for ad group load error", exc));
            return;
        }
        mo6732M(U);
        if (this.f8238o == null) {
            this.f8238o = new C3009d(new IOException("Failed to load ad group " + U, exc));
        }
    }

    /* renamed from: M */
    public final void mo6732M(int i) {
        C2600b c = this.f8241r.mo6321c(i);
        if (c.f7219b == -1) {
            C2659c d = this.f8241r.mo6322d(i, Math.max(1, c.f7221d.length));
            this.f8241r = d;
            c = d.mo6321c(i);
        }
        for (int i2 = 0; i2 < c.f7219b; i2++) {
            if (c.f7221d[i2] == 0) {
                this.f8241r = this.f8241r.mo6323e(i, i2);
            }
        }
        mo6737R();
        this.f8214B = -9223372036854775807L;
        this.f8249z = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (r7 != Long.MIN_VALUE) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r7.mo6321c(1).f7218a == Long.MIN_VALUE) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071 A[LOOP:0: B:19:0x0071->B:20:0x0073, LOOP_START, PHI: r13 
      PHI: (r13v1 int) = (r13v0 int), (r13v3 int) binds: [B:18:0x006f, B:20:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6733N(long r17, long r19) {
        /*
            r16 = this;
            r0 = r16
            com.google.ads.interactivemedia.v3.api.AdsManager r1 = r0.f8237n
            boolean r2 = r0.f8221I
            if (r2 != 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d9
            r2 = 1
            r0.f8221I = r2
            com.google.ads.interactivemedia.v3.api.ImaSdkFactory r3 = com.google.ads.interactivemedia.p367v3.api.ImaSdkFactory.getInstance()
            com.google.ads.interactivemedia.v3.api.AdsRenderingSettings r3 = r3.createAdsRenderingSettings()
            r3.setEnablePreloading(r2)
            java.util.List r4 = r0.f8217E
            r3.setMimeTypes(r4)
            r3.setFocusSkipButtonWhenAvailable(r2)
            androidx.media3.common.c r4 = r0.f8241r
            long r5 = androidx.media3.common.p136b.C2612ak.m6998w(r17)
            long r7 = androidx.media3.common.p136b.C2612ak.m6998w(r19)
            int r4 = r4.mo6320b(r5, r7)
            r5 = 0
            r6 = -1
            if (r4 == r6) goto L_0x00b6
            androidx.media3.common.c r7 = r0.f8241r
            androidx.media3.common.b r7 = r7.mo6321c(r4)
            long r7 = r7.f7218a
            androidx.media3.common.c r7 = r0.f8241r
            int r8 = r7.f7415c
            r9 = 0
            r11 = -9223372036854775808
            r13 = 0
            if (r8 != r2) goto L_0x0054
            androidx.media3.common.b r2 = r7.mo6321c(r13)
            long r7 = r2.f7218a
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x006f
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x006f
            goto L_0x006b
        L_0x0054:
            r14 = 2
            if (r8 != r14) goto L_0x006b
            androidx.media3.common.b r8 = r7.mo6321c(r13)
            long r14 = r8.f7218a
            int r8 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x006b
            androidx.media3.common.b r2 = r7.mo6321c(r2)
            long r7 = r2.f7218a
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x006f
        L_0x006b:
            r7 = r17
            r0.f8214B = r7
        L_0x006f:
            if (r4 <= 0) goto L_0x00b6
        L_0x0071:
            if (r13 >= r4) goto L_0x007e
            androidx.media3.common.c r2 = r0.f8241r
            androidx.media3.common.c r2 = r2.mo6326g(r13)
            r0.f8241r = r2
            int r13 = r13 + 1
            goto L_0x0071
        L_0x007e:
            androidx.media3.common.c r2 = r0.f8241r
            int r7 = r2.f7415c
            if (r4 != r7) goto L_0x0086
            r3 = r5
            goto L_0x00b6
        L_0x0086:
            androidx.media3.common.b r2 = r2.mo6321c(r4)
            long r7 = r2.f7218a
            androidx.media3.common.c r2 = r0.f8241r
            int r4 = r4 + r6
            androidx.media3.common.b r2 = r2.mo6321c(r4)
            long r9 = r2.f7218a
            r13 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x00aa
            double r6 = (double) r9
            java.lang.Double.isNaN(r6)
            double r6 = r6 / r13
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 + r8
            r3.setPlayAdsAfterTime(r6)
            goto L_0x00b6
        L_0x00aa:
            long r7 = r7 + r9
            double r6 = (double) r7
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Double.isNaN(r6)
            double r6 = r6 / r8
            double r6 = r6 / r13
            r3.setPlayAdsAfterTime(r6)
        L_0x00b6:
            if (r3 != 0) goto L_0x00d0
            com.google.ads.interactivemedia.v3.api.AdsManager r1 = r0.f8237n
            if (r1 == 0) goto L_0x00d6
            androidx.media3.exoplayer.d.d r2 = r0.f8219G
            r1.removeAdErrorListener(r2)
            com.google.ads.interactivemedia.v3.api.AdsManager r1 = r0.f8237n
            androidx.media3.exoplayer.d.d r2 = r0.f8219G
            r1.removeAdEventListener(r2)
            com.google.ads.interactivemedia.v3.api.AdsManager r1 = r0.f8237n
            r1.destroy()
            r0.f8237n = r5
            goto L_0x00d6
        L_0x00d0:
            r1.init(r3)
            r1.start()
        L_0x00d6:
            r16.mo6737R()
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p140d.C2903e.mo6733N(long, long):void");
    }

    /* renamed from: O */
    public final void mo6734O(String str, Exception exc) {
        String concat = "Internal error in ".concat(str);
        C2633u.m7048c("AdTagLoader", C2633u.m7046a(concat, exc));
        int i = 0;
        while (true) {
            C2659c cVar = this.f8241r;
            if (i >= cVar.f7415c) {
                break;
            }
            this.f8241r = cVar.mo6326g(i);
            i++;
        }
        mo6737R();
        for (int i2 = 0; i2 < this.f8227d.size(); i2++) {
            ((C3015j) this.f8227d.get(i2)).mo6960a(new C3009d(new RuntimeException(concat, exc)), this.f8218F);
        }
    }

    /* renamed from: P */
    public final void mo6735P() {
        if (this.f8238o != null) {
            for (int i = 0; i < this.f8227d.size(); i++) {
                ((C3015j) this.f8227d.get(i)).mo6960a(this.f8238o, this.f8218F);
            }
            this.f8238o = null;
        }
    }

    /* renamed from: Q */
    public final void mo6736Q() {
        this.f8226c.removeCallbacks(this.f8220H);
    }

    /* renamed from: R */
    public final void mo6737R() {
        for (int i = 0; i < this.f8227d.size(); i++) {
            ((C3015j) this.f8227d.get(i)).mo6961b(this.f8241r);
        }
    }

    /* renamed from: S */
    public final void mo6738S() {
        VideoProgressUpdate J = mo6729J();
        AdMediaInfo adMediaInfo = this.f8244u;
        adMediaInfo.getClass();
        for (int i = 0; i < this.f8228e.size(); i++) {
            ((VideoAdPlayer.VideoAdPlayerCallback) this.f8228e.get(i)).onAdProgress(adMediaInfo, J);
        }
        this.f8226c.removeCallbacks(this.f8220H);
        this.f8226c.postDelayed(this.f8220H, 200);
    }

    /* renamed from: T */
    public final boolean mo6739T() {
        int U;
        C2646bh bhVar = this.f8233j;
        if (bhVar == null || (U = m8096U()) == -1) {
            return false;
        }
        C2600b c = this.f8241r.mo6321c(U);
        int i = c.f7219b;
        if ((i == -1 || i == 0 || c.f7221d[0] == 0) && C2612ak.m6918A(c.f7218a) - m8095I(bhVar, this.f8239p, this.f8225b) < 10000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6226a(C2664h hVar) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6227b(C2642bd bdVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6228c(C2568d dVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo6229d(List list) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo6230e(C2672p pVar) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo6231f(int i, boolean z) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo6232g(C2646bh bhVar, C2643be beVar) {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo6233h(boolean z) {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo6234i(boolean z) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo6235j(boolean z) {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo6236k(C2590aq aqVar, int i) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo6237l(C2593at atVar) {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo6238m(Metadata metadata) {
    }

    /* renamed from: o */
    public final /* synthetic */ void mo6240o(C2640bb bbVar) {
    }

    /* renamed from: p */
    public final void mo6241p(int i) {
        C2646bh bhVar = this.f8233j;
        if (this.f8237n != null && bhVar != null) {
            int i2 = 2;
            if (i == 2) {
                if (bhVar.mo5989Q() || !mo6739T()) {
                    i = 2;
                } else {
                    this.f8216D = SystemClock.elapsedRealtime();
                    m8098W(bhVar.mo5987O(), i2);
                }
            }
            if (i == 3) {
                this.f8216D = -9223372036854775807L;
            }
            i2 = i;
            m8098W(bhVar.mo5987O(), i2);
        }
    }

    /* renamed from: q */
    public final /* synthetic */ void mo6242q(int i) {
    }

    /* renamed from: r */
    public final void mo6243r(C2639ba baVar) {
        if (this.f8243t != 0) {
            AdMediaInfo adMediaInfo = this.f8244u;
            adMediaInfo.getClass();
            for (int i = 0; i < this.f8228e.size(); i++) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.f8228e.get(i)).onError(adMediaInfo);
            }
        }
    }

    /* renamed from: s */
    public final /* synthetic */ void mo6244s(C2639ba baVar) {
    }

    /* renamed from: t */
    public final /* synthetic */ void mo6245t(boolean z, int i) {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo6246u(int i) {
    }

    /* renamed from: v */
    public final void mo6247v(C2645bg bgVar, C2645bg bgVar2, int i) {
        m8099X();
    }

    /* renamed from: w */
    public final /* synthetic */ void mo6248w() {
    }

    /* renamed from: x */
    public final /* synthetic */ void mo6249x(int i) {
    }

    /* renamed from: y */
    public final /* synthetic */ void mo6250y() {
    }

    /* renamed from: z */
    public final /* synthetic */ void mo6251z(boolean z) {
    }

    /* renamed from: W */
    private final void m8098W(boolean z, int i) {
        if (this.f8246w && this.f8243t == 1) {
            if (!this.f8223K) {
                if (i == 2) {
                    this.f8223K = true;
                    AdMediaInfo adMediaInfo = this.f8244u;
                    adMediaInfo.getClass();
                    for (int i2 = 0; i2 < this.f8228e.size(); i2++) {
                        ((VideoAdPlayer.VideoAdPlayerCallback) this.f8228e.get(i2)).onBuffering(adMediaInfo);
                    }
                    mo6736Q();
                    i = 2;
                }
            } else if (i == 3) {
                this.f8223K = false;
                mo6738S();
                i = 3;
            }
        }
        if (this.f8243t == 0) {
            if (i == 2 && z) {
                m8097V();
            }
        } else if (i == 4) {
            AdMediaInfo adMediaInfo2 = this.f8244u;
            if (adMediaInfo2 != null) {
                for (int i3 = 0; i3 < this.f8228e.size(); i3++) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) this.f8228e.get(i3)).onEnded(adMediaInfo2);
                }
                return;
            }
            C2633u.m7050e("AdTagLoader", "onEnded without ad media info");
        }
    }

    /* renamed from: n */
    public final void mo6239n(boolean z, int i) {
        C2646bh bhVar;
        AdsManager adsManager = this.f8237n;
        if (adsManager != null && (bhVar = this.f8233j) != null) {
            int i2 = this.f8243t;
            if (i2 == 1) {
                if (!z) {
                    adsManager.pause();
                    return;
                }
            } else if (i2 == 2 && z) {
                adsManager.resume();
                return;
            }
            m8098W(z, bhVar.mo5998e());
        }
    }
}
