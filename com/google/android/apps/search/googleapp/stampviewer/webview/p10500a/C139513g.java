package com.google.android.apps.search.googleapp.stampviewer.webview.p10500a;

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

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.a.g */
/* compiled from: PG */
class C139513g extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f379330a;

    /* renamed from: c */
    private volatile C47222f f379331c;

    /* renamed from: d */
    private final Object f379332d = new Object();

    /* renamed from: a */
    private final void m226748a() {
        if (this.f379330a == null) {
            this.f379330a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47222f mo115015d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C47222f mo115018f() {
        if (this.f379331c == null) {
            synchronized (this.f379332d) {
                if (this.f379331c == null) {
                    this.f379331c = mo115015d();
                }
            }
        }
        return this.f379331c;
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        m226748a();
        return this.f379330a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo115019j() {
        C139507b bVar = (C139507b) this;
        ((C139512f) mo115018f().mo17653jN()).mo115017js();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115018f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f379330a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        m226748a();
        mo115019j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m226748a();
        mo115019j();
    }
}
