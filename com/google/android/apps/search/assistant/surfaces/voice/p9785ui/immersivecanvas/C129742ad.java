package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.ad */
/* compiled from: PG */
class C129742ad extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f356040a;

    /* renamed from: c */
    private volatile C47222f f356041c;

    /* renamed from: d */
    private final Object f356042d = new Object();

    /* renamed from: a */
    private final void mo109263a() {
        if (this.f356040a == null) {
            this.f356040a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo109214b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo109215d() {
        if (this.f356041c == null) {
            synchronized (this.f356042d) {
                if (this.f356041c == null) {
                    this.f356041c = mo109214b();
                }
            }
        }
        return this.f356041c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo109216f() {
        C129787g gVar = (C129787g) this;
        ((C129741ac) mo109215d().mo17653jN()).mo109213kf();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo109263a();
        return this.f356040a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109215d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f356040a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo109263a();
        mo109216f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo109263a();
        mo109216f();
    }
}
