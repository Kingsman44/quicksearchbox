package com.google.android.apps.search.googleapp.discover.secondscreen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.discover.streamui.C134699b;
import com.google.android.apps.search.googleapp.discover.streamui.C134714d;
import com.google.android.apps.search.googleapp.discover.streamui.C134747g;
import com.google.android.apps.search.googleapp.discover.streamui.C134749h;
import com.google.android.apps.search.googleapp.discover.streamui.C134767i;
import com.google.android.apps.search.googleapp.p10115a.p10116a.C133074a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.monitoring.feedback.HelpAndFeedbackStarter;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47716g;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47722m;
import com.google.common.base.C58838bb;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.p4283bv.p4354e.C57528m;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57060ab;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57251bf;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69098s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.secondscreen.j */
/* compiled from: PG */
public final class C134619j extends C134626q implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C134624o f366588a;

    /* renamed from: c */
    private Context f366589c;

    /* renamed from: d */
    private final C2393x f366590d = new C2393x(this);

    /* renamed from: e */
    private boolean f366591e;

    @Deprecated
    public C134619j() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C134624o mo17754z() {
        C134624o oVar = this.f366588a;
        if (oVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f366591e) {
            return oVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo111848b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f366589c == null) {
            this.f366589c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f366589c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f366590d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134618i.m218347a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C53842b bVar;
        C53842b bVar2;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C134624o a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            C69664n.m101061g(viewGroup, "parent");
            View inflate = layoutInflater.inflate(R.layout.googleapp_second_screen_fragment, viewGroup, false);
            C133074a aVar = (C133074a) a.f366604e.orElse(null);
            if (aVar != null) {
                C69664n.m101059e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup2 = (ViewGroup) inflate;
                aVar.mo110969a();
            }
            C69664n.m101060f(inflate, "root");
            C69664n.m101061g(inflate, "root");
            View findViewById = inflate.findViewById(R.id.googleapp_second_screen_header_toolbar);
            C69664n.m101059e(findViewById, "null cannot be cast to non-null type android.support.v7.widget.Toolbar");
            Toolbar toolbar = (Toolbar) findViewById;
            toolbar.mo2424y(a.f366600a.getContext(), R.style.googleapp_second_screen_more_stories_header_text);
            C57060ab abVar = a.f366603d.f366595b;
            if (abVar == null) {
                abVar = C57060ab.f152318h;
            }
            if (abVar.f152321b == 3) {
                bVar = (C53842b) abVar.f152322c;
            } else {
                bVar = C53842b.f141313k;
            }
            toolbar.mo2423x(bVar.f141318d);
            toolbar.mo2419t(new C47591co(a.f366605f, "BackButtonClicked", new C134622m(a)));
            toolbar.f1961u = new C47716g(a.f366608i, "MenuItemClicked", new C134623n(a));
            Menu g = toolbar.mo2393g();
            C69664n.m101060f(g, "toolbar.menu");
            C134624o.m218356c(g, 2, true != a.f366609j ? R.string.googleapp_second_screen_manage_interests_menu_label : R.string.googleapp_second_screen_manage_channels_and_interests_menu_label);
            C134624o.m218356c(g, 1, R.string.googleapp_second_screen_settings_menu_label);
            C134624o.m218356c(g, 3, R.string.googleapp_second_screen_feedback_menu_label);
            C134624o.m218356c(g, 4, R.string.googleapp_second_screen_help_menu_label);
            FragmentManager childFragmentManager = a.f366600a.getChildFragmentManager();
            if (childFragmentManager.f634a.mo670b(R.id.googleapp_second_screen_feed) == null) {
                C134714d dVar = a.f366601b;
                AccountId accountId = a.f366602c;
                C134747g gVar = (C134747g) C134749h.f366906k.createBuilder();
                C57060ab abVar2 = a.f366603d.f366595b;
                if (abVar2 == null) {
                    abVar2 = C57060ab.f152318h;
                }
                if (abVar2.f152321b == 3) {
                    bVar2 = (C53842b) abVar2.f152322c;
                } else {
                    bVar2 = C53842b.f141313k;
                }
                gVar.copyOnWrite();
                C134749h hVar = (C134749h) gVar.instance;
                bVar2.getClass();
                hVar.f366911d = bVar2;
                hVar.f366908a |= 4;
                C57528m mVar = C57528m.AGSA_SECOND_SCREEN;
                gVar.copyOnWrite();
                C134749h hVar2 = (C134749h) gVar.instance;
                hVar2.f366909b = mVar.f153693B;
                hVar2.f366908a |= 1;
                C57251bf bfVar = (C57251bf) C57252bg.f152831d.createBuilder();
                bfVar.copyOnWrite();
                C57252bg bgVar = (C57252bg) bfVar.instance;
                bgVar.f152833a |= 1;
                bgVar.f152834b = 7;
                bfVar.copyOnWrite();
                C57252bg bgVar2 = (C57252bg) bfVar.instance;
                bgVar2.f152833a = 2 | bgVar2.f152833a;
                bgVar2.f152835c = -1;
                C57252bg bgVar3 = (C57252bg) bfVar.build();
                gVar.copyOnWrite();
                C134749h hVar3 = (C134749h) gVar.instance;
                bgVar3.getClass();
                hVar3.f366914g = bgVar3;
                hVar3.f366908a |= 32;
                C57060ab abVar3 = a.f366603d.f366595b;
                if (abVar3 == null) {
                    abVar3 = C57060ab.f152318h;
                }
                C69664n.m101060f(abVar3, "secondScreenFragmentArgs.openChannelData");
                C134699b a2 = C134767i.m218603a(abVar3);
                gVar.copyOnWrite();
                C134749h hVar4 = (C134749h) gVar.instance;
                hVar4.f366915h = a2.f366817d;
                hVar4.f366908a |= 64;
                C62942bv build = gVar.build();
                C69664n.m101060f(build, "newBuilder()\n           …e)\n              .build()");
                Fragment a3 = dVar.mo111903a(accountId, (C134749h) build);
                C69664n.m101060f(childFragmentManager, BuildConfig.FLAVOR);
                C0154a aVar2 = new C0154a(childFragmentManager);
                aVar2.mo511h(R.id.googleapp_second_screen_feed, a3, (String) null, 1);
                aVar2.mo509f();
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C134618i.m218347a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f366591e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C134618i.m218347a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C134618i.m218347a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f366591e) {
                super.onAttach(context);
                if (this.f366588a == null) {
                    Object jN = mo111852d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C134619j) {
                        C134619j jVar = (C134619j) fragment;
                        C68225k.m98532d(jVar);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C134621l lVar = (C134621l) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C134621l.f366592c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(lVar);
                        ((C74176nj) jN).f206730b.f198027a.mo66744bW();
                        C134624o oVar = r4;
                        C134624o oVar2 = new C134624o(jVar, ((C74176nj) jN).mo69522bR(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), lVar, Optional.empty(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).mo69662dz(), (HelpAndFeedbackStarter) ((C74176nj) jN).f207099z.mo17428b(), (C47722m) ((C74176nj) jN).f206670T.mo17428b(), C69098s.m100228a(((C74176nj) jN).f206730b.f198009I), (C71422aw) ((C74176nj) jN).f206677a.H.mo17428b());
                        this.f366588a = oVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f366590d));
                    } else {
                        String obj = C134624o.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C134618i.m218347a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
