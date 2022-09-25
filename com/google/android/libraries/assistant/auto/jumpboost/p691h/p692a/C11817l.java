package com.google.android.libraries.assistant.auto.jumpboost.p691h.p692a;

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

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.h.a.l */
/* compiled from: PG */
class C11817l extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f37998a;

    /* renamed from: c */
    private volatile C47222f f37999c;

    /* renamed from: d */
    private final Object f38000d = new Object();

    /* renamed from: a */
    private final void mo20162a() {
        if (this.f37998a == null) {
            this.f37998a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo20163b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo20170d() {
        if (this.f37999c == null) {
            synchronized (this.f38000d) {
                if (this.f37999c == null) {
                    this.f37999c = mo20163b();
                }
            }
        }
        return this.f37999c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo20171f() {
        C11807b bVar = (C11807b) this;
        ((C11816k) mo20170d().mo17653jN()).mo20169jr();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo20162a();
        return this.f37998a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo20170d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f37998a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo20162a();
        mo20171f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo20162a();
        mo20171f();
    }
}
