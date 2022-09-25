package com.google.android.libraries.lens.view.gallery.p2109b;

import android.animation.ObjectAnimator;
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
import android.widget.FrameLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.gallery.data.C26393l;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
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
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.gallery.b.b */
/* compiled from: PG */
public final class C26322b extends C26331j implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C26329i f71553a;

    /* renamed from: b */
    private Context f71554b;

    /* renamed from: c */
    private final C2393x f71555c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f71556d = new C47515ab(this);

    /* renamed from: e */
    private boolean f71557e;

    @Deprecated
    public C26322b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C26329i mo17754z() {
        C26329i iVar = this.f71553a;
        if (iVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f71557e) {
            return iVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31525b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f71554b == null) {
            this.f71554b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f71554b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f71556d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f71555c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f71556d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f71556d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f71556d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f71556d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f71556d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f71556d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f71556d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C26329i a = mo17754z();
            FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
            a.f71574k = ObjectAnimator.ofFloat(frameLayout, View.ALPHA, new float[]{0.0f, 1.0f});
            C25504aj ajVar = a.f71568e;
            if (ajVar.mo30536f(ajVar.mo30532b())) {
                frameLayout.setAlpha(0.0f);
                a.f71574k.setDuration(100).setStartDelay(1000);
                a.f71574k.addListener(new C26327g(frameLayout));
                a.f71574k.start();
            } else {
                layoutInflater.inflate(R.layout.lens_gallery_picker_round_button, frameLayout);
            }
            a.f71569f.mo33801b(frameLayout, a.f71570g.mo33805a(C28427h.m53115a(108462)));
            frameLayout.setOnClickListener(new C47591co(a.f71572i, "galleryclick", new C26323c(a)));
            C26393l lVar = a.f71565b;
            C2391v viewLifecycleOwner = a.f71564a.getViewLifecycleOwner();
            C26324d dVar = new C26324d(a);
            C19559g.m37304c();
            lVar.mo31598e();
            lVar.f71805b.mo5704e(viewLifecycleOwner, dVar);
            lVar.mo31595b().mo31575a(viewLifecycleOwner.getLifecycle());
            a.f71571h.mo5704e(a.f71564a.getViewLifecycleOwner(), new C26325e(a));
            C47831fm.m85019n();
            return frameLayout;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f71556d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f71556d.mo51375c();
        try {
            super.onDestroyView();
            ObjectAnimator objectAnimator = mo17754z().f71574k;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            c.close();
            return;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f71556d.mo51376d();
        try {
            super.onDetach();
            this.f71557e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f71556d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f71556d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f71556d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f71556d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f71556d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f71556d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f71556d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26321a.m48585a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f71556d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f71556d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f71556d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f71556d;
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
        C47515ab abVar = this.f71556d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f71556d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f71556d;
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
        this.f71556d.mo51381i();
        try {
            if (!this.f71557e) {
                super.onAttach(context);
                if (this.f71553a == null) {
                    Object jN = mo31528d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C26322b) {
                        C26322b bVar = (C26322b) fragment;
                        C68225k.m98532d(bVar);
                        this.f71553a = new C26329i(bVar, (C26393l) ((C74176nj) jN).f206836d.f205267ai.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C47449e) ((C74176nj) jN).f207092s.mo17428b(), (C25504aj) ((C74176nj) jN).f206836d.f205220O.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C25752a) ((C74176nj) jN).f206836d.f205279au.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C25225bd) ((C74176nj) jN).f206677a.a.f203105jf.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f71556d, this.f71555c));
                    } else {
                        String obj = C26329i.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f71556d;
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
                C26321a.m48585a(th, th2);
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
