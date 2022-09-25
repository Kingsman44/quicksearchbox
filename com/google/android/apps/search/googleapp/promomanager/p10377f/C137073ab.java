package com.google.android.apps.search.googleapp.promomanager.p10377f;

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

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.ab */
/* compiled from: PG */
class C137073ab extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f373012a;

    /* renamed from: c */
    private volatile C47222f f373013c;

    /* renamed from: d */
    private final Object f373014d = new Object();

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f373012a == null) {
            this.f373012a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C47222f mo113487a() {
        if (this.f373013c == null) {
            synchronized (this.f373014d) {
                if (this.f373013c == null) {
                    this.f373013c = mo113488b();
                }
            }
        }
        return this.f373013c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo113488b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo113489d() {
        C137089ar arVar = (C137089ar) this;
        ((C137108bb) mo113487a().mo17653jN()).mo113529lm();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo17857e();
        return this.f373012a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113487a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f373012a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo17857e();
        mo113489d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo113489d();
    }
}
