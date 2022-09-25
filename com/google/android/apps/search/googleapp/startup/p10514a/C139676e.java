package com.google.android.apps.search.googleapp.startup.p10514a;

import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.startup.a.e */
/* compiled from: PG */
public final class C139676e {

    /* renamed from: a */
    public static final Duration f379659a = Duration.ofMillis(5);

    /* renamed from: b */
    public static final C59071e f379660b = C59071e.m91332i("com.google.android.apps.search.googleapp.startup.a.e");

    /* renamed from: c */
    private final C139678g f379661c;

    /* renamed from: d */
    private final Duration f379662d = f379659a;

    public C139676e(C139678g gVar) {
        this.f379661c = gVar;
    }

    /* renamed from: a */
    public final void mo115161a(Fragment fragment, View view, Runnable runnable) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        C139678g gVar = this.f379661c;
        Duration duration = this.f379662d;
        fragment.getClass();
        view.getClass();
        duration.getClass();
        C60888db dbVar = (C60888db) gVar.f379663a.mo17428b();
        dbVar.getClass();
        viewTreeObserver.addOnPreDrawListener(new C139675d(fragment, runnable, view, duration, dbVar));
    }
}
