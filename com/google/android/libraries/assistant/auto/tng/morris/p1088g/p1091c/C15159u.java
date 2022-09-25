package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.common.base.C58838bb;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.u */
/* compiled from: PG */
class C15159u extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f45489a;

    /* renamed from: c */
    private volatile C47222f f45490c;

    /* renamed from: d */
    private final Object f45491d = new Object();

    /* renamed from: a */
    private final void mo22014a() {
        if (this.f45489a == null) {
            this.f45489a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo22015b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo22030d() {
        if (this.f45490c == null) {
            synchronized (this.f45491d) {
                if (this.f45490c == null) {
                    this.f45490c = mo22015b();
                }
            }
        }
        return this.f45490c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo22031f() {
        C15142d dVar = (C15142d) this;
        ((C15148j) mo22030d().mo17653jN()).mo22020ad();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo22014a();
        return this.f45489a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo22030d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f45489a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo22014a();
        mo22031f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo22014a();
        mo22031f();
    }
}
