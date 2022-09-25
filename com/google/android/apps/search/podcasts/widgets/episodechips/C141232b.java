package com.google.android.apps.search.podcasts.widgets.episodechips;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.apps.search.podcasts.widgets.download.DownloadButton;
import com.google.android.apps.search.podcasts.widgets.playbutton.FullPlayButton;
import com.google.android.apps.search.podcasts.widgets.queuebutton.QueueButton;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.tracing.C47770dh;
import java.util.Set;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.episodechips.b */
/* compiled from: PG */
public final class C141232b {

    /* renamed from: b */
    private static final Set f383430b = C69531o.m100939p(new C97913c[]{C97913c.DOWNLOADED, C97913c.FAILED, C97913c.FILE_MISSING, C97913c.DOWNLOADING, C97913c.QUEUED_TO_DOWNLOAD});

    /* renamed from: a */
    public final C46485f f383431a;

    /* renamed from: c */
    private final C140997s f383432c;

    /* renamed from: d */
    private final C47770dh f383433d;

    /* renamed from: e */
    private final C28306ab f383434e;

    /* renamed from: f */
    private final DownloadButton f383435f;

    /* renamed from: g */
    private final FullPlayButton f383436g;

    /* renamed from: h */
    private final QueueButton f383437h;

    /* renamed from: i */
    private final View f383438i;

    /* renamed from: j */
    private boolean f383439j;

    public C141232b(EpisodeChipsView episodeChipsView, C47274n nVar, C140997s sVar, C47770dh dhVar, C46485f fVar, C28306ab abVar) {
        C69664n.m101061g(sVar, "events");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(fVar, "accountNavigation");
        C69664n.m101061g(abVar, "visualElements");
        this.f383432c = sVar;
        this.f383433d = dhVar;
        this.f383431a = fVar;
        this.f383434e = abVar;
        LayoutInflater.from(nVar).inflate(R.layout.podcasts_episode_chips, episodeChipsView, true);
        View findViewById = episodeChipsView.findViewById(R.id.podcasts_download_button);
        C69664n.m101060f(findViewById, "episodeChipsView.findVie…podcasts_download_button)");
        this.f383435f = (DownloadButton) findViewById;
        View findViewById2 = episodeChipsView.findViewById(R.id.podcasts_full_play_button);
        C69664n.m101060f(findViewById2, "episodeChipsView.findVie…odcasts_full_play_button)");
        this.f383436g = (FullPlayButton) findViewById2;
        View findViewById3 = episodeChipsView.findViewById(R.id.podcasts_queue_button);
        C69664n.m101060f(findViewById3, "episodeChipsView.findVie…id.podcasts_queue_button)");
        this.f383437h = (QueueButton) findViewById3;
        View findViewById4 = episodeChipsView.findViewById(R.id.podcasts_overflow_button);
        C69664n.m101060f(findViewById4, "episodeChipsView.findVie…podcasts_overflow_button)");
        this.f383438i = findViewById4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r12v2, types: [android.widget.ProgressBar] */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r12v4, types: [android.widget.ProgressBar] */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r12v6, types: [android.widget.ProgressBar] */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8, types: [android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116251a(com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b r17, com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97922l r18, boolean r19, com.google.android.apps.search.podcasts.p10576l.C140509u r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r20
            java.lang.String r4 = "episodeItem"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r4)
            java.lang.String r5 = "episodeChipsVe"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            java.lang.String r5 = "autoplayContext"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r5)
            com.google.android.apps.gsa.staticplugins.cl.b.l r5 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97922l.f273432e
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r5)
            r6 = 1
            r5 = r5 ^ r6
            r0.f383439j = r5
            com.google.android.apps.search.podcasts.widgets.queuebutton.QueueButton r5 = r0.f383437h
            boolean r7 = r1.f381985l
            r8 = 0
            if (r7 == 0) goto L_0x0037
            r5.setSelected(r6)
            android.content.Context r7 = r5.getContext()
            r9 = 2132091466(0x7f15224a, float:1.9823301E38)
            java.lang.String r7 = r7.getString(r9)
            goto L_0x0045
        L_0x0037:
            r5.setSelected(r8)
            android.content.Context r7 = r5.getContext()
            r9 = 2132091330(0x7f1521c2, float:1.9823025E38)
            java.lang.String r7 = r7.getString(r9)
        L_0x0045:
            r5.setContentDescription(r7)
            boolean r5 = r1.f381985l
            if (r5 == 0) goto L_0x0065
            com.google.android.apps.search.podcasts.widgets.queuebutton.QueueButton r5 = r0.f383437h
            com.google.apps.tiktok.contrib.c.f r7 = r0.f383431a
            com.google.apps.tiktok.contrib.c.p r9 = com.google.apps.tiktok.contrib.p3629c.C46490k.m82868a(r17)
            android.os.Bundle r9 = r9.mo50504d()
            java.lang.String r10 = "Open queue actions menu"
            r11 = 2131434622(0x7f0b1c7e, float:1.8491063E38)
            android.view.View$OnClickListener r7 = r7.mo50480a(r11, r9, r10)
            r5.setOnClickListener(r7)
            goto L_0x0075
        L_0x0065:
            com.google.android.apps.search.podcasts.r.s r5 = r0.f383432c
            com.google.android.apps.search.podcasts.widgets.queuebutton.QueueButton r7 = r0.f383437h
            com.google.android.apps.search.podcasts.f.aw r9 = new com.google.android.apps.search.podcasts.f.aw
            r9.<init>(r1)
            java.lang.String r10 = "ToggleQueueEvent"
            boolean r11 = r0.f383439j
            r5.mo116064c(r7, r9, r10, r11)
        L_0x0075:
            com.google.android.apps.search.podcasts.widgets.playbutton.FullPlayButton r5 = r0.f383436g
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r4)
            com.google.android.apps.search.podcasts.widgets.playbutton.BulletView r4 = r5.f383523a
            com.google.android.apps.search.podcasts.m.a.e r7 = r1.f381984k
            if (r7 != 0) goto L_0x0082
            com.google.android.apps.search.podcasts.m.a.e r7 = com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e.f381988d
        L_0x0082:
            int r7 = r7.f381991b
            com.google.android.apps.search.podcasts.m.a.e r9 = r1.f381984k
            if (r9 != 0) goto L_0x008a
            com.google.android.apps.search.podcasts.m.a.e r9 = com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e.f381988d
        L_0x008a:
            float r9 = r9.f381990a
            android.widget.ImageView r10 = r4.f383522c
            r11 = 8
            r10.setVisibility(r11)
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 6
            r12 = 3
            r13 = 4
            if (r7 == r12) goto L_0x00e3
            if (r7 == r11) goto L_0x00e3
            int r7 = java.lang.Float.compare(r9, r10)
            if (r7 < 0) goto L_0x00ad
            android.widget.ImageView r7 = r4.f383522c
            r7.setVisibility(r8)
            com.google.android.apps.search.podcasts.widgets.playbutton.PlayProgressButton r7 = r4.f383520a
            r7.setVisibility(r13)
            goto L_0x00dd
        L_0x00ad:
            com.google.android.apps.search.podcasts.widgets.playbutton.PlayProgressButton r7 = r4.f383520a
            boolean r14 = r7.f383527c
            if (r14 == 0) goto L_0x00ba
            r7.f383527c = r8
            android.animation.ValueAnimator r14 = r7.f383525a
            r14.cancel()
        L_0x00ba:
            r14 = 0
            int r14 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x00c1
            r9 = 0
            goto L_0x00d3
        L_0x00c1:
            int r14 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r14 < 0) goto L_0x00c8
            r9 = 360(0x168, float:5.04E-43)
            goto L_0x00d3
        L_0x00c8:
            r14 = 1134297088(0x439c0000, float:312.0)
            float r9 = r9 * r14
            r14 = 1103101952(0x41c00000, float:24.0)
            float r9 = r9 + r14
            int r9 = p5462h.p5477g.C69678a.m101088a(r9)
        L_0x00d3:
            r7.f383526b = r9
            r7.invalidate()
            com.google.android.apps.search.podcasts.widgets.playbutton.PlayProgressButton r7 = r4.f383520a
            r7.setVisibility(r8)
        L_0x00dd:
            android.widget.ImageView r4 = r4.f383521b
            r4.setVisibility(r13)
            goto L_0x011d
        L_0x00e3:
            if (r7 != r12) goto L_0x00f7
            android.widget.ImageView r7 = r4.f383521b
            android.graphics.drawable.Drawable r7 = r7.getDrawable()
            java.lang.String r9 = "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable"
            p5462h.p5473f.p5475b.C69664n.m101059e(r7, r9)
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r7.start()
            r7 = 0
            goto L_0x0109
        L_0x00f7:
            com.google.android.apps.search.podcasts.widgets.playbutton.PlayProgressButton r7 = r4.f383520a
            boolean r9 = r7.f383527c
            if (r9 == 0) goto L_0x00fe
            goto L_0x0108
        L_0x00fe:
            r7.f383527c = r6
            r7.invalidate()
            android.animation.ValueAnimator r7 = r7.f383525a
            r7.start()
        L_0x0108:
            r7 = 1
        L_0x0109:
            com.google.android.apps.search.podcasts.widgets.playbutton.PlayProgressButton r9 = r4.f383520a
            if (r6 == r7) goto L_0x010f
            r14 = 4
            goto L_0x0110
        L_0x010f:
            r14 = 0
        L_0x0110:
            r9.setVisibility(r14)
            android.widget.ImageView r4 = r4.f383521b
            if (r6 == r7) goto L_0x0119
            r7 = 0
            goto L_0x011a
        L_0x0119:
            r7 = 4
        L_0x011a:
            r4.setVisibility(r7)
        L_0x011d:
            com.google.android.apps.search.podcasts.m.a.e r4 = r1.f381984k
            if (r4 != 0) goto L_0x0124
            com.google.android.apps.search.podcasts.m.a.e r7 = com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e.f381988d
            goto L_0x0125
        L_0x0124:
            r7 = r4
        L_0x0125:
            int r7 = r7.f381991b
            r9 = 2132091444(0x7f152234, float:1.9823256E38)
            if (r7 == r12) goto L_0x01c6
            if (r7 == r11) goto L_0x01aa
            android.widget.TextView r7 = r5.f383524b
            if (r4 != 0) goto L_0x0134
            com.google.android.apps.search.podcasts.m.a.e r4 = com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e.f381988d
        L_0x0134:
            float r4 = r4.f381990a
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x0146
            android.content.Context r4 = r5.getContext()
            r9 = 2132091348(0x7f1521d4, float:1.9823062E38)
            java.lang.String r4 = r4.getString(r9)
            goto L_0x0190
        L_0x0146:
            long r9 = r1.f381981h
            r14 = 0
            int r4 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x015a
            android.content.Context r4 = r5.getContext()
            r9 = 2132091446(0x7f152236, float:1.982326E38)
            java.lang.String r4 = r4.getString(r9)
            goto L_0x0190
        L_0x015a:
            j$.time.Duration r4 = p3186j$.time.Duration.ofSeconds(r9)
            long r9 = r4.toMillis()
            android.content.res.Resources r4 = r5.getResources()
            java.lang.String r11 = "resources"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r11)
            com.google.android.apps.search.podcasts.m.a.e r13 = r1.f381984k
            if (r13 != 0) goto L_0x0171
            com.google.android.apps.search.podcasts.m.a.e r13 = com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e.f381988d
        L_0x0171:
            float r12 = (float) r9
            float r13 = r13.f381990a
            float r12 = r12 * r13
            long r12 = (long) r12
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r11)
            long r9 = r9 - r12
            int r11 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r11 <= 0) goto L_0x018a
            int r11 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r11 <= 0) goto L_0x018a
            com.google.android.apps.search.podcasts.r.c r11 = com.google.android.apps.search.podcasts.p10601r.C140963c.TIME_REMAINING_ABBREVIATED
            java.lang.String r4 = com.google.android.apps.search.podcasts.p10601r.C140979f.m228936b(r4, r9, r11)
            goto L_0x0190
        L_0x018a:
            com.google.android.apps.search.podcasts.r.c r11 = com.google.android.apps.search.podcasts.p10601r.C140963c.DURATION_ABBREVIATED
            java.lang.String r4 = com.google.android.apps.search.podcasts.p10601r.C140979f.m228936b(r4, r9, r11)
        L_0x0190:
            r7.setText(r4)
            com.google.android.apps.search.podcasts.widgets.playbutton.BulletView r4 = r5.f383523a
            android.content.Context r5 = r5.getContext()
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r9 = r1.f381976c
            r7[r8] = r9
            r9 = 2132091456(0x7f152240, float:1.982328E38)
            java.lang.String r5 = r5.getString(r9, r7)
            r4.setContentDescription(r5)
            goto L_0x01e1
        L_0x01aa:
            android.widget.TextView r4 = r5.f383524b
            r7 = 2132091431(0x7f152227, float:1.982323E38)
            r4.setText(r7)
            com.google.android.apps.search.podcasts.widgets.playbutton.BulletView r4 = r5.f383523a
            android.content.Context r5 = r5.getContext()
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r10 = r1.f381976c
            r7[r8] = r10
            java.lang.String r5 = r5.getString(r9, r7)
            r4.setContentDescription(r5)
            goto L_0x01e1
        L_0x01c6:
            android.widget.TextView r4 = r5.f383524b
            r7 = 2132091462(0x7f152246, float:1.9823293E38)
            r4.setText(r7)
            com.google.android.apps.search.podcasts.widgets.playbutton.BulletView r4 = r5.f383523a
            android.content.Context r5 = r5.getContext()
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r10 = r1.f381976c
            r7[r8] = r10
            java.lang.String r5 = r5.getString(r9, r7)
            r4.setContentDescription(r5)
        L_0x01e1:
            com.google.android.apps.search.podcasts.r.s r4 = r0.f383432c
            com.google.android.apps.search.podcasts.widgets.playbutton.FullPlayButton r5 = r0.f383436g
            com.google.android.apps.search.podcasts.f.al r7 = new com.google.android.apps.search.podcasts.f.al
            r7.<init>(r1, r3)
            java.lang.String r3 = "PlayEpisodeEvent"
            boolean r9 = r0.f383439j
            r4.mo116064c(r5, r7, r3, r9)
            com.google.android.apps.search.podcasts.widgets.download.DownloadButton r3 = r0.f383435f
            com.google.android.apps.gsa.staticplugins.cl.b.d r4 = r1.f381987n
            if (r4 != 0) goto L_0x01f9
            com.google.android.apps.gsa.staticplugins.cl.b.d r4 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d.f273393j
        L_0x01f9:
            java.lang.String r5 = "episodeItem.downloadEpisode"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            java.lang.String r5 = "downloadEpisode"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)
            int r5 = r4.f273396b
            com.google.android.apps.gsa.staticplugins.cl.b.c r5 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c.m162190a(r5)
            if (r5 != 0) goto L_0x020d
            com.google.android.apps.gsa.staticplugins.cl.b.c r5 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c.UNKNOWN
        L_0x020d:
            com.google.android.apps.gsa.staticplugins.cl.b.c r7 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c.DOWNLOADED
            if (r5 != r7) goto L_0x0213
            r5 = 1
            goto L_0x0214
        L_0x0213:
            r5 = 0
        L_0x0214:
            r3.f383402e = r5
            int r5 = r4.f273396b
            com.google.android.apps.gsa.staticplugins.cl.b.c r5 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c.m162190a(r5)
            if (r5 != 0) goto L_0x0220
            com.google.android.apps.gsa.staticplugins.cl.b.c r5 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c.UNKNOWN
        L_0x0220:
            int r5 = r5.ordinal()
            r7 = 2131233786(0x7f080bfa, float:1.808372E38)
            java.lang.String r9 = "downloadingAnimator"
            java.lang.String r10 = "progressBar"
            java.lang.String r11 = "downloadIcon"
            r12 = 0
            if (r5 == r6) goto L_0x0306
            r4 = 2
            if (r5 == r4) goto L_0x02e6
            r4 = 3
            if (r5 == r4) goto L_0x02a2
            r4 = 4
            if (r5 == r4) goto L_0x02a2
            r4 = 6
            if (r5 == r4) goto L_0x0276
            android.widget.ImageView r4 = r3.f383404g
            if (r4 != 0) goto L_0x0244
            p5462h.p5473f.p5475b.C69664n.m101065k(r11)
            r4 = r12
        L_0x0244:
            android.widget.ProgressBar r5 = r3.f383405h
            if (r5 != 0) goto L_0x024c
            p5462h.p5473f.p5475b.C69664n.m101065k(r10)
            r5 = r12
        L_0x024c:
            android.animation.ObjectAnimator r6 = r3.f383403f
            if (r6 != 0) goto L_0x0254
            p5462h.p5473f.p5475b.C69664n.m101065k(r9)
            goto L_0x0255
        L_0x0254:
            r12 = r6
        L_0x0255:
            r12.end()
            android.content.res.Resources r6 = r3.getResources()
            r7 = 2132091374(0x7f1521ee, float:1.9823114E38)
            java.lang.String r6 = r6.getString(r7)
            r3.setContentDescription(r6)
            r6 = 2131233783(0x7f080bf7, float:1.8083713E38)
            r4.setImageResource(r6)
            android.content.res.ColorStateList r6 = r3.f383399b
            r4.setImageTintList(r6)
            r3.mo116234c(r5, r8)
            goto L_0x035e
        L_0x0276:
            android.widget.ImageView r4 = r3.f383404g
            if (r4 != 0) goto L_0x027e
            p5462h.p5473f.p5475b.C69664n.m101065k(r11)
            r4 = r12
        L_0x027e:
            r4.setImageResource(r7)
            android.widget.ImageView r4 = r3.f383404g
            if (r4 != 0) goto L_0x0289
            p5462h.p5473f.p5475b.C69664n.m101065k(r11)
            goto L_0x028a
        L_0x0289:
            r12 = r4
        L_0x028a:
            android.content.res.ColorStateList r4 = r3.f383398a
            r12.setImageTintList(r4)
            android.content.res.Resources r4 = r3.getResources()
            r5 = 2132091467(0x7f15224b, float:1.9823303E38)
            java.lang.String r4 = r4.getString(r5)
            r3.setContentDescription(r4)
            r3.mo116233b(r6)
            goto L_0x035e
        L_0x02a2:
            r3.f383401d = r8
            android.animation.ObjectAnimator r4 = r3.f383403f
            if (r4 != 0) goto L_0x02ac
            p5462h.p5473f.p5475b.C69664n.m101065k(r9)
            r4 = r12
        L_0x02ac:
            r4.end()
            android.widget.ImageView r4 = r3.f383404g
            if (r4 != 0) goto L_0x02b7
            p5462h.p5473f.p5475b.C69664n.m101065k(r11)
            r4 = r12
        L_0x02b7:
            r5 = 2131234153(0x7f080d69, float:1.8084464E38)
            r4.setImageResource(r5)
            android.widget.ImageView r4 = r3.f383404g
            if (r4 != 0) goto L_0x02c5
            p5462h.p5473f.p5475b.C69664n.m101065k(r11)
            r4 = r12
        L_0x02c5:
            android.content.res.ColorStateList r5 = r3.f383400c
            r4.setImageTintList(r5)
            android.content.res.Resources r4 = r3.getResources()
            r5 = 2132091375(0x7f1521ef, float:1.9823116E38)
            java.lang.String r4 = r4.getString(r5)
            r3.setContentDescription(r4)
            android.widget.ProgressBar r4 = r3.f383405h
            if (r4 != 0) goto L_0x02e0
            p5462h.p5473f.p5475b.C69664n.m101065k(r10)
            goto L_0x02e1
        L_0x02e0:
            r12 = r4
        L_0x02e1:
            r3.mo116234c(r12, r8)
            goto L_0x035e
        L_0x02e6:
            r3.mo116233b(r8)
            android.widget.ProgressBar r4 = r3.f383405h
            if (r4 != 0) goto L_0x02f1
            p5462h.p5473f.p5475b.C69664n.m101065k(r10)
            goto L_0x02f2
        L_0x02f1:
            r12 = r4
        L_0x02f2:
            r4 = 100
            r3.mo116234c(r12, r4)
            android.content.res.Resources r4 = r3.getResources()
            r5 = 2132091377(0x7f1521f1, float:1.982312E38)
            java.lang.String r4 = r4.getString(r5)
            r3.setContentDescription(r4)
            goto L_0x035e
        L_0x0306:
            long r4 = r4.f273399e
            int r5 = (int) r4
            if (r5 > 0) goto L_0x030c
            r5 = 0
        L_0x030c:
            r3.f383401d = r6
            if (r5 <= 0) goto L_0x035e
            android.animation.ObjectAnimator r4 = r3.f383403f
            if (r4 != 0) goto L_0x0318
            p5462h.p5473f.p5475b.C69664n.m101065k(r9)
            r4 = r12
        L_0x0318:
            boolean r4 = r4.isStarted()
            if (r4 != 0) goto L_0x0329
            android.animation.ObjectAnimator r4 = r3.f383403f
            if (r4 != 0) goto L_0x0326
            p5462h.p5473f.p5475b.C69664n.m101065k(r9)
            r4 = r12
        L_0x0326:
            r4.start()
        L_0x0329:
            android.widget.ImageView r4 = r3.f383404g
            if (r4 != 0) goto L_0x0331
            p5462h.p5473f.p5475b.C69664n.m101065k(r11)
            r4 = r12
        L_0x0331:
            r4.setImageResource(r7)
            android.widget.ImageView r4 = r3.f383404g
            if (r4 != 0) goto L_0x033c
            p5462h.p5473f.p5475b.C69664n.m101065k(r11)
            r4 = r12
        L_0x033c:
            android.content.res.ColorStateList r6 = r3.f383398a
            r4.setImageTintList(r6)
            android.content.res.Resources r4 = r3.getResources()
            r6 = 2132091378(0x7f1521f2, float:1.9823123E38)
            java.lang.String r4 = r4.getString(r6)
            r3.setContentDescription(r4)
            r3.mo116233b(r8)
            android.widget.ProgressBar r4 = r3.f383405h
            if (r4 != 0) goto L_0x035a
            p5462h.p5473f.p5475b.C69664n.m101065k(r10)
            goto L_0x035b
        L_0x035a:
            r12 = r4
        L_0x035b:
            r3.mo116234c(r12, r5)
        L_0x035e:
            java.util.Set r3 = f383430b
            com.google.android.apps.gsa.staticplugins.cl.b.d r4 = r1.f381987n
            if (r4 != 0) goto L_0x0366
            com.google.android.apps.gsa.staticplugins.cl.b.d r4 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d.f273393j
        L_0x0366:
            int r4 = r4.f273396b
            com.google.android.apps.gsa.staticplugins.cl.b.c r4 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c.m162190a(r4)
            if (r4 != 0) goto L_0x0370
            com.google.android.apps.gsa.staticplugins.cl.b.c r4 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c.UNKNOWN
        L_0x0370:
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x038f
            com.google.android.apps.search.podcasts.widgets.download.DownloadButton r3 = r0.f383435f
            com.google.apps.tiktok.contrib.c.f r4 = r0.f383431a
            com.google.apps.tiktok.contrib.c.p r5 = com.google.apps.tiktok.contrib.p3629c.C46490k.m82868a(r17)
            android.os.Bundle r5 = r5.mo50504d()
            java.lang.String r6 = "Open download actions menu"
            r7 = 2131434614(0x7f0b1c76, float:1.8491047E38)
            android.view.View$OnClickListener r4 = r4.mo50480a(r7, r5, r6)
            r3.setOnClickListener(r4)
            goto L_0x03a1
        L_0x038f:
            com.google.android.apps.search.podcasts.r.s r3 = r0.f383432c
            com.google.android.apps.search.podcasts.widgets.download.DownloadButton r4 = r0.f383435f
            com.google.android.apps.search.podcasts.f.a r5 = new com.google.android.apps.search.podcasts.f.a
            com.google.android.apps.gsa.staticplugins.cl.b.g r6 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97917g.DOWNLOAD
            r5.<init>(r1, r6)
            java.lang.String r6 = "DownloadEpisodeEvent"
            boolean r7 = r0.f383439j
            r3.mo116064c(r4, r5, r6, r7)
        L_0x03a1:
            android.view.View r3 = r0.f383438i
            com.google.apps.tiktok.tracing.dh r4 = r0.f383433d
            com.google.android.apps.search.podcasts.widgets.episodechips.a r5 = new com.google.android.apps.search.podcasts.widgets.episodechips.a
            r6 = r19
            r5.<init>(r0, r1, r6)
            com.google.apps.tiktok.tracing.co r1 = new com.google.apps.tiktok.tracing.co
            java.lang.String r6 = "navigate to episode actions"
            r1.<init>(r4, r6, r5)
            r3.setOnClickListener(r1)
            boolean r1 = r0.f383439j
            if (r1 == 0) goto L_0x03f3
            com.google.android.libraries.logging.ve.ab r1 = r0.f383434e
            com.google.android.apps.search.podcasts.widgets.queuebutton.QueueButton r3 = r0.f383437h
            com.google.android.libraries.logging.ve.af r4 = r1.f76990a
            int r5 = r2.f273436c
            com.google.android.libraries.logging.ve.h r5 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r5)
            com.google.android.libraries.logging.ve.c r4 = r4.mo33805a(r5)
            r1.mo33802c(r3, r4)
            com.google.android.libraries.logging.ve.ab r1 = r0.f383434e
            com.google.android.apps.search.podcasts.widgets.playbutton.FullPlayButton r3 = r0.f383436g
            com.google.android.libraries.logging.ve.af r4 = r1.f76990a
            int r5 = r2.f273435b
            com.google.android.libraries.logging.ve.h r5 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r5)
            com.google.android.libraries.logging.ve.c r4 = r4.mo33805a(r5)
            r1.mo33802c(r3, r4)
            com.google.android.libraries.logging.ve.ab r1 = r0.f383434e
            com.google.android.apps.search.podcasts.widgets.download.DownloadButton r3 = r0.f383435f
            com.google.android.libraries.logging.ve.af r4 = r1.f76990a
            int r2 = r2.f273437d
            com.google.android.libraries.logging.ve.h r2 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r2)
            com.google.android.libraries.logging.ve.c r2 = r4.mo33805a(r2)
            r1.mo33802c(r3, r2)
        L_0x03f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.widgets.episodechips.C141232b.mo116251a(com.google.android.apps.search.podcasts.m.a.b, com.google.android.apps.gsa.staticplugins.cl.b.l, boolean, com.google.android.apps.search.podcasts.l.u):void");
    }

    /* renamed from: b */
    public final void mo116252b() {
        if (this.f383439j) {
            C28306ab.m52929e(this.f383437h);
            C28306ab.m52929e(this.f383436g);
            C28306ab.m52929e(this.f383435f);
        }
    }
}
