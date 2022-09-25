package com.google.android.apps.search.googleapp.settingsui;

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
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.p10115a.p10116a.C133074a;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139874j;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.apps.search.googleapp.p10536x.C139879o;
import com.google.android.apps.search.googleapp.p10536x.C139880p;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.ar */
/* compiled from: PG */
public final class C139164ar extends C139209cd implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139165as f378478a;

    /* renamed from: c */
    private Context f378479c;

    /* renamed from: d */
    private final C2393x f378480d = new C2393x(this);

    /* renamed from: e */
    private boolean f378481e;

    @Deprecated
    public C139164ar() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139165as mo17754z() {
        C139165as asVar = this.f378478a;
        if (asVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378481e) {
            return asVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114793b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378479c == null) {
            this.f378479c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378479c;
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
        return this.f378480d;
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
            C139163aq.m226089a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139165as a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.googleapp_settings_fragment, viewGroup, false);
            C139873i iVar = null;
            C133074a aVar = (C133074a) a.f378483b.orElse(null);
            if (aVar != null) {
                C69664n.m101059e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup2 = (ViewGroup) inflate;
                aVar.mo110969a();
            }
            if (a.f378484c.getChildFragmentManager().f634a.mo670b(R.id.googleapp_settings_nav_host) == null) {
                AccountId accountId = a.f378485d;
                C139182be beVar = new C139182be();
                C68324h.m98669f(beVar);
                C47247a.m84047b(beVar, accountId);
                C0154a aVar2 = new C0154a(a.f378484c.getChildFragmentManager());
                aVar2.mo689v(R.id.googleapp_settings_nav_host, beVar, (String) null);
                aVar2.mo518o(beVar);
                aVar2.mo509f();
                C139183bf a2 = beVar.mo17754z();
                C139873i iVar2 = a.f378486e;
                boolean z = a.f378487f;
                if (a.f378488g) {
                    a2.mo114808d(SettingsSearchFragment.m226058b(a2.f378536b));
                } else {
                    C139161ao aoVar = C139159am.f378475a;
                    if (iVar2 == null) {
                        if (a2.f378538d) {
                            aoVar = new C139160an(C139874j.GENERAL);
                        }
                    } else if (z) {
                        C139879o oVar = (C139879o) a2.f378537c.get(iVar2);
                        if (oVar instanceof C139875k) {
                            aoVar = new C139158al(iVar2);
                        } else if (oVar instanceof C139880p) {
                            C139874j c = ((C139880p) oVar).mo112666c();
                            C69664n.m101060f(c, "linkSpec.page");
                            aoVar = new C139160an(c);
                        } else {
                            throw new IllegalArgumentException("The targetSetting must be a LinkSettingUiElement if openLinkedPage = true.");
                        }
                    } else {
                        C139874j jVar = iVar2.f380267aI;
                        C69664n.m101060f(jVar, "targetSetting.page");
                        aoVar = new C139160an(jVar);
                        iVar = iVar2;
                    }
                    C139198bu b = a2.mo114806b();
                    if (iVar2 == null) {
                        b.mo114813a();
                    }
                    if (!C69664n.m101066l(aoVar, C139159am.f378475a)) {
                        b.mo114814b(aoVar, iVar);
                    }
                }
            }
            C69664n.m101060f(inflate, "root");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C139163aq.m226089a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f378481e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139163aq.m226089a(th, th);
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
            C139163aq.m226089a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C32214c.class, new C139166at(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139163aq.m226089a(th, th);
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
            if (!this.f378481e) {
                super.onAttach(context);
                if (this.f378478a == null) {
                    Object jN = mo114834d().mo17653jN();
                    C136247a aVar = (C136247a) ((C74176nj) jN).f206662L.mo17428b();
                    IncognitoLifecycleObserver incognitoLifecycleObserver = (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C139143g gVar = (C139143g) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C139143g.f378433c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(gVar);
                    Optional empty = Optional.empty();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C139164ar) {
                        C139164ar arVar = (C139164ar) fragment;
                        C68225k.m98532d(arVar);
                        this.f378478a = new C139165as(aVar, incognitoLifecycleObserver, gVar, empty, arVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f378480d));
                    } else {
                        String obj = C139165as.class.toString();
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
                C139163aq.m226089a(th, th2);
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
