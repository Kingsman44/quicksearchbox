package com.google.android.apps.search.googleapp.incognito.education;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19520a;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.incognito.education.n */
/* compiled from: PG */
class C136271n extends C19520a implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f371083a;

    /* renamed from: c */
    private volatile C47222f f371084c;

    /* renamed from: d */
    private final Object f371085d = new Object();

    /* renamed from: a */
    private final void m221412a() {
        if (this.f371083a == null) {
            this.f371083a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47222f mo112869d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C47222f mo112876f() {
        if (this.f371084c == null) {
            synchronized (this.f371085d) {
                if (this.f371084c == null) {
                    this.f371084c = mo112869d();
                }
            }
        }
        return this.f371084c;
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        m221412a();
        return this.f371083a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo112877j() {
        C136261d dVar = (C136261d) this;
        ((C136266i) mo112876f().mo17653jN()).mo112873kh();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112876f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f371083a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        m221412a();
        mo112877j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m221412a();
        mo112877j();
    }
}
