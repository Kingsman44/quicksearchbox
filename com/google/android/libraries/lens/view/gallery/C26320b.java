package com.google.android.libraries.lens.view.gallery;

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
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.gallery.data.C26393l;
import com.google.android.libraries.lens.view.gallery.p2111d.C26362h;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.logging.p2185ve.C28306ab;
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
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
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
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.gallery.b */
/* compiled from: PG */
public final class C26320b extends C26318as implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C26420g f71548a;

    /* renamed from: b */
    private Context f71549b;

    /* renamed from: c */
    private final C2393x f71550c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f71551d = new C47515ab(this);

    /* renamed from: e */
    private boolean f71552e;

    @Deprecated
    public C26320b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C26420g mo17754z() {
        C26420g gVar = this.f71548a;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f71552e) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31517b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f71549b == null) {
            this.f71549b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f71549b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f71551d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f71550c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f71551d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f71551d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f71551d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f71551d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f71551d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f71551d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f71551d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C26420g a = mo17754z();
            GalleryRecyclerView galleryRecyclerView = (GalleryRecyclerView) layoutInflater.inflate(R.layout.lens_gallery_recycler, viewGroup, false);
            galleryRecyclerView.mHasFixedSize = true;
            galleryRecyclerView.addItemDecoration$ar$ds(new C26419f(a));
            C28306ab abVar = a.f71901f;
            abVar.mo33801b(galleryRecyclerView, abVar.f76990a.mo33805a(C28427h.m53115a(144387)));
            a.f71899d.mo31599f(a.f71898c.getViewLifecycleOwner(), new C26332c(a));
            a.f71900e.f69401a.mo5704e(a.f71898c.getViewLifecycleOwner(), new C26337d(a));
            galleryRecyclerView.f71463a = new C26407e(a);
            C47831fm.m85019n();
            return galleryRecyclerView;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f71551d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f71551d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f71551d.mo51376d();
        try {
            super.onDetach();
            this.f71552e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f71551d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f71551d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f71551d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f71551d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f71551d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f71551d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f71551d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26295a.m48540a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f71551d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f71551d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f71551d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f71551d;
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
        C47515ab abVar = this.f71551d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f71551d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f71551d;
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
        this.f71551d.mo51381i();
        try {
            if (!this.f71552e) {
                super.onAttach(context);
                if (this.f71548a == null) {
                    Object jN = mo31518d().mo17653jN();
                    String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                    C68225k.m98532d(b);
                    aqy aqy = ((C74176nj) jN).f206677a;
                    C69464a aVar = aqy.i;
                    C69464a aVar2 = ((C74176nj) jN).f206889e;
                    C69464a aVar3 = aqy.gH;
                    asp asp = aqy.a;
                    C26362h hVar = new C26362h(aVar, aVar2, aVar3, asp.f202879fR, ((C74176nj) jN).f206778bv, ((C74176nj) jN).f206730b.f198663m, asp.f202880fS);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C26320b) {
                        C26320b bVar = (C26320b) fragment;
                        C68225k.m98532d(bVar);
                        this.f71548a = new C26420g(b, hVar, bVar, (C26393l) ((C74176nj) jN).f206836d.f205267ai.mo17428b(), (C25466f) ((C74176nj) jN).f206836d.f205224S.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f71551d, this.f71550c));
                    } else {
                        String obj = C26420g.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f71551d;
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
                C26295a.m48540a(th, th2);
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
