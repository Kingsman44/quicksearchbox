package androidx.media3.exoplayer.p137a;

import android.content.Context;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C2584ak;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2658bt;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C3004h;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3032ao;
import androidx.media3.exoplayer.p145h.C3036as;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: androidx.media3.exoplayer.a.bp */
/* compiled from: PG */
public final class C2727bp implements C2733d, C2728bq {

    /* renamed from: A */
    private boolean f7578A;

    /* renamed from: a */
    public final PlaybackSession f7579a;

    /* renamed from: b */
    private final Context f7580b;

    /* renamed from: c */
    private final C2729br f7581c;

    /* renamed from: d */
    private final long f7582d = SystemClock.elapsedRealtime();

    /* renamed from: e */
    private final C2650bl f7583e = new C2650bl();

    /* renamed from: f */
    private final C2649bk f7584f = new C2649bk();

    /* renamed from: g */
    private final HashMap f7585g = new HashMap();

    /* renamed from: h */
    private final HashMap f7586h = new HashMap();

    /* renamed from: i */
    private String f7587i;

    /* renamed from: j */
    private PlaybackMetrics.Builder f7588j;

    /* renamed from: k */
    private int f7589k;

    /* renamed from: l */
    private int f7590l = 0;

    /* renamed from: m */
    private int f7591m = 0;

    /* renamed from: n */
    private C2639ba f7592n;

    /* renamed from: o */
    private C2726bo f7593o;

    /* renamed from: p */
    private C2726bo f7594p;

    /* renamed from: q */
    private C2726bo f7595q;

    /* renamed from: r */
    private C2680x f7596r;

    /* renamed from: s */
    private C2680x f7597s;

    /* renamed from: t */
    private C2680x f7598t;

    /* renamed from: u */
    private boolean f7599u;

    /* renamed from: v */
    private int f7600v;

    /* renamed from: w */
    private boolean f7601w;

    /* renamed from: x */
    private int f7602x;

    /* renamed from: y */
    private int f7603y;

    /* renamed from: z */
    private int f7604z;

    private C2727bp(Context context, PlaybackSession playbackSession) {
        this.f7580b = context.getApplicationContext();
        this.f7579a = playbackSession;
        C2725bn bnVar = new C2725bn((byte[]) null);
        this.f7581c = bnVar;
        C2725bn bnVar2 = bnVar;
        bnVar.f7571c = this;
    }

    /* renamed from: E */
    private static int m7513E(int i) {
        switch (C2612ak.m6986k(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    /* renamed from: F */
    private final void m7514F() {
        long j;
        long j2;
        PlaybackMetrics.Builder builder = this.f7588j;
        if (builder != null && this.f7578A) {
            builder.setAudioUnderrunCount(this.f7604z);
            this.f7588j.setVideoFramesDropped(this.f7602x);
            this.f7588j.setVideoFramesPlayed(this.f7603y);
            Long l = (Long) this.f7585g.get(this.f7587i);
            PlaybackMetrics.Builder builder2 = this.f7588j;
            if (l == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(j);
            Long l2 = (Long) this.f7586h.get(this.f7587i);
            PlaybackMetrics.Builder builder3 = this.f7588j;
            if (l2 == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(j2);
            this.f7588j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f7579a.reportPlaybackMetrics(this.f7588j.build());
        }
        this.f7588j = null;
        this.f7587i = null;
        this.f7604z = 0;
        this.f7602x = 0;
        this.f7603y = 0;
        this.f7596r = null;
        this.f7597s = null;
        this.f7598t = null;
        this.f7578A = false;
    }

    /* renamed from: G */
    private final void m7515G(long j, C2680x xVar, int i) {
        if (!C2612ak.m6951aa(this.f7597s, xVar)) {
            int i2 = (this.f7597s == null && i == 0) ? 1 : i;
            this.f7597s = xVar;
            m7519K(0, j, xVar, i2);
        }
    }

    /* renamed from: H */
    private final void m7516H(long j, C2680x xVar, int i) {
        if (!C2612ak.m6951aa(this.f7598t, xVar)) {
            int i2 = (this.f7598t == null && i == 0) ? 1 : i;
            this.f7598t = xVar;
            m7519K(2, j, xVar, i2);
        }
    }

    /* renamed from: I */
    private final void m7517I(C2651bm bmVar, C3036as asVar) {
        int a;
        PlaybackMetrics.Builder builder = this.f7588j;
        if (asVar != null && (a = bmVar.mo6020a(asVar.f7204a)) != -1) {
            int i = 0;
            bmVar.mo6023d(a, this.f7584f, false);
            bmVar.mo6024e(this.f7584f.f7330c, this.f7583e, 0);
            C2584ak akVar = this.f7583e.f7338c.f7154c;
            int i2 = 2;
            if (akVar != null) {
                int p = C2612ak.m6991p(akVar.f7131a);
                i = p != 0 ? p != 1 ? p != 2 ? 1 : 4 : 5 : 3;
            }
            builder.setStreamType(i);
            C2650bl blVar = this.f7583e;
            if (blVar.f7349n != -9223372036854775807L && !blVar.f7347l && !blVar.f7344i && !blVar.mo6292a()) {
                builder.setMediaDurationMillis(C2612ak.m6918A(this.f7583e.f7349n));
            }
            if (true != this.f7583e.mo6292a()) {
                i2 = 1;
            }
            builder.setPlaybackType(i2);
            this.f7578A = true;
        }
    }

    /* renamed from: J */
    private final void m7518J(long j, C2680x xVar, int i) {
        if (!C2612ak.m6951aa(this.f7596r, xVar)) {
            int i2 = (this.f7596r == null && i == 0) ? 1 : i;
            this.f7596r = xVar;
            m7519K(1, j, xVar, i2);
        }
    }

    /* renamed from: K */
    private final void m7519K(int i, long j, C2680x xVar, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.f7582d);
        if (xVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = xVar.f7495m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = xVar.f7496n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = xVar.f7493k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = xVar.f7492j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = xVar.f7501s;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = xVar.f7502t;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = xVar.f7477A;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = xVar.f7478B;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = xVar.f7487e;
            if (str4 != null) {
                String[] aq = C2612ak.m6967aq(str4, "-");
                Pair create = Pair.create(aq[0], aq.length >= 2 ? aq[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f = xVar.f7503u;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f7578A = true;
        this.f7579a.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    /* renamed from: L */
    private final boolean m7520L(C2726bo boVar) {
        return boVar != null && boVar.f7577c.equals(this.f7581c.mo6414b());
    }

    /* renamed from: z */
    public static C2727bp m7521z(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C2727bp(context, mediaMetricsManager.createPlaybackSession());
    }

    /* renamed from: A */
    public final void mo6421A(C2711b bVar, String str, String str2) {
    }

    /* renamed from: B */
    public final void mo6422B(C2711b bVar, String str) {
        C3036as asVar = bVar.f7530d;
        if (asVar == null || !asVar.mo6102a()) {
            m7514F();
            this.f7587i = str;
            this.f7588j = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta02");
            m7517I(bVar.f7528b, bVar.f7530d);
        }
    }

    /* renamed from: C */
    public final void mo6423C(C2711b bVar, String str) {
    }

    /* renamed from: D */
    public final void mo6424D(C2711b bVar, String str, boolean z) {
        C3036as asVar = bVar.f7530d;
        if ((asVar == null || !asVar.mo6102a()) && str.equals(this.f7587i)) {
            m7514F();
        }
        this.f7585g.remove(str);
        this.f7586h.remove(str);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6425a(C2711b bVar, int i, long j, long j2) {
    }

    /* renamed from: b */
    public final void mo6426b(C2711b bVar, int i, long j, long j2) {
        long j3;
        C3036as asVar = bVar.f7530d;
        if (asVar != null) {
            String c = this.f7581c.mo6415c(bVar.f7528b, asVar);
            Long l = (Long) this.f7586h.get(c);
            Long l2 = (Long) this.f7585g.get(c);
            HashMap hashMap = this.f7586h;
            long j4 = 0;
            if (l == null) {
                j3 = 0;
            } else {
                j3 = l.longValue();
            }
            hashMap.put(c, Long.valueOf(j3 + j));
            HashMap hashMap2 = this.f7585g;
            if (l2 != null) {
                j4 = l2.longValue();
            }
            hashMap2.put(c, Long.valueOf(j4 + ((long) i)));
        }
    }

    /* renamed from: c */
    public final void mo6427c(C2711b bVar, C3032ao aoVar) {
        C3036as asVar = bVar.f7530d;
        if (asVar != null) {
            C2680x xVar = aoVar.f8797c;
            xVar.getClass();
            C2726bo boVar = new C2726bo(xVar, aoVar.f8798d, this.f7581c.mo6415c(bVar.f7528b, asVar));
            int i = aoVar.f8796b;
            if (i != 0) {
                if (i == 1) {
                    this.f7594p = boVar;
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        this.f7595q = boVar;
                        return;
                    }
                    return;
                }
            }
            this.f7593o = boVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0205, code lost:
        if (r14 != 1) goto L_0x0209;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6428d(androidx.media3.common.C2646bh r19, androidx.media3.exoplayer.p137a.C2732c r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            androidx.media3.common.u r2 = r1.f7608a
            android.util.SparseBooleanArray r2 = r2.f7443a
            int r2 = r2.size()
            if (r2 == 0) goto L_0x03f0
            r2 = 0
            r3 = 0
        L_0x0010:
            androidx.media3.common.u r4 = r1.f7608a
            android.util.SparseBooleanArray r4 = r4.f7443a
            int r4 = r4.size()
            r5 = 11
            if (r3 >= r4) goto L_0x0040
            androidx.media3.common.u r4 = r1.f7608a
            int r4 = r4.mo6352a(r3)
            androidx.media3.exoplayer.a.b r6 = r1.mo6451a(r4)
            if (r4 != 0) goto L_0x002e
            androidx.media3.exoplayer.a.br r4 = r0.f7581c
            r4.mo6419g(r6)
            goto L_0x003d
        L_0x002e:
            if (r4 != r5) goto L_0x0038
            androidx.media3.exoplayer.a.br r4 = r0.f7581c
            int r5 = r0.f7589k
            r4.mo6418f(r6, r5)
            goto L_0x003d
        L_0x0038:
            androidx.media3.exoplayer.a.br r4 = r0.f7581c
            r4.mo6417e(r6)
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0040:
            long r3 = android.os.SystemClock.elapsedRealtime()
            androidx.media3.common.u r6 = r1.f7608a
            android.util.SparseBooleanArray r6 = r6.f7443a
            boolean r6 = r6.get(r2)
            if (r6 == 0) goto L_0x005d
            androidx.media3.exoplayer.a.b r6 = r1.mo6451a(r2)
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.f7588j
            if (r7 == 0) goto L_0x005d
            androidx.media3.common.bm r7 = r6.f7528b
            androidx.media3.exoplayer.h.as r6 = r6.f7530d
            r0.m7517I(r7, r6)
        L_0x005d:
            androidx.media3.common.u r6 = r1.f7608a
            android.util.SparseBooleanArray r6 = r6.f7443a
            r7 = 2
            boolean r6 = r6.get(r7)
            r9 = 3
            r10 = 0
            r11 = 1
            if (r6 == 0) goto L_0x00db
            android.media.metrics.PlaybackMetrics$Builder r6 = r0.f7588j
            if (r6 == 0) goto L_0x00db
            androidx.media3.common.bs r6 = r19.mo6015v()
            com.google.common.b.gu r6 = r6.f7407b
            int r12 = r6.size()
            r13 = 0
        L_0x007a:
            if (r13 >= r12) goto L_0x00a4
            java.lang.Object r14 = r6.get(r13)
            androidx.media3.common.br r14 = (androidx.media3.common.C2656br) r14
            r15 = 0
        L_0x0083:
            int r16 = r13 + 1
            int r5 = r14.f7401a
            if (r15 >= r5) goto L_0x009f
            boolean[] r5 = r14.f7403c
            boolean r5 = r5[r15]
            if (r5 == 0) goto L_0x009a
            androidx.media3.common.bn r5 = r14.f7402b
            androidx.media3.common.x[] r5 = r5.f7357d
            r5 = r5[r15]
            androidx.media3.common.DrmInitData r5 = r5.f7499q
            if (r5 == 0) goto L_0x009a
            goto L_0x00a5
        L_0x009a:
            int r15 = r15 + 1
            r5 = 11
            goto L_0x0083
        L_0x009f:
            r13 = r16
            r5 = 11
            goto L_0x007a
        L_0x00a4:
            r5 = r10
        L_0x00a5:
            if (r5 == 0) goto L_0x00db
            android.media.metrics.PlaybackMetrics$Builder r6 = r0.f7588j
            int r12 = androidx.media3.common.p136b.C2612ak.f7249a
            r12 = 0
        L_0x00ac:
            int r13 = r5.f7049c
            if (r12 >= r13) goto L_0x00d7
            androidx.media3.common.DrmInitData$SchemeData[] r13 = r5.f7047a
            r13 = r13[r12]
            java.util.UUID r13 = r13.f7051a
            java.util.UUID r14 = androidx.media3.common.C2669m.f7431d
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00c0
            r5 = 3
            goto L_0x00d8
        L_0x00c0:
            java.util.UUID r14 = androidx.media3.common.C2669m.f7432e
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00ca
            r5 = 2
            goto L_0x00d8
        L_0x00ca:
            java.util.UUID r14 = androidx.media3.common.C2669m.f7430c
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00d4
            r5 = 6
            goto L_0x00d8
        L_0x00d4:
            int r12 = r12 + 1
            goto L_0x00ac
        L_0x00d7:
            r5 = 1
        L_0x00d8:
            r6.setDrmType(r5)
        L_0x00db:
            androidx.media3.common.u r5 = r1.f7608a
            android.util.SparseBooleanArray r5 = r5.f7443a
            r6 = 1011(0x3f3, float:1.417E-42)
            boolean r5 = r5.get(r6)
            if (r5 == 0) goto L_0x00ec
            int r5 = r0.f7604z
            int r5 = r5 + r11
            r0.f7604z = r5
        L_0x00ec:
            androidx.media3.common.ba r5 = r0.f7592n
            r16 = 9
            r6 = 4
            if (r5 != 0) goto L_0x00f5
            goto L_0x028b
        L_0x00f5:
            android.content.Context r8 = r0.f7580b
            int r13 = r0.f7600v
            int r14 = r5.f7310a
            r15 = 1001(0x3e9, float:1.403E-42)
            if (r14 != r15) goto L_0x0103
            r8 = 20
            goto L_0x0265
        L_0x0103:
            r14 = r5
            androidx.media3.exoplayer.o r14 = (androidx.media3.exoplayer.C3267o) r14
            int r15 = r14.f9812c
            if (r15 != r11) goto L_0x010c
            r15 = 1
            goto L_0x010d
        L_0x010c:
            r15 = 0
        L_0x010d:
            int r14 = r14.f9816g
            java.lang.Throwable r12 = r5.getCause()
            r12.getClass()
            boolean r2 = r12 instanceof java.io.IOException
            r17 = 23
            if (r2 == 0) goto L_0x01ff
            boolean r2 = r12 instanceof androidx.media3.p132b.C2486ae
            if (r2 == 0) goto L_0x0127
            androidx.media3.b.ae r12 = (androidx.media3.p132b.C2486ae) r12
            int r2 = r12.f6832d
            r8 = 5
            goto L_0x0265
        L_0x0127:
            boolean r2 = r12 instanceof androidx.media3.p132b.C2485ad
            if (r2 != 0) goto L_0x01f7
            boolean r2 = r12 instanceof androidx.media3.common.C2599az
            if (r2 == 0) goto L_0x0131
            goto L_0x01f7
        L_0x0131:
            boolean r2 = r12 instanceof androidx.media3.p132b.C2484ac
            if (r2 != 0) goto L_0x01c4
            boolean r13 = r12 instanceof androidx.media3.p132b.C2496ao
            if (r13 == 0) goto L_0x013b
            goto L_0x01c4
        L_0x013b:
            int r2 = r5.f7310a
            r8 = 1002(0x3ea, float:1.404E-42)
            if (r2 != r8) goto L_0x0145
            r8 = 21
            goto L_0x0207
        L_0x0145:
            boolean r2 = r12 instanceof androidx.media3.exoplayer.p139c.C2860c
            if (r2 == 0) goto L_0x0190
            java.lang.Throwable r2 = r12.getCause()
            r2.getClass()
            int r8 = androidx.media3.common.p136b.C2612ak.f7249a
            boolean r8 = r2 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r8 == 0) goto L_0x0166
            android.media.MediaDrm$MediaDrmStateException r2 = (android.media.MediaDrm.MediaDrmStateException) r2
            java.lang.String r2 = r2.getDiagnosticInfo()
            int r2 = androidx.media3.common.p136b.C2612ak.m6987l(r2)
            int r8 = m7513E(r2)
            goto L_0x0265
        L_0x0166:
            boolean r8 = r2 instanceof android.media.MediaDrmResetException
            if (r8 == 0) goto L_0x016e
            r8 = 27
            goto L_0x0207
        L_0x016e:
            boolean r8 = r2 instanceof android.media.NotProvisionedException
            if (r8 == 0) goto L_0x0176
            r8 = 24
            goto L_0x0207
        L_0x0176:
            boolean r8 = r2 instanceof android.media.DeniedByServerException
            if (r8 == 0) goto L_0x017e
            r8 = 29
            goto L_0x0207
        L_0x017e:
            boolean r8 = r2 instanceof androidx.media3.exoplayer.p139c.C2871n
            if (r8 == 0) goto L_0x0184
            goto L_0x0214
        L_0x0184:
            boolean r2 = r2 instanceof androidx.media3.exoplayer.p139c.C2858a
            if (r2 == 0) goto L_0x018c
            r8 = 28
            goto L_0x0207
        L_0x018c:
            r8 = 30
            goto L_0x0207
        L_0x0190:
            boolean r2 = r12 instanceof androidx.media3.p132b.C2521y
            if (r2 == 0) goto L_0x01bf
            java.lang.Throwable r2 = r12.getCause()
            boolean r2 = r2 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto L_0x01bf
            java.lang.Throwable r2 = r12.getCause()
            r2.getClass()
            java.lang.Throwable r2 = r2.getCause()
            int r8 = androidx.media3.common.p136b.C2612ak.f7249a
            boolean r8 = r2 instanceof android.system.ErrnoException
            r12 = 31
            if (r8 == 0) goto L_0x01ba
            android.system.ErrnoException r2 = (android.system.ErrnoException) r2
            int r2 = r2.errno
            int r8 = android.system.OsConstants.EACCES
            if (r2 != r8) goto L_0x01ba
            r8 = 32
            goto L_0x0207
        L_0x01ba:
            r2 = 0
            r8 = 31
            goto L_0x0265
        L_0x01bf:
            r2 = 0
            r8 = 9
            goto L_0x0265
        L_0x01c4:
            androidx.media3.common.b.aa r8 = androidx.media3.common.p136b.C2602aa.m6836b(r8)
            int r8 = r8.mo6114a()
            if (r8 != r11) goto L_0x01d2
            r2 = 0
            r8 = 3
            goto L_0x0265
        L_0x01d2:
            java.lang.Throwable r8 = r12.getCause()
            boolean r13 = r8 instanceof java.net.UnknownHostException
            if (r13 == 0) goto L_0x01de
            r2 = 0
            r8 = 6
            goto L_0x0265
        L_0x01de:
            boolean r8 = r8 instanceof java.net.SocketTimeoutException
            if (r8 == 0) goto L_0x01e6
            r2 = 0
            r8 = 7
            goto L_0x0265
        L_0x01e6:
            if (r2 == 0) goto L_0x01f2
            androidx.media3.b.ac r12 = (androidx.media3.p132b.C2484ac) r12
            int r2 = r12.f6831c
            if (r2 != r11) goto L_0x01f2
            r2 = 0
            r8 = 4
            goto L_0x0265
        L_0x01f2:
            r2 = 0
            r8 = 8
            goto L_0x0265
        L_0x01f7:
            if (r13 == r6) goto L_0x01fc
            r8 = 11
            goto L_0x0207
        L_0x01fc:
            r8 = 10
            goto L_0x0207
        L_0x01ff:
            if (r15 == 0) goto L_0x0209
            r8 = 35
            if (r14 == 0) goto L_0x0207
            if (r14 != r11) goto L_0x0209
        L_0x0207:
            r2 = 0
            goto L_0x0265
        L_0x0209:
            if (r15 == 0) goto L_0x0210
            if (r14 != r9) goto L_0x0210
            r8 = 15
            goto L_0x0207
        L_0x0210:
            if (r15 == 0) goto L_0x0218
            if (r14 != r7) goto L_0x0218
        L_0x0214:
            r2 = 0
            r8 = 23
            goto L_0x0265
        L_0x0218:
            boolean r2 = r12 instanceof androidx.media3.exoplayer.p142e.C2991u
            if (r2 == 0) goto L_0x0227
            androidx.media3.exoplayer.e.u r12 = (androidx.media3.exoplayer.p142e.C2991u) r12
            java.lang.String r2 = r12.f8598d
            int r2 = androidx.media3.common.p136b.C2612ak.m6987l(r2)
            r8 = 13
            goto L_0x0265
        L_0x0227:
            boolean r2 = r12 instanceof androidx.media3.exoplayer.p142e.C2988r
            r8 = 14
            if (r2 == 0) goto L_0x0236
            androidx.media3.exoplayer.e.r r12 = (androidx.media3.exoplayer.p142e.C2988r) r12
            java.lang.String r2 = r12.f8586a
            int r2 = androidx.media3.common.p136b.C2612ak.m6987l(r2)
            goto L_0x0265
        L_0x0236:
            boolean r2 = r12 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L_0x023b
            goto L_0x0207
        L_0x023b:
            boolean r2 = r12 instanceof androidx.media3.exoplayer.p138b.C2822r
            if (r2 == 0) goto L_0x0246
            androidx.media3.exoplayer.b.r r12 = (androidx.media3.exoplayer.p138b.C2822r) r12
            int r2 = r12.f7872a
            r8 = 17
            goto L_0x0265
        L_0x0246:
            boolean r2 = r12 instanceof androidx.media3.exoplayer.p138b.C2824t
            if (r2 == 0) goto L_0x0251
            androidx.media3.exoplayer.b.t r12 = (androidx.media3.exoplayer.p138b.C2824t) r12
            int r2 = r12.f7875a
            r8 = 18
            goto L_0x0265
        L_0x0251:
            int r2 = androidx.media3.common.p136b.C2612ak.f7249a
            boolean r2 = r12 instanceof android.media.MediaCodec.CryptoException
            if (r2 == 0) goto L_0x0262
            android.media.MediaCodec$CryptoException r12 = (android.media.MediaCodec.CryptoException) r12
            int r2 = r12.getErrorCode()
            int r8 = m7513E(r2)
            goto L_0x0265
        L_0x0262:
            r8 = 22
            goto L_0x0207
        L_0x0265:
            android.media.metrics.PlaybackSession r12 = r0.f7579a
            android.media.metrics.PlaybackErrorEvent$Builder r13 = new android.media.metrics.PlaybackErrorEvent$Builder
            r13.<init>()
            long r14 = r0.f7582d
            long r14 = r3 - r14
            android.media.metrics.PlaybackErrorEvent$Builder r13 = r13.setTimeSinceCreatedMillis(r14)
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r13.setErrorCode(r8)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r8.setSubErrorCode(r2)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r2.setException(r5)
            android.media.metrics.PlaybackErrorEvent r2 = r2.build()
            r12.reportPlaybackErrorEvent(r2)
            r0.f7578A = r11
            r0.f7592n = r10
        L_0x028b:
            androidx.media3.common.u r2 = r1.f7608a
            android.util.SparseBooleanArray r2 = r2.f7443a
            boolean r2 = r2.get(r7)
            if (r2 == 0) goto L_0x02be
            androidx.media3.common.bs r2 = r19.mo6015v()
            boolean r5 = r2.mo6314a(r7)
            boolean r8 = r2.mo6314a(r11)
            boolean r2 = r2.mo6314a(r9)
            if (r5 != 0) goto L_0x02ac
            if (r8 != 0) goto L_0x02ac
            if (r2 == 0) goto L_0x02be
            r2 = 1
        L_0x02ac:
            if (r5 != 0) goto L_0x02b3
            r5 = 0
            r0.m7518J(r3, r10, r5)
            goto L_0x02b4
        L_0x02b3:
            r5 = 0
        L_0x02b4:
            if (r8 != 0) goto L_0x02b9
            r0.m7515G(r3, r10, r5)
        L_0x02b9:
            if (r2 != 0) goto L_0x02be
            r0.m7516H(r3, r10, r5)
        L_0x02be:
            androidx.media3.exoplayer.a.bo r2 = r0.f7593o
            boolean r2 = r0.m7520L(r2)
            if (r2 == 0) goto L_0x02d6
            androidx.media3.exoplayer.a.bo r2 = r0.f7593o
            androidx.media3.common.x r5 = r2.f7575a
            int r8 = r5.f7502t
            r12 = -1
            if (r8 == r12) goto L_0x02d6
            int r2 = r2.f7576b
            r0.m7518J(r3, r5, r2)
            r0.f7593o = r10
        L_0x02d6:
            androidx.media3.exoplayer.a.bo r2 = r0.f7594p
            boolean r2 = r0.m7520L(r2)
            if (r2 == 0) goto L_0x02e9
            androidx.media3.exoplayer.a.bo r2 = r0.f7594p
            androidx.media3.common.x r5 = r2.f7575a
            int r2 = r2.f7576b
            r0.m7515G(r3, r5, r2)
            r0.f7594p = r10
        L_0x02e9:
            androidx.media3.exoplayer.a.bo r2 = r0.f7595q
            boolean r2 = r0.m7520L(r2)
            if (r2 == 0) goto L_0x02fc
            androidx.media3.exoplayer.a.bo r2 = r0.f7595q
            androidx.media3.common.x r5 = r2.f7575a
            int r2 = r2.f7576b
            r0.m7516H(r3, r5, r2)
            r0.f7595q = r10
        L_0x02fc:
            android.content.Context r2 = r0.f7580b
            androidx.media3.common.b.aa r2 = androidx.media3.common.p136b.C2602aa.m6836b(r2)
            int r2 = r2.mo6114a()
            switch(r2) {
                case 0: goto L_0x031d;
                case 1: goto L_0x031a;
                case 2: goto L_0x0318;
                case 3: goto L_0x0316;
                case 4: goto L_0x0314;
                case 5: goto L_0x0312;
                case 6: goto L_0x0309;
                case 7: goto L_0x0310;
                case 8: goto L_0x0309;
                case 9: goto L_0x030d;
                case 10: goto L_0x030b;
                default: goto L_0x0309;
            }
        L_0x0309:
            r14 = 1
            goto L_0x031e
        L_0x030b:
            r14 = 7
            goto L_0x031e
        L_0x030d:
            r14 = 8
            goto L_0x031e
        L_0x0310:
            r14 = 3
            goto L_0x031e
        L_0x0312:
            r14 = 6
            goto L_0x031e
        L_0x0314:
            r14 = 5
            goto L_0x031e
        L_0x0316:
            r14 = 4
            goto L_0x031e
        L_0x0318:
            r14 = 2
            goto L_0x031e
        L_0x031a:
            r14 = 9
            goto L_0x031e
        L_0x031d:
            r14 = 0
        L_0x031e:
            int r2 = r0.f7591m
            if (r14 == r2) goto L_0x033e
            r0.f7591m = r14
            android.media.metrics.PlaybackSession r2 = r0.f7579a
            android.media.metrics.NetworkEvent$Builder r5 = new android.media.metrics.NetworkEvent$Builder
            r5.<init>()
            android.media.metrics.NetworkEvent$Builder r5 = r5.setNetworkType(r14)
            long r12 = r0.f7582d
            long r12 = r3 - r12
            android.media.metrics.NetworkEvent$Builder r5 = r5.setTimeSinceCreatedMillis(r12)
            android.media.metrics.NetworkEvent r5 = r5.build()
            r2.reportNetworkEvent(r5)
        L_0x033e:
            int r2 = r19.mo5998e()
            if (r2 == r7) goto L_0x0348
            r2 = 0
            r0.f7599u = r2
            goto L_0x0349
        L_0x0348:
            r2 = 0
        L_0x0349:
            r5 = r19
            androidx.media3.exoplayer.br r5 = (androidx.media3.exoplayer.C2848br) r5
            androidx.media3.exoplayer.o r5 = r5.mo6011r()
            if (r5 != 0) goto L_0x0358
            r0.f7601w = r2
            r5 = 10
            goto L_0x0366
        L_0x0358:
            androidx.media3.common.u r2 = r1.f7608a
            android.util.SparseBooleanArray r2 = r2.f7443a
            r5 = 10
            boolean r2 = r2.get(r5)
            if (r2 == 0) goto L_0x0366
            r0.f7601w = r11
        L_0x0366:
            int r2 = r19.mo5998e()
            boolean r8 = r0.f7599u
            if (r8 == 0) goto L_0x0370
            r5 = 5
            goto L_0x03b8
        L_0x0370:
            boolean r8 = r0.f7601w
            if (r8 == 0) goto L_0x0377
            r5 = 13
            goto L_0x03b8
        L_0x0377:
            if (r2 != r6) goto L_0x037c
            r5 = 11
            goto L_0x03b8
        L_0x037c:
            if (r2 != r7) goto L_0x0398
            int r2 = r0.f7590l
            if (r2 == 0) goto L_0x0396
            if (r2 != r7) goto L_0x0385
            goto L_0x0396
        L_0x0385:
            boolean r2 = r19.mo5987O()
            if (r2 != 0) goto L_0x038d
            r5 = 7
            goto L_0x03b8
        L_0x038d:
            int r2 = r19.mo5999f()
            if (r2 == 0) goto L_0x0394
            goto L_0x03b8
        L_0x0394:
            r5 = 6
            goto L_0x03b8
        L_0x0396:
            r5 = 2
            goto L_0x03b8
        L_0x0398:
            if (r2 != r9) goto L_0x03ad
            boolean r2 = r19.mo5987O()
            if (r2 != 0) goto L_0x03a2
            r5 = 4
            goto L_0x03b8
        L_0x03a2:
            int r2 = r19.mo5999f()
            if (r2 == 0) goto L_0x03ab
            r5 = 9
            goto L_0x03b8
        L_0x03ab:
            r5 = 3
            goto L_0x03b8
        L_0x03ad:
            if (r2 != r11) goto L_0x03b6
            int r2 = r0.f7590l
            if (r2 == 0) goto L_0x03b6
            r5 = 12
            goto L_0x03b8
        L_0x03b6:
            int r5 = r0.f7590l
        L_0x03b8:
            int r2 = r0.f7590l
            if (r2 == r5) goto L_0x03db
            r0.f7590l = r5
            r0.f7578A = r11
            android.media.metrics.PlaybackSession r2 = r0.f7579a
            android.media.metrics.PlaybackStateEvent$Builder r5 = new android.media.metrics.PlaybackStateEvent$Builder
            r5.<init>()
            int r6 = r0.f7590l
            android.media.metrics.PlaybackStateEvent$Builder r5 = r5.setState(r6)
            long r6 = r0.f7582d
            long r3 = r3 - r6
            android.media.metrics.PlaybackStateEvent$Builder r3 = r5.setTimeSinceCreatedMillis(r3)
            android.media.metrics.PlaybackStateEvent r3 = r3.build()
            r2.reportPlaybackStateEvent(r3)
        L_0x03db:
            androidx.media3.common.u r2 = r1.f7608a
            android.util.SparseBooleanArray r2 = r2.f7443a
            r3 = 1028(0x404, float:1.44E-42)
            boolean r2 = r2.get(r3)
            if (r2 == 0) goto L_0x03f0
            androidx.media3.exoplayer.a.br r2 = r0.f7581c
            androidx.media3.exoplayer.a.b r1 = r1.mo6451a(r3)
            r2.mo6416d(r1)
        L_0x03f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p137a.C2727bp.mo6428d(androidx.media3.common.bh, androidx.media3.exoplayer.a.c):void");
    }

    /* renamed from: e */
    public final /* synthetic */ void mo6429e(C2711b bVar, C2640bb bbVar) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo6430f(C2711b bVar, int i) {
    }

    /* renamed from: g */
    public final void mo6431g(C2711b bVar, C2639ba baVar) {
        this.f7592n = baVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo6432h(C2711b bVar, boolean z, int i) {
    }

    /* renamed from: i */
    public final void mo6433i(C2711b bVar, C2645bg bgVar, C2645bg bgVar2, int i) {
        if (i == 1) {
            this.f7599u = true;
            i = 1;
        }
        this.f7589k = i;
    }

    /* renamed from: j */
    public final /* synthetic */ void mo6434j(C2711b bVar, boolean z) {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo6435k(C2711b bVar, C2657bs bsVar) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo6436l() {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo6437m(C2711b bVar) {
    }

    /* renamed from: n */
    public final /* synthetic */ void mo6438n() {
    }

    /* renamed from: o */
    public final void mo6439o(C3004h hVar) {
        this.f7602x += hVar.f8700g;
        this.f7603y += hVar.f8698e;
    }

    /* renamed from: p */
    public final /* synthetic */ void mo6440p(C2711b bVar) {
    }

    /* renamed from: q */
    public final void mo6441q(C2658bt btVar) {
        C2726bo boVar = this.f7593o;
        if (boVar != null) {
            C2680x xVar = boVar.f7575a;
            if (xVar.f7502t == -1) {
                C2679w wVar = new C2679w(xVar);
                wVar.f7464p = btVar.f7408a;
                wVar.f7465q = btVar.f7409b;
                this.f7593o = new C2726bo(new C2680x(wVar), boVar.f7576b, boVar.f7577c);
            }
        }
    }

    /* renamed from: r */
    public final /* synthetic */ void mo6442r(C2711b bVar) {
    }

    /* renamed from: s */
    public final void mo6443s(C2711b bVar, C3027aj ajVar, C3032ao aoVar, IOException iOException) {
        this.f7600v = aoVar.f8795a;
    }

    /* renamed from: t */
    public final /* synthetic */ void mo6444t(C2711b bVar) {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo6445u(C2711b bVar) {
    }

    /* renamed from: v */
    public final /* synthetic */ void mo6446v(C2711b bVar) {
    }

    /* renamed from: w */
    public final /* synthetic */ void mo6447w(C2711b bVar) {
    }

    /* renamed from: x */
    public final /* synthetic */ void mo6448x(Metadata metadata) {
    }

    /* renamed from: y */
    public final /* synthetic */ void mo6449y(int i, int i2) {
    }
}
