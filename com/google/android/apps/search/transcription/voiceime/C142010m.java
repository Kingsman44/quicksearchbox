package com.google.android.apps.search.transcription.voiceime;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.common.base.C58838bb;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.transcription.voiceime.m */
/* compiled from: PG */
class C142010m extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f385322a;

    /* renamed from: c */
    private volatile C47222f f385323c;

    /* renamed from: d */
    private final Object f385324d = new Object();

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f385322a == null) {
            this.f385322a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C47222f mo116966a() {
        if (this.f385323c == null) {
            synchronized (this.f385324d) {
                if (this.f385323c == null) {
                    this.f385323c = mo116934b();
                }
            }
        }
        return this.f385323c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo116934b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo116967d() {
        C141975an anVar = (C141975an) this;
        ((C141984av) mo116966a().mo17653jN()).mo116942aj();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo17857e();
        return this.f385322a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116966a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f385322a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo17857e();
        mo116967d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo116967d();
    }
}
