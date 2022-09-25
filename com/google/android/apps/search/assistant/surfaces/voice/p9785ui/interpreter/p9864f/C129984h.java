package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9864f;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.f.h */
/* compiled from: PG */
class C129984h extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f356492a;

    /* renamed from: c */
    private volatile C47222f f356493c;

    /* renamed from: d */
    private final Object f356494d = new Object();

    /* renamed from: a */
    private final void mo109362a() {
        if (this.f356492a == null) {
            this.f356492a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo109363b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo109367d() {
        if (this.f356493c == null) {
            synchronized (this.f356494d) {
                if (this.f356493c == null) {
                    this.f356493c = mo109363b();
                }
            }
        }
        return this.f356493c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo109368f() {
        C129978b bVar = (C129978b) this;
        ((C129983g) mo109367d().mo17653jN()).mo109366kz();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo109362a();
        return this.f356492a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109367d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f356492a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo109362a();
        mo109368f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo109362a();
        mo109368f();
    }
}
