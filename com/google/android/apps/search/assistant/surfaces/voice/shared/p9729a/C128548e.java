package com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a;

import com.google.common.util.concurrent.C60866ct;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71816z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.a.e */
/* compiled from: PG */
public final class C128548e {

    /* renamed from: a */
    public final Object f353476a;

    /* renamed from: b */
    public Runnable f353477b;

    /* renamed from: c */
    public final AtomicReference f353478c = new AtomicReference(C128558o.PENDING);

    /* renamed from: d */
    public final /* synthetic */ C128555l f353479d;

    /* renamed from: e */
    public final C71816z f353480e = new C71816z();

    public C128548e(C128555l lVar, Object obj) {
        this.f353479d = lVar;
        this.f353476a = obj;
        lVar.f353491d++;
    }

    /* renamed from: a */
    public final C128558o mo108512a() {
        Object obj = this.f353478c.get();
        C69664n.m101058d(obj);
        return (C128558o) obj;
    }

    /* renamed from: b */
    public final C128547d mo108513b(Runnable runnable) {
        AtomicReference atomicReference = this.f353478c;
        C128558o oVar = C128558o.PENDING;
        C128558o oVar2 = C128558o.IN_PROCESS;
        while (!atomicReference.compareAndSet(oVar, oVar2)) {
            if (atomicReference.get() != oVar) {
                throw new IllegalStateException("Event is already taken.");
            }
        }
        this.f353477b = runnable;
        this.f353479d.f353490c.mo50787a(C60866ct.f164955a, C128555l.f353488a);
        return new C128547d(this);
    }

    public final String toString() {
        Object obj = this.f353478c.get();
        Object obj2 = this.f353476a;
        return "Event(" + obj + ", " + obj2 + ")";
    }
}
