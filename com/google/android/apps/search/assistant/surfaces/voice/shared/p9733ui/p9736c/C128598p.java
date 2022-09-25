package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.c.p */
/* compiled from: PG */
class C128598p extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f353575a;

    /* renamed from: c */
    private volatile C47222f f353576c;

    /* renamed from: d */
    private final Object f353577d = new Object();

    /* renamed from: a */
    private final void mo108527a() {
        if (this.f353575a == null) {
            this.f353575a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo108528b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo108542d() {
        if (this.f353576c == null) {
            synchronized (this.f353577d) {
                if (this.f353576c == null) {
                    this.f353576c = mo108528b();
                }
            }
        }
        return this.f353576c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108543f() {
        C128582b bVar = (C128582b) this;
        ((C128597o) mo108542d().mo17653jN()).mo108541kS();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo108527a();
        return this.f353575a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108542d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f353575a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo108527a();
        mo108543f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108527a();
        mo108543f();
    }
}
