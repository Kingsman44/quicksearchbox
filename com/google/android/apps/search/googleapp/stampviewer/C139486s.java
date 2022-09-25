package com.google.android.apps.search.googleapp.stampviewer;

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

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.s */
/* compiled from: PG */
class C139486s extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f379267a;

    /* renamed from: c */
    private volatile C47222f f379268c;

    /* renamed from: d */
    private final Object f379269d = new Object();

    /* renamed from: a */
    private final void m226702a() {
        if (this.f379267a == null) {
            this.f379267a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47222f mo114960d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C47222f mo115005f() {
        if (this.f379268c == null) {
            synchronized (this.f379269d) {
                if (this.f379268c == null) {
                    this.f379268c = mo114960d();
                }
            }
        }
        return this.f379268c;
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        m226702a();
        return this.f379267a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo115006j() {
        C139433j jVar = (C139433j) this;
        ((C139485r) mo115005f().mo17653jN()).mo115004lf();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115005f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f379267a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        m226702a();
        mo115006j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m226702a();
        mo115006j();
    }
}
