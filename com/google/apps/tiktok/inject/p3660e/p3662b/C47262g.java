package com.google.apps.tiktok.inject.p3660e.p3662b;

import android.content.Context;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2370br;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.p127a.C2320a;
import androidx.lifecycle.p127a.C2322c;
import androidx.savedstate.C4088d;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.apps.tiktok.inject.e.b.g */
/* compiled from: PG */
final class C47262g implements C47215a {

    /* renamed from: a */
    final /* synthetic */ C58833ax f122909a;

    public C47262g(C58833ax axVar) {
        this.f122909a = axVar;
    }

    public final /* synthetic */ C2322c getDefaultViewModelCreationExtras() {
        return C2320a.f6515a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return ((C0167am) this.f122909a.mo56107c()).getDefaultViewModelProviderFactory();
    }

    public final C2384o getLifecycle() {
        return ((C0167am) this.f122909a.mo56107c()).getLifecycle();
    }

    public final C4088d getSavedStateRegistry() {
        return ((C0167am) this.f122909a.mo56107c()).f2706g.f13082a;
    }

    public final C2370br getViewModelStore() {
        return ((C0167am) this.f122909a.mo56107c()).getViewModelStore();
    }

    /* renamed from: p */
    public final Context mo51121p() {
        return (Context) this.f122909a.mo56107c();
    }

    /* renamed from: q */
    public final FragmentManager mo51122q() {
        return ((C0167am) this.f122909a.mo56107c()).mo545jw();
    }

    /* renamed from: r */
    public final Window mo51123r() {
        return ((C0167am) this.f122909a.mo56107c()).getWindow();
    }

    /* renamed from: s */
    public final OnBackPressedDispatcher mo51124s() {
        return ((C0167am) this.f122909a.mo56107c()).f2707h;
    }
}
