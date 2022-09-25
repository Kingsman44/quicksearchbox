package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9859d;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.d.j */
/* compiled from: PG */
class C129888j extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f356319a;

    /* renamed from: c */
    private volatile C47222f f356320c;

    /* renamed from: d */
    private final Object f356321d = new Object();

    /* renamed from: a */
    private final void mo109313a() {
        if (this.f356319a == null) {
            this.f356319a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo109314b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo109326d() {
        if (this.f356320c == null) {
            synchronized (this.f356321d) {
                if (this.f356320c == null) {
                    this.f356320c = mo109314b();
                }
            }
        }
        return this.f356320c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo109327f() {
        C129880b bVar = (C129880b) this;
        ((C129887i) mo109326d().mo17653jN()).mo109325kx();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo109313a();
        return this.f356319a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109326d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f356319a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo109313a();
        mo109327f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo109313a();
        mo109327f();
    }
}
