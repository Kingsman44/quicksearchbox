package com.google.android.libraries.lens.view.filters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.carousel.C25946b;
import com.google.android.libraries.lens.view.filters.carousel.C25961q;
import com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView;
import com.google.android.libraries.lens.view.filters.p2101e.C25987b;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.C25994i;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.onboarding.C27481an;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
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
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.c */
/* compiled from: PG */
public final class C25935c extends C25929bh implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C26012i f70466a;

    /* renamed from: b */
    private Context f70467b;

    /* renamed from: c */
    private final C2393x f70468c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f70469d = new C47515ab(this);

    /* renamed from: e */
    private boolean f70470e;

    @Deprecated
    public C25935c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C26012i mo17754z() {
        C26012i iVar = this.f70466a;
        if (iVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f70470e) {
            return iVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31087b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f70467b == null) {
            this.f70467b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f70467b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f70469d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f70468c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f70469d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f70469d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f70469d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f70469d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f70469d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f70469d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f70469d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C26012i a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.filter_carousel, viewGroup, false);
            a.f70687l = (FilterCarouselView) inflate.findViewById(R.id.filter_carousel_view);
            a.f70681f.mo33801b(a.f70687l, a.f70683h.mo33805a(C28427h.m53115a(101611)));
            a.f70689n = a.f70686k.mo31129a(a.f70688m, layoutInflater, a.f70676a.f70703c, false);
            C25961q a2 = a.f70687l.mo17754z();
            a2.f70552e.setAdapter(a.f70689n);
            a.f70687l.mo17754z().f70557j = a.f70691p;
            C25961q a3 = a.f70687l.mo17754z();
            C25994i iVar = a.f70677b.f70642a;
            a3.mo31146h(iVar.mo31208a(iVar.f70649b));
            a.f70684i.mo5704e(a.f70679d.getViewLifecycleOwner(), new C25996f(a));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f70469d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f70469d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f70469d.mo51376d();
        try {
            super.onDetach();
            this.f70470e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f70469d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f70469d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f70469d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f70469d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f70469d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f70469d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f70469d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25920b.m47799a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f70469d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f70469d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f70469d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f70469d;
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
        C47515ab abVar = this.f70469d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f70469d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f70469d;
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
        this.f70469d.mo51381i();
        try {
            if (!this.f70470e) {
                super.onAttach(context);
                if (this.f70466a == null) {
                    Object jN = mo31088d().mo17653jN();
                    C26017n eN = ((C74176nj) jN).mo69677eN();
                    C26244b bVar = (C26244b) ((C74176nj) jN).f206836d.f205444z.mo17428b();
                    C25989d dVar = (C25989d) ((C74176nj) jN).f206836d.f205212G.mo17428b();
                    C25987b bVar2 = (C25987b) ((C74176nj) jN).f206836d.f205283ay.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C25935c) {
                        C25935c cVar = (C25935c) fragment;
                        C68225k.m98532d(cVar);
                        this.f70466a = new C26012i(eN, dVar, bVar2, cVar, (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C25752a) ((C74176nj) jN).f206836d.f205279au.mo17428b(), (C27481an) ((C74176nj) jN).f206836d.f205268aj.mo17428b(), (C24974a) ((C74176nj) jN).f206836d.f205261ac.mo17428b(), (C25946b) ((C74176nj) jN).f206780bx.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f70469d, this.f70468c));
                    } else {
                        String obj = C26012i.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f70469d;
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
                C25920b.m47799a(th, th2);
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
