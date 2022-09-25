package com.google.android.libraries.search.video.players;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0172ar;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2390u;
import androidx.lifecycle.C2391v;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.video.p3191a.C41452k;
import com.google.android.libraries.search.video.p3191a.C41454m;
import com.google.android.libraries.search.video.players.internal.C41578d;
import com.google.android.youtube.player.C45438a;
import com.google.android.youtube.player.C45507c;
import com.google.android.youtube.player.C45508d;
import com.google.android.youtube.player.C45509e;
import com.google.android.youtube.player.C45510f;
import com.google.android.youtube.player.C45511g;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3561b.C45447af;
import com.google.android.youtube.player.p3561b.C45448ag;
import com.google.android.youtube.player.p3561b.C45504x;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* compiled from: PG */
public final class YouTubeWrapper implements C45511g, C45508d, C45438a {

    /* renamed from: u */
    public static final /* synthetic */ int f108586u = 0;

    /* renamed from: w */
    private static final C58528ij f108587w = new C58759qy("com.google.android.googlequicksearchbox");

    /* renamed from: A */
    private final boolean f108588A;

    /* renamed from: B */
    private final boolean f108589B;

    /* renamed from: C */
    private final C2390u f108590C = new C2376g() {
        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final void mo3521gW(C2391v vVar) {
            YouTubeWrapper youTubeWrapper = YouTubeWrapper.this;
            if (vVar == youTubeWrapper.f108603k) {
                youTubeWrapper.mo44068d();
            }
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    };

    /* renamed from: D */
    private final C41578d f108591D;

    /* renamed from: E */
    private final C41550ab f108592E;

    /* renamed from: a */
    final C41565aq f108593a;

    /* renamed from: b */
    final C41564ap f108594b = new C41564ap(this);

    /* renamed from: c */
    public final Executor f108595c;

    /* renamed from: d */
    public final C46439e f108596d;

    /* renamed from: e */
    public final Set f108597e;

    /* renamed from: f */
    public final C21370a f108598f;

    /* renamed from: g */
    public final Map f108599g;

    /* renamed from: h */
    public final C41452k f108600h;

    /* renamed from: i */
    public final C2390u f108601i = new C2376g() {
        /* renamed from: gW */
        public final /* synthetic */ void mo3521gW(C2391v vVar) {
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }

        /* renamed from: gV */
        public final void mo3520gV(C2391v vVar) {
            YouTubeWrapper youTubeWrapper = YouTubeWrapper.this;
            C46439e eVar = youTubeWrapper.f108596d;
            eVar.getClass();
            eVar.mo50429i(youTubeWrapper.f108602j);
        }
    };

    /* renamed from: j */
    public final C46440f f108602j = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Integer num = (Integer) obj;
            YouTubeWrapper youTubeWrapper = YouTubeWrapper.this;
            if (youTubeWrapper.f108603k != null && num.intValue() == youTubeWrapper.f108605m) {
                YouTubeWrapper.this.mo44066b(C45510f.UNKNOWN_ERROR, BuildConfig.FLAVOR);
            }
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            List list = (List) obj2;
            YouTubeWrapper youTubeWrapper = YouTubeWrapper.this;
            if (youTubeWrapper.f108603k != null && num.intValue() == youTubeWrapper.f108605m) {
                C58838bb.m90868c(list.size() == 2);
                String str = (String) list.get(0);
                C45510f fVar = C45510f.UNKNOWN_ERROR;
                if (str != null) {
                    try {
                        fVar = C45510f.m81264a(str);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                YouTubeWrapper.this.mo44066b(fVar, (String) list.get(1));
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: k */
    YouTubeEmbedSupportFragment f108603k;

    /* renamed from: l */
    boolean f108604l;

    /* renamed from: m */
    public int f108605m;

    /* renamed from: n */
    public Runnable f108606n;

    /* renamed from: o */
    public Runnable f108607o;

    /* renamed from: p */
    public ViewGroup f108608p;

    /* renamed from: q */
    public Duration f108609q = Duration.ZERO;

    /* renamed from: r */
    public int f108610r;

    /* renamed from: s */
    public int f108611s;

    /* renamed from: t */
    public C45448ag f108612t;

    /* renamed from: x */
    private final AccountId f108613x;

    /* renamed from: y */
    private final Fragment f108614y;

    /* renamed from: z */
    private final C46128f f108615z;

    public YouTubeWrapper(C21370a aVar, Fragment fragment, C41578d dVar, AccountId accountId, C46128f fVar, C46439e eVar, Executor executor, C41454m mVar, C41550ab abVar, C41452k kVar) {
        this.f108598f = aVar;
        this.f108614y = fragment;
        this.f108591D = dVar;
        this.f108613x = accountId;
        this.f108615z = fVar;
        this.f108596d = eVar;
        this.f108595c = executor;
        Context context = fragment.getContext();
        this.f108593a = new C41565aq(context);
        this.f108610r = 1;
        this.f108592E = abVar;
        C58528ij ijVar = f108587w;
        this.f108588A = ((C58759qy) ijVar).f156534a.equals(context.getPackageName());
        this.f108589B = mVar.mo43985d();
        this.f108600h = kVar;
        this.f108611s = 1;
        this.f108599g = new HashMap();
        this.f108597e = new HashSet();
    }

    /* renamed from: h */
    public static boolean m72634h(int i) {
        C45510f fVar = C45510f.SUCCESS;
        if (i == 0) {
            i = 1;
        }
        switch (i - 1) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: j */
    private final void m72635j(YouTubeEmbedSupportFragment youTubeEmbedSupportFragment) {
        if (!C58832aw.m90831a(this.f108603k, youTubeEmbedSupportFragment)) {
            this.f108603k = youTubeEmbedSupportFragment;
            this.f108605m++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C41560al mo44065a(ViewGroup viewGroup) {
        if (viewGroup == null || !this.f108599g.containsKey(viewGroup)) {
            return new C41560al();
        }
        return (C41560al) this.f108599g.get(viewGroup);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo44066b(C45510f fVar, String str) {
        C45510f fVar2 = C45510f.SUCCESS;
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            this.f108610r = 5;
        } else if (ordinal == 1 || ordinal == 2 || ordinal == 9) {
            this.f108610r = 2;
        } else {
            this.f108610r = 3;
        }
        for (C41562an v : this.f108597e) {
            v.mo44098v(fVar);
        }
        int i = this.f108610r;
        if (i != 0) {
            if (i == 5) {
                YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = this.f108603k;
                youTubeEmbedSupportFragment.getClass();
                if (this.f108588A) {
                    this.f108592E.mo44079a(youTubeEmbedSupportFragment, str);
                }
                Runnable runnable = this.f108606n;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = this.f108607o;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
            this.f108606n = null;
            this.f108607o = null;
            return;
        }
        throw null;
    }

    /* renamed from: d */
    public final void mo44068d() {
        YouTubeEmbedSupportFragment youTubeEmbedSupportFragment;
        if (this.f108600h.mo43981a().mo43971f() && (youTubeEmbedSupportFragment = this.f108603k) != null) {
            youTubeEmbedSupportFragment.f118840a.mo49646k(C45507c.f118949b);
            youTubeEmbedSupportFragment.mo49582m(this);
            youTubeEmbedSupportFragment.mo49581l(this);
            youTubeEmbedSupportFragment.mo49577h(C45509e.f118951b);
            youTubeEmbedSupportFragment.getLifecycle().mo5791c(this.f108590C);
            if (this.f108589B) {
                youTubeEmbedSupportFragment.mo49580k(this);
            }
        }
        m72635j((YouTubeEmbedSupportFragment) null);
        this.f108610r = 1;
        this.f108606n = null;
        this.f108607o = null;
        this.f108612t = null;
        this.f108593a.removeAllViews();
    }

    /* renamed from: e */
    public final void mo44069e(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = this.f108608p;
        if (viewGroup2 != viewGroup) {
            this.f108608p = viewGroup;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f108593a);
            }
            if (viewGroup != null) {
                viewGroup.addView(this.f108593a);
                C41568c cVar = (C41568c) mo44065a(viewGroup).f108649a;
                boolean z = true;
                boolean z2 = cVar.f108675d.isPresent() && ((C57143b) cVar.f108675d.get()).f152531b;
                C41565aq aqVar = this.f108593a;
                if (!cVar.f108674c || z2) {
                    z = false;
                }
                aqVar.f108661a = z;
            }
            for (C41562an t : this.f108597e) {
                t.mo44096t(viewGroup2);
            }
        }
    }

    /* renamed from: f */
    public final void mo44070f(YouTubeEmbedSupportFragment youTubeEmbedSupportFragment, C41566ar arVar) {
        C41568c cVar = (C41568c) arVar;
        Duration duration = cVar.f108673b;
        if (cVar.f108674c || duration.isNegative() || duration.isZero() || (mo44065a(this.f108608p).f108652d && this.f108604l)) {
            youTubeEmbedSupportFragment.mo49578i(cVar.f108672a);
            return;
        }
        youTubeEmbedSupportFragment.mo49584o(String.format("https://www.youtube.com/embed/%s?t=%s", new Object[]{cVar.f108672a, Long.valueOf(duration.getSeconds())}));
    }

    /* renamed from: g */
    public final boolean mo44071g() {
        return this.f108610r != 3 && !this.f108614y.isStateSaved();
    }

    /* renamed from: i */
    public final void mo44072i(C45504x xVar) {
        m72636k(5);
    }

    /* renamed from: m */
    public final void mo44073m(YouTubeEmbedSupportFragment youTubeEmbedSupportFragment, C45448ag agVar) {
        this.f108612t = agVar;
        C45510f fVar = C45510f.SUCCESS;
        int i = agVar.f118867b - 1;
        if (i == 0) {
            m72636k(2);
        } else if (i == 1) {
            this.f108609q = Duration.ofMillis(this.f108598f.mo26870b());
            if (this.f108594b.f108659b) {
                m72636k(4);
                this.f108594b.f108659b = false;
                return;
            }
            m72636k(3);
        } else if (i == 2) {
            C41564ap apVar = this.f108594b;
            synchronized (apVar) {
                if (apVar.f108658a && apVar.f108660c.f108603k != null) {
                    Duration ofMillis = Duration.ofMillis(agVar.f118866a);
                    YouTubeWrapper youTubeWrapper = apVar.f108660c;
                    C41566ar arVar = youTubeWrapper.mo44065a(youTubeWrapper.f108608p).f108649a;
                    apVar.f108659b = true;
                    YouTubeWrapper youTubeWrapper2 = apVar.f108660c;
                    C41563ao aoVar = new C41563ao(apVar, arVar, ofMillis);
                    youTubeWrapper2.f108606n = aoVar;
                    aoVar.run();
                    apVar.f108660c.f108606n = null;
                    apVar.f108658a = false;
                }
            }
            m72636k(5);
        } else if (i != 3) {
            m72636k(1);
        } else {
            this.f108609q = Duration.ofMillis(this.f108598f.mo26870b());
            m72636k(4);
            this.f108594b.f108659b = false;
        }
    }

    /* renamed from: n */
    public final void mo44074n(C45447af afVar) {
        m72636k(7);
        if (afVar.f118865a == 9) {
            this.f108610r = 6;
        }
        for (C41562an d : this.f108597e) {
            d.mo44081d(this, afVar);
        }
    }

    /* renamed from: k */
    private final void m72636k(int i) {
        YouTubeEmbedSupportFragment youTubeEmbedSupportFragment;
        int i2 = this.f108611s;
        if (i2 == 0) {
            throw null;
        } else if (i2 != i) {
            this.f108611s = i;
            C41560al a = mo44065a(this.f108608p);
            if (!(a.f108654f == 1 || !m72634h(this.f108611s) || (youTubeEmbedSupportFragment = this.f108603k) == null)) {
                youTubeEmbedSupportFragment.mo49576g(a.f108654f == 2);
                a.f108654f = 1;
            }
            for (C41562an u : this.f108597e) {
                u.mo44097u(this, this.f108611s);
            }
        }
    }

    /* renamed from: c */
    public final void mo44067c() {
        C60870cx cxVar;
        FragmentManager fragmentManager;
        int i = this.f108610r;
        if (i != 0) {
            if (i == 6) {
                Runnable runnable = this.f108606n;
                YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = this.f108603k;
                if (youTubeEmbedSupportFragment != null) {
                    Fragment parentFragment = youTubeEmbedSupportFragment.getParentFragment();
                    if (youTubeEmbedSupportFragment.isAdded() && parentFragment != null && !parentFragment.isStateSaved()) {
                        C0154a aVar = new C0154a(youTubeEmbedSupportFragment.getParentFragmentManager());
                        aVar.mo516m(youTubeEmbedSupportFragment);
                        aVar.mo509f();
                    }
                }
                mo44068d();
                this.f108606n = runnable;
            }
            if (this.f108603k == null) {
                YouTubeEmbedSupportFragment youTubeEmbedSupportFragment2 = new YouTubeEmbedSupportFragment();
                youTubeEmbedSupportFragment2.mo49575f(this);
                youTubeEmbedSupportFragment2.mo49574e(this);
                if (this.f108589B) {
                    youTubeEmbedSupportFragment2.mo49573d(this);
                }
                youTubeEmbedSupportFragment2.f118840a.mo49646k(new C41555ag(this));
                youTubeEmbedSupportFragment2.getLifecycle().mo5790b(this.f108590C);
                youTubeEmbedSupportFragment2.mo49577h(new C41556ah(this));
                m72635j(youTubeEmbedSupportFragment2);
                this.f108610r = 2;
            }
            YouTubeEmbedSupportFragment youTubeEmbedSupportFragment3 = this.f108603k;
            youTubeEmbedSupportFragment3.getClass();
            if (!this.f108614y.equals(youTubeEmbedSupportFragment3.getParentFragment())) {
                C41578d dVar = this.f108591D;
                C0172ar arVar = dVar.f108694b;
                if (arVar != null) {
                    fragmentManager = arVar.f739a.f744e;
                } else {
                    fragmentManager = dVar.f108693a.getChildFragmentManager();
                }
                C0154a aVar2 = new C0154a(fragmentManager);
                Fragment c = fragmentManager.f634a.mo671c("YOUTUBE_FRAGMENT_TAG");
                if (c != null) {
                    aVar2.mo516m(c);
                }
                aVar2.mo685r(youTubeEmbedSupportFragment3, "YOUTUBE_FRAGMENT_TAG");
                aVar2.mo509f();
                View view = youTubeEmbedSupportFragment3.getView();
                if (view != null) {
                    this.f108593a.addView(view);
                }
            }
            int i2 = this.f108610r;
            if (i2 == 0) {
                throw null;
            } else if (i2 == 2) {
                C46439e eVar = this.f108596d;
                this.f108610r = 4;
                YouTubeEmbedSupportFragment youTubeEmbedSupportFragment4 = this.f108603k;
                youTubeEmbedSupportFragment4.getClass();
                C60870cx a = C2169h.m6027a(new C41557ai(this, youTubeEmbedSupportFragment4));
                if (this.f108588A) {
                    cxVar = this.f108615z.mo50215b(this.f108613x);
                } else {
                    cxVar = C60856cj.m92900i(BuildConfig.FLAVOR);
                }
                eVar.mo50445g(new C46438d(C60856cj.m92907p(a, cxVar)), new C46436b(Integer.valueOf(this.f108605m)), this.f108602j);
            }
        } else {
            throw null;
        }
    }
}
