package com.google.android.apps.search.googleapp.promomanager.p10377f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.p1630a.C19521a;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.z */
/* compiled from: PG */
class C137132z extends C19521a implements C68288b, C47216a {

    /* renamed from: b */
    private ContextWrapper f373157b;

    /* renamed from: c */
    private volatile C47222f f373158c;

    /* renamed from: d */
    private final Object f373159d = new Object();

    /* renamed from: a */
    private final void m222867a() {
        if (this.f373157b == null) {
            this.f373157b = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47222f mo113540d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C47222f mo113549f() {
        if (this.f373158c == null) {
            synchronized (this.f373159d) {
                if (this.f373158c == null) {
                    this.f373158c = mo113540d();
                }
            }
        }
        return this.f373158c;
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        m222867a();
        return this.f373157b;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo113550j() {
        C137123q qVar = (C137123q) this;
        ((C137130x) mo113549f().mo17653jN()).mo113546kV();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113549f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f373157b;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        m222867a();
        mo113550j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m222867a();
        mo113550j();
    }
}
