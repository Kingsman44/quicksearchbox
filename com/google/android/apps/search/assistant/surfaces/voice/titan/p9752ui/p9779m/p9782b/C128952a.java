package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9779m.p9782b;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.m.b.a */
/* compiled from: PG */
class C128952a extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f354336a;

    /* renamed from: c */
    private volatile C47222f f354337c;

    /* renamed from: d */
    private final Object f354338d = new Object();

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f354336a == null) {
            this.f354336a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C47222f mo108769a() {
        if (this.f354337c == null) {
            synchronized (this.f354338d) {
                if (this.f354337c == null) {
                    this.f354337c = mo108770b();
                }
            }
        }
        return this.f354337c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108770b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo108771d() {
        C128954c cVar = (C128954c) this;
        ((C128960i) mo108769a().mo17653jN()).mo108774lo();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo17857e();
        return this.f354336a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108769a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f354336a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo17857e();
        mo108771d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo108771d();
    }
}
