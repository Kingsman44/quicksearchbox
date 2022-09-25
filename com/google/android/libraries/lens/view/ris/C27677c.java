package com.google.android.libraries.lens.view.ris;

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
import androidx.coordinatorlayout.widget.C1773f;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60888db;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.ris.c */
/* compiled from: PG */
public final class C27677c extends C27681f implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C27679e f75573a;

    /* renamed from: b */
    private Context f75574b;

    /* renamed from: c */
    private final C2393x f75575c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f75576d = new C47515ab(this);

    /* renamed from: e */
    private boolean f75577e;

    @Deprecated
    public C27677c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C27679e mo17754z() {
        C27679e eVar = this.f75573a;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f75577e) {
            return eVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo33168b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f75574b == null) {
            this.f75574b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f75574b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f75576d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f75575c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f75576d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f75576d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f75576d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f75576d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f75576d.mo51381i();
        try {
            super.onCreate(bundle);
            C27679e a = mo17754z();
            a.f75588h.mo50429i(a.f75590j);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f75576d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75576d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C27679e a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.ris_button_container, viewGroup, false);
            if (inflate != null) {
                View findViewById = inflate.findViewById(R.id.ris_button);
                Resources resources = a.f75582b.getResources();
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.getClass();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.filter_carousel_height_with_borders);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ris_button_padding);
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelSize + dimensionPixelSize2;
                a.f75585e.mo33801b(findViewById, a.f75586f.mo33805a(C28427h.m53115a(148359)));
                findViewById.setVisibility(8);
                findViewById.setOnClickListener(new C27678d(a, findViewById));
                RisButtonLayoutBehavior risButtonLayoutBehavior = new RisButtonLayoutBehavior(a.f75583c, dimensionPixelSize, dimensionPixelSize2, a.f75589i);
                C1773f fVar = (C1773f) inflate.getLayoutParams();
                fVar.getClass();
                fVar.mo4974a(risButtonLayoutBehavior);
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f75576d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f75576d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f75576d.mo51376d();
        try {
            super.onDetach();
            this.f75577e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f75576d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f75576d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f75576d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f75576d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f75576d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f75576d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f75576d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27676b.m51506a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f75576d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f75576d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f75576d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f75576d;
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
        C47515ab abVar = this.f75576d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f75576d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f75576d;
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
        this.f75576d.mo51381i();
        try {
            if (!this.f75577e) {
                super.onAttach(context);
                if (this.f75573a == null) {
                    Object jN = mo33171d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C27677c) {
                        C27677c cVar = (C27677c) fragment;
                        C68225k.m98532d(cVar);
                        this.f75573a = new C27679e(cVar, (C25989d) ((C74176nj) jN).f206836d.f205212G.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C60888db) ((C74176nj) jN).f206677a.lL.mo17428b(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45376898").mo50907f(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45378413").mo50907f());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f75576d, this.f75575c));
                    } else {
                        String obj = C27679e.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f75576d;
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
                C27676b.m51506a(th, th2);
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
