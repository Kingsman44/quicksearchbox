package com.google.android.apps.search.googleapp.amp.silk;

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

/* renamed from: com.google.android.apps.search.googleapp.amp.silk.t */
/* compiled from: PG */
class C133484t extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f363717a;

    /* renamed from: c */
    private volatile C47222f f363718c;

    /* renamed from: d */
    private final Object f363719d = new Object();

    /* renamed from: a */
    private final void mo111185a() {
        if (this.f363717a == null) {
            this.f363717a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo111186b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo111189d() {
        if (this.f363718c == null) {
            synchronized (this.f363719d) {
                if (this.f363718c == null) {
                    this.f363718c = mo111186b();
                }
            }
        }
        return this.f363718c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111190f() {
        C133475k kVar = (C133475k) this;
        ((C133477m) mo111189d().mo17653jN()).mo111188ld();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo111185a();
        return this.f363717a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111189d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f363717a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo111185a();
        mo111190f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111185a();
        mo111190f();
    }
}
