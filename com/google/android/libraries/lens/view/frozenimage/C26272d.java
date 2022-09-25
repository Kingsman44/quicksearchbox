package com.google.android.libraries.lens.view.frozenimage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p10982ad.C147444h;
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

/* renamed from: com.google.android.libraries.lens.view.frozenimage.d */
/* compiled from: PG */
public final class C26272d extends C26287s implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C26285q f71404a;

    /* renamed from: b */
    private Context f71405b;

    /* renamed from: c */
    private final C2393x f71406c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f71407d = new C47515ab(this);

    /* renamed from: e */
    private boolean f71408e;

    @Deprecated
    public C26272d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C26285q mo17754z() {
        C26285q qVar = this.f71404a;
        if (qVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f71408e) {
            return qVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31477b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f71405b == null) {
            this.f71405b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f71405b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f71407d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f71406c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f71407d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f71407d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f71407d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f71407d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f71407d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f71407d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f71407d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C26285q a = mo17754z();
            a.f71430f = (FrozenImageView) layoutInflater.inflate(R.layout.frozen_image, viewGroup, false);
            FrozenImageView frozenImageView = a.f71430f;
            C28443m mVar = a.f71428d;
            C26286r rVar = new C26286r(frozenImageView);
            frozenImageView.f71402a = new GestureDetector(frozenImageView.getContext(), rVar);
            frozenImageView.f71402a.setOnDoubleTapListener(rVar);
            frozenImageView.f71403b = mVar;
            a.f71429e.mo33801b(a.f71430f, a.f71427c.mo33805a(C28427h.m53115a(72772)));
            a.f71431g = new C147444h(a.f71430f, View.ALPHA);
            a.f71431g.mo124186l(0.0f);
            a.f71426b.f71411a.mo5704e(a.f71425a, new C26279k(a));
            a.f71426b.f71412b.mo5704e(a.f71425a, new C26280l(a));
            a.f71426b.f71413c.mo5704e(a.f71425a, new C26281m(a));
            a.f71426b.f71414d.mo5704e(a.f71425a, new C26282n(a));
            FrozenImageView frozenImageView2 = a.f71430f;
            C47831fm.m85019n();
            return frozenImageView2;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f71407d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f71407d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f71407d.mo51376d();
        try {
            super.onDetach();
            this.f71408e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f71407d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f71407d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f71407d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f71407d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f71407d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f71407d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f71407d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26271c.m48490a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f71407d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f71407d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f71407d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f71407d;
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
        C47515ab abVar = this.f71407d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f71407d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f71407d;
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
        this.f71407d.mo51381i();
        try {
            if (!this.f71408e) {
                super.onAttach(context);
                if (this.f71404a == null) {
                    Object jN = mo31490d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C26272d) {
                        C26272d dVar = (C26272d) fragment;
                        C68225k.m98532d(dVar);
                        this.f71404a = new C26285q(dVar, new C26275g(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f71407d, this.f71406c));
                    } else {
                        String obj = C26285q.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f71407d;
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
                C26271c.m48490a(th, th2);
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
