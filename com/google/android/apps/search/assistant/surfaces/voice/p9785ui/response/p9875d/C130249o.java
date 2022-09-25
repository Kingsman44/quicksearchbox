package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9875d;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.d.o */
/* compiled from: PG */
class C130249o extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f357075a;

    /* renamed from: c */
    private volatile C47222f f357076c;

    /* renamed from: d */
    private final Object f357077d = new Object();

    /* renamed from: a */
    private final void mo109586a() {
        if (this.f357075a == null) {
            this.f357075a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo109587b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo109606d() {
        if (this.f357076c == null) {
            synchronized (this.f357077d) {
                if (this.f357076c == null) {
                    this.f357076c = mo109587b();
                }
            }
        }
        return this.f357076c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo109607f() {
        C130235b bVar = (C130235b) this;
        ((C130247m) mo109606d().mo17653jN()).mo109605jT();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo109586a();
        return this.f357075a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109606d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f357075a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo109586a();
        mo109607f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo109586a();
        mo109607f();
    }
}
