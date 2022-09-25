package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9763f.p9766b;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.f.b.h */
/* compiled from: PG */
class C128869h extends Fragment implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f354189a;

    /* renamed from: b */
    private volatile C47222f f354190b;

    /* renamed from: c */
    private final Object f354191c = new Object();

    /* renamed from: a */
    private final void mo108708a() {
        if (this.f354189a == null) {
            this.f354189a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108709b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo108712d() {
        if (this.f354190b == null) {
            synchronized (this.f354191c) {
                if (this.f354190b == null) {
                    this.f354190b = mo108709b();
                }
            }
        }
        return this.f354190b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108713f() {
        C128863b bVar = (C128863b) this;
        ((C128868g) mo108712d().mo17653jN()).mo108711kc();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo108708a();
        return this.f354189a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108712d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f354189a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo108708a();
        mo108713f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108708a();
        mo108713f();
    }
}
