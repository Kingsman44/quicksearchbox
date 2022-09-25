package com.google.android.apps.search.googleapp.discover.streamui.impl;

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

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.bh */
/* compiled from: PG */
class C134848bh extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f367110a;

    /* renamed from: c */
    private volatile C47222f f367111c;

    /* renamed from: d */
    private final Object f367112d = new Object();

    /* renamed from: a */
    private final void mo112057a() {
        if (this.f367110a == null) {
            this.f367110a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo112026b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo112027d() {
        if (this.f367111c == null) {
            synchronized (this.f367112d) {
                if (this.f367111c == null) {
                    this.f367111c = mo112026b();
                }
            }
        }
        return this.f367111c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112028f() {
        C134903l lVar = (C134903l) this;
        ((C134824ar) mo112027d().mo17653jN()).mo112013jN();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo112057a();
        return this.f367110a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112027d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f367110a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo112057a();
        mo112028f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112057a();
        mo112028f();
    }
}
