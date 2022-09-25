package com.google.android.libraries.lens.view.textoverlay;

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

/* renamed from: com.google.android.libraries.lens.view.textoverlay.ac */
/* compiled from: PG */
class C28068ac extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f76391a;

    /* renamed from: b */
    private boolean f76392b;

    /* renamed from: c */
    private volatile C47247a f76393c;

    /* renamed from: d */
    private final Object f76394d = new Object();

    /* renamed from: e */
    private boolean f76395e = false;

    /* renamed from: a */
    private final void mo33535a() {
        if (this.f76391a == null) {
            this.f76391a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f76392b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo33530b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo33531d() {
        if (this.f76393c == null) {
            synchronized (this.f76394d) {
                if (this.f76393c == null) {
                    this.f76393c = mo33530b();
                }
            }
        }
        return this.f76393c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo33532f() {
        if (!this.f76395e) {
            this.f76395e = true;
            mo33531d().mo17653jN();
            C28074g gVar = (C28074g) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f76392b) {
            return null;
        }
        mo33535a();
        return this.f76391a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo33531d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f76391a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo33535a();
        mo33532f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo33535a();
        mo33532f();
    }
}
