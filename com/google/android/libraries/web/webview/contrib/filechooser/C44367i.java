package com.google.android.libraries.web.webview.contrib.filechooser;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.common.base.C58838bb;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.web.webview.contrib.filechooser.i */
/* compiled from: PG */
class C44367i extends Fragment implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f115354a;

    /* renamed from: b */
    private volatile C47222f f115355b;

    /* renamed from: c */
    private final Object f115356c = new Object();

    /* renamed from: a */
    private final void mo47242a() {
        if (this.f115354a == null) {
            this.f115354a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo47243b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo47246d() {
        if (this.f115355b == null) {
            synchronized (this.f115356c) {
                if (this.f115355b == null) {
                    this.f115355b = mo47243b();
                }
            }
        }
        return this.f115355b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo47247f() {
        C44363e eVar = (C44363e) this;
        ((C44365g) mo47246d().mo17653jN()).mo47245ae();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo47242a();
        return this.f115354a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo47246d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f115354a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo47242a();
        mo47247f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo47242a();
        mo47247f();
    }
}
