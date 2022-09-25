package com.google.android.libraries.lens.view.textoverlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
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
import com.google.android.libraries.lens.common.text.selection.p2009ui.TextSelectionView;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.p2078at.C25499ae;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
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
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.g */
/* compiled from: PG */
public final class C28074g extends C28068ac implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C28093z f76404a;

    /* renamed from: b */
    private Context f76405b;

    /* renamed from: c */
    private final C2393x f76406c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f76407d = new C47515ab(this);

    /* renamed from: e */
    private boolean f76408e;

    @Deprecated
    public C28074g() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C28093z mo17754z() {
        C28093z zVar = this.f76404a;
        if (zVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f76408e) {
            return zVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo33530b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f76405b == null) {
            this.f76405b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f76405b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f76407d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f76406c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f76407d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f76407d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f76407d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f76407d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f76407d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f76407d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f76407d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C28093z a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.text_selection_layout, viewGroup, false);
            TextSelectionView textSelectionView = (TextSelectionView) inflate.findViewById(R.id.lens_text_selection_view);
            textSelectionView.getClass();
            a.f76452e.mo33801b(textSelectionView, a.f76451d.mo33805a(C28427h.m53115a(72839)));
            Resources resources = inflate.getContext().getResources();
            a.f76458k = resources.getDimensionPixelSize(R.dimen.text_highlight_vertical_margin);
            a.f76459l = resources.getDimensionPixelSize(R.dimen.text_highlight_horizontal_margin);
            a.f76450c.f76417e.mo5704e(a.f76449b, new C28082o(a));
            a.f76450c.f76418f.mo5704e(a.f76449b, new C28083p(a));
            a.f76450c.f76420h.mo5704e(a.f76449b, new C28084q(a));
            a.f76450c.f76416d.mo5704e(a.f76449b, new C28085r(a));
            a.f76450c.f76421i.mo5704e(a.f76449b, new C28086s(a));
            a.f76450c.f76423k.mo5704e(a.f76449b, new C28087t(a));
            ((TextSelectionLayout) inflate.findViewById(R.id.lens_text_selection_layout)).f76383a = new C28088u(a);
            a.f76455h.f69455a.mo5704e(a.f76449b, new C28089v(a));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f76407d.mo51374b();
        try {
            super.onDestroy();
            mo17754z().mo33553e();
            b.close();
            return;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f76407d.mo51375c();
        try {
            super.onDestroyView();
            C28067ab abVar = mo17754z().f76463p;
            if (abVar != null) {
                abVar.mo33525a();
            }
            c.close();
            return;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f76407d.mo51376d();
        try {
            super.onDetach();
            this.f76408e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f76407d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f76407d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f76407d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f76407d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f76407d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f76407d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f76407d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28073f.m52331a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f76407d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f76407d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f76407d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f76407d;
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
        C47515ab abVar = this.f76407d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f76407d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f76407d;
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
        this.f76407d.mo51381i();
        try {
            if (!this.f76408e) {
                super.onAttach(context);
                if (this.f76404a == null) {
                    Object jN = mo33531d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C28074g) {
                        C28074g gVar = (C28074g) fragment;
                        C68225k.m98532d(gVar);
                        C25989d dVar = (C25989d) ((C74176nj) jN).f206836d.f205212G.mo17428b();
                        C27232l lVar = (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b();
                        ((C74176nj) jN).f206836d.mo68978K();
                        this.f76404a = new C28093z(gVar, (C28079l) ((C74176nj) jN).f206836d.f205324bm.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (Executor) ((C74176nj) jN).f206677a.lL.mo17428b(), (C25499ae) ((C74176nj) jN).f206836d.f205247aO.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo67014gb().mo60911d());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f76407d, this.f76406c));
                    } else {
                        String obj = C28093z.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f76407d;
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
                C28073f.m52331a(th, th2);
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
