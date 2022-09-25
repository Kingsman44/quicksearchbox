package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.z */
/* compiled from: PG */
class C130054z extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f356632a;

    /* renamed from: c */
    private volatile C47222f f356633c;

    /* renamed from: d */
    private final Object f356634d = new Object();

    /* renamed from: a */
    private final void mo109452a() {
        if (this.f356632a == null) {
            this.f356632a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo109453b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo109469d() {
        if (this.f356633c == null) {
            synchronized (this.f356634d) {
                if (this.f356633c == null) {
                    this.f356633c = mo109453b();
                }
            }
        }
        return this.f356633c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo109470f() {
        C130044p pVar = (C130044p) this;
        ((C130051w) mo109469d().mo17653jN()).mo109464kA();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo109452a();
        return this.f356632a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109469d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f356632a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo109452a();
        mo109470f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo109452a();
        mo109470f();
    }
}
