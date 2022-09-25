package com.google.android.libraries.search.silk.p3162a.p3170h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.libraries.search.silk.a.h.v */
/* compiled from: PG */
class C40598v extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f106547a;

    /* renamed from: b */
    private boolean f106548b;

    /* renamed from: c */
    private volatile C47247a f106549c;

    /* renamed from: d */
    private final Object f106550d = new Object();

    /* renamed from: e */
    private boolean f106551e = false;

    /* renamed from: a */
    private final void mo42532a() {
        if (this.f106547a == null) {
            this.f106547a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f106548b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo42533b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo42538d() {
        if (this.f106549c == null) {
            synchronized (this.f106550d) {
                if (this.f106549c == null) {
                    this.f106549c = mo42533b();
                }
            }
        }
        return this.f106549c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo42539f() {
        if (!this.f106551e) {
            this.f106551e = true;
            mo42538d().mo17653jN();
            C40582h hVar = (C40582h) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f106548b) {
            return null;
        }
        mo42532a();
        return this.f106547a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo42538d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f106547a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo42532a();
        mo42539f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo42532a();
        mo42539f();
    }
}
