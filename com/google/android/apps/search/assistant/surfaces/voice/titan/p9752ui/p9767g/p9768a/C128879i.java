package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9767g.p9768a;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.g.a.i */
/* compiled from: PG */
class C128879i extends Fragment implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f354203a;

    /* renamed from: b */
    private volatile C47222f f354204b;

    /* renamed from: c */
    private final Object f354205c = new Object();

    /* renamed from: a */
    private final void mo108714a() {
        if (this.f354203a == null) {
            this.f354203a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108715b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo108718d() {
        if (this.f354204b == null) {
            synchronized (this.f354205c) {
                if (this.f354204b == null) {
                    this.f354204b = mo108715b();
                }
            }
        }
        return this.f354204b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108719f() {
        C128872b bVar = (C128872b) this;
        ((C128878h) mo108718d().mo17653jN()).mo108717jB();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo108714a();
        return this.f354203a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108718d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f354203a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo108714a();
        mo108719f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108714a();
        mo108719f();
    }
}
