package com.google.android.libraries.web.p3420k;

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

/* renamed from: com.google.android.libraries.web.k.d */
/* compiled from: PG */
class C43858d extends Fragment implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f114297a;

    /* renamed from: b */
    private volatile C47222f f114298b;

    /* renamed from: c */
    private final Object f114299c = new Object();

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f114297a == null) {
            this.f114297a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C47222f mo46866a() {
        if (this.f114298b == null) {
            synchronized (this.f114299c) {
                if (this.f114298b == null) {
                    this.f114298b = mo46867b();
                }
            }
        }
        return this.f114298b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo46867b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo46868d() {
        C43861g gVar = (C43861g) this;
        ((C43872r) mo46866a().mo17653jN()).mo46878lC();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo17857e();
        return this.f114297a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo46866a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f114297a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo17857e();
        mo46868d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo46868d();
    }
}
