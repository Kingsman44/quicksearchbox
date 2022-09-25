package com.google.android.apps.search.googleapp.discover.p10190h;

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

/* renamed from: com.google.android.apps.search.googleapp.discover.h.h */
/* compiled from: PG */
class C134354h extends C19520a implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f365960a;

    /* renamed from: c */
    private volatile C47222f f365961c;

    /* renamed from: d */
    private final Object f365962d = new Object();

    /* renamed from: a */
    private final void mo111752a() {
        if (this.f365960a == null) {
            this.f365960a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo111753b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo111757d() {
        if (this.f365961c == null) {
            synchronized (this.f365962d) {
                if (this.f365961c == null) {
                    this.f365961c = mo111753b();
                }
            }
        }
        return this.f365961c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111758f() {
        C134349c cVar = (C134349c) this;
        ((C134353g) mo111757d().mo17653jN()).mo111756jJ();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo111752a();
        return this.f365960a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111757d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f365960a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo111752a();
        mo111758f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111752a();
        mo111758f();
    }
}
