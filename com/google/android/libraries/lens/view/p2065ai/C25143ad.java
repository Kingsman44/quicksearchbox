package com.google.android.libraries.lens.view.p2065ai;

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
import android.widget.ImageView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2056af.C25043ao;
import com.google.android.libraries.lens.view.p2056af.C25070bo;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.experiments.C46897i;
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
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47722m;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.ai.ad */
/* compiled from: PG */
public final class C25143ad extends C25162av implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C25147ah f68458a;

    /* renamed from: b */
    private Context f68459b;

    /* renamed from: c */
    private final C2393x f68460c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f68461d = new C47515ab(this);

    /* renamed from: e */
    private boolean f68462e;

    @Deprecated
    public C25143ad() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C25147ah mo17754z() {
        C25147ah ahVar = this.f68458a;
        if (ahVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f68462e) {
            return ahVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo30284b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f68459b == null) {
            this.f68459b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f68459b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f68461d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f68460c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f68461d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f68461d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f68461d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f68461d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f68461d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f68461d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f68461d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C25147ah a = mo17754z();
            a.f68486u = C25169g.m46530a(layoutInflater, viewGroup);
            a.f68486u.setId(R.id.overflow_menu_button);
            a.f68486u.setContentDescription(a.f68473h.getString(R.string.lens_overflow_menu_description));
            a.f68486u.setImageResource(R.drawable.quantum_ic_more_vert_white_24);
            a.f68486u.setOnClickListener(new C47591co(a.f68479n, "Open overflow menu", new C25144ae(a)));
            a.f68478m.mo33801b(a.f68486u, a.f68468c.mo33805a(C28427h.m53115a(92639)));
            a.f68472g.mo50707a(a.f68471f.mo30780a(), new C25146ag(a));
            ImageView imageView = a.f68486u;
            C47831fm.m85019n();
            return imageView;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f68461d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f68461d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f68461d.mo51376d();
        try {
            super.onDetach();
            this.f68462e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f68461d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f68461d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f68461d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f68461d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f68461d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f68461d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f68461d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25142ac.m46457a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f68461d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f68461d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f68461d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f68461d;
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
        C47515ab abVar = this.f68461d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f68461d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f68461d;
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
        this.f68461d.mo51381i();
        try {
            if (!this.f68462e) {
                super.onAttach(context);
                if (this.f68458a == null) {
                    Object jN = mo30307d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C25143ad) {
                        C25143ad adVar = (C25143ad) fragment;
                        C68225k.m98532d(adVar);
                        this.f68458a = new C25147ah(adVar, (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b(), ((C74176nj) jN).mo69680eQ(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (C25537t) ((C74176nj) jN).f206836d.f205273ao.mo17428b(), C68219e.m98518a(((C74176nj) jN).f206836d.f205280av), (C25070bo) ((C74176nj) jN).f206836d.f205272an.mo17428b(), (C25043ao) ((C74176nj) jN).f206836d.f205223R.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo67016gd().mo60912a(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60891e(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60892f(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45374228").mo50907f(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C47722m) ((C74176nj) jN).f206670T.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f68461d, this.f68460c));
                    } else {
                        String obj = C25147ah.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f68461d;
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
                C25142ac.m46457a(th2, th3);
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
