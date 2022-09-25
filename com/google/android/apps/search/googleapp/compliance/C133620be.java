package com.google.android.apps.search.googleapp.compliance;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19520a;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.compliance.be */
/* compiled from: PG */
class C133620be extends C19520a implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f363998a;

    /* renamed from: c */
    private volatile C47222f f363999c;

    /* renamed from: d */
    private final Object f364000d = new Object();

    /* renamed from: a */
    private final void mo111279a() {
        if (this.f363998a == null) {
            this.f363998a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo111280b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo111296d() {
        if (this.f363999c == null) {
            synchronized (this.f364000d) {
                if (this.f363999c == null) {
                    this.f363999c = mo111280b();
                }
            }
        }
        return this.f363999c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111297f() {
        C133588am amVar = (C133588am) this;
        ((C133600ay) mo111296d().mo17653jN()).mo111290jG();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo111279a();
        return this.f363998a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111296d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f363998a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo111279a();
        mo111297f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111279a();
        mo111297f();
    }
}
