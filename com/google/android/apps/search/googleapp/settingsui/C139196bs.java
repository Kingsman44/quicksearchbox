package com.google.android.apps.search.googleapp.settingsui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139874j;
import com.google.android.apps.search.googleapp.settingsui.p10483b.C139175b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.ArrayList;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.bs */
/* compiled from: PG */
public final class C139196bs extends C139213ch implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139198bu f378565a;

    /* renamed from: c */
    private Context f378566c;

    /* renamed from: d */
    private final C2393x f378567d = new C2393x(this);

    /* renamed from: e */
    private boolean f378568e;

    @Deprecated
    public C139196bs() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139198bu mo17754z() {
        C139198bu buVar = this.f378565a;
        if (buVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378568e) {
            return buVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114812b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378566c == null) {
            this.f378566c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378566c;
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
        return this.f378567d;
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
            C139195br.m226145a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139198bu a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.googleapp_settings_two_pane_fragment, viewGroup, false);
            C28306ab abVar = a.f378571b;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(true != a.f378573d ? 158669 : 158667)));
            Fragment b = a.f378570a.getChildFragmentManager().f634a.mo670b(R.id.googleapp_settings_detail_pane);
            SettingsPageFragment settingsPageFragment = b instanceof SettingsPageFragment ? (SettingsPageFragment) b : null;
            C139874j jVar = settingsPageFragment != null ? settingsPageFragment.mo17754z().f378523m : null;
            C139874j jVar2 = C139874j.TOP;
            Fragment b2 = a.f378570a.getChildFragmentManager().f634a.mo670b(R.id.googleapp_settings_header_pane);
            if (a.f378573d) {
                inflate.findViewById(R.id.googleapp_settings_header_pane).setVisibility(0);
                if (b2 == null) {
                    FragmentManager childFragmentManager = a.f378570a.getChildFragmentManager();
                    C69664n.m101060f(childFragmentManager, "twoPaneFragment.childFragmentManager");
                    C0154a aVar = new C0154a(childFragmentManager);
                    aVar.mo689v(R.id.googleapp_settings_header_pane, a.f378572c.mo114791a(new C139160an(C139874j.TOP), (C139873i) null), "HEADER_PANE_FRAGMENT_TAG");
                    aVar.mo509f();
                }
                if (jVar == jVar2) {
                    a.mo114814b(new C139160an(C139874j.GENERAL), (C139873i) null);
                }
            } else {
                inflate.findViewById(R.id.googleapp_settings_header_pane).setVisibility(8);
                if (b2 != null) {
                    FragmentManager childFragmentManager2 = a.f378570a.getChildFragmentManager();
                    C69664n.m101060f(childFragmentManager2, "twoPaneFragment.childFragmentManager");
                    C0154a aVar2 = new C0154a(childFragmentManager2);
                    aVar2.mo516m(b2);
                    aVar2.mo509f();
                }
            }
            a.mo114815c();
            FragmentManager childFragmentManager3 = a.f378570a.getChildFragmentManager();
            C139197bt btVar = new C139197bt(a);
            if (childFragmentManager3.f643j == null) {
                childFragmentManager3.f643j = new ArrayList();
            }
            childFragmentManager3.f643j.add(btVar);
            C69664n.m101060f(inflate, "root");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C139195br.m226145a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f378568e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139195br.m226145a(th, th);
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
            C139195br.m226145a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C139175b.class, new C139199bv(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139195br.m226145a(th, th);
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
            if (!this.f378568e) {
                super.onAttach(context);
                if (this.f378565a == null) {
                    Object jN = mo114842d().mo17653jN();
                    Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C139196bs) {
                        C139196bs bsVar = (C139196bs) fragment;
                        C68225k.m98532d(bsVar);
                        this.f378565a = new C139198bu(activity, accountId, bsVar, (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo67089kC(), ((C74176nj) jN).mo69611dA());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f378567d));
                    } else {
                        String obj = C139198bu.class.toString();
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
                C139195br.m226145a(th, th2);
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
