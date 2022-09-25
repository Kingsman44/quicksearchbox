package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.ad */
/* compiled from: PG */
class C130083ad extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f356696a;

    /* renamed from: c */
    private volatile C47222f f356697c;

    /* renamed from: d */
    private final Object f356698d = new Object();

    /* renamed from: a */
    private final void mo109487a() {
        if (this.f356696a == null) {
            this.f356696a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo109481b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo109482d() {
        if (this.f356697c == null) {
            synchronized (this.f356698d) {
                if (this.f356697c == null) {
                    this.f356697c = mo109481b();
                }
            }
        }
        return this.f356697c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo109483f() {
        C130096f fVar = (C130096f) this;
        ((C130116y) mo109482d().mo17653jN()).mo109508kC();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo109487a();
        return this.f356696a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109482d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f356696a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo109487a();
        mo109483f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo109487a();
        mo109483f();
    }
}
