package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10282h;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.h.g */
/* compiled from: PG */
class C135706g extends Fragment implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f369648a;

    /* renamed from: b */
    private volatile C47222f f369649b;

    /* renamed from: c */
    private final Object f369650c = new Object();

    /* renamed from: a */
    private final void m220145a() {
        if (this.f369648a == null) {
            this.f369648a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47222f mo112481d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C47222f mo112484f() {
        if (this.f369649b == null) {
            synchronized (this.f369650c) {
                if (this.f369649b == null) {
                    this.f369649b = mo112481d();
                }
            }
        }
        return this.f369649b;
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        m220145a();
        return this.f369648a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo112485j() {
        C135700b bVar = (C135700b) this;
        ((C135705f) mo112484f().mo17653jN()).mo112483jm();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112484f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369648a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        m220145a();
        mo112485j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m220145a();
        mo112485j();
    }
}
