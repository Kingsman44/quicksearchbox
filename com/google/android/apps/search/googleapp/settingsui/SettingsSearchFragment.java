package com.google.android.apps.search.googleapp.settingsui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.widget.C0646fh;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.preference.C3995au;
import androidx.preference.Preference;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.apps.search.googleapp.p10536x.C139867c;
import com.google.android.apps.search.googleapp.p10536x.C139868d;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.apps.search.googleapp.p10536x.C139877m;
import com.google.android.apps.search.googleapp.p10536x.C139878n;
import com.google.android.apps.search.googleapp.p10536x.C139879o;
import com.google.android.apps.search.googleapp.p10536x.C139880p;
import com.google.android.apps.search.googleapp.settingsui.selectedpreference.C139253b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.ArrayList;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class SettingsSearchFragment extends C139212cg implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: f */
    private C139192bo f378418f;

    /* renamed from: g */
    private Context f378419g;

    /* renamed from: h */
    private final C2393x f378420h = new C2393x(this);

    /* renamed from: i */
    private final C47515ab f378421i = new C47515ab(this);

    /* renamed from: j */
    private boolean f378422j;

    @Deprecated
    public SettingsSearchFragment() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    static SettingsSearchFragment m226058b(AccountId accountId) {
        SettingsSearchFragment settingsSearchFragment = new SettingsSearchFragment();
        C68324h.m98669f(settingsSearchFragment);
        C47247a.m84047b(settingsSearchFragment, accountId);
        return settingsSearchFragment;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378419g == null) {
            this.f378419g = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378419g;
    }

    /* renamed from: fZ */
    public final void mo8407fZ(Bundle bundle, String str) {
        SettingsSearchFragment settingsSearchFragment = mo17754z().f378550b;
        C3995au auVar = settingsSearchFragment.f12807b;
        settingsSearchFragment.mo8413j(auVar.mo8432e(auVar.f12829a));
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f378421i.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f378420h;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f378421i.mo51380h(eyVar, z);
    }

    /* renamed from: m */
    public final C139192bo mo17754z() {
        C139192bo boVar = this.f378418f;
        if (boVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378422j) {
            return boVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final /* synthetic */ C47247a mo114777n() {
        return new C47242k(this);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f378421i.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f378421i.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f378421i.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f378421i.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f378421i.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Fragment fragment;
        boolean z;
        this.f378421i.mo51381i();
        try {
            C139192bo m = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            FragmentManager childFragmentManager = m.f378550b.getChildFragmentManager();
            C69664n.m101060f(childFragmentManager, "settingsSearchFragment.childFragmentManager");
            C139873i[] values = C139873i.values();
            ArrayList<C139873i> arrayList = new ArrayList<>();
            for (C139873i iVar : values) {
                if (m.f378561m.f101930a) {
                    C139879o oVar = (C139879o) m.f378551c.get(iVar);
                    if (oVar != null) {
                        z = oVar.mo111463m();
                    }
                } else {
                    C139879o oVar2 = (C139879o) m.f378551c.get(iVar);
                    if (oVar2 != null) {
                        z = oVar2.mo111462l();
                    }
                }
                if (z) {
                    arrayList.add(iVar);
                }
            }
            for (C139873i iVar2 : arrayList) {
                Fragment c = childFragmentManager.f634a.mo671c(iVar2.name());
                if (c != null) {
                    C0154a aVar = new C0154a(childFragmentManager);
                    aVar.mo516m(c);
                    aVar.mo509f();
                }
                C139879o oVar3 = (C139879o) m.f378551c.get(iVar2);
                if (oVar3 instanceof C139865b) {
                    fragment = C139228f.m226239a(m.f378549a, iVar2.name());
                } else if (oVar3 instanceof C139867c) {
                    fragment = C139238k.m226267a(m.f378549a, iVar2.name());
                } else if (oVar3 instanceof C139877m) {
                    fragment = C139250r.m226299a(m.f378549a, iVar2.name());
                } else {
                    if (!(oVar3 instanceof C139880p)) {
                        if (!(oVar3 instanceof C139875k)) {
                            if (oVar3 instanceof C139858a) {
                                fragment = C139173b.m226110a(m.f378549a, iVar2.name());
                            } else {
                                fragment = oVar3 instanceof C139868d ? ((C139868d) oVar3).mo112669b() : null;
                            }
                        }
                    }
                    fragment = C139264w.m226336a(m.f378549a, iVar2.name());
                }
                if (fragment != null) {
                    C0154a aVar2 = new C0154a(childFragmentManager);
                    aVar2.mo685r(fragment, iVar2.name());
                    aVar2.mo509f();
                    Preference a = ((C139878n) ((C47231d) fragment).mo17754z()).mo112667a();
                    a.mo8344K(iVar2.ordinal());
                    m.f378560l.put(iVar2, a);
                }
            }
            View inflate = layoutInflater.inflate(R.layout.googleapp_settings_search_fragment, viewGroup, false);
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.googleapp_settings_search_container);
            viewGroup2.addView(super.onCreateView(layoutInflater, viewGroup2, bundle));
            C46801dp dpVar = m.f378553e;
            C139189bl blVar = m.f378552d;
            dpVar.mo50707a(new C46719bc(blVar.f378544a, new C139188bk(blVar), "FILTERED_SETTINGS_DS_KEY"), m.f378557i);
            m.f378556h.mo114856a(C139159am.f378475a);
            C69664n.m101060f(inflate, "root");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f378421i.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f378421i.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f378421i.mo51376d();
        try {
            super.onDetach();
            this.f378422j = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f378421i.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f378421i.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54439e.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f378421i.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f378421i.mo51377e();
        try {
            super.onResume();
            ((SearchToolbarView) mo17754z().f378550b.requireView().findViewById(R.id.googleapp_settings_search_toolbar)).mo17754z().f378449e.expandActionView();
            e.close();
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f378421i.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f378421i.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f378421i.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f378421i.mo51381i();
        try {
            super.onViewCreated(view, bundle);
            C139192bo m = mo17754z();
            C69664n.m101061g(view, "view");
            m.f378550b.f12808c.setItemAnimator((C0646fh) null);
            m.f378559k = new C28452b(m.f378555g.mo33801b(view.findViewById(R.id.googleapp_settings_search_container), m.f378554f.mo33805a(C28427h.m53115a(123313))));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139190bm.m226140a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f378421i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f378421i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f378421i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f378421i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f378421i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f378421i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f378421i.mo51381i();
        try {
            if (!this.f378422j) {
                super.onAttach(context);
                if (this.f378418f == null) {
                    Object jN = mo114840o().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof SettingsSearchFragment) {
                        SettingsSearchFragment settingsSearchFragment = (SettingsSearchFragment) fragment;
                        C68225k.m98532d(settingsSearchFragment);
                        C139192bo boVar = new C139192bo(accountId, settingsSearchFragment, ((C74176nj) jN).mo69829hG(), ((C74176nj) jN).mo69612dB(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b(), (C139253b) ((C74176nj) jN).f206730b.f198027a.f199502gI.mo17428b());
                        this.f378418f = boVar;
                        boVar.f378562n = this;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f378421i, this.f378420h));
                    } else {
                        String obj = C139192bo.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f378421i;
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
                C139190bm.m226140a(th, th2);
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
