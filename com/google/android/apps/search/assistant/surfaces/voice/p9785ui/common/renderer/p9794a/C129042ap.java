package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9794a;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.ap */
/* compiled from: PG */
class C129042ap extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f354518a;

    /* renamed from: c */
    private volatile C47222f f354519c;

    /* renamed from: d */
    private final Object f354520d = new Object();

    /* renamed from: a */
    private final void mo108830a() {
        if (this.f354518a == null) {
            this.f354518a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108820b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo108821d() {
        if (this.f354519c == null) {
            synchronized (this.f354520d) {
                if (this.f354519c == null) {
                    this.f354519c = mo108820b();
                }
            }
        }
        return this.f354519c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108822f() {
        C129057p pVar = (C129057p) this;
        ((C129060s) mo108821d().mo17653jN()).mo108833jQ();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo108830a();
        return this.f354518a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108821d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f354518a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo108830a();
        mo108822f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108830a();
        mo108822f();
    }
}
