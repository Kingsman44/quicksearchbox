package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.aw */
/* compiled from: PG */
class C135825aw extends Fragment implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f369960a;

    /* renamed from: b */
    private volatile C47222f f369961b;

    /* renamed from: c */
    private final Object f369962c = new Object();

    /* renamed from: a */
    private final void mo112579a() {
        if (this.f369960a == null) {
            this.f369960a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo112573b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo112574d() {
        if (this.f369961b == null) {
            synchronized (this.f369962c) {
                if (this.f369961b == null) {
                    this.f369961b = mo112573b();
                }
            }
        }
        return this.f369961b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112575f() {
        C135830e eVar = (C135830e) this;
        ((C135849v) mo112574d().mo17653jN()).mo112583kq();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo112579a();
        return this.f369960a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112574d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369960a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo112579a();
        mo112575f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112579a();
        mo112575f();
    }
}
