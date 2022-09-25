package com.google.android.libraries.lens.view.filters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C73958bn;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2099c.C25941f;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.gallery.p2109b.C26322b;
import com.google.android.libraries.lens.view.gleam.C26586ff;
import com.google.android.libraries.lens.view.onboarding.C27481an;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2113h.p2132j.C26892g;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60888db;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.ah */
/* compiled from: PG */
public final class C25901ah extends C25933bl implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C25909ap f70370a;

    /* renamed from: b */
    private Context f70371b;

    /* renamed from: c */
    private final C2393x f70372c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f70373d = new C47515ab(this);

    /* renamed from: e */
    private boolean f70374e;

    @Deprecated
    public C25901ah() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C25909ap mo17754z() {
        C25909ap apVar = this.f70370a;
        if (apVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f70374e) {
            return apVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31065b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f70371b == null) {
            this.f70371b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f70371b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f70373d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f70372c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f70373d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f70373d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f70373d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f70373d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo17754z().mo31067b();
    }

    public final void onCreate(Bundle bundle) {
        this.f70373d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f70373d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f70373d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C25909ap a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.lvf_buttons, viewGroup, false);
            a.f70391j.mo33801b(inflate, a.f70392k.mo33805a(C28427h.m53115a(139587)));
            a.f70394m = new C25928bg(inflate.findViewById(R.id.shutter_button_pulse_view), layoutInflater.getContext().getResources(), a.f70389h, a.f70393l, a.f70390i, a.f70392k, a.f70388g, a.f70391j);
            a.f70395n = (LvfButtonsView) inflate.findViewById(R.id.lvf_buttons_view);
            a.f70395n.mo17754z().f70418j = a.f70401t;
            AccountId accountId = a.f70382a;
            C26322b bVar = new C26322b();
            C68324h.m98669f(bVar);
            C47247a.m84047b(bVar, accountId);
            C0154a aVar = new C0154a(a.f70385d.getChildFragmentManager());
            aVar.mo511h(R.id.image_picker_button_view, bVar, (String) null, 1);
            aVar.mo509f();
            a.f70387f.mo31109b(a.f70385d.getViewLifecycleOwner(), new C25907an(a));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f70373d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f70373d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f70373d.mo51376d();
        try {
            super.onDetach();
            this.f70374e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f70373d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f70373d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f70373d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f70373d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f70373d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f70373d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f70373d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25900ag.m47775a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f70373d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f70373d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f70373d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f70373d;
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
        C47515ab abVar = this.f70373d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f70373d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f70373d;
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
        this.f70373d.mo51381i();
        try {
            if (!this.f70374e) {
                super.onAttach(context);
                if (this.f70370a == null) {
                    Object jN = mo31098d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C73958bn bnVar = ((C74176nj) jN).f206836d;
                    C26892g gVar = new C26892g((AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, bnVar.f205264af);
                    C25989d dVar = (C25989d) bnVar.f205212G.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C25901ah) {
                        C25901ah ahVar = (C25901ah) fragment;
                        C68225k.m98532d(ahVar);
                        this.f70370a = new C25909ap(accountId, gVar, dVar, ahVar, (C26586ff) ((C74176nj) jN).f206836d.f205233aA.mo17428b(), (C25941f) ((C74176nj) jN).f206836d.f205284az.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C25225bd) ((C74176nj) jN).f206677a.a.f203105jf.mo17428b(), (C60888db) ((C74176nj) jN).f206677a.lL.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199598hz.mo17428b()).booleanValue(), (C27481an) ((C74176nj) jN).f206836d.f205268aj.mo17428b(), (C24974a) ((C74176nj) jN).f206836d.f205261ac.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f70373d, this.f70372c));
                    } else {
                        String obj = C25909ap.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f70373d;
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
                C25900ag.m47775a(th2, th3);
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
