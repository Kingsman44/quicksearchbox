package com.google.android.apps.search.googleapp.p10257g;

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

/* renamed from: com.google.android.apps.search.googleapp.g.ao */
/* compiled from: PG */
class C135424ao extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f368948a;

    /* renamed from: c */
    private volatile C47222f f368949c;

    /* renamed from: d */
    private final Object f368950d = new Object();

    /* renamed from: a */
    private final void mo112328a() {
        if (this.f368948a == null) {
            this.f368948a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo112325b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo112326d() {
        if (this.f368949c == null) {
            synchronized (this.f368950d) {
                if (this.f368949c == null) {
                    this.f368949c = mo112325b();
                }
            }
        }
        return this.f368949c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112327f() {
        C135425b bVar = (C135425b) this;
        ((C135448u) mo112326d().mo17653jN()).mo112337jO();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo112328a();
        return this.f368948a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112326d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f368948a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo112328a();
        mo112327f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112328a();
        mo112327f();
    }
}
