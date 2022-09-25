package com.google.android.apps.search.googleapp.p10381r;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.preference.C3995au;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47711b;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.r.c */
/* compiled from: PG */
public final class C137144c extends C137156m implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: f */
    private C137148g f373181f;

    /* renamed from: g */
    private Context f373182g;

    /* renamed from: h */
    private final C2393x f373183h = new C2393x(this);

    /* renamed from: i */
    private final C47515ab f373184i = new C47515ab(this);

    /* renamed from: j */
    private boolean f373185j;

    @Deprecated
    public C137144c() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    public final C137148g mo17754z() {
        C137148g gVar = this.f373181f;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f373185j) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f373182g == null) {
            this.f373182g = new C47236e((Fragment) this, super.getContext());
        }
        return this.f373182g;
    }

    /* renamed from: fZ */
    public final void mo8407fZ(Bundle bundle, String str) {
        C137148g b = mo17754z();
        b.f373193e.mo50707a(b.f373191c.mo112926a(), new C137147f(b));
        C3995au auVar = b.f373190b.f12807b;
        PreferenceScreen e = auVar.mo8432e(auVar.f12829a);
        b.f373190b.mo8413j(e);
        Context context = auVar.f12829a;
        String a = C5114a.m13987a(context, R.string.googleapp_incognito_settings_biometrics_summary, "count", Integer.valueOf((int) Duration.ofMillis(b.f373197i).toMinutes()));
        SwitchPreference switchPreference = new SwitchPreference(context, (AttributeSet) null);
        switchPreference.mo8339F(true);
        switchPreference.f12751w = false;
        switchPreference.mo8343J("biometrics_preference");
        switchPreference.mo8342I(false);
        switchPreference.mo8346M(R.string.googleapp_incognito_settings_biometrics_title);
        switchPreference.mo8329n(a);
        switchPreference.f12742n = new C47711b(b.f373192d, "Biometrics Settings Changed", new C137146e(b));
        e.mo8379af(switchPreference);
        Preference preference = new Preference(auVar.f12829a);
        preference.mo8339F(true);
        preference.f12751w = false;
        preference.mo8343J("signed_out_search_customization_preference");
        preference.mo8342I(false);
        preference.mo8346M(R.string.googleapp_incognito_settings_signed_out_search_customization_title);
        preference.f12743o = new C137145d(b);
        e.mo8379af(preference);
        b.f373196h.mo115163a();
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f373184i.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f373183h;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f373184i.mo51380h(eyVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final /* synthetic */ C47247a mo113569m() {
        return new C47242k(this);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f373184i.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f373184i.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f373184i.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f373184i.mo51381i();
        try {
            super.onCreate(bundle);
            C137148g b = mo17754z();
            b.f373194f.mo50429i(b.f373195g);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f373184i.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f373184i.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f373184i.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f373184i.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f373184i.mo51376d();
        try {
            super.onDetach();
            this.f373185j = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f373184i.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f373184i.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54439e.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f373184i.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f373184i.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f373184i.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f373184i.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f373184i.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f373184i.mo51381i();
        try {
            super.onViewCreated(view, bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137143b.m222892a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f373184i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f373184i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f373184i;
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
        C47515ab abVar = this.f373184i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f373184i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f373184i;
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
        this.f373184i.mo51381i();
        try {
            if (!this.f373185j) {
                super.onAttach(context);
                if (this.f373181f == null) {
                    Object jN = mo113572n().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137144c) {
                        C137144c cVar = (C137144c) fragment;
                        C68225k.m98532d(cVar);
                        this.f373181f = new C137148g(cVar, (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69847he(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), ((C74176nj) jN).mo69561cD(), (C139680b) ((C74176nj) jN).f206836d.f205429k.mo17428b(), ((C74176nj) jN).f206677a.d.mo67914p());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f373184i, this.f373183h));
                    } else {
                        String obj = C137148g.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f373184i;
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
                C137143b.m222892a(th, th2);
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
