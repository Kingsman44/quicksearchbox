package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9790c;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.c.j */
/* compiled from: PG */
class C129008j extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f354446a;

    /* renamed from: c */
    private volatile C47222f f354447c;

    /* renamed from: d */
    private final Object f354448d = new Object();

    /* renamed from: a */
    private final void mo108792a() {
        if (this.f354446a == null) {
            this.f354446a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108793b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo108797d() {
        if (this.f354447c == null) {
            synchronized (this.f354448d) {
                if (this.f354447c == null) {
                    this.f354447c = mo108793b();
                }
            }
        }
        return this.f354447c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108798f() {
        C128999b bVar = (C128999b) this;
        ((C129007i) mo108797d().mo17653jN()).mo108796jR();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo108792a();
        return this.f354446a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108797d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f354446a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo108792a();
        mo108798f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108792a();
        mo108798f();
    }
}
