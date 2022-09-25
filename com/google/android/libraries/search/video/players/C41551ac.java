package com.google.android.libraries.search.video.players;

import android.view.ViewGroup;
import com.google.android.libraries.search.video.conductor.C41478a;
import com.google.android.libraries.search.video.lightbox.C41533l;
import com.google.android.libraries.search.video.p3195e.C41502a;
import com.google.android.libraries.search.video.p3195e.C41506e;
import com.google.android.youtube.player.C45510f;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3561b.C45447af;
import com.google.android.youtube.player.p3561b.C45448ag;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54791k;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54794n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57193x;
import java.util.HashSet;
import java.util.Set;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.players.ac */
/* compiled from: PG */
public final class C41551ac implements C41592w, C41562an, C41561am {

    /* renamed from: a */
    public C41533l f108627a;

    /* renamed from: b */
    private final YouTubeWrapper f108628b;

    /* renamed from: c */
    private final C41566ar f108629c;

    /* renamed from: d */
    private final ViewGroup f108630d;

    /* renamed from: e */
    private final Set f108631e = new HashSet();

    /* renamed from: f */
    private final Set f108632f = new HashSet();

    /* renamed from: g */
    private final Set f108633g = new HashSet();

    /* renamed from: h */
    private C41589t f108634h;

    /* renamed from: i */
    private int f108635i = 1;

    public C41551ac(YouTubeWrapper youTubeWrapper, C57193x xVar, boolean z, Duration duration, C57143b bVar, ViewGroup viewGroup) {
        this.f108628b = youTubeWrapper;
        this.f108629c = C41566ar.m72705e(xVar.f152690a, duration, z, Optional.ofNullable(bVar));
        this.f108630d = viewGroup;
    }

    /* renamed from: w */
    private final void m72669w(C54794n nVar) {
        for (C41590u e : this.f108632f) {
            e.mo44016e(nVar);
        }
        this.f108634h = null;
    }

    /* renamed from: x */
    private final void m72670x(C41589t tVar) {
        for (C41590u c : this.f108632f) {
            c.mo44014c(this, tVar);
        }
        this.f108634h = tVar;
    }

    /* renamed from: y */
    private final void m72671y(C41589t tVar) {
        int i = this.f108628b.f108610r;
        if (i == 0) {
            throw null;
        } else if (i == 5) {
            m72670x(tVar);
            this.f108633g.remove(tVar);
        } else {
            this.f108633g.add(tVar);
        }
    }

    /* renamed from: a */
    public final void mo43993a(C41478a aVar) {
        mo44087j();
    }

    /* renamed from: b */
    public final void mo43994b(C41478a aVar) {
        m72670x(C41589t.PLAYBACK_NOT_VISIBLE);
        mo44092o();
    }

    /* renamed from: c */
    public final void mo44080c(int i) {
        for (C41590u d : this.f108632f) {
            d.mo44015d(this, i);
        }
        this.f108634h = null;
    }

    /* renamed from: d */
    public final void mo44081d(YouTubeWrapper youTubeWrapper, C45447af afVar) {
        int i;
        if (youTubeWrapper.f108608p == this.f108630d) {
            C45510f fVar = C45510f.SUCCESS;
            switch (afVar.f118865a - 1) {
                case 0:
                    i = 2;
                    break;
                case 1:
                case 8:
                    i = 4;
                    break;
                case 2:
                    i = 13;
                    break;
                case 3:
                    i = 14;
                    break;
                case 4:
                    i = 15;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 7;
                    break;
                case 7:
                    i = 9;
                    break;
                case 9:
                    i = 3;
                    break;
                default:
                    i = 1;
                    break;
            }
            C54791k kVar = (C54791k) C54794n.f143741d.createBuilder();
            kVar.copyOnWrite();
            C54794n nVar = (C54794n) kVar.instance;
            nVar.f143744b = i - 1;
            nVar.f143743a |= 1;
            kVar.copyOnWrite();
            C54794n nVar2 = (C54794n) kVar.instance;
            nVar2.f143743a |= 2;
            nVar2.f143745c = false;
            m72669w((C54794n) kVar.build());
        }
    }

    /* renamed from: e */
    public final Duration mo44082e() {
        ViewGroup viewGroup = this.f108630d;
        YouTubeWrapper youTubeWrapper = this.f108628b;
        if (viewGroup != youTubeWrapper.f108608p) {
            return Duration.ZERO;
        }
        int i = youTubeWrapper.f108610r;
        if (i == 0) {
            throw null;
        } else if (i != 5) {
            return Duration.ZERO;
        } else {
            if (youTubeWrapper.f108612t == null) {
                return Duration.ZERO;
            }
            Duration duration = Duration.ZERO;
            C45448ag agVar = youTubeWrapper.f108612t;
            if (agVar.f118867b != 2) {
                return Duration.ofMillis(Math.max(agVar.f118866a, 0));
            }
            if (youTubeWrapper.f108609q.compareTo(Duration.ZERO) <= 0) {
                return duration;
            }
            Duration minus = Duration.ofMillis(youTubeWrapper.f108598f.mo26870b()).minus(youTubeWrapper.f108609q);
            C45448ag agVar2 = youTubeWrapper.f108612t;
            agVar2.getClass();
            return Duration.ofMillis(agVar2.f118866a).plus(minus);
        }
    }

    /* renamed from: f */
    public final Optional mo44083f() {
        return Optional.empty();
    }

    /* renamed from: g */
    public final void mo44084g(C41590u uVar) {
        this.f108632f.add(uVar);
    }

    /* renamed from: h */
    public final void mo44085h(C41591v vVar) {
        this.f108631e.add(vVar);
    }

    /* renamed from: i */
    public final void mo44086i() {
        YouTubeEmbedSupportFragment youTubeEmbedSupportFragment;
        m72670x(C41589t.INIT_START);
        YouTubeWrapper youTubeWrapper = this.f108628b;
        ViewGroup viewGroup = this.f108630d;
        C41566ar arVar = this.f108629c;
        C41568c cVar = (C41568c) arVar;
        boolean isPresent = cVar.f108675d.isPresent();
        boolean z = true;
        youTubeWrapper.f108599g.put(viewGroup, new C41560al(arVar, this, this, isPresent, isPresent ? ((C57143b) cVar.f108675d.get()).f152541l : true));
        if (!isPresent || cVar.f108673b.getSeconds() < Duration.ofMillis(((C57143b) cVar.f108675d.get()).f152536g).getSeconds()) {
            z = false;
        }
        youTubeWrapper.f108604l = z;
        youTubeWrapper.f108597e.add(this);
        ViewGroup viewGroup2 = youTubeWrapper.f108608p;
        if ((viewGroup2 == null || viewGroup2 == viewGroup) && youTubeWrapper.mo44071g() && youTubeWrapper.f108606n == null) {
            youTubeWrapper.mo44069e(viewGroup);
            youTubeWrapper.mo44067c();
            C41566ar arVar2 = youTubeWrapper.mo44065a(viewGroup).f108649a;
            if (!((C41568c) arVar2).f108672a.isEmpty() && (youTubeEmbedSupportFragment = youTubeWrapper.f108603k) != null) {
                youTubeWrapper.mo44070f(youTubeEmbedSupportFragment, arVar2);
            }
        }
        if (((C41568c) this.f108629c).f108674c) {
            this.f108630d.setAlpha(0.0f);
            this.f108630d.setBackgroundColor(-16777216);
        }
        m72671y(C41589t.INIT_END);
    }

    /* renamed from: j */
    public final void mo44087j() {
        m72671y(C41589t.LOAD_START);
        YouTubeWrapper youTubeWrapper = this.f108628b;
        ViewGroup viewGroup = this.f108630d;
        youTubeWrapper.f108606n = null;
        if (youTubeWrapper.mo44071g()) {
            C41566ar arVar = youTubeWrapper.mo44065a(viewGroup).f108649a;
            if (!((C41568c) arVar).f108672a.isEmpty()) {
                youTubeWrapper.mo44069e(viewGroup);
                youTubeWrapper.f108594b.mo44106a();
                youTubeWrapper.f108606n = new C41558aj(youTubeWrapper, arVar);
                int i = youTubeWrapper.f108610r;
                if (i == 0) {
                    throw null;
                } else if (i == 5) {
                    Runnable runnable = youTubeWrapper.f108606n;
                    runnable.getClass();
                    runnable.run();
                    youTubeWrapper.f108606n = null;
                } else {
                    youTubeWrapper.mo44067c();
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo44089l(C41591v vVar) {
        this.f108631e.remove(vVar);
    }

    /* renamed from: m */
    public final /* synthetic */ void mo44090m(Duration duration) {
    }

    /* renamed from: n */
    public final void mo44091n(boolean z) {
        YouTubeEmbedSupportFragment youTubeEmbedSupportFragment;
        YouTubeWrapper youTubeWrapper = this.f108628b;
        ViewGroup viewGroup = this.f108630d;
        if (youTubeWrapper.f108608p != viewGroup || !YouTubeWrapper.m72634h(youTubeWrapper.f108611s) || (youTubeEmbedSupportFragment = youTubeWrapper.f108603k) == null) {
            youTubeWrapper.mo44065a(viewGroup).f108654f = true != z ? 3 : 2;
            return;
        }
        youTubeEmbedSupportFragment.mo49576g(z);
    }

    /* renamed from: o */
    public final void mo44092o() {
        YouTubeWrapper youTubeWrapper = this.f108628b;
        ViewGroup viewGroup = this.f108630d;
        if (youTubeWrapper.f108608p == viewGroup) {
            youTubeWrapper.f108594b.mo44106a();
            youTubeWrapper.f108606n = null;
            YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = youTubeWrapper.f108603k;
            if (youTubeEmbedSupportFragment != null) {
                youTubeEmbedSupportFragment.mo49571b();
            }
            if (((C41568c) youTubeWrapper.mo44065a(viewGroup).f108649a).f108674c) {
                youTubeWrapper.mo44069e((ViewGroup) null);
            }
        }
    }

    /* renamed from: p */
    public final void mo44093p() {
        if (this.f108635i == 1) {
            mo44087j();
            return;
        }
        C41564ap apVar = this.f108628b.f108594b;
        synchronized (apVar) {
            YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = apVar.f108660c.f108603k;
            if (youTubeEmbedSupportFragment != null) {
                apVar.f108658a = true;
                youTubeEmbedSupportFragment.mo49579j();
            }
        }
    }

    /* renamed from: q */
    public final int mo44094q() {
        return this.f108628b.f108611s;
    }

    /* renamed from: r */
    public final void mo44095r(C41533l lVar) {
        this.f108627a = lVar;
    }

    /* renamed from: s */
    public final C41506e mo43990s() {
        mo44080c(1);
        return new C41502a(Optional.m71637of(mo44082e()), Optional.empty());
    }

    /* renamed from: t */
    public final void mo44096t(ViewGroup viewGroup) {
        if (this.f108630d == viewGroup) {
            m72672z(1);
        }
    }

    /* renamed from: u */
    public final void mo44097u(YouTubeWrapper youTubeWrapper, int i) {
        if (this.f108630d == youTubeWrapper.f108608p) {
            m72672z(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r0 != false) goto L_0x0071;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44098v(com.google.android.youtube.player.C45510f r4) {
        /*
            r3 = this;
            com.google.android.youtube.player.f r0 = com.google.android.youtube.player.C45510f.SUCCESS
            boolean r0 = r4.equals(r0)
            java.util.Set r1 = r3.f108633g
            com.google.android.libraries.search.video.players.t r2 = com.google.android.libraries.search.video.players.C41589t.INIT_END
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x006f
            if (r0 == 0) goto L_0x0018
            com.google.android.libraries.search.video.players.t r4 = com.google.android.libraries.search.video.players.C41589t.INIT_END
            r3.m72670x(r4)
            goto L_0x0071
        L_0x0018:
            int r4 = r4.ordinal()
            r0 = 1
            switch(r4) {
                case 1: goto L_0x003c;
                case 2: goto L_0x0020;
                case 3: goto L_0x0039;
                case 4: goto L_0x0036;
                case 5: goto L_0x0033;
                case 6: goto L_0x0030;
                case 7: goto L_0x002d;
                case 8: goto L_0x002a;
                case 9: goto L_0x0028;
                case 10: goto L_0x0025;
                case 11: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            r4 = 1
            goto L_0x003d
        L_0x0022:
            r4 = 23
            goto L_0x003d
        L_0x0025:
            r4 = 22
            goto L_0x003d
        L_0x0028:
            r4 = 4
            goto L_0x003d
        L_0x002a:
            r4 = 21
            goto L_0x003d
        L_0x002d:
            r4 = 20
            goto L_0x003d
        L_0x0030:
            r4 = 19
            goto L_0x003d
        L_0x0033:
            r4 = 18
            goto L_0x003d
        L_0x0036:
            r4 = 17
            goto L_0x003d
        L_0x0039:
            r4 = 16
            goto L_0x003d
        L_0x003c:
            r4 = 3
        L_0x003d:
            com.google.ba.a.a.b.n r1 = com.google.p4140ba.p4141a.p4142a.p4144b.C54794n.f143741d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.ba.a.a.b.k r1 = (com.google.p4140ba.p4141a.p4142a.p4144b.C54791k) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.ba.a.a.b.n r2 = (com.google.p4140ba.p4141a.p4142a.p4144b.C54794n) r2
            int r4 = r4 + -1
            r2.f143744b = r4
            int r4 = r2.f143743a
            r4 = r4 | r0
            r2.f143743a = r4
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.ba.a.a.b.n r4 = (com.google.p4140ba.p4141a.p4142a.p4144b.C54794n) r4
            int r0 = r4.f143743a
            r0 = r0 | 2
            r4.f143743a = r0
            r0 = 0
            r4.f143745c = r0
            com.google.protobuf.bv r4 = r1.build()
            com.google.ba.a.a.b.n r4 = (com.google.p4140ba.p4141a.p4142a.p4144b.C54794n) r4
            r3.m72669w(r4)
            goto L_0x0080
        L_0x006f:
            if (r0 == 0) goto L_0x0080
        L_0x0071:
            java.util.Set r4 = r3.f108633g
            com.google.android.libraries.search.video.players.t r0 = com.google.android.libraries.search.video.players.C41589t.LOAD_START
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L_0x0080
            com.google.android.libraries.search.video.players.t r4 = com.google.android.libraries.search.video.players.C41589t.LOAD_START
            r3.m72670x(r4)
        L_0x0080:
            java.util.Set r4 = r3.f108633g
            r4.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.video.players.C41551ac.mo44098v(com.google.android.youtube.player.f):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        if (r0 == 4) goto L_0x0090;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m72672z(int r7) {
        /*
            r6 = this;
            int r0 = r6.f108635i
            r1 = 0
            if (r7 == 0) goto L_0x00ae
            if (r7 != r0) goto L_0x0008
            return
        L_0x0008:
            com.google.android.libraries.search.video.players.ar r0 = r6.f108629c
            com.google.android.libraries.search.video.players.c r0 = (com.google.android.libraries.search.video.players.C41568c) r0
            boolean r0 = r0.f108674c
            r2 = 3
            r3 = 4
            if (r0 == 0) goto L_0x0043
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r7 == r2) goto L_0x003e
            if (r7 == r3) goto L_0x003e
            r4 = 5
            if (r7 != r4) goto L_0x001c
            goto L_0x003e
        L_0x001c:
            android.view.ViewGroup r4 = r6.f108630d
            float r4 = r4.getAlpha()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0043
            android.view.ViewGroup r0 = r6.f108630d
            r4 = 1056964608(0x3f000000, float:0.5)
            r0.setAlpha(r4)
            android.view.ViewGroup r0 = r6.f108630d
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r4 = 0
            android.view.ViewPropertyAnimator r0 = r0.alpha(r4)
            r4 = 100
            r0.setDuration(r4)
            goto L_0x0043
        L_0x003e:
            android.view.ViewGroup r4 = r6.f108630d
            r4.setAlpha(r0)
        L_0x0043:
            int r0 = r6.f108635i
            r6.f108635i = r7
            com.google.android.youtube.player.f r4 = com.google.android.youtube.player.C45510f.SUCCESS
            int r4 = r7 + -1
            if (r4 == 0) goto L_0x0088
            r1 = 2
            if (r4 == r1) goto L_0x0073
            if (r4 == r2) goto L_0x006b
            if (r4 == r3) goto L_0x0055
            goto L_0x0096
        L_0x0055:
            com.google.android.libraries.search.video.players.t r1 = com.google.android.libraries.search.video.players.C41589t.LOAD_START
            com.google.android.libraries.search.video.players.t r2 = r6.f108634h
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0065
            com.google.android.libraries.search.video.players.t r1 = com.google.android.libraries.search.video.players.C41589t.LOAD_END
            r6.m72670x(r1)
            goto L_0x0096
        L_0x0065:
            com.google.android.libraries.search.video.players.t r1 = com.google.android.libraries.search.video.players.C41589t.PLAYBACK_PAUSE
            r6.m72670x(r1)
            goto L_0x0096
        L_0x006b:
            if (r7 != r3) goto L_0x0073
            com.google.android.libraries.search.video.players.t r7 = com.google.android.libraries.search.video.players.C41589t.UNMUTE
            r6.m72670x(r7)
            r7 = 4
        L_0x0073:
            com.google.android.libraries.search.video.players.t r1 = com.google.android.libraries.search.video.players.C41589t.LOAD_START
            com.google.android.libraries.search.video.players.t r2 = r6.f108634h
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0082
            com.google.android.libraries.search.video.players.t r1 = com.google.android.libraries.search.video.players.C41589t.LOAD_END
            r6.m72670x(r1)
        L_0x0082:
            com.google.android.libraries.search.video.players.t r1 = com.google.android.libraries.search.video.players.C41589t.PLAY
            r6.m72670x(r1)
            goto L_0x0096
        L_0x0088:
            if (r0 == 0) goto L_0x00ad
            if (r0 == r2) goto L_0x008f
            if (r0 != r3) goto L_0x0096
            goto L_0x0090
        L_0x008f:
            r3 = r0
        L_0x0090:
            com.google.android.libraries.search.video.players.t r0 = com.google.android.libraries.search.video.players.C41589t.PLAYBACK_PAUSE
            r6.m72670x(r0)
            r0 = r3
        L_0x0096:
            java.util.Set r1 = r6.f108631e
            java.util.Iterator r1 = r1.iterator()
        L_0x009c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r2 = r1.next()
            com.google.android.libraries.search.video.players.v r2 = (com.google.android.libraries.search.video.players.C41591v) r2
            r2.mo42106a(r6, r7, r0)
            goto L_0x009c
        L_0x00ac:
            return
        L_0x00ad:
            throw r1
        L_0x00ae:
            goto L_0x00b0
        L_0x00af:
            throw r1
        L_0x00b0:
            goto L_0x00af
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.video.players.C41551ac.m72672z(int):void");
    }

    /* renamed from: k */
    public final void mo44088k() {
        YouTubeWrapper youTubeWrapper = this.f108628b;
        ViewGroup viewGroup = this.f108630d;
        if (youTubeWrapper.f108608p == viewGroup) {
            youTubeWrapper.f108594b.mo44106a();
            youTubeWrapper.f108606n = null;
            YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = youTubeWrapper.f108603k;
            if (youTubeEmbedSupportFragment != null) {
                youTubeEmbedSupportFragment.mo49579j();
            }
            if (((C41568c) youTubeWrapper.mo44065a(viewGroup).f108649a).f108674c) {
                youTubeWrapper.mo44069e((ViewGroup) null);
            }
        }
        if (youTubeWrapper.f108608p == viewGroup) {
            youTubeWrapper.mo44069e((ViewGroup) null);
        }
        C41562an anVar = youTubeWrapper.mo44065a(viewGroup).f108650b;
        if (anVar != null) {
            youTubeWrapper.f108597e.remove(anVar);
        }
        youTubeWrapper.f108599g.remove(viewGroup);
        this.f108630d.setBackgroundColor(0);
        this.f108633g.clear();
        m72672z(1);
        this.f108630d.animate().cancel();
        this.f108630d.setAlpha(1.0f);
    }
}
