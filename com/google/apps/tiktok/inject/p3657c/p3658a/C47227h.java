package com.google.apps.tiktok.inject.p3657c.p3658a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.p031v4.app.C0174at;
import android.support.p031v4.app.C0203bv;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import androidx.activity.C0823s;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C2370br;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.C2384o;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.apps.tiktok.inject.c.a.h */
/* compiled from: PG */
public final class C47227h extends C0174at implements C0823s, C2371bs, C0203bv {

    /* renamed from: a */
    private final C47215a f122890a;

    /* renamed from: f */
    private final Context f122891f;

    /* renamed from: g */
    private final OnBackPressedDispatcher f122892g;

    /* renamed from: h */
    private final C47226g f122893h;

    public C47227h(C47215a aVar, Context context, OnBackPressedDispatcher onBackPressedDispatcher, C47226g gVar) {
        super(context, new Handler(Looper.getMainLooper()));
        this.f122890a = aVar;
        this.f122891f = context;
        this.f122892g = onBackPressedDispatcher;
        this.f122893h = gVar;
    }

    /* renamed from: a */
    public final View mo521a(int i) {
        return this.f122893h.f122889a.findViewById(i);
    }

    /* renamed from: c */
    public final LayoutInflater mo532c() {
        return LayoutInflater.from(this.f122891f).cloneInContext(this.f122891f);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo533f() {
        return this.f122890a;
    }

    public final C2384o getLifecycle() {
        return this.f122890a.getLifecycle();
    }

    public final C2370br getViewModelStore() {
        return this.f122890a.getViewModelStore();
    }

    /* renamed from: gz */
    public final OnBackPressedDispatcher mo535gz() {
        return this.f122892g;
    }

    /* renamed from: j */
    public final void mo538j(Fragment fragment) {
        if (fragment instanceof C68288b) {
            C58838bb.m90887v(fragment instanceof C47216a, "Fragment %s attached to FragmentHost should be activity agnostic, either annotate FragmentPeer/Fragment with @ActivityAgnosticPeer/@ActivityAgnostic or remove the fragment.", fragment.getClass());
        }
    }
}
