package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

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

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ax */
/* compiled from: PG */
class C13142ax extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f40730a;

    /* renamed from: c */
    private volatile C47222f f40731c;

    /* renamed from: d */
    private final Object f40732d = new Object();

    /* renamed from: a */
    private final void mo20898a() {
        if (this.f40730a == null) {
            this.f40730a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo20899b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo20920d() {
        if (this.f40731c == null) {
            synchronized (this.f40732d) {
                if (this.f40731c == null) {
                    this.f40731c = mo20899b();
                }
            }
        }
        return this.f40731c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo20921f() {
        MediaRecFragment mediaRecFragment = (MediaRecFragment) this;
        ((C13122ad) mo20920d().mo17653jN()).mo20918kH();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo20898a();
        return this.f40730a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo20920d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f40730a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo20898a();
        mo20921f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo20898a();
        mo20921f();
    }
}
