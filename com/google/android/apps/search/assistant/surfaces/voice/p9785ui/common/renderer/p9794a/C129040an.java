package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9794a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.an */
/* compiled from: PG */
class C129040an extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f354512a;

    /* renamed from: c */
    private volatile C47222f f354513c;

    /* renamed from: d */
    private final Object f354514d = new Object();

    /* renamed from: a */
    private final void mo108823a() {
        if (this.f354512a == null) {
            this.f354512a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108814b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo108815d() {
        if (this.f354513c == null) {
            synchronized (this.f354514d) {
                if (this.f354513c == null) {
                    this.f354513c = mo108814b();
                }
            }
        }
        return this.f354513c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108816f() {
        C129046e eVar = (C129046e) this;
        ((C129049h) mo108815d().mo17653jN()).mo108825jD();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo108823a();
        return this.f354512a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108815d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f354512a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo108823a();
        mo108816f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108823a();
        mo108816f();
    }
}
