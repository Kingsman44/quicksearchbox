package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.c */
/* compiled from: PG */
class C128511c extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f353404a;

    /* renamed from: c */
    private volatile C47222f f353405c;

    /* renamed from: d */
    private final Object f353406d = new Object();

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f353404a == null) {
            this.f353404a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C47222f mo108490a() {
        if (this.f353405c == null) {
            synchronized (this.f353406d) {
                if (this.f353405c == null) {
                    this.f353405c = mo108491b();
                }
            }
        }
        return this.f353405c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108491b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo108492d() {
        C128528t tVar = (C128528t) this;
        ((C128531w) mo108490a().mo17653jN()).mo108505ak();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo17857e();
        return this.f353404a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108490a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f353404a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo17857e();
        mo108492d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo108492d();
    }
}
