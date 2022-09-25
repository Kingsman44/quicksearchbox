package com.google.android.apps.search.transcription.voiceime.standalone.settings;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1628b.C19501a;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.transcription.voiceime.standalone.settings.c */
/* compiled from: PG */
abstract class C142025c extends C19501a implements C68288b {

    /* renamed from: f */
    private ContextWrapper f385356f;

    /* renamed from: g */
    private boolean f385357g;

    /* renamed from: h */
    private volatile C68324h f385358h;

    /* renamed from: i */
    private final Object f385359i = new Object();

    /* renamed from: j */
    private boolean f385360j = false;

    /* renamed from: o */
    private final void mo116983o() {
        if (this.f385356f == null) {
            this.f385356f = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f385357g = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: b */
    public final C68324h mo116978b() {
        if (this.f385358h == null) {
            synchronized (this.f385359i) {
                if (this.f385358h == null) {
                    this.f385358h = mo116979m();
                }
            }
        }
        return this.f385358h;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f385357g) {
            return null;
        }
        mo116983o();
        return this.f385356f;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116978b().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C68324h mo116979m() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo116980n() {
        if (!this.f385360j) {
            this.f385360j = true;
            mo116978b().mo17653jN();
            C142032j jVar = (C142032j) this;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f385356f;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo116983o();
        mo116980n();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo116983o();
        mo116980n();
    }
}
