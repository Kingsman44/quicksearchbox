package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9800d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.d.f */
/* compiled from: PG */
class C129169f extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f354818a;

    /* renamed from: c */
    private boolean f354819c;

    /* renamed from: d */
    private volatile C47247a f354820d;

    /* renamed from: e */
    private final Object f354821e = new Object();

    /* renamed from: f */
    private boolean f354822f = false;

    /* renamed from: a */
    private final void mo108871a() {
        if (this.f354818a == null) {
            this.f354818a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f354819c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo108872b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo108873d() {
        if (this.f354820d == null) {
            synchronized (this.f354821e) {
                if (this.f354820d == null) {
                    this.f354820d = mo108872b();
                }
            }
        }
        return this.f354820d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108874f() {
        if (!this.f354822f) {
            this.f354822f = true;
            mo108873d().mo17653jN();
            C129166c cVar = (C129166c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f354819c) {
            return null;
        }
        mo108871a();
        return this.f354818a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108873d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f354818a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo108871a();
        mo108874f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108871a();
        mo108874f();
    }
}
