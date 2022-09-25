package com.google.apps.tiktok.inject.p3657c.p3658a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p031v4.app.C0172ar;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C2354bb;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2370br;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import androidx.lifecycle.p127a.C2320a;
import androidx.lifecycle.p127a.C2322c;
import androidx.savedstate.C4088d;
import androidx.savedstate.C4089e;
import androidx.savedstate.C4090f;
import androidx.savedstate.C4091g;
import androidx.savedstate.C4092h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.base.C58838bb;
import dagger.hilt.C68286a;
import dagger.hilt.android.internal.C68299a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;
import p3186j$.util.Objects;

/* renamed from: com.google.apps.tiktok.inject.c.a.c */
/* compiled from: PG */
public abstract class C47218c implements C47215a, C68288b {

    /* renamed from: a */
    private final C2370br f122872a = new C2370br();

    /* renamed from: b */
    private final C4090f f122873b = C4089e.m11719a(this);

    /* renamed from: c */
    private final OnBackPressedDispatcher f122874c = new OnBackPressedDispatcher(C47217b.f122871a);

    /* renamed from: d */
    private C0172ar f122875d;

    /* renamed from: x */
    public final C2393x f122876x = new C2393x(this);

    /* renamed from: y */
    public C47221e f122877y;

    /* renamed from: z */
    public Window f122878z;

    /* renamed from: i */
    private final C0172ar mo22017i() {
        C0172ar arVar = this.f122875d;
        C58838bb.m90866a(arVar, "Called before init()");
        return arVar;
    }

    /* renamed from: e */
    public void mo51126e() {
        mo22017i().mo579j();
        this.f122876x.mo5793e(C2382m.ON_PAUSE);
    }

    /* renamed from: f */
    public void mo51127f() {
        mo22017i().mo583n();
        mo22017i().mo585p();
        this.f122876x.mo5793e(C2382m.ON_RESUME);
        mo22017i().mo580k();
    }

    /* renamed from: g */
    public void mo51128g() {
        mo22017i().mo583n();
        mo22017i().mo585p();
        this.f122876x.mo5793e(C2382m.ON_START);
        mo22017i().mo581l();
    }

    public final /* synthetic */ C2322c getDefaultViewModelCreationExtras() {
        return C2320a.f6515a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return ((C68300a.C68301a) C68286a.m98629a(this, C68300a.C68301a.class)).mo60316bX().mo60318a(this, (Bundle) null, new C2354bb(C68299a.m98636a(this.f122877y.getApplicationContext()), this, (Bundle) null));
    }

    public final C2384o getLifecycle() {
        return this.f122876x;
    }

    public final C4088d getSavedStateRegistry() {
        return this.f122873b.f13082a;
    }

    public final C2370br getViewModelStore() {
        return this.f122872a;
    }

    /* renamed from: h */
    public void mo22016h() {
        mo22017i().mo582m();
        this.f122876x.mo5793e(C2382m.ON_STOP);
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return this.f122877y.f122884a.mo17653jN();
    }

    /* renamed from: jP */
    public void mo19987jP(Bundle bundle) {
        this.f122873b.mo8589b(bundle);
        mo22017i().mo573d((Fragment) null);
        if (bundle != null) {
            mo22017i().mo584o(bundle.getParcelable("BaseFragmentHost:fragments"));
        }
        this.f122876x.mo5793e(C2382m.ON_CREATE);
        mo22017i().mo576g();
    }

    /* renamed from: jQ */
    public void mo51129jQ() {
        View decorView = this.f122878z.getDecorView();
        C2391v vVar = (C2391v) decorView.getTag(R.id.view_tree_lifecycle_owner);
        if (vVar == null) {
            ViewParent parent = decorView.getParent();
            while (vVar == null && (parent instanceof View)) {
                View view = (View) parent;
                vVar = (C2391v) view.getTag(R.id.view_tree_lifecycle_owner);
                parent = view.getParent();
            }
        }
        if (vVar == this) {
            this.f122878z.getDecorView().setTag(R.id.view_tree_lifecycle_owner, (Object) null);
            this.f122878z.getDecorView().setTag(R.id.view_tree_view_model_store_owner, (Object) null);
            C4092h.m11723a(this.f122878z.getDecorView(), (C4091g) null);
        }
        this.f122872a.mo5774c();
        mo22017i().mo577h();
        this.f122876x.mo5793e(C2382m.ON_DESTROY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: jR */
    public abstract void mo19988jR(C47215a aVar);

    /* renamed from: p */
    public final Context mo51121p() {
        return this.f122877y;
    }

    /* renamed from: q */
    public final FragmentManager mo51122q() {
        C0172ar arVar = this.f122875d;
        C58838bb.m90866a(arVar, "Called before init()");
        return arVar.f739a.f744e;
    }

    /* renamed from: r */
    public final Window mo51123r() {
        return this.f122878z;
    }

    /* renamed from: s */
    public final OnBackPressedDispatcher mo51124s() {
        return this.f122874c;
    }

    /* renamed from: u */
    public final void mo51131u(Configuration configuration) {
        mo22017i().mo575f(configuration);
        Window window = this.f122878z;
        if (window != null) {
            window.onConfigurationChanged(configuration);
        }
    }

    /* renamed from: v */
    public final void mo51132v(Bundle bundle) {
        this.f122876x.mo5793e(C2382m.ON_STOP);
        Parcelable a = mo22017i().mo571a();
        if (a != null) {
            bundle.putParcelable("BaseFragmentHost:fragments", a);
        }
        this.f122873b.mo8590c(bundle);
    }

    /* renamed from: t */
    public final void mo51130t(Window window, View view, Context context) {
        window.getClass();
        this.f122878z = window;
        C47221e eVar = new C47221e(context, this);
        this.f122877y = eVar;
        OnBackPressedDispatcher onBackPressedDispatcher = this.f122874c;
        Objects.requireNonNull(view);
        this.f122875d = C0172ar.m374b(new C47227h(this, eVar, onBackPressedDispatcher, new C47226g(view)));
        mo19988jR(this);
    }
}
