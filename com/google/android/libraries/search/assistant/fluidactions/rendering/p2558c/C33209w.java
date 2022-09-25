package com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c;

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

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.c.w */
/* compiled from: PG */
class C33209w extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f88809a;

    /* renamed from: c */
    private volatile C47222f f88810c;

    /* renamed from: d */
    private final Object f88811d = new Object();

    /* renamed from: a */
    private final void mo38586a() {
        if (this.f88809a == null) {
            this.f88809a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo38587b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo38592d() {
        if (this.f88810c == null) {
            synchronized (this.f88811d) {
                if (this.f88810c == null) {
                    this.f88810c = mo38587b();
                }
            }
        }
        return this.f88810c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo38593f() {
        C33193g gVar = (C33193g) this;
        ((C33199m) mo38592d().mo17653jN()).mo38591jV();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo38586a();
        return this.f88809a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo38592d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f88809a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo38586a();
        mo38593f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo38586a();
        mo38593f();
    }
}
