package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.querytext.q */
/* compiled from: PG */
class C130297q extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f357160a;

    /* renamed from: c */
    private volatile C47222f f357161c;

    /* renamed from: d */
    private final Object f357162d = new Object();

    /* renamed from: a */
    private final void mo109622a() {
        if (this.f357160a == null) {
            this.f357160a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo109623b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo109636d() {
        if (this.f357161c == null) {
            synchronized (this.f357162d) {
                if (this.f357161c == null) {
                    this.f357161c = mo109623b();
                }
            }
        }
        return this.f357161c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo109637f() {
        C130282b bVar = (C130282b) this;
        ((C130285e) mo109636d().mo17653jN()).mo109625jz();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo109622a();
        return this.f357160a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109636d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f357160a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo109622a();
        mo109637f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo109622a();
        mo109637f();
    }
}
