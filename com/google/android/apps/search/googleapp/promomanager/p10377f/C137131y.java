package com.google.android.apps.search.googleapp.promomanager.p10377f;

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

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.y */
/* compiled from: PG */
class C137131y extends C19520a implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f373154a;

    /* renamed from: c */
    private volatile C47222f f373155c;

    /* renamed from: d */
    private final Object f373156d = new Object();

    /* renamed from: a */
    private final void m222862a() {
        if (this.f373154a == null) {
            this.f373154a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47222f mo113518d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C47222f mo113547f() {
        if (this.f373155c == null) {
            synchronized (this.f373156d) {
                if (this.f373155c == null) {
                    this.f373155c = mo113518d();
                }
            }
        }
        return this.f373155c;
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        m222862a();
        return this.f373154a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo113548j() {
        C137098b bVar = (C137098b) this;
        ((C137115i) mo113547f().mo17653jN()).mo113535jM();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113547f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f373154a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        m222862a();
        mo113548j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m222862a();
        mo113548j();
    }
}
