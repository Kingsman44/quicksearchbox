package com.google.android.libraries.lens.view.filters.translation.onboardinglanguagemenu;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.GridLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.filters.translation.C26217r;
import com.google.android.libraries.lens.view.filters.translation.onboardinglanguagemenu.OnboardingLanguageMenuFragmentPeer;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.DialogVisualElements;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.onboardinglanguagemenu.c */
/* compiled from: PG */
public final class C26208c extends C26214i implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    public final C2393x f71233a = new C2393x(this);

    /* renamed from: b */
    private OnboardingLanguageMenuFragmentPeer f71234b;

    /* renamed from: c */
    private Context f71235c;

    /* renamed from: d */
    private final C47515ab f71236d = new C47515ab(this);

    /* renamed from: e */
    private boolean f71237e;

    @Deprecated
    public C26208c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final OnboardingLanguageMenuFragmentPeer mo17754z() {
        OnboardingLanguageMenuFragmentPeer onboardingLanguageMenuFragmentPeer = this.f71234b;
        if (onboardingLanguageMenuFragmentPeer == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f71237e) {
            return onboardingLanguageMenuFragmentPeer;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31426b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f71235c == null) {
            this.f71235c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f71235c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f71236d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f71233a;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f71236d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f71236d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            OnboardingLanguageMenuFragmentPeer a = mo17754z();
            a.f71206c.mo5704e(a.f71208e.getViewLifecycleOwner(), new C26210e(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f71236d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f71236d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f71236d.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OnboardingLanguageMenuFragmentPeer a = mo17754z();
        if (a.f71208e.getView() != null) {
            View view = a.f71208e.getView();
            view.getClass();
            view.invalidate();
            ((GridLayout) view.findViewById(R.id.onboarding_language_menu_table)).removeAllViews();
            a.mo31423b(view, a.f71208e.getLayoutInflater());
        }
    }

    public final void onCreate(Bundle bundle) {
        this.f71236d.mo51381i();
        try {
            super.onCreate(bundle);
            OnboardingLanguageMenuFragmentPeer a = mo17754z();
            a.f71208e.setStyle(0, 2132150766);
            a.f71206c = a.f71209f.f70790D;
            a.f71208e.f71233a.mo5790b(a.f71213j);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f71236d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f71236d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            OnboardingLanguageMenuFragmentPeer a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.lens_translate_filter_onboarding_language_menu, viewGroup, false);
            ((MaterialButton) inflate.findViewById(R.id.onboarding_language_menu_all_languages_button)).setOnClickListener(C26212g.f71242a);
            a.mo31423b(inflate, layoutInflater);
            C26208c cVar = a.f71208e;
            Dialog dialog = cVar.getDialog();
            dialog.getClass();
            DialogVisualElements.m53173a(cVar, dialog, new C26213h(a));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f71236d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f71236d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f71236d.mo51376d();
        try {
            super.onDetach();
            this.f71237e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f71236d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f71236d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f71236d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f71236d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f71236d.mo51377e();
        try {
            super.onResume();
            C47393f.m84235f(new OnboardingLanguageMenuFragmentPeer.C26205c(), mo17754z().f71208e);
            e.close();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f71236d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f71236d.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f71236d.mo51381i();
        try {
            super.onStop();
            C47393f.m84235f(new OnboardingLanguageMenuFragmentPeer.C26203a(), mo17754z().f71208e);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26207b.m48388a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f71236d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f71236d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f71236d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f71236d;
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
        C47515ab abVar = this.f71236d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f71236d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f71236d;
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
        this.f71236d.mo51381i();
        try {
            if (!this.f71237e) {
                super.onAttach(context);
                if (this.f71234b == null) {
                    Object jN = mo31430d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C26208c) {
                        C26208c cVar = (C26208c) fragment;
                        C68225k.m98532d(cVar);
                        this.f71234b = new OnboardingLanguageMenuFragmentPeer(cVar, (C26217r) ((C74176nj) jN).f206836d.f205216K.mo17428b(), (C26059ax) ((C74176nj) jN).f206836d.f205225T.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f71236d, this.f71233a));
                    } else {
                        String obj = OnboardingLanguageMenuFragmentPeer.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f71236d;
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
                C26207b.m48388a(th, th2);
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
