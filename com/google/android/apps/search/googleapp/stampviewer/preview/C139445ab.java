package com.google.android.apps.search.googleapp.stampviewer.preview;

import android.app.Activity;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.transition.Explode;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139321c;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139327i;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139328j;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139329k;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139335q;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139336r;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139340v;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139341w;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.video.conductor.C41478a;
import com.google.android.libraries.search.video.lightbox.C41533l;
import com.google.android.libraries.search.video.p3195e.C41502a;
import com.google.android.libraries.search.video.p3195e.C41506e;
import com.google.android.libraries.search.video.players.C41589t;
import com.google.android.libraries.search.video.players.C41590u;
import com.google.android.libraries.search.video.players.C41591v;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4242bp.p4253e.p4254a.C56190j;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56612d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57186q;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;
import com.google.protobuf.C62971cq;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.HashSet;
import java.util.Set;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.ab */
/* compiled from: PG */
public final class C139445ab implements C41592w, C139482y, C139340v {

    /* renamed from: a */
    private static final C59071e f379173a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.preview.ab");

    /* renamed from: b */
    private final C57194y f379174b;

    /* renamed from: c */
    private final ViewGroup f379175c;

    /* renamed from: d */
    private final Fragment f379176d;

    /* renamed from: e */
    private final C47215a f379177e;

    /* renamed from: f */
    private final AccountId f379178f;

    /* renamed from: g */
    private final boolean f379179g;

    /* renamed from: h */
    private C41589t f379180h = null;

    /* renamed from: i */
    private final Set f379181i = new HashSet();

    /* renamed from: j */
    private final C139336r f379182j;

    /* renamed from: k */
    private int f379183k;

    /* renamed from: l */
    private final C139341w f379184l;

    public C139445ab(Fragment fragment, AccountId accountId, C47215a aVar, C139341w wVar, boolean z, C139336r rVar, ViewGroup viewGroup, C57194y yVar) {
        this.f379176d = fragment;
        this.f379178f = accountId;
        this.f379177e = aVar;
        this.f379179g = z;
        this.f379184l = wVar;
        this.f379183k = 1;
        this.f379174b = yVar;
        this.f379175c = viewGroup;
        this.f379182j = rVar;
    }

    /* renamed from: t */
    private final int m226599t() {
        C57186q qVar;
        C57186q qVar2;
        C57194y yVar = this.f379174b;
        if (yVar.f152695b == 11) {
            qVar = (C57186q) yVar.f152696c;
        } else {
            qVar = C57186q.f152670c;
        }
        C56612d dVar = qVar.f152673b;
        if (dVar == null) {
            dVar = C56612d.f151152f;
        }
        C57194y yVar2 = this.f379174b;
        if (yVar2.f152695b == 11) {
            qVar2 = (C57186q) yVar2.f152696c;
        } else {
            qVar2 = C57186q.f152670c;
        }
        C56612d dVar2 = qVar2.f152673b;
        if (dVar2 == null) {
            dVar2 = C56612d.f151152f;
        }
        C56622n nVar = ((C56610b) dVar.f151154a.get(C139444aa.m226598a(dVar2.f151156c))).f151150i;
        if (nVar == null) {
            nVar = C56622n.f151177e;
        }
        C56190j jVar = nVar.f151182d;
        if (jVar == null) {
            jVar = C56190j.f149710d;
        }
        return jVar.f149713b;
    }

    /* renamed from: u */
    private final void m226600u(C41589t tVar) {
        for (C41590u c : this.f379181i) {
            c.mo44014c(this, tVar);
        }
        this.f379180h = tVar;
    }

    /* renamed from: v */
    private final void m226601v() {
        C0167am activity = this.f379176d.getActivity();
        if (activity != null) {
            m226602w(activity, 10);
        }
        FragmentManager childFragmentManager = this.f379176d.getChildFragmentManager();
        Fragment c = childFragmentManager.f634a.mo671c(C139468l.m226675b(m226599t()));
        if (c != null) {
            View view = c.getView();
            if (view != null) {
                ((TouchInterceptFrameLayout) view.findViewById(R.id.googleapp_inline_touch_intercept_container)).mo17754z().f379203a = true;
                ((TouchInterceptFrameLayout) view.findViewById(R.id.googleapp_inline_cta_touch_intercept_container)).mo17754z().f379203a = true;
            }
            C0154a aVar = new C0154a(this.f379176d.getChildFragmentManager());
            aVar.mo516m(c);
            aVar.mo509f();
        }
    }

    /* renamed from: w */
    private static void m226602w(Activity activity, int i) {
        try {
            activity.setRequestedOrientation(i);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) f379173a.mo56226d()).mo56382g(e)).mo56372aa(41377)).mo56386p("setRequestedOrientation: Unable to setRequestedOrientation.");
        }
    }

    /* renamed from: x */
    private final boolean m226603x(Fragment fragment) {
        return this.f379179g && fragment != null && (fragment instanceof C139467k) && ((C139467k) fragment).mo17754z().mo114992b();
    }

    /* renamed from: a */
    public final void mo43993a(C41478a aVar) {
        FragmentManager childFragmentManager = this.f379176d.getChildFragmentManager();
        if (!m226603x(childFragmentManager.f634a.mo671c(C139468l.m226675b(m226599t())))) {
            mo44087j();
        }
    }

    /* renamed from: b */
    public final void mo43994b(C41478a aVar) {
        mo44092o();
    }

    /* renamed from: c */
    public final boolean mo114909c(C56610b bVar) {
        C57186q qVar;
        if (bVar == null) {
            return false;
        }
        String str = bVar.f151144c;
        C57194y yVar = this.f379174b;
        if (yVar.f152695b == 11) {
            qVar = (C57186q) yVar.f152696c;
        } else {
            qVar = C57186q.f152670c;
        }
        C56612d dVar = qVar.f152673b;
        if (dVar == null) {
            dVar = C56612d.f151152f;
        }
        if (!str.equals(((C56610b) dVar.f151154a.get(0)).f151144c) || !this.f379179g) {
            return false;
        }
        FragmentManager childFragmentManager = this.f379176d.getChildFragmentManager();
        Fragment c = childFragmentManager.f634a.mo671c(C139468l.m226675b(m226599t()));
        if (m226603x(c) || c == null) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) this.f379177e.mo51123r().getDecorView();
        if (viewGroup.findViewById(R.id.googleapp_stamp_viewer_fullscreen_container) == null) {
            this.f379176d.getLayoutInflater().inflate(R.layout.googleapp_stamp_viewer_inline_fullscreen_container, viewGroup);
        }
        ((ViewGroup) c.requireView().getParent()).removeView(c.requireView());
        C139470n a = ((C139467k) c).mo17754z();
        C139483z zVar = a.f379247j;
        if (zVar != null) {
            C139343y yVar2 = C139343y.VIEWER_MODE_FULLSCREEN;
            C69664n.m101061g(yVar2, "newViewerMode");
            if (yVar2 != zVar.f379264c) {
                zVar.f379265d.mo25988lL(yVar2);
            }
            zVar.f379264c = yVar2;
            zVar.f379262a.mo5757d(zVar.f379263b, zVar.f379264c);
        }
        Fragment c2 = a.f379240c.getChildFragmentManager().f634a.mo671c("OVERLAY_FRAGMENT");
        if (c2 != null) {
            C0154a aVar = new C0154a(a.f379240c.getChildFragmentManager());
            aVar.mo516m(c2);
            aVar.mo509f();
        }
        a.mo114991a();
        C0167am activity = c.getActivity();
        if (activity != null) {
            m226602w(activity, 1);
        }
        TransitionManager.beginDelayedTransition(viewGroup, new Explode());
        viewGroup.setVisibility(0);
        viewGroup.setSystemUiVisibility(3846);
        viewGroup.setVisibility(0);
        C139341w wVar = this.f379184l;
        wVar.f378960a = null;
        wVar.f378961b.set((Object) null);
        View view = c.getView();
        if (view != null) {
            TouchInterceptFrameLayout touchInterceptFrameLayout = (TouchInterceptFrameLayout) view.findViewById(R.id.googleapp_inline_touch_intercept_container);
            if (touchInterceptFrameLayout != null) {
                touchInterceptFrameLayout.mo17754z().f379203a = false;
            }
            TouchInterceptFrameLayout touchInterceptFrameLayout2 = (TouchInterceptFrameLayout) view.findViewById(R.id.googleapp_inline_cta_touch_intercept_container);
            if (touchInterceptFrameLayout2 != null) {
                touchInterceptFrameLayout2.mo17754z().f379203a = false;
                return true;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void mo114970d(int i) {
        C57186q qVar;
        switch (i - 1) {
            case 1:
                m226600u(C41589t.PLAYBACK_NOT_VISIBLE);
                this.f379183k = 5;
                return;
            case 2:
            case 6:
                m226600u(C41589t.PLAYBACK_PAUSE);
                this.f379183k = 5;
                return;
            case 3:
                m226600u(C41589t.PLAYBACK_END);
                this.f379183k = 5;
                return;
            case 4:
                if (this.f379180h == C41589t.LOAD_START) {
                    m226600u(C41589t.LOAD_END);
                    return;
                }
                return;
            case 5:
                m226600u(C41589t.PLAY);
                C139341w wVar = this.f379184l;
                C57194y yVar = this.f379174b;
                if (yVar.f152695b == 11) {
                    qVar = (C57186q) yVar.f152696c;
                } else {
                    qVar = C57186q.f152670c;
                }
                C56612d dVar = qVar.f152673b;
                if (dVar == null) {
                    dVar = C56612d.f151152f;
                }
                C56610b bVar = (C56610b) dVar.f151154a.get(0);
                C69664n.m101061g(bVar, "ampDocument");
                wVar.f378960a = bVar;
                wVar.f378961b.set(this);
                this.f379183k = 3;
                return;
            case 8:
                m226601v();
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    public final Duration mo44082e() {
        return Duration.ZERO;
    }

    /* renamed from: f */
    public final Optional mo44083f() {
        return Optional.empty();
    }

    /* renamed from: g */
    public final void mo44084g(C41590u uVar) {
        this.f379181i.add(uVar);
    }

    /* renamed from: h */
    public final void mo44085h(C41591v vVar) {
    }

    /* renamed from: i */
    public final void mo44086i() {
        m226600u(C41589t.INIT_START);
    }

    /* renamed from: j */
    public final void mo44087j() {
        C57186q qVar;
        C139335q qVar2;
        C57194y yVar = this.f379174b;
        if (yVar.f152695b == 11) {
            qVar = (C57186q) yVar.f152696c;
        } else {
            qVar = C57186q.f152670c;
        }
        C139336r rVar = this.f379182j;
        if ((qVar.f152672a & 1) != 0) {
            C56612d dVar = qVar.f152673b;
            if (dVar == null) {
                dVar = C56612d.f151152f;
            }
            C62971cq cqVar = dVar.f151154a;
            if (cqVar.isEmpty()) {
                qVar2 = C139336r.m226469a(C139321c.NO_STAMPS);
            } else if (!Collection.EL.stream(cqVar).allMatch(C139329k.f378944a)) {
                qVar2 = C139336r.m226469a(C139321c.NON_STORY_AMP);
            } else {
                C56612d dVar2 = qVar.f152673b;
                if (dVar2 == null) {
                    dVar2 = C56612d.f151152f;
                }
                long j = dVar2.f151156c;
                if (j < 0 || j >= ((long) cqVar.size())) {
                    qVar2 = C139336r.m226469a(C139321c.INVALID_INDEX_TO_DISPLAY);
                } else {
                    qVar2 = rVar.mo114905c((java.util.Collection) Collection.EL.stream(cqVar).map(C139327i.f378942a).collect(C58370cn.f155946a), (java.util.Collection) Collection.EL.stream(cqVar).map(C139328j.f378943a).collect(C58370cn.f155946a));
                }
            }
        } else {
            qVar2 = C139336r.m226469a(C139321c.NO_STAMPS);
        }
        if (qVar2.mo114897b()) {
            C56612d dVar3 = qVar.f152673b;
            if (dVar3 == null) {
                dVar3 = C56612d.f151152f;
            }
            C56612d dVar4 = qVar.f152673b;
            if (dVar4 == null) {
                dVar4 = C56612d.f151152f;
            }
            C56610b bVar = (C56610b) dVar3.f151154a.get(C139444aa.m226598a(dVar4.f151156c));
            if (this.f379179g) {
                C0154a aVar = new C0154a(this.f379176d.getChildFragmentManager());
                FragmentManager childFragmentManager = this.f379176d.getChildFragmentManager();
                Fragment c = childFragmentManager.f634a.mo671c(C139468l.m226675b(m226599t()));
                if (c != null) {
                    aVar.mo516m(c);
                }
                AccountId accountId = this.f379178f;
                C139467k kVar = new C139467k();
                C68324h.m98669f(kVar);
                C47247a.m84047b(kVar, accountId);
                C47243l.m84039a(kVar, bVar);
                aVar.mo511h(this.f379175c.getId(), kVar, C139468l.m226675b(m226599t()), 1);
                aVar.mo509f();
                kVar.mo17754z().f379242e = this;
            } else {
                C0154a aVar2 = new C0154a(this.f379176d.getChildFragmentManager());
                FragmentManager childFragmentManager2 = this.f379176d.getChildFragmentManager();
                Fragment c2 = childFragmentManager2.f634a.mo671c(C139468l.m226675b(m226599t()));
                if (c2 != null) {
                    aVar2.mo516m(c2);
                }
                AccountId accountId2 = this.f379178f;
                C139456b bVar2 = new C139456b();
                C68324h.m98669f(bVar2);
                C47247a.m84047b(bVar2, accountId2);
                C47243l.m84039a(bVar2, bVar);
                aVar2.mo511h(this.f379175c.getId(), bVar2, C139468l.m226675b(m226599t()), 1);
                aVar2.mo509f();
                bVar2.mo17754z().f379222m = this;
                C139457c a = bVar2.mo17754z();
                a.f379220k.mo56160e();
                a.f379220k.mo56161f();
            }
            m226600u(C41589t.INIT_END);
            m226600u(C41589t.LOAD_START);
            this.f379183k = 2;
        }
    }

    /* renamed from: k */
    public final void mo44088k() {
        FragmentManager childFragmentManager = this.f379176d.getChildFragmentManager();
        if (!m226603x(childFragmentManager.f634a.mo671c(C139468l.m226675b(m226599t())))) {
            m226601v();
            this.f379183k = 5;
        }
    }

    /* renamed from: l */
    public final void mo44089l(C41591v vVar) {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo44090m(Duration duration) {
    }

    /* renamed from: n */
    public final void mo44091n(boolean z) {
    }

    /* renamed from: o */
    public final void mo44092o() {
        FragmentManager childFragmentManager = this.f379176d.getChildFragmentManager();
        Fragment c = childFragmentManager.f634a.mo671c(C139468l.m226675b(m226599t()));
        if (!m226603x(c)) {
            if (c != null) {
                C0154a aVar = new C0154a(this.f379176d.getChildFragmentManager());
                aVar.mo516m(c);
                aVar.mo509f();
            }
            this.f379183k = 5;
        }
    }

    /* renamed from: p */
    public final /* synthetic */ void mo44093p() {
    }

    /* renamed from: q */
    public final int mo44094q() {
        return this.f379183k;
    }

    /* renamed from: r */
    public final void mo44095r(C41533l lVar) {
    }

    /* renamed from: s */
    public final C41506e mo43990s() {
        return new C41502a(Optional.m71637of(Duration.ZERO), Optional.empty());
    }
}
