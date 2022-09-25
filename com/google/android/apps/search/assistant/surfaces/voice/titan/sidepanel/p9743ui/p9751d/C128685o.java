package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9751d;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.d.o */
/* compiled from: PG */
class C128685o extends Fragment implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f353742a;

    /* renamed from: b */
    private volatile C47222f f353743b;

    /* renamed from: c */
    private final Object f353744c = new Object();

    /* renamed from: a */
    private final void mo108610a() {
        if (this.f353742a == null) {
            this.f353742a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108611b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo108615d() {
        if (this.f353743b == null) {
            synchronized (this.f353744c) {
                if (this.f353743b == null) {
                    this.f353743b = mo108611b();
                }
            }
        }
        return this.f353743b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108616f() {
        C128672b bVar = (C128672b) this;
        ((C128682l) mo108615d().mo17653jN()).mo108614lc();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo108610a();
        return this.f353742a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108615d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f353742a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo108610a();
        mo108616f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108610a();
        mo108616f();
    }
}
