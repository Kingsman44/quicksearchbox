package com.google.android.libraries.lens.view.p2066aj;

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
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
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
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.aj.b */
/* compiled from: PG */
public final class C25190b extends C25193e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C25192d f68605a;

    /* renamed from: b */
    private Context f68606b;

    /* renamed from: c */
    private final C2393x f68607c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f68608d = new C47515ab(this);

    /* renamed from: e */
    private boolean f68609e;

    @Deprecated
    public C25190b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C25192d mo17754z() {
        C25192d dVar = this.f68605a;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f68609e) {
            return dVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo30332b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f68606b == null) {
            this.f68606b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f68606b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f68608d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f68607c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f68608d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f68608d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f68608d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f68608d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f68608d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f68608d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f68608d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C25192d a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.postcapture_thinking_gleams_renderer, viewGroup, false);
            a.f68616f = (LottieAnimationView) inflate.findViewById(R.id.lens_results_loading_spinner);
            if (a.f68613c.mo31462g(C26239a.THINKING_GLEAMS_LOADING_STATE)) {
                LottieAnimationView lottieAnimationView = a.f68616f;
                lottieAnimationView.setBackgroundColor(lottieAnimationView.getResources().getColor(R.color.thinking_gleam_scrim_color, (Resources.Theme) null));
            }
            a.f68616f.mo9689a(new C25191c(a));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f68608d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f68608d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f68608d.mo51376d();
        try {
            super.onDetach();
            this.f68609e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f68608d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f68608d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f68608d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f68608d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f68608d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f68608d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f68608d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25189a.m46551a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f68608d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f68608d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f68608d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f68608d;
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
        C47515ab abVar = this.f68608d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f68608d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f68608d;
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
        this.f68608d.mo51381i();
        try {
            if (!this.f68609e) {
                super.onAttach(context);
                if (this.f68605a == null) {
                    this.f68605a = new C25192d((C26244b) ((C74176nj) mo30338d().mo17653jN()).f206836d.f205444z.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f68608d, this.f68607c));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f68608d;
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
                C25189a.m46551a(th, th2);
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
