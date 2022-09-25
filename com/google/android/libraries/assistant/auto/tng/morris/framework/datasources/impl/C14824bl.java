package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ComponentName;
import android.support.p031v4.media.session.C0320v;
import androidx.p104d.p105a.C2164c;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bl */
/* compiled from: PG */
final class C14824bl extends C14825bm {

    /* renamed from: c */
    final /* synthetic */ ComponentName f44646c;

    /* renamed from: d */
    final /* synthetic */ C2164c f44647d;

    /* renamed from: e */
    final /* synthetic */ C14828bp f44648e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14824bl(C14828bp bpVar, ComponentName componentName, C2164c cVar) {
        super(bpVar);
        this.f44648e = bpVar;
        this.f44646c = componentName;
        this.f44647d = cVar;
    }

    /* renamed from: d */
    public final void mo21757d(C0320v vVar) {
        C14784a aVar = new C14784a(Optional.m71637of(this.f44650f), vVar);
        C14828bp bpVar = this.f44648e;
        ConcurrentHashMap concurrentHashMap = bpVar.f44660f;
        ComponentName componentName = this.f44646c;
        concurrentHashMap.put(componentName, new C14827bo(bpVar, aVar, componentName));
        this.f44647d.mo5437b(aVar);
    }

    /* renamed from: e */
    public final void mo21758e(Throwable th) {
        this.f44647d.mo5439d(th);
    }
}
