package com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f;

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

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.f.b */
/* compiled from: PG */
class C40533b extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f106389a;

    /* renamed from: c */
    private volatile C47222f f106390c;

    /* renamed from: d */
    private final Object f106391d = new Object();

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f106389a == null) {
            this.f106389a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C47222f mo42490a() {
        if (this.f106390c == null) {
            synchronized (this.f106391d) {
                if (this.f106390c == null) {
                    this.f106390c = mo42491b();
                }
            }
        }
        return this.f106390c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo42491b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo42492d() {
        C40537f fVar = (C40537f) this;
        ((C40546n) mo42490a().mo17653jN()).mo42499lD();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo17857e();
        return this.f106389a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo42490a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f106389a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo17857e();
        mo42492d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo42492d();
    }
}
