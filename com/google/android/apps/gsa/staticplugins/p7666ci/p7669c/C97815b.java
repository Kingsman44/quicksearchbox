package com.google.android.apps.gsa.staticplugins.p7666ci.p7669c;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.c.b */
/* compiled from: PG */
public final /* synthetic */ class C97815b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C97821h f273152a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f273153b;

    /* renamed from: c */
    public final /* synthetic */ SettableFuture f273154c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f273155d;

    public /* synthetic */ C97815b(C97821h hVar, ComponentName componentName, SettableFuture settableFuture, Bundle bundle) {
        this.f273152a = hVar;
        this.f273153b = componentName;
        this.f273154c = settableFuture;
        this.f273155d = bundle;
    }

    public final void run() {
        C97821h hVar = this.f273152a;
        ComponentName componentName = this.f273153b;
        SettableFuture settableFuture = this.f273154c;
        Bundle bundle = this.f273155d;
        C97817d dVar = new C97817d(hVar, settableFuture);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(hVar.f273173b, componentName, dVar, bundle);
        dVar.f273158c = mediaBrowserCompat;
        dVar.mo90823d();
        mediaBrowserCompat.mo800d();
    }
}
