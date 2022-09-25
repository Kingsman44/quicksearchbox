package com.google.android.apps.search.googleapp.discover.channels;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.discover.streamui.C134699b;
import com.google.android.apps.search.googleapp.discover.streamui.C134714d;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.discover.streamui.C134747g;
import com.google.android.apps.search.googleapp.discover.streamui.C134749h;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134709g;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134724d;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134758i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.p4283bv.p4354e.C57528m;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.r */
/* compiled from: PG */
public final class C134186r extends C134169cd implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C134112ac f365522a;

    /* renamed from: c */
    private Context f365523c;

    /* renamed from: d */
    private final C2393x f365524d = new C2393x(this);

    /* renamed from: e */
    private boolean f365525e;

    @Deprecated
    public C134186r() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C134112ac mo17754z() {
        C134112ac acVar = this.f365522a;
        if (acVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f365525e) {
            return acVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo111588b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f365523c == null) {
            this.f365523c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f365523c;
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
        return this.f365524d;
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
            C134185q.m217678a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C134112ac a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_discover_channels_fragment_layout, viewGroup, false);
            if (a.f365327e.getChildFragmentManager().f634a.mo671c("ChannelHeaderFragmentTag") == null) {
                AccountId accountId = a.f365326d;
                C53842b bVar = a.f365323a.f365529b;
                if (bVar == null) {
                    bVar = C53842b.f141313k;
                }
                C134116ag agVar = new C134116ag();
                C68324h.m98669f(agVar);
                C47247a.m84047b(agVar, accountId);
                C47243l.m84039a(agVar, bVar);
                C0154a aVar = new C0154a(a.f365327e.getChildFragmentManager());
                aVar.mo689v(R.id.googleapp_discover_channels_header, agVar, "ChannelHeaderFragmentTag");
                aVar.mo509f();
            }
            View findViewById = inflate.findViewById(R.id.googleapp_discover_channels_header);
            Fragment c = a.f365327e.getChildFragmentManager().f634a.mo671c("DiscoverFragmentTag");
            if (c == null) {
                C134747g gVar = (C134747g) C134749h.f366906k.createBuilder();
                C53842b bVar2 = a.f365323a.f365529b;
                if (bVar2 == null) {
                    bVar2 = C53842b.f141313k;
                }
                gVar.copyOnWrite();
                C134749h hVar = (C134749h) gVar.instance;
                bVar2.getClass();
                hVar.f366911d = bVar2;
                hVar.f366908a |= 4;
                gVar.copyOnWrite();
                C134749h hVar2 = (C134749h) gVar.instance;
                hVar2.f366908a |= 256;
                hVar2.f366917j = (int) a.f365327e.getContext().getResources().getDimension(R.dimen.googleapp_discover_channels_header_size);
                C57528m mVar = C57528m.ANDROID_CHANNEL_DETAIL;
                gVar.copyOnWrite();
                C134749h hVar3 = (C134749h) gVar.instance;
                hVar3.f366909b = mVar.f153693B;
                hVar3.f366908a |= 1;
                C57252bg bgVar = a.f365323a.f365530c;
                if (bgVar == null) {
                    bgVar = C57252bg.f152831d;
                }
                gVar.copyOnWrite();
                C134749h hVar4 = (C134749h) gVar.instance;
                bgVar.getClass();
                hVar4.f366914g = bgVar;
                hVar4.f366908a |= 32;
                C134699b bVar3 = C134699b.CHANNEL;
                gVar.copyOnWrite();
                C134749h hVar5 = (C134749h) gVar.instance;
                hVar5.f366915h = bVar3.f366817d;
                hVar5.f366908a |= 64;
                if (!a.f365323a.f365531d.isEmpty()) {
                    String str = a.f365323a.f365531d;
                    gVar.copyOnWrite();
                    C134749h hVar6 = (C134749h) gVar.instance;
                    str.getClass();
                    hVar6.f366908a |= 128;
                    hVar6.f366916i = str;
                }
                C134749h hVar7 = (C134749h) gVar.build();
                a.f365330h.mo111914b(C134758i.m218593a(hVar7));
                c = a.f365325c.mo111903a(a.f365326d, hVar7);
                C0154a aVar2 = new C0154a(a.f365327e.getChildFragmentManager());
                aVar2.mo689v(R.id.googleapp_discover_channels_feed, c, "DiscoverFragmentTag");
                aVar2.mo509f();
            }
            C134744f fVar = (C134744f) ((C47231d) c).mo17754z();
            fVar.mo111949c(new C134191w(findViewById));
            findViewById.addOnLayoutChangeListener(new C134192x(fVar));
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C134193y(fVar, findViewById));
            C28306ab abVar = a.f365329g;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(125303)));
            if (!a.f365331i) {
                fVar.mo111958l(new C134194z(findViewById));
            } else {
                if (a.f365327e.getChildFragmentManager().f634a.mo671c("SearchBarFragmentTag") == null) {
                    C0154a aVar3 = new C0154a(a.f365327e.getChildFragmentManager());
                    aVar3.mo511h(R.id.googleapp_discover_channels_search_box, C134163by.m217640a(a.f365326d), "SearchBarFragmentTag", 1);
                    aVar3.mo509f();
                }
                View findViewById2 = inflate.findViewById(R.id.googleapp_discover_channels_search_box);
                C28306ab abVar2 = a.f365329g;
                abVar2.mo33801b(findViewById2, abVar2.f76990a.mo33805a(C28427h.m53115a(132909)));
                fVar.mo111958l(new C134110aa(findViewById, findViewById2));
                if (a.f365327e.getChildFragmentManager().f634a.mo671c("QuickSearchBarFragmentTag") == null) {
                    C0154a aVar4 = new C0154a(a.f365327e.getChildFragmentManager());
                    aVar4.mo511h(R.id.googleapp_discover_channels_quick_return_search_box, C134163by.m217640a(a.f365326d), "QuickSearchBarFragmentTag", 1);
                    aVar4.mo509f();
                }
                View findViewById3 = inflate.findViewById(R.id.googleapp_discover_channels_quick_return_search_box);
                C28306ab abVar3 = a.f365329g;
                abVar3.mo33801b(findViewById3, abVar3.f76990a.mo33805a(C28427h.m53115a(132908)));
                fVar.mo111949c(new C134111ab(findViewById3, findViewById2));
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C134185q.m217678a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f365525e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C134185q.m217678a(th, th);
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
            C134185q.m217678a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C134112ac a = mo17754z();
            C47393f.m84233d(this, C134709g.class, new C134113ad(a));
            C47393f.m84233d(this, C134161bw.class, new C134114ae(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134185q.m217678a(th, th);
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
            if (!this.f365525e) {
                super.onAttach(context);
                if (this.f365522a == null) {
                    Object jN = mo111589d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C134188t tVar = (C134188t) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C134188t.f365526e, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(tVar);
                    C134139ba baVar = (C134139ba) ((C74176nj) jN).f206730b.f198178cs.mo17428b();
                    C134714d bR = ((C74176nj) jN).mo69522bR();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C134186r) {
                        C134186r rVar = (C134186r) fragment;
                        C68225k.m98532d(rVar);
                        this.f365522a = new C134112ac(tVar, baVar, bR, accountId, rVar, (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C134724d) ((C74176nj) jN).f206730b.f198179ct.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo67080jU());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f365524d));
                    } else {
                        String obj = C134112ac.class.toString();
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
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C134185q.m217678a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
