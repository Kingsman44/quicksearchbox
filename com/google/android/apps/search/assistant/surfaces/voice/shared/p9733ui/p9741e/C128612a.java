package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9741e;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.e.a */
/* compiled from: PG */
class C128612a extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f353604a;

    /* renamed from: c */
    private volatile C47222f f353605c;

    /* renamed from: d */
    private final Object f353606d = new Object();

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f353604a == null) {
            this.f353604a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C47222f mo108556a() {
        if (this.f353605c == null) {
            synchronized (this.f353606d) {
                if (this.f353605c == null) {
                    this.f353605c = mo108557b();
                }
            }
        }
        return this.f353605c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108557b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo108558d() {
        C128614c cVar = (C128614c) this;
        ((C128621j) mo108556a().mo17653jN()).mo108561ln();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo17857e();
        return this.f353604a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108556a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f353604a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo17857e();
        mo108558d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo108558d();
    }
}
