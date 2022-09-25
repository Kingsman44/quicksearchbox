package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9802e;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.e.i */
/* compiled from: PG */
class C129237i extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f354988a;

    /* renamed from: c */
    private volatile C47222f f354989c;

    /* renamed from: d */
    private final Object f354990d = new Object();

    /* renamed from: a */
    private final void mo108916a() {
        if (this.f354988a == null) {
            this.f354988a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108917b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo108920d() {
        if (this.f354989c == null) {
            synchronized (this.f354990d) {
                if (this.f354989c == null) {
                    this.f354989c = mo108917b();
                }
            }
        }
        return this.f354989c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108921f() {
        C129230b bVar = (C129230b) this;
        ((C129233e) mo108920d().mo17653jN()).mo108919lg();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo108916a();
        return this.f354988a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108920d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f354988a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo108916a();
        mo108921f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108916a();
        mo108921f();
    }
}
