package com.google.android.apps.gsa.assistant.settings.p526e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.a */
/* compiled from: PG */
class C9734a extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33622a;

    /* renamed from: c */
    private boolean f33623c;

    /* renamed from: d */
    private volatile C68324h f33624d;

    /* renamed from: e */
    private final Object f33625e = new Object();

    /* renamed from: f */
    private boolean f33626f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f33622a == null) {
            this.f33622a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33623c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo17999a() {
        if (this.f33624d == null) {
            synchronized (this.f33625e) {
                if (this.f33624d == null) {
                    this.f33624d = mo18000b();
                }
            }
        }
        return this.f33624d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo18000b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo18001d() {
        if (!this.f33626f) {
            this.f33626f = true;
            mo17999a().mo17653jN();
            C9770v vVar = (C9770v) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f33623c) {
            return null;
        }
        mo17857e();
        return this.f33622a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17999a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33622a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo18001d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo18001d();
    }
}
