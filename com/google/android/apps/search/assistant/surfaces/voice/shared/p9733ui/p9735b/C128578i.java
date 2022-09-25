package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9735b;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.b.i */
/* compiled from: PG */
class C128578i extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f353538a;

    /* renamed from: c */
    private volatile C47222f f353539c;

    /* renamed from: d */
    private final Object f353540d = new Object();

    /* renamed from: a */
    private final void mo108520a() {
        if (this.f353538a == null) {
            this.f353538a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108521b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C47222f mo108525f() {
        if (this.f353539c == null) {
            synchronized (this.f353540d) {
                if (this.f353539c == null) {
                    this.f353539c = mo108521b();
                }
            }
        }
        return this.f353539c;
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo108520a();
        return this.f353538a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo108526j() {
        C128569b bVar = (C128569b) this;
        ((C128577h) mo108525f().mo17653jN()).mo108524kE();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108525f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f353538a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo108520a();
        mo108526j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108520a();
        mo108526j();
    }
}
