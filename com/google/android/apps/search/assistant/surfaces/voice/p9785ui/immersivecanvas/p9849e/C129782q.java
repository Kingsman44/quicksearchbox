package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.e.q */
/* compiled from: PG */
class C129782q extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f356113a;

    /* renamed from: c */
    private volatile C47222f f356114c;

    /* renamed from: d */
    private final Object f356115d = new Object();

    /* renamed from: a */
    private final void mo109240a() {
        if (this.f356113a == null) {
            this.f356113a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo109241b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo109260d() {
        if (this.f356114c == null) {
            synchronized (this.f356115d) {
                if (this.f356114c == null) {
                    this.f356114c = mo109241b();
                }
            }
        }
        return this.f356114c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo109261f() {
        C129766b bVar = (C129766b) this;
        ((C129781p) mo109260d().mo17653jN()).mo109259kg();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo109240a();
        return this.f356113a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109260d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f356113a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo109240a();
        mo109261f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo109240a();
        mo109261f();
    }
}
