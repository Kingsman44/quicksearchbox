package com.google.android.apps.search.googleapp.discover.feedback;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0392m;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.p10122ab.C133143b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p579ar.sceneviewer.common.C10678R;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3675a.C47363g;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.i */
/* compiled from: PG */
public final class C134307i extends C134313o implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C134308j f365830a;

    /* renamed from: c */
    private Context f365831c;

    /* renamed from: d */
    private final C2393x f365832d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f365833e = new C47515ab(this);

    /* renamed from: f */
    private boolean f365834f;

    /* renamed from: g */
    private boolean f365835g;

    @Deprecated
    public C134307i() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C134308j mo17754z() {
        C134308j jVar = this.f365830a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f365835g) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo111721b() {
        return C47244m.m84043e(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f365831c == null) {
            this.f365831c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f365831c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f365833e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f365832d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f365833e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f365833e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f365833e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f365833e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f365833e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f365833e.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f365833e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        C134308j a = mo17754z();
        String string = a.f365836a.getString(R.string.googleapp_discover_feedback_log_consent_message, a.f365838c);
        C69664n.m101060f(string, "fragment.getString(R.str…ent_message, accountName)");
        C47363g a2 = a.f365837b.mo51239a();
        Optional c = a.f365839d.mo110995c(Optional.empty(), Optional.m71637of(Integer.valueOf(C10678R.style.Theme_GoogleMaterial_DayNight_Dialog)));
        Objects.requireNonNull(a2);
        c.ifPresent(new C133143b(a2));
        a2.mo51236f();
        a2.f123084f = R.string.googleapp_discover_feedback_log_consent_title;
        a2.mo51237g(string);
        a2.mo51234d();
        a2.f123082d = R.string.googleapp_discover_feedback_log_consent_accept_button_label;
        a2.mo51233c();
        a2.f123081c = R.string.googleapp_discover_feedback_log_consent_skip_button_label;
        C0392m a3 = a2.mo51231a();
        a3.setCancelable(false);
        a3.setCanceledOnTouchOutside(false);
        C69664n.m101060f(a3, "tikTokAlertDialogs\n     …uchOutside(false)\n      }");
        return a3;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f365833e.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            this.f365834f = false;
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f365833e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f365833e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f365833e.mo51376d();
        try {
            super.onDetach();
            this.f365835g = true;
            d.close();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f365833e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            C134308j a = mo17754z();
            C69664n.m101061g(dialogInterface, "dialogInterface");
            C47393f.m84235f(new C134305g(a.f365840e), a.f365836a);
            f.close();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f365833e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f365833e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54440b.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f365833e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f365833e.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f365833e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f365833e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                if (!this.f365834f) {
                    C47389c.m84226a(getContext()).f123128b = C47393f.m84230a(this);
                    C134310l.m217903a(this, mo17754z());
                    this.f365834f = true;
                }
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f365833e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f365833e.mo51381i();
        try {
            if (!getShowsDialog() && !this.f365834f) {
                C47389c.m84226a(getContext()).f123128b = view;
                C134310l.m217903a(this, mo17754z());
                this.f365834f = true;
            }
            this.f54440b.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134306h.m217894a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f365833e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f365833e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f365833e;
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
        C47515ab abVar = this.f365833e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f365833e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f365833e;
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
        this.f365833e.mo51381i();
        try {
            if (!this.f365835g) {
                super.onAttach(context);
                if (this.f365830a == null) {
                    this.f365830a = ((C134311m) mo111724d().mo17653jN()).mo111722bL();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f365833e, this.f365832d));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f365833e;
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
                C134306h.m217894a(th, th2);
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
