package com.google.android.libraries.search.video.thirdparty;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2644bf;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2658bt;
import androidx.media3.common.C2666j;
import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.C3004h;
import androidx.media3.exoplayer.C3267o;
import androidx.media3.exoplayer.p137a.C2711b;
import androidx.media3.exoplayer.p137a.C2732c;
import androidx.media3.exoplayer.p137a.C2733d;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3032ao;
import androidx.media3.exoplayer.p151k.C3244j;
import androidx.media3.p174ui.SubtitleView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.thirdparty.l */
/* compiled from: PG */
public final class C41610l implements AudioManager.OnAudioFocusChangeListener, C2733d, C41607i {

    /* renamed from: a */
    public final C41617s f108759a;

    /* renamed from: b */
    C2759ad f108760b;

    /* renamed from: c */
    int f108761c = 3;

    /* renamed from: d */
    private AudioManager f108762d;

    /* renamed from: e */
    private AudioFocusRequest f108763e;

    /* renamed from: f */
    private C3244j f108764f;

    /* renamed from: g */
    private C2644bf f108765g;

    /* renamed from: h */
    private int f108766h = 1;

    /* renamed from: i */
    private boolean f108767i = false;

    /* renamed from: j */
    private final List f108768j;

    /* renamed from: k */
    private int f108769k = 1;

    /* renamed from: l */
    private final C41613o f108770l;

    public C41610l(C41613o oVar, C41617s sVar) {
        ArrayList arrayList = new ArrayList();
        this.f108768j = arrayList;
        arrayList.add(sVar);
        this.f108770l = oVar;
        this.f108759a = sVar;
        SubtitleView subtitleView = ((C41623x) sVar).f108802g;
        if (subtitleView != null) {
            this.f108765g = new C41609k(subtitleView);
        }
    }

    /* renamed from: K */
    private final void m72924K() {
        AudioFocusRequest audioFocusRequest;
        AudioManager audioManager = this.f108762d;
        if (audioManager != null && (audioFocusRequest = this.f108763e) != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
            this.f108763e = null;
        }
    }

    /* renamed from: L */
    private static boolean m72925L(int i) {
        return i == 6 || i == 5;
    }

    /* renamed from: A */
    public final Optional mo44167A() {
        C3244j jVar = this.f108764f;
        if (jVar == null) {
            return Optional.empty();
        }
        long e = jVar.mo7233e();
        if (e == 1000000) {
            return Optional.empty();
        }
        return Optional.m71637of(Long.valueOf(e));
    }

    /* renamed from: B */
    public final void mo44168B(C41606h hVar) {
        this.f108768j.add(hVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: androidx.media3.exoplayer.h.au} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44169C(android.content.Context r20, java.lang.String r21, p3186j$.util.Optional r22, p3186j$.util.Optional r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "audio"
            java.lang.Object r2 = r1.getSystemService(r2)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r0.f108762d = r2
            androidx.media3.exoplayer.ac r2 = new androidx.media3.exoplayer.ac
            r2.<init>(r1)
            androidx.media3.exoplayer.ad r2 = r2.mo6454a()
            r0.f108760b = r2
            r2.mo6462M(r0)
            androidx.media3.common.bf r2 = r0.f108765g
            if (r2 == 0) goto L_0x0025
            androidx.media3.exoplayer.ad r3 = r0.f108760b
            r3.mo6016w(r2)
        L_0x0025:
            androidx.media3.exoplayer.k.j r2 = new androidx.media3.exoplayer.k.j
            r2.<init>()
            r0.f108764f = r2
            androidx.media3.exoplayer.ad r3 = r0.f108760b
            r3.getClass()
            com.google.android.libraries.search.video.thirdparty.s r4 = r0.f108759a
            com.google.android.libraries.search.video.thirdparty.x r4 = (com.google.android.libraries.search.video.thirdparty.C41623x) r4
            android.view.ViewGroup r4 = r4.f108803h
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            androidx.media3.b.q r5 = new androidx.media3.b.q
            java.lang.String r6 = "AGSA"
            java.lang.String r6 = androidx.media3.common.p136b.C2612ak.m6937T(r1, r6)
            r5.<init>((android.content.Context) r1, (java.lang.String) r6, (androidx.media3.p132b.C2495an) r2)
            android.net.Uri r2 = android.net.Uri.parse(r21)
            boolean r6 = com.google.common.base.C58837ba.m90859h(r21)
            if (r6 != 0) goto L_0x0059
            java.lang.String r6 = r2.getLastPathSegment()
            int r6 = androidx.media3.common.p136b.C2612ak.m6992q(r6)
            goto L_0x005a
        L_0x0059:
            r6 = 4
        L_0x005a:
            androidx.media3.common.aq r2 = androidx.media3.common.C2590aq.m6794a(r2)
            r7 = 2
            if (r6 == 0) goto L_0x0077
            if (r6 == r7) goto L_0x006d
            androidx.media3.exoplayer.h.bx r6 = new androidx.media3.exoplayer.h.bx
            r6.<init>(r5)
            androidx.media3.exoplayer.h.by r2 = r6.mo6760b(r2)
            goto L_0x0085
        L_0x006d:
            androidx.media3.exoplayer.hls.HlsMediaSource$Factory r6 = new androidx.media3.exoplayer.hls.HlsMediaSource$Factory
            r6.<init>(r5)
            androidx.media3.exoplayer.hls.HlsMediaSource r2 = r6.mo6760b(r2)
            goto L_0x0085
        L_0x0077:
            androidx.media3.exoplayer.dash.DashMediaSource$Factory r6 = new androidx.media3.exoplayer.dash.DashMediaSource$Factory
            androidx.media3.exoplayer.dash.s r8 = new androidx.media3.exoplayer.dash.s
            r8.<init>(r5)
            r6.<init>(r8, r5)
            androidx.media3.exoplayer.dash.DashMediaSource r2 = r6.mo6760b(r2)
        L_0x0085:
            boolean r6 = r23.isEmpty()
            java.lang.String r8 = ""
            r9 = 1
            if (r6 == 0) goto L_0x0093
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            goto L_0x00ca
        L_0x0093:
            java.lang.Object r6 = r23.get()
            com.google.bv.e.b.b.c.a.l r6 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57181l) r6
            int r10 = r6.f152663c
            int r10 = com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57180k.m88266a(r10)
            if (r10 != 0) goto L_0x00a2
            r10 = 1
        L_0x00a2:
            int r10 = r10 + -1
            if (r10 == r9) goto L_0x00ad
            if (r10 == r7) goto L_0x00aa
            r10 = r8
            goto L_0x00af
        L_0x00aa:
            java.lang.String r10 = "application/x-subrip"
            goto L_0x00af
        L_0x00ad:
            java.lang.String r10 = "text/vtt"
        L_0x00af:
            androidx.media3.exoplayer.k.k r11 = new androidx.media3.exoplayer.k.k
            r12 = 0
            r11.<init>(r12)
            androidx.media3.common.an r12 = new androidx.media3.common.an
            java.lang.String r13 = r6.f152662b
            android.net.Uri r13 = android.net.Uri.parse(r13)
            java.lang.String r6 = r6.f152664d
            r12.<init>(r13, r10, r6)
            androidx.media3.exoplayer.h.co r6 = androidx.media3.exoplayer.p145h.C3103cn.m9018a(r12, r5, r11)
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)
        L_0x00ca:
            boolean r10 = r6.isPresent()
            r11 = 0
            if (r10 == 0) goto L_0x00e6
            androidx.media3.exoplayer.h.bj r10 = new androidx.media3.exoplayer.h.bj
            androidx.media3.exoplayer.h.au[] r7 = new androidx.media3.exoplayer.p145h.C3038au[r7]
            r7[r11] = r2
            java.lang.Object r2 = r6.get()
            androidx.media3.exoplayer.h.au r2 = (androidx.media3.exoplayer.p145h.C3038au) r2
            r7[r9] = r2
            r10.<init>(r7)
            r6 = r22
            r2 = r10
            goto L_0x00e8
        L_0x00e6:
            r6 = r22
        L_0x00e8:
            java.lang.Object r7 = r6.orElse(r8)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0164
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x00fb
            goto L_0x0164
        L_0x00fb:
            r20.getClass()
            android.content.Context r1 = r20.getApplicationContext()
            androidx.media3.exoplayer.d.g r7 = new androidx.media3.exoplayer.d.g
            androidx.media3.exoplayer.d.h r8 = new androidx.media3.exoplayer.d.h
            r8.<init>()
            r7.<init>(r1, r8)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            if (r1 != r8) goto L_0x0118
            r1 = 1
            goto L_0x0119
        L_0x0118:
            r1 = 0
        L_0x0119:
            androidx.media3.common.p136b.C2601a.m6832d(r1)
            r1 = r3
            androidx.media3.exoplayer.br r1 = (androidx.media3.exoplayer.C2848br) r1
            android.os.Looper r1 = r1.f7995g
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            if (r1 != r8) goto L_0x0129
            r1 = 1
            goto L_0x012a
        L_0x0129:
            r1 = 0
        L_0x012a:
            androidx.media3.common.p136b.C2601a.m6832d(r1)
            r7.f8257g = r3
            r7.f8256f = r9
            java.lang.Object r1 = r4.get()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            androidx.media3.b.n r14 = new androidx.media3.b.n
            java.lang.Object r4 = r22.get()
            java.lang.String r4 = (java.lang.String) r4
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r14.<init>(r4)
            androidx.media3.exoplayer.h.a.k r4 = new androidx.media3.exoplayer.h.a.k
            android.net.Uri r15 = r14.f6891a
            androidx.media3.exoplayer.h.ae r6 = new androidx.media3.exoplayer.h.ae
            r6.<init>(r5)
            com.google.android.libraries.search.video.thirdparty.c r5 = new com.google.android.libraries.search.video.thirdparty.c
            r5.<init>(r1)
            r12 = r4
            r13 = r2
            r16 = r6
            r17 = r7
            r18 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r4)
            goto L_0x0168
        L_0x0164:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
        L_0x0168:
            boolean r4 = r1.isPresent()
            if (r4 == 0) goto L_0x0175
            java.lang.Object r1 = r1.get()
            r2 = r1
            androidx.media3.exoplayer.h.au r2 = (androidx.media3.exoplayer.p145h.C3038au) r2
        L_0x0175:
            r3.mo6463N(r2)
            com.google.android.libraries.search.video.thirdparty.o r1 = r0.f108770l
            j$.time.Duration[] r1 = r1.f108775c
            int r2 = r1.length
        L_0x017d:
            if (r11 >= r2) goto L_0x01c4
            r3 = r1[r11]
            androidx.media3.exoplayer.ad r4 = r0.f108760b
            if (r4 == 0) goto L_0x01c1
            j$.time.Duration r4 = p3186j$.time.Duration.ZERO
            int r4 = r3.compareTo((p3186j$.time.Duration) r4)
            if (r4 <= 0) goto L_0x01c1
            androidx.media3.exoplayer.ad r4 = r0.f108760b
            com.google.android.libraries.search.video.thirdparty.j r5 = new com.google.android.libraries.search.video.thirdparty.j
            r5.<init>(r0)
            androidx.media3.exoplayer.br r4 = (androidx.media3.exoplayer.C2848br) r4
            r4.mo6600aQ()
            androidx.media3.exoplayer.ct r4 = r4.mo6586aC(r5)
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            android.os.Looper r5 = r5.getLooper()
            boolean r6 = r4.f8190i
            r6 = r6 ^ r9
            androidx.media3.common.p136b.C2601a.m6832d(r6)
            r4.f8186e = r5
            long r5 = r3.toMillis()
            boolean r3 = r4.f8190i
            r3 = r3 ^ r9
            androidx.media3.common.p136b.C2601a.m6832d(r3)
            r4.f8188g = r5
            r4.mo6676c()
        L_0x01c1:
            int r11 = r11 + 1
            goto L_0x017d
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.video.thirdparty.C41610l.mo44169C(android.content.Context, java.lang.String, j$.util.Optional, j$.util.Optional):void");
    }

    /* renamed from: D */
    public final void mo44170D() {
        this.f108761c = 3;
        mo44177J();
    }

    /* renamed from: E */
    public final void mo44171E() {
        this.f108761c = 6;
        mo44177J();
    }

    /* renamed from: F */
    public final void mo44172F() {
        this.f108761c = 4;
        mo44177J();
    }

    /* renamed from: G */
    public final void mo44173G() {
        CaptioningManager captioningManager;
        C2759ad adVar = this.f108760b;
        if (adVar != null) {
            C2644bf bfVar = this.f108765g;
            if (bfVar != null) {
                adVar.mo6019z(bfVar);
            }
            C2759ad adVar2 = this.f108760b;
            adVar2.getClass();
            adVar2.mo5974B(false);
            adVar2.mo6018y();
            C41623x xVar = (C41623x) this.f108759a;
            xVar.f108799d.setOnTouchListener((View.OnTouchListener) null);
            ViewGroup viewGroup = xVar.f108798c;
            if (viewGroup != null) {
                viewGroup.removeView(xVar.f108799d);
                xVar.f108798c = null;
            }
            CaptioningManager.CaptioningChangeListener captioningChangeListener = xVar.f108807l;
            if (!(captioningChangeListener == null || (captioningManager = xVar.f108797b) == null)) {
                captioningManager.removeCaptioningChangeListener(captioningChangeListener);
            }
            this.f108760b = null;
        }
    }

    /* renamed from: H */
    public final void mo44174H(Duration duration) {
        C2759ad adVar = this.f108760b;
        if (adVar != null) {
            C2666j jVar = (C2666j) adVar;
            jVar.mo5973A(jVar.mo5996c(), duration.toMillis());
        }
    }

    /* renamed from: I */
    public final void mo44175I() {
        C2759ad adVar = this.f108760b;
        if (adVar != null) {
            adVar.mo5977E(2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        if (r2 == 7) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b0, code lost:
        if (r2 == 7) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ca, code lost:
        if (r0 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (com.google.android.libraries.search.video.thirdparty.C41613o.m72964b(r2, 2, 3, 4, 6, 5) != false) goto L_0x00d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00db  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44177J() {
        /*
            r13 = this;
            com.google.android.libraries.search.video.thirdparty.o r0 = r13.f108770l
            int r1 = r13.f108766h
            int r2 = r13.f108769k
            int r3 = r13.f108761c
            j$.time.Duration r4 = r13.mo44176z()
            boolean r5 = r13.f108767i
            j$.time.Duration r6 = r0.f108774b
            j$.time.Duration r7 = p3186j$.time.Duration.ZERO
            int r6 = r6.compareTo((p3186j$.time.Duration) r7)
            r7 = 1
            r8 = 0
            if (r6 <= 0) goto L_0x0024
            j$.time.Duration r0 = r0.f108774b
            int r0 = r4.compareTo((p3186j$.time.Duration) r0)
            if (r0 < 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            r4 = 5
            int[] r6 = new int[r4]
            r6 = {1, 2, 7, 8, 9} // fill-array
            boolean r6 = com.google.android.libraries.search.video.thirdparty.C41613o.m72964b(r3, r6)
            r9 = 3
            if (r6 == 0) goto L_0x0043
            com.google.common.f.e r0 = com.google.android.libraries.search.video.thirdparty.C41613o.f108773a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Invalid desired state, ignroing state update."
            r2 = 53907(0xd293, float:7.554E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x0040:
            r6 = 0
            goto L_0x00d8
        L_0x0043:
            r6 = 9
            if (r2 != r6) goto L_0x0048
        L_0x0047:
            goto L_0x0040
        L_0x0048:
            if (r1 == r7) goto L_0x00cd
            r6 = 2
            r10 = 4
            r11 = 6
            r12 = 7
            if (r1 == r6) goto L_0x00a1
            if (r1 == r9) goto L_0x0072
            if (r1 == r10) goto L_0x0063
            com.google.common.f.e r0 = com.google.android.libraries.search.video.thirdparty.C41613o.f108773a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Invalid exo player state, ignroing state update."
            r2 = 53906(0xd292, float:7.5538E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x0040
        L_0x0063:
            int[] r0 = new int[r11]
            r0 = {2, 3, 4, 6, 5, 7} // fill-array
            boolean r0 = com.google.android.libraries.search.video.thirdparty.C41613o.m72964b(r2, r0)
            if (r0 == 0) goto L_0x0040
            r6 = 8
            goto L_0x00d8
        L_0x0072:
            if (r2 != r12) goto L_0x007d
            if (r0 == 0) goto L_0x007c
            if (r3 == r11) goto L_0x0079
            goto L_0x0047
        L_0x0079:
            r2 = 7
            r3 = 6
            goto L_0x007d
        L_0x007c:
            r2 = 7
        L_0x007d:
            if (r3 != r10) goto L_0x0084
            if (r0 == 0) goto L_0x0084
            if (r2 != r12) goto L_0x00b3
            goto L_0x0047
        L_0x0084:
            if (r3 != r10) goto L_0x008d
            if (r0 != 0) goto L_0x008d
            if (r2 != r10) goto L_0x008b
            goto L_0x0047
        L_0x008b:
            r6 = 4
            goto L_0x00d8
        L_0x008d:
            if (r3 != r11) goto L_0x0097
            if (r7 == r5) goto L_0x0092
            r4 = 6
        L_0x0092:
            if (r2 != r4) goto L_0x0095
            goto L_0x0047
        L_0x0095:
            r6 = r4
            goto L_0x00d8
        L_0x0097:
            if (r2 != r7) goto L_0x009c
            if (r3 != r9) goto L_0x009c
            goto L_0x0047
        L_0x009c:
            if (r2 != r3) goto L_0x009f
            goto L_0x0047
        L_0x009f:
            r6 = r3
            goto L_0x00d8
        L_0x00a1:
            if (r2 != r12) goto L_0x00ac
            if (r0 == 0) goto L_0x00ab
            if (r3 == r11) goto L_0x00a8
            goto L_0x0047
        L_0x00a8:
            r2 = 7
            r3 = 6
            goto L_0x00ac
        L_0x00ab:
            r2 = 7
        L_0x00ac:
            if (r3 != r10) goto L_0x00b5
            if (r0 == 0) goto L_0x00b5
            if (r2 != r12) goto L_0x00b3
            goto L_0x0047
        L_0x00b3:
            r6 = 7
            goto L_0x00d8
        L_0x00b5:
            if (r2 != r6) goto L_0x00b8
            goto L_0x0047
        L_0x00b8:
            int[] r1 = new int[r4]
            r1 = {3, 4, 6, 5, 8} // fill-array
            boolean r1 = com.google.android.libraries.search.video.thirdparty.C41613o.m72964b(r2, r1)
            if (r1 == 0) goto L_0x00c4
            goto L_0x00d8
        L_0x00c4:
            if (r3 == r11) goto L_0x00d8
            if (r3 == r9) goto L_0x00d8
            if (r3 != r10) goto L_0x0040
            if (r0 != 0) goto L_0x0040
            goto L_0x00d8
        L_0x00cd:
            int[] r0 = new int[r4]
            r0 = {2, 3, 4, 6, 5} // fill-array
            boolean r0 = com.google.android.libraries.search.video.thirdparty.C41613o.m72964b(r2, r0)
            if (r0 == 0) goto L_0x0040
        L_0x00d8:
            if (r6 != 0) goto L_0x00db
            return
        L_0x00db:
            int r0 = r13.f108769k
            boolean r1 = m72925L(r0)
            if (r1 == 0) goto L_0x00ed
            boolean r1 = m72925L(r6)
            if (r1 != 0) goto L_0x00ed
            r13.m72924K()
            goto L_0x0131
        L_0x00ed:
            boolean r0 = m72925L(r0)
            if (r0 != 0) goto L_0x0131
            boolean r0 = m72925L(r6)
            if (r0 == 0) goto L_0x0131
            r13.m72924K()
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
            r0.<init>()
            android.media.AudioAttributes$Builder r0 = r0.setUsage(r7)
            android.media.AudioAttributes$Builder r0 = r0.setContentType(r9)
            android.media.AudioAttributes r0 = r0.build()
            android.media.AudioFocusRequest$Builder r1 = new android.media.AudioFocusRequest$Builder
            r1.<init>(r7)
            android.media.AudioFocusRequest$Builder r0 = r1.setAudioAttributes(r0)
            android.media.AudioFocusRequest$Builder r0 = r0.setOnAudioFocusChangeListener(r13)
            android.media.AudioFocusRequest r0 = r0.build()
            r13.f108763e = r0
            android.media.AudioManager r1 = r13.f108762d
            if (r1 == 0) goto L_0x012a
            int r0 = r1.requestAudioFocus(r0)
            if (r0 == r7) goto L_0x0131
        L_0x012a:
            r0 = 0
            r13.f108763e = r0
            r13.mo44170D()
            return
        L_0x0131:
            r13.f108769k = r6
            int r0 = r6 + -1
            switch(r0) {
                case 0: goto L_0x0155;
                case 1: goto L_0x0155;
                case 2: goto L_0x0155;
                case 3: goto L_0x0138;
                case 4: goto L_0x0146;
                case 5: goto L_0x0146;
                case 6: goto L_0x0155;
                case 7: goto L_0x0155;
                case 8: goto L_0x0155;
                default: goto L_0x0138;
            }
        L_0x0138:
            androidx.media3.exoplayer.ad r0 = r13.f108760b
            if (r0 == 0) goto L_0x015c
            r1 = 0
            r0.mo5980H(r1)
            androidx.media3.exoplayer.ad r0 = r13.f108760b
            r0.mo5974B(r7)
            goto L_0x015c
        L_0x0146:
            androidx.media3.exoplayer.ad r0 = r13.f108760b
            if (r0 == 0) goto L_0x015c
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.mo5980H(r1)
            androidx.media3.exoplayer.ad r0 = r13.f108760b
            r0.mo5974B(r7)
            goto L_0x015c
        L_0x0155:
            androidx.media3.exoplayer.ad r0 = r13.f108760b
            if (r0 == 0) goto L_0x015c
            r0.mo5974B(r8)
        L_0x015c:
            java.util.List r0 = r13.f108768j
            java.util.Iterator r0 = r0.iterator()
        L_0x0162:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0172
            java.lang.Object r1 = r0.next()
            com.google.android.libraries.search.video.thirdparty.h r1 = (com.google.android.libraries.search.video.thirdparty.C41606h) r1
            r1.mo44145k(r6, r13)
            goto L_0x0162
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.video.thirdparty.C41610l.mo44177J():void");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6425a(C2711b bVar, int i, long j, long j2) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6426b(C2711b bVar, int i, long j, long j2) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6427c(C2711b bVar, C3032ao aoVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo6428d(C2646bh bhVar, C2732c cVar) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo6429e(C2711b bVar, C2640bb bbVar) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo6430f(C2711b bVar, int i) {
    }

    /* renamed from: g */
    public final void mo6431g(C2711b bVar, C2639ba baVar) {
        int i = 1;
        if (baVar instanceof C3267o) {
            int i2 = ((C3267o) baVar).f9812c;
            if (i2 == 0) {
                i = 2;
            } else if (i2 == 1) {
                i = 3;
            } else if (i2 == 2) {
                i = 4;
            }
        }
        for (C41606h i3 : this.f108768j) {
            i3.mo44143i(i);
        }
    }

    /* renamed from: h */
    public final void mo6432h(C2711b bVar, boolean z, int i) {
        this.f108766h = i;
        mo44177J();
    }

    /* renamed from: i */
    public final /* synthetic */ void mo6433i(C2711b bVar, C2645bg bgVar, C2645bg bgVar2, int i) {
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
    public final void mo6438n() {
        for (C41606h hW : this.f108768j) {
            hW.mo44142hW();
        }
    }

    /* renamed from: o */
    public final /* synthetic */ void mo6439o(C3004h hVar) {
    }

    public final void onAudioFocusChange(int i) {
        if ((i == -3 || i == -2 || i == -1) && this.f108769k == 6) {
            mo44170D();
        }
    }

    /* renamed from: p */
    public final /* synthetic */ void mo6440p(C2711b bVar) {
    }

    /* renamed from: q */
    public final /* synthetic */ void mo6441q(C2658bt btVar) {
    }

    /* renamed from: r */
    public final /* synthetic */ void mo6442r(C2711b bVar) {
    }

    /* renamed from: s */
    public final void mo6443s(C2711b bVar, C3027aj ajVar, C3032ao aoVar, IOException iOException) {
        int i = 6;
        if (aoVar.f8795a != 6) {
            i = 5;
        }
        for (C41606h j : this.f108768j) {
            j.mo44144j(i);
        }
    }

    /* renamed from: t */
    public final /* synthetic */ void mo6444t(C2711b bVar) {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo6445u(C2711b bVar) {
    }

    /* renamed from: v */
    public final void mo6446v(C2711b bVar) {
        C2759ad adVar = this.f108760b;
        boolean z = false;
        if (adVar != null && adVar.mo5989Q()) {
            z = true;
        }
        this.f108767i = z;
        mo44177J();
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

    /* renamed from: z */
    public final Duration mo44176z() {
        C2759ad adVar = this.f108760b;
        if (adVar == null) {
            return Duration.ZERO;
        }
        return Duration.ofMillis(adVar.mo6004k());
    }
}
