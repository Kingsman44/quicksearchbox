package com.google.android.libraries.web.base;

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

/* renamed from: com.google.android.libraries.web.base.i */
/* compiled from: PG */
class C43258i extends Fragment implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f113055a;

    /* renamed from: b */
    private volatile C47222f f113056b;

    /* renamed from: c */
    private final Object f113057c = new Object();

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f113055a == null) {
            this.f113055a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C47222f mo46368a() {
        if (this.f113056b == null) {
            synchronized (this.f113057c) {
                if (this.f113056b == null) {
                    this.f113056b = mo46369b();
                }
            }
        }
        return this.f113056b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo46369b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo46370d() {
        C43264o oVar = (C43264o) this;
        ((C43268s) mo46368a().mo17653jN()).mo46382lA();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo17857e();
        return this.f113055a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo46368a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f113055a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo17857e();
        mo46370d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo46370d();
    }
}
