package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b;

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

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.g */
/* compiled from: PG */
class C40196g extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f105606a;

    /* renamed from: c */
    private volatile C47222f f105607c;

    /* renamed from: d */
    private final Object f105608d = new Object();

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f105606a == null) {
            this.f105606a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C47222f mo42308a() {
        if (this.f105607c == null) {
            synchronized (this.f105608d) {
                if (this.f105607c == null) {
                    this.f105607c = mo42309b();
                }
            }
        }
        return this.f105607c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo42309b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo42310d() {
        C40203n nVar = (C40203n) this;
        ((C40210u) mo42308a().mo17653jN()).mo42322lE();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo17857e();
        return this.f105606a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo42308a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f105606a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo17857e();
        mo42310d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo42310d();
    }
}
