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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.ao */
/* compiled from: PG */
class C129041ao extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f354515a;

    /* renamed from: c */
    private volatile C47222f f354516c;

    /* renamed from: d */
    private final Object f354517d = new Object();

    /* renamed from: a */
    private final void mo108826a() {
        if (this.f354515a == null) {
            this.f354515a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108817b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo108818d() {
        if (this.f354516c == null) {
            synchronized (this.f354517d) {
                if (this.f354516c == null) {
                    this.f354516c = mo108817b();
                }
            }
        }
        return this.f354516c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108819f() {
        C129051j jVar = (C129051j) this;
        ((C129055n) mo108818d().mo17653jN()).mo108829jE();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo108826a();
        return this.f354515a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108818d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f354515a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo108826a();
        mo108819f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108826a();
        mo108819f();
    }
}
