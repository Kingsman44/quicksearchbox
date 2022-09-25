package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.aq */
/* compiled from: PG */
class C133188aq extends C0260w implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f363042a;

    /* renamed from: b */
    private volatile C47222f f363043b;

    /* renamed from: c */
    private final Object f363044c = new Object();

    /* renamed from: a */
    private final void mo111011a() {
        if (this.f363042a == null) {
            this.f363042a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo111012b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo111019d() {
        if (this.f363043b == null) {
            synchronized (this.f363044c) {
                if (this.f363043b == null) {
                    this.f363043b = mo111012b();
                }
            }
        }
        return this.f363043b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111020f() {
        C133177ag agVar = (C133177ag) this;
        ((C133185an) mo111019d().mo17653jN()).mo111015kX();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo111011a();
        return this.f363042a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111019d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f363042a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo111011a();
        mo111020f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111011a();
        mo111020f();
    }
}
