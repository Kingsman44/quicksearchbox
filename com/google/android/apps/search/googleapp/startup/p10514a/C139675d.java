package com.google.android.apps.search.googleapp.startup.p10514a;

import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.startup.a.d */
/* compiled from: PG */
final class C139675d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final Fragment f379652a;

    /* renamed from: b */
    public final Runnable f379653b;

    /* renamed from: c */
    public final C60888db f379654c;

    /* renamed from: d */
    public final View f379655d;

    /* renamed from: e */
    public final AtomicBoolean f379656e;

    /* renamed from: f */
    public final Duration f379657f;

    /* renamed from: g */
    private final C47816ey f379658g = C47816ey.m84988b();

    public C139675d(Fragment fragment, Runnable runnable, View view, Duration duration, C60888db dbVar) {
        this.f379652a = fragment;
        this.f379653b = runnable;
        this.f379654c = dbVar;
        this.f379655d = view;
        this.f379656e = new AtomicBoolean(false);
        this.f379657f = duration;
    }

    public final boolean onPreDraw() {
        Duration duration = C139676e.f379659a;
        C47816ey eyVar = this.f379658g;
        C47810es.m84976p(eyVar.f123841a, new C139674c(this)).run();
        return true;
    }
}
