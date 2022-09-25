package com.google.android.apps.search.googleapp.stampviewer.preview;

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

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.ad */
/* compiled from: PG */
class C139447ad extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f379191a;

    /* renamed from: c */
    private volatile C47222f f379192c;

    /* renamed from: d */
    private final Object f379193d = new Object();

    /* renamed from: a */
    private final void mo114984a() {
        if (this.f379191a == null) {
            this.f379191a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo114971b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo114972d() {
        if (this.f379192c == null) {
            synchronized (this.f379193d) {
                if (this.f379192c == null) {
                    this.f379192c = mo114971b();
                }
            }
        }
        return this.f379192c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo114973f() {
        C139456b bVar = (C139456b) this;
        ((C139465i) mo114972d().mo17653jN()).mo114989km();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo114984a();
        return this.f379191a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114972d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f379191a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo114984a();
        mo114973f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo114984a();
        mo114973f();
    }
}
