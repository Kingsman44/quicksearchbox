package com.google.android.libraries.assistant.auto.tng.morris.p1088g;

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

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.af */
/* compiled from: PG */
class C15112af extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f45364a;

    /* renamed from: c */
    private volatile C47222f f45365c;

    /* renamed from: d */
    private final Object f45366d = new Object();

    /* renamed from: a */
    private final void mo22249a() {
        if (this.f45364a == null) {
            this.f45364a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo21978b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo21979d() {
        if (this.f45365c == null) {
            synchronized (this.f45366d) {
                if (this.f45365c == null) {
                    this.f45365c = mo21978b();
                }
            }
        }
        return this.f45365c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo21980f() {
        C15362p pVar = (C15362p) this;
        ((C15365s) mo21979d().mo17653jN()).mo22251af();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo22249a();
        return this.f45364a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo21979d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f45364a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo22249a();
        mo21980f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo22249a();
        mo21980f();
    }
}
